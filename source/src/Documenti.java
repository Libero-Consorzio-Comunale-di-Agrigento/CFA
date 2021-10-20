// **********************************************
// Documenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Documenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DOCUMENTI_NDOC = 0;
  private static int PFL_DOCUMENTI_DATADOC = 1;
  private static int PFL_DOCUMENTI_DESCRIZIONE = 2;
  private static int PFL_DOCUMENTI_NPROT = 3;
  private static int PFL_DOCUMENTI_DATAPROT = 4;
  private static int PFL_DOCUMENTI_IMPORTO = 5;
  private static int PFL_DOCUMENTI_VARIAZIONI = 6;
  private static int PFL_DOCUMENTI_SALDO = 7;
  private static int PFL_DOCUMENTI_CODICEDOC = 8;
  private static int PFL_DOCUMENTI_ANNODOC = 9;
  private static int PFL_DOCUMENTI_ANNOPROG = 10;
  private static int PFL_DOCUMENTI_NUMEROPROG = 11;

  private static int PPQRY_FAT19 = 0;

  private static int PPQRY_T03 = 1;


  IDPanel PAN_DOCUMENTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM24(IMDB);
    //
    //
    Init_PQRY_FAT19(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM24(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM24, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM24, "TBL_PARAM24");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM24,IMDBDef2.FLD_PARAM24_ROWNAMCODBEN, "ROWNAMCODBEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM24,IMDBDef2.FLD_PARAM24_ROWNAMCODBEN,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM24,IMDBDef2.FLD_PARAM24_ROWNAMCODDOC, "ROWNAMCODDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM24,IMDBDef2.FLD_PARAM24_ROWNAMCODDOC,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM24,IMDBDef2.FLD_PARAM24_ROWNAMANNDOC, "ROWNAMANNDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM24,IMDBDef2.FLD_PARAM24_ROWNAMANNDOC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM24,IMDBDef2.FLD_PARAM24_ROWNAMNUMDOC, "ROWNAMNUMDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM24,IMDBDef2.FLD_PARAM24_ROWNAMNUMDOC,5,20,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM24, 0);
  }

  private static void Init_PQRY_FAT19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FAT19, 11);
    IMDB.set_TblCode(IMDBDef10.PQRY_FAT19, "PQRY_FAT19");
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_CODICE_DOC, "CODICE_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_CODICE_DOC,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_NUMERO_PROT, "NUMERO_PROT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_NUMERO_PROT,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_D_DATA_PROT, "D_DATA_PROT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_D_DATA_PROT,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_IMPUTATO, "IMPUTATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_IMPUTATO,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_VARIAZIONI,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT19,IMDBDef10.PQSL_FAT19_ANNO_DOC,1,4,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FAT19, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Documenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public Documenti()
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
    FormIdx = MyGlb.FRM_DOCUMENTI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2FD855E7-224C-477B-BA58-9BC27BE4C941";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 888;
    DesignHeight = 394;
    set_Caption(new IDVariant("Documenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 888;
    Frames[1].Height = 368;
    Frames[1].Caption = "Documenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_DOCUMENTI = new IDPanel(w, this, 1, "PAN_DOCUMENTI");
    Frames[1].Content = PAN_DOCUMENTI;
    PAN_DOCUMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMENTI.VS = MainFrm.VisualStyleList;
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 888-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1C70BEE9-0E9B-43FE-97E7-70DD66D26903");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 856, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCUMENTI.InitStatus = 2;
    PAN_DOCUMENTI_Init();
    PAN_DOCUMENTI_InitFields();
    PAN_DOCUMENTI_InitQueries();
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
      PAN_DOCUMENTI.UpdatePanel(MainFrm);
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
    return (obj instanceof Documenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Documenti.class.getName() : (Glb.ClassWithPackage(Documenti.class) ? Documenti.class.getName().substring(Documenti.class.getPackage().getName().length() + 1) : Documenti.class.getName()));
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
      UNLOADEVENT_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Documenti", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMCODBEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMCODDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMANNDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMNUMDOC, 0, new IDVariant());
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
  private void PAN_DOCUMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCUMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCUMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCUMENTI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCUMENTI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DOCUMENTI);
    // Stub
  }

  private void PAN_DOCUMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DOCUMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCUMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCUMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DOCUMENTI_Init()
  {

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, "E7D1FE84-C8AD-4522-9C9A-1922C4A77E91");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, "N.Doc");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, "566874F5-7580-4982-9A92-6DA7A0D9B7AF");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, "Data Doc.");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, "66546250-BB6A-4966-93EF-EA96C2B24F97");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, "Descrizione");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, MyGlb.VIS_VISULOOUPCF4);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, "612F728B-597E-480C-B848-3E1F7CEF858B");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, "N.Prot");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, "CE12B635-A7BC-4A22-ACFA-FD0B52F0445E");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, "Data Prot.");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, "C2CC2DF8-E198-4B5F-A33D-E3E44848FF8A");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, "Importo");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, "0E1FFDC4-FAB8-4058-AE05-E1A1BF976890");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, "Variazioni");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, "E1DA0F92-D958-48B1-84A2-EB348E386C2C");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, "Saldo");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, "00A4D7C6-CDAF-4A53-AC90-38EF663A6526");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, "CODICE DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, "DD88F6D2-5206-458A-91EE-92C5C6198718");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, "ANNO DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, "726A771E-F47B-40E3-9B5E-D835892951BF");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, "ANNO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, "A6E30ABF-11D4-437C-94F3-99F8C4C9C485");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, "NUMERO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_DOCUMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, MyGlb.PANEL_LIST, 0, 40, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, MyGlb.PANEL_LIST, "N.Doc");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, MyGlb.PANEL_FORM, 4, 100, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NDOC, MyGlb.PANEL_FORM, "N.Doc");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NDOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NDOC, PPQRY_FAT19, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, MyGlb.PANEL_LIST, 136, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, MyGlb.PANEL_LIST, "Data Doc.");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, MyGlb.PANEL_FORM, 4, 196, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOC, MyGlb.PANEL_FORM, "Data Doc.");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DATADOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DATADOC, PPQRY_FAT19, "A.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 216, 40, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 100);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 100);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DESCRIZIONE, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DESCRIZIONE, PPQRY_T03, "A.DESCRIZIONE", "T03DESCRIZIO", 5, 40, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, MyGlb.PANEL_LIST, 424, 40, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, MyGlb.PANEL_LIST, "N.Prot");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, MyGlb.PANEL_FORM, 4, 244, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NPROT, MyGlb.PANEL_FORM, "N.Prot");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NPROT, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NPROT, PPQRY_FAT19, "A.NUMERO_PROT", "NUMERO_PROT", 1, 7, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, MyGlb.PANEL_LIST, 476, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, MyGlb.PANEL_LIST, "Data Prot.");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, MyGlb.PANEL_FORM, 4, 268, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAPROT, MyGlb.PANEL_FORM, "Data Prot.");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DATAPROT, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DATAPROT, PPQRY_FAT19, "A.D_DATA_PROT", "D_DATA_PROT", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_LIST, 556, 40, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_FORM, 4, 292, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_IMPORTO, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_IMPORTO, PPQRY_FAT19, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, MyGlb.PANEL_LIST, 656, 40, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, MyGlb.PANEL_FORM, 4, 340, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, MyGlb.PANEL_FORM, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_VARIAZIONI, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_VARIAZIONI, PPQRY_FAT19, "A.VARIAZIONI", "VARIAZIONI", 3, 14, 2, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_LIST, 756, 40, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_LIST, 60);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_LIST, "Saldo");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_FORM, 4, 316, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_FORM, 60);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SALDO, MyGlb.PANEL_FORM, "Saldo");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SALDO, -1, -1);
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_SALDO, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SALDO, PPQRY_FAT19, "A.IMPORTO + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0)", "IMPUTATO", 3, 28, 6, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_LIST, "CODICE DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_FORM, 4, 364, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICEDOC, MyGlb.PANEL_FORM, "COD. DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_CODICEDOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_CODICEDOC, PPQRY_FAT19, "A.CODICE_DOC", "CODICE_DOC", 1, 2, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_LIST, 736, 40, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_FORM, 4, 364, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ANNODOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ANNODOC, PPQRY_FAT19, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, 736, 40, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, 12, 372, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, "ANNO PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ANNOPROG, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ANNOPROG, PPQRY_FAT19, "A.ANNO_PROG", "ANNO_PROG", 1, 4, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, 736, 40, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, 4, 396, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, 92);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, "NUMERO PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMEROPROG, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMEROPROG, PPQRY_FAT19, "A.NUMERO_PROG", "NUMERO_PROG", 1, 5, 0, -13997);
  }

  private void PAN_DOCUMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as T03DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T03 A ");
    SQL.append("where (A.CODICE = ~~CODICE_DOC~~) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_T03, 0, SQL, -1, "");
    PAN_DOCUMENTI.SetQueryDB(PPQRY_T03, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI.SetMasterTable(PPQRY_T03, "T03");
    PAN_DOCUMENTI.SetIMDB(IMDB, "PQRY_FAT19", true);
    PAN_DOCUMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "FAT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.ANNO_PROG as ANNO_PROG, ");
    SQL.append("  A.NUMERO_PROG as NUMERO_PROG, ");
    SQL.append("  A.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  A.CODICE_DOC as CODICE_DOC, ");
    SQL.append("  A.NUMERO_PROT as NUMERO_PROT, ");
    SQL.append("  A.D_DATA_PROT as D_DATA_PROT, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMPORTO + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0) as IMPUTATO, ");
    SQL.append("  A.VARIAZIONI as VARIAZIONI, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT19, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FAT A ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT19, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CODICE = ~~TBL_PARAM24.ROWNAMCODBEN~~) ");
    SQL.append("and   ((~~TBL_PARAM24.ROWNAMCODDOC~~ = 1 AND (A.CODICE_DOC = 2 OR A.CODICE_DOC = 7)) OR ((~~TBL_PARAM24.ROWNAMCODDOC~~ = 2 OR ~~TBL_PARAM24.ROWNAMCODDOC~~ = 7) AND A.CODICE_DOC = 1) OR (~~TBL_PARAM24.ROWNAMCODDOC~~ = 3 AND (A.CODICE_DOC = 4 OR A.CODICE_DOC = 8)) OR ((~~TBL_PARAM24.ROWNAMCODDOC~~ = 4 OR ~~TBL_PARAM24.ROWNAMCODDOC~~ = 8) AND A.CODICE_DOC = 3) OR (~~TBL_PARAM24.ROWNAMCODDOC~~ = 5) OR (~~TBL_PARAM24.ROWNAMCODDOC~~ = 6)) ");
    SQL.append("and   (((A.CODICE_DOC IN (1, 5, 7)) AND ((A.IMPORTO + NVL(A.VARIAZIONI, 0) - NVL(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  SUM(B.IMPORTO) ");
    SQL.append("from ");
    SQL.append("  LIQ B ");
    SQL.append("where (B.FAT_ANNO_PROG = A.ANNO_PROG) ");
    SQL.append("and   (B.FAT_NUMERO_PROG = A.NUMERO_PROG) ");
    SQL.append("and   (NOT ((B.ANNO_MAND IS NULL)) AND NOT ((B.NUMERO_MAND IS NULL))) ");
    SQL.append("), 0)) > 0)) OR ((A.CODICE_DOC IN (2, 3, 4, 6, 8)) AND (A.IMPORTO + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0)) > 0)) ");
    SQL.append("and   (A.ANNO_DOC = NVL(~~TBL_PARAM24.ROWNAMANNDOC~~, A.ANNO_DOC)) ");
    SQL.append("and   (A.NUMERO_DOC = NVL(~~TBL_PARAM24.ROWNAMNUMDOC~~, A.NUMERO_DOC)) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT19, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT19, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT19, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.D_DATA_DOC, ");
    SQL.append("  A.NUMERO_DOC ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT19, 5, SQL, -1, "");
    PAN_DOCUMENTI.SetQueryDB(PPQRY_FAT19, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI.SetMasterTable(0, "FAT");
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_DATADOC, true);
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_NDOC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCUMENTI.Status() == 2)
    {
      int oldListQBE = PAN_DOCUMENTI.iUseListQBE;
      PAN_DOCUMENTI.iUseListQBE = 0;
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_DOCUMENTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
