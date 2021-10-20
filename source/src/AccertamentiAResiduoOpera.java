// **********************************************
// Accertamenti A Residuo Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AccertamentiAResiduoOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ACCEARESIOPE_CAPITOLO = 0;
  private static int PFL_ACCEARESIOPE_ARTICOLO = 1;
  private static int PFL_ACCEARESIOPE_NUMEROACC = 2;
  private static int PFL_ACCEARESIOPE_ANNOACC = 3;
  private static int PFL_ACCEARESIOPE_DATA = 4;
  private static int PFL_ACCEARESIOPE_DESCRIZIONE = 5;
  private static int PFL_ACCEARESIOPE_IMPORTO = 6;
  private static int PFL_ACCEARESIOPE_DEBITORE = 7;
  private static int PFL_ACCEARESIOPE_SEDEDEL = 8;
  private static int PFL_ACCEARESIOPE_NUMERODEL = 9;
  private static int PFL_ACCEARESIOPE_ANNODEL = 10;
  private static int PFL_ACCEARESIOPE_UNITAPROPONE = 11;
  private static int PFL_ACCEARESIOPE_NUMEROPROPOS = 12;
  private static int PFL_ACCEARESIOPE_ANNOPROPOSTA = 13;
  private static int PFL_ACCEARESIOPE_PROGETTO = 14;
  private static int PFL_ACCEARESIOPE_LABELCAPITOL = 15;
  private static int PFL_ACCEARESIOPE_LABELACCERTA = 16;
  private static int PFL_ACCEARESIOPE_LABELDELIBER = 17;
  private static int PFL_ACCEARESIOPE_LABELPROPOST = 18;
  private static int PFL_ACCEARESIOPE_RIFBILANCPEG = 19;
  private static int PFL_ACCEARESIOPE_ACCERTAMENTO = 20;
  private static int PFL_ACCEARESIOPE_DELIBERA = 21;
  private static int PFL_ACCEARESIOPE_PROPOSTA = 22;

  private static int PPQRY_ESEACCOPE2 = 0;


  IDPanel PAN_ACCEARESIOPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI28(IMDB);
    //
    //
    Init_PQRY_ESEACCOPE2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI28, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI28, "TBL_PARAMETRI28");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI28,IMDBDef1.FLD_PARAMETRI28_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI28,IMDBDef1.FLD_PARAMETRI28_PARAMOPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI28, 0);
  }

  private static void Init_PQRY_ESEACCOPE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ESEACCOPE2, 20);
    IMDB.set_TblCode(IMDBDef8.PQRY_ESEACCOPE2, "PQRY_ESEACCOPE2");
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEOPRIBIPEG, "ESEOPRIBIPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEOPRIBIPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEACOPEACCE, "ESEACOPEACCE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEACOPEACCE,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_PROGETTO_ID,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEACOPEIMPO, "ESEACOPEIMPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEACOPEIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEACOPEDELI, "ESEACOPEDELI");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEACOPEDELI,5,208,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEACOPEPROP, "ESEACOPEPROP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE2,IMDBDef8.PQSL_ESEACCOPE2_ESEACOPEPROP,5,212,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ESEACCOPE2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AccertamentiAResiduoOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public AccertamentiAResiduoOpera()
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
    FormIdx = MyGlb.FRM_ACCEARESIOPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FF5C20ED-67A0-4D28-953D-F3FF03483B6F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 378;
    set_Caption(new IDVariant("Accertamenti A Residuo Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 352;
    Frames[1].Caption = "Accertamenti A Residuo Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_ACCEARESIOPE = new IDPanel(w, this, 1, "PAN_ACCEARESIOPE");
    Frames[1].Content = PAN_ACCEARESIOPE;
    PAN_ACCEARESIOPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCEARESIOPE.VS = MainFrm.VisualStyleList;
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2E0431F1-4A9F-4454-8B85-4869D9FF9848");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1164, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCEARESIOPE.InitStatus = 2;
    PAN_ACCEARESIOPE_Init();
    PAN_ACCEARESIOPE_InitFields();
    PAN_ACCEARESIOPE_InitQueries();
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
      PAN_ACCEARESIOPE.UpdatePanel(MainFrm);
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
    return (obj instanceof AccertamentiAResiduoOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AccertamentiAResiduoOpera.class.getName() : (Glb.ClassWithPackage(AccertamentiAResiduoOpera.class) ? AccertamentiAResiduoOpera.class.getName().substring(AccertamentiAResiduoOpera.class.getPackage().getName().length() + 1) : AccertamentiAResiduoOpera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Accertamenti A Residuo Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCEARESIOPE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCEARESIOPE);
      // 
      // Accertamenti A Residuo Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ACCEARESIOPE.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCEARESIOPE_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_ESEACCOPE2, IMDBDef8.PQSL_ESEACCOPE2_DESCRIZIONE, 0).stringValue()); 
      PAN_ACCEARESIOPE.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCEARESIOPE_DEBITORE,IMDB.Value(IMDBDef8.PQRY_ESEACCOPE2, IMDBDef8.PQSL_ESEACCOPE2_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiAResiduoOpera", "AccertamentiAResiduoOperaOnDynamicPropertiesEvent", _e);
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
      // PAN_ACCEARESIOPE.set_FixedCols((new IDVariant(1)).intValue());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiAResiduoOpera", "LoadEvent", _e);
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
  private void PAN_ACCEARESIOPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCEARESIOPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCEARESIOPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCEARESIOPE, Cancel);
    // Stub
  }

  private void PAN_ACCEARESIOPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ACCEARESIOPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ACCEARESIOPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ESEACCOPE2, IMDBDef8.PQSL_ESEACCOPE2_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ESEACCOPE2, IMDBDef8.PQSL_ESEACCOPE2_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ACCEARESIOPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ACCEARESIOPE_Init()
  {

    PAN_ACCEARESIOPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCEARESIOPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ACCEARESIOPE.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, "98EC6D6D-797C-4F07-9FE5-E81B1192C935");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, "CAPITOLO");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, "8EDF9A9D-C9B2-4466-AAC8-FBBC083F10C4");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, "ARTICOLO");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, "B2E82020-5D83-4D3C-B8E7-2DB2B884C24E");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, "NUMERO ACC");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, "1110A064-614A-48F4-854F-338C560734E1");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, "ANNO ACC");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, "D54C53CB-CB84-449D-8F2C-9A02CFF64E5D");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, "Data");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, "818072FA-449C-4639-AC7B-923FF271F4EB");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, "Descrizione");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, "1D0B4496-34B5-44C7-9DE1-00161EBE535E");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, "Importo");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, "83D50FC8-D37E-40DB-BE36-A12FEA6D41F1");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, "Debitore");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, "D75F696B-087F-431E-894A-415A42288454");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, "SEDE DEL");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, "9FF078DD-3FC5-45A8-8BF6-094CC2E572AB");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, "NUMERO DEL");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, "0142CFF4-6A5C-4C89-9F93-F83F9A23D4B4");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, "ANNO DEL");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, "DC3B8945-65B0-493E-8AFE-48E7DDD91788");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, "1A50A1DB-7F01-48BE-9672-2C04C4A3EB8E");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, "B07F57A9-AA2F-4805-A810-39CC3EFF09BA");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, "FE6825AE-03DC-4C6F-89BB-507F1A675C05");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, "Obiettivo Operativo");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, "");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, "90FD0C6A-C82D-4940-AB09-75DF921293F7");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, "Capitolo");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, "246CB8CB-5E53-409D-994D-2B9B5D23A06F");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, "Accertamento");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, "826F0644-8B32-43DB-8CD9-43F9E9270A3A");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, "Delibera");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, "4C626072-9E65-49EF-B030-82BAAA67D573");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, "Proposta");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, "26581527-C009-47B8-9E21-B606670C8710");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, "To String (ACC CAPITOLO) + \" - \" + To String (ACC ARTICOLO)");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, "6F03D4FD-9EE8-46C8-9E25-3B3CBE801CC6");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, "Accertamento");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, "To String (NUMERO ACC) + \" / \" + To String (ANNO ACC)");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, "73D7DF23-2EAB-4CA7-BC71-3A70492A6E7B");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, "Delibera");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, "ACC SEDE DEL + \" - \" + To String (ACC NUMERO DEL) + \" / \" + To String (ACC ANNO DEL)");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, "DFF9C897-0F27-46E8-8248-604742A3AF63");
    PAN_ACCEARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, "Proposta");
    PAN_ACCEARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, "ACC UNITA PROPONENTE + \" - \" + To String (ACC NUMERO PROPOSTA) + \" / \" + To String (ACC ANNO PROPOSTA)");
    PAN_ACCEARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ACCEARESIOPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, MyGlb.PANEL_FORM, 4, 640, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_CAPITOLO, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_CAPITOLO, PPQRY_ESEACCOPE2, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, MyGlb.PANEL_LIST, 100, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, MyGlb.PANEL_FORM, 4, 664, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_ARTICOLO, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_ARTICOLO, PPQRY_ESEACCOPE2, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, MyGlb.PANEL_LIST, 128, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, MyGlb.PANEL_FORM, 4, 688, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_NUMEROACC, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_NUMEROACC, PPQRY_ESEACCOPE2, "B.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, MyGlb.PANEL_LIST, 176, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, MyGlb.PANEL_FORM, 4, 712, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_ANNOACC, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_ANNOACC, PPQRY_ESEACCOPE2, "B.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, MyGlb.PANEL_LIST, 220, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, MyGlb.PANEL_LIST, 68);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, MyGlb.PANEL_FORM, 4, 496, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, MyGlb.PANEL_FORM, 68);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_DATA, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_DATA, PPQRY_ESEACCOPE2, "B.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, MyGlb.PANEL_LIST, 292, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 148, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_DESCRIZIONE, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_DESCRIZIONE, PPQRY_ESEACCOPE2, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, MyGlb.PANEL_LIST, 484, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, MyGlb.PANEL_FORM, 4, 400, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_IMPORTO, -1, -1);
    PAN_ACCEARESIOPE.SetFieldUnbound(PFL_ACCEARESIOPE_IMPORTO, true);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_IMPORTO, PPQRY_ESEACCOPE2, "NVL(A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES, 0)", "ESEACOPEIMPO", 3, 28, 6, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, MyGlb.PANEL_LIST, 584, 36, 204, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, MyGlb.PANEL_LIST, 140);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, MyGlb.PANEL_FORM, 4, 376, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, MyGlb.PANEL_FORM, 140);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_DEBITORE, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_DEBITORE, PPQRY_ESEACCOPE2, "C.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, MyGlb.PANEL_LIST, 788, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, MyGlb.PANEL_FORM, 4, 736, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_SEDEDEL, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_SEDEDEL, PPQRY_ESEACCOPE2, "B.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, MyGlb.PANEL_LIST, 828, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, MyGlb.PANEL_FORM, 4, 760, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_NUMERODEL, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_NUMERODEL, PPQRY_ESEACCOPE2, "B.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, MyGlb.PANEL_LIST, 876, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, MyGlb.PANEL_FORM, 4, 784, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_ANNODEL, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_ANNODEL, PPQRY_ESEACCOPE2, "B.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, MyGlb.PANEL_LIST, 912, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 808, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_UNITAPROPONE, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_UNITAPROPONE, PPQRY_ESEACCOPE2, "B.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 1020, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 832, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_NUMEROPROPOS, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_NUMEROPROPOS, PPQRY_ESEACCOPE2, "B.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1060, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 856, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_ANNOPROPOSTA, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_ANNOPROPOSTA, PPQRY_ESEACCOPE2, "B.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, MyGlb.PANEL_LIST, 1096, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_PROGETTO, -1, -1);
    PAN_ACCEARESIOPE.SetFieldUnbound(PFL_ACCEARESIOPE_PROGETTO, true);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_PROGETTO, PPQRY_ESEACCOPE2, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'SI')", "PROGETTO_ID", 5, 99, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 132, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_LABELCAPITOL, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, MyGlb.PANEL_LIST, 128, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, MyGlb.PANEL_FORM, 8, 8, 132, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELACCERTA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_LABELACCERTA, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, MyGlb.PANEL_LIST, 788, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, MyGlb.PANEL_FORM, 16, 16, 132, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_LABELDELIBER, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, MyGlb.PANEL_LIST, 912, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, MyGlb.PANEL_FORM, 24, 24, 132, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_LABELPROPOST, -1, -1);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 880, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_RIFBILANCPEG, -1, -1);
    PAN_ACCEARESIOPE.SetFieldUnbound(PFL_ACCEARESIOPE_RIFBILANCPEG, true);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_RIFBILANCPEG, PPQRY_ESEACCOPE2, "TO_CHAR ( B.CAPITOLO ) || ' - ' || TO_CHAR ( B.ARTICOLO )", "ESEOPRIBIPEG", 5, 201, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 880, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_ACCERTAMENTO, -1, -1);
    PAN_ACCEARESIOPE.SetFieldUnbound(PFL_ACCEARESIOPE_ACCERTAMENTO, true);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_ACCERTAMENTO, PPQRY_ESEACCOPE2, "TO_CHAR ( B.NUMERO_ACC ) || ' / ' || TO_CHAR ( B.ANNO_ACC )", "ESEACOPEACCE", 5, 201, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, MyGlb.PANEL_FORM, 4, 880, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_DELIBERA, -1, -1);
    PAN_ACCEARESIOPE.SetFieldUnbound(PFL_ACCEARESIOPE_DELIBERA, true);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_DELIBERA, PPQRY_ESEACCOPE2, "B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL )", "ESEACOPEDELI", 5, 208, 0, -13997);
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ACCEARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, MyGlb.PANEL_FORM, 4, 880, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_ACCEARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEARESIOPE_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_ACCEARESIOPE.SetFieldPage(PFL_ACCEARESIOPE_PROPOSTA, -1, -1);
    PAN_ACCEARESIOPE.SetFieldUnbound(PFL_ACCEARESIOPE_PROPOSTA, true);
    PAN_ACCEARESIOPE.SetFieldPanel(PFL_ACCEARESIOPE_PROPOSTA, PPQRY_ESEACCOPE2, "B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA )", "ESEACOPEPROP", 5, 212, 0, -13997);
  }

  private void PAN_ACCEARESIOPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCEARESIOPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ACCEARESIOPE.SetIMDB(IMDB, "PQRY_ESEACCOPE2", true);
    PAN_ACCEARESIOPE.set_SetString(MyGlb.MASTER_ROWNAME, "ESEACC OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.CAPITOLO ) || ' - ' || TO_CHAR ( B.ARTICOLO ) as ESEOPRIBIPEG, ");
    SQL.append("  TO_CHAR ( B.NUMERO_ACC ) || ' / ' || TO_CHAR ( B.ANNO_ACC ) as ESEACOPEACCE, ");
    SQL.append("  B.CAPITOLO as CAPITOLO, ");
    SQL.append("  B.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  B.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  B.DEBITORE as DEBITORE, ");
    SQL.append("  B.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  B.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  B.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  B.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  B.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  B.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'SI') as PROGETTO_ID, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  NVL(A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES, 0) as ESEACOPEIMPO, ");
    SQL.append("  B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL ) as ESEACOPEDELI, ");
    SQL.append("  B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA ) as ESEACOPEPROP ");
    PAN_ACCEARESIOPE.SetQuery(PPQRY_ESEACCOPE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEACC_OPE A, ");
    SQL.append("  ACC B, ");
    SQL.append("  BEN C ");
    PAN_ACCEARESIOPE.SetQuery(PPQRY_ESEACCOPE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.DEBITORE = C.CODICE(+)) ");
    SQL.append("and   (A.ANNO_ACC = B.ANNO_ACC(+)) ");
    SQL.append("and   (A.NUMERO_ACC = B.NUMERO_ACC(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_ACC < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.OPERA = ~~TBL_PARAMETRI28.PARAMOPERA~~) ");
    PAN_ACCEARESIOPE.SetQuery(PPQRY_ESEACCOPE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCEARESIOPE.SetQuery(PPQRY_ESEACCOPE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCEARESIOPE.SetQuery(PPQRY_ESEACCOPE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.NUMERO_ACC, ");
    SQL.append("  B.ANNO_ACC ");
    PAN_ACCEARESIOPE.SetQuery(PPQRY_ESEACCOPE2, 5, SQL, -1, "");
    PAN_ACCEARESIOPE.SetQueryDB(PPQRY_ESEACCOPE2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCEARESIOPE.SetMasterTable(0, "ESEACC_OPE");
    PAN_ACCEARESIOPE.AddToSortList(PFL_ACCEARESIOPE_CAPITOLO, true);
    PAN_ACCEARESIOPE.AddToSortList(PFL_ACCEARESIOPE_ARTICOLO, true);
    PAN_ACCEARESIOPE.AddToSortList(PFL_ACCEARESIOPE_NUMEROACC, true);
    PAN_ACCEARESIOPE.AddToSortList(PFL_ACCEARESIOPE_ANNOACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCEARESIOPE.Status() == 2)
    {
      int oldListQBE = PAN_ACCEARESIOPE.iUseListQBE;
      PAN_ACCEARESIOPE.iUseListQBE = 0;
      PAN_ACCEARESIOPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCEARESIOPE.PanelCommand(Glb.PCM_FIND);
      PAN_ACCEARESIOPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ACCEARESIOPE) PAN_ACCEARESIOPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCEARESIOPE) PAN_ACCEARESIOPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ACCEARESIOPE) PAN_ACCEARESIOPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCEARESIOPE) PAN_ACCEARESIOPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ACCEARESIOPE) PAN_ACCEARESIOPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
