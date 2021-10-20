// **********************************************
// Causali Sospensione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CausaliSospensione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CAUSALSOSPEN_CODICE = 0;
  private static int PFL_CAUSALSOSPEN_DESCRIZIONE = 1;
  private static int PFL_CAUSALSOSPEN_TIPOCAUSSOSP = 2;
  private static int PFL_CAUSALSOSPEN_CODICEPCC = 3;
  private static int PFL_CAUSALSOSPEN_PREVALENTE = 4;

  private static int PPQRY_CAUSALSOSPEN = 0;

  private static int PPQRY_COSTANIMPEXP = 1;


  IDPanel PAN_CAUSALSOSPEN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_CAUSALSOSPEN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_CAUSALSOSPEN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_CAUSALSOSPEN, 5);
    IMDB.set_TblCode(IMDBDef9.PQRY_CAUSALSOSPEN, "PQRY_CAUSALSOSPEN");
    IMDB.set_FldCode(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_CODICE,5,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_TIPO_CAUSALE_SOSPENSIONE, "TIPO_CAUSALE_SOSPENSIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_TIPO_CAUSALE_SOSPENSIONE,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_CODICE_PCC, "CODICE_PCC");
    IMDB.SetFldParams(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_CODICE_PCC,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_PREVALENTE, "PREVALENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CAUSALSOSPEN,IMDBDef9.PQSL_CAUSALSOSPEN_PREVALENTE,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_CAUSALSOSPEN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CausaliSospensione(MyWebEntryPoint w, IMDBObj imdb)
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
  public CausaliSospensione()
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
    FormIdx = MyGlb.FRM_CAUSALSOSPEN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "78E08C16-ABF4-48E4-B1E7-84631A689EC5";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 964;
    DesignHeight = 326;
    set_Caption(new IDVariant("Causali Sospensione Documento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 964;
    Frames[1].Height = 300;
    Frames[1].Caption = "Causali Sospensione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_CAUSALSOSPEN = new IDPanel(w, this, 1, "PAN_CAUSALSOSPEN");
    Frames[1].Content = PAN_CAUSALSOSPEN;
    PAN_CAUSALSOSPEN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAUSALSOSPEN.VS = MainFrm.VisualStyleList;
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 964-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CAUSALSOSPEN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D7CE5234-F1E9-4D49-A185-2B4DDD0CBFC5");
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 816, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAUSALSOSPEN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAUSALSOSPEN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAUSALSOSPEN.InitStatus = 2;
    PAN_CAUSALSOSPEN_Init();
    PAN_CAUSALSOSPEN_InitFields();
    PAN_CAUSALSOSPEN_InitQueries();
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
      PAN_CAUSALSOSPEN.UpdatePanel(MainFrm);
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
    return (obj instanceof CausaliSospensione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CausaliSospensione.class.getName() : (Glb.ClassWithPackage(CausaliSospensione.class) ? CausaliSospensione.class.getName().substring(CausaliSospensione.class.getPackage().getName().length() + 1) : CausaliSospensione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Causali Sospensione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAUSALSOSPEN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAUSALSOSPEN);
      // 
      // Causali Sospensione On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (PAN_CAUSALSOSPEN.IsNewRow())
      {
        PAN_CAUSALSOSPEN.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CAUSALSOSPEN.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliSospensione", "CausaliSospensioneOnDynamicProperties", _e);
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
  private void PAN_CAUSALSOSPEN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAUSALSOSPEN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAUSALSOSPEN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAUSALSOSPEN, Cancel);
    // Stub
  }

  private void PAN_CAUSALSOSPEN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAUSALSOSPEN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CAUSALSOSPEN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_CAUSALSOSPEN, IMDBDef9.PQSL_CAUSALSOSPEN_TIPO_CAUSALE_SOSPENSIONE, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_CAUSALSOSPEN, IMDBDef9.PQSL_CAUSALSOSPEN_TIPO_CAUSALE_SOSPENSIONE, 0, (new IDVariant(1)));
      }
      if (Cancel.isFalse())
      {
        PAN_CAUSALSOSPEN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAUSALSOSPEN_Init()
  {

    PAN_CAUSALSOSPEN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAUSALSOSPEN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAUSALSOSPEN.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_CAUSALSOSPEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, "FB77CD10-7B7D-42D7-86A9-18424EA2C2B4");
    PAN_CAUSALSOSPEN.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, "Causale Sospensione");
    PAN_CAUSALSOSPEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, "");
    PAN_CAUSALSOSPEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALSOSPEN.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CAUSALSOSPEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, "8A250B06-5A8D-4203-BC81-1354963AA443");
    PAN_CAUSALSOSPEN.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, "Descrizione");
    PAN_CAUSALSOSPEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, "");
    PAN_CAUSALSOSPEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALSOSPEN.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CAUSALSOSPEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, "E2BF2C6A-BEAD-4E62-8C0A-D6E51055BBF7");
    PAN_CAUSALSOSPEN.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, "Tipo Causale");
    PAN_CAUSALSOSPEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, "");
    PAN_CAUSALSOSPEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALSOSPEN.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALSOSPEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, "C751FB8D-7CEB-42F5-8412-375CB5D2A925");
    PAN_CAUSALSOSPEN.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, "Codice PCC");
    PAN_CAUSALSOSPEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, "");
    PAN_CAUSALSOSPEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALSOSPEN.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALSOSPEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, "A313B43E-C605-4B9D-9B04-192963B458A4");
    PAN_CAUSALSOSPEN.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, "Prevalente");
    PAN_CAUSALSOSPEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, "");
    PAN_CAUSALSOSPEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_CAUSALSOSPEN.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CAUSALSOSPEN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, MyGlb.PANEL_LIST, 64);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, MyGlb.PANEL_LIST, "Causale Sospensione");
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, MyGlb.PANEL_FORM, 128);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICE, MyGlb.PANEL_FORM, "Causale Sospensione");
    PAN_CAUSALSOSPEN.SetFieldPage(PFL_CAUSALSOSPEN_CODICE, -1, -1);
    PAN_CAUSALSOSPEN.SetFieldPanel(PFL_CAUSALSOSPEN_CODICE, PPQRY_CAUSALSOSPEN, "A.CODICE", "CODICE", 5, 3, 0, -13997);
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, MyGlb.PANEL_LIST, 80, 36, 368, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CAUSALSOSPEN.SetFieldPage(PFL_CAUSALSOSPEN_DESCRIZIONE, -1, -1);
    PAN_CAUSALSOSPEN.SetFieldPanel(PFL_CAUSALSOSPEN_DESCRIZIONE, PPQRY_CAUSALSOSPEN, "A.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, MyGlb.PANEL_LIST, 448, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, MyGlb.PANEL_LIST, 168);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, MyGlb.PANEL_LIST, "Tipo Causale");
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, MyGlb.PANEL_FORM, 128);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_TIPOCAUSSOSP, MyGlb.PANEL_FORM, "Tipo Causale");
    PAN_CAUSALSOSPEN.SetFieldPage(PFL_CAUSALSOSPEN_TIPOCAUSSOSP, -1, -1);
    PAN_CAUSALSOSPEN.SetFieldPanel(PFL_CAUSALSOSPEN_TIPOCAUSSOSP, PPQRY_CAUSALSOSPEN, "A.TIPO_CAUSALE_SOSPENSIONE", "TIPO_CAUSALE_SOSPENSIONE", 1, 1, 0, -13997);
    PAN_CAUSALSOSPEN.SetValueListItem(PFL_CAUSALSOSPEN_TIPOCAUSSOSP, (new IDVariant(1)), "Sospensione Liquidazione", "", "", -1);
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, MyGlb.PANEL_LIST, 596, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, MyGlb.PANEL_LIST, 76);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, MyGlb.PANEL_LIST, "Codice PCC");
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, MyGlb.PANEL_FORM, 4, 76, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, MyGlb.PANEL_FORM, 128);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_CODICEPCC, MyGlb.PANEL_FORM, "Codice PCC");
    PAN_CAUSALSOSPEN.SetFieldPage(PFL_CAUSALSOSPEN_CODICEPCC, -1, -1);
    PAN_CAUSALSOSPEN.SetFieldPanel(PFL_CAUSALSOSPEN_CODICEPCC, PPQRY_CAUSALSOSPEN, "A.CODICE_PCC", "CODICE_PCC", 5, 12, 0, -13997);
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, MyGlb.PANEL_LIST, 740, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, MyGlb.PANEL_LIST, 76);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, MyGlb.PANEL_LIST, "Prevalente");
    PAN_CAUSALSOSPEN.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, MyGlb.PANEL_FORM, 4, 100, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALSOSPEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, MyGlb.PANEL_FORM, 76);
    PAN_CAUSALSOSPEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALSOSPEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALSOSPEN_PREVALENTE, MyGlb.PANEL_FORM, "Prevalente");
    PAN_CAUSALSOSPEN.SetFieldPage(PFL_CAUSALSOSPEN_PREVALENTE, -1, -1);
    PAN_CAUSALSOSPEN.SetFieldPanel(PFL_CAUSALSOSPEN_PREVALENTE, PPQRY_CAUSALSOSPEN, "A.PREVALENTE", "PREVALENTE", 5, 2, 0, -13997);
    PAN_CAUSALSOSPEN.SetValueListItem(PFL_CAUSALSOSPEN_PREVALENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CAUSALSOSPEN.SetValueListItem(PFL_CAUSALSOSPEN_PREVALENTE, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_CAUSALSOSPEN_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAUSALSOSPEN.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SIGLA_BANCA as COSIMPEXSIBA, ");
    SQL.append("  A.SIGLA_BANCA || ' - ' || A.TITOLO as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  COSTANTI_IMP_EXP A ");
    SQL.append("where (A.SIGLA_BANCA = ~~CODICE_PCC~~) ");
    SQL.append("and   (A.TIPO_FILE = 35) ");
    SQL.append("order by ");
    SQL.append("  A.SIGLA_BANCA ");
    PAN_CAUSALSOSPEN.SetQuery(PPQRY_COSTANIMPEXP, 0, SQL, PFL_CAUSALSOSPEN_CODICEPCC, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SIGLA_BANCA as COSIMPEXSIBA, ");
    SQL.append("  A.SIGLA_BANCA || ' - ' || A.TITOLO as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  COSTANTI_IMP_EXP A ");
    SQL.append("where (A.TIPO_FILE = 35) ");
    SQL.append("order by ");
    SQL.append("  A.SIGLA_BANCA ");
    PAN_CAUSALSOSPEN.SetQuery(PPQRY_COSTANIMPEXP, 1, SQL, PFL_CAUSALSOSPEN_CODICEPCC, "");
    PAN_CAUSALSOSPEN.SetQueryDB(PPQRY_COSTANIMPEXP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALSOSPEN.SetIMDB(IMDB, "PQRY_CAUSALSOSPEN", true);
    PAN_CAUSALSOSPEN.set_SetString(MyGlb.MASTER_ROWNAME, "CAUSALI SOSPENSIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_CAUSALE_SOSPENSIONE as TIPO_CAUSALE_SOSPENSIONE, ");
    SQL.append("  A.CODICE_PCC as CODICE_PCC, ");
    SQL.append("  A.PREVALENTE as PREVALENTE ");
    PAN_CAUSALSOSPEN.SetQuery(PPQRY_CAUSALSOSPEN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAUSALI_SOSPENSIONE A ");
    PAN_CAUSALSOSPEN.SetQuery(PPQRY_CAUSALSOSPEN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALSOSPEN.SetQuery(PPQRY_CAUSALSOSPEN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALSOSPEN.SetQuery(PPQRY_CAUSALSOSPEN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALSOSPEN.SetQuery(PPQRY_CAUSALSOSPEN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CAUSALSOSPEN.SetQuery(PPQRY_CAUSALSOSPEN, 5, SQL, -1, "");
    PAN_CAUSALSOSPEN.SetQueryDB(PPQRY_CAUSALSOSPEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALSOSPEN.SetMasterTable(0, "CAUSALI_SOSPENSIONE");
    PAN_CAUSALSOSPEN.AddToSortList(PFL_CAUSALSOSPEN_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAUSALSOSPEN.Status() == 2)
    {
      int oldListQBE = PAN_CAUSALSOSPEN.iUseListQBE;
      PAN_CAUSALSOSPEN.iUseListQBE = 0;
      PAN_CAUSALSOSPEN.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAUSALSOSPEN.PanelCommand(Glb.PCM_FIND);
      PAN_CAUSALSOSPEN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CAUSALSOSPEN) PAN_CAUSALSOSPEN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALSOSPEN) PAN_CAUSALSOSPEN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAUSALSOSPEN) PAN_CAUSALSOSPEN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALSOSPEN) PAN_CAUSALSOSPEN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CAUSALSOSPEN) PAN_CAUSALSOSPEN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
