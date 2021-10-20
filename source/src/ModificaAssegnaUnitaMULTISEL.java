// **********************************************
// Modifica Assegna Unita MULTISEL
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ModificaAssegnaUnitaMULTISEL extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMDBMODASS_OK = 0;
  private static int PFL_IMDBMODASS_ANNULLA = 1;
  private static int PFL_IMDBMODASS_PROGRUO = 2;
  private static int PFL_IMDBMODASS_MULTISERVIZI = 3;
  private static int PFL_IMDBMODASS_SCELTA = 4;

  private static int PPQRY_TEMPUO = 0;

  private static int PPQRY_SO4ANAUNIORG = 1;


  IDPanel PAN_IMDBMODASS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDBMODASS(IMDB);
    //
    //
    Init_PQRY_TEMPUO(IMDB);
    Init_PQRY_TEMPUO_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDBMODASS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_IMDBMODASS, 12);
    IMDB.set_TblCode(IMDBDef2.TBL_IMDBMODASS, "TBL_IMDBMODASS");
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMEOGGPROUO,1,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMEOGGIDDOC, "NOMEOGGIDDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMEOGGIDDOC,1,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGUNITRO, "NOMOGGUNITRO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGUNITRO,1,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGMESRIC, "NOMOGGMESRIC");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGMESRIC,5,255,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGUODACA, "NOMOGGUODACA");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGUODACA,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMEOGGSEMUL, "NOMEOGGSEMUL");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMEOGGSEMUL,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMEOGGESCEL, "NOMEOGGESCEL");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMEOGGESCEL,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGCUUFAT, "NOMOGGCUUFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGCUUFAT,9,256,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGRIFFAT, "NOMOGGRIFFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGRIFFAT,9,256,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGBDOFAT, "NOMOGGBDOFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGBDOFAT,9,256,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGIMPFAT, "NOMOGGIMPFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGIMPFAT,9,256,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGFIUOSM, "NOMOGGFIUOSM");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBMODASS,IMDBDef2.FLD_IMDBMODASS_NOMOGGFIUOSM,5,50,0);
    IMDB.TblAddNew(IMDBDef2.TBL_IMDBMODASS, 0);
  }

  private static void Init_PQRY_TEMPUO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_TEMPUO, 3);
    IMDB.set_TblCode(IMDBDef10.PQRY_TEMPUO, "PQRY_TEMPUO");
    IMDB.set_FldCode(IMDBDef10.PQRY_TEMPUO,IMDBDef10.PQSL_TEMPUO_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TEMPUO,IMDBDef10.PQSL_TEMPUO_NOMEOGGPROUO,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TEMPUO,IMDBDef10.PQSL_TEMPUO_NOMEOGGSEMUL, "NOMEOGGSEMUL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TEMPUO,IMDBDef10.PQSL_TEMPUO_NOMEOGGSEMUL,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TEMPUO,IMDBDef10.PQSL_TEMPUO_NOMEOGGESCEL, "NOMEOGGESCEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TEMPUO,IMDBDef10.PQSL_TEMPUO_NOMEOGGESCEL,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_TEMPUO, 0);
  }

  private static void Init_PQRY_TEMPUO_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_TEMPUO_RS, 3);
    IMDB.set_TblCode(IMDBDef10.PQRY_TEMPUO_RS, "PQRY_TEMPUO_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_TEMPUO_RS,IMDBDef10.PQSL_TEMPUO_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef10.PQRY_TEMPUO_RS,IMDBDef10.PQSL_TEMPUO_NOMEOGGPROUO,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TEMPUO_RS,IMDBDef10.PQSL_TEMPUO_NOMEOGGSEMUL, "NOMEOGGSEMUL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TEMPUO_RS,IMDBDef10.PQSL_TEMPUO_NOMEOGGSEMUL,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_TEMPUO_RS,IMDBDef10.PQSL_TEMPUO_NOMEOGGESCEL, "NOMEOGGESCEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_TEMPUO_RS,IMDBDef10.PQSL_TEMPUO_NOMEOGGESCEL,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ModificaAssegnaUnitaMULTISEL(MyWebEntryPoint w, IMDBObj imdb)
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
  public ModificaAssegnaUnitaMULTISEL()
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
    FormIdx = MyGlb.FRM_MODASSUNIMUL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9F05D064-36F0-464C-BFBF-ED7C6F0B36AF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 548;
    DesignHeight = 210;
    set_Caption(new IDVariant("Modifica/assegna unita' per accettazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 548;
    Frames[1].Height = 184;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Imdb Mod Ass";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 184;
    PAN_IMDBMODASS = new IDPanel(w, this, 1, "PAN_IMDBMODASS");
    Frames[1].Content = PAN_IMDBMODASS;
    PAN_IMDBMODASS.Lockable = false;
    PAN_IMDBMODASS.iLocked = false;
    PAN_IMDBMODASS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMDBMODASS.VS = MainFrm.VisualStyleList;
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 548-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMDBMODASS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "807948E5-BF42-4410-9823-379887C36657");
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 196, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IMDBMODASS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMDBMODASS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMDBMODASS.InitStatus = 2;
    PAN_IMDBMODASS_Init();
    PAN_IMDBMODASS_InitFields();
    PAN_IMDBMODASS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_IMDBMODASS, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MODASSUNIMUL_TEMPUO();
      }
      PAN_IMDBMODASS.UpdatePanel(MainFrm);
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
    return (obj instanceof ModificaAssegnaUnitaMULTISEL);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ModificaAssegnaUnitaMULTISEL.class.getName() : (Glb.ClassWithPackage(ModificaAssegnaUnitaMULTISEL.class) ? ModificaAssegnaUnitaMULTISEL.class.getName().substring(ModificaAssegnaUnitaMULTISEL.class.getPackage().getName().length() + 1) : ModificaAssegnaUnitaMULTISEL.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Imdb Mod Ass On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number - Input
  // Error Message - Input
  // Native Error Number - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_IMDBMODASS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_IMDBMODASS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Imdb Mod Ass On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ModificaAssegnaUnitaMULTISEL", "ImdbModAssOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Imdb Mod Ass On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMDBMODASS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMDBMODASS);
      // 
      // Imdb Mod Ass On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_TEMPUO, IMDBDef10.PQSL_TEMPUO_NOMEOGGESCEL, 0).equals((new IDVariant("M")), true))
      {
        PAN_IMDBMODASS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMDBMODASS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_IMDBMODASS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMDBMODASS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ModificaAssegnaUnitaMULTISEL", "ImdbModAssOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // OK
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // OK Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_TEMPUORITMUL, IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGPROUO, 0, IDL.NullValue(IMDB.Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGUNITRO, 0),IMDB.Value(IMDBDef10.PQRY_TEMPUO, IMDBDef10.PQSL_TEMPUO_NOMEOGGPROUO, 0)));
      IMDB.set_Value(IMDBDef2.TBL_TEMPUORITMUL, IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGSEMUL, 0, IMDB.Value(IMDBDef10.PQRY_TEMPUO, IMDBDef10.PQSL_TEMPUO_NOMEOGGSEMUL, 0));
      // SQL = new StringBuffer();
      // SQL.append("update FE_DOCUMENTALE set ");
      // SQL.append("  PROGR_UO = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGSEMUL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'SI', to_number(NULL), " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGUNITRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), ");
      // SQL.append("  MULTISERVIZI = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGSEMUL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
      // SQL.append("  PARERE = NULL ");
      // SQL.append("where (ID_DOCUMENTO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGIDDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      // MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      // MainFrm.Cf4armDBObject.INDEFEPASSIVAFENOTIFICACAMBIOUO(IMDB.Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGIDDOC, 0), IDL.ToString(IMDB.Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGUNITRO, 0)), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      // MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFENOTIFICAFAT(IMDB.Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGIDDOC, 0), (new IDVariant("DOD")), (new IDVariant()), IMDB.Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGUNITRO, 0), (new IDVariant("E' stata assegnata una fattura elettronica da esaminare: ")));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ModificaAssegnaUnitaMULTISEL", "OK", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_TEMPUORITMUL, IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGPROUO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_TEMPUORITMUL, IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGSEMUL, 0, (new IDVariant()));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ModificaAssegnaUnitaMULTISEL", "Annulla", _e);
      return -1;
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
      UNLOAD_IMDMODASSDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ModificaAssegnaUnitaMULTISEL", "Unload", _e);
    }
  }

  // **********************************************************************
  // Imdb Mod Ass: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDMODASSDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGPROUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGIDDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGUNITRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGMESRIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGUODACA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGSEMUL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGESCEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGCUUFAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGRIFFAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGBDOFAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGIMPFAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGFIUOSM, 0, new IDVariant());
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
      IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGESCEL, 0, (new IDVariant("M")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ModificaAssegnaUnitaMULTISEL", "Load", _e);
    }
  }

  // **********************************************************************
  // Temp Uo
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void MODASSUNIMUL_TEMPUO() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_TEMPUO_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_IMDBMODASS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_IMDBMODASS, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_TEMPUO_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_TEMPUO_RS, 0, IMDBDef2.TBL_IMDBMODASS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TEMPUO_RS, 0, 0, IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGPROUO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TEMPUO_RS, 1, 0, IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGSEMUL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_TEMPUO_RS, 2, 0, IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMEOGGESCEL, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_IMDBMODASS, 0);
      if (IMDB.Eof(IMDBDef2.TBL_IMDBMODASS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_IMDBMODASS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_TEMPUO_RS, 0);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMDBMODASS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMDBMODASS, Cancel);
    // Stub
  }

  private void PAN_IMDBMODASS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMDBMODASS_OK)
    {
      this.IdxPanelActived = this.PAN_IMDBMODASS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OK();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMDBMODASS_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_IMDBMODASS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMDBMODASS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMDBMODASS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMDBMODASS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMDBMODASS_Init()
  {

    PAN_IMDBMODASS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMDBMODASS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMDBMODASS.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_IMDBMODASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, "CF67B00E-4179-49D2-97A0-4B898B972D31");
    PAN_IMDBMODASS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, "Ok");
    PAN_IMDBMODASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, MyGlb.VIS_STATICBUTTON);
    PAN_IMDBMODASS.SetImage(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, 0, "button1.gif", false);
    PAN_IMDBMODASS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_IMDBMODASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, "FC86F284-FF4E-478D-BD96-09F223A41110");
    PAN_IMDBMODASS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, "Annulla");
    PAN_IMDBMODASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_IMDBMODASS.SetImage(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, 0, "button1.gif", false);
    PAN_IMDBMODASS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_IMDBMODASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, "F69A9D1A-888E-4B92-85EB-D488058EA755");
    PAN_IMDBMODASS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, "Unità");
    PAN_IMDBMODASS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, "");
    PAN_IMDBMODASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMDBMODASS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMDBMODASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, "4B59F486-E717-489E-8C12-AB7ED98ED492");
    PAN_IMDBMODASS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, "Multiservizi");
    PAN_IMDBMODASS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, "");
    PAN_IMDBMODASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, MyGlb.VIS_CHECKSTYLE);
    PAN_IMDBMODASS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMDBMODASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, "C1A653F8-3FF3-49F1-A02C-A1E6D09B0841");
    PAN_IMDBMODASS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, "Scelta");
    PAN_IMDBMODASS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, "");
    PAN_IMDBMODASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, MyGlb.VIS_NORMFIELPADR);
    PAN_IMDBMODASS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMDBMODASS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, MyGlb.PANEL_LIST, 308, 312, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, MyGlb.PANEL_LIST, 0);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, MyGlb.PANEL_LIST, 1);
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, MyGlb.PANEL_FORM, 268, 116, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, MyGlb.PANEL_FORM, 0);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_OK, MyGlb.PANEL_FORM, 1);
    PAN_IMDBMODASS.SetFieldPage(PFL_IMDBMODASS_OK, -1, -1);
    PAN_IMDBMODASS.SetFieldPanel(PFL_IMDBMODASS_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, MyGlb.PANEL_LIST, 316, 320, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, MyGlb.PANEL_FORM, 360, 116, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_IMDBMODASS.SetFieldPage(PFL_IMDBMODASS_ANNULLA, -1, -1);
    PAN_IMDBMODASS.SetFieldPanel(PFL_IMDBMODASS_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, MyGlb.PANEL_LIST, 68);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_IMDBMODASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, MyGlb.PANEL_LIST, "Unità");
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, MyGlb.PANEL_FORM, 48, 44, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, MyGlb.PANEL_FORM, 80);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_IMDBMODASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_PROGRUO, MyGlb.PANEL_FORM, "Unità");
    PAN_IMDBMODASS.SetFieldPage(PFL_IMDBMODASS_PROGRUO, -1, -1);
    PAN_IMDBMODASS.SetFieldPanel(PFL_IMDBMODASS_PROGRUO, PPQRY_TEMPUO, "A.NOMEOGGPROUO", "NOMEOGGPROUO", 1, 19, 0, -13997);
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, MyGlb.PANEL_LIST, 108);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, MyGlb.PANEL_LIST, 1);
    PAN_IMDBMODASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, MyGlb.PANEL_LIST, "Multiservizi");
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, MyGlb.PANEL_FORM, 20, 68, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, MyGlb.PANEL_FORM, 108);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, MyGlb.PANEL_FORM, 1);
    PAN_IMDBMODASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_MULTISERVIZI, MyGlb.PANEL_FORM, "Multiservizi");
    PAN_IMDBMODASS.SetFieldPage(PFL_IMDBMODASS_MULTISERVIZI, -1, -1);
    PAN_IMDBMODASS.SetFieldPanel(PFL_IMDBMODASS_MULTISERVIZI, PPQRY_TEMPUO, "A.NOMEOGGSEMUL", "NOMEOGGSEMUL", 5, 2, 0, -13997);
    PAN_IMDBMODASS.SetValueListItem(PFL_IMDBMODASS_MULTISERVIZI, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_IMDBMODASS.SetValueListItem(PFL_IMDBMODASS_MULTISERVIZI, (new IDVariant()), "Null", "", "", -1);
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, MyGlb.PANEL_LIST, 44);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, MyGlb.PANEL_LIST, 1);
    PAN_IMDBMODASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, MyGlb.PANEL_LIST, "Scelta");
    PAN_IMDBMODASS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, MyGlb.PANEL_FORM, 4, 344, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBMODASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, MyGlb.PANEL_FORM, 44);
    PAN_IMDBMODASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, MyGlb.PANEL_FORM, 1);
    PAN_IMDBMODASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBMODASS_SCELTA, MyGlb.PANEL_FORM, "Scelta");
    PAN_IMDBMODASS.SetFieldPage(PFL_IMDBMODASS_SCELTA, -1, -1);
    PAN_IMDBMODASS.SetFieldPanel(PFL_IMDBMODASS_SCELTA, PPQRY_TEMPUO, "A.NOMEOGGESCEL", "NOMEOGGESCEL", 5, 2, 0, -13997);
    PAN_IMDBMODASS.SetValueListItem(PFL_IMDBMODASS_SCELTA, (new IDVariant("M")), "Scelta Manuale", "", "", -1);
    PAN_IMDBMODASS.SetValueListItem(PFL_IMDBMODASS_SCELTA, (new IDVariant("A")), "Scelta Automatica", "", "", -1);
  }

  private void PAN_IMDBMODASS_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMDBMODASS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNOCUPUO, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as SO4ANAUNORCO, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= TRUNC( SYSDATE )) ");
    SQL.append("and   ((~~TBL_IMDBMODASS.NOMOGGFIUOSM~~ IS NULL)) ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  SO4UO.PROGR_UNITA_ORGANIZZATIVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE SO4UO ");
    SQL.append("where (SO4UO.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (SO4UO.DAL <= TRUNC( SYSDATE ) AND ((SO4UO.AL IS NULL) OR SO4UO.AL >= TRUNC( SYSDATE ))) ");
    SQL.append(")) ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  FAT_SMISTAMENTO B ");
    SQL.append("where (B.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (B.METODO = ~~TBL_IMDBMODASS.NOMOGGFIUOSM~~) ");
    SQL.append("and   (~~TBL_IMDBMODASS.NOMOGGFIUOSM~~ IN ('CUU', 'RIF')) ");
    SQL.append("and   (B.CHIAVE = DECODE(~~TBL_IMDBMODASS.NOMOGGFIUOSM~~, 'CUU', ~~TBL_IMDBMODASS.NOMOGGCUUFAT~~, ~~TBL_IMDBMODASS.NOMOGGRIFFAT~~)) ");
    SQL.append("and   (B.PREVALENTE = 'SI' OR ((B.PREVALENTE IS NULL) AND NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  FAT_SMISTAMENTO C ");
    SQL.append("where (C.CHIAVE = B.CHIAVE) ");
    SQL.append("and   (C.METODO = B.METODO) ");
    SQL.append("and   (C.PREVALENTE = 'SI') ");
    SQL.append("))))) ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  D.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(D.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(D.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  IMP D ");
    SQL.append("where (D.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (~~TBL_IMDBMODASS.NOMOGGFIUOSM~~ = 'IMP') ");
    SQL.append("and   (TO_CHAR ( D.NUMERO_IMP ) || '/' || TO_CHAR ( D.ANNO_IMP ) = ~~TBL_IMDBMODASS.NOMOGGIMPFAT~~) ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  E.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(E.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(E.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  BUONI E ");
    SQL.append("where (E.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (~~TBL_IMDBMODASS.NOMOGGFIUOSM~~ = 'BDO') ");
    SQL.append("and   (INSTR(~~TBL_IMDBMODASS.NOMOGGBDOFAT~~, TO_CHAR ( E.NUMERO_BUONO ) || '/' || TO_CHAR ( E.ANNO_BUONO )) > 0 OR INSTR(~~TBL_IMDBMODASS.NOMOGGBDOFAT~~, E.CODICE_MEPA) > 0) ");
    SQL.append("order by 3, 2 ");
    PAN_IMDBMODASS.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, PFL_IMDBMODASS_PROGRUO, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNOCUPUO, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as SO4ANAUNORCO, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= TRUNC( SYSDATE )) ");
    SQL.append("and   ((~~TBL_IMDBMODASS.NOMOGGFIUOSM~~ IS NULL)) ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  SO4UO.PROGR_UNITA_ORGANIZZATIVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE SO4UO ");
    SQL.append("where (SO4UO.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (SO4UO.DAL <= TRUNC( SYSDATE ) AND ((SO4UO.AL IS NULL) OR SO4UO.AL >= TRUNC( SYSDATE ))) ");
    SQL.append(")) ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  FAT_SMISTAMENTO B ");
    SQL.append("where (B.METODO = ~~TBL_IMDBMODASS.NOMOGGFIUOSM~~) ");
    SQL.append("and   (~~TBL_IMDBMODASS.NOMOGGFIUOSM~~ IN ('CUU', 'RIF')) ");
    SQL.append("and   (B.CHIAVE = DECODE(~~TBL_IMDBMODASS.NOMOGGFIUOSM~~, 'CUU', ~~TBL_IMDBMODASS.NOMOGGCUUFAT~~, ~~TBL_IMDBMODASS.NOMOGGRIFFAT~~)) ");
    SQL.append("and   (B.PREVALENTE = 'SI' OR ((B.PREVALENTE IS NULL) AND NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  FAT_SMISTAMENTO C ");
    SQL.append("where (C.CHIAVE = B.CHIAVE) ");
    SQL.append("and   (C.METODO = B.METODO) ");
    SQL.append("and   (C.PREVALENTE = 'SI') ");
    SQL.append("))))) ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  D.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(D.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(D.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  IMP D ");
    SQL.append("where (~~TBL_IMDBMODASS.NOMOGGFIUOSM~~ = 'IMP') ");
    SQL.append("and   (TO_CHAR ( D.NUMERO_IMP ) || '/' || TO_CHAR ( D.ANNO_IMP ) = ~~TBL_IMDBMODASS.NOMOGGIMPFAT~~) ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  E.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(E.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(E.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  BUONI E ");
    SQL.append("where (~~TBL_IMDBMODASS.NOMOGGFIUOSM~~ = 'BDO') ");
    SQL.append("and   (INSTR(~~TBL_IMDBMODASS.NOMOGGBDOFAT~~, TO_CHAR ( E.NUMERO_BUONO ) || '/' || TO_CHAR ( E.ANNO_BUONO )) > 0 OR INSTR(~~TBL_IMDBMODASS.NOMOGGBDOFAT~~, E.CODICE_MEPA) > 0) ");
    SQL.append("order by 3, 2 ");
    PAN_IMDBMODASS.SetQuery(PPQRY_SO4ANAUNIORG, 1, SQL, PFL_IMDBMODASS_PROGRUO, "");
    PAN_IMDBMODASS.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMDBMODASS.SetQueryHeaderColumn(PPQRY_SO4ANAUNIORG, "SO4ANAUNORCO", "Codice");
    PAN_IMDBMODASS.SetQueryVisibleColumn(PPQRY_SO4ANAUNIORG, "SO4ANAUNORCO");
    PAN_IMDBMODASS.SetQueryHeaderColumn(PPQRY_SO4ANAUNIORG, "DESCRIZIONE", "Descrizione");
    PAN_IMDBMODASS.SetQueryVisibleColumn(PPQRY_SO4ANAUNIORG, "DESCRIZIONE");
    PAN_IMDBMODASS.SetIMDB(IMDB, "PQRY_TEMPUO", true);
    PAN_IMDBMODASS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_IMDBMODASS.SetQueryIMDB(PPQRY_TEMPUO, IMDBDef10.PQRY_TEMPUO_RS, IMDBDef2.TBL_IMDBMODASS);
    JustLoaded = true;
    PAN_IMDBMODASS.SetFieldPrimaryIndex(PFL_IMDBMODASS_PROGRUO, IMDBDef2.FLD_IMDBMODASS_NOMEOGGPROUO);
    PAN_IMDBMODASS.SetFieldPrimaryIndex(PFL_IMDBMODASS_MULTISERVIZI, IMDBDef2.FLD_IMDBMODASS_NOMEOGGSEMUL);
    PAN_IMDBMODASS.SetFieldPrimaryIndex(PFL_IMDBMODASS_SCELTA, IMDBDef2.FLD_IMDBMODASS_NOMEOGGESCEL);
    PAN_IMDBMODASS.SetMasterTable(0, "IMDBMODASS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMDBMODASS.Status() == 2)
    {
      int oldListQBE = PAN_IMDBMODASS.iUseListQBE;
      PAN_IMDBMODASS.iUseListQBE = 0;
      PAN_IMDBMODASS.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMDBMODASS.PanelCommand(Glb.PCM_FIND);
      PAN_IMDBMODASS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMDBMODASS) PAN_IMDBMODASS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMDBMODASS) PAN_IMDBMODASS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMDBMODASS) PAN_IMDBMODASS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMDBMODASS) PAN_IMDBMODASS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMDBMODASS) PAN_IMDBMODASS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
