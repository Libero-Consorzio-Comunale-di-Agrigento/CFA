// **********************************************
// Notifiche
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Notifiche extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DATADAL = 0;
  private static int PFL_PARAMETRI_NASCONDVISTI = 1;

  private static int PPQRY_PARAMETRI306 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_NOTIFICHE_ID = 0;
  private static int PFL_NOTIFICHE_DATA = 1;
  private static int PFL_NOTIFICHE_NOTIFICA = 2;
  private static int PFL_NOTIFICHE_MODULOA = 3;
  private static int PFL_NOTIFICHE_PROGRUODA = 4;
  private static int PFL_NOTIFICHE_PROGRUOA = 5;
  private static int PFL_NOTIFICHE_VISTO = 6;
  private static int PFL_NOTIFICHE_VISTODA = 7;
  private static int PFL_NOTIFICHE_ETICHETTAOK = 8;
  private static int PFL_NOTIFICHE_ANNULLA = 9;

  private static int PPQRY_NOTIFICHE = 0;


  IDPanel PAN_NOTIFICHE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI461(IMDB);
    //
    //
    Init_PQRY_NOTIFICHE(IMDB);
    Init_PQRY_PARAMETRI306(IMDB);
    Init_PQRY_PARAMETRI306_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI461(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI461, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI461, "TBL_PARAMETRI461");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI461,IMDBDef2.FLD_PARAMETRI461_NOMOGGDATDAL, "NOMOGGDATDAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI461,IMDBDef2.FLD_PARAMETRI461_NOMOGGDATDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI461,IMDBDef2.FLD_PARAMETRI461_NOMOGGNASVIS, "NOMOGGNASVIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI461,IMDBDef2.FLD_PARAMETRI461_NOMOGGNASVIS,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI461, 0);
  }

  private static void Init_PQRY_NOTIFICHE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NOTIFICHE, 8);
    IMDB.set_TblCode(IMDBDef10.PQRY_NOTIFICHE, "PQRY_NOTIFICHE");
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_ID, "ID");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_ID,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_DATA_ORA, "DATA_ORA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_DATA_ORA,8,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_MODULO_A, "MODULO_A");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_MODULO_A,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_PROGR_UO_DA, "PROGR_UO_DA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_PROGR_UO_DA,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_PROGR_UO_A, "PROGR_UO_A");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_PROGR_UO_A,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_TESTO_NOTIFICA, "TESTO_NOTIFICA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_TESTO_NOTIFICA,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_VISTODA, "VISTODA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_VISTODA,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_VISTO, "VISTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_NOTIFICHE,IMDBDef10.PQSL_NOTIFICHE_VISTO,1,19,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_NOTIFICHE, 0);
  }

  private static void Init_PQRY_PARAMETRI306(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI306, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI306, "PQRY_PARAMETRI306");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI306,IMDBDef10.PQSL_PARAMETRI306_NOMOGGDATDAL, "NOMOGGDATDAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI306,IMDBDef10.PQSL_PARAMETRI306_NOMOGGDATDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI306,IMDBDef10.PQSL_PARAMETRI306_NOMOGGNASVIS, "NOMOGGNASVIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI306,IMDBDef10.PQSL_PARAMETRI306_NOMOGGNASVIS,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI306, 0);
  }

  private static void Init_PQRY_PARAMETRI306_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI306_RS, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI306_RS, "PQRY_PARAMETRI306_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI306_RS,IMDBDef10.PQSL_PARAMETRI306_NOMOGGDATDAL, "NOMOGGDATDAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI306_RS,IMDBDef10.PQSL_PARAMETRI306_NOMOGGDATDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI306_RS,IMDBDef10.PQSL_PARAMETRI306_NOMOGGNASVIS, "NOMOGGNASVIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI306_RS,IMDBDef10.PQSL_PARAMETRI306_NOMOGGNASVIS,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Notifiche(MyWebEntryPoint w, IMDBObj imdb)
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
  public Notifiche()
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
    FormIdx = MyGlb.FRM_NOTIFICHE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0E96C44A-5857-4D7F-B4BC-1B37C19AF33A";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 872;
    DesignHeight = 418;
    set_Caption(new IDVariant("Notifiche"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 872;
    Frames[1].Height = 392;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0918367;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 872;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 36;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 872-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "87FA86B8-4D5D-4194-A622-2E0FA0A58002");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 128, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 872;
    Frames[3].Height = 356;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Notifiche";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 356;
    PAN_NOTIFICHE = new IDPanel(w, this, 3, "PAN_NOTIFICHE");
    Frames[3].Content = PAN_NOTIFICHE;
    PAN_NOTIFICHE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTIFICHE.VS = MainFrm.VisualStyleList;
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 872-MyGlb.PAN_OFFS_X, 356-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E8351EA6-54B7-4C03-BA3A-36F4A085542C");
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 16, 816, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTIFICHE.InitStatus = 2;
    PAN_NOTIFICHE_Init();
    PAN_NOTIFICHE_InitFields();
    PAN_NOTIFICHE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI461, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        NOTIFICHE_PARAMETRI306();
      }
      PAN_NOTIFICHE.UpdatePanel(MainFrm);
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
    return (obj instanceof Notifiche);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Notifiche.class.getName() : (Glb.ClassWithPackage(Notifiche.class) ? Notifiche.class.getName().substring(Notifiche.class.getPackage().getName().length() + 1) : Notifiche.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Notifiche On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTIFICHE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_NOTIFICHE);
      // 
      // Notifiche On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_NOTIFICHE, IMDBDef10.PQSL_NOTIFICHE_VISTO, 0),(new IDVariant(0))).equals((new IDVariant(1)), true))
      {
        PAN_NOTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_NOTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Notifiche", "NotificheOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Etichetta Ok
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaOk ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Ok Body
      // Corpo Procedura
      // 
      C2 = PAN_NOTIFICHE.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_NOTIFICHE.GotoFirst();
      while (!PAN_NOTIFICHE.RSEOF())
      {
        if (C2.Get("VISTO").equals((new IDVariant(1)), true) && IDL.IsNull(C2.Get("VISTODA")))
        {
          SQL = new StringBuffer();
          SQL.append("insert into NOTIFICHE_VISTI ");
          SQL.append("( ");
          SQL.append("  UTENTE, ");
          SQL.append("  ID, ");
          SQL.append("  DATA_ORA, ");
          SQL.append("  ID_NOTIFICA ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  to_number(NULL), ");
          SQL.append("  TRUNC( SYSDATE ), ");
          SQL.append("  " + IDL.CSql(C2.Get("ID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        PAN_NOTIFICHE.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Notifiche", "EtichettaOk", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Notifiche", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Visto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visto Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_NOTIFICHE, IMDBDef10.PQSL_NOTIFICHE_VISTO, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("passo"))); 
        // SQL = new StringBuffer();
        // SQL.append("insert into NOTIFICHE_VISTI ");
        // SQL.append("( ");
        // SQL.append("  UTENTE, ");
        // SQL.append("  DATA_ORA, ");
        // SQL.append("  ID_NOTIFICA ");
        // SQL.append(") ");
        // SQL.append("values ");
        // SQL.append("( ");
        // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        // SQL.append("  TRUNC( SYSDATE ), ");
        // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_NOTIFICHE, IMDBDef10.PQSL_NOTIFICHE_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
        // SQL.append(") ");
        // MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Notifiche", "Visto", _e);
      return -1;
    }
  }

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
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI461, IMDBDef2.FLD_PARAMETRI461_NOMOGGNASVIS, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Notifiche", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("Notifiche", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI461, IMDBDef2.FLD_PARAMETRI461_NOMOGGDATDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI461, IMDBDef2.FLD_PARAMETRI461_NOMOGGNASVIS, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void NOTIFICHE_PARAMETRI306() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI306_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI461, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI461, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI306_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI306_RS, 0, IMDBDef2.TBL_PARAMETRI461, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI306_RS, 0, 0, IMDBDef2.TBL_PARAMETRI461, IMDBDef2.FLD_PARAMETRI461_NOMOGGDATDAL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI306_RS, 1, 0, IMDBDef2.TBL_PARAMETRI461, IMDBDef2.FLD_PARAMETRI461_NOMOGGNASVIS, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI461, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI461, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI461, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI306_RS, 0);
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
  private void PAN_NOTIFICHE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTIFICHE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTIFICHE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTIFICHE, Cancel);
    // Stub
  }

  private void PAN_NOTIFICHE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_NOTIFICHE_ETICHETTAOK)
    {
      this.IdxPanelActived = this.PAN_NOTIFICHE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaOk();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_NOTIFICHE_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_NOTIFICHE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_NOTIFICHE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTIFICHE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTIFICHE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_NOTIFICHE_Init()
  {

    PAN_NOTIFICHE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTIFICHE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTIFICHE.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, "8D38D278-6856-4623-8D45-36BE0A411FA4");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, "ID");
    PAN_NOTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, "");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, "D939721E-0073-40CD-9F79-0D69C6D88F5A");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, "Data");
    PAN_NOTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, "");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, "C271BB12-43ED-4DAE-9D2A-B415EA303732");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, "Notifica");
    PAN_NOTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, "");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, "E78426E4-5C2A-47F7-A55D-10DD1250D9E4");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, "MODULO A");
    PAN_NOTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, "");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, MyGlb.VIS_NORMFIELPADR);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, "BE2ADE17-33D4-4867-BC0A-A660EBAFFA46");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, "PROGR UO DA");
    PAN_NOTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, "");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, MyGlb.VIS_NORMFIELPADR);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, "FAF9586B-86C9-48D5-BB0A-698384236831");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, "PROGR UO A");
    PAN_NOTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, "");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, MyGlb.VIS_NORMFIELPADR);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, "ED990153-37E9-4E34-8FEA-3994021F288D");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, "Visto");
    PAN_NOTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, "");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, MyGlb.VIS_CHECKSTYLE);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, "196851D4-2FA6-45D7-84DE-599C8A10ADC9");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, "Da");
    PAN_NOTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, "");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, "4B26907A-8028-4DF1-ABE7-F4A8D64EADA2");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, "Ok");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, MyGlb.VIS_STATICBUTTON);
    PAN_NOTIFICHE.SetImage(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, 0, "button1.gif", false);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_NOTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, "3AA260AC-30F5-49F8-AE9A-4D52F0D9111C");
    PAN_NOTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, "Annulla");
    PAN_NOTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_NOTIFICHE.SetImage(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, 0, "button1.gif", false);
    PAN_NOTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_NOTIFICHE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, MyGlb.PANEL_LIST, 24);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, MyGlb.PANEL_LIST, "ID");
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, MyGlb.PANEL_FORM, 112);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, MyGlb.PANEL_FORM, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ID, MyGlb.PANEL_FORM, "ID");
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_ID, -1, -1);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_ID, PPQRY_NOTIFICHE, "A.ID", "ID", 2, 15, 0, -13997);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, MyGlb.PANEL_LIST, 0, 52, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, MyGlb.PANEL_LIST, 68);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, MyGlb.PANEL_FORM, 4, 28, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, MyGlb.PANEL_FORM, 112);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_DATA, -1, -1);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_DATA, PPQRY_NOTIFICHE, "A.DATA_ORA", "DATA_ORA", 8, 19, 0, -13997);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, MyGlb.PANEL_LIST, 100, 52, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, MyGlb.PANEL_LIST, 112);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, MyGlb.PANEL_LIST, "Notifica");
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, MyGlb.PANEL_FORM, 4, 124, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, MyGlb.PANEL_FORM, 112);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, MyGlb.PANEL_FORM, 2);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_NOTIFICA, MyGlb.PANEL_FORM, "Notifica");
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_NOTIFICA, -1, -1);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_NOTIFICA, PPQRY_NOTIFICHE, "A.TESTO_NOTIFICA", "TESTO_NOTIFICA", 5, 255, 0, -13997);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, MyGlb.PANEL_LIST, 472, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, MyGlb.PANEL_LIST, 68);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, MyGlb.PANEL_LIST, "MODULO A");
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, MyGlb.PANEL_FORM, 4, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, MyGlb.PANEL_FORM, 112);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, MyGlb.PANEL_FORM, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_MODULOA, MyGlb.PANEL_FORM, "MODULO A");
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_MODULOA, -1, -1);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_MODULOA, PPQRY_NOTIFICHE, "A.MODULO_A", "MODULO_A", 5, 4, 0, -13997);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, MyGlb.PANEL_LIST, 88);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, MyGlb.PANEL_LIST, "PR. U. DA");
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, MyGlb.PANEL_FORM, 4, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, MyGlb.PANEL_FORM, 112);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, MyGlb.PANEL_FORM, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUODA, MyGlb.PANEL_FORM, "PROGR UO DA");
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_PROGRUODA, -1, -1);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_PROGRUODA, PPQRY_NOTIFICHE, "A.PROGR_UO_DA", "PROGR_UO_DA", 2, 15, 0, -13997);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, MyGlb.PANEL_LIST, 80);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, MyGlb.PANEL_LIST, "PR. UO A");
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, MyGlb.PANEL_FORM, 4, 100, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, MyGlb.PANEL_FORM, 112);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, MyGlb.PANEL_FORM, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_PROGRUOA, MyGlb.PANEL_FORM, "PROGR UO A");
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_PROGRUOA, -1, -1);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_PROGRUOA, PPQRY_NOTIFICHE, "A.PROGR_UO_A", "PROGR_UO_A", 2, 15, 0, -13997);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, MyGlb.PANEL_LIST, 656, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, MyGlb.PANEL_LIST, 36);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, MyGlb.PANEL_LIST, "Visto");
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, MyGlb.PANEL_FORM, 4, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, MyGlb.PANEL_FORM, 36);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, MyGlb.PANEL_FORM, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTO, MyGlb.PANEL_FORM, "Visto");
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_VISTO, -1, -1);
    PAN_NOTIFICHE.SetFieldUnbound(PFL_NOTIFICHE_VISTO, true);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_VISTO, PPQRY_NOTIFICHE, "DECODE(C.ID_NOTIFICA, to_number(NULL), to_number(NULL), 1)", "VISTO", 1, 19, 0, -13997);
    PAN_NOTIFICHE.SetValueListItem(PFL_NOTIFICHE_VISTO, (new IDVariant(1)), "1", "", "", -1);
    PAN_NOTIFICHE.SetValueListItem(PFL_NOTIFICHE_VISTO, (new IDVariant()), "null", "", "", -1);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, MyGlb.PANEL_LIST, 696, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, MyGlb.PANEL_LIST, 56);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, MyGlb.PANEL_LIST, "Da");
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, MyGlb.PANEL_FORM, 4, 172, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, MyGlb.PANEL_FORM, 56);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, MyGlb.PANEL_FORM, 2);
    PAN_NOTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_VISTODA, MyGlb.PANEL_FORM, "Da");
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_VISTODA, -1, -1);
    PAN_NOTIFICHE.SetFieldUnbound(PFL_NOTIFICHE_VISTODA, true);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_VISTODA, PPQRY_NOTIFICHE, "DECODE(C.ID_NOTIFICA, to_number(NULL), NULL, B.NOMINATIVO || ' il ' || TO_CHAR ( C.DATA_ORA,'dd/mm/yyyy'))", "VISTODA", 5, 99, 0, -13997);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, MyGlb.PANEL_LIST, 648, 296, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, MyGlb.PANEL_LIST, 0);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, MyGlb.PANEL_FORM, 436, 316, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, MyGlb.PANEL_FORM, 0);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ETICHETTAOK, MyGlb.PANEL_FORM, 1);
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_ETICHETTAOK, -1, -1);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_ETICHETTAOK, -1, "", "ETICHETTAOK", 0, 0, 0, -13997);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, MyGlb.PANEL_LIST, 736, 296, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_NOTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, MyGlb.PANEL_FORM, 444, 324, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_NOTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTIFICHE_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_NOTIFICHE.SetFieldPage(PFL_NOTIFICHE_ANNULLA, -1, -1);
    PAN_NOTIFICHE.SetFieldPanel(PFL_NOTIFICHE_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
  }

  private void PAN_NOTIFICHE_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTIFICHE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTIFICHE.SetIMDB(IMDB, "PQRY_NOTIFICHE", true);
    PAN_NOTIFICHE.set_SetString(MyGlb.MASTER_ROWNAME, "NOTIFICHE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as ID, ");
    SQL.append("  A.DATA_ORA as DATA_ORA, ");
    SQL.append("  A.MODULO_A as MODULO_A, ");
    SQL.append("  A.PROGR_UO_DA as PROGR_UO_DA, ");
    SQL.append("  A.PROGR_UO_A as PROGR_UO_A, ");
    SQL.append("  A.TESTO_NOTIFICA as TESTO_NOTIFICA, ");
    SQL.append("  DECODE(C.ID_NOTIFICA, to_number(NULL), NULL, B.NOMINATIVO || ' il ' || TO_CHAR ( C.DATA_ORA,'dd/mm/yyyy')) as VISTODA, ");
    SQL.append("  DECODE(C.ID_NOTIFICA, to_number(NULL), to_number(NULL), 1) as VISTO ");
    PAN_NOTIFICHE.SetQuery(PPQRY_NOTIFICHE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTIFICHE A, ");
    SQL.append("  AD4_UTENTI B, ");
    SQL.append("  NOTIFICHE_VISTI C ");
    PAN_NOTIFICHE.SetQuery(PPQRY_NOTIFICHE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.ID_NOTIFICA(+) = A.ID) ");
    SQL.append("and   (B.UTENTE(+) = C.UTENTE) ");
    SQL.append("and   (A.MODULO_A = 'CF') ");
    SQL.append("and   ((((C.ID_NOTIFICA IS NULL) AND ~~TBL_PARAMETRI461.NOMOGGNASVIS~~ = 'SI') OR ~~TBL_PARAMETRI461.NOMOGGNASVIS~~ = 'NO')) ");
    SQL.append("and   (TO_DATE(TO_NUMBER(TO_CHAR(A.DATA_ORA, 'dd'))||'/'||TO_NUMBER(TO_CHAR(A.DATA_ORA, 'mm' ))||'/'||TO_NUMBER(TO_CHAR(A.DATA_ORA, 'yyyy')),'dd/mm/yyyy') >= ~~TBL_PARAMETRI461.NOMOGGDATDAL~~ OR (~~TBL_PARAMETRI461.NOMOGGDATDAL~~ IS NULL)) ");
    PAN_NOTIFICHE.SetQuery(PPQRY_NOTIFICHE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTIFICHE.SetQuery(PPQRY_NOTIFICHE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTIFICHE.SetQuery(PPQRY_NOTIFICHE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 8 desc, 2 desc ");
    PAN_NOTIFICHE.SetQuery(PPQRY_NOTIFICHE, 5, SQL, -1, "");
    PAN_NOTIFICHE.SetQueryDB(PPQRY_NOTIFICHE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTIFICHE.SetMasterTable(0, "NOTIFICHE");
    PAN_NOTIFICHE.AddToSortList(PFL_NOTIFICHE_VISTO, false);
    PAN_NOTIFICHE.AddToSortList(PFL_NOTIFICHE_DATA, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTIFICHE.Status() == 2)
    {
      int oldListQBE = PAN_NOTIFICHE.iUseListQBE;
      PAN_NOTIFICHE.iUseListQBE = 0;
      PAN_NOTIFICHE.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTIFICHE.PanelCommand(Glb.PCM_FIND);
      PAN_NOTIFICHE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, "68F6E570-69D0-406D-882C-7895C6212AA8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, "Data Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, "698DEC93-A7D6-4990-966F-CD548D7B9070");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, "Nascondi Visti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_LIST, "Data Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_FORM, "Data Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATADAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATADAL, PPQRY_PARAMETRI306, "A.NOMOGGDATDAL", "NOMOGGDATDAL", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, MyGlb.PANEL_LIST, "Nasc. Visti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, MyGlb.PANEL_FORM, 220, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NASCONDVISTI, MyGlb.PANEL_FORM, "Nascondi Visti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NASCONDVISTI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NASCONDVISTI, PPQRY_PARAMETRI306, "A.NOMOGGNASVIS", "NOMOGGNASVIS", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_NASCONDVISTI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_NASCONDVISTI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI306", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI306, IMDBDef10.PQRY_PARAMETRI306_RS, IMDBDef2.TBL_PARAMETRI461);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATADAL, IMDBDef2.FLD_PARAMETRI461_NOMOGGDATDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NASCONDVISTI, IMDBDef2.FLD_PARAMETRI461_NOMOGGNASVIS);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI461");
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
    if (SrcObj == PAN_NOTIFICHE) PAN_NOTIFICHE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NOTIFICHE) PAN_NOTIFICHE_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NOTIFICHE) PAN_NOTIFICHE_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_NOTIFICHE) PAN_NOTIFICHE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_NOTIFICHE) PAN_NOTIFICHE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
