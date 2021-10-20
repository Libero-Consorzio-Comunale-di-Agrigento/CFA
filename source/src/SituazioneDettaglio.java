// **********************************************
// Situazione Dettaglio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneDettaglio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SITUAZDETTAG_ESTREMORDINE = 0;
  private static int PFL_SITUAZDETTAG_IMPORTO = 1;
  private static int PFL_SITUAZDETTAG_IMPARRIVATO = 2;
  private static int PFL_SITUAZDETTAG_LIQUIDABILE = 3;
  private static int PFL_SITUAZDETTAG_LIQTECNICO = 4;
  private static int PFL_SITUAZDETTAG_LIQCONTABILE = 5;

  private static int PPQRY_DETTAGLBUON2 = 0;


  IDPanel PAN_SITUAZDETTAG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM44(IMDB);
    //
    //
    Init_PQRY_DETTAGLBUON2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM44(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM44, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM44, "TBL_PARAM44");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMANNORD, "ROWNAMANNORD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMANNORD,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMNUMORD, "ROWNAMNUMORD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMNUMORD,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMPROORD, "ROWNAMPROORD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMPROORD,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMEDATA,6,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM44,IMDBDef2.FLD_PARAM44_ROWNAMEDESCR,5,200,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM44, 0);
  }

  private static void Init_PQRY_DETTAGLBUON2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_DETTAGLBUON2, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_DETTAGLBUON2, "PQRY_DETTAGLBUON2");
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_DETBUOIMPARR, "DETBUOIMPARR");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_DETBUOIMPARR,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_DETTBUONLIQU, "DETTBUONLIQU");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_DETTBUONLIQU,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_DETBUOLIQTEC, "DETBUOLIQTEC");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_DETBUOLIQTEC,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_DETBUOLIQCON, "DETBUOLIQCON");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON2,IMDBDef10.PQSL_DETTAGLBUON2_DETBUOLIQCON,3,28,6);
    IMDB.TblAddNew(IMDBDef10.PQRY_DETTAGLBUON2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneDettaglio(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneDettaglio()
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
    FormIdx = MyGlb.FRM_SITUAZDETTAG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0045EBC8-3DCF-4F4A-8AC8-E0D8F7523F91";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 360;
    DesignHeight = 234;
    set_Caption(new IDVariant("Situazione Dettaglio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 360;
    Frames[1].Height = 208;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Situazione Dettaglio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 208;
    PAN_SITUAZDETTAG = new IDPanel(w, this, 1, "PAN_SITUAZDETTAG");
    Frames[1].Content = PAN_SITUAZDETTAG;
    PAN_SITUAZDETTAG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITUAZDETTAG.VS = MainFrm.VisualStyleList;
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 360-MyGlb.PAN_OFFS_X, 208-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SITUAZDETTAG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4C5D6017-D273-4C72-BB31-9263329A1A2D");
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 672, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITUAZDETTAG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITUAZDETTAG.InitStatus = 2;
    PAN_SITUAZDETTAG_Init();
    PAN_SITUAZDETTAG_InitFields();
    PAN_SITUAZDETTAG_InitQueries();
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
      PAN_SITUAZDETTAG.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazioneDettaglio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneDettaglio.class.getName() : (Glb.ClassWithPackage(SituazioneDettaglio.class) ? SituazioneDettaglio.class.getName().substring(SituazioneDettaglio.class.getPackage().getName().length() + 1) : SituazioneDettaglio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_ORDINE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DETT = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ORDINE = (new IDVariant("Ordine: ", IDVariant.STRING));
      v_DETT = (new IDVariant(" Dett: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_SITUAZDETTAG.set_FieldText(PFL_SITUAZDETTAG_ESTREMORDINE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ORDINE, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM44, IMDBDef2.FLD_PARAM44_ROWNAMNUMORD, 0))), (new IDVariant(" - "))), MainFrm.Datetostring(IMDB.Value(IMDBDef2.TBL_PARAM44, IMDBDef2.FLD_PARAM44_ROWNAMEDATA, 0))), (new IDVariant(" - "))), v_DETT), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM44, IMDBDef2.FLD_PARAM44_ROWNAMPROORD, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef2.TBL_PARAM44, IMDBDef2.FLD_PARAM44_ROWNAMEDESCR, 0)).stringValue());
      if (MainFrm.GESTIONBOLLE.compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_SITUAZDETTAG.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SITUAZDETTAG.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneDettaglio", "LoadEvent", _e);
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
  private void PAN_SITUAZDETTAG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITUAZDETTAG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITUAZDETTAG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITUAZDETTAG, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITUAZDETTAG_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SITUAZDETTAG);
    // Stub
  }

  private void PAN_SITUAZDETTAG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SITUAZDETTAG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITUAZDETTAG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITUAZDETTAG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SITUAZDETTAG_Init()
  {

    PAN_SITUAZDETTAG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITUAZDETTAG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SITUAZDETTAG.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_SITUAZDETTAG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, "35ADA4CD-B6A3-41D7-B47C-9A27653B9C49");
    PAN_SITUAZDETTAG.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, "");
    PAN_SITUAZDETTAG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, MyGlb.VIS_ETICHEGRASSE);
    PAN_SITUAZDETTAG.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZDETTAG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, "7EF7D59E-EC3E-420F-B19D-3177BF6EA110");
    PAN_SITUAZDETTAG.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, "Importo");
    PAN_SITUAZDETTAG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, "");
    PAN_SITUAZDETTAG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZDETTAG.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZDETTAG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, "2B3FFB02-8DA5-499A-9D1A-B55253E3160F");
    PAN_SITUAZDETTAG.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, "Imp. Arrivato");
    PAN_SITUAZDETTAG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, "");
    PAN_SITUAZDETTAG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZDETTAG.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZDETTAG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, "AA5913C3-4549-4A5E-8067-AF23089CF181");
    PAN_SITUAZDETTAG.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, "Liquidabile");
    PAN_SITUAZDETTAG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, "Liquidabile");
    PAN_SITUAZDETTAG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZDETTAG.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZDETTAG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, "6521009B-4759-4B38-96F8-2E33F928F2F4");
    PAN_SITUAZDETTAG.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, "Liq. Tecnico");
    PAN_SITUAZDETTAG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, "");
    PAN_SITUAZDETTAG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZDETTAG.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZDETTAG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, "88123FBC-EDC3-4914-BA9B-7B312FFA0920");
    PAN_SITUAZDETTAG.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, "Liq. Contabile");
    PAN_SITUAZDETTAG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, "");
    PAN_SITUAZDETTAG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZDETTAG.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SITUAZDETTAG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, MyGlb.PANEL_LIST, 0, 4, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, MyGlb.PANEL_FORM, 4, 4, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_ESTREMORDINE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDETTAG.SetFieldPage(PFL_SITUAZDETTAG_ESTREMORDINE, -1, -1);
    PAN_SITUAZDETTAG.SetFieldPanel(PFL_SITUAZDETTAG_ESTREMORDINE, -1, "", "ESTREMORDINE", 0, 0, 0, -13997);
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, MyGlb.PANEL_FORM, 80, 32, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_SITUAZDETTAG.SetFieldPage(PFL_SITUAZDETTAG_IMPORTO, -1, -1);
    PAN_SITUAZDETTAG.SetFieldPanel(PFL_SITUAZDETTAG_IMPORTO, PPQRY_DETTAGLBUON2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, MyGlb.PANEL_LIST, 68);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, MyGlb.PANEL_LIST, "Imp. Arrivato");
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, MyGlb.PANEL_FORM, 64, 56, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, MyGlb.PANEL_FORM, 92);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_IMPARRIVATO, MyGlb.PANEL_FORM, "Imp. Arrivato");
    PAN_SITUAZDETTAG.SetFieldPage(PFL_SITUAZDETTAG_IMPARRIVATO, -1, -1);
    PAN_SITUAZDETTAG.SetFieldUnbound(PFL_SITUAZDETTAG_IMPARRIVATO, true);
    PAN_SITUAZDETTAG.SetFieldPanel(PFL_SITUAZDETTAG_IMPARRIVATO, PPQRY_DETTAGLBUON2, "NVL(A.QUANTITA_ARRIVATA, 0) * A.PREZZO", "DETBUOIMPARR", 3, 28, 6, -13997);
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, MyGlb.PANEL_LIST, 60);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, MyGlb.PANEL_LIST, "Liquidabile");
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, MyGlb.PANEL_FORM, 76, 80, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, MyGlb.PANEL_FORM, 80);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQUIDABILE, MyGlb.PANEL_FORM, "Liquidabile");
    PAN_SITUAZDETTAG.SetFieldPage(PFL_SITUAZDETTAG_LIQUIDABILE, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  SUM(NVL(B.FATTURATO, 0)) ");
  SQL.append("from ");
  SQL.append("  DETTAGLI_IMPEGNI_BUONI B ");
  SQL.append("where (B.ANNO_BUONO = A.ANNO_BUONO) ");
  SQL.append("and   (B.NUMERO_BUONO = A.NUMERO_BUONO) ");
  SQL.append("and   (B.PROGRESSIVO_BUONO = A.PROGRESSIVO_BUONO) ");
  SQL.append(")");
    PAN_SITUAZDETTAG.SetFieldUnbound(PFL_SITUAZDETTAG_LIQUIDABILE, true);
    PAN_SITUAZDETTAG.SetFieldPanel(PFL_SITUAZDETTAG_LIQUIDABILE, PPQRY_DETTAGLBUON2, SQL.toString(), "DETTBUONLIQU", 3, 28, 6, -13997);
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, MyGlb.PANEL_LIST, 60);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, MyGlb.PANEL_LIST, "Liq. Tecnico");
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, MyGlb.PANEL_FORM, 72, 104, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, MyGlb.PANEL_FORM, 84);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQTECNICO, MyGlb.PANEL_FORM, "Liq. Tecnico");
    PAN_SITUAZDETTAG.SetFieldPage(PFL_SITUAZDETTAG_LIQTECNICO, -1, -1);
    PAN_SITUAZDETTAG.SetFieldUnbound(PFL_SITUAZDETTAG_LIQTECNICO, true);
    PAN_SITUAZDETTAG.SetFieldPanel(PFL_SITUAZDETTAG_LIQTECNICO, PPQRY_DETTAGLBUON2, "A_BUO_DIS_CALCOLI('LT','B',A.ANNO_BUONO,A.NUMERO_BUONO,A.PROGRESSIVO_BUONO,TRUNC( SYSDATE ))", "DETBUOLIQTEC", 3, 28, 6, -13997);
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, MyGlb.PANEL_LIST, 72);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, MyGlb.PANEL_LIST, "Liq. Contabile");
    PAN_SITUAZDETTAG.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, MyGlb.PANEL_FORM, 60, 128, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDETTAG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, MyGlb.PANEL_FORM, 96);
    PAN_SITUAZDETTAG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDETTAG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDETTAG_LIQCONTABILE, MyGlb.PANEL_FORM, "Liq. Contabile");
    PAN_SITUAZDETTAG.SetFieldPage(PFL_SITUAZDETTAG_LIQCONTABILE, -1, -1);
    PAN_SITUAZDETTAG.SetFieldUnbound(PFL_SITUAZDETTAG_LIQCONTABILE, true);
    PAN_SITUAZDETTAG.SetFieldPanel(PFL_SITUAZDETTAG_LIQCONTABILE, PPQRY_DETTAGLBUON2, "A_BUO_DIS_CALCOLI('LC','B',A.ANNO_BUONO,A.NUMERO_BUONO,A.PROGRESSIVO_BUONO,TRUNC( SYSDATE ))", "DETBUOLIQCON", 3, 28, 6, -13997);
  }

  private void PAN_SITUAZDETTAG_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITUAZDETTAG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SITUAZDETTAG.SetIMDB(IMDB, "PQRY_DETTAGLBUON2", true);
    PAN_SITUAZDETTAG.set_SetString(MyGlb.MASTER_ROWNAME, "DETTAGLI BUONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  NVL(A.QUANTITA_ARRIVATA, 0) * A.PREZZO as DETBUOIMPARR, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(B.FATTURATO, 0)) ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI B ");
    SQL.append("where (B.ANNO_BUONO = A.ANNO_BUONO) ");
    SQL.append("and   (B.NUMERO_BUONO = A.NUMERO_BUONO) ");
    SQL.append("and   (B.PROGRESSIVO_BUONO = A.PROGRESSIVO_BUONO) ");
    SQL.append(") as DETTBUONLIQU, ");
    SQL.append("  A_BUO_DIS_CALCOLI('LT','B',A.ANNO_BUONO,A.NUMERO_BUONO,A.PROGRESSIVO_BUONO,TRUNC( SYSDATE )) as DETBUOLIQTEC, ");
    SQL.append("  A_BUO_DIS_CALCOLI('LC','B',A.ANNO_BUONO,A.NUMERO_BUONO,A.PROGRESSIVO_BUONO,TRUNC( SYSDATE )) as DETBUOLIQCON ");
    PAN_SITUAZDETTAG.SetQuery(PPQRY_DETTAGLBUON2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DETTAGLI_BUONI A ");
    PAN_SITUAZDETTAG.SetQuery(PPQRY_DETTAGLBUON2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_BUONO = ~~TBL_PARAM44.ROWNAMANNORD~~) ");
    SQL.append("and   (A.NUMERO_BUONO = ~~TBL_PARAM44.ROWNAMNUMORD~~) ");
    SQL.append("and   (A.PROGRESSIVO_BUONO = ~~TBL_PARAM44.ROWNAMPROORD~~) ");
    PAN_SITUAZDETTAG.SetQuery(PPQRY_DETTAGLBUON2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZDETTAG.SetQuery(PPQRY_DETTAGLBUON2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZDETTAG.SetQuery(PPQRY_DETTAGLBUON2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZDETTAG.SetQuery(PPQRY_DETTAGLBUON2, 5, SQL, -1, "");
    PAN_SITUAZDETTAG.SetQueryDB(PPQRY_DETTAGLBUON2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZDETTAG.SetMasterTable(0, "DETTAGLI_BUONI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITUAZDETTAG.Status() == 2)
    {
      int oldListQBE = PAN_SITUAZDETTAG.iUseListQBE;
      PAN_SITUAZDETTAG.iUseListQBE = 0;
      PAN_SITUAZDETTAG.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITUAZDETTAG.PanelCommand(Glb.PCM_FIND);
      PAN_SITUAZDETTAG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SITUAZDETTAG) PAN_SITUAZDETTAG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZDETTAG) PAN_SITUAZDETTAG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SITUAZDETTAG) PAN_SITUAZDETTAG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZDETTAG) PAN_SITUAZDETTAG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SITUAZDETTAG) PAN_SITUAZDETTAG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
