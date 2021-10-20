// **********************************************
// Accertamenti A Residuo Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AccertamentiAResiduoFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ACCEARESIFIN_CAPITOLO = 0;
  private static int PFL_ACCEARESIFIN_ARTICOLO = 1;
  private static int PFL_ACCEARESIFIN_NUMEROACC = 2;
  private static int PFL_ACCEARESIFIN_ANNOACC = 3;
  private static int PFL_ACCEARESIFIN_DATA = 4;
  private static int PFL_ACCEARESIFIN_DESCRIZIONE = 5;
  private static int PFL_ACCEARESIFIN_IMPORTO = 6;
  private static int PFL_ACCEARESIFIN_DEBITORE = 7;
  private static int PFL_ACCEARESIFIN_SEDEDEL = 8;
  private static int PFL_ACCEARESIFIN_NUMERODEL = 9;
  private static int PFL_ACCEARESIFIN_ANNODEL = 10;
  private static int PFL_ACCEARESIFIN_UNITAPROPONE = 11;
  private static int PFL_ACCEARESIFIN_NUMEROPROPOS = 12;
  private static int PFL_ACCEARESIFIN_ANNOPROPOSTA = 13;
  private static int PFL_ACCEARESIFIN_PROGETTO = 14;
  private static int PFL_ACCEARESIFIN_LABELCAPITOL = 15;
  private static int PFL_ACCEARESIFIN_LABELACCERTA = 16;
  private static int PFL_ACCEARESIFIN_LABELDELIBER = 17;
  private static int PFL_ACCEARESIFIN_LABELPROPOST = 18;
  private static int PFL_ACCEARESIFIN_RIFBILANCPEG = 19;
  private static int PFL_ACCEARESIFIN_ACCERTAMENTO = 20;
  private static int PFL_ACCEARESIFIN_DELIBERA = 21;
  private static int PFL_ACCEARESIFIN_PROPOSTA = 22;

  private static int PPQRY_ESEACCOPE = 0;


  IDPanel PAN_ACCEARESIFIN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI42(IMDB);
    //
    //
    Init_PQRY_ESEACCOPE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI42(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI42, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI42, "TBL_PARAMETRI42");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI42,IMDBDef1.FLD_PARAMETRI42_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI42,IMDBDef1.FLD_PARAMETRI42_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI42, 0);
  }

  private static void Init_PQRY_ESEACCOPE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ESEACCOPE, 20);
    IMDB.set_TblCode(IMDBDef8.PQRY_ESEACCOPE, "PQRY_ESEACCOPE");
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEOPRIBIPEG, "ESEOPRIBIPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEOPRIBIPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEACOPEACCE, "ESEACOPEACCE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEACOPEACCE,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEACOPEIMPO, "ESEACOPEIMPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEACOPEIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEACOPEDELI, "ESEACOPEDELI");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEACOPEDELI,5,208,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEACOPEPROP, "ESEACOPEPROP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ESEACOPEPROP,5,212,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_PROGETTO_ID,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE,IMDBDef8.PQSL_ESEACCOPE_NUMERO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ESEACCOPE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AccertamentiAResiduoFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public AccertamentiAResiduoFinanziamento()
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
    FormIdx = MyGlb.FRM_ACCEARESIFIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2137A9F8-FAB3-412C-B640-4EF0EC747837";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 406;
    set_Caption(new IDVariant("Accertamenti A Residuo Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 380;
    Frames[1].Caption = "Accertamenti A Residuo Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_ACCEARESIFIN = new IDPanel(w, this, 1, "PAN_ACCEARESIFIN");
    Frames[1].Content = PAN_ACCEARESIFIN;
    PAN_ACCEARESIFIN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCEARESIFIN.VS = MainFrm.VisualStyleList;
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "90F90076-2897-44CB-A4FD-79CB459A920A");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1152, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCEARESIFIN.InitStatus = 2;
    PAN_ACCEARESIFIN_Init();
    PAN_ACCEARESIFIN_InitFields();
    PAN_ACCEARESIFIN_InitQueries();
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
      PAN_ACCEARESIFIN.UpdatePanel(MainFrm);
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
    return (obj instanceof AccertamentiAResiduoFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AccertamentiAResiduoFinanziamento.class.getName() : (Glb.ClassWithPackage(AccertamentiAResiduoFinanziamento.class) ? AccertamentiAResiduoFinanziamento.class.getName().substring(AccertamentiAResiduoFinanziamento.class.getPackage().getName().length() + 1) : AccertamentiAResiduoFinanziamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Accertamenti A Residuo Finanziamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCEARESIFIN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCEARESIFIN);
      // 
      // Accertamenti A Residuo Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ACCEARESIFIN.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCEARESIFIN_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_ESEACCOPE, IMDBDef8.PQSL_ESEACCOPE_DESCRIZIONE, 0).stringValue()); 
      PAN_ACCEARESIFIN.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCEARESIFIN_DEBITORE,IMDB.Value(IMDBDef8.PQRY_ESEACCOPE, IMDBDef8.PQSL_ESEACCOPE_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiAResiduoFinanziamento", "AccertamentiAResiduoFinanziamentoOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("AccertamentiAResiduoFinanziamento", "LoadEvent", _e);
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
  private void PAN_ACCEARESIFIN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCEARESIFIN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCEARESIFIN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCEARESIFIN, Cancel);
    // Stub
  }

  private void PAN_ACCEARESIFIN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ACCEARESIFIN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ACCEARESIFIN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ESEACCOPE, IMDBDef8.PQSL_ESEACCOPE_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ESEACCOPE, IMDBDef8.PQSL_ESEACCOPE_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ACCEARESIFIN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ACCEARESIFIN_Init()
  {

    PAN_ACCEARESIFIN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCEARESIFIN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ACCEARESIFIN.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, "2C12EB4C-EA9A-4B9B-B04B-25B951DE06BB");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, "CAPITOLO");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, "44D7D5FB-B3BE-4D14-96A3-FB52ABE526FD");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, "ARTICOLO");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, "BE990D4F-2913-4CFC-B21E-53472D39AD2B");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, "NUMERO ACC");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, "C74FBDE1-2404-4ED1-A838-AB3C2276AED3");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, "ANNO ACC");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, "DECB8D05-C868-4A3B-A3F6-562F84FACC46");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, "Data");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, "66C4F18F-0E12-4E44-98C5-E03E833BC5BB");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, "Descrizione");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, "8948520A-CF5F-42E3-8598-6AF4A7092675");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, "Importo");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, "82AFC483-08DB-4CD7-A457-505A34E59300");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, "Debitore");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, "76014C88-AC60-4359-87CB-7A22CF00047C");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, "SEDE DEL");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, "360EFC5D-8799-480F-9E01-8FA485DE0912");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, "NUMERO DEL");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, "6FB9828E-49A3-42AB-B4BA-2A036DE9F4CE");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, "ANNO DEL");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, "4A0470F9-5296-439D-B290-CC5B3ABBF046");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, "945210AA-7305-466D-89A9-2CE127EA407C");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, "5D651259-75A3-480F-8FC5-C2F5B01695ED");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, "4ECAE19A-D310-48D2-8FC5-262F19E8DF94");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, "Obiettivo Operativo");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, "");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, "FCDF6523-3EC1-4117-86B0-45BD4FBAB2B2");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, "Capitolo");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, "DA261052-2CD7-48E5-91B0-637F41E6391B");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, "Accertamento");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, "D2EC6620-A2A5-4C5B-B236-8D5C2C3383DA");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, "Delibera");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, "B5FF59F3-234F-47F5-AA73-746435EA9FDD");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, "Proposta");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, "0FAF23FA-2A61-4595-9882-37D088EDFDA6");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, "To String (ACC CAPITOLO) + \" - \" + To String (ACC ARTICOLO)");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, "20073D14-1C26-4F48-ACF6-4CB8E3069AFC");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, "Accertamento");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, "To String (NUMERO ACC) + \" / \" + To String (ANNO ACC)");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, "B7497000-EAE4-4A04-BD77-06D0C5AC554C");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, "Delibera");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, "ACC SEDE DEL + \" - \" + To String (ACC NUMERO DEL) + \" / \" + To String (ACC ANNO DEL)");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, "2564330D-D46B-48C1-BCC7-1C0B4D21DB73");
    PAN_ACCEARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, "Proposta");
    PAN_ACCEARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, "ACC UNITA PROPONENTE + \" - \" + To String (ACC NUMERO PROPOSTA) + \" / \" + To String (ACC ANNO PROPOSTA)");
    PAN_ACCEARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ACCEARESIFIN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, MyGlb.PANEL_FORM, 4, 640, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_CAPITOLO, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_CAPITOLO, PPQRY_ESEACCOPE, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, MyGlb.PANEL_LIST, 100, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, MyGlb.PANEL_FORM, 4, 664, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_ARTICOLO, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_ARTICOLO, PPQRY_ESEACCOPE, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, MyGlb.PANEL_LIST, 124, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, MyGlb.PANEL_FORM, 4, 688, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_NUMEROACC, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_NUMEROACC, PPQRY_ESEACCOPE, "B.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, MyGlb.PANEL_LIST, 172, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, MyGlb.PANEL_FORM, 4, 712, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_ANNOACC, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_ANNOACC, PPQRY_ESEACCOPE, "B.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, MyGlb.PANEL_LIST, 216, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, MyGlb.PANEL_LIST, 68);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, MyGlb.PANEL_FORM, 4, 496, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, MyGlb.PANEL_FORM, 68);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_DATA, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_DATA, PPQRY_ESEACCOPE, "B.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, MyGlb.PANEL_LIST, 292, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 148, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_DESCRIZIONE, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_DESCRIZIONE, PPQRY_ESEACCOPE, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, MyGlb.PANEL_LIST, 476, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, MyGlb.PANEL_FORM, 4, 400, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_IMPORTO, -1, -1);
    PAN_ACCEARESIFIN.SetFieldUnbound(PFL_ACCEARESIFIN_IMPORTO, true);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_IMPORTO, PPQRY_ESEACCOPE, "NVL(A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES, 0)", "ESEACOPEIMPO", 3, 28, 6, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, MyGlb.PANEL_LIST, 576, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, MyGlb.PANEL_LIST, 140);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, MyGlb.PANEL_FORM, 4, 376, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, MyGlb.PANEL_FORM, 140);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_DEBITORE, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_DEBITORE, PPQRY_ESEACCOPE, "C.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, MyGlb.PANEL_FORM, 4, 736, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_SEDEDEL, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_SEDEDEL, PPQRY_ESEACCOPE, "B.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, MyGlb.PANEL_LIST, 816, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, MyGlb.PANEL_FORM, 4, 760, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_NUMERODEL, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_NUMERODEL, PPQRY_ESEACCOPE, "B.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, MyGlb.PANEL_LIST, 860, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, MyGlb.PANEL_FORM, 4, 784, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_ANNODEL, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_ANNODEL, PPQRY_ESEACCOPE, "B.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, MyGlb.PANEL_LIST, 900, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 808, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_UNITAPROPONE, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_UNITAPROPONE, PPQRY_ESEACCOPE, "B.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1004, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 832, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_NUMEROPROPOS, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_NUMEROPROPOS, PPQRY_ESEACCOPE, "B.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1048, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 856, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_ANNOPROPOSTA, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_ANNOPROPOSTA, PPQRY_ESEACCOPE, "B.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, MyGlb.PANEL_LIST, 1084, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_PROGETTO, -1, -1);
    PAN_ACCEARESIFIN.SetFieldUnbound(PFL_ACCEARESIFIN_PROGETTO, true);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_PROGETTO, PPQRY_ESEACCOPE, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'NO')", "PROGETTO_ID", 5, 99, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 124, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_LABELCAPITOL, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, MyGlb.PANEL_LIST, 124, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, MyGlb.PANEL_FORM, 8, 8, 124, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELACCERTA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_LABELACCERTA, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, MyGlb.PANEL_LIST, 776, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, MyGlb.PANEL_FORM, 16, 16, 124, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_LABELDELIBER, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, MyGlb.PANEL_LIST, 900, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, MyGlb.PANEL_FORM, 24, 24, 124, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_LABELPROPOST, -1, -1);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 880, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_RIFBILANCPEG, -1, -1);
    PAN_ACCEARESIFIN.SetFieldUnbound(PFL_ACCEARESIFIN_RIFBILANCPEG, true);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_RIFBILANCPEG, PPQRY_ESEACCOPE, "TO_CHAR ( B.CAPITOLO ) || ' - ' || TO_CHAR ( B.ARTICOLO )", "ESEOPRIBIPEG", 5, 201, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 880, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_ACCERTAMENTO, -1, -1);
    PAN_ACCEARESIFIN.SetFieldUnbound(PFL_ACCEARESIFIN_ACCERTAMENTO, true);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_ACCERTAMENTO, PPQRY_ESEACCOPE, "TO_CHAR ( B.NUMERO_ACC ) || ' / ' || TO_CHAR ( B.ANNO_ACC )", "ESEACOPEACCE", 5, 201, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, MyGlb.PANEL_FORM, 4, 880, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_DELIBERA, -1, -1);
    PAN_ACCEARESIFIN.SetFieldUnbound(PFL_ACCEARESIFIN_DELIBERA, true);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_DELIBERA, PPQRY_ESEACCOPE, "B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL )", "ESEACOPEDELI", 5, 208, 0, -13997);
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ACCEARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, MyGlb.PANEL_FORM, 4, 880, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_ACCEARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIFIN_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_ACCEARESIFIN.SetFieldPage(PFL_ACCEARESIFIN_PROPOSTA, -1, -1);
    PAN_ACCEARESIFIN.SetFieldUnbound(PFL_ACCEARESIFIN_PROPOSTA, true);
    PAN_ACCEARESIFIN.SetFieldPanel(PFL_ACCEARESIFIN_PROPOSTA, PPQRY_ESEACCOPE, "B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA )", "ESEACOPEPROP", 5, 212, 0, -13997);
  }

  private void PAN_ACCEARESIFIN_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCEARESIFIN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ACCEARESIFIN.SetIMDB(IMDB, "PQRY_ESEACCOPE", true);
    PAN_ACCEARESIFIN.set_SetString(MyGlb.MASTER_ROWNAME, "ESEACC OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.CAPITOLO ) || ' - ' || TO_CHAR ( B.ARTICOLO ) as ESEOPRIBIPEG, ");
    SQL.append("  TO_CHAR ( B.NUMERO_ACC ) || ' / ' || TO_CHAR ( B.ANNO_ACC ) as ESEACOPEACCE, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  NVL(A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES, 0) as ESEACOPEIMPO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL ) as ESEACOPEDELI, ");
    SQL.append("  B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA ) as ESEACOPEPROP, ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'NO') as PROGETTO_ID, ");
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
    PAN_ACCEARESIFIN.SetQuery(PPQRY_ESEACCOPE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEACC_FIN A, ");
    SQL.append("  ACC B, ");
    SQL.append("  BEN C ");
    PAN_ACCEARESIFIN.SetQuery(PPQRY_ESEACCOPE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.DEBITORE = C.CODICE(+)) ");
    SQL.append("and   (A.ANNO_ACC = B.ANNO_ACC(+)) ");
    SQL.append("and   (A.NUMERO_ACC = B.NUMERO_ACC(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_ACC < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~TBL_PARAMETRI42.PARAMFINANZI~~) ");
    PAN_ACCEARESIFIN.SetQuery(PPQRY_ESEACCOPE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCEARESIFIN.SetQuery(PPQRY_ESEACCOPE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCEARESIFIN.SetQuery(PPQRY_ESEACCOPE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.NUMERO_ACC, ");
    SQL.append("  B.ANNO_ACC ");
    PAN_ACCEARESIFIN.SetQuery(PPQRY_ESEACCOPE, 5, SQL, -1, "");
    PAN_ACCEARESIFIN.SetQueryDB(PPQRY_ESEACCOPE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCEARESIFIN.SetMasterTable(0, "ESEACC_FIN");
    PAN_ACCEARESIFIN.AddToSortList(PFL_ACCEARESIFIN_CAPITOLO, true);
    PAN_ACCEARESIFIN.AddToSortList(PFL_ACCEARESIFIN_ARTICOLO, true);
    PAN_ACCEARESIFIN.AddToSortList(PFL_ACCEARESIFIN_NUMEROACC, true);
    PAN_ACCEARESIFIN.AddToSortList(PFL_ACCEARESIFIN_ANNOACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCEARESIFIN.Status() == 2)
    {
      int oldListQBE = PAN_ACCEARESIFIN.iUseListQBE;
      PAN_ACCEARESIFIN.iUseListQBE = 0;
      PAN_ACCEARESIFIN.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCEARESIFIN.PanelCommand(Glb.PCM_FIND);
      PAN_ACCEARESIFIN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ACCEARESIFIN) PAN_ACCEARESIFIN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCEARESIFIN) PAN_ACCEARESIFIN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ACCEARESIFIN) PAN_ACCEARESIFIN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCEARESIFIN) PAN_ACCEARESIFIN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ACCEARESIFIN) PAN_ACCEARESIFIN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
