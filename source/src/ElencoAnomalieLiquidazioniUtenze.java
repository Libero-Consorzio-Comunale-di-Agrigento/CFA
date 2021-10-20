// **********************************************
// Elenco Anomalie Liquidazioni Utenze
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoAnomalieLiquidazioniUtenze extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ELENCOANOMAL_LIQUIDAZIONE = 0;
  private static int GRP_ELENCOANOMAL_DOCUMENTO = 1;

  private static int PFL_ELENCOANOMAL_NUMEROLIQ = 0;
  private static int PFL_ELENCOANOMAL_ANNOLIQ = 1;
  private static int PFL_ELENCOANOMAL_INFOLIQ = 2;
  private static int PFL_ELENCOANOMAL_DESCRIZIONE = 3;
  private static int PFL_ELENCOANOMAL_IMPORTO = 4;
  private static int PFL_ELENCOANOMAL_IMPORTOIVA = 5;
  private static int PFL_ELENCOANOMAL_NUMERODOC = 6;
  private static int PFL_ELENCOANOMAL_DDATADOC = 7;
  private static int PFL_ELENCOANOMAL_INFOFAT = 8;
  private static int PFL_ELENCOANOMAL_IVADOCUMENTO = 9;
  private static int PFL_ELENCOANOMAL_FATANNOPROG = 10;
  private static int PFL_ELENCOANOMAL_FATNUMERPROG = 11;

  private static int PPQRY_LIQ55 = 0;

  private static int PPQRY_INFO = 1;


  IDPanel PAN_ELENCOANOMAL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI539(IMDB);
    //
    //
    Init_PQRY_LIQ55(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI539(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI539, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI539, "TBL_PARAMETRI539");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI539,IMDBDef2.FLD_PARAMETRI539_PARAMLIQDA, "PARAMLIQDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI539,IMDBDef2.FLD_PARAMETRI539_PARAMLIQDA,1,9,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI539,IMDBDef2.FLD_PARAMETRI539_PARAMLIQA, "PARAMLIQA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI539,IMDBDef2.FLD_PARAMETRI539_PARAMLIQA,1,9,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI539, 0);
  }

  private static void Init_PQRY_LIQ55(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_LIQ55, 10);
    IMDB.set_TblCode(IMDBDef10.PQRY_LIQ55, "PQRY_LIQ55");
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_RECFATDDATDO, "RECFATDDATDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_RECFATDDATDO,6,0,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_IVADOCUMENTO, "IVADOCUMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_IVADOCUMENTO,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ55,IMDBDef10.PQSL_LIQ55_FAT_NUMERO_PROG,1,5,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_LIQ55, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoAnomalieLiquidazioniUtenze(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoAnomalieLiquidazioniUtenze()
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
    FormIdx = MyGlb.FRM_ELEANOLIQUTE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F5CC284E-F9BE-4E76-AF06-CA36DA62793E";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 972;
    DesignHeight = 350;
    set_Caption(new IDVariant("Elenco Anomalie Liquidazioni Utenze"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 972;
    Frames[1].Height = 324;
    Frames[1].Caption = "Elenco Anomalie";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 324;
    PAN_ELENCOANOMAL = new IDPanel(w, this, 1, "PAN_ELENCOANOMAL");
    Frames[1].Content = PAN_ELENCOANOMAL;
    PAN_ELENCOANOMAL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOANOMAL.VS = MainFrm.VisualStyleList;
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 972-MyGlb.PAN_OFFS_X, 324-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9EAC9F8A-7F12-4F4D-9259-51900D155751");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 908, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOANOMAL.InitStatus = 2;
    PAN_ELENCOANOMAL_Init();
    PAN_ELENCOANOMAL_InitFields();
    PAN_ELENCOANOMAL_InitQueries();
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
      PAN_ELENCOANOMAL.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoAnomalieLiquidazioniUtenze);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoAnomalieLiquidazioniUtenze.class.getName() : (Glb.ClassWithPackage(ElencoAnomalieLiquidazioniUtenze.class) ? ElencoAnomalieLiquidazioniUtenze.class.getName().substring(ElencoAnomalieLiquidazioniUtenze.class.getPackage().getName().length() + 1) : ElencoAnomalieLiquidazioniUtenze.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elenco Anomalie On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOANOMAL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOANOMAL);
      // 
      // Elenco Anomalie On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ELENCOANOMAL.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOANOMAL_DESCRIZIONE,(new IDVariant(PAN_ELENCOANOMAL.FieldText(PFL_ELENCOANOMAL_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAnomalieLiquidazioniUtenze", "ElencoAnomalieOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Info Liq
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoLiq ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Liq Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQ55, IMDBDef10.PQSL_LIQ55_ANNO_LIQ, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQ55, IMDBDef10.PQSL_LIQ55_NUMERO_LIQ, 0))))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef10.PQRY_LIQ55, IMDBDef10.PQSL_LIQ55_ANNO_LIQ, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef10.PQRY_LIQ55, IMDBDef10.PQSL_LIQ55_NUMERO_LIQ, 0));
        MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAnomalieLiquidazioniUtenze", "InfoLiq", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Fat
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoFat ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Fat Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQ55, IMDBDef10.PQSL_LIQ55_FAT_ANNO_PROG, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQ55, IMDBDef10.PQSL_LIQ55_FAT_NUMERO_PROG, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_LIQ55, IMDBDef10.PQSL_LIQ55_FAT_ANNO_PROG, 0));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_LIQ55, IMDBDef10.PQSL_LIQ55_FAT_NUMERO_PROG, 0));
        MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAnomalieLiquidazioniUtenze", "InfoFat", _e);
      return -1;
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
  private void PAN_ELENCOANOMAL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOANOMAL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOANOMAL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOANOMAL, Cancel);
    // Stub
  }

  private void PAN_ELENCOANOMAL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOANOMAL_INFOLIQ)
    {
      this.IdxPanelActived = this.PAN_ELENCOANOMAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoLiq();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOANOMAL_INFOFAT)
    {
      this.IdxPanelActived = this.PAN_ELENCOANOMAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFat();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOANOMAL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOANOMAL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOANOMAL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOANOMAL_Init()
  {

    PAN_ELENCOANOMAL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOANOMAL.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, "6EC95870-66CF-4993-9A20-313B1AFD37F5");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, "Liquidazione");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, -9999, 136, 16, 0, 0);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, MyGlb.PANEL_FORM, 0, -21, 600, 229, 0, 0);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, 0, 70);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, 1, 13);
    PAN_ELENCOANOMAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, 0, 4);
    PAN_ELENCOANOMAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, 1, 4);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_LIQUIDAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, "8263DC47-DFD2-4E4F-AFC3-3FB301089E00");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, "Documento");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, MyGlb.PANEL_LIST, 556, -9999, 352, 16, 0, 0);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, MyGlb.PANEL_FORM, 0, 87, 604, 169, 0, 0);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, 0, 65);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, 1, 13);
    PAN_ELENCOANOMAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, 0, 4);
    PAN_ELENCOANOMAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, 1, 4);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOANOMAL_DOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOANOMAL.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, "2DF72145-E76C-42A2-9135-4B79F19ED04F");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, "Numero");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, "437770DF-6755-4C33-86E8-A76D7975BFA1");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, "Anno");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, "979E0A27-2B15-4048-861E-8C3A4095F769");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, " ");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, "F00AF906-CA84-4CCC-BB7C-CC6DD07523CC");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, "Descrizione");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, "827B66D3-C63C-4749-8AFC-2073DA7FC54D");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, "Importo");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, "8DBBE567-D829-4656-8F5B-24DC425792C7");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, "Importo Iva");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, "D0B84014-B892-42CF-84CB-71DE9917FDCA");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, "Numero");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, "D9FD8BAE-69F7-4AD2-B629-048154435930");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, "Data");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, "6AB76ABE-61D7-471B-A807-48FF8011E79A");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, " ");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, "A760C16F-97CF-48B2-B454-C6774F5419B5");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, "Iva");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, "77E92DC8-6E00-43EF-9CBD-7D0347D345CC");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, "FAT ANNO PROG");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, "373B8720-FBDC-49CA-8CFA-A646880E2E86");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, "FAT NUMERO PROG");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENCOANOMAL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 28, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMEROLIQ, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_NUMEROLIQ, -1, GRP_ELENCOANOMAL_LIQUIDAZIONE);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_NUMEROLIQ, PPQRY_LIQ55, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, MyGlb.PANEL_LIST, 64, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, MyGlb.PANEL_FORM, 4, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANNOLIQ, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_ANNOLIQ, -1, GRP_ELENCOANOMAL_LIQUIDAZIONE);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_ANNOLIQ, PPQRY_LIQ55, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, MyGlb.PANEL_LIST, 112, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, MyGlb.PANEL_FORM, 4, 184, 592, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOLIQ, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_INFOLIQ, -1, GRP_ELENCOANOMAL_LIQUIDAZIONE);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_INFOLIQ, PPQRY_INFO, "DECODE(~~NUMERO_LIQ~~, to_number(NULL), NULL, 'I')", "INFOLIQ", 5, 99, 0, -13997);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOLIQ, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, MyGlb.PANEL_LIST, 136, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_DESCRIZIONE, -1, -1);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_DESCRIZIONE, PPQRY_LIQ55, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, MyGlb.PANEL_LIST, 316, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, MyGlb.PANEL_FORM, 4, 88, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_IMPORTO, -1, -1);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_IMPORTO, PPQRY_LIQ55, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, MyGlb.PANEL_LIST, 436, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo Iva");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 160, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo Iva");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_IMPORTOIVA, -1, -1);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_IMPORTOIVA, PPQRY_LIQ55, "A.IMPORTO_IVA", "IMPORTO_IVA", 3, 14, 2, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, MyGlb.PANEL_LIST, 556, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, MyGlb.PANEL_FORM, 4, 112, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_NUMERODOC, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_NUMERODOC, -1, GRP_ELENCOANOMAL_DOCUMENTO);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_NUMERODOC, PPQRY_LIQ55, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, MyGlb.PANEL_LIST, 692, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, MyGlb.PANEL_LIST, "Data");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, MyGlb.PANEL_FORM, 4, 136, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_DDATADOC, MyGlb.PANEL_FORM, "Data");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_DDATADOC, -1, GRP_ELENCOANOMAL_DOCUMENTO);
    PAN_ELENCOANOMAL.SetFieldUnbound(PFL_ELENCOANOMAL_DDATADOC, true);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_DDATADOC, PPQRY_LIQ55, "B.D_DATA_DOC", "RECFATDDATDO", 6, 0, 0, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, MyGlb.PANEL_LIST, 768, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, MyGlb.PANEL_FORM, 4, 208, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_INFOFAT, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_INFOFAT, -1, GRP_ELENCOANOMAL_DOCUMENTO);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_INFOFAT, PPQRY_INFO, "DECODE(~~NUMERO_DOC~~, NULL, NULL, 'I')", "INFOFAT", 5, 99, 0, -13997);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOANOMAL.SetValueListItem(PFL_ELENCOANOMAL_INFOFAT, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, MyGlb.PANEL_LIST, 788, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, MyGlb.PANEL_LIST, "Iva");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, MyGlb.PANEL_FORM, 4, 232, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IVADOCUMENTO, MyGlb.PANEL_FORM, "Iva");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_IVADOCUMENTO, -1, GRP_ELENCOANOMAL_DOCUMENTO);
    PAN_ELENCOANOMAL.SetFieldUnbound(PFL_ELENCOANOMAL_IVADOCUMENTO, true);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_IVADOCUMENTO, PPQRY_LIQ55, "CALCOLA_IVA_LIQ(A.FAT_ANNO_PROG,A.FAT_NUMERO_PROG,'NO')", "IVADOCUMENTO", 3, 28, 6, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, MyGlb.PANEL_LIST, "FAT ANNO PROG");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, MyGlb.PANEL_FORM, 4, 232, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATANNOPROG, MyGlb.PANEL_FORM, "FAT ANNO PROG");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_FATANNOPROG, -1, -1);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_FATANNOPROG, PPQRY_LIQ55, "A.FAT_ANNO_PROG", "FAT_ANNO_PROG", 1, 4, 0, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, MyGlb.PANEL_LIST, 116);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, MyGlb.PANEL_LIST, "FAT NUMERO PROG");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, MyGlb.PANEL_FORM, 4, 256, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, MyGlb.PANEL_FORM, 116);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_FATNUMERPROG, MyGlb.PANEL_FORM, "FAT NUMERO PROG");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_FATNUMERPROG, -1, -1);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_FATNUMERPROG, PPQRY_LIQ55, "A.FAT_NUMERO_PROG", "FAT_NUMERO_PROG", 1, 5, 0, -13997);
  }

  private void PAN_ELENCOANOMAL_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOANOMAL.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~NUMERO_LIQ~~, to_number(NULL), NULL, 'I') as INFOLIQ, ");
    SQL.append("  DECODE(~~NUMERO_DOC~~, NULL, NULL, 'I') as INFOFAT ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ELENCOANOMAL.SetQuery(PPQRY_INFO, 0, SQL, -1, "");
    PAN_ELENCOANOMAL.SetQueryDB(PPQRY_INFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOANOMAL.SetMasterTable(PPQRY_INFO, "DUAL");
    PAN_ELENCOANOMAL.SetIMDB(IMDB, "PQRY_LIQ55", true);
    PAN_ELENCOANOMAL.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.IMPORTO_IVA as IMPORTO_IVA, ");
    SQL.append("  B.D_DATA_DOC as RECFATDDATDO, ");
    SQL.append("  CALCOLA_IVA_LIQ(A.FAT_ANNO_PROG,A.FAT_NUMERO_PROG,'NO') as IVADOCUMENTO, ");
    SQL.append("  A.FAT_ANNO_PROG as FAT_ANNO_PROG, ");
    SQL.append("  A.FAT_NUMERO_PROG as FAT_NUMERO_PROG ");
    PAN_ELENCOANOMAL.SetQuery(PPQRY_LIQ55, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  FAT B ");
    PAN_ELENCOANOMAL.SetQuery(PPQRY_LIQ55, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_PROG = A.FAT_ANNO_PROG) ");
    SQL.append("and   (B.NUMERO_PROG = A.FAT_NUMERO_PROG) ");
    SQL.append("and   (A.ANNO_LIQ = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.NUMERO_LIQ BETWEEN ~~TBL_PARAMETRI539.PARAMLIQDA~~ AND ~~TBL_PARAMETRI539.PARAMLIQA~~)) ");
    SQL.append("and   ((A.IMPORTO_IVA IS NULL)) ");
    SQL.append("and   (NOT ((B.TRATTAMENTO_IVA IS NULL))) ");
    PAN_ELENCOANOMAL.SetQuery(PPQRY_LIQ55, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOANOMAL.SetQuery(PPQRY_LIQ55, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOANOMAL.SetQuery(PPQRY_LIQ55, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOANOMAL.SetQuery(PPQRY_LIQ55, 5, SQL, -1, "");
    PAN_ELENCOANOMAL.SetQueryDB(PPQRY_LIQ55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOANOMAL.SetMasterTable(0, "LIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOANOMAL.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOANOMAL.iUseListQBE;
      PAN_ELENCOANOMAL.iUseListQBE = 0;
      PAN_ELENCOANOMAL.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOANOMAL.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOANOMAL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
