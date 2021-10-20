// **********************************************
// Scelta Fattori Contropartita Pass Att
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaFattoriContropartitaPassAtt extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ANCFATPATATT = 0;

  private static int PPQRY_PARAMETRI503 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_FATTORI_FATTORE = 0;
  private static int PFL_FATTORI_DESCRIZIONE = 1;
  private static int PFL_FATTORI_TIPO = 2;
  private static int PFL_FATTORI_ORDINAMENTO = 3;

  private static int PPQRY_FATTORI7 = 0;


  IDPanel PAN_FATTORI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI504(IMDB);
    //
    //
    Init_PQRY_FATTORI7(IMDB);
    Init_PQRY_PARAMETRI503(IMDB);
    Init_PQRY_PARAMETRI503_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI504(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI504, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI504, "TBL_PARAMETRI504");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI504,IMDBDef1.FLD_PARAMETRI504_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI504,IMDBDef1.FLD_PARAMETRI504_ROWNAMDATREG,6,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI504,IMDBDef1.FLD_PARAMETRI504_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI504,IMDBDef1.FLD_PARAMETRI504_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI504,IMDBDef1.FLD_PARAMETRI504_ROWNAMANCATT, "ROWNAMANCATT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI504,IMDBDef1.FLD_PARAMETRI504_ROWNAMANCATT,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI504, 0);
  }

  private static void Init_PQRY_FATTORI7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FATTORI7, 4);
    IMDB.set_TblCode(IMDBDef8.PQRY_FATTORI7, "PQRY_FATTORI7");
    IMDB.set_FldCode(IMDBDef8.PQRY_FATTORI7,IMDBDef8.PQSL_FATTORI7_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FATTORI7,IMDBDef8.PQSL_FATTORI7_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FATTORI7,IMDBDef8.PQSL_FATTORI7_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FATTORI7,IMDBDef8.PQSL_FATTORI7_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FATTORI7,IMDBDef8.PQSL_FATTORI7_FATTORORDINA, "FATTORORDINA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FATTORI7,IMDBDef8.PQSL_FATTORI7_FATTORORDINA,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FATTORI7,IMDBDef8.PQSL_FATTORI7_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FATTORI7,IMDBDef8.PQSL_FATTORI7_TIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FATTORI7, 0);
  }

  private static void Init_PQRY_PARAMETRI503(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARAMETRI503, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARAMETRI503, "PQRY_PARAMETRI503");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAMETRI503,IMDBDef8.PQSL_PARAMETRI503_ROWNAMANCATT, "ROWNAMANCATT");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAMETRI503,IMDBDef8.PQSL_PARAMETRI503_ROWNAMANCATT,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PARAMETRI503, 0);
  }

  private static void Init_PQRY_PARAMETRI503_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARAMETRI503_RS, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARAMETRI503_RS, "PQRY_PARAMETRI503_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAMETRI503_RS,IMDBDef8.PQSL_PARAMETRI503_ROWNAMANCATT, "ROWNAMANCATT");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAMETRI503_RS,IMDBDef8.PQSL_PARAMETRI503_ROWNAMANCATT,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaFattoriContropartitaPassAtt(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaFattoriContropartitaPassAtt()
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
    FormIdx = MyGlb.FRM_SCEFATCOPAAT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "830F9286-DE8C-42E6-9FDC-6C99A961AF4D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 748;
    DesignHeight = 398;
    set_Caption(new IDVariant("Scelta Fattori Contropartita Pass Att"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 748;
    Frames[1].Height = 372;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.129032;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 748;
    Frames[2].Height = 48;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 48;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 748-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "52B7447A-6933-4D6F-AFF2-EBC6AFDDB6AB");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 56, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 748;
    Frames[3].Height = 324;
    Frames[3].Caption = "Fattori";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 324;
    PAN_FATTORI = new IDPanel(w, this, 3, "PAN_FATTORI");
    Frames[3].Content = PAN_FATTORI;
    PAN_FATTORI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FATTORI.VS = MainFrm.VisualStyleList;
    PAN_FATTORI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 748-MyGlb.PAN_OFFS_X, 324-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DC386A33-DCB4-427D-96C3-66DC32FF6D93");
    PAN_FATTORI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 572, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI504, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCEFATCOPAAT_PARAMETRI503();
      }
      PAN_FATTORI.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaFattoriContropartitaPassAtt);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaFattoriContropartitaPassAtt.class.getName() : (Glb.ClassWithPackage(SceltaFattoriContropartitaPassAtt.class) ? SceltaFattoriContropartitaPassAtt.class.getName().substring(SceltaFattoriContropartitaPassAtt.class.getPackage().getName().length() + 1) : SceltaFattoriContropartitaPassAtt.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Fattori On Dynamic Properties Event
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
      // Fattori On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_FATTORI.set_ToolTip(Glb.OBJ_FIELD,PFL_FATTORI_DESCRIZIONE,(new IDVariant(PAN_FATTORI.FieldText(PFL_FATTORI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaFattoriContropartitaPassAtt", "FattoriOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Fattori", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI504, IMDBDef1.FLD_PARAMETRI504_ROWNAMANCATT, 0, (new IDVariant("NO")));
      set_Caption(new IDVariant(v_CAPTION));
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI504, IMDBDef1.FLD_PARAMETRI504_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_PARAMETRI.set_Header(Glb.OBJ_FIELD,PFL_PARAMETRI_ANCFATPATATT, (new IDVariant("Anche Fattori Patrim. Passivi")).stringValue());
      }
      else
      {
        PAN_PARAMETRI.set_Header(Glb.OBJ_FIELD,PFL_PARAMETRI_ANCFATPATATT, (new IDVariant("Anche Fattori Patrim. Attivi")).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaFattoriContropartitaPassAtt", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCEFATCOPAAT_PARAMETRI503() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_PARAMETRI503_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI504, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI504, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_PARAMETRI503_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_PARAMETRI503_RS, 0, IMDBDef1.TBL_PARAMETRI504, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARAMETRI503_RS, 0, 0, IMDBDef1.TBL_PARAMETRI504, IMDBDef1.FLD_PARAMETRI504_ROWNAMANCATT, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI504, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI504, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI504, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_PARAMETRI503_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

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
    PAN_FATTORI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, "9999A3C3-30AC-4E2E-A1B0-C1ADD88B28D0");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, "Fattore");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "D3B3F38A-2C74-4CE9-B46C-0BCA2A4D90CF");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "Descrizione");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "9727D64F-AE98-41BA-AEE2-D342E63E3BA6");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "Tipo");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, "6AC2C0CF-3348-4990-A282-2C177D1A7D1D");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, "Ordinamento");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FATTORI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_FORM, 88);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_FATTORE, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_FATTORE, PPQRY_FATTORI7, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 124, 36, 320, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_DESCRIZIONE, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_DESCRIZIONE, PPQRY_FATTORI7, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 444, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 76);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 4, 52, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_TIPO, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_TIPO, PPQRY_FATTORI7, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, MyGlb.PANEL_FORM, 4, 76, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_ORDINAMENTO, -1, -1);
    PAN_FATTORI.SetFieldUnbound(PFL_FATTORI_ORDINAMENTO, true);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_ORDINAMENTO, PPQRY_FATTORI7, "DECODE(A.TIPO, 'E', 1, DECODE(A.TIPO, 'A', 2, 3))", "FATTORORDINA", 1, 19, 0, -13997);
  }

  private void PAN_FATTORI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FATTORI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FATTORI.SetIMDB(IMDB, "PQRY_FATTORI7", true);
    PAN_FATTORI.set_SetString(MyGlb.MASTER_ROWNAME, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  DECODE(A.TIPO, 'E', 1, DECODE(A.TIPO, 'A', 2, 3)) as FATTORORDINA, ");
    SQL.append("  A.TIPO as TIPO ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= NVL(~~TBL_PARAMETRI504.ROWNAMDATREG~~, TO_DATE('1900-01-01','YYYY-MM-DD'))) ");
    SQL.append("and   (((~~PQRY_PARAMETRI503.ROWNAMANCATT~~ = 'SI') AND ((A.TIPO = 'A') OR (A.TIPO = 'P'))) OR ((~~PQRY_PARAMETRI503.ROWNAMANCATT~~ <> 'SI') AND (((~~TBL_PARAMETRI504.ROWNAMEES~~ = 'S') AND (A.TIPO = 'P')) OR ((~~TBL_PARAMETRI504.ROWNAMEES~~ = 'E') AND (A.TIPO = 'A'))))) ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORI.SetQuery(PPQRY_FATTORI7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORI.SetQuery(PPQRY_FATTORI7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 3, 1 ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI7, 5, SQL, -1, "");
    PAN_FATTORI.SetQueryDB(PPQRY_FATTORI7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FATTORI.SetMasterTable(0, "FATTORI");
    PAN_FATTORI.AddToSortList(PFL_FATTORI_ORDINAMENTO, true);
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

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, "617AE103-F4AD-40DC-9062-F99A7288621E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, "Anche Fattori Patrim. Attivi");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, MyGlb.PANEL_LIST, "Anc. Fattori Patrim Attivi");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, MyGlb.PANEL_FORM, 8, 12, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCFATPATATT, MyGlb.PANEL_FORM, "Anche Fattori Patrim. Attivi");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANCFATPATATT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANCFATPATATT, PPQRY_PARAMETRI503, "A.ROWNAMANCATT", "ROWNAMANCATT", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCFATPATATT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCFATPATATT, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI503", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI503, IMDBDef8.PQRY_PARAMETRI503_RS, IMDBDef1.TBL_PARAMETRI504);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANCFATPATATT, IMDBDef1.FLD_PARAMETRI504_ROWNAMANCATT);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI504");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
