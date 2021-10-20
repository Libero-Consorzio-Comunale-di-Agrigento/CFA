// **********************************************
// Schede Inventario
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchedeInventario extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCHEDEINVENT_PROGRSCHEDA = 0;
  private static int PFL_SCHEDEINVENT_DESCRIZIBENE = 1;
  private static int PFL_SCHEDEINVENT_TIPOBENE = 2;
  private static int PFL_SCHEDEINVENT_CATEGOFISCAL = 3;
  private static int PFL_SCHEDEINVENT_DESCRICATEGO = 4;
  private static int PFL_SCHEDEINVENT_CLASSIFICAZI = 5;
  private static int PFL_SCHEDEINVENT_DESCRICLASSI = 6;
  private static int PFL_SCHEDEINVENT_IMMOBILIZZAZ = 7;
  private static int PFL_SCHEDEINVENT_DESCRIIMMOBI = 8;

  private static int PPQRY_VISTSCHECIWE = 0;


  IDPanel PAN_SCHEDEINVENT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_VISTSCHECIWE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_VISTSCHECIWE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISTSCHECIWE, 9);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISTSCHECIWE, "PQRY_VISTSCHECIWE");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIPRSC, "REVISCCIPRSC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIPRSC,1,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIDEBE, "REVISCCIDEBE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIDEBE,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCITIBE, "REVISCCITIBE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCITIBE,5,11,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCICAFI, "REVISCCICAFI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCICAFI,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIDECA, "REVISCCIDECA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIDECA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_RECVISSCCICL, "RECVISSCCICL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_RECVISSCCICL,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIDECL, "REVISCCIDECL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIDECL,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_RECVISSCCIIM, "RECVISSCCIIM");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_RECVISSCCIIM,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIDEIM, "REVISCCIDEIM");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSCHECIWE,IMDBDef8.PQSL_VISTSCHECIWE_REVISCCIDEIM,5,100,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISTSCHECIWE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchedeInventario(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchedeInventario()
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
    FormIdx = MyGlb.FRM_SCHEDEINVENT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7EF74592-4FEA-4664-B2AB-19D0C49A0CB7";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1368;
    DesignHeight = 434;
    set_Caption(new IDVariant("Schede Inventario"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1368;
    Frames[1].Height = 408;
    Frames[1].Caption = "Schede Inventario";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 408;
    PAN_SCHEDEINVENT = new IDPanel(w, this, 1, "PAN_SCHEDEINVENT");
    Frames[1].Content = PAN_SCHEDEINVENT;
    PAN_SCHEDEINVENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCHEDEINVENT.VS = MainFrm.VisualStyleList;
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1368-MyGlb.PAN_OFFS_X, 408-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4CC9CF5C-1625-436F-B5BB-8B39995EC05F");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1308, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCHEDEINVENT.InitStatus = 2;
    PAN_SCHEDEINVENT_Init();
    PAN_SCHEDEINVENT_InitFields();
    PAN_SCHEDEINVENT_InitQueries();
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
      PAN_SCHEDEINVENT.UpdatePanel(MainFrm);
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
    return (obj instanceof SchedeInventario);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchedeInventario.class.getName() : (Glb.ClassWithPackage(SchedeInventario.class) ? SchedeInventario.class.getName().substring(SchedeInventario.class.getPackage().getName().length() + 1) : SchedeInventario.class.getName()));
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
  private void PAN_SCHEDEINVENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCHEDEINVENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCHEDEINVENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCHEDEINVENT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCHEDEINVENT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCHEDEINVENT);
    // Stub
  }

  private void PAN_SCHEDEINVENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCHEDEINVENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCHEDEINVENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCHEDEINVENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCHEDEINVENT_Init()
  {

    PAN_SCHEDEINVENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCHEDEINVENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCHEDEINVENT.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, "B9C6CF59-7904-4F00-A5AF-979667C1D880");
    PAN_SCHEDEINVENT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, "Scheda Inventario");
    PAN_SCHEDEINVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, "");
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, "D174745B-CA1D-4950-BEFB-DB81BFB93134");
    PAN_SCHEDEINVENT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, "Descrizione Bene");
    PAN_SCHEDEINVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, "");
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, "47B380CD-CF52-405E-8F03-A99A17C3AC0F");
    PAN_SCHEDEINVENT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, "Tipo Bene");
    PAN_SCHEDEINVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, "");
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, "E1573C4B-ADEB-4501-B731-50ED95E8B555");
    PAN_SCHEDEINVENT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, "Categoria");
    PAN_SCHEDEINVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, "");
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, "41F891DE-20AF-40FB-9E25-223560D728B8");
    PAN_SCHEDEINVENT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, "Descrizione Categoria");
    PAN_SCHEDEINVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, "");
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, "5EE885DC-E3F2-4001-94DD-2E0D520491AA");
    PAN_SCHEDEINVENT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, "Classificazione");
    PAN_SCHEDEINVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, "");
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, "5FC646B2-B405-47B6-902A-6118F0783504");
    PAN_SCHEDEINVENT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, "Descrizione Classificazione");
    PAN_SCHEDEINVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, "");
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, "EF1B98CC-29A5-466F-9E14-5F78B3D9A29F");
    PAN_SCHEDEINVENT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, "Immobilizzazione");
    PAN_SCHEDEINVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, "");
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDEINVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, "C487BC4D-D04D-4801-B601-B0E391660740");
    PAN_SCHEDEINVENT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, "Descrizione Immobilizzazione");
    PAN_SCHEDEINVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, "");
    PAN_SCHEDEINVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEINVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCHEDEINVENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, MyGlb.PANEL_LIST, 96);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, MyGlb.PANEL_LIST, "Scheda Inventario");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_PROGRSCHEDA, MyGlb.PANEL_FORM, "Sch. Inventario");
    PAN_SCHEDEINVENT.SetFieldPage(PFL_SCHEDEINVENT_PROGRSCHEDA, -1, -1);
    PAN_SCHEDEINVENT.SetFieldPanel(PFL_SCHEDEINVENT_PROGRSCHEDA, PPQRY_VISTSCHECIWE, "A.PROGR_SCHEDA", "REVISCCIPRSC", 1, 9, 0, -13997);
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, MyGlb.PANEL_LIST, 88, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, MyGlb.PANEL_LIST, 112);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, MyGlb.PANEL_LIST, "Descrizione Bene");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, MyGlb.PANEL_FORM, 4, 28, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, MyGlb.PANEL_FORM, 112);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIZIBENE, MyGlb.PANEL_FORM, "Descrizione Bene");
    PAN_SCHEDEINVENT.SetFieldPage(PFL_SCHEDEINVENT_DESCRIZIBENE, -1, -1);
    PAN_SCHEDEINVENT.SetFieldPanel(PFL_SCHEDEINVENT_DESCRIZIBENE, PPQRY_VISTSCHECIWE, "A.DESCRIZIONE_BENE", "REVISCCIDEBE", 5, 100, 0, -13997);
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, MyGlb.PANEL_LIST, 296, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, MyGlb.PANEL_LIST, 64);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, MyGlb.PANEL_LIST, "Tipo Bene");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, MyGlb.PANEL_FORM, 4, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, MyGlb.PANEL_FORM, 64);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_TIPOBENE, MyGlb.PANEL_FORM, "Tipo Bene");
    PAN_SCHEDEINVENT.SetFieldPage(PFL_SCHEDEINVENT_TIPOBENE, -1, -1);
    PAN_SCHEDEINVENT.SetFieldPanel(PFL_SCHEDEINVENT_TIPOBENE, PPQRY_VISTSCHECIWE, "A.TIPO_BENE", "REVISCCITIBE", 5, 11, 0, -13997);
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, MyGlb.PANEL_LIST, 360, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, MyGlb.PANEL_LIST, 124);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, MyGlb.PANEL_LIST, "Categoria");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, MyGlb.PANEL_FORM, 124);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CATEGOFISCAL, MyGlb.PANEL_FORM, "Categoria");
    PAN_SCHEDEINVENT.SetFieldPage(PFL_SCHEDEINVENT_CATEGOFISCAL, -1, -1);
    PAN_SCHEDEINVENT.SetFieldPanel(PFL_SCHEDEINVENT_CATEGOFISCAL, PPQRY_VISTSCHECIWE, "A.CATEGORIA_FISCALE", "REVISCCICAFI", 1, 2, 0, -13997);
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, MyGlb.PANEL_LIST, 432, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, MyGlb.PANEL_LIST, 152);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, MyGlb.PANEL_LIST, "Descrizione Categoria");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, MyGlb.PANEL_FORM, 4, 100, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, MyGlb.PANEL_FORM, 152);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICATEGO, MyGlb.PANEL_FORM, "Descrizione Categoria");
    PAN_SCHEDEINVENT.SetFieldPage(PFL_SCHEDEINVENT_DESCRICATEGO, -1, -1);
    PAN_SCHEDEINVENT.SetFieldPanel(PFL_SCHEDEINVENT_DESCRICATEGO, PPQRY_VISTSCHECIWE, "A.DESCRIZIONE_CATEGORIA", "REVISCCIDECA", 5, 60, 0, -13997);
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, MyGlb.PANEL_LIST, 620, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, MyGlb.PANEL_LIST, 108);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, MyGlb.PANEL_LIST, "Classificazione");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, MyGlb.PANEL_FORM, 4, 124, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, MyGlb.PANEL_FORM, 108);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_CLASSIFICAZI, MyGlb.PANEL_FORM, "Classificazione");
    PAN_SCHEDEINVENT.SetFieldPage(PFL_SCHEDEINVENT_CLASSIFICAZI, -1, -1);
    PAN_SCHEDEINVENT.SetFieldPanel(PFL_SCHEDEINVENT_CLASSIFICAZI, PPQRY_VISTSCHECIWE, "A.CLASSIFICAZIONE", "RECVISSCCICL", 5, 10, 0, -13997);
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, MyGlb.PANEL_LIST, 728, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, MyGlb.PANEL_LIST, 184);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, MyGlb.PANEL_LIST, "Descrizione Classificazione");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, MyGlb.PANEL_FORM, 4, 148, 696, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, MyGlb.PANEL_FORM, 184);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRICLASSI, MyGlb.PANEL_FORM, "Descrizione Classificazione");
    PAN_SCHEDEINVENT.SetFieldPage(PFL_SCHEDEINVENT_DESCRICLASSI, -1, -1);
    PAN_SCHEDEINVENT.SetFieldPanel(PFL_SCHEDEINVENT_DESCRICLASSI, PPQRY_VISTSCHECIWE, "A.DESCRIZIONE_CLASSIFICAZIONE", "REVISCCIDECL", 5, 100, 0, -13997);
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, MyGlb.PANEL_LIST, 928, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, MyGlb.PANEL_LIST, 120);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, MyGlb.PANEL_LIST, "Immobilizzazione");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, MyGlb.PANEL_FORM, 120);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_IMMOBILIZZAZ, MyGlb.PANEL_FORM, "Immobilizzazione");
    PAN_SCHEDEINVENT.SetFieldPage(PFL_SCHEDEINVENT_IMMOBILIZZAZ, -1, -1);
    PAN_SCHEDEINVENT.SetFieldPanel(PFL_SCHEDEINVENT_IMMOBILIZZAZ, PPQRY_VISTSCHECIWE, "A.IMMOBILIZZAZIONE", "RECVISSCCIIM", 5, 10, 0, -13997);
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, MyGlb.PANEL_LIST, 1048, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, MyGlb.PANEL_LIST, 196);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, MyGlb.PANEL_LIST, "Descrizione Immobilizzazione");
    PAN_SCHEDEINVENT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, MyGlb.PANEL_FORM, 4, 196, 708, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEINVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, MyGlb.PANEL_FORM, 196);
    PAN_SCHEDEINVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEINVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEINVENT_DESCRIIMMOBI, MyGlb.PANEL_FORM, "Descrizione Immobilizzazione");
    PAN_SCHEDEINVENT.SetFieldPage(PFL_SCHEDEINVENT_DESCRIIMMOBI, -1, -1);
    PAN_SCHEDEINVENT.SetFieldPanel(PFL_SCHEDEINVENT_DESCRIIMMOBI, PPQRY_VISTSCHECIWE, "A.DESCRIZIONE_IMMOBILIZZAZIONE", "REVISCCIDEIM", 5, 100, 0, -13997);
  }

  private void PAN_SCHEDEINVENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCHEDEINVENT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCHEDEINVENT.SetIMDB(IMDB, "PQRY_VISTSCHECIWE", true);
    PAN_SCHEDEINVENT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_SCHEDA as REVISCCIPRSC, ");
    SQL.append("  A.DESCRIZIONE_BENE as REVISCCIDEBE, ");
    SQL.append("  A.TIPO_BENE as REVISCCITIBE, ");
    SQL.append("  A.CATEGORIA_FISCALE as REVISCCICAFI, ");
    SQL.append("  A.DESCRIZIONE_CATEGORIA as REVISCCIDECA, ");
    SQL.append("  A.CLASSIFICAZIONE as RECVISSCCICL, ");
    SQL.append("  A.DESCRIZIONE_CLASSIFICAZIONE as REVISCCIDECL, ");
    SQL.append("  A.IMMOBILIZZAZIONE as RECVISSCCIIM, ");
    SQL.append("  A.DESCRIZIONE_IMMOBILIZZAZIONE as REVISCCIDEIM ");
    PAN_SCHEDEINVENT.SetQuery(PPQRY_VISTSCHECIWE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_SCHEDE_CIWEB A ");
    PAN_SCHEDEINVENT.SetQuery(PPQRY_VISTSCHECIWE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDEINVENT.SetQuery(PPQRY_VISTSCHECIWE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDEINVENT.SetQuery(PPQRY_VISTSCHECIWE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDEINVENT.SetQuery(PPQRY_VISTSCHECIWE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGR_SCHEDA ");
    PAN_SCHEDEINVENT.SetQuery(PPQRY_VISTSCHECIWE, 5, SQL, -1, "");
    PAN_SCHEDEINVENT.SetQueryDB(PPQRY_VISTSCHECIWE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEDEINVENT.SetMasterTable(0, "VISTA_SCHEDE_CIWEB");
    PAN_SCHEDEINVENT.AddToSortList(PFL_SCHEDEINVENT_PROGRSCHEDA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCHEDEINVENT.Status() == 2)
    {
      int oldListQBE = PAN_SCHEDEINVENT.iUseListQBE;
      PAN_SCHEDEINVENT.iUseListQBE = 0;
      PAN_SCHEDEINVENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCHEDEINVENT.PanelCommand(Glb.PCM_FIND);
      PAN_SCHEDEINVENT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCHEDEINVENT) PAN_SCHEDEINVENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEDEINVENT) PAN_SCHEDEINVENT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCHEDEINVENT) PAN_SCHEDEINVENT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEDEINVENT) PAN_SCHEDEINVENT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCHEDEINVENT) PAN_SCHEDEINVENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
