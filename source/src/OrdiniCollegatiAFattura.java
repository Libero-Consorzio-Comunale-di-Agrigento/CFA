// **********************************************
// Ordini Collegati A Fattura
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdiniCollegatiAFattura extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ORDINI_NUMEROBUONO = 0;
  private static int PFL_ORDINI_ANNOBUONO = 1;
  private static int PFL_ORDINI_PROGRESBUONO = 2;
  private static int PFL_ORDINI_INFOORDINE = 3;
  private static int PFL_ORDINI_DESCRIZIONE = 4;
  private static int PFL_ORDINI_LIQUIDABILE = 5;
  private static int PFL_ORDINI_ORDINE = 6;
  private static int PFL_ORDINI_ESTREMFATTUR = 7;
  private static int PFL_ORDINI_CHIUSO = 8;
  private static int PFL_ORDINI_IMPOFATTLABE = 9;
  private static int PFL_ORDINI_TOTLIQUILABE = 10;
  private static int PFL_ORDINI_TOTLIQUIDABI = 11;
  private static int PFL_ORDINI_DIFFERELABEL = 12;
  private static int PFL_ORDINI_DIFFERENZA = 13;
  private static int PFL_ORDINI_IMPORTFATTUR = 14;
  private static int PFL_ORDINI_TOTALIQULABE = 15;
  private static int PFL_ORDINI_TOTALELIQUID = 16;

  private static int PPQRY_DETTBUONIMDB = 0;


  IDPanel PAN_ORDINI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI414(IMDB);
    //
    //
    Init_PQRY_DETTBUONIMDB(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI414(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI414, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI414, "TBL_PARAMETRI414");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_D_DATA_DOC,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_PARAIMPOFATT, "PARAIMPOFATT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_PARAIMPOFATT,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_PARAIMPUFATT, "PARAIMPUFATT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI414,IMDBDef2.FLD_PARAMETRI414_PARAIMPUFATT,3,14,2);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI414, 0);
  }

  private static void Init_PQRY_DETTBUONIMDB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_DETTBUONIMDB, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_DETTBUONIMDB, "PQRY_DETTBUONIMDB");
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_NUMERO_BUONO, "NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_NUMERO_BUONO,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_ANNO_BUONO, "ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_PROGRESSIVO_BUONO, "PROGRESSIVO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_PROGRESSIVO_BUONO,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_DETBUOIMINOR, "DETBUOIMINOR");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_DETBUOIMINOR,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_DETBUOIMDLIQ, "DETBUOIMDLIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_DETBUOIMDLIQ,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_CHIUSO, "CHIUSO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_CHIUSO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTBUONIMDB,IMDBDef10.PQSL_DETTBUONIMDB_DESCRIZIONE,5,2000,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_DETTBUONIMDB, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdiniCollegatiAFattura(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdiniCollegatiAFattura()
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
    FormIdx = MyGlb.FRM_ORDICOLLAFAT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8510E4DF-01D5-4FA1-8E39-ECEE67C8EDC9";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 752;
    DesignHeight = 458;
    set_Caption(new IDVariant("Ordini Collegati A Fattura"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 752;
    Frames[1].Height = 432;
    Frames[1].Caption = "Ordini";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 432;
    PAN_ORDINI = new IDPanel(w, this, 1, "PAN_ORDINI");
    Frames[1].Content = PAN_ORDINI;
    PAN_ORDINI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINI.VS = MainFrm.VisualStyleList;
    PAN_ORDINI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 752-MyGlb.PAN_OFFS_X, 432-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A2F32F65-A1B6-425B-8ACF-A2EED61FD1F2");
    PAN_ORDINI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 40, 648, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINI.InitStatus = 2;
    PAN_ORDINI_Init();
    PAN_ORDINI_InitFields();
    PAN_ORDINI_InitQueries();
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
      PAN_ORDINI.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdiniCollegatiAFattura);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdiniCollegatiAFattura.class.getName() : (Glb.ClassWithPackage(OrdiniCollegatiAFattura.class) ? OrdiniCollegatiAFattura.class.getName().substring(OrdiniCollegatiAFattura.class.getPackage().getName().length() + 1) : OrdiniCollegatiAFattura.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Ordini On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINI);
      // 
      // Ordini On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ORDINI.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINI_DESCRIZIONE,(new IDVariant(PAN_ORDINI.FieldText(PFL_ORDINI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniCollegatiAFattura", "OrdiniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Ordini After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ORDINI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordini After Find Event Body
      // Procedure Body
      // 
      PAN_ORDINI.set_FieldText(PFL_ORDINI_IMPORTFATTUR, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARAMETRI414, IMDBDef2.FLD_PARAMETRI414_PARAIMPOFATT, 0),(new IDVariant(0)))).stringValue());
      PAN_ORDINI.set_FieldText(PFL_ORDINI_TOTLIQUIDABI, IDL.ToString(IDL.NullValue(PAN_ORDINI.GetFieldSum(PFL_ORDINI_LIQUIDABILE),(new IDVariant(0)))).stringValue());
      PAN_ORDINI.set_FieldText(PFL_ORDINI_DIFFERENZA, IDL.ToString(IDL.Add(IDL.Sub(IDL.Sub(IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARAMETRI414, IMDBDef2.FLD_PARAMETRI414_PARAIMPOFATT, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARAMETRI414, IMDBDef2.FLD_PARAMETRI414_PARAIMPUFATT, 0),(new IDVariant(0)))), IDL.NullValue(PAN_ORDINI.GetFieldSum(PFL_ORDINI_LIQUIDABILE),(new IDVariant(0)))), MainFrm.ImportoGiàLiquidato(IMDB.Value(IMDBDef2.TBL_PARAMETRI414, IMDBDef2.FLD_PARAMETRI414_ANNO_PROG, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI414, IMDBDef2.FLD_PARAMETRI414_NUMERO_PROG, 0)))).stringValue());
      PAN_ORDINI.set_FieldText(PFL_ORDINI_TOTALELIQUID, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARAMETRI414, IMDBDef2.FLD_PARAMETRI414_PARAIMPUFATT, 0),(new IDVariant(0)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniCollegatiAFattura", "OrdiniAfterFindEvent", _e);
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
      v_CAPTION = (new IDVariant("Ordini", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_ORDINI.set_FieldText(PFL_ORDINI_ESTREMFATTUR, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Fattura")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI414, IMDBDef2.FLD_PARAMETRI414_NUMERO_DOC, 0))), (new IDVariant(" "))), (new IDVariant("del "))), MainFrm.Datetostring(IMDB.Value(IMDBDef2.TBL_PARAMETRI414, IMDBDef2.FLD_PARAMETRI414_D_DATA_DOC, 0))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniCollegatiAFattura", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Info Ordini
  // **********************************************************************
  public int ApriInfoOrdini ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Ordini Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_ANNO_BUONO, 0, IMDB.Value(IMDBDef10.PQRY_DETTBUONIMDB, IMDBDef10.PQSL_DETTBUONIMDB_ANNO_BUONO, 0));
      IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_NUMERO_BUONO, 0, IMDB.Value(IMDBDef10.PQRY_DETTBUONIMDB, IMDBDef10.PQSL_DETTBUONIMDB_NUMERO_BUONO, 0));
      MainFrm.Show(MyGlb.FRM_INFOORDINI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniCollegatiAFattura", "ApriInfoOrdini", _e);
      return -1;
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
  private void PAN_ORDINI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINI, Cancel);
    // Stub
  }

  private void PAN_ORDINI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINI_INFOORDINE)
    {
      this.IdxPanelActived = this.PAN_ORDINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoOrdini();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_DETTBUONIMDB, IMDBDef10.PQSL_DETTBUONIMDB_PROGRESSIVO_BUONO, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_DETTBUONIMDB, IMDBDef10.PQSL_DETTBUONIMDB_PROGRESSIVO_BUONO, 0, (new IDVariant(1)));
      }
      if (Cancel.isFalse())
      {
        PAN_ORDINI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINI_Init()
  {

    PAN_ORDINI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDINI.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, "BA268D05-19B0-4F55-950C-376C2B06F4F2");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, "NUMERO BUONO");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, "C180F201-9F81-4E67-A155-EDF889ED1B36");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, "ANNO BUONO");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, "444A12DC-F21F-4682-B857-2FA1CFA88720");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, "PROGRESSIVO BUONO");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, "A8D69A1C-3506-48E0-8870-6C50E869154E");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, "Info Ordine");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, "Elimina Collegamento Bolla");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, "83D9D927-ABC9-40CB-95ED-FE95C3E6FA74");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, "Descrizione");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, "939B03C7-8C23-41DD-AF2B-9B6D8CA3AFF7");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, "Liquidabile");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, "9168C59C-BF3B-4431-B9F4-3485384FD495");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, "Ordine");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, "4EB6E0BC-BFAD-4ABF-99D9-6099FA12B5EC");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, MyGlb.VIS_ETICHEGRASSE);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, "471FDA27-7448-40BF-94A1-92D19325177B");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, "Chiuso");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, MyGlb.VIS_CHECKSTYLE);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, "55F5C4F7-7CDB-4613-82CD-6C5060B06B73");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, "Importo Fattura:");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, MyGlb.VIS_VUOGRAALILEF);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, "6469CE2C-04FA-43BF-84DF-4635D9E74C37");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, "Tot. Liquidabile:");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, MyGlb.VIS_VUOGRAALILEF);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, "6E23CCC1-0894-4746-95FB-B70D21048C2E");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, MyGlb.VIS_CAMPTOTADISA);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, "DB556E2E-8557-423A-9DE8-470D2EE24D7D");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, "Differenza:");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, MyGlb.VIS_VUOGRAALILEF);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, "99529006-DAAF-4875-9363-59398D2C0DCC");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, MyGlb.VIS_CAMPTOTADISA);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, "26A58BB8-461E-4CC3-AFDB-999682E27C44");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, MyGlb.VIS_CAMPTOTADISA);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, "2A7051B1-56A5-4EA7-B7AA-FBDD28B7BCCB");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, "Tot. Liquidato:");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, MyGlb.VIS_VUOGRAALILEF);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, "B2D2D481-EC5F-4C67-A0E2-C52BFC4C2CEE");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, MyGlb.VIS_CAMPTOTADISA);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ORDINI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, MyGlb.PANEL_LIST, 0, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, MyGlb.PANEL_LIST, 92);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, MyGlb.PANEL_LIST, "NUM. BUON.");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, MyGlb.PANEL_FORM, 136);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_NUMEROBUONO, MyGlb.PANEL_FORM, "NUMERO BUONO");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_NUMEROBUONO, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_NUMEROBUONO, PPQRY_DETTBUONIMDB, "A.NUMERO_BUONO", "NUMERO_BUONO", 1, 5, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, MyGlb.PANEL_LIST, 40, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, MyGlb.PANEL_LIST, 76);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, MyGlb.PANEL_LIST, "ANN. BUON.");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, MyGlb.PANEL_FORM, 196, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, MyGlb.PANEL_FORM, 88);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNOBUONO, MyGlb.PANEL_FORM, "ANNO BUONO");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_ANNOBUONO, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_ANNOBUONO, PPQRY_DETTBUONIMDB, "A.ANNO_BUONO", "ANNO_BUONO", 1, 4, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, MyGlb.PANEL_LIST, 80, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, MyGlb.PANEL_LIST, 120);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, MyGlb.PANEL_LIST, "PROG. BN.");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, MyGlb.PANEL_FORM, 4, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, MyGlb.PANEL_FORM, 136);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_PROGRESBUONO, MyGlb.PANEL_FORM, "PROGRESSIVO BUONO");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_PROGRESBUONO, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_PROGRESBUONO, PPQRY_DETTBUONIMDB, "A.PROGRESSIVO_BUONO", "PROGRESSIVO_BUONO", 1, 3, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, MyGlb.PANEL_LIST, 120, 76, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, MyGlb.PANEL_LIST, 136);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, MyGlb.PANEL_LIST, "I. Or.");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, MyGlb.PANEL_FORM, 4, 484, 568, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, MyGlb.PANEL_FORM, 136);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, MyGlb.PANEL_FORM, 2);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_INFOORDINE, MyGlb.PANEL_FORM, "Info Ordine");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_INFOORDINE, -1, -1);
    PAN_ORDINI.SetFieldUnbound(PFL_ORDINI_INFOORDINE, true);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_INFOORDINE, PPQRY_DETTBUONIMDB, "DECODE(A.NUMERO_BUONO, to_number(NULL), NULL, 'I')", "DETBUOIMINOR", 5, 99, 0, -13997);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFOORDINE, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, MyGlb.PANEL_LIST, 144, 76, 340, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 316, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_DESCRIZIONE, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_DESCRIZIONE, PPQRY_DETTBUONIMDB, "B.DESCRIZIONE", "DESCRIZIONE", 5, 2000, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, MyGlb.PANEL_LIST, 484, 76, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, MyGlb.PANEL_LIST, 60);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, MyGlb.PANEL_LIST, "Liquidabile");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, MyGlb.PANEL_FORM, 4, 76, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, MyGlb.PANEL_FORM, 60);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQUIDABILE, MyGlb.PANEL_FORM, "Liquid.");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_LIQUIDABILE, -1, -1);
    PAN_ORDINI.SetFieldUnbound(PFL_ORDINI_LIQUIDABILE, true);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_LIQUIDABILE, PPQRY_DETTBUONIMDB, "SUM(NVL(A.IMPUTATO, 0))", "DETBUOIMDLIQ", 3, 28, 6, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, MyGlb.PANEL_LIST, 0, 40, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, MyGlb.PANEL_LIST, 2);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, MyGlb.PANEL_FORM, 0, 0, 460, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_ORDINE, MyGlb.PANEL_FORM, 2);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_ORDINE, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_ORDINE, -1, "", "ORDINE", 0, 0, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, MyGlb.PANEL_LIST, 0, 4, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, MyGlb.PANEL_FORM, 0, 4, 652, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_ESTREMFATTUR, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_ESTREMFATTUR, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_ESTREMFATTUR, -1, "", "ESTREMFATTUR", 0, 0, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, MyGlb.PANEL_LIST, 600, 76, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, MyGlb.PANEL_LIST, 40);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, MyGlb.PANEL_LIST, "Chiuso");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, MyGlb.PANEL_FORM, 4, 292, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, MyGlb.PANEL_FORM, 40);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_CHIUSO, MyGlb.PANEL_FORM, "Chius.");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_CHIUSO, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_CHIUSO, PPQRY_DETTBUONIMDB, "B.CHIUSO", "CHIUSO", 5, 2, 0, -13997);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_CHIUSO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_CHIUSO, (new IDVariant()), "Null", "", "", -1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, MyGlb.PANEL_LIST, 128, 288, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, MyGlb.PANEL_FORM, 308, 284, 140, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPOFATTLABE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_IMPOFATTLABE, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_IMPOFATTLABE, -1, "", "IMPOFATTLABE", 0, 0, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, MyGlb.PANEL_LIST, 384, 288, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, MyGlb.PANEL_FORM, 316, 292, 140, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUILABE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_TOTLIQUILABE, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_TOTLIQUILABE, -1, "", "TOTLIQUILABE", 0, 0, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, MyGlb.PANEL_LIST, 484, 288, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, MyGlb.PANEL_FORM, 324, 300, 140, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTLIQUIDABI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_TOTLIQUIDABI, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_TOTLIQUIDABI, -1, "", "TOTLIQUIDABI", 0, 0, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, MyGlb.PANEL_LIST, 412, 312, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, MyGlb.PANEL_FORM, 324, 300, 140, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERELABEL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_DIFFERELABEL, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_DIFFERELABEL, -1, "", "DIFFERELABEL", 0, 0, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, MyGlb.PANEL_LIST, 484, 312, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, MyGlb.PANEL_FORM, 332, 308, 140, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_DIFFERENZA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_DIFFERENZA, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_DIFFERENZA, -1, "", "DIFFERENZA", 0, 0, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, MyGlb.PANEL_LIST, 232, 288, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, MyGlb.PANEL_FORM, 340, 316, 140, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTFATTUR, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_IMPORTFATTUR, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_IMPORTFATTUR, -1, "", "IMPORTFATTUR", 0, 0, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, MyGlb.PANEL_LIST, 144, 312, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, MyGlb.PANEL_FORM, 316, 292, 140, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALIQULABE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_TOTALIQULABE, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_TOTALIQULABE, -1, "", "TOTALIQULABE", 0, 0, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, MyGlb.PANEL_LIST, 232, 312, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, MyGlb.PANEL_LIST, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, MyGlb.PANEL_FORM, 348, 324, 140, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, MyGlb.PANEL_FORM, 0);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TOTALELIQUID, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_TOTALELIQUID, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_TOTALELIQUID, -1, "", "TOTALELIQUID", 0, 0, 0, -13997);
  }

  private void PAN_ORDINI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDINI.SetIMDB(IMDB, "PQRY_DETTBUONIMDB", true);
    PAN_ORDINI.set_SetString(MyGlb.MASTER_ROWNAME, "Dettagli Buoni IMDB");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_BUONO as NUMERO_BUONO, ");
    SQL.append("  A.ANNO_BUONO as ANNO_BUONO, ");
    SQL.append("  A.PROGRESSIVO_BUONO as PROGRESSIVO_BUONO, ");
    SQL.append("  DECODE(A.NUMERO_BUONO, to_number(NULL), NULL, 'I') as DETBUOIMINOR, ");
    SQL.append("  SUM(NVL(A.IMPUTATO, 0)) as DETBUOIMDLIQ, ");
    SQL.append("  B.CHIUSO as CHIUSO, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE ");
    PAN_ORDINI.SetQuery(PPQRY_DETTBUONIMDB, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FATTURE_BUONI A, ");
    SQL.append("  DETTAGLI_BUONI B ");
    PAN_ORDINI.SetQuery(PPQRY_DETTBUONIMDB, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = ~~TBL_PARAMETRI414.ANNO_PROG~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~TBL_PARAMETRI414.NUMERO_PROG~~) ");
    SQL.append("and   (B.ANNO_BUONO(+) = A.ANNO_BUONO) ");
    SQL.append("and   (B.NUMERO_BUONO(+) = A.NUMERO_BUONO) ");
    SQL.append("and   (B.PROGRESSIVO_BUONO(+) = A.PROGRESSIVO_BUONO) ");
    PAN_ORDINI.SetQuery(PPQRY_DETTBUONIMDB, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.ANNO_BUONO, ");
    SQL.append("  A.NUMERO_BUONO, ");
    SQL.append("  A.PROGRESSIVO_BUONO, ");
    SQL.append("  B.CHIUSO, ");
    SQL.append("  B.DESCRIZIONE ");
    PAN_ORDINI.SetQuery(PPQRY_DETTBUONIMDB, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINI.SetQuery(PPQRY_DETTBUONIMDB, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINI.SetQuery(PPQRY_DETTBUONIMDB, 5, SQL, -1, "");
    PAN_ORDINI.SetQueryDB(PPQRY_DETTBUONIMDB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINI.SetMasterTable(0, "FATTURE_BUONI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINI.Status() == 2)
    {
      int oldListQBE = PAN_ORDINI.iUseListQBE;
      PAN_ORDINI.iUseListQBE = 0;
      PAN_ORDINI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINI.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
