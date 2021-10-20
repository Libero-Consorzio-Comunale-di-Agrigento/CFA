// **********************************************
// Selezione Soggetto
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SelezioneSoggetto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI1_IDDOCUMENTO = 0;
  private static int PFL_PARAMETRI1_RAGIOSOCIAFE = 1;
  private static int PFL_PARAMETRI1_ETICLABESOGG = 2;
  private static int PFL_PARAMETRI1_ETILABNONPRE = 3;

  private static int PPQRY_PARAMETRI542 = 0;


  IDPanel PAN_PARAMETRI1;
  private static int PFL_PARAMETRI_ETICHETTAOK = 0;
  private static int PFL_PARAMETRI_ETICHEANNULL = 1;
  private static int PFL_PARAMETRI_RAGIONSOCIAL = 2;
  private static int PFL_PARAMETRI_CODICE = 3;
  private static int PFL_PARAMETRI_CODICEFISCAL = 4;
  private static int PFL_PARAMETRI_PARTITAIVA = 5;
  private static int PFL_PARAMETRI_RESIDENZA = 6;

  private static int PPQRY_PARAMETRI541 = 0;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI544(IMDB);
    //
    //
    Init_PQRY_PARAMETRI541(IMDB);
    Init_PQRY_PARAMETRI542(IMDB);
    Init_PQRY_PARAMETRI542_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI544(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI544, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI544, "TBL_PARAMETRI544");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI544,IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC, "NOMEOGGIDDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI544,IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC,1,30,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI544,IMDBDef2.FLD_PARAMETRI544_NOMOGGRASOFE, "NOMOGGRASOFE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI544,IMDBDef2.FLD_PARAMETRI544_NOMOGGRASOFE,5,255,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI544, 0);
  }

  private static void Init_PQRY_PARAMETRI541(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI541, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI541, "PQRY_PARAMETRI541");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMOGGBERASO, "NOMOGGBERASO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMOGGBERASO,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMEOGGECODI,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMOGGCODFIS, "NOMOGGCODFIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMOGGCODFIS,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMOGGPARIVA, "NOMOGGPARIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMOGGPARIVA,5,11,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMEOGGERESI, "NOMEOGGERESI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI541,IMDBDef10.PQSL_PARAMETRI541_NOMEOGGERESI,5,176,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI541, 0);
  }

  private static void Init_PQRY_PARAMETRI542(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI542, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI542, "PQRY_PARAMETRI542");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI542,IMDBDef10.PQSL_PARAMETRI542_NOMEOGGIDDOC, "NOMEOGGIDDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI542,IMDBDef10.PQSL_PARAMETRI542_NOMEOGGIDDOC,1,30,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI542,IMDBDef10.PQSL_PARAMETRI542_NOMOGGRASOFE, "NOMOGGRASOFE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI542,IMDBDef10.PQSL_PARAMETRI542_NOMOGGRASOFE,5,255,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI542, 0);
  }

  private static void Init_PQRY_PARAMETRI542_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI542_RS, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI542_RS, "PQRY_PARAMETRI542_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI542_RS,IMDBDef10.PQSL_PARAMETRI542_NOMEOGGIDDOC, "NOMEOGGIDDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI542_RS,IMDBDef10.PQSL_PARAMETRI542_NOMEOGGIDDOC,1,30,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI542_RS,IMDBDef10.PQSL_PARAMETRI542_NOMOGGRASOFE, "NOMOGGRASOFE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI542_RS,IMDBDef10.PQSL_PARAMETRI542_NOMOGGRASOFE,5,255,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SelezioneSoggetto(MyWebEntryPoint w, IMDBObj imdb)
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
  public SelezioneSoggetto()
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
    FormIdx = MyGlb.FRM_SELEZISOGGET;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "40DAE41D-648F-4291-BECE-0B29F7325329";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1204;
    DesignHeight = 498;
    set_Caption(new IDVariant("Selezione Soggetto"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1204;
    Frames[1].Height = 472;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.279661;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1204;
    Frames[2].Height = 132;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri 1";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 132;
    PAN_PARAMETRI1 = new IDPanel(w, this, 2, "PAN_PARAMETRI1");
    Frames[2].Content = PAN_PARAMETRI1;
    PAN_PARAMETRI1.Lockable = false;
    PAN_PARAMETRI1.iLocked = false;
    PAN_PARAMETRI1.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI1.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1204-MyGlb.PAN_OFFS_X, 132-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI1.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3718D4C0-4BE8-448F-A41B-36976D75D8ED");
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 128, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI1.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI1.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI1.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI1.InitStatus = 1;
    PAN_PARAMETRI1_Init();
    PAN_PARAMETRI1_InitFields();
    PAN_PARAMETRI1_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1204;
    Frames[3].Height = 340;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Parametri";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 340;
    PAN_PARAMETRI = new IDPanel(w, this, 3, "PAN_PARAMETRI");
    Frames[3].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1204-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B2643930-B1A1-48C3-A07C-B30A8F5E5FF7");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 28, 24, 1096, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI544, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SELEZISOGGET_PARAMETRI542();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_PARAMETRI1.UpdatePanel(MainFrm);
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
    return (obj instanceof SelezioneSoggetto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SelezioneSoggetto.class.getName() : (Glb.ClassWithPackage(SelezioneSoggetto.class) ? SelezioneSoggetto.class.getName().substring(SelezioneSoggetto.class.getPackage().getName().length() + 1) : SelezioneSoggetto.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_PARAMETRI.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMETRI_RAGIONSOCIAL,IMDB.Value(IMDBDef10.PQRY_PARAMETRI541, IMDBDef10.PQSL_PARAMETRI541_NOMOGGBERASO, 0).stringValue()); 
      PAN_PARAMETRI.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMETRI_RESIDENZA,IMDB.Value(IMDBDef10.PQRY_PARAMETRI541, IMDBDef10.PQSL_PARAMETRI541_NOMEOGGERESI, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneSoggetto", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri On Database Error
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Parametri On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneSoggetto", "ParametriOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Etichetta ok
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettaok ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta ok Body
      // Corpo Procedura
      // 
      IDVariant v_SERRORE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("update FE_DOCUMENTALE set ");
      SQL.append("  CODICE_BENEFICIARIO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI541, IMDBDef10.PQSL_PARAMETRI541_NOMEOGGECODI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  RAGIONE_SOCIALE = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI541, IMDBDef10.PQSL_PARAMETRI541_NOMOGGBERASO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
      SQL.append("where (ID_DOCUMENTO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      if (MainFrm.ANAGRACONDIV.equals((new IDVariant("SI")), true))
      {
        MainFrm.Aggiornamentosoggetto(new IDVariant(IMDB.Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC, 0),IDVariant.DECIMAL), v_SERRORE);
        if (v_SERRORE.compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(v_SERRORE); 
          return 0;
        }
      }
      MainFrm.INTERRSOGGET = (new IDVariant("OFF"));
      ((FattureElettroniche)MainFrm.GetForm(MyGlb.FRM_FATTURELETTR,0,true,this)).ControlloQTN();
      if (MainFrm.INTERRSOGGET.equals((new IDVariant("ON")), true))
      {
        ETICHETTAOK_PARAMEDELETE();
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneSoggetto", "Etichettaok", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ETICHETTAOK_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMOGGRASOFE, 0, new IDVariant());
  }

  // **********************************************************************
  // Etichetta Annulla
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaAnnulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Annulla Body
      // Corpo Procedura
      // 
      ETICHEANNULL_PARAMEDELETE();
      MainFrm.INTERRSOGGET = (new IDVariant("OFF"));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneSoggetto", "EtichettaAnnulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ETICHEANNULL_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMOGGRASOFE, 0, new IDVariant());
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
      // PAN_PARAMETRI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      // PAN_PARAMETRI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      // PAN_PARAMETRI.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneSoggetto", "Load", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SELEZISOGGET_PARAMETRI542() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI542_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI544, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI544, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI542_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI542_RS, 0, IMDBDef2.TBL_PARAMETRI544, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI542_RS, 0, 0, IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI542_RS, 1, 0, IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMOGGRASOFE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI544, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI544, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI544, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI542_RS, 0);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMETRI1_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI1, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI1_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI1, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI1_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI1);
    // Stub
  }

  private void PAN_PARAMETRI1_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI1_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI1_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI1_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHETTAOK)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettaok();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHEANNULL)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaAnnulla();
      Cancel.set(IDVariant.TRUE);
    }
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, "6FF5B3B3-10B5-44E8-8C88-751ADEE12CD0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, "Seleziona");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, "18FD9AED-D7D2-48D8-AE7B-341A4EA547DB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, "Annulla");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, "1ADFFB47-F84C-4617-A830-3C9E57D17D8A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, "Soggetti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, "Soggetti");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISDESCR, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, "A7A85422-CC75-42A1-A9FD-C812E4C076FB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, "Codice");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, "Codice del beneficiario");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, "6B449E7B-CC99-4BD2-9623-A859DC44EAFD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, "Codice Fiscale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, "B0C30B84-3217-4AF2-A8B1-3D15D2160818");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, "Partita IVA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, "400FF528-933F-431C-AFD7-1F1EBF43DFC6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, "Residenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, MyGlb.PANEL_LIST, 912, 240, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, MyGlb.PANEL_FORM, 368, 348, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTAOK, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETTAOK, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETTAOK, -1, "", "ETICHETTAOK", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, MyGlb.PANEL_LIST, 1004, 240, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, MyGlb.PANEL_FORM, 468, 344, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEANNULL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHEANNULL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHEANNULL, -1, "", "ETICHEANNULL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 28, 60, 384, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Soggetti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 172, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Soggetti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RAGIONSOCIAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RAGIONSOCIAL, PPQRY_PARAMETRI541, "B.RAGIONE_SOCIALE", "NOMOGGBERASO", 5, 40, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, 412, 60, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, 4, 196, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICE, PPQRY_PARAMETRI541, "B.CODICE", "NOMEOGGECODI", 2, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, MyGlb.PANEL_LIST, 504, 60, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, MyGlb.PANEL_FORM, 4, 196, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICEFISCAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICEFISCAL, PPQRY_PARAMETRI541, "B.CODICE_FISCALE", "NOMOGGCODFIS", 5, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, MyGlb.PANEL_LIST, 620, 60, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, MyGlb.PANEL_LIST, "Partita IVA");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, MyGlb.PANEL_FORM, 4, 196, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTITAIVA, MyGlb.PANEL_FORM, "Partita IVA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTITAIVA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTITAIVA, PPQRY_PARAMETRI541, "B.PARTITA_IVA", "NOMOGGPARIVA", 5, 11, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, MyGlb.PANEL_LIST, 736, 60, 388, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, MyGlb.PANEL_LIST, "Residenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, MyGlb.PANEL_FORM, 4, 196, 516, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, MyGlb.PANEL_FORM, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDENZA, MyGlb.PANEL_FORM, "Residenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RESIDENZA, -1, -1);
    PAN_PARAMETRI.SetFieldUnbound(PFL_PARAMETRI_RESIDENZA, true);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RESIDENZA, PPQRY_PARAMETRI541, "B.INDIRIZZO || ' ' || TO_CHAR ( B.CAP ) || ' ' || C.DENOMINAZIONE", "NOMEOGGERESI", 5, 176, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI541", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.RAGIONE_SOCIALE as NOMOGGBERASO, ");
    SQL.append("  B.CODICE as NOMEOGGECODI, ");
    SQL.append("  B.CODICE_FISCALE as NOMOGGCODFIS, ");
    SQL.append("  B.PARTITA_IVA as NOMOGGPARIVA, ");
    SQL.append("  B.INDIRIZZO || ' ' || TO_CHAR ( B.CAP ) || ' ' || C.DENOMINAZIONE as NOMEOGGERESI ");
    PAN_PARAMETRI.SetQuery(PPQRY_PARAMETRI541, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FE_DOCUMENTALE A, ");
    SQL.append("  BEN B, ");
    SQL.append("  AD4_COMUNI C ");
    PAN_PARAMETRI.SetQuery(PPQRY_PARAMETRI541, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ID_DOCUMENTO = ~~TBL_PARAMETRI544.NOMEOGGIDDOC~~) ");
    SQL.append("and   (B.CODICE_FISCALE = A.CODICE_FISCALE OR B.PARTITA_IVA = SUBSTR(A.PARTITA_IVA, 3, 8000) OR B.PARTITA_IVA_CEE = SUBSTR(A.PARTITA_IVA, 3, 8000)) ");
    SQL.append("and   (B.COMUNE = C.COMUNE(+)) ");
    SQL.append("and   (B.PROVINCIA = C.PROVINCIA_STATO(+)) ");
    SQL.append("and   ((B.D_SCADENZA IS NULL) OR B.D_SCADENZA >= TRUNC( SYSDATE )) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(B.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(B.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(B.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), B.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    PAN_PARAMETRI.SetQuery(PPQRY_PARAMETRI541, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMETRI.SetQuery(PPQRY_PARAMETRI541, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMETRI.SetQuery(PPQRY_PARAMETRI541, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMETRI.SetQuery(PPQRY_PARAMETRI541, 5, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_PARAMETRI541, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(0, "FE_DOCUMENTALE");
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

  private void PAN_PARAMETRI1_Init()
  {

    PAN_PARAMETRI1.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI1.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI1.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMETRI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, "38ECF12A-2C5E-4604-BDA9-54B91F0B20D2");
    PAN_PARAMETRI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, "ID DOCUMENTO");
    PAN_PARAMETRI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, "");
    PAN_PARAMETRI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, "486A8BEB-5E9D-426F-819D-0EC8BE564A71");
    PAN_PARAMETRI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, "Ragione Sociale FE");
    PAN_PARAMETRI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, "");
    PAN_PARAMETRI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, "7E994883-B196-4B11-BAEA-C393ED6C58A9");
    PAN_PARAMETRI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, "Il soggetto");
    PAN_PARAMETRI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, MyGlb.VIS_LABELFIELD);
    PAN_PARAMETRI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, "50A55E83-F3FB-4DAD-9880-2A65B14BB133");
    PAN_PARAMETRI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, "corrisponde a più soggetti in archivio. Selezionare quello corretto");
    PAN_PARAMETRI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, MyGlb.VIS_LABELFIELD);
    PAN_PARAMETRI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI1_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, MyGlb.PANEL_LIST, "ID DOCUMENTO");
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, MyGlb.PANEL_FORM, 4, 4, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_IDDOCUMENTO, MyGlb.PANEL_FORM, "ID DOCUMENTO");
    PAN_PARAMETRI1.SetFieldPage(PFL_PARAMETRI1_IDDOCUMENTO, -1, -1);
    PAN_PARAMETRI1.SetFieldPanel(PFL_PARAMETRI1_IDDOCUMENTO, PPQRY_PARAMETRI542, "A.NOMEOGGIDDOC", "NOMEOGGIDDOC", 1, 30, 0, -13997);
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, MyGlb.PANEL_LIST, 136, 164, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETRI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, MyGlb.PANEL_LIST, 3);
    PAN_PARAMETRI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, MyGlb.PANEL_LIST, "Ragione Sociale FE");
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, MyGlb.PANEL_FORM, 80, 44, 448, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_RAGIOSOCIAFE, MyGlb.PANEL_FORM, "Ragione Sociale FE");
    PAN_PARAMETRI1.SetFieldPage(PFL_PARAMETRI1_RAGIOSOCIAFE, -1, -1);
    PAN_PARAMETRI1.SetFieldPanel(PFL_PARAMETRI1_RAGIOSOCIAFE, PPQRY_PARAMETRI542, "A.NOMOGGRASOFE", "NOMOGGRASOFE", 5, 255, 0, -13997);
    PAN_PARAMETRI1.set_Alignment(PFL_PARAMETRI1_RAGIOSOCIAFE, 2);
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, MyGlb.PANEL_LIST, 32, 16, 288, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, MyGlb.PANEL_FORM, 32, 16, 288, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETICLABESOGG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI1.SetFieldPage(PFL_PARAMETRI1_ETICLABESOGG, -1, -1);
    PAN_PARAMETRI1.SetFieldPanel(PFL_PARAMETRI1_ETICLABESOGG, -1, "", "ETICLABESOGG", 0, 0, 0, -13997);
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, MyGlb.PANEL_LIST, 28, 116, 432, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, MyGlb.PANEL_FORM, 28, 72, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI1_ETILABNONPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI1.SetFieldPage(PFL_PARAMETRI1_ETILABNONPRE, -1, -1);
    PAN_PARAMETRI1.SetFieldPanel(PFL_PARAMETRI1_ETILABNONPRE, -1, "", "ETILABNONPRE", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI1_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI1.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI1.SetIMDB(IMDB, "PQRY_PARAMETRI542", true);
    PAN_PARAMETRI1.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRI1.SetQueryIMDB(PPQRY_PARAMETRI542, IMDBDef10.PQRY_PARAMETRI542_RS, IMDBDef2.TBL_PARAMETRI544);
    JustLoaded = true;
    PAN_PARAMETRI1.SetFieldPrimaryIndex(PFL_PARAMETRI1_IDDOCUMENTO, IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC);
    PAN_PARAMETRI1.SetFieldPrimaryIndex(PFL_PARAMETRI1_RAGIOSOCIAFE, IMDBDef2.FLD_PARAMETRI544_NOMOGGRASOFE);
    PAN_PARAMETRI1.SetMasterTable(0, "PARAMETRI544");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI1.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI1.iUseListQBE;
      PAN_PARAMETRI1.iUseListQBE = 0;
      PAN_PARAMETRI1.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI1.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI1.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI1) PAN_PARAMETRI1_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI1) PAN_PARAMETRI1_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI1) PAN_PARAMETRI1_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI1) PAN_PARAMETRI1_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI1) PAN_PARAMETRI1_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
