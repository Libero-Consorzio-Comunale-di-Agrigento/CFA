// **********************************************
// Causali I R A P
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CausaliIRAP extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CAUSALIIRAP_CODICE = 0;
  private static int PFL_CAUSALIIRAP_ALIQUOTA = 1;
  private static int PFL_CAUSALIIRAP_DESCRIZIONE = 2;
  private static int PFL_CAUSALIIRAP_UTENTEINSERI = 3;
  private static int PFL_CAUSALIIRAP_DATAINSERIME = 4;
  private static int PFL_CAUSALIIRAP_UTENTULTIAGG = 5;
  private static int PFL_CAUSALIIRAP_DATAULTIMAGG = 6;
  private static int PFL_CAUSALIIRAP_ALIQSSNCD = 7;

  private static int PPQRY_T85 = 0;


  IDPanel PAN_CAUSALIIRAP;
  CIDREObj BUK_CAUSIRAPBOOK;
  OBook BKW_CAUSIRAPBOOK;
  //
  // Template Pages constants
  private static int BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA = 1;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CAUSIRAPBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_CAUSIRAPBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CAUSIRAPBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_CAUSIRAPBOOK_SPAN_CODICE = 9;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCDHEA = 10;
  private static int BUK_CAUSIRAPBOOK_SPAN_ALIQCARICDEB = 11;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_DESCRIHEADER = 12;
  private static int BUK_CAUSIRAPBOOK_SPAN_DESCRIZIONE = 13;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_ALISSCE11HE1 = 14;
  private static int BUK_CAUSIRAPBOOK_SPAN_ALIQUOTA = 15;
  private static int BUK_CAUSIRAPBOOK_SEC_TITOLO = 16;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_NEWBOX = 17;
  private static int BUK_CAUSIRAPBOOK_SPAN_VARIADIBILAN = 18;
  private static int BUK_CAUSIRAPBOOK_SEC_DETAIL = 19;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_CODICE = 20;
  private static int BUK_CAUSIRAPBOOK_SPAN_TCCIRAPCIRAP = 21;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCD = 22;
  private static int BUK_CAUSIRAPBOOK_SPAN_TASCCIRAPCIR = 23;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_DESCRIZIONE = 24;
  private static int BUK_CAUSIRAPBOOK_SPAN_TDCIRAPCIRAP = 25;
  private static int BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCE1 = 26;
  private static int BUK_CAUSIRAPBOOK_SPAN_TACIRAPCIRAP = 27;
  private static int BUK_CAUSIRAPBOOK_SEC_REPORTFOOTER = 28;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T85(IMDB);
    Init_PQRY_T82(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T85(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T85, 10);
    IMDB.set_TblCode(IMDBDef9.PQRY_T85, "PQRY_T85");
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_CODICE,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_ALIQ_SSN_CD, "ALIQ_SSN_CD");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_ALIQ_SSN_CD,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_ALIQ_SSN_CE, "ALIQ_SSN_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_ALIQ_SSN_CE,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T85,IMDBDef9.PQSL_T85_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T85, 0);
  }

  private static void Init_PQRY_T82(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T82, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_T82, "PQRY_T82");
    IMDB.set_FldCode(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_CODICE,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_ALIQ_SSN_CD, "ALIQ_SSN_CD");
    IMDB.SetFldParams(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_ALIQ_SSN_CD,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_ALIQ_SSN_CE, "ALIQ_SSN_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_ALIQ_SSN_CE,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T82,IMDBDef9.PQSL_T82_NUMERO_IMP,1,5,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T82, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CausaliIRAP(MyWebEntryPoint w, IMDBObj imdb)
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
  public CausaliIRAP()
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
    FormIdx = MyGlb.FRM_CAUSALIIRAP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B698198E-69CA-41DE-96AB-B63726BFF292";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 632;
    DesignHeight = 390;
    set_Caption(new IDVariant("Causali I R A P"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 632;
    Frames[1].Height = 364;
    Frames[1].Caption = "Causali I R A P";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_CAUSALIIRAP = new IDPanel(w, this, 1, "PAN_CAUSALIIRAP");
    Frames[1].Content = PAN_CAUSALIIRAP;
    PAN_CAUSALIIRAP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAUSALIIRAP.VS = MainFrm.VisualStyleList;
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 632-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CAUSIRAPBOOK != null)
      PAN_CAUSALIIRAP.SetBook(BUK_CAUSIRAPBOOK);
    PAN_CAUSALIIRAP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "07056A09-A630-479B-8E7F-D24DC9C067BB");
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 472, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAUSALIIRAP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAUSALIIRAP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAUSALIIRAP.InitStatus = 2;
    PAN_CAUSALIIRAP_Init();
    PAN_CAUSALIIRAP_InitFields();
    PAN_CAUSALIIRAP_InitQueries();
    BKW_CAUSIRAPBOOK = new OBook(this);
    BUK_CAUSIRAPBOOK = new CIDREObj(BKW_CAUSIRAPBOOK);
    BKW_CAUSIRAPBOOK.iGuid = "7564BA9D-34FB-44B3-8892-30CAF32D3DC0";
    BKW_CAUSIRAPBOOK.Code = "BUK_CAUSIRAPBOOK";
    BKW_CAUSIRAPBOOK.BookObj = BUK_CAUSIRAPBOOK;
    BKW_CAUSIRAPBOOK.InitDefMasks();
    BUK_CAUSIRAPBOOK.InitBook(1, 1245185, "Causali I R A P Book", IMDB, MainFrm.VisualStyleList);
    BUK_CAUSIRAPBOOK.InitHTML();
    BUK_CAUSIRAPBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CAUSIRAPBOOK.Book.SetMainFrm(MainFrm);
    BUK_CAUSIRAPBOOK.SetRTCGuid(0, "7564BA9D-34FB-44B3-8892-30CAF32D3DC0");
    BUK_CAUSIRAPBOOK.SetObjCode(0, "CAUSIRAPBOOK");
    if (PAN_CAUSALIIRAP != null)
      PAN_CAUSALIIRAP.SetBook(BUK_CAUSIRAPBOOK);
    BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA_Init();
    BUK_CAUSIRAPBOOK_RPT_NEWREPORT_Init();
    BUK_CAUSIRAPBOOK_InitLinks();
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
      PAN_CAUSALIIRAP.UpdatePanel(MainFrm);
      // BUK_CAUSIRAPBOOK.UpdateBook();
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
    if (Code.equals("BUK_CAUSIRAPBOOK")) return BUK_CAUSIRAPBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CausaliIRAP);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CausaliIRAP.class.getName() : (Glb.ClassWithPackage(CausaliIRAP.class) ? CausaliIRAP.class.getName().substring(CausaliIRAP.class.getPackage().getName().length() + 1) : CausaliIRAP.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Causali I R A P On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAUSALIIRAP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAUSALIIRAP);
      // 
      // Causali I R A P On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CAUSALIIRAP.IsNewRow()))
      {
        PAN_CAUSALIIRAP.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CAUSALIIRAP.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CAUSALIIRAP.set_ToolTip(Glb.OBJ_FIELD,PFL_CAUSALIIRAP_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliIRAP", "CausaliIRAPOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Causali I R A P On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CAUSALIIRAP_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali I R A P On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T82PD(IMDB.Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliIRAP", "CausaliIRAPOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Causali I R A P On Database Error Event
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
  private void PAN_CAUSALIIRAP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CAUSALIIRAP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Causali I R A P On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliIRAP", "CausaliIRAPOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Causali I R A P On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CAUSALIIRAP_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali I R A P On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_ALIQ_SSN_CD, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_ALIQ_SSN_CD, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliIRAP", "CausaliIRAPOnUpdatingRowEvent", _e);
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
      v_CAPTION = (new IDVariant("Causali I.R.A.P.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      Frames[PAN_CAUSALIIRAP.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliIRAP", "LoadEvent", _e);
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
  private void PAN_CAUSALIIRAP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAUSALIIRAP, Cancel);
    // Stub
  }

  private void PAN_CAUSALIIRAP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAUSALIIRAP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CAUSALIIRAP_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CAUSALIIRAP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAUSALIIRAP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CAUSIRAPBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CAUSIRAPBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CAUSIRAPBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CAUSIRAPBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CAUSIRAPBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CAUSIRAPBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CAUSIRAPBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CAUSIRAPBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA)
    {
      BUK_CAUSIRAPBOOK.set_SpanValue(BUK_CAUSIRAPBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CAUSIRAPBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CAUSIRAPBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CAUSIRAPBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CAUSIRAPBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CAUSIRAPBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CAUSIRAPBOOK_OnPreview()
  {
    PreviewBook = BKW_CAUSIRAPBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAUSALIIRAP_Init()
  {

    PAN_CAUSALIIRAP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAUSALIIRAP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAUSALIIRAP.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_CAUSALIIRAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, "1F06DCAA-81CA-45E3-9BE4-F444FF31095C");
    PAN_CAUSALIIRAP.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, "Codice");
    PAN_CAUSALIIRAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, "");
    PAN_CAUSALIIRAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALIIRAP.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CAUSALIIRAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, "7CBE1714-CAD1-4035-B0AB-0A0B09D80866");
    PAN_CAUSALIIRAP.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, "Aliquota");
    PAN_CAUSALIIRAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, "");
    PAN_CAUSALIIRAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, MyGlb.VIS_PERALINOFICF);
    PAN_CAUSALIIRAP.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAUSALIIRAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, "AACB3A7B-1420-43C7-85F4-F3BFF5822735");
    PAN_CAUSALIIRAP.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, "Descrizione");
    PAN_CAUSALIIRAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, "");
    PAN_CAUSALIIRAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALIIRAP.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAUSALIIRAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, "9CE0E027-FE26-4BE7-ABCC-D333E75CC676");
    PAN_CAUSALIIRAP.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CAUSALIIRAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, "");
    PAN_CAUSALIIRAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALIIRAP.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIIRAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, "6BF9F791-6C7C-4A92-A81C-13CB06845D23");
    PAN_CAUSALIIRAP.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CAUSALIIRAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, "");
    PAN_CAUSALIIRAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALIIRAP.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIIRAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, "E91151A8-2ECF-4F38-89F9-EE6C3132295C");
    PAN_CAUSALIIRAP.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CAUSALIIRAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, "");
    PAN_CAUSALIIRAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALIIRAP.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIIRAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, "EA4F1A50-E226-42F4-A5D0-6E7140D51A44");
    PAN_CAUSALIIRAP.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CAUSALIIRAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, "");
    PAN_CAUSALIIRAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALIIRAP.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIIRAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, "4F13D43C-6C6C-4770-A570-0259AF21CF4A");
    PAN_CAUSALIIRAP.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, "ALIQ SSN CD");
    PAN_CAUSALIIRAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, "");
    PAN_CAUSALIIRAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, MyGlb.VIS_NONNULLAFIEL);
    PAN_CAUSALIIRAP.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, 0, -1);
  }

  private void PAN_CAUSALIIRAP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CAUSALIIRAP.SetFieldPage(PFL_CAUSALIIRAP_CODICE, -1, -1);
    PAN_CAUSALIIRAP.SetFieldPanel(PFL_CAUSALIIRAP_CODICE, PPQRY_T85, "A.CODICE", "CODICE", 1, 1, 0, -13997);
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, MyGlb.PANEL_LIST, 56, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, MyGlb.PANEL_LIST, 92);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, MyGlb.PANEL_LIST, "Aliquota");
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, MyGlb.PANEL_FORM, 88);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQUOTA, MyGlb.PANEL_FORM, "Aliquota");
    PAN_CAUSALIIRAP.SetFieldPage(PFL_CAUSALIIRAP_ALIQUOTA, -1, -1);
    PAN_CAUSALIIRAP.SetFieldPanel(PFL_CAUSALIIRAP_ALIQUOTA, PPQRY_T85, "A.ALIQ_SSN_CE", "ALIQ_SSN_CE", 3, 5, 3, -13997);
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, MyGlb.PANEL_LIST, 112, 36, 360, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CAUSALIIRAP.SetFieldPage(PFL_CAUSALIIRAP_DESCRIZIONE, -1, -1);
    PAN_CAUSALIIRAP.SetFieldPanel(PFL_CAUSALIIRAP_DESCRIZIONE, PPQRY_T85, "A.DESCRIZIONE", "DESCRIZIONE", 5, 30, 0, -13997);
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, MyGlb.PANEL_LIST, 472, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 100, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CAUSALIIRAP.SetFieldPage(PFL_CAUSALIIRAP_UTENTEINSERI, -1, -1);
    PAN_CAUSALIIRAP.SetFieldPanel(PFL_CAUSALIIRAP_UTENTEINSERI, PPQRY_T85, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, MyGlb.PANEL_LIST, 592, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, MyGlb.PANEL_FORM, 4, 124, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CAUSALIIRAP.SetFieldPage(PFL_CAUSALIIRAP_DATAINSERIME, -1, -1);
    PAN_CAUSALIIRAP.SetFieldPanel(PFL_CAUSALIIRAP_DATAINSERIME, PPQRY_T85, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, MyGlb.PANEL_LIST, 700, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CAUSALIIRAP.SetFieldPage(PFL_CAUSALIIRAP_UTENTULTIAGG, -1, -1);
    PAN_CAUSALIIRAP.SetFieldPanel(PFL_CAUSALIIRAP_UTENTULTIAGG, PPQRY_T85, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, MyGlb.PANEL_LIST, 812, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 172, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CAUSALIIRAP.SetFieldPage(PFL_CAUSALIIRAP_DATAULTIMAGG, -1, -1);
    PAN_CAUSALIIRAP.SetFieldPanel(PFL_CAUSALIIRAP_DATAULTIMAGG, PPQRY_T85, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, MyGlb.PANEL_LIST, 72);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, MyGlb.PANEL_LIST, "ALIQ SSN CD");
    PAN_CAUSALIIRAP.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, MyGlb.PANEL_FORM, 4, 100, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIIRAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, MyGlb.PANEL_FORM, 72);
    PAN_CAUSALIIRAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIIRAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIIRAP_ALIQSSNCD, MyGlb.PANEL_FORM, "ALQ. SS. CD");
    PAN_CAUSALIIRAP.SetFieldPage(PFL_CAUSALIIRAP_ALIQSSNCD, -1, -1);
    PAN_CAUSALIIRAP.SetFieldPanel(PFL_CAUSALIIRAP_ALIQSSNCD, PPQRY_T85, "A.ALIQ_SSN_CD", "ALIQ_SSN_CD", 3, 5, 3, -13997);
  }

  private void PAN_CAUSALIIRAP_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAUSALIIRAP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CAUSALIIRAP.SetIMDB(IMDB, "PQRY_T85", true);
    PAN_CAUSALIIRAP.set_SetString(MyGlb.MASTER_ROWNAME, "T82");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.ALIQ_SSN_CD as ALIQ_SSN_CD, ");
    SQL.append("  A.ALIQ_SSN_CE as ALIQ_SSN_CE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CAUSALIIRAP.SetQuery(PPQRY_T85, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T82 A ");
    PAN_CAUSALIIRAP.SetQuery(PPQRY_T85, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALIIRAP.SetQuery(PPQRY_T85, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALIIRAP.SetQuery(PPQRY_T85, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALIIRAP.SetQuery(PPQRY_T85, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CAUSALIIRAP.SetQuery(PPQRY_T85, 5, SQL, -1, "");
    PAN_CAUSALIIRAP.SetQueryDB(PPQRY_T85, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALIIRAP.SetMasterTable(0, "T82");
    PAN_CAUSALIIRAP.AddToSortList(PFL_CAUSALIIRAP_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAUSALIIRAP.Status() == 2)
    {
      int oldListQBE = PAN_CAUSALIIRAP.iUseListQBE;
      PAN_CAUSALIIRAP.iUseListQBE = 0;
      PAN_CAUSALIIRAP.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAUSALIIRAP.PanelCommand(Glb.PCM_FIND);
      PAN_CAUSALIIRAP.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA_Init()
  {
    BUK_CAUSIRAPBOOK.InitMastro(BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA, 3, 21000, 29700, 1, 1, 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA, "711F1DA2-9B5C-4759-80D6-02F9B3E43B8D");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA, "CAUIRAPBOOPA");
    BUK_CAUSIRAPBOOK.InitMastroBox(BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA, BUK_CAUSIRAPBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_NUMEROPAGINA, "92D3A7C1-E35E-41D2-AAB1-DCEBF872E84D");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_NUMEROPAGINA, BUK_CAUSIRAPBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_NUMEROPAGINA, "9D576334-7635-4ACF-8CED-4FB76E65DD52");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CAUSIRAPBOOK.InitMastroBox(BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA, BUK_CAUSIRAPBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_PAGEBODY, "DF454243-CBF8-4DF5-8D85-F9EED6CFCE0E");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CAUSIRAPBOOK.InitMastroBox(BUK_CAUSIRAPBOOK_MST_CAUIRAPBOOPA, BUK_CAUSIRAPBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_TITOLO, "C821F17E-A277-478B-ADC6-754AC074740D");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CAUSIRAPBOOK_RPT_NEWREPORT_InitQuery() { BUK_CAUSIRAPBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CAUSIRAPBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.ALIQ_SSN_CD as ALIQ_SSN_CD, ");
      SQL.append("  A.ALIQ_SSN_CE as ALIQ_SSN_CE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
      SQL.append("  A.NUMERO_IMP as NUMERO_IMP ");
      SQL.append("from ");
      SQL.append("  T82 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CAUSIRAPBOOK.SetReportQuery(BUK_CAUSIRAPBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "C3E8661A-2400-4F4B-8E69-998671039F2B");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CAUSIRAPBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CAUSIRAPBOOK.InitReport(BUK_CAUSIRAPBOOK_RPT_NEWREPORT, 196609);
    BUK_CAUSIRAPBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPT_NEWREPORT, "8182935B-44DA-49B6-ABFB-6F4B2D09697C");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CAUSIRAPBOOK.InitSection(BUK_CAUSIRAPBOOK_RPT_NEWREPORT, BUK_CAUSIRAPBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSIRAPBOOK.SetSectionRendersInto(BUK_CAUSIRAPBOOK_SEC_PAGEHEADER, BUK_CAUSIRAPBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SEC_PAGEHEADER, "A1B48E21-14B2-4AAD-9982-1815CC0CB044");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CAUSIRAPBOOK.InitReportBox(BUK_CAUSIRAPBOOK_SEC_PAGEHEADER, BUK_CAUSIRAPBOOK_RPTBOX_CODICEHEADER, 300, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_CODICEHEADER, "8DE3CDA1-3F8F-4059-B83E-17CA70C06B7E");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_CODICEHEADER, BUK_CAUSIRAPBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_CODICE, "7E451575-90B6-4C42-8E5E-BF7A63424A31");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_CODICE, "CODICE");
    BUK_CAUSIRAPBOOK.InitReportBox(BUK_CAUSIRAPBOOK_SEC_PAGEHEADER, BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCDHEA, 12400, 0, 2400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCDHEA, "C77FDAB1-46DB-4314-B1A2-093134B7A067");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCDHEA, "ALIQSSNCDHEA");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCDHEA, BUK_CAUSIRAPBOOK_SPAN_ALIQCARICDEB, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Aliq. carico Deb.", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_ALIQCARICDEB, "499781BE-C83E-4369-993B-CC4FFC533FC8");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_ALIQCARICDEB, "ALIQCARICDEB");
    BUK_CAUSIRAPBOOK.InitReportBox(BUK_CAUSIRAPBOOK_SEC_PAGEHEADER, BUK_CAUSIRAPBOOK_RPTBOX_DESCRIHEADER, 1700, 0, 9400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_DESCRIHEADER, "2A91EAFF-2CBB-4F53-9AE6-09B5A37423D4");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_DESCRIHEADER, BUK_CAUSIRAPBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_DESCRIZIONE, "D2574D0E-E7C4-42DF-9771-9F273999305B");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CAUSIRAPBOOK.InitReportBox(BUK_CAUSIRAPBOOK_SEC_PAGEHEADER, BUK_CAUSIRAPBOOK_RPTBOX_ALISSCE11HE1, 15100, 0, 2400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_ALISSCE11HE1, "5C6D05C6-6985-4A13-99E6-CE1E2C62588D");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_ALISSCE11HE1, "ALISSCE11HE1");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_ALISSCE11HE1, BUK_CAUSIRAPBOOK_SPAN_ALIQUOTA, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Aliq. carico Ente", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_ALIQUOTA, "614B99CC-FB4C-4CDE-AABF-96C9C3BDBB3F");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_ALIQUOTA, "ALIQUOTA");
    BUK_CAUSIRAPBOOK.InitSection(BUK_CAUSIRAPBOOK_RPT_NEWREPORT, BUK_CAUSIRAPBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSIRAPBOOK.SetSectionRendersInto(BUK_CAUSIRAPBOOK_SEC_TITOLO, BUK_CAUSIRAPBOOK_RPTBOX_TITOLO);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SEC_TITOLO, "1EFCD773-A75F-4BC8-AB95-18FF61632126");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SEC_TITOLO, "TITOLO");
    BUK_CAUSIRAPBOOK.InitReportBox(BUK_CAUSIRAPBOOK_SEC_TITOLO, BUK_CAUSIRAPBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_NEWBOX, "E5931286-998F-4623-B7AE-F99B0863778D");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_NEWBOX, BUK_CAUSIRAPBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Causali I.R.A.P.", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_VARIADIBILAN, "22CE90ED-1B77-487D-A3A1-9180E263D286");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CAUSIRAPBOOK.InitSection(BUK_CAUSIRAPBOOK_RPT_NEWREPORT, BUK_CAUSIRAPBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSIRAPBOOK.SetSectionRendersInto(BUK_CAUSIRAPBOOK_SEC_DETAIL, BUK_CAUSIRAPBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SEC_DETAIL, "D0729171-104E-4A96-B0D4-1B2DD15F5435");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SEC_DETAIL, "DETAIL");
    BUK_CAUSIRAPBOOK.InitReportBox(BUK_CAUSIRAPBOOK_SEC_DETAIL, BUK_CAUSIRAPBOOK_RPTBOX_CODICE, 0, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_CODICE, "F8E8BD40-702E-4270-957D-E6C23BD68800");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_CODICE, BUK_CAUSIRAPBOOK_SPAN_TCCIRAPCIRAP, MyGlb.VIS_DEFAREPOSTYL, 1, 1, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_TCCIRAPCIRAP, "95C781D7-595C-470F-A5A0-34E6F3BCBF0A");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_TCCIRAPCIRAP, "TCCIRAPCIRAP");
    BUK_CAUSIRAPBOOK.InitReportBox(BUK_CAUSIRAPBOOK_SEC_DETAIL, BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCD, 12500, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCD, "C991FA0D-466D-49F2-9AEC-7C9C1EBE8130");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCD, "ALIQSSNCD");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCD, BUK_CAUSIRAPBOOK_SPAN_TASCCIRAPCIR, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::ALIQ_SSN_CD", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_TASCCIRAPCIR, "CF87F416-F067-4A3D-A984-AA7ED7799C1A");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_TASCCIRAPCIR, "TASCCIRAPCIR");
    BUK_CAUSIRAPBOOK.InitReportBox(BUK_CAUSIRAPBOOK_SEC_DETAIL, BUK_CAUSIRAPBOOK_RPTBOX_DESCRIZIONE, 1700, 0, 9400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_DESCRIZIONE, "68981F73-71CA-473E-B70A-DF22B84AD6A7");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_DESCRIZIONE, BUK_CAUSIRAPBOOK_SPAN_TDCIRAPCIRAP, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_TDCIRAPCIRAP, "8029945D-9B36-4357-BA3D-748ED8315FE2");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_TDCIRAPCIRAP, "TDCIRAPCIRAP");
    BUK_CAUSIRAPBOOK.InitReportBox(BUK_CAUSIRAPBOOK_SEC_DETAIL, BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCE1, 15200, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCE1, "3A10223C-1AED-420E-804E-011B4ADF47E0");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCE1, "ALIQSSNCE1");
    BUK_CAUSIRAPBOOK.InitBoxSpan(BUK_CAUSIRAPBOOK_RPTBOX_ALIQSSNCE1, BUK_CAUSIRAPBOOK_SPAN_TACIRAPCIRAP, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::ALIQ_SSN_CE", 1);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SPAN_TACIRAPCIRAP, "4CB36366-1EB6-4D8F-BB22-1C7285CC1DC6");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SPAN_TACIRAPCIRAP, "TACIRAPCIRAP");
    BUK_CAUSIRAPBOOK.InitSection(BUK_CAUSIRAPBOOK_RPT_NEWREPORT, BUK_CAUSIRAPBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSIRAPBOOK.SetSectionRendersInto(BUK_CAUSIRAPBOOK_SEC_REPORTFOOTER, BUK_CAUSIRAPBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSIRAPBOOK.SetRTCGuid(BUK_CAUSIRAPBOOK_SEC_REPORTFOOTER, "66EF4C45-956C-4FCD-965E-A6CB173EF3DB");
    BUK_CAUSIRAPBOOK.SetObjCode(BUK_CAUSIRAPBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CAUSIRAPBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CAUSIRAPBOOK_InitLinks()
  {
    BUK_CAUSIRAPBOOK.SetBoxNextBox(BUK_CAUSIRAPBOOK_RPTBOX_PAGEBODY, BUK_CAUSIRAPBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CAUSALIIRAP) PAN_CAUSALIIRAP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALIIRAP) PAN_CAUSALIIRAP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAUSALIIRAP) PAN_CAUSALIIRAP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALIIRAP) PAN_CAUSALIIRAP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CAUSALIIRAP) PAN_CAUSALIIRAP_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CAUSALIIRAP) PAN_CAUSALIIRAP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CAUSIRAPBOOK) BUK_CAUSIRAPBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CAUSIRAPBOOK) BUK_CAUSIRAPBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CAUSIRAPBOOK) BUK_CAUSIRAPBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CAUSIRAPBOOK) BUK_CAUSIRAPBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CAUSIRAPBOOK) BUK_CAUSIRAPBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CAUSIRAPBOOK) BUK_CAUSIRAPBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CAUSIRAPBOOK) BUK_CAUSIRAPBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CAUSIRAPBOOK) BUK_CAUSIRAPBOOK_OnPreview();
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
