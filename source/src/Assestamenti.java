// **********************************************
// Assestamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Assestamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ASSESTAMENTI_ESERCIZIO = 0;
  private static int PFL_ASSESTAMENTI_CODICE = 1;
  private static int PFL_ASSESTAMENTI_DESCRIZIONE = 2;
  private static int PFL_ASSESTAMENTI_CHIUSO = 3;
  private static int PFL_ASSESTAMENTI_GENERATO = 4;

  private static int PPQRY_ASSESTAMENTI = 0;


  IDPanel PAN_ASSESTAMENTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_ASSESTAMENTI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_ASSESTAMENTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_ASSESTAMENTI, 5);
    IMDB.set_TblCode(IMDBDef12.PQRY_ASSESTAMENTI, "PQRY_ASSESTAMENTI");
    IMDB.set_FldCode(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_CHIUSO, "CHIUSO");
    IMDB.SetFldParams(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_CHIUSO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_GENERATO, "GENERATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_ASSESTAMENTI,IMDBDef12.PQSL_ASSESTAMENTI_GENERATO,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_ASSESTAMENTI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Assestamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public Assestamenti()
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
    FormIdx = MyGlb.FRM_ASSESTAMENTI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "75976717-B077-42B2-8CFC-BE052967B3D4";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 584;
    DesignHeight = 362;
    set_Caption(new IDVariant("Assestamenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 584;
    Frames[1].Height = 336;
    Frames[1].Caption = "Assestamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_ASSESTAMENTI = new IDPanel(w, this, 1, "PAN_ASSESTAMENTI");
    Frames[1].Content = PAN_ASSESTAMENTI;
    PAN_ASSESTAMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ASSESTAMENTI.VS = MainFrm.VisualStyleList;
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 584-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ASSESTAMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AD84E7D0-E7C7-48C8-B0EB-44D03EF16FCA");
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 512, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ASSESTAMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ASSESTAMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ASSESTAMENTI.InitStatus = 2;
    PAN_ASSESTAMENTI_Init();
    PAN_ASSESTAMENTI_InitFields();
    PAN_ASSESTAMENTI_InitQueries();
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
      PAN_ASSESTAMENTI.UpdatePanel(MainFrm);
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
    return (obj instanceof Assestamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Assestamenti.class.getName() : (Glb.ClassWithPackage(Assestamenti.class) ? Assestamenti.class.getName().substring(Assestamenti.class.getPackage().getName().length() + 1) : Assestamenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // ASSESTAMENTI On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ASSESTAMENTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ASSESTAMENTI);
      // 
      // ASSESTAMENTI On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ASSESTAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_ASSESTAMENTI_DESCRIZIONE,(new IDVariant(PAN_ASSESTAMENTI.FieldText(PFL_ASSESTAMENTI_DESCRIZIONE))).stringValue()); 
      if (PAN_ASSESTAMENTI.IsNewRow())
      {
        PAN_ASSESTAMENTI.SetFlags (Glb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ASSESTAMENTI.SetFlags (Glb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Assestamenti", "ASSESTAMENTIOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // ASSESTAMENTI On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ASSESTAMENTI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // ASSESTAMENTI On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_ASSESTAMENTI, IMDBDef12.PQSL_ASSESTAMENTI_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Assestamenti", "ASSESTAMENTIOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // ASSESTAMENTI On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ASSESTAMENTI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // ASSESTAMENTI On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.ASSESTAMENTIPD(IMDB.Value(IMDBDef12.PQRY_ASSESTAMENTI, IMDBDef12.PQSL_ASSESTAMENTI_ESERCIZIO, 0), IMDB.Value(IMDBDef12.PQRY_ASSESTAMENTI, IMDBDef12.PQSL_ASSESTAMENTI_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Assestamenti", "ASSESTAMENTIOnCommand", _e);
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
      PAN_ASSESTAMENTI.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Assestamenti", "Load", _e);
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
  private void PAN_ASSESTAMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ASSESTAMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ASSESTAMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ASSESTAMENTI, Cancel);
    // Stub
  }

  private void PAN_ASSESTAMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ASSESTAMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ASSESTAMENTI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ASSESTAMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ASSESTAMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ASSESTAMENTI_Init()
  {

    PAN_ASSESTAMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ASSESTAMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ASSESTAMENTI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_ASSESTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, "FE17C711-1FAE-4883-8065-8D11A472CFC0");
    PAN_ASSESTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, "ESERCIZIO");
    PAN_ASSESTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, "");
    PAN_ASSESTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ASSESTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ASSESTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, "0C6ABBB5-D424-4195-897D-2BD3A44F57DB");
    PAN_ASSESTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, "Codice");
    PAN_ASSESTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, "");
    PAN_ASSESTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSESTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_ASSESTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, "52A3295E-27B1-4835-82F1-D0478F6C5FC9");
    PAN_ASSESTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, "Descrizione");
    PAN_ASSESTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, "");
    PAN_ASSESTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSESTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ASSESTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, "5F2F380C-7370-4ACF-9947-EA39029AA9D8");
    PAN_ASSESTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, "Chiuso");
    PAN_ASSESTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, "");
    PAN_ASSESTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, MyGlb.VIS_CHECKSTYLE);
    PAN_ASSESTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ASSESTAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, "F69077F2-4ECB-4D92-8DA3-B7D682638578");
    PAN_ASSESTAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, "Generato");
    PAN_ASSESTAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, "");
    PAN_ASSESTAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, MyGlb.VIS_CHECKSTYLE);
    PAN_ASSESTAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ASSESTAMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, MyGlb.PANEL_FORM, 96);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_ASSESTAMENTI.SetFieldPage(PFL_ASSESTAMENTI_ESERCIZIO, -1, -1);
    PAN_ASSESTAMENTI.SetFieldPanel(PFL_ASSESTAMENTI_ESERCIZIO, PPQRY_ASSESTAMENTI, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ASSESTAMENTI.SetFieldPage(PFL_ASSESTAMENTI_CODICE, -1, -1);
    PAN_ASSESTAMENTI.SetFieldPanel(PFL_ASSESTAMENTI_CODICE, PPQRY_ASSESTAMENTI, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 344, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ASSESTAMENTI.SetFieldPage(PFL_ASSESTAMENTI_DESCRIZIONE, -1, -1);
    PAN_ASSESTAMENTI.SetFieldPanel(PFL_ASSESTAMENTI_DESCRIZIONE, PPQRY_ASSESTAMENTI, "A.DESCRIZIONE", "DESCRIZIONE", 5, 50, 0, -13997);
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, MyGlb.PANEL_LIST, 400, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, MyGlb.PANEL_LIST, 52);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, MyGlb.PANEL_LIST, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, MyGlb.PANEL_LIST, "Chiuso");
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, MyGlb.PANEL_FORM, 96);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, MyGlb.PANEL_FORM, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_CHIUSO, MyGlb.PANEL_FORM, "Chiuso");
    PAN_ASSESTAMENTI.SetFieldPage(PFL_ASSESTAMENTI_CHIUSO, -1, -1);
    PAN_ASSESTAMENTI.SetFieldPanel(PFL_ASSESTAMENTI_CHIUSO, PPQRY_ASSESTAMENTI, "A.CHIUSO", "CHIUSO", 5, 2, 0, -13997);
    PAN_ASSESTAMENTI.SetValueListItem(PFL_ASSESTAMENTI_CHIUSO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ASSESTAMENTI.SetValueListItem(PFL_ASSESTAMENTI_CHIUSO, (new IDVariant()), "Null", "", "", -1);
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, MyGlb.PANEL_LIST, 448, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, MyGlb.PANEL_LIST, 68);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, MyGlb.PANEL_LIST, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, MyGlb.PANEL_LIST, "Generato");
    PAN_ASSESTAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESTAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, MyGlb.PANEL_FORM, 96);
    PAN_ASSESTAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, MyGlb.PANEL_FORM, 1);
    PAN_ASSESTAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESTAMENTI_GENERATO, MyGlb.PANEL_FORM, "Generato");
    PAN_ASSESTAMENTI.SetFieldPage(PFL_ASSESTAMENTI_GENERATO, -1, -1);
    PAN_ASSESTAMENTI.SetFieldPanel(PFL_ASSESTAMENTI_GENERATO, PPQRY_ASSESTAMENTI, "A.GENERATO", "GENERATO", 5, 2, 0, -13997);
    PAN_ASSESTAMENTI.SetValueListItem(PFL_ASSESTAMENTI_GENERATO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ASSESTAMENTI.SetValueListItem(PFL_ASSESTAMENTI_GENERATO, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_ASSESTAMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ASSESTAMENTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ASSESTAMENTI.SetIMDB(IMDB, "PQRY_ASSESTAMENTI", true);
    PAN_ASSESTAMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "ASSESTAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CHIUSO as CHIUSO, ");
    SQL.append("  A.GENERATO as GENERATO ");
    PAN_ASSESTAMENTI.SetQuery(PPQRY_ASSESTAMENTI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ASSESTAMENTI A ");
    PAN_ASSESTAMENTI.SetQuery(PPQRY_ASSESTAMENTI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ASSESTAMENTI.SetQuery(PPQRY_ASSESTAMENTI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ASSESTAMENTI.SetQuery(PPQRY_ASSESTAMENTI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ASSESTAMENTI.SetQuery(PPQRY_ASSESTAMENTI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ASSESTAMENTI.SetQuery(PPQRY_ASSESTAMENTI, 5, SQL, -1, "");
    PAN_ASSESTAMENTI.SetQueryDB(PPQRY_ASSESTAMENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ASSESTAMENTI.SetMasterTable(0, "ASSESTAMENTI");
    PAN_ASSESTAMENTI.AddToSortList(PFL_ASSESTAMENTI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ASSESTAMENTI.Status() == 2)
    {
      int oldListQBE = PAN_ASSESTAMENTI.iUseListQBE;
      PAN_ASSESTAMENTI.iUseListQBE = 0;
      PAN_ASSESTAMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ASSESTAMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_ASSESTAMENTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ASSESTAMENTI) PAN_ASSESTAMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ASSESTAMENTI) PAN_ASSESTAMENTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ASSESTAMENTI) PAN_ASSESTAMENTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ASSESTAMENTI) PAN_ASSESTAMENTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ASSESTAMENTI) PAN_ASSESTAMENTI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ASSESTAMENTI) PAN_ASSESTAMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
