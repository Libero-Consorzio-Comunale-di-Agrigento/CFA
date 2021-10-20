// **********************************************
// Scelta Obiettivi Di Gestione DUP
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaObiettiviDiGestioneDUP extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMDB_PROGETTOID1 = 0;
  private static int PFL_IMDB_FILTRO = 1;
  private static int PFL_IMDB_ETICSELESESI = 2;

  private static int PPQRY_IMDB9 = 0;


  IDPanel PAN_IMDB;
  private static int PFL_OBIETTGESTIO_IDOBIETGESTI = 0;
  private static int PFL_OBIETTGESTIO_CODICE = 1;
  private static int PFL_OBIETTGESTIO_DESCRIZIONE = 2;
  private static int PFL_OBIETTGESTIO_UNITA = 3;
  private static int PFL_OBIETTGESTIO_RESPONSABILE = 4;
  private static int PFL_OBIETTGESTIO_PROGETTOID = 5;
  private static int PFL_OBIETTGESTIO_DESCRIPROGET = 6;

  private static int PPQRY_DUPOBIETGEST = 0;


  IDPanel PAN_OBIETTGESTIO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDB10(IMDB);
    //
    //
    Init_PQRY_IMDB9(IMDB);
    Init_PQRY_IMDB9_RS(IMDB);
    Init_PQRY_DUPOBIETGEST(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDB10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_IMDB10, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_IMDB10, "TBL_IMDB10");
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB10,IMDBDef1.FLD_IMDB10_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB10,IMDBDef1.FLD_IMDB10_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB10,IMDBDef1.FLD_IMDB10_NOMEOGGEFILT, "NOMEOGGEFILT");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB10,IMDBDef1.FLD_IMDB10_NOMEOGGEFILT,5,50,0);
    IMDB.TblAddNew(IMDBDef1.TBL_IMDB10, 0);
  }

  private static void Init_PQRY_IMDB9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_IMDB9, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_IMDB9, "PQRY_IMDB9");
    IMDB.set_FldCode(IMDBDef8.PQRY_IMDB9,IMDBDef8.PQSL_IMDB9_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_IMDB9,IMDBDef8.PQSL_IMDB9_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_IMDB9,IMDBDef8.PQSL_IMDB9_NOMEOGGEFILT, "NOMEOGGEFILT");
    IMDB.SetFldParams(IMDBDef8.PQRY_IMDB9,IMDBDef8.PQSL_IMDB9_NOMEOGGEFILT,5,50,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_IMDB9, 0);
  }

  private static void Init_PQRY_IMDB9_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_IMDB9_RS, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_IMDB9_RS, "PQRY_IMDB9_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_IMDB9_RS,IMDBDef8.PQSL_IMDB9_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_IMDB9_RS,IMDBDef8.PQSL_IMDB9_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_IMDB9_RS,IMDBDef8.PQSL_IMDB9_NOMEOGGEFILT, "NOMEOGGEFILT");
    IMDB.SetFldParams(IMDBDef8.PQRY_IMDB9_RS,IMDBDef8.PQSL_IMDB9_NOMEOGGEFILT,5,50,0);
  }

  private static void Init_PQRY_DUPOBIETGEST(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DUPOBIETGEST, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_DUPOBIETGEST, "PQRY_DUPOBIETGEST");
    IMDB.set_FldCode(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUOBDUOBIDOG, "DUOBDUOBIDOG");
    IMDB.SetFldParams(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUOBDUOBIDOG,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUPOBIGESCOD, "DUPOBIGESCOD");
    IMDB.SetFldParams(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUPOBIGESCOD,5,20,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUPOBIGESDES, "DUPOBIGESDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUPOBIGESDES,5,2000,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_UNITA, "UNITA");
    IMDB.SetFldParams(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_UNITA,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUPOBIGESRES, "DUPOBIGESRES");
    IMDB.SetFldParams(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUPOBIGESRES,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUOBGEDUOOPI, "DUOBGEDUOOPI");
    IMDB.SetFldParams(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUOBGEDUOOPI,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUPOBIGEDEPR, "DUPOBIGEDEPR");
    IMDB.SetFldParams(IMDBDef8.PQRY_DUPOBIETGEST,IMDBDef8.PQSL_DUPOBIETGEST_DUPOBIGEDEPR,5,4000,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_DUPOBIETGEST, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaObiettiviDiGestioneDUP(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaObiettiviDiGestioneDUP()
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
    FormIdx = MyGlb.FRM_SCEOBIDIGEDU;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0695AB62-BBC9-4ED0-9F67-7C14B36DFC4B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1280;
    DesignHeight = 454;
    set_Caption(new IDVariant("Scelta Obiettivi di Gestione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1280;
    Frames[1].Height = 428;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0841121;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1280;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "IMDB";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 36;
    PAN_IMDB = new IDPanel(w, this, 2, "PAN_IMDB");
    Frames[2].Content = PAN_IMDB;
    PAN_IMDB.Lockable = false;
    PAN_IMDB.iLocked = false;
    PAN_IMDB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMDB.VS = MainFrm.VisualStyleList;
    PAN_IMDB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1280-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMDB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "88808CFB-F4FE-4410-BAF4-EA038A659803");
    PAN_IMDB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 260, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IMDB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMDB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMDB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMDB.InitStatus = 1;
    PAN_IMDB_Init();
    PAN_IMDB_InitFields();
    PAN_IMDB_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1280;
    Frames[3].Height = 392;
    Frames[3].Caption = "Obiettivi Gestione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 392;
    PAN_OBIETTGESTIO = new IDPanel(w, this, 3, "PAN_OBIETTGESTIO");
    Frames[3].Content = PAN_OBIETTGESTIO;
    PAN_OBIETTGESTIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OBIETTGESTIO.VS = MainFrm.VisualStyleList;
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1280-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_OBIETTGESTIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "718D8887-E17C-4DA8-9B87-DC283EA0756D");
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1252, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_OBIETTGESTIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OBIETTGESTIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OBIETTGESTIO.InitStatus = 2;
    PAN_OBIETTGESTIO_Init();
    PAN_OBIETTGESTIO_InitFields();
    PAN_OBIETTGESTIO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_IMDB10, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCEOBIDIGEDU_IMDB9();
      }
      PAN_IMDB.UpdatePanel(MainFrm);
      PAN_OBIETTGESTIO.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaObiettiviDiGestioneDUP);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaObiettiviDiGestioneDUP.class.getName() : (Glb.ClassWithPackage(SceltaObiettiviDiGestioneDUP.class) ? SceltaObiettiviDiGestioneDUP.class.getName().substring(SceltaObiettiviDiGestioneDUP.class.getPackage().getName().length() + 1) : SceltaObiettiviDiGestioneDUP.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      IMDB.set_Value(IMDBDef1.TBL_IMDB10, IMDBDef1.FLD_IMDB10_NOMEOGGEFILT, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaObiettiviDiGestioneDUP", "Load", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_IMDBDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaObiettiviDiGestioneDUP", "Unload", _e);
    }
  }

  // **********************************************************************
  // IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDBDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_IMDB10, IMDBDef1.FLD_IMDB10_PROGETTO_ID, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB10, IMDBDef1.FLD_IMDB10_NOMEOGGEFILT, 0, new IDVariant());
  }

  // **********************************************************************
  // IMDB
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCEOBIDIGEDU_IMDB9() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_IMDB9_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_IMDB10, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_IMDB10, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_IMDB9_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_IMDB9_RS, 0, IMDBDef1.TBL_IMDB10, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_IMDB9_RS, 0, 0, IMDBDef1.TBL_IMDB10, IMDBDef1.FLD_IMDB10_PROGETTO_ID, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_IMDB9_RS, 1, 0, IMDBDef1.TBL_IMDB10, IMDBDef1.FLD_IMDB10_NOMEOGGEFILT, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_IMDB10, 0);
      if (IMDB.Eof(IMDBDef1.TBL_IMDB10, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_IMDB10, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef8.PQRY_IMDB9_RS);
    IMDB.TblSortBy(IMDBDef8.PQRY_IMDB9_RS,0,true);
    IMDB.TblStartSort(IMDBDef8.PQRY_IMDB9_RS);
    IMDB.TblMoveFirst(IMDBDef8.PQRY_IMDB9_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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
  private void PAN_IMDB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMDB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMDB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMDB, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMDB_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMDB);
    // Stub
  }

  private void PAN_IMDB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMDB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMDB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMDB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_OBIETTGESTIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_OBIETTGESTIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OBIETTGESTIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OBIETTGESTIO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OBIETTGESTIO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_OBIETTGESTIO);
    // Stub
  }

  private void PAN_OBIETTGESTIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_OBIETTGESTIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_OBIETTGESTIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_OBIETTGESTIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMDB_Init()
  {

    PAN_IMDB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMDB.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMDB.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_IMDB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, "3F1D81E9-ED3E-40A8-B106-03A6159F972E");
    PAN_IMDB.set_Header(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, "Progetto ID");
    PAN_IMDB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, "");
    PAN_IMDB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, MyGlb.VIS_NORMFIELPADR);
    PAN_IMDB.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMDB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, "BF82EE32-C0BB-4D1F-8A7C-CF5331689E3D");
    PAN_IMDB.set_Header(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, "Filtro sull'obiettivo operativo");
    PAN_IMDB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, "");
    PAN_IMDB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, MyGlb.VIS_CHECKSTYLE);
    PAN_IMDB.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMDB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, "BE105128-47C4-421E-B47B-25821574470B");
    PAN_IMDB.set_Header(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, "Selezionare se si vogliono vedere solo gli obiettivi di gestione legati all’obiettivo operativo del movimento");
    PAN_IMDB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, MyGlb.VIS_VUOGRAALILEF);
    PAN_IMDB.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_IMDB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMDB.SetRect(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, MyGlb.PANEL_LIST, 76);
    PAN_IMDB.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, MyGlb.PANEL_LIST, 1);
    PAN_IMDB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, MyGlb.PANEL_LIST, "Progetto ID");
    PAN_IMDB.SetRect(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, MyGlb.PANEL_FORM, 88);
    PAN_IMDB.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, MyGlb.PANEL_FORM, 1);
    PAN_IMDB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDB_PROGETTOID1, MyGlb.PANEL_FORM, "Progetto ID");
    PAN_IMDB.SetFieldPage(PFL_IMDB_PROGETTOID1, -1, -1);
    PAN_IMDB.SetFieldPanel(PFL_IMDB_PROGETTOID1, PPQRY_IMDB9, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_IMDB.SetRect(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMDB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, MyGlb.PANEL_LIST, 40);
    PAN_IMDB.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, MyGlb.PANEL_LIST, 1);
    PAN_IMDB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, MyGlb.PANEL_LIST, "Filtro sull'obiettivo operativo");
    PAN_IMDB.SetRect(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, MyGlb.PANEL_FORM, 4, 8, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, MyGlb.PANEL_FORM, 176);
    PAN_IMDB.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, MyGlb.PANEL_FORM, 1);
    PAN_IMDB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDB_FILTRO, MyGlb.PANEL_FORM, "Filtro sull'obiettivo operativo");
    PAN_IMDB.SetFieldPage(PFL_IMDB_FILTRO, -1, -1);
    PAN_IMDB.SetFieldPanel(PFL_IMDB_FILTRO, PPQRY_IMDB9, "A.NOMEOGGEFILT", "NOMEOGGEFILT", 5, 50, 0, -13997);
    PAN_IMDB.SetValueListItem(PFL_IMDB_FILTRO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_IMDB.SetValueListItem(PFL_IMDB_FILTRO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_IMDB.SetRect(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, MyGlb.PANEL_LIST, 216, 12, 460, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, MyGlb.PANEL_LIST, 0);
    PAN_IMDB.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, MyGlb.PANEL_LIST, 1);
    PAN_IMDB.SetRect(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, MyGlb.PANEL_FORM, 208, 8, 668, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, MyGlb.PANEL_FORM, 0);
    PAN_IMDB.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDB_ETICSELESESI, MyGlb.PANEL_FORM, 1);
    PAN_IMDB.SetFieldPage(PFL_IMDB_ETICSELESESI, -1, -1);
    PAN_IMDB.SetFieldPanel(PFL_IMDB_ETICSELESESI, -1, "", "ETICSELESESI", 0, 0, 0, -13997);
  }

  private void PAN_IMDB_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMDB.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMDB.SetIMDB(IMDB, "PQRY_IMDB9", true);
    PAN_IMDB.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_IMDB.SetQueryIMDB(PPQRY_IMDB9, IMDBDef8.PQRY_IMDB9_RS, IMDBDef1.TBL_IMDB10);
    JustLoaded = true;
    PAN_IMDB.SetFieldPrimaryIndex(PFL_IMDB_PROGETTOID1, IMDBDef1.FLD_IMDB10_PROGETTO_ID);
    PAN_IMDB.SetFieldPrimaryIndex(PFL_IMDB_FILTRO, IMDBDef1.FLD_IMDB10_NOMEOGGEFILT);
    PAN_IMDB.SetMasterTable(0, "IMDB10");
    PAN_IMDB.AddToSortList(PFL_IMDB_PROGETTOID1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMDB.Status() == 2)
    {
      int oldListQBE = PAN_IMDB.iUseListQBE;
      PAN_IMDB.iUseListQBE = 0;
      PAN_IMDB.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMDB.PanelCommand(Glb.PCM_FIND);
      PAN_IMDB.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_OBIETTGESTIO_Init()
  {

    PAN_OBIETTGESTIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OBIETTGESTIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OBIETTGESTIO.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_OBIETTGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, "324AC581-9C7E-492B-8DFF-1DD6FCE25AE3");
    PAN_OBIETTGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, "ID OBIETTIVO GESTIONE");
    PAN_OBIETTGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, "");
    PAN_OBIETTGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_OBIETTGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_OBIETTGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, "CD75899F-E259-4B4B-8B36-48F7D05AC882");
    PAN_OBIETTGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, "Codice");
    PAN_OBIETTGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, "");
    PAN_OBIETTGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_OBIETTGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, "26C8653D-4238-4A70-8CEF-27B0C9438D8D");
    PAN_OBIETTGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, "Descrizione");
    PAN_OBIETTGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, "");
    PAN_OBIETTGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, "9C16DE3E-749E-4D4D-B6C9-CDFDAAA86459");
    PAN_OBIETTGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, "Unità");
    PAN_OBIETTGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, "");
    PAN_OBIETTGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, "50540006-9EF5-42F9-ABD3-F2666120CC70");
    PAN_OBIETTGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, "Responsabile");
    PAN_OBIETTGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, "");
    PAN_OBIETTGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, "128C2A1B-3999-4C37-9C87-7F46AB2817A3");
    PAN_OBIETTGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, "PROGETTO ID");
    PAN_OBIETTGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, "");
    PAN_OBIETTGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_OBIETTGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, "276C21CC-A453-43A5-9980-1929DA379939");
    PAN_OBIETTGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, "Obiettivo Operativo");
    PAN_OBIETTGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, "");
    PAN_OBIETTGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_OBIETTGESTIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, MyGlb.PANEL_LIST, 144);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, MyGlb.PANEL_LIST, "ID OB. GEST.");
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, MyGlb.PANEL_FORM, 4, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, MyGlb.PANEL_FORM, 160);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_IDOBIETGESTI, MyGlb.PANEL_FORM, "ID OBIETTIVO GESTIONE");
    PAN_OBIETTGESTIO.SetFieldPage(PFL_OBIETTGESTIO_IDOBIETGESTI, -1, -1);
    PAN_OBIETTGESTIO.SetFieldPanel(PFL_OBIETTGESTIO_IDOBIETGESTI, PPQRY_DUPOBIETGEST, "og.ID_OBIETTIVO_GESTIONE", "DUOBDUOBIDOG", 3, 10, 0, -13997);
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, MyGlb.PANEL_FORM, 4, 28, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, MyGlb.PANEL_FORM, 160);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_OBIETTGESTIO.SetFieldPage(PFL_OBIETTGESTIO_CODICE, -1, -1);
    PAN_OBIETTGESTIO.SetFieldPanel(PFL_OBIETTGESTIO_CODICE, PPQRY_DUPOBIETGEST, "og.CODICE", "DUPOBIGESCOD", 5, 20, 0, -13997);
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, MyGlb.PANEL_LIST, 148, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_OBIETTGESTIO.SetFieldPage(PFL_OBIETTGESTIO_DESCRIZIONE, -1, -1);
    PAN_OBIETTGESTIO.SetFieldPanel(PFL_OBIETTGESTIO_DESCRIZIONE, PPQRY_DUPOBIETGEST, "og.DESCRIZIONE", "DUPOBIGESDES", 5, 2000, 0, -13997);
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, MyGlb.PANEL_LIST, 424, 36, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, MyGlb.PANEL_LIST, 40);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, MyGlb.PANEL_LIST, "Unità");
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, MyGlb.PANEL_FORM, 4, 100, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, MyGlb.PANEL_FORM, 40);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_UNITA, MyGlb.PANEL_FORM, "Unità");
    PAN_OBIETTGESTIO.SetFieldPage(PFL_OBIETTGESTIO_UNITA, -1, -1);
    PAN_OBIETTGESTIO.SetFieldUnbound(PFL_OBIETTGESTIO_UNITA, true);
    PAN_OBIETTGESTIO.SetFieldPanel(PFL_OBIETTGESTIO_UNITA, PPQRY_DUPOBIETGEST, "DUP.GET_DESCRIZIONE_UNITA(og.SO4_PROGR,og.SO4_DAL,og.SO4_OTTICA)", "UNITA", 5, 99, 0, -13997);
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, MyGlb.PANEL_LIST, 700, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, MyGlb.PANEL_LIST, 92);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, MyGlb.PANEL_LIST, "Responsabile");
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, MyGlb.PANEL_FORM, 4, 124, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, MyGlb.PANEL_FORM, 92);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, MyGlb.PANEL_FORM, 2);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_RESPONSABILE, MyGlb.PANEL_FORM, "Responsabile");
    PAN_OBIETTGESTIO.SetFieldPage(PFL_OBIETTGESTIO_RESPONSABILE, -1, -1);
    PAN_OBIETTGESTIO.SetFieldPanel(PFL_OBIETTGESTIO_RESPONSABILE, PPQRY_DUPOBIETGEST, "og.RESPONSABILE", "DUPOBIGESRES", 5, 255, 0, -13997);
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, MyGlb.PANEL_LIST, 1180, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, MyGlb.PANEL_LIST, 84);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, MyGlb.PANEL_FORM, 84);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_PROGETTOID, MyGlb.PANEL_FORM, "PROGETTO ID");
    PAN_OBIETTGESTIO.SetFieldPage(PFL_OBIETTGESTIO_PROGETTOID, -1, -1);
    PAN_OBIETTGESTIO.SetFieldPanel(PFL_OBIETTGESTIO_PROGETTOID, PPQRY_DUPOBIETGEST, "oo.PROGETTO_ID", "DUOBGEDUOOPI", 5, 9, 0, -13997);
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, MyGlb.PANEL_LIST, 976, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, MyGlb.PANEL_LIST, 84);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_OBIETTGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, MyGlb.PANEL_FORM, 4, 172, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, MyGlb.PANEL_FORM, 84);
    PAN_OBIETTGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, MyGlb.PANEL_FORM, 2);
    PAN_OBIETTGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTGESTIO_DESCRIPROGET, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_OBIETTGESTIO.SetFieldPage(PFL_OBIETTGESTIO_DESCRIPROGET, -1, -1);
    PAN_OBIETTGESTIO.SetFieldPanel(PFL_OBIETTGESTIO_DESCRIPROGET, PPQRY_DUPOBIETGEST, "oo.DESCRIZIONE", "DUPOBIGEDEPR", 5, 4000, 0, -13997);
  }

  private void PAN_OBIETTGESTIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_OBIETTGESTIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_OBIETTGESTIO.SetIMDB(IMDB, "PQRY_DUPOBIETGEST", true);
    PAN_OBIETTGESTIO.set_SetString(MyGlb.MASTER_ROWNAME, "DUP OBIETTIVI GESTIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  og.ID_OBIETTIVO_GESTIONE as DUOBDUOBIDOG, ");
    SQL.append("  og.CODICE as DUPOBIGESCOD, ");
    SQL.append("  og.DESCRIZIONE as DUPOBIGESDES, ");
    SQL.append("  DUP.GET_DESCRIZIONE_UNITA(og.SO4_PROGR,og.SO4_DAL,og.SO4_OTTICA) as UNITA, ");
    SQL.append("  og.RESPONSABILE as DUPOBIGESRES, ");
    SQL.append("  oo.PROGETTO_ID as DUOBGEDUOOPI, ");
    SQL.append("  oo.DESCRIZIONE as DUPOBIGEDEPR ");
    PAN_OBIETTGESTIO.SetQuery(PPQRY_DUPOBIETGEST, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUP_OBIETTIVI_GESTIONE og, ");
    SQL.append("  DUP_OBIETTIVI_OPERATIVI oo ");
    PAN_OBIETTGESTIO.SetQuery(PPQRY_DUPOBIETGEST, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (og.ID_OBIETTIVO_OPERATIVO = oo.ID_OBIETTIVO_OPERATIVO) ");
    SQL.append("and   (og.IN_USO = oo.IN_USO) ");
    SQL.append("and   (oo.IN_USO = 'Y') ");
    SQL.append("and   (oo.LEGISLATURA = og.LEGISLATURA) ");
    SQL.append("and   (og.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (oo.PROGETTO_ID = DECODE(~~PQRY_IMDB9.NOMEOGGEFILT~~, 'SI', ~~TBL_IMDB10.PROGETTO_ID~~, oo.PROGETTO_ID)) ");
    PAN_OBIETTGESTIO.SetQuery(PPQRY_DUPOBIETGEST, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OBIETTGESTIO.SetQuery(PPQRY_DUPOBIETGEST, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OBIETTGESTIO.SetQuery(PPQRY_DUPOBIETGEST, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  og.CODICE ");
    PAN_OBIETTGESTIO.SetQuery(PPQRY_DUPOBIETGEST, 5, SQL, -1, "");
    PAN_OBIETTGESTIO.SetQueryDB(PPQRY_DUPOBIETGEST, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OBIETTGESTIO.SetMasterTable(0, "DUP_OBIETTIVI_GESTIONE");
    PAN_OBIETTGESTIO.AddToSortList(PFL_OBIETTGESTIO_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_OBIETTGESTIO.Status() == 2)
    {
      int oldListQBE = PAN_OBIETTGESTIO.iUseListQBE;
      PAN_OBIETTGESTIO.iUseListQBE = 0;
      PAN_OBIETTGESTIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_OBIETTGESTIO.PanelCommand(Glb.PCM_FIND);
      PAN_OBIETTGESTIO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMDB) PAN_IMDB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_OBIETTGESTIO) PAN_OBIETTGESTIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMDB) PAN_IMDB_ValidateRow(Cancel);
    if (SrcObj == PAN_OBIETTGESTIO) PAN_OBIETTGESTIO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMDB) PAN_IMDB_DynamicProperties();
    if (SrcObj == PAN_OBIETTGESTIO) PAN_OBIETTGESTIO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMDB) PAN_IMDB_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_OBIETTGESTIO) PAN_OBIETTGESTIO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMDB) PAN_IMDB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_OBIETTGESTIO) PAN_OBIETTGESTIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
