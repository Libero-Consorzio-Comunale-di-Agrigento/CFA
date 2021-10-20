// **********************************************
// Sintesi Di Cassa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SintesiDiCassa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SINTEDICASSA_TIPOVINCOLO = 0;
  private static int PFL_SINTEDICASSA_VINCOLDESCRI = 1;
  private static int PFL_SINTEDICASSA_DATAELABORAZ = 2;
  private static int PFL_SINTEDICASSA_VINCOLSCADUT = 3;
  private static int PFL_SINTEDICASSA_ELABORA = 4;

  private static int PPQRY_PAR25 = 0;

  private static int PPQRY_VINCOLIDESC = 1;


  IDPanel PAN_SINTEDICASSA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR103(IMDB);
    //
    //
    Init_PQRY_PAR25(IMDB);
    Init_PQRY_PAR25_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR103(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR103, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR103, "TBL_PAR103");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR103,IMDBDef6.FLD_PAR103_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR103,IMDBDef6.FLD_PAR103_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR103,IMDBDef6.FLD_PAR103_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR103,IMDBDef6.FLD_PAR103_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR103,IMDBDef6.FLD_PAR103_ROWNAMVINSCA, "ROWNAMVINSCA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR103,IMDBDef6.FLD_PAR103_ROWNAMVINSCA,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR103, 0);
  }

  private static void Init_PQRY_PAR25(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR25, 3);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR25, "PQRY_PAR25");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR25,IMDBDef16.PQSL_PAR25_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR25,IMDBDef16.PQSL_PAR25_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR25,IMDBDef16.PQSL_PAR25_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR25,IMDBDef16.PQSL_PAR25_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR25,IMDBDef16.PQSL_PAR25_ROWNAMVINSCA, "ROWNAMVINSCA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR25,IMDBDef16.PQSL_PAR25_ROWNAMVINSCA,5,2,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR25, 0);
  }

  private static void Init_PQRY_PAR25_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR25_RS, 3);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR25_RS, "PQRY_PAR25_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR25_RS,IMDBDef16.PQSL_PAR25_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR25_RS,IMDBDef16.PQSL_PAR25_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR25_RS,IMDBDef16.PQSL_PAR25_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR25_RS,IMDBDef16.PQSL_PAR25_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR25_RS,IMDBDef16.PQSL_PAR25_ROWNAMVINSCA, "ROWNAMVINSCA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR25_RS,IMDBDef16.PQSL_PAR25_ROWNAMVINSCA,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SintesiDiCassa(MyWebEntryPoint w, IMDBObj imdb)
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
  public SintesiDiCassa()
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
    FormIdx = MyGlb.FRM_SINTEDICASSA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "18A5760E-2979-4187-A627-7F8342F928C5";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 440;
    DesignHeight = 170;
    set_Caption(new IDVariant("Sintesi Di Cassa"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 440;
    Frames[1].Height = 144;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Sintesi Di Cassa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 144;
    PAN_SINTEDICASSA = new IDPanel(w, this, 1, "PAN_SINTEDICASSA");
    Frames[1].Content = PAN_SINTEDICASSA;
    PAN_SINTEDICASSA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SINTEDICASSA.VS = MainFrm.VisualStyleList;
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 440-MyGlb.PAN_OFFS_X, 144-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SINTEDICASSA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "753A246F-7294-4262-9701-DA6BEBC2360F");
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 484, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SINTEDICASSA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SINTEDICASSA.InitStatus = 2;
    PAN_SINTEDICASSA_Init();
    PAN_SINTEDICASSA_InitFields();
    PAN_SINTEDICASSA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR103, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SINTEDICASSA_PAR25();
      }
      PAN_SINTEDICASSA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAVINCOL && flRis && IdxPanelActived == PAN_SINTEDICASSA.FrIndex)
    {
      if (IdxFieldActived ==PFL_SINTEDICASSA_TIPOVINCOLO) {
      }
    }
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
    return (obj instanceof SintesiDiCassa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SintesiDiCassa.class.getName() : (Glb.ClassWithPackage(SintesiDiCassa.class) ? SintesiDiCassa.class.getName().substring(SintesiDiCassa.class.getPackage().getName().length() + 1) : SintesiDiCassa.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      v_NOMEPAR2 = (new IDVariant("TIPO_VINC"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("VINCOLI_SC"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("DATA_ELAB"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Sintesi_di_Cassa"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR25, IMDBDef16.PQSL_PAR25_ROWNAMTIPVIN, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, ((IMDB.Value(IMDBDef16.PQRY_PAR25, IMDBDef16.PQSL_PAR25_ROWNAMVINSCA, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("S"))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR25, IMDBDef16.PQSL_PAR25_ROWNAMDATELA, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SintesiDiCassa", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Vincoli
  // **********************************************************************
  public int ApriVincoli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Vincoli Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAVINCOL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SintesiDiCassa", "ApriVincoli", _e);
      return -1;
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
      IMDB.set_Value(IMDBDef6.TBL_PAR103, IMDBDef6.FLD_PAR103_ROWNAMDATELA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_PAR103, IMDBDef6.FLD_PAR103_ROWNAMVINSCA, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SintesiDiCassa", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAVINCOL)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef16.PQRY_PAR25, IMDBDef16.PQSL_PAR25_ROWNAMTIPVIN, 0, IMDB.Value(IMDBDef7.PQRY_VINCOLI2, IMDBDef7.PQSL_VINCOLI2_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SintesiDiCassa", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PAR103, IMDBDef6.FLD_PAR103_ROWNAMTIPVIN, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SintesiDiCassa", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void SINTEDICASSA_PAR25() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR25_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR103, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR103, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR25_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR25_RS, 0, IMDBDef6.TBL_PAR103, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR25_RS, 0, 0, IMDBDef6.TBL_PAR103, IMDBDef6.FLD_PAR103_ROWNAMTIPVIN, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR25_RS, 1, 0, IMDBDef6.TBL_PAR103, IMDBDef6.FLD_PAR103_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR25_RS, 2, 0, IMDBDef6.TBL_PAR103, IMDBDef6.FLD_PAR103_ROWNAMVINSCA, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR103, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR103, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR103, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR25_RS, 0);
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
  private void PAN_SINTEDICASSA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SINTEDICASSA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SINTEDICASSA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SINTEDICASSA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SINTEDICASSA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SINTEDICASSA);
    // Stub
  }

  private void PAN_SINTEDICASSA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SINTEDICASSA_TIPOVINCOLO)
    {
      this.IdxPanelActived = this.PAN_SINTEDICASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVincoli();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SINTEDICASSA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_SINTEDICASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SINTEDICASSA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SINTEDICASSA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SINTEDICASSA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SINTEDICASSA_Init()
  {

    PAN_SINTEDICASSA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SINTEDICASSA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SINTEDICASSA.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_SINTEDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, "25C42BC4-A838-4556-A4A7-43655176944D");
    PAN_SINTEDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, "Tipo Vincolo");
    PAN_SINTEDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, "");
    PAN_SINTEDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SINTEDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SINTEDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, "2894D15B-6466-4EFD-BC47-35BF56E974E3");
    PAN_SINTEDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, "VINCOLI DESCRIZIONE");
    PAN_SINTEDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, "");
    PAN_SINTEDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_SINTEDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_SINTEDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, "9BA0CFFA-1376-42D2-892E-604F1B5C0BC6");
    PAN_SINTEDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, "Data Elaborazione");
    PAN_SINTEDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, "");
    PAN_SINTEDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_SINTEDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SINTEDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, "5E9213FC-50C8-44C5-B5D0-0618D1B38211");
    PAN_SINTEDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, "Vincoli Scaduti");
    PAN_SINTEDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, "");
    PAN_SINTEDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, MyGlb.VIS_CHECKSTYLE);
    PAN_SINTEDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SINTEDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, "6E94868F-245B-444E-BDB3-D0A41B4EDB59");
    PAN_SINTEDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, "Elabora");
    PAN_SINTEDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_SINTEDICASSA.SetImage(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, 0, "button1.gif", false);
    PAN_SINTEDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_SINTEDICASSA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, MyGlb.PANEL_LIST, 64);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_SINTEDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tp. Vinc.");
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, MyGlb.PANEL_FORM, 12, 12, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_SINTEDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_SINTEDICASSA.SetFieldPage(PFL_SINTEDICASSA_TIPOVINCOLO, -1, -1);
    PAN_SINTEDICASSA.SetFieldPanel(PFL_SINTEDICASSA_TIPOVINCOLO, PPQRY_PAR25, "A.ROWNAMTIPVIN", "ROWNAMTIPVIN", 1, 6, 0, -13997);
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, MyGlb.PANEL_LIST, 120);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_SINTEDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, MyGlb.PANEL_LIST, "VINCOLI DESCRIZIONE");
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, MyGlb.PANEL_FORM, 156, 12, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, MyGlb.PANEL_FORM, 120);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_SINTEDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLDESCRI, MyGlb.PANEL_FORM, "VINC. DESCRIZIONE");
    PAN_SINTEDICASSA.SetFieldPage(PFL_SINTEDICASSA_VINCOLDESCRI, -1, -1);
    PAN_SINTEDICASSA.SetFieldPanel(PFL_SINTEDICASSA_VINCOLDESCRI, PPQRY_VINCOLIDESC, "A.DESCRIZIONE", "ROWNAMVINDES", 5, 50, 0, -13997);
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, MyGlb.PANEL_LIST, 40, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_SINTEDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, MyGlb.PANEL_FORM, 32, 40, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_SINTEDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_SINTEDICASSA.SetFieldPage(PFL_SINTEDICASSA_DATAELABORAZ, -1, -1);
    PAN_SINTEDICASSA.SetFieldPanel(PFL_SINTEDICASSA_DATAELABORAZ, PPQRY_PAR25, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, MyGlb.PANEL_LIST, 184, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, MyGlb.PANEL_LIST, 76);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, MyGlb.PANEL_LIST, 1);
    PAN_SINTEDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, MyGlb.PANEL_LIST, "Vinc. Scad.");
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, MyGlb.PANEL_FORM, 280, 40, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, MyGlb.PANEL_FORM, 92);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, MyGlb.PANEL_FORM, 1);
    PAN_SINTEDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_VINCOLSCADUT, MyGlb.PANEL_FORM, "Vincoli Scaduti");
    PAN_SINTEDICASSA.SetFieldPage(PFL_SINTEDICASSA_VINCOLSCADUT, -1, -1);
    PAN_SINTEDICASSA.SetFieldPanel(PFL_SINTEDICASSA_VINCOLSCADUT, PPQRY_PAR25, "A.ROWNAMVINSCA", "ROWNAMVINSCA", 5, 2, 0, -13997);
    PAN_SINTEDICASSA.SetValueListItem(PFL_SINTEDICASSA_VINCOLSCADUT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SINTEDICASSA.SetValueListItem(PFL_SINTEDICASSA_VINCOLSCADUT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, MyGlb.PANEL_LIST, 204, 76, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_SINTEDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, MyGlb.PANEL_FORM, 316, 80, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SINTEDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_SINTEDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SINTEDICASSA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_SINTEDICASSA.SetFieldPage(PFL_SINTEDICASSA_ELABORA, -1, -1);
    PAN_SINTEDICASSA.SetFieldPanel(PFL_SINTEDICASSA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_SINTEDICASSA_InitQueries()
  {
    StringBuffer SQL;

    PAN_SINTEDICASSA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMVINDES ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVIN~~) ");
    PAN_SINTEDICASSA.SetQuery(PPQRY_VINCOLIDESC, 0, SQL, -1, "");
    PAN_SINTEDICASSA.SetQueryDB(PPQRY_VINCOLIDESC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SINTEDICASSA.SetMasterTable(PPQRY_VINCOLIDESC, "VINCOLI");
    PAN_SINTEDICASSA.SetIMDB(IMDB, "PQRY_PAR25", true);
    PAN_SINTEDICASSA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SINTEDICASSA.SetQueryIMDB(PPQRY_PAR25, IMDBDef16.PQRY_PAR25_RS, IMDBDef6.TBL_PAR103);
    JustLoaded = true;
    PAN_SINTEDICASSA.SetFieldPrimaryIndex(PFL_SINTEDICASSA_TIPOVINCOLO, IMDBDef6.FLD_PAR103_ROWNAMTIPVIN);
    PAN_SINTEDICASSA.SetFieldPrimaryIndex(PFL_SINTEDICASSA_DATAELABORAZ, IMDBDef6.FLD_PAR103_ROWNAMDATELA);
    PAN_SINTEDICASSA.SetFieldPrimaryIndex(PFL_SINTEDICASSA_VINCOLSCADUT, IMDBDef6.FLD_PAR103_ROWNAMVINSCA);
    PAN_SINTEDICASSA.SetMasterTable(0, "PAR103");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SINTEDICASSA.Status() == 2)
    {
      int oldListQBE = PAN_SINTEDICASSA.iUseListQBE;
      PAN_SINTEDICASSA.iUseListQBE = 0;
      PAN_SINTEDICASSA.PanelCommand(Glb.PCM_SEARCH);
      PAN_SINTEDICASSA.PanelCommand(Glb.PCM_FIND);
      PAN_SINTEDICASSA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SINTEDICASSA) PAN_SINTEDICASSA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SINTEDICASSA) PAN_SINTEDICASSA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SINTEDICASSA) PAN_SINTEDICASSA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SINTEDICASSA) PAN_SINTEDICASSA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SINTEDICASSA) PAN_SINTEDICASSA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
