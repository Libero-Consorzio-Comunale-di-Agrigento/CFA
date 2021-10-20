// **********************************************
// Servizi Diretti Finanziati Dal Capitolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ServiziDirettiFinanziatiDalCapitolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SERVIZDIRETT_SERVIZIO = 0;
  private static int PFL_SERVIZDIRETT_DESCRIZIONE = 1;
  private static int PFL_SERVIZDIRETT_TIPO = 2;
  private static int PFL_SERVIZDIRETT_IMPORTO = 3;
  private static int PFL_SERVIZDIRETT_PERC = 4;
  private static int PFL_SERVIZDIRETT_IMPORTCALCOL = 5;
  private static int PFL_SERVIZDIRETT_VOCEPEGLABEL = 6;
  private static int PFL_SERVIZDIRETT_STANZIALABEL = 7;
  private static int PFL_SERVIZDIRETT_TOTALELABEL = 8;
  private static int PFL_SERVIZDIRETT_SERVIZILABEL = 9;

  private static int PPQRY_SERCOS = 0;


  IDPanel PAN_SERVIZDIRETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI312(IMDB);
    //
    //
    Init_PQRY_SERCOS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI312(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI312, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI312, "TBL_PARAMETRI312");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMTIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMDESCRIZ, "PARAMDESCRIZ");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMDESCRIZ,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMSTANZIA, "PARAMSTANZIA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI312,IMDBDef2.FLD_PARAMETRI312_PARAMSTANZIA,3,14,2);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI312, 0);
  }

  private static void Init_PQRY_SERCOS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_SERCOS, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_SERCOS, "PQRY_SERCOS");
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_SERVIZIO,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_PERCENTUALE, "PERCENTUALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_PERCENTUALE,3,5,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_SERCIMPOCALC, "SERCIMPOCALC");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS,IMDBDef9.PQSL_SERCOS_SERCIMPOCALC,3,28,6);
    IMDB.TblAddNew(IMDBDef9.PQRY_SERCOS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ServiziDirettiFinanziatiDalCapitolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public ServiziDirettiFinanziatiDalCapitolo()
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
    FormIdx = MyGlb.FRM_SERDIRFIDACA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BE03AB2C-B1A0-4B67-A6C9-E9A88F7E4182";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 712;
    DesignHeight = 418;
    set_Caption(new IDVariant("Servizi Diretti Finanziati Dal Capitolo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 712;
    Frames[1].Height = 392;
    Frames[1].Caption = "Servizi Diretti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 392;
    PAN_SERVIZDIRETT = new IDPanel(w, this, 1, "PAN_SERVIZDIRETT");
    Frames[1].Content = PAN_SERVIZDIRETT;
    PAN_SERVIZDIRETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SERVIZDIRETT.VS = MainFrm.VisualStyleList;
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3BAD1B94-243A-43A8-92BC-E09973B2C3D9");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 48, 664, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SERVIZDIRETT.InitStatus = 2;
    PAN_SERVIZDIRETT_Init();
    PAN_SERVIZDIRETT_InitFields();
    PAN_SERVIZDIRETT_InitQueries();
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
      PAN_SERVIZDIRETT.UpdatePanel(MainFrm);
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
    return (obj instanceof ServiziDirettiFinanziatiDalCapitolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ServiziDirettiFinanziatiDalCapitolo.class.getName() : (Glb.ClassWithPackage(ServiziDirettiFinanziatiDalCapitolo.class) ? ServiziDirettiFinanziatiDalCapitolo.class.getName().substring(ServiziDirettiFinanziatiDalCapitolo.class.getPackage().getName().length() + 1) : ServiziDirettiFinanziatiDalCapitolo.class.getName()));
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
    IDVariant v_STANZIAMENTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_STANZIAMENTO = (new IDVariant("Stanziamento: ", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Servizi Diretti Finanziati dal Capitolo", IDVariant.STRING));
      v_CAPITOLO = (new IDVariant("Capitolo: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_SERVIZDIRETT.set_FieldText(PFL_SERVIZDIRETT_VOCEPEGLABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPITOLO, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMCAPITOL, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMARTICOL, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMDESCRIZ, 0)).stringValue());
      PAN_SERVIZDIRETT.set_FieldText(PFL_SERVIZDIRETT_STANZIALABEL, IDL.Add(v_STANZIAMENTO, IDL.Format(IMDB.Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMSTANZIA, 0), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      PAN_SERVIZDIRETT.set_ToolTip(Glb.OBJ_FIELD,PFL_SERVIZDIRETT_VOCEPEGLABEL,(new IDVariant(PAN_SERVIZDIRETT.FieldText(PFL_SERVIZDIRETT_VOCEPEGLABEL))).stringValue()); 
      set_Caption(new IDVariant(v_CAPTION));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDirettiFinanziatiDalCapitolo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi Diretti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SERVIZDIRETT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Servizi Diretti After Find Event Body
      // Procedure Body
      // 
      PAN_SERVIZDIRETT.set_FieldText(PFL_SERVIZDIRETT_TOTALELABEL, IDL.Format(PAN_SERVIZDIRETT.GetFieldSum(PFL_SERVIZDIRETT_IMPORTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDirettiFinanziatiDalCapitolo", "ServiziDirettiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi Diretti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SERVIZDIRETT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SERVIZDIRETT);
      // 
      // Servizi Diretti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SERVIZDIRETT.set_ToolTip(Glb.OBJ_FIELD,PFL_SERVIZDIRETT_DESCRIZIONE,(new IDVariant(PAN_SERVIZDIRETT.FieldText(PFL_SERVIZDIRETT_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDirettiFinanziatiDalCapitolo", "ServiziDirettiOnDynamicPropertiesEvent", _e);
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
  private void PAN_SERVIZDIRETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SERVIZDIRETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SERVIZDIRETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SERVIZDIRETT, Cancel);
    // Stub
  }

  private void PAN_SERVIZDIRETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SERVIZDIRETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SERVIZDIRETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SERVIZDIRETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SERVIZDIRETT_Init()
  {

    PAN_SERVIZDIRETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SERVIZDIRETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SERVIZDIRETT.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, "530FBF7D-A401-4BF5-818F-282CC6FE6DF4");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, "SERVIZIO");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, "392FAA52-46CF-4CED-BAF0-96127ADDCB99");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, "DESCRIZIONE");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, "87E50B3B-8389-48DB-926C-4847536AF59C");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, "Tipo");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, "05154AEE-FDB9-4E88-928D-9FA3B6ABF445");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, "Importo");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, "180095C8-A857-4AC5-B6F5-41C6ACAA941E");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, "Perc.");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, "55246303-FBCE-41B8-B367-752303830199");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, "Importo Calcolato");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, "B7E5DF6D-58DC-4E03-B13C-850965CC8435");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, "2BE21C71-3DFA-476B-97C2-2FB86ED3D042");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, "8D044905-68FA-4C57-978D-AE0B6F9D9B43");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, MyGlb.VIS_CAMPTOTADISA);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, "37DF5F77-5913-422D-91E9-2A73317081B5");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, "Servizio");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_SERVIZDIRETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_LIST, 0, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_LIST, 56);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_LIST, "SERV.");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_FORM, 340, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_FORM, 72);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_FORM, "SERVIZIO");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_SERVIZIO, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_SERVIZIO, PPQRY_SERCOS, "A.SERVIZIO", "SERVIZIO", 1, 3, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_LIST, 40, 84, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 196, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCR.");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_DESCRIZIONE, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_DESCRIZIONE, PPQRY_SERCOS, "B.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_LIST, 300, 84, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_FORM, 4, 220, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_TIPO, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_TIPO, PPQRY_SERCOS, "B.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_SERVIZDIRETT.SetValueListItem(PFL_SERVIZDIRETT_TIPO, (new IDVariant("P")), "Produttivo", "", "", -1);
    PAN_SERVIZDIRETT.SetValueListItem(PFL_SERVIZDIRETT_TIPO, (new IDVariant("G")), "Generale/Istituzionale", "", "", -1);
    PAN_SERVIZDIRETT.SetValueListItem(PFL_SERVIZDIRETT_TIPO, (new IDVariant("D")), "A domanda individuale", "", "", -1);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, MyGlb.PANEL_LIST, 432, 84, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, MyGlb.PANEL_FORM, 4, 148, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, MyGlb.PANEL_FORM, 128);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_IMPORTO, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_IMPORTO, PPQRY_SERCOS, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, MyGlb.PANEL_LIST, 528, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, MyGlb.PANEL_LIST, 80);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, MyGlb.PANEL_LIST, "Perc.");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, MyGlb.PANEL_FORM, 128);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_PERC, MyGlb.PANEL_FORM, "Perc.");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_PERC, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_PERC, PPQRY_SERCOS, "A.PERCENTUALE", "PERCENTUALE", 3, 5, 2, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, MyGlb.PANEL_LIST, 568, 84, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, MyGlb.PANEL_LIST, 96);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, MyGlb.PANEL_LIST, "Importo Calcolato");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, MyGlb.PANEL_FORM, 4, 244, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, MyGlb.PANEL_FORM, 96);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_IMPORTCALCOL, MyGlb.PANEL_FORM, "Imp. Calcolato");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_IMPORTCALCOL, -1, -1);
    PAN_SERVIZDIRETT.SetFieldUnbound(PFL_SERVIZDIRETT_IMPORTCALCOL, true);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_IMPORTCALCOL, PPQRY_SERCOS, "NVL(A.IMPORTO, (~~TBL_PARAMETRI312.PARAMSTANZIA~~ * A.PERCENTUALE) / 100)", "SERCIMPOCALC", 3, 28, 6, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0, 12, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, MyGlb.PANEL_FORM, 4, 16, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_VOCEPEGLABEL, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_VOCEPEGLABEL, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_VOCEPEGLABEL, -1, "", "VOCEPEGLABEL", 0, 0, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, MyGlb.PANEL_LIST, 480, 12, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, MyGlb.PANEL_LIST, 0);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, MyGlb.PANEL_FORM, 12, 24, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, MyGlb.PANEL_FORM, 0);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_STANZIALABEL, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_STANZIALABEL, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_STANZIALABEL, -1, "", "STANZIALABEL", 0, 0, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, MyGlb.PANEL_LIST, 568, 292, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, MyGlb.PANEL_LIST, 0);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, MyGlb.PANEL_FORM, 568, 320, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, MyGlb.PANEL_FORM, 0);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TOTALELABEL, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_TOTALELABEL, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_TOTALELABEL, -1, "", "TOTALELABEL", 0, 0, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, MyGlb.PANEL_LIST, 0, 48, 300, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, MyGlb.PANEL_LIST, 0);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, MyGlb.PANEL_LIST, 2);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, MyGlb.PANEL_FORM, 0, 48, 300, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, MyGlb.PANEL_FORM, 0);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZILABEL, MyGlb.PANEL_FORM, 2);
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_SERVIZILABEL, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_SERVIZILABEL, -1, "", "SERVIZILABEL", 0, 0, 0, -13997);
  }

  private void PAN_SERVIZDIRETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_SERVIZDIRETT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SERVIZDIRETT.SetIMDB(IMDB, "PQRY_SERCOS", true);
    PAN_SERVIZDIRETT.set_SetString(MyGlb.MASTER_ROWNAME, "SERCOS");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as SERVIZIO, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  B.TIPO as TIPO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.PERCENTUALE as PERCENTUALE, ");
    SQL.append("  NVL(A.IMPORTO, (~~TBL_PARAMETRI312.PARAMSTANZIA~~ * A.PERCENTUALE) / 100) as SERCIMPOCALC ");
    PAN_SERVIZDIRETT.SetQuery(PPQRY_SERCOS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  SERCOS A, ");
    SQL.append("  T75 B ");
    PAN_SERVIZDIRETT.SetQuery(PPQRY_SERCOS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI312.PARAMES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI312.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI312.PARAMARTICOL~~) ");
    SQL.append("and   (B.CODICE = A.SERVIZIO) ");
    SQL.append("and   (A.TIPO = ~~TBL_PARAMETRI312.PARAMTIPO~~) ");
    PAN_SERVIZDIRETT.SetQuery(PPQRY_SERCOS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SERVIZDIRETT.SetQuery(PPQRY_SERCOS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SERVIZDIRETT.SetQuery(PPQRY_SERCOS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SERVIZDIRETT.SetQuery(PPQRY_SERCOS, 5, SQL, -1, "");
    PAN_SERVIZDIRETT.SetQueryDB(PPQRY_SERCOS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SERVIZDIRETT.SetMasterTable(0, "SERCOS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SERVIZDIRETT.Status() == 2)
    {
      int oldListQBE = PAN_SERVIZDIRETT.iUseListQBE;
      PAN_SERVIZDIRETT.iUseListQBE = 0;
      PAN_SERVIZDIRETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_SERVIZDIRETT.PanelCommand(Glb.PCM_FIND);
      PAN_SERVIZDIRETT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
