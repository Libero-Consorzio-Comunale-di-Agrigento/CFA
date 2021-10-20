// **********************************************
// Quadro Riassuntivo Della Gestione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class QuadroRiassuntivoDellaGestione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_QUARIADELGES_RISULTATO = 0;

  private static int PFL_QUARIADELGES_ESERCIZIO = 0;
  private static int PFL_QUARIADELGES_PAPEAZENRA3D = 1;
  private static int PFL_QUARIADELGES_DIGESTIONE = 2;
  private static int PFL_QUARIADELGES_DIAMMINISTRA = 3;
  private static int PFL_QUARIADELGES_VINCOLATI = 4;
  private static int PFL_QUARIADELGES_VINCOLATIAMM = 5;
  private static int PFL_QUARIADELGES_FINSPESCCAPI = 6;
  private static int PFL_QUARIADELGES_CAPITALEAMM = 7;
  private static int PFL_QUARIADELGES_AMMORATAMENT = 8;
  private static int PFL_QUARIADELGES_AMMORTAMEAMM = 9;
  private static int PFL_QUARIADELGES_NONVINCOLATI = 10;
  private static int PFL_QUARIADELGES_NONVINCOLAMM = 11;
  private static int PFL_QUARIADELGES_ELABORA = 12;

  private static int PPQRY_WRKQGRS = 0;


  IDPanel PAN_QUARIADELGES;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_WRKQGRS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_WRKQGRS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_WRKQGRS, 10);
    IMDB.set_TblCode(IMDBDef17.PQRY_WRKQGRS, "PQRY_WRKQGRS");
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_PAGAMENTI, "PAGAMENTI");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_PAGAMENTI,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_VINCOLATI_GES, "VINCOLATI_GES");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_VINCOLATI_GES,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_CAPITALE_GES, "CAPITALE_GES");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_CAPITALE_GES,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_AMMORTAMENTO_GES, "AMMORTAMENTO_GES");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_AMMORTAMENTO_GES,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_NON_VINCOLATI_GES, "NON_VINCOLATI_GES");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_NON_VINCOLATI_GES,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_VINCOLATI_AMM, "VINCOLATI_AMM");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_VINCOLATI_AMM,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_CAPITALE_AMM, "CAPITALE_AMM");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_CAPITALE_AMM,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_AMMORTAMENTO_AMM, "AMMORTAMENTO_AMM");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_AMMORTAMENTO_AMM,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_NON_VINCOLATI_AMM, "NON_VINCOLATI_AMM");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKQGRS,IMDBDef17.PQSL_WRKQGRS_NON_VINCOLATI_AMM,3,14,2);
    IMDB.TblAddNew(IMDBDef17.PQRY_WRKQGRS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public QuadroRiassuntivoDellaGestione(MyWebEntryPoint w, IMDBObj imdb)
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
  public QuadroRiassuntivoDellaGestione()
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
    FormIdx = MyGlb.FRM_QUARIADELGES;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1E55D858-261C-4F7C-8B79-F018DFA224F6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 480;
    DesignHeight = 298;
    set_Caption(new IDVariant("Quadro Riassuntivo della Gestione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 480;
    Frames[1].Height = 272;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Quadro Riassuntivo Della Gestione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 272;
    PAN_QUARIADELGES = new IDPanel(w, this, 1, "PAN_QUARIADELGES");
    Frames[1].Content = PAN_QUARIADELGES;
    PAN_QUARIADELGES.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUARIADELGES.VS = MainFrm.VisualStyleList;
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 480-MyGlb.PAN_OFFS_X, 272-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4D206B64-F345-4111-9C52-4960EEA3C2FD");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 880, 256, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUARIADELGES.InitStatus = 2;
    PAN_QUARIADELGES_Init();
    PAN_QUARIADELGES_InitFields();
    PAN_QUARIADELGES_InitQueries();
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
      PAN_QUARIADELGES.UpdatePanel(MainFrm);
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
    return (obj instanceof QuadroRiassuntivoDellaGestione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? QuadroRiassuntivoDellaGestione.class.getName() : (Glb.ClassWithPackage(QuadroRiassuntivoDellaGestione.class) ? QuadroRiassuntivoDellaGestione.class.getName().substring(QuadroRiassuntivoDellaGestione.class.getPackage().getName().length() + 1) : QuadroRiassuntivoDellaGestione.class.getName()));
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
      IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
      v_PAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
      v_PAR2 = (new IDVariant("PAGAMENTI"));
      IDVariant v_PAR3 = null;
      v_PAR3 = (new IDVariant("VINCOLATI_COMP"));
      IDVariant v_PAR4 = null;
      v_PAR4 = (new IDVariant("CAPITALE_COMP"));
      IDVariant v_PAR5 = null;
      v_PAR5 = (new IDVariant("AMMORTAMENTO_COMP"));
      IDVariant v_PAR6 = null;
      v_PAR6 = (new IDVariant("NO_VINCOLATI_COMP"));
      IDVariant v_PAR7 = new IDVariant(0,IDVariant.STRING);
      v_PAR7 = (new IDVariant("VINCOLATI_AMM"));
      IDVariant v_PAR8 = new IDVariant(0,IDVariant.STRING);
      v_PAR8 = (new IDVariant("CAPITALE_AMM"));
      IDVariant v_PAR9 = new IDVariant(0,IDVariant.STRING);
      v_PAR9 = (new IDVariant("AMMORTAMENTO_AMM"));
      IDVariant v_PAR10 = new IDVariant(0,IDVariant.STRING);
      v_PAR10 = (new IDVariant("NO_VINCOLATI_AMM"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Quadro_Riassuntivo_Gestione"));
      MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_PAGAMENTI, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_PAR3, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_VINCOLATI_GES, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_PAR4, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_CAPITALE_GES, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_PAR5, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_AMMORTAMENTO_GES, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_PAR6, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_NON_VINCOLATI_GES, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_PAR7, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_VINCOLATI_AMM, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_PAR8, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_CAPITALE_AMM, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_PAR9, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_AMMORTAMENTO_AMM, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_PAR10, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_NON_VINCOLATI_AMM, 0),(new IDVariant(0)))));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoDellaGestione", "Elabora", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoDellaGestione", "LoadEvent", _e);
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
      PAN_QUARIADELGES.PanelCommand(Glb.PCM_CANCEL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoDellaGestione", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Quadro Riassuntivo Della Gestione After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_QUARIADELGES_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadro Riassuntivo Della Gestione After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_QUARIADELGES.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_QUARIADELGES.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoDellaGestione", "QuadroRiassuntivoDellaGestioneAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Quadro Riassuntivo Della Gestione On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_QUARIADELGES_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_QUARIADELGES, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Quadro Riassuntivo Della Gestione On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoDellaGestione", "QuadroRiassuntivoDellaGestioneOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Quadro Riassuntivo Della Gestione On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_QUARIADELGES_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadro Riassuntivo Della Gestione On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef17.PQRY_WRKQGRS, IMDBDef17.PQSL_WRKQGRS_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoDellaGestione", "QuadroRiassuntivoDellaGestioneOnUpdatingRowEvent", _e);
    }
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUARIADELGES_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUARIADELGES, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUARIADELGES_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_QUARIADELGES);
    // Stub
  }

  private void PAN_QUARIADELGES_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_QUARIADELGES_ELABORA)
    {
      this.IdxPanelActived = this.PAN_QUARIADELGES.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_QUARIADELGES_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_QUARIADELGES_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_QUARIADELGES_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_QUARIADELGES_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_QUARIADELGES_Init()
  {

    PAN_QUARIADELGES.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUARIADELGES.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, "325FEDE9-B495-4A75-9980-1793DC8BE7D8");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, "Risultato");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, MyGlb.VIS_GROUPSTYLE);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, MyGlb.PANEL_LIST, 80, -9999, 800, 16, 0, 0);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, MyGlb.PANEL_FORM, 8, 43, 436, 145, 0, 0);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, 0, 51);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, 1, 13);
    PAN_QUARIADELGES.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, 0, 4);
    PAN_QUARIADELGES.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, 1, 4);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_GROUP, GRP_QUARIADELGES_RISULTATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_QUARIADELGES.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, "07A383F3-3811-4ECB-866C-9B85B3988C7E");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, "ESERCIZIO");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, "26A22723-CE57-44C6-82C5-D2608872E889");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, "Pagamenti per azioni esecutive non realizzate al 31 Dicembre");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, MyGlb.VIS_NORMALFIELDS);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, "BF3FAF0C-2064-4732-8AF1-6B6E83849296");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, "Di gestione");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, MyGlb.VIS_VUOTNORMCENT);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, "87E9D1BB-203E-48A9-9887-1DB6A76B3B25");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, "Di Amministrazione");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, MyGlb.VIS_VUOTNORMCENT);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, "2AFC7CFF-78FB-4D00-B2A6-96FC99854578");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, "Vincolati");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, MyGlb.VIS_NORMALFIELDS);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, "1EC436C2-20D0-41F1-9DD3-824316C2DDAD");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, "VINCOLATI AMM");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, MyGlb.VIS_NORMALFIELDS);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, "A6B7324B-0F6E-4A1B-AEE2-75C51F1C0B62");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, "Fin. Spese C./Capitale");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, MyGlb.VIS_NORMALFIELDS);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, "35749AEB-C9BC-4C49-AFE2-7A395BA77424");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, "CAPITALE AMM");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, MyGlb.VIS_NORMALFIELDS);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, "F4C1DA02-2B1D-42F4-A7B6-9BE903B6C6B6");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, "Ammoratamento");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, "218C5919-708C-426B-B679-3E5BBE0D00AD");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, "AMMORTAMENTO AMM");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, MyGlb.VIS_NORMALFIELDS);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, "FACEB9FC-AC11-477B-A188-BC838D16CB76");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, "Non Vincolati");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, MyGlb.VIS_NORMALFIELDS);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, "C53DCAEA-CC54-41EA-993C-528DDCFFBA33");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, "NON VINCOLATI AMM");
    PAN_QUARIADELGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, "");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, MyGlb.VIS_NORMALFIELDS);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIADELGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, "CCB777C5-5F27-4A9B-B21E-933170093D83");
    PAN_QUARIADELGES.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, "Elabora");
    PAN_QUARIADELGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_QUARIADELGES.SetImage(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, 0, "button1.gif", false);
    PAN_QUARIADELGES.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_QUARIADELGES_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_ESERCIZIO, -1, -1);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_ESERCIZIO, PPQRY_WRKQGRS, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, MyGlb.PANEL_LIST, 68);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, MyGlb.PANEL_LIST, "Pg. p. az. esc. n. rl. a. 3. Dc.");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, MyGlb.PANEL_FORM, 0, 4, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, MyGlb.PANEL_FORM, 360);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_PAPEAZENRA3D, MyGlb.PANEL_FORM, "Pagamenti per azioni esecutive non realizzate al 31 Dicembre");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_PAPEAZENRA3D, -1, -1);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_PAPEAZENRA3D, PPQRY_WRKQGRS, "A.PAGAMENTI", "PAGAMENTI", 3, 14, 2, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, MyGlb.PANEL_LIST, 140, 52, 72, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, MyGlb.PANEL_LIST, 0);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, MyGlb.PANEL_FORM, 148, 68, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, MyGlb.PANEL_FORM, 0);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIGESTIONE, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_DIGESTIONE, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_DIGESTIONE, -1, "", "DIGESTIONE", 0, 0, 0, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, MyGlb.PANEL_LIST, 292, 48, 76, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, MyGlb.PANEL_LIST, 0);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, MyGlb.PANEL_FORM, 316, 68, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, MyGlb.PANEL_FORM, 0);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_DIAMMINISTRA, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_DIAMMINISTRA, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_DIAMMINISTRA, -1, "", "DIAMMINISTRA", 0, 0, 0, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, MyGlb.PANEL_LIST, 80, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, MyGlb.PANEL_LIST, 84);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, MyGlb.PANEL_LIST, "Vincolati");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, MyGlb.PANEL_FORM, 20, 92, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, MyGlb.PANEL_FORM, 124);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATI, MyGlb.PANEL_FORM, "Vincolati");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_VINCOLATI, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_VINCOLATI, PPQRY_WRKQGRS, "A.VINCOLATI_GES", "VINCOLATI_GES", 3, 14, 2, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, MyGlb.PANEL_LIST, 472, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, MyGlb.PANEL_LIST, 88);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, MyGlb.PANEL_LIST, "VINC. AMM");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, MyGlb.PANEL_FORM, 316, 92, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, MyGlb.PANEL_FORM, 84);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_VINCOLATIAMM, MyGlb.PANEL_FORM, "VINC. AMM");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_VINCOLATIAMM, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_VINCOLATIAMM, PPQRY_WRKQGRS, "A.VINCOLATI_AMM", "VINCOLATI_AMM", 3, 14, 2, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, MyGlb.PANEL_LIST, 164, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, MyGlb.PANEL_LIST, 80);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, MyGlb.PANEL_LIST, "Fin Sp. C Cap.");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, MyGlb.PANEL_FORM, 12, 116, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, MyGlb.PANEL_FORM, 132);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_FINSPESCCAPI, MyGlb.PANEL_FORM, "Fin. Spese C./Capitale");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_FINSPESCCAPI, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_FINSPESCCAPI, PPQRY_WRKQGRS, "A.CAPITALE_GES", "CAPITALE_GES", 3, 14, 2, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, MyGlb.PANEL_LIST, 560, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, MyGlb.PANEL_LIST, 84);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, MyGlb.PANEL_LIST, "CAPIT. AMM");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, MyGlb.PANEL_FORM, 316, 116, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, MyGlb.PANEL_FORM, 84);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_CAPITALEAMM, MyGlb.PANEL_FORM, "CAPIT. AMM");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_CAPITALEAMM, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_CAPITALEAMM, PPQRY_WRKQGRS, "A.CAPITALE_AMM", "CAPITALE_AMM", 3, 14, 2, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, MyGlb.PANEL_LIST, 244, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, MyGlb.PANEL_LIST, 116);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, MyGlb.PANEL_LIST, "Ammoratamento");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, MyGlb.PANEL_FORM, 20, 140, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, MyGlb.PANEL_FORM, 124);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORATAMENT, MyGlb.PANEL_FORM, "Ammoratamento");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_AMMORATAMENT, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_AMMORATAMENT, PPQRY_WRKQGRS, "A.AMMORTAMENTO_GES", "AMMORTAMENTO_GES", 3, 14, 2, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, MyGlb.PANEL_LIST, 644, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, MyGlb.PANEL_LIST, 120);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, MyGlb.PANEL_LIST, "AMMORT. AMM");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, MyGlb.PANEL_FORM, 316, 140, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, MyGlb.PANEL_FORM, 84);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_AMMORTAMEAMM, MyGlb.PANEL_FORM, "AMMOR. AMM");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_AMMORTAMEAMM, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_AMMORTAMEAMM, PPQRY_WRKQGRS, "A.AMMORTAMENTO_AMM", "AMMORTAMENTO_AMM", 3, 14, 2, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, MyGlb.PANEL_LIST, 360, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, MyGlb.PANEL_LIST, 112);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, MyGlb.PANEL_LIST, "Non Vincolati");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, MyGlb.PANEL_FORM, 20, 164, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, MyGlb.PANEL_FORM, 124);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLATI, MyGlb.PANEL_FORM, "Non Vincolati");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_NONVINCOLATI, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_NONVINCOLATI, PPQRY_WRKQGRS, "A.NON_VINCOLATI_GES", "NON_VINCOLATI_GES", 3, 14, 2, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, MyGlb.PANEL_LIST, 764, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, MyGlb.PANEL_LIST, 116);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, MyGlb.PANEL_LIST, "NON VINC. AMM");
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, MyGlb.PANEL_FORM, 316, 164, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, MyGlb.PANEL_FORM, 84);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_NONVINCOLAMM, MyGlb.PANEL_FORM, "NN. VNC. AMM");
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_NONVINCOLAMM, -1, GRP_QUARIADELGES_RISULTATO);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_NONVINCOLAMM, PPQRY_WRKQGRS, "A.NON_VINCOLATI_AMM", "NON_VINCOLATI_AMM", 3, 14, 2, -13997);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, MyGlb.PANEL_LIST, 292, 196, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_QUARIADELGES.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, MyGlb.PANEL_FORM, 364, 208, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIADELGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_QUARIADELGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIADELGES_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_QUARIADELGES.SetFieldPage(PFL_QUARIADELGES_ELABORA, -1, -1);
    PAN_QUARIADELGES.SetFieldPanel(PFL_QUARIADELGES_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_QUARIADELGES_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUARIADELGES.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_QUARIADELGES.SetIMDB(IMDB, "PQRY_WRKQGRS", true);
    PAN_QUARIADELGES.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.PAGAMENTI as PAGAMENTI, ");
    SQL.append("  A.VINCOLATI_GES as VINCOLATI_GES, ");
    SQL.append("  A.CAPITALE_GES as CAPITALE_GES, ");
    SQL.append("  A.AMMORTAMENTO_GES as AMMORTAMENTO_GES, ");
    SQL.append("  A.NON_VINCOLATI_GES as NON_VINCOLATI_GES, ");
    SQL.append("  A.VINCOLATI_AMM as VINCOLATI_AMM, ");
    SQL.append("  A.CAPITALE_AMM as CAPITALE_AMM, ");
    SQL.append("  A.AMMORTAMENTO_AMM as AMMORTAMENTO_AMM, ");
    SQL.append("  A.NON_VINCOLATI_AMM as NON_VINCOLATI_AMM ");
    PAN_QUARIADELGES.SetQuery(PPQRY_WRKQGRS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_QRGE A ");
    PAN_QUARIADELGES.SetQuery(PPQRY_WRKQGRS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_QUARIADELGES.SetQuery(PPQRY_WRKQGRS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUARIADELGES.SetQuery(PPQRY_WRKQGRS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUARIADELGES.SetQuery(PPQRY_WRKQGRS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUARIADELGES.SetQuery(PPQRY_WRKQGRS, 5, SQL, -1, "");
    PAN_QUARIADELGES.SetQueryDB(PPQRY_WRKQGRS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUARIADELGES.SetMasterTable(0, "WRK_QRGE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_QUARIADELGES.Status() == 2)
    {
      int oldListQBE = PAN_QUARIADELGES.iUseListQBE;
      PAN_QUARIADELGES.iUseListQBE = 0;
      PAN_QUARIADELGES.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUARIADELGES.PanelCommand(Glb.PCM_FIND);
      PAN_QUARIADELGES.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_QUARIADELGES) PAN_QUARIADELGES_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUARIADELGES) PAN_QUARIADELGES_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_QUARIADELGES) PAN_QUARIADELGES_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUARIADELGES) PAN_QUARIADELGES_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_QUARIADELGES) PAN_QUARIADELGES_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_QUARIADELGES) PAN_QUARIADELGES_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
