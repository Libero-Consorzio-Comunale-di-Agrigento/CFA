// **********************************************
// Scelta Tipo Variazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaTipoVariazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SCELTIPOVARI_QUADRATURA = 0;
  private static int GRP_SCELTIPOVARI_ALTRICONTROL = 1;

  private static int PFL_SCELTIPOVARI_CODICE = 0;
  private static int PFL_SCELTIPOVARI_DESCRIZIONE = 1;
  private static int PFL_SCELTIPOVARI_MOTIVAZIONE = 2;
  private static int PFL_SCELTIPOVARI_TIPOIMPORTO = 3;
  private static int PFL_SCELTIPOVARI_PARTE = 4;
  private static int PFL_SCELTIPOVARI_TIPO = 5;
  private static int PFL_SCELTIPOVARI_OBBLIGCOMPET = 6;
  private static int PFL_SCELTIPOVARI_OBBLIGCASSA = 7;
  private static int PFL_SCELTIPOVARI_TIPOVARIAZIO = 8;
  private static int PFL_SCELTIPOVARI_TIPOLOGIA = 9;

  private static int PPQRY_T81 = 0;

  private static int PPQRY_TIPIIMPOVBIL = 1;


  IDPanel PAN_SCELTIPOVARI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T81(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T81(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_T81, 9);
    IMDB.set_TblCode(IMDBDef7.PQRY_T81, "PQRY_T81");
    IMDB.set_FldCode(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDCODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDDESCRI,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECOTIPOIMPO, "RECOTIPOIMPO");
    IMDB.SetFldParams(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECOTIPOIMPO,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDPARTE, "RECORDPARTE");
    IMDB.SetFldParams(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDTIPO, "RECORDTIPO");
    IMDB.SetFldParams(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDTIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECOOBBLCOMP, "RECOOBBLCOMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECOOBBLCOMP,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDMOTIVA, "RECORDMOTIVA");
    IMDB.SetFldParams(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORDMOTIVA,5,100,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECOOBBLCASS, "RECOOBBLCASS");
    IMDB.SetFldParams(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECOOBBLCASS,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORT54TIPO, "RECORT54TIPO");
    IMDB.SetFldParams(IMDBDef7.PQRY_T81,IMDBDef7.PQSL_T81_RECORT54TIPO,5,3,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_T81, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaTipoVariazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaTipoVariazione()
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
    FormIdx = MyGlb.FRM_SCELTIPOVARI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1FF60D02-26AE-4AAD-89AA-6EE78347AB4C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 884;
    DesignHeight = 378;
    set_Caption(new IDVariant("Scelta Tipo Variazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 884;
    Frames[1].Height = 352;
    Frames[1].Caption = "Scelta Tipo Variazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_SCELTIPOVARI = new IDPanel(w, this, 1, "PAN_SCELTIPOVARI");
    Frames[1].Content = PAN_SCELTIPOVARI;
    PAN_SCELTIPOVARI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTIPOVARI.VS = MainFrm.VisualStyleList;
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 884-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FD2E1108-7AB3-48ED-B771-9C7DF027129C");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1136, 256, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTIPOVARI.InitStatus = 2;
    PAN_SCELTIPOVARI_Init();
    PAN_SCELTIPOVARI_InitFields();
    PAN_SCELTIPOVARI_InitQueries();
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
      PAN_SCELTIPOVARI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaTipoVariazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaTipoVariazione.class.getName() : (Glb.ClassWithPackage(SceltaTipoVariazione.class) ? SceltaTipoVariazione.class.getName().substring(SceltaTipoVariazione.class.getPackage().getName().length() + 1) : SceltaTipoVariazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Tipo Variazione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTIPOVARI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTIPOVARI);
      // 
      // Scelta Tipo Variazione On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_SCELTIPOVARI.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTIPOVARI_DESCRIZIONE,(new IDVariant(PAN_SCELTIPOVARI.FieldText(PFL_SCELTIPOVARI_DESCRIZIONE))).stringValue()); 
      PAN_SCELTIPOVARI.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTIPOVARI_MOTIVAZIONE,(new IDVariant(PAN_SCELTIPOVARI.FieldText(PFL_SCELTIPOVARI_MOTIVAZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTipoVariazione", "SceltaTipoVariazioneOnDynamicProperties", _e);
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
  private void PAN_SCELTIPOVARI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTIPOVARI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTIPOVARI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTIPOVARI, Cancel);
    // Stub
  }

  private void PAN_SCELTIPOVARI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTIPOVARI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTIPOVARI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTIPOVARI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTIPOVARI_Init()
  {

    PAN_SCELTIPOVARI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTIPOVARI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, "0A1F0E2B-0968-4666-AC61-5007A48CD27B");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, "Quadratura");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, MyGlb.PANEL_LIST, 812, -9999, 324, 16, 0, 0);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, MyGlb.PANEL_FORM, 0, 75, 224, 121, 0, 0);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, 0, 65);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, 1, 13);
    PAN_SCELTIPOVARI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, 0, 4);
    PAN_SCELTIPOVARI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, 1, 4);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_QUADRATURA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, "7F3FBFD1-DD9F-42EA-88E4-5ABFEC1B948E");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, "Altri Controlli");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, 0, 74);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, 1, 13);
    PAN_SCELTIPOVARI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, 0, 4);
    PAN_SCELTIPOVARI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, 1, 4);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTIPOVARI_ALTRICONTROL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTIPOVARI.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, "5B7EB7F6-52F2-40D1-91A2-2BF07E91F1DB");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, "Codice");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, "2988C733-C6B9-4BD6-91F2-6D4B0757A404");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, "Descrizione");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, "92E558B4-9C00-4486-8C36-379959D49437");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, " Motivazione");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, "728BEE04-54BB-478D-99A2-0A9E21924091");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, "Tipo Importo");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, "858F1D97-922D-49AC-9371-EE57BF5A214D");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, "Parte");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, "70277271-BA0D-4B50-9E56-B5FE9B97272E");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, "Tipo ");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, "6E1D5E6B-9DB2-4CD6-B0A1-0B026A2729CB");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, "Obblig. Competenza");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, MyGlb.VIS_CHECKSTYLE);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, "3EEA0276-8863-4104-9F74-D3D0F29E4FEF");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, "Obblig. Cassa");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, MyGlb.VIS_CHECKSTYLE);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, "03246EDD-B39E-47F9-A638-7E9D9292F07E");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTIPOVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, "D83FD2FB-A51B-454D-92F9-F9B292E65094");
    PAN_SCELTIPOVARI.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, "TIPOLOGIA");
    PAN_SCELTIPOVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, "");
    PAN_SCELTIPOVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTIPOVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTIPOVARI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, MyGlb.PANEL_FORM, 4, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_CODICE, -1, -1);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_CODICE, PPQRY_T81, "A.CODICE", "RECORDCODICE", 1, 2, 0, -13997);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, MyGlb.PANEL_LIST, 52, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_DESCRIZIONE, -1, -1);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_DESCRIZIONE, PPQRY_T81, "A.DESCRIZIONE", "RECORDDESCRI", 5, 40, 0, -13997);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, MyGlb.PANEL_LIST, 328, 36, 284, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, MyGlb.PANEL_LIST, 84);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, MyGlb.PANEL_LIST, " Motivazione");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, MyGlb.PANEL_FORM, 4, 148, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, MyGlb.PANEL_FORM, 84);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_MOTIVAZIONE, MyGlb.PANEL_FORM, " Motivazione");
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_MOTIVAZIONE, -1, -1);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_MOTIVAZIONE, PPQRY_T81, "B.DESCRIZIONE", "RECORDMOTIVA", 5, 100, 0, -13997);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, MyGlb.PANEL_LIST, 612, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, MyGlb.PANEL_LIST, 92);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, MyGlb.PANEL_LIST, "Tipo Importo");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, MyGlb.PANEL_FORM, 92);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOIMPORTO, MyGlb.PANEL_FORM, "Tipo Importo");
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_TIPOIMPORTO, -1, -1);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_TIPOIMPORTO, PPQRY_T81, "B.TIPO_IMPORTO", "RECOTIPOIMPO", 5, 2, 0, -13997);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, MyGlb.PANEL_LIST, 728, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, MyGlb.PANEL_LIST, 44);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, MyGlb.PANEL_FORM, 4, 76, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, MyGlb.PANEL_FORM, 44);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_PARTE, -1, -1);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_PARTE, PPQRY_T81, "B.PARTE", "RECORDPARTE", 5, 2, 0, -13997);
    PAN_SCELTIPOVARI.SetValueListItem(PFL_SCELTIPOVARI_PARTE, (new IDVariant("E")), "Entrate", "", "", -1);
    PAN_SCELTIPOVARI.SetValueListItem(PFL_SCELTIPOVARI_PARTE, (new IDVariant("S")), "Spese", "", "", -1);
    PAN_SCELTIPOVARI.SetValueListItem(PFL_SCELTIPOVARI_PARTE, (new IDVariant("ES")), "Entrate e Spese", "", "", -1);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, MyGlb.PANEL_LIST, 812, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, MyGlb.PANEL_LIST, 120);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, MyGlb.PANEL_LIST, "Tipo ");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, MyGlb.PANEL_FORM, 120);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPO, MyGlb.PANEL_FORM, "Tipo ");
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_TIPO, -1, GRP_SCELTIPOVARI_QUADRATURA);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_TIPO, PPQRY_T81, "B.TIPO_QUADRATURA", "RECORDTIPO", 5, 2, 0, -13997);
    PAN_SCELTIPOVARI.SetValueListItem(PFL_SCELTIPOVARI_TIPO, (new IDVariant("ES")), "Entrate-Spese", "", "", -1);
    PAN_SCELTIPOVARI.SetValueListItem(PFL_SCELTIPOVARI_TIPO, (new IDVariant("PM")), "Positive-Negative", "", "", -1);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, MyGlb.PANEL_LIST, 932, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, MyGlb.PANEL_LIST, 132);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, MyGlb.PANEL_LIST, "Obblig. Competenza");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, MyGlb.PANEL_FORM, 132);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCOMPET, MyGlb.PANEL_FORM, "Obblig. Competenza");
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_OBBLIGCOMPET, -1, GRP_SCELTIPOVARI_QUADRATURA);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_OBBLIGCOMPET, PPQRY_T81, "B.QUADRATURA_OBBLIG", "RECOOBBLCOMP", 5, 2, 0, -13997);
    PAN_SCELTIPOVARI.SetValueListItem(PFL_SCELTIPOVARI_OBBLIGCOMPET, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTIPOVARI.SetValueListItem(PFL_SCELTIPOVARI_OBBLIGCOMPET, (new IDVariant()), "Null", "", "", -1);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, MyGlb.PANEL_LIST, 1052, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, MyGlb.PANEL_LIST, 172);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, MyGlb.PANEL_LIST, "Obblig. Cassa");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, MyGlb.PANEL_FORM, 4, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, MyGlb.PANEL_FORM, 172);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_OBBLIGCASSA, MyGlb.PANEL_FORM, "Obblig. Cassa");
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_OBBLIGCASSA, -1, GRP_SCELTIPOVARI_QUADRATURA);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_OBBLIGCASSA, PPQRY_T81, "B.QUADRATURA_OBBLIG_CASSA", "RECOOBBLCASS", 5, 2, 0, -13997);
    PAN_SCELTIPOVARI.SetValueListItem(PFL_SCELTIPOVARI_OBBLIGCASSA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTIPOVARI.SetValueListItem(PFL_SCELTIPOVARI_OBBLIGCASSA, (new IDVariant()), "Null", "", "", -1);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 0, 0, 328, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 0);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 2);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 0, 0, 260, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 0);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 2);
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_TIPOVARIAZIO, -1, -1);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_TIPOVARIAZIO, -1, "", "TIPOVARIAZIO", 0, 0, 0, -13997);
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, MyGlb.PANEL_LIST, 1136, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, MyGlb.PANEL_LIST, 72);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, MyGlb.PANEL_LIST, "TIPOLOGIA");
    PAN_SCELTIPOVARI.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, MyGlb.PANEL_FORM, 4, 196, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIPOVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, MyGlb.PANEL_FORM, 72);
    PAN_SCELTIPOVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIPOVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIPOVARI_TIPOLOGIA, MyGlb.PANEL_FORM, "TIPOLOGIA");
    PAN_SCELTIPOVARI.SetFieldPage(PFL_SCELTIPOVARI_TIPOLOGIA, -1, -1);
    PAN_SCELTIPOVARI.SetFieldPanel(PFL_SCELTIPOVARI_TIPOLOGIA, PPQRY_T81, "A.TIPOLOGIA", "RECORT54TIPO", 5, 3, 0, -13997);
  }

  private void PAN_SCELTIPOVARI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTIPOVARI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIMPVBICOD, ");
    SQL.append("  A.DESCRIZIONE as TIPIMPVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_IMPORTO_VBIL A ");
    SQL.append("where (A.CODICE = ~~RECOTIPOIMPO~~) ");
    PAN_SCELTIPOVARI.SetQuery(PPQRY_TIPIIMPOVBIL, 0, SQL, PFL_SCELTIPOVARI_TIPOIMPORTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIMPVBICOD, ");
    SQL.append("  A.DESCRIZIONE as TIPIMPVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_IMPORTO_VBIL A ");
    PAN_SCELTIPOVARI.SetQuery(PPQRY_TIPIIMPOVBIL, 1, SQL, PFL_SCELTIPOVARI_TIPOIMPORTO, "");
    PAN_SCELTIPOVARI.SetQueryDB(PPQRY_TIPIIMPOVBIL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTIPOVARI.SetIMDB(IMDB, "PQRY_T81", true);
    PAN_SCELTIPOVARI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.DESCRIZIONE as RECORDDESCRI, ");
    SQL.append("  B.TIPO_IMPORTO as RECOTIPOIMPO, ");
    SQL.append("  B.PARTE as RECORDPARTE, ");
    SQL.append("  B.TIPO_QUADRATURA as RECORDTIPO, ");
    SQL.append("  B.QUADRATURA_OBBLIG as RECOOBBLCOMP, ");
    SQL.append("  B.DESCRIZIONE as RECORDMOTIVA, ");
    SQL.append("  B.QUADRATURA_OBBLIG_CASSA as RECOOBBLCASS, ");
    SQL.append("  A.TIPOLOGIA as RECORT54TIPO ");
    PAN_SCELTIPOVARI.SetQuery(PPQRY_T81, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T54 A, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
    PAN_SCELTIPOVARI.SetQuery(PPQRY_T81, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPOLOGIA = B.CODICE) ");
    PAN_SCELTIPOVARI.SetQuery(PPQRY_T81, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTIPOVARI.SetQuery(PPQRY_T81, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTIPOVARI.SetQuery(PPQRY_T81, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE, ");
    SQL.append("  B.DESCRIZIONE ");
    PAN_SCELTIPOVARI.SetQuery(PPQRY_T81, 5, SQL, -1, "");
    PAN_SCELTIPOVARI.SetQueryDB(PPQRY_T81, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTIPOVARI.SetMasterTable(0, "T54");
    PAN_SCELTIPOVARI.AddToSortList(PFL_SCELTIPOVARI_CODICE, true);
    PAN_SCELTIPOVARI.AddToSortList(PFL_SCELTIPOVARI_MOTIVAZIONE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTIPOVARI.Status() == 2)
    {
      int oldListQBE = PAN_SCELTIPOVARI.iUseListQBE;
      PAN_SCELTIPOVARI.iUseListQBE = 0;
      PAN_SCELTIPOVARI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTIPOVARI.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTIPOVARI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTIPOVARI) PAN_SCELTIPOVARI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTIPOVARI) PAN_SCELTIPOVARI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTIPOVARI) PAN_SCELTIPOVARI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTIPOVARI) PAN_SCELTIPOVARI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTIPOVARI) PAN_SCELTIPOVARI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
