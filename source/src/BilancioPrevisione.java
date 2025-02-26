// **********************************************
// Bilancio Previsione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class BilancioPrevisione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_BILANCPREVIS_STAMPA = 0;
  private static int GRP_BILANCPREVIS_PARTE = 1;

  private static int PFL_BILANCPREVIS_DABILANSIMUL = 0;
  private static int PFL_BILANCPREVIS_DETTAGLIO = 1;
  private static int PFL_BILANCPREVIS_STAMPA = 2;
  private static int PFL_BILANCPREVIS_NEWPANELABE1 = 3;
  private static int PFL_BILANCPREVIS_PARTE = 4;
  private static int PFL_BILANCPREVIS_NEWPANELABE2 = 5;
  private static int PFL_BILANCPREVIS_ELABORA = 6;

  private static int PPQRY_PARAMETRI188 = 0;


  IDPanel PAN_BILANCPREVIS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI134(IMDB);
    //
    //
    Init_PQRY_PARAMETRI188(IMDB);
    Init_PQRY_PARAMETRI188_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI134(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI134, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI134, "TBL_PARAMETRI134");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI134,IMDBDef3.FLD_PARAMETRI134_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI134,IMDBDef3.FLD_PARAMETRI134_ROWNAMESTAMP,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI134,IMDBDef3.FLD_PARAMETRI134_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI134,IMDBDef3.FLD_PARAMETRI134_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI134,IMDBDef3.FLD_PARAMETRI134_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI134,IMDBDef3.FLD_PARAMETRI134_ROWNAMDABISI,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI134,IMDBDef3.FLD_PARAMETRI134_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI134,IMDBDef3.FLD_PARAMETRI134_ROWNAMEDETTA,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI134, 0);
  }

  private static void Init_PQRY_PARAMETRI188(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI188, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI188, "PQRY_PARAMETRI188");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI188,IMDBDef11.PQSL_PARAMETRI188_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI188,IMDBDef11.PQSL_PARAMETRI188_ROWNAMESTAMP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI188,IMDBDef11.PQSL_PARAMETRI188_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI188,IMDBDef11.PQSL_PARAMETRI188_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI188,IMDBDef11.PQSL_PARAMETRI188_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI188,IMDBDef11.PQSL_PARAMETRI188_ROWNAMDABISI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI188,IMDBDef11.PQSL_PARAMETRI188_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI188,IMDBDef11.PQSL_PARAMETRI188_ROWNAMEDETTA,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI188, 0);
  }

  private static void Init_PQRY_PARAMETRI188_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI188_RS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI188_RS, "PQRY_PARAMETRI188_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI188_RS,IMDBDef11.PQSL_PARAMETRI188_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI188_RS,IMDBDef11.PQSL_PARAMETRI188_ROWNAMESTAMP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI188_RS,IMDBDef11.PQSL_PARAMETRI188_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI188_RS,IMDBDef11.PQSL_PARAMETRI188_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI188_RS,IMDBDef11.PQSL_PARAMETRI188_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI188_RS,IMDBDef11.PQSL_PARAMETRI188_ROWNAMDABISI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI188_RS,IMDBDef11.PQSL_PARAMETRI188_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI188_RS,IMDBDef11.PQSL_PARAMETRI188_ROWNAMEDETTA,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public BilancioPrevisione(MyWebEntryPoint w, IMDBObj imdb)
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
  public BilancioPrevisione()
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
    FormIdx = MyGlb.FRM_BILANCPREVIS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "55DF03A0-A55C-4970-BD2E-0F9F43E77330";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 276;
    DesignHeight = 298;
    set_Caption(new IDVariant("Bilancio Previsione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 276;
    Frames[1].Height = 272;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Bilancio Previsione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 272;
    PAN_BILANCPREVIS = new IDPanel(w, this, 1, "PAN_BILANCPREVIS");
    Frames[1].Content = PAN_BILANCPREVIS;
    PAN_BILANCPREVIS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BILANCPREVIS.VS = MainFrm.VisualStyleList;
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 276-MyGlb.PAN_OFFS_X, 272-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1184E7B5-C02B-439B-B11F-C68F894E47F3");
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 288, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BILANCPREVIS.InitStatus = 2;
    PAN_BILANCPREVIS_Init();
    PAN_BILANCPREVIS_InitFields();
    PAN_BILANCPREVIS_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI134, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        BILANCPREVIS_PARAMETRI188();
      }
      PAN_BILANCPREVIS.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof BilancioPrevisione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BilancioPrevisione.class.getName() : (Glb.ClassWithPackage(BilancioPrevisione.class) ? BilancioPrevisione.class.getName().substring(BilancioPrevisione.class.getPackage().getName().length() + 1) : BilancioPrevisione.class.getName()));
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI134, IMDBDef3.FLD_PARAMETRI134_ROWNAMESTAMP, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI134, IMDBDef3.FLD_PARAMETRI134_ROWNAMEPARTE, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI134, IMDBDef3.FLD_PARAMETRI134_ROWNAMDABISI, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI134, IMDBDef3.FLD_PARAMETRI134_ROWNAMEDETTA, 0, (new IDVariant("NO")));
      PAN_BILANCPREVIS.SetFlags (Glb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPrevisione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("TIPO"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("PARTE"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("DETTAGLIO"));
      IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR5 = (new IDVariant("COPERTINA"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Bilancio_Previsione"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, ((IMDB.Value(IMDBDef11.PQRY_PARAMETRI188, IMDBDef11.PQSL_PARAMETRI188_ROWNAMDABISI, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IMDB.Value(IMDBDef11.PQRY_PARAMETRI188, IMDBDef11.PQSL_PARAMETRI188_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef11.PQRY_PARAMETRI188, IMDBDef11.PQSL_PARAMETRI188_ROWNAMEDETTA, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI188, IMDBDef11.PQSL_PARAMETRI188_ROWNAMESTAMP, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPrevisione", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPrevisione", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void BILANCPREVIS_PARAMETRI188() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI188_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI134, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI134, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI188_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI188_RS, 0, IMDBDef3.TBL_PARAMETRI134, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI188_RS, 0, 0, IMDBDef3.TBL_PARAMETRI134, IMDBDef3.FLD_PARAMETRI134_ROWNAMESTAMP, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI188_RS, 1, 0, IMDBDef3.TBL_PARAMETRI134, IMDBDef3.FLD_PARAMETRI134_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI188_RS, 2, 0, IMDBDef3.TBL_PARAMETRI134, IMDBDef3.FLD_PARAMETRI134_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI188_RS, 3, 0, IMDBDef3.TBL_PARAMETRI134, IMDBDef3.FLD_PARAMETRI134_ROWNAMEDETTA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI134, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI134, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI134, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI188_RS, 0);
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
  // cio� quando viene portata in primo piano
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
  private void PAN_BILANCPREVIS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BILANCPREVIS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BILANCPREVIS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BILANCPREVIS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BILANCPREVIS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BILANCPREVIS);
    // Stub
  }

  private void PAN_BILANCPREVIS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BILANCPREVIS_ELABORA)
    {
      this.IdxPanelActived = this.PAN_BILANCPREVIS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BILANCPREVIS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BILANCPREVIS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BILANCPREVIS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BILANCPREVIS_Init()
  {

    PAN_BILANCPREVIS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BILANCPREVIS.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, "7BC7A4C1-6C9F-4025-B62B-FE1730DC9A62");
    PAN_BILANCPREVIS.set_Header(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, "Stampa");
    PAN_BILANCPREVIS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, "");
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, MyGlb.VIS_GROUPSTYLE);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, MyGlb.PANEL_FORM, 12, 11, 228, 49, 0, 0);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, 0, 44);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, 1, 13);
    PAN_BILANCPREVIS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, 0, 4);
    PAN_BILANCPREVIS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, 1, 4);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, "F47DD673-6D69-48EF-8D5B-469DCE7C49A4");
    PAN_BILANCPREVIS.set_Header(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, "Parte");
    PAN_BILANCPREVIS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, "");
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, MyGlb.PANEL_LIST, 96, -9999, 64, 16, 0, 0);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, MyGlb.PANEL_FORM, 12, 63, 228, 57, 0, 0);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, 0, 31);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, 1, 13);
    PAN_BILANCPREVIS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, 0, 4);
    PAN_BILANCPREVIS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, 1, 4);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_GROUP, GRP_BILANCPREVIS_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILANCPREVIS.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, "7F35C76B-F8D5-4D9D-8F0E-628440EC9617");
    PAN_BILANCPREVIS.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_BILANCPREVIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, "");
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, "CDC75F3C-B307-4DBA-AEEA-44F7ECF180D6");
    PAN_BILANCPREVIS.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, "Dettaglio");
    PAN_BILANCPREVIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, "");
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, MyGlb.VIS_CHECKSTYLE);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, "D46FC48E-165D-4041-A9DB-35DD4CCFB9AC");
    PAN_BILANCPREVIS.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, "Stampa");
    PAN_BILANCPREVIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, "");
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, "C5411A45-478F-4297-B0A9-0FADFC926E4F");
    PAN_BILANCPREVIS.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, "");
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, "FF25A310-8608-410C-A5C3-1D2302556D0B");
    PAN_BILANCPREVIS.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, "Parte");
    PAN_BILANCPREVIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, "");
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, "5574ABB6-2D5E-4739-A6A8-241C03EF8919");
    PAN_BILANCPREVIS.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, "");
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILANCPREVIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, "38C53C22-66C9-4463-B484-7E0813B99F08");
    PAN_BILANCPREVIS.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, "Elabora");
    PAN_BILANCPREVIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_BILANCPREVIS.SetImage(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, 0, "button1.gif", false);
    PAN_BILANCPREVIS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_BILANCPREVIS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, MyGlb.PANEL_LIST, 160, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPREVIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, MyGlb.PANEL_FORM, 84, 124, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, MyGlb.PANEL_FORM, 128);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPREVIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_BILANCPREVIS.SetFieldPage(PFL_BILANCPREVIS_DABILANSIMUL, -1, -1);
    PAN_BILANCPREVIS.SetFieldPanel(PFL_BILANCPREVIS_DABILANSIMUL, PPQRY_PARAMETRI188, "A.ROWNAMDABISI", "ROWNAMDABISI", 1, 1, 0, -13997);
    PAN_BILANCPREVIS.SetValueListItem(PFL_BILANCPREVIS_DABILANSIMUL, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_BILANCPREVIS.SetValueListItem(PFL_BILANCPREVIS_DABILANSIMUL, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, MyGlb.PANEL_LIST, 208, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, MyGlb.PANEL_LIST, 52);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPREVIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, MyGlb.PANEL_LIST, "Dettaglio");
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, MyGlb.PANEL_FORM, 144, 148, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, MyGlb.PANEL_FORM, 68);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPREVIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_DETTAGLIO, MyGlb.PANEL_FORM, "Dettaglio");
    PAN_BILANCPREVIS.SetFieldPage(PFL_BILANCPREVIS_DETTAGLIO, -1, -1);
    PAN_BILANCPREVIS.SetFieldPanel(PFL_BILANCPREVIS_DETTAGLIO, PPQRY_PARAMETRI188, "A.ROWNAMEDETTA", "ROWNAMEDETTA", 5, 2, 0, -13997);
    PAN_BILANCPREVIS.SetValueListItem(PFL_BILANCPREVIS_DETTAGLIO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_BILANCPREVIS.SetValueListItem(PFL_BILANCPREVIS_DETTAGLIO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, MyGlb.PANEL_LIST, 44);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPREVIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, MyGlb.PANEL_LIST, "Stampa");
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, MyGlb.PANEL_FORM, 52, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, MyGlb.PANEL_FORM, 44);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPREVIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_STAMPA, MyGlb.PANEL_FORM, "Stam.");
    PAN_BILANCPREVIS.SetFieldPage(PFL_BILANCPREVIS_STAMPA, -1, GRP_BILANCPREVIS_STAMPA);
    PAN_BILANCPREVIS.SetFieldPanel(PFL_BILANCPREVIS_STAMPA, PPQRY_PARAMETRI188, "A.ROWNAMESTAMP", "ROWNAMESTAMP", 1, 1, 0, -13997);
    PAN_BILANCPREVIS.SetValueListItem(PFL_BILANCPREVIS_STAMPA, (new IDVariant(0)), "Copertina", "", "", -1);
    PAN_BILANCPREVIS.SetValueListItem(PFL_BILANCPREVIS_STAMPA, (new IDVariant(1)), "Bil. Previsione", "", "", -1);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, MyGlb.PANEL_LIST, 176, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, MyGlb.PANEL_FORM, 16, 36, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPREVIS.SetFieldPage(PFL_BILANCPREVIS_NEWPANELABE1, -1, GRP_BILANCPREVIS_STAMPA);
    PAN_BILANCPREVIS.SetFieldPanel(PFL_BILANCPREVIS_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, MyGlb.PANEL_LIST, 96, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPREVIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, MyGlb.PANEL_FORM, 52, 88, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, MyGlb.PANEL_FORM, 44);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPREVIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_BILANCPREVIS.SetFieldPage(PFL_BILANCPREVIS_PARTE, -1, GRP_BILANCPREVIS_PARTE);
    PAN_BILANCPREVIS.SetFieldPanel(PFL_BILANCPREVIS_PARTE, PPQRY_PARAMETRI188, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_BILANCPREVIS.SetValueListItem(PFL_BILANCPREVIS_PARTE, (new IDVariant("E")), "Entrata����������", "Parte Entrata", "", -1);
    PAN_BILANCPREVIS.SetValueListItem(PFL_BILANCPREVIS_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, MyGlb.PANEL_LIST, 176, 76, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, MyGlb.PANEL_FORM, 16, 104, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPREVIS.SetFieldPage(PFL_BILANCPREVIS_NEWPANELABE2, -1, GRP_BILANCPREVIS_PARTE);
    PAN_BILANCPREVIS.SetFieldPanel(PFL_BILANCPREVIS_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, MyGlb.PANEL_LIST, 96, 176, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPREVIS.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, MyGlb.PANEL_FORM, 160, 192, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPREVIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_BILANCPREVIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPREVIS_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPREVIS.SetFieldPage(PFL_BILANCPREVIS_ELABORA, -1, -1);
    PAN_BILANCPREVIS.SetFieldPanel(PFL_BILANCPREVIS_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_BILANCPREVIS_InitQueries()
  {
    StringBuffer SQL;

    PAN_BILANCPREVIS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BILANCPREVIS.SetIMDB(IMDB, "PQRY_PARAMETRI188", true);
    PAN_BILANCPREVIS.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_BILANCPREVIS.SetQueryIMDB(PPQRY_PARAMETRI188, IMDBDef11.PQRY_PARAMETRI188_RS, IMDBDef3.TBL_PARAMETRI134);
    JustLoaded = true;
    PAN_BILANCPREVIS.SetFieldPrimaryIndex(PFL_BILANCPREVIS_DABILANSIMUL, IMDBDef3.FLD_PARAMETRI134_ROWNAMDABISI);
    PAN_BILANCPREVIS.SetFieldPrimaryIndex(PFL_BILANCPREVIS_DETTAGLIO, IMDBDef3.FLD_PARAMETRI134_ROWNAMEDETTA);
    PAN_BILANCPREVIS.SetFieldPrimaryIndex(PFL_BILANCPREVIS_STAMPA, IMDBDef3.FLD_PARAMETRI134_ROWNAMESTAMP);
    PAN_BILANCPREVIS.SetFieldPrimaryIndex(PFL_BILANCPREVIS_PARTE, IMDBDef3.FLD_PARAMETRI134_ROWNAMEPARTE);
    PAN_BILANCPREVIS.SetMasterTable(0, "PARAMETRI134");
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_BILANCPREVIS.Status() == 2)
    {
      int oldListQBE = PAN_BILANCPREVIS.iUseListQBE;
      PAN_BILANCPREVIS.iUseListQBE = 0;
      PAN_BILANCPREVIS.PanelCommand(Glb.PCM_SEARCH);
      PAN_BILANCPREVIS.PanelCommand(Glb.PCM_FIND);
      PAN_BILANCPREVIS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BILANCPREVIS) PAN_BILANCPREVIS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILANCPREVIS) PAN_BILANCPREVIS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BILANCPREVIS) PAN_BILANCPREVIS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILANCPREVIS) PAN_BILANCPREVIS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BILANCPREVIS) PAN_BILANCPREVIS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
