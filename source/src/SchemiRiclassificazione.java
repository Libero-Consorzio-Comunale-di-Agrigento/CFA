// **********************************************
// Schemi Riclassificazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchemiRiclassificazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_TIPORICLASSI = 0;

  private static int PPQRY_PARS18 = 0;

  private static int PPQRY_TIPIRICLASSI = 1;


  IDPanel PAN_PARS;
  private static int GRP_SCHEMIRICLAS_INSERIMENTO = 0;
  private static int GRP_SCHEMIRICLAS_AGGIORNAMENT = 1;

  private static int PFL_SCHEMIRICLAS_PARTE = 0;
  private static int PFL_SCHEMIRICLAS_SCHEMARICLID = 1;
  private static int PFL_SCHEMIRICLAS_LIVELLO = 2;
  private static int PFL_SCHEMIRICLAS_DESCRIZIONE = 3;
  private static int PFL_SCHEMIRICLAS_DESCRILIVELL = 4;
  private static int PFL_SCHEMIRICLAS_FORMATO = 5;
  private static int PFL_SCHEMIRICLAS_UTENTE1 = 6;
  private static int PFL_SCHEMIRICLAS_DATA1 = 7;
  private static int PFL_SCHEMIRICLAS_UTENTE = 8;
  private static int PFL_SCHEMIRICLAS_DATA = 9;
  private static int PFL_SCHEMIRICLAS_TIPORICLID = 10;

  private static int PPQRY_SCHEMARICLAS = 0;

  private static int PPQRY_DUAL1 = 1;
  private static int PPQRY_DUAL = 2;


  IDPanel PAN_SCHEMIRICLAS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS19(IMDB);
    //
    //
    Init_PQRY_PARS18(IMDB);
    Init_PQRY_PARS18_RS(IMDB);
    Init_PQRY_SCHEMARICLAS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARS19, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARS19, "TBL_PARS19");
    IMDB.set_FldCode(IMDBDef1.TBL_PARS19,IMDBDef1.FLD_PARS19_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS19,IMDBDef1.FLD_PARS19_NOMOGGTIPRIC,1,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARS19, 0);
  }

  private static void Init_PQRY_PARS18(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARS18, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARS18, "PQRY_PARS18");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARS18,IMDBDef8.PQSL_PARS18_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARS18,IMDBDef8.PQSL_PARS18_NOMOGGTIPRIC,1,10,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PARS18, 0);
  }

  private static void Init_PQRY_PARS18_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARS18_RS, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARS18_RS, "PQRY_PARS18_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARS18_RS,IMDBDef8.PQSL_PARS18_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARS18_RS,IMDBDef8.PQSL_PARS18_NOMOGGTIPRIC,1,10,0);
  }

  private static void Init_PQRY_SCHEMARICLAS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_SCHEMARICLAS, 11);
    IMDB.set_TblCode(IMDBDef8.PQRY_SCHEMARICLAS, "PQRY_SCHEMARICLAS");
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_SCHEMA_RICL_ID, "SCHEMA_RICL_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_SCHEMA_RICL_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_LIVELLO, "LIVELLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_LIVELLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_DESCRIZIONE_LIVELLO, "DESCRIZIONE_LIVELLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_DESCRIZIONE_LIVELLO,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_TIPO_RICL_ID, "TIPO_RICL_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_TIPO_RICL_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_FORMATO, "FORMATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_SCHEMARICLAS,IMDBDef8.PQSL_SCHEMARICLAS_FORMATO,1,1,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_SCHEMARICLAS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchemiRiclassificazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchemiRiclassificazione()
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
    FormIdx = MyGlb.FRM_SCHEMIRICLAS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F5ADF19C-5913-4CC8-9330-1A0B2BDBD834";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 724;
    DesignHeight = 514;
    set_Caption(new IDVariant("Schemi Riclassificazione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 724;
    Frames[1].Height = 488;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.131148;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 724;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 724-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2B947F06-76CE-4D29-B630-736B7685D83F");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 48, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 724;
    Frames[3].Height = 424;
    Frames[3].Caption = "Schemi Riclassificazione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 424;
    PAN_SCHEMIRICLAS = new IDPanel(w, this, 3, "PAN_SCHEMIRICLAS");
    Frames[3].Content = PAN_SCHEMIRICLAS;
    PAN_SCHEMIRICLAS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCHEMIRICLAS.VS = MainFrm.VisualStyleList;
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 724-MyGlb.PAN_OFFS_X, 424-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2782A867-0753-4940-9DC3-FD6B7DFF519A");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 644, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCHEMIRICLAS.InitStatus = 2;
    PAN_SCHEMIRICLAS_Init();
    PAN_SCHEMIRICLAS_InitFields();
    PAN_SCHEMIRICLAS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARS19, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCHEMIRICLAS_PARS18();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_SCHEMIRICLAS.UpdatePanel(MainFrm);
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
    return (obj instanceof SchemiRiclassificazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchemiRiclassificazione.class.getName() : (Glb.ClassWithPackage(SchemiRiclassificazione.class) ? SchemiRiclassificazione.class.getName().substring(SchemiRiclassificazione.class.getPackage().getName().length() + 1) : SchemiRiclassificazione.class.getName()));
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
      IMDB.set_Value(IMDBDef1.TBL_PARS19, IMDBDef1.FLD_PARS19_NOMOGGTIPRIC, 0, (new IDVariant()));
      PAN_SCHEMIRICLAS.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemiRiclassificazione", "Load", _e);
    }
  }

  // **********************************************************************
  // Schemi Riclassificazione Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_SCHEMIRICLAS_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schemi Riclassificazione Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_TIPO_RICL_ID, 0, new IDVariant(IMDB.Value(IMDBDef8.PQRY_PARS18, IMDBDef8.PQSL_PARS18_NOMOGGTIPRIC, 0),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemiRiclassificazione", "SchemiRiclassificazioneBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Schemi Riclassificazione Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_SCHEMIRICLAS_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schemi Riclassificazione Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_DATA_INSERIMENTO, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemiRiclassificazione", "SchemiRiclassificazioneBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Schemi Riclassificazione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCHEMIRICLAS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCHEMIRICLAS);
      // 
      // Schemi Riclassificazione On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(PAN_SCHEMIRICLAS.IsNewRow()))
      {
        PAN_SCHEMIRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SCHEMIRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SCHEMIRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SCHEMIRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_LIVELLO, 0).compareTo((new IDVariant(0)), true)!=0)
      {
        PAN_SCHEMIRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SCHEMIRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemiRiclassificazione", "SchemiRiclassificazioneOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Schemi Riclassificazione After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_SCHEMIRICLAS_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schemi Riclassificazione After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_SCHEMIRICLAS.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemiRiclassificazione", "SchemiRiclassificazioneAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Schemi Riclassificazione On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_SCHEMIRICLAS_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schemi Riclassificazione On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(256)), true))
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemiRiclassificazione", "SchemiRiclassificazioneOnCommand", _e);
    }
  }

  // **********************************************************************
  // Schemi Riclassificazione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_SCHEMIRICLAS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schemi Riclassificazione On Updating Row Body
      // Corpo Procedura
      // 
      if (PAN_SCHEMIRICLAS.IsNewRow())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_SCHEMA_RICL_ID, 0))))
        {
          IMDB.set_Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_SCHEMA_RICL_ID, 0, (new IDVariant()));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_UTENTE_ULTIMO_AGG, 0))))
        {
          IMDB.set_Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef8.PQRY_SCHEMARICLAS, IMDBDef8.PQSL_SCHEMARICLAS_DATA_ULTIMO_AGG, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemiRiclassificazione", "SchemiRiclassificazioneOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCHEMIRICLAS_PARS18() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_PARS18_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARS19, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARS19, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_PARS18_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_PARS18_RS, 0, IMDBDef1.TBL_PARS19, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARS18_RS, 0, 0, IMDBDef1.TBL_PARS19, IMDBDef1.FLD_PARS19_NOMOGGTIPRIC, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARS19, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARS19, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARS19, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_PARS18_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SCHEMIRICLAS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCHEMIRICLAS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCHEMIRICLAS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCHEMIRICLAS, Cancel);
    // Stub
  }

  private void PAN_SCHEMIRICLAS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCHEMIRICLAS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_SCHEMIRICLAS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_SCHEMIRICLAS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCHEMIRICLAS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, "EC47197E-AD28-436D-A6E8-783499A9C165");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, "Tipo Riclassificazione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_LIST, 128);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_LIST, "Tp. Riclass.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_FORM, 4, 12, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_FORM, 144);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_FORM, "Tipo Riclassificazione");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPORICLASSI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPORICLASSI, PPQRY_PARS18, "A.NOMOGGTIPRIC", "NOMOGGTIPRIC", 1, 10, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as TIPRICTIRIID, ");
    SQL.append("  A.CODICE as TIPIRICLCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIRICLDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    SQL.append("where (A.TIPO_RICL_ID = ~~NOMOGGTIPRIC~~) ");
    SQL.append("and   ((A.ESERCIZIO_SCADENZA IS NULL) OR A.ESERCIZIO_SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_TIPIRICLASSI, 0, SQL, PFL_PARS_TIPORICLASSI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as TIPRICTIRIID, ");
    SQL.append("  A.CODICE as TIPIRICLCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIRICLDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    SQL.append("where ((A.ESERCIZIO_SCADENZA IS NULL) OR A.ESERCIZIO_SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_TIPIRICLASSI, 1, SQL, PFL_PARS_TIPORICLASSI, "");
    PAN_PARS.SetQueryDB(PPQRY_TIPIRICLASSI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS18", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS18, IMDBDef8.PQRY_PARS18_RS, IMDBDef1.TBL_PARS19);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TIPORICLASSI, IMDBDef1.FLD_PARS19_NOMOGGTIPRIC);
    PAN_PARS.SetMasterTable(0, "PARS19");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SCHEMIRICLAS_Init()
  {

    PAN_SCHEMIRICLAS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCHEMIRICLAS.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, "EB2F2667-F5B7-45C1-8009-CF6EAB2152EA");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, "Inserimento");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, MyGlb.PANEL_LIST, 0, 255, 320, 49, 0, 0);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, MyGlb.PANEL_FORM, 0, 75, 236, 73, 0, 0);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, 0, 70);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, 1, 13);
    PAN_SCHEMIRICLAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, 0, 4);
    PAN_SCHEMIRICLAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, 1, 4);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, "AC902BC9-0174-4A76-9FA7-6FBFBC84A681");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, "Aggiornamento");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, MyGlb.PANEL_LIST, 344, 255, 304, 49, 0, 0);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, MyGlb.PANEL_FORM, 0, 123, 232, 73, 0, 0);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, 0, 88);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, 1, 13);
    PAN_SCHEMIRICLAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, 0, 4);
    PAN_SCHEMIRICLAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, 1, 4);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_GROUP, GRP_SCHEMIRICLAS_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCHEMIRICLAS.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, "52634114-8639-4CB8-AF15-254D9960ECA9");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, "Parte");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, "ED236E2C-B195-483F-B520-317022A6171A");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, "SCHEMA RICL ID");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, "478353BE-2576-4715-BCB3-CF12ED45C2CE");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, "Livello");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, "8359D5AF-8562-4E41-8486-17653F644458");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, "Descrizione");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, "EF96F821-EC80-4B15-BF32-9CD26204556E");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, "Descrizione Livello");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, "FDD80749-332B-44C6-BD08-014C68120A3E");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, "Formato");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, "0A68D21F-9745-4C6F-B880-FE0BD00B2A98");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, "Utente");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, "5CDF8899-1140-48CF-A8B2-51388235E773");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, "Data");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, "4BA37DF3-6A04-4556-8B61-B0A4BF7F7EE0");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, "Utente ");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, "3A003019-5D93-4A5F-9B61-1F5800177A87");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, "Data ");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEMIRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, "B463346E-7CAB-484D-B87A-C48A06C231FF");
    PAN_SCHEMIRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, "TIPO RICL ID");
    PAN_SCHEMIRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, "");
    PAN_SCHEMIRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCHEMIRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, 0, -1);
  }

  private void PAN_SCHEMIRICLAS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, MyGlb.PANEL_LIST, 24);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, MyGlb.PANEL_FORM, 4, 4, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, MyGlb.PANEL_FORM, 24);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_PARTE, MyGlb.PANEL_FORM, "Pr.");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_PARTE, -1, -1);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_PARTE, PPQRY_SCHEMARICLAS, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_SCHEMIRICLAS.SetValueListItem(PFL_SCHEMIRICLAS_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_SCHEMIRICLAS.SetValueListItem(PFL_SCHEMIRICLAS_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, MyGlb.PANEL_LIST, 100);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, MyGlb.PANEL_LIST, "SCHEMA RICL ID");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, MyGlb.PANEL_FORM, 4, 28, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, MyGlb.PANEL_FORM, 100);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_SCHEMARICLID, MyGlb.PANEL_FORM, "SCHEMA RICL ID");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_SCHEMARICLID, -1, -1);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_SCHEMARICLID, PPQRY_SCHEMARICLAS, "A.SCHEMA_RICL_ID", "SCHEMA_RICL_ID", 3, 10, 0, -13997);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, MyGlb.PANEL_LIST, 64, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, MyGlb.PANEL_LIST, 52);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, MyGlb.PANEL_LIST, "Livello");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, MyGlb.PANEL_FORM, 4, 28, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, MyGlb.PANEL_FORM, 52);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_LIVELLO, MyGlb.PANEL_FORM, "Livello");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_LIVELLO, -1, -1);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_LIVELLO, PPQRY_SCHEMARICLAS, "A.LIVELLO", "LIVELLO", 1, 2, 0, -13997);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, MyGlb.PANEL_LIST, 116, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_DESCRIZIONE, -1, -1);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_DESCRIZIONE, PPQRY_SCHEMARICLAS, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, MyGlb.PANEL_LIST, 324, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, MyGlb.PANEL_LIST, 132);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, MyGlb.PANEL_LIST, "Descrizione Livello");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, MyGlb.PANEL_FORM, 4, 76, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, MyGlb.PANEL_FORM, 132);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DESCRILIVELL, MyGlb.PANEL_FORM, "Descrizione Livello");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_DESCRILIVELL, -1, -1);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_DESCRILIVELL, PPQRY_SCHEMARICLAS, "A.DESCRIZIONE_LIVELLO", "DESCRIZIONE_LIVELLO", 5, 40, 0, -13997);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, MyGlb.PANEL_LIST, 588, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, MyGlb.PANEL_LIST, 64);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, MyGlb.PANEL_LIST, "Formato");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, MyGlb.PANEL_FORM, 4, 196, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, MyGlb.PANEL_FORM, 64);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_FORMATO, MyGlb.PANEL_FORM, "Formato");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_FORMATO, -1, -1);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_FORMATO, PPQRY_SCHEMARICLAS, "A.FORMATO", "FORMATO", 1, 1, 0, -13997);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, MyGlb.PANEL_LIST, 4, 280, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, MyGlb.PANEL_LIST, 52);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, MyGlb.PANEL_FORM, 4, 100, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, MyGlb.PANEL_FORM, 128);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_UTENTE1, -1, GRP_SCHEMIRICLAS_INSERIMENTO);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_UTENTE1, PPQRY_SCHEMARICLAS, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, MyGlb.PANEL_LIST, 200, 280, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, MyGlb.PANEL_LIST, 48);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, MyGlb.PANEL_FORM, 4, 124, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, MyGlb.PANEL_FORM, 120);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_DATA1, -1, GRP_SCHEMIRICLAS_INSERIMENTO);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_DATA1, PPQRY_SCHEMARICLAS, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, MyGlb.PANEL_LIST, 348, 280, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, MyGlb.PANEL_LIST, 52);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, MyGlb.PANEL_LIST, "Utente ");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, MyGlb.PANEL_FORM, 124);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_UTENTE, MyGlb.PANEL_FORM, "Utente ");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_UTENTE, -1, GRP_SCHEMIRICLAS_AGGIORNAMENT);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_UTENTE, PPQRY_SCHEMARICLAS, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, MyGlb.PANEL_LIST, 536, 280, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, MyGlb.PANEL_LIST, 40);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, MyGlb.PANEL_LIST, "Data ");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, MyGlb.PANEL_FORM, 4, 172, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, MyGlb.PANEL_FORM, 116);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_DATA, MyGlb.PANEL_FORM, "Data ");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_DATA, -1, GRP_SCHEMIRICLAS_AGGIORNAMENT);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_DATA, PPQRY_SCHEMARICLAS, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, MyGlb.PANEL_LIST, 532, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, MyGlb.PANEL_LIST, 80);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, MyGlb.PANEL_LIST, "TIPO RICL ID");
    PAN_SCHEMIRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, MyGlb.PANEL_FORM, 80);
    PAN_SCHEMIRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIRICLAS_TIPORICLID, MyGlb.PANEL_FORM, "TIPO RICL ID");
    PAN_SCHEMIRICLAS.SetFieldPage(PFL_SCHEMIRICLAS_TIPORICLID, -1, -1);
    PAN_SCHEMIRICLAS.SetFieldPanel(PFL_SCHEMIRICLAS_TIPORICLID, PPQRY_SCHEMARICLAS, "A.TIPO_RICL_ID", "TIPO_RICL_ID", 3, 10, 0, -13997);
  }

  private void PAN_SCHEMIRICLAS_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCHEMIRICLAS.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_SCHEMIRICLAS_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_SCHEMIRICLAS_UTENTE1, "");
    PAN_SCHEMIRICLAS.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_DUAL, 0, SQL, PFL_SCHEMIRICLAS_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_DUAL, 1, SQL, PFL_SCHEMIRICLAS_UTENTE, "");
    PAN_SCHEMIRICLAS.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEMIRICLAS.SetIMDB(IMDB, "PQRY_SCHEMARICLAS", true);
    PAN_SCHEMIRICLAS.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.SCHEMA_RICL_ID as SCHEMA_RICL_ID, ");
    SQL.append("  A.LIVELLO as LIVELLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DESCRIZIONE_LIVELLO as DESCRIZIONE_LIVELLO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.TIPO_RICL_ID as TIPO_RICL_ID, ");
    SQL.append("  A.FORMATO as FORMATO ");
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_SCHEMARICLAS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE A ");
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_SCHEMARICLAS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_RICL_ID = ~~PQRY_PARS18.NOMOGGTIPRIC~~) ");
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_SCHEMARICLAS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_SCHEMARICLAS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_SCHEMARICLAS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.LIVELLO ");
    PAN_SCHEMIRICLAS.SetQuery(PPQRY_SCHEMARICLAS, 5, SQL, -1, "");
    PAN_SCHEMIRICLAS.SetQueryDB(PPQRY_SCHEMARICLAS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEMIRICLAS.SetMasterTable(0, "SCHEMA_RICLASSIFICAZIONE");
    PAN_SCHEMIRICLAS.AddToSortList(PFL_SCHEMIRICLAS_PARTE, true);
    PAN_SCHEMIRICLAS.AddToSortList(PFL_SCHEMIRICLAS_LIVELLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCHEMIRICLAS.Status() == 2)
    {
      int oldListQBE = PAN_SCHEMIRICLAS.iUseListQBE;
      PAN_SCHEMIRICLAS.iUseListQBE = 0;
      PAN_SCHEMIRICLAS.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCHEMIRICLAS.PanelCommand(Glb.PCM_FIND);
      PAN_SCHEMIRICLAS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SCHEMIRICLAS) PAN_SCHEMIRICLAS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_SCHEMIRICLAS) PAN_SCHEMIRICLAS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_SCHEMIRICLAS) PAN_SCHEMIRICLAS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SCHEMIRICLAS) PAN_SCHEMIRICLAS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCHEMIRICLAS) PAN_SCHEMIRICLAS_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEMIRICLAS) PAN_SCHEMIRICLAS_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEMIRICLAS) PAN_SCHEMIRICLAS_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_SCHEMIRICLAS) PAN_SCHEMIRICLAS_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SCHEMIRICLAS) PAN_SCHEMIRICLAS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
