// **********************************************
// Dettagli Ordinativo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliOrdinativo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DETTAGORDINA_IMPORTO = 0;
  private static int PFL_DETTAGORDINA_DEBITORE = 1;
  private static int PFL_DETTAGORDINA_DOCUMENTO = 2;
  private static int PFL_DETTAGORDINA_QUIETANZA = 3;
  private static int PFL_DETTAGORDINA_NUMEROCONTAB = 4;
  private static int PFL_DETTAGORDINA_DATACONTABIL = 5;
  private static int PFL_DETTAGORDINA_CONTABILE = 6;
  private static int PFL_DETTAGORDINA_INCASSATO = 7;
  private static int PFL_DETTAGORDINA_DESCRIZIONE = 8;
  private static int PFL_DETTAGORDINA_PROGRTESORIE = 9;
  private static int PFL_DETTAGORDINA_TIPOBOLLATO = 10;
  private static int PFL_DETTAGORDINA_NUMEROREG = 11;
  private static int PFL_DETTAGORDINA_ANNOREG = 12;
  private static int PFL_DETTAGORDINA_CORRISPETTIV = 13;
  private static int PFL_DETTAGORDINA_UFFICIO = 14;
  private static int PFL_DETTAGORDINA_DISTINTA = 15;
  private static int PFL_DETTAGORDINA_CGE = 16;
  private static int PFL_DETTAGORDINA_OPERA = 17;
  private static int PFL_DETTAGORDINA_SOMMAIMPORTO = 18;
  private static int PFL_DETTAGORDINA_LABEL = 19;

  private static int PPQRY_PRE6 = 0;


  IDPanel PAN_DETTAGORDINA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM86(IMDB);
    //
    //
    Init_PQRY_PRE6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM86(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM86, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM86, "TBL_PARAM86");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM86,IMDBDef2.FLD_PARAM86_ROWNAMANNORD, "ROWNAMANNORD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM86,IMDBDef2.FLD_PARAM86_ROWNAMANNORD,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM86,IMDBDef2.FLD_PARAM86_ROWNAMNUMORD, "ROWNAMNUMORD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM86,IMDBDef2.FLD_PARAM86_ROWNAMNUMORD,1,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM86, 0);
  }

  private static void Init_PQRY_PRE6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PRE6, 16);
    IMDB.set_TblCode(IMDBDef9.PQRY_PRE6, "PQRY_PRE6");
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PRBERASOESES, "PRBERASOESES");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PRBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_DOCUMENTO, "DOCUMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_DOCUMENTO,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREQUIETANZA, "PREQUIETANZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREQUIETANZA,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREINCASSATO, "PREINCASSATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREINCASSATO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREDESCRIZIO, "PREDESCRIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREPROGRTESO, "PREPROGRTESO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREPROGRTESO,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PRETCOTIPBOL, "PRETCOTIPBOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PRETCOTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PRETCONUMREG, "PRETCONUMREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PRETCONUMREG,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PRETCOANNREG, "PRETCOANNREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PRETCOANNREG,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREUFFICIO, "PREUFFICIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_PREUFFICIO,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_DISTINTA, "DISTINTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_DISTINTA,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_CGE, "CGE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_CGE,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PRE6,IMDBDef9.PQSL_PRE6_OPERA,5,99,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PRE6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliOrdinativo(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliOrdinativo()
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
    FormIdx = MyGlb.FRM_DETTAGORDINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "384695AA-AE9C-4530-964D-7E61E4250FE8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 732;
    DesignHeight = 342;
    set_Caption(new IDVariant("Dettagli Ordinativo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 732;
    Frames[1].Height = 316;
    Frames[1].Caption = "Dettagli Ordinativo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 316;
    PAN_DETTAGORDINA = new IDPanel(w, this, 1, "PAN_DETTAGORDINA");
    Frames[1].Content = PAN_DETTAGORDINA;
    PAN_DETTAGORDINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGORDINA.VS = MainFrm.VisualStyleList;
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 732-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FF728C50-35AD-4460-AC71-6B7F166A4BF1");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 36, 2100, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGORDINA.InitStatus = 2;
    PAN_DETTAGORDINA_Init();
    PAN_DETTAGORDINA_InitFields();
    PAN_DETTAGORDINA_InitQueries();
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
      PAN_DETTAGORDINA.UpdatePanel(MainFrm);
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
    return (obj instanceof DettagliOrdinativo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliOrdinativo.class.getName() : (Glb.ClassWithPackage(DettagliOrdinativo.class) ? DettagliOrdinativo.class.getName().substring(DettagliOrdinativo.class.getPackage().getName().length() + 1) : DettagliOrdinativo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Dettagli Ordinativo After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTAGORDINA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Ordinativo After Find Event Body
      // Procedure Body
      // 
      PAN_DETTAGORDINA.set_FieldText(PFL_DETTAGORDINA_SOMMAIMPORTO, IDL.NullValue(IDL.ToString(PAN_DETTAGORDINA.GetFieldSum(PFL_DETTAGORDINA_IMPORTO)),(new IDVariant("0"))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliOrdinativo", "DettagliOrdinativoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Ordinativo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGORDINA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGORDINA);
      // 
      // Dettagli Ordinativo On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGORDINA_QUIETANZA,IMDB.Value(IMDBDef9.PQRY_PRE6, IMDBDef9.PQSL_PRE6_PREQUIETANZA, 0).stringValue()); 
      PAN_DETTAGORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGORDINA_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_PRE6, IMDBDef9.PQSL_PRE6_PREDESCRIZIO, 0).stringValue()); 
      PAN_DETTAGORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGORDINA_UFFICIO,IMDB.Value(IMDBDef9.PQRY_PRE6, IMDBDef9.PQSL_PRE6_PREUFFICIO, 0).stringValue()); 
      PAN_DETTAGORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGORDINA_CGE,IMDB.Value(IMDBDef9.PQRY_PRE6, IMDBDef9.PQSL_PRE6_CGE, 0).stringValue()); 
      PAN_DETTAGORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGORDINA_OPERA,IMDB.Value(IMDBDef9.PQRY_PRE6, IMDBDef9.PQSL_PRE6_OPERA, 0).stringValue()); 
      PAN_DETTAGORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGORDINA_DEBITORE,IMDB.Value(IMDBDef9.PQRY_PRE6, IMDBDef9.PQSL_PRE6_PRBERASOESES, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliOrdinativo", "DettagliOrdinativoOnDynamicPropertiesEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM86, IMDBDef2.FLD_PARAM86_ROWNAMANNORD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM86, IMDBDef2.FLD_PARAM86_ROWNAMNUMORD, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliOrdinativo", "UnloadEvent", _e);
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
      v_CAPTION = (new IDVariant("Dettagli Estratto Conto", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      PAN_DETTAGORDINA.set_FieldText(PFL_DETTAGORDINA_LABEL, IDL.Add(IDL.Add(IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_FAT_DESCRIZIONE, 0), (new IDVariant(" "))), IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_DOCUMENTO, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliOrdinativo", "LoadEvent", _e);
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
  private void PAN_DETTAGORDINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGORDINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGORDINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGORDINA, Cancel);
    // Stub
  }

  private void PAN_DETTAGORDINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGORDINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGORDINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGORDINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTAGORDINA_Init()
  {

    PAN_DETTAGORDINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGORDINA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGORDINA.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, "82CA18C2-1AD3-429A-AF5D-6EE71BCB7782");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, "Importo");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, "BE13CA26-33D1-44CB-9434-E848729085C6");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, "Debitore");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, "EDD8C7F7-7285-45FB-87C5-DD8D9FD5B2F0");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, "Documento");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, "916CD700-561B-470B-AC92-1904168D40E1");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, "Quietanza");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, "15A64AA1-222F-425F-9039-E4D6EEC8C11A");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, "NUMERO CONTABILE");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, "6FC46444-4D0B-4AB7-A62C-BC521F26A7D7");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, "DATA CONTABILE");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, "E7D1D768-EB72-446A-86B9-03526375C500");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, "Contabile");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, "8245B735-9799-486A-B1E7-C7C4B6000947");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, "Incassato");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, "6D71B718-7486-4956-997B-A16F93209505");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, "Descrizione");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, "477FA2EA-F37A-4258-AB08-2E548BF34C0B");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, "Progr. Tesoriere");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, "9FC28996-F0CB-42E3-96A5-850032444CE9");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, "TIPO BOLLATO");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, "DA3CAF2B-78AD-47DF-BAC9-F047512429AA");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, "NUMERO REG");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, "8E0170FC-3BFF-478B-85EE-7E4845B410E8");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, "ANNO REG");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, "90FF3E6B-A9E5-44EE-8E65-D7FD70C9DAEF");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, "Corrispettivo");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, "5900F922-018F-4EDD-8A31-635EC6E5348E");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, "Ufficio");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, "7469AA88-715F-4A78-9892-2A7EA8A46352");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, "Distinta");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, "9EB06276-4F25-4E49-9434-6221B4D9B422");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, "Cge");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, "767FF567-D5EF-4650-82EF-CC7EECC6F302");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, "Opera");
    PAN_DETTAGORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, "D92F401A-AA44-451A-A256-0100546ACE01");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, "22CA73F3-4005-461B-9258-B0238AF0E2D7");
    PAN_DETTAGORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, "");
    PAN_DETTAGORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, MyGlb.VIS_VUOGRAALILEF);
    PAN_DETTAGORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGORDINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, MyGlb.PANEL_LIST, 0, 72, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, MyGlb.PANEL_FORM, 4, 76, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_IMPORTO, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_IMPORTO, PPQRY_PRE6, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, MyGlb.PANEL_LIST, 88, 72, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, MyGlb.PANEL_FORM, 4, 100, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_DEBITORE, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_DEBITORE, PPQRY_PRE6, "E.RAGIONE_SOCIALE_ESTESA", "PRBERASOESES", 5, 60, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, MyGlb.PANEL_LIST, 296, 72, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, MyGlb.PANEL_LIST, "Documento");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, MyGlb.PANEL_FORM, 4, 124, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DOCUMENTO, MyGlb.PANEL_FORM, "Docum.");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_DOCUMENTO, -1, -1);
    PAN_DETTAGORDINA.SetFieldUnbound(PFL_DETTAGORDINA_DOCUMENTO, true);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_DOCUMENTO, PPQRY_PRE6, "CASE WHEN (A.NUMERO_DOC IS NULL) THEN '' ELSE A.NUMERO_DOC || '/' || TO_CHAR ( A.ANNO_DOC ) END", "DOCUMENTO", 5, 99, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, MyGlb.PANEL_LIST, 492, 72, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, MyGlb.PANEL_FORM, 4, 172, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_QUIETANZA, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_QUIETANZA, PPQRY_PRE6, "F.DESCRIZIONE", "PREQUIETANZA", 5, 40, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, 680, 72, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, 112);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, "NUMERO CONTABILE");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, 4, 196, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, 112);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, "NUM. CONTABILE");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_NUMEROCONTAB, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_NUMEROCONTAB, PPQRY_PRE6, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, MyGlb.PANEL_LIST, 752, 72, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, MyGlb.PANEL_LIST, 96);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, MyGlb.PANEL_LIST, "DT. CONT.");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, MyGlb.PANEL_FORM, 4, 220, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, MyGlb.PANEL_FORM, 96);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DATACONTABIL, MyGlb.PANEL_FORM, "DT. CONTABILE");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_DATACONTABIL, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_DATACONTABIL, PPQRY_PRE6, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 19, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, MyGlb.PANEL_LIST, 680, 36, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, MyGlb.PANEL_FORM, 680, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CONTABILE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_CONTABILE, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_CONTABILE, -1, "", "CONTABILE", 0, 0, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, MyGlb.PANEL_LIST, 804, 72, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, MyGlb.PANEL_LIST, "Incassato");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, MyGlb.PANEL_FORM, 4, 244, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_INCASSATO, MyGlb.PANEL_FORM, "Incassato");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_INCASSATO, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_INCASSATO, PPQRY_PRE6, "A.IMPORTO_INC", "PREINCASSATO", 3, 14, 2, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 884, 72, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 268, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_DESCRIZIONE, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_DESCRIZIONE, PPQRY_PRE6, "A.DESCRIZIONE", "PREDESCRIZIO", 5, 140, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, MyGlb.PANEL_LIST, 1072, 72, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, MyGlb.PANEL_LIST, 108);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, MyGlb.PANEL_LIST, "Progr. Tesoriere");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, MyGlb.PANEL_FORM, 4, 304, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, MyGlb.PANEL_FORM, 108);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_PROGRTESORIE, MyGlb.PANEL_FORM, "Progr. Tesoriere");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_PROGRTESORIE, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_PROGRTESORIE, PPQRY_PRE6, "A.PROGRESSIVO_TESO", "PREPROGRTESO", 1, 5, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1160, 72, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, "TP. BLL.");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 328, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, "TP. BOLLATO");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_TIPOBOLLATO, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_TIPOBOLLATO, PPQRY_PRE6, "D.TIPO_BOLLATO", "PRETCOTIPBOL", 1, 2, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, MyGlb.PANEL_LIST, 1188, 72, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, MyGlb.PANEL_LIST, "NUM. REG");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, MyGlb.PANEL_FORM, 4, 352, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_NUMEROREG, MyGlb.PANEL_FORM, "NUM. REG");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_NUMEROREG, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_NUMEROREG, PPQRY_PRE6, "D.NUMERO_REG", "PRETCONUMREG", 1, 5, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, MyGlb.PANEL_LIST, 1232, 72, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, MyGlb.PANEL_LIST, "ANNO REG");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, MyGlb.PANEL_FORM, 4, 376, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_ANNOREG, MyGlb.PANEL_FORM, "ANN. REG");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_ANNOREG, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_ANNOREG, PPQRY_PRE6, "D.ANNO_REG", "PRETCOANNREG", 1, 4, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, MyGlb.PANEL_LIST, 1160, 36, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, MyGlb.PANEL_FORM, 688, 8, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CORRISPETTIV, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_CORRISPETTIV, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_CORRISPETTIV, -1, "", "CORRISPETTIV", 0, 0, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, MyGlb.PANEL_LIST, 1268, 72, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, MyGlb.PANEL_FORM, 4, 400, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, MyGlb.PANEL_FORM, 40);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_UFFICIO, MyGlb.PANEL_FORM, "Uff.");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_UFFICIO, -1, -1);
    PAN_DETTAGORDINA.SetFieldUnbound(PFL_DETTAGORDINA_UFFICIO, true);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_UFFICIO, PPQRY_PRE6, "CASE WHEN (A.UFFICIO IS NULL) THEN '' ELSE TO_CHAR ( C.CODICE ) || ' - ' || C.DESCRIZIONE END", "PREUFFICIO", 5, 99, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, MyGlb.PANEL_LIST, 1460, 72, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, MyGlb.PANEL_LIST, 44);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, MyGlb.PANEL_LIST, "Distinta");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, MyGlb.PANEL_FORM, 4, 448, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, MyGlb.PANEL_FORM, 44);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_DISTINTA, MyGlb.PANEL_FORM, "Dist.");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_DISTINTA, -1, -1);
    PAN_DETTAGORDINA.SetFieldUnbound(PFL_DETTAGORDINA_DISTINTA, true);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_DISTINTA, PPQRY_PRE6, "CASE WHEN (A.ANNO_DISTINTA IS NULL) THEN '' ELSE A.TIPO_DISTINTA || '-' || TO_CHAR ( A.NUMERO_DISTINTA ) || '/' || TO_CHAR ( A.ANNO_DISTINTA ) END", "DISTINTA", 5, 99, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, MyGlb.PANEL_LIST, 1672, 72, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, MyGlb.PANEL_LIST, 28);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, MyGlb.PANEL_LIST, "Cge");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, MyGlb.PANEL_FORM, 4, 496, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, MyGlb.PANEL_FORM, 28);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_CGE, MyGlb.PANEL_FORM, "Cge");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_CGE, -1, -1);
    PAN_DETTAGORDINA.SetFieldUnbound(PFL_DETTAGORDINA_CGE, true);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_CGE, PPQRY_PRE6, "CASE WHEN (A.CODICE_GESTIONALE IS NULL) THEN '' ELSE TO_CHAR ( A.CODICE_GESTIONALE ) || ' - ' || H.DESCRIZIONE END", "CGE", 5, 99, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, MyGlb.PANEL_LIST, 1884, 72, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, MyGlb.PANEL_LIST, 40);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, MyGlb.PANEL_FORM, 4, 544, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, MyGlb.PANEL_FORM, 40);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_OPERA, -1, -1);
    PAN_DETTAGORDINA.SetFieldUnbound(PFL_DETTAGORDINA_OPERA, true);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_OPERA, PPQRY_PRE6, "CASE WHEN (A.OPERA IS NULL) THEN '' ELSE TO_CHAR ( A.OPERA ) || ' - ' || G.DESCRIZIONE END", "OPERA", 5, 99, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, MyGlb.PANEL_LIST, 0, 144, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, MyGlb.PANEL_FORM, 0, 244, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_SOMMAIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_SOMMAIMPORTO, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_SOMMAIMPORTO, -1, "", "SOMMAIMPORTO", 0, 0, 0, -13997);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, MyGlb.PANEL_LIST, 0, 4, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, MyGlb.PANEL_FORM, 0, 0, 360, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINA_LABEL, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINA.SetFieldPage(PFL_DETTAGORDINA_LABEL, -1, -1);
    PAN_DETTAGORDINA.SetFieldPanel(PFL_DETTAGORDINA_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGORDINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGORDINA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGORDINA.SetIMDB(IMDB, "PQRY_PRE6", true);
    PAN_DETTAGORDINA.set_SetString(MyGlb.MASTER_ROWNAME, "PRE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  E.RAGIONE_SOCIALE_ESTESA as PRBERASOESES, ");
    SQL.append("  CASE WHEN (A.NUMERO_DOC IS NULL) THEN '' ELSE A.NUMERO_DOC || '/' || TO_CHAR ( A.ANNO_DOC ) END as DOCUMENTO, ");
    SQL.append("  F.DESCRIZIONE as PREQUIETANZA, ");
    SQL.append("  A.NUMERO_CONTABILE as NUMERO_CONTABILE, ");
    SQL.append("  A.DATA_CONTABILE as DATA_CONTABILE, ");
    SQL.append("  A.IMPORTO_INC as PREINCASSATO, ");
    SQL.append("  A.DESCRIZIONE as PREDESCRIZIO, ");
    SQL.append("  A.PROGRESSIVO_TESO as PREPROGRTESO, ");
    SQL.append("  D.TIPO_BOLLATO as PRETCOTIPBOL, ");
    SQL.append("  D.NUMERO_REG as PRETCONUMREG, ");
    SQL.append("  D.ANNO_REG as PRETCOANNREG, ");
    SQL.append("  CASE WHEN (A.UFFICIO IS NULL) THEN '' ELSE TO_CHAR ( C.CODICE ) || ' - ' || C.DESCRIZIONE END as PREUFFICIO, ");
    SQL.append("  CASE WHEN (A.ANNO_DISTINTA IS NULL) THEN '' ELSE A.TIPO_DISTINTA || '-' || TO_CHAR ( A.NUMERO_DISTINTA ) || '/' || TO_CHAR ( A.ANNO_DISTINTA ) END as DISTINTA, ");
    SQL.append("  CASE WHEN (A.CODICE_GESTIONALE IS NULL) THEN '' ELSE TO_CHAR ( A.CODICE_GESTIONALE ) || ' - ' || H.DESCRIZIONE END as CGE, ");
    SQL.append("  CASE WHEN (A.OPERA IS NULL) THEN '' ELSE TO_CHAR ( A.OPERA ) || ' - ' || G.DESCRIZIONE END as OPERA ");
    PAN_DETTAGORDINA.SetQuery(PPQRY_PRE6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  QTN B, ");
    SQL.append("  T53 C, ");
    SQL.append("  TCO D, ");
    SQL.append("  BEN E, ");
    SQL.append("  T02 F, ");
    SQL.append("  OPERE G, ");
    SQL.append("  CODICI_GESTIONALI H ");
    PAN_DETTAGORDINA.SetQuery(PPQRY_PRE6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD = ~~TBL_PARAM86.ROWNAMANNORD~~) ");
    SQL.append("and   (A.NUMERO_ORD = ~~TBL_PARAM86.ROWNAMNUMORD~~) ");
    SQL.append("and   (A.DEBITORE = E.CODICE(+)) ");
    SQL.append("and   (A.OPERA = G.CODICE(+)) ");
    SQL.append("and   (A.CODICE_GESTIONALE = H.CODICE(+)) ");
    SQL.append("and   (A.UFFICIO = C.CODICE(+)) ");
    SQL.append("and   (A.DEBITORE = B.CODICE(+)) ");
    SQL.append("and   (A.NUM_QUIETANZA = B.NUM_QUIETANZA(+)) ");
    SQL.append("and   (B.TIPO_QUIETANZA = F.CODICE(+)) ");
    SQL.append("and   (NVL(H.E_S, 'E') = 'E') ");
    SQL.append("and   (A.ANNO_PRE = D.ANNO_PRE(+)) ");
    SQL.append("and   (A.NUMERO_PRE = D.NUMERO_PRE(+)) ");
    PAN_DETTAGORDINA.SetQuery(PPQRY_PRE6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGORDINA.SetQuery(PPQRY_PRE6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGORDINA.SetQuery(PPQRY_PRE6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGORDINA.SetQuery(PPQRY_PRE6, 5, SQL, -1, "");
    PAN_DETTAGORDINA.SetQueryDB(PPQRY_PRE6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGORDINA.SetMasterTable(0, "PRE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGORDINA.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGORDINA.iUseListQBE;
      PAN_DETTAGORDINA.iUseListQBE = 0;
      PAN_DETTAGORDINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGORDINA.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGORDINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTAGORDINA) PAN_DETTAGORDINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGORDINA) PAN_DETTAGORDINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGORDINA) PAN_DETTAGORDINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGORDINA) PAN_DETTAGORDINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTAGORDINA) PAN_DETTAGORDINA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DETTAGORDINA) PAN_DETTAGORDINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
