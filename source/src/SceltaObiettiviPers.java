// **********************************************
// Scelta Obiettivi Pers
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaObiettiviPers extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SCADUTI = 0;

  private static int PPQRY_PARAMETRI8 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_OBIETTIVI_CODICE = 0;
  private static int PFL_OBIETTIVI_DESCRIZIONE = 1;
  private static int PFL_OBIETTIVI_RESPONSABILE = 2;
  private static int PFL_OBIETTIVI_DATAINIZIO = 3;
  private static int PFL_OBIETTIVI_DATAFINE = 4;

  private static int PPQRY_PROGETTICG4 = 0;


  IDPanel PAN_OBIETTIVI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI622(IMDB);
    //
    //
    Init_PQRY_PROGETTICG4(IMDB);
    Init_PQRY_PARAMETRI8(IMDB);
    Init_PQRY_PARAMETRI8_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI622(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI622, 8);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI622, "TBL_PARAMETRI622");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMESCADU, "ROWNAMESCADU");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMESCADU,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMDATREG,6,20,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMRISINT, "ROWNAMRISINT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMRISINT,1,7,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMENTSPE, "ROWNAMENTSPE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMPROBCA, "ROWNAMPROBCA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMPROBCA,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMOBICAP, "ROWNAMOBICAP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI622,IMDBDef1.FLD_PARAMETRI622_ROWNAMOBICAP,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI622, 0);
  }

  private static void Init_PQRY_PROGETTICG4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PROGETTICG4, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_PROGETTICG4, "PQRY_PROGETTICG4");
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_PROGETTO, "PROGETTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_PROGETTO,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_RESPONSABILE, "RESPONSABILE");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_RESPONSABILE,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_DATA_INIZIO, "DATA_INIZIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_DATA_INIZIO,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_DATA_FINE_EFFETTIVA, "DATA_FINE_EFFETTIVA");
    IMDB.SetFldParams(IMDBDef7.PQRY_PROGETTICG4,IMDBDef7.PQSL_PROGETTICG4_DATA_FINE_EFFETTIVA,6,19,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PROGETTICG4, 0);
  }

  private static void Init_PQRY_PARAMETRI8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI8, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI8, "PQRY_PARAMETRI8");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI8,IMDBDef7.PQSL_PARAMETRI8_ROWNAMESCADU, "ROWNAMESCADU");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI8,IMDBDef7.PQSL_PARAMETRI8_ROWNAMESCADU,5,2,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI8, 0);
  }

  private static void Init_PQRY_PARAMETRI8_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI8_RS, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI8_RS, "PQRY_PARAMETRI8_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI8_RS,IMDBDef7.PQSL_PARAMETRI8_ROWNAMESCADU, "ROWNAMESCADU");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI8_RS,IMDBDef7.PQSL_PARAMETRI8_ROWNAMESCADU,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaObiettiviPers(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaObiettiviPers()
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
    FormIdx = MyGlb.FRM_SCELOBIEPERS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "80CDC0D0-C203-4091-87C6-8E9B1B3B208E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 700;
    DesignHeight = 414;
    set_Caption(new IDVariant("Scelta Obiettivi Pers"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 700;
    Frames[1].Height = 388;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.14433;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 700;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 700-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7CB3E4F2-D12D-425F-9922-50823B0C1790");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 64, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 700;
    Frames[3].Height = 332;
    Frames[3].Caption = "Obiettivi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 332;
    PAN_OBIETTIVI = new IDPanel(w, this, 3, "PAN_OBIETTIVI");
    Frames[3].Content = PAN_OBIETTIVI;
    PAN_OBIETTIVI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OBIETTIVI.VS = MainFrm.VisualStyleList;
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 700-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_OBIETTIVI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "60D58322-8932-4AA9-8AEA-FB4802734E8C");
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 652, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OBIETTIVI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OBIETTIVI.InitStatus = 2;
    PAN_OBIETTIVI_Init();
    PAN_OBIETTIVI_InitFields();
    PAN_OBIETTIVI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI622, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELOBIEPERS_PARAMETRI8();
      }
      PAN_OBIETTIVI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaObiettiviPers);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaObiettiviPers.class.getName() : (Glb.ClassWithPackage(SceltaObiettiviPers.class) ? SceltaObiettiviPers.class.getName().substring(SceltaObiettiviPers.class.getPackage().getName().length() + 1) : SceltaObiettiviPers.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Obiettivi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OBIETTIVI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_OBIETTIVI);
      // 
      // Obiettivi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_OBIETTIVI.set_ToolTip(Glb.OBJ_FIELD,PFL_OBIETTIVI_DESCRIZIONE,(new IDVariant(PAN_OBIETTIVI.FieldText(PFL_OBIETTIVI_DESCRIZIONE))).stringValue()); 
      PAN_OBIETTIVI.set_ToolTip(Glb.OBJ_FIELD,PFL_OBIETTIVI_RESPONSABILE,(new IDVariant(PAN_OBIETTIVI.FieldText(PFL_OBIETTIVI_RESPONSABILE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaObiettiviPers", "ObiettiviOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("SceltaObiettiviPers", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SCELOBIEPERS_PARAMETRI8() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_PARAMETRI8_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI622, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI622, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI8_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_PARAMETRI8_RS, 0, IMDBDef1.TBL_PARAMETRI622, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI8_RS, 0, 0, IMDBDef1.TBL_PARAMETRI622, IMDBDef1.FLD_PARAMETRI622_ROWNAMESCADU, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI622, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI622, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI622, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef7.PQRY_PARAMETRI8_RS, 0);
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
  private void PAN_OBIETTIVI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_OBIETTIVI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OBIETTIVI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OBIETTIVI, Cancel);
    // Stub
  }

  private void PAN_OBIETTIVI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_OBIETTIVI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_OBIETTIVI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_OBIETTIVI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_OBIETTIVI_Init()
  {

    PAN_OBIETTIVI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OBIETTIVI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OBIETTIVI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_OBIETTIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, "01C16EBD-225D-4E1C-80C5-DADA843909C0");
    PAN_OBIETTIVI.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, "Codice");
    PAN_OBIETTIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, "");
    PAN_OBIETTIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_OBIETTIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, "7BBCCACB-E02E-435A-904A-45FF6266DB83");
    PAN_OBIETTIVI.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, "Descrizione");
    PAN_OBIETTIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, "");
    PAN_OBIETTIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, "13DDC061-3830-4150-8C0B-D033F6361E5C");
    PAN_OBIETTIVI.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, "Responsabile");
    PAN_OBIETTIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, "");
    PAN_OBIETTIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, "5EEB8C54-3A87-4648-BB7F-4C8371C932C1");
    PAN_OBIETTIVI.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, "Data Inizio");
    PAN_OBIETTIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, "");
    PAN_OBIETTIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, "F7AE1514-22E4-4A07-9A6A-09B470206DF8");
    PAN_OBIETTIVI.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, "Data Fine");
    PAN_OBIETTIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, "");
    PAN_OBIETTIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_OBIETTIVI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, MyGlb.PANEL_LIST, 64);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_OBIETTIVI.SetFieldPage(PFL_OBIETTIVI_CODICE, -1, -1);
    PAN_OBIETTIVI.SetFieldPanel(PFL_OBIETTIVI_CODICE, PPQRY_PROGETTICG4, "A.PROGETTO", "PROGETTO", 5, 9, 0, -13997);
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, MyGlb.PANEL_LIST, 68, 36, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_OBIETTIVI.SetFieldPage(PFL_OBIETTIVI_DESCRIZIONE, -1, -1);
    PAN_OBIETTIVI.SetFieldPanel(PFL_OBIETTIVI_DESCRIZIONE, PPQRY_PROGETTICG4, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, MyGlb.PANEL_LIST, 312, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, MyGlb.PANEL_LIST, 84);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, MyGlb.PANEL_LIST, "Responsabile");
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, MyGlb.PANEL_FORM, 4, 76, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_RESPONSABILE, MyGlb.PANEL_FORM, "Responsabile");
    PAN_OBIETTIVI.SetFieldPage(PFL_OBIETTIVI_RESPONSABILE, -1, -1);
    PAN_OBIETTIVI.SetFieldPanel(PFL_OBIETTIVI_RESPONSABILE, PPQRY_PROGETTICG4, "A.RESPONSABILE", "RESPONSABILE", 5, 40, 0, -13997);
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, MyGlb.PANEL_LIST, 496, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, MyGlb.PANEL_LIST, 72);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, MyGlb.PANEL_LIST, "Data Inizio");
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, MyGlb.PANEL_FORM, 4, 100, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAINIZIO, MyGlb.PANEL_FORM, "Data Inizio");
    PAN_OBIETTIVI.SetFieldPage(PFL_OBIETTIVI_DATAINIZIO, -1, -1);
    PAN_OBIETTIVI.SetFieldPanel(PFL_OBIETTIVI_DATAINIZIO, PPQRY_PROGETTICG4, "A.DATA_INIZIO", "DATA_INIZIO", 6, 19, 0, -13997);
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, MyGlb.PANEL_LIST, 572, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, MyGlb.PANEL_LIST, 120);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, MyGlb.PANEL_LIST, "Data Fine");
    PAN_OBIETTIVI.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, MyGlb.PANEL_FORM, 4, 124, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTIVI_DATAFINE, MyGlb.PANEL_FORM, "Data Fine");
    PAN_OBIETTIVI.SetFieldPage(PFL_OBIETTIVI_DATAFINE, -1, -1);
    PAN_OBIETTIVI.SetFieldPanel(PFL_OBIETTIVI_DATAFINE, PPQRY_PROGETTICG4, "A.DATA_FINE_EFFETTIVA", "DATA_FINE_EFFETTIVA", 6, 19, 0, -13997);
  }

  private void PAN_OBIETTIVI_InitQueries()
  {
    StringBuffer SQL;

    PAN_OBIETTIVI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_OBIETTIVI.SetIMDB(IMDB, "PQRY_PROGETTICG4", true);
    PAN_OBIETTIVI.set_SetString(MyGlb.MASTER_ROWNAME, "PROGETTI CG4");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO as PROGETTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.RESPONSABILE as RESPONSABILE, ");
    SQL.append("  A.DATA_INIZIO as DATA_INIZIO, ");
    SQL.append("  A.DATA_FINE_EFFETTIVA as DATA_FINE_EFFETTIVA ");
    PAN_OBIETTIVI.SetQuery(PPQRY_PROGETTICG4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROGETTI_CG4 A ");
    PAN_OBIETTIVI.SetQuery(PPQRY_PROGETTICG4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (((((A.DATA_FINE_EFFETTIVA IS NULL) OR A.DATA_FINE_EFFETTIVA > ~~TBL_PARAMETRI622.ROWNAMDATREG~~))) OR (~~PQRY_PARAMETRI8.ROWNAMESCADU~~ = 'SI')) ");
    PAN_OBIETTIVI.SetQuery(PPQRY_PROGETTICG4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OBIETTIVI.SetQuery(PPQRY_PROGETTICG4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OBIETTIVI.SetQuery(PPQRY_PROGETTICG4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGETTO ");
    PAN_OBIETTIVI.SetQuery(PPQRY_PROGETTICG4, 5, SQL, -1, "");
    PAN_OBIETTIVI.SetQueryDB(PPQRY_PROGETTICG4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OBIETTIVI.SetMasterTable(0, "PROGETTI_CG4");
    PAN_OBIETTIVI.AddToSortList(PFL_OBIETTIVI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_OBIETTIVI.Status() == 2)
    {
      int oldListQBE = PAN_OBIETTIVI.iUseListQBE;
      PAN_OBIETTIVI.iUseListQBE = 0;
      PAN_OBIETTIVI.PanelCommand(Glb.PCM_SEARCH);
      PAN_OBIETTIVI.PanelCommand(Glb.PCM_FIND);
      PAN_OBIETTIVI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, "2EB81829-8236-46AF-886F-45756C8216C1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, "Scaduti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_LIST, "Scaduti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_FORM, 584, 8, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_FORM, "Scaduti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCADUTI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCADUTI, PPQRY_PARAMETRI8, "A.ROWNAMESCADU", "ROWNAMESCADU", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SCADUTI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SCADUTI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI8", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI8, IMDBDef7.PQRY_PARAMETRI8_RS, IMDBDef1.TBL_PARAMETRI622);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SCADUTI, IMDBDef1.FLD_PARAMETRI622_ROWNAMESCADU);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI622");
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
    if (SrcObj == PAN_OBIETTIVI) PAN_OBIETTIVI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_OBIETTIVI) PAN_OBIETTIVI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_OBIETTIVI) PAN_OBIETTIVI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_OBIETTIVI) PAN_OBIETTIVI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_OBIETTIVI) PAN_OBIETTIVI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
