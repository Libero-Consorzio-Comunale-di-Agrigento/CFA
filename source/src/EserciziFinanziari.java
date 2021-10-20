// **********************************************
// Esercizi Finanziari
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EserciziFinanziari extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ESERCIFINANZ_ESERCIZIO = 0;
  private static int PFL_ESERCIFINANZ_FASEBILANCIO = 1;
  private static int PFL_ESERCIFINANZ_PLURIENNALE = 2;
  private static int PFL_ESERCIFINANZ_ABILITABUONI = 3;
  private static int PFL_ESERCIFINANZ_BLOCCODISTIN = 4;
  private static int PFL_ESERCIFINANZ_PRIMESERPREV = 5;
  private static int PFL_ESERCIFINANZ_UTENTEINSERI = 6;
  private static int PFL_ESERCIFINANZ_DATAINSERIME = 7;
  private static int PFL_ESERCIFINANZ_UTENTULTIAGG = 8;
  private static int PFL_ESERCIFINANZ_DATAULTIMAGG = 9;
  private static int PFL_ESERCIFINANZ_PUBBLICABILE = 10;
  private static int PFL_ESERCIFINANZ_T99PROCEBUON = 11;
  private static int PFL_ESERCIFINANZ_ABITANTI = 12;
  private static int PFL_ESERCIFINANZ_SUPERFICITOT = 13;
  private static int PFL_ESERCIFINANZ_SUPERFICIURB = 14;

  private static int PPQRY_ESEFIN1 = 0;

  private static int PPQRY_PROCEDUBUONI = 1;

  private static int PPQRY_T63 = 2;


  IDPanel PAN_ESERCIFINANZ;

  // Definition of Global Variables
  private IDVariant FIRSTIME = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_ESEFIN1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_ESEFIN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_ESEFIN1, 14);
    IMDB.set_TblCode(IMDBDef11.PQRY_ESEFIN1, "PQRY_ESEFIN1");
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_FASE_BILANCIO, "FASE_BILANCIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_FASE_BILANCIO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_ABILITAZIONE_BUONI, "ABILITAZIONE_BUONI");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_ABILITAZIONE_BUONI,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_BLOCCO_DISTINTE_LIQ, "BLOCCO_DISTINTE_LIQ");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_BLOCCO_DISTINTE_LIQ,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_PRIMO_ESERC_PREVENTIVO, "PRIMO_ESERC_PREVENTIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_PRIMO_ESERC_PREVENTIVO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_PUBBLICABILE, "PUBBLICABILE");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_PUBBLICABILE,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_ABITANTI, "ABITANTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_ABITANTI,1,7,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_SUPERFICIE_TOT, "SUPERFICIE_TOT");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_SUPERFICIE_TOT,1,7,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_SUPERFICIE_URB, "SUPERFICIE_URB");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN1,IMDBDef11.PQSL_ESEFIN1_SUPERFICIE_URB,1,7,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_ESEFIN1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EserciziFinanziari(MyWebEntryPoint w, IMDBObj imdb)
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
  public EserciziFinanziari()
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
    FormIdx = MyGlb.FRM_ESERCIFINANZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A545A8B6-30D0-4461-B40D-FC8BAA0577AB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 788;
    DesignHeight = 426;
    set_Caption(new IDVariant("Esercizi Finanziari"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 788;
    Frames[1].Height = 400;
    Frames[1].Caption = "Esercizi Finanziari";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 400;
    PAN_ESERCIFINANZ = new IDPanel(w, this, 1, "PAN_ESERCIFINANZ");
    Frames[1].Content = PAN_ESERCIFINANZ;
    PAN_ESERCIFINANZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESERCIFINANZ.VS = MainFrm.VisualStyleList;
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 788-MyGlb.PAN_OFFS_X, 400-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C98B73AD-9302-44D0-98EB-C8BCF6C406A0");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 788, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESERCIFINANZ.InitStatus = 2;
    PAN_ESERCIFINANZ_Init();
    PAN_ESERCIFINANZ_InitFields();
    PAN_ESERCIFINANZ_InitQueries();
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
      PAN_ESERCIFINANZ.UpdatePanel(MainFrm);
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
    return (obj instanceof EserciziFinanziari);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EserciziFinanziari.class.getName() : (Glb.ClassWithPackage(EserciziFinanziari.class) ? EserciziFinanziari.class.getName().substring(EserciziFinanziari.class.getPackage().getName().length() + 1) : EserciziFinanziari.class.getName()));
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
      set_Caption((new IDVariant("Esercizi Finanziari")));
      PAN_ESERCIFINANZ.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EserciziFinanziari", "LoadEvent", _e);
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
      FIRSTIME = (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EserciziFinanziari", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Esercizi Finanziari After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ESERCIFINANZ_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Esercizi Finanziari After Find Event Body
      // Procedure Body
      // 
      v_COUNT = (new IDVariant(1));
      C2 = PAN_ESERCIFINANZ.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_ESERCIFINANZ.GotoFirst();
      while (!PAN_ESERCIFINANZ.RSEOF())
      {
        if (C2.Get("ESERCIZIO").equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          PAN_ESERCIFINANZ.set_ActualPosition(true, new IDVariant(v_COUNT).intValue());
        }
        v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
        PAN_ESERCIFINANZ.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EserciziFinanziari", "EserciziFinanziariAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Esercizi Finanziari On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ESERCIFINANZ_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esercizi Finanziari On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.ESEFINPD(IMDB.Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_ESERCIZIO, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          Cancel.set((new IDVariant(-1)));
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EserciziFinanziari", "EserciziFinanziariOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Esercizi Finanziari On Database Error Event
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
  private void PAN_ESERCIFINANZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ESERCIFINANZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Esercizi Finanziari On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EserciziFinanziari", "EserciziFinanziariOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Esercizi Finanziari On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESERCIFINANZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESERCIFINANZ);
      // 
      // Esercizi Finanziari On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_ESERCIFINANZ.IsNewRow()))
      {
        PAN_ESERCIFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ESERCIFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if ((new IDVariant(PAN_ESERCIFINANZ.FieldText(PFL_ESERCIFINANZ_T99PROCEBUON))).equals((new IDVariant("SI")), true))
      {
        PAN_ESERCIFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESERCIFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ESERCIFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESERCIFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EserciziFinanziari", "EserciziFinanziariOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Esercizi Finanziari On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ESERCIFINANZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esercizi Finanziari On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        if (FIRSTIME.equals((new IDVariant(0)), true))
        {
          FIRSTIME = (new IDVariant(1));
          IMDB.set_Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_FASE_BILANCIO, 0, (new IDVariant(0)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_DATA_INSERIMENTO, 0, IDL.Today());
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EserciziFinanziari", "EserciziFinanziariOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Esercizi Finanziari After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_ESERCIFINANZ_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esercizi Finanziari After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        MainFrm.FASEBILANCIO = MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        MainFrm.SettaMainCaption();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EserciziFinanziari", "EserciziFinanziariAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Esercizi Finanziari Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ESERCIFINANZ_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esercizi Finanziari Before Insert Body
      // Corpo Procedura
      // 
      IDVariant v_VABITANTI = null;
      v_VABITANTI = (new IDVariant());
      IDVariant v_VSUPERFICTOT = null;
      v_VSUPERFICTOT = (new IDVariant());
      IDVariant v_VSUPERFICURB = null;
      v_VSUPERFICURB = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ABITANTI as ESEFINABITAN, ");
      SQL.append("  A.SUPERFICIE_TOT as ESEFISUPETOT, ");
      SQL.append("  A.SUPERFICIE_URB as ESEFISUPEURB ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VABITANTI = QV.Get("ESEFINABITAN", IDVariant.INTEGER) ;
        v_VSUPERFICTOT = QV.Get("ESEFISUPETOT", IDVariant.INTEGER) ;
        v_VSUPERFICURB = QV.Get("ESEFISUPEURB", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_ABITANTI, 0, new IDVariant(v_VABITANTI));
      IMDB.set_Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_SUPERFICIE_TOT, 0, new IDVariant(v_VSUPERFICTOT));
      IMDB.set_Value(IMDBDef11.PQRY_ESEFIN1, IMDBDef11.PQSL_ESEFIN1_SUPERFICIE_URB, 0, new IDVariant(v_VSUPERFICURB));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EserciziFinanziari", "EserciziFinanziariBeforeInsert", _e);
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
  private void PAN_ESERCIFINANZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESERCIFINANZ, Cancel);
    // Stub
  }

  private void PAN_ESERCIFINANZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ESERCIFINANZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ESERCIFINANZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ESERCIFINANZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESERCIFINANZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESERCIFINANZ_Init()
  {

    PAN_ESERCIFINANZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESERCIFINANZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESERCIFINANZ.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, "1D1FB53E-E88C-4F4D-A92C-07BA4BEC9ADD");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, "Esercizio");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, "286B1A03-D20D-43A0-A5CD-42F271A06C40");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, "Fase Bilancio");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, "F045C51C-8197-485C-9585-270BDD3293F9");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, "Pluriennale");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, MyGlb.VIS_CHECKSTYLE);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, "98D87AB8-AB3D-4253-B397-6F78510FD756");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, "Abilitazione Buoni");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, MyGlb.VIS_CHECKSTYLE);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, "66C5A1ED-2703-4B07-9308-FD8CAC119E54");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, "Blocco Distinte");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, MyGlb.VIS_CHECKSTYLE);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, "38C98B0E-534D-49AD-A291-BA401D3EBAD9");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, "Primo Esercizio Preventivo");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, MyGlb.VIS_CHECKSTYLE);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, "BF7BDDF2-200C-4AE1-9D6B-B110ACD86A90");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, "6D76BCEF-F32E-4F9F-B233-B8E14B24540C");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, "DATA INSERIMENTO");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, "4C5C90CA-BBCC-446A-8B53-FE99C0B478E4");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, "3284EF42-70E7-4984-8AED-6522E8268C3E");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, "2D515DD9-9AFF-4C86-B37E-696417A47747");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, "Pubblicabile");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, "F575C7C5-B303-447E-A6EB-D6E7967CC5A1");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, "T99 PROCEDURA BUONI");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, MyGlb.VIS_LOOKUPFIELDS);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, "7ED06C54-87D0-4224-BE73-940C9054D7DA");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, "ABITANTI");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, MyGlb.VIS_NORMFIELPADR);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, "011605E1-15C6-42ED-8717-95665B69AC01");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, "SUPERFICIE TOT");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, MyGlb.VIS_NORMFIELPADR);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, "8087060C-5CD2-4ED0-B13C-BA2A52010C47");
    PAN_ESERCIFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, "SUPERFICIE URB");
    PAN_ESERCIFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, "");
    PAN_ESERCIFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, MyGlb.VIS_NORMFIELPADR);
    PAN_ESERCIFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ESERCIFINANZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_ESERCIZIO, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_ESERCIZIO, PPQRY_ESEFIN1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, MyGlb.PANEL_LIST, 64, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, MyGlb.PANEL_LIST, 84);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, MyGlb.PANEL_LIST, "Fase Bilancio");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, MyGlb.PANEL_FORM, 4, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, MyGlb.PANEL_FORM, 84);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_FASEBILANCIO, MyGlb.PANEL_FORM, "Fase Bilancio");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_FASEBILANCIO, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_FASEBILANCIO, PPQRY_ESEFIN1, "A.FASE_BILANCIO", "FASE_BILANCIO", 1, 2, 0, -13997);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, MyGlb.PANEL_LIST, 256, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, MyGlb.PANEL_LIST, 32);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, MyGlb.PANEL_LIST, "Pluriennale");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, MyGlb.PANEL_FORM, 4, 52, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, MyGlb.PANEL_FORM, 32);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PLURIENNALE, MyGlb.PANEL_FORM, "Plur.");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_PLURIENNALE, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_PLURIENNALE, PPQRY_ESEFIN1, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_PLURIENNALE, (new IDVariant("P")), "P", "", "", -1);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_PLURIENNALE, (new IDVariant()), "Null", "", "", -1);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, MyGlb.PANEL_LIST, 328, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, MyGlb.PANEL_LIST, 116);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, MyGlb.PANEL_LIST, "Abilitazione Buoni");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, MyGlb.PANEL_FORM, 4, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, MyGlb.PANEL_FORM, 116);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABILITABUONI, MyGlb.PANEL_FORM, "Abilitazione Buoni");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_ABILITABUONI, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_ABILITABUONI, PPQRY_ESEFIN1, "A.ABILITAZIONE_BUONI", "ABILITAZIONE_BUONI", 5, 2, 0, -13997);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_ABILITABUONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_ABILITABUONI, (new IDVariant()), "Null", "", "", -1);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, MyGlb.PANEL_LIST, 420, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, MyGlb.PANEL_LIST, 120);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, MyGlb.PANEL_LIST, "Blocco Distinte");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, MyGlb.PANEL_FORM, 120);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_BLOCCODISTIN, MyGlb.PANEL_FORM, "Blocco Distinte");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_BLOCCODISTIN, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_BLOCCODISTIN, PPQRY_ESEFIN1, "A.BLOCCO_DISTINTE_LIQ", "BLOCCO_DISTINTE_LIQ", 5, 2, 0, -13997);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_BLOCCODISTIN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_BLOCCODISTIN, (new IDVariant()), "Null", "", "", -1);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, MyGlb.PANEL_LIST, 500, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, MyGlb.PANEL_LIST, 156);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, MyGlb.PANEL_LIST, "Primo Esercizio Preventivo");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, MyGlb.PANEL_FORM, 156);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PRIMESERPREV, MyGlb.PANEL_FORM, "Primo Esercizio Preventivo");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_PRIMESERPREV, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_PRIMESERPREV, PPQRY_ESEFIN1, "A.PRIMO_ESERC_PREVENTIVO", "PRIMO_ESERC_PREVENTIVO", 5, 2, 0, -13997);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_PRIMESERPREV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_PRIMESERPREV, (new IDVariant()), "Null", "", "", -1);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, MyGlb.PANEL_LIST, 16, 248, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 148, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_UTENTEINSERI, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_UTENTEINSERI, PPQRY_ESEFIN1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, MyGlb.PANEL_LIST, 264, 248, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, MyGlb.PANEL_FORM, 4, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_DATAINSERIME, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_DATAINSERIME, PPQRY_ESEFIN1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 24, 276, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 196, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_UTENTULTIAGG, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_UTENTULTIAGG, PPQRY_ESEFIN1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 272, 276, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_DATAULTIMAGG, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_DATAULTIMAGG, PPQRY_ESEFIN1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, MyGlb.PANEL_LIST, 596, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, MyGlb.PANEL_LIST, 88);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, MyGlb.PANEL_LIST, "Pubblicabile");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, MyGlb.PANEL_FORM, 4, 292, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, MyGlb.PANEL_FORM, 88);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_PUBBLICABILE, MyGlb.PANEL_FORM, "Pubblicabile");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_PUBBLICABILE, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_PUBBLICABILE, PPQRY_ESEFIN1, "A.PUBBLICABILE", "PUBBLICABILE", 5, 1, 0, -13997);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_PUBBLICABILE, (new IDVariant("P")), "Preventivo", "", "", -1);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_PUBBLICABILE, (new IDVariant("C")), "Consuntivo", "", "", -1);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, MyGlb.PANEL_LIST, 684, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, MyGlb.PANEL_LIST, 128);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, MyGlb.PANEL_LIST, "T99 PROCEDURA BUONI");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, MyGlb.PANEL_FORM, 4, 244, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, MyGlb.PANEL_FORM, 128);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_T99PROCEBUON, MyGlb.PANEL_FORM, "T99 PROC. BUONI");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_T99PROCEBUON, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_T99PROCEBUON, PPQRY_PROCEDUBUONI, "B.PROCEDURA_BUONI", "ESET99PROBUO", 5, 2, 0, -13997);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_T99PROCEBUON, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ESERCIFINANZ.SetValueListItem(PFL_ESERCIFINANZ_T99PROCEBUON, (new IDVariant()), "Null", "", "", -1);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, MyGlb.PANEL_LIST, 64);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, MyGlb.PANEL_LIST, "ABITANTI");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, MyGlb.PANEL_FORM, 4, 316, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, MyGlb.PANEL_FORM, 64);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_ABITANTI, MyGlb.PANEL_FORM, "ABITANTI");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_ABITANTI, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_ABITANTI, PPQRY_ESEFIN1, "A.ABITANTI", "ABITANTI", 1, 7, 0, -13997);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, MyGlb.PANEL_LIST, 100);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, MyGlb.PANEL_LIST, "SUPERFICIE TOT");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, MyGlb.PANEL_FORM, 4, 340, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, MyGlb.PANEL_FORM, 100);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICITOT, MyGlb.PANEL_FORM, "SUPERFICIE TOT");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_SUPERFICITOT, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_SUPERFICITOT, PPQRY_ESEFIN1, "A.SUPERFICIE_TOT", "SUPERFICIE_TOT", 1, 7, 0, -13997);
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, MyGlb.PANEL_LIST, 100);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, MyGlb.PANEL_LIST, "SUPERFICIE URB");
    PAN_ESERCIFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, MyGlb.PANEL_FORM, 4, 364, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, MyGlb.PANEL_FORM, 100);
    PAN_ESERCIFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIFINANZ_SUPERFICIURB, MyGlb.PANEL_FORM, "SUPERFICIE URB");
    PAN_ESERCIFINANZ.SetFieldPage(PFL_ESERCIFINANZ_SUPERFICIURB, -1, -1);
    PAN_ESERCIFINANZ.SetFieldPanel(PFL_ESERCIFINANZ_SUPERFICIURB, PPQRY_ESEFIN1, "A.SUPERFICIE_URB", "SUPERFICIE_URB", 1, 7, 0, -13997);
  }

  private void PAN_ESERCIFINANZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESERCIFINANZ.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.PROCEDURA_BUONI as ESET99PROBUO ");
    SQL.append("from ");
    SQL.append("  ESEFIN A, ");
    SQL.append("  T99 B ");
    SQL.append("where (B.ESERCIZIO(+) = A.ESERCIZIO) ");
    SQL.append("and   (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    PAN_ESERCIFINANZ.SetQuery(PPQRY_PROCEDUBUONI, 0, SQL, -1, "");
    PAN_ESERCIFINANZ.SetQueryDB(PPQRY_PROCEDUBUONI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESERCIFINANZ.SetMasterTable(PPQRY_PROCEDUBUONI, "ESEFIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T63CODICE, ");
    SQL.append("  A.DESCRIZIONE as T63DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T63 A ");
    SQL.append("where (A.CODICE = ~~FASE_BILANCIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ESERCIFINANZ.SetQuery(PPQRY_T63, 0, SQL, PFL_ESERCIFINANZ_FASEBILANCIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T63CODICE, ");
    SQL.append("  A.DESCRIZIONE as T63DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T63 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ESERCIFINANZ.SetQuery(PPQRY_T63, 1, SQL, PFL_ESERCIFINANZ_FASEBILANCIO, "");
    PAN_ESERCIFINANZ.SetQueryDB(PPQRY_T63, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESERCIFINANZ.SetIMDB(IMDB, "PQRY_ESEFIN1", true);
    PAN_ESERCIFINANZ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.FASE_BILANCIO as FASE_BILANCIO, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.ABILITAZIONE_BUONI as ABILITAZIONE_BUONI, ");
    SQL.append("  A.BLOCCO_DISTINTE_LIQ as BLOCCO_DISTINTE_LIQ, ");
    SQL.append("  A.PRIMO_ESERC_PREVENTIVO as PRIMO_ESERC_PREVENTIVO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.PUBBLICABILE as PUBBLICABILE, ");
    SQL.append("  A.ABITANTI as ABITANTI, ");
    SQL.append("  A.SUPERFICIE_TOT as SUPERFICIE_TOT, ");
    SQL.append("  A.SUPERFICIE_URB as SUPERFICIE_URB ");
    PAN_ESERCIFINANZ.SetQuery(PPQRY_ESEFIN1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    PAN_ESERCIFINANZ.SetQuery(PPQRY_ESEFIN1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESERCIFINANZ.SetQuery(PPQRY_ESEFIN1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESERCIFINANZ.SetQuery(PPQRY_ESEFIN1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESERCIFINANZ.SetQuery(PPQRY_ESEFIN1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO desc ");
    PAN_ESERCIFINANZ.SetQuery(PPQRY_ESEFIN1, 5, SQL, -1, "");
    PAN_ESERCIFINANZ.SetQueryDB(PPQRY_ESEFIN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESERCIFINANZ.SetMasterTable(0, "ESEFIN");
    PAN_ESERCIFINANZ.AddToSortList(PFL_ESERCIFINANZ_ESERCIZIO, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESERCIFINANZ.Status() == 2)
    {
      int oldListQBE = PAN_ESERCIFINANZ.iUseListQBE;
      PAN_ESERCIFINANZ.iUseListQBE = 0;
      PAN_ESERCIFINANZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESERCIFINANZ.PanelCommand(Glb.PCM_FIND);
      PAN_ESERCIFINANZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESERCIFINANZ) PAN_ESERCIFINANZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESERCIFINANZ) PAN_ESERCIFINANZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESERCIFINANZ) PAN_ESERCIFINANZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESERCIFINANZ) PAN_ESERCIFINANZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESERCIFINANZ) PAN_ESERCIFINANZ_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESERCIFINANZ) PAN_ESERCIFINANZ_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_ESERCIFINANZ) PAN_ESERCIFINANZ_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_ESERCIFINANZ) PAN_ESERCIFINANZ_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ESERCIFINANZ) PAN_ESERCIFINANZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
