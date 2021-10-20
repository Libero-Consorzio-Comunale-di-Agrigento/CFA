// **********************************************
// Scelta Ufficio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaUfficio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_UFFICIO_UFFICIO = 0;

  private static int PFL_UFFICIO_BOTTONIMPOST = 0;
  private static int PFL_UFFICIO_RIEMPIGRUPPO = 1;
  private static int PFL_UFFICIO_UFFICIO = 2;
  private static int PFL_UFFICIO_SPIEGAZIONI = 3;

  private static int PPQRY_DATISESSION3 = 0;

  private static int PPQRY_T53 = 1;


  IDPanel PAN_UFFICIO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_DATISESSION3(IMDB);
    Init_PQRY_DATISESSION3_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_DATISESSION3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DATISESSION3, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_DATISESSION3, "PQRY_DATISESSION3");
    IMDB.set_FldCode(IMDBDef8.PQRY_DATISESSION3,IMDBDef8.PQSL_DATISESSION3_SESSIOUFFICI, "SESSIOUFFICI");
    IMDB.SetFldParams(IMDBDef8.PQRY_DATISESSION3,IMDBDef8.PQSL_DATISESSION3_SESSIOUFFICI,1,5,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_DATISESSION3, 0);
  }

  private static void Init_PQRY_DATISESSION3_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DATISESSION3_RS, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_DATISESSION3_RS, "PQRY_DATISESSION3_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_DATISESSION3_RS,IMDBDef8.PQSL_DATISESSION3_SESSIOUFFICI, "SESSIOUFFICI");
    IMDB.SetFldParams(IMDBDef8.PQRY_DATISESSION3_RS,IMDBDef8.PQSL_DATISESSION3_SESSIOUFFICI,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaUfficio(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaUfficio()
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
    FormIdx = MyGlb.FRM_SCELTAUFFICI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "51EE92C3-B2C5-4D19-AD11-3838B8A34AF3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 432;
    DesignHeight = 210;
    set_Caption(new IDVariant("Scelta Ufficio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 432;
    Frames[1].Height = 184;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Ufficio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 184;
    PAN_UFFICIO = new IDPanel(w, this, 1, "PAN_UFFICIO");
    Frames[1].Content = PAN_UFFICIO;
    PAN_UFFICIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_UFFICIO.VS = MainFrm.VisualStyleList;
    PAN_UFFICIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 432-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_UFFICIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "21C40B3B-6D3D-4EB5-B8BD-F3D8A660383D");
    PAN_UFFICIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 44, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_UFFICIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_UFFICIO.InitStatus = 2;
    PAN_UFFICIO_Init();
    PAN_UFFICIO_InitFields();
    PAN_UFFICIO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_DATISESSIONE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELTAUFFICI_DATISESSION3();
      }
      PAN_UFFICIO.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaUfficio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaUfficio.class.getName() : (Glb.ClassWithPackage(SceltaUfficio.class) ? SceltaUfficio.class.getName().substring(SceltaUfficio.class.getPackage().getName().length() + 1) : SceltaUfficio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Impost
  // **********************************************************************
  public int Impost ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impost Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0, IMDB.Value(IMDBDef8.PQRY_DATISESSION3, IMDBDef8.PQSL_DATISESSION3_SESSIOUFFICI, 0));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaUfficio", "Impost", _e);
      return -1;
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
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaUfficio", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Dati Sessione
  // Primary record source for panel data
  // **********************************************************************
  private void SCELTAUFFICI_DATISESSION3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_DATISESSION3_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_DATISESSIONE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_DATISESSIONE, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_DATISESSION3_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_DATISESSION3_RS, 0, IMDBDef7.TBL_DATISESSIONE, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_DATISESSION3_RS, 0, 0, IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_DATISESSIONE, 0);
      if (IMDB.Eof(IMDBDef7.TBL_DATISESSIONE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_DATISESSIONE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_DATISESSION3_RS, 0);
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
  private void PAN_UFFICIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_UFFICIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_UFFICIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_UFFICIO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_UFFICIO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_UFFICIO);
    // Stub
  }

  private void PAN_UFFICIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_UFFICIO_BOTTONIMPOST)
    {
      this.IdxPanelActived = this.PAN_UFFICIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Impost();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_UFFICIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_UFFICIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_UFFICIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_UFFICIO_Init()
  {

    PAN_UFFICIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_UFFICIO.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_UFFICIO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, "FF04496C-8F8D-4859-983A-92521F64A18E");
    PAN_UFFICIO.set_Header(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, "Ufficio");
    PAN_UFFICIO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, "");
    PAN_UFFICIO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, MyGlb.VIS_GROUPSTYLE);
    PAN_UFFICIO.SetRect(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, MyGlb.PANEL_LIST, 0, -9999, 44, 16, 0, 0);
    PAN_UFFICIO.SetRect(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, MyGlb.PANEL_FORM, 28, 42, 328, 62, 0, 0);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, 0, 35);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, 1, 13);
    PAN_UFFICIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, 0, 4);
    PAN_UFFICIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, 1, 2);
    PAN_UFFICIO.SetFlags(MyGlb.OBJ_GROUP, GRP_UFFICIO_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_UFFICIO.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_UFFICIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, "79545A91-22C5-4B24-9D2E-2B1A6DD6469E");
    PAN_UFFICIO.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, "Imposta>>");
    PAN_UFFICIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, MyGlb.VIS_STATICBUTTON);
    PAN_UFFICIO.SetImage(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, 0, "button1.gif", false);
    PAN_UFFICIO.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_UFFICIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, "E9805CAB-6E6A-4EE9-874E-071FF38C6251");
    PAN_UFFICIO.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, "");
    PAN_UFFICIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, MyGlb.VIS_SFONEBORDTRA);
    PAN_UFFICIO.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_UFFICIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, "AFDB1335-6481-4F2D-AB99-312173AA32A2");
    PAN_UFFICIO.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, "Ufficio");
    PAN_UFFICIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, "");
    PAN_UFFICIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_UFFICIO.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_UFFICIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, "EA84E9EF-BAC8-4BE5-9856-6E861CCD4659");
    PAN_UFFICIO.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, "Selezionare l'Ufficio di appartenenza e premere Imposta");
    PAN_UFFICIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, MyGlb.VIS_DICITUGENERI);
    PAN_UFFICIO.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_UFFICIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_UFFICIO.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, MyGlb.PANEL_LIST, 232, 52, 96, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, MyGlb.PANEL_LIST, 0);
    PAN_UFFICIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, MyGlb.PANEL_LIST, 1);
    PAN_UFFICIO.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, MyGlb.PANEL_FORM, 276, 128, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, MyGlb.PANEL_FORM, 0);
    PAN_UFFICIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICIO_BOTTONIMPOST, MyGlb.PANEL_FORM, 1);
    PAN_UFFICIO.SetFieldPage(PFL_UFFICIO_BOTTONIMPOST, -1, -1);
    PAN_UFFICIO.SetFieldPanel(PFL_UFFICIO_BOTTONIMPOST, -1, "", "BOTTONIMPOST", 0, 0, 0, -13997);
    PAN_UFFICIO.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, MyGlb.PANEL_LIST, 16, 32, 156, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, MyGlb.PANEL_LIST, 0);
    PAN_UFFICIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, MyGlb.PANEL_LIST, 4);
    PAN_UFFICIO.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, MyGlb.PANEL_FORM, 32, 80, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, MyGlb.PANEL_FORM, 0);
    PAN_UFFICIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICIO_RIEMPIGRUPPO, MyGlb.PANEL_FORM, 1);
    PAN_UFFICIO.SetFieldPage(PFL_UFFICIO_RIEMPIGRUPPO, -1, GRP_UFFICIO_UFFICIO);
    PAN_UFFICIO.SetFieldPanel(PFL_UFFICIO_RIEMPIGRUPPO, -1, "", "RIEMPIGRUPPO", 0, 0, 0, -13997);
    PAN_UFFICIO.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, MyGlb.PANEL_LIST, 44);
    PAN_UFFICIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_UFFICIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_UFFICIO.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, MyGlb.PANEL_FORM, 52, 56, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_UFFICIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_UFFICIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICIO_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_UFFICIO.SetFieldPage(PFL_UFFICIO_UFFICIO, -1, GRP_UFFICIO_UFFICIO);
    PAN_UFFICIO.SetFieldPanel(PFL_UFFICIO_UFFICIO, PPQRY_DATISESSION3, "A.SESSIOUFFICI", "SESSIOUFFICI", 1, 5, 0, -13997);
    PAN_UFFICIO.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, MyGlb.PANEL_LIST, 12, 4, 396, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, MyGlb.PANEL_LIST, 0);
    PAN_UFFICIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_UFFICIO.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, MyGlb.PANEL_FORM, 28, 8, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, MyGlb.PANEL_FORM, 0);
    PAN_UFFICIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICIO_SPIEGAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_UFFICIO.SetFieldPage(PFL_UFFICIO_SPIEGAZIONI, -1, -1);
    PAN_UFFICIO.SetFieldPanel(PFL_UFFICIO_SPIEGAZIONI, -1, "", "SPIEGAZIONI", 0, 0, 0, -13997);
  }

  private void PAN_UFFICIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_UFFICIO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53CODICE1 ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~SESSIOUFFICI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_UFFICIO.SetQuery(PPQRY_T53, 0, SQL, PFL_UFFICIO_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53CODICE1 ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_UFFICIO.SetQuery(PPQRY_T53, 1, SQL, PFL_UFFICIO_UFFICIO, "");
    PAN_UFFICIO.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_UFFICIO.SetIMDB(IMDB, "PQRY_DATISESSION3", true);
    PAN_UFFICIO.set_SetString(MyGlb.MASTER_ROWNAME, "Sessione");
    PAN_UFFICIO.SetQueryIMDB(PPQRY_DATISESSION3, IMDBDef8.PQRY_DATISESSION3_RS, IMDBDef7.TBL_DATISESSIONE);
    JustLoaded = true;
    PAN_UFFICIO.SetFieldPrimaryIndex(PFL_UFFICIO_UFFICIO, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI);
    PAN_UFFICIO.SetMasterTable(0, "DATISESSIONE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_UFFICIO.Status() == 2)
    {
      int oldListQBE = PAN_UFFICIO.iUseListQBE;
      PAN_UFFICIO.iUseListQBE = 0;
      PAN_UFFICIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_UFFICIO.PanelCommand(Glb.PCM_FIND);
      PAN_UFFICIO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_UFFICIO) PAN_UFFICIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_UFFICIO) PAN_UFFICIO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_UFFICIO) PAN_UFFICIO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_UFFICIO) PAN_UFFICIO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_UFFICIO) PAN_UFFICIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
