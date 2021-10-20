// **********************************************
// Ordinativi Emessi Esercizi Precedenti Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiEmessiEserciziPrecedentiFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ORDEMEESPRFI_NUMEROORD = 0;
  private static int PFL_ORDEMEESPRFI_ANNOORD = 1;
  private static int PFL_ORDEMEESPRFI_DATA = 2;
  private static int PFL_ORDEMEESPRFI_IMPORTO = 3;
  private static int PFL_ORDEMEESPRFI_INCASSATO = 4;
  private static int PFL_ORDEMEESPRFI_CAPITOLO = 5;
  private static int PFL_ORDEMEESPRFI_ARTICOLO = 6;
  private static int PFL_ORDEMEESPRFI_NUMEROACC = 7;
  private static int PFL_ORDEMEESPRFI_ANNOACC = 8;
  private static int PFL_ORDEMEESPRFI_LABELORDINAT = 9;
  private static int PFL_ORDEMEESPRFI_LABELCAPITOL = 10;
  private static int PFL_ORDEMEESPRFI_LABELACCERTA = 11;
  private static int PFL_ORDEMEESPRFI_ORDINATIVO = 12;
  private static int PFL_ORDEMEESPRFI_RIFBILANCPEG = 13;
  private static int PFL_ORDEMEESPRFI_ACCERTAMENTO = 14;

  private static int PPQRY_ORD9 = 0;


  IDPanel PAN_ORDEMEESPRFI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI57(IMDB);
    //
    //
    Init_PQRY_ORD9(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI57(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI57, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI57, "TBL_PARAMETRI57");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI57,IMDBDef1.FLD_PARAMETRI57_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI57,IMDBDef1.FLD_PARAMETRI57_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI57, 0);
  }

  private static void Init_PQRY_ORD9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ORD9, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_ORD9, "PQRY_ORD9");
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ORDORDINATIV, "ORDORDINATIV");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ORDORDINATIV,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_D_DATA_ORD, "D_DATA_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_D_DATA_ORD,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_INCASSATO, "INCASSATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_INCASSATO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ORDRIFBILPEG, "ORDRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ORDRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ORDACCERTAME, "ORDACCERTAME");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ORDACCERTAME,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD9,IMDBDef8.PQSL_ORD9_ANNO_ACC,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ORD9, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiEmessiEserciziPrecedentiFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiEmessiEserciziPrecedentiFinanziamento()
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
    FormIdx = MyGlb.FRM_ORDEMEESPRFI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E2450344-8A9A-4781-81FC-1114617F6BD3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 624;
    DesignHeight = 386;
    set_Caption(new IDVariant("Ordinativi Emessi Esercizi Precedenti Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 624;
    Frames[1].Height = 360;
    Frames[1].Caption = "Ordinativi Emessi Esercizi Precedenti Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_ORDEMEESPRFI = new IDPanel(w, this, 1, "PAN_ORDEMEESPRFI");
    Frames[1].Content = PAN_ORDEMEESPRFI;
    PAN_ORDEMEESPRFI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDEMEESPRFI.VS = MainFrm.VisualStyleList;
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 624-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E018C3E8-8F99-414A-BD04-F2F7772A835E");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 584, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDEMEESPRFI.InitStatus = 2;
    PAN_ORDEMEESPRFI_Init();
    PAN_ORDEMEESPRFI_InitFields();
    PAN_ORDEMEESPRFI_InitQueries();
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
      PAN_ORDEMEESPRFI.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdinativiEmessiEserciziPrecedentiFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiEmessiEserciziPrecedentiFinanziamento.class.getName() : (Glb.ClassWithPackage(OrdinativiEmessiEserciziPrecedentiFinanziamento.class) ? OrdinativiEmessiEserciziPrecedentiFinanziamento.class.getName().substring(OrdinativiEmessiEserciziPrecedentiFinanziamento.class.getPackage().getName().length() + 1) : OrdinativiEmessiEserciziPrecedentiFinanziamento.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiEmessiEserciziPrecedentiFinanziamento", "LoadEvent", _e);
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
  private void PAN_ORDEMEESPRFI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDEMEESPRFI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDEMEESPRFI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDEMEESPRFI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDEMEESPRFI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ORDEMEESPRFI);
    // Stub
  }

  private void PAN_ORDEMEESPRFI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ORDEMEESPRFI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDEMEESPRFI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD9, IMDBDef8.PQSL_ORD9_D_DATA_ORD, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ORD9, IMDBDef8.PQSL_ORD9_D_DATA_ORD, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ORDEMEESPRFI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDEMEESPRFI_Init()
  {

    PAN_ORDEMEESPRFI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDEMEESPRFI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDEMEESPRFI.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, "93E3F223-CD97-4A8C-B859-95127E68FCED");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, "NUMERO ORD");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, "5DFC7A98-3E48-4240-A302-271CADEF1C9A");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, "ANNO ORD");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, "F6FA7EDB-854D-42F8-B4DD-7BF669FF1AE2");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, "Data");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, "EB841EFE-7F42-4A4A-A4CF-833908EFB2B3");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, "Importo");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, "EBD505BB-AFE8-4E68-BE3E-0C29CE4CD88D");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, "Incassato");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, "8DB60D4C-EA1C-4692-93D6-2D886465C87E");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, "CAPITOLO");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, "942209BB-8FAB-46BA-B5AC-06887689D113");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, "ARTICOLO");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, "7ECB00F9-1550-4B49-A5FA-E48451324CCF");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, "NUMERO ACC");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, "3E743D00-F4B3-4753-A464-AF059F2FC176");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, "ANNO ACC");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, "2EDB63D0-8538-4250-BE95-C448EF481CAC");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, "Ordinativo");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, "4E1D1BB7-BD9B-417B-A981-3F8FD00CDF07");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, "Capitolo/Art.");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, "530C86D6-FDAF-474E-88D5-7D2C9EBF90BD");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, "Accertamento");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, "C7EA19B9-0F99-4A94-8A07-1CECE6A76D89");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, "Ordinativo");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, "");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, "BEC6966C-F5C1-4F3D-BB1C-5BFEBD3BFDC0");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, "To String (ORD CAPITOLO) + \" / \" + To String (ORD ARTICOLO)");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, "514B437D-724D-4D9C-91F3-4916D0F2DCB0");
    PAN_ORDEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, "Accertamento");
    PAN_ORDEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, "To String (ORD NUMERO ACC) + \" / \" + To String (ORD ANNO ACC)");
    PAN_ORDEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ORDEMEESPRFI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, MyGlb.PANEL_FORM, 4, 484, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_NUMEROORD, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_NUMEROORD, PPQRY_ORD9, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, MyGlb.PANEL_LIST, 44, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, MyGlb.PANEL_LIST, 64);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, MyGlb.PANEL_FORM, 4, 508, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, MyGlb.PANEL_FORM, 64);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_ANNOORD, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_ANNOORD, PPQRY_ORD9, "A.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, MyGlb.PANEL_LIST, 84, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, MyGlb.PANEL_LIST, 72);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, MyGlb.PANEL_FORM, 4, 316, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, MyGlb.PANEL_FORM, 72);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_DATA, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_DATA, PPQRY_ORD9, "A.D_DATA_ORD", "D_DATA_ORD", 6, 19, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, MyGlb.PANEL_LIST, 160, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, MyGlb.PANEL_FORM, 4, 340, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_IMPORTO, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_IMPORTO, PPQRY_ORD9, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, MyGlb.PANEL_LIST, 260, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, MyGlb.PANEL_LIST, 68);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, MyGlb.PANEL_LIST, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, MyGlb.PANEL_LIST, "Incassato");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, MyGlb.PANEL_FORM, 4, 364, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, MyGlb.PANEL_FORM, 68);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_INCASSATO, MyGlb.PANEL_FORM, "Incassato");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_INCASSATO, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_INCASSATO, PPQRY_ORD9, "A.INCASSATO", "INCASSATO", 3, 14, 2, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, MyGlb.PANEL_LIST, 360, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, MyGlb.PANEL_FORM, 4, 556, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_CAPITOLO, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_CAPITOLO, PPQRY_ORD9, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, MyGlb.PANEL_LIST, 464, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, MyGlb.PANEL_FORM, 4, 580, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_ARTICOLO, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_ARTICOLO, PPQRY_ORD9, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, MyGlb.PANEL_LIST, 492, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, MyGlb.PANEL_FORM, 4, 604, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_NUMEROACC, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_NUMEROACC, PPQRY_ORD9, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, MyGlb.PANEL_LIST, 540, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, MyGlb.PANEL_FORM, 4, 628, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_ANNOACC, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_ANNOACC, PPQRY_ORD9, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, MyGlb.PANEL_LIST, 0, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, MyGlb.PANEL_LIST, 0);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, MyGlb.PANEL_LIST, 2);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, MyGlb.PANEL_FORM, 0, 0, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, MyGlb.PANEL_FORM, 0);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELORDINAT, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_LABELORDINAT, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_LABELORDINAT, -1, "", "LABELORDINAT", 0, 0, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_LIST, 360, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_FORM, 8, 8, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_LABELCAPITOL, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, MyGlb.PANEL_LIST, 492, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, MyGlb.PANEL_FORM, 16, 16, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_LABELACCERTA, MyGlb.PANEL_FORM, 1);
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_LABELACCERTA, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, MyGlb.PANEL_LIST, 60);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, MyGlb.PANEL_LIST, 2);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, MyGlb.PANEL_LIST, "Ordinativo");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, MyGlb.PANEL_FORM, 4, 652, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, MyGlb.PANEL_FORM, 60);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, MyGlb.PANEL_FORM, 2);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ORDINATIVO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_ORDINATIVO, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldUnbound(PFL_ORDEMEESPRFI_ORDINATIVO, true);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_ORDINATIVO, PPQRY_ORD9, "TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ORD )", "ORDORDINATIV", 5, 201, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 652, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_RIFBILANCPEG, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldUnbound(PFL_ORDEMEESPRFI_RIFBILANCPEG, true);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_RIFBILANCPEG, PPQRY_ORD9, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "ORDRIFBILPEG", 5, 201, 0, -13997);
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_ORDEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 652, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_ORDEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ORDEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDEMEESPRFI_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_ORDEMEESPRFI.SetFieldPage(PFL_ORDEMEESPRFI_ACCERTAMENTO, -1, -1);
    PAN_ORDEMEESPRFI.SetFieldUnbound(PFL_ORDEMEESPRFI_ACCERTAMENTO, true);
    PAN_ORDEMEESPRFI.SetFieldPanel(PFL_ORDEMEESPRFI_ACCERTAMENTO, PPQRY_ORD9, "TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ACC )", "ORDACCERTAME", 5, 201, 0, -13997);
  }

  private void PAN_ORDEMEESPRFI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDEMEESPRFI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDEMEESPRFI.SetIMDB(IMDB, "PQRY_ORD9", true);
    PAN_ORDEMEESPRFI.set_SetString(MyGlb.MASTER_ROWNAME, "ORD");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ORD ) as ORDORDINATIV, ");
    SQL.append("  A.D_DATA_ORD as D_DATA_ORD, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.INCASSATO as INCASSATO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as ORDRIFBILPEG, ");
    SQL.append("  TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ACC ) as ORDACCERTAME, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC ");
    PAN_ORDEMEESPRFI.SetQuery(PPQRY_ORD9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ORD A ");
    PAN_ORDEMEESPRFI.SetQuery(PPQRY_ORD9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  ACC B ");
    SQL.append("where (B.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (B.FINANZIAMENTO = ~~TBL_PARAMETRI57.PARAMFINANZI~~) ");
    SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("))) ");
    PAN_ORDEMEESPRFI.SetQuery(PPQRY_ORD9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDEMEESPRFI.SetQuery(PPQRY_ORD9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDEMEESPRFI.SetQuery(PPQRY_ORD9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD ");
    PAN_ORDEMEESPRFI.SetQuery(PPQRY_ORD9, 5, SQL, -1, "");
    PAN_ORDEMEESPRFI.SetQueryDB(PPQRY_ORD9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDEMEESPRFI.SetMasterTable(0, "ORD");
    PAN_ORDEMEESPRFI.AddToSortList(PFL_ORDEMEESPRFI_ANNOORD, true);
    PAN_ORDEMEESPRFI.AddToSortList(PFL_ORDEMEESPRFI_NUMEROORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDEMEESPRFI.Status() == 2)
    {
      int oldListQBE = PAN_ORDEMEESPRFI.iUseListQBE;
      PAN_ORDEMEESPRFI.iUseListQBE = 0;
      PAN_ORDEMEESPRFI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDEMEESPRFI.PanelCommand(Glb.PCM_FIND);
      PAN_ORDEMEESPRFI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDEMEESPRFI) PAN_ORDEMEESPRFI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDEMEESPRFI) PAN_ORDEMEESPRFI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDEMEESPRFI) PAN_ORDEMEESPRFI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDEMEESPRFI) PAN_ORDEMEESPRFI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDEMEESPRFI) PAN_ORDEMEESPRFI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
