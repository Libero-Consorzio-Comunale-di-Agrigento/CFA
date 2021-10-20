// **********************************************
// Scelta Sub Impegno UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaSubImpegnoUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTSUBIMPE_NUMERO = 0;
  private static int PFL_SCELTSUBIMPE_ANNO = 1;
  private static int PFL_SCELTSUBIMPE_DESCRIZIONE = 2;
  private static int PFL_SCELTSUBIMPE_CAPITOLO = 3;
  private static int PFL_SCELTSUBIMPE_ART = 4;
  private static int PFL_SCELTSUBIMPE_NUMEROIMP = 5;
  private static int PFL_SCELTSUBIMPE_ANNOIMP = 6;
  private static int PFL_SCELTSUBIMPE_NUMERIMPPROV = 7;
  private static int PFL_SCELTSUBIMPE_ANNOIMPPROVE = 8;
  private static int PFL_SCELTSUBIMPE_NUMESUBIPROV = 9;
  private static int PFL_SCELTSUBIMPE_ANNOSUBIPROV = 10;
  private static int PFL_SCELTSUBIMPE_DISPEFFETTIV = 11;
  private static int PFL_SCELTSUBIMPE_ETICHIMPPROV = 12;
  private static int PFL_SCELTSUBIMPE_ETICIMPPROV1 = 13;
  private static int PFL_SCELTSUBIMPE_CIG = 14;
  private static int PFL_SCELTSUBIMPE_CUP = 15;

  private static int PPQRY_ESEIMP = 0;


  IDPanel PAN_SCELTSUBIMPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI95(IMDB);
    //
    //
    Init_PQRY_ESEIMP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI95(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI95, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI95, "TBL_PARAMETRI95");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI95,IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI95,IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI95,IMDBDef1.FLD_PARAMETRI95_ROWNAMPROUNI, "ROWNAMPROUNI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI95,IMDBDef1.FLD_PARAMETRI95_ROWNAMPROUNI,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI95, 0);
  }

  private static void Init_PQRY_ESEIMP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_ESEIMP, 14);
    IMDB.set_TblCode(IMDBDef7.PQRY_ESEIMP, "PQRY_ESEIMP");
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEIDISPEFFE, "ESEIDISPEFFE");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEIDISPEFFE,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESENUMIMPPRO, "ESENUMIMPPRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESENUMIMPPRO,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEANNIMPPRO, "ESEANNIMPPRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEANNIMPPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESENUMSUBPRO, "ESENUMSUBPRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESENUMSUBPRO,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEANNSUBPRO, "ESEANNSUBPRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEANNSUBPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEIMSUBICIG, "ESEIMSUBICIG");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEIMSUBICIG,5,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEIMSUBICUP, "ESEIMSUBICUP");
    IMDB.SetFldParams(IMDBDef7.PQRY_ESEIMP,IMDBDef7.PQSL_ESEIMP_ESEIMSUBICUP,5,15,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_ESEIMP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaSubImpegnoUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaSubImpegnoUO()
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
    FormIdx = MyGlb.FRM_SCELSUBIMPUO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "037C0331-36F5-4AE6-B7BE-50AB5A17D642";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1152;
    DesignHeight = 378;
    set_Caption(new IDVariant("Scelta Sub Impegno UO"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1152;
    Frames[1].Height = 352;
    Frames[1].Caption = "Scelta Sub Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_SCELTSUBIMPE = new IDPanel(w, this, 1, "PAN_SCELTSUBIMPE");
    Frames[1].Content = PAN_SCELTSUBIMPE;
    PAN_SCELTSUBIMPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTSUBIMPE.VS = MainFrm.VisualStyleList;
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1152-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "271BF38C-D1EE-4746-B825-E0313F37CD5C");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1124, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTSUBIMPE.InitStatus = 1;
    PAN_SCELTSUBIMPE_Init();
    PAN_SCELTSUBIMPE_InitFields();
    PAN_SCELTSUBIMPE_InitQueries();
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
      PAN_SCELTSUBIMPE.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaSubImpegnoUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaSubImpegnoUO.class.getName() : (Glb.ClassWithPackage(SceltaSubImpegnoUO.class) ? SceltaSubImpegnoUO.class.getName().substring(SceltaSubImpegnoUO.class.getPackage().getName().length() + 1) : SceltaSubImpegnoUO.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Sub Impegno On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTSUBIMPE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTSUBIMPE);
      // 
      // Scelta Sub Impegno On Dynamic Properties Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSubImpegnoUO", "SceltaSubImpegnoOnDynamicPropertiesEvent", _e);
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
      v_CAPTION = (new IDVariant("Scelta Sub-Impegno", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSubImpegnoUO", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMPROUNI, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSubImpegnoUO", "UnloadEvent", _e);
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
  private void PAN_SCELTSUBIMPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTSUBIMPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTSUBIMPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTSUBIMPE, Cancel);
    // Stub
  }

  private void PAN_SCELTSUBIMPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTSUBIMPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTSUBIMPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTSUBIMPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTSUBIMPE_Init()
  {

    PAN_SCELTSUBIMPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTSUBIMPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTSUBIMPE.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, "B8167A8A-4A0B-4ED7-916B-898FFA1F80E7");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, "Numero");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, "C5F2E719-0CE6-4860-A324-C632C6FF3F0B");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, "Anno");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, "F608AB7D-1BAC-4D5F-8B4C-1F74EB72E1B2");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, "Descrizione");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, "85A5FC11-EB9F-410D-B702-2D7B201CB7C9");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, "Capitolo");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, "Capitolo");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, "C925B1AB-2B00-4958-8101-9B5FAB920FC9");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, "Art.");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, "Articolo");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, "D0F9B315-138A-43D7-B1B3-8A904F308745");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, "Impegno");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, "48DF998E-FB4D-4FDC-BF4B-F8A5EFFEA71B");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, " ");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.VIS_HEADNOBORLEF);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, "128D38E8-DF35-4C39-93E2-2716B1B18DD2");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, "NUMERO IMP PROVENIENZA");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, "AB88749F-C8AA-4262-AD45-1A88E25A833A");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, "ANNO IMP PROVENIENZA");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, "F2024F9A-34FE-4A4D-A5DF-73BF29BDA9BE");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, "NUMERO SUBIMP PROVENIENZA");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, "BB8C90F8-E261-4D87-B7F1-A7181D18397B");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, "ANNO SUBIMP PROVENIENZA");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, "324E9865-CB8F-4BF1-915C-8EB938468BF7");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, "Disp. Effettiva");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, "4E86546C-5948-47A3-9940-B95E11A7455A");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, "Imp. Provenienza");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, "5049689E-03F3-42F5-A2CF-879951E78203");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, "SubImp. Provenienza");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, "55D24EA7-E6E7-4C82-9CCD-5295BFB13639");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, "Cig");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, "6F1253A4-A1BC-498E-B40C-7E6E2A815B39");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, "Cup");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTSUBIMPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_LIST, 92);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_FORM, 4, 220, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_FORM, 92);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_NUMERO, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_NUMERO, PPQRY_ESEIMP, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_LIST, 52, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_LIST, 80);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_FORM, 4, 196, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_FORM, 80);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ANNO, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ANNO, PPQRY_ESEIMP, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_LIST, 92, 36, 248, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 160, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_DESCRIZIONE, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_DESCRIZIONE, PPQRY_ESEIMP, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_LIST, 340, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_FORM, 4, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_CAPITOLO, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_CAPITOLO, PPQRY_ESEIMP, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_LIST, 476, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_LIST, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_FORM, 4, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_FORM, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ART, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ART, PPQRY_ESEIMP, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_LIST, 508, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_LIST, "Impegno");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_FORM, 4, 244, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_FORM, "Impegno");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_NUMEROIMP, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_NUMEROIMP, PPQRY_ESEIMP, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_LIST, 568, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_LIST, " ");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_FORM, 4, 244, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_FORM, " ");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ANNOIMP, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ANNOIMP, PPQRY_ESEIMP, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, MyGlb.PANEL_LIST, 604, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, MyGlb.PANEL_LIST, 160);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, MyGlb.PANEL_LIST, "NUM. I. PRV.");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, MyGlb.PANEL_FORM, 4, 292, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, MyGlb.PANEL_FORM, 160);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERIMPPROV, MyGlb.PANEL_FORM, "NUMERO IMP PROVENIENZA");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_NUMERIMPPROV, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_NUMERIMPPROV, PPQRY_ESEIMP, "C.NUMERO_IMP_PROVENIENZA", "ESENUMIMPPRO", 1, 5, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, MyGlb.PANEL_LIST, 648, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, MyGlb.PANEL_LIST, 144);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, MyGlb.PANEL_LIST, "AN. I. PRV.");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, MyGlb.PANEL_FORM, 4, 316, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, MyGlb.PANEL_FORM, 144);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMPPROVE, MyGlb.PANEL_FORM, "ANNO IMP PROVENIENZA");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ANNOIMPPROVE, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ANNOIMPPROVE, PPQRY_ESEIMP, "C.ANNO_IMP_PROVENIENZA", "ESEANNIMPPRO", 1, 4, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, MyGlb.PANEL_LIST, 684, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, MyGlb.PANEL_LIST, 184);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, MyGlb.PANEL_LIST, "N. SB. PRV.");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, MyGlb.PANEL_FORM, 4, 340, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, MyGlb.PANEL_FORM, 184);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMESUBIPROV, MyGlb.PANEL_FORM, "NUMERO SUBIMP PROVENIENZA");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_NUMESUBIPROV, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_NUMESUBIPROV, PPQRY_ESEIMP, "B.NUMERO_SUBIMP_PROVENIENZA", "ESENUMSUBPRO", 1, 5, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, MyGlb.PANEL_LIST, 728, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, MyGlb.PANEL_LIST, 164);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, MyGlb.PANEL_LIST, "A. S. PRV.");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, MyGlb.PANEL_FORM, 4, 364, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, MyGlb.PANEL_FORM, 164);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOSUBIPROV, MyGlb.PANEL_FORM, "ANNO SUBIMP PROVENIENZA");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ANNOSUBIPROV, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ANNOSUBIPROV, PPQRY_ESEIMP, "B.ANNO_SUBIMP_PROVENIENZA", "ESEANNSUBPRO", 1, 4, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_LIST, 764, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_LIST, 128);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_LIST, "Disp. Effettiva");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_FORM, 4, 268, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_FORM, 128);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_FORM, "Disp. Effettiva");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_DISPEFFETTIV, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldUnbound(PFL_SCELTSUBIMPE_DISPEFFETTIV, true);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_DISPEFFETTIV, PPQRY_ESEIMP, "CF4WEB_GET_IMPORTI_SCHEDA_INFO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'SS',to_number(NULL),to_number(NULL),to_number(NULL),A.CAPITOLO,A.ARTICOLO,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,NULL,NULL,NULL,to_number(NULL),'DISP_EFF')", "ESEIDISPEFFE", 3, 28, 6, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, MyGlb.PANEL_LIST, 604, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, MyGlb.PANEL_LIST, 0);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, MyGlb.PANEL_LIST, 2);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, MyGlb.PANEL_FORM, 616, 240, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, MyGlb.PANEL_FORM, 0);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICHIMPPROV, MyGlb.PANEL_FORM, 2);
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ETICHIMPPROV, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ETICHIMPPROV, -1, "", "ETICHIMPPROV", 0, 0, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, MyGlb.PANEL_LIST, 684, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, MyGlb.PANEL_LIST, 0);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, MyGlb.PANEL_LIST, 2);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, MyGlb.PANEL_FORM, 624, 248, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, MyGlb.PANEL_FORM, 0);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ETICIMPPROV1, MyGlb.PANEL_FORM, 2);
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ETICIMPPROV1, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ETICIMPPROV1, -1, "", "ETICIMPPROV1", 0, 0, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_LIST, 892, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_LIST, 28);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_LIST, "Cig");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_FORM, 4, 388, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_FORM, 28);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_FORM, "Cig");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_CIG, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_CIG, PPQRY_ESEIMP, "B.CIG", "ESEIMSUBICIG", 5, 15, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_LIST, 1008, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_LIST, 32);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_LIST, "Cup");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_FORM, 4, 412, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_FORM, 32);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_FORM, "Cup");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_CUP, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_CUP, PPQRY_ESEIMP, "B.CUP", "ESEIMSUBICUP", 5, 15, 0, -13997);
  }

  private void PAN_SCELTSUBIMPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTSUBIMPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTSUBIMPE.SetIMDB(IMDB, "PQRY_ESEIMP", true);
    PAN_SCELTSUBIMPE.set_SetString(MyGlb.MASTER_ROWNAME, "ESEIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  CF4WEB_GET_IMPORTI_SCHEDA_INFO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'SS',to_number(NULL),to_number(NULL),to_number(NULL),A.CAPITOLO,A.ARTICOLO,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,NULL,NULL,NULL,to_number(NULL),'DISP_EFF') as ESEIDISPEFFE, ");
    SQL.append("  C.NUMERO_IMP_PROVENIENZA as ESENUMIMPPRO, ");
    SQL.append("  C.ANNO_IMP_PROVENIENZA as ESEANNIMPPRO, ");
    SQL.append("  B.NUMERO_SUBIMP_PROVENIENZA as ESENUMSUBPRO, ");
    SQL.append("  B.ANNO_SUBIMP_PROVENIENZA as ESEANNSUBPRO, ");
    SQL.append("  B.CIG as ESEIMSUBICIG, ");
    SQL.append("  B.CUP as ESEIMSUBICUP ");
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_ESEIMP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESESUB A, ");
    SQL.append("  SUBIMP B, ");
    SQL.append("  IMP C ");
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_ESEIMP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI95.ROWNAMEESERC~~) ");
    SQL.append("and   (B.ANNO_SUBIMP = A.ANNO_SUBIMP) ");
    SQL.append("and   (B.NUMERO_SUBIMP = A.NUMERO_SUBIMP) ");
    SQL.append("and   (C.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (C.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (NVL(C.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI95.ROWNAMPROUNI~~, NVL(C.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_ESEIMP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_ESEIMP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_ESEIMP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_ESEIMP, 5, SQL, -1, "");
    PAN_SCELTSUBIMPE.SetQueryDB(PPQRY_ESEIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTSUBIMPE.SetMasterTable(0, "ESESUB");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTSUBIMPE.Status() == 2)
    {
      int oldListQBE = PAN_SCELTSUBIMPE.iUseListQBE;
      PAN_SCELTSUBIMPE.iUseListQBE = 0;
      PAN_SCELTSUBIMPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTSUBIMPE.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTSUBIMPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
