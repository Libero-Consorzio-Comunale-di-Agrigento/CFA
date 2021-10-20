// **********************************************
// Centri
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Centri extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CENTRI_CENTRO = 0;
  private static int PFL_CENTRI_DESCRIZIONE = 1;
  private static int PFL_CENTRI_DATAFINEVALI = 2;

  private static int PPQRY_CENTRI1 = 0;


  IDPanel PAN_CENTRI;
  CIDREObj BUK_CENTRIBOOK;
  OBook BKW_CENTRIBOOK;
  //
  // Template Pages constants
  private static int BUK_CENTRIBOOK_MST_CENTBOOKPAGE = 1;
  private static int BUK_CENTRIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CENTRIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CENTRIBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CENTRIBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_CENTRIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CENTRIBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_CENTRIBOOK_SEC_PAGEHEADER = 8;
  private static int BUK_CENTRIBOOK_RPTBOX_CENTROHEADER = 9;
  private static int BUK_CENTRIBOOK_SPAN_CENTRO = 10;
  private static int BUK_CENTRIBOOK_RPTBOX_DESCRIHEADER = 11;
  private static int BUK_CENTRIBOOK_SPAN_DESCRIZIONE = 12;
  private static int BUK_CENTRIBOOK_RPTBOX_DATAFINEVALI = 13;
  private static int BUK_CENTRIBOOK_SPAN_NUOVASPAN = 14;
  private static int BUK_CENTRIBOOK_SEC_TITOLO = 15;
  private static int BUK_CENTRIBOOK_RPTBOX_NEWBOX = 16;
  private static int BUK_CENTRIBOOK_SPAN_VARIADIBILAN = 17;
  private static int BUK_CENTRIBOOK_SEC_DETAIL = 18;
  private static int BUK_CENTRIBOOK_RPTBOX_CENTRO = 19;
  private static int BUK_CENTRIBOOK_SPAN_CENCENCECEBO = 20;
  private static int BUK_CENTRIBOOK_RPTBOX_DESCRIZIONE = 21;
  private static int BUK_CENTRIBOOK_SPAN_CENDESCECEBO = 22;
  private static int BUK_CENTRIBOOK_RPTBOX_DATA = 23;
  private static int BUK_CENTRIBOOK_SPAN_CEDAVACECEBO = 24;
  private static int BUK_CENTRIBOOK_SEC_REPORTFOOTER = 25;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_CENTRI1(IMDB);
    Init_PQRY_CENTRI3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_CENTRI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_CENTRI1, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_CENTRI1, "PQRY_CENTRI1");
    IMDB.set_FldCode(IMDBDef9.PQRY_CENTRI1,IMDBDef9.PQSL_CENTRI1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CENTRI1,IMDBDef9.PQSL_CENTRI1_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CENTRI1,IMDBDef9.PQSL_CENTRI1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CENTRI1,IMDBDef9.PQSL_CENTRI1_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CENTRI1,IMDBDef9.PQSL_CENTRI1_DATA_VALIDITA, "DATA_VALIDITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_CENTRI1,IMDBDef9.PQSL_CENTRI1_DATA_VALIDITA,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_CENTRI1, 0);
  }

  private static void Init_PQRY_CENTRI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_CENTRI3, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_CENTRI3, "PQRY_CENTRI3");
    IMDB.set_FldCode(IMDBDef9.PQRY_CENTRI3,IMDBDef9.PQSL_CENTRI3_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CENTRI3,IMDBDef9.PQSL_CENTRI3_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CENTRI3,IMDBDef9.PQSL_CENTRI3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CENTRI3,IMDBDef9.PQSL_CENTRI3_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CENTRI3,IMDBDef9.PQSL_CENTRI3_CENTDATAVALI, "CENTDATAVALI");
    IMDB.SetFldParams(IMDBDef9.PQRY_CENTRI3,IMDBDef9.PQSL_CENTRI3_CENTDATAVALI,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_CENTRI3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Centri(MyWebEntryPoint w, IMDBObj imdb)
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
  public Centri()
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
    FormIdx = MyGlb.FRM_CENTRI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5AD54161-6C3B-49A3-9DBF-D7F8AE8DBD58";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 796;
    DesignHeight = 390;
    set_Caption(new IDVariant("Centri"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 796;
    Frames[1].Height = 364;
    Frames[1].Caption = "Centri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_CENTRI = new IDPanel(w, this, 1, "PAN_CENTRI");
    Frames[1].Content = PAN_CENTRI;
    PAN_CENTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CENTRI.VS = MainFrm.VisualStyleList;
    PAN_CENTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CENTRIBOOK != null)
      PAN_CENTRI.SetBook(BUK_CENTRIBOOK);
    PAN_CENTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AEC182E6-152F-4130-A6A5-A113CA610E8F");
    PAN_CENTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 648, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CENTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CENTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CENTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CENTRI.InitStatus = 2;
    PAN_CENTRI_Init();
    PAN_CENTRI_InitFields();
    PAN_CENTRI_InitQueries();
    BKW_CENTRIBOOK = new OBook(this);
    BUK_CENTRIBOOK = new CIDREObj(BKW_CENTRIBOOK);
    BKW_CENTRIBOOK.iGuid = "9AD9BCB2-3680-4AF4-933D-E012B2E20169";
    BKW_CENTRIBOOK.Code = "BUK_CENTRIBOOK";
    BKW_CENTRIBOOK.BookObj = BUK_CENTRIBOOK;
    BKW_CENTRIBOOK.InitDefMasks();
    BUK_CENTRIBOOK.InitBook(1, 1245185, "Centri Book", IMDB, MainFrm.VisualStyleList);
    BUK_CENTRIBOOK.InitHTML();
    BUK_CENTRIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CENTRIBOOK.Book.SetMainFrm(MainFrm);
    BUK_CENTRIBOOK.SetRTCGuid(0, "9AD9BCB2-3680-4AF4-933D-E012B2E20169");
    BUK_CENTRIBOOK.SetObjCode(0, "CENTRIBOOK");
    if (PAN_CENTRI != null)
      PAN_CENTRI.SetBook(BUK_CENTRIBOOK);
    BUK_CENTRIBOOK_MST_CENTBOOKPAGE_Init();
    BUK_CENTRIBOOK_RPT_NEWREPORT_Init();
    BUK_CENTRIBOOK_InitLinks();
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
      PAN_CENTRI.UpdatePanel(MainFrm);
      // BUK_CENTRIBOOK.UpdateBook();
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
    if (Code.equals("BUK_CENTRIBOOK")) return BUK_CENTRIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Centri);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Centri.class.getName() : (Glb.ClassWithPackage(Centri.class) ? Centri.class.getName().substring(Centri.class.getPackage().getName().length() + 1) : Centri.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Centri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CENTRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CENTRI);
      // 
      // Centri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CENTRI.IsNewRow()))
      {
        PAN_CENTRI.SetFlags (Glb.OBJ_FIELD, PFL_CENTRI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CENTRI.SetFlags (Glb.OBJ_FIELD, PFL_CENTRI_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CENTRI.set_ToolTip(Glb.OBJ_FIELD,PFL_CENTRI_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_CENTRI1, IMDBDef9.PQSL_CENTRI1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Centri", "CentriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Centri On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_CENTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CENTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Centri On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Centri", "CentriOnDatabaseErrorEvent", _e);
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
      v_CAPTION = (new IDVariant("Centri", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_TIPOCENTRI = new IDVariant(0,IDVariant.STRING);
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.OBJECT_TYPE as USEOBJOBJTYP ");
      SQL.append("from ");
      SQL.append("  USER_OBJECTS A ");
      SQL.append("where (A.OBJECT_NAME = 'CENTRI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TIPOCENTRI = QV.Get("USEOBJOBJTYP", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_TIPOCENTRI.equals((new IDVariant("TABLE")), true))
      {
        PAN_CENTRI.SetFlags (Glb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CENTRI.SetFlags (Glb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Centri", "LoadEvent", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CENTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CENTRI, Cancel);
    // Stub
  }

  private void PAN_CENTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CENTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CENTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CENTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CENTRIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CENTRIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CENTRIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CENTRIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CENTRIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CENTRIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CENTRIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CENTRIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CENTRIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CENTRIBOOK_MST_CENTBOOKPAGE)
    {
      BUK_CENTRIBOOK.set_SpanValue(BUK_CENTRIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CENTRIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CENTRIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CENTRIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CENTRIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CENTRIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CENTRIBOOK_OnPreview()
  {
    PreviewBook = BKW_CENTRIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CENTRI_Init()
  {

    PAN_CENTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CENTRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CENTRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_CENTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, "66DF2CC0-8093-47E3-A8F5-F71AA8761D39");
    PAN_CENTRI.set_Header(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, "Centro");
    PAN_CENTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, "Centro");
    PAN_CENTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_CENTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CENTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, "B2125EAE-28D8-46CF-8DB1-ACAA30B8A8BD");
    PAN_CENTRI.set_Header(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, "Descrizione");
    PAN_CENTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, "");
    PAN_CENTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CENTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CENTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, "A7548FC3-41AC-40E3-813B-10D163A2A9B9");
    PAN_CENTRI.set_Header(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, "Data Fine Validità");
    PAN_CENTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, "");
    PAN_CENTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, MyGlb.VIS_NORMALFIELDS);
    PAN_CENTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CENTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_CENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_CENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_CENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, MyGlb.PANEL_FORM, 112);
    PAN_CENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_CENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CENTRI_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_CENTRI.SetFieldPage(PFL_CENTRI_CENTRO, -1, -1);
    PAN_CENTRI.SetFieldPanel(PFL_CENTRI_CENTRO, PPQRY_CENTRI1, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_CENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, MyGlb.PANEL_LIST, 112, 36, 456, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, MyGlb.PANEL_FORM, 112);
    PAN_CENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CENTRI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CENTRI.SetFieldPage(PFL_CENTRI_DESCRIZIONE, -1, -1);
    PAN_CENTRI.SetFieldPanel(PFL_CENTRI_DESCRIZIONE, PPQRY_CENTRI1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_CENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, MyGlb.PANEL_LIST, 568, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, MyGlb.PANEL_LIST, 96);
    PAN_CENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, MyGlb.PANEL_LIST, 1);
    PAN_CENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, MyGlb.PANEL_LIST, "Data Fine Validità");
    PAN_CENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, MyGlb.PANEL_FORM, 4, 52, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, MyGlb.PANEL_FORM, 96);
    PAN_CENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, MyGlb.PANEL_FORM, 1);
    PAN_CENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CENTRI_DATAFINEVALI, MyGlb.PANEL_FORM, "Dt. Fine Validità");
    PAN_CENTRI.SetFieldPage(PFL_CENTRI_DATAFINEVALI, -1, -1);
    PAN_CENTRI.SetFieldPanel(PFL_CENTRI_DATAFINEVALI, PPQRY_CENTRI1, "A.DATA_VALIDITA", "DATA_VALIDITA", 6, 19, 0, -13997);
  }

  private void PAN_CENTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CENTRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CENTRI.SetIMDB(IMDB, "PQRY_CENTRI1", true);
    PAN_CENTRI.set_SetString(MyGlb.MASTER_ROWNAME, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DATA_VALIDITA as DATA_VALIDITA ");
    PAN_CENTRI.SetQuery(PPQRY_CENTRI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    PAN_CENTRI.SetQuery(PPQRY_CENTRI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CENTRI.SetQuery(PPQRY_CENTRI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CENTRI.SetQuery(PPQRY_CENTRI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CENTRI.SetQuery(PPQRY_CENTRI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CENTRO ");
    PAN_CENTRI.SetQuery(PPQRY_CENTRI1, 5, SQL, -1, "");
    PAN_CENTRI.SetQueryDB(PPQRY_CENTRI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CENTRI.SetMasterTable(0, "CENTRI");
    PAN_CENTRI.AddToSortList(PFL_CENTRI_CENTRO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CENTRI.Status() == 2)
    {
      int oldListQBE = PAN_CENTRI.iUseListQBE;
      PAN_CENTRI.iUseListQBE = 0;
      PAN_CENTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CENTRI.PanelCommand(Glb.PCM_FIND);
      PAN_CENTRI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CENTRIBOOK_MST_CENTBOOKPAGE_Init()
  {
    BUK_CENTRIBOOK.InitMastro(BUK_CENTRIBOOK_MST_CENTBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_MST_CENTBOOKPAGE, "4A53BD83-0573-413A-89E8-44A74A6746C3");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_MST_CENTBOOKPAGE, "CENTBOOKPAGE");
    BUK_CENTRIBOOK.InitMastroBox(BUK_CENTRIBOOK_MST_CENTBOOKPAGE, BUK_CENTRIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_NUMEROPAGINA, "D29CF5E1-724D-4AE2-8036-C4A2837DB156");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CENTRIBOOK.InitBoxSpan(BUK_CENTRIBOOK_RPTBOX_NUMEROPAGINA, BUK_CENTRIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SPAN_NUMEROPAGINA, "06922F49-F361-4DFD-B6D2-F174D6437831");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CENTRIBOOK.InitMastroBox(BUK_CENTRIBOOK_MST_CENTBOOKPAGE, BUK_CENTRIBOOK_RPTBOX_PAGEBODY, 1000, 3000, 19000, 25400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_PAGEBODY, "AE7DF2B7-187F-48B2-B18B-C795514E7D72");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CENTRIBOOK.InitMastroBox(BUK_CENTRIBOOK_MST_CENTBOOKPAGE, BUK_CENTRIBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_TITOLO, "299CB88E-D8EC-44EB-B821-A05B0AE250C7");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CENTRIBOOK_RPT_NEWREPORT_InitQuery() { BUK_CENTRIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CENTRIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CENTRO as CENTRO, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.DATA_VALIDITA as CENTDATAVALI ");
      SQL.append("from ");
      SQL.append("  CENTRI A ");
      SQL.append("order by ");
      SQL.append("  A.CENTRO ");
      BUK_CENTRIBOOK.SetReportQuery(BUK_CENTRIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "37E4DAA8-24D7-4D52-B5E1-E073090F1F25");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CENTRIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CENTRIBOOK.InitReport(BUK_CENTRIBOOK_RPT_NEWREPORT, 196609);
    BUK_CENTRIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPT_NEWREPORT, "7966FA91-57F1-4546-9D27-1888B0605DC7");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CENTRIBOOK.InitSection(BUK_CENTRIBOOK_RPT_NEWREPORT, BUK_CENTRIBOOK_SEC_REPORTHEADER, 100, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CENTRIBOOK.SetSectionRendersInto(BUK_CENTRIBOOK_SEC_REPORTHEADER, BUK_CENTRIBOOK_RPTBOX_PAGEBODY);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SEC_REPORTHEADER, "2F1A1A7D-76E3-4E5C-B01D-4B12BC2812A1");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CENTRIBOOK.InitSection(BUK_CENTRIBOOK_RPT_NEWREPORT, BUK_CENTRIBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CENTRIBOOK.SetSectionRendersInto(BUK_CENTRIBOOK_SEC_PAGEHEADER, BUK_CENTRIBOOK_RPTBOX_PAGEBODY);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SEC_PAGEHEADER, "E7AFA81E-E956-42D4-B031-CDF9BD0274F4");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CENTRIBOOK.InitReportBox(BUK_CENTRIBOOK_SEC_PAGEHEADER, BUK_CENTRIBOOK_RPTBOX_CENTROHEADER, 500, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_CENTROHEADER, "DB755E22-BD67-44F5-A17D-1A12A52F364F");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_CENTROHEADER, "CENTROHEADER");
    BUK_CENTRIBOOK.InitBoxSpan(BUK_CENTRIBOOK_RPTBOX_CENTROHEADER, BUK_CENTRIBOOK_SPAN_CENTRO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Centro", 1);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SPAN_CENTRO, "6F965053-8DBE-483E-85D2-0EB4306B523F");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SPAN_CENTRO, "CENTRO");
    BUK_CENTRIBOOK.InitReportBox(BUK_CENTRIBOOK_SEC_PAGEHEADER, BUK_CENTRIBOOK_RPTBOX_DESCRIHEADER, 3200, 0, 12400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_DESCRIHEADER, "2522AE1A-0C15-4688-B66D-8451EC6B1D53");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CENTRIBOOK.InitBoxSpan(BUK_CENTRIBOOK_RPTBOX_DESCRIHEADER, BUK_CENTRIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SPAN_DESCRIZIONE, "75FEA737-C58C-41EE-97F6-965A49D13B87");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CENTRIBOOK.InitReportBox(BUK_CENTRIBOOK_SEC_PAGEHEADER, BUK_CENTRIBOOK_RPTBOX_DATAFINEVALI, 15700, 0, 3100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_DATAFINEVALI, "187D8BD1-B6E6-4EC7-9806-7A9B1501E475");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_DATAFINEVALI, "DATAFINEVALI");
    BUK_CENTRIBOOK.set_BoxAlignment(BUK_CENTRIBOOK_RPTBOX_DATAFINEVALI, 3);
    BUK_CENTRIBOOK.InitBoxSpan(BUK_CENTRIBOOK_RPTBOX_DATAFINEVALI, BUK_CENTRIBOOK_SPAN_NUOVASPAN, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Data Fine Validità", 1);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SPAN_NUOVASPAN, "D0D55D9A-A8B2-40DF-BEC5-A40804E77B21");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_CENTRIBOOK.InitSection(BUK_CENTRIBOOK_RPT_NEWREPORT, BUK_CENTRIBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CENTRIBOOK.SetSectionRendersInto(BUK_CENTRIBOOK_SEC_TITOLO, BUK_CENTRIBOOK_RPTBOX_TITOLO);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SEC_TITOLO, "DBF211B5-0E0E-4223-9A66-BAB8497C7E9C");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SEC_TITOLO, "TITOLO");
    BUK_CENTRIBOOK.InitReportBox(BUK_CENTRIBOOK_SEC_TITOLO, BUK_CENTRIBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_NEWBOX, "7A0DCD7F-6612-460E-A1B3-F5F7F21F945A");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CENTRIBOOK.InitBoxSpan(BUK_CENTRIBOOK_RPTBOX_NEWBOX, BUK_CENTRIBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Centri", 1);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SPAN_VARIADIBILAN, "A6925821-3907-4226-BBFE-E4F50EA85D1D");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CENTRIBOOK.InitSection(BUK_CENTRIBOOK_RPT_NEWREPORT, BUK_CENTRIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CENTRIBOOK.SetSectionRendersInto(BUK_CENTRIBOOK_SEC_DETAIL, BUK_CENTRIBOOK_RPTBOX_PAGEBODY);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SEC_DETAIL, "0B72BC99-90D0-4E83-AE27-6E74296E8128");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SEC_DETAIL, "DETAIL");
    BUK_CENTRIBOOK.InitReportBox(BUK_CENTRIBOOK_SEC_DETAIL, BUK_CENTRIBOOK_RPTBOX_CENTRO, 0, 0, 2900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_CENTRO, "B9FBE5A7-737E-4EA0-95B7-D9DFDF6D5B94");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_CENTRO, "CENTRO");
    BUK_CENTRIBOOK.InitBoxSpan(BUK_CENTRIBOOK_RPTBOX_CENTRO, BUK_CENTRIBOOK_SPAN_CENCENCECEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::CENTRO", 1);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SPAN_CENCENCECEBO, "8C568561-1D6C-4920-B3A2-4201F397BFB4");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SPAN_CENCENCECEBO, "CENCENCECEBO");
    BUK_CENTRIBOOK.InitReportBox(BUK_CENTRIBOOK_SEC_DETAIL, BUK_CENTRIBOOK_RPTBOX_DESCRIZIONE, 3200, 0, 12400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_DESCRIZIONE, "49CBD2A7-73F4-4CD2-805E-10107E69FADA");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CENTRIBOOK.InitBoxSpan(BUK_CENTRIBOOK_RPTBOX_DESCRIZIONE, BUK_CENTRIBOOK_SPAN_CENDESCECEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SPAN_CENDESCECEBO, "1E9AA2C7-1BB4-4D9F-AABA-167966149D3A");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SPAN_CENDESCECEBO, "CENDESCECEBO");
    BUK_CENTRIBOOK.InitReportBox(BUK_CENTRIBOOK_SEC_DETAIL, BUK_CENTRIBOOK_RPTBOX_DATA, 15700, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_RPTBOX_DATA, "D63F858B-E0EC-4A16-AC85-0F5D1F4CD766");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_RPTBOX_DATA, "DATA");
    BUK_CENTRIBOOK.set_BoxAlignment(BUK_CENTRIBOOK_RPTBOX_DATA, 3);
    BUK_CENTRIBOOK.InitBoxSpan(BUK_CENTRIBOOK_RPTBOX_DATA, BUK_CENTRIBOOK_SPAN_CEDAVACECEBO, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Data", "::CENTDATAVALI", 1);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SPAN_CEDAVACECEBO, "D8EC1542-8367-4F95-869A-68CD11EDDC10");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SPAN_CEDAVACECEBO, "CEDAVACECEBO");
    BUK_CENTRIBOOK.InitSection(BUK_CENTRIBOOK_RPT_NEWREPORT, BUK_CENTRIBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CENTRIBOOK.SetSectionRendersInto(BUK_CENTRIBOOK_SEC_REPORTFOOTER, BUK_CENTRIBOOK_RPTBOX_PAGEBODY);
    BUK_CENTRIBOOK.SetRTCGuid(BUK_CENTRIBOOK_SEC_REPORTFOOTER, "B3AF9BAF-9BD0-4250-8FA1-7281E473013E");
    BUK_CENTRIBOOK.SetObjCode(BUK_CENTRIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CENTRIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CENTRIBOOK_InitLinks()
  {
    BUK_CENTRIBOOK.SetBoxNextBox(BUK_CENTRIBOOK_RPTBOX_PAGEBODY, BUK_CENTRIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CENTRI) PAN_CENTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CENTRI) PAN_CENTRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CENTRI) PAN_CENTRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CENTRI) PAN_CENTRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CENTRI) PAN_CENTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CENTRIBOOK) BUK_CENTRIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CENTRIBOOK) BUK_CENTRIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CENTRIBOOK) BUK_CENTRIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CENTRIBOOK) BUK_CENTRIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CENTRIBOOK) BUK_CENTRIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CENTRIBOOK) BUK_CENTRIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CENTRIBOOK) BUK_CENTRIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CENTRIBOOK) BUK_CENTRIBOOK_OnPreview();
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
