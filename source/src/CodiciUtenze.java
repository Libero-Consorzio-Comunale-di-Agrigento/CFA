// **********************************************
// Codici Utenze
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CodiciUtenze extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CODICIUTENZE_CODICEUTENZA = 0;
  private static int PFL_CODICIUTENZE_DESCRIZIONE = 1;
  private static int PFL_CODICIUTENZE_COMPETENZDAL = 2;
  private static int PFL_CODICIUTENZE_COMPETENZAAL = 3;
  private static int PFL_CODICIUTENZE_FATTORE = 4;
  private static int PFL_CODICIUTENZE_CENTRO = 5;

  private static int PPQRY_CODICIUTENZ1 = 0;


  IDPanel PAN_CODICIUTENZE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM93(IMDB);
    //
    //
    Init_PQRY_CODICIUTENZ1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM93(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM93, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM93, "TBL_PARAM93");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM93,IMDBDef1.FLD_PARAM93_NOMOGGTIPUTE, "NOMOGGTIPUTE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM93,IMDBDef1.FLD_PARAM93_NOMOGGTIPUTE,5,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM93, 0);
  }

  private static void Init_PQRY_CODICIUTENZ1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_CODICIUTENZ1, 7);
    IMDB.set_TblCode(IMDBDef7.PQRY_CODICIUTENZ1, "PQRY_CODICIUTENZ1");
    IMDB.set_FldCode(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODUTETIPUTE, "CODUTETIPUTE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODUTETIPUTE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODUTECODUTE, "CODUTECODUTE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODUTECODUTE,5,12,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODIUTENDESC, "CODIUTENDESC");
    IMDB.SetFldParams(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODIUTENDESC,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODUTECOMDAL, "CODUTECOMDAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODUTECOMDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODIUTECOMAL, "CODIUTECOMAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODIUTECOMAL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODIUTENFATT, "CODIUTENFATT");
    IMDB.SetFldParams(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODIUTENFATT,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODIUTENCENT, "CODIUTENCENT");
    IMDB.SetFldParams(IMDBDef7.PQRY_CODICIUTENZ1,IMDBDef7.PQSL_CODICIUTENZ1_CODIUTENCENT,5,8,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_CODICIUTENZ1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CodiciUtenze(MyWebEntryPoint w, IMDBObj imdb)
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
  public CodiciUtenze()
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
    FormIdx = MyGlb.FRM_CODICIUTENZE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "04B3BBED-AF2A-4D59-9858-39642C802FBC";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 728;
    DesignHeight = 362;
    set_Caption(new IDVariant("Codici Utenze"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 728;
    Frames[1].Height = 336;
    Frames[1].Caption = "Codici Utenze";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_CODICIUTENZE = new IDPanel(w, this, 1, "PAN_CODICIUTENZE");
    Frames[1].Content = PAN_CODICIUTENZE;
    PAN_CODICIUTENZE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CODICIUTENZE.VS = MainFrm.VisualStyleList;
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 728-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CODICIUTENZE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C0F6AE66-7240-4D6F-A497-38F2AB8B3E05");
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 628, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CODICIUTENZE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CODICIUTENZE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CODICIUTENZE.InitStatus = 2;
    PAN_CODICIUTENZE_Init();
    PAN_CODICIUTENZE_InitFields();
    PAN_CODICIUTENZE_InitQueries();
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
      PAN_CODICIUTENZE.UpdatePanel(MainFrm);
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
    return (obj instanceof CodiciUtenze);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CodiciUtenze.class.getName() : (Glb.ClassWithPackage(CodiciUtenze.class) ? CodiciUtenze.class.getName().substring(CodiciUtenze.class.getPackage().getName().length() + 1) : CodiciUtenze.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Codici Utenze On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CODICIUTENZE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CODICIUTENZE);
      // 
      // Codici Utenze On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CODICIUTENZE.set_ToolTip(Glb.OBJ_FIELD,PFL_CODICIUTENZE_DESCRIZIONE,IMDB.Value(IMDBDef7.PQRY_CODICIUTENZ1, IMDBDef7.PQSL_CODICIUTENZ1_CODIUTENDESC, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciUtenze", "CodiciUtenzeOnDynamicProperties", _e);
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
  private void PAN_CODICIUTENZE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CODICIUTENZE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CODICIUTENZE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CODICIUTENZE, Cancel);
    // Stub
  }

  private void PAN_CODICIUTENZE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CODICIUTENZE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CODICIUTENZE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CODICIUTENZE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CODICIUTENZE_Init()
  {

    PAN_CODICIUTENZE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CODICIUTENZE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CODICIUTENZE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_CODICIUTENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, "860447F1-BFBD-4613-A502-FD1966F87DCA");
    PAN_CODICIUTENZE.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, "Codice Utenza");
    PAN_CODICIUTENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, "");
    PAN_CODICIUTENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIUTENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CODICIUTENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, "BF1945EC-5EFE-47E1-875A-2A1F1B0973E2");
    PAN_CODICIUTENZE.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, "Descrizione");
    PAN_CODICIUTENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, "Descrizione dell'Utenza");
    PAN_CODICIUTENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIUTENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIUTENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, "3D5CAA37-9E01-4F73-9F92-032EF8066C20");
    PAN_CODICIUTENZE.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, "Competenza dal");
    PAN_CODICIUTENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, "");
    PAN_CODICIUTENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIUTENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIUTENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, "3B583B8C-946E-48F9-A418-D6E153CCB8CA");
    PAN_CODICIUTENZE.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, "Competenza al");
    PAN_CODICIUTENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, "");
    PAN_CODICIUTENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIUTENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIUTENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, "100AED0E-1315-4043-BCB4-056775946975");
    PAN_CODICIUTENZE.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, "Fattore");
    PAN_CODICIUTENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, "");
    PAN_CODICIUTENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIUTENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIUTENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, "2292B827-C9B0-4F51-85DC-B44AB268273E");
    PAN_CODICIUTENZE.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, "Centro");
    PAN_CODICIUTENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, "");
    PAN_CODICIUTENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIUTENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CODICIUTENZE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, MyGlb.PANEL_LIST, 96);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, MyGlb.PANEL_LIST, "Codice Utenza");
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, MyGlb.PANEL_FORM, 4, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, MyGlb.PANEL_FORM, 112);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CODICEUTENZA, MyGlb.PANEL_FORM, "Codice Utenza");
    PAN_CODICIUTENZE.SetFieldPage(PFL_CODICIUTENZE_CODICEUTENZA, -1, -1);
    PAN_CODICIUTENZE.SetFieldPanel(PFL_CODICIUTENZE_CODICEUTENZA, PPQRY_CODICIUTENZ1, "A.CODICE_UTENZA", "CODUTECODUTE", 5, 12, 0, -13997);
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, MyGlb.PANEL_LIST, 112, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, MyGlb.PANEL_FORM, 112);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CODICIUTENZE.SetFieldPage(PFL_CODICIUTENZE_DESCRIZIONE, -1, -1);
    PAN_CODICIUTENZE.SetFieldPanel(PFL_CODICIUTENZE_DESCRIZIONE, PPQRY_CODICIUTENZ1, "A.DESCRIZIONE", "CODIUTENDESC", 5, 40, 0, -13997);
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, MyGlb.PANEL_LIST, 344, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, MyGlb.PANEL_LIST, 108);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza dal");
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, MyGlb.PANEL_FORM, 108);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza dal");
    PAN_CODICIUTENZE.SetFieldPage(PFL_CODICIUTENZE_COMPETENZDAL, -1, -1);
    PAN_CODICIUTENZE.SetFieldPanel(PFL_CODICIUTENZE_COMPETENZDAL, PPQRY_CODICIUTENZ1, "A.COMPETENZA_DAL", "CODUTECOMDAL", 6, 19, 0, -13997);
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, MyGlb.PANEL_LIST, 424, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, MyGlb.PANEL_LIST, 100);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, MyGlb.PANEL_LIST, "Competenza al");
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, MyGlb.PANEL_FORM, 4, 100, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, MyGlb.PANEL_FORM, 100);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_COMPETENZAAL, MyGlb.PANEL_FORM, "Competenza al");
    PAN_CODICIUTENZE.SetFieldPage(PFL_CODICIUTENZE_COMPETENZAAL, -1, -1);
    PAN_CODICIUTENZE.SetFieldPanel(PFL_CODICIUTENZE_COMPETENZAAL, PPQRY_CODICIUTENZ1, "A.COMPETENZA_AL", "CODIUTECOMAL", 6, 19, 0, -13997);
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, MyGlb.PANEL_LIST, 504, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_CODICIUTENZE.SetFieldPage(PFL_CODICIUTENZE_FATTORE, -1, -1);
    PAN_CODICIUTENZE.SetFieldPanel(PFL_CODICIUTENZE_FATTORE, PPQRY_CODICIUTENZ1, "A.FATTORE", "CODIUTENFATT", 5, 8, 0, -13997);
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, MyGlb.PANEL_LIST, 568, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_CODICIUTENZE.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIUTENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_CODICIUTENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_CODICIUTENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIUTENZE_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_CODICIUTENZE.SetFieldPage(PFL_CODICIUTENZE_CENTRO, -1, -1);
    PAN_CODICIUTENZE.SetFieldPanel(PFL_CODICIUTENZE_CENTRO, PPQRY_CODICIUTENZ1, "A.CENTRO", "CODIUTENCENT", 5, 8, 0, -13997);
  }

  private void PAN_CODICIUTENZE_InitQueries()
  {
    StringBuffer SQL;

    PAN_CODICIUTENZE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CODICIUTENZE.SetIMDB(IMDB, "PQRY_CODICIUTENZ1", true);
    PAN_CODICIUTENZE.set_SetString(MyGlb.MASTER_ROWNAME, "CODICI UTENZE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_UTENZA as CODUTETIPUTE, ");
    SQL.append("  A.CODICE_UTENZA as CODUTECODUTE, ");
    SQL.append("  A.DESCRIZIONE as CODIUTENDESC, ");
    SQL.append("  A.COMPETENZA_DAL as CODUTECOMDAL, ");
    SQL.append("  A.COMPETENZA_AL as CODIUTECOMAL, ");
    SQL.append("  A.FATTORE as CODIUTENFATT, ");
    SQL.append("  A.CENTRO as CODIUTENCENT ");
    PAN_CODICIUTENZE.SetQuery(PPQRY_CODICIUTENZ1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CODICI_UTENZE A ");
    PAN_CODICIUTENZE.SetQuery(PPQRY_CODICIUTENZ1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_UTENZA = ~~TBL_PARAM93.NOMOGGTIPUTE~~) ");
    PAN_CODICIUTENZE.SetQuery(PPQRY_CODICIUTENZ1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICIUTENZE.SetQuery(PPQRY_CODICIUTENZ1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICIUTENZE.SetQuery(PPQRY_CODICIUTENZ1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE_UTENZA ");
    PAN_CODICIUTENZE.SetQuery(PPQRY_CODICIUTENZ1, 5, SQL, -1, "");
    PAN_CODICIUTENZE.SetQueryDB(PPQRY_CODICIUTENZ1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CODICIUTENZE.SetMasterTable(0, "CODICI_UTENZE");
    PAN_CODICIUTENZE.AddToSortList(PFL_CODICIUTENZE_CODICEUTENZA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CODICIUTENZE.Status() == 2)
    {
      int oldListQBE = PAN_CODICIUTENZE.iUseListQBE;
      PAN_CODICIUTENZE.iUseListQBE = 0;
      PAN_CODICIUTENZE.PanelCommand(Glb.PCM_SEARCH);
      PAN_CODICIUTENZE.PanelCommand(Glb.PCM_FIND);
      PAN_CODICIUTENZE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CODICIUTENZE) PAN_CODICIUTENZE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CODICIUTENZE) PAN_CODICIUTENZE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CODICIUTENZE) PAN_CODICIUTENZE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CODICIUTENZE) PAN_CODICIUTENZE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CODICIUTENZE) PAN_CODICIUTENZE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
