// **********************************************
// Info Pagamenti Mandati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoPagamentiMandati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PAGAMENTI_PROGRTESORIE = 0;
  private static int PFL_PAGAMENTI_BENEFICIARIO = 1;
  private static int PFL_PAGAMENTI_IMPORTO = 2;
  private static int PFL_PAGAMENTI_DATA = 3;
  private static int PFL_PAGAMENTI_NUMERO = 4;
  private static int PFL_PAGAMENTI_QUIETANZA = 5;
  private static int PFL_PAGAMENTI_DATAPAGAMU = 6;
  private static int PFL_PAGAMENTI_PROGRESSIVO = 7;
  private static int PFL_PAGAMENTI_FATNUMERODOC = 8;
  private static int PFL_PAGAMENTI_FATDDATADOC = 9;
  private static int PFL_PAGAMENTI_ANNOMAND = 10;
  private static int PFL_PAGAMENTI_NUMEROMAND = 11;
  private static int PFL_PAGAMENTI_ANNOLIQ = 12;
  private static int PFL_PAGAMENTI_NUMEROLIQ = 13;
  private static int PFL_PAGAMENTI_ESTREMILABEL = 14;
  private static int PFL_PAGAMENTI_IMPORTOLABEL = 15;
  private static int PFL_PAGAMENTI_DOCUMENTO = 16;
  private static int PFL_PAGAMENTI_SOMMPAGALABE = 17;
  private static int PFL_PAGAMENTI_UTENTULTIAGG = 18;
  private static int PFL_PAGAMENTI_DATAULTIMAGG = 19;
  private static int PFL_PAGAMENTI_DOCUMENLABEL = 20;
  private static int PFL_PAGAMENTI_LIQ = 21;

  private static int PPQRY_PAGAMENTI = 0;

  private static int PPQRY_PAGAMENTI2 = 1;
  private static int PPQRY_LIQ = 2;


  IDPanel PAN_PAGAMENTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM53(IMDB);
    //
    //
    Init_PQRY_PAGAMENTI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM53(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAM53, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAM53, "TBL_PARAM53");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM53,IMDBDef5.FLD_PARAM53_ROWNAMANNMAN, "ROWNAMANNMAN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM53,IMDBDef5.FLD_PARAM53_ROWNAMANNMAN,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM53,IMDBDef5.FLD_PARAM53_ROWNAMNUMMAN, "ROWNAMNUMMAN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM53,IMDBDef5.FLD_PARAM53_ROWNAMNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM53,IMDBDef5.FLD_PARAM53_ROWNAMDATMAN, "ROWNAMDATMAN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM53,IMDBDef5.FLD_PARAM53_ROWNAMDATMAN,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM53,IMDBDef5.FLD_PARAM53_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM53,IMDBDef5.FLD_PARAM53_IMPORTO,3,14,2);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAM53, 0);
  }

  private static void Init_PQRY_PAGAMENTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PAGAMENTI, 13);
    IMDB.set_TblCode(IMDBDef14.PQRY_PAGAMENTI, "PQRY_PAGAMENTI");
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_DATA_PAGAM, "DATA_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_DATA_PAGAM,1,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_NUMERO_PAGAM, "NUMERO_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_NUMERO_PAGAM,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_D_DATA_PAGAM, "D_DATA_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_D_DATA_PAGAM,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI,IMDBDef14.PQSL_PAGAMENTI_DATA_ULTIMO_AGG,6,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PAGAMENTI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoPagamentiMandati(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoPagamentiMandati()
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
    FormIdx = MyGlb.FRM_INFOPAGAMAND;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1BBC5B1E-6370-4881-BC0B-4E2E56873982";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 820;
    DesignHeight = 466;
    set_Caption(new IDVariant("Info Pagamenti Mandati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 820;
    Frames[1].Height = 440;
    Frames[1].Caption = "Pagamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 440;
    PAN_PAGAMENTI = new IDPanel(w, this, 1, "PAN_PAGAMENTI");
    Frames[1].Content = PAN_PAGAMENTI;
    PAN_PAGAMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAGAMENTI.VS = MainFrm.VisualStyleList;
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 820-MyGlb.PAN_OFFS_X, 440-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "035A6057-340D-4F3B-B80A-93752C2A4D86");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 4, 44, 944, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAGAMENTI.InitStatus = 2;
    PAN_PAGAMENTI_Init();
    PAN_PAGAMENTI_InitFields();
    PAN_PAGAMENTI_InitQueries();
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
      PAN_PAGAMENTI.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoPagamentiMandati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoPagamentiMandati.class.getName() : (Glb.ClassWithPackage(InfoPagamentiMandati.class) ? InfoPagamentiMandati.class.getName().substring(InfoPagamentiMandati.class.getPackage().getName().length() + 1) : InfoPagamentiMandati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Pagamenti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PAGAMENTI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pagamenti After Find Event Body
      // Procedure Body
      // 
      PAN_PAGAMENTI.set_FieldText(PFL_PAGAMENTI_SOMMPAGALABE, IDL.ToString(PAN_PAGAMENTI.GetFieldSum(PFL_PAGAMENTI_IMPORTO)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoPagamentiMandati", "PagamentiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Pagamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAGAMENTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PAGAMENTI);
      // 
      // Pagamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PAGAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PAGAMENTI_BENEFICIARIO,(new IDVariant(PAN_PAGAMENTI.FieldText(PFL_PAGAMENTI_BENEFICIARIO))).stringValue()); 
      PAN_PAGAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PAGAMENTI_QUIETANZA,(new IDVariant(PAN_PAGAMENTI.FieldText(PFL_PAGAMENTI_QUIETANZA))).stringValue()); 
      PAN_PAGAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PAGAMENTI_DOCUMENTO,(new IDVariant(PAN_PAGAMENTI.FieldText(PFL_PAGAMENTI_DOCUMENTO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoPagamentiMandati", "PagamentiOnDynamicPropertiesEvent", _e);
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
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LAB = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSG = (new IDVariant("Mandato ", IDVariant.STRING));
      v_NOMECAPTION = (new IDVariant("Pagamenti", IDVariant.STRING));
      v_LAB = (new IDVariant("Importo: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      Frames[PAN_PAGAMENTI.FrIndex].set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO).stringValue());
      v_MSG = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_ROWNAMNUMMAN, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_ROWNAMANNMAN, 0))), (new IDVariant(" "))), (new IDVariant("del"))), (new IDVariant(" "))), MainFrm.Datetostring(IMDB.Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_ROWNAMDATMAN, 0)));
      PAN_PAGAMENTI.set_FieldText(PFL_PAGAMENTI_ESTREMILABEL, new IDVariant(v_MSG).stringValue());
      PAN_PAGAMENTI.set_FieldText(PFL_PAGAMENTI_IMPORTOLABEL, IDL.Add(v_LAB, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_IMPORTO, 0))).stringValue());
      Settaimporto();
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_PAGAMENTI.ConfirmDelete = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoPagamentiMandati", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_ROWNAMANNMAN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_ROWNAMNUMMAN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_ROWNAMDATMAN, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoPagamentiMandati", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Settaimporto
  // **********************************************************************
  public int Settaimporto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_IMPORTO = (new IDVariant("Importo: ", IDVariant.STRING));
      // 
      // Settaimporto Body
      // Procedure Body
      // 
      PAN_PAGAMENTI.set_FieldText(PFL_PAGAMENTI_IMPORTOLABEL, IDL.Add(v_IMPORTO, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_IMPORTO, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoPagamentiMandati", "Settaimporto", _e);
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
  private void PAN_PAGAMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAGAMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAGAMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAGAMENTI, Cancel);
    // Stub
  }

  private void PAN_PAGAMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PAGAMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PAGAMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAGAMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAGAMENTI_Init()
  {

    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_FIELD, 22);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, "413A1F28-F523-4EE5-A7BF-AE550ACF1AB1");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, "Progr. Tesoriere");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, "00C2B111-0B5E-4AE4-9D5B-128E8AB4B055");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, "Beneficiario");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, "des_beneficiario");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, "DC8677E8-7652-4350-B96D-31D1FD8A1EE2");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, "Importo");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, "importo");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "2736291D-9ADA-43BC-8267-BBAC6632C79A");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "Data");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "d_data_pagam");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, "7648113C-4601-45C3-851E-43A132418D8F");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, "Numero");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, "7B95573D-7B43-43C0-90BD-D84B1180FC1D");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, "Quietanza");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, "3FCB4854-D480-47E2-8B46-F3811C6343C6");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, "DATA PAGAMù");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, "B978AC1D-B4BD-42A8-8E63-9470922A66A1");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, "PROGRESSIVO");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, "14E6828F-CFAE-44FC-97BB-EA645F59157D");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, "FAT NUMERO DOC");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, "22CF29B1-1431-4CB8-9AB7-D268FBA8653D");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, "FAT D DATA DOC");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "9BEAECA6-240B-4573-A683-BBD02353EFB4");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "ANNO MAND");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.VIS_NONNULLAFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "9AC31E9E-D05B-4A5B-B8D7-BF2BE823E761");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "NUMERO MAND");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.VIS_NONNULLAFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, "3AFDE109-4E9A-4750-861D-A0DC9048D5A4");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, "ANNO LIQ");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, "58F5D349-A5D7-48AA-8C27-48A3C878EE66");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, "NUMERO LIQ");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, "B4639B81-E1F8-414B-A7B7-D7C779D4D715");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, "0FCB4E27-A8B0-432C-8804-2AFF884C64BB");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, "Importo:");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.VIS_ETICGRASIMPO);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, "07C5A33F-F059-46C5-9157-935138135A93");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, "Documento");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, "5E71E570-3D15-4E87-8259-FDFBC959470A");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.VIS_CAMPTOTADISA);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, "ECC9749E-6D0F-4422-AD51-85B658644B9F");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, "F7101CD0-6DE4-4DAB-A3E5-7EF06245CFAB");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, "26F37901-52A5-4EDC-B6F8-1404201594CC");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, "Documento");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, "30A7874C-E547-4749-94C9-1135F00B88EA");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, "Liquidazione");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, MyGlb.VIS_LABEVISUSTYL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_PAGAMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, MyGlb.PANEL_LIST, 4, 80, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, MyGlb.PANEL_LIST, 128);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, MyGlb.PANEL_LIST, "Progr. Tesoriere");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, MyGlb.PANEL_FORM, 4, 316, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, MyGlb.PANEL_FORM, 128);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRTESORIE, MyGlb.PANEL_FORM, "Progr. Tesoriere");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_PROGRTESORIE, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_PROGRTESORIE, PPQRY_LIQ, "A.PROGRESSIVO_TESO", "LIQPROGRTESO", 1, 5, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, 92, 80, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, 124);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 244, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, 124);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_BENEFICIARIO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_BENEFICIARIO, PPQRY_PAGAMENTI2, "B.RAGIONE_SOCIALE_ESTESA", "LIBERASOESES", 5, 60, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_LIST, 280, 80, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_FORM, 4, 4, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_IMPORTO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_IMPORTO, PPQRY_PAGAMENTI, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 360, 80, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 4, 196, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATA, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATA, PPQRY_PAGAMENTI, "A.D_DATA_PAGAM", "D_DATA_PAGAM", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, 436, 80, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMERO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMERO, PPQRY_PAGAMENTI, "A.NUMERO_PAGAM", "NUMERO_PAGAM", 5, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, 492, 80, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, 4, 268, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_QUIETANZA, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_QUIETANZA, PPQRY_PAGAMENTI2, "D.DESCRIZIONE", "LIQT02DESCRI", 5, 40, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_LIST, 702, 108, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_LIST, 76);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_LIST, "DATA PAGAMù");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_FORM, 4, 28, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_FORM, 76);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_FORM, "DT. PAGAMù");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATAPAGAMU, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATAPAGAMU, PPQRY_PAGAMENTI, "A.DATA_PAGAM", "DATA_PAGAM", 1, 7, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 776, 108, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_PROGRESSIVO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_PROGRESSIVO, PPQRY_PAGAMENTI, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, 700, 80, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, "FAT NUMERO DOC");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, 4, 292, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, "FAT NUM. DOC");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_FATNUMERODOC, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_FATNUMERODOC, PPQRY_PAGAMENTI2, "E.NUMERO_DOC", "LIQFATNUMDOC", 5, 20, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, 788, 80, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, "FAT D DATA DOC");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, "FAT D DT. DOC");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_FATDDATADOC, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_FATDDATADOC, PPQRY_PAGAMENTI2, "E.D_DATA_DOC", "LIQDDATADOC", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 1068, 108, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 4, 100, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ANNOMAND, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ANNOMAND, PPQRY_PAGAMENTI, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 1140, 108, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, "NUMERO MAND");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 124, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMEROMAND, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMEROMAND, PPQRY_PAGAMENTI, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, 852, 80, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ANNOLIQ, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ANNOLIQ, PPQRY_PAGAMENTI, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, 888, 80, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, "NUMERO LIQ");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 172, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMEROLIQ, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMEROLIQ, PPQRY_PAGAMENTI, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_LIST, 8, 12, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_FORM, 8, 8, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ESTREMILABEL, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ESTREMILABEL, -1, "", "ESTREMILABEL", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_LIST, 656, 12, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_FORM, 256, 8, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_IMPORTOLABEL, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_IMPORTOLABEL, -1, "", "IMPORTOLABEL", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_LIST, 612, 104, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_LIST, 140);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_LIST, "Documento");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_FORM, 4, 316, 572, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_FORM, 140);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_FORM, "Documento");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DOCUMENTO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DOCUMENTO, PPQRY_PAGAMENTI2, "CASE WHEN (E.NUMERO_DOC IS NULL) THEN NULL ELSE E.NUMERO_DOC || ' ' || 'del' || ' ' || TO_CHAR ( E.D_DATA_DOC ) END", "LIQDOCUMEXPR", 5, 99, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_LIST, 280, 292, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_FORM, 196, 324, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_SOMMPAGALABE, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_SOMMPAGALABE, -1, "", "SOMMPAGALABE", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 780, 104, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 364, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_UTENTULTIAGG, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_UTENTULTIAGG, PPQRY_PAGAMENTI, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 780, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 388, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATAULTIMAGG, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATAULTIMAGG, PPQRY_PAGAMENTI, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_LIST, 700, 44, 152, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_FORM, 612, 68, 156, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_FORM, 2);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DOCUMENLABEL, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, MyGlb.PANEL_LIST, 852, 44, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, MyGlb.PANEL_LIST, 2);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, MyGlb.PANEL_FORM, 620, 76, 156, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LIQ, MyGlb.PANEL_FORM, 2);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_LIQ, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_LIQ, -1, "", "LIQ", 0, 0, 0, -13997);
  }

  private void PAN_PAGAMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  E.D_DATA_DOC as LIQDDATADOC, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as LIBERASOESES, ");
    SQL.append("  D.DESCRIZIONE as LIQT02DESCRI, ");
    SQL.append("  E.NUMERO_DOC as LIQFATNUMDOC, ");
    SQL.append("  CASE WHEN (E.NUMERO_DOC IS NULL) THEN NULL ELSE E.NUMERO_DOC || ' ' || 'del' || ' ' || TO_CHAR ( E.D_DATA_DOC ) END as LIQDOCUMEXPR ");
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  QTN C, ");
    SQL.append("  T02 D, ");
    SQL.append("  FAT E, ");
    SQL.append("  BEN F ");
    SQL.append("where (~~ANNO_LIQ~~ = A.ANNO_LIQ) ");
    SQL.append("and   (~~NUMERO_LIQ~~ = A.NUMERO_LIQ) ");
    SQL.append("and   (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (C.NUM_QUIETANZA(+) = A.NUM_QUIETANZA) ");
    SQL.append("and   (A.BENEFICIARIO = C.CODICE(+)) ");
    SQL.append("and   (C.TIPO_QUIETANZA = D.CODICE(+)) ");
    SQL.append("and   (A.FAT_ANNO_PROG = E.ANNO_PROG(+) AND A.FAT_NUMERO_PROG = E.NUMERO_PROG(+)) ");
    SQL.append("and   (A.DIVERSO_BEN = F.CODICE(+)) ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI2, 0, SQL, -1, "");
    PAN_PAGAMENTI.SetQueryDB(PPQRY_PAGAMENTI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAGAMENTI.SetMasterTable(PPQRY_PAGAMENTI2, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO_TESO as LIQPROGRTESO ");
    SQL.append("from ");
    SQL.append("  LIQ A ");
    SQL.append("where (A.ANNO_LIQ = ~~ANNO_LIQ~~) ");
    SQL.append("and   (A.NUMERO_LIQ = ~~NUMERO_LIQ~~) ");
    PAN_PAGAMENTI.SetQuery(PPQRY_LIQ, 0, SQL, -1, "");
    PAN_PAGAMENTI.SetQueryDB(PPQRY_LIQ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAGAMENTI.SetMasterTable(PPQRY_LIQ, "LIQ");
    PAN_PAGAMENTI.SetIMDB(IMDB, "PQRY_PAGAMENTI", true);
    PAN_PAGAMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "PAGAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.DATA_PAGAM as DATA_PAGAM, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.NUMERO_PAGAM as NUMERO_PAGAM, ");
    SQL.append("  A.D_DATA_PAGAM as D_DATA_PAGAM, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PAGAMENTI A ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_PARAM53.ROWNAMANNMAN~~ AND A.NUMERO_MAND = ~~TBL_PARAM53.ROWNAMNUMMAN~~) ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ, ");
    SQL.append("  A.D_DATA_PAGAM ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI, 5, SQL, -1, "");
    PAN_PAGAMENTI.SetQueryDB(PPQRY_PAGAMENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAGAMENTI.SetMasterTable(0, "PAGAMENTI");
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_ANNOLIQ, true);
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_NUMEROLIQ, true);
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_DATA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAGAMENTI.Status() == 2)
    {
      int oldListQBE = PAN_PAGAMENTI.iUseListQBE;
      PAN_PAGAMENTI.iUseListQBE = 0;
      PAN_PAGAMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAGAMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_PAGAMENTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
