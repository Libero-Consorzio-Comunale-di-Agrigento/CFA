// **********************************************
// Liquidazioni Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioniOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_LIQUIDAOPERA_CAPITOLO = 0;
  private static int PFL_LIQUIDAOPERA_ARTICOLO = 1;
  private static int PFL_LIQUIDAOPERA_NUMEROIMP = 2;
  private static int PFL_LIQUIDAOPERA_ANNOIMP = 3;
  private static int PFL_LIQUIDAOPERA_NUMEROLIQ = 4;
  private static int PFL_LIQUIDAOPERA_ANNOLIQ = 5;
  private static int PFL_LIQUIDAOPERA_IMPORTO = 6;
  private static int PFL_LIQUIDAOPERA_INEMISS = 7;
  private static int PFL_LIQUIDAOPERA_BENEFICIARIO = 8;
  private static int PFL_LIQUIDAOPERA_DESCRIZIONE = 9;
  private static int PFL_LIQUIDAOPERA_NUMERODOC = 10;
  private static int PFL_LIQUIDAOPERA_ANNODOC = 11;
  private static int PFL_LIQUIDAOPERA_NUMEROSUBIMP = 12;
  private static int PFL_LIQUIDAOPERA_ANNOSUBIMP = 13;
  private static int PFL_LIQUIDAOPERA_LABELCAPITOL = 14;
  private static int PFL_LIQUIDAOPERA_LABELIMPEGNO = 15;
  private static int PFL_LIQUIDAOPERA_LABELIMPEGNI = 16;
  private static int PFL_LIQUIDAOPERA_LABELDOCUMEN = 17;
  private static int PFL_LIQUIDAOPERA_LABELSUBIMPE = 18;
  private static int PFL_LIQUIDAOPERA_RIFBILANCPEG = 19;
  private static int PFL_LIQUIDAOPERA_IMPEGNO = 20;
  private static int PFL_LIQUIDAOPERA_LIQUIDAZIONE = 21;
  private static int PFL_LIQUIDAOPERA_DOCUMENTO = 22;
  private static int PFL_LIQUIDAOPERA_SUBIMPEGNO = 23;

  private static int PPQRY_LIQ22 = 0;


  IDPanel PAN_LIQUIDAOPERA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI31(IMDB);
    //
    //
    Init_PQRY_LIQ22(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI31(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI31, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI31, "TBL_PARAMETRI31");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI31,IMDBDef1.FLD_PARAMETRI31_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI31,IMDBDef1.FLD_PARAMETRI31_PARAMOPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI31, 0);
  }

  private static void Init_PQRY_LIQ22(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_LIQ22, 20);
    IMDB.set_TblCode(IMDBDef8.PQRY_LIQ22, "PQRY_LIQ22");
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQRIFBILPEG, "LIQRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQIMPEGNO, "LIQIMPEGNO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQIMPEGNO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQLIQUIDAZI,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQINEMISS, "LIQINEMISS");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQINEMISS,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQDOCUMENTO, "LIQDOCUMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQDOCUMENTO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQSUBIMPEGN, "LIQSUBIMPEGN");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_LIQSUBIMPEGN,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ22,IMDBDef8.PQSL_LIQ22_ANNO_SUBIMP,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_LIQ22, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioniOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioniOpera()
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
    FormIdx = MyGlb.FRM_LIQUIDAOPERA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BBA2F3C3-045E-4BEC-A0D8-5B4EF739030A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 418;
    set_Caption(new IDVariant("Liquidazioni Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 392;
    Frames[1].Caption = "Liquidazioni Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 392;
    PAN_LIQUIDAOPERA = new IDPanel(w, this, 1, "PAN_LIQUIDAOPERA");
    Frames[1].Content = PAN_LIQUIDAOPERA;
    PAN_LIQUIDAOPERA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAOPERA.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "523E6E06-823C-460A-AF39-1727482B07CE");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1068, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAOPERA.InitStatus = 1;
    PAN_LIQUIDAOPERA_Init();
    PAN_LIQUIDAOPERA_InitFields();
    PAN_LIQUIDAOPERA_InitQueries();
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
      PAN_LIQUIDAOPERA.UpdatePanel(MainFrm);
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
    return (obj instanceof LiquidazioniOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioniOpera.class.getName() : (Glb.ClassWithPackage(LiquidazioniOpera.class) ? LiquidazioniOpera.class.getName().substring(LiquidazioniOpera.class.getPackage().getName().length() + 1) : LiquidazioniOpera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Liquidazioni Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAOPERA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIDAOPERA);
      // 
      // Liquidazioni Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_LIQUIDAOPERA.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAOPERA_BENEFICIARIO,IMDB.Value(IMDBDef8.PQRY_LIQ22, IMDBDef8.PQSL_LIQ22_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
      PAN_LIQUIDAOPERA.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAOPERA_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_LIQ22, IMDBDef8.PQSL_LIQ22_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOpera", "LiquidazioniOperaOnDynamicPropertiesEvent", _e);
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
      // PAN_LIQUIDAOPERA.set_FixedCols((new IDVariant(1)).intValue());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOpera", "LoadEvent", _e);
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
  private void PAN_LIQUIDAOPERA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDAOPERA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDAOPERA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDAOPERA, Cancel);
    // Stub
  }

  private void PAN_LIQUIDAOPERA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_LIQUIDAOPERA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAOPERA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAOPERA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIDAOPERA_Init()
  {

    PAN_LIQUIDAOPERA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAOPERA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDAOPERA.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, "F08DEF33-AECE-4C97-9D6B-01C95BEE1C7C");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, "CAPITOLO");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, "C837104E-F1F6-466F-A756-2F5452FA40B2");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, "ARTICOLO");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, "9566A7B8-19F9-4341-B106-FB05B8DFF4A9");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, "NUMERO IMP");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, "DCF85316-9EFE-4D7E-B028-DE53D0CD93E1");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, "ANNO IMP");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, "65130C2E-3BCC-4B4A-83FE-39A8CB01F4D1");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, "NUMERO LIQ");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, "FC051D9F-19AB-4F17-BCD6-B5B25F33FB6F");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, "ANNO LIQ");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, "6616439B-31F4-401D-A931-0FA143F799B8");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, "Importo");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, "87164B6E-DED6-4E29-869F-7EC32B454926");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, "In Emiss.");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, "6CD5F28E-5B30-4849-BFC2-5A78EA683044");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, "Beneficiario");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, "74A63D5D-0D36-46FD-B385-A270EE2A2CB6");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, "Descrizione");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, "18D2E7A3-C01A-4133-988C-AEAF475B8FA8");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, "NUMERO DOC");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, "0DDD7072-E14A-4493-855A-00EA7CCAF215");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, "ANNO DOC");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, "35BF6BBE-700F-4EE8-A159-DEB8FBAD5252");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, "985BAD41-CF88-4FEB-B6A4-5680880308FD");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, "");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, "42F30016-2C36-45B2-A655-51175198B5FD");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, "Capitolo");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, "796CAB38-9CFE-4EDD-A533-0473A15A9708");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, "Liquidazioni");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, "22847B22-81FE-4B4F-8D99-C4A60BC4F16E");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, "Impegni");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, "ECE9894A-BE91-453D-902C-5BCE9C5BF4CC");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, "Documento");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, "7CE30A14-93BC-49B2-BE37-4F0AF13FC8DF");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, "Sub-Impegno");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, "28A8B2ED-4B9F-4A00-9249-C136DAF96CF8");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, "To String (LIQ CAPITOLO) + \" - \" + To String (LIQ ARTICOLO)");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, "9C5EFB42-D74D-40E4-8996-145C732DA46D");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, "Impegno");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, "To String (LIQ NUMERO IMP) + \" / \" + To String (LIQ ANNO IMP)");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, "6794F00B-1C54-46A5-8DFD-4C25836860CF");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, "Liquidazione");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, "To String (NUMERO LIQ) + \" / \" + To String (ANNO LIQ)");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, "DCF18C8A-164F-4173-A6E7-4DC8F495E511");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, "Documento");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, "To String (LIQ NUMERO DOC) + \" / \" + To String (LIQ ANNO DOC)");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, "949E4772-1F5D-4A18-901D-DD0F8157A7B5");
    PAN_LIQUIDAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, "Subimpegno");
    PAN_LIQUIDAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, "To String (LIQ NUMERO SUBIMP) + \" / \" + To String (LIQ ANNO SUBIMP)");
    PAN_LIQUIDAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LIQUIDAOPERA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, MyGlb.PANEL_FORM, 68, 616, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_CAPITOLO, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_CAPITOLO, PPQRY_LIQ22, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, MyGlb.PANEL_LIST, 92, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, MyGlb.PANEL_FORM, 68, 640, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_ARTICOLO, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_ARTICOLO, PPQRY_LIQ22, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, MyGlb.PANEL_LIST, 112, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, MyGlb.PANEL_FORM, 80, 664, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_NUMEROIMP, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_NUMEROIMP, PPQRY_LIQ22, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, MyGlb.PANEL_LIST, 152, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, MyGlb.PANEL_LIST, "ANN. IMP");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, MyGlb.PANEL_FORM, 68, 688, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_ANNOIMP, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_ANNOIMP, PPQRY_LIQ22, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, MyGlb.PANEL_LIST, 184, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, MyGlb.PANEL_FORM, 80, 712, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_NUMEROLIQ, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_NUMEROLIQ, PPQRY_LIQ22, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, MyGlb.PANEL_LIST, 228, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, MyGlb.PANEL_FORM, 68, 736, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_ANNOLIQ, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_ANNOLIQ, PPQRY_LIQ22, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, MyGlb.PANEL_LIST, 264, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, MyGlb.PANEL_FORM, 4, 388, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_IMPORTO, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_IMPORTO, PPQRY_LIQ22, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, MyGlb.PANEL_LIST, 376, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, MyGlb.PANEL_LIST, "In Emiss.");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, MyGlb.PANEL_FORM, 4, 412, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_INEMISS, MyGlb.PANEL_FORM, "In Emiss.");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_INEMISS, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldUnbound(PFL_LIQUIDAOPERA_INEMISS, true);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_INEMISS, PPQRY_LIQ22, "DECODE(A.ANNO_MAND, to_number(NULL), 0, 1)", "LIQINEMISS", 1, 19, 0, -13997);
    PAN_LIQUIDAOPERA.SetValueListItem(PFL_LIQUIDAOPERA_INEMISS, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_LIQUIDAOPERA.SetValueListItem(PFL_LIQUIDAOPERA_INEMISS, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, MyGlb.PANEL_LIST, 420, 36, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, MyGlb.PANEL_LIST, 140);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 436, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, MyGlb.PANEL_FORM, 140);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_BENEFICIARIO, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_BENEFICIARIO, PPQRY_LIQ22, "B.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, 656, 36, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 460, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_DESCRIZIONE, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_DESCRIZIONE, PPQRY_LIQ22, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, MyGlb.PANEL_LIST, 892, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, MyGlb.PANEL_LIST, "NUM. DOC");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, MyGlb.PANEL_FORM, 4, 760, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_NUMERODOC, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_NUMERODOC, PPQRY_LIQ22, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, MyGlb.PANEL_LIST, 936, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, MyGlb.PANEL_FORM, 4, 784, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_ANNODOC, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_ANNODOC, PPQRY_LIQ22, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 980, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 808, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_NUMEROSUBIMP, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_NUMEROSUBIMP, PPQRY_LIQ22, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, MyGlb.PANEL_LIST, 1024, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 832, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_ANNOSUBIMP, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_ANNOSUBIMP, PPQRY_LIQ22, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELCAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_LABELCAPITOL, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, MyGlb.PANEL_LIST, 184, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, MyGlb.PANEL_FORM, 8, 8, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_LABELIMPEGNO, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, MyGlb.PANEL_LIST, 112, 0, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, MyGlb.PANEL_FORM, 16, 16, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_LABELIMPEGNI, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_LABELIMPEGNI, -1, "", "LABELIMPEGNI", 0, 0, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, MyGlb.PANEL_LIST, 892, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, MyGlb.PANEL_FORM, 16, 16, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELDOCUMEN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_LABELDOCUMEN, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_LABELDOCUMEN, -1, "", "LABELDOCUMEN", 0, 0, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, MyGlb.PANEL_LIST, 980, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, MyGlb.PANEL_FORM, 24, 24, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LABELSUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_LABELSUBIMPE, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_LABELSUBIMPE, -1, "", "LABELSUBIMPE", 0, 0, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 856, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_RIFBILANCPEG, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldUnbound(PFL_LIQUIDAOPERA_RIFBILANCPEG, true);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_RIFBILANCPEG, PPQRY_LIQ22, "TO_CHAR ( A.CAPITOLO ) || ' - ' || TO_CHAR ( A.ARTICOLO )", "LIQRIFBILPEG", 5, 201, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, MyGlb.PANEL_FORM, 4, 856, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_IMPEGNO, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldUnbound(PFL_LIQUIDAOPERA_IMPEGNO, true);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_IMPEGNO, PPQRY_LIQ22, "TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP )", "LIQIMPEGNO", 5, 201, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, MyGlb.PANEL_LIST, "Liquidazione");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, MyGlb.PANEL_FORM, 12, 864, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_LIQUIDAZIONE, MyGlb.PANEL_FORM, "Liquid.");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_LIQUIDAZIONE, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldUnbound(PFL_LIQUIDAOPERA_LIQUIDAZIONE, true);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_LIQUIDAZIONE, PPQRY_LIQ22, "TO_CHAR ( A.NUMERO_LIQ ) || ' / ' || TO_CHAR ( A.ANNO_LIQ )", "LIQLIQUIDAZI", 5, 201, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, MyGlb.PANEL_LIST, 64);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, MyGlb.PANEL_LIST, "Documento");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, MyGlb.PANEL_FORM, 4, 856, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_DOCUMENTO, MyGlb.PANEL_FORM, "Docum.");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_DOCUMENTO, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldUnbound(PFL_LIQUIDAOPERA_DOCUMENTO, true);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_DOCUMENTO, PPQRY_LIQ22, "TO_CHAR ( A.NUMERO_DOC ) || ' / ' || TO_CHAR ( A.ANNO_DOC )", "LIQDOCUMENTO", 5, 201, 0, -13997);
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, MyGlb.PANEL_LIST, "Subimpegno");
    PAN_LIQUIDAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, MyGlb.PANEL_FORM, 4, 856, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAOPERA_SUBIMPEGNO, MyGlb.PANEL_FORM, "Subimp.");
    PAN_LIQUIDAOPERA.SetFieldPage(PFL_LIQUIDAOPERA_SUBIMPEGNO, -1, -1);
    PAN_LIQUIDAOPERA.SetFieldUnbound(PFL_LIQUIDAOPERA_SUBIMPEGNO, true);
    PAN_LIQUIDAOPERA.SetFieldPanel(PFL_LIQUIDAOPERA_SUBIMPEGNO, PPQRY_LIQ22, "TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP )", "LIQSUBIMPEGN", 5, 201, 0, -13997);
  }

  private void PAN_LIQUIDAOPERA_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAOPERA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDAOPERA.SetIMDB(IMDB, "PQRY_LIQ22", true);
    PAN_LIQUIDAOPERA.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || TO_CHAR ( A.ARTICOLO ) as LIQRIFBILPEG, ");
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
    PAN_LIQUIDAOPERA.SetQuery(PPQRY_LIQ22, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  IMP C ");
    PAN_LIQUIDAOPERA.SetQuery(PPQRY_LIQ22, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.ANNO_LIQ = ~~TBL_DATISESSIONE.SESSIOESERCI~~) OR (A.ANNO_LIQ < ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND ((A.ANNO_MAND IS NULL) OR A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~))) ");
    SQL.append("and   (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (A.ANNO_IMP = C.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = C.NUMERO_IMP) ");
    SQL.append("and   (C.OPERA = ~~TBL_PARAMETRI31.PARAMOPERA~~) ");
    SQL.append("and   (NOT ((A.FINANZIAMENTO IS NULL))) ");
    PAN_LIQUIDAOPERA.SetQuery(PPQRY_LIQ22, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAOPERA.SetQuery(PPQRY_LIQ22, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAOPERA.SetQuery(PPQRY_LIQ22, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ ");
    PAN_LIQUIDAOPERA.SetQuery(PPQRY_LIQ22, 5, SQL, -1, "");
    PAN_LIQUIDAOPERA.SetQueryDB(PPQRY_LIQ22, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAOPERA.SetMasterTable(0, "LIQ");
    PAN_LIQUIDAOPERA.AddToSortList(PFL_LIQUIDAOPERA_CAPITOLO, true);
    PAN_LIQUIDAOPERA.AddToSortList(PFL_LIQUIDAOPERA_ARTICOLO, true);
    PAN_LIQUIDAOPERA.AddToSortList(PFL_LIQUIDAOPERA_ANNOIMP, true);
    PAN_LIQUIDAOPERA.AddToSortList(PFL_LIQUIDAOPERA_NUMEROIMP, true);
    PAN_LIQUIDAOPERA.AddToSortList(PFL_LIQUIDAOPERA_ANNOLIQ, true);
    PAN_LIQUIDAOPERA.AddToSortList(PFL_LIQUIDAOPERA_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAOPERA.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAOPERA.iUseListQBE;
      PAN_LIQUIDAOPERA.iUseListQBE = 0;
      PAN_LIQUIDAOPERA.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAOPERA.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAOPERA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQUIDAOPERA) PAN_LIQUIDAOPERA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAOPERA) PAN_LIQUIDAOPERA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDAOPERA) PAN_LIQUIDAOPERA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAOPERA) PAN_LIQUIDAOPERA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUIDAOPERA) PAN_LIQUIDAOPERA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
