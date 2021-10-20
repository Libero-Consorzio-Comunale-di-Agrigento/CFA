// **********************************************
// Tipi Avanzo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiAvanzo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPIAVANZO_CODICE = 0;
  private static int PFL_TIPIAVANZO_DESCRIZIONE = 1;
  private static int PFL_TIPIAVANZO_CODAVANZVINC = 2;
  private static int PFL_TIPIAVANZO_NOTE = 3;

  private static int PPQRY_TIPIAVANZO1 = 0;

  private static int PPQRY_ATTRIBUTICFA = 1;


  IDPanel PAN_TIPIAVANZO;
  CIDREObj BUK_LIBRTIPIAVAN;
  OBook BKW_LIBRTIPIAVAN;
  //
  // Template Pages constants
  private static int BUK_LIBRTIPIAVAN_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBRTIPIAVAN_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBRTIPIAVAN_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA = 4;

  //
  // Reports constants
  private static int BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT = 5;
  private static int BUK_LIBRTIPIAVAN_SEC_INTESTREPORT = 6;
  private static int BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA = 7;
  private static int BUK_LIBRTIPIAVAN_RPTBOX_TITOLO = 8;
  private static int BUK_LIBRTIPIAVAN_SPAN_NUOVASPAN = 9;
  private static int BUK_LIBRTIPIAVAN_RPTBOX_CODICEHEADER = 10;
  private static int BUK_LIBRTIPIAVAN_SPAN_TIPIAVANCOD1 = 11;
  private static int BUK_LIBRTIPIAVAN_RPTBOX_DESCRIHEADER = 12;
  private static int BUK_LIBRTIPIAVAN_SPAN_TIPIAVANDES1 = 13;
  private static int BUK_LIBRTIPIAVAN_RPTBOX_NOTEHEADER = 14;
  private static int BUK_LIBRTIPIAVAN_SPAN_TIPIAVANNOT1 = 15;
  private static int BUK_LIBRTIPIAVAN_SEC_DETTAGLIO = 16;
  private static int BUK_LIBRTIPIAVAN_RPTBOX_CODICE = 17;
  private static int BUK_LIBRTIPIAVAN_SPAN_TIAVCOTIALTA = 18;
  private static int BUK_LIBRTIPIAVAN_RPTBOX_DESCRIZIONE = 19;
  private static int BUK_LIBRTIPIAVAN_SPAN_TIPIAVANDESC = 20;
  private static int BUK_LIBRTIPIAVAN_RPTBOX_NOTE = 21;
  private static int BUK_LIBRTIPIAVAN_SPAN_TIPIAVANNOTE = 22;
  private static int BUK_LIBRTIPIAVAN_SEC_PIEDEPAGINA = 23;
  private static int BUK_LIBRTIPIAVAN_SEC_PIEDEREPORT = 24;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_TIPIAVANZO1(IMDB);
    Init_PQRY_TIPIAVANZO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_TIPIAVANZO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPIAVANZO1, 4);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPIAVANZO1, "PQRY_TIPIAVANZO1");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIAVANZO1,IMDBDef8.PQSL_TIPIAVANZO1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIAVANZO1,IMDBDef8.PQSL_TIPIAVANZO1_CODICE,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIAVANZO1,IMDBDef8.PQSL_TIPIAVANZO1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIAVANZO1,IMDBDef8.PQSL_TIPIAVANZO1_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIAVANZO1,IMDBDef8.PQSL_TIPIAVANZO1_COD_AVANZO_VINCA2, "COD_AVANZO_VINCA2");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIAVANZO1,IMDBDef8.PQSL_TIPIAVANZO1_COD_AVANZO_VINCA2,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIAVANZO1,IMDBDef8.PQSL_TIPIAVANZO1_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIAVANZO1,IMDBDef8.PQSL_TIPIAVANZO1_NOTE,5,2000,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_TIPIAVANZO1, 0);
  }

  private static void Init_PQRY_TIPIAVANZO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPIAVANZO, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPIAVANZO, "PQRY_TIPIAVANZO");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIAVANZO,IMDBDef8.PQSL_TIPIAVANZO_TIPIAVANCODI, "TIPIAVANCODI");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIAVANZO,IMDBDef8.PQSL_TIPIAVANZO_TIPIAVANCODI,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIAVANZO,IMDBDef8.PQSL_TIPIAVANZO_TIPIAVANDESC, "TIPIAVANDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIAVANZO,IMDBDef8.PQSL_TIPIAVANZO_TIPIAVANDESC,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIAVANZO,IMDBDef8.PQSL_TIPIAVANZO_TIPIAVANNOTE, "TIPIAVANNOTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIAVANZO,IMDBDef8.PQSL_TIPIAVANZO_TIPIAVANNOTE,5,2000,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_TIPIAVANZO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiAvanzo(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiAvanzo()
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
    FormIdx = MyGlb.FRM_TIPIAVANZO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C9469858-0BDF-4613-B7A7-3F9FD921DC6E";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1168;
    DesignHeight = 310;
    set_Caption(new IDVariant("Tipi Avanzo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1168;
    Frames[1].Height = 284;
    Frames[1].Caption = "Tipi Avanzo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 284;
    PAN_TIPIAVANZO = new IDPanel(w, this, 1, "PAN_TIPIAVANZO");
    Frames[1].Content = PAN_TIPIAVANZO;
    PAN_TIPIAVANZO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIAVANZO.VS = MainFrm.VisualStyleList;
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1168-MyGlb.PAN_OFFS_X, 284-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBRTIPIAVAN != null)
      PAN_TIPIAVANZO.SetBook(BUK_LIBRTIPIAVAN);
    PAN_TIPIAVANZO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FF5353DA-A66E-4DD7-AD84-85BD664E0A8E");
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1120, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIAVANZO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIAVANZO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIAVANZO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIAVANZO.InitStatus = 2;
    PAN_TIPIAVANZO_Init();
    PAN_TIPIAVANZO_InitFields();
    PAN_TIPIAVANZO_InitQueries();
    BKW_LIBRTIPIAVAN = new OBook(this);
    BUK_LIBRTIPIAVAN = new CIDREObj(BKW_LIBRTIPIAVAN);
    BKW_LIBRTIPIAVAN.iGuid = "D5DE3FCC-4A6E-46E3-A2AD-60B42148B9EA";
    BKW_LIBRTIPIAVAN.Code = "BUK_LIBRTIPIAVAN";
    BKW_LIBRTIPIAVAN.BookObj = BUK_LIBRTIPIAVAN;
    BKW_LIBRTIPIAVAN.InitDefMasks();
    BUK_LIBRTIPIAVAN.InitBook(1, 1245185, "Libro Tipi Avanzo", IMDB, MainFrm.VisualStyleList);
    BUK_LIBRTIPIAVAN.InitHTML();
    BUK_LIBRTIPIAVAN.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBRTIPIAVAN.Book.SetMainFrm(MainFrm);
    BUK_LIBRTIPIAVAN.SetRTCGuid(0, "D5DE3FCC-4A6E-46E3-A2AD-60B42148B9EA");
    BUK_LIBRTIPIAVAN.SetObjCode(0, "LIBRTIPIAVAN");
    if (PAN_TIPIAVANZO != null)
      PAN_TIPIAVANZO.SetBook(BUK_LIBRTIPIAVAN);
    BUK_LIBRTIPIAVAN_MST_NUOVPAGIMAST_Init();
    BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT_Init();
    BUK_LIBRTIPIAVAN_InitLinks();
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
      PAN_TIPIAVANZO.UpdatePanel(MainFrm);
      // BUK_LIBRTIPIAVAN.UpdateBook();
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
    if (Code.equals("BUK_LIBRTIPIAVAN")) return BUK_LIBRTIPIAVAN;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiAvanzo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiAvanzo.class.getName() : (Glb.ClassWithPackage(TipiAvanzo.class) ? TipiAvanzo.class.getName().substring(TipiAvanzo.class.getPackage().getName().length() + 1) : TipiAvanzo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Avanzo On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIAVANZO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIAVANZO);
      // 
      // Tipi Avanzo On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (PAN_TIPIAVANZO.IsNewRow())
      {
        PAN_TIPIAVANZO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIAVANZO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_TIPIAVANZO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIAVANZO_DESCRIZIONE,(new IDVariant(PAN_TIPIAVANZO.FieldText(PFL_TIPIAVANZO_DESCRIZIONE))).stringValue()); 
      PAN_TIPIAVANZO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIAVANZO_NOTE,(new IDVariant(PAN_TIPIAVANZO.FieldText(PFL_TIPIAVANZO_NOTE))).stringValue()); 
      PAN_TIPIAVANZO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIAVANZO_CODAVANZVINC,(new IDVariant(PAN_TIPIAVANZO.FieldText(PFL_TIPIAVANZO_CODAVANZVINC))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiAvanzo", "TipiAvanzoOnDynamicProperties", _e);
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
  private void PAN_TIPIAVANZO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TIPIAVANZO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPIAVANZO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIAVANZO, Cancel);
    // Stub
  }

  private void PAN_TIPIAVANZO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIAVANZO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIAVANZO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIAVANZO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBRTIPIAVAN_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBRTIPIAVAN_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBRTIPIAVAN_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBRTIPIAVAN_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_LIBRTIPIAVAN_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_LIBRTIPIAVAN_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBRTIPIAVAN_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBRTIPIAVAN_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBRTIPIAVAN_MST_NUOVPAGIMAST)
    {
      BUK_LIBRTIPIAVAN.set_SpanValue(BUK_LIBRTIPIAVAN_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRTIPIAVAN.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRTIPIAVAN.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBRTIPIAVAN_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBRTIPIAVAN_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBRTIPIAVAN_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBRTIPIAVAN_OnPreview()
  {
    PreviewBook = BKW_LIBRTIPIAVAN;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIAVANZO_Init()
  {

    PAN_TIPIAVANZO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIAVANZO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIAVANZO.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_TIPIAVANZO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, "BBD064CB-82D6-47E4-90FA-4D898765E573");
    PAN_TIPIAVANZO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, "Codice");
    PAN_TIPIAVANZO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, "");
    PAN_TIPIAVANZO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, MyGlb.VIS_INTE10NORFIE);
    PAN_TIPIAVANZO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIAVANZO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, "0AA49400-CCA6-45C3-A739-D5E5766C3125");
    PAN_TIPIAVANZO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, "Descrizione");
    PAN_TIPIAVANZO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, "");
    PAN_TIPIAVANZO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIAVANZO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_TIPIAVANZO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, "A6B1FB95-6702-4A0C-8B78-11097022D8FD");
    PAN_TIPIAVANZO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, "Fondo Accantonamento");
    PAN_TIPIAVANZO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, "");
    PAN_TIPIAVANZO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIAVANZO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIAVANZO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, "09A56740-2FE1-4B2B-AFE3-52858809FF7A");
    PAN_TIPIAVANZO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, "Note");
    PAN_TIPIAVANZO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, "");
    PAN_TIPIAVANZO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIAVANZO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPIAVANZO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIAVANZO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_TIPIAVANZO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIAVANZO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIAVANZO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_TIPIAVANZO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIAVANZO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIAVANZO.SetFieldPage(PFL_TIPIAVANZO_CODICE, -1, -1);
    PAN_TIPIAVANZO.SetFieldPanel(PFL_TIPIAVANZO_CODICE, PPQRY_TIPIAVANZO1, "A.CODICE", "CODICE", 3, 10, 0, -13997);
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, MyGlb.PANEL_LIST, 64, 36, 396, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIAVANZO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_TIPIAVANZO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIAVANZO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIAVANZO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_TIPIAVANZO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIAVANZO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIAVANZO.SetFieldPage(PFL_TIPIAVANZO_DESCRIZIONE, -1, -1);
    PAN_TIPIAVANZO.SetFieldPanel(PFL_TIPIAVANZO_DESCRIZIONE, PPQRY_TIPIAVANZO1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, MyGlb.PANEL_LIST, 460, 36, 284, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIAVANZO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, MyGlb.PANEL_LIST, 124);
    PAN_TIPIAVANZO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIAVANZO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, MyGlb.PANEL_LIST, "Fondo Accantonamento");
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, MyGlb.PANEL_FORM, 4, 100, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIAVANZO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, MyGlb.PANEL_FORM, 124);
    PAN_TIPIAVANZO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIAVANZO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_CODAVANZVINC, MyGlb.PANEL_FORM, "Fon. Accanton.");
    PAN_TIPIAVANZO.SetFieldPage(PFL_TIPIAVANZO_CODAVANZVINC, -1, -1);
    PAN_TIPIAVANZO.SetFieldPanel(PFL_TIPIAVANZO_CODAVANZVINC, PPQRY_TIPIAVANZO1, "A.COD_AVANZO_VINCA2", "COD_AVANZO_VINCA2", 5, 50, 0, -13997);
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, MyGlb.PANEL_LIST, 744, 36, 376, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIAVANZO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, MyGlb.PANEL_LIST, 96);
    PAN_TIPIAVANZO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIAVANZO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, MyGlb.PANEL_LIST, "Note");
    PAN_TIPIAVANZO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, MyGlb.PANEL_FORM, 4, 52, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIAVANZO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, MyGlb.PANEL_FORM, 96);
    PAN_TIPIAVANZO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_TIPIAVANZO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIAVANZO_NOTE, MyGlb.PANEL_FORM, "Note");
    PAN_TIPIAVANZO.SetFieldPage(PFL_TIPIAVANZO_NOTE, -1, -1);
    PAN_TIPIAVANZO.SetFieldPanel(PFL_TIPIAVANZO_NOTE, PPQRY_TIPIAVANZO1, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
  }

  private void PAN_TIPIAVANZO_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIAVANZO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.CODICE = ~~COD_AVANZO_VINCA2~~) ");
    SQL.append("and   (A.TIPO = 'VINCA2') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_TIPIAVANZO.SetQuery(PPQRY_ATTRIBUTICFA, 0, SQL, PFL_TIPIAVANZO_CODAVANZVINC, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.TIPO = 'VINCA2') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_TIPIAVANZO.SetQuery(PPQRY_ATTRIBUTICFA, 1, SQL, PFL_TIPIAVANZO_CODAVANZVINC, "");
    PAN_TIPIAVANZO.SetQueryDB(PPQRY_ATTRIBUTICFA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIAVANZO.SetIMDB(IMDB, "PQRY_TIPIAVANZO1", true);
    PAN_TIPIAVANZO.set_SetString(MyGlb.MASTER_ROWNAME, "TIPI AVANZO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.COD_AVANZO_VINCA2 as COD_AVANZO_VINCA2, ");
    SQL.append("  A.NOTE as NOTE ");
    PAN_TIPIAVANZO.SetQuery(PPQRY_TIPIAVANZO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    PAN_TIPIAVANZO.SetQuery(PPQRY_TIPIAVANZO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIAVANZO.SetQuery(PPQRY_TIPIAVANZO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIAVANZO.SetQuery(PPQRY_TIPIAVANZO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIAVANZO.SetQuery(PPQRY_TIPIAVANZO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIAVANZO.SetQuery(PPQRY_TIPIAVANZO1, 5, SQL, -1, "");
    PAN_TIPIAVANZO.SetQueryDB(PPQRY_TIPIAVANZO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIAVANZO.SetMasterTable(0, "TIPI_AVANZO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIAVANZO.Status() == 2)
    {
      int oldListQBE = PAN_TIPIAVANZO.iUseListQBE;
      PAN_TIPIAVANZO.iUseListQBE = 0;
      PAN_TIPIAVANZO.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIAVANZO.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIAVANZO.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBRTIPIAVAN_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBRTIPIAVAN.InitMastro(BUK_LIBRTIPIAVAN_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_MST_NUOVPAGIMAST, "2AB825E6-5A3A-4B61-8029-280E2D732694");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBRTIPIAVAN.InitMastroBox(BUK_LIBRTIPIAVAN_MST_NUOVPAGIMAST, BUK_LIBRTIPIAVAN_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPTBOX_NUMEROPAGINA, "4F54875E-9D68-4FD7-929A-1EAD7EC001E7");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRTIPIAVAN.InitBoxSpan(BUK_LIBRTIPIAVAN_RPTBOX_NUMEROPAGINA, BUK_LIBRTIPIAVAN_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SPAN_NUMEROPAGINA, "141B3D5D-E15B-4D3F-BC66-CFC933A0B802");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRTIPIAVAN.InitMastroBox(BUK_LIBRTIPIAVAN_MST_NUOVPAGIMAST, BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA, 1000, 1000, 19000, 27400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA, "73C68B9C-C105-4087-A752-9BC2F9584472");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
  }

  private void BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT_InitQuery() { BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as TIPIAVANCODI, ");
      SQL.append("  A.DESCRIZIONE as TIPIAVANDESC, ");
      SQL.append("  A.NOTE as TIPIAVANNOTE ");
      SQL.append("from ");
      SQL.append("  TIPI_AVANZO A ");
      BUK_LIBRTIPIAVAN.SetReportQuery(BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "3126FEC5-27A5-4C62-BB6E-A0C171110864");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBRTIPIAVAN.InitReport(BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT, 131073);
    BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT, "69DCFF59-CB22-428E-913E-9B06386EBB0B");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBRTIPIAVAN.InitSection(BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT, BUK_LIBRTIPIAVAN_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRTIPIAVAN.SetSectionRendersInto(BUK_LIBRTIPIAVAN_SEC_INTESTREPORT, BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SEC_INTESTREPORT, "B35A0841-00D5-433E-9BD5-65C603FD7CA1");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBRTIPIAVAN.InitSection(BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT, BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRTIPIAVAN.SetSectionRendersInto(BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA, BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA, "8BBF1117-F549-4176-BE88-20EFBCC450DF");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBRTIPIAVAN.InitReportBox(BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA, BUK_LIBRTIPIAVAN_RPTBOX_TITOLO, 100, 100, 18800, 900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPTBOX_TITOLO, "088DEAED-012F-49E2-B052-C9F9C22A3DE7");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBRTIPIAVAN.InitBoxSpan(BUK_LIBRTIPIAVAN_RPTBOX_TITOLO, BUK_LIBRTIPIAVAN_SPAN_NUOVASPAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Tipi Avanzo", 1);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SPAN_NUOVASPAN, "2D538E46-A3EC-4181-86A9-4AE212AF7924");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_LIBRTIPIAVAN.InitReportBox(BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA, BUK_LIBRTIPIAVAN_RPTBOX_CODICEHEADER, 0, 1500, 1200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPTBOX_CODICEHEADER, "5F9DEFCF-B58C-4680-A440-F05672001BEE");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_LIBRTIPIAVAN.InitBoxSpan(BUK_LIBRTIPIAVAN_RPTBOX_CODICEHEADER, BUK_LIBRTIPIAVAN_SPAN_TIPIAVANCOD1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANCOD1, "C472AEB3-B723-4A02-8844-F33D11B81CFE");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANCOD1, "TIPIAVANCOD1");
    BUK_LIBRTIPIAVAN.InitReportBox(BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA, BUK_LIBRTIPIAVAN_RPTBOX_DESCRIHEADER, 1200, 1500, 8846, 400, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPTBOX_DESCRIHEADER, "06CDAFD3-A5AE-47C9-8529-B48252A984E7");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBRTIPIAVAN.InitBoxSpan(BUK_LIBRTIPIAVAN_RPTBOX_DESCRIHEADER, BUK_LIBRTIPIAVAN_SPAN_TIPIAVANDES1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANDES1, "FC3F771C-DE72-4CAD-8D64-DBA0C0138485");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANDES1, "TIPIAVANDES1");
    BUK_LIBRTIPIAVAN.InitReportBox(BUK_LIBRTIPIAVAN_SEC_INTESTPAGINA, BUK_LIBRTIPIAVAN_RPTBOX_NOTEHEADER, 10100, 1500, 8873, 400, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPTBOX_NOTEHEADER, "5BAA6463-E9BC-457E-B73F-62A756176029");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPTBOX_NOTEHEADER, "NOTEHEADER");
    BUK_LIBRTIPIAVAN.InitBoxSpan(BUK_LIBRTIPIAVAN_RPTBOX_NOTEHEADER, BUK_LIBRTIPIAVAN_SPAN_TIPIAVANNOT1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Note", 1);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANNOT1, "DA83590D-745E-467E-8485-A86E48CB674D");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANNOT1, "TIPIAVANNOT1");
    BUK_LIBRTIPIAVAN.InitSection(BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT, BUK_LIBRTIPIAVAN_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRTIPIAVAN.SetSectionRendersInto(BUK_LIBRTIPIAVAN_SEC_DETTAGLIO, BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SEC_DETTAGLIO, "773BD1D1-8EB0-4EA2-AB54-FC72F2635E0C");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBRTIPIAVAN.InitReportBox(BUK_LIBRTIPIAVAN_SEC_DETTAGLIO, BUK_LIBRTIPIAVAN_RPTBOX_CODICE, 0, 0, 1200, 500, 0, 1, 1, MyGlb.VIS_NORMALA8LEF1, 983041, 322, "", 1, -33);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPTBOX_CODICE, "711DCF0D-A019-4854-A15C-B6EFD206A7B4");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPTBOX_CODICE, "CODICE");
    BUK_LIBRTIPIAVAN.InitBoxSpan(BUK_LIBRTIPIAVAN_RPTBOX_CODICE, BUK_LIBRTIPIAVAN_SPAN_TIAVCOTIALTA, MyGlb.VIS_NORMALA8LEF1, 3, 10, 6, 271384705, "", "::TIPIAVANCODI", 1);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SPAN_TIAVCOTIALTA, "1372C14C-C59D-44F7-8F69-1DF93D8C3A9D");
    BUK_LIBRTIPIAVAN.set_SpanMask(BUK_LIBRTIPIAVAN_SPAN_TIAVCOTIALTA, "##########");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SPAN_TIAVCOTIALTA, "TIAVCOTIALTA");
    BUK_LIBRTIPIAVAN.InitReportBox(BUK_LIBRTIPIAVAN_SEC_DETTAGLIO, BUK_LIBRTIPIAVAN_RPTBOX_DESCRIZIONE, 1200, 0, 8846, 500, 0, 1, 1, MyGlb.VIS_NORMALA8LEF1, 983041, 322, "", 1, -33);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPTBOX_DESCRIZIONE, "B3FC8A24-AB53-4218-A937-A12E367D767B");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRTIPIAVAN.InitBoxSpan(BUK_LIBRTIPIAVAN_RPTBOX_DESCRIZIONE, BUK_LIBRTIPIAVAN_SPAN_TIPIAVANDESC, MyGlb.VIS_NORMALA8LEF1, 5, 100, 0, 271384705, "", "::TIPIAVANDESC", 1);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANDESC, "295899B8-B434-467E-9CD7-4ED5F78C2487");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANDESC, "TIPIAVANDESC");
    BUK_LIBRTIPIAVAN.InitReportBox(BUK_LIBRTIPIAVAN_SEC_DETTAGLIO, BUK_LIBRTIPIAVAN_RPTBOX_NOTE, 10100, 0, 8873, 500, 0, 1, 1, MyGlb.VIS_NORMALA8LEF1, 983041, 322, "", 1, -33);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_RPTBOX_NOTE, "FF2FE415-CEA4-457F-864D-AEC45ED685C4");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_RPTBOX_NOTE, "NOTE");
    BUK_LIBRTIPIAVAN.InitBoxSpan(BUK_LIBRTIPIAVAN_RPTBOX_NOTE, BUK_LIBRTIPIAVAN_SPAN_TIPIAVANNOTE, MyGlb.VIS_NORMALA8LEF1, 5, 2000, 0, 271384705, "", "::TIPIAVANNOTE", 1);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANNOTE, "709CD563-1F2D-4F8A-93CC-8E8AEECED318");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SPAN_TIPIAVANNOTE, "TIPIAVANNOTE");
    BUK_LIBRTIPIAVAN.InitSection(BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT, BUK_LIBRTIPIAVAN_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRTIPIAVAN.SetSectionRendersInto(BUK_LIBRTIPIAVAN_SEC_PIEDEPAGINA, BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SEC_PIEDEPAGINA, "C3B808B9-78E7-41E8-8E8E-6E62F440743A");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_LIBRTIPIAVAN.InitSection(BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT, BUK_LIBRTIPIAVAN_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRTIPIAVAN.SetSectionRendersInto(BUK_LIBRTIPIAVAN_SEC_PIEDEREPORT, BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA);
    BUK_LIBRTIPIAVAN.SetRTCGuid(BUK_LIBRTIPIAVAN_SEC_PIEDEREPORT, "DDD494B6-78BE-47B8-8B31-ED8B0DC2482A");
    BUK_LIBRTIPIAVAN.SetObjCode(BUK_LIBRTIPIAVAN_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBRTIPIAVAN_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBRTIPIAVAN_InitLinks()
  {
    BUK_LIBRTIPIAVAN.SetBoxNextBox(BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA, BUK_LIBRTIPIAVAN_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIAVANZO) PAN_TIPIAVANZO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIAVANZO) PAN_TIPIAVANZO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIAVANZO) PAN_TIPIAVANZO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIAVANZO) PAN_TIPIAVANZO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIAVANZO) PAN_TIPIAVANZO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBRTIPIAVAN) BUK_LIBRTIPIAVAN_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBRTIPIAVAN) BUK_LIBRTIPIAVAN_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBRTIPIAVAN) BUK_LIBRTIPIAVAN_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBRTIPIAVAN) BUK_LIBRTIPIAVAN_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBRTIPIAVAN) BUK_LIBRTIPIAVAN_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBRTIPIAVAN) BUK_LIBRTIPIAVAN_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBRTIPIAVAN) BUK_LIBRTIPIAVAN_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBRTIPIAVAN) BUK_LIBRTIPIAVAN_OnPreview();
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
