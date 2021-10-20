// **********************************************
// Visualizza Info Query
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VisualizzaInfoQuery extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PANNELLQUERY_VECCHIAQUERY = 0;
  private static int PFL_PANNELLQUERY_NUOVAQUERY = 1;

  private static int PPQRY_CFESTRESEQUE = 0;


  IDPanel PAN_PANNELLQUERY;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI(IMDB);
    //
    //
    Init_PQRY_CFESTRESEQUE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI, "TBL_PARAMETRI");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI,IMDBDef7.FLD_PARAMETRI_ID_SELECT, "ID_SELECT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI,IMDBDef7.FLD_PARAMETRI_ID_SELECT,3,50,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI,IMDBDef7.FLD_PARAMETRI_NOMEOGGEQUER, "NOMEOGGEQUER");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI,IMDBDef7.FLD_PARAMETRI_NOMEOGGEQUER,5,50,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI, 0);
  }

  private static void Init_PQRY_CFESTRESEQUE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRESEQUE, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRESEQUE, "PQRY_CFESTRESEQUE");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_TIPO,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_VECCHIA_QUERY, "VECCHIA_QUERY");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_VECCHIA_QUERY,9,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_NUOVA_QUERY, "NUOVA_QUERY");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_NUOVA_QUERY,9,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_ID_SELECT, "ID_SELECT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRESEQUE,IMDBDef17.PQSL_CFESTRESEQUE_ID_SELECT,3,19,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRESEQUE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VisualizzaInfoQuery(MyWebEntryPoint w, IMDBObj imdb)
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
  public VisualizzaInfoQuery()
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
    FormIdx = MyGlb.FRM_VISUINFOQUER;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "34AD51B2-9699-478F-A70A-E6E4903033D6";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 476;
    DesignHeight = 482;
    set_Caption(new IDVariant("Select"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 476;
    Frames[1].Height = 456;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pannello Query";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 456;
    PAN_PANNELLQUERY = new IDPanel(w, this, 1, "PAN_PANNELLQUERY");
    Frames[1].Content = PAN_PANNELLQUERY;
    PAN_PANNELLQUERY.ShowToolbar = false;
    PAN_PANNELLQUERY.ShowStatusbar = false;
    PAN_PANNELLQUERY.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELLQUERY.VS = MainFrm.VisualStyleList;
    PAN_PANNELLQUERY.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 476-MyGlb.PAN_OFFS_X, 456-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELLQUERY.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E21BE437-8731-43AC-ADF9-5F3EB6AE26D6");
    PAN_PANNELLQUERY.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANNELLQUERY.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELLQUERY.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELLQUERY.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE, -1);
    PAN_PANNELLQUERY.InitStatus = 2;
    PAN_PANNELLQUERY_Init();
    PAN_PANNELLQUERY_InitFields();
    PAN_PANNELLQUERY_InitQueries();
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
      PAN_PANNELLQUERY.UpdatePanel(MainFrm);
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
    return (obj instanceof VisualizzaInfoQuery);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VisualizzaInfoQuery.class.getName() : (Glb.ClassWithPackage(VisualizzaInfoQuery.class) ? VisualizzaInfoQuery.class.getName().substring(VisualizzaInfoQuery.class.getPackage().getName().length() + 1) : VisualizzaInfoQuery.class.getName()));
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
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI, IMDBDef7.FLD_PARAMETRI_NOMEOGGEQUER, 0).equals((new IDVariant("Vecchia")), true))
      {
        PAN_PANNELLQUERY.SetFlags (Glb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PANNELLQUERY.SetFlags (Glb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PANNELLQUERY.SetFlags (Glb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PANNELLQUERY.SetFlags (Glb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaInfoQuery", "Load", _e);
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
  private void PAN_PANNELLQUERY_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELLQUERY, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELLQUERY_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELLQUERY, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELLQUERY_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PANNELLQUERY);
    // Stub
  }

  private void PAN_PANNELLQUERY_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PANNELLQUERY_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELLQUERY_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELLQUERY_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PANNELLQUERY_Init()
  {

    PAN_PANNELLQUERY.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELLQUERY.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELLQUERY.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PANNELLQUERY.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, "CA329CCE-077D-4629-B177-5C3F28AC5A55");
    PAN_PANNELLQUERY.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, "VECCHIA QUERY");
    PAN_PANNELLQUERY.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, "");
    PAN_PANNELLQUERY.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, MyGlb.VIS_NORMFIELPADR);
    PAN_PANNELLQUERY.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PANNELLQUERY.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, "2238C8CD-2577-4E09-A585-9A924DA2DA02");
    PAN_PANNELLQUERY.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, "NUOVA QUERY");
    PAN_PANNELLQUERY.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, "");
    PAN_PANNELLQUERY.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, MyGlb.VIS_NORMFIELPADR);
    PAN_PANNELLQUERY.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PANNELLQUERY_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELLQUERY.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PANNELLQUERY.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, MyGlb.PANEL_LIST, 96);
    PAN_PANNELLQUERY.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, MyGlb.PANEL_LIST, 2);
    PAN_PANNELLQUERY.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, MyGlb.PANEL_LIST, "VECCHIA QUERY");
    PAN_PANNELLQUERY.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, MyGlb.PANEL_FORM, 24, 16, 432, 420, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLQUERY.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, MyGlb.PANEL_FORM, 96);
    PAN_PANNELLQUERY.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, MyGlb.PANEL_FORM, 31);
    PAN_PANNELLQUERY.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_VECCHIAQUERY, MyGlb.PANEL_FORM, "VECCHIA QUERY");
    PAN_PANNELLQUERY.SetFieldPage(PFL_PANNELLQUERY_VECCHIAQUERY, -1, -1);
    PAN_PANNELLQUERY.SetFieldPanel(PFL_PANNELLQUERY_VECCHIAQUERY, PPQRY_CFESTRESEQUE, "A.VECCHIA_QUERY", "VECCHIA_QUERY", 9, 9999, 0, -13997);
    PAN_PANNELLQUERY.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PANNELLQUERY.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, MyGlb.PANEL_LIST, 88);
    PAN_PANNELLQUERY.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, MyGlb.PANEL_LIST, 2);
    PAN_PANNELLQUERY.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, MyGlb.PANEL_LIST, "NUOVA QUERY");
    PAN_PANNELLQUERY.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, MyGlb.PANEL_FORM, 24, 16, 432, 420, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLQUERY.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, MyGlb.PANEL_FORM, 88);
    PAN_PANNELLQUERY.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, MyGlb.PANEL_FORM, 31);
    PAN_PANNELLQUERY.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLQUERY_NUOVAQUERY, MyGlb.PANEL_FORM, "NUOVA QUERY");
    PAN_PANNELLQUERY.SetFieldPage(PFL_PANNELLQUERY_NUOVAQUERY, -1, -1);
    PAN_PANNELLQUERY.SetFieldPanel(PFL_PANNELLQUERY_NUOVAQUERY, PPQRY_CFESTRESEQUE, "A.NUOVA_QUERY", "NUOVA_QUERY", 9, 9999, 0, -13997);
  }

  private void PAN_PANNELLQUERY_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELLQUERY.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PANNELLQUERY.SetIMDB(IMDB, "PQRY_CFESTRESEQUE", true);
    PAN_PANNELLQUERY.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.VECCHIA_QUERY as VECCHIA_QUERY, ");
    SQL.append("  A.NUOVA_QUERY as NUOVA_QUERY, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.ID_SELECT as ID_SELECT ");
    PAN_PANNELLQUERY.SetQuery(PPQRY_CFESTRESEQUE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_LOG_MODIFICA A ");
    PAN_PANNELLQUERY.SetQuery(PPQRY_CFESTRESEQUE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ID_LOG_MODIFICA = ~~TBL_PARAMETRI.ID_SELECT~~) ");
    PAN_PANNELLQUERY.SetQuery(PPQRY_CFESTRESEQUE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PANNELLQUERY.SetQuery(PPQRY_CFESTRESEQUE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PANNELLQUERY.SetQuery(PPQRY_CFESTRESEQUE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PANNELLQUERY.SetQuery(PPQRY_CFESTRESEQUE, 5, SQL, -1, "");
    PAN_PANNELLQUERY.SetQueryDB(PPQRY_CFESTRESEQUE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PANNELLQUERY.SetMasterTable(0, "CF_ESTRAI_LOG_MODIFICA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELLQUERY.Status() == 2)
    {
      int oldListQBE = PAN_PANNELLQUERY.iUseListQBE;
      PAN_PANNELLQUERY.iUseListQBE = 0;
      PAN_PANNELLQUERY.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELLQUERY.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELLQUERY.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PANNELLQUERY) PAN_PANNELLQUERY_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELLQUERY) PAN_PANNELLQUERY_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PANNELLQUERY) PAN_PANNELLQUERY_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELLQUERY) PAN_PANNELLQUERY_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PANNELLQUERY) PAN_PANNELLQUERY_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
