// **********************************************
// Liquidazioni Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioniFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_LIQUIDFINANZ_CAPITOLO = 0;
  private static int PFL_LIQUIDFINANZ_ARTICOLO = 1;
  private static int PFL_LIQUIDFINANZ_NUMEROIMP = 2;
  private static int PFL_LIQUIDFINANZ_ANNOIMP = 3;
  private static int PFL_LIQUIDFINANZ_NUMEROLIQ = 4;
  private static int PFL_LIQUIDFINANZ_ANNOLIQ = 5;
  private static int PFL_LIQUIDFINANZ_IMPORTO = 6;
  private static int PFL_LIQUIDFINANZ_INEMISS = 7;
  private static int PFL_LIQUIDFINANZ_BENEFICIARIO = 8;
  private static int PFL_LIQUIDFINANZ_DESCRIZIONE = 9;
  private static int PFL_LIQUIDFINANZ_NUMERODOC = 10;
  private static int PFL_LIQUIDFINANZ_ANNODOC = 11;
  private static int PFL_LIQUIDFINANZ_NUMEROSUBIMP = 12;
  private static int PFL_LIQUIDFINANZ_ANNOSUBIMP = 13;
  private static int PFL_LIQUIDFINANZ_LABELCAPITOL = 14;
  private static int PFL_LIQUIDFINANZ_LABELIMPEGNO = 15;
  private static int PFL_LIQUIDFINANZ_LABELLIQUIDA = 16;
  private static int PFL_LIQUIDFINANZ_LABELDOCUMEN = 17;
  private static int PFL_LIQUIDFINANZ_LABELSUBIMPE = 18;
  private static int PFL_LIQUIDFINANZ_RIFBILANCPEG = 19;
  private static int PFL_LIQUIDFINANZ_IMPEGNO = 20;
  private static int PFL_LIQUIDFINANZ_LIQUIDAZIONE = 21;
  private static int PFL_LIQUIDFINANZ_DOCUMENTO = 22;
  private static int PFL_LIQUIDFINANZ_SUBIMPEGNO = 23;

  private static int PPQRY_LIQ37 = 0;


  IDPanel PAN_LIQUIDFINANZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI44(IMDB);
    //
    //
    Init_PQRY_LIQ37(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI44(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI44, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI44, "TBL_PARAMETRI44");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI44,IMDBDef1.FLD_PARAMETRI44_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI44,IMDBDef1.FLD_PARAMETRI44_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI44, 0);
  }

  private static void Init_PQRY_LIQ37(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_LIQ37, 20);
    IMDB.set_TblCode(IMDBDef8.PQRY_LIQ37, "PQRY_LIQ37");
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQRIFBILPEG, "LIQRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQIMPEGNO, "LIQIMPEGNO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQIMPEGNO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQLIQUIDAZI,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQINEMISS, "LIQINEMISS");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQINEMISS,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQDOCUMENTO, "LIQDOCUMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQDOCUMENTO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQSUBIMPEGN, "LIQSUBIMPEGN");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_LIQSUBIMPEGN,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ37,IMDBDef8.PQSL_LIQ37_ANNO_SUBIMP,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_LIQ37, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioniFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioniFinanziamento()
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
    FormIdx = MyGlb.FRM_LIQUIDFINANZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E4B3210C-E0B0-4D39-BAD7-8AE781851CDF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 410;
    set_Caption(new IDVariant("Liquidazioni Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 384;
    Frames[1].Caption = "Liquidazioni Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 384;
    PAN_LIQUIDFINANZ = new IDPanel(w, this, 1, "PAN_LIQUIDFINANZ");
    Frames[1].Content = PAN_LIQUIDFINANZ;
    PAN_LIQUIDFINANZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDFINANZ.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D772E609-112B-46E3-9CAE-E7CB50E9FB90");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1160, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDFINANZ.InitStatus = 1;
    PAN_LIQUIDFINANZ_Init();
    PAN_LIQUIDFINANZ_InitFields();
    PAN_LIQUIDFINANZ_InitQueries();
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
      PAN_LIQUIDFINANZ.UpdatePanel(MainFrm);
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
    return (obj instanceof LiquidazioniFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioniFinanziamento.class.getName() : (Glb.ClassWithPackage(LiquidazioniFinanziamento.class) ? LiquidazioniFinanziamento.class.getName().substring(LiquidazioniFinanziamento.class.getPackage().getName().length() + 1) : LiquidazioniFinanziamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Liquidazioni Finanziamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDFINANZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIDFINANZ);
      // 
      // Liquidazioni Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_LIQUIDFINANZ.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDFINANZ_BENEFICIARIO,IMDB.Value(IMDBDef8.PQRY_LIQ37, IMDBDef8.PQSL_LIQ37_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
      PAN_LIQUIDFINANZ.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDFINANZ_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_LIQ37, IMDBDef8.PQSL_LIQ37_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniFinanziamento", "LiquidazioniFinanziamentoOnDynamicPropertiesEvent", _e);
    }
  }

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
      MainFrm.ErrObj.ProcError ("LiquidazioniFinanziamento", "LoadEvent", _e);
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
  private void PAN_LIQUIDFINANZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDFINANZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDFINANZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDFINANZ, Cancel);
    // Stub
  }

  private void PAN_LIQUIDFINANZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_LIQUIDFINANZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDFINANZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDFINANZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIDFINANZ_Init()
  {

    PAN_LIQUIDFINANZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDFINANZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDFINANZ.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, "4142D8E0-9007-4B34-914E-2CB804C2BE44");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, "CAPITOLO");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, "BEA11589-9B01-4FFE-A2CB-6AC28776E610");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, "ARTICOLO");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, "06928C63-7ED6-4765-8440-AB172DC16FE1");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, "NUMERO IMP");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, "C733CB81-64DA-460C-9DD1-5A09DA7A3561");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, "ANNO IMP");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, "1B02D7F1-A9BF-49ED-B0CD-39F6A722DACA");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, "NUMERO LIQ");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, "D069C1E6-1090-4240-84C0-0592BCFD893D");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, "ANNO LIQ");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, "841AC3DF-5189-4B6F-8610-D7D14EACCBED");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, "Importo");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, "C0F761AF-B42D-4D46-A97C-A731515CBB8F");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, "In Emiss.");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, "4435053D-C27A-424C-A88C-6DF299FC0374");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, "Beneficiario");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, "197000FD-9625-4954-B972-A902D1631DB5");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, "Descrizione");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, "5962F7C9-7875-4442-8662-091EF008219C");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, "NUMERO DOC");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, "DC2EFE15-AF50-40A3-A266-B853485E0F74");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, "ANNO DOC");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, "35825184-0422-4AA5-A050-C4F0660760CF");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, "4C8B8B63-B258-41F7-8556-572761E2960B");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, "");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, "433BEFE7-966C-4EFC-B887-6A095FC3335E");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, "Capitolo");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, "9F880043-5B71-4380-94EA-60EA27222662");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, "Impegno");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, "781F7941-E641-4FE9-A0D0-B6F886C10EF0");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, "Liquidazione");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, "7FBA7B6F-E5E4-46C7-ABB9-347860AEADF4");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, "Documento");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, "E7A60BE8-752B-41B7-A611-3CB9929C2921");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, "Sub-Impegno");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, "9161D4B1-0ABD-4126-881F-52F2B81FB627");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, "To String (LIQ CAPITOLO) + \" / \" + To String (LIQ ARTICOLO)");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, "C4489CB0-45F6-46FC-B705-3B578DC5ECA3");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, "Impegno");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, "To String (LIQ NUMERO IMP) + \" / \" + To String (LIQ ANNO IMP)");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, "85304197-55D0-4541-8E5B-1DADCFAD444F");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, "Liquidazione");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, "To String (NUMERO LIQ) + \" / \" + To String (ANNO LIQ)");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, "B5F8069F-6EA9-40A7-A181-86F6BD49388A");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, "Documento");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, "To String (LIQ NUMERO DOC) + \" / \" + To String (LIQ ANNO DOC)");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, "693EEB81-ECCF-43D7-A6ED-FD1E2935D672");
    PAN_LIQUIDFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, "Sub Impegno");
    PAN_LIQUIDFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, "To String (LIQ NUMERO SUBIMP) + \" / \" + To String (LIQ ANNO SUBIMP)");
    PAN_LIQUIDFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LIQUIDFINANZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, MyGlb.PANEL_FORM, 4, 616, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_CAPITOLO, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_CAPITOLO, PPQRY_LIQ37, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, MyGlb.PANEL_LIST, 100, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, MyGlb.PANEL_FORM, 4, 640, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_ARTICOLO, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_ARTICOLO, PPQRY_LIQ37, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, MyGlb.PANEL_LIST, 124, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, MyGlb.PANEL_FORM, 4, 664, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_NUMEROIMP, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_NUMEROIMP, PPQRY_LIQ37, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, MyGlb.PANEL_LIST, 164, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, MyGlb.PANEL_FORM, 4, 688, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_ANNOIMP, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_ANNOIMP, PPQRY_LIQ37, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, MyGlb.PANEL_LIST, 200, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 712, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_NUMEROLIQ, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_NUMEROLIQ, PPQRY_LIQ37, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, MyGlb.PANEL_LIST, 244, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, MyGlb.PANEL_FORM, 4, 736, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_ANNOLIQ, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_ANNOLIQ, PPQRY_LIQ37, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, MyGlb.PANEL_LIST, 284, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, MyGlb.PANEL_FORM, 4, 388, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_IMPORTO, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_IMPORTO, PPQRY_LIQ37, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, MyGlb.PANEL_LIST, 400, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, MyGlb.PANEL_LIST, "In Emiss.");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, MyGlb.PANEL_FORM, 4, 412, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_INEMISS, MyGlb.PANEL_FORM, "In Emiss.");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_INEMISS, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldUnbound(PFL_LIQUIDFINANZ_INEMISS, true);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_INEMISS, PPQRY_LIQ37, "DECODE(A.ANNO_MAND, to_number(NULL), 0, 1)", "LIQINEMISS", 1, 19, 0, -13997);
    PAN_LIQUIDFINANZ.SetValueListItem(PFL_LIQUIDFINANZ_INEMISS, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_LIQUIDFINANZ.SetValueListItem(PFL_LIQUIDFINANZ_INEMISS, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, MyGlb.PANEL_LIST, 444, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, MyGlb.PANEL_LIST, 140);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 436, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, MyGlb.PANEL_FORM, 140);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_BENEFICIARIO, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_BENEFICIARIO, PPQRY_LIQ37, "B.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 708, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 460, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_DESCRIZIONE, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_DESCRIZIONE, PPQRY_LIQ37, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, MyGlb.PANEL_LIST, 984, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, MyGlb.PANEL_LIST, "NUM. DOC");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, MyGlb.PANEL_FORM, 4, 760, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_NUMERODOC, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_NUMERODOC, PPQRY_LIQ37, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, MyGlb.PANEL_LIST, 1032, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, MyGlb.PANEL_FORM, 4, 784, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_ANNODOC, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_ANNODOC, PPQRY_LIQ37, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1072, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 808, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_NUMEROSUBIMP, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_NUMEROSUBIMP, PPQRY_LIQ37, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, MyGlb.PANEL_LIST, 1120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 832, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_ANNOSUBIMP, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_ANNOSUBIMP, PPQRY_LIQ37, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_LABELCAPITOL, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, MyGlb.PANEL_LIST, 124, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, MyGlb.PANEL_FORM, 8, 8, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_LABELIMPEGNO, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, MyGlb.PANEL_LIST, 200, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, MyGlb.PANEL_FORM, 16, 16, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELLIQUIDA, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_LABELLIQUIDA, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_LABELLIQUIDA, -1, "", "LABELLIQUIDA", 0, 0, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, MyGlb.PANEL_LIST, 984, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, MyGlb.PANEL_FORM, 24, 24, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELDOCUMEN, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_LABELDOCUMEN, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_LABELDOCUMEN, -1, "", "LABELDOCUMEN", 0, 0, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, MyGlb.PANEL_LIST, 1072, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, MyGlb.PANEL_FORM, 32, 32, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LABELSUBIMPE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_LABELSUBIMPE, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_LABELSUBIMPE, -1, "", "LABELSUBIMPE", 0, 0, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 856, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_RIFBILANCPEG, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldUnbound(PFL_LIQUIDFINANZ_RIFBILANCPEG, true);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_RIFBILANCPEG, PPQRY_LIQ37, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "LIQRIFBILPEG", 5, 201, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, MyGlb.PANEL_FORM, 4, 856, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_IMPEGNO, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldUnbound(PFL_LIQUIDFINANZ_IMPEGNO, true);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_IMPEGNO, PPQRY_LIQ37, "TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP )", "LIQIMPEGNO", 5, 201, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, MyGlb.PANEL_LIST, "Liquidazione");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, MyGlb.PANEL_FORM, 4, 856, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_LIQUIDAZIONE, MyGlb.PANEL_FORM, "Liquid.");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_LIQUIDAZIONE, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldUnbound(PFL_LIQUIDFINANZ_LIQUIDAZIONE, true);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_LIQUIDAZIONE, PPQRY_LIQ37, "TO_CHAR ( A.NUMERO_LIQ ) || ' / ' || TO_CHAR ( A.ANNO_LIQ )", "LIQLIQUIDAZI", 5, 201, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, MyGlb.PANEL_LIST, 64);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, MyGlb.PANEL_LIST, "Documento");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, MyGlb.PANEL_FORM, 4, 856, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_DOCUMENTO, MyGlb.PANEL_FORM, "Docum.");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_DOCUMENTO, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldUnbound(PFL_LIQUIDFINANZ_DOCUMENTO, true);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_DOCUMENTO, PPQRY_LIQ37, "TO_CHAR ( A.NUMERO_DOC ) || ' / ' || TO_CHAR ( A.ANNO_DOC )", "LIQDOCUMENTO", 5, 201, 0, -13997);
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, MyGlb.PANEL_LIST, "Sub Impegno");
    PAN_LIQUIDFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, MyGlb.PANEL_FORM, 4, 856, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDFINANZ_SUBIMPEGNO, MyGlb.PANEL_FORM, "Sub Impegno");
    PAN_LIQUIDFINANZ.SetFieldPage(PFL_LIQUIDFINANZ_SUBIMPEGNO, -1, -1);
    PAN_LIQUIDFINANZ.SetFieldUnbound(PFL_LIQUIDFINANZ_SUBIMPEGNO, true);
    PAN_LIQUIDFINANZ.SetFieldPanel(PFL_LIQUIDFINANZ_SUBIMPEGNO, PPQRY_LIQ37, "TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP )", "LIQSUBIMPEGN", 5, 201, 0, -13997);
  }

  private void PAN_LIQUIDFINANZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDFINANZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDFINANZ.SetIMDB(IMDB, "PQRY_LIQ37", true);
    PAN_LIQUIDFINANZ.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as LIQRIFBILPEG, ");
    SQL.append("  TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ) as LIQIMPEGNO, ");
    SQL.append("  TO_CHAR ( A.NUMERO_LIQ ) || ' / ' || TO_CHAR ( A.ANNO_LIQ ) as LIQLIQUIDAZI, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  DECODE(A.ANNO_MAND, to_number(NULL), 0, 1) as LIQINEMISS, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  TO_CHAR ( A.NUMERO_DOC ) || ' / ' || TO_CHAR ( A.ANNO_DOC ) as LIQDOCUMENTO, ");
    SQL.append("  TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP ) as LIQSUBIMPEGN, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP ");
    PAN_LIQUIDFINANZ.SetQuery(PPQRY_LIQ37, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B ");
    PAN_LIQUIDFINANZ.SetQuery(PPQRY_LIQ37, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.ANNO_LIQ = ~~TBL_DATISESSIONE.SESSIOESERCI~~) OR (A.ANNO_LIQ < ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND ((A.ANNO_MAND IS NULL) OR A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~))) ");
    SQL.append("and   (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~TBL_PARAMETRI44.PARAMFINANZI~~) ");
    PAN_LIQUIDFINANZ.SetQuery(PPQRY_LIQ37, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDFINANZ.SetQuery(PPQRY_LIQ37, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDFINANZ.SetQuery(PPQRY_LIQ37, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ ");
    PAN_LIQUIDFINANZ.SetQuery(PPQRY_LIQ37, 5, SQL, -1, "");
    PAN_LIQUIDFINANZ.SetQueryDB(PPQRY_LIQ37, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDFINANZ.SetMasterTable(0, "LIQ");
    PAN_LIQUIDFINANZ.AddToSortList(PFL_LIQUIDFINANZ_CAPITOLO, true);
    PAN_LIQUIDFINANZ.AddToSortList(PFL_LIQUIDFINANZ_ARTICOLO, true);
    PAN_LIQUIDFINANZ.AddToSortList(PFL_LIQUIDFINANZ_ANNOIMP, true);
    PAN_LIQUIDFINANZ.AddToSortList(PFL_LIQUIDFINANZ_NUMEROIMP, true);
    PAN_LIQUIDFINANZ.AddToSortList(PFL_LIQUIDFINANZ_ANNOLIQ, true);
    PAN_LIQUIDFINANZ.AddToSortList(PFL_LIQUIDFINANZ_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDFINANZ.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDFINANZ.iUseListQBE;
      PAN_LIQUIDFINANZ.iUseListQBE = 0;
      PAN_LIQUIDFINANZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDFINANZ.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDFINANZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQUIDFINANZ) PAN_LIQUIDFINANZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDFINANZ) PAN_LIQUIDFINANZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDFINANZ) PAN_LIQUIDFINANZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDFINANZ) PAN_LIQUIDFINANZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUIDFINANZ) PAN_LIQUIDFINANZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
