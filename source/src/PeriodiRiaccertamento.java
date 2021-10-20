// **********************************************
// Periodi Riaccertamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PeriodiRiaccertamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PERIODRIACCE_CODICE = 0;
  private static int PFL_PERIODRIACCE_DESCRIZIONE = 1;
  private static int PFL_PERIODRIACCE_DATAINIZIO = 2;
  private static int PFL_PERIODRIACCE_DATAFINE = 3;
  private static int PFL_PERIODRIACCE_TIPO = 4;
  private static int PFL_PERIODRIACCE_FILTRODISP = 5;

  private static int PPQRY_PERIODRIACCE = 0;


  IDPanel PAN_PERIODRIACCE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PERIODRIACCE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PERIODRIACCE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PERIODRIACCE, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_PERIODRIACCE, "PQRY_PERIODRIACCE");
    IMDB.set_FldCode(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_DATA_INIZIO, "DATA_INIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_DATA_INIZIO,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_DATA_FINE, "DATA_FINE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_DATA_FINE,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_TIPO,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_FILTRO_DISP, "FILTRO_DISP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PERIODRIACCE,IMDBDef14.PQSL_PERIODRIACCE_FILTRO_DISP,5,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PERIODRIACCE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PeriodiRiaccertamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public PeriodiRiaccertamento()
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
    FormIdx = MyGlb.FRM_PERIODRIACCE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F92CECAA-B1D7-4187-965B-5BE286D90A13";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 916;
    DesignHeight = 26;
    set_Caption(new IDVariant("Periodi Riaccertamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 916;
    Frames[1].Height = 380;
    Frames[1].Caption = "Periodi Riaccertamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_PERIODRIACCE = new IDPanel(w, this, 1, "PAN_PERIODRIACCE");
    Frames[1].Content = PAN_PERIODRIACCE;
    PAN_PERIODRIACCE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PERIODRIACCE.VS = MainFrm.VisualStyleList;
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 916-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6AF8B3E4-61E0-45D5-9E9F-13A3DA815AFD");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 856, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PERIODRIACCE.InitStatus = 2;
    PAN_PERIODRIACCE_Init();
    PAN_PERIODRIACCE_InitFields();
    PAN_PERIODRIACCE_InitQueries();
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
      PAN_PERIODRIACCE.UpdatePanel(MainFrm);
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
    return (obj instanceof PeriodiRiaccertamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PeriodiRiaccertamento.class.getName() : (Glb.ClassWithPackage(PeriodiRiaccertamento.class) ? PeriodiRiaccertamento.class.getName().substring(PeriodiRiaccertamento.class.getPackage().getName().length() + 1) : PeriodiRiaccertamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Periodi Riaccertamento On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PERIODRIACCE_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PERIODRIACCE, Cancel);
      // 
      // Periodi Riaccertamento On Validate Row Body
      // Corpo Procedura
      // 
      if (PAN_PERIODRIACCE.FinalUpdate)
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PERIODRIACCE, IMDBDef14.PQSL_PERIODRIACCE_DATA_INIZIO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PERIODRIACCE, IMDBDef14.PQSL_PERIODRIACCE_DATA_FINE, 0))))
        {
          if (IMDB.Value(IMDBDef14.PQRY_PERIODRIACCE, IMDBDef14.PQSL_PERIODRIACCE_DATA_INIZIO, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_PERIODRIACCE, IMDBDef14.PQSL_PERIODRIACCE_DATA_FINE, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Data Inizio e Data Fine incongruenti"));
            PAN_PERIODRIACCE.SetFieldErrorText(PFL_PERIODRIACCE_DATAFINE, S.stringValue()); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PeriodiRiaccertamento", "PeriodiRiaccertamentoOnValidateRow", _e);
    }
  }

  // **********************************************************************
  // Periodi Riaccertamento On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PERIODRIACCE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PERIODRIACCE);
      // 
      // Periodi Riaccertamento On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (PAN_PERIODRIACCE.IsNewRow())
      {
        PAN_PERIODRIACCE.SetFlags (Glb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PERIODRIACCE.SetFlags (Glb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PeriodiRiaccertamento", "PeriodiRiaccertamentoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Periodi Riaccertamento On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PERIODRIACCE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Periodi Riaccertamento On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PERIODRIACCE, IMDBDef14.PQSL_PERIODRIACCE_CODICE, 0)))
        {
          IDVariant v_VMAX = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(MAX(A.CODICE), 0) + 1 as NUVAMAPERC01 ");
          SQL.append("from ");
          SQL.append("  PERIODI_RIACCERTAMENTI A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VMAX = QV.Get("NUVAMAPERC01", IDVariant.INTEGER) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef14.PQRY_PERIODRIACCE, IMDBDef14.PQSL_PERIODRIACCE_CODICE, 0, new IDVariant(v_VMAX));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PeriodiRiaccertamento", "PeriodiRiaccertamentoOnUpdatingRow", _e);
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
      PAN_PERIODRIACCE.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PeriodiRiaccertamento", "Load", _e);
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
  private void PAN_PERIODRIACCE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PERIODRIACCE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PERIODRIACCE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PERIODRIACCE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PERIODRIACCE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PERIODRIACCE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PERIODRIACCE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PERIODRIACCE_Init()
  {

    PAN_PERIODRIACCE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PERIODRIACCE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PERIODRIACCE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, "147346BE-E4E9-40CF-A3C3-2FC546382C4F");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, "Codice");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, "44D3FB5D-332C-4EDB-B74B-49C7DA7B29A0");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, "Descrizione");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, "33FDB6A9-51D6-486C-88B4-61A1BD84E37E");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, "Data inizio");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, "FE1D7B8F-79E6-4DE6-AFED-33A50AC96B2F");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, "Data fine");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, "88D22072-F768-4146-B06C-1B956CE14A09");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, "Tipo");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, "4690BBB5-09E9-4C72-9BCC-8B06B0A1CFA4");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, "Filtro Disponibilità");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PERIODRIACCE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_FORM, 28, 20, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_CODICE, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_CODICE, PPQRY_PERIODRIACCE, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_LIST, 48, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_FORM, 188, 20, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_FORM, 80);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_DESCRIZIONE, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_DESCRIZIONE, PPQRY_PERIODRIACCE, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_LIST, 444, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_LIST, 80);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_LIST, "Data inizio");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_FORM, 28, 44, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_FORM, 96);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_FORM, "Data inizio");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_DATAINIZIO, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_DATAINIZIO, PPQRY_PERIODRIACCE, "A.DATA_INIZIO", "DATA_INIZIO", 6, 19, 0, -13997);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_LIST, 524, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_LIST, 68);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_LIST, "Data fine");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_FORM, 208, 44, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_FORM, 60);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_FORM, "Data fine");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_DATAFINE, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_DATAFINE, PPQRY_PERIODRIACCE, "A.DATA_FINE", "DATA_FINE", 6, 19, 0, -13997);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_LIST, 604, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_FORM, 472, 44, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_FORM, 40);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_TIPO, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_TIPO, PPQRY_PERIODRIACCE, "A.TIPO", "TIPO", 5, 10, 0, -13997);
    PAN_PERIODRIACCE.SetValueListItem(PFL_PERIODRIACCE_TIPO, (new IDVariant("CONS")), "Consuntivo", "", "", -1);
    PAN_PERIODRIACCE.SetValueListItem(PFL_PERIODRIACCE_TIPO, (new IDVariant("GEST")), "Gestione", "", "", -1);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_LIST, 692, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_LIST, 76);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_LIST, "Filtro Disponibilità");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_FORM, 12, 72, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_FORM, 112);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_FORM, "Filtro Disponibilità");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_FILTRODISP, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_FILTRODISP, PPQRY_PERIODRIACCE, "A.FILTRO_DISP", "FILTRO_DISP", 5, 10, 0, -13997);
    PAN_PERIODRIACCE.SetValueListItem(PFL_PERIODRIACCE_FILTRODISP, (new IDVariant("DISP_31_12")), "Disp. finanziaria 31/12", "", "", -1);
    PAN_PERIODRIACCE.SetValueListItem(PFL_PERIODRIACCE_FILTRODISP, (new IDVariant("DISP_EFF")), "Disp. effettiva data elab.", "", "", -1);
  }

  private void PAN_PERIODRIACCE_InitQueries()
  {
    StringBuffer SQL;

    PAN_PERIODRIACCE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PERIODRIACCE.SetIMDB(IMDB, "PQRY_PERIODRIACCE", true);
    PAN_PERIODRIACCE.set_SetString(MyGlb.MASTER_ROWNAME, "PERIODI RIACCERTAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DATA_INIZIO as DATA_INIZIO, ");
    SQL.append("  A.DATA_FINE as DATA_FINE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.FILTRO_DISP as FILTRO_DISP ");
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACCE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PERIODI_RIACCERTAMENTI A ");
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACCE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACCE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACCE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACCE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACCE, 5, SQL, -1, "");
    PAN_PERIODRIACCE.SetQueryDB(PPQRY_PERIODRIACCE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PERIODRIACCE.SetMasterTable(0, "PERIODI_RIACCERTAMENTI");
    PAN_PERIODRIACCE.AddToSortList(PFL_PERIODRIACCE_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PERIODRIACCE.Status() == 2)
    {
      int oldListQBE = PAN_PERIODRIACCE.iUseListQBE;
      PAN_PERIODRIACCE.iUseListQBE = 0;
      PAN_PERIODRIACCE.PanelCommand(Glb.PCM_SEARCH);
      PAN_PERIODRIACCE.PanelCommand(Glb.PCM_FIND);
      PAN_PERIODRIACCE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
