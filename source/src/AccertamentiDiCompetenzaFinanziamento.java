// **********************************************
// Accertamenti Di Competenza Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AccertamentiDiCompetenzaFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ACCEDICOMFIN_CAPITOLO = 0;
  private static int PFL_ACCEDICOMFIN_ARTICOLO = 1;
  private static int PFL_ACCEDICOMFIN_NUMEROACC = 2;
  private static int PFL_ACCEDICOMFIN_ANNOACC = 3;
  private static int PFL_ACCEDICOMFIN_DATA = 4;
  private static int PFL_ACCEDICOMFIN_DESCRIZIONE = 5;
  private static int PFL_ACCEDICOMFIN_IMPORTO = 6;
  private static int PFL_ACCEDICOMFIN_DEBITORE = 7;
  private static int PFL_ACCEDICOMFIN_SEDEDEL = 8;
  private static int PFL_ACCEDICOMFIN_NUMERODEL = 9;
  private static int PFL_ACCEDICOMFIN_ANNODEL = 10;
  private static int PFL_ACCEDICOMFIN_UNITAPROPONE = 11;
  private static int PFL_ACCEDICOMFIN_NUMEROPROPOS = 12;
  private static int PFL_ACCEDICOMFIN_ANNOPROPOSTA = 13;
  private static int PFL_ACCEDICOMFIN_PROGETTO = 14;
  private static int PFL_ACCEDICOMFIN_LABELCAPITOL = 15;
  private static int PFL_ACCEDICOMFIN_LABELACCERTA = 16;
  private static int PFL_ACCEDICOMFIN_LABELDELIBER = 17;
  private static int PFL_ACCEDICOMFIN_LABELPROPOST = 18;
  private static int PFL_ACCEDICOMFIN_RIFBILANCPEG = 19;
  private static int PFL_ACCEDICOMFIN_ACCERTAMENTO = 20;
  private static int PFL_ACCEDICOMFIN_DELIBERA = 21;
  private static int PFL_ACCEDICOMFIN_PROPOSTA = 22;

  private static int PPQRY_ESEACCFIN = 0;


  IDPanel PAN_ACCEDICOMFIN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI40(IMDB);
    //
    //
    Init_PQRY_ESEACCFIN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI40(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI40, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI40, "TBL_PARAMETRI40");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI40,IMDBDef1.FLD_PARAMETRI40_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI40,IMDBDef1.FLD_PARAMETRI40_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI40, 0);
  }

  private static void Init_PQRY_ESEACCFIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ESEACCFIN, 20);
    IMDB.set_TblCode(IMDBDef8.PQRY_ESEACCFIN, "PQRY_ESEACCFIN");
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEFIRIBIPEG, "ESEFIRIBIPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEFIRIBIPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEACFINACCE, "ESEACFINACCE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEACFINACCE,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEACFINIMPO, "ESEACFINIMPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEACFINIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEACFINDELI, "ESEACFINDELI");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEACFINDELI,5,208,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEACFINPROP, "ESEACFINPROP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ESEACFINPROP,5,212,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_PROGETTO_ID,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCFIN,IMDBDef8.PQSL_ESEACCFIN_NUMERO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ESEACCFIN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AccertamentiDiCompetenzaFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public AccertamentiDiCompetenzaFinanziamento()
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
    FormIdx = MyGlb.FRM_ACCEDICOMFIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "98CE53B6-2B0A-47E5-9DEF-AB95CDAA70CE";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 410;
    set_Caption(new IDVariant("Accertamenti Di Competenza Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 384;
    Frames[1].Caption = "Accertamenti Di Competenza Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 384;
    PAN_ACCEDICOMFIN = new IDPanel(w, this, 1, "PAN_ACCEDICOMFIN");
    Frames[1].Content = PAN_ACCEDICOMFIN;
    PAN_ACCEDICOMFIN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCEDICOMFIN.VS = MainFrm.VisualStyleList;
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8FB7C078-FA4D-4BA9-AFB6-EE4DA56762DE");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1192, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCEDICOMFIN.InitStatus = 2;
    PAN_ACCEDICOMFIN_Init();
    PAN_ACCEDICOMFIN_InitFields();
    PAN_ACCEDICOMFIN_InitQueries();
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
      PAN_ACCEDICOMFIN.UpdatePanel(MainFrm);
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
    return (obj instanceof AccertamentiDiCompetenzaFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AccertamentiDiCompetenzaFinanziamento.class.getName() : (Glb.ClassWithPackage(AccertamentiDiCompetenzaFinanziamento.class) ? AccertamentiDiCompetenzaFinanziamento.class.getName().substring(AccertamentiDiCompetenzaFinanziamento.class.getPackage().getName().length() + 1) : AccertamentiDiCompetenzaFinanziamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Accertamenti Di Competenza Finanziamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCEDICOMFIN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCEDICOMFIN);
      // 
      // Accertamenti Di Competenza Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ACCEDICOMFIN.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCEDICOMFIN_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_ESEACCFIN, IMDBDef8.PQSL_ESEACCFIN_DESCRIZIONE, 0).stringValue()); 
      PAN_ACCEDICOMFIN.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCEDICOMFIN_DEBITORE,IMDB.Value(IMDBDef8.PQRY_ESEACCFIN, IMDBDef8.PQSL_ESEACCFIN_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiDiCompetenzaFinanziamento", "AccertamentiDiCompetenzaFinanziamentoOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("AccertamentiDiCompetenzaFinanziamento", "LoadEvent", _e);
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
  private void PAN_ACCEDICOMFIN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCEDICOMFIN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCEDICOMFIN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCEDICOMFIN, Cancel);
    // Stub
  }

  private void PAN_ACCEDICOMFIN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ACCEDICOMFIN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ACCEDICOMFIN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ESEACCFIN, IMDBDef8.PQSL_ESEACCFIN_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ESEACCFIN, IMDBDef8.PQSL_ESEACCFIN_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ACCEDICOMFIN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ACCEDICOMFIN_Init()
  {

    PAN_ACCEDICOMFIN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCEDICOMFIN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ACCEDICOMFIN.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, "010866F9-8A91-4FA2-80C0-7C632E560017");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, "CAPITOLO");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, "B7D55221-7B81-486B-A965-51D1AD11AF9B");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, "ARTICOLO");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, "DF29FA4D-18D1-4713-9181-A6890C1877F4");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, "NUMERO ACC");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, "D96C3829-6FC2-4880-9B4A-90C68F87CA0C");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, "ANNO ACC");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, "579AEDD1-AB3A-4DF3-9217-E983289D6AFC");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, "Data");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, "2DE74657-C755-4063-82D3-5328C4406FB1");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, "Descrizione");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, "06395C44-02F1-4C41-87EC-8FB20EBEF183");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, "Importo");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, "4EEE10E1-8542-425E-982F-8055E870CA93");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, "Debitore");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, "CF54FB44-4753-485F-B0D6-0DA177C29BEA");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, "SEDE DEL");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, "4AB644F3-1FC7-467C-B2B5-A71679BD0423");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, "NUMERO DEL");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, "D152BCEE-997E-48B8-841C-44338E1D76DF");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, "ANNO DEL");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, "219A56E8-F38C-4A3E-9180-ADD82B89C3F5");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, "6717ED12-3D74-44A1-B18E-E8D8A7003883");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, "44075DEE-82DF-4BA6-81DA-BFCF7A102DA5");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, "66D9DA4E-1323-4DDB-B6F2-44E54D6BE8BC");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, "Obiettivo Operativo");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, "");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, "BB12B3F8-7345-4E97-9CD8-E615FF7E7AD0");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, "Capitolo");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, "ADE15C75-0877-44C5-93BE-DD8CB900A713");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, "Accertamento");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, "B0D66B8D-847D-4958-95E5-0F111D3D7D3B");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, "Delibera");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, "BA6C2525-4AA1-467E-B47C-9F7A40C6D08E");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, "Proposta");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, "605AFBD6-187F-4525-93FE-21EB1E879716");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, "To String (ACC CAPITOLO) + \" - \" + To String (ACC ARTICOLO)");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, "4A86472B-F7F2-443E-BB2C-D15666B34442");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, "Accertamento");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, "To String (NUMERO ACC) + \" / \" + To String (ANNO ACC)");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, "961BB1D1-3E8F-4AFE-BDCA-FBEB1315326A");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, "Delibera");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, "ACC SEDE DEL + \" - \" + To String (ACC NUMERO DEL) + \" / \" + To String (ACC ANNO DEL)");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, "54E3F052-C7DB-4713-A6CD-A0E57AAFABBE");
    PAN_ACCEDICOMFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, "Proposta");
    PAN_ACCEDICOMFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, "ACC UNITA PROPONENTE + \" - \" + To String (ACC NUMERO PROPOSTA) + \" / \" + To String (ACC ANNO PROPOSTA)");
    PAN_ACCEDICOMFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEDICOMFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ACCEDICOMFIN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, MyGlb.PANEL_FORM, 4, 640, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_CAPITOLO, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_CAPITOLO, PPQRY_ESEACCFIN, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, MyGlb.PANEL_FORM, 4, 664, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_ARTICOLO, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_ARTICOLO, PPQRY_ESEACCFIN, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, MyGlb.PANEL_LIST, 136, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, MyGlb.PANEL_FORM, 4, 688, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_NUMEROACC, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_NUMEROACC, PPQRY_ESEACCFIN, "B.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, MyGlb.PANEL_LIST, 184, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, MyGlb.PANEL_FORM, 4, 712, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_ANNOACC, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_ANNOACC, PPQRY_ESEACCFIN, "B.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, MyGlb.PANEL_LIST, 228, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, MyGlb.PANEL_LIST, 68);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, MyGlb.PANEL_FORM, 4, 496, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, MyGlb.PANEL_FORM, 68);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_DATA, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_DATA, PPQRY_ESEACCFIN, "B.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, MyGlb.PANEL_LIST, 304, 36, 204, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 148, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_DESCRIZIONE, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_DESCRIZIONE, PPQRY_ESEACCFIN, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, MyGlb.PANEL_LIST, 508, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, MyGlb.PANEL_FORM, 4, 400, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_IMPORTO, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldUnbound(PFL_ACCEDICOMFIN_IMPORTO, true);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_IMPORTO, PPQRY_ESEACCFIN, "NVL(A.SALDO_INI + A.VARIAZIONI, 0)", "ESEACFINIMPO", 3, 28, 6, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, MyGlb.PANEL_LIST, 608, 36, 204, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, MyGlb.PANEL_LIST, 140);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, MyGlb.PANEL_FORM, 4, 376, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, MyGlb.PANEL_FORM, 140);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_DEBITORE, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_DEBITORE, PPQRY_ESEACCFIN, "C.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, MyGlb.PANEL_LIST, 812, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, MyGlb.PANEL_FORM, 4, 736, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_SEDEDEL, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_SEDEDEL, PPQRY_ESEACCFIN, "B.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, MyGlb.PANEL_LIST, 856, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, MyGlb.PANEL_FORM, 4, 760, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_NUMERODEL, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_NUMERODEL, PPQRY_ESEACCFIN, "B.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, MyGlb.PANEL_LIST, 900, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, MyGlb.PANEL_FORM, 4, 784, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_ANNODEL, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_ANNODEL, PPQRY_ESEACCFIN, "B.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, MyGlb.PANEL_LIST, 936, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 808, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_UNITAPROPONE, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_UNITAPROPONE, PPQRY_ESEACCFIN, "B.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1044, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 832, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_NUMEROPROPOS, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_NUMEROPROPOS, PPQRY_ESEACCFIN, "B.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1084, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 856, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_ANNOPROPOSTA, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_ANNOPROPOSTA, PPQRY_ESEACCFIN, "B.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, MyGlb.PANEL_LIST, 1120, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_PROGETTO, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldUnbound(PFL_ACCEDICOMFIN_PROGETTO, true);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_PROGETTO, PPQRY_ESEACCFIN, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'SI')", "PROGETTO_ID", 5, 99, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 140, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_LABELCAPITOL, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, MyGlb.PANEL_LIST, 136, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, MyGlb.PANEL_FORM, 8, 8, 140, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELACCERTA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_LABELACCERTA, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, MyGlb.PANEL_LIST, 812, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, MyGlb.PANEL_FORM, 16, 16, 140, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_LABELDELIBER, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, MyGlb.PANEL_LIST, 936, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, MyGlb.PANEL_FORM, 24, 24, 140, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_LABELPROPOST, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 880, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_RIFBILANCPEG, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldUnbound(PFL_ACCEDICOMFIN_RIFBILANCPEG, true);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_RIFBILANCPEG, PPQRY_ESEACCFIN, "TO_CHAR ( B.CAPITOLO ) || ' - ' || TO_CHAR ( B.ARTICOLO )", "ESEFIRIBIPEG", 5, 201, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 880, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_ACCERTAMENTO, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldUnbound(PFL_ACCEDICOMFIN_ACCERTAMENTO, true);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_ACCERTAMENTO, PPQRY_ESEACCFIN, "TO_CHAR ( B.NUMERO_ACC ) || ' / ' || TO_CHAR ( B.ANNO_ACC )", "ESEACFINACCE", 5, 201, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, MyGlb.PANEL_FORM, 4, 880, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_DELIBERA, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldUnbound(PFL_ACCEDICOMFIN_DELIBERA, true);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_DELIBERA, PPQRY_ESEACCFIN, "B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL )", "ESEACFINDELI", 5, 208, 0, -13997);
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ACCEDICOMFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, MyGlb.PANEL_FORM, 4, 880, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_ACCEDICOMFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMFIN_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_ACCEDICOMFIN.SetFieldPage(PFL_ACCEDICOMFIN_PROPOSTA, -1, -1);
    PAN_ACCEDICOMFIN.SetFieldUnbound(PFL_ACCEDICOMFIN_PROPOSTA, true);
    PAN_ACCEDICOMFIN.SetFieldPanel(PFL_ACCEDICOMFIN_PROPOSTA, PPQRY_ESEACCFIN, "B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA )", "ESEACFINPROP", 5, 212, 0, -13997);
  }

  private void PAN_ACCEDICOMFIN_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCEDICOMFIN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ACCEDICOMFIN.SetIMDB(IMDB, "PQRY_ESEACCFIN", true);
    PAN_ACCEDICOMFIN.set_SetString(MyGlb.MASTER_ROWNAME, "ESEACC FIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.CAPITOLO ) || ' - ' || TO_CHAR ( B.ARTICOLO ) as ESEFIRIBIPEG, ");
    SQL.append("  TO_CHAR ( B.NUMERO_ACC ) || ' / ' || TO_CHAR ( B.ANNO_ACC ) as ESEACFINACCE, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  NVL(A.SALDO_INI + A.VARIAZIONI, 0) as ESEACFINIMPO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL ) as ESEACFINDELI, ");
    SQL.append("  B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA ) as ESEACFINPROP, ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'SI') as PROGETTO_ID, ");
    SQL.append("  B.CAPITOLO as CAPITOLO, ");
    SQL.append("  B.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  B.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  B.DEBITORE as DEBITORE, ");
    SQL.append("  B.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  B.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  B.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  B.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  B.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  B.NUMERO_PROPOSTA as NUMERO_PROPOSTA ");
    PAN_ACCEDICOMFIN.SetQuery(PPQRY_ESEACCFIN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEACC_FIN A, ");
    SQL.append("  ACC B, ");
    SQL.append("  BEN C ");
    PAN_ACCEDICOMFIN.SetQuery(PPQRY_ESEACCFIN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.DEBITORE = C.CODICE(+)) ");
    SQL.append("and   (A.ANNO_ACC = B.ANNO_ACC(+)) ");
    SQL.append("and   (A.NUMERO_ACC = B.NUMERO_ACC(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_ACC = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~TBL_PARAMETRI40.PARAMFINANZI~~) ");
    PAN_ACCEDICOMFIN.SetQuery(PPQRY_ESEACCFIN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCEDICOMFIN.SetQuery(PPQRY_ESEACCFIN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCEDICOMFIN.SetQuery(PPQRY_ESEACCFIN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.NUMERO_ACC, ");
    SQL.append("  B.ANNO_ACC ");
    PAN_ACCEDICOMFIN.SetQuery(PPQRY_ESEACCFIN, 5, SQL, -1, "");
    PAN_ACCEDICOMFIN.SetQueryDB(PPQRY_ESEACCFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCEDICOMFIN.SetMasterTable(0, "ESEACC_FIN");
    PAN_ACCEDICOMFIN.AddToSortList(PFL_ACCEDICOMFIN_CAPITOLO, true);
    PAN_ACCEDICOMFIN.AddToSortList(PFL_ACCEDICOMFIN_ARTICOLO, true);
    PAN_ACCEDICOMFIN.AddToSortList(PFL_ACCEDICOMFIN_NUMEROACC, true);
    PAN_ACCEDICOMFIN.AddToSortList(PFL_ACCEDICOMFIN_ANNOACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCEDICOMFIN.Status() == 2)
    {
      int oldListQBE = PAN_ACCEDICOMFIN.iUseListQBE;
      PAN_ACCEDICOMFIN.iUseListQBE = 0;
      PAN_ACCEDICOMFIN.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCEDICOMFIN.PanelCommand(Glb.PCM_FIND);
      PAN_ACCEDICOMFIN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ACCEDICOMFIN) PAN_ACCEDICOMFIN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCEDICOMFIN) PAN_ACCEDICOMFIN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ACCEDICOMFIN) PAN_ACCEDICOMFIN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCEDICOMFIN) PAN_ACCEDICOMFIN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ACCEDICOMFIN) PAN_ACCEDICOMFIN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
