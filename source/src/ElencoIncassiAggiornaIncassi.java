// **********************************************
// Elenco Incassi Aggiorna Incassi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoIncassiAggiornaIncassi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VALORDAAGGIO_INTESTALABEL = 0;
  private static int PFL_VALORDAAGGIO_CONFERMLABEL = 1;
  private static int PFL_VALORDAAGGIO_DATAINCASSO = 2;
  private static int PFL_VALORDAAGGIO_NUMEROINCASS = 3;

  private static int PPQRY_PARAMETRI557 = 0;


  IDPanel PAN_VALORDAAGGIO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_CAMPIDAAGGIO(IMDB);
    //
    //
    Init_PQRY_PARAMETRI557(IMDB);
    Init_PQRY_PARAMETRI557_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_CAMPIDAAGGIO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_CAMPIDAAGGIO, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_CAMPIDAAGGIO, "TBL_CAMPIDAAGGIO");
    IMDB.set_FldCode(IMDBDef2.TBL_CAMPIDAAGGIO,IMDBDef2.FLD_CAMPIDAAGGIO_DATA_INCASSO, "DATA_INCASSO");
    IMDB.SetFldParams(IMDBDef2.TBL_CAMPIDAAGGIO,IMDBDef2.FLD_CAMPIDAAGGIO_DATA_INCASSO,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_CAMPIDAAGGIO,IMDBDef2.FLD_CAMPIDAAGGIO_NUMERO_INCASSO, "NUMERO_INCASSO");
    IMDB.SetFldParams(IMDBDef2.TBL_CAMPIDAAGGIO,IMDBDef2.FLD_CAMPIDAAGGIO_NUMERO_INCASSO,5,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_CAMPIDAAGGIO, 0);
  }

  private static void Init_PQRY_PARAMETRI557(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI557, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI557, "PQRY_PARAMETRI557");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI557,IMDBDef9.PQSL_PARAMETRI557_DATA_INCASSO, "DATA_INCASSO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI557,IMDBDef9.PQSL_PARAMETRI557_DATA_INCASSO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI557,IMDBDef9.PQSL_PARAMETRI557_NUMERO_INCASSO, "NUMERO_INCASSO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI557,IMDBDef9.PQSL_PARAMETRI557_NUMERO_INCASSO,5,10,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI557, 0);
  }

  private static void Init_PQRY_PARAMETRI557_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI557_RS, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI557_RS, "PQRY_PARAMETRI557_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI557_RS,IMDBDef9.PQSL_PARAMETRI557_DATA_INCASSO, "DATA_INCASSO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI557_RS,IMDBDef9.PQSL_PARAMETRI557_DATA_INCASSO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI557_RS,IMDBDef9.PQSL_PARAMETRI557_NUMERO_INCASSO, "NUMERO_INCASSO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI557_RS,IMDBDef9.PQSL_PARAMETRI557_NUMERO_INCASSO,5,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoIncassiAggiornaIncassi(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoIncassiAggiornaIncassi()
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
    FormIdx = MyGlb.FRM_ELEINCAGGINC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D40DC8B9-CEA7-442F-AE3C-CBF2634DCE10";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 400;
    DesignHeight = 206;
    set_Caption(new IDVariant("Aggiornamento Numero e Data Incasso"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 400;
    Frames[1].Height = 180;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Valori Da Aggiornare";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 180;
    PAN_VALORDAAGGIO = new IDPanel(w, this, 1, "PAN_VALORDAAGGIO");
    Frames[1].Content = PAN_VALORDAAGGIO;
    PAN_VALORDAAGGIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VALORDAAGGIO.VS = MainFrm.VisualStyleList;
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 180-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VALORDAAGGIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "745DFCDD-51F2-49E3-9E93-2370F2D57972");
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 204, 568, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VALORDAAGGIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VALORDAAGGIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VALORDAAGGIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VALORDAAGGIO.InitStatus = 2;
    PAN_VALORDAAGGIO_Init();
    PAN_VALORDAAGGIO_InitFields();
    PAN_VALORDAAGGIO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_CAMPIDAAGGIO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELEINCAGGINC_PARAMETRI557();
      }
      PAN_VALORDAAGGIO.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoIncassiAggiornaIncassi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoIncassiAggiornaIncassi.class.getName() : (Glb.ClassWithPackage(ElencoIncassiAggiornaIncassi.class) ? ElencoIncassiAggiornaIncassi.class.getName().substring(ElencoIncassiAggiornaIncassi.class.getPackage().getName().length() + 1) : ElencoIncassiAggiornaIncassi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      PAN_VALORDAAGGIO.PanelCommand(Glb.PCM_UPDATE);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassiAggiornaIncassi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Conferma
  // **********************************************************************
  public int Conferma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conferma Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassiAggiornaIncassi", "Conferma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELEINCAGGINC_PARAMETRI557() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMETRI557_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_CAMPIDAAGGIO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_CAMPIDAAGGIO, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI557_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMETRI557_RS, 0, IMDBDef2.TBL_CAMPIDAAGGIO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI557_RS, 0, 0, IMDBDef2.TBL_CAMPIDAAGGIO, IMDBDef2.FLD_CAMPIDAAGGIO_DATA_INCASSO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI557_RS, 1, 0, IMDBDef2.TBL_CAMPIDAAGGIO, IMDBDef2.FLD_CAMPIDAAGGIO_NUMERO_INCASSO, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_CAMPIDAAGGIO, 0);
      if (IMDB.Eof(IMDBDef2.TBL_CAMPIDAAGGIO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_CAMPIDAAGGIO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMETRI557_RS, 0);
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
  private void PAN_VALORDAAGGIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VALORDAAGGIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VALORDAAGGIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VALORDAAGGIO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VALORDAAGGIO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VALORDAAGGIO);
    // Stub
  }

  private void PAN_VALORDAAGGIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VALORDAAGGIO_CONFERMLABEL)
    {
      this.IdxPanelActived = this.PAN_VALORDAAGGIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Conferma();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VALORDAAGGIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VALORDAAGGIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VALORDAAGGIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VALORDAAGGIO_Init()
  {

    PAN_VALORDAAGGIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VALORDAAGGIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VALORDAAGGIO.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_VALORDAAGGIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, "70AA0536-333A-4BFF-8379-7A6169B67C6D");
    PAN_VALORDAAGGIO.set_Header(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, "L'incasso indicato verrà valorizzato su tutte le righe selezionate. ");
    PAN_VALORDAAGGIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_VALORDAAGGIO.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALORDAAGGIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, "00EC7ED3-812D-44AA-A14E-C6DFDE9F2106");
    PAN_VALORDAAGGIO.set_Header(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, "Conferma");
    PAN_VALORDAAGGIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, MyGlb.VIS_STATICBUTTON);
    PAN_VALORDAAGGIO.SetImage(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, 0, "button1.gif", false);
    PAN_VALORDAAGGIO.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALORDAAGGIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, "EC36753E-2E9E-4ECA-AAF6-D3DD151D5F38");
    PAN_VALORDAAGGIO.set_Header(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, "Data Incasso");
    PAN_VALORDAAGGIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, "");
    PAN_VALORDAAGGIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORDAAGGIO.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORDAAGGIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, "A3112442-C0C7-4153-8707-58920588DA21");
    PAN_VALORDAAGGIO.set_Header(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, "Numero Incasso");
    PAN_VALORDAAGGIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, "");
    PAN_VALORDAAGGIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, MyGlb.VIS_NORMFIELPADR);
    PAN_VALORDAAGGIO.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VALORDAAGGIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, MyGlb.PANEL_LIST, 80, 8, 484, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORDAAGGIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_VALORDAAGGIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, MyGlb.PANEL_FORM, 4, 8, 380, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORDAAGGIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_VALORDAAGGIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_INTESTALABEL, MyGlb.PANEL_FORM, 2);
    PAN_VALORDAAGGIO.SetFieldPage(PFL_VALORDAAGGIO_INTESTALABEL, -1, -1);
    PAN_VALORDAAGGIO.SetFieldPanel(PFL_VALORDAAGGIO_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, MyGlb.PANEL_LIST, 552, 336, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORDAAGGIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VALORDAAGGIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, MyGlb.PANEL_FORM, 304, 140, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORDAAGGIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VALORDAAGGIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_CONFERMLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VALORDAAGGIO.SetFieldPage(PFL_VALORDAAGGIO_CONFERMLABEL, -1, -1);
    PAN_VALORDAAGGIO.SetFieldPanel(PFL_VALORDAAGGIO_CONFERMLABEL, -1, "", "CONFERMLABEL", 0, 0, 0, -13997);
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORDAAGGIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, MyGlb.PANEL_LIST, 84);
    PAN_VALORDAAGGIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, MyGlb.PANEL_LIST, 1);
    PAN_VALORDAAGGIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, MyGlb.PANEL_LIST, "Data Incasso");
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, MyGlb.PANEL_FORM, 216, 72, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORDAAGGIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, MyGlb.PANEL_FORM, 84);
    PAN_VALORDAAGGIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, MyGlb.PANEL_FORM, 1);
    PAN_VALORDAAGGIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_DATAINCASSO, MyGlb.PANEL_FORM, "Data Incasso");
    PAN_VALORDAAGGIO.SetFieldPage(PFL_VALORDAAGGIO_DATAINCASSO, -1, -1);
    PAN_VALORDAAGGIO.SetFieldPanel(PFL_VALORDAAGGIO_DATAINCASSO, PPQRY_PARAMETRI557, "A.DATA_INCASSO", "DATA_INCASSO", 6, 19, 0, -13997);
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORDAAGGIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, MyGlb.PANEL_LIST, 100);
    PAN_VALORDAAGGIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, MyGlb.PANEL_LIST, 1);
    PAN_VALORDAAGGIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, MyGlb.PANEL_LIST, "Numero Incasso");
    PAN_VALORDAAGGIO.SetRect(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, MyGlb.PANEL_FORM, 4, 72, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORDAAGGIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, MyGlb.PANEL_FORM, 100);
    PAN_VALORDAAGGIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, MyGlb.PANEL_FORM, 1);
    PAN_VALORDAAGGIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORDAAGGIO_NUMEROINCASS, MyGlb.PANEL_FORM, "Numero Incasso");
    PAN_VALORDAAGGIO.SetFieldPage(PFL_VALORDAAGGIO_NUMEROINCASS, -1, -1);
    PAN_VALORDAAGGIO.SetFieldPanel(PFL_VALORDAAGGIO_NUMEROINCASS, PPQRY_PARAMETRI557, "A.NUMERO_INCASSO", "NUMERO_INCASSO", 5, 10, 0, -13997);
  }

  private void PAN_VALORDAAGGIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_VALORDAAGGIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VALORDAAGGIO.SetIMDB(IMDB, "PQRY_PARAMETRI557", true);
    PAN_VALORDAAGGIO.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_VALORDAAGGIO.SetQueryIMDB(PPQRY_PARAMETRI557, IMDBDef9.PQRY_PARAMETRI557_RS, IMDBDef2.TBL_CAMPIDAAGGIO);
    JustLoaded = true;
    PAN_VALORDAAGGIO.SetFieldPrimaryIndex(PFL_VALORDAAGGIO_DATAINCASSO, IMDBDef2.FLD_CAMPIDAAGGIO_DATA_INCASSO);
    PAN_VALORDAAGGIO.SetFieldPrimaryIndex(PFL_VALORDAAGGIO_NUMEROINCASS, IMDBDef2.FLD_CAMPIDAAGGIO_NUMERO_INCASSO);
    PAN_VALORDAAGGIO.SetMasterTable(0, "CAMPIDAAGGIO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VALORDAAGGIO.Status() == 2)
    {
      int oldListQBE = PAN_VALORDAAGGIO.iUseListQBE;
      PAN_VALORDAAGGIO.iUseListQBE = 0;
      PAN_VALORDAAGGIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_VALORDAAGGIO.PanelCommand(Glb.PCM_FIND);
      PAN_VALORDAAGGIO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VALORDAAGGIO) PAN_VALORDAAGGIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VALORDAAGGIO) PAN_VALORDAAGGIO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VALORDAAGGIO) PAN_VALORDAAGGIO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VALORDAAGGIO) PAN_VALORDAAGGIO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VALORDAAGGIO) PAN_VALORDAAGGIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
