// **********************************************
// Scelta Fattori O Contropartita Utenze
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaFattoriOContropartitaUtenze extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FATTORI_FATTORE = 0;
  private static int PFL_FATTORI_DESCRIZIONE = 1;
  private static int PFL_FATTORI_TIPO = 2;

  private static int PPQRY_FATTORI = 0;


  IDPanel PAN_FATTORI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN17(IMDB);
    //
    //
    Init_PQRY_FATTORI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_IN17, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_IN17, "TBL_IN17");
    IMDB.set_FldCode(IMDBDef1.TBL_IN17,IMDBDef1.FLD_IN17_NOMOGGTIPPIA, "NOMOGGTIPPIA");
    IMDB.SetFldParams(IMDBDef1.TBL_IN17,IMDBDef1.FLD_IN17_NOMOGGTIPPIA,5,3,0);
    IMDB.TblAddNew(IMDBDef1.TBL_IN17, 0);
  }

  private static void Init_PQRY_FATTORI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FATTORI, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_FATTORI, "PQRY_FATTORI");
    IMDB.set_FldCode(IMDBDef8.PQRY_FATTORI,IMDBDef8.PQSL_FATTORI_RECORDFATTOR, "RECORDFATTOR");
    IMDB.SetFldParams(IMDBDef8.PQRY_FATTORI,IMDBDef8.PQSL_FATTORI_RECORDFATTOR,5,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FATTORI,IMDBDef8.PQSL_FATTORI_RECOFATTDESC, "RECOFATTDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_FATTORI,IMDBDef8.PQSL_FATTORI_RECOFATTDESC,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FATTORI,IMDBDef8.PQSL_FATTORI_RECOFATTTIPO, "RECOFATTTIPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FATTORI,IMDBDef8.PQSL_FATTORI_RECOFATTTIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FATTORI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaFattoriOContropartitaUtenze(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaFattoriOContropartitaUtenze()
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
    FormIdx = MyGlb.FRM_SCEFATOCONUT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "89196BCC-D210-4500-B47E-717E0F78AB05";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 612;
    DesignHeight = 354;
    set_Caption(new IDVariant("Scelta Fattori o Contropartita Utenze"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 612;
    Frames[1].Height = 328;
    Frames[1].Caption = "Fattori";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 328;
    PAN_FATTORI = new IDPanel(w, this, 1, "PAN_FATTORI");
    Frames[1].Content = PAN_FATTORI;
    PAN_FATTORI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FATTORI.VS = MainFrm.VisualStyleList;
    PAN_FATTORI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 612-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B27A37B2-96A1-4BD1-9FFD-16625B9A7ABA");
    PAN_FATTORI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 552, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FATTORI.InitStatus = 2;
    PAN_FATTORI_Init();
    PAN_FATTORI_InitFields();
    PAN_FATTORI_InitQueries();
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
      PAN_FATTORI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaFattoriOContropartitaUtenze);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaFattoriOContropartitaUtenze.class.getName() : (Glb.ClassWithPackage(SceltaFattoriOContropartitaUtenze.class) ? SceltaFattoriOContropartitaUtenze.class.getName().substring(SceltaFattoriOContropartitaUtenze.class.getPackage().getName().length() + 1) : SceltaFattoriOContropartitaUtenze.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Fattori On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FATTORI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FATTORI);
      // 
      // Fattori On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_FATTORI.set_ToolTip(Glb.OBJ_FIELD,PFL_FATTORI_DESCRIZIONE,(new IDVariant(PAN_FATTORI.FieldText(PFL_FATTORI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaFattoriOContropartitaUtenze", "FattoriOnDynamicProperties", _e);
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
  private void PAN_FATTORI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FATTORI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FATTORI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FATTORI, Cancel);
    // Stub
  }

  private void PAN_FATTORI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FATTORI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FATTORI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FATTORI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FATTORI_Init()
  {

    PAN_FATTORI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FATTORI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FATTORI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, "E814B375-D835-4FC9-BCE0-FB9C2718A874");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, "Fattore");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "558D52C0-E4CD-4FF7-8CCF-4A9F40C3CD8F");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "Descrizione");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "782B0A05-33A1-4778-8BBB-A8604101B258");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "Tipo");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FATTORI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_FATTORE, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_FATTORE, PPQRY_FATTORI, "A.FATTORE", "RECORDFATTOR", 5, 16, 0, -13997);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 120, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_DESCRIZIONE, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_DESCRIZIONE, PPQRY_FATTORI, "A.DESCRIZIONE", "RECOFATTDESC", 5, 200, 0, -13997);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 428, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 4, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_TIPO, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_TIPO, PPQRY_FATTORI, "A.TIPO", "RECOFATTTIPO", 5, 1, 0, -13997);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
  }

  private void PAN_FATTORI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FATTORI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FATTORI.SetIMDB(IMDB, "PQRY_FATTORI", true);
    PAN_FATTORI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FATTORE as RECORDFATTOR, ");
    SQL.append("  A.DESCRIZIONE as RECOFATTDESC, ");
    SQL.append("  A.TIPO as RECOFATTTIPO ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FATTORI A, ");
    SQL.append("  STRUTTURA_PIANO_CONTI B, ");
    SQL.append("  RELAZIONI_CONTI_FATTORI C, ");
    SQL.append("  TIPI_STRUTTURA_ECO D ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.TIPO_PIANO = ~~TBL_IN17.NOMOGGTIPPIA~~) ");
    SQL.append("and   (B.CODICE_PADRE = DECODE(B.TIPO_PIANO, 'E', '2.1.2.01.05', '2.4.2.01.01.01')) ");
    SQL.append("and   (C.CONTO_ID_D = B.CONTO_ID) ");
    SQL.append("and   (C.FATTORE = A.FATTORE) ");
    SQL.append("and   (D.PROGRESSIVO = B.PROGR_STRUTTURA) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN D.ESERCIZIO_INIZIO AND NVL(D.ESERCIZIO_FINE, 9999))) ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORI.SetQuery(PPQRY_FATTORI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORI.SetQuery(PPQRY_FATTORI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.FATTORE ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI, 5, SQL, -1, "");
    PAN_FATTORI.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FATTORI.SetMasterTable(0, "FATTORI");
    PAN_FATTORI.AddToSortList(PFL_FATTORI_FATTORE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FATTORI.Status() == 2)
    {
      int oldListQBE = PAN_FATTORI.iUseListQBE;
      PAN_FATTORI.iUseListQBE = 0;
      PAN_FATTORI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FATTORI.PanelCommand(Glb.PCM_FIND);
      PAN_FATTORI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
