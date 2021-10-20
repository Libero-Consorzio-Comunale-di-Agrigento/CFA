// **********************************************
// Scelta Accertamenti Esercizio Precedente
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaAccertamentiEsercizioPrecedente extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SCELTACCERAP_ACCERTAMENTO = 0;

  private static int PFL_SCELTACCERAP_NUMEROACC = 0;
  private static int PFL_SCELTACCERAP_ANNOACC = 1;
  private static int PFL_SCELTACCERAP_INFOACCERTAM = 2;
  private static int PFL_SCELTACCERAP_DESCRIZIONE = 3;
  private static int PFL_SCELTACCERAP_CAPITOLO = 4;
  private static int PFL_SCELTACCERAP_ART = 5;
  private static int PFL_SCELTACCERAP_UOUTILIZZO = 6;
  private static int PFL_SCELTACCERAP_DISPONIBILIT = 7;

  private static int PPQRY_ACC6 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_SCELTACCERAP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRSAAP(IMDB);
    //
    //
    Init_PQRY_ACC6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRSAAP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRSAAP, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRSAAP, "TBL_PARAMETRSAAP");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRSAAP,IMDBDef1.FLD_PARAMETRSAAP_ROWNAMPROUNI, "ROWNAMPROUNI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRSAAP,IMDBDef1.FLD_PARAMETRSAAP_ROWNAMPROUNI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRSAAP,IMDBDef1.FLD_PARAMETRSAAP_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRSAAP,IMDBDef1.FLD_PARAMETRSAAP_ROWNAMECAPIT,1,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRSAAP,IMDBDef1.FLD_PARAMETRSAAP_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRSAAP,IMDBDef1.FLD_PARAMETRSAAP_ROWNAMEARTIC,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRSAAP, 0);
  }

  private static void Init_PQRY_ACC6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_ACC6, 7);
    IMDB.set_TblCode(IMDBDef7.PQRY_ACC6, "PQRY_ACC6");
    IMDB.set_FldCode(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ESEACNUMEACC, "ESEACNUMEACC");
    IMDB.SetFldParams(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ESEACNUMEACC,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ESEACANNOACC, "ESEACANNOACC");
    IMDB.SetFldParams(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ESEACANNOACC,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ESEACUOUTILI, "ESEACUOUTILI");
    IMDB.SetFldParams(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ESEACUOUTILI,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ESEACCDISPON, "ESEACCDISPON");
    IMDB.SetFldParams(IMDBDef7.PQRY_ACC6,IMDBDef7.PQSL_ACC6_ESEACCDISPON,3,14,2);
    IMDB.TblAddNew(IMDBDef7.PQRY_ACC6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaAccertamentiEsercizioPrecedente(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaAccertamentiEsercizioPrecedente()
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
    FormIdx = MyGlb.FRM_SCEACCESEPRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "203BE496-AE09-48BC-946C-E47857632C3E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 888;
    DesignHeight = 366;
    set_Caption(new IDVariant("Scelta Accertamenti Esercizio Precedente"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 888;
    Frames[1].Height = 340;
    Frames[1].Caption = "Accertamento Esercizio Precedente";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 340;
    PAN_SCELTACCERAP = new IDPanel(w, this, 1, "PAN_SCELTACCERAP");
    Frames[1].Content = PAN_SCELTACCERAP;
    PAN_SCELTACCERAP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTACCERAP.VS = MainFrm.VisualStyleList;
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 888-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DA79D281-7C75-4C5C-9BA4-1BE82F8A92D2");
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 852, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTACCERAP.InitStatus = 1;
    PAN_SCELTACCERAP_Init();
    PAN_SCELTACCERAP_InitFields();
    PAN_SCELTACCERAP_InitQueries();
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
      PAN_SCELTACCERAP.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaAccertamentiEsercizioPrecedente);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaAccertamentiEsercizioPrecedente.class.getName() : (Glb.ClassWithPackage(SceltaAccertamentiEsercizioPrecedente.class) ? SceltaAccertamentiEsercizioPrecedente.class.getName().substring(SceltaAccertamentiEsercizioPrecedente.class.getPackage().getName().length() + 1) : SceltaAccertamentiEsercizioPrecedente.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Accertamento AP On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTACCERAP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTACCERAP);
      // 
      // Scelta Accertamento AP On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SCELTACCERAP.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTACCERAP_UOUTILIZZO,(new IDVariant(PAN_SCELTACCERAP.FieldText(PFL_SCELTACCERAP_UOUTILIZZO))).stringValue()); 
      PAN_SCELTACCERAP.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTACCERAP_DESCRIZIONE,(new IDVariant(PAN_SCELTACCERAP.FieldText(PFL_SCELTACCERAP_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaAccertamentiEsercizioPrecedente", "SceltaAccertamentoAPOnDynamicPropertiesEvent", _e);
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
      v_CAPTION = (new IDVariant("Scelta Accertamento ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_ESERCIZIPREC = null;
      v_ESERCIZIPREC = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)));
      set_Caption(IDL.Add(v_CAPTION, IDL.ToString(v_ESERCIZIPREC)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaAccertamentiEsercizioPrecedente", "LoadEvent", _e);
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
      UNLOADEVENT_PARASAAPDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaAccertamentiEsercizioPrecedente", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri SAAP: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARASAAPDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRSAAP, IMDBDef1.FLD_PARAMETRSAAP_ROWNAMPROUNI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRSAAP, IMDBDef1.FLD_PARAMETRSAAP_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRSAAP, IMDBDef1.FLD_PARAMETRSAAP_ROWNAMEARTIC, 0, new IDVariant());
  }

  // **********************************************************************
  // Info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_ACC6, IMDBDef7.PQSL_ACC6_ESEACANNOACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_ACC6, IMDBDef7.PQSL_ACC6_ESEACNUMEACC, 0))))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_INFOACCEFORM, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_INFOACCEFORM,(new IDVariant(0)).booleanValue()); 
        }
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef7.PQRY_ACC6, IMDBDef7.PQSL_ACC6_ESEACNUMEACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef7.PQRY_ACC6, IMDBDef7.PQSL_ACC6_ESEACANNOACC, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaAccertamentiEsercizioPrecedente", "Info", _e);
      return -1;
    }
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
  private void PAN_SCELTACCERAP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTACCERAP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTACCERAP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTACCERAP, Cancel);
    // Stub
  }

  private void PAN_SCELTACCERAP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SCELTACCERAP_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_SCELTACCERAP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SCELTACCERAP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTACCERAP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTACCERAP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTACCERAP_Init()
  {

    PAN_SCELTACCERAP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTACCERAP.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, "7CCD9781-6E01-4D4E-B2F2-C8DCDBB88784");
    PAN_SCELTACCERAP.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, "Accertamento");
    PAN_SCELTACCERAP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, "");
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, -9999, 168, 16, 0, 0);
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, MyGlb.PANEL_FORM, 0, 279, 544, 217, 0, 0);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, 0, 81);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, 1, 13);
    PAN_SCELTACCERAP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, 0, 4);
    PAN_SCELTACCERAP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, 1, 4);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTACCERAP_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTACCERAP.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, "AC442BBC-5620-44F0-9283-D5311723248B");
    PAN_SCELTACCERAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, "Numero");
    PAN_SCELTACCERAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, "");
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, "BE766F59-F359-4F8E-918A-4A536BF0E716");
    PAN_SCELTACCERAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, "Anno");
    PAN_SCELTACCERAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, "");
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, "41640680-1D78-4442-BE7B-6E44AF0B93B2");
    PAN_SCELTACCERAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, " ");
    PAN_SCELTACCERAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, "");
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, MyGlb.VIS_HYPLINIMLOU1);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, "BCEF80A5-6FB1-4492-B2F1-A09239DF2068");
    PAN_SCELTACCERAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, "Descrizione");
    PAN_SCELTACCERAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, "Descrizione");
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, "68B4B5A5-81C0-4DE0-B847-59BB611F3A40");
    PAN_SCELTACCERAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, "Capitolo");
    PAN_SCELTACCERAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, "Capitolo");
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, "AA2290F2-BDCD-4F6A-8398-60EB205CBE23");
    PAN_SCELTACCERAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, "Art.");
    PAN_SCELTACCERAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, "Articolo");
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, "B214FBDD-4F34-4840-81F2-D21C53755D2A");
    PAN_SCELTACCERAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, "U.O. Utilizzo");
    PAN_SCELTACCERAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, "");
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTACCERAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, "B20D533A-0672-4815-8AA8-B3C6514C784D");
    PAN_SCELTACCERAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, "Disponibilità");
    PAN_SCELTACCERAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, "");
    PAN_SCELTACCERAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACCERAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTACCERAP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, MyGlb.PANEL_LIST, 80);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, MyGlb.PANEL_FORM, 4, 472, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, MyGlb.PANEL_FORM, 80);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_NUMEROACC, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTACCERAP.SetFieldPage(PFL_SCELTACCERAP_NUMEROACC, -1, GRP_SCELTACCERAP_ACCERTAMENTO);
    PAN_SCELTACCERAP.SetFieldPanel(PFL_SCELTACCERAP_NUMEROACC, PPQRY_ACC6, "A.NUMERO_ACC", "ESEACNUMEACC", 1, 5, 0, -13997);
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, MyGlb.PANEL_LIST, 80, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, MyGlb.PANEL_FORM, 4, 448, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ANNOACC, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTACCERAP.SetFieldPage(PFL_SCELTACCERAP_ANNOACC, -1, GRP_SCELTACCERAP_ACCERTAMENTO);
    PAN_SCELTACCERAP.SetFieldPanel(PFL_SCELTACCERAP_ANNOACC, PPQRY_ACC6, "A.ANNO_ACC", "ESEACANNOACC", 1, 4, 0, -13997);
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, MyGlb.PANEL_LIST, 144, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, MyGlb.PANEL_LIST, 104);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, MyGlb.PANEL_LIST, " ");
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, MyGlb.PANEL_FORM, 4, 304, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, MyGlb.PANEL_FORM, 104);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_INFOACCERTAM, MyGlb.PANEL_FORM, " ");
    PAN_SCELTACCERAP.SetFieldPage(PFL_SCELTACCERAP_INFOACCERTAM, -1, GRP_SCELTACCERAP_ACCERTAMENTO);
    PAN_SCELTACCERAP.SetFieldPanel(PFL_SCELTACCERAP_INFOACCERTAM, PPQRY_DUAL, "'I'", "DUALINFOACCE", 5, 1, 0, -13997);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_SCELTACCERAP.SetValueListItem(PFL_SCELTACCERAP_INFOACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, MyGlb.PANEL_LIST, 168, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTACCERAP.SetFieldPage(PFL_SCELTACCERAP_DESCRIZIONE, -1, -1);
    PAN_SCELTACCERAP.SetFieldPanel(PFL_SCELTACCERAP_DESCRIZIONE, PPQRY_ACC6, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, MyGlb.PANEL_LIST, 380, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, MyGlb.PANEL_LIST, 116);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, MyGlb.PANEL_FORM, 4, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTACCERAP.SetFieldPage(PFL_SCELTACCERAP_CAPITOLO, -1, -1);
    PAN_SCELTACCERAP.SetFieldPanel(PFL_SCELTACCERAP_CAPITOLO, PPQRY_ACC6, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, MyGlb.PANEL_LIST, 516, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, MyGlb.PANEL_LIST, 60);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, MyGlb.PANEL_FORM, 4, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, MyGlb.PANEL_FORM, 60);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, MyGlb.PANEL_FORM, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_SCELTACCERAP.SetFieldPage(PFL_SCELTACCERAP_ART, -1, -1);
    PAN_SCELTACCERAP.SetFieldPanel(PFL_SCELTACCERAP_ART, PPQRY_ACC6, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, MyGlb.PANEL_LIST, 548, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, MyGlb.PANEL_LIST, "U.O. Utilizzo");
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, MyGlb.PANEL_FORM, 4, 184, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, MyGlb.PANEL_FORM, 2);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_UOUTILIZZO, MyGlb.PANEL_FORM, "U.O. Utilizzo");
    PAN_SCELTACCERAP.SetFieldPage(PFL_SCELTACCERAP_UOUTILIZZO, -1, -1);
    PAN_SCELTACCERAP.SetFieldUnbound(PFL_SCELTACCERAP_UOUTILIZZO, true);
    PAN_SCELTACCERAP.SetFieldPanel(PFL_SCELTACCERAP_UOUTILIZZO, PPQRY_ACC6, "DECODE(GET_UO_UTILIZZO(B.ESERCIZIO,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO(B.ESERCIZIO,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )),TRUNC( SYSDATE )))", "ESEACUOUTILI", 5, 99, 0, -13997);
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, MyGlb.PANEL_LIST, 740, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, MyGlb.PANEL_LIST, 96);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_SCELTACCERAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 424, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACCERAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, MyGlb.PANEL_FORM, 96);
    PAN_SCELTACCERAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_SCELTACCERAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACCERAP_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_SCELTACCERAP.SetFieldPage(PFL_SCELTACCERAP_DISPONIBILIT, -1, -1);
    PAN_SCELTACCERAP.SetFieldPanel(PFL_SCELTACCERAP_DISPONIBILIT, PPQRY_ACC6, "B.DISPONIBILITA", "ESEACCDISPON", 3, 14, 2, -13997);
  }

  private void PAN_SCELTACCERAP_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTACCERAP.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as DUALINFOACCE, ");
    SQL.append("  ~~ESEACCDISPON~~ as ESDISCAAPSAA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESEACANNOACC~~ IS NULL)) AND NOT ((~~ESEACNUMEACC~~ IS NULL))) ");
    PAN_SCELTACCERAP.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_SCELTACCERAP.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTACCERAP.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_SCELTACCERAP.SetIMDB(IMDB, "PQRY_ACC6", true);
    PAN_SCELTACCERAP.set_SetString(MyGlb.MASTER_ROWNAME, "ESEACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_ACC as ESEACNUMEACC, ");
    SQL.append("  A.ANNO_ACC as ESEACANNOACC, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  DECODE(GET_UO_UTILIZZO(B.ESERCIZIO,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO(B.ESERCIZIO,'E',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )),TRUNC( SYSDATE ))) as ESEACUOUTILI, ");
    SQL.append("  B.DISPONIBILITA as ESEACCDISPON ");
    PAN_SCELTACCERAP.SetQuery(PPQRY_ACC6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ACC A, ");
    SQL.append("  ESEACC B ");
    PAN_SCELTACCERAP.SetQuery(PPQRY_ACC6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ACC = B.ANNO_ACC) ");
    SQL.append("and   (A.NUMERO_ACC = B.NUMERO_ACC) ");
    SQL.append("and   (A.ANNO_ACC = ~~TBL_DATISESSIONE.SESSIOESERCI~~ - 1) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRSAAP.ROWNAMPROUNI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~ - 1) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRSAAP.ROWNAMECAPIT~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRSAAP.ROWNAMEARTIC~~) ");
    PAN_SCELTACCERAP.SetQuery(PPQRY_ACC6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTACCERAP.SetQuery(PPQRY_ACC6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTACCERAP.SetQuery(PPQRY_ACC6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_SCELTACCERAP.SetQuery(PPQRY_ACC6, 5, SQL, -1, "");
    PAN_SCELTACCERAP.SetQueryDB(PPQRY_ACC6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTACCERAP.SetMasterTable(0, "ACC");
    PAN_SCELTACCERAP.AddToSortList(PFL_SCELTACCERAP_CAPITOLO, true);
    PAN_SCELTACCERAP.AddToSortList(PFL_SCELTACCERAP_ART, true);
    PAN_SCELTACCERAP.AddToSortList(PFL_SCELTACCERAP_DESCRIZIONE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTACCERAP.Status() == 2)
    {
      int oldListQBE = PAN_SCELTACCERAP.iUseListQBE;
      PAN_SCELTACCERAP.iUseListQBE = 0;
      PAN_SCELTACCERAP.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTACCERAP.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTACCERAP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTACCERAP) PAN_SCELTACCERAP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTACCERAP) PAN_SCELTACCERAP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTACCERAP) PAN_SCELTACCERAP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTACCERAP) PAN_SCELTACCERAP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTACCERAP) PAN_SCELTACCERAP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
