// **********************************************
// Scelta Impegno Anno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaImpegnoAnno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTAIMPEGN_NUMERO = 0;
  private static int PFL_SCELTAIMPEGN_ANNO = 1;
  private static int PFL_SCELTAIMPEGN_INFOIMPEGNO = 2;
  private static int PFL_SCELTAIMPEGN_IMPEGNO = 3;
  private static int PFL_SCELTAIMPEGN_DESCRIZIONE = 4;
  private static int PFL_SCELTAIMPEGN_CAPITOLO = 5;
  private static int PFL_SCELTAIMPEGN_ART = 6;
  private static int PFL_SCELTAIMPEGN_NUMERIMPPROV = 7;
  private static int PFL_SCELTAIMPEGN_ANNOIMPPROVE = 8;
  private static int PFL_SCELTAIMPEGN_UOUTILIZZO = 9;
  private static int PFL_SCELTAIMPEGN_DISPEFFETTIV = 10;
  private static int PFL_SCELTAIMPEGN_ETICHIMPPROV = 11;
  private static int PFL_SCELTAIMPEGN_ANNOIMPPREC = 12;
  private static int PFL_SCELTAIMPEGN_NUMERIMPPREC = 13;

  private static int PPQRY_ESEIMP2 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_SCELTAIMPEGN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI518(IMDB);
    //
    //
    Init_PQRY_ESEIMP2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI518(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI518, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI518, "TBL_PARAMETRI518");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI518,IMDBDef1.FLD_PARAMETRI518_ROWNAMPROUNI, "ROWNAMPROUNI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI518,IMDBDef1.FLD_PARAMETRI518_ROWNAMPROUNI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI518,IMDBDef1.FLD_PARAMETRI518_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI518,IMDBDef1.FLD_PARAMETRI518_ROWNAMEESERC,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI518,IMDBDef1.FLD_PARAMETRI518_ROWNAMEINTER, "ROWNAMEINTER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI518,IMDBDef1.FLD_PARAMETRI518_ROWNAMEINTER,1,7,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI518, 0);
  }

  private static void Init_PQRY_ESEIMP2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_ESEIMP2, 11);
    IMDB.set_TblCode(IMDBDef7.PQRY_ESEIMP2, "PQRY_ESEIMP2");
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESEIMUOUTILI, "ESEIMUOUTILI");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESEIMUOUTILI,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESEIDISPEFFE, "ESEIDISPEFFE");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESEIDISPEFFE,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESENUMIMPPRO, "ESENUMIMPPRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESENUMIMPPRO,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESEANNIMPPRO, "ESEANNIMPPRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESEANNIMPPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESEANNIMPPRE, "ESEANNIMPPRE");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESEANNIMPPRE,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESENUMIMPPRE, "ESENUMIMPPRE");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP2,IMDBDef7.PQSL_ESEIMP2_ESENUMIMPPRE,1,5,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_ESEIMP2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaImpegnoAnno(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaImpegnoAnno()
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
    FormIdx = MyGlb.FRM_SCELIMPEANNO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9BC0A801-B274-4079-B52A-F63D9E04C6D0";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 908;
    DesignHeight = 366;
    set_Caption(new IDVariant("Scelta Impegno Anno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 908;
    Frames[1].Height = 340;
    Frames[1].Caption = "Scelta Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 340;
    PAN_SCELTAIMPEGN = new IDPanel(w, this, 1, "PAN_SCELTAIMPEGN");
    Frames[1].Content = PAN_SCELTAIMPEGN;
    PAN_SCELTAIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTAIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 908-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A9E7D9D7-EE79-4044-A135-337DBEB33E36");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 856, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTAIMPEGN.InitStatus = 1;
    PAN_SCELTAIMPEGN_Init();
    PAN_SCELTAIMPEGN_InitFields();
    PAN_SCELTAIMPEGN_InitQueries();
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
      PAN_SCELTAIMPEGN.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaImpegnoAnno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaImpegnoAnno.class.getName() : (Glb.ClassWithPackage(SceltaImpegnoAnno.class) ? SceltaImpegnoAnno.class.getName().substring(SceltaImpegnoAnno.class.getPackage().getName().length() + 1) : SceltaImpegnoAnno.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Impegno On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTAIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTAIMPEGN);
      // 
      // Scelta Impegno On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SCELTAIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAIMPEGN_UOUTILIZZO,(new IDVariant(PAN_SCELTAIMPEGN.FieldText(PFL_SCELTAIMPEGN_UOUTILIZZO))).stringValue()); 
      PAN_SCELTAIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAIMPEGN_DESCRIZIONE,(new IDVariant(PAN_SCELTAIMPEGN.FieldText(PFL_SCELTAIMPEGN_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoAnno", "SceltaImpegnoOnDynamicPropertiesEvent", _e);
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
      v_CAPTION = (new IDVariant("Scelta Impegno", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoAnno", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("SceltaImpegnoAnno", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI518, IMDBDef1.FLD_PARAMETRI518_ROWNAMPROUNI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI518, IMDBDef1.FLD_PARAMETRI518_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI518, IMDBDef1.FLD_PARAMETRI518_ROWNAMEINTER, 0, new IDVariant());
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_ESEIMP2, IMDBDef7.PQSL_ESEIMP2_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_ESEIMP2, IMDBDef7.PQSL_ESEIMP2_NUMERO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP2, IMDBDef7.PQSL_ESEIMP2_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP2, IMDBDef7.PQSL_ESEIMP2_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoAnno", "Info", _e);
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
  private void PAN_SCELTAIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTAIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTAIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTAIMPEGN, Cancel);
    // Stub
  }

  private void PAN_SCELTAIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SCELTAIMPEGN_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_SCELTAIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SCELTAIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTAIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTAIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTAIMPEGN_Init()
  {

    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, "7EFA4E97-3EF3-49B7-A066-BA1DA5EC47CF");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, "Numero");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, "7A842339-FF25-4F90-BEAD-A55650D57933");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, "Anno");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, "Anno");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, "0F76CC89-0A59-4AEC-9BBC-71E0B98D337E");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, "Info Impegno");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, MyGlb.VIS_HYPLINIMLOU1);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, "F2BA81F2-BA0E-4E5F-8F41-152E7CB04BE4");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, "Impegno");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, "FF19C94D-2F1F-46A0-BF39-2376EE6A6F96");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, "1F53D69A-E95F-4829-BA7E-869C25E1A7EE");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, "Capitolo");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, "Capitolo");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, "3D461A40-D3B4-4E39-9BB7-83DB8084C031");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, "Art.");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, "Articolo");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, "41B41FE6-F0FD-491A-9DD6-F6BA8AF5A3CD");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, "NUMERO IMP PROVENIENZA");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, "1E560F73-9253-4F40-B5D8-A25A4401DBE6");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, "ANNO IMP PROVENIENZA");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, "C1B37AF7-0900-4997-AEB9-40EE0648B411");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, "U.O. Utilizzo");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, "E61F1B27-D5C5-4825-B11E-94BFD9CDC6EC");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, "Disp. Effettiva");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, "61726323-CFD6-4EC8-BECF-E70ED654069B");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, "Imp. Provenienza");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, "BED85ECB-3E75-4708-B6AA-3CF0EB76B9A0");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, "Anno impegno esercizio precedente");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, "616B6B42-90DF-419A-AD26-4DC2DEECCF77");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, "Numero impegno esercizio precedente");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTAIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_LIST, 72);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_LIST, "Num.");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_FORM, 4, 64, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_FORM, 72);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NUMERO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NUMERO, PPQRY_ESEIMP2, "B.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_LIST, 40, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_FORM, 4, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ANNO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ANNO, PPQRY_ESEIMP2, "B.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, 76, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, "I. I.");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 304, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, "Info Impegno");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_INFOIMPEGNO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_INFOIMPEGNO, PPQRY_DUAL, "'I'", "DUALINFOIMPE", 5, 1, 0, -13997);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 0, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 8, 8, 120, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_IMPEGNO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 100, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_DESCRIZIONE, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_DESCRIZIONE, PPQRY_ESEIMP2, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 312, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 116);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 4, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CAPITOLO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CAPITOLO, PPQRY_ESEIMP2, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_LIST, 448, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_FORM, 4, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ART, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ART, PPQRY_ESEIMP2, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, MyGlb.PANEL_LIST, 480, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, MyGlb.PANEL_LIST, 160);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, MyGlb.PANEL_LIST, "NUM. I. PRV.");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, MyGlb.PANEL_FORM, 4, 352, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, MyGlb.PANEL_FORM, 160);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPROV, MyGlb.PANEL_FORM, "NUMERO IMP PROVENIENZA");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NUMERIMPPROV, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NUMERIMPPROV, PPQRY_ESEIMP2, "B.NUMERO_IMP_PROVENIENZA", "ESENUMIMPPRO", 1, 5, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, MyGlb.PANEL_LIST, 524, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, MyGlb.PANEL_LIST, 144);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, MyGlb.PANEL_LIST, "AN. I. PRV.");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, MyGlb.PANEL_FORM, 4, 376, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, MyGlb.PANEL_FORM, 144);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPROVE, MyGlb.PANEL_FORM, "ANNO IMP PROVENIENZA");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ANNOIMPPROVE, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ANNOIMPPROVE, PPQRY_ESEIMP2, "B.ANNO_IMP_PROVENIENZA", "ESEANNIMPPRO", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_LIST, 560, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_LIST, "U.O. Utilizzo");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_FORM, 4, 184, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_FORM, "U.O. Utilizzo");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_UOUTILIZZO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldUnbound(PFL_SCELTAIMPEGN_UOUTILIZZO, true);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_UOUTILIZZO, PPQRY_ESEIMP2, "DECODE(GET_UO_UTILIZZO(A.ESERCIZIO,B.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE )), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO(A.ESERCIZIO,B.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE )),TRUNC( SYSDATE )))", "ESEIMUOUTILI", 5, 99, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 752, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, "Disp. Effettiva");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 4, 280, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 76);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, "Dsp. Effet.");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_DISPEFFETTIV, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldUnbound(PFL_SCELTAIMPEGN_DISPEFFETTIV, true);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_DISPEFFETTIV, PPQRY_ESEIMP2, "MAX(CF4WEB_GET_IMPORTI_SCHEDA_INFO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',to_number(NULL),to_number(NULL),to_number(NULL),B.CAPITOLO,B.ARTICOLO,B.ANNO_IMP,B.NUMERO_IMP,NULL,NULL,NULL,B.PROGR_UNITA_ORGANIZZATIVA,'DISP_EFF'))", "ESEIDISPEFFE", 3, 28, 6, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, MyGlb.PANEL_LIST, 480, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, MyGlb.PANEL_LIST, 0);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, MyGlb.PANEL_FORM, 776, 244, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, MyGlb.PANEL_FORM, 0);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ETICHIMPPROV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ETICHIMPPROV, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ETICHIMPPROV, -1, "", "ETICHIMPPROV", 0, 0, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, MyGlb.PANEL_LIST, 856, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, MyGlb.PANEL_LIST, 96);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, MyGlb.PANEL_LIST, "Ann. imp. eserc. precedente");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, MyGlb.PANEL_FORM, 4, 400, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, MyGlb.PANEL_FORM, 96);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMPPREC, MyGlb.PANEL_FORM, "A. imp. esr. prc.");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ANNOIMPPREC, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ANNOIMPPREC, PPQRY_ESEIMP2, "B.ANNO_IMP_PREC", "ESEANNIMPPRE", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, MyGlb.PANEL_LIST, 856, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, MyGlb.PANEL_LIST, 112);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, MyGlb.PANEL_LIST, "Num. imp. eserc. precedente");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, MyGlb.PANEL_FORM, 4, 424, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, MyGlb.PANEL_FORM, 112);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERIMPPREC, MyGlb.PANEL_FORM, "Num. imp. esr. prc.");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NUMERIMPPREC, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NUMERIMPPREC, PPQRY_ESEIMP2, "B.NUMERO_IMP_PREC", "ESENUMIMPPRE", 1, 5, 0, -13997);
  }

  private void PAN_SCELTAIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as DUALINFOIMPE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ANNO_IMP~~ IS NULL)) AND NOT ((~~NUMERO_IMP~~ IS NULL))) ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_SCELTAIMPEGN.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTAIMPEGN.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_SCELTAIMPEGN.SetIMDB(IMDB, "PQRY_ESEIMP2", true);
    PAN_SCELTAIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "ESEIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CAPITOLO as CAPITOLO, ");
    SQL.append("  B.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  DECODE(GET_UO_UTILIZZO(A.ESERCIZIO,B.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE )), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO(A.ESERCIZIO,B.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE )),TRUNC( SYSDATE ))) as ESEIMUOUTILI, ");
    SQL.append("  MAX(CF4WEB_GET_IMPORTI_SCHEDA_INFO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',to_number(NULL),to_number(NULL),to_number(NULL),B.CAPITOLO,B.ARTICOLO,B.ANNO_IMP,B.NUMERO_IMP,NULL,NULL,NULL,B.PROGR_UNITA_ORGANIZZATIVA,'DISP_EFF')) as ESEIDISPEFFE, ");
    SQL.append("  B.NUMERO_IMP_PROVENIENZA as ESENUMIMPPRO, ");
    SQL.append("  B.ANNO_IMP_PROVENIENZA as ESEANNIMPPRO, ");
    SQL.append("  B.ANNO_IMP_PREC as ESEANNIMPPRE, ");
    SQL.append("  B.NUMERO_IMP_PREC as ESENUMIMPPRE ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_ESEIMP2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEIMP A, ");
    SQL.append("  IMP B ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_ESEIMP2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI518.ROWNAMEESERC~~) ");
    SQL.append("and   (A.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (NVL(B.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI518.ROWNAMPROUNI~~, NVL(B.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (B.ANNO_IMP = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_ESEIMP2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP, ");
    SQL.append("  B.DESCRIZIONE, ");
    SQL.append("  DECODE(GET_UO_UTILIZZO(A.ESERCIZIO,B.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE )), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO(A.ESERCIZIO,B.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE )),TRUNC( SYSDATE ))), ");
    SQL.append("  B.NUMERO_IMP_PROVENIENZA, ");
    SQL.append("  B.ANNO_IMP_PROVENIENZA, ");
    SQL.append("  B.ANNO_IMP_PREC, ");
    SQL.append("  B.NUMERO_IMP_PREC ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_ESEIMP2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_ESEIMP2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_ESEIMP2, 5, SQL, -1, "");
    PAN_SCELTAIMPEGN.SetQueryDB(PPQRY_ESEIMP2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTAIMPEGN.SetMasterTable(0, "ESEIMP");
    PAN_SCELTAIMPEGN.AddToSortList(PFL_SCELTAIMPEGN_ANNO, true);
    PAN_SCELTAIMPEGN.AddToSortList(PFL_SCELTAIMPEGN_NUMERO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTAIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_SCELTAIMPEGN.iUseListQBE;
      PAN_SCELTAIMPEGN.iUseListQBE = 0;
      PAN_SCELTAIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTAIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTAIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
