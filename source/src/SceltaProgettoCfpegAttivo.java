// **********************************************
// Scelta Progetto Cfpeg Attivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaProgettoCfpegAttivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PROGETTI_PROGETTOID = 0;
  private static int PFL_PROGETTI_DESCRIZIONE = 1;
  private static int PFL_PROGETTI_DATAINIZIO = 2;
  private static int PFL_PROGETTI_PRIMOESERCIZ = 3;
  private static int PFL_PROGETTI_ORDINAMENTO = 4;

  private static int PPQRY_PROGETTI5 = 0;


  IDPanel PAN_PROGETTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI249(IMDB);
    //
    //
    Init_PQRY_PROGETTI5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI249(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI249, 4);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI249, "TBL_PARAMETRI249");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI249,IMDBDef1.FLD_PARAMETRI249_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI249,IMDBDef1.FLD_PARAMETRI249_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI249,IMDBDef1.FLD_PARAMETRI249_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI249,IMDBDef1.FLD_PARAMETRI249_ROWNAMEARTIC,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI249,IMDBDef1.FLD_PARAMETRI249_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI249,IMDBDef1.FLD_PARAMETRI249_ROWNAMEES,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI249,IMDBDef1.FLD_PARAMETRI249_ROWNAMEUOIMP, "ROWNAMEUOIMP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI249,IMDBDef1.FLD_PARAMETRI249_ROWNAMEUOIMP,1,8,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI249, 0);
  }

  private static void Init_PQRY_PROGETTI5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PROGETTI5, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_PROGETTI5, "PQRY_PROGETTI5");
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_RECORDDESCRI,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_DATA_INIZIO_PROG, "DATA_INIZIO_PROG");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_DATA_INIZIO_PROG,6,0,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_RECOPRIMESER, "RECOPRIMESER");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_RECOPRIMESER,1,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_RECORDORDINA, "RECORDORDINA");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI5,IMDBDef7.PQSL_PROGETTI5_RECORDORDINA,6,0,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PROGETTI5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaProgettoCfpegAttivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaProgettoCfpegAttivo()
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
    FormIdx = MyGlb.FRM_SCEPROCFPATT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "15BE8B2B-8D26-4444-81C5-18DD4EC6ED1E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 696;
    DesignHeight = 394;
    set_Caption(new IDVariant("Scelta Progetto Cfpeg Attivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 696;
    Frames[1].Height = 368;
    Frames[1].Caption = "Progetti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_PROGETTI = new IDPanel(w, this, 1, "PAN_PROGETTI");
    Frames[1].Content = PAN_PROGETTI;
    PAN_PROGETTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROGETTI.VS = MainFrm.VisualStyleList;
    PAN_PROGETTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 696-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E5710326-C405-4F5A-88FC-C6A4221F9F00");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 644, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROGETTI.InitStatus = 2;
    PAN_PROGETTI_Init();
    PAN_PROGETTI_InitFields();
    PAN_PROGETTI_InitQueries();
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
      PAN_PROGETTI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaProgettoCfpegAttivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaProgettoCfpegAttivo.class.getName() : (Glb.ClassWithPackage(SceltaProgettoCfpegAttivo.class) ? SceltaProgettoCfpegAttivo.class.getName().substring(SceltaProgettoCfpegAttivo.class.getPackage().getName().length() + 1) : SceltaProgettoCfpegAttivo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Progetti On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROGETTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROGETTI);
      // 
      // Progetti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PROGETTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PROGETTI_DESCRIZIONE,(new IDVariant(PAN_PROGETTI.FieldText(PFL_PROGETTI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaProgettoCfpegAttivo", "ProgettiOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Progetti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaProgettoCfpegAttivo", "LoadEvent", _e);
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
  private void PAN_PROGETTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROGETTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROGETTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROGETTI, Cancel);
    // Stub
  }

  private void PAN_PROGETTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PROGETTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PROGETTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROGETTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PROGETTI_Init()
  {

    PAN_PROGETTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROGETTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROGETTI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, "03FC186A-1D94-48BC-97AC-A768F8FD519D");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, "Obiettivo Operativo");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, "22A715A3-7779-44DC-A131-431195612310");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, "Descrizione");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, "F1507EE1-DBE8-4EC6-8FAF-1A88D28BF7CA");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, "Data inizio");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, "95EBFA82-1C7E-4F96-B53E-C80BD6B76EC3");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, "Primo Esercizio");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, "5F676783-23F6-4772-9D54-F4EC89A8414C");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, "Ordinamento");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PROGETTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.PANEL_LIST, 76);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.PANEL_FORM, 76);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_PROGETTOID, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_PROGETTOID, PPQRY_PROGETTI5, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 76, 36, 408, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_DESCRIZIONE, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_DESCRIZIONE, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_DESCRIZIONE, PPQRY_PROGETTI5, "MAX(A.DES_PROGETTO)", "RECORDDESCRI", 5, 99, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_LIST, 484, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_LIST, 104);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_LIST, "Data inizio");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_FORM, 4, 76, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_FORM, 104);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_FORM, "Data inizio");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_DATAINIZIO, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_DATAINIZIO, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_DATAINIZIO, PPQRY_PROGETTI5, "MAX(A.DATA_INIZIO_PROG)", "DATA_INIZIO_PROG", 6, 0, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, MyGlb.PANEL_LIST, 564, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, MyGlb.PANEL_LIST, 80);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, MyGlb.PANEL_LIST, "Primo Esercizio");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, MyGlb.PANEL_FORM, 4, 100, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, MyGlb.PANEL_FORM, 80);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_PRIMOESERCIZ, MyGlb.PANEL_FORM, "Pr. Esercizio");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_PRIMOESERCIZ, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_PRIMOESERCIZ, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_PRIMOESERCIZ, PPQRY_PROGETTI5, "MAX(A_GET_MIN_ESERCIZIO_STN_POL(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~TBL_PARAMETRI249.ROWNAMECAPIT~~,~~TBL_PARAMETRI249.ROWNAMEARTIC~~,A.PROGETTO_ID,to_number(NULL),NULL,NULL,~~TBL_PARAMETRI249.ROWNAMEUOIMP~~,'P'))", "RECOPRIMESER", 1, 19, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordin.");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.PANEL_FORM, 4, 124, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_ORDINAMENTO, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_ORDINAMENTO, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_ORDINAMENTO, PPQRY_PROGETTI5, "MAX(DECODE(" + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NULL, TO_DATE('1900-01-01','YYYY-MM-DD'), NVL(A.DATA_INIZIO_PROG, TO_DATE('1900-01-01','YYYY-MM-DD'))))", "RECORDORDINA", 6, 0, 0, -13997);
  }

  private void PAN_PROGETTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROGETTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PROGETTI.SetIMDB(IMDB, "PQRY_PROGETTI5", true);
    PAN_PROGETTI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  MAX(A.DES_PROGETTO) as RECORDDESCRI, ");
    SQL.append("  MAX(A.DATA_INIZIO_PROG) as DATA_INIZIO_PROG, ");
    SQL.append("  MAX(A_GET_MIN_ESERCIZIO_STN_POL(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~TBL_PARAMETRI249.ROWNAMECAPIT~~,~~TBL_PARAMETRI249.ROWNAMEARTIC~~,A.PROGETTO_ID,to_number(NULL),NULL,NULL,~~TBL_PARAMETRI249.ROWNAMEUOIMP~~,'P')) as RECOPRIMESER, ");
    SQL.append("  MAX(DECODE(" + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NULL, TO_DATE('1900-01-01','YYYY-MM-DD'), NVL(A.DATA_INIZIO_PROG, TO_DATE('1900-01-01','YYYY-MM-DD')))) as RECORDORDINA ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_ELENCO_PROG_FC A ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = ~~TBL_PARAMETRI249.ROWNAMEUOIMP~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI249.ROWNAMECAPIT~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI249.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.ESERCIZIO_STN = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.PROGETTO_ID ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 5, 1 ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI5, 5, SQL, -1, "");
    PAN_PROGETTI.SetQueryDB(PPQRY_PROGETTI5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGETTI.SetMasterTable(0, "POL_ELENCO_PROG_FC");
    PAN_PROGETTI.AddToSortList(PFL_PROGETTI_ORDINAMENTO, true);
    PAN_PROGETTI.AddToSortList(PFL_PROGETTI_PROGETTOID, true);
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_PROGETTI.Status() == 2)
    {
      int oldListQBE = PAN_PROGETTI.iUseListQBE;
      PAN_PROGETTI.iUseListQBE = 0;
      PAN_PROGETTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROGETTI.PanelCommand(Glb.PCM_FIND);
      PAN_PROGETTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
