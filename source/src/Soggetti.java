// **********************************************
// Soggetti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Soggetti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_TIPO = 0;
  private static int PFL_PARAMETRI_ORDINAMENTO = 1;

  private static int PPQRY_NEWTABLE48 = 0;


  IDPanel PAN_PARAMETRI;
  private static int GRP_SOGGETTI_VALIDITA = 0;

  private static int PFL_SOGGETTI_RAGIONSOCIAL = 0;
  private static int PFL_SOGGETTI_NI = 1;
  private static int PFL_SOGGETTI_CODICE = 2;
  private static int PFL_SOGGETTI_TIPOSOGGETTO = 3;
  private static int PFL_SOGGETTI_CODICEFISCAL = 4;
  private static int PFL_SOGGETTI_PARTITAIVA = 5;
  private static int PFL_SOGGETTI_CATEGORIA = 6;
  private static int PFL_SOGGETTI_RESIDENZA = 7;
  private static int PFL_SOGGETTI_SCADENZA = 8;
  private static int PFL_SOGGETTI_PAGEURO = 9;
  private static int PFL_SOGGETTI_ORDINAMENTO1 = 10;
  private static int PFL_SOGGETTI_DAL = 11;
  private static int PFL_SOGGETTI_AL = 12;

  private static int PPQRY_SOGGETTI2 = 0;

  private static int PPQRY_T05 = 1;


  IDPanel PAN_SOGGETTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI307(IMDB);
    //
    //
    Init_PQRY_SOGGETTI2(IMDB);
    Init_PQRY_NEWTABLE48(IMDB);
    Init_PQRY_NEWTABLE48_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI307(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI307, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI307, "TBL_PARAMETRI307");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI307,IMDBDef2.FLD_PARAMETRI307_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI307,IMDBDef2.FLD_PARAMETRI307_PARAMTIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI307,IMDBDef2.FLD_PARAMETRI307_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI307,IMDBDef2.FLD_PARAMETRI307_PARAMORDINAM,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI307,IMDBDef2.FLD_PARAMETRI307_PARAMINFO, "PARAMINFO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI307,IMDBDef2.FLD_PARAMETRI307_PARAMINFO,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI307,IMDBDef2.FLD_PARAMETRI307_PARAMMODIFIC, "PARAMMODIFIC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI307,IMDBDef2.FLD_PARAMETRI307_PARAMMODIFIC,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI307, 0);
  }

  private static void Init_PQRY_SOGGETTI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_SOGGETTI2, 13);
    IMDB.set_TblCode(IMDBDef9.PQRY_SOGGETTI2, "PQRY_SOGGETTI2");
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_CODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_D_SCADENZA, "D_SCADENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_D_SCADENZA,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_CODICE_FISCALE, "CODICE_FISCALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_CODICE_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_PARTITA_IVA,5,11,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENRESIDENZA, "BENRESIDENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENRESIDENZA,5,176,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_CATEGORIA,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_PAGAMENTO_IN_EURO, "PAGAMENTO_IN_EURO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_PAGAMENTO_IN_EURO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENORDINAMEN, "BENORDINAMEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENORDINAMEN,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENNI, "BENNI");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENNI,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENDAL, "BENDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENAL, "BENAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENAL,6,14,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENTIPOSOGGE, "BENTIPOSOGGE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETTI2,IMDBDef9.PQSL_SOGGETTI2_BENTIPOSOGGE,12,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_SOGGETTI2, 0);
  }

  private static void Init_PQRY_NEWTABLE48(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_NEWTABLE48, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_NEWTABLE48, "PQRY_NEWTABLE48");
    IMDB.set_FldCode(IMDBDef9.PQRY_NEWTABLE48,IMDBDef9.PQSL_NEWTABLE48_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_NEWTABLE48,IMDBDef9.PQSL_NEWTABLE48_PARAMTIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_NEWTABLE48,IMDBDef9.PQSL_NEWTABLE48_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef9.PQRY_NEWTABLE48,IMDBDef9.PQSL_NEWTABLE48_PARAMORDINAM,1,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_NEWTABLE48, 0);
  }

  private static void Init_PQRY_NEWTABLE48_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_NEWTABLE48_RS, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_NEWTABLE48_RS, "PQRY_NEWTABLE48_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_NEWTABLE48_RS,IMDBDef9.PQSL_NEWTABLE48_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_NEWTABLE48_RS,IMDBDef9.PQSL_NEWTABLE48_PARAMTIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_NEWTABLE48_RS,IMDBDef9.PQSL_NEWTABLE48_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef9.PQRY_NEWTABLE48_RS,IMDBDef9.PQSL_NEWTABLE48_PARAMORDINAM,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Soggetti(MyWebEntryPoint w, IMDBObj imdb)
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
  public Soggetti()
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
    FormIdx = MyGlb.FRM_SOGGETTI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5A022F75-312D-49A5-AC6D-D7D8AFE7AC33";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 908;
    DesignHeight = 570;
    set_Caption(new IDVariant("Soggetti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 908;
    Frames[1].Height = 544;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0735294;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 908;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 908;
    Frames[2].FixedHeight = 40;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 908-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4AC9F701-8CB6-4C12-9D6B-61A61B5DDF0B");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 192, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 908;
    Frames[3].Height = 504;
    Frames[3].Caption = "Soggetti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 504;
    PAN_SOGGETTI = new IDPanel(w, this, 3, "PAN_SOGGETTI");
    Frames[3].Content = PAN_SOGGETTI;
    PAN_SOGGETTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SOGGETTI.VS = MainFrm.VisualStyleList;
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 908-MyGlb.PAN_OFFS_X, 504-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "528FF03D-4549-4D85-ADF2-70F74C4E3BC0");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1400, 396, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SOGGETTI.InitStatus = 1;
    PAN_SOGGETTI_Init();
    PAN_SOGGETTI_InitFields();
    PAN_SOGGETTI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_MODIFICA2+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMPA13+BaseCmdLinIdx)
      {
        Stampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG126+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI75+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG126+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESTRATTCONTO+BaseCmdLinIdx)
      {
        CmdEstrattoConto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVODOCUMEN+BaseCmdLinIdx)
      {
        NuovoDocumento();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI307, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SOGGETTI_NEWTABLE48();
      }
      PAN_SOGGETTI.UpdatePanel(MainFrm);
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
    return (obj instanceof Soggetti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Soggetti.class.getName() : (Glb.ClassWithPackage(Soggetti.class) ? Soggetti.class.getName().substring(Soggetti.class.getPackage().getName().length() + 1) : Soggetti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Modifica
  // **********************************************************************
  public int Modifica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECLOSE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef9.PQRY_SOGGETTI2, IMDBDef9.PQSL_SOGGETTI2_CODICE, 0));
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMINFO, 0).equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(0)));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
      }
      MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "Modifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cmd Estratto Conto
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdEstrattoConto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Estratto Conto Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMCODSOG, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_SOGGETTI2, IMDBDef9.PQSL_SOGGETTI2_CODICE, 0),IDVariant.INTEGER));
      MainFrm.Show(MyGlb.FRM_ESTRCONTSOGG, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "CmdEstrattoConto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Procedure Body
      // 
      IDVariant v_NOMESTAMPA = null;
      v_NOMESTAMPA = (new IDVariant("Elenco_Soggetti"));
      IDVariant v_PSCADUTI = new IDVariant(0,IDVariant.STRING);
      v_PSCADUTI = (new IDVariant("P_SCADUTI"));
      IDVariant v_PCATEGORIA = new IDVariant(0,IDVariant.STRING);
      v_PCATEGORIA = (new IDVariant("P_CATEGORIA"));
      IDVariant v_PORD = new IDVariant(0,IDVariant.STRING);
      v_PORD = (new IDVariant("P_ORD"));
      IDVariant v_PRAGSOC = new IDVariant(0,IDVariant.STRING);
      v_PRAGSOC = (new IDVariant("P_RAGSOC"));
      IDVariant v_PCODICE = new IDVariant(0,IDVariant.STRING);
      v_PCODICE = (new IDVariant("P_CODICE"));
      IDVariant v_PCODFISC = new IDVariant(0,IDVariant.STRING);
      v_PCODFISC = (new IDVariant("P_CODFISC"));
      IDVariant v_PPARTIVA = new IDVariant(0,IDVariant.STRING);
      v_PPARTIVA = (new IDVariant("P_PARTIVA"));
      IDVariant v_PANAGRAFECON = null;
      v_PANAGRAFECON = (new IDVariant("P_ANAGRAFE_CONDIVISA"));
      IDVariant v_PNI = null;
      v_PNI = (new IDVariant("P_NI"));
      IDVariant v_PDAL = null;
      v_PDAL = (new IDVariant("P_DAL"));
      IDVariant v_PAL = null;
      v_PAL = (new IDVariant("P_AL"));
      IDVariant v_PSCADENZA = null;
      v_PSCADENZA = (new IDVariant("P_SCADENZA"));
      IDVariant v_PRESIDENZA = null;
      v_PRESIDENZA = (new IDVariant("P_RESIDENZA"));
      MainFrm.SetParametroStampaJasper(v_PSCADUTI, ((IMDB.Value(IMDBDef9.PQRY_NEWTABLE48, IMDBDef9.PQSL_NEWTABLE48_PARAMTIPO, 0).equals((new IDVariant("T"))))?(new IDVariant("E")):IDL.Upper(IMDB.Value(IMDBDef9.PQRY_NEWTABLE48, IMDBDef9.PQSL_NEWTABLE48_PARAMTIPO, 0))));
      MainFrm.SetParametroStampaJasper(v_PORD, ((IMDB.Value(IMDBDef9.PQRY_NEWTABLE48, IMDBDef9.PQSL_NEWTABLE48_PARAMORDINAM, 0).equals((new IDVariant(0)), true))?(new IDVariant("ben_ragione_sociale_estesa A")):(new IDVariant("codice A"))));
      MainFrm.SetParametroStampaJasper(v_PCATEGORIA, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_CATEGORIA))).equals((new IDVariant(""))))?(new IDVariant("0")):(new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_CATEGORIA)))));
      MainFrm.SetParametroStampaJasper(v_PRAGSOC, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_RAGIONSOCIAL))).equals((new IDVariant(""))))?(new IDVariant("-1")):IDL.Replace(IDL.Replace(IDL.Add((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_RAGIONSOCIAL))), (new IDVariant("%"))), (new IDVariant("%")), (new IDVariant("%25"))), (new IDVariant("*")), (new IDVariant("%25")))));
      MainFrm.SetParametroStampaJasper(v_PCODICE, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_CODICE))).equals((new IDVariant(""))))?(new IDVariant("-1")):(new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_CODICE)))));
      MainFrm.SetParametroStampaJasper(v_PCODFISC, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_CODICEFISCAL))).equals((new IDVariant(""))))?(new IDVariant("-1")):IDL.Replace(IDL.Replace(IDL.Add((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_CODICEFISCAL))), (new IDVariant("%"))), (new IDVariant("%")), (new IDVariant("%25"))), (new IDVariant("*")), (new IDVariant("%25")))));
      MainFrm.SetParametroStampaJasper(v_PPARTIVA, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_PARTITAIVA))).equals((new IDVariant(""))))?(new IDVariant("-1")):IDL.Replace(IDL.Replace(IDL.Add((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_PARTITAIVA))), (new IDVariant("%"))), (new IDVariant("%")), (new IDVariant("%25"))), (new IDVariant("*")), (new IDVariant("%25")))));
      MainFrm.SetParametroStampaJasper(v_PNI, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_NI))).equals((new IDVariant(""))))?(new IDVariant("-1")):(new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_NI)))));
      MainFrm.SetParametroStampaJasper(v_PDAL, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_DAL))).equals((new IDVariant(""))))?(new IDVariant("-1")):(new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_DAL)))));
      MainFrm.SetParametroStampaJasper(v_PAL, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_AL))).equals((new IDVariant(""))))?(new IDVariant("-1")):(new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_AL)))));
      MainFrm.SetParametroStampaJasper(v_PSCADENZA, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_SCADENZA))).equals((new IDVariant(""))))?(new IDVariant("-1")):(new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_SCADENZA)))));
      MainFrm.SetParametroStampaJasper(v_PRESIDENZA, (((new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_RESIDENZA))).equals((new IDVariant(""))))?(new IDVariant("-1")):(new IDVariant(PAN_SOGGETTI.QBEFilter(PFL_SOGGETTI_RESIDENZA)))));
      MainFrm.SetParametroStampaJasper(v_PANAGRAFECON, ((MainFrm.ANAGRACONDIV.equals((new IDVariant())))?(new IDVariant("NO")):MainFrm.ANAGRACONDIV));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo Documento
  // **********************************************************************
  public int NuovoDocumento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Documento Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_TIPIDOCUMENT, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "NuovoDocumento", _e);
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
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFAMU")), true)!=0)
      {
        v_CAPTION = (new IDVariant("Soggetti"));
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Istituti Mutuanti"));
        v_CAPTION = new IDVariant(S);
      }
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMINFO, 0).equals((new IDVariant(1)), true))
      {
        set_Caption(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Informazioni")), (new IDVariant(" "))), v_CAPTION), MainFrm.ESERCIZIO));
      }
      else
      {
        set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      }
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMMODIFIC, 0, (new IDVariant("SI")));
      }
      else
      {
        IDVariant v_VREGISTVALOR = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.STRINGA = 'Aggiornamento Soggetti') ");
        SQL.append("and   (A.CHIAVE = 'PRODUCTS/' || " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " || '/' || 'SOGGETTI') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VREGISTVALOR = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_VREGISTVALOR.equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMMODIFIC, 0, (new IDVariant("SI")));
        }
      }
      PAN_SOGGETTI.set_FixedCols((new IDVariant(1)).intValue());
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMTIPO, 0, (new IDVariant("T")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMORDINAM, 0, (new IDVariant(0)));
      PAN_SOGGETTI.Freezed = (new IDVariant(-1)).booleanValue();
      PAN_SOGGETTI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_SOGGETTI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMINFO, 0).equals((new IDVariant(1)), true) || IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMMODIFIC, 0)))
      {
        PAN_SOGGETTI.set_Locked((new IDVariant(-1)).booleanValue());
        PAN_SOGGETTI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_SOGGETTI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMINFO, 0).equals((new IDVariant(1)), true) || MainFrm.DisabilitazioneModificaFattura().equals((new IDVariant("SI")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVODOCUMEN+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVODOCUMEN+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if ((MainFrm.GetForm(MyGlb.FRM_SOGGETTO, 0, false)!=null))
      {
        PAN_SOGGETTI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_MODIFICA1+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      // 
      // ANAGRAFE CONDIVISA
      // 
      if (IDL.NullValue(MainFrm.ANAGRACONDIV,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_SOGGETTI.SetFlags (Glb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        // 
        // /NO ANAGRAFE CONDIVISA
        // 
        PAN_SOGGETTI.SetFlags (Glb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_SOGGETTI.SetFlags (Glb.OBJ_FIELD, PFL_SOGGETTI_NI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SOGGETTI.SetFlags (Glb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMINFO, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMMODIFIC, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "UnloadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_TIPIDOCUMENT)), true) && Result.booleanValue())
      {
        if (Result.booleanValue() && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_T03, IMDBDef10.PQSL_T03_CODICE, 0))))
        {
          IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMECODIC, 0, IMDB.Value(IMDBDef10.PQRY_T03, IMDBDef10.PQSL_T03_CODICE, 0));
          IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMEMULTI, 0, IMDB.Value(IMDBDef10.PQRY_PARAM59, IMDBDef10.PQSL_PARAM59_ROWNAMEMULTI, 0));
          IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMEFSE, 0, IMDB.Value(IMDBDef10.PQRY_PARAM59, IMDBDef10.PQSL_PARAM59_ROWNAMEFSE, 0));
          IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMEFORNI, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_SOGGETTI2, IMDBDef9.PQSL_SOGGETTI2_CODICE, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMANNPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMNUMPRO, 0, (new IDVariant()));
          MainFrm.UnloadForm(MyGlb.FRM_FATTURA,(new IDVariant(0)).booleanValue()); 
          MainFrm.Show(MyGlb.FRM_FATTURA, (new IDVariant(0)).intValue(), this); 
          ((Fattura)MainFrm.GetForm(MyGlb.FRM_FATTURA,0,true,this)).ProponiNuovaRigaFattura();
        }
      }
      if (MainFrm.ANAGRACONDIV.equals((new IDVariant("SI")), true))
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true) && Result.booleanValue())
        {
          PAN_SOGGETTI.PanelCommand(Glb.PCM_REQUERY);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Soggetti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SOGGETTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SOGGETTI);
      // 
      // Soggetti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SOGGETTI.set_ToolTip(Glb.OBJ_FIELD,PFL_SOGGETTI_RAGIONSOCIAL,(new IDVariant(PAN_SOGGETTI.FieldText(PFL_SOGGETTI_RAGIONSOCIAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "SoggettiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Soggetti On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_SOGGETTI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Soggetti On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_SOGGETTI.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_SOGGETTI.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(8)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECLOSE, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "SoggettiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Soggetti On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_SOGGETTI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Soggetti On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_SOGGETTI.Status()).equals((new IDVariant(1)), true) || (MainFrm.GetForm(MyGlb.FRM_SOGGETTO, 0, false)!=null) || IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMMODIFIC, 0)))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_MODIFICA1+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_MODIFICA1+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Soggetti", "SoggettiOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void SOGGETTI_NEWTABLE48() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_NEWTABLE48_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI307, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI307, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_NEWTABLE48_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_NEWTABLE48_RS, 0, IMDBDef2.TBL_PARAMETRI307, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_NEWTABLE48_RS, 0, 0, IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMTIPO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_NEWTABLE48_RS, 1, 0, IMDBDef2.TBL_PARAMETRI307, IMDBDef2.FLD_PARAMETRI307_PARAMORDINAM, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI307, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI307, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI307, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_NEWTABLE48_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SOGGETTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SOGGETTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SOGGETTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SOGGETTI, Cancel);
    // Stub
  }

  private void PAN_SOGGETTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SOGGETTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SOGGETTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SOGGETTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SOGGETTI_Init()
  {

    PAN_SOGGETTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SOGGETTI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, "9869DD48-E401-4121-A827-253E89202E91");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, "Validità");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, MyGlb.VIS_GROUPSTYLE);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, MyGlb.PANEL_LIST, 1264, -9999, 136, 16, 0, 0);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, MyGlb.PANEL_FORM, 0, 291, 124, 73, 0, 0);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 0, 42);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 1, 13);
    PAN_SOGGETTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 0, 4);
    PAN_SOGGETTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 1, 4);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SOGGETTI.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, "B055340C-0E47-482B-A296-50A4ACE519E7");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, "Ragione Sociale");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, "D1E4548B-72B3-406F-A24D-019F8D819146");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, "Numero Individuale");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, "C3C789C0-80D8-48F1-BEF6-D33F08FBA3A0");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, "Codice");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, "Codice del beneficiario");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.VIS_NORFIEINTLUN);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, "69F5F341-1470-47DC-902E-7775A57176D5");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, "Tipo Soggetto");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, "2E238591-0CF5-4269-88A5-94AAB6030D8A");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, "Codice Fiscale");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, "05D1286A-18EB-4F97-B130-EB8BAC5E8EE8");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, "Partita IVA");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, "764940E9-3DA9-4D08-927B-6BA9744D0AD9");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, "Categoria");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, "Categoria");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, "F4C04592-4AD3-4473-9962-CCD366F655EF");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, "Residenza");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, "49635EDD-354A-4334-900C-18BD8815F8F7");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, "Scadenza");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, "21A7539C-1F9F-4D54-8DE7-A90BD82ACC66");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, "Pag Euro");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.VIS_CHECKSTYLE);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, "D49C352E-22BA-4A66-9CC9-3F01F6A88741");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, "Ordinamento");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, MyGlb.VIS_NORMFIELPADR);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, "A61AFEDB-4117-4136-8A12-F37F5CD45259");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, "Dal");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, "797A7C07-1A64-4F65-8A52-B754B798EB3E");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, "Al");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SOGGETTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 140);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 196, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 140);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_RAGIONSOCIAL, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_RAGIONSOCIAL, PPQRY_SOGGETTI2, "A.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_LIST, 308, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_LIST, 20);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_LIST, "Numero Individuale");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_FORM, 4, 292, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_FORM, 20);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_FORM, "N. I.");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_NI, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_NI, PPQRY_SOGGETTI2, "A.NI", "BENNI", 1, 8, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, 380, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, 4, 28, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_CODICE, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_CODICE, PPQRY_SOGGETTI2, "A.CODICE", "CODICE", 2, 15, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_LIST, 464, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_LIST, 100);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_LIST, "Tipo Soggetto");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_FORM, 4, 364, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_FORM, 100);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_FORM, "Tipo Soggetto");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_TIPOSOGGETTO, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_TIPOSOGGETTO, PPQRY_SOGGETTI2, "A.TIPO_SOGGETTO", "BENTIPOSOGGE", 12, 1, 0, -13997);
    PAN_SOGGETTI.SetValueListItem(PFL_SOGGETTI_TIPOSOGGETTO, (new IDVariant("G")), "Generico", "", "", -1);
    PAN_SOGGETTI.SetValueListItem(PFL_SOGGETTI_TIPOSOGGETTO, (new IDVariant("I")), "Fisico", "", "", -1);
    PAN_SOGGETTI.SetValueListItem(PFL_SOGGETTI_TIPOSOGGETTO, (new IDVariant("E")), "Giuridico", "Giuridico", "", -1);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, 532, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, 92);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, 4, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, 92);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_CODICEFISCAL, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_CODICEFISCAL, PPQRY_SOGGETTI2, "A.CODICE_FISCALE", "CODICE_FISCALE", 5, 16, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, 652, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, 72);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, "Partita IVA");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, 4, 76, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, 72);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, "Partita IVA");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_PARTITAIVA, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_PARTITAIVA, PPQRY_SOGGETTI2, "A.PARTITA_IVA", "PARTITA_IVA", 5, 11, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_LIST, 752, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_LIST, 68);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_FORM, 68);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_CATEGORIA, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_CATEGORIA, PPQRY_SOGGETTI2, "A.CATEGORIA", "CATEGORIA", 1, 3, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, MyGlb.PANEL_LIST, 892, 36, 296, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, MyGlb.PANEL_LIST, 48);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, MyGlb.PANEL_LIST, "Residenza");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, MyGlb.PANEL_FORM, 4, 244, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, MyGlb.PANEL_FORM, 48);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, MyGlb.PANEL_FORM, 2);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RESIDENZA, MyGlb.PANEL_FORM, "Resid.");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_RESIDENZA, -1, -1);
    PAN_SOGGETTI.SetFieldUnbound(PFL_SOGGETTI_RESIDENZA, true);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_RESIDENZA, PPQRY_SOGGETTI2, "A.INDIRIZZO || ' ' || TO_CHAR ( A.CAP ) || ' ' || B.DENOMINAZIONE", "BENRESIDENZA", 5, 176, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_LIST, 1188, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_LIST, 72);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_FORM, 4, 148, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_FORM, 72);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_SCADENZA, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_SCADENZA, PPQRY_SOGGETTI2, "A.D_SCADENZA", "D_SCADENZA", 6, 10, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_LIST, 1096, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_LIST, 116);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_LIST, "Pag Euro");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_FORM, 4, 172, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_FORM, 116);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_FORM, "Pag Euro");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_PAGEURO, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_PAGEURO, PPQRY_SOGGETTI2, "A.PAGAMENTO_IN_EURO", "PAGAMENTO_IN_EURO", 5, 2, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, MyGlb.PANEL_LIST, 84);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, MyGlb.PANEL_LIST, 2);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, MyGlb.PANEL_FORM, 4, 292, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, MyGlb.PANEL_FORM, 84);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, MyGlb.PANEL_FORM, 2);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_ORDINAMENTO1, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_ORDINAMENTO1, -1, -1);
    PAN_SOGGETTI.SetFieldUnbound(PFL_SOGGETTI_ORDINAMENTO1, true);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_ORDINAMENTO1, PPQRY_SOGGETTI2, "CASE WHEN ~~PQRY_NEWTABLE48.PARAMORDINAM~~ = 1 THEN LPAD(TO_CHAR ( A.CODICE ), 6, SUBSTR('0', 1, 1)) ELSE A.RAGIONE_SOCIALE_ESTESA END", "BENORDINAMEN", 5, 99, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_LIST, 1264, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_LIST, 32);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_FORM, 4, 316, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_FORM, 32);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_DAL, -1, GRP_SOGGETTI_VALIDITA);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_DAL, PPQRY_SOGGETTI2, "A.DAL", "BENDAL", 6, 14, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_LIST, 1332, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_LIST, 24);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_FORM, 4, 340, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_FORM, 24);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_AL, -1, GRP_SOGGETTI_VALIDITA);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_AL, PPQRY_SOGGETTI2, "A.AL", "BENAL", 6, 14, 0, -13997);
  }

  private void PAN_SOGGETTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SOGGETTI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIOT05 ");
    SQL.append("from ");
    SQL.append("  T05 A ");
    SQL.append("where (A.CODICE = ~~CATEGORIA~~) ");
    PAN_SOGGETTI.SetQuery(PPQRY_T05, 0, SQL, PFL_SOGGETTI_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIOT05 ");
    SQL.append("from ");
    SQL.append("  T05 A ");
    PAN_SOGGETTI.SetQuery(PPQRY_T05, 1, SQL, PFL_SOGGETTI_CATEGORIA, "");
    PAN_SOGGETTI.SetQueryDB(PPQRY_T05, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SOGGETTI.SetIMDB(IMDB, "PQRY_SOGGETTI2", true);
    PAN_SOGGETTI.set_SetString(MyGlb.MASTER_ROWNAME, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.INDIRIZZO || ' ' || TO_CHAR ( A.CAP ) || ' ' || B.DENOMINAZIONE as BENRESIDENZA, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.PAGAMENTO_IN_EURO as PAGAMENTO_IN_EURO, ");
    SQL.append("  CASE WHEN ~~PQRY_NEWTABLE48.PARAMORDINAM~~ = 1 THEN LPAD(TO_CHAR ( A.CODICE ), 6, SUBSTR('0', 1, 1)) ELSE A.RAGIONE_SOCIALE_ESTESA END as BENORDINAMEN, ");
    SQL.append("  A.NI as BENNI, ");
    SQL.append("  A.DAL as BENDAL, ");
    SQL.append("  A.AL as BENAL, ");
    SQL.append("  A.TIPO_SOGGETTO as BENTIPOSOGGE ");
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BEN A, ");
    SQL.append("  AD4_COMUNI B ");
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.COMUNE = B.COMUNE(+)) ");
    SQL.append("and   (A.PROVINCIA = B.PROVINCIA_STATO(+)) ");
    SQL.append("and   (NVL(" + IDL.CSql(MainFrm.ANAGRACONDIV, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') = 'NO' OR (" + IDL.CSql(MainFrm.ANAGRACONDIV, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI' AND ((~~PQRY_NEWTABLE48.PARAMTIPO~~ = 'N' AND (TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) OR (~~PQRY_NEWTABLE48.PARAMTIPO~~ = 'S' AND TRUNC( SYSDATE ) > NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD'))) OR ~~PQRY_NEWTABLE48.PARAMTIPO~~ = 'T'))) ");
    SQL.append("and   (((((NVL(A.D_SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) AND ~~PQRY_NEWTABLE48.PARAMTIPO~~ = 'N') OR (A.D_SCADENZA < TRUNC( SYSDATE ) AND ~~PQRY_NEWTABLE48.PARAMTIPO~~ = 'S') OR ~~PQRY_NEWTABLE48.PARAMTIPO~~ = 'T') AND NVL(" + IDL.CSql(MainFrm.ANAGRACONDIV, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') = 'NO') OR (NVL(" + IDL.CSql(MainFrm.ANAGRACONDIV, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') = 'SI')) ");
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 9 ");
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI2, 5, SQL, -1, "");
    PAN_SOGGETTI.SetQueryDB(PPQRY_SOGGETTI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SOGGETTI.SetMasterTable(0, "BEN");
    PAN_SOGGETTI.AddToSortList(PFL_SOGGETTI_ORDINAMENTO1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SOGGETTI.Status() == 2)
    {
      int oldListQBE = PAN_SOGGETTI.iUseListQBE;
      PAN_SOGGETTI.iUseListQBE = 0;
      PAN_SOGGETTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SOGGETTI.PanelCommand(Glb.PCM_FIND);
      PAN_SOGGETTI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, "0EEF2E10-EC80-4A78-BCA0-B68328FEF1D9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, "Tipo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "BAC9C361-0DBB-4B67-8B68-440FCD9DF0AE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_FORM, 16, 4, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPO, PPQRY_NEWTABLE48, "A.PARAMTIPO", "PARAMTIPO", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPO, (new IDVariant("N")), "Non scaduti", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPO, (new IDVariant("S")), "Scaduti", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPO, (new IDVariant("T")), "Tutti", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 80, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 316, 4, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ORDINAMENTO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ORDINAMENTO, PPQRY_NEWTABLE48, "A.PARAMORDINAM", "PARAMORDINAM", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant(0)), "Ragione Sociale", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant(1)), "Codice", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_NEWTABLE48", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_NEWTABLE48, IMDBDef9.PQRY_NEWTABLE48_RS, IMDBDef2.TBL_PARAMETRI307);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPO, IMDBDef2.FLD_PARAMETRI307_PARAMTIPO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ORDINAMENTO, IMDBDef2.FLD_PARAMETRI307_PARAMORDINAM);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI307");
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
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
