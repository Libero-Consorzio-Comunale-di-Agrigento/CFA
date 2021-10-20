// **********************************************
// Visualizzatore Estrazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VisualizzatoreEstrazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_RICERCA_VALIDAAL = 0;

  private static int PPQRY_PAR124 = 0;


  IDPanel PAN_RICERCA;
  private static int PFL_VISUALESTRAZ_CODICE = 0;
  private static int PFL_VISUALESTRAZ_CATEGORIA = 1;
  private static int PFL_VISUALESTRAZ_TITOLO = 2;
  private static int PFL_VISUALESTRAZ_DESCRIZIONE = 3;
  private static int PFL_VISUALESTRAZ_DATAINIZVALI = 4;
  private static int PFL_VISUALESTRAZ_DATAFINEVALI = 5;
  private static int PFL_VISUALESTRAZ_STATO = 6;
  private static int PFL_VISUALESTRAZ_NOMEFILEEXPO = 7;
  private static int PFL_VISUALESTRAZ_IDHELP = 8;
  private static int PFL_VISUALESTRAZ_NOTE = 9;
  private static int PFL_VISUALESTRAZ_SELECTSQL = 10;
  private static int PFL_VISUALESTRAZ_UTENTEINSERI = 11;
  private static int PFL_VISUALESTRAZ_ID = 12;

  private static int PPQRY_CFESTRASELE3 = 0;

  private static int PPQRY_CFESTRCATSEL = 1;
  private static int PPQRY_CFESTRHELSEL = 2;


  IDPanel PAN_VISUALESTRAZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI88(IMDB);
    //
    //
    Init_PQRY_PAR124(IMDB);
    Init_PQRY_PAR124_RS(IMDB);
    Init_PQRY_CFESTRASELE3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI88(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI88, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI88, "TBL_PARAMETRI88");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI88,IMDBDef7.FLD_PARAMETRI88_NOMEOGGETPID, "NOMEOGGETPID");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI88,IMDBDef7.FLD_PARAMETRI88_NOMEOGGETPID,3,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI88,IMDBDef7.FLD_PARAMETRI88_NOMEOGGEDUPL, "NOMEOGGEDUPL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI88,IMDBDef7.FLD_PARAMETRI88_NOMEOGGEDUPL,1,9,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI88,IMDBDef7.FLD_PARAMETRI88_NOMEOGGVALAL, "NOMEOGGVALAL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI88,IMDBDef7.FLD_PARAMETRI88_NOMEOGGVALAL,6,10,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI88, 0);
  }

  private static void Init_PQRY_PAR124(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PAR124, 1);
    IMDB.set_TblCode(IMDBDef17.PQRY_PAR124, "PQRY_PAR124");
    IMDB.set_FldCode(IMDBDef17.PQRY_PAR124,IMDBDef17.PQSL_PAR124_NOMEOGGVALAL, "NOMEOGGVALAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PAR124,IMDBDef17.PQSL_PAR124_NOMEOGGVALAL,6,10,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PAR124, 0);
  }

  private static void Init_PQRY_PAR124_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PAR124_RS, 1);
    IMDB.set_TblCode(IMDBDef17.PQRY_PAR124_RS, "PQRY_PAR124_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PAR124_RS,IMDBDef17.PQSL_PAR124_NOMEOGGVALAL, "NOMEOGGVALAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PAR124_RS,IMDBDef17.PQSL_PAR124_NOMEOGGVALAL,6,10,0);
  }

  private static void Init_PQRY_CFESTRASELE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRASELE3, 13);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRASELE3, "PQRY_CFESTRASELE3");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_ID, "ID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_ID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_TITOLO,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_CATEGORIA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_STATO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_SELECT_SQL, "SELECT_SQL");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_SELECT_SQL,9,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_NOTE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_DATA_INIZIO_VALIDITA, "DATA_INIZIO_VALIDITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_DATA_INIZIO_VALIDITA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_DATA_FINE_VALIDITA, "DATA_FINE_VALIDITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_DATA_FINE_VALIDITA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_NOME_FILE_EXPORT, "NOME_FILE_EXPORT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_NOME_FILE_EXPORT,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_ID_HELP, "ID_HELP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_ID_HELP,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE3,IMDBDef17.PQSL_CFESTRASELE3_CODICE,5,20,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRASELE3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VisualizzatoreEstrazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public VisualizzatoreEstrazioni()
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
    FormIdx = MyGlb.FRM_VISUALESTRAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5F874A17-27B5-427A-A83A-43FE38CFF08F";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1360;
    DesignHeight = 854;
    set_Caption(new IDVariant("Visualizzatore Estrazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1360;
    Frames[1].Height = 828;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0555556;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1360;
    Frames[2].Height = 46;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Ricerca";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 46;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_RICERCA = new IDPanel(w, this, 2, "PAN_RICERCA");
    Frames[2].Content = PAN_RICERCA;
    PAN_RICERCA.ShowToolbar = false;
    PAN_RICERCA.ShowStatusbar = false;
    PAN_RICERCA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RICERCA.VS = MainFrm.VisualStyleList;
    PAN_RICERCA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1360-MyGlb.PAN_OFFS_X, 46-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RICERCA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6DF3CDB5-E865-42D5-A41C-A31CBAE3B87C");
    PAN_RICERCA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 16, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_RICERCA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RICERCA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RICERCA.InitStatus = 2;
    PAN_RICERCA_Init();
    PAN_RICERCA_InitFields();
    PAN_RICERCA_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1360;
    Frames[3].Height = 782;
    Frames[3].Caption = "Visualizzatore Estrazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 782;
    PAN_VISUALESTRAZ = new IDPanel(w, this, 3, "PAN_VISUALESTRAZ");
    Frames[3].Content = PAN_VISUALESTRAZ;
    PAN_VISUALESTRAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VISUALESTRAZ.VS = MainFrm.VisualStyleList;
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1360-MyGlb.PAN_OFFS_X, 782-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5AC9CA0C-B57C-4115-B726-93009D7ED70D");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1264, 636, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VISUALESTRAZ.InitStatus = 2;
    PAN_VISUALESTRAZ_Init();
    PAN_VISUALESTRAZ_InitFields();
    PAN_VISUALESTRAZ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI88, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VISUALESTRAZ_PAR124();
      }
      PAN_RICERCA.UpdatePanel(MainFrm);
      PAN_VISUALESTRAZ.UpdatePanel(MainFrm);
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
    return (obj instanceof VisualizzatoreEstrazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VisualizzatoreEstrazioni.class.getName() : (Glb.ClassWithPackage(VisualizzatoreEstrazioni.class) ? VisualizzatoreEstrazioni.class.getName().substring(VisualizzatoreEstrazioni.class.getPackage().getName().length() + 1) : VisualizzatoreEstrazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Visualizzatore Estrazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VISUALESTRAZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VISUALESTRAZ);
      // 
      // Visualizzatore Estrazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_CFESTRASELE3, IMDBDef17.PQSL_CFESTRASELE3_STATO, 0).equals((new IDVariant("S")), true))
      {
        PAN_VISUALESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUALESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        if (MainFrm.GetAbilitazioni((new IDVariant("MODIFICA"))).equals((new IDVariant(-1)), true))
        {
          PAN_VISUALESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VISUALESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VISUALESTRAZ.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(-1)).booleanValue()); 
        }
        else
        {
          PAN_VISUALESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VISUALESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VISUALESTRAZ.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzatoreEstrazioni", "VisualizzatoreEstrazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Visualizzatore Estrazioni On Change Layout
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VISUALESTRAZ_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizzatore Estrazioni On Change Layout Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_VISUALESTRAZ.Layout())).equals((new IDVariant(0)), true))
      {
        PAN_RICERCA.SetFlags (Glb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_RICERCA.SetFlags (Glb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzatoreEstrazioni", "VisualizzatoreEstrazioniOnChangeLayout", _e);
    }
  }

  // **********************************************************************
  // Ricerca On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_RICERCA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ricerca On Updating Row Body
      // Corpo Procedura
      // 
      PAN_VISUALESTRAZ.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzatoreEstrazioni", "RicercaOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Par
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void VISUALESTRAZ_PAR124() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PAR124_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI88, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI88, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PAR124_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PAR124_RS, 0, IMDBDef7.TBL_PARAMETRI88, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PAR124_RS, 0, 0, IMDBDef7.TBL_PARAMETRI88, IMDBDef7.FLD_PARAMETRI88_NOMEOGGVALAL, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI88, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI88, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI88, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PAR124_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
    // Stub
  }

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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_RICERCA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RICERCA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RICERCA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RICERCA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RICERCA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_RICERCA);
    // Stub
  }

  private void PAN_RICERCA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_RICERCA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_RICERCA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_RICERCA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RICERCA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VISUALESTRAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VISUALESTRAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VISUALESTRAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VISUALESTRAZ, Cancel);
    // Stub
  }

  private void PAN_VISUALESTRAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VISUALESTRAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VISUALESTRAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE3, IMDBDef17.PQSL_CFESTRASELE3_DATA_INIZIO_VALIDITA, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE3, IMDBDef17.PQSL_CFESTRASELE3_DATA_INIZIO_VALIDITA, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE3, IMDBDef17.PQSL_CFESTRASELE3_STATO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE3, IMDBDef17.PQSL_CFESTRASELE3_STATO, 0, (new IDVariant("S")));
      }
      if (Cancel.isFalse())
      {
        PAN_VISUALESTRAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RICERCA_Init()
  {

    PAN_RICERCA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RICERCA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RICERCA.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_RICERCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, "3FEDFF65-16DC-4E44-9ABC-A70DA43BCA07");
    PAN_RICERCA.set_Header(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, "Visualizza Estrazioni Valide al: ");
    PAN_RICERCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, "");
    PAN_RICERCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, MyGlb.VIS_NORMFIELPADR);
    PAN_RICERCA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RICERCA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RICERCA.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, MyGlb.PANEL_LIST, 56);
    PAN_RICERCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, MyGlb.PANEL_LIST, 1);
    PAN_RICERCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, MyGlb.PANEL_LIST, "Vis. Estr. Val. al");
    PAN_RICERCA.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, MyGlb.PANEL_FORM, 24, 16, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, MyGlb.PANEL_FORM, 184);
    PAN_RICERCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, MyGlb.PANEL_FORM, 1);
    PAN_RICERCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDAAL, MyGlb.PANEL_FORM, "Visualizza Estrazioni Valide al: ");
    PAN_RICERCA.SetFieldPage(PFL_RICERCA_VALIDAAL, -1, -1);
    PAN_RICERCA.SetFieldPanel(PFL_RICERCA_VALIDAAL, PPQRY_PAR124, "A.NOMEOGGVALAL", "NOMEOGGVALAL", 6, 10, 0, -13997);
  }

  private void PAN_RICERCA_InitQueries()
  {
    StringBuffer SQL;

    PAN_RICERCA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RICERCA.SetIMDB(IMDB, "PQRY_PAR124", true);
    PAN_RICERCA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_RICERCA.SetQueryIMDB(PPQRY_PAR124, IMDBDef17.PQRY_PAR124_RS, IMDBDef7.TBL_PARAMETRI88);
    JustLoaded = true;
    PAN_RICERCA.SetFieldPrimaryIndex(PFL_RICERCA_VALIDAAL, IMDBDef7.FLD_PARAMETRI88_NOMEOGGVALAL);
    PAN_RICERCA.SetMasterTable(0, "PARAMETRI88");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RICERCA.Status() == 2)
    {
      int oldListQBE = PAN_RICERCA.iUseListQBE;
      PAN_RICERCA.iUseListQBE = 0;
      PAN_RICERCA.PanelCommand(Glb.PCM_SEARCH);
      PAN_RICERCA.PanelCommand(Glb.PCM_FIND);
      PAN_RICERCA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VISUALESTRAZ_Init()
  {

    PAN_VISUALESTRAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VISUALESTRAZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VISUALESTRAZ.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, "F3D1814C-5CDA-4ACB-B0E3-47B9D3C72EDB");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, "Codice");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, "4DAD4F34-9FA3-493D-89F9-6D90A7C4094F");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, "Categoria");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, "0326EC6F-C9D0-4BF5-AD40-A1292B5DC2D2");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, "Titolo");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, "6B0FE02E-8B48-49A8-B837-CA634DDF8A9C");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, "Descrizione");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, MyGlb.VIS_HTMLNORMFIEL);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, "637824B4-1354-4E3F-9BFE-C41286FFDB8F");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, "Data inizio validità");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, "5BF4C546-3283-41BF-90DA-B1174C230AD0");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, "Data fine validità");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, "7A962B4A-915F-4A76-AF0C-1754DB083650");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, "Tipo");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, "Tipo");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, "87E2863B-059D-4FF5-ABAC-70B4FA10331E");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, "Nome File Export");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, "3373A7F9-F948-4593-8DE1-652A29BCCC43");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, "File Associato");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, MyGlb.VIS_FOREIKEYFIEL);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, "40B84DF2-F9AB-4A36-BD20-3BBF4654D1EF");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, "NOTE");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, "E362AFE9-98CF-4F3B-B156-95022362B585");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, "Sql");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, "024BD9BA-7ADF-43E1-9136-26ACF1C994EF");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, 0, -1);
    PAN_VISUALESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, "8297E56F-D69E-46A3-BA7C-AC69C07B8F56");
    PAN_VISUALESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, "ID");
    PAN_VISUALESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, "");
    PAN_VISUALESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VISUALESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_VISUALESTRAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, MyGlb.PANEL_LIST, 36);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, MyGlb.PANEL_FORM, 4, 752, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_CODICE, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_CODICE, PPQRY_CFESTRASELE3, "A.CODICE", "CODICE", 5, 20, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, MyGlb.PANEL_LIST, 92, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, MyGlb.PANEL_LIST, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, MyGlb.PANEL_FORM, 56, 40, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, MyGlb.PANEL_FORM, 64);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_CATEGORIA, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_CATEGORIA, PPQRY_CFESTRASELE3, "A.CATEGORIA", "CATEGORIA", 5, 50, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, MyGlb.PANEL_LIST, 192, 36, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, MyGlb.PANEL_LIST, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, MyGlb.PANEL_FORM, 80, 96, 712, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, MyGlb.PANEL_FORM, 40);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, MyGlb.PANEL_FORM, 2);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_TITOLO, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_TITOLO, PPQRY_CFESTRASELE3, "A.TITOLO", "TITOLO", 5, 100, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 508, 36, 508, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 44, 136, 748, 104, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 7);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_DESCRIZIONE, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_DESCRIZIONE, PPQRY_CFESTRASELE3, "A.DESCRIZIONE", "DESCRIZIONE", 5, 4000, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, MyGlb.PANEL_LIST, 1016, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, MyGlb.PANEL_LIST, 136);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, MyGlb.PANEL_LIST, "Data inizio validità");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, MyGlb.PANEL_FORM, 4, 12, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, MyGlb.PANEL_FORM, 116);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, MyGlb.PANEL_FORM, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAINIZVALI, MyGlb.PANEL_FORM, "Data inizio validità");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_DATAINIZVALI, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_DATAINIZVALI, PPQRY_CFESTRASELE3, "A.DATA_INIZIO_VALIDITA", "DATA_INIZIO_VALIDITA", 6, 10, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, MyGlb.PANEL_LIST, 1096, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, MyGlb.PANEL_LIST, 124);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, MyGlb.PANEL_LIST, "Data fine validità");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, MyGlb.PANEL_FORM, 324, 12, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, MyGlb.PANEL_FORM, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, MyGlb.PANEL_FORM, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_DATAFINEVALI, MyGlb.PANEL_FORM, "Data fine validità");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_DATAFINEVALI, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_DATAFINEVALI, PPQRY_CFESTRASELE3, "A.DATA_FINE_VALIDITA", "DATA_FINE_VALIDITA", 6, 10, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, MyGlb.PANEL_LIST, 1176, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, MyGlb.PANEL_LIST, 48);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, MyGlb.PANEL_LIST, "Tipo");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, MyGlb.PANEL_FORM, 660, 12, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, MyGlb.PANEL_FORM, 32);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, MyGlb.PANEL_FORM, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_STATO, MyGlb.PANEL_FORM, "Tipo");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_STATO, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_STATO, PPQRY_CFESTRASELE3, "A.STATO", "STATO", 5, 20, 0, -13997);
    PAN_VISUALESTRAZ.SetValueListItem(PFL_VISUALESTRAZ_STATO, (new IDVariant("S")), "Standard", "", "", -1);
    PAN_VISUALESTRAZ.SetValueListItem(PFL_VISUALESTRAZ_STATO, (new IDVariant("P")), "Personalizzata", "", "", -1);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, MyGlb.PANEL_LIST, 168, 396, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, MyGlb.PANEL_LIST, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, MyGlb.PANEL_LIST, "Nome File Export");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, MyGlb.PANEL_FORM, 324, 40, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, MyGlb.PANEL_FORM, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, MyGlb.PANEL_FORM, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOMEFILEEXPO, MyGlb.PANEL_FORM, "Nome File Export");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_NOMEFILEEXPO, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_NOMEFILEEXPO, PPQRY_CFESTRASELE3, "A.NOME_FILE_EXPORT", "NOME_FILE_EXPORT", 5, 100, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, MyGlb.PANEL_LIST, 52);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, MyGlb.PANEL_LIST, "File Associato");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, MyGlb.PANEL_FORM, 32, 68, 760, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, MyGlb.PANEL_FORM, 88);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, MyGlb.PANEL_FORM, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_IDHELP, MyGlb.PANEL_FORM, "File Associato");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_IDHELP, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_IDHELP, PPQRY_CFESTRASELE3, "A.ID_HELP", "ID_HELP", 3, 19, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, MyGlb.PANEL_LIST, 168, 348, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, MyGlb.PANEL_LIST, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, MyGlb.PANEL_LIST, "NOTE");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, MyGlb.PANEL_FORM, 84, 248, 708, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, MyGlb.PANEL_FORM, 36);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_NOTE, MyGlb.PANEL_FORM, "NOTE");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_NOTE, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_NOTE, PPQRY_CFESTRASELE3, "A.NOTE", "NOTE", 5, 4000, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, MyGlb.PANEL_LIST, 168, 300, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, MyGlb.PANEL_LIST, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, MyGlb.PANEL_LIST, 2);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, MyGlb.PANEL_LIST, "Sql");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, MyGlb.PANEL_FORM, 64, 300, 728, 448, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, MyGlb.PANEL_FORM, 56);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, MyGlb.PANEL_FORM, 34);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_SELECTSQL, MyGlb.PANEL_FORM, "Sql");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_SELECTSQL, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_SELECTSQL, PPQRY_CFESTRASELE3, "A.SELECT_SQL", "SELECT_SQL", 9, 9999, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 960, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, MyGlb.PANEL_FORM, 128);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_UTENTEINSERI, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_UTENTEINSERI, PPQRY_CFESTRASELE3, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, MyGlb.PANEL_LIST, 24);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, MyGlb.PANEL_LIST, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, MyGlb.PANEL_LIST, "ID");
    PAN_VISUALESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, MyGlb.PANEL_FORM, 4, 800, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, MyGlb.PANEL_FORM, 24);
    PAN_VISUALESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, MyGlb.PANEL_FORM, 1);
    PAN_VISUALESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALESTRAZ_ID, MyGlb.PANEL_FORM, "ID");
    PAN_VISUALESTRAZ.SetFieldPage(PFL_VISUALESTRAZ_ID, -1, -1);
    PAN_VISUALESTRAZ.SetFieldPanel(PFL_VISUALESTRAZ_ID, PPQRY_CFESTRASELE3, "A.ID", "ID", 3, 19, 0, -13997);
  }

  private void PAN_VISUALESTRAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_VISUALESTRAZ.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CFESTCATSECA, ");
    SQL.append("  A.DESCRIZIONE as CFESTCATSEDE ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_CATEGORIE_SELECT A ");
    SQL.append("where (A.CATEGORIA = ~~CATEGORIA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRCATSEL, 0, SQL, PFL_VISUALESTRAZ_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CFESTCATSECA, ");
    SQL.append("  A.DESCRIZIONE as CFESTCATSEDE ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_CATEGORIE_SELECT A ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRCATSEL, 1, SQL, PFL_VISUALESTRAZ_CATEGORIA, "");
    PAN_VISUALESTRAZ.SetQueryDB(PPQRY_CFESTRCATSEL, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as CFESTHELSEID, ");
    SQL.append("  A.TITOLO as CFESTHELSETI ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_HELP_SELECT A ");
    SQL.append("where (A.ID = ~~ID_HELP~~) ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRHELSEL, 0, SQL, PFL_VISUALESTRAZ_IDHELP, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as CFESTHELSEID, ");
    SQL.append("  A.TITOLO as CFESTHELSETI ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_HELP_SELECT A ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRHELSEL, 1, SQL, PFL_VISUALESTRAZ_IDHELP, "");
    PAN_VISUALESTRAZ.SetQueryDB(PPQRY_CFESTRHELSEL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISUALESTRAZ.SetIMDB(IMDB, "PQRY_CFESTRASELE3", true);
    PAN_VISUALESTRAZ.set_SetString(MyGlb.MASTER_ROWNAME, "CF ESTRAI SELECT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as ID, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.SELECT_SQL as SELECT_SQL, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.DATA_INIZIO_VALIDITA as DATA_INIZIO_VALIDITA, ");
    SQL.append("  A.DATA_FINE_VALIDITA as DATA_FINE_VALIDITA, ");
    SQL.append("  A.NOME_FILE_EXPORT as NOME_FILE_EXPORT, ");
    SQL.append("  A.ID_HELP as ID_HELP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.CODICE as CODICE ");
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRASELE3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_SELECT A ");
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRASELE3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (DECODE(A.DATA_FINE_VALIDITA, to_date(NULL), TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy'), A.DATA_FINE_VALIDITA) >= DECODE(~~TBL_PARAMETRI88.NOMEOGGVALAL~~, to_date(NULL), TO_DATE((31)||'/'||(12)||'/'||(1099),'dd/mm/yyyy'), ~~TBL_PARAMETRI88.NOMEOGGVALAL~~)) ");
    SQL.append("and   (DECODE(A.DATA_INIZIO_VALIDITA, to_date(NULL), TO_DATE((31)||'/'||(12)||'/'||(1099),'dd/mm/yyyy'), A.DATA_INIZIO_VALIDITA) <= DECODE(~~TBL_PARAMETRI88.NOMEOGGVALAL~~, to_date(NULL), TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy'), ~~TBL_PARAMETRI88.NOMEOGGVALAL~~)) ");
    SQL.append("and   (A.IN_USO = 'SI') ");
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRASELE3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRASELE3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRASELE3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISUALESTRAZ.SetQuery(PPQRY_CFESTRASELE3, 5, SQL, -1, "");
    PAN_VISUALESTRAZ.SetQueryDB(PPQRY_CFESTRASELE3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISUALESTRAZ.SetMasterTable(0, "CF_ESTRAI_SELECT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VISUALESTRAZ.Status() == 2)
    {
      int oldListQBE = PAN_VISUALESTRAZ.iUseListQBE;
      PAN_VISUALESTRAZ.iUseListQBE = 0;
      PAN_VISUALESTRAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_VISUALESTRAZ.PanelCommand(Glb.PCM_FIND);
      PAN_VISUALESTRAZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VISUALESTRAZ) PAN_VISUALESTRAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_ValidateRow(Cancel);
    if (SrcObj == PAN_VISUALESTRAZ) PAN_VISUALESTRAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_DynamicProperties();
    if (SrcObj == PAN_VISUALESTRAZ) PAN_VISUALESTRAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VISUALESTRAZ) PAN_VISUALESTRAZ_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISUALESTRAZ) PAN_VISUALESTRAZ_OnChangeLayout(NewLayout, Cancel);
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
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VISUALESTRAZ) PAN_VISUALESTRAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
