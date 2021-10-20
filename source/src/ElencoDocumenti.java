// **********************************************
// Elenco Documenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoDocumenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CFESTRHELSEL_ID = 0;
  private static int PFL_CFESTRHELSEL_TITOLO = 1;
  private static int PFL_CFESTRHELSEL_DESCRIZIONE = 2;
  private static int PFL_CFESTRHELSEL_FILEHELP = 3;

  private static int PPQRY_CFESTRHELSE1 = 0;


  IDPanel PAN_CFESTRHELSEL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_CFESTRHELSE1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_CFESTRHELSE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRHELSE1, 4);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRHELSE1, "PQRY_CFESTRHELSE1");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRHELSE1,IMDBDef17.PQSL_CFESTRHELSE1_ID, "ID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRHELSE1,IMDBDef17.PQSL_CFESTRHELSE1_ID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRHELSE1,IMDBDef17.PQSL_CFESTRHELSE1_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRHELSE1,IMDBDef17.PQSL_CFESTRHELSE1_TITOLO,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRHELSE1,IMDBDef17.PQSL_CFESTRHELSE1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRHELSE1,IMDBDef17.PQSL_CFESTRHELSE1_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRHELSE1,IMDBDef17.PQSL_CFESTRHELSE1_FILE_HELP, "FILE_HELP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRHELSE1,IMDBDef17.PQSL_CFESTRHELSE1_FILE_HELP,10,9999,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRHELSE1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoDocumenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoDocumenti()
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
    FormIdx = MyGlb.FRM_ELENCODOCUME;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D0CEE04A-4431-4F40-B7A3-4AEE65F7FFB3";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1080;
    DesignHeight = 450;
    set_Caption(new IDVariant("Documenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1080;
    Frames[1].Height = 424;
    Frames[1].Caption = "Documenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 424;
    PAN_CFESTRHELSEL = new IDPanel(w, this, 1, "PAN_CFESTRHELSEL");
    Frames[1].Content = PAN_CFESTRHELSEL;
    PAN_CFESTRHELSEL.ShowRowSelector = false;
    PAN_CFESTRHELSEL.iLocked = false;
    PAN_CFESTRHELSEL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CFESTRHELSEL.VS = MainFrm.VisualStyleList;
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1080-MyGlb.PAN_OFFS_X, 424-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CFESTRHELSEL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "331B0159-F081-4E3B-A57D-207762B11DCB");
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 12, 8, 744, 276, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CFESTRHELSEL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CFESTRHELSEL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CFESTRHELSEL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CFESTRHELSEL.InitStatus = 2;
    PAN_CFESTRHELSEL_Init();
    PAN_CFESTRHELSEL_InitFields();
    PAN_CFESTRHELSEL_InitQueries();
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
      PAN_CFESTRHELSEL.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoDocumenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoDocumenti.class.getName() : (Glb.ClassWithPackage(ElencoDocumenti.class) ? ElencoDocumenti.class.getName().substring(ElencoDocumenti.class.getPackage().getName().length() + 1) : ElencoDocumenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // CF ESTRAI HELP SELECT On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CFESTRHELSEL_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CF ESTRAI HELP SELECT On Command Body
      // Corpo Procedura
      // 
      // if (Command.equals((new IDVariant(8)), true) || Command.equals((new IDVariant(256)), true))
      // {
        // PAN_CFESTRHELSEL.set_Layout((new IDVariant(1)).intValue());
      // }
      if (Command.equals((new IDVariant(8192)), true))
      {
        PAN_CFESTRHELSEL.UpdatePanel(MainFrm);
        PAN_CFESTRHELSEL.PanelCommand(Glb.PCM_REQUERY);
        PAN_CFESTRHELSEL.PanelCommand(Glb.PCM_UPDATE);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDocumenti", "CFESTRAIHELPSELECTOnCommand", _e);
    }
  }

  // **********************************************************************
  // CF ESTRAI HELP SELECT Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CFESTRHELSEL_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CF ESTRAI HELP SELECT Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef17.PQRY_CFESTRHELSE1, IMDBDef17.PQSL_CFESTRHELSE1_ID, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDocumenti", "CFESTRAIHELPSELECTBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // CF ESTRAI HELP SELECT Before BLOB Update
  // Evento notificato dal pannello prima di effettuare
  // la registrazione nel database di un blob appena caricato
  // dall'utente.
  // Cancel - Input/Output
  // Column - Input
  // Size - Input
  // Extension - Input
  // FilePath - Input
  // **********************************************************************
  private void PAN_CFESTRHELSEL_BeforeBlobUpdate (IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CF ESTRAI HELP SELECT Before BLOB Update Body
      // Corpo Procedura
      // 
      PAN_CFESTRHELSEL.UpdatePanel(MainFrm);
      PAN_CFESTRHELSEL.PanelCommand(Glb.PCM_REQUERY);
      PAN_CFESTRHELSEL.PanelCommand(Glb.PCM_UPDATE);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDocumenti", "CFESTRAIHELPSELECTBeforeBLOBUpdate", _e);
    }
  }

  // **********************************************************************
  // CF ESTRAI HELP SELECT After BLOB Update
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column - Input
  // Size - Input
  // Extension - Input
  // **********************************************************************
  private void PAN_CFESTRHELSEL_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CF ESTRAI HELP SELECT After BLOB Update Body
      // Corpo Procedura
      // 
      PAN_CFESTRHELSEL.UpdatePanel(MainFrm);
      PAN_CFESTRHELSEL.PanelCommand(Glb.PCM_UPDATE);
      PAN_CFESTRHELSEL.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDocumenti", "CFESTRAIHELPSELECTAfterBLOBUpdate", _e);
    }
  }

  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Body
      // Corpo Procedura
      // 
      PAN_CFESTRHELSEL.SetFieldBlobSize(PFL_CFESTRHELSEL_FILEHELP, (new IDVariant(0)).intValue(), (new IDVariant(10000000)).intValue(), (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDocumenti", "Load", _e);
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
  private void PAN_CFESTRHELSEL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CFESTRHELSEL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CFESTRHELSEL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CFESTRHELSEL, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CFESTRHELSEL_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CFESTRHELSEL);
    // Stub
  }

  private void PAN_CFESTRHELSEL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CFESTRHELSEL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CFESTRHELSEL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRHELSE1, IMDBDef17.PQSL_CFESTRHELSE1_FILE_HELP, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRHELSE1, IMDBDef17.PQSL_CFESTRHELSE1_FILE_HELP, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_CFESTRHELSEL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CFESTRHELSEL_Init()
  {

    PAN_CFESTRHELSEL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CFESTRHELSEL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CFESTRHELSEL.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_CFESTRHELSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, "D992FA8D-84DC-4A2E-954A-A849AD403198");
    PAN_CFESTRHELSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, "ID");
    PAN_CFESTRHELSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, "");
    PAN_CFESTRHELSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CFESTRHELSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CFESTRHELSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, "24B1E37F-6DA5-40AC-8E20-A32014F1E44A");
    PAN_CFESTRHELSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, "Titolo");
    PAN_CFESTRHELSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, "");
    PAN_CFESTRHELSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRHELSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_CFESTRHELSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, "1F0649D6-75DE-435A-BE18-480D5C92B7A9");
    PAN_CFESTRHELSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, "Descrizione");
    PAN_CFESTRHELSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, "");
    PAN_CFESTRHELSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRHELSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRHELSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, "E3DD4DA1-81B0-4885-A558-0DE10C1AA8D4");
    PAN_CFESTRHELSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, "File");
    PAN_CFESTRHELSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, "");
    PAN_CFESTRHELSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRHELSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CFESTRHELSEL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRHELSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, MyGlb.PANEL_LIST, 24);
    PAN_CFESTRHELSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRHELSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, MyGlb.PANEL_LIST, "ID");
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRHELSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, MyGlb.PANEL_FORM, 24);
    PAN_CFESTRHELSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRHELSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_ID, MyGlb.PANEL_FORM, "ID");
    PAN_CFESTRHELSEL.SetFieldPage(PFL_CFESTRHELSEL_ID, -1, -1);
    PAN_CFESTRHELSEL.SetFieldPanel(PFL_CFESTRHELSEL_ID, PPQRY_CFESTRHELSE1, "A.ID", "ID", 3, 19, 0, -13997);
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, MyGlb.PANEL_LIST, 12, 44, 324, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CFESTRHELSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, MyGlb.PANEL_LIST, 30);
    PAN_CFESTRHELSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRHELSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, MyGlb.PANEL_FORM, 32, 8, 732, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRHELSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, MyGlb.PANEL_FORM, 74);
    PAN_CFESTRHELSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRHELSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_CFESTRHELSEL.SetFieldPage(PFL_CFESTRHELSEL_TITOLO, -1, -1);
    PAN_CFESTRHELSEL.SetFieldPanel(PFL_CFESTRHELSEL_TITOLO, PPQRY_CFESTRHELSE1, "A.TITOLO", "TITOLO", 5, 100, 0, -13997);
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, MyGlb.PANEL_LIST, 336, 44, 420, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CFESTRHELSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, MyGlb.PANEL_LIST, 30);
    PAN_CFESTRHELSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRHELSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 36, 732, 88, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRHELSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_CFESTRHELSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, MyGlb.PANEL_FORM, 6);
    PAN_CFESTRHELSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CFESTRHELSEL.SetFieldPage(PFL_CFESTRHELSEL_DESCRIZIONE, -1, -1);
    PAN_CFESTRHELSEL.SetFieldPanel(PFL_CFESTRHELSEL_DESCRIZIONE, PPQRY_CFESTRHELSE1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 4000, 0, -13997);
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, MyGlb.PANEL_LIST, 12, 300, 488, 40, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_MOVE);
    PAN_CFESTRHELSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, MyGlb.PANEL_LIST, 64);
    PAN_CFESTRHELSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, MyGlb.PANEL_LIST, 2);
    PAN_CFESTRHELSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, MyGlb.PANEL_LIST, "File");
    PAN_CFESTRHELSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, MyGlb.PANEL_FORM, 36, 132, 728, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRHELSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, MyGlb.PANEL_FORM, 72);
    PAN_CFESTRHELSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, MyGlb.PANEL_FORM, 2);
    PAN_CFESTRHELSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRHELSEL_FILEHELP, MyGlb.PANEL_FORM, "File");
    PAN_CFESTRHELSEL.SetFieldPage(PFL_CFESTRHELSEL_FILEHELP, -1, -1);
    PAN_CFESTRHELSEL.SetFieldPanel(PFL_CFESTRHELSEL_FILEHELP, PPQRY_CFESTRHELSE1, "A.FILE_HELP", "FILE_HELP", 10, 9999, 0, -13997);
  }

  private void PAN_CFESTRHELSEL_InitQueries()
  {
    StringBuffer SQL;

    PAN_CFESTRHELSEL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CFESTRHELSEL.SetIMDB(IMDB, "PQRY_CFESTRHELSE1", true);
    PAN_CFESTRHELSEL.set_SetString(MyGlb.MASTER_ROWNAME, "CF ESTRAI HELP SELECT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as ID, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.FILE_HELP as FILE_HELP ");
    PAN_CFESTRHELSEL.SetQuery(PPQRY_CFESTRHELSE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_HELP_SELECT A ");
    PAN_CFESTRHELSEL.SetQuery(PPQRY_CFESTRHELSE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRHELSEL.SetQuery(PPQRY_CFESTRHELSE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRHELSEL.SetQuery(PPQRY_CFESTRHELSE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRHELSEL.SetQuery(PPQRY_CFESTRHELSE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRHELSEL.SetQuery(PPQRY_CFESTRHELSE1, 5, SQL, -1, "");
    PAN_CFESTRHELSEL.SetQueryDB(PPQRY_CFESTRHELSE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CFESTRHELSEL.SetMasterTable(0, "CF_ESTRAI_HELP_SELECT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CFESTRHELSEL.Status() == 2)
    {
      int oldListQBE = PAN_CFESTRHELSEL.iUseListQBE;
      PAN_CFESTRHELSEL.iUseListQBE = 0;
      PAN_CFESTRHELSEL.PanelCommand(Glb.PCM_SEARCH);
      PAN_CFESTRHELSEL.PanelCommand(Glb.PCM_FIND);
      PAN_CFESTRHELSEL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CFESTRHELSEL) PAN_CFESTRHELSEL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CFESTRHELSEL) PAN_CFESTRHELSEL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CFESTRHELSEL) PAN_CFESTRHELSEL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CFESTRHELSEL) PAN_CFESTRHELSEL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CFESTRHELSEL) PAN_CFESTRHELSEL_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CFESTRHELSEL) PAN_CFESTRHELSEL_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
  }

  public void BeforeBlobUpdate(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
    if (SrcObj == PAN_CFESTRHELSEL) PAN_CFESTRHELSEL_BeforeBlobUpdate(Cancel, Column, Size, Extension, FilePath);
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
    if (SrcObj == PAN_CFESTRHELSEL) PAN_CFESTRHELSEL_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_CFESTRHELSEL) PAN_CFESTRHELSEL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
