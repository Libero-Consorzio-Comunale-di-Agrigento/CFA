// **********************************************
// Classificazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Classificazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CLASSIFICAZI_CATEGOFISCAL = 0;
  private static int PFL_CLASSIFICAZI_CLASSIFICAZI = 1;
  private static int PFL_CLASSIFICAZI_DESCRIZIONE = 2;

  private static int PPQRY_CLASSIFICAZI = 0;

  private static int PPQRY_CATEGOFISCAL = 1;


  IDPanel PAN_CLASSIFICAZI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRO(IMDB);
    //
    //
    Init_PQRY_CLASSIFICAZI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRO, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRO, "TBL_PARAMETRO");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRO,IMDBDef1.FLD_PARAMETRO_PARACATEFISC, "PARACATEFISC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRO,IMDBDef1.FLD_PARAMETRO_PARACATEFISC,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRO, 0);
  }

  private static void Init_PQRY_CLASSIFICAZI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_CLASSIFICAZI, 3);
    IMDB.set_TblCode(IMDBDef7.PQRY_CLASSIFICAZI, "PQRY_CLASSIFICAZI");
    IMDB.set_FldCode(IMDBDef7.PQRY_CLASSIFICAZI,IMDBDef7.PQSL_CLASSIFICAZI_CATEGORIA_FISCALE, "CATEGORIA_FISCALE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CLASSIFICAZI,IMDBDef7.PQSL_CLASSIFICAZI_CATEGORIA_FISCALE,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CLASSIFICAZI,IMDBDef7.PQSL_CLASSIFICAZI_CLASSIFICAZIONE, "CLASSIFICAZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CLASSIFICAZI,IMDBDef7.PQSL_CLASSIFICAZI_CLASSIFICAZIONE,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CLASSIFICAZI,IMDBDef7.PQSL_CLASSIFICAZI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CLASSIFICAZI,IMDBDef7.PQSL_CLASSIFICAZI_DESCRIZIONE,5,60,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_CLASSIFICAZI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Classificazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public Classificazioni()
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
    FormIdx = MyGlb.FRM_CLASSIFICAZI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "07ED3FC4-33A8-4E1E-86B1-B5921E7851AC";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 668;
    DesignHeight = 362;
    set_Caption(new IDVariant("Classificazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 668;
    Frames[1].Height = 336;
    Frames[1].Caption = "Classificazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_CLASSIFICAZI = new IDPanel(w, this, 1, "PAN_CLASSIFICAZI");
    Frames[1].Content = PAN_CLASSIFICAZI;
    PAN_CLASSIFICAZI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CLASSIFICAZI.VS = MainFrm.VisualStyleList;
    PAN_CLASSIFICAZI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 668-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CLASSIFICAZI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A5510D15-AA58-43C7-8F51-1418EAE269F9");
    PAN_CLASSIFICAZI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 632, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSIFICAZI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CLASSIFICAZI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CLASSIFICAZI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CLASSIFICAZI.InitStatus = 2;
    PAN_CLASSIFICAZI_Init();
    PAN_CLASSIFICAZI_InitFields();
    PAN_CLASSIFICAZI_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      PAN_CLASSIFICAZI.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Classificazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Classificazioni.class.getName() : (Glb.ClassWithPackage(Classificazioni.class) ? Classificazioni.class.getName().substring(Classificazioni.class.getPackage().getName().length() + 1) : Classificazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Classificazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CLASSIFICAZI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CLASSIFICAZI);
      // 
      // Classificazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_CLASSIFICAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_CLASSIFICAZI_DESCRIZIONE,(new IDVariant(PAN_CLASSIFICAZI.FieldText(PFL_CLASSIFICAZI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Classificazioni", "ClassificazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRO, IMDBDef1.FLD_PARAMETRO_PARACATEFISC, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Classificazioni", "UnloadEvent", _e);
    }
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
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cio� quando viene portata in primo piano
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
  private void PAN_CLASSIFICAZI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CLASSIFICAZI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CLASSIFICAZI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CLASSIFICAZI, Cancel);
    // Stub
  }

  private void PAN_CLASSIFICAZI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CLASSIFICAZI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CLASSIFICAZI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CLASSIFICAZI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CLASSIFICAZI_Init()
  {

    PAN_CLASSIFICAZI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CLASSIFICAZI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CLASSIFICAZI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_CLASSIFICAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, "44023CB7-C773-4149-A668-458EB06B97E3");
    PAN_CLASSIFICAZI.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, "Categoria Fiscale");
    PAN_CLASSIFICAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, "");
    PAN_CLASSIFICAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_CLASSIFICAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CLASSIFICAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, "923F8E15-09C0-4782-9B01-AFE92A27BB1C");
    PAN_CLASSIFICAZI.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, "Classificazione");
    PAN_CLASSIFICAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, "");
    PAN_CLASSIFICAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, MyGlb.VIS_NORMALFIELDS);
    PAN_CLASSIFICAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CLASSIFICAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, "87063B88-EC1F-4922-8E47-FD08AF267459");
    PAN_CLASSIFICAZI.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, "Descrizione");
    PAN_CLASSIFICAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, "");
    PAN_CLASSIFICAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CLASSIFICAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
  }

  private void PAN_CLASSIFICAZI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CLASSIFICAZI.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, MyGlb.PANEL_LIST, 0, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSIFICAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, MyGlb.PANEL_LIST, 112);
    PAN_CLASSIFICAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_CLASSIFICAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, MyGlb.PANEL_LIST, "Categoria Fiscale");
    PAN_CLASSIFICAZI.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSIFICAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, MyGlb.PANEL_FORM, 128);
    PAN_CLASSIFICAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_CLASSIFICAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CATEGOFISCAL, MyGlb.PANEL_FORM, "Categoria Fiscale");
    PAN_CLASSIFICAZI.SetFieldPage(PFL_CLASSIFICAZI_CATEGOFISCAL, -1, -1);
    PAN_CLASSIFICAZI.SetFieldPanel(PFL_CLASSIFICAZI_CATEGOFISCAL, PPQRY_CLASSIFICAZI, "A.CATEGORIA_FISCALE", "CATEGORIA_FISCALE", 1, 2, 0, -13997);
    PAN_CLASSIFICAZI.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, MyGlb.PANEL_LIST, 196, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSIFICAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, MyGlb.PANEL_LIST, 100);
    PAN_CLASSIFICAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, MyGlb.PANEL_LIST, 1);
    PAN_CLASSIFICAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, MyGlb.PANEL_LIST, "Classificazione");
    PAN_CLASSIFICAZI.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, MyGlb.PANEL_FORM, 4, 28, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSIFICAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, MyGlb.PANEL_FORM, 128);
    PAN_CLASSIFICAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, MyGlb.PANEL_FORM, 1);
    PAN_CLASSIFICAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_CLASSIFICAZI, MyGlb.PANEL_FORM, "Classificazione");
    PAN_CLASSIFICAZI.SetFieldPage(PFL_CLASSIFICAZI_CLASSIFICAZI, -1, -1);
    PAN_CLASSIFICAZI.SetFieldPanel(PFL_CLASSIFICAZI_CLASSIFICAZI, PPQRY_CLASSIFICAZI, "A.CLASSIFICAZIONE", "CLASSIFICAZIONE", 5, 10, 0, -13997);
    PAN_CLASSIFICAZI.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 304, 36, 328, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CLASSIFICAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CLASSIFICAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CLASSIFICAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CLASSIFICAZI.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSIFICAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_CLASSIFICAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CLASSIFICAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSIFICAZI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CLASSIFICAZI.SetFieldPage(PFL_CLASSIFICAZI_DESCRIZIONE, -1, -1);
    PAN_CLASSIFICAZI.SetFieldPanel(PFL_CLASSIFICAZI_DESCRIZIONE, PPQRY_CLASSIFICAZI, "A.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
  }

  private void PAN_CLASSIFICAZI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CLASSIFICAZI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA_FISCALE as CATFISCATFIS, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA_FISCALE ) || ' ' || '-' || ' ' || A.DESCRIZIONE as CATFISNEWEXP ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_FISCALI A ");
    SQL.append("where (A.CATEGORIA_FISCALE = ~~CATEGORIA_FISCALE~~) ");
    PAN_CLASSIFICAZI.SetQuery(PPQRY_CATEGOFISCAL, 0, SQL, PFL_CLASSIFICAZI_CATEGOFISCAL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA_FISCALE as CATFISCATFIS, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA_FISCALE ) || ' ' || '-' || ' ' || A.DESCRIZIONE as CATFISNEWEXP ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_FISCALI A ");
    PAN_CLASSIFICAZI.SetQuery(PPQRY_CATEGOFISCAL, 1, SQL, PFL_CLASSIFICAZI_CATEGOFISCAL, "");
    PAN_CLASSIFICAZI.SetQueryDB(PPQRY_CATEGOFISCAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CLASSIFICAZI.SetIMDB(IMDB, "PQRY_CLASSIFICAZI", true);
    PAN_CLASSIFICAZI.set_SetString(MyGlb.MASTER_ROWNAME, "CLASSIFICAZIONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA_FISCALE as CATEGORIA_FISCALE, ");
    SQL.append("  A.CLASSIFICAZIONE as CLASSIFICAZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_CLASSIFICAZI.SetQuery(PPQRY_CLASSIFICAZI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CLASSIFICAZIONI A ");
    PAN_CLASSIFICAZI.SetQuery(PPQRY_CLASSIFICAZI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CATEGORIA_FISCALE = NVL(~~TBL_PARAMETRO.PARACATEFISC~~, A.CATEGORIA_FISCALE)) ");
    PAN_CLASSIFICAZI.SetQuery(PPQRY_CLASSIFICAZI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CLASSIFICAZI.SetQuery(PPQRY_CLASSIFICAZI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CLASSIFICAZI.SetQuery(PPQRY_CLASSIFICAZI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CATEGORIA_FISCALE ");
    PAN_CLASSIFICAZI.SetQuery(PPQRY_CLASSIFICAZI, 5, SQL, -1, "");
    PAN_CLASSIFICAZI.SetQueryDB(PPQRY_CLASSIFICAZI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CLASSIFICAZI.SetMasterTable(0, "CLASSIFICAZIONI");
    PAN_CLASSIFICAZI.AddToSortList(PFL_CLASSIFICAZI_CATEGOFISCAL, true);
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_CLASSIFICAZI.Status() == 2)
    {
      int oldListQBE = PAN_CLASSIFICAZI.iUseListQBE;
      PAN_CLASSIFICAZI.iUseListQBE = 0;
      PAN_CLASSIFICAZI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CLASSIFICAZI.PanelCommand(Glb.PCM_FIND);
      PAN_CLASSIFICAZI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CLASSIFICAZI) PAN_CLASSIFICAZI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CLASSIFICAZI) PAN_CLASSIFICAZI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CLASSIFICAZI) PAN_CLASSIFICAZI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CLASSIFICAZI) PAN_CLASSIFICAZI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CLASSIFICAZI) PAN_CLASSIFICAZI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
