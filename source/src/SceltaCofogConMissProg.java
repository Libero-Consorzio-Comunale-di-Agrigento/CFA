// **********************************************
// Scelta Cofog Con Miss Prog
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaCofogConMissProg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VISSTRRICCOF_TIPORICLID = 0;
  private static int PFL_VISSTRRICCOF_ricliv = 1;
  private static int PFL_VISSTRRICCOF_LIVELLO = 2;
  private static int PFL_VISSTRRICCOF_CODICE = 3;
  private static int PFL_VISSTRRICCOF_DESCRIZIONE = 4;
  private static int PFL_VISSTRRICCOF_STRUTTRICLID = 5;

  private static int PPQRY_VISTARICLASS = 0;


  IDPanel PAN_VISSTRRICCOF;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS96(IMDB);
    //
    //
    Init_PQRY_VISTARICLASS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS96(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARS96, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARS96, "TBL_PARS96");
    IMDB.set_FldCode(IMDBDef1.TBL_PARS96,IMDBDef1.FLD_PARS96_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS96,IMDBDef1.FLD_PARS96_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS96,IMDBDef1.FLD_PARS96_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS96,IMDBDef1.FLD_PARS96_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS96,IMDBDef1.FLD_PARS96_NOMOGGCODIBI, "NOMOGGCODIBI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS96,IMDBDef1.FLD_PARS96_NOMOGGCODIBI,5,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARS96, 0);
  }

  private static void Init_PQRY_VISTARICLASS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISTARICLASS, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISTARICLASS, "PQRY_VISTARICLASS");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_REVISTRITIRI, "REVISTRITIRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_REVISTRITIRI,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_RECVISSTRILI, "RECVISSTRILI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_RECVISSTRILI,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_RECORDCODICE,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_REVISTRISTRI, "REVISTRISTRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_REVISTRISTRI,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_RECORDLIVELL, "RECORDLIVELL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_RECORDLIVELL,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTARICLASS,IMDBDef8.PQSL_VISTARICLASS_RECORDDESCRI,5,300,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISTARICLASS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaCofogConMissProg(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaCofogConMissProg()
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
    FormIdx = MyGlb.FRM_SCECOFCOMIPR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A038DF07-2C59-4233-9FF6-3BD1427B077E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 672;
    DesignHeight = 678;
    set_Caption(new IDVariant("Scelta Cofog"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 672;
    Frames[1].Height = 652;
    Frames[1].Caption = "Vista Struttura Ricl COFOG";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 652;
    PAN_VISSTRRICCOF = new IDPanel(w, this, 1, "PAN_VISSTRRICCOF");
    Frames[1].Content = PAN_VISSTRRICCOF;
    PAN_VISSTRRICCOF.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VISSTRRICCOF.VS = MainFrm.VisualStyleList;
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 672-MyGlb.PAN_OFFS_X, 652-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D82C5BB9-9AE6-4165-853C-55C3DB6238A1");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 620, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VISSTRRICCOF.InitStatus = 2;
    PAN_VISSTRRICCOF_Init();
    PAN_VISSTRRICCOF_InitFields();
    PAN_VISSTRRICCOF_InitQueries();
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
      PAN_VISSTRRICCOF.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaCofogConMissProg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaCofogConMissProg.class.getName() : (Glb.ClassWithPackage(SceltaCofogConMissProg.class) ? SceltaCofogConMissProg.class.getName().substring(SceltaCofogConMissProg.class.getPackage().getName().length() + 1) : SceltaCofogConMissProg.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCofogConMissProg", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARS96, IMDBDef1.FLD_PARS96_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS96, IMDBDef1.FLD_PARS96_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS96, IMDBDef1.FLD_PARS96_NOMOGGCODIBI, 0, new IDVariant());
  }

  // **********************************************************************
  // Vista Struttura Ricl COFOG On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VISSTRRICCOF_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VISSTRRICCOF);
      // 
      // Vista Struttura Ricl COFOG On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VISSTRRICCOF.set_ToolTip(Glb.OBJ_FIELD,PFL_VISSTRRICCOF_LIVELLO,(new IDVariant(PAN_VISSTRRICCOF.FieldText(PFL_VISSTRRICCOF_LIVELLO))).stringValue()); 
      PAN_VISSTRRICCOF.set_ToolTip(Glb.OBJ_FIELD,PFL_VISSTRRICCOF_DESCRIZIONE,(new IDVariant(PAN_VISSTRRICCOF.FieldText(PFL_VISSTRRICCOF_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCofogConMissProg", "VistaStrutturaRiclCOFOGOnDynamicProperties", _e);
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
  private void PAN_VISSTRRICCOF_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VISSTRRICCOF, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VISSTRRICCOF_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VISSTRRICCOF, Cancel);
    // Stub
  }

  private void PAN_VISSTRRICCOF_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VISSTRRICCOF_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VISSTRRICCOF_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VISSTRRICCOF_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VISSTRRICCOF_Init()
  {

    PAN_VISSTRRICCOF.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VISSTRRICCOF.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VISSTRRICCOF.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, "686FED0E-D2E4-4394-96E2-3C45258D008A");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, "TIPO RICL ID");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, 0, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, "8DC0A129-B7A9-448A-A655-4C07DFC52CBE");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, "LIVELLO");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, 0, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, "B3AE6AA7-F177-4C18-878B-D64CF4CF7A1A");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, "Livello");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, "603560B0-7573-4C7E-BEE4-7DC645AC39E9");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, "Codice");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, "A76891B4-1432-4399-A2B2-B0C354A09CB2");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, "Descrizione");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, "3084CEE7-3F9B-40DF-AA96-E80FFDDE0822");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, "STRUTTURA RICL ID");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, 0, -1);
  }

  private void PAN_VISSTRRICCOF_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_LIST, 80);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_LIST, "TIPO RICL ID");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_FORM, 80);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_FORM, "TIPO RICL ID");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_TIPORICLID, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_TIPORICLID, PPQRY_VISTARICLASS, "A.TIPO_RICL_ID", "REVISTRITIRI", 1, 10, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_LIST, 52);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_LIST, "LIVELLO");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_FORM, 4, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_FORM, 52);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_FORM, "LIVELLO");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_ricliv, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_ricliv, PPQRY_VISTARICLASS, "A.LIVELLO", "RECVISSTRILI", 1, 2, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_LIST, 76);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_LIST, "Livello");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_FORM, 4, 4, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_FORM, 76);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_FORM, "Livello");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_LIVELLO, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_LIVELLO, PPQRY_VISTARICLASS, "A.DES_LIVELLO", "RECORDLIVELL", 5, 40, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_LIST, 208, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_FORM, 4, 76, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_CODICE, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_CODICE, PPQRY_VISTARICLASS, "A.CODICE", "RECORDCODICE", 1, 10, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_LIST, 280, 36, 340, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_DESCRIZIONE, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_DESCRIZIONE, PPQRY_VISTARICLASS, "A.DESCRIZIONE", "RECORDDESCRI", 5, 300, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_LIST, 124);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_LIST, "STRUTTURA RICL ID");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_FORM, 4, 172, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_FORM, 124);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_FORM, "STRUTTURA RICL ID");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_STRUTTRICLID, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_STRUTTRICLID, PPQRY_VISTARICLASS, "A.STRUTTURA_RICL_ID", "REVISTRISTRI", 1, 10, 0, -13997);
  }

  private void PAN_VISSTRRICCOF_InitQueries()
  {
    StringBuffer SQL;

    PAN_VISSTRRICCOF.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VISSTRRICCOF.SetIMDB(IMDB, "PQRY_VISTARICLASS", true);
    PAN_VISSTRRICCOF.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as REVISTRITIRI, ");
    SQL.append("  A.LIVELLO as RECVISSTRILI, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.STRUTTURA_RICL_ID as REVISTRISTRI, ");
    SQL.append("  A.DES_LIVELLO as RECORDLIVELL, ");
    SQL.append("  A.DESCRIZIONE as RECORDDESCRI ");
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLASS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A, ");
    SQL.append("  PROGRAMMI_COFOG B ");
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLASS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.COFOG = A.CODICE) ");
    SQL.append("and   (A.E_S = ~~TBL_PARS96.NOMEOGGETTES~~) ");
    SQL.append("and   (A.LIVELLO = A.MAX_LIVELLO_RICL) ");
    SQL.append("and   ((~~TBL_PARS96.NOMEOGGEESER~~ BETWEEN A.ESERCIZIO_INIZIO AND NVL(A.ESERCIZIO_SCADENZA, 9999))) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'COFOG') ");
    SQL.append("and   (B.PROGRAMMA = ~~TBL_PARS96.NOMOGGCODIBI~~) ");
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLASS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLASS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLASS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLASS, 5, SQL, -1, "");
    PAN_VISSTRRICCOF.SetQueryDB(PPQRY_VISTARICLASS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISSTRRICCOF.SetMasterTable(0, "VISTA_STRUTTURA_RICL");
    PAN_VISSTRRICCOF.AddToSortList(PFL_VISSTRRICCOF_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VISSTRRICCOF.Status() == 2)
    {
      int oldListQBE = PAN_VISSTRRICCOF.iUseListQBE;
      PAN_VISSTRRICCOF.iUseListQBE = 0;
      PAN_VISSTRRICCOF.PanelCommand(Glb.PCM_SEARCH);
      PAN_VISSTRRICCOF.PanelCommand(Glb.PCM_FIND);
      PAN_VISSTRRICCOF.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
