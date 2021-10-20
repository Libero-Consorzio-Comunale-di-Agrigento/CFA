// **********************************************
// Categorie Documenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CategorieDocumenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CATEGODOCUME_CODICE = 0;
  private static int PFL_CATEGODOCUME_DESCRIZIONE = 1;
  private static int PFL_CATEGODOCUME_UTENTEINSERI = 2;
  private static int PFL_CATEGODOCUME_DATAINSERIME = 3;
  private static int PFL_CATEGODOCUME_UTENTULTIAGG = 4;
  private static int PFL_CATEGODOCUME_DATAULTIMAGG = 5;

  private static int PPQRY_T9 = 0;


  IDPanel PAN_CATEGODOCUME;
  CIDREObj BUK_CATEDOCUBOOK;
  OBook BKW_CATEDOCUBOOK;
  //
  // Template Pages constants
  private static int BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG = 1;
  private static int BUK_CATEDOCUBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CATEDOCUBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CATEDOCUBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CATEDOCUBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_CATEDOCUBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CATEDOCUBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_CATEDOCUBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_CATEDOCUBOOK_SPAN_CODICE = 9;
  private static int BUK_CATEDOCUBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_CATEDOCUBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_CATEDOCUBOOK_SEC_TITOLO = 12;
  private static int BUK_CATEDOCUBOOK_RPTBOX_NEWBOX = 13;
  private static int BUK_CATEDOCUBOOK_SPAN_VARIADIBILAN = 14;
  private static int BUK_CATEDOCUBOOK_SEC_DETAIL = 15;
  private static int BUK_CATEDOCUBOOK_RPTBOX_CODICE = 16;
  private static int BUK_CATEDOCUBOOK_SPAN_T0COCADOCADB = 17;
  private static int BUK_CATEDOCUBOOK_RPTBOX_DESCRIZIONE = 18;
  private static int BUK_CATEDOCUBOOK_SPAN_T0DECADOCADB = 19;
  private static int BUK_CATEDOCUBOOK_SEC_REPORTFOOTER = 20;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T9(IMDB);
    Init_PQRY_T08(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T9, 8);
    IMDB.set_TblCode(IMDBDef9.PQRY_T9, "PQRY_T9");
    IMDB.set_FldCode(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_CODICE,5,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_CENTRO_COSTO, "CENTRO_COSTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_CENTRO_COSTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_FATTORE_PRO, "FATTORE_PRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_FATTORE_PRO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T9,IMDBDef9.PQSL_T9_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T9, 0);
  }

  private static void Init_PQRY_T08(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T08, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_T08, "PQRY_T08");
    IMDB.set_FldCode(IMDBDef9.PQRY_T08,IMDBDef9.PQSL_T08_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T08,IMDBDef9.PQSL_T08_CODICE,5,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T08,IMDBDef9.PQSL_T08_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T08,IMDBDef9.PQSL_T08_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T08,IMDBDef9.PQSL_T08_CENTRO_COSTO, "CENTRO_COSTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T08,IMDBDef9.PQSL_T08_CENTRO_COSTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T08,IMDBDef9.PQSL_T08_FATTORE_PRO, "FATTORE_PRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T08,IMDBDef9.PQSL_T08_FATTORE_PRO,5,8,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T08, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CategorieDocumenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public CategorieDocumenti()
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
    FormIdx = MyGlb.FRM_CATEGODOCUME;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9ECC6344-836D-4FBE-9EBA-D1CF81E7BDD7";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 648;
    DesignHeight = 386;
    set_Caption(new IDVariant("Categorie Documenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 648;
    Frames[1].Height = 360;
    Frames[1].Caption = "Categorie Documenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_CATEGODOCUME = new IDPanel(w, this, 1, "PAN_CATEGODOCUME");
    Frames[1].Content = PAN_CATEGODOCUME;
    PAN_CATEGODOCUME.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CATEGODOCUME.VS = MainFrm.VisualStyleList;
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 648-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CATEDOCUBOOK != null)
      PAN_CATEGODOCUME.SetBook(BUK_CATEDOCUBOOK);
    PAN_CATEGODOCUME.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AB2AFB84-A6FA-425F-BF5B-D41170F9493F");
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 564, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CATEGODOCUME.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CATEGODOCUME.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CATEGODOCUME.InitStatus = 2;
    PAN_CATEGODOCUME_Init();
    PAN_CATEGODOCUME_InitFields();
    PAN_CATEGODOCUME_InitQueries();
    BKW_CATEDOCUBOOK = new OBook(this);
    BUK_CATEDOCUBOOK = new CIDREObj(BKW_CATEDOCUBOOK);
    BKW_CATEDOCUBOOK.iGuid = "6126796D-2386-47F3-9017-7A88B74B417B";
    BKW_CATEDOCUBOOK.Code = "BUK_CATEDOCUBOOK";
    BKW_CATEDOCUBOOK.BookObj = BUK_CATEDOCUBOOK;
    BKW_CATEDOCUBOOK.InitDefMasks();
    BUK_CATEDOCUBOOK.InitBook(1, 1245185, "Categorie Documenti Book", IMDB, MainFrm.VisualStyleList);
    BUK_CATEDOCUBOOK.InitHTML();
    BUK_CATEDOCUBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CATEDOCUBOOK.Book.SetMainFrm(MainFrm);
    BUK_CATEDOCUBOOK.SetRTCGuid(0, "6126796D-2386-47F3-9017-7A88B74B417B");
    BUK_CATEDOCUBOOK.SetObjCode(0, "CATEDOCUBOOK");
    if (PAN_CATEGODOCUME != null)
      PAN_CATEGODOCUME.SetBook(BUK_CATEDOCUBOOK);
    BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG_Init();
    BUK_CATEDOCUBOOK_RPT_NEWREPORT_Init();
    BUK_CATEDOCUBOOK_InitLinks();
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
      PAN_CATEGODOCUME.UpdatePanel(MainFrm);
      // BUK_CATEDOCUBOOK.UpdateBook();
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
    if (Code.equals("BUK_CATEDOCUBOOK")) return BUK_CATEDOCUBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CategorieDocumenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CategorieDocumenti.class.getName() : (Glb.ClassWithPackage(CategorieDocumenti.class) ? CategorieDocumenti.class.getName().substring(CategorieDocumenti.class.getPackage().getName().length() + 1) : CategorieDocumenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Categorie Documenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CATEGODOCUME_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CATEGODOCUME);
      // 
      // Categorie Documenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CATEGODOCUME.IsNewRow()))
      {
        PAN_CATEGODOCUME.SetFlags (Glb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CATEGODOCUME.SetFlags (Glb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CATEGODOCUME.set_ToolTip(Glb.OBJ_FIELD,PFL_CATEGODOCUME_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T9, IMDBDef9.PQSL_T9_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CategorieDocumenti", "CategorieDocumentiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Categorie Documenti On Database Error Event
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
  private void PAN_CATEGODOCUME_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CATEGODOCUME, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Categorie Documenti On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CategorieDocumenti", "CategorieDocumentiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Categorie Documenti On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CATEGODOCUME_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Categorie Documenti On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T08PD(IMDB.Value(IMDBDef9.PQRY_T9, IMDBDef9.PQSL_T9_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CategorieDocumenti", "CategorieDocumentiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Categorie Documenti On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CATEGODOCUME_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Categorie Documenti On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T9, IMDBDef9.PQSL_T9_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T9, IMDBDef9.PQSL_T9_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T9, IMDBDef9.PQSL_T9_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T9, IMDBDef9.PQSL_T9_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T9, IMDBDef9.PQSL_T9_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T9, IMDBDef9.PQSL_T9_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CategorieDocumenti", "CategorieDocumentiOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("CategorieDocumenti", "LoadEvent", _e);
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
  private void PAN_CATEGODOCUME_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CATEGODOCUME, Cancel);
    // Stub
  }

  private void PAN_CATEGODOCUME_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CATEGODOCUME_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CATEGODOCUME_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CATEGODOCUME_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CATEGODOCUME_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CATEDOCUBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CATEDOCUBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CATEDOCUBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CATEDOCUBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CATEDOCUBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CATEDOCUBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CATEDOCUBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CATEDOCUBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG)
    {
      BUK_CATEDOCUBOOK.set_SpanValue(BUK_CATEDOCUBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CATEDOCUBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CATEDOCUBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CATEDOCUBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CATEDOCUBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CATEDOCUBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CATEDOCUBOOK_OnPreview()
  {
    PreviewBook = BKW_CATEDOCUBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CATEGODOCUME_Init()
  {

    PAN_CATEGODOCUME.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CATEGODOCUME.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CATEGODOCUME.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_CATEGODOCUME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, "3A098A86-12A5-4308-81AA-234629F400E9");
    PAN_CATEGODOCUME.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, "Codice");
    PAN_CATEGODOCUME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, "");
    PAN_CATEGODOCUME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CATEGODOCUME.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CATEGODOCUME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, "E1E31441-B07B-4901-BD3E-489C7E5051EC");
    PAN_CATEGODOCUME.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, "Descrizione");
    PAN_CATEGODOCUME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, "");
    PAN_CATEGODOCUME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CATEGODOCUME.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_CATEGODOCUME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, "E22C5A47-7FCC-4EFF-8074-CFC3DA1CDC09");
    PAN_CATEGODOCUME.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CATEGODOCUME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, "");
    PAN_CATEGODOCUME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CATEGODOCUME.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CATEGODOCUME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, "740151F9-6D16-453D-8F13-091E874B11C5");
    PAN_CATEGODOCUME.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CATEGODOCUME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, "");
    PAN_CATEGODOCUME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CATEGODOCUME.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CATEGODOCUME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, "56B2CC72-2422-48B0-8738-8CC38ADFB232");
    PAN_CATEGODOCUME.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CATEGODOCUME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, "");
    PAN_CATEGODOCUME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CATEGODOCUME.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CATEGODOCUME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, "8230E8CC-9A68-4E38-9E51-EE1929F53D49");
    PAN_CATEGODOCUME.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CATEGODOCUME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, "");
    PAN_CATEGODOCUME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CATEGODOCUME.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CATEGODOCUME_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, MyGlb.PANEL_FORM, 104);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CATEGODOCUME.SetFieldPage(PFL_CATEGODOCUME_CODICE, -1, -1);
    PAN_CATEGODOCUME.SetFieldPanel(PFL_CATEGODOCUME_CODICE, PPQRY_T9, "A.CODICE", "CODICE", 5, 6, 0, -13997);
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, MyGlb.PANEL_LIST, 68, 36, 496, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, MyGlb.PANEL_FORM, 104);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CATEGODOCUME.SetFieldPage(PFL_CATEGODOCUME_DESCRIZIONE, -1, -1);
    PAN_CATEGODOCUME.SetFieldPanel(PFL_CATEGODOCUME_DESCRIZIONE, PPQRY_T9, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, MyGlb.PANEL_LIST, 508, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CATEGODOCUME.SetFieldPage(PFL_CATEGODOCUME_UTENTEINSERI, -1, -1);
    PAN_CATEGODOCUME.SetFieldPanel(PFL_CATEGODOCUME_UTENTEINSERI, PPQRY_T9, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, MyGlb.PANEL_LIST, 628, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CATEGODOCUME.SetFieldPage(PFL_CATEGODOCUME_DATAINSERIME, -1, -1);
    PAN_CATEGODOCUME.SetFieldPanel(PFL_CATEGODOCUME_DATAINSERIME, PPQRY_T9, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, MyGlb.PANEL_LIST, 736, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CATEGODOCUME.SetFieldPage(PFL_CATEGODOCUME_UTENTULTIAGG, -1, -1);
    PAN_CATEGODOCUME.SetFieldPanel(PFL_CATEGODOCUME_UTENTULTIAGG, PPQRY_T9, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, MyGlb.PANEL_LIST, 848, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CATEGODOCUME.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGODOCUME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CATEGODOCUME.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CATEGODOCUME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGODOCUME_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CATEGODOCUME.SetFieldPage(PFL_CATEGODOCUME_DATAULTIMAGG, -1, -1);
    PAN_CATEGODOCUME.SetFieldPanel(PFL_CATEGODOCUME_DATAULTIMAGG, PPQRY_T9, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CATEGODOCUME_InitQueries()
  {
    StringBuffer SQL;

    PAN_CATEGODOCUME.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CATEGODOCUME.SetIMDB(IMDB, "PQRY_T9", true);
    PAN_CATEGODOCUME.set_SetString(MyGlb.MASTER_ROWNAME, "T08");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CENTRO_COSTO as CENTRO_COSTO, ");
    SQL.append("  A.FATTORE_PRO as FATTORE_PRO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CATEGODOCUME.SetQuery(PPQRY_T9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T08 A ");
    PAN_CATEGODOCUME.SetQuery(PPQRY_T9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CATEGODOCUME.SetQuery(PPQRY_T9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CATEGODOCUME.SetQuery(PPQRY_T9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CATEGODOCUME.SetQuery(PPQRY_T9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CATEGODOCUME.SetQuery(PPQRY_T9, 5, SQL, -1, "");
    PAN_CATEGODOCUME.SetQueryDB(PPQRY_T9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CATEGODOCUME.SetMasterTable(0, "T08");
    PAN_CATEGODOCUME.AddToSortList(PFL_CATEGODOCUME_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CATEGODOCUME.Status() == 2)
    {
      int oldListQBE = PAN_CATEGODOCUME.iUseListQBE;
      PAN_CATEGODOCUME.iUseListQBE = 0;
      PAN_CATEGODOCUME.PanelCommand(Glb.PCM_SEARCH);
      PAN_CATEGODOCUME.PanelCommand(Glb.PCM_FIND);
      PAN_CATEGODOCUME.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG_Init()
  {
    BUK_CATEDOCUBOOK.InitMastro(BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG, "6735A196-4D8F-452D-BBCE-798DF6110B93");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG, "CATDOCBOOPAG");
    BUK_CATEDOCUBOOK.InitMastroBox(BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG, BUK_CATEDOCUBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_RPTBOX_NUMEROPAGINA, "145CA683-2CFD-44E4-8FE6-CEC5CEF96EA5");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CATEDOCUBOOK.InitBoxSpan(BUK_CATEDOCUBOOK_RPTBOX_NUMEROPAGINA, BUK_CATEDOCUBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SPAN_NUMEROPAGINA, "1BA412E1-AE8E-4C39-9764-17248D14BC0A");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CATEDOCUBOOK.InitMastroBox(BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG, BUK_CATEDOCUBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_RPTBOX_PAGEBODY, "99AEEA86-B631-43C0-A2F9-92760FDACA01");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CATEDOCUBOOK.InitMastroBox(BUK_CATEDOCUBOOK_MST_CATDOCBOOPAG, BUK_CATEDOCUBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_RPTBOX_TITOLO, "0E158750-1FC8-441D-9F18-06C45D0D34DD");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CATEDOCUBOOK_RPT_NEWREPORT_InitQuery() { BUK_CATEDOCUBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CATEDOCUBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.CENTRO_COSTO as CENTRO_COSTO, ");
      SQL.append("  A.FATTORE_PRO as FATTORE_PRO ");
      SQL.append("from ");
      SQL.append("  T08 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CATEDOCUBOOK.SetReportQuery(BUK_CATEDOCUBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "AA5A41AD-A55F-4531-8E87-55467CE2A6B2");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CATEDOCUBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CATEDOCUBOOK.InitReport(BUK_CATEDOCUBOOK_RPT_NEWREPORT, 196609);
    BUK_CATEDOCUBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_RPT_NEWREPORT, "FED89D9D-D7D0-483D-98E2-AA4646387F90");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CATEDOCUBOOK.InitSection(BUK_CATEDOCUBOOK_RPT_NEWREPORT, BUK_CATEDOCUBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CATEDOCUBOOK.SetSectionRendersInto(BUK_CATEDOCUBOOK_SEC_PAGEHEADER, BUK_CATEDOCUBOOK_RPTBOX_PAGEBODY);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SEC_PAGEHEADER, "752D6998-AFBA-4CAF-A07D-4720793FF142");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CATEDOCUBOOK.InitReportBox(BUK_CATEDOCUBOOK_SEC_PAGEHEADER, BUK_CATEDOCUBOOK_RPTBOX_CODICEHEADER, 400, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_RPTBOX_CODICEHEADER, "3BFB46A6-EFAE-4B59-B067-1573A6ACF7FF");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CATEDOCUBOOK.InitBoxSpan(BUK_CATEDOCUBOOK_RPTBOX_CODICEHEADER, BUK_CATEDOCUBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SPAN_CODICE, "60DA5AA0-9FD4-4BE4-850E-C28F611C6CD7");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SPAN_CODICE, "CODICE");
    BUK_CATEDOCUBOOK.InitReportBox(BUK_CATEDOCUBOOK_SEC_PAGEHEADER, BUK_CATEDOCUBOOK_RPTBOX_DESCRIHEADER, 1900, 0, 14500, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_RPTBOX_DESCRIHEADER, "85B7EBE5-0E59-428E-848E-42CC5F4014FC");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CATEDOCUBOOK.InitBoxSpan(BUK_CATEDOCUBOOK_RPTBOX_DESCRIHEADER, BUK_CATEDOCUBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SPAN_DESCRIZIONE, "5036043D-33EC-40BC-B08A-BE66414B0275");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CATEDOCUBOOK.InitSection(BUK_CATEDOCUBOOK_RPT_NEWREPORT, BUK_CATEDOCUBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CATEDOCUBOOK.SetSectionRendersInto(BUK_CATEDOCUBOOK_SEC_TITOLO, BUK_CATEDOCUBOOK_RPTBOX_TITOLO);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SEC_TITOLO, "A20651A4-F1E2-40D5-937D-65C8776FCCB0");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SEC_TITOLO, "TITOLO");
    BUK_CATEDOCUBOOK.InitReportBox(BUK_CATEDOCUBOOK_SEC_TITOLO, BUK_CATEDOCUBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_RPTBOX_NEWBOX, "92C4FA95-1B6B-4B5E-99B0-8112E6040FD2");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CATEDOCUBOOK.InitBoxSpan(BUK_CATEDOCUBOOK_RPTBOX_NEWBOX, BUK_CATEDOCUBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Categorie Documenti", 1);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SPAN_VARIADIBILAN, "E6FF1DEA-9EA4-490E-9601-E5C3A994C997");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CATEDOCUBOOK.InitSection(BUK_CATEDOCUBOOK_RPT_NEWREPORT, BUK_CATEDOCUBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CATEDOCUBOOK.SetSectionRendersInto(BUK_CATEDOCUBOOK_SEC_DETAIL, BUK_CATEDOCUBOOK_RPTBOX_PAGEBODY);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SEC_DETAIL, "303A8E11-BB2E-4331-84B2-36C8FC6E94C0");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SEC_DETAIL, "DETAIL");
    BUK_CATEDOCUBOOK.InitReportBox(BUK_CATEDOCUBOOK_SEC_DETAIL, BUK_CATEDOCUBOOK_RPTBOX_CODICE, 100, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_RPTBOX_CODICE, "3991A837-6A62-4202-B536-D2D0BDC222E9");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CATEDOCUBOOK.InitBoxSpan(BUK_CATEDOCUBOOK_RPTBOX_CODICE, BUK_CATEDOCUBOOK_SPAN_T0COCADOCADB, MyGlb.VIS_DEFAREPOSTYL, 5, 6, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SPAN_T0COCADOCADB, "620CD2B0-D586-48FD-9CA8-ABC1F540D5D9");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SPAN_T0COCADOCADB, "T0COCADOCADB");
    BUK_CATEDOCUBOOK.InitReportBox(BUK_CATEDOCUBOOK_SEC_DETAIL, BUK_CATEDOCUBOOK_RPTBOX_DESCRIZIONE, 1900, 0, 14500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_RPTBOX_DESCRIZIONE, "C592D699-2093-4B61-B16D-CF6BE2F0F494");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CATEDOCUBOOK.InitBoxSpan(BUK_CATEDOCUBOOK_RPTBOX_DESCRIZIONE, BUK_CATEDOCUBOOK_SPAN_T0DECADOCADB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SPAN_T0DECADOCADB, "9BAE59BC-7172-4830-A5C1-54DBE2BDFF05");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SPAN_T0DECADOCADB, "T0DECADOCADB");
    BUK_CATEDOCUBOOK.InitSection(BUK_CATEDOCUBOOK_RPT_NEWREPORT, BUK_CATEDOCUBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CATEDOCUBOOK.SetSectionRendersInto(BUK_CATEDOCUBOOK_SEC_REPORTFOOTER, BUK_CATEDOCUBOOK_RPTBOX_PAGEBODY);
    BUK_CATEDOCUBOOK.SetRTCGuid(BUK_CATEDOCUBOOK_SEC_REPORTFOOTER, "5D41B03B-DDB4-4565-A511-128E45D88954");
    BUK_CATEDOCUBOOK.SetObjCode(BUK_CATEDOCUBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CATEDOCUBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CATEDOCUBOOK_InitLinks()
  {
    BUK_CATEDOCUBOOK.SetBoxNextBox(BUK_CATEDOCUBOOK_RPTBOX_PAGEBODY, BUK_CATEDOCUBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CATEGODOCUME) PAN_CATEGODOCUME_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CATEGODOCUME) PAN_CATEGODOCUME_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CATEGODOCUME) PAN_CATEGODOCUME_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CATEGODOCUME) PAN_CATEGODOCUME_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CATEGODOCUME) PAN_CATEGODOCUME_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CATEGODOCUME) PAN_CATEGODOCUME_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CATEDOCUBOOK) BUK_CATEDOCUBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CATEDOCUBOOK) BUK_CATEDOCUBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CATEDOCUBOOK) BUK_CATEDOCUBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CATEDOCUBOOK) BUK_CATEDOCUBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CATEDOCUBOOK) BUK_CATEDOCUBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CATEDOCUBOOK) BUK_CATEDOCUBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CATEDOCUBOOK) BUK_CATEDOCUBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CATEDOCUBOOK) BUK_CATEDOCUBOOK_OnPreview();
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
