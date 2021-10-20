// **********************************************
// Verifica Base Dati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VerificaBaseDati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_USEROBJECTS_OBJECTNAME = 0;
  private static int PFL_USEROBJECTS_OBJECTTYPE = 1;
  private static int PFL_USEROBJECTS_STATUS = 2;
  private static int PFL_USEROBJECTS_TABLEOWNER = 3;
  private static int PFL_USEROBJECTS_STATUSTRIGGE = 4;
  private static int PFL_USEROBJECTS_INVALIDO = 5;
  private static int PFL_USEROBJECTS_DISABILITATO = 6;
  private static int PFL_USEROBJECTS_ETICSONOPRES = 7;
  private static int PFL_USEROBJECTS_ETICOGGEINVA = 8;
  private static int PFL_USEROBJECTS_ETICHECOMPIL = 9;

  private static int PPQRY_DBAOBJECTS = 0;


  IDPanel PAN_USEROBJECTS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_DBAOBJECTS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_DBAOBJECTS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_DBAOBJECTS, 7);
    IMDB.set_TblCode(IMDBDef17.PQRY_DBAOBJECTS, "PQRY_DBAOBJECTS");
    IMDB.set_FldCode(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBAOBJOBJNAM, "DBAOBJOBJNAM");
    IMDB.SetFldParams(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBAOBJOBJNAM,5,128,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBAOBJOBJTYP, "DBAOBJOBJTYP");
    IMDB.SetFldParams(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBAOBJOBJTYP,5,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBAOBJECSTAT, "DBAOBJECSTAT");
    IMDB.SetFldParams(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBAOBJECSTAT,5,7,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBOBUSTRTAOW, "DBOBUSTRTAOW");
    IMDB.SetFldParams(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBOBUSTRTAOW,5,30,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBAOBJSTATRI, "DBAOBJSTATRI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DBAOBJSTATRI,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_INVALIDO, "INVALIDO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_INVALIDO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DISABILITATO, "DISABILITATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DBAOBJECTS,IMDBDef17.PQSL_DBAOBJECTS_DISABILITATO,1,19,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_DBAOBJECTS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VerificaBaseDati(MyWebEntryPoint w, IMDBObj imdb)
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
  public VerificaBaseDati()
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
    FormIdx = MyGlb.FRM_VERIBASEDATI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B7394E7E-26C4-48B4-8721-796BA6493C6F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 732;
    DesignHeight = 454;
    set_Caption(new IDVariant("Verifica Base Dati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 732;
    Frames[1].Height = 428;
    Frames[1].Caption = "Oggetti invailidi o disabilitati";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 428;
    PAN_USEROBJECTS = new IDPanel(w, this, 1, "PAN_USEROBJECTS");
    Frames[1].Content = PAN_USEROBJECTS;
    PAN_USEROBJECTS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_USEROBJECTS.VS = MainFrm.VisualStyleList;
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 732-MyGlb.PAN_OFFS_X, 428-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "61303187-65F6-4266-A4F4-145F7EC263F0");
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 52, 628, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_USEROBJECTS.InitStatus = 2;
    PAN_USEROBJECTS_Init();
    PAN_USEROBJECTS_InitFields();
    PAN_USEROBJECTS_InitQueries();
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
      PAN_USEROBJECTS.UpdatePanel(MainFrm);
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
    return (obj instanceof VerificaBaseDati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VerificaBaseDati.class.getName() : (Glb.ClassWithPackage(VerificaBaseDati.class) ? VerificaBaseDati.class.getName().substring(VerificaBaseDati.class.getPackage().getName().length() + 1) : VerificaBaseDati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // USER OBJECTS After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_USEROBJECTS_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // USER OBJECTS After Find Body
      // Corpo Procedura
      // 
      IDVariant v_OGGETTINVALI = new IDVariant(0,IDVariant.STRING);
      v_OGGETTINVALI = (new IDVariant(" oggetti invalidi"));
      IDVariant v_TRIGGEDISABI = new IDVariant(0,IDVariant.STRING);
      v_TRIGGEDISABI = (new IDVariant(" trigger disabilitati"));
      PAN_USEROBJECTS.set_FieldText(PFL_USEROBJECTS_ETICOGGEINVA, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(PAN_USEROBJECTS.GetFieldSum(PFL_USEROBJECTS_INVALIDO)), v_OGGETTINVALI), (new IDVariant("<BR/>"))), IDL.ToString(PAN_USEROBJECTS.GetFieldSum(PFL_USEROBJECTS_DISABILITATO))), v_TRIGGEDISABI).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaBaseDati", "USEROBJECTSAfterFind", _e);
    }
  }

  // **********************************************************************
  // Etichetta Conferma
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaConferma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Conferma Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.CompileAll();
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      PAN_USEROBJECTS.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaBaseDati", "EtichettaConferma", _e);
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
  private void PAN_USEROBJECTS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_USEROBJECTS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_USEROBJECTS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_USEROBJECTS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_USEROBJECTS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_USEROBJECTS);
    // Stub
  }

  private void PAN_USEROBJECTS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_USEROBJECTS_ETICHECOMPIL)
    {
      this.IdxPanelActived = this.PAN_USEROBJECTS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaConferma();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_USEROBJECTS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_USEROBJECTS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_USEROBJECTS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_USEROBJECTS_Init()
  {

    PAN_USEROBJECTS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_USEROBJECTS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_USEROBJECTS.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, "6AA87F2B-F5ED-4EBD-9413-49DA4E12F327");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, "Nome");
    PAN_USEROBJECTS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, "");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, MyGlb.VIS_NORMALFIELDS);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, "9F8F514A-0E3A-414D-87BC-527E51E19328");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, "Tipo");
    PAN_USEROBJECTS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, "");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, MyGlb.VIS_NORMALFIELDS);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, "84F20A92-0D60-41C1-9BE5-4058CA0814D4");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, "Valido");
    PAN_USEROBJECTS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, "");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, MyGlb.VIS_CHECKSTYLE);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, "3C7925E0-1492-4BBE-8231-C2737EC2AF1E");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, "Tabella");
    PAN_USEROBJECTS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, "");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, MyGlb.VIS_NORMALFIELDS);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, "39FC7201-00EE-4298-8FA0-EF2C6B98071B");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, "Abilitato");
    PAN_USEROBJECTS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, "");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, MyGlb.VIS_CHECKSTYLE);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, "98CFB66C-DEC3-45A4-A62F-2A74F65F6E9A");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, "Invalido");
    PAN_USEROBJECTS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, "");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, MyGlb.VIS_NORMFIELPADR);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, "2D8524FF-1AB0-4288-8BBB-C2A6199212D1");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, "Disabilitato");
    PAN_USEROBJECTS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, "");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, MyGlb.VIS_NORMFIELPADR);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, "D2D98A7E-8310-467A-A414-A8356761F518");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, "Sono presenti ");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, MyGlb.VIS_VUONORALILEF);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, "F90648C0-F3CF-4CBA-BE7A-730B2B9F721B");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, "Oggetti invalidi e trigger disabilitati");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, MyGlb.VIS_VUONORALILEF);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_USEROBJECTS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, "76E973AD-3BF7-4B05-A2AA-2CF07AD525D0");
    PAN_USEROBJECTS.set_Header(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, "Compila");
    PAN_USEROBJECTS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, MyGlb.VIS_STATICBUTTON);
    PAN_USEROBJECTS.SetImage(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, 0, "button1.gif", false);
    PAN_USEROBJECTS.SetFlags(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_USEROBJECTS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, MyGlb.PANEL_LIST, 0, 88, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, MyGlb.PANEL_LIST, 84);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, MyGlb.PANEL_LIST, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, MyGlb.PANEL_LIST, "Nome");
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, MyGlb.PANEL_FORM, 4, 28, 240, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, MyGlb.PANEL_FORM, 120);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, MyGlb.PANEL_FORM, 2);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTNAME, MyGlb.PANEL_FORM, "Nome");
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_OBJECTNAME, -1, -1);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_OBJECTNAME, PPQRY_DBAOBJECTS, "A.OBJECT_NAME", "DBAOBJOBJNAM", 5, 128, 0, -13997);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, MyGlb.PANEL_LIST, 220, 88, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, MyGlb.PANEL_LIST, 80);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, MyGlb.PANEL_LIST, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, MyGlb.PANEL_LIST, "Tipo");
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, MyGlb.PANEL_FORM, 120);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, MyGlb.PANEL_FORM, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_OBJECTTYPE, MyGlb.PANEL_FORM, "Tipo");
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_OBJECTTYPE, -1, -1);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_OBJECTTYPE, PPQRY_DBAOBJECTS, "A.OBJECT_TYPE", "DBAOBJOBJTYP", 5, 19, 0, -13997);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, MyGlb.PANEL_LIST, 344, 88, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, MyGlb.PANEL_LIST, 52);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, MyGlb.PANEL_LIST, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, MyGlb.PANEL_LIST, "Valido");
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, MyGlb.PANEL_FORM, 4, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, MyGlb.PANEL_FORM, 120);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, MyGlb.PANEL_FORM, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUS, MyGlb.PANEL_FORM, "Valido");
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_STATUS, -1, -1);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_STATUS, PPQRY_DBAOBJECTS, "A.STATUS", "DBAOBJECSTAT", 5, 7, 0, -13997);
    PAN_USEROBJECTS.SetValueListItem(PFL_USEROBJECTS_STATUS, (new IDVariant("VALID")), "VALID", "", "", -1);
    PAN_USEROBJECTS.SetValueListItem(PFL_USEROBJECTS_STATUS, (new IDVariant("INVALID")), "INVALID", "", "", -1);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, MyGlb.PANEL_LIST, 388, 88, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, MyGlb.PANEL_LIST, 88);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, MyGlb.PANEL_LIST, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, MyGlb.PANEL_LIST, "Tabella");
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, MyGlb.PANEL_FORM, 4, 244, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, MyGlb.PANEL_FORM, 88);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, MyGlb.PANEL_FORM, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_TABLEOWNER, MyGlb.PANEL_FORM, "Tabella");
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_TABLEOWNER, -1, -1);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_TABLEOWNER, PPQRY_DBAOBJECTS, "B.TABLE_OWNER", "DBOBUSTRTAOW", 5, 30, 0, -13997);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, MyGlb.PANEL_LIST, 572, 88, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, MyGlb.PANEL_LIST, 52);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, MyGlb.PANEL_LIST, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, MyGlb.PANEL_LIST, "Abilitato");
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, MyGlb.PANEL_FORM, 4, 268, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, MyGlb.PANEL_FORM, 52);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, MyGlb.PANEL_FORM, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_STATUSTRIGGE, MyGlb.PANEL_FORM, "Abil.");
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_STATUSTRIGGE, -1, -1);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_STATUSTRIGGE, PPQRY_DBAOBJECTS, "B.STATUS", "DBAOBJSTATRI", 5, 8, 0, -13997);
    PAN_USEROBJECTS.SetValueListItem(PFL_USEROBJECTS_STATUSTRIGGE, (new IDVariant("ENABLED")), "ENABLED", "", "", -1);
    PAN_USEROBJECTS.SetValueListItem(PFL_USEROBJECTS_STATUSTRIGGE, (new IDVariant("DISABLED")), "DISABLED", "", "", -1);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, MyGlb.PANEL_LIST, 628, 116, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, MyGlb.PANEL_LIST, 56);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, MyGlb.PANEL_LIST, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, MyGlb.PANEL_LIST, "Invalido");
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, MyGlb.PANEL_FORM, 4, 292, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, MyGlb.PANEL_FORM, 56);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, MyGlb.PANEL_FORM, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_INVALIDO, MyGlb.PANEL_FORM, "Invalido");
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_INVALIDO, -1, -1);
    PAN_USEROBJECTS.SetFieldUnbound(PFL_USEROBJECTS_INVALIDO, true);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_INVALIDO, PPQRY_DBAOBJECTS, "DECODE(A.STATUS, 'INVALID', 1, 0)", "INVALIDO", 1, 19, 0, -13997);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, MyGlb.PANEL_LIST, 732, 116, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, MyGlb.PANEL_LIST, 72);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, MyGlb.PANEL_LIST, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, MyGlb.PANEL_LIST, "Disabilitato");
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, MyGlb.PANEL_FORM, 4, 316, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, MyGlb.PANEL_FORM, 72);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, MyGlb.PANEL_FORM, 1);
    PAN_USEROBJECTS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_DISABILITATO, MyGlb.PANEL_FORM, "Disabilitato");
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_DISABILITATO, -1, -1);
    PAN_USEROBJECTS.SetFieldUnbound(PFL_USEROBJECTS_DISABILITATO, true);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_DISABILITATO, PPQRY_DBAOBJECTS, "DECODE(B.STATUS, 'DISABLED', 1, 0)", "DISABILITATO", 1, 19, 0, -13997);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, MyGlb.PANEL_LIST, 0, 12, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, MyGlb.PANEL_LIST, 0);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, MyGlb.PANEL_LIST, 1);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, MyGlb.PANEL_FORM, 0, 12, 132, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, MyGlb.PANEL_FORM, 0);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICSONOPRES, MyGlb.PANEL_FORM, 1);
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_ETICSONOPRES, -1, -1);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_ETICSONOPRES, -1, "", "ETICSONOPRES", 0, 0, 0, -13997);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, MyGlb.PANEL_LIST, 88, 12, 208, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, MyGlb.PANEL_LIST, 0);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, MyGlb.PANEL_LIST, 2);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, MyGlb.PANEL_FORM, 0, 12, 352, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, MyGlb.PANEL_FORM, 0);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICOGGEINVA, MyGlb.PANEL_FORM, 1);
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_ETICOGGEINVA, -1, -1);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_ETICOGGEINVA, -1, "", "ETICOGGEINVA", 0, 0, 0, -13997);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, MyGlb.PANEL_LIST, 552, 312, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, MyGlb.PANEL_LIST, 0);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, MyGlb.PANEL_LIST, 1);
    PAN_USEROBJECTS.SetRect(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, MyGlb.PANEL_FORM, 724, 356, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_USEROBJECTS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, MyGlb.PANEL_FORM, 0);
    PAN_USEROBJECTS.SetNumRow(MyGlb.OBJ_FIELD, PFL_USEROBJECTS_ETICHECOMPIL, MyGlb.PANEL_FORM, 1);
    PAN_USEROBJECTS.SetFieldPage(PFL_USEROBJECTS_ETICHECOMPIL, -1, -1);
    PAN_USEROBJECTS.SetFieldPanel(PFL_USEROBJECTS_ETICHECOMPIL, -1, "", "ETICHECOMPIL", 0, 0, 0, -13997);
  }

  private void PAN_USEROBJECTS_InitQueries()
  {
    StringBuffer SQL;

    PAN_USEROBJECTS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_USEROBJECTS.SetIMDB(IMDB, "PQRY_DBAOBJECTS", true);
    PAN_USEROBJECTS.set_SetString(MyGlb.MASTER_ROWNAME, "DBA OBJECTS");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OBJECT_NAME as DBAOBJOBJNAM, ");
    SQL.append("  A.OBJECT_TYPE as DBAOBJOBJTYP, ");
    SQL.append("  A.STATUS as DBAOBJECSTAT, ");
    SQL.append("  B.TABLE_OWNER as DBOBUSTRTAOW, ");
    SQL.append("  B.STATUS as DBAOBJSTATRI, ");
    SQL.append("  DECODE(A.STATUS, 'INVALID', 1, 0) as INVALIDO, ");
    SQL.append("  DECODE(B.STATUS, 'DISABLED', 1, 0) as DISABILITATO ");
    PAN_USEROBJECTS.SetQuery(PPQRY_DBAOBJECTS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  USER_OBJECTS A, ");
    SQL.append("  USER_TRIGGERS B ");
    PAN_USEROBJECTS.SetQuery(PPQRY_DBAOBJECTS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.TRIGGER_NAME(+) = A.OBJECT_NAME) ");
    SQL.append("and   (A.STATUS = 'INVALID' OR B.STATUS = 'DISABLED') ");
    PAN_USEROBJECTS.SetQuery(PPQRY_DBAOBJECTS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_USEROBJECTS.SetQuery(PPQRY_DBAOBJECTS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_USEROBJECTS.SetQuery(PPQRY_DBAOBJECTS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_USEROBJECTS.SetQuery(PPQRY_DBAOBJECTS, 5, SQL, -1, "");
    PAN_USEROBJECTS.SetQueryDB(PPQRY_DBAOBJECTS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_USEROBJECTS.SetMasterTable(0, "USER_OBJECTS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_USEROBJECTS.Status() == 2)
    {
      int oldListQBE = PAN_USEROBJECTS.iUseListQBE;
      PAN_USEROBJECTS.iUseListQBE = 0;
      PAN_USEROBJECTS.PanelCommand(Glb.PCM_SEARCH);
      PAN_USEROBJECTS.PanelCommand(Glb.PCM_FIND);
      PAN_USEROBJECTS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_USEROBJECTS) PAN_USEROBJECTS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_USEROBJECTS) PAN_USEROBJECTS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_USEROBJECTS) PAN_USEROBJECTS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_USEROBJECTS) PAN_USEROBJECTS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_USEROBJECTS) PAN_USEROBJECTS_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_USEROBJECTS) PAN_USEROBJECTS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
