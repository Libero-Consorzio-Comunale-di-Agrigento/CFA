// **********************************************
// Categoria Prodotto
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CategoriaProdotto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CATEGOPRODOT_CODICE = 0;
  private static int PFL_CATEGOPRODOT_DESCRIZIONE = 1;
  private static int PFL_CATEGOPRODOT_CLASSE = 2;

  private static int PPQRY_CATEGPRODOO1 = 0;

  private static int PPQRY_CLASSIOD = 1;


  IDPanel PAN_CATEGOPRODOT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_CATEGPRODOO1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_CATEGPRODOO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CATEGPRODOO1, 3);
    IMDB.set_TblCode(IMDBDef10.PQRY_CATEGPRODOO1, "PQRY_CATEGPRODOO1");
    IMDB.set_FldCode(IMDBDef10.PQRY_CATEGPRODOO1,IMDBDef10.PQSL_CATEGPRODOO1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CATEGPRODOO1,IMDBDef10.PQSL_CATEGPRODOO1_CODICE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CATEGPRODOO1,IMDBDef10.PQSL_CATEGPRODOO1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CATEGPRODOO1,IMDBDef10.PQSL_CATEGPRODOO1_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CATEGPRODOO1,IMDBDef10.PQSL_CATEGPRODOO1_CLASSE, "CLASSE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CATEGPRODOO1,IMDBDef10.PQSL_CATEGPRODOO1_CLASSE,5,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CATEGPRODOO1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CategoriaProdotto(MyWebEntryPoint w, IMDBObj imdb)
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
  public CategoriaProdotto()
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
    FormIdx = MyGlb.FRM_CATEGOPRODOT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BDD3BC7A-0B99-47BB-AE23-CC220757460E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 760;
    DesignHeight = 374;
    set_Caption(new IDVariant("Categoria Prodotto"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 760;
    Frames[1].Height = 348;
    Frames[1].Caption = "Categoria Prodotto";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_CATEGOPRODOT = new IDPanel(w, this, 1, "PAN_CATEGOPRODOT");
    Frames[1].Content = PAN_CATEGOPRODOT;
    PAN_CATEGOPRODOT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CATEGOPRODOT.VS = MainFrm.VisualStyleList;
    PAN_CATEGOPRODOT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CATEGOPRODOT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6AE6DF7B-83BE-4379-8AD7-855270CAC259");
    PAN_CATEGOPRODOT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 708, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGOPRODOT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CATEGOPRODOT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CATEGOPRODOT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CATEGOPRODOT.InitStatus = 2;
    PAN_CATEGOPRODOT_Init();
    PAN_CATEGOPRODOT_InitFields();
    PAN_CATEGOPRODOT_InitQueries();
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
      PAN_CATEGOPRODOT.UpdatePanel(MainFrm);
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
    return (obj instanceof CategoriaProdotto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CategoriaProdotto.class.getName() : (Glb.ClassWithPackage(CategoriaProdotto.class) ? CategoriaProdotto.class.getName().substring(CategoriaProdotto.class.getPackage().getName().length() + 1) : CategoriaProdotto.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Categoria/Prodotto ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      Frames[PAN_CATEGOPRODOT.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CategoriaProdotto", "LoadEvent", _e);
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
  private void PAN_CATEGOPRODOT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CATEGOPRODOT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CATEGOPRODOT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CATEGOPRODOT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CATEGOPRODOT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CATEGOPRODOT);
    // Stub
  }

  private void PAN_CATEGOPRODOT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CATEGOPRODOT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CATEGOPRODOT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CATEGOPRODOT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CATEGOPRODOT_Init()
  {

    PAN_CATEGOPRODOT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CATEGOPRODOT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CATEGOPRODOT.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_CATEGOPRODOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, "DA59AFFD-FB9B-462F-9144-EBB4A868CE41");
    PAN_CATEGOPRODOT.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, "Codice");
    PAN_CATEGOPRODOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, "");
    PAN_CATEGOPRODOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CATEGOPRODOT.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CATEGOPRODOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, "D55778C3-EEE3-44E7-A6DA-8728E44D41E7");
    PAN_CATEGOPRODOT.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, "Descrizione");
    PAN_CATEGOPRODOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, "");
    PAN_CATEGOPRODOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CATEGOPRODOT.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CATEGOPRODOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, "2C32174F-5F78-40B5-9719-7229CB96CB45");
    PAN_CATEGOPRODOT.set_Header(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, "Classe");
    PAN_CATEGOPRODOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, "");
    PAN_CATEGOPRODOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, MyGlb.VIS_NORMALFIELDS);
    PAN_CATEGOPRODOT.SetFlags(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CATEGOPRODOT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CATEGOPRODOT.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGOPRODOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_CATEGOPRODOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CATEGOPRODOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CATEGOPRODOT.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGOPRODOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, MyGlb.PANEL_FORM, 128);
    PAN_CATEGOPRODOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CATEGOPRODOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CATEGOPRODOT.SetFieldPage(PFL_CATEGOPRODOT_CODICE, -1, -1);
    PAN_CATEGOPRODOT.SetFieldPanel(PFL_CATEGOPRODOT_CODICE, PPQRY_CATEGPRODOO1, "A.CODICE", "CODICE", 5, 10, 0, -13997);
    PAN_CATEGOPRODOT.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, MyGlb.PANEL_LIST, 72, 36, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CATEGOPRODOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_CATEGOPRODOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CATEGOPRODOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CATEGOPRODOT.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGOPRODOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_CATEGOPRODOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CATEGOPRODOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CATEGOPRODOT.SetFieldPage(PFL_CATEGOPRODOT_DESCRIZIONE, -1, -1);
    PAN_CATEGOPRODOT.SetFieldPanel(PFL_CATEGOPRODOT_DESCRIZIONE, PPQRY_CATEGPRODOO1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_CATEGOPRODOT.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, MyGlb.PANEL_LIST, 464, 36, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGOPRODOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, MyGlb.PANEL_LIST, 48);
    PAN_CATEGOPRODOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, MyGlb.PANEL_LIST, 1);
    PAN_CATEGOPRODOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, MyGlb.PANEL_LIST, "Classe");
    PAN_CATEGOPRODOT.SetRect(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, MyGlb.PANEL_FORM, 4, 52, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CATEGOPRODOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, MyGlb.PANEL_FORM, 48);
    PAN_CATEGOPRODOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, MyGlb.PANEL_FORM, 1);
    PAN_CATEGOPRODOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CATEGOPRODOT_CLASSE, MyGlb.PANEL_FORM, "Classe");
    PAN_CATEGOPRODOT.SetFieldPage(PFL_CATEGOPRODOT_CLASSE, -1, -1);
    PAN_CATEGOPRODOT.SetFieldPanel(PFL_CATEGOPRODOT_CLASSE, PPQRY_CATEGPRODOO1, "A.CLASSE", "CLASSE", 5, 10, 0, -13997);
  }

  private void PAN_CATEGOPRODOT_InitQueries()
  {
    StringBuffer SQL;

    PAN_CATEGOPRODOT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CLASSODCODIC, ");
    SQL.append("  A.DESCRIZIONE as CLASSODDESCR ");
    SQL.append("from ");
    SQL.append("  CLASSI_OD A ");
    SQL.append("where (A.CODICE = ~~CLASSE~~) ");
    PAN_CATEGOPRODOT.SetQuery(PPQRY_CLASSIOD, 0, SQL, PFL_CATEGOPRODOT_CLASSE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CLASSODCODIC, ");
    SQL.append("  A.DESCRIZIONE as CLASSODDESCR ");
    SQL.append("from ");
    SQL.append("  CLASSI_OD A ");
    PAN_CATEGOPRODOT.SetQuery(PPQRY_CLASSIOD, 1, SQL, PFL_CATEGOPRODOT_CLASSE, "");
    PAN_CATEGOPRODOT.SetQueryDB(PPQRY_CLASSIOD, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CATEGOPRODOT.SetIMDB(IMDB, "PQRY_CATEGPRODOO1", true);
    PAN_CATEGOPRODOT.set_SetString(MyGlb.MASTER_ROWNAME, "CATEGORIE PRODOTTI OD");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CLASSE as CLASSE ");
    PAN_CATEGOPRODOT.SetQuery(PPQRY_CATEGPRODOO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CATEGORIE_PRODOTTI_OD A ");
    PAN_CATEGOPRODOT.SetQuery(PPQRY_CATEGPRODOO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CATEGOPRODOT.SetQuery(PPQRY_CATEGPRODOO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CATEGOPRODOT.SetQuery(PPQRY_CATEGPRODOO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CATEGOPRODOT.SetQuery(PPQRY_CATEGPRODOO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CATEGOPRODOT.SetQuery(PPQRY_CATEGPRODOO1, 5, SQL, -1, "");
    PAN_CATEGOPRODOT.SetQueryDB(PPQRY_CATEGPRODOO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CATEGOPRODOT.SetMasterTable(0, "CATEGORIE_PRODOTTI_OD");
    PAN_CATEGOPRODOT.AddToSortList(PFL_CATEGOPRODOT_CODICE, true);
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_CATEGOPRODOT.Status() == 2)
    {
      int oldListQBE = PAN_CATEGOPRODOT.iUseListQBE;
      PAN_CATEGOPRODOT.iUseListQBE = 0;
      PAN_CATEGOPRODOT.PanelCommand(Glb.PCM_SEARCH);
      PAN_CATEGOPRODOT.PanelCommand(Glb.PCM_FIND);
      PAN_CATEGOPRODOT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CATEGOPRODOT) PAN_CATEGOPRODOT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CATEGOPRODOT) PAN_CATEGOPRODOT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CATEGOPRODOT) PAN_CATEGOPRODOT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CATEGOPRODOT) PAN_CATEGOPRODOT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CATEGOPRODOT) PAN_CATEGOPRODOT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
