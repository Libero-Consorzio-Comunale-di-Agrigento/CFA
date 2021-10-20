// **********************************************
// Accertamenti Di Competenza Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AccertamentiDiCompetenzaOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ACCEDICOMOPE_CAPITOLO = 0;
  private static int PFL_ACCEDICOMOPE_ARTICOLO = 1;
  private static int PFL_ACCEDICOMOPE_NUMEROACC = 2;
  private static int PFL_ACCEDICOMOPE_ANNOACC = 3;
  private static int PFL_ACCEDICOMOPE_DATA = 4;
  private static int PFL_ACCEDICOMOPE_DESCRIZIONE = 5;
  private static int PFL_ACCEDICOMOPE_IMPORTO = 6;
  private static int PFL_ACCEDICOMOPE_DEBITORE = 7;
  private static int PFL_ACCEDICOMOPE_SEDEDEL = 8;
  private static int PFL_ACCEDICOMOPE_NUMERODEL = 9;
  private static int PFL_ACCEDICOMOPE_ANNODEL = 10;
  private static int PFL_ACCEDICOMOPE_UNITAPROPONE = 11;
  private static int PFL_ACCEDICOMOPE_NUMEROPROPOS = 12;
  private static int PFL_ACCEDICOMOPE_ANNOPROPOSTA = 13;
  private static int PFL_ACCEDICOMOPE_PROGETTO = 14;
  private static int PFL_ACCEDICOMOPE_LABELCAPITOL = 15;
  private static int PFL_ACCEDICOMOPE_LABELACCERTA = 16;
  private static int PFL_ACCEDICOMOPE_LABELDELIBER = 17;
  private static int PFL_ACCEDICOMOPE_LABELPROPOST = 18;
  private static int PFL_ACCEDICOMOPE_ACCERTAMENTO = 19;
  private static int PFL_ACCEDICOMOPE_DELIBERA = 20;
  private static int PFL_ACCEDICOMOPE_PROPOSTA = 21;

  private static int PPQRY_ESEACCOPE1 = 0;


  IDPanel PAN_ACCEDICOMOPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI24(IMDB);
    //
    //
    Init_PQRY_ESEACCOPE1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI24(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI24, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI24, "TBL_PARAMETRI24");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI24,IMDBDef1.FLD_PARAMETRI24_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI24,IMDBDef1.FLD_PARAMETRI24_PARAMOPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI24, 0);
  }

  private static void Init_PQRY_ESEACCOPE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ESEACCOPE1, 19);
    IMDB.set_TblCode(IMDBDef8.PQRY_ESEACCOPE1, "PQRY_ESEACCOPE1");
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ESEACOPEACCE, "ESEACOPEACCE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ESEACOPEACCE,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ESEACOPEIMPO, "ESEACOPEIMPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ESEACOPEIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ESEACOPEDELI, "ESEACOPEDELI");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ESEACOPEDELI,5,208,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ESEACOPEPROP, "ESEACOPEPROP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ESEACOPEPROP,5,212,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_PROGETTO_ID,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEACCOPE1,IMDBDef8.PQSL_ESEACCOPE1_NUMERO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ESEACCOPE1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AccertamentiDiCompetenzaOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public AccertamentiDiCompetenzaOpera()
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
    FormIdx = MyGlb.FRM_ACCEDICOMOPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2FAD11E0-1F01-4766-9EDA-6C7DB8A4BA5F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 378;
    set_Caption(new IDVariant("Accertamenti Di Competenza Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 352;
    Frames[1].Caption = "Accertamenti Di Competenza Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_ACCEDICOMOPE = new IDPanel(w, this, 1, "PAN_ACCEDICOMOPE");
    Frames[1].Content = PAN_ACCEDICOMOPE;
    PAN_ACCEDICOMOPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCEDICOMOPE.VS = MainFrm.VisualStyleList;
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "34A17BC5-BBB6-427E-8410-93319F46B4D9");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1028, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCEDICOMOPE.InitStatus = 2;
    PAN_ACCEDICOMOPE_Init();
    PAN_ACCEDICOMOPE_InitFields();
    PAN_ACCEDICOMOPE_InitQueries();
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
      PAN_ACCEDICOMOPE.UpdatePanel(MainFrm);
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
    return (obj instanceof AccertamentiDiCompetenzaOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AccertamentiDiCompetenzaOpera.class.getName() : (Glb.ClassWithPackage(AccertamentiDiCompetenzaOpera.class) ? AccertamentiDiCompetenzaOpera.class.getName().substring(AccertamentiDiCompetenzaOpera.class.getPackage().getName().length() + 1) : AccertamentiDiCompetenzaOpera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Accertamenti Di Competenza Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCEDICOMOPE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCEDICOMOPE);
      // 
      // Accertamenti Di Competenza Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ACCEDICOMOPE.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCEDICOMOPE_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_ESEACCOPE1, IMDBDef8.PQSL_ESEACCOPE1_DESCRIZIONE, 0).stringValue()); 
      PAN_ACCEDICOMOPE.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCEDICOMOPE_DEBITORE,IMDB.Value(IMDBDef8.PQRY_ESEACCOPE1, IMDBDef8.PQSL_ESEACCOPE1_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiDiCompetenzaOpera", "AccertamentiDiCompetenzaOperaOnDynamicPropertiesEvent", _e);
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
      // PAN_ACCEDICOMOPE.set_FixedCols((new IDVariant(3)).intValue());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiDiCompetenzaOpera", "LoadEvent", _e);
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
  private void PAN_ACCEDICOMOPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCEDICOMOPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCEDICOMOPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCEDICOMOPE, Cancel);
    // Stub
  }

  private void PAN_ACCEDICOMOPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ACCEDICOMOPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ACCEDICOMOPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ESEACCOPE1, IMDBDef8.PQSL_ESEACCOPE1_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ESEACCOPE1, IMDBDef8.PQSL_ESEACCOPE1_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ACCEDICOMOPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ACCEDICOMOPE_Init()
  {

    PAN_ACCEDICOMOPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCEDICOMOPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ACCEDICOMOPE.SetSize(MyGlb.OBJ_FIELD, 22);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, "251572CF-4C09-414E-A225-2E23AAFC0B5C");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, "CAPITOLO");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, "2A22EDB4-2A7C-4508-84C0-3B24CF27EE06");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, "ARTICOLO");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, "3FFA80EC-F7C7-4D54-B7E8-D87DE75CFC91");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, "NUMERO ACC");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, "F3BB8EA7-425F-4C66-8AC5-4763FC33B8EE");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, "ANNO ACC");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, "D043ABF9-80A4-48F3-A091-D4CD5B5B1CE7");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, "Data");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, "30AE57D6-418B-422C-9682-2F7991EEC2B3");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, "Descrizione");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, "44424354-3EB9-4EC4-A033-7FDEF1F0E970");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, "Importo");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, "8D461184-6837-4197-BE18-4FCBEC8E790B");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, "Debitore");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, "D60EE5B2-7BD7-4DC2-88BE-740806A809D8");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, "SEDE DEL");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, "45E13871-930A-4509-8D77-BADA4E098FA2");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, "NUMERO DEL");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, "4E9B8144-5C55-4316-B6A1-A435CDE4CBAD");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, "ANNO DEL");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, "21616BD9-686C-49EE-86BA-4B7B1B11AB7C");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, "3D9C0AF7-FAD7-4A89-B0A0-F741A08F5DF0");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, "904F6121-9E6F-45F1-8BE0-5F73C19F119B");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, "92472AFE-E917-42F6-BADA-19027BBE2003");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, "Obiettivo Operativo");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, "");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, "1F346F58-DCAD-4E51-8089-7A7CE1BDAB16");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, "Capitolo");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, "D0758F2E-98C1-41DE-AC9C-1E8AB0F53BA7");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, "Accertamento");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, "8BBADE61-9130-4F9B-960D-C8FC42CB8E35");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, "Delibera");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, "D1276AC8-17D8-4CC2-8961-B33638521D0C");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, "Proposta");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, "0700E902-0057-4092-B98B-1CFFE80E6A6E");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, "Accertamento");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, "To String (NUMERO ACC) + \" / \" + To String (ANNO ACC)");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, "C8384199-2423-4273-8413-9D80EB4E300E");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, "Delibera");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, "ACC SEDE DEL + \" - \" + To String (ACC NUMERO DEL) + \" / \" + To String (ACC ANNO DEL)");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCEDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, "A397BF9B-E84E-40FF-A572-64B3744F4527");
    PAN_ACCEDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, "Proposta");
    PAN_ACCEDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, "ACC UNITA PROPONENTE + \" - \" + To String (ACC NUMERO PROPOSTA) + \" / \" + To String (ACC ANNO PROPOSTA)");
    PAN_ACCEDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCEDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ACCEDICOMOPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, MyGlb.PANEL_FORM, 4, 640, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_CAPITOLO, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_CAPITOLO, PPQRY_ESEACCOPE1, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, MyGlb.PANEL_LIST, 104, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, MyGlb.PANEL_FORM, 4, 664, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_ARTICOLO, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_ARTICOLO, PPQRY_ESEACCOPE1, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, MyGlb.PANEL_LIST, 132, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, MyGlb.PANEL_FORM, 4, 688, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_NUMEROACC, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_NUMEROACC, PPQRY_ESEACCOPE1, "B.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, MyGlb.PANEL_LIST, 184, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, MyGlb.PANEL_FORM, 4, 712, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_ANNOACC, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_ANNOACC, PPQRY_ESEACCOPE1, "B.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, MyGlb.PANEL_LIST, 224, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, MyGlb.PANEL_LIST, 68);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, MyGlb.PANEL_FORM, 4, 496, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, MyGlb.PANEL_FORM, 68);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_DATA, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_DATA, PPQRY_ESEACCOPE1, "B.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, MyGlb.PANEL_LIST, 296, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 148, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_DESCRIZIONE, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_DESCRIZIONE, PPQRY_ESEACCOPE1, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, MyGlb.PANEL_LIST, 464, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, MyGlb.PANEL_FORM, 4, 400, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_IMPORTO, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldUnbound(PFL_ACCEDICOMOPE_IMPORTO, true);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_IMPORTO, PPQRY_ESEACCOPE1, "NVL(A.SALDO_INI + A.VARIAZIONI, 0)", "ESEACOPEIMPO", 3, 28, 6, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, MyGlb.PANEL_LIST, 564, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, MyGlb.PANEL_LIST, 140);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, MyGlb.PANEL_FORM, 4, 376, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, MyGlb.PANEL_FORM, 140);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_DEBITORE, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_DEBITORE, PPQRY_ESEACCOPE1, "C.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, MyGlb.PANEL_LIST, 712, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, MyGlb.PANEL_FORM, 4, 736, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_SEDEDEL, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_SEDEDEL, PPQRY_ESEACCOPE1, "B.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, MyGlb.PANEL_LIST, 756, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, MyGlb.PANEL_FORM, 4, 760, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_NUMERODEL, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_NUMERODEL, PPQRY_ESEACCOPE1, "B.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, MyGlb.PANEL_LIST, 804, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, MyGlb.PANEL_FORM, 4, 784, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_ANNODEL, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_ANNODEL, PPQRY_ESEACCOPE1, "B.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, MyGlb.PANEL_LIST, 844, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, MyGlb.PANEL_LIST, "UN. PRP.");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 808, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_UNITAPROPONE, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_UNITAPROPONE, PPQRY_ESEACCOPE1, "B.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 880, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 832, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_NUMEROPROPOS, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_NUMEROPROPOS, PPQRY_ESEACCOPE1, "B.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 920, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PROP.");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 856, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_ANNOPROPOSTA, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_ANNOPROPOSTA, PPQRY_ESEACCOPE1, "B.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, MyGlb.PANEL_LIST, 960, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_PROGETTO, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldUnbound(PFL_ACCEDICOMOPE_PROGETTO, true);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_PROGETTO, PPQRY_ESEACCOPE1, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'NO')", "PROGETTO_ID", 5, 99, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 4, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_LABELCAPITOL, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, MyGlb.PANEL_LIST, 132, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, MyGlb.PANEL_FORM, 8, 12, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELACCERTA, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_LABELACCERTA, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, MyGlb.PANEL_LIST, 712, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, MyGlb.PANEL_FORM, 16, 20, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELDELIBER, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_LABELDELIBER, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, MyGlb.PANEL_LIST, 844, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, MyGlb.PANEL_FORM, 24, 28, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_LABELPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_LABELPROPOST, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 880, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_ACCERTAMENTO, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldUnbound(PFL_ACCEDICOMOPE_ACCERTAMENTO, true);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_ACCERTAMENTO, PPQRY_ESEACCOPE1, "TO_CHAR ( B.NUMERO_ACC ) || ' / ' || TO_CHAR ( B.ANNO_ACC )", "ESEACOPEACCE", 5, 201, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, MyGlb.PANEL_FORM, 4, 880, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_DELIBERA, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldUnbound(PFL_ACCEDICOMOPE_DELIBERA, true);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_DELIBERA, PPQRY_ESEACCOPE1, "B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL )", "ESEACOPEDELI", 5, 208, 0, -13997);
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ACCEDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, MyGlb.PANEL_FORM, 4, 880, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCEDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_ACCEDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_ACCEDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCEDICOMOPE_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_ACCEDICOMOPE.SetFieldPage(PFL_ACCEDICOMOPE_PROPOSTA, -1, -1);
    PAN_ACCEDICOMOPE.SetFieldUnbound(PFL_ACCEDICOMOPE_PROPOSTA, true);
    PAN_ACCEDICOMOPE.SetFieldPanel(PFL_ACCEDICOMOPE_PROPOSTA, PPQRY_ESEACCOPE1, "B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA )", "ESEACOPEPROP", 5, 212, 0, -13997);
  }

  private void PAN_ACCEDICOMOPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCEDICOMOPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ACCEDICOMOPE.SetIMDB(IMDB, "PQRY_ESEACCOPE1", true);
    PAN_ACCEDICOMOPE.set_SetString(MyGlb.MASTER_ROWNAME, "ESEACC OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.NUMERO_ACC ) || ' / ' || TO_CHAR ( B.ANNO_ACC ) as ESEACOPEACCE, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  NVL(A.SALDO_INI + A.VARIAZIONI, 0) as ESEACOPEIMPO, ");
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
    PAN_ACCEDICOMOPE.SetQuery(PPQRY_ESEACCOPE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEACC_OPE A, ");
    SQL.append("  ACC B, ");
    SQL.append("  BEN C ");
    PAN_ACCEDICOMOPE.SetQuery(PPQRY_ESEACCOPE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.DEBITORE = C.CODICE(+)) ");
    SQL.append("and   (A.ANNO_ACC = B.ANNO_ACC(+)) ");
    SQL.append("and   (A.NUMERO_ACC = B.NUMERO_ACC(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_ACC = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.OPERA = ~~TBL_PARAMETRI24.PARAMOPERA~~) ");
    PAN_ACCEDICOMOPE.SetQuery(PPQRY_ESEACCOPE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCEDICOMOPE.SetQuery(PPQRY_ESEACCOPE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCEDICOMOPE.SetQuery(PPQRY_ESEACCOPE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.NUMERO_ACC, ");
    SQL.append("  B.ANNO_ACC ");
    PAN_ACCEDICOMOPE.SetQuery(PPQRY_ESEACCOPE1, 5, SQL, -1, "");
    PAN_ACCEDICOMOPE.SetQueryDB(PPQRY_ESEACCOPE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCEDICOMOPE.SetMasterTable(0, "ESEACC_OPE");
    PAN_ACCEDICOMOPE.AddToSortList(PFL_ACCEDICOMOPE_CAPITOLO, true);
    PAN_ACCEDICOMOPE.AddToSortList(PFL_ACCEDICOMOPE_ARTICOLO, true);
    PAN_ACCEDICOMOPE.AddToSortList(PFL_ACCEDICOMOPE_NUMEROACC, true);
    PAN_ACCEDICOMOPE.AddToSortList(PFL_ACCEDICOMOPE_ANNOACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCEDICOMOPE.Status() == 2)
    {
      int oldListQBE = PAN_ACCEDICOMOPE.iUseListQBE;
      PAN_ACCEDICOMOPE.iUseListQBE = 0;
      PAN_ACCEDICOMOPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCEDICOMOPE.PanelCommand(Glb.PCM_FIND);
      PAN_ACCEDICOMOPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ACCEDICOMOPE) PAN_ACCEDICOMOPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCEDICOMOPE) PAN_ACCEDICOMOPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ACCEDICOMOPE) PAN_ACCEDICOMOPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCEDICOMOPE) PAN_ACCEDICOMOPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ACCEDICOMOPE) PAN_ACCEDICOMOPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
