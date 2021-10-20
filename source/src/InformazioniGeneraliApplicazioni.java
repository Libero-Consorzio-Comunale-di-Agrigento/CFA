// **********************************************
// Informazioni Generali Applicazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniGeneraliApplicazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DATISESSIONE_VERSIONE = 0;

  private static int PFL_DATISESSIONE_BASEDATI = 0;
  private static int PFL_DATISESSIONE_PRODOTTO = 1;
  private static int PFL_DATISESSIONE_MODULO = 2;
  private static int PFL_DATISESSIONE_PROGETTO = 3;
  private static int PFL_DATISESSIONE_ISTANZA = 4;
  private static int PFL_DATISESSIONE_DESCRIZIONE = 5;
  private static int PFL_DATISESSIONE_SESSIONE = 6;
  private static int PFL_DATISESSIONE_ENTE = 7;
  private static int PFL_DATISESSIONE_UTENTE = 8;
  private static int PFL_DATISESSIONE_RUOLO = 9;
  private static int PFL_DATISESSIONE_USERORACLE = 10;

  private static int PPQRY_DATISESSION2 = 0;


  IDPanel PAN_DATISESSIONE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_DATISESSION2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_DATISESSION2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_DATISESSION2, 11);
    IMDB.set_TblCode(IMDBDef17.PQRY_DATISESSION2, "PQRY_DATISESSION2");
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSBASEDATI, "SESSBASEDATI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSBASEDATI,5,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOPRODOT, "SESSIOPRODOT");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOPRODOT,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOMODULO, "SESSIOMODULO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOMODULO,5,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOPROGET, "SESSIOPROGET");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOPROGET,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOISTANZ, "SESSIOISTANZ");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOISTANZ,5,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSISTADESC, "SESSISTADESC");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSISTADESC,5,40,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIONEENTE, "SESSIONEENTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIONEENTE,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOUTENTE, "SESSIOUTENTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIOUTENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIONRUOLO, "SESSIONRUOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIONRUOLO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESISTUSEORA, "SESISTUSEORA");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESISTUSEORA,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_DATISESSION2,IMDBDef17.PQSL_DATISESSION2_SESSIONE,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_DATISESSION2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniGeneraliApplicazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniGeneraliApplicazioni()
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
    FormIdx = MyGlb.FRM_INFOGENEAPPL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2727119A-D6F8-4056-B814-1C5543DFDE4B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 520;
    DesignHeight = 318;
    set_Caption(new IDVariant("Informazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 520;
    Frames[1].Height = 292;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Dati Sessione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 292;
    PAN_DATISESSIONE = new IDPanel(w, this, 1, "PAN_DATISESSIONE");
    Frames[1].Content = PAN_DATISESSIONE;
    PAN_DATISESSIONE.Lockable = false;
    PAN_DATISESSIONE.iLocked = false;
    PAN_DATISESSIONE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DATISESSIONE.VS = MainFrm.VisualStyleList;
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 520-MyGlb.PAN_OFFS_X, 292-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BE5CA7A3-88C0-40F6-8BC9-493D650642D1");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1364, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATISESSIONE.InitStatus = 2;
    PAN_DATISESSIONE_Init();
    PAN_DATISESSIONE_InitFields();
    PAN_DATISESSIONE_InitQueries();
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
      PAN_DATISESSIONE.UpdatePanel(MainFrm);
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
    return (obj instanceof InformazioniGeneraliApplicazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniGeneraliApplicazioni.class.getName() : (Glb.ClassWithPackage(InformazioniGeneraliApplicazioni.class) ? InformazioniGeneraliApplicazioni.class.getName().substring(InformazioniGeneraliApplicazioni.class.getPackage().getName().length() + 1) : InformazioniGeneraliApplicazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  
  
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
  private void PAN_DATISESSIONE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DATISESSIONE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATISESSIONE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATISESSIONE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATISESSIONE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DATISESSIONE);
    // Stub
  }

  private void PAN_DATISESSIONE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DATISESSIONE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DATISESSIONE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATISESSIONE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DATISESSIONE_Init()
  {

    PAN_DATISESSIONE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATISESSIONE.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, "DFC185D6-5F51-4E82-AE57-7E7DAB8E21EB");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, "Versione");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, MyGlb.PANEL_LIST, 0, -9999, 508, 16, 0, 0);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, MyGlb.PANEL_FORM, 24, 15, 416, 77, 0, 0);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, 0, 49);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, 1, 13);
    PAN_DATISESSIONE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, 0, 4);
    PAN_DATISESSIONE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, 1, 4);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_GROUP, GRP_DATISESSIONE_VERSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATISESSIONE.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, "8739F67E-9F7B-4AE4-B671-B00C82866C2E");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, "Base Dati");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, MyGlb.VIS_NORMALFIELDS);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, "676287A5-7E55-4475-A6CF-2416CDBC603A");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, "Prodotto");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, "Sessione Versione Prodotto");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, MyGlb.VIS_NORMFIELPADR);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, "A9D08A6E-3F51-4F45-9D1D-4E3B8270CD7E");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, "Modulo");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, "98FD026D-D349-426C-BF93-67F2F865B301");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, "Progetto");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, "5B3B0CCB-4BFD-4F83-AB48-8C7BF1C6DE96");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, "Istanza");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, "8E58EF38-5F6B-462B-A387-946167B61D45");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, "DESCRIZIONE");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, "E174CB3B-1C98-4975-B2F4-15972C49B538");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, "Sessione");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, MyGlb.VIS_NORFIEINTLUN);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, "006978E6-944D-4214-9F35-596D1D6F7FE9");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, "Ente");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, "1346BF30-4F21-4076-AB8E-F8F4604760C8");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, "Utente");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, "A51E7EAF-9A18-493B-80C7-D63323662C42");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, "Ruolo");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATISESSIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, "C6053A3C-3407-4034-B35B-CAE77EF92F0D");
    PAN_DATISESSIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, "User");
    PAN_DATISESSIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, "");
    PAN_DATISESSIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATISESSIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_DATISESSIONE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, MyGlb.PANEL_LIST, 64);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, MyGlb.PANEL_LIST, "Base Dati");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, MyGlb.PANEL_FORM, 28, 40, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, MyGlb.PANEL_FORM, 64);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_BASEDATI, MyGlb.PANEL_FORM, "Base Dati");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_BASEDATI, -1, GRP_DATISESSIONE_VERSIONE);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_BASEDATI, PPQRY_DATISESSION2, "A.VERSIONE", "SESSBASEDATI", 5, 10, 0, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, MyGlb.PANEL_LIST, 60);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, MyGlb.PANEL_LIST, "Prodotto");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, MyGlb.PANEL_FORM, 32, 68, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, MyGlb.PANEL_FORM, 60);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PRODOTTO, MyGlb.PANEL_FORM, "Prodotto");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_PRODOTTO, -1, GRP_DATISESSIONE_VERSIONE);
    PAN_DATISESSIONE.SetFieldUnbound(PFL_DATISESSIONE_PRODOTTO, true);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_PRODOTTO, PPQRY_DATISESSION2, "~~TBL_DATISESSIONE.SESSVERSPROD~~", "SESSIOPRODOT", 5, 100, 0, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, MyGlb.PANEL_LIST, "Modulo");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, MyGlb.PANEL_FORM, 36, 108, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, MyGlb.PANEL_FORM, 56);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_MODULO, MyGlb.PANEL_FORM, "Modulo");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_MODULO, -1, -1);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_MODULO, PPQRY_DATISESSION2, "B.MODULO", "SESSIOMODULO", 5, 10, 0, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, MyGlb.PANEL_LIST, 68);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, MyGlb.PANEL_LIST, "Progetto");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, MyGlb.PANEL_FORM, 284, 108, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, MyGlb.PANEL_FORM, 68);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_PROGETTO, MyGlb.PANEL_FORM, "Progetto");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_PROGETTO, -1, -1);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_PROGETTO, PPQRY_DATISESSION2, "A.PROGETTO", "SESSIOPROGET", 5, 8, 0, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, MyGlb.PANEL_LIST, 60);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, MyGlb.PANEL_LIST, "Istanza");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, MyGlb.PANEL_FORM, 32, 136, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, MyGlb.PANEL_FORM, 60);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ISTANZA, MyGlb.PANEL_FORM, "Istanza");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_ISTANZA, -1, -1);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_ISTANZA, PPQRY_DATISESSION2, "A.ISTANZA", "SESSIOISTANZ", 5, 10, 0, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, MyGlb.PANEL_FORM, 180, 136, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_DESCRIZIONE, -1, -1);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_DESCRIZIONE, PPQRY_DATISESSION2, "A.DESCRIZIONE", "SESSISTADESC", 5, 40, 0, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, MyGlb.PANEL_LIST, 60);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, MyGlb.PANEL_LIST, "Sessione");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, MyGlb.PANEL_FORM, 220, 164, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, MyGlb.PANEL_FORM, 120);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_SESSIONE, MyGlb.PANEL_FORM, "Sessione");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_SESSIONE, -1, -1);
    PAN_DATISESSIONE.SetFieldUnbound(PFL_DATISESSIONE_SESSIONE, true);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_SESSIONE, PPQRY_DATISESSION2, "" + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "", "SESSIONE", 3, 28, 6, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, MyGlb.PANEL_LIST, 36);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, MyGlb.PANEL_LIST, "Ente");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, MyGlb.PANEL_FORM, 56, 164, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, MyGlb.PANEL_FORM, 36);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_ENTE, MyGlb.PANEL_FORM, "Ente");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_ENTE, -1, -1);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_ENTE, PPQRY_DATISESSION2, "A.ENTE", "SESSIONEENTE", 5, 4, 0, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, MyGlb.PANEL_LIST, 52);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, MyGlb.PANEL_FORM, 40, 192, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, MyGlb.PANEL_FORM, 52);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_UTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_UTENTE, -1, -1);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_UTENTE, PPQRY_DATISESSION2, "B.UTENTE", "SESSIOUTENTE", 5, 8, 0, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, MyGlb.PANEL_LIST, 48);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, MyGlb.PANEL_LIST, "Ruolo");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, MyGlb.PANEL_FORM, 296, 192, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, MyGlb.PANEL_FORM, 44);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_RUOLO, MyGlb.PANEL_FORM, "Ruolo");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_RUOLO, -1, -1);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_RUOLO, PPQRY_DATISESSION2, "B.RUOLO", "SESSIONRUOLO", 5, 8, 0, -13997);
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, MyGlb.PANEL_LIST, 84);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, MyGlb.PANEL_LIST, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, MyGlb.PANEL_LIST, "User");
    PAN_DATISESSIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, MyGlb.PANEL_FORM, 56, 224, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATISESSIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, MyGlb.PANEL_FORM, 36);
    PAN_DATISESSIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, MyGlb.PANEL_FORM, 1);
    PAN_DATISESSIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATISESSIONE_USERORACLE, MyGlb.PANEL_FORM, "User");
    PAN_DATISESSIONE.SetFieldPage(PFL_DATISESSIONE_USERORACLE, -1, -1);
    PAN_DATISESSIONE.SetFieldPanel(PFL_DATISESSIONE_USERORACLE, PPQRY_DATISESSION2, "A.USER_ORACLE", "SESISTUSEORA", 5, 20, 0, -13997);
  }

  private void PAN_DATISESSIONE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATISESSIONE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATISESSIONE.SetIMDB(IMDB, "PQRY_DATISESSION2", true);
    PAN_DATISESSIONE.set_SetString(MyGlb.MASTER_ROWNAME, "Sessione");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.VERSIONE as SESSBASEDATI, ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSVERSPROD~~ as SESSIOPRODOT, ");
    SQL.append("  B.MODULO as SESSIOMODULO, ");
    SQL.append("  A.PROGETTO as SESSIOPROGET, ");
    SQL.append("  A.ISTANZA as SESSIOISTANZ, ");
    SQL.append("  A.DESCRIZIONE as SESSISTADESC, ");
    SQL.append("  A.ENTE as SESSIONEENTE, ");
    SQL.append("  B.UTENTE as SESSIOUTENTE, ");
    SQL.append("  B.RUOLO as SESSIONRUOLO, ");
    SQL.append("  A.USER_ORACLE as SESISTUSEORA, ");
    SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " as SESSIONE ");
    PAN_DATISESSIONE.SetQuery(PPQRY_DATISESSION2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  AD4_ISTANZE A, ");
    SQL.append("  AD4_DIRITTI_ACCESSO B ");
    PAN_DATISESSIONE.SetQuery(PPQRY_DATISESSION2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (B.ISTANZA = A.ISTANZA) ");
    SQL.append("and   (B.UTENTE = ~~TBL_DATISESSIONE.SESSUSERNAME~~) ");
    SQL.append("and   (B.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    PAN_DATISESSIONE.SetQuery(PPQRY_DATISESSION2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATISESSIONE.SetQuery(PPQRY_DATISESSION2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATISESSIONE.SetQuery(PPQRY_DATISESSION2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATISESSIONE.SetQuery(PPQRY_DATISESSION2, 5, SQL, -1, "");
    PAN_DATISESSIONE.SetQueryDB(PPQRY_DATISESSION2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DATISESSIONE.SetMasterTable(0, "AD4_ISTANZE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATISESSIONE.Status() == 2)
    {
      int oldListQBE = PAN_DATISESSIONE.iUseListQBE;
      PAN_DATISESSIONE.iUseListQBE = 0;
      PAN_DATISESSIONE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATISESSIONE.PanelCommand(Glb.PCM_FIND);
      PAN_DATISESSIONE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DATISESSIONE) PAN_DATISESSIONE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATISESSIONE) PAN_DATISESSIONE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DATISESSIONE) PAN_DATISESSIONE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATISESSIONE) PAN_DATISESSIONE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DATISESSIONE) PAN_DATISESSIONE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
