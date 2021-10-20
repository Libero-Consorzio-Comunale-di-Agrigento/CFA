// **********************************************
// Parametri Trasparenza Atti Concessione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriTrasparenzaAttiConcessione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETART18_GESTDETTBENE = 0;

  private static int PFL_PARAMETART18_PROGRESSIVO = 0;
  private static int PFL_PARAMETART18_IMPORTO = 1;
  private static int PFL_PARAMETART18_GESTIONEIMP = 2;
  private static int PFL_PARAMETART18_SOLOIMPESECU = 3;
  private static int PFL_PARAMETART18_GESTIONELIQ = 4;
  private static int PFL_PARAMETART18_GESTIONEORD = 5;
  private static int PFL_PARAMETART18_GESTIODISTIN = 6;
  private static int PFL_PARAMETART18_BLOCCOELIMIN = 7;
  private static int PFL_PARAMETART18_UTENTEINSERI = 8;
  private static int PFL_PARAMETART18_DATAINSERIME = 9;
  private static int PFL_PARAMETART18_UTENTULTIAGG = 10;
  private static int PFL_PARAMETART18_DATAULTIMAGG = 11;

  private static int PPQRY_PARAMETART18 = 0;


  IDPanel PAN_PARAMETART18;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PARAMETART18(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PARAMETART18(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETART18, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETART18, "PQRY_PARAMETART18");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_PROGRESSIVO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_GESTIONE_IMP, "GESTIONE_IMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_GESTIONE_IMP,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_GESTIONE_LIQ, "GESTIONE_LIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_GESTIONE_LIQ,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_GESTIONE_ORD, "GESTIONE_ORD");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_GESTIONE_ORD,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_GESTIONE_DISTINTE, "GESTIONE_DISTINTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_GESTIONE_DISTINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_SOLO_IMP_ESECUTIVI, "SOLO_IMP_ESECUTIVI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_SOLO_IMP_ESECUTIVI,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_BLOCCO_ELIMINAZIONE, "BLOCCO_ELIMINAZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_BLOCCO_ELIMINAZIONE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETART18,IMDBDef9.PQSL_PARAMETART18_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETART18, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriTrasparenzaAttiConcessione(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriTrasparenzaAttiConcessione()
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
    FormIdx = MyGlb.FRM_PARTRAATTCON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C1F8E5F8-18C4-42BD-B5F3-126390BBCD67";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 512;
    DesignHeight = 346;
    set_Caption(new IDVariant("Parametri Trasparenza Atti Concessione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 512;
    Frames[1].Height = 320;
    Frames[1].Caption = "Parametri Art. 18";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_PARAMETART18 = new IDPanel(w, this, 1, "PAN_PARAMETART18");
    Frames[1].Content = PAN_PARAMETART18;
    PAN_PARAMETART18.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETART18.VS = MainFrm.VisualStyleList;
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 512-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FAF5574A-E142-4FA1-AC35-092AD6C25628");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 280, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETART18.InitStatus = 2;
    PAN_PARAMETART18_Init();
    PAN_PARAMETART18_InitFields();
    PAN_PARAMETART18_InitQueries();
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
      PAN_PARAMETART18.UpdatePanel(MainFrm);
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
    return (obj instanceof ParametriTrasparenzaAttiConcessione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriTrasparenzaAttiConcessione.class.getName() : (Glb.ClassWithPackage(ParametriTrasparenzaAttiConcessione.class) ? ParametriTrasparenzaAttiConcessione.class.getName().substring(ParametriTrasparenzaAttiConcessione.class.getPackage().getName().length() + 1) : ParametriTrasparenzaAttiConcessione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Art 18 On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETART18_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETART18);
      // 
      // Parametri Art 18 On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_GESTIONE_IMP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETART18.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETART18.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriTrasparenzaAttiConcessione", "ParametriArt18OnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri Art 18 On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETART18_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Art 18 On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_UTENTE_ULTIMO_AGG, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_DATA_ULTIMO_AGG, 0)))
        {
        }
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriTrasparenzaAttiConcessione", "ParametriArt18OnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Parametri Art 18 After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_PARAMETART18_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Art 18 After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        MainFrm.SettaParametriArt18();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriTrasparenzaAttiConcessione", "ParametriArt18AfterCommit", _e);
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
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  PARAMETRI_ART18 A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(0)), true))
      {
        SQL = new StringBuffer();
        SQL.append("insert into PARAMETRI_ART18 ");
        SQL.append("( ");
        SQL.append("  PROGRESSIVO, ");
        SQL.append("  UTENTE_INSERIMENTO, ");
        SQL.append("  DATA_INSERIMENTO ");
        SQL.append(") ");
        SQL.append("values ");
        SQL.append("( ");
        SQL.append("  1, ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  TRUNC( SYSDATE ) ");
        SQL.append(") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriTrasparenzaAttiConcessione", "Load", _e);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMETART18_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETART18, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETART18_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETART18, Cancel);
    // Stub
  }

  private void PAN_PARAMETART18_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETART18_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETART18_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETART18_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_PROGRESSIVO, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETART18, IMDBDef9.PQSL_PARAMETART18_PROGRESSIVO, 0, (new IDVariant(1)));
      }
      if (Cancel.isFalse())
      {
        PAN_PARAMETART18_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETART18_Init()
  {

    PAN_PARAMETART18.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETART18.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, "0FB6911C-1045-49B4-B8C5-2540DC06808D");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, "Gestione Dettagli Beneficiario");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, MyGlb.PANEL_LIST, 80, -9999, 240, 16, 0, 0);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, MyGlb.PANEL_FORM, 20, 59, 412, 145, 0, 0);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, 0, 167);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, 1, 13);
    PAN_PARAMETART18.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, 0, 4);
    PAN_PARAMETART18.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, 1, 4);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETART18_GESTDETTBENE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETART18.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, "0F3BFFED-B988-485C-9055-D44CE961465C");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, "PROGRESSIVO");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, "75B9CB39-A71A-4CEA-8E8C-51B659744274");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, "Importo Limite");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, "062D0DA8-0773-430D-9BEC-3A6DCC93C682");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, "Impegni");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, "CA160A17-656A-4397-B358-DB80AC41CAB9");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, "Solo Impegni Esecutivi");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, "40869502-B429-42B0-A3CB-2A254C25C415");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, "Liquidazioni");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, "CBBBB453-7299-4EA4-AFE7-ABE1F1E1E5C5");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, "Ordini");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, "316BFD8D-A9D6-4BCB-B9E7-CD31567F225E");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, "Distinte");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, "96D984F0-E079-4AD6-853E-418223C10E25");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, "Blocco Eliminazione Dettagli");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, "CBF1F667-458D-44B6-BA29-E1D0CDA6B8E1");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, "8CBFEEC8-E4A2-4E54-90F5-94BF1D007A3B");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, "DATA INSERIMENTO");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, "3E41B73C-5207-4DB8-B1DC-91B60249DCE3");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETART18.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, "5F174DC1-1379-46C5-856F-0340AA1E17B0");
    PAN_PARAMETART18.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_PARAMETART18.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, "");
    PAN_PARAMETART18.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETART18.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETART18_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, MyGlb.PANEL_FORM, 152);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_PROGRESSIVO, -1, -1);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_PROGRESSIVO, PPQRY_PARAMETART18, "A.PROGRESSIVO", "PROGRESSIVO", 1, 1, 0, -13997);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, MyGlb.PANEL_LIST, "Imp. Lim.");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, MyGlb.PANEL_FORM, 96, 24, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_IMPORTO, MyGlb.PANEL_FORM, "Importo Limite");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_IMPORTO, -1, -1);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_IMPORTO, PPQRY_PARAMETART18, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, MyGlb.PANEL_LIST, "Imp.");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, MyGlb.PANEL_FORM, 24, 84, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEIMP, MyGlb.PANEL_FORM, "Impegni");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_GESTIONEIMP, -1, GRP_PARAMETART18_GESTDETTBENE);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_GESTIONEIMP, PPQRY_PARAMETART18, "A.GESTIONE_IMP", "GESTIONE_IMP", 5, 2, 0, -13997);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_GESTIONEIMP, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_GESTIONEIMP, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, MyGlb.PANEL_LIST, 240, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, MyGlb.PANEL_LIST, "S. I. E.");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, MyGlb.PANEL_FORM, 252, 84, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, MyGlb.PANEL_FORM, 152);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_SOLOIMPESECU, MyGlb.PANEL_FORM, "Solo Impegni Esecutivi");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_SOLOIMPESECU, -1, GRP_PARAMETART18_GESTDETTBENE);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_SOLOIMPESECU, PPQRY_PARAMETART18, "A.SOLO_IMP_ESECUTIVI", "SOLO_IMP_ESECUTIVI", 5, 2, 0, -13997);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_SOLOIMPESECU, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_SOLOIMPESECU, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, MyGlb.PANEL_LIST, "Liq.");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, MyGlb.PANEL_FORM, 24, 108, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONELIQ, MyGlb.PANEL_FORM, "Liquidazioni");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_GESTIONELIQ, -1, GRP_PARAMETART18_GESTDETTBENE);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_GESTIONELIQ, PPQRY_PARAMETART18, "A.GESTIONE_LIQ", "GESTIONE_LIQ", 5, 2, 0, -13997);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_GESTIONELIQ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_GESTIONELIQ, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, MyGlb.PANEL_LIST, 160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, MyGlb.PANEL_LIST, "Ordini");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, MyGlb.PANEL_FORM, 24, 132, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIONEORD, MyGlb.PANEL_FORM, "Ordini");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_GESTIONEORD, -1, GRP_PARAMETART18_GESTDETTBENE);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_GESTIONEORD, PPQRY_PARAMETART18, "A.GESTIONE_ORD", "GESTIONE_ORD", 5, 2, 0, -13997);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_GESTIONEORD, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_GESTIONEORD, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, MyGlb.PANEL_LIST, 200, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, MyGlb.PANEL_LIST, "Dist.");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, MyGlb.PANEL_FORM, 24, 156, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_GESTIODISTIN, MyGlb.PANEL_FORM, "Distinte");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_GESTIODISTIN, -1, GRP_PARAMETART18_GESTDETTBENE);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_GESTIODISTIN, PPQRY_PARAMETART18, "A.GESTIONE_DISTINTE", "GESTIONE_DISTINTE", 5, 2, 0, -13997);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_GESTIODISTIN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_GESTIODISTIN, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, MyGlb.PANEL_LIST, 280, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, MyGlb.PANEL_LIST, 136);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, MyGlb.PANEL_LIST, "B. E. D.");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, MyGlb.PANEL_FORM, 24, 180, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_BLOCCOELIMIN, MyGlb.PANEL_FORM, "Blocco Eliminazione Dettagli");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_BLOCCOELIMIN, -1, GRP_PARAMETART18_GESTDETTBENE);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_BLOCCOELIMIN, PPQRY_PARAMETART18, "A.BLOCCO_ELIMINAZIONE", "BLOCCO_ELIMINAZIONE", 5, 2, 0, -13997);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_BLOCCOELIMIN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETART18.SetValueListItem(PFL_PARAMETART18_BLOCCOELIMIN, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, MyGlb.PANEL_LIST, 320, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 196, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, MyGlb.PANEL_FORM, 152);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_UTENTEINSERI, -1, -1);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_UTENTEINSERI, PPQRY_PARAMETART18, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, MyGlb.PANEL_LIST, 392, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, MyGlb.PANEL_FORM, 4, 220, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, MyGlb.PANEL_FORM, 152);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_DATAINSERIME, -1, -1);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_DATAINSERIME, PPQRY_PARAMETART18, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, MyGlb.PANEL_LIST, 528, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 244, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, MyGlb.PANEL_FORM, 152);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_UTENTULTIAGG, -1, -1);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_UTENTULTIAGG, PPQRY_PARAMETART18, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, MyGlb.PANEL_LIST, 600, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_PARAMETART18.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 268, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETART18.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, MyGlb.PANEL_FORM, 152);
    PAN_PARAMETART18.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETART18.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETART18_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_PARAMETART18.SetFieldPage(PFL_PARAMETART18_DATAULTIMAGG, -1, -1);
    PAN_PARAMETART18.SetFieldPanel(PFL_PARAMETART18_DATAULTIMAGG, PPQRY_PARAMETART18, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_PARAMETART18_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETART18.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETART18.SetIMDB(IMDB, "PQRY_PARAMETART18", true);
    PAN_PARAMETART18.set_SetString(MyGlb.MASTER_ROWNAME, "PARAMETRI ART18");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.GESTIONE_IMP as GESTIONE_IMP, ");
    SQL.append("  A.GESTIONE_LIQ as GESTIONE_LIQ, ");
    SQL.append("  A.GESTIONE_ORD as GESTIONE_ORD, ");
    SQL.append("  A.GESTIONE_DISTINTE as GESTIONE_DISTINTE, ");
    SQL.append("  A.SOLO_IMP_ESECUTIVI as SOLO_IMP_ESECUTIVI, ");
    SQL.append("  A.BLOCCO_ELIMINAZIONE as BLOCCO_ELIMINAZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_PARAMETART18.SetQuery(PPQRY_PARAMETART18, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAMETRI_ART18 A ");
    PAN_PARAMETART18.SetQuery(PPQRY_PARAMETART18, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = 1) ");
    PAN_PARAMETART18.SetQuery(PPQRY_PARAMETART18, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMETART18.SetQuery(PPQRY_PARAMETART18, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMETART18.SetQuery(PPQRY_PARAMETART18, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMETART18.SetQuery(PPQRY_PARAMETART18, 5, SQL, -1, "");
    PAN_PARAMETART18.SetQueryDB(PPQRY_PARAMETART18, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETART18.SetMasterTable(0, "PARAMETRI_ART18");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETART18.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETART18.iUseListQBE;
      PAN_PARAMETART18.iUseListQBE = 0;
      PAN_PARAMETART18.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETART18.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETART18.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETART18) PAN_PARAMETART18_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETART18) PAN_PARAMETART18_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETART18) PAN_PARAMETART18_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETART18) PAN_PARAMETART18_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETART18) PAN_PARAMETART18_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETART18) PAN_PARAMETART18_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
