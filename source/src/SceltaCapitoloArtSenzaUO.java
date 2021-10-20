// **********************************************
// Scelta Capitolo Art Senza UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaCapitoloArtSenzaUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_CAPITOCONTIE = 0;

  private static int PPQRY_PARAMETRI417 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_CAPITOARTICO_CAPITOLO = 0;
  private static int PFL_CAPITOARTICO_ARTICOLO = 1;
  private static int PFL_CAPITOARTICO_DESCRIZIONE = 2;

  private static int PPQRY_CAP5 = 0;


  IDPanel PAN_CAPITOARTICO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI150(IMDB);
    //
    //
    Init_PQRY_CAP5(IMDB);
    Init_PQRY_PARAMETRI417(IMDB);
    Init_PQRY_PARAMETRI417_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI150(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI150, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI150, "TBL_PARAMETRI150");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI150,IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI150,IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI150,IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI150,IMDBDef1.FLD_PARAMETRI150_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI150,IMDBDef1.FLD_PARAMETRI150_ROWNAMCAPCON, "ROWNAMCAPCON");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI150,IMDBDef1.FLD_PARAMETRI150_ROWNAMCAPCON,5,16,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI150, 0);
  }

  private static void Init_PQRY_CAP5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_CAP5, 4);
    IMDB.set_TblCode(IMDBDef7.PQRY_CAP5, "PQRY_CAP5");
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP5,IMDBDef7.PQSL_CAP5_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP5,IMDBDef7.PQSL_CAP5_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP5,IMDBDef7.PQSL_CAP5_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP5,IMDBDef7.PQSL_CAP5_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP5,IMDBDef7.PQSL_CAP5_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP5,IMDBDef7.PQSL_CAP5_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP5,IMDBDef7.PQSL_CAP5_RECORCAPDESC, "RECORCAPDESC");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP5,IMDBDef7.PQSL_CAP5_RECORCAPDESC,5,140,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_CAP5, 0);
  }

  private static void Init_PQRY_PARAMETRI417(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI417, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI417, "PQRY_PARAMETRI417");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI417,IMDBDef7.PQSL_PARAMETRI417_ROWNAMCAPCON, "ROWNAMCAPCON");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI417,IMDBDef7.PQSL_PARAMETRI417_ROWNAMCAPCON,5,16,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI417, 0);
  }

  private static void Init_PQRY_PARAMETRI417_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI417_RS, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI417_RS, "PQRY_PARAMETRI417_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI417_RS,IMDBDef7.PQSL_PARAMETRI417_ROWNAMCAPCON, "ROWNAMCAPCON");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI417_RS,IMDBDef7.PQSL_PARAMETRI417_ROWNAMCAPCON,5,16,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaCapitoloArtSenzaUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaCapitoloArtSenzaUO()
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
    FormIdx = MyGlb.FRM_SCECAPARSEUO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4E7C62AA-891C-4064-A853-3A9DF583161E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 588;
    DesignHeight = 374;
    set_Caption(new IDVariant("Scelta Capitolo Art Senza UO"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 588;
    Frames[1].Height = 348;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.114943;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 588;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 40;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 588-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "467DD62B-75E3-4198-990B-E6CABD9F4161");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 136, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
    Frames[3].Width = 588;
    Frames[3].Height = 308;
    Frames[3].Caption = "Capitolo/Articolo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 308;
    PAN_CAPITOARTICO = new IDPanel(w, this, 3, "PAN_CAPITOARTICO");
    Frames[3].Content = PAN_CAPITOARTICO;
    PAN_CAPITOARTICO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAPITOARTICO.VS = MainFrm.VisualStyleList;
    PAN_CAPITOARTICO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 588-MyGlb.PAN_OFFS_X, 308-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CAPITOARTICO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5E669FBC-79DB-4243-95BC-32271A80AA25");
    PAN_CAPITOARTICO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 536, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOARTICO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPITOARTICO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAPITOARTICO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAPITOARTICO.InitStatus = 1;
    PAN_CAPITOARTICO_Init();
    PAN_CAPITOARTICO_InitFields();
    PAN_CAPITOARTICO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI150, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCECAPARSEUO_PARAMETRI417();
      }
      PAN_CAPITOARTICO.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaCapitoloArtSenzaUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaCapitoloArtSenzaUO.class.getName() : (Glb.ClassWithPackage(SceltaCapitoloArtSenzaUO.class) ? SceltaCapitoloArtSenzaUO.class.getName().substring(SceltaCapitoloArtSenzaUO.class.getPackage().getName().length() + 1) : SceltaCapitoloArtSenzaUO.class.getName()));
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMCAPCON, 0, (new IDVariant()));
      set_Caption(IDL.Add(IDL.Add((new IDVariant("Scelta Capitolo")), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0))));
      CloseOnSelection = (new IDVariant(-1)).booleanValue();
      Frames[PAN_CAPITOARTICO.FrIndex].set_Caption(IDL.Add(IDL.Add((new IDVariant("Scelta Capitolo")), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCapitoloArtSenzaUO", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCECAPARSEUO_PARAMETRI417() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_PARAMETRI417_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI150, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI150, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI417_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_PARAMETRI417_RS, 0, IMDBDef1.TBL_PARAMETRI150, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI417_RS, 0, 0, IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMCAPCON, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI150, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI150, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI150, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef7.PQRY_PARAMETRI417_RS);
    IMDB.TblSortBy(IMDBDef7.PQRY_PARAMETRI417_RS,0,true);
    IMDB.TblStartSort(IMDBDef7.PQRY_PARAMETRI417_RS);
    IMDB.TblMoveFirst(IMDBDef7.PQRY_PARAMETRI417_RS, 0);
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
  private void PAN_CAPITOARTICO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAPITOARTICO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAPITOARTICO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAPITOARTICO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAPITOARTICO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CAPITOARTICO);
    // Stub
  }

  private void PAN_CAPITOARTICO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAPITOARTICO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CAPITOARTICO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAPITOARTICO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAPITOARTICO_Init()
  {

    PAN_CAPITOARTICO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAPITOARTICO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAPITOARTICO.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_CAPITOARTICO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, "6CF97037-7404-44FF-A3C7-E7146BCC8BAF");
    PAN_CAPITOARTICO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, "Capitolo");
    PAN_CAPITOARTICO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, "");
    PAN_CAPITOARTICO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CAPITOARTICO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CAPITOARTICO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, "903FF7D5-7C3C-45C2-A14F-AB6E373E68BB");
    PAN_CAPITOARTICO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, "Art.");
    PAN_CAPITOARTICO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, "");
    PAN_CAPITOARTICO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPITOARTICO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CAPITOARTICO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, "5F43DC11-51DF-4450-880F-309470F720B0");
    PAN_CAPITOARTICO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, "Descrizione");
    PAN_CAPITOARTICO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, "");
    PAN_CAPITOARTICO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPITOARTICO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CAPITOARTICO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAPITOARTICO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOARTICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_CAPITOARTICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOARTICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CAPITOARTICO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOARTICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_CAPITOARTICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOARTICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CAPITOARTICO.SetFieldPage(PFL_CAPITOARTICO_CAPITOLO, -1, -1);
    PAN_CAPITOARTICO.SetFieldPanel(PFL_CAPITOARTICO_CAPITOLO, PPQRY_CAP5, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_CAPITOARTICO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, MyGlb.PANEL_LIST, 136, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOARTICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_CAPITOARTICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOARTICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_CAPITOARTICO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, MyGlb.PANEL_FORM, 4, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOARTICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_CAPITOARTICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOARTICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_CAPITOARTICO.SetFieldPage(PFL_CAPITOARTICO_ARTICOLO, -1, -1);
    PAN_CAPITOARTICO.SetFieldPanel(PFL_CAPITOARTICO_ARTICOLO, PPQRY_CAP5, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_CAPITOARTICO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, MyGlb.PANEL_LIST, 172, 36, 364, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPITOARTICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, MyGlb.PANEL_LIST, 144);
    PAN_CAPITOARTICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOARTICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAPITOARTICO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOARTICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, MyGlb.PANEL_FORM, 144);
    PAN_CAPITOARTICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOARTICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOARTICO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CAPITOARTICO.SetFieldPage(PFL_CAPITOARTICO_DESCRIZIONE, -1, -1);
    PAN_CAPITOARTICO.SetFieldPanel(PFL_CAPITOARTICO_DESCRIZIONE, PPQRY_CAP5, "A.DESCRIZIONE", "RECORCAPDESC", 5, 140, 0, -13997);
  }

  private void PAN_CAPITOARTICO_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAPITOARTICO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CAPITOARTICO.SetIMDB(IMDB, "PQRY_CAP5", true);
    PAN_CAPITOARTICO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE as RECORCAPDESC ");
    PAN_CAPITOARTICO.SetQuery(PPQRY_CAP5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A ");
    PAN_CAPITOARTICO.SetQuery(PPQRY_CAP5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI150.ROWNAMEESERC~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI150.ROWNAMEES~~, 'ES', A.E_S, ~~TBL_PARAMETRI150.ROWNAMEES~~)) ");
    SQL.append("and   (TO_CHAR ( A.CAPITOLO ) LIKE CASE WHEN NVL(~~PQRY_PARAMETRI417.ROWNAMCAPCON~~, '') = '' THEN TO_CHAR ( A.CAPITOLO ) ELSE '%' || ~~PQRY_PARAMETRI417.ROWNAMCAPCON~~ || '%' END) ");
    PAN_CAPITOARTICO.SetQuery(PPQRY_CAP5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPITOARTICO.SetQuery(PPQRY_CAP5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPITOARTICO.SetQuery(PPQRY_CAP5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_CAPITOARTICO.SetQuery(PPQRY_CAP5, 5, SQL, -1, "");
    PAN_CAPITOARTICO.SetQueryDB(PPQRY_CAP5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPITOARTICO.SetMasterTable(0, "CAP");
    PAN_CAPITOARTICO.AddToSortList(PFL_CAPITOARTICO_CAPITOLO, true);
    PAN_CAPITOARTICO.AddToSortList(PFL_CAPITOARTICO_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAPITOARTICO.Status() == 2)
    {
      int oldListQBE = PAN_CAPITOARTICO.iUseListQBE;
      PAN_CAPITOARTICO.iUseListQBE = 0;
      PAN_CAPITOARTICO.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAPITOARTICO.PanelCommand(Glb.PCM_FIND);
      PAN_CAPITOARTICO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, "D38F7D2C-F173-42E8-9412-F1586DD23A98");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, "Capitolo contiene");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_LIST, "Capitolo contiene");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_FORM, 4, 8, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_FORM, "Capitolo contiene");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOCONTIE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOCONTIE, PPQRY_PARAMETRI417, "A.ROWNAMCAPCON", "ROWNAMCAPCON", 5, 16, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI417", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI417, IMDBDef7.PQRY_PARAMETRI417_RS, IMDBDef1.TBL_PARAMETRI150);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPITOCONTIE, IMDBDef1.FLD_PARAMETRI150_ROWNAMCAPCON);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI150");
    PAN_PARAMETRI.AddToSortList(PFL_PARAMETRI_CAPITOCONTIE, true);
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
    if (SrcObj == PAN_CAPITOARTICO) PAN_CAPITOARTICO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPITOARTICO) PAN_CAPITOARTICO_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAPITOARTICO) PAN_CAPITOARTICO_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPITOARTICO) PAN_CAPITOARTICO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CAPITOARTICO) PAN_CAPITOARTICO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
