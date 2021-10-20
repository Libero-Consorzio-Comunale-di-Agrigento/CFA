// **********************************************
// Riscossioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Riscossioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_RISCOSSIONI_NUMEROORD = 0;
  private static int PFL_RISCOSSIONI_ANNOORD = 1;
  private static int PFL_RISCOSSIONI_DATA = 2;
  private static int PFL_RISCOSSIONI_IMPORTO = 3;
  private static int PFL_RISCOSSIONI_CAPITOLO = 4;
  private static int PFL_RISCOSSIONI_ARTICOLO = 5;
  private static int PFL_RISCOSSIONI_NUMIMP = 6;
  private static int PFL_RISCOSSIONI_ANNOIMP = 7;
  private static int PFL_RISCOSSIONI_DDATAORD = 8;
  private static int PFL_RISCOSSIONI_LABELORDINAT = 9;
  private static int PFL_RISCOSSIONI_LABELCAPITOL = 10;
  private static int PFL_RISCOSSIONI_LABELACCERTA = 11;
  private static int PFL_RISCOSSIONI_ORDINATIVO = 12;
  private static int PFL_RISCOSSIONI_RIFBILANCPEG = 13;
  private static int PFL_RISCOSSIONI_ACCERTAMENTO = 14;

  private static int PPQRY_ORD5 = 0;


  IDPanel PAN_RISCOSSIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI55(IMDB);
    //
    //
    Init_PQRY_ORD5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI55(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI55, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI55, "TBL_PARAMETRI55");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI55,IMDBDef1.FLD_PARAMETRI55_PARAMDATA, "PARAMDATA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI55,IMDBDef1.FLD_PARAMETRI55_PARAMDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI55,IMDBDef1.FLD_PARAMETRI55_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI55,IMDBDef1.FLD_PARAMETRI55_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI55,IMDBDef1.FLD_PARAMETRI55_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI55,IMDBDef1.FLD_PARAMETRI55_PARAMTIPO,5,15,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI55, 0);
  }

  private static void Init_PQRY_ORD5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ORD5, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_ORD5, "PQRY_ORD5");
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDORDINATIV, "ORDORDINATIV");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDORDINATIV,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_D_DATA_INC, "D_DATA_INC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_D_DATA_INC,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDIMPORTO, "ORDIMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDIMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDRIFBILPEG, "ORDRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDRIFBILPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDACCERTAME, "ORDACCERTAME");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDACCERTAME,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDNUMIMP, "ORDNUMIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDNUMIMP,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDANNOIMP, "ORDANNOIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_ORDANNOIMP,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_DDATAORD, "DDATAORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD5,IMDBDef8.PQSL_ORD5_DDATAORD,6,0,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ORD5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Riscossioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public Riscossioni()
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
    FormIdx = MyGlb.FRM_RISCOSSIONI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "64A89195-30A8-476F-8D13-9DAA355C2247";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 564;
    DesignHeight = 366;
    set_Caption(new IDVariant("Riscossioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 564;
    Frames[1].Height = 340;
    Frames[1].Caption = "Riscossioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 340;
    PAN_RISCOSSIONI = new IDPanel(w, this, 1, "PAN_RISCOSSIONI");
    Frames[1].Content = PAN_RISCOSSIONI;
    PAN_RISCOSSIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RISCOSSIONI.VS = MainFrm.VisualStyleList;
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 564-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "618B2B17-58C5-4812-A4A9-5A286E6F7CC6");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 476, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RISCOSSIONI.InitStatus = 2;
    PAN_RISCOSSIONI_Init();
    PAN_RISCOSSIONI_InitFields();
    PAN_RISCOSSIONI_InitQueries();
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
      PAN_RISCOSSIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof Riscossioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Riscossioni.class.getName() : (Glb.ClassWithPackage(Riscossioni.class) ? Riscossioni.class.getName().substring(Riscossioni.class.getPackage().getName().length() + 1) : Riscossioni.class.getName()));
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
      Frames[PAN_RISCOSSIONI.FrIndex].set_Caption(IDL.Add((new IDVariant(Frames[PAN_RISCOSSIONI.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMTIPO, 0), IDL.Add((new IDVariant(" ")), (new IDVariant("Finanziamento")))))).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMTIPO, 0), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("Finanziamento")), MainFrm.ESERCIZIO))))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Riscossioni", "LoadEvent", _e);
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
  private void PAN_RISCOSSIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RISCOSSIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RISCOSSIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RISCOSSIONI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RISCOSSIONI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_RISCOSSIONI);
    // Stub
  }

  private void PAN_RISCOSSIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_RISCOSSIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_RISCOSSIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RISCOSSIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RISCOSSIONI_Init()
  {

    PAN_RISCOSSIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RISCOSSIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RISCOSSIONI.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, "C880121D-2D01-4B8D-925E-8807FEDB8A43");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, "NUMERO ORD");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, "A82C6179-4975-4D2A-ABDF-198C302CB4E2");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, "ANNO ORD");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, "AEADAA13-47AF-4BB4-9286-D3B9F9B40CCF");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, "Data");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, "DE7FF862-7F50-4E0F-AE64-1C4DBF49C1FB");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, "Importo");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, "599A5092-249E-44A9-94E4-CAD3551E761C");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, "CAPITOLO");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, "E6BB5D12-EE4B-41EE-A969-94F6F77E44C4");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, "ARTICOLO");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, "1851A947-391A-4C22-BB6B-31644846FCC8");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, "Num Imp");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, "804BE584-1930-4CD2-8A3C-6602A8B13FFA");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, "Anno Imp");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, "BA1167B6-E95E-418C-98F1-94BC2EEB4E22");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, "D Data Ord");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, MyGlb.VIS_NORMFIELPADR);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, "8F8CD9B1-27A3-46FB-8897-2A4187CF1E59");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, "Ordinativo");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, MyGlb.VIS_LABEVISUSTYL);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, "F3EC53AB-4B10-46F0-B7DE-42DE4F54ED89");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, "Capitolo/Art.");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, "9077A96E-7861-4607-929D-D3116688924A");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, "Accertamento");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, "29B917A7-2982-444E-85CE-C3B39B763E25");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, "Ordinativo");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, "92271C53-4879-4CA6-B6C8-7F63EC75BE4E");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISCOSSIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, "1CE1DA12-1FA8-411C-A6EC-2A7D984E48D4");
    PAN_RISCOSSIONI.set_Header(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, "Accertamento");
    PAN_RISCOSSIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, "");
    PAN_RISCOSSIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_RISCOSSIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RISCOSSIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, MyGlb.PANEL_FORM, 4, 340, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_NUMEROORD, -1, -1);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_NUMEROORD, PPQRY_ORD5, "B.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, MyGlb.PANEL_LIST, 44, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, MyGlb.PANEL_LIST, 64);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, MyGlb.PANEL_FORM, 4, 364, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, MyGlb.PANEL_FORM, 64);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_ANNOORD, -1, -1);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_ANNOORD, PPQRY_ORD5, "B.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, MyGlb.PANEL_LIST, 84, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, MyGlb.PANEL_FORM, 4, 316, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, MyGlb.PANEL_FORM, 68);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_DATA, -1, -1);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_DATA, PPQRY_ORD5, "B.D_DATA_INC", "D_DATA_INC", 6, 10, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, MyGlb.PANEL_LIST, 160, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 196, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_IMPORTO, -1, -1);
    PAN_RISCOSSIONI.SetFieldUnbound(PFL_RISCOSSIONI_IMPORTO, true);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_IMPORTO, PPQRY_ORD5, "SUM(B.IMPORTO)", "ORDIMPORTO", 3, 28, 6, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, MyGlb.PANEL_LIST, 260, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_CAPITOLO, -1, -1);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_CAPITOLO, PPQRY_ORD5, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, MyGlb.PANEL_LIST, 360, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, MyGlb.PANEL_FORM, 4, 436, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_ARTICOLO, -1, -1);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_ARTICOLO, PPQRY_ORD5, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, MyGlb.PANEL_LIST, 384, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, MyGlb.PANEL_LIST, 52);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, MyGlb.PANEL_LIST, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, MyGlb.PANEL_LIST, "Num Imp");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, MyGlb.PANEL_FORM, 4, 340, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, MyGlb.PANEL_FORM, 52);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, MyGlb.PANEL_FORM, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_NUMIMP, MyGlb.PANEL_FORM, "Nm. Im.");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_NUMIMP, -1, -1);
    PAN_RISCOSSIONI.SetFieldUnbound(PFL_RISCOSSIONI_NUMIMP, true);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_NUMIMP, PPQRY_ORD5, "MAX(A.NUMERO_ACC)", "ORDNUMIMP", 1, 19, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, MyGlb.PANEL_LIST, 432, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, MyGlb.PANEL_LIST, 56);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, MyGlb.PANEL_LIST, "Anno Imp");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, MyGlb.PANEL_FORM, 4, 340, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, MyGlb.PANEL_FORM, 56);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ANNOIMP, MyGlb.PANEL_FORM, "Ann. Im.");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_ANNOIMP, -1, -1);
    PAN_RISCOSSIONI.SetFieldUnbound(PFL_RISCOSSIONI_ANNOIMP, true);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_ANNOIMP, PPQRY_ORD5, "MAX(A.ANNO_ACC)", "ORDANNOIMP", 1, 19, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, MyGlb.PANEL_LIST, 64);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, MyGlb.PANEL_LIST, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, MyGlb.PANEL_LIST, "D Data Ord");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, MyGlb.PANEL_FORM, 4, 340, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, MyGlb.PANEL_FORM, 64);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, MyGlb.PANEL_FORM, 1);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_DDATAORD, MyGlb.PANEL_FORM, "D Dt. Ord");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_DDATAORD, -1, -1);
    PAN_RISCOSSIONI.SetFieldUnbound(PFL_RISCOSSIONI_DDATAORD, true);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_DDATAORD, PPQRY_ORD5, "MAX(A.D_DATA_ORD)", "DDATAORD", 6, 0, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, MyGlb.PANEL_LIST, 0, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, MyGlb.PANEL_LIST, 0);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, MyGlb.PANEL_LIST, 2);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, MyGlb.PANEL_FORM, 4, 0, 80, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, MyGlb.PANEL_FORM, 0);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELORDINAT, MyGlb.PANEL_FORM, 2);
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_LABELORDINAT, -1, -1);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_LABELORDINAT, -1, "", "LABELORDINAT", 0, 0, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, MyGlb.PANEL_LIST, 260, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, MyGlb.PANEL_FORM, 12, 8, 80, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_LABELCAPITOL, -1, -1);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, MyGlb.PANEL_LIST, 384, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, MyGlb.PANEL_FORM, 20, 16, 80, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_LABELACCERTA, MyGlb.PANEL_FORM, 2);
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_LABELACCERTA, -1, -1);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, MyGlb.PANEL_LIST, 60);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, MyGlb.PANEL_LIST, 2);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, MyGlb.PANEL_LIST, "Ordinativo");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, MyGlb.PANEL_FORM, 4, 460, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, MyGlb.PANEL_FORM, 60);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, MyGlb.PANEL_FORM, 2);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ORDINATIVO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_ORDINATIVO, -1, -1);
    PAN_RISCOSSIONI.SetFieldUnbound(PFL_RISCOSSIONI_ORDINATIVO, true);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_ORDINATIVO, PPQRY_ORD5, "MAX(TO_CHAR ( B.NUMERO_ORD ) || ' / ' || TO_CHAR ( B.ANNO_ORD ))", "ORDORDINATIV", 5, 99, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 460, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_RIFBILANCPEG, -1, -1);
    PAN_RISCOSSIONI.SetFieldUnbound(PFL_RISCOSSIONI_RIFBILANCPEG, true);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_RIFBILANCPEG, PPQRY_ORD5, "MAX(TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ))", "ORDRIFBILPEG", 5, 99, 0, -13997);
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_RISCOSSIONI.SetRect(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 460, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISCOSSIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_RISCOSSIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_RISCOSSIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISCOSSIONI_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_RISCOSSIONI.SetFieldPage(PFL_RISCOSSIONI_ACCERTAMENTO, -1, -1);
    PAN_RISCOSSIONI.SetFieldUnbound(PFL_RISCOSSIONI_ACCERTAMENTO, true);
    PAN_RISCOSSIONI.SetFieldPanel(PFL_RISCOSSIONI_ACCERTAMENTO, PPQRY_ORD5, "MAX(TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ACC ))", "ORDACCERTAME", 5, 99, 0, -13997);
  }

  private void PAN_RISCOSSIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_RISCOSSIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RISCOSSIONI.SetIMDB(IMDB, "PQRY_ORD5", true);
    PAN_RISCOSSIONI.set_SetString(MyGlb.MASTER_ROWNAME, "ORD");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  MAX(TO_CHAR ( B.NUMERO_ORD ) || ' / ' || TO_CHAR ( B.ANNO_ORD )) as ORDORDINATIV, ");
    SQL.append("  B.D_DATA_INC as D_DATA_INC, ");
    SQL.append("  SUM(B.IMPORTO) as ORDIMPORTO, ");
    SQL.append("  MAX(TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )) as ORDRIFBILPEG, ");
    SQL.append("  MAX(TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ACC )) as ORDACCERTAME, ");
    SQL.append("  B.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  B.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  MAX(A.NUMERO_ACC) as ORDNUMIMP, ");
    SQL.append("  MAX(A.ANNO_ACC) as ORDANNOIMP, ");
    SQL.append("  MAX(A.D_DATA_ORD) as DDATAORD ");
    PAN_RISCOSSIONI.SetQuery(PPQRY_ORD5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ORD A, ");
    SQL.append("  INCASSI B ");
    PAN_RISCOSSIONI.SetQuery(PPQRY_ORD5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD = B.ANNO_ORD(+)) ");
    SQL.append("and   (A.NUMERO_ORD = B.NUMERO_ORD(+)) ");
    SQL.append("and   (B.D_DATA_INC <= ~~TBL_PARAMETRI55.PARAMDATA~~) ");
    SQL.append("and   ((DECODE(~~TBL_PARAMETRI55.PARAMTIPO~~, 'a Residuo', A.ANNO_ACC, 1) < DECODE(~~TBL_PARAMETRI55.PARAMTIPO~~, 'a Residuo', ~~TBL_DATISESSIONE.SESSIOESERCI~~, 2)) AND (DECODE(~~TBL_PARAMETRI55.PARAMTIPO~~, 'di Competenza', A.ANNO_ACC, 1) = DECODE(~~TBL_PARAMETRI55.PARAMTIPO~~, 'di Competenza', ~~TBL_DATISESSIONE.SESSIOESERCI~~, 1))) ");
    SQL.append("and   (A.D_DATA_ORD <= ~~TBL_PARAMETRI55.PARAMDATA~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI55.PARAMTIPO~~, 'a Residuo', ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  ACC C ");
    SQL.append("where (C.ANNO_ACC < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (C.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   (C.FINANZIAMENTO = ~~TBL_PARAMETRI55.PARAMFINANZI~~) ");
    SQL.append("), ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  ACC D ");
    SQL.append("where (D.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (D.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   (D.ANNO_ACC = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (D.FINANZIAMENTO = ~~TBL_PARAMETRI55.PARAMFINANZI~~) ");
    SQL.append(")) = 'x') ");
    SQL.append("and   (A.ANNO_ORD = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_RISCOSSIONI.SetQuery(PPQRY_ORD5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  B.NUMERO_ORD, ");
    SQL.append("  B.ANNO_ORD, ");
    SQL.append("  B.D_DATA_INC ");
    PAN_RISCOSSIONI.SetQuery(PPQRY_ORD5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RISCOSSIONI.SetQuery(PPQRY_ORD5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_ORD, ");
    SQL.append("  B.NUMERO_ORD ");
    PAN_RISCOSSIONI.SetQuery(PPQRY_ORD5, 5, SQL, -1, "");
    PAN_RISCOSSIONI.SetQueryDB(PPQRY_ORD5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RISCOSSIONI.SetMasterTable(0, "ORD");
    PAN_RISCOSSIONI.AddToSortList(PFL_RISCOSSIONI_ANNOORD, true);
    PAN_RISCOSSIONI.AddToSortList(PFL_RISCOSSIONI_NUMEROORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RISCOSSIONI.Status() == 2)
    {
      int oldListQBE = PAN_RISCOSSIONI.iUseListQBE;
      PAN_RISCOSSIONI.iUseListQBE = 0;
      PAN_RISCOSSIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_RISCOSSIONI.PanelCommand(Glb.PCM_FIND);
      PAN_RISCOSSIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RISCOSSIONI) PAN_RISCOSSIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RISCOSSIONI) PAN_RISCOSSIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RISCOSSIONI) PAN_RISCOSSIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RISCOSSIONI) PAN_RISCOSSIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RISCOSSIONI) PAN_RISCOSSIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
