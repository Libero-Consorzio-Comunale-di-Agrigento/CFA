// **********************************************
// Scelta Obiettivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaObiettivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTAOBIETT_PROGETTO = 0;
  private static int PFL_SCELTAOBIETT_DESPROGETTO = 1;
  private static int PFL_SCELTAOBIETT_OBIETTIVO = 2;
  private static int PFL_SCELTAOBIETT_DESOBIETTIVO = 3;
  private static int PFL_SCELTAOBIETT_DATAINIZIO = 4;
  private static int PFL_SCELTAOBIETT_PROGRAMMA = 5;
  private static int PFL_SCELTAOBIETT_PROGETTLABEL = 6;
  private static int PFL_SCELTAOBIETT_OBIETTILABEL = 7;
  private static int PFL_SCELTAOBIETT_SCHEDOBIETID = 8;
  private static int PFL_SCELTAOBIETT_ORDINAMENTO = 9;
  private static int PFL_SCELTAOBIETT_PRIMOESERCIZ = 10;

  private static int PPQRY_POLELENCOBF3 = 0;


  IDPanel PAN_SCELTAOBIETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI260(IMDB);
    //
    //
    Init_PQRY_POLELENCOBF3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI260(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI260, 5);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI260, "TBL_PARAMETRI260");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMUOIMPEG, "PARAMUOIMPEG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMUOIMPEG,1,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMPROGEID, "PARAMPROGEID");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI260,IMDBDef1.FLD_PARAMETRI260_PARAMPROGEID,5,9,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI260, 0);
  }

  private static void Init_PQRY_POLELENCOBF3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_POLELENCOBF3, 9);
    IMDB.set_TblCode(IMDBDef7.PQRY_POLELENCOBF3, "PQRY_POLELENCOBF3");
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_POLELEOBFCOR, "POLELEOBFCOR");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_POLELEOBFCOR,6,0,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_PROGRAMMA,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_OBIETTIVO, "OBIETTIVO");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_OBIETTIVO,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_DES_PROGETTO, "DES_PROGETTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_DES_PROGETTO,5,100,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_DES_OBIETTIVO, "DES_OBIETTIVO");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_DES_OBIETTIVO,5,100,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_DATA_INIZIO_OB, "DATA_INIZIO_OB");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_DATA_INIZIO_OB,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_POELOBFCPRES, "POELOBFCPRES");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_POELOBFCPRES,1,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBF3,IMDBDef7.PQSL_POLELENCOBF3_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_POLELENCOBF3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaObiettivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaObiettivi()
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
    FormIdx = MyGlb.FRM_SCELTAOBIETT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "800A933D-7B38-4931-9378-EC269A9DA958";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 788;
    DesignHeight = 386;
    set_Caption(new IDVariant("Scelta Obiettivi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 788;
    Frames[1].Height = 360;
    Frames[1].Caption = "Scelta Obiettivi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_SCELTAOBIETT = new IDPanel(w, this, 1, "PAN_SCELTAOBIETT");
    Frames[1].Content = PAN_SCELTAOBIETT;
    PAN_SCELTAOBIETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTAOBIETT.VS = MainFrm.VisualStyleList;
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 788-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0CD69BEF-7C05-4FD3-A474-BF6E7AE33852");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 740, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTAOBIETT.InitStatus = 1;
    PAN_SCELTAOBIETT_Init();
    PAN_SCELTAOBIETT_InitFields();
    PAN_SCELTAOBIETT_InitQueries();
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
      PAN_SCELTAOBIETT.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaObiettivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaObiettivi.class.getName() : (Glb.ClassWithPackage(SceltaObiettivi.class) ? SceltaObiettivi.class.getName().substring(SceltaObiettivi.class.getPackage().getName().length() + 1) : SceltaObiettivi.class.getName()));
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
      v_CAPTION = (new IDVariant("Scelta Obiettivi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaObiettivi", "LoadEvent", _e);
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
  private void PAN_SCELTAOBIETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTAOBIETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTAOBIETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTAOBIETT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTAOBIETT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCELTAOBIETT);
    // Stub
  }

  private void PAN_SCELTAOBIETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTAOBIETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTAOBIETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTAOBIETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTAOBIETT_Init()
  {

    PAN_SCELTAOBIETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTAOBIETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTAOBIETT.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, "95FAE5E7-81F3-46D7-9052-BAF8E689FF86");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, "Progetto");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, "A2CF9633-8DA4-43F4-ADE5-6A5D74E4522A");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, "DES PROGETTO");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, "B2DF7CFE-1D40-4F0F-ACAA-2FED03158988");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, "OBIETTIVO");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, "5E5C0E0F-AB49-4A22-A4ED-4255DBA51BC6");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, "DES OBIETTIVO");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, "54F92C19-181E-4666-8052-2876798AB763");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, "Data Inizio");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, "06987CB1-1D4E-4F0A-8A1B-28D7BB222B3E");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, "PROGRAMMA");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, "BC629003-A95E-4F93-9ABD-BAC3CAEEE6A2");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, "Obiettivo Operativo");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, "07883E1B-7AB9-4C05-9B80-E35D30E46E6D");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, "Obiettivo Gestionale");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, "103E4F7D-8EF6-4C50-87EF-31BED45AE6B1");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, "26DE38E7-5A59-4DFD-BB19-D0D645A8F2BE");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, "Ordinamento");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, "E9C614BC-CA13-45F7-A752-62381E207609");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, "Primo Esercizio");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTAOBIETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_LIST, "Progetto");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_FORM, "Progetto");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_PROGETTO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_PROGETTO, PPQRY_POLELENCOBF3, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_LIST, 96, 36, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_LIST, "DES PROGETTO");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_FORM, 4, 76, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_FORM, "DES PROG.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_DESPROGETTO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_DESPROGETTO, PPQRY_POLELENCOBF3, "A.DES_PROGETTO", "DES_PROGETTO", 5, 100, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 348, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, "OBIET.");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 4, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, "OBIET.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_OBIETTIVO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_OBIETTIVO, PPQRY_POLELENCOBF3, "A.OBIETTIVO", "OBIETTIVO", 5, 10, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_LIST, 412, 36, 248, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_LIST, "DES OBIETTIVO");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_FORM, 4, 100, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_FORM, "DES OBIET.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_DESOBIETTIVO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_DESOBIETTIVO, PPQRY_POLELENCOBF3, "A.DES_OBIETTIVO", "DES_OBIETTIVO", 5, 100, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_LIST, 660, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_LIST, "Data Inizio");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_FORM, 4, 124, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_FORM, "Data Inizio");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_DATAINIZIO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_DATAINIZIO, PPQRY_POLELENCOBF3, "A.DATA_INIZIO_OB", "DATA_INIZIO_OB", 6, 19, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, 412, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, "PROGR.");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, 4, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, 76);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, "PROGR.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_PROGRAMMA, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_PROGRAMMA, PPQRY_POLELENCOBF3, "A.PROGRAMMA", "PROGRAMMA", 5, 4, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_LIST, 0, 0, 348, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_FORM, 0, 0, 348, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_PROGETTLABEL, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_PROGETTLABEL, -1, "", "PROGETTLABEL", 0, 0, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_LIST, 348, 0, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_LIST, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_FORM, 8, 8, 348, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_FORM, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_OBIETTILABEL, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_OBIETTILABEL, -1, "", "OBIETTILABEL", 0, 0, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_LIST, 740, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_LIST, 120);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_FORM, 4, 148, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_FORM, 120);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_FORM, "SCH. OBIETTIVO ID");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_SCHEDOBIETID, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_SCHEDOBIETID, PPQRY_POLELENCOBF3, "A.SCHEDA_OBIETTIVO_ID", "SCHEDA_OBIETTIVO_ID", 3, 10, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordin.");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_FORM, 4, 148, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_ORDINAMENTO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldUnbound(PFL_SCELTAOBIETT_ORDINAMENTO, true);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_ORDINAMENTO, PPQRY_POLELENCOBF3, "MAX(DECODE(" + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NULL, TO_DATE('1900-01-01','YYYY-MM-DD'), NVL(A.DATA_INIZIO_OB, TO_DATE('1900-01-01','YYYY-MM-DD'))))", "POLELEOBFCOR", 6, 0, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_LIST, 80);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_LIST, "Primo Esercizio");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_FORM, 4, 148, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_FORM, 80);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_FORM, "Pr. Esercizio");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_PRIMOESERCIZ, -1, -1);
    PAN_SCELTAOBIETT.SetFieldUnbound(PFL_SCELTAOBIETT_PRIMOESERCIZ, true);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_PRIMOESERCIZ, PPQRY_POLELENCOBF3, "MAX(A_GET_MIN_ESERCIZIO_STN_POL(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI260.PARAMES~~,~~TBL_PARAMETRI260.PARAMCAPITOL~~,~~TBL_PARAMETRI260.PARAMARTICOL~~,~~TBL_PARAMETRI260.PARAMPROGEID~~,A.SCHEDA_OBIETTIVO_ID,NULL,NULL,~~TBL_PARAMETRI260.PARAMUOIMPEG~~,'O'))", "POELOBFCPRES", 1, 19, 0, -13997);
  }

  private void PAN_SCELTAOBIETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTAOBIETT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTAOBIETT.SetIMDB(IMDB, "PQRY_POLELENCOBF3", true);
    PAN_SCELTAOBIETT.set_SetString(MyGlb.MASTER_ROWNAME, "POL ELENCO OB FC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  MAX(DECODE(" + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NULL, TO_DATE('1900-01-01','YYYY-MM-DD'), NVL(A.DATA_INIZIO_OB, TO_DATE('1900-01-01','YYYY-MM-DD')))) as POLELEOBFCOR, ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.OBIETTIVO as OBIETTIVO, ");
    SQL.append("  A.DES_PROGETTO as DES_PROGETTO, ");
    SQL.append("  A.DES_OBIETTIVO as DES_OBIETTIVO, ");
    SQL.append("  A.DATA_INIZIO_OB as DATA_INIZIO_OB, ");
    SQL.append("  MAX(A_GET_MIN_ESERCIZIO_STN_POL(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI260.PARAMES~~,~~TBL_PARAMETRI260.PARAMCAPITOL~~,~~TBL_PARAMETRI260.PARAMARTICOL~~,~~TBL_PARAMETRI260.PARAMPROGEID~~,A.SCHEDA_OBIETTIVO_ID,NULL,NULL,~~TBL_PARAMETRI260.PARAMUOIMPEG~~,'O')) as POELOBFCPRES, ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBF3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_ELENCO_OB_FC A ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBF3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = ~~TBL_PARAMETRI260.PARAMUOIMPEG~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI260.PARAMES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI260.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI260.PARAMARTICOL~~) ");
    SQL.append("and   (NVL(A.PROGETTO_ID, '-1') = NVL(~~TBL_PARAMETRI260.PARAMPROGEID~~, NVL(A.PROGETTO_ID, '-1'))) ");
    SQL.append("and   (A.ESERCIZIO_STN = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBF3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.PROGETTO_ID, ");
    SQL.append("  A.PROGRAMMA, ");
    SQL.append("  A.OBIETTIVO, ");
    SQL.append("  A.DES_PROGETTO, ");
    SQL.append("  A.DES_OBIETTIVO, ");
    SQL.append("  A.DATA_INIZIO_OB, ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBF3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBF3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 2, 3, 1, 4 ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBF3, 5, SQL, -1, "");
    PAN_SCELTAOBIETT.SetQueryDB(PPQRY_POLELENCOBF3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTAOBIETT.SetMasterTable(0, "POL_ELENCO_OB_FC");
    PAN_SCELTAOBIETT.AddToSortList(PFL_SCELTAOBIETT_ORDINAMENTO, true);
    PAN_SCELTAOBIETT.AddToSortList(PFL_SCELTAOBIETT_PROGRAMMA, true);
    PAN_SCELTAOBIETT.AddToSortList(PFL_SCELTAOBIETT_PROGETTO, true);
    PAN_SCELTAOBIETT.AddToSortList(PFL_SCELTAOBIETT_OBIETTIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTAOBIETT.Status() == 2)
    {
      int oldListQBE = PAN_SCELTAOBIETT.iUseListQBE;
      PAN_SCELTAOBIETT.iUseListQBE = 0;
      PAN_SCELTAOBIETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTAOBIETT.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTAOBIETT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
