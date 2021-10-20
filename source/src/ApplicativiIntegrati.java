// **********************************************
// Applicativi Integrati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ApplicativiIntegrati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_APPLICINTEGR_PROGETTO = 0;
  private static int PFL_APPLICINTEGR_PROGETDESCRI = 1;
  private static int PFL_APPLICINTEGR_ISTANZA = 2;
  private static int PFL_APPLICINTEGR_ISTANZDESCRI = 3;
  private static int PFL_APPLICINTEGR_VERSIONE = 4;

  private static int PPQRY_USEROBJECTS = 0;


  IDPanel PAN_APPLICINTEGR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_USEROBJECTS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_USEROBJECTS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_USEROBJECTS, 5);
    IMDB.set_TblCode(IMDBDef17.PQRY_USEROBJECTS, "PQRY_USEROBJECTS");
    IMDB.set_FldCode(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOISTAPROG, "RECOISTAPROG");
    IMDB.SetFldParams(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOISTAPROG,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOPROGDESC, "RECOPROGDESC");
    IMDB.SetFldParams(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOPROGDESC,5,40,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOISTAISTA, "RECOISTAISTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOISTAISTA,5,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOISTADESC, "RECOISTADESC");
    IMDB.SetFldParams(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOISTADESC,5,40,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOISTAVERS, "RECOISTAVERS");
    IMDB.SetFldParams(IMDBDef17.PQRY_USEROBJECTS,IMDBDef17.PQSL_USEROBJECTS_RECOISTAVERS,5,10,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_USEROBJECTS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ApplicativiIntegrati(MyWebEntryPoint w, IMDBObj imdb)
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
  public ApplicativiIntegrati()
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
    FormIdx = MyGlb.FRM_APPLICINTEGR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BA8907D8-D0D7-42E1-A302-1295736F1718";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 780;
    DesignHeight = 26;
    set_Caption(new IDVariant("Applicativi Integrati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 780;
    Frames[1].Height = 380;
    Frames[1].Caption = "Applicativi Integrati";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_APPLICINTEGR = new IDPanel(w, this, 1, "PAN_APPLICINTEGR");
    Frames[1].Content = PAN_APPLICINTEGR;
    PAN_APPLICINTEGR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_APPLICINTEGR.VS = MainFrm.VisualStyleList;
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 780-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_APPLICINTEGR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5AC910C3-2D21-441E-A491-B66F0F6B295F");
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 724, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_APPLICINTEGR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_APPLICINTEGR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_APPLICINTEGR.InitStatus = 2;
    PAN_APPLICINTEGR_Init();
    PAN_APPLICINTEGR_InitFields();
    PAN_APPLICINTEGR_InitQueries();
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
      PAN_APPLICINTEGR.UpdatePanel(MainFrm);
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
    return (obj instanceof ApplicativiIntegrati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ApplicativiIntegrati.class.getName() : (Glb.ClassWithPackage(ApplicativiIntegrati.class) ? ApplicativiIntegrati.class.getName().substring(ApplicativiIntegrati.class.getPackage().getName().length() + 1) : ApplicativiIntegrati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Applicativi Integrati On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_APPLICINTEGR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_APPLICINTEGR);
      // 
      // Applicativi Integrati On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_APPLICINTEGR.set_ToolTip(Glb.OBJ_FIELD,PFL_APPLICINTEGR_PROGETDESCRI,(new IDVariant(PAN_APPLICINTEGR.FieldText(PFL_APPLICINTEGR_PROGETDESCRI))).stringValue()); 
      PAN_APPLICINTEGR.set_ToolTip(Glb.OBJ_FIELD,PFL_APPLICINTEGR_ISTANZDESCRI,(new IDVariant(PAN_APPLICINTEGR.FieldText(PFL_APPLICINTEGR_ISTANZDESCRI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ApplicativiIntegrati", "ApplicativiIntegratiOnDynamicProperties", _e);
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
  private void PAN_APPLICINTEGR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_APPLICINTEGR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_APPLICINTEGR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_APPLICINTEGR, Cancel);
    // Stub
  }

  private void PAN_APPLICINTEGR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_APPLICINTEGR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_APPLICINTEGR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_APPLICINTEGR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_APPLICINTEGR_Init()
  {

    PAN_APPLICINTEGR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_APPLICINTEGR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_APPLICINTEGR.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_APPLICINTEGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, "181E7FF2-79ED-496D-98F2-6273F7380324");
    PAN_APPLICINTEGR.set_Header(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, "PROGETTO");
    PAN_APPLICINTEGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, "");
    PAN_APPLICINTEGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, MyGlb.VIS_NONNULLAFIEL);
    PAN_APPLICINTEGR.SetFlags(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, 0, -1);
    PAN_APPLICINTEGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, "8A552F69-2E45-427B-80E1-B2B430960596");
    PAN_APPLICINTEGR.set_Header(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, "Applicativo");
    PAN_APPLICINTEGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, "");
    PAN_APPLICINTEGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_APPLICINTEGR.SetFlags(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_APPLICINTEGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, "21DC8EB2-5BA5-4186-A216-0D8F3BD90DA4");
    PAN_APPLICINTEGR.set_Header(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, "Istanza");
    PAN_APPLICINTEGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, "");
    PAN_APPLICINTEGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_APPLICINTEGR.SetFlags(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_APPLICINTEGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, "9AACA543-A1FD-46D9-8EFB-422FF366A054");
    PAN_APPLICINTEGR.set_Header(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, " ");
    PAN_APPLICINTEGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, "");
    PAN_APPLICINTEGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, MyGlb.VIS_NOFINOBOVEHE);
    PAN_APPLICINTEGR.SetFlags(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_APPLICINTEGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, "F7483D21-5AC7-4F06-BC1B-28D800100AC6");
    PAN_APPLICINTEGR.set_Header(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, "Versione");
    PAN_APPLICINTEGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, "");
    PAN_APPLICINTEGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_APPLICINTEGR.SetFlags(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_APPLICINTEGR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, MyGlb.PANEL_LIST, 68);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, MyGlb.PANEL_LIST, "PROGETTO");
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, MyGlb.PANEL_FORM, 4, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, MyGlb.PANEL_FORM, 68);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETTO, MyGlb.PANEL_FORM, "PROGETTO");
    PAN_APPLICINTEGR.SetFieldPage(PFL_APPLICINTEGR_PROGETTO, -1, -1);
    PAN_APPLICINTEGR.SetFieldPanel(PFL_APPLICINTEGR_PROGETTO, PPQRY_USEROBJECTS, "C.PROGETTO", "RECOISTAPROG", 5, 8, 0, -13997);
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, MyGlb.PANEL_LIST, 0, 36, 284, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, MyGlb.PANEL_LIST, 84);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, MyGlb.PANEL_LIST, "Applicativo");
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, MyGlb.PANEL_FORM, 4, 28, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, MyGlb.PANEL_FORM, 84);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_PROGETDESCRI, MyGlb.PANEL_FORM, "Applicativo");
    PAN_APPLICINTEGR.SetFieldPage(PFL_APPLICINTEGR_PROGETDESCRI, -1, -1);
    PAN_APPLICINTEGR.SetFieldPanel(PFL_APPLICINTEGR_PROGETDESCRI, PPQRY_USEROBJECTS, "D.DESCRIZIONE", "RECOPROGDESC", 5, 40, 0, -13997);
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, MyGlb.PANEL_LIST, 284, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, MyGlb.PANEL_LIST, 60);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, MyGlb.PANEL_LIST, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, MyGlb.PANEL_LIST, "Istanza");
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, MyGlb.PANEL_FORM, 4, 52, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, MyGlb.PANEL_FORM, 60);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, MyGlb.PANEL_FORM, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZA, MyGlb.PANEL_FORM, "Istanza");
    PAN_APPLICINTEGR.SetFieldPage(PFL_APPLICINTEGR_ISTANZA, -1, -1);
    PAN_APPLICINTEGR.SetFieldPanel(PFL_APPLICINTEGR_ISTANZA, PPQRY_USEROBJECTS, "C.ISTANZA", "RECOISTAISTA", 5, 10, 0, -13997);
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, MyGlb.PANEL_LIST, 364, 36, 280, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, MyGlb.PANEL_LIST, 84);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, MyGlb.PANEL_LIST, " ");
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, MyGlb.PANEL_FORM, 4, 76, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, MyGlb.PANEL_FORM, 84);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_ISTANZDESCRI, MyGlb.PANEL_FORM, " ");
    PAN_APPLICINTEGR.SetFieldPage(PFL_APPLICINTEGR_ISTANZDESCRI, -1, -1);
    PAN_APPLICINTEGR.SetFieldPanel(PFL_APPLICINTEGR_ISTANZDESCRI, PPQRY_USEROBJECTS, "C.DESCRIZIONE", "RECOISTADESC", 5, 40, 0, -13997);
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, MyGlb.PANEL_LIST, 644, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, MyGlb.PANEL_LIST, 64);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, MyGlb.PANEL_LIST, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, MyGlb.PANEL_LIST, "Versione");
    PAN_APPLICINTEGR.SetRect(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, MyGlb.PANEL_FORM, 4, 100, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_APPLICINTEGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, MyGlb.PANEL_FORM, 64);
    PAN_APPLICINTEGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, MyGlb.PANEL_FORM, 1);
    PAN_APPLICINTEGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_APPLICINTEGR_VERSIONE, MyGlb.PANEL_FORM, "Versione");
    PAN_APPLICINTEGR.SetFieldPage(PFL_APPLICINTEGR_VERSIONE, -1, -1);
    PAN_APPLICINTEGR.SetFieldPanel(PFL_APPLICINTEGR_VERSIONE, PPQRY_USEROBJECTS, "C.VERSIONE", "RECOISTAVERS", 5, 10, 0, -13997);
  }

  private void PAN_APPLICINTEGR_InitQueries()
  {
    StringBuffer SQL;

    PAN_APPLICINTEGR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_APPLICINTEGR.SetIMDB(IMDB, "PQRY_USEROBJECTS", true);
    PAN_APPLICINTEGR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.PROGETTO as RECOISTAPROG, ");
    SQL.append("  D.DESCRIZIONE as RECOPROGDESC, ");
    SQL.append("  C.ISTANZA as RECOISTAISTA, ");
    SQL.append("  C.DESCRIZIONE as RECOISTADESC, ");
    SQL.append("  C.VERSIONE as RECOISTAVERS ");
    PAN_APPLICINTEGR.SetQuery(PPQRY_USEROBJECTS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  USER_OBJECTS A, ");
    SQL.append("  ALL_SYNONYMS B, ");
    SQL.append("  AD4_ISTANZE C, ");
    SQL.append("  AD4_PROGETTI D ");
    PAN_APPLICINTEGR.SetQuery(PPQRY_USEROBJECTS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.USER_ORACLE = B.TABLE_OWNER) ");
    SQL.append("and   (D.PROGETTO = C.PROGETTO) ");
    SQL.append("and   (B.OWNER = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (B.SYNONYM_NAME = A.OBJECT_NAME) ");
    SQL.append("and   (A.OBJECT_TYPE = 'SYNONYM') ");
    SQL.append("and   (A.OBJECT_NAME IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'ANAGRAFE_UNITA_ORGANIZZATIVE' ");
    SQL.append("from ");
    SQL.append("  AD4_ISTANZE E ");
    SQL.append("where (E.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (INSTR(E.INSTALLAZIONE, 'SO4') > 0) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'PROPOSTE' ");
    SQL.append("from ");
    SQL.append("  AD4_ISTANZE F ");
    SQL.append("where (F.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (INSTR(F.INSTALLAZIONE, 'GS') > 0) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'IMPEGNI_GE4' ");
    SQL.append("from ");
    SQL.append("  AD4_ISTANZE G ");
    SQL.append("where (G.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (INSTR(G.INSTALLAZIONE, 'GE') > 0) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'PROGRAMMI_CG' ");
    SQL.append("from ");
    SQL.append("  AD4_ISTANZE H ");
    SQL.append("where (H.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (INSTR(H.INSTALLAZIONE, 'CG') > 0) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'BOLLE_ACQUISTO' ");
    SQL.append("from ");
    SQL.append("  AD4_ISTANZE I ");
    SQL.append("where (I.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (INSTR(I.INSTALLAZIONE, 'CI') > 0) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'IMPEGNI_GC4' ");
    SQL.append("from ");
    SQL.append("  AD4_ISTANZE J ");
    SQL.append("where (J.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (INSTR(J.INSTALLAZIONE, 'GC') > 0) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'IMPUTAZIONI_CONTABILI' ");
    SQL.append("from ");
    SQL.append("  AD4_ISTANZE K ");
    SQL.append("where (K.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (INSTR(K.INSTALLAZIONE, 'P00') > 0) ");
    SQL.append(")) ");
    PAN_APPLICINTEGR.SetQuery(PPQRY_USEROBJECTS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_APPLICINTEGR.SetQuery(PPQRY_USEROBJECTS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_APPLICINTEGR.SetQuery(PPQRY_USEROBJECTS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_APPLICINTEGR.SetQuery(PPQRY_USEROBJECTS, 5, SQL, -1, "");
    PAN_APPLICINTEGR.SetQueryDB(PPQRY_USEROBJECTS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_APPLICINTEGR.SetMasterTable(0, "USER_OBJECTS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_APPLICINTEGR.Status() == 2)
    {
      int oldListQBE = PAN_APPLICINTEGR.iUseListQBE;
      PAN_APPLICINTEGR.iUseListQBE = 0;
      PAN_APPLICINTEGR.PanelCommand(Glb.PCM_SEARCH);
      PAN_APPLICINTEGR.PanelCommand(Glb.PCM_FIND);
      PAN_APPLICINTEGR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_APPLICINTEGR) PAN_APPLICINTEGR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_APPLICINTEGR) PAN_APPLICINTEGR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_APPLICINTEGR) PAN_APPLICINTEGR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_APPLICINTEGR) PAN_APPLICINTEGR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_APPLICINTEGR) PAN_APPLICINTEGR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
