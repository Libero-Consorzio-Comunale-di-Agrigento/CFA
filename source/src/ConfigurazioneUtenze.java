// **********************************************
// Configurazione Utenze
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ConfigurazioneUtenze extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SOGGETTI_CODICE = 0;
  private static int PFL_SOGGETTI_RAGIONSOCIAL = 1;
  private static int PFL_SOGGETTI_CODICEFISCAL = 2;
  private static int PFL_SOGGETTI_PARTITAIVA = 3;
  private static int PFL_SOGGETTI_TAGUTENZA = 4;

  private static int PPQRY_BEN2 = 0;


  IDPanel PAN_SOGGETTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_BEN2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_BEN2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_BEN2, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_BEN2, "PQRY_BEN2");
    IMDB.set_FldCode(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_CODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_RAGIONE_SOCIALE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_CODICE_FISCALE, "CODICE_FISCALE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_CODICE_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_PARTITA_IVA,5,11,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_TAG_UTENZA, "TAG_UTENZA");
    IMDB.SetFldParams(IMDBDef10.PQRY_BEN2,IMDBDef10.PQSL_BEN2_TAG_UTENZA,5,255,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_BEN2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ConfigurazioneUtenze(MyWebEntryPoint w, IMDBObj imdb)
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
  public ConfigurazioneUtenze()
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
    FormIdx = MyGlb.FRM_CONFIGUTENZE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E27468DD-2FC1-492C-9018-D1B62E325AF7";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1060;
    DesignHeight = 386;
    set_Caption(new IDVariant("Configurazione Utenze"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1060;
    Frames[1].Height = 360;
    Frames[1].Caption = "Soggetti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_SOGGETTI = new IDPanel(w, this, 1, "PAN_SOGGETTI");
    Frames[1].Content = PAN_SOGGETTI;
    PAN_SOGGETTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SOGGETTI.VS = MainFrm.VisualStyleList;
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1060-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "244C33FA-E31B-4C3C-9E54-B88F6E7D2846");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 944, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SOGGETTI.InitStatus = 2;
    PAN_SOGGETTI_Init();
    PAN_SOGGETTI_InitFields();
    PAN_SOGGETTI_InitQueries();
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
      PAN_SOGGETTI.UpdatePanel(MainFrm);
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
    return (obj instanceof ConfigurazioneUtenze);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ConfigurazioneUtenze.class.getName() : (Glb.ClassWithPackage(ConfigurazioneUtenze.class) ? ConfigurazioneUtenze.class.getName().substring(ConfigurazioneUtenze.class.getPackage().getName().length() + 1) : ConfigurazioneUtenze.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  
  
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
  private void PAN_SOGGETTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SOGGETTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SOGGETTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SOGGETTI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SOGGETTI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SOGGETTI);
    // Stub
  }

  private void PAN_SOGGETTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SOGGETTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SOGGETTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SOGGETTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SOGGETTI_Init()
  {

    PAN_SOGGETTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SOGGETTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SOGGETTI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, "A94C1710-89B2-43CB-9AF1-B81DB96938A0");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, "Codice");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, "Codice del beneficiario");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, "E82FE20E-DA5C-4D14-9820-383045A63BF1");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, "Ragione Sociale");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, "2A6FD539-4D91-48EE-B89A-720929B1D432");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, "Codice Fiscale");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, "7385BFCD-C34E-4908-95C1-2652C9114C59");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, "Partita IVA");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, "98C06CCC-094A-4653-8570-B778360473A4");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, "Tag Utenza");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, "Tag del file XML della fattura elettronica nel quale il fornitore inserisce il POD dell'utenza");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SOGGETTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, 0, 40, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, 4, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, 152);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_CODICE, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_CODICE, PPQRY_BEN2, "A.CODICE", "CODICE", 2, 15, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 56, 40, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 28, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 152);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_RAGIONSOCIAL, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_RAGIONSOCIAL, PPQRY_BEN2, "A.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 40, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, 304, 40, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, 100);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, 4, 100, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, 152);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_CODICEFISCAL, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_CODICEFISCAL, PPQRY_BEN2, "A.CODICE_FISCALE", "CODICE_FISCALE", 5, 16, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, 420, 40, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, 84);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, "Partita IVA");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, 308, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, 96);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, "Partita IVA");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_PARTITAIVA, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_PARTITAIVA, PPQRY_BEN2, "A.PARTITA_IVA", "PARTITA_IVA", 5, 11, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, MyGlb.PANEL_LIST, 516, 40, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, MyGlb.PANEL_LIST, 96);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, MyGlb.PANEL_LIST, "Tag Utenza");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, MyGlb.PANEL_FORM, 4, 532, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, MyGlb.PANEL_FORM, 96);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, MyGlb.PANEL_FORM, 2);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TAGUTENZA, MyGlb.PANEL_FORM, "Tag Utenza");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_TAGUTENZA, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_TAGUTENZA, PPQRY_BEN2, "A.TAG_UTENZA", "TAG_UTENZA", 5, 255, 0, -13997);
  }

  private void PAN_SOGGETTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SOGGETTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SOGGETTI.SetIMDB(IMDB, "PQRY_BEN2", true);
    PAN_SOGGETTI.set_SetString(MyGlb.MASTER_ROWNAME, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.RAGIONE_SOCIALE as RAGIONE_SOCIALE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.TAG_UTENZA as TAG_UTENZA ");
    PAN_SOGGETTI.SetQuery(PPQRY_BEN2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BEN A ");
    PAN_SOGGETTI.SetQuery(PPQRY_BEN2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SOGGETTI.SetQuery(PPQRY_BEN2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SOGGETTI.SetQuery(PPQRY_BEN2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SOGGETTI.SetQuery(PPQRY_BEN2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.RAGIONE_SOCIALE ");
    PAN_SOGGETTI.SetQuery(PPQRY_BEN2, 5, SQL, -1, "");
    PAN_SOGGETTI.SetQueryDB(PPQRY_BEN2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SOGGETTI.SetMasterTable(0, "BEN");
    PAN_SOGGETTI.AddToSortList(PFL_SOGGETTI_RAGIONSOCIAL, true);
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_SOGGETTI.Status() == 2)
    {
      int oldListQBE = PAN_SOGGETTI.iUseListQBE;
      PAN_SOGGETTI.iUseListQBE = 0;
      PAN_SOGGETTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SOGGETTI.PanelCommand(Glb.PCM_FIND);
      PAN_SOGGETTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
