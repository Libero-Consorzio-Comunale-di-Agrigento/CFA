// **********************************************
// Info Delibera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoDelibera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DELIBERA_INSERIMENTO = 0;
  private static int GRP_DELIBERA_AGGIORNAMENT = 1;

  private static int PFL_DELIBERA_ANNO = 0;
  private static int PFL_DELIBERA_NUMERO = 1;
  private static int PFL_DELIBERA_SEDE = 2;
  private static int PFL_DELIBERA_DESCRIZIONE = 3;
  private static int PFL_DELIBERA_ESECUTIVITA = 4;
  private static int PFL_DELIBERA_APPROVAZIONN = 5;
  private static int PFL_DELIBERA_DATADELIBERA = 6;
  private static int PFL_DELIBERA_DATA1 = 7;
  private static int PFL_DELIBERA_ANNOPRO = 8;
  private static int PFL_DELIBERA_NUMEROPRO = 9;
  private static int PFL_DELIBERA_UNITAPRO = 10;
  private static int PFL_DELIBERA_URLDOCUMENTO = 11;

  private static int PPQRY_DEL5 = 0;

  private static int PPQRY_T11 = 1;
  private static int PPQRY_T10 = 2;


  IDPanel PAN_DELIBERA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI437(IMDB);
    //
    //
    Init_PQRY_DEL5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI437(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI437, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI437, "TBL_PARAMETRI437");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI437,IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, "ROWNAMESEDE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI437,IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE,5,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI437,IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI437,IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI437,IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI437,IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER,1,6,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI437, 0);
  }

  private static void Init_PQRY_DEL5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DEL5, 13);
    IMDB.set_TblCode(IMDBDef8.PQRY_DEL5, "PQRY_DEL5");
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_TIPO_ESEC, "TIPO_ESEC");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_TIPO_ESEC,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_NUMERO_APP, "NUMERO_APP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_NUMERO_APP,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_DATA_APP, "DATA_APP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_DATA_APP,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_D_DATA_DEL, "D_DATA_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_D_DATA_DEL,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_D_DATA_APP, "D_DATA_APP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_D_DATA_APP,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_ANNO_PRO, "ANNO_PRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_ANNO_PRO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_NUMERO_PRO, "NUMERO_PRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_NUMERO_PRO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_UNITA_PRO, "UNITA_PRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_UNITA_PRO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_URLDOCUMENTO, "URLDOCUMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL5,IMDBDef8.PQSL_DEL5_URLDOCUMENTO,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_DEL5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoDelibera(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoDelibera()
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
    FormIdx = MyGlb.FRM_INFODELIBERA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6827F6E8-4E61-46D3-A489-9DFEB6CE2EAA";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 580;
    DesignHeight = 270;
    set_Caption(new IDVariant("Delibere"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 580;
    Frames[1].Height = 244;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Delibera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 244;
    PAN_DELIBERA = new IDPanel(w, this, 1, "PAN_DELIBERA");
    Frames[1].Content = PAN_DELIBERA;
    PAN_DELIBERA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DELIBERA.VS = MainFrm.VisualStyleList;
    PAN_DELIBERA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 244-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D51AC9BA-0A0B-4B29-BE0A-0C2F45999499");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 512, 268, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DELIBERA.InitStatus = 2;
    PAN_DELIBERA_Init();
    PAN_DELIBERA_InitFields();
    PAN_DELIBERA_InitQueries();
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
      PAN_DELIBERA.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoDelibera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoDelibera.class.getName() : (Glb.ClassWithPackage(InfoDelibera.class) ? InfoDelibera.class.getName().substring(InfoDelibera.class.getPackage().getName().length() + 1) : InfoDelibera.class.getName()));
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
      MainFrm.ErrObj.ProcError ("InfoDelibera", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      UNLOADEVENT_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDelibera", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, new IDVariant());
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
  private void PAN_DELIBERA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DELIBERA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DELIBERA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DELIBERA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DELIBERA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DELIBERA);
    // Stub
  }

  private void PAN_DELIBERA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DELIBERA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DELIBERA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DELIBERA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DELIBERA_Init()
  {

    PAN_DELIBERA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DELIBERA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, "C7A6C46B-5E6E-456A-8995-1E2B396F3663");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, "Inserimento");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 0, 70);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 1, 13);
    PAN_DELIBERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 0, 4);
    PAN_DELIBERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 1, 4);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, "AF1D9650-DC7A-4C18-96D6-21D2E659D216");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, "Aggiornamento");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 0, 88);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 1, 13);
    PAN_DELIBERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 0, 4);
    PAN_DELIBERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 1, 4);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DELIBERA.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, "3145B66D-654D-4860-9E66-B3DA4B9A0B00");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, "Anno");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, "AB5FEBE8-2686-4CDA-84B2-CBD83F271FFA");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, "Numero");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, "E8C215D7-FABD-49D3-8300-605635977E6B");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, "Sede");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, "AB6009F6-8105-403C-9A52-82C3FCD089FF");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, "Descrizione");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, "0C54083C-AD9E-4FF9-9985-51FCA9DCD1A6");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, "Esecutività");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, "7D6ACC99-ED96-4FC7-939A-F9D54DD05BBD");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, "Approvazione N.");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, "A8CAA956-5AE4-4E4F-9BCD-5ED98D79BFD3");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, "Data Delibera");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, "Data Delibera");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, "8BA0C6DB-21D4-4C11-8296-5268DF0840FF");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, "Data");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, "2C7DB9F1-364B-4B91-8C9A-429B9CEB9678");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, "ANNO PRO");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, "F335A006-657A-419D-A725-E75D1CE0AA9E");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, "NUMERO PRO");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, "07CEF59D-69B4-4820-AF3D-F19DD13092BB");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, "UNITA PRO");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, "E43DD271-4A15-4209-BE9F-4C88561443F5");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, "Url Documento");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, MyGlb.VIS_HTMEDISTNOSF);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DELIBERA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_LIST, 60);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_FORM, 56, 56, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_FORM, 48);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_ANNO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_ANNO, PPQRY_DEL5, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_LIST, 72);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_LIST, "Num.");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_FORM, 44, 32, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_FORM, 60);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_NUMERO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_NUMERO, PPQRY_DEL5, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_LIST, 56);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_LIST, "Sede");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_FORM, 8, 8, 504, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_FORM, 96);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_FORM, "Sede");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_SEDE, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_SEDE, PPQRY_DEL5, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 276, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_LIST, 104);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_FORM, 20, 80, 492, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_DESCRIZIONE, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_DESCRIZIONE, PPQRY_DEL5, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_LIST, 184, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_LIST, 60);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_LIST, "Esec.");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_FORM, 32, 164, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_FORM, 72);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_FORM, "Esecutività");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_ESECUTIVITA, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_ESECUTIVITA, PPQRY_DEL5, "A.TIPO_ESEC", "TIPO_ESEC", 1, 2, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_LIST, 224, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_LIST, 76);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_LIST, "Appr. N");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_FORM, 4, 140, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_FORM, 100);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_FORM, "Approvazione N.");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_APPROVAZIONN, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_APPROVAZIONN, PPQRY_DEL5, "A.NUMERO_APP", "NUMERO_APP", 5, 10, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_LIST, 336, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_LIST, 68);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_LIST, "Data Delibera");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_FORM, 336, 56, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_FORM, 96);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_FORM, "Data Delibera");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_DATADELIBERA, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_DATADELIBERA, PPQRY_DEL5, "A.D_DATA_DEL", "D_DATA_DEL", 6, 19, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_LIST, 424, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_LIST, 68);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_FORM, 340, 140, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_FORM, 92);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_DATA1, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_DATA1, PPQRY_DEL5, "A.D_DATA_APP", "D_DATA_APP", 6, 19, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_LIST, 520, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_LIST, 64);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_LIST, "ANNO PRO");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_FORM, 88);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_FORM, "ANNO PRO");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_ANNOPRO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_ANNOPRO, PPQRY_DEL5, "A.ANNO_PRO", "ANNO_PRO", 1, 4, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_LIST, 560, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_LIST, 76);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_LIST, "NUM. PRO");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_FORM, 4, 268, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_FORM, 88);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_FORM, "NUMERO PRO");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_NUMEROPRO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_NUMEROPRO, PPQRY_DEL5, "A.NUMERO_PRO", "NUMERO_PRO", 1, 4, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_LIST, 600, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_LIST, 64);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_LIST, "UN. PRO");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_FORM, 152, 244, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_FORM, 80);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_FORM, "UNITA PRO");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_UNITAPRO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_UNITAPRO, PPQRY_DEL5, "A.UNITA_PRO", "UNITA_PRO", 5, 8, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, MyGlb.PANEL_LIST, 92);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, MyGlb.PANEL_LIST, "Url Documento");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, MyGlb.PANEL_FORM, 108, 192, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, MyGlb.PANEL_FORM, 92);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_URLDOCUMENTO, MyGlb.PANEL_FORM, "Url Documento");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_URLDOCUMENTO, -1, -1);
    PAN_DELIBERA.SetFieldUnbound(PFL_DELIBERA_URLDOCUMENTO, true);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_URLDOCUMENTO, PPQRY_DEL5, "GET_URL_DOCUMENTO_ATTI(A.ANNO_DEL,A.NUMERO_DEL,A.SEDE_DEL,'DEL',~~TBL_DATISESSIONE.SESSUSERNAME~~,'SI')", "URLDOCUMENTO", 5, 99, 0, -13997);
  }

  private void PAN_DELIBERA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DELIBERA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T11CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T11DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T11 A ");
    SQL.append("where (~~SEDE_DEL~~ = A.CODICE) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DELIBERA.SetQuery(PPQRY_T11, 0, SQL, PFL_DELIBERA_SEDE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T11CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T11DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T11 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DELIBERA.SetQuery(PPQRY_T11, 1, SQL, PFL_DELIBERA_SEDE, "");
    PAN_DELIBERA.SetQueryDB(PPQRY_T11, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T10CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T10DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T10 A ");
    SQL.append("where (A.CODICE = ~~TIPO_ESEC~~) ");
    PAN_DELIBERA.SetQuery(PPQRY_T10, 0, SQL, PFL_DELIBERA_ESECUTIVITA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T10CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T10DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T10 A ");
    PAN_DELIBERA.SetQuery(PPQRY_T10, 1, SQL, PFL_DELIBERA_ESECUTIVITA, "");
    PAN_DELIBERA.SetQueryDB(PPQRY_T10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DELIBERA.SetIMDB(IMDB, "PQRY_DEL5", true);
    PAN_DELIBERA.set_SetString(MyGlb.MASTER_ROWNAME, "DEL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_ESEC as TIPO_ESEC, ");
    SQL.append("  A.NUMERO_APP as NUMERO_APP, ");
    SQL.append("  A.DATA_APP as DATA_APP, ");
    SQL.append("  A.D_DATA_DEL as D_DATA_DEL, ");
    SQL.append("  A.D_DATA_APP as D_DATA_APP, ");
    SQL.append("  A.ANNO_PRO as ANNO_PRO, ");
    SQL.append("  A.NUMERO_PRO as NUMERO_PRO, ");
    SQL.append("  A.UNITA_PRO as UNITA_PRO, ");
    SQL.append("  GET_URL_DOCUMENTO_ATTI(A.ANNO_DEL,A.NUMERO_DEL,A.SEDE_DEL,'DEL',~~TBL_DATISESSIONE.SESSUSERNAME~~,'SI') as URLDOCUMENTO ");
    PAN_DELIBERA.SetQuery(PPQRY_DEL5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DEL A ");
    PAN_DELIBERA.SetQuery(PPQRY_DEL5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SEDE_DEL = ~~TBL_PARAMETRI437.ROWNAMESEDE~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~TBL_PARAMETRI437.ROWNAMENUMER~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~TBL_PARAMETRI437.ROWNAMEANNO~~) ");
    PAN_DELIBERA.SetQuery(PPQRY_DEL5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERA.SetQuery(PPQRY_DEL5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERA.SetQuery(PPQRY_DEL5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERA.SetQuery(PPQRY_DEL5, 5, SQL, -1, "");
    PAN_DELIBERA.SetQueryDB(PPQRY_DEL5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DELIBERA.SetMasterTable(0, "DEL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DELIBERA.Status() == 2)
    {
      int oldListQBE = PAN_DELIBERA.iUseListQBE;
      PAN_DELIBERA.iUseListQBE = 0;
      PAN_DELIBERA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DELIBERA.PanelCommand(Glb.PCM_FIND);
      PAN_DELIBERA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
