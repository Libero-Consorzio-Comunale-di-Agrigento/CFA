// **********************************************
// Scelta Proposte
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaProposte extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PROPOSTE_UNITAPROP = 0;
  private static int PFL_PROPOSTE_NUMERO = 1;
  private static int PFL_PROPOSTE_ANNO = 2;
  private static int PFL_PROPOSTE_DATA = 3;
  private static int PFL_PROPOSTE_OGGETTO = 4;

  private static int PPQRY_PROPOSTE1 = 0;


  IDPanel PAN_PROPOSTE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM174(IMDB);
    //
    //
    Init_PQRY_PROPOSTE1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM174(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM174, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM174, "TBL_PARAM174");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM174,IMDBDef1.FLD_PARAM174_PARAMDELESEC, "PARAMDELESEC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM174,IMDBDef1.FLD_PARAM174_PARAMDELESEC,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM174, 0);
  }

  private static void Init_PQRY_PROPOSTE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PROPOSTE1, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_PROPOSTE1, "PQRY_PROPOSTE1");
    IMDB.set_FldCode(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_ANNO, "ANNO");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_ANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_NUMERO, "NUMERO");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_NUMERO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_DATA_PROPOSTA, "DATA_PROPOSTA");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_DATA_PROPOSTA,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_OGGETTO, "OGGETTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROPOSTE1,IMDBDef7.PQSL_PROPOSTE1_OGGETTO,5,2000,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PROPOSTE1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaProposte(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaProposte()
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
    FormIdx = MyGlb.FRM_SCELTAPROPOS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "ACE005A3-21FD-4D9F-889C-89C9B01459F8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 748;
    DesignHeight = 370;
    set_Caption(new IDVariant("Scelta Proposte"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 748;
    Frames[1].Height = 344;
    Frames[1].Caption = "Proposte";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_PROPOSTE = new IDPanel(w, this, 1, "PAN_PROPOSTE");
    Frames[1].Content = PAN_PROPOSTE;
    PAN_PROPOSTE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROPOSTE.VS = MainFrm.VisualStyleList;
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 748-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "096F7A9A-0DA1-46B9-85E2-0794E4D7C3D9");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 664, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROPOSTE.InitStatus = 1;
    PAN_PROPOSTE_Init();
    PAN_PROPOSTE_InitFields();
    PAN_PROPOSTE_InitQueries();
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
      PAN_PROPOSTE.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaProposte);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaProposte.class.getName() : (Glb.ClassWithPackage(SceltaProposte.class) ? SceltaProposte.class.getName().substring(SceltaProposte.class.getPackage().getName().length() + 1) : SceltaProposte.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Proposte On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROPOSTE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROPOSTE);
      // 
      // Proposte On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PROPOSTE.set_ToolTip(Glb.OBJ_FIELD,PFL_PROPOSTE_OGGETTO,(new IDVariant(PAN_PROPOSTE.FieldText(PFL_PROPOSTE_OGGETTO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaProposte", "ProposteOnDynamicPropertiesEvent", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaProposte", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaProposte", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAM174, IMDBDef1.FLD_PARAM174_PARAMDELESEC, 0, new IDVariant());
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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
  private void PAN_PROPOSTE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROPOSTE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROPOSTE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROPOSTE, Cancel);
    // Stub
  }

  private void PAN_PROPOSTE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PROPOSTE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PROPOSTE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROPOSTE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PROPOSTE_Init()
  {

    PAN_PROPOSTE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROPOSTE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROPOSTE.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, "5D977DDA-6685-4C1C-A987-F0B423A1CBD5");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, "Unità Prop.");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, "Unità Proponente");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, "F2696C9F-9DCE-4479-A8C9-F51B57B12768");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, "Numero");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, "Numero Proposta");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, "28342BA3-DF20-4B90-B6C0-58360C6945DC");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, "Anno");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, "Anno Proposta");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, "3395ED88-708F-40B6-8E2F-83F8FDA29E0E");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, "Data");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, "Data proposta");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, "04CD9517-0442-4031-9962-32097049CE19");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, "Oggetto");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, "Oggetto");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PROPOSTE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, MyGlb.PANEL_LIST, 112);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, MyGlb.PANEL_LIST, "Unità Prop.");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, MyGlb.PANEL_FORM, 228, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAPROP, MyGlb.PANEL_FORM, "Unità Prop.");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_UNITAPROP, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_UNITAPROP, PPQRY_PROPOSTE1, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_LIST, 108, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_LIST, 52);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_LIST, "Num.");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_FORM, 404, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_FORM, 64);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_NUMERO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_NUMERO, PPQRY_PROPOSTE1, "A.NUMERO", "NUMERO", 1, 4, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, MyGlb.PANEL_LIST, 156, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_ANNO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_ANNO, PPQRY_PROPOSTE1, "A.ANNO", "ANNO", 1, 4, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, 196, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, 92);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, 228, 28, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_DATA, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_DATA, PPQRY_PROPOSTE1, "A.DATA_PROPOSTA", "DATA_PROPOSTA", 6, 19, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, MyGlb.PANEL_LIST, 280, 36, 384, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, MyGlb.PANEL_LIST, 56);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, MyGlb.PANEL_LIST, "Oggetto");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, MyGlb.PANEL_FORM, 4, 52, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, MyGlb.PANEL_FORM, 56);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, MyGlb.PANEL_FORM, 2);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_OGGETTO, MyGlb.PANEL_FORM, "Oggetto");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_OGGETTO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_OGGETTO, PPQRY_PROPOSTE1, "A.OGGETTO", "OGGETTO", 5, 2000, 0, -13997);
  }

  private void PAN_PROPOSTE_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROPOSTE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PROPOSTE.SetIMDB(IMDB, "PQRY_PROPOSTE1", true);
    PAN_PROPOSTE.set_SetString(MyGlb.MASTER_ROWNAME, "PROPOSTE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO as ANNO, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO as NUMERO, ");
    SQL.append("  A.DATA_PROPOSTA as DATA_PROPOSTA, ");
    SQL.append("  A.OGGETTO as OGGETTO ");
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROPOSTE A ");
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((~~TBL_PARAM174.PARAMDELESEC~~ IS NULL) OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  DEL B, ");
    SQL.append("  T10 C ");
    SQL.append("where (C.CODICE = B.TIPO_ESEC) ");
    SQL.append("and   (B.ANNO_PRO = A.ANNO) ");
    SQL.append("and   (B.NUMERO_PRO = A.NUMERO) ");
    SQL.append("and   (B.UNITA_PRO = A.UNITA_PROPONENTE) ");
    SQL.append("and   (C.P_D_E = 'E') ");
    SQL.append("))) ");
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO, ");
    SQL.append("  A.ANNO ");
    PAN_PROPOSTE.SetQuery(PPQRY_PROPOSTE1, 5, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_PROPOSTE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(0, "PROPOSTE");
    PAN_PROPOSTE.AddToSortList(PFL_PROPOSTE_UNITAPROP, true);
    PAN_PROPOSTE.AddToSortList(PFL_PROPOSTE_NUMERO, true);
    PAN_PROPOSTE.AddToSortList(PFL_PROPOSTE_ANNO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROPOSTE.Status() == 2)
    {
      int oldListQBE = PAN_PROPOSTE.iUseListQBE;
      PAN_PROPOSTE.iUseListQBE = 0;
      PAN_PROPOSTE.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROPOSTE.PanelCommand(Glb.PCM_FIND);
      PAN_PROPOSTE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
