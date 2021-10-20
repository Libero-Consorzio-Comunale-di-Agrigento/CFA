// **********************************************
// Elenco Voci Peg Con Stanziamento Simulato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoVociPegConStanziamentoSimulato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VOCIPEG_CAPITOLO = 0;
  private static int PFL_VOCIPEG_ARTICOLO = 1;
  private static int PFL_VOCIPEG_CAPITARTLABE = 2;
  private static int PFL_VOCIPEG_DESCRIZIONE = 3;

  private static int PPQRY_BIL3 = 0;


  IDPanel PAN_VOCIPEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI309(IMDB);
    //
    //
    Init_PQRY_BIL3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI309(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI309, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI309, "TBL_PARAMETRI309");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI309,IMDBDef1.FLD_PARAMETRI309_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI309,IMDBDef1.FLD_PARAMETRI309_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI309,IMDBDef1.FLD_PARAMETRI309_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI309,IMDBDef1.FLD_PARAMETRI309_PARAMES,5,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI309, 0);
  }

  private static void Init_PQRY_BIL3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_BIL3, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_BIL3, "PQRY_BIL3");
    IMDB.set_FldCode(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_BIL3,IMDBDef7.PQSL_BIL3_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_BIL3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoVociPegConStanziamentoSimulato(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoVociPegConStanziamentoSimulato()
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
    FormIdx = MyGlb.FRM_ELVOPECOSTSI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C4FFD022-FD87-480C-B020-763F3C541B5B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 540;
    DesignHeight = 382;
    set_Caption(new IDVariant("Elenco Voci Peg Con Stanziamento Simulato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 540;
    Frames[1].Height = 356;
    Frames[1].Caption = "Voci Peg";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 356;
    PAN_VOCIPEG = new IDPanel(w, this, 1, "PAN_VOCIPEG");
    Frames[1].Content = PAN_VOCIPEG;
    PAN_VOCIPEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VOCIPEG.VS = MainFrm.VisualStyleList;
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 540-MyGlb.PAN_OFFS_X, 356-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VOCIPEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "68631B28-C0A6-4B43-9639-08F05BECC1F6");
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 484, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPEG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VOCIPEG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VOCIPEG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VOCIPEG.InitStatus = 2;
    PAN_VOCIPEG_Init();
    PAN_VOCIPEG_InitFields();
    PAN_VOCIPEG_InitQueries();
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
      PAN_VOCIPEG.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoVociPegConStanziamentoSimulato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoVociPegConStanziamentoSimulato.class.getName() : (Glb.ClassWithPackage(ElencoVociPegConStanziamentoSimulato.class) ? ElencoVociPegConStanziamentoSimulato.class.getName().substring(ElencoVociPegConStanziamentoSimulato.class.getPackage().getName().length() + 1) : ElencoVociPegConStanziamentoSimulato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      v_CAPTION = (new IDVariant("Scelta Capitolo/Art.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVociPegConStanziamentoSimulato", "LoadEvent", _e);
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
  private void PAN_VOCIPEG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VOCIPEG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VOCIPEG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VOCIPEG, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VOCIPEG_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VOCIPEG);
    // Stub
  }

  private void PAN_VOCIPEG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VOCIPEG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VOCIPEG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VOCIPEG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VOCIPEG_Init()
  {

    PAN_VOCIPEG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VOCIPEG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VOCIPEG.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_VOCIPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, "8A5FD10E-4514-4037-815C-7B11F148A57C");
    PAN_VOCIPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, "CAPITOLO");
    PAN_VOCIPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, "");
    PAN_VOCIPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VOCIPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VOCIPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, "D78C6973-F8AF-4279-8A47-5606E02CE329");
    PAN_VOCIPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, "ARTICOLO");
    PAN_VOCIPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, "");
    PAN_VOCIPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCIPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VOCIPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, "852003B8-6C8D-40D8-82F9-75E9B001F061");
    PAN_VOCIPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, "Capitolo/Art.");
    PAN_VOCIPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_VOCIPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VOCIPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, "092C6321-9B53-4424-8682-A30CEF54228E");
    PAN_VOCIPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, "Descrizione");
    PAN_VOCIPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, "");
    PAN_VOCIPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCIPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VOCIPEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, MyGlb.PANEL_FORM, 88);
    PAN_VOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_VOCIPEG.SetFieldPage(PFL_VOCIPEG_CAPITOLO, -1, -1);
    PAN_VOCIPEG.SetFieldPanel(PFL_VOCIPEG_CAPITOLO, PPQRY_BIL3, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, MyGlb.PANEL_LIST, 104, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, MyGlb.PANEL_FORM, 164, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, MyGlb.PANEL_FORM, 72);
    PAN_VOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPEG_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_VOCIPEG.SetFieldPage(PFL_VOCIPEG_ARTICOLO, -1, -1);
    PAN_VOCIPEG.SetFieldPanel(PFL_VOCIPEG_ARTICOLO, PPQRY_BIL3, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, MyGlb.PANEL_LIST, 0, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, MyGlb.PANEL_LIST, 0);
    PAN_VOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, MyGlb.PANEL_LIST, 2);
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, MyGlb.PANEL_FORM, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, MyGlb.PANEL_FORM, 0);
    PAN_VOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPEG_CAPITARTLABE, MyGlb.PANEL_FORM, 2);
    PAN_VOCIPEG.SetFieldPage(PFL_VOCIPEG_CAPITARTLABE, -1, -1);
    PAN_VOCIPEG.SetFieldPanel(PFL_VOCIPEG_CAPITARTLABE, -1, "", "CAPITARTLABE", 0, 0, 0, -13997);
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 128, 36, 356, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPEG_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VOCIPEG.SetFieldPage(PFL_VOCIPEG_DESCRIZIONE, -1, -1);
    PAN_VOCIPEG.SetFieldPanel(PFL_VOCIPEG_DESCRIZIONE, PPQRY_BIL3, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
  }

  private void PAN_VOCIPEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_VOCIPEG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VOCIPEG.SetIMDB(IMDB, "PQRY_BIL3", true);
    PAN_VOCIPEG.set_SetString(MyGlb.MASTER_ROWNAME, "BIL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE ");
    PAN_VOCIPEG.SetQuery(PPQRY_BIL3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BPR A, ");
    SQL.append("  CAP B ");
    PAN_VOCIPEG.SetQuery(PPQRY_BIL3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI309.PARAMESERCIZ~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI309.PARAMES~~) ");
    SQL.append("and   (A.STN_INI_CO + A.VARIAZIONI_CO > 0) ");
    SQL.append("and   (B.ESERCIZIO(+) = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S(+) = A.E_S) ");
    SQL.append("and   (B.CAPITOLO(+) = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO(+) = A.ARTICOLO) ");
    PAN_VOCIPEG.SetQuery(PPQRY_BIL3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCIPEG.SetQuery(PPQRY_BIL3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCIPEG.SetQuery(PPQRY_BIL3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCIPEG.SetQuery(PPQRY_BIL3, 5, SQL, -1, "");
    PAN_VOCIPEG.SetQueryDB(PPQRY_BIL3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VOCIPEG.SetMasterTable(0, "BPR");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VOCIPEG.Status() == 2)
    {
      int oldListQBE = PAN_VOCIPEG.iUseListQBE;
      PAN_VOCIPEG.iUseListQBE = 0;
      PAN_VOCIPEG.PanelCommand(Glb.PCM_SEARCH);
      PAN_VOCIPEG.PanelCommand(Glb.PCM_FIND);
      PAN_VOCIPEG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VOCIPEG) PAN_VOCIPEG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCIPEG) PAN_VOCIPEG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VOCIPEG) PAN_VOCIPEG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCIPEG) PAN_VOCIPEG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VOCIPEG) PAN_VOCIPEG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
