// **********************************************
// Scelta Categorie
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaCategorie extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CATEGORIE_TITOLO = 0;
  private static int PFL_CATEGORIE_CATEGORIA = 1;
  private static int PFL_CATEGORIE_DESCRIZIONE = 2;

  private static int PPQRY_CATEGORIE = 0;


  IDPanel PAN_CATEGORIE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI112(IMDB);
    //
    //
    Init_PQRY_CATEGORIE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI112(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI112, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI112, "TBL_PARAMETRI112");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI112,IMDBDef1.FLD_PARAMETRI112_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI112,IMDBDef1.FLD_PARAMETRI112_ROWNAMETITOL,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI112, 0);
  }

  private static void Init_PQRY_CATEGORIE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_CATEGORIE, 4);
    IMDB.set_TblCode(IMDBDef7.PQRY_CATEGORIE, "PQRY_CATEGORIE");
    IMDB.set_FldCode(IMDBDef7.PQRY_CATEGORIE,IMDBDef7.PQSL_CATEGORIE_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CATEGORIE,IMDBDef7.PQSL_CATEGORIE_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CATEGORIE,IMDBDef7.PQSL_CATEGORIE_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef7.PQRY_CATEGORIE,IMDBDef7.PQSL_CATEGORIE_CATEGORIA,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CATEGORIE,IMDBDef7.PQSL_CATEGORIE_E, "E");
    IMDB.SetFldParams(IMDBDef7.PQRY_CATEGORIE,IMDBDef7.PQSL_CATEGORIE_E,5,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CATEGORIE,IMDBDef7.PQSL_CATEGORIE_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CATEGORIE,IMDBDef7.PQSL_CATEGORIE_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_CATEGORIE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaCategorie(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaCategorie()
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
    FormIdx = MyGlb.FRM_SCELTACATEGO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D15BA206-AB61-47DA-8678-90F67EF1036B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 604;
    DesignHeight = 402;
    set_Caption(new IDVariant("Scelta Categorie"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 604;
    Frames[1].Height = 376;
    Frames[1].Caption = "Categorie";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 376;
    PAN_CATEGORIE = new IDPanel(w, this, 1, "PAN_CATEGORIE");
    Frames[1].Content = PAN_CATEGORIE;
    PAN_CATEGORIE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CATEGORIE.VS = MainFrm.VisualStyleList;
    PAN_CATEGORIE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 604-MyGlb.PAN_OFFS_X, 376-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CATEGORIE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6986D341-A457-4A91-96A6-C1CF626A828B");
    PAN_CATEGORIE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 532, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGORIE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CATEGORIE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CATEGORIE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CATEGORIE.InitStatus = 2;
    PAN_CATEGORIE_Init();
    PAN_CATEGORIE_InitFields();
    PAN_CATEGORIE_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      PAN_CATEGORIE.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SceltaCategorie);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaCategorie.class.getName() : (Glb.ClassWithPackage(SceltaCategorie.class) ? SceltaCategorie.class.getName().substring(SceltaCategorie.class.getPackage().getName().length() + 1) : SceltaCategorie.class.getName()));
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
  // cio� quando viene portata in primo piano
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
  private void PAN_CATEGORIE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CATEGORIE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CATEGORIE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CATEGORIE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CATEGORIE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CATEGORIE);
    // Stub
  }

  private void PAN_CATEGORIE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CATEGORIE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CATEGORIE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CATEGORIE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CATEGORIE_Init()
  {

    PAN_CATEGORIE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CATEGORIE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CATEGORIE.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_CATEGORIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, "DFF3D35A-87C8-4C3A-9562-E08AAC135EBD");
    PAN_CATEGORIE.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, "Titolo");
    PAN_CATEGORIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, "");
    PAN_CATEGORIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CATEGORIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CATEGORIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, "51882E76-DA76-45B3-B7A6-07CF6E84B61D");
    PAN_CATEGORIE.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, "Categoria");
    PAN_CATEGORIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, "");
    PAN_CATEGORIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_CATEGORIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CATEGORIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, "7D6230F0-45EC-47E9-818B-13CB6C677DDE");
    PAN_CATEGORIE.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, "Descrizione");
    PAN_CATEGORIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, "");
    PAN_CATEGORIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CATEGORIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_CATEGORIE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CATEGORIE.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGORIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, MyGlb.PANEL_LIST, 48);
    PAN_CATEGORIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CATEGORIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_CATEGORIE.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGORIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, MyGlb.PANEL_FORM, 88);
    PAN_CATEGORIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CATEGORIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGORIE_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_CATEGORIE.SetFieldPage(PFL_CATEGORIE_TITOLO, -1, -1);
    PAN_CATEGORIE.SetFieldPanel(PFL_CATEGORIE_TITOLO, PPQRY_CATEGORIE, "A.TITOLO", "TITOLO", 1, 2, 0, -13997);
    PAN_CATEGORIE.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, MyGlb.PANEL_LIST, 48, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGORIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, MyGlb.PANEL_LIST, 68);
    PAN_CATEGORIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_CATEGORIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_CATEGORIE.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, MyGlb.PANEL_FORM, 4, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGORIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, MyGlb.PANEL_FORM, 88);
    PAN_CATEGORIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_CATEGORIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGORIE_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_CATEGORIE.SetFieldPage(PFL_CATEGORIE_CATEGORIA, -1, -1);
    PAN_CATEGORIE.SetFieldPanel(PFL_CATEGORIE_CATEGORIA, PPQRY_CATEGORIE, "A.CATEGORIA", "CATEGORIA", 1, 2, 0, -13997);
    PAN_CATEGORIE.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, MyGlb.PANEL_LIST, 116, 36, 416, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CATEGORIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CATEGORIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CATEGORIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CATEGORIE.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGORIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_CATEGORIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CATEGORIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGORIE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CATEGORIE.SetFieldPage(PFL_CATEGORIE_DESCRIZIONE, -1, -1);
    PAN_CATEGORIE.SetFieldPanel(PFL_CATEGORIE_DESCRIZIONE, PPQRY_CATEGORIE, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
  }

  private void PAN_CATEGORIE_InitQueries()
  {
    StringBuffer SQL;

    PAN_CATEGORIE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CATEGORIE.SetIMDB(IMDB, "PQRY_CATEGORIE", true);
    PAN_CATEGORIE.set_SetString(MyGlb.MASTER_ROWNAME, "CATEGORIE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_CATEGORIE.SetQuery(PPQRY_CATEGORIE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CATEGORIE A ");
    PAN_CATEGORIE.SetQuery(PPQRY_CATEGORIE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TITOLO = NVL(~~TBL_PARAMETRI112.ROWNAMETITOL~~, A.TITOLO)) ");
    PAN_CATEGORIE.SetQuery(PPQRY_CATEGORIE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CATEGORIE.SetQuery(PPQRY_CATEGORIE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CATEGORIE.SetQuery(PPQRY_CATEGORIE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TITOLO, ");
    SQL.append("  A.CATEGORIA ");
    PAN_CATEGORIE.SetQuery(PPQRY_CATEGORIE, 5, SQL, -1, "");
    PAN_CATEGORIE.SetQueryDB(PPQRY_CATEGORIE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CATEGORIE.SetMasterTable(0, "CATEGORIE");
    PAN_CATEGORIE.AddToSortList(PFL_CATEGORIE_TITOLO, true);
    PAN_CATEGORIE.AddToSortList(PFL_CATEGORIE_CATEGORIA, true);
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_CATEGORIE.Status() == 2)
    {
      int oldListQBE = PAN_CATEGORIE.iUseListQBE;
      PAN_CATEGORIE.iUseListQBE = 0;
      PAN_CATEGORIE.PanelCommand(Glb.PCM_SEARCH);
      PAN_CATEGORIE.PanelCommand(Glb.PCM_FIND);
      PAN_CATEGORIE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CATEGORIE) PAN_CATEGORIE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CATEGORIE) PAN_CATEGORIE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CATEGORIE) PAN_CATEGORIE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CATEGORIE) PAN_CATEGORIE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CATEGORIE) PAN_CATEGORIE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
