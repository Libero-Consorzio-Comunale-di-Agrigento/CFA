// **********************************************
// Informazioni Proposta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniProposta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_INFORMPROPOS_DATA = 0;
  private static int PFL_INFORMPROPOS_OGGETTO = 1;
  private static int PFL_INFORMPROPOS_PROPOSTA = 2;
  private static int PFL_INFORMPROPOS_LABELOGGETTO = 3;
  private static int PFL_INFORMPROPOS_UNITAPROPONE = 4;
  private static int PFL_INFORMPROPOS_URLDOCUMENTO = 5;

  private static int PPQRY_PROPOSTE = 0;


  IDPanel PAN_INFORMPROPOS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI7(IMDB);
    //
    //
    Init_PQRY_PROPOSTE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI7, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI7, "TBL_PARAMETRI7");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI7,IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, "ROWNAMEUNITA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI7,IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA,5,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI7,IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI7,IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI7,IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI7,IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI7, 0);
  }

  private static void Init_PQRY_PROPOSTE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PROPOSTE, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_PROPOSTE, "PQRY_PROPOSTE");
    IMDB.set_FldCode(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_ANNO, "ANNO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_ANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_NUMERO, "NUMERO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_NUMERO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_DATA_PROPOSTA, "DATA_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_DATA_PROPOSTA,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_OGGETTO, "OGGETTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_OGGETTO,5,2000,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_PROPOSPROPOS, "PROPOSPROPOS");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_PROPOSPROPOS,5,216,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_URLDOCUMENTO, "URLDOCUMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROPOSTE,IMDBDef8.PQSL_PROPOSTE_URLDOCUMENTO,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PROPOSTE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniProposta(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniProposta()
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
    FormIdx = MyGlb.FRM_INFORMPROPOS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "689F4D97-DFCC-427B-A031-3831F4B75B43";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 424;
    DesignHeight = 202;
    set_Caption(new IDVariant("Informazioni Proposta"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 424;
    Frames[1].Height = 176;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Informazioni Proposta";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 176;
    PAN_INFORMPROPOS = new IDPanel(w, this, 1, "PAN_INFORMPROPOS");
    Frames[1].Content = PAN_INFORMPROPOS;
    PAN_INFORMPROPOS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INFORMPROPOS.VS = MainFrm.VisualStyleList;
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 424-MyGlb.PAN_OFFS_X, 176-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INFORMPROPOS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0EF5DDF3-F1A6-4BCC-B84C-068CCF6546EE");
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 96, 196, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INFORMPROPOS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INFORMPROPOS.InitStatus = 2;
    PAN_INFORMPROPOS_Init();
    PAN_INFORMPROPOS_InitFields();
    PAN_INFORMPROPOS_InitQueries();
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
      PAN_INFORMPROPOS.UpdatePanel(MainFrm);
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
    return (obj instanceof InformazioniProposta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniProposta.class.getName() : (Glb.ClassWithPackage(InformazioniProposta.class) ? InformazioniProposta.class.getName().substring(InformazioniProposta.class.getPackage().getName().length() + 1) : InformazioniProposta.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniProposta", "LoadEvent", _e);
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
  private void PAN_INFORMPROPOS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INFORMPROPOS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INFORMPROPOS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INFORMPROPOS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INFORMPROPOS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_INFORMPROPOS);
    // Stub
  }

  private void PAN_INFORMPROPOS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_INFORMPROPOS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INFORMPROPOS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INFORMPROPOS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_INFORMPROPOS_Init()
  {

    PAN_INFORMPROPOS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INFORMPROPOS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_INFORMPROPOS.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_INFORMPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, "2760A838-A11A-4C9F-805D-028292DC1FED");
    PAN_INFORMPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, "Data");
    PAN_INFORMPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, "Data Proposta");
    PAN_INFORMPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_INFORMPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_INFORMPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, "BFC36398-9888-4A7F-9540-BF902219D11E");
    PAN_INFORMPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, "Oggetto");
    PAN_INFORMPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, "Oggetto Proposta");
    PAN_INFORMPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_INFORMPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM, -1);
    PAN_INFORMPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, "3CF4EACC-26BB-4C04-A9AF-E056B98001D1");
    PAN_INFORMPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, "Proposta");
    PAN_INFORMPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, "Proposta");
    PAN_INFORMPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_INFORMPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFORMPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, "2655454D-9BE1-44D1-A02D-216B047403D8");
    PAN_INFORMPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, "Oggetto");
    PAN_INFORMPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, MyGlb.VIS_VUOTONORMALE);
    PAN_INFORMPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INFORMPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, "A5191E7D-DD34-4228-9755-B2BC69342330");
    PAN_INFORMPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_INFORMPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, "");
    PAN_INFORMPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_INFORMPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_INFORMPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, "049C2EFF-FF3F-4B5F-8346-01AAB37A5D36");
    PAN_INFORMPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, "Url Documento");
    PAN_INFORMPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, "");
    PAN_INFORMPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, MyGlb.VIS_HTMEDISTNOSF);
    PAN_INFORMPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_INFORMPROPOS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, MyGlb.PANEL_LIST, 92);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, MyGlb.PANEL_LIST, 1);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, MyGlb.PANEL_FORM, 264, 40, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, MyGlb.PANEL_FORM, 36);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, MyGlb.PANEL_FORM, 1);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_INFORMPROPOS.SetFieldPage(PFL_INFORMPROPOS_DATA, -1, -1);
    PAN_INFORMPROPOS.SetFieldPanel(PFL_INFORMPROPOS_DATA, PPQRY_PROPOSTE, "A.DATA_PROPOSTA", "DATA_PROPOSTA", 6, 19, 0, -13997);
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, MyGlb.PANEL_LIST, 4, 204, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, MyGlb.PANEL_LIST, 128);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, MyGlb.PANEL_LIST, 2);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, MyGlb.PANEL_LIST, "Oggetto");
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, MyGlb.PANEL_FORM, 8, 88, 388, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, MyGlb.PANEL_FORM, 20);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, MyGlb.PANEL_FORM, 2);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_OGGETTO, MyGlb.PANEL_FORM, "Oggetto");
    PAN_INFORMPROPOS.SetFieldPage(PFL_INFORMPROPOS_OGGETTO, -1, -1);
    PAN_INFORMPROPOS.SetFieldPanel(PFL_INFORMPROPOS_OGGETTO, PPQRY_PROPOSTE, "A.OGGETTO", "OGGETTO", 5, 2000, 0, -13997);
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, MyGlb.PANEL_FORM, 8, 8, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_INFORMPROPOS.SetFieldPage(PFL_INFORMPROPOS_PROPOSTA, -1, -1);
    PAN_INFORMPROPOS.SetFieldUnbound(PFL_INFORMPROPOS_PROPOSTA, true);
    PAN_INFORMPROPOS.SetFieldPanel(PFL_INFORMPROPOS_PROPOSTA, PPQRY_PROPOSTE, "A.UNITA_PROPONENTE || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO )", "PROPOSPROPOS", 5, 216, 0, -13997);
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, MyGlb.PANEL_LIST, 16, 76, 96, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, MyGlb.PANEL_LIST, 0);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, MyGlb.PANEL_FORM, 8, 68, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, MyGlb.PANEL_FORM, 0);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_LABELOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_INFORMPROPOS.SetFieldPage(PFL_INFORMPROPOS_LABELOGGETTO, -1, -1);
    PAN_INFORMPROPOS.SetFieldPanel(PFL_INFORMPROPOS_LABELOGGETTO, -1, "", "LABELOGGETTO", 0, 0, 0, -13997);
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 136, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_INFORMPROPOS.SetFieldPage(PFL_INFORMPROPOS_UNITAPROPONE, -1, -1);
    PAN_INFORMPROPOS.SetFieldPanel(PFL_INFORMPROPOS_UNITAPROPONE, PPQRY_PROPOSTE, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, MyGlb.PANEL_LIST, 92);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, MyGlb.PANEL_LIST, "Url Documento");
    PAN_INFORMPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, MyGlb.PANEL_FORM, 8, 144, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, MyGlb.PANEL_FORM, 92);
    PAN_INFORMPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_INFORMPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMPROPOS_URLDOCUMENTO, MyGlb.PANEL_FORM, "Url Documento");
    PAN_INFORMPROPOS.SetFieldPage(PFL_INFORMPROPOS_URLDOCUMENTO, -1, -1);
    PAN_INFORMPROPOS.SetFieldUnbound(PFL_INFORMPROPOS_URLDOCUMENTO, true);
    PAN_INFORMPROPOS.SetFieldPanel(PFL_INFORMPROPOS_URLDOCUMENTO, PPQRY_PROPOSTE, "GET_URL_DOCUMENTO_ATTI(A.ANNO,A.NUMERO,A.UNITA_PROPONENTE,'PROP',~~TBL_DATISESSIONE.SESSUSERNAME~~,'SI')", "URLDOCUMENTO", 5, 99, 0, -13997);
  }

  private void PAN_INFORMPROPOS_InitQueries()
  {
    StringBuffer SQL;

    PAN_INFORMPROPOS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_INFORMPROPOS.SetIMDB(IMDB, "PQRY_PROPOSTE", true);
    PAN_INFORMPROPOS.set_SetString(MyGlb.MASTER_ROWNAME, "PROPOSTE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO as ANNO, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO as NUMERO, ");
    SQL.append("  A.DATA_PROPOSTA as DATA_PROPOSTA, ");
    SQL.append("  A.OGGETTO as OGGETTO, ");
    SQL.append("  A.UNITA_PROPONENTE || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO ) as PROPOSPROPOS, ");
    SQL.append("  GET_URL_DOCUMENTO_ATTI(A.ANNO,A.NUMERO,A.UNITA_PROPONENTE,'PROP',~~TBL_DATISESSIONE.SESSUSERNAME~~,'SI') as URLDOCUMENTO ");
    PAN_INFORMPROPOS.SetQuery(PPQRY_PROPOSTE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROPOSTE A ");
    PAN_INFORMPROPOS.SetQuery(PPQRY_PROPOSTE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.UNITA_PROPONENTE = ~~TBL_PARAMETRI7.ROWNAMEUNITA~~) ");
    SQL.append("and   (A.ANNO = ~~TBL_PARAMETRI7.ROWNAMEANNO~~) ");
    SQL.append("and   (A.NUMERO = ~~TBL_PARAMETRI7.ROWNAMENUMER~~) ");
    PAN_INFORMPROPOS.SetQuery(PPQRY_PROPOSTE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFORMPROPOS.SetQuery(PPQRY_PROPOSTE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFORMPROPOS.SetQuery(PPQRY_PROPOSTE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFORMPROPOS.SetQuery(PPQRY_PROPOSTE, 5, SQL, -1, "");
    PAN_INFORMPROPOS.SetQueryDB(PPQRY_PROPOSTE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INFORMPROPOS.SetMasterTable(0, "PROPOSTE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INFORMPROPOS.Status() == 2)
    {
      int oldListQBE = PAN_INFORMPROPOS.iUseListQBE;
      PAN_INFORMPROPOS.iUseListQBE = 0;
      PAN_INFORMPROPOS.PanelCommand(Glb.PCM_SEARCH);
      PAN_INFORMPROPOS.PanelCommand(Glb.PCM_FIND);
      PAN_INFORMPROPOS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_INFORMPROPOS) PAN_INFORMPROPOS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFORMPROPOS) PAN_INFORMPROPOS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INFORMPROPOS) PAN_INFORMPROPOS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFORMPROPOS) PAN_INFORMPROPOS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_INFORMPROPOS) PAN_INFORMPROPOS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
