// **********************************************
// Modelli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Modelli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_MODELLI_PRODUTTORE1 = 0;
  private static int PFL_MODELLI_CATEGOFISCAL = 1;
  private static int PFL_MODELLI_CLASSIFICAZ1 = 2;
  private static int PFL_MODELLI_CLASSIDESCRI = 3;
  private static int PFL_MODELLI_MODELLO = 4;
  private static int PFL_MODELLI_DESCRIZIONE = 5;
  private static int PFL_MODELLI_CLASSIFICAZI = 6;
  private static int PFL_MODELLI_PRODUTTORE = 7;

  private static int PPQRY_MODELLI = 0;

  private static int PPQRY_PRODUTTORI = 1;
  private static int PPQRY_CLASSIFICAZI = 2;

  private static int PPQRY_CATEGOFISCAL = 3;


  IDPanel PAN_MODELLI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI452(IMDB);
    //
    //
    Init_PQRY_MODELLI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI452(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI452, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI452, "TBL_PARAMETRI452");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI452,IMDBDef1.FLD_PARAMETRI452_PARAMPRODUTT, "PARAMPRODUTT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI452,IMDBDef1.FLD_PARAMETRI452_PARAMPRODUTT,1,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI452,IMDBDef1.FLD_PARAMETRI452_PARACATEFISC, "PARACATEFISC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI452,IMDBDef1.FLD_PARAMETRI452_PARACATEFISC,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI452,IMDBDef1.FLD_PARAMETRI452_PARAMCLASSIF, "PARAMCLASSIF");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI452,IMDBDef1.FLD_PARAMETRI452_PARAMCLASSIF,5,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI452, 0);
  }

  private static void Init_PQRY_MODELLI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_MODELLI, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_MODELLI, "PQRY_MODELLI");
    IMDB.set_FldCode(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_PRODUTTORE, "PRODUTTORE");
    IMDB.SetFldParams(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_PRODUTTORE,1,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_CATEGORIA_FISCALE, "CATEGORIA_FISCALE");
    IMDB.SetFldParams(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_CATEGORIA_FISCALE,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_CLASSIFICAZIONE, "CLASSIFICAZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_CLASSIFICAZIONE,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_MODELLO, "MODELLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_MODELLO,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_MODELLI,IMDBDef7.PQSL_MODELLI_DESCRIZIONE,5,60,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_MODELLI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Modelli(MyWebEntryPoint w, IMDBObj imdb)
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
  public Modelli()
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
    FormIdx = MyGlb.FRM_MODELLI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "54B3D197-E6A5-4424-851E-959451B4458B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 952;
    DesignHeight = 358;
    set_Caption(new IDVariant("Modelli"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 952;
    Frames[1].Height = 332;
    Frames[1].Caption = "Modelli";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 332;
    PAN_MODELLI = new IDPanel(w, this, 1, "PAN_MODELLI");
    Frames[1].Content = PAN_MODELLI;
    PAN_MODELLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MODELLI.VS = MainFrm.VisualStyleList;
    PAN_MODELLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 952-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MODELLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "836A8160-8EDF-439B-A84E-3612F79D9ED4");
    PAN_MODELLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 912, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MODELLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MODELLI.InitStatus = 2;
    PAN_MODELLI_Init();
    PAN_MODELLI_InitFields();
    PAN_MODELLI_InitQueries();
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
      PAN_MODELLI.UpdatePanel(MainFrm);
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
    return (obj instanceof Modelli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Modelli.class.getName() : (Glb.ClassWithPackage(Modelli.class) ? Modelli.class.getName().substring(Modelli.class.getPackage().getName().length() + 1) : Modelli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Modelli On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MODELLI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_MODELLI);
      // 
      // Modelli On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_MODELLI.set_ToolTip(Glb.OBJ_FIELD,PFL_MODELLI_CLASSIDESCRI,(new IDVariant(PAN_MODELLI.FieldText(PFL_MODELLI_CLASSIDESCRI))).stringValue()); 
      PAN_MODELLI.set_ToolTip(Glb.OBJ_FIELD,PFL_MODELLI_DESCRIZIONE,(new IDVariant(PAN_MODELLI.FieldText(PFL_MODELLI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Modelli", "ModelliOnDynamicPropertiesEvent", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI452, IMDBDef1.FLD_PARAMETRI452_PARAMPRODUTT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI452, IMDBDef1.FLD_PARAMETRI452_PARACATEFISC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI452, IMDBDef1.FLD_PARAMETRI452_PARAMCLASSIF, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Modelli", "UnloadEvent", _e);
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
  private void PAN_MODELLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MODELLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MODELLI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MODELLI, Cancel);
    // Stub
  }

  private void PAN_MODELLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MODELLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MODELLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MODELLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MODELLI_Init()
  {

    PAN_MODELLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MODELLI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MODELLI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_MODELLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, "51ADB24E-89E5-40ED-8F47-73DB19642B05");
    PAN_MODELLI.set_Header(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, "Produttore");
    PAN_MODELLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, "");
    PAN_MODELLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, MyGlb.VIS_NORMALFIELDS);
    PAN_MODELLI.SetFlags(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_MODELLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, "CB449C19-B619-4DB9-9B82-012775E63931");
    PAN_MODELLI.set_Header(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, "Categoria fiscale");
    PAN_MODELLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, "");
    PAN_MODELLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_MODELLI.SetFlags(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_MODELLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, "0BE64F15-5FEE-4DE6-8934-9ECD2A204B59");
    PAN_MODELLI.set_Header(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, "CLASSIFICAZIONE");
    PAN_MODELLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, "");
    PAN_MODELLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, MyGlb.VIS_NORMALFIELDS);
    PAN_MODELLI.SetFlags(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MODELLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, "6801F756-EF6E-4F7B-82B6-7699AE5DD60A");
    PAN_MODELLI.set_Header(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, "CLASSIFICAZIONI DESCRIZIONE");
    PAN_MODELLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, "");
    PAN_MODELLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_MODELLI.SetFlags(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_MODELLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, "8956E7E7-623E-4AAB-9058-7892ACA35DCE");
    PAN_MODELLI.set_Header(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, "Modello");
    PAN_MODELLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, "");
    PAN_MODELLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MODELLI.SetFlags(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MODELLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, "F43F40D8-40BB-4A15-867E-C2BFD858AF14");
    PAN_MODELLI.set_Header(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, "Descrizione");
    PAN_MODELLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, "");
    PAN_MODELLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_MODELLI.SetFlags(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_MODELLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, "A06AA1A0-E6C5-4EF6-99FA-5F261A84925F");
    PAN_MODELLI.set_Header(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, "Classificazione");
    PAN_MODELLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, MyGlb.VIS_LABEVISUSTYL);
    PAN_MODELLI.SetFlags(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MODELLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, "75E9E2E7-CD16-499B-B697-943E7BBB9E70");
    PAN_MODELLI.set_Header(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, "PRODUTTORE");
    PAN_MODELLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, "");
    PAN_MODELLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MODELLI.SetFlags(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_MODELLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, MyGlb.PANEL_LIST, 156);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, MyGlb.PANEL_LIST, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, MyGlb.PANEL_LIST, "Produttore");
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, MyGlb.PANEL_FORM, 4, 124, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, MyGlb.PANEL_FORM, 156);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, MyGlb.PANEL_FORM, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE1, MyGlb.PANEL_FORM, "Produttore");
    PAN_MODELLI.SetFieldPage(PFL_MODELLI_PRODUTTORE1, -1, -1);
    PAN_MODELLI.SetFieldPanel(PFL_MODELLI_PRODUTTORE1, PPQRY_PRODUTTORI, "B.RAGIONE_SOCIALE", "PROSOGRAGSOC", 5, 50, 0, -13997);
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, MyGlb.PANEL_LIST, 168, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, MyGlb.PANEL_LIST, 112);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, MyGlb.PANEL_LIST, "Categoria fiscale");
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, MyGlb.PANEL_FORM, 128);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_CATEGOFISCAL, MyGlb.PANEL_FORM, "Categoria fiscale");
    PAN_MODELLI.SetFieldPage(PFL_MODELLI_CATEGOFISCAL, -1, -1);
    PAN_MODELLI.SetFieldPanel(PFL_MODELLI_CATEGOFISCAL, PPQRY_MODELLI, "A.CATEGORIA_FISCALE", "CATEGORIA_FISCALE", 1, 2, 0, -13997);
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, MyGlb.PANEL_LIST, 328, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, MyGlb.PANEL_LIST, 100);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, MyGlb.PANEL_LIST, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, MyGlb.PANEL_LIST, "CLASSIF.");
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, MyGlb.PANEL_FORM, 136, 52, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, MyGlb.PANEL_FORM, 128);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, MyGlb.PANEL_FORM, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZ1, MyGlb.PANEL_FORM, "CLASSIFICAZIONE");
    PAN_MODELLI.SetFieldPage(PFL_MODELLI_CLASSIFICAZ1, -1, -1);
    PAN_MODELLI.SetFieldPanel(PFL_MODELLI_CLASSIFICAZ1, PPQRY_MODELLI, "A.CLASSIFICAZIONE", "CLASSIFICAZIONE", 5, 10, 0, -13997);
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, MyGlb.PANEL_LIST, 392, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, MyGlb.PANEL_LIST, 168);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, MyGlb.PANEL_LIST, "CLASSIFICAZIONI DESCRIZIONE");
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, MyGlb.PANEL_FORM, 176, 148, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, MyGlb.PANEL_FORM, 168);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIDESCRI, MyGlb.PANEL_FORM, "CLASSIF. DESCRIZIONE");
    PAN_MODELLI.SetFieldPage(PFL_MODELLI_CLASSIDESCRI, -1, -1);
    PAN_MODELLI.SetFieldPanel(PFL_MODELLI_CLASSIDESCRI, PPQRY_CLASSIFICAZI, "A.DESCRIZIONE", "CLASSIDESCRI", 5, 60, 0, -13997);
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, MyGlb.PANEL_LIST, 612, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, MyGlb.PANEL_LIST, 56);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, MyGlb.PANEL_LIST, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, MyGlb.PANEL_LIST, "Modello");
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, MyGlb.PANEL_FORM, 128);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, MyGlb.PANEL_FORM, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_MODELLO, MyGlb.PANEL_FORM, "Modello");
    PAN_MODELLI.SetFieldPage(PFL_MODELLI_MODELLO, -1, -1);
    PAN_MODELLI.SetFieldPanel(PFL_MODELLI_MODELLO, PPQRY_MODELLI, "A.MODELLO", "MODELLO", 5, 4, 0, -13997);
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, MyGlb.PANEL_LIST, 684, 36, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_MODELLI.SetFieldPage(PFL_MODELLI_DESCRIZIONE, -1, -1);
    PAN_MODELLI.SetFieldPanel(PFL_MODELLI_DESCRIZIONE, PPQRY_MODELLI, "A.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, MyGlb.PANEL_LIST, 328, 0, 284, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, MyGlb.PANEL_LIST, 0);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, MyGlb.PANEL_LIST, 2);
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, MyGlb.PANEL_FORM, 304, 0, 292, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, MyGlb.PANEL_FORM, 0);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_CLASSIFICAZI, MyGlb.PANEL_FORM, 2);
    PAN_MODELLI.SetFieldPage(PFL_MODELLI_CLASSIFICAZI, -1, -1);
    PAN_MODELLI.SetFieldPanel(PFL_MODELLI_CLASSIFICAZI, -1, "", "CLASSIFICAZI", 0, 0, 0, -13997);
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, MyGlb.PANEL_LIST, 76);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, MyGlb.PANEL_LIST, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, MyGlb.PANEL_LIST, "PRODUT.");
    PAN_MODELLI.SetRect(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, MyGlb.PANEL_FORM, 4, 172, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MODELLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, MyGlb.PANEL_FORM, 76);
    PAN_MODELLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, MyGlb.PANEL_FORM, 1);
    PAN_MODELLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MODELLI_PRODUTTORE, MyGlb.PANEL_FORM, "PRODUT.");
    PAN_MODELLI.SetFieldPage(PFL_MODELLI_PRODUTTORE, -1, -1);
    PAN_MODELLI.SetFieldPanel(PFL_MODELLI_PRODUTTORE, PPQRY_MODELLI, "A.PRODUTTORE", "PRODUTTORE", 1, 8, 0, -13997);
  }

  private void PAN_MODELLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MODELLI.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.RAGIONE_SOCIALE as PROSOGRAGSOC ");
    SQL.append("from ");
    SQL.append("  PRODUTTORI A, ");
    SQL.append("  SOGGETTI B ");
    SQL.append("where (A.SOGGETTO = B.SOGGETTO) ");
    SQL.append("and   (A.CODICE = ~~PRODUTTORE~~) ");
    PAN_MODELLI.SetQuery(PPQRY_PRODUTTORI, 0, SQL, -1, "");
    PAN_MODELLI.SetQueryDB(PPQRY_PRODUTTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MODELLI.SetMasterTable(PPQRY_PRODUTTORI, "PRODUTTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CLASSIDESCRI ");
    SQL.append("from ");
    SQL.append("  CLASSIFICAZIONI A ");
    SQL.append("where (A.CLASSIFICAZIONE = ~~CLASSIFICAZIONE~~) ");
    SQL.append("and   (A.CATEGORIA_FISCALE = ~~CATEGORIA_FISCALE~~) ");
    PAN_MODELLI.SetQuery(PPQRY_CLASSIFICAZI, 0, SQL, -1, "");
    PAN_MODELLI.SetQueryDB(PPQRY_CLASSIFICAZI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MODELLI.SetMasterTable(PPQRY_CLASSIFICAZI, "CLASSIFICAZIONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA_FISCALE as CATFISCATFIS, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA_FISCALE ) || ' ' || '-' || ' ' || A.DESCRIZIONE as CATFISNEWEXP ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_FISCALI A ");
    SQL.append("where (A.CATEGORIA_FISCALE = ~~CATEGORIA_FISCALE~~) ");
    PAN_MODELLI.SetQuery(PPQRY_CATEGOFISCAL, 0, SQL, PFL_MODELLI_CATEGOFISCAL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA_FISCALE as CATFISCATFIS, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA_FISCALE ) || ' ' || '-' || ' ' || A.DESCRIZIONE as CATFISNEWEXP ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_FISCALI A ");
    PAN_MODELLI.SetQuery(PPQRY_CATEGOFISCAL, 1, SQL, PFL_MODELLI_CATEGOFISCAL, "");
    PAN_MODELLI.SetQueryDB(PPQRY_CATEGOFISCAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MODELLI.SetIMDB(IMDB, "PQRY_MODELLI", true);
    PAN_MODELLI.set_SetString(MyGlb.MASTER_ROWNAME, "MODELLI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PRODUTTORE as PRODUTTORE, ");
    SQL.append("  A.CATEGORIA_FISCALE as CATEGORIA_FISCALE, ");
    SQL.append("  A.CLASSIFICAZIONE as CLASSIFICAZIONE, ");
    SQL.append("  A.MODELLO as MODELLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_MODELLI.SetQuery(PPQRY_MODELLI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MODELLI A ");
    PAN_MODELLI.SetQuery(PPQRY_MODELLI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PRODUTTORE = NVL(~~TBL_PARAMETRI452.PARAMPRODUTT~~, A.PRODUTTORE)) ");
    SQL.append("and   (A.CATEGORIA_FISCALE = NVL(~~TBL_PARAMETRI452.PARACATEFISC~~, A.CATEGORIA_FISCALE)) ");
    SQL.append("and   (A.CLASSIFICAZIONE = NVL(~~TBL_PARAMETRI452.PARAMCLASSIF~~, A.CLASSIFICAZIONE)) ");
    PAN_MODELLI.SetQuery(PPQRY_MODELLI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MODELLI.SetQuery(PPQRY_MODELLI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MODELLI.SetQuery(PPQRY_MODELLI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MODELLI.SetQuery(PPQRY_MODELLI, 5, SQL, -1, "");
    PAN_MODELLI.SetQueryDB(PPQRY_MODELLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MODELLI.SetMasterTable(0, "MODELLI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MODELLI.Status() == 2)
    {
      int oldListQBE = PAN_MODELLI.iUseListQBE;
      PAN_MODELLI.iUseListQBE = 0;
      PAN_MODELLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MODELLI.PanelCommand(Glb.PCM_FIND);
      PAN_MODELLI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MODELLI) PAN_MODELLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MODELLI) PAN_MODELLI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MODELLI) PAN_MODELLI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MODELLI) PAN_MODELLI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MODELLI) PAN_MODELLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
