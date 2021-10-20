// **********************************************
// Percentuali Di Incidenza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PercentualiDiIncidenza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PERCEDIINCID_TIPOBOLLATO = 0;
  private static int PFL_PERCEDIINCID_ANNO = 1;
  private static int PFL_PERCEDIINCID_TIPOREGISTRO = 2;
  private static int PFL_PERCEDIINCID_AMESE = 3;
  private static int PFL_PERCEDIINCID_DAMESE = 4;
  private static int PFL_PERCEDIINCID_ALIQUOTA = 5;
  private static int PFL_PERCEDIINCID_PERCDIINCIDE = 6;

  private static int PPQRY_VENWRK = 0;


  IDPanel PAN_PERCEDIINCID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE39(IMDB);
    //
    //
    Init_PQRY_VENWRK(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE39(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NEWTABLE39, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_NEWTABLE39, "TBL_NEWTABLE39");
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE39,IMDBDef2.FLD_NEWTABLE39_ROWNAMEDATAA,6,14,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NEWTABLE39, 0);
  }

  private static void Init_PQRY_VENWRK(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_VENWRK, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_VENWRK, "PQRY_VENWRK");
    IMDB.set_FldCode(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_ANNO, "ANNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_ANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_A_MESE, "A_MESE");
    IMDB.SetFldParams(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_A_MESE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_DA_MESE, "DA_MESE");
    IMDB.SetFldParams(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_DA_MESE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_PERC_INC, "PERC_INC");
    IMDB.SetFldParams(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_PERC_INC,3,8,5);
    IMDB.set_FldCode(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_ALIQUOTA, "ALIQUOTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_VENWRK,IMDBDef10.PQSL_VENWRK_ALIQUOTA,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_VENWRK, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PercentualiDiIncidenza(MyWebEntryPoint w, IMDBObj imdb)
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
  public PercentualiDiIncidenza()
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
    FormIdx = MyGlb.FRM_PERCEDIINCID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B5A9EBC3-410F-4497-A20A-B121470EF53A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 596;
    DesignHeight = 342;
    set_Caption(new IDVariant("Percentuali Di Incidenza"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 596;
    Frames[1].Height = 316;
    Frames[1].Caption = "Percentuali Di Incidenza";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 316;
    PAN_PERCEDIINCID = new IDPanel(w, this, 1, "PAN_PERCEDIINCID");
    Frames[1].Content = PAN_PERCEDIINCID;
    PAN_PERCEDIINCID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PERCEDIINCID.VS = MainFrm.VisualStyleList;
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 596-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PERCEDIINCID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4CF51A5F-B614-42B7-A068-FF036DA1ED1B");
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PERCEDIINCID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PERCEDIINCID.InitStatus = 2;
    PAN_PERCEDIINCID_Init();
    PAN_PERCEDIINCID_InitFields();
    PAN_PERCEDIINCID_InitQueries();
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
      PAN_PERCEDIINCID.UpdatePanel(MainFrm);
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
    return (obj instanceof PercentualiDiIncidenza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PercentualiDiIncidenza.class.getName() : (Glb.ClassWithPackage(PercentualiDiIncidenza.class) ? PercentualiDiIncidenza.class.getName().substring(PercentualiDiIncidenza.class.getPackage().getName().length() + 1) : PercentualiDiIncidenza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Percentuali Di Incidenza On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PERCEDIINCID_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Percentuali Di Incidenza On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_VENWRK, IMDBDef10.PQSL_VENWRK_ANNO, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMEANNO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_VENWRK, IMDBDef10.PQSL_VENWRK_TIPO_REGISTRO, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMTIPREG, 0));
        IMDB.set_Value(IMDBDef10.PQRY_VENWRK, IMDBDef10.PQSL_VENWRK_TIPO_BOLLATO, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMTIPBOL, 0));
        IMDB.set_Value(IMDBDef10.PQRY_VENWRK, IMDBDef10.PQSL_VENWRK_DA_MESE, 0, IDL.Month(IMDB.Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMEDATDA, 0)));
        IMDB.set_Value(IMDBDef10.PQRY_VENWRK, IMDBDef10.PQSL_VENWRK_A_MESE, 0, IDL.Month(IMDB.Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMEDATAA, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiDiIncidenza", "PercentualiDiIncidenzaOnUpdatingRowEvent", _e);
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiDiIncidenza", "LoadEvent", _e);
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
  private void PAN_PERCEDIINCID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PERCEDIINCID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PERCEDIINCID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PERCEDIINCID, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PERCEDIINCID_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PERCEDIINCID);
    // Stub
  }

  private void PAN_PERCEDIINCID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PERCEDIINCID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PERCEDIINCID_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PERCEDIINCID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PERCEDIINCID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PERCEDIINCID_Init()
  {

    PAN_PERCEDIINCID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PERCEDIINCID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PERCEDIINCID.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PERCEDIINCID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, "ABEFD597-4A36-4899-A189-3FD5843667FE");
    PAN_PERCEDIINCID.set_Header(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, "TIPO BOLLATO");
    PAN_PERCEDIINCID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, "Tipo di Bollato (Corrispettivi)");
    PAN_PERCEDIINCID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PERCEDIINCID.SetFlags(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PERCEDIINCID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, "5EC73D85-E255-4304-94F6-AD216AF9BA0D");
    PAN_PERCEDIINCID.set_Header(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, "ANNO");
    PAN_PERCEDIINCID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, "Anno di registrazione");
    PAN_PERCEDIINCID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PERCEDIINCID.SetFlags(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PERCEDIINCID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, "B494425F-2EFC-4D37-9E28-9FEAE89B7631");
    PAN_PERCEDIINCID.set_Header(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, "TIPO REGISTRO");
    PAN_PERCEDIINCID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, "Tipo Registro");
    PAN_PERCEDIINCID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PERCEDIINCID.SetFlags(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PERCEDIINCID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, "5F626141-BF20-4107-BF73-FED3119ED44F");
    PAN_PERCEDIINCID.set_Header(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, "A MESE");
    PAN_PERCEDIINCID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, "Ultimo Mese");
    PAN_PERCEDIINCID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PERCEDIINCID.SetFlags(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PERCEDIINCID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, "CDF61AF5-5D3A-4150-B246-C6D6799BB887");
    PAN_PERCEDIINCID.set_Header(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, "DA MESE");
    PAN_PERCEDIINCID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, "Primo mese");
    PAN_PERCEDIINCID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PERCEDIINCID.SetFlags(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PERCEDIINCID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, "1FBBEA0C-212E-48AA-81BD-20D1B0547254");
    PAN_PERCEDIINCID.set_Header(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, "Aliquota");
    PAN_PERCEDIINCID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, "Aliquota applicata");
    PAN_PERCEDIINCID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PERCEDIINCID.SetFlags(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PERCEDIINCID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, "E7CA5D90-A661-4376-8080-D5C5FF15992A");
    PAN_PERCEDIINCID.set_Header(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, "Perc. di Incidenza");
    PAN_PERCEDIINCID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, "");
    PAN_PERCEDIINCID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, MyGlb.VIS_PERINNOFICF4);
    PAN_PERCEDIINCID.SetFlags(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PERCEDIINCID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, MyGlb.PANEL_LIST, 80);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, MyGlb.PANEL_LIST, "TIPO BOLLATO");
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, MyGlb.PANEL_FORM, 80);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOBOLLATO, MyGlb.PANEL_FORM, "TP. BOLLATO");
    PAN_PERCEDIINCID.SetFieldPage(PFL_PERCEDIINCID_TIPOBOLLATO, -1, -1);
    PAN_PERCEDIINCID.SetFieldPanel(PFL_PERCEDIINCID_TIPOBOLLATO, PPQRY_VENWRK, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, MyGlb.PANEL_LIST, "ANNO");
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, MyGlb.PANEL_FORM, 4, 28, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, MyGlb.PANEL_FORM, 40);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ANNO, MyGlb.PANEL_FORM, "ANNO");
    PAN_PERCEDIINCID.SetFieldPage(PFL_PERCEDIINCID_ANNO, -1, -1);
    PAN_PERCEDIINCID.SetFieldPanel(PFL_PERCEDIINCID_ANNO, PPQRY_VENWRK, "A.ANNO", "ANNO", 1, 4, 0, -13997);
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, MyGlb.PANEL_LIST, 40, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, MyGlb.PANEL_LIST, 88);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, MyGlb.PANEL_FORM, 88);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_TIPOREGISTRO, MyGlb.PANEL_FORM, "TP. REGISTRO");
    PAN_PERCEDIINCID.SetFieldPage(PFL_PERCEDIINCID_TIPOREGISTRO, -1, -1);
    PAN_PERCEDIINCID.SetFieldPanel(PFL_PERCEDIINCID_TIPOREGISTRO, PPQRY_VENWRK, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 2, 0, -13997);
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, MyGlb.PANEL_LIST, 128, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, MyGlb.PANEL_LIST, 44);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, MyGlb.PANEL_LIST, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, MyGlb.PANEL_LIST, "A MESE");
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, MyGlb.PANEL_FORM, 4, 76, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, MyGlb.PANEL_FORM, 44);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, MyGlb.PANEL_FORM, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_AMESE, MyGlb.PANEL_FORM, "A MS.");
    PAN_PERCEDIINCID.SetFieldPage(PFL_PERCEDIINCID_AMESE, -1, -1);
    PAN_PERCEDIINCID.SetFieldPanel(PFL_PERCEDIINCID_AMESE, PPQRY_VENWRK, "A.A_MESE", "A_MESE", 1, 2, 0, -13997);
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, MyGlb.PANEL_LIST, 172, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, MyGlb.PANEL_LIST, 52);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, MyGlb.PANEL_LIST, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, MyGlb.PANEL_LIST, "DA MESE");
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, MyGlb.PANEL_FORM, 4, 100, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, MyGlb.PANEL_FORM, 52);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, MyGlb.PANEL_FORM, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_DAMESE, MyGlb.PANEL_FORM, "DA MS.");
    PAN_PERCEDIINCID.SetFieldPage(PFL_PERCEDIINCID_DAMESE, -1, -1);
    PAN_PERCEDIINCID.SetFieldPanel(PFL_PERCEDIINCID_DAMESE, PPQRY_VENWRK, "A.DA_MESE", "DA_MESE", 1, 2, 0, -13997);
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, MyGlb.PANEL_LIST, 60);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, MyGlb.PANEL_LIST, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, MyGlb.PANEL_LIST, "Aliquota");
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, MyGlb.PANEL_FORM, 60);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, MyGlb.PANEL_FORM, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_ALIQUOTA, MyGlb.PANEL_FORM, "Aliquota");
    PAN_PERCEDIINCID.SetFieldPage(PFL_PERCEDIINCID_ALIQUOTA, -1, -1);
    PAN_PERCEDIINCID.SetFieldPanel(PFL_PERCEDIINCID_ALIQUOTA, PPQRY_VENWRK, "A.ALIQUOTA", "ALIQUOTA", 1, 2, 0, -13997);
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, MyGlb.PANEL_LIST, 64, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, MyGlb.PANEL_LIST, 56);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, MyGlb.PANEL_LIST, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, MyGlb.PANEL_LIST, "Perc. di Incidenza");
    PAN_PERCEDIINCID.SetRect(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, MyGlb.PANEL_FORM, 4, 124, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERCEDIINCID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, MyGlb.PANEL_FORM, 56);
    PAN_PERCEDIINCID.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, MyGlb.PANEL_FORM, 1);
    PAN_PERCEDIINCID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERCEDIINCID_PERCDIINCIDE, MyGlb.PANEL_FORM, "P. d. Inc.");
    PAN_PERCEDIINCID.SetFieldPage(PFL_PERCEDIINCID_PERCDIINCIDE, -1, -1);
    PAN_PERCEDIINCID.SetFieldPanel(PFL_PERCEDIINCID_PERCDIINCIDE, PPQRY_VENWRK, "A.PERC_INC", "PERC_INC", 3, 8, 5, -13997);
  }

  private void PAN_PERCEDIINCID_InitQueries()
  {
    StringBuffer SQL;

    PAN_PERCEDIINCID.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PERCEDIINCID.SetIMDB(IMDB, "PQRY_VENWRK", true);
    PAN_PERCEDIINCID.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
    SQL.append("  A.ANNO as ANNO, ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.A_MESE as A_MESE, ");
    SQL.append("  A.DA_MESE as DA_MESE, ");
    SQL.append("  A.PERC_INC as PERC_INC, ");
    SQL.append("  A.ALIQUOTA as ALIQUOTA ");
    PAN_PERCEDIINCID.SetQuery(PPQRY_VENWRK, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VENWRK A ");
    PAN_PERCEDIINCID.SetQuery(PPQRY_VENWRK, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO = ~~TBL_NEWTABLE39.ROWNAMEANNO~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~TBL_NEWTABLE39.ROWNAMTIPREG~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TBL_NEWTABLE39.ROWNAMTIPBOL~~) ");
    SQL.append("and   (A.DA_MESE = TO_NUMBER(TO_CHAR(~~TBL_NEWTABLE39.ROWNAMEDATDA~~, 'mm' ))) ");
    SQL.append("and   (A.A_MESE = TO_NUMBER(TO_CHAR(~~TBL_NEWTABLE39.ROWNAMEDATAA~~, 'mm' ))) ");
    PAN_PERCEDIINCID.SetQuery(PPQRY_VENWRK, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PERCEDIINCID.SetQuery(PPQRY_VENWRK, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PERCEDIINCID.SetQuery(PPQRY_VENWRK, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ALIQUOTA ");
    PAN_PERCEDIINCID.SetQuery(PPQRY_VENWRK, 5, SQL, -1, "");
    PAN_PERCEDIINCID.SetQueryDB(PPQRY_VENWRK, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PERCEDIINCID.SetMasterTable(0, "VENWRK");
    PAN_PERCEDIINCID.AddToSortList(PFL_PERCEDIINCID_ALIQUOTA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PERCEDIINCID.Status() == 2)
    {
      int oldListQBE = PAN_PERCEDIINCID.iUseListQBE;
      PAN_PERCEDIINCID.iUseListQBE = 0;
      PAN_PERCEDIINCID.PanelCommand(Glb.PCM_SEARCH);
      PAN_PERCEDIINCID.PanelCommand(Glb.PCM_FIND);
      PAN_PERCEDIINCID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PERCEDIINCID) PAN_PERCEDIINCID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERCEDIINCID) PAN_PERCEDIINCID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PERCEDIINCID) PAN_PERCEDIINCID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERCEDIINCID) PAN_PERCEDIINCID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PERCEDIINCID) PAN_PERCEDIINCID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
