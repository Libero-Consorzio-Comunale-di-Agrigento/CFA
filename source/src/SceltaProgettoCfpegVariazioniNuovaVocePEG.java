// **********************************************
// Scelta Progetto Cfpeg Variazioni Nuova Voce P E G
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaProgettoCfpegVariazioniNuovaVocePEG extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PROGETTI_PROGETTOID = 0;
  private static int PFL_PROGETTI_DESCRIZIONE = 1;
  private static int PFL_PROGETTI_DATAINIZIO = 2;
  private static int PFL_PROGETTI_ORDINAMENTO = 3;
  private static int PFL_PROGETTI_FATTORE = 4;
  private static int PFL_PROGETTI_DESFATTORE = 5;
  private static int PFL_PROGETTI_CENTRO = 6;
  private static int PFL_PROGETTI_DESCENTRO = 7;
  private static int PFL_PROGETTI_LABEL = 8;
  private static int PFL_PROGETTI_LABEL1 = 9;

  private static int PPQRY_PROGETTI9 = 0;


  IDPanel PAN_PROGETTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI386(IMDB);
    //
    //
    Init_PQRY_PROGETTI9(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI386(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI386, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI386, "TBL_PARAMETRI386");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI386,IMDBDef1.FLD_PARAMETRI386_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI386,IMDBDef1.FLD_PARAMETRI386_ROWNAMEES,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI386,IMDBDef1.FLD_PARAMETRI386_ROWNAMEUOIMP, "ROWNAMEUOIMP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI386,IMDBDef1.FLD_PARAMETRI386_ROWNAMEUOIMP,1,8,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI386, 0);
  }

  private static void Init_PQRY_PROGETTI9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PROGETTI9, 8);
    IMDB.set_TblCode(IMDBDef7.PQRY_PROGETTI9, "PQRY_PROGETTI9");
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_RECORDDESCRI,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_DATA_INIZIO_PROG, "DATA_INIZIO_PROG");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_DATA_INIZIO_PROG,6,0,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_RECORDORDINA, "RECORDORDINA");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_RECORDORDINA,6,0,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_DES_FATTORE, "DES_FATTORE");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_DES_FATTORE,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_DES_CENTRO, "DES_CENTRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTI9,IMDBDef7.PQSL_PROGETTI9_DES_CENTRO,5,60,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PROGETTI9, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaProgettoCfpegVariazioniNuovaVocePEG(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaProgettoCfpegVariazioniNuovaVocePEG()
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
    FormIdx = MyGlb.FRM_SCPRCFVNVPEG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "555F20F2-983E-420C-85FC-E13FAED0404E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 696;
    DesignHeight = 382;
    set_Caption(new IDVariant("Scelta Progetto Cfpeg Variazioni Nuova Voce P E G"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 696;
    Frames[1].Height = 356;
    Frames[1].Caption = "Progetti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 356;
    PAN_PROGETTI = new IDPanel(w, this, 1, "PAN_PROGETTI");
    Frames[1].Content = PAN_PROGETTI;
    PAN_PROGETTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROGETTI.VS = MainFrm.VisualStyleList;
    PAN_PROGETTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 696-MyGlb.PAN_OFFS_X, 356-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "44C9F3CE-1783-4A19-9492-57181C174490");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1052, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SceltaProgettoCfpegVariazioniNuovaVocePEG);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaProgettoCfpegVariazioniNuovaVocePEG.class.getName() : (Glb.ClassWithPackage(SceltaProgettoCfpegVariazioniNuovaVocePEG.class) ? SceltaProgettoCfpegVariazioniNuovaVocePEG.class.getName().substring(SceltaProgettoCfpegVariazioniNuovaVocePEG.class.getPackage().getName().length() + 1) : SceltaProgettoCfpegVariazioniNuovaVocePEG.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Progetti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
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
      PAN_PROGETTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PROGETTI_DESFATTORE,(new IDVariant(PAN_PROGETTI.FieldText(PFL_PROGETTI_DESFATTORE))).stringValue()); 
      PAN_PROGETTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PROGETTI_DESCENTRO,(new IDVariant(PAN_PROGETTI.FieldText(PFL_PROGETTI_DESCENTRO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaProgettoCfpegVariazioniNuovaVocePEG", "ProgettiOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("SceltaProgettoCfpegVariazioniNuovaVocePEG", "LoadEvent", _e);
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
    PAN_PROGETTI.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, "6FA7945D-45DE-486C-B1D4-18E1DA361647");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, "Obiettivo Operativo");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTOID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, "0ED40046-4F1D-490F-8302-78820D5BF7AA");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, "Descrizione");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, "52194848-B1FF-4DB0-BE48-6F454AEFE505");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, "Data inizio");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, "ED30D9B8-67F0-42FA-A166-02577D3F36D4");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, "Ordinamento");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_ORDINAMENTO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, "36A97A3C-1E3F-4E55-AF93-12941EE7B0AA");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, "FATTORE");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, "55B1629C-0A93-4F67-BBB6-36C01554884D");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, "DES FATTORE");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, "B215CFD3-7324-499B-811A-190571978FBB");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, "CENTRO");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, "12B25BFF-4B99-4A17-8E84-DE2DB29AB749");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, "DES CENTRO");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, "8BDC63AE-FD74-44F6-B63F-3D99F6F7B712");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, "Fattore");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, "C12624FE-0A74-4659-A1C9-DEBE0FCF3E0D");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, "Centro");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, MyGlb.VIS_LABEVISUSTYL);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
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
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_PROGETTOID, PPQRY_PROGETTI9, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 76, 36, 328, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_DESCRIZIONE, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_DESCRIZIONE, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_DESCRIZIONE, PPQRY_PROGETTI9, "MAX(A.DES_PROGETTO)", "RECORDDESCRI", 5, 99, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_LIST, 404, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_LIST, 104);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_LIST, "Data inizio");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_FORM, 4, 76, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_FORM, 104);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DATAINIZIO, MyGlb.PANEL_FORM, "Data inizio");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_DATAINIZIO, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_DATAINIZIO, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_DATAINIZIO, PPQRY_PROGETTI9, "MAX(A.DATA_INIZIO_PROG)", "DATA_INIZIO_PROG", 6, 0, 0, -13997);
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
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_ORDINAMENTO, PPQRY_PROGETTI9, "MAX(DECODE(" + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NULL, TO_DATE('1900-01-01','YYYY-MM-DD'), NVL(A.DATA_INIZIO_PROG, TO_DATE('1900-01-01','YYYY-MM-DD'))))", "RECORDORDINA", 6, 0, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, MyGlb.PANEL_LIST, 484, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, MyGlb.PANEL_FORM, 4, 124, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_FATTORE, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_FATTORE, PPQRY_PROGETTI9, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, MyGlb.PANEL_LIST, 540, 36, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, MyGlb.PANEL_LIST, 76);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, MyGlb.PANEL_LIST, "DES FATTORE");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, MyGlb.PANEL_FORM, 4, 148, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, MyGlb.PANEL_FORM, 76);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESFATTORE, MyGlb.PANEL_FORM, "DES FATT.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_DESFATTORE, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_DESFATTORE, PPQRY_PROGETTI9, "A.DES_FATTORE", "DES_FATTORE", 5, 60, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, MyGlb.PANEL_LIST, 768, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, MyGlb.PANEL_FORM, 4, 172, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_CENTRO, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_CENTRO, PPQRY_PROGETTI9, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, MyGlb.PANEL_LIST, 824, 36, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, MyGlb.PANEL_LIST, 72);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, MyGlb.PANEL_LIST, "DES CENTRO");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, MyGlb.PANEL_FORM, 4, 196, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, MyGlb.PANEL_FORM, 72);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCENTRO, MyGlb.PANEL_FORM, "DES CENT.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_DESCENTRO, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_DESCENTRO, PPQRY_PROGETTI9, "A.DES_CENTRO", "DES_CENTRO", 5, 60, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, MyGlb.PANEL_LIST, 484, 0, 284, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, MyGlb.PANEL_LIST, 2);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, MyGlb.PANEL_FORM, 644, 0, 364, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL, MyGlb.PANEL_FORM, 2);
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_LABEL, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, MyGlb.PANEL_LIST, 768, 0, 284, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, MyGlb.PANEL_LIST, 0);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, MyGlb.PANEL_LIST, 2);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, MyGlb.PANEL_FORM, 652, 8, 364, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, MyGlb.PANEL_FORM, 0);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_LABEL1, MyGlb.PANEL_FORM, 2);
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_LABEL1, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_LABEL1, -1, "", "LABEL1", 0, 0, 0, -13997);
  }

  private void PAN_PROGETTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROGETTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PROGETTI.SetIMDB(IMDB, "PQRY_PROGETTI9", true);
    PAN_PROGETTI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  MAX(A.DES_PROGETTO) as RECORDDESCRI, ");
    SQL.append("  MAX(A.DATA_INIZIO_PROG) as DATA_INIZIO_PROG, ");
    SQL.append("  MAX(DECODE(" + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NULL, TO_DATE('1900-01-01','YYYY-MM-DD'), NVL(A.DATA_INIZIO_PROG, TO_DATE('1900-01-01','YYYY-MM-DD')))) as RECORDORDINA, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.DES_FATTORE as DES_FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.DES_CENTRO as DES_CENTRO ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_ELENCO_PROG_FC A ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NVL(A.DATA_FINE_PROG, TO_DATE('1900-01-01','YYYY-MM-DD')) < TRUNC( SYSDATE )) ");
    SQL.append("and   (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = ~~TBL_PARAMETRI386.ROWNAMEUOIMP~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI386.ROWNAMEES~~) ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.PROGETTO_ID, ");
    SQL.append("  A.FATTORE, ");
    SQL.append("  A.CENTRO, ");
    SQL.append("  A.DES_FATTORE, ");
    SQL.append("  A.DES_CENTRO ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 4, 1 ");
    PAN_PROGETTI.SetQuery(PPQRY_PROGETTI9, 5, SQL, -1, "");
    PAN_PROGETTI.SetQueryDB(PPQRY_PROGETTI9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGETTI.SetMasterTable(0, "POL_ELENCO_PROG_FC");
    PAN_PROGETTI.AddToSortList(PFL_PROGETTI_ORDINAMENTO, true);
    PAN_PROGETTI.AddToSortList(PFL_PROGETTI_PROGETTOID, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
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
