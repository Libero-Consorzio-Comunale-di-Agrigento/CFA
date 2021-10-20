// **********************************************
// Delibera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Delibera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DELIBERA_INSERIMENTO = 0;
  private static int GRP_DELIBERA_AGGIORNAMENT = 1;

  private static int PFL_DELIBERA_SEDE = 0;
  private static int PFL_DELIBERA_NUMERO = 1;
  private static int PFL_DELIBERA_ANNO = 2;
  private static int PFL_DELIBERA_DATADELIBERA = 3;
  private static int PFL_DELIBERA_DESCRIZIONE = 4;
  private static int PFL_DELIBERA_APPROVAZIONN = 5;
  private static int PFL_DELIBERA_DATA1 = 6;
  private static int PFL_DELIBERA_ESECUTIVITA = 7;
  private static int PFL_DELIBERA_ANNOPRO = 8;
  private static int PFL_DELIBERA_NUMEROPRO = 9;
  private static int PFL_DELIBERA_UNITAPRO = 10;
  private static int PFL_DELIBERA_UTENTE1 = 11;
  private static int PFL_DELIBERA_DATA2 = 12;
  private static int PFL_DELIBERA_UTENTE = 13;
  private static int PFL_DELIBERA_DATA = 14;

  private static int PPQRY_DEL7 = 0;

  private static int PPQRY_T11 = 1;
  private static int PPQRY_T10 = 2;
  private static int PPQRY_DUAL1 = 3;
  private static int PPQRY_DUAL = 4;


  IDPanel PAN_DELIBERA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI25(IMDB);
    Init_TBL_OLD(IMDB);
    //
    //
    Init_PQRY_DEL7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI25(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI25, 6);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI25, "TBL_PARAMETRI25");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMESEDE, "ROWNAMESEDE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMESEDE,5,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMENUMER,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ, "ROWNAMUPININ");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ,5,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMECLOSE, "ROWNAMECLOSE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMECLOSE,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMEESECU, "ROWNAMEESECU");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI25,IMDBDef1.FLD_PARAMETRI25_ROWNAMEESECU,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI25, 0);
  }

  private static void Init_TBL_OLD(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_OLD, 1);
    IMDB.set_TblCode(IMDBDef2.TBL_OLD, "TBL_OLD");
    IMDB.set_FldCode(IMDBDef2.TBL_OLD,IMDBDef2.FLD_OLD_ANNODELOLD, "ANNODELOLD");
    IMDB.SetFldParams(IMDBDef2.TBL_OLD,IMDBDef2.FLD_OLD_ANNODELOLD,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_OLD, 0);
  }

  private static void Init_PQRY_DEL7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_DEL7, 16);
    IMDB.set_TblCode(IMDBDef9.PQRY_DEL7, "PQRY_DEL7");
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_TIPO_ESEC, "TIPO_ESEC");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_TIPO_ESEC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_NUMERO_APP, "NUMERO_APP");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_NUMERO_APP,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_DATA_APP, "DATA_APP");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_DATA_APP,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_D_DATA_DEL, "D_DATA_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_D_DATA_DEL,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_D_DATA_APP, "D_DATA_APP");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_D_DATA_APP,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_ANNO_PRO, "ANNO_PRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_ANNO_PRO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_NUMERO_PRO, "NUMERO_PRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_NUMERO_PRO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_UNITA_PRO, "UNITA_PRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_UNITA_PRO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL7,IMDBDef9.PQSL_DEL7_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_DEL7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Delibera(MyWebEntryPoint w, IMDBObj imdb)
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
  public Delibera()
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
    FormIdx = MyGlb.FRM_DELIBERA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B5731E70-E25F-4940-812F-FC601B03F342";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 676;
    DesignHeight = 378;
    set_Caption(new IDVariant("Delibera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 676;
    Frames[1].Height = 352;
    Frames[1].Caption = "Delibera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_DELIBERA = new IDPanel(w, this, 1, "PAN_DELIBERA");
    Frames[1].Content = PAN_DELIBERA;
    PAN_DELIBERA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DELIBERA.VS = MainFrm.VisualStyleList;
    PAN_DELIBERA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BB7A2248-32E6-4E86-A873-2089ADCDDD8E");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 956, 268, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DELIBERA.InitStatus = 2;
    PAN_DELIBERA_Init();
    PAN_DELIBERA_InitFields();
    PAN_DELIBERA_InitQueries();
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
      PAN_DELIBERA.UpdatePanel(MainFrm);
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
    return (obj instanceof Delibera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Delibera.class.getName() : (Glb.ClassWithPackage(Delibera.class) ? Delibera.class.getName().substring(Delibera.class.getPackage().getName().length() + 1) : Delibera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Delibera On Database Error Event
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
  private void PAN_DELIBERA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_DELIBERA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Delibera On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibera", "DeliberaOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Delibera After Update Event
  // Evento notificato dopo il salvataggio sul database
  // di una riga modificata.
  // **********************************************************************
  private void PAN_DELIBERA_AfterUpdate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Delibera After Update Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_DELIBERA.Status()).equals((new IDVariant(2)), true) && IMDB.Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMECLOSE, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibera", "DeliberaAfterUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Delibera On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_DELIBERA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Delibera On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibera", "DeliberaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Delibera After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DELIBERA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Delibera After Find Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_OLD, IMDBDef2.FLD_OLD_ANNODELOLD, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibera", "DeliberaAfterFindEvent", _e);
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
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ, 0).equals((new IDVariant("Ins")), true))
      {
        PAN_DELIBERA.PanelCommand(Glb.PCM_INSERT);
        IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0, IMDB.Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMEANNO, 0));
        IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0, IMDB.Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMENUMER, 0));
        IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0, IMDB.Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMESEDE, 0));
        IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_TIPO_ESEC, 0, IMDB.Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMEESECU, 0));
        PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_SEDE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        if (IMDB.Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ, 0).equals((new IDVariant("Upd")), true))
        {
          PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_SEDE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_NUMERO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_ANNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          DisabilitaCampi();
          MainFrm.Nasconditoolbar(PAN_DELIBERA);
        }
      }
      PAN_DELIBERA.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DELIBERA.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibera", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMESEDE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMEANNO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMENUMER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_OLD, IMDBDef2.FLD_OLD_ANNODELOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAAGGDAFUO, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibera", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Delibera Sede Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_DELIBERA_SEDE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Delibera Sede Validate Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibera", "DeliberaSedeValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Delibera Anno Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_DELIBERA_ANNO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Delibera Anno Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0).compareTo(IMDB.Value(IMDBDef2.TBL_OLD, IMDBDef2.FLD_OLD_ANNODELOLD, 0), true)!=0)
      {
        if (IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0).compareTo((new IDVariant(1900)), true)<0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Anno Delibera non ammesso!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0, IMDB.Value(IMDBDef2.TBL_OLD, IMDBDef2.FLD_OLD_ANNODELOLD, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef2.TBL_OLD, IMDBDef2.FLD_OLD_ANNODELOLD, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibera", "DeliberaAnnoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Disabilita Campi
  // **********************************************************************
  public int DisabilitaCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Campi Body
      // Procedure Body
      // 
      PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_ANNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_NUMERO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_SEDE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DELIBERA.SetFlags (Glb.OBJ_FIELD, PFL_DELIBERA_DATA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibera", "DisabilitaCampi", _e);
      return -1;
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
  private void PAN_DELIBERA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DELIBERA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DELIBERA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DELIBERA);
    // Stub
  }

  private void PAN_DELIBERA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DELIBERA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DELIBERA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_DELIBERA_SEDE)
      {
        PFL_DELIBERA_SEDE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_DELIBERA_ANNO)
      {
        PFL_DELIBERA_ANNO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_DELIBERA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DELIBERA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DELIBERA_Init()
  {

    PAN_DELIBERA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DELIBERA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, "24DE0BE6-D09E-4FF9-B207-768546ACF37B");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, "Inserimento");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, MyGlb.PANEL_FORM, 36, 219, 280, 49, 0, 0);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 0, 70);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 1, 13);
    PAN_DELIBERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 0, 4);
    PAN_DELIBERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 1, 4);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_GROUP, GRP_DELIBERA_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, "C4A52512-B2DD-4961-A0E5-EB23B1B3A06C");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, "Aggiornamento");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, MyGlb.PANEL_FORM, 348, 219, 284, 49, 0, 0);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 0, 88);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 1, 13);
    PAN_DELIBERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 0, 4);
    PAN_DELIBERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 1, 4);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_GROUP, GRP_DELIBERA_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DELIBERA.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, "7ED5DB9B-C040-4E8B-9C56-315BE79DE66C");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, "Sede");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, "DB0D93C9-E490-489C-ABC1-AA576775A558");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, "Numero");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, "A922E327-B279-4075-AAA7-E1BC79399BB4");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, "Anno");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, "60808E20-8C2D-49B3-B564-6929CEAD1112");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, "Data Delibera");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, "Data Delibera");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, "5F85C914-6CD4-4B24-AE6D-3867867BA6DB");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, "Descrizione");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, "5D1333FF-0B50-4CD2-9652-D512E2C691E4");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, "Approvazione N.");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, "F6226D61-B7A1-434F-A9F5-4DBB38FDFB77");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, "Data");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, "59053E4E-05B1-45B8-AB3F-F4A260BA3CB7");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, "Esecutività");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, "FB54EDE0-CB66-44F8-9609-35D6091A8268");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, "ANNO PRO");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, "4BF2FB42-AA19-46B4-80B6-69366B9D8B73");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, "NUMERO PRO");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, "EA2BFE59-ADC4-46E9-9FA9-6921740E45E1");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, "UNITA PRO");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, "F8DC6A9E-AC6D-4144-9CCA-73F319BFEC2B");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, "Utente");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, "1F876076-C729-4465-AD72-8BB2289B64B7");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, "Data ");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, "69B7B16C-D83C-47B5-BE97-BCCD09AFD727");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, "Utente  ");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, "C003FACE-3CB2-4A34-A6B3-AE6E3D909D5F");
    PAN_DELIBERA.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, "Data   ");
    PAN_DELIBERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, "");
    PAN_DELIBERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DELIBERA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_LIST, 56);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_LIST, "Sede");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_FORM, 32, 8, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_FORM, 72);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_SEDE, MyGlb.PANEL_FORM, "Sede");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_SEDE, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_SEDE, PPQRY_DEL7, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_LIST, 72);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_LIST, "Num.");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_FORM, 52, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_FORM, 52);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_NUMERO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_NUMERO, PPQRY_DEL7, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_LIST, 60);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_FORM, 64, 56, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_FORM, 40);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_ANNO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_ANNO, PPQRY_DEL7, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_LIST, 336, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_LIST, 68);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_LIST, "Data Delibera");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_FORM, 344, 56, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_FORM, 88);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATADELIBERA, MyGlb.PANEL_FORM, "Data Delibera");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_DATADELIBERA, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_DATADELIBERA, PPQRY_DEL7, "A.D_DATA_DEL", "D_DATA_DEL", 6, 19, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 276, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_LIST, 104);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_FORM, 28, 80, 484, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_DESCRIZIONE, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_DESCRIZIONE, PPQRY_DEL7, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_LIST, 224, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_LIST, 76);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_LIST, "Appr. N");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_FORM, 4, 140, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_FORM, 100);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_APPROVAZIONN, MyGlb.PANEL_FORM, "Approvazione N.");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_APPROVAZIONN, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_APPROVAZIONN, PPQRY_DEL7, "A.NUMERO_APP", "NUMERO_APP", 5, 10, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_LIST, 424, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_LIST, 68);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_FORM, 344, 140, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_FORM, 88);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_DATA1, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_DATA1, PPQRY_DEL7, "A.D_DATA_APP", "D_DATA_APP", 6, 19, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_LIST, 184, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_LIST, 60);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_LIST, "Esec.");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_FORM, 32, 164, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_FORM, 72);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ESECUTIVITA, MyGlb.PANEL_FORM, "Esecutività");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_ESECUTIVITA, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_ESECUTIVITA, PPQRY_DEL7, "A.TIPO_ESEC", "TIPO_ESEC", 1, 2, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_LIST, 520, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_LIST, 64);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_LIST, "ANNO PRO");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_FORM, 88);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_ANNOPRO, MyGlb.PANEL_FORM, "ANNO PRO");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_ANNOPRO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_ANNOPRO, PPQRY_DEL7, "A.ANNO_PRO", "ANNO_PRO", 1, 4, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_LIST, 560, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_LIST, 76);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_LIST, "NUM. PRO");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_FORM, 4, 268, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_FORM, 88);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_NUMEROPRO, MyGlb.PANEL_FORM, "NUMERO PRO");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_NUMEROPRO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_NUMEROPRO, PPQRY_DEL7, "A.NUMERO_PRO", "NUMERO_PRO", 1, 4, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_LIST, 600, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_LIST, 64);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_LIST, "UN. PRO");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_FORM, 152, 244, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_FORM, 80);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_UNITAPRO, MyGlb.PANEL_FORM, "UNITA PRO");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_UNITAPRO, -1, -1);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_UNITAPRO, PPQRY_DEL7, "A.UNITA_PRO", "UNITA_PRO", 5, 8, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, MyGlb.PANEL_FORM, 40, 244, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, MyGlb.PANEL_FORM, 48);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_UTENTE1, -1, GRP_DELIBERA_INSERIMENTO);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_UTENTE1, PPQRY_DEL7, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, MyGlb.PANEL_LIST, 108);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, MyGlb.PANEL_LIST, "Data ");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, MyGlb.PANEL_FORM, 208, 244, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, MyGlb.PANEL_FORM, 36);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA2, MyGlb.PANEL_FORM, "Data ");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_DATA2, -1, GRP_DELIBERA_INSERIMENTO);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_DATA2, PPQRY_DEL7, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, MyGlb.PANEL_LIST, "Utente  ");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, MyGlb.PANEL_FORM, 352, 244, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, MyGlb.PANEL_FORM, 48);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_UTENTE, MyGlb.PANEL_FORM, "Utente  ");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_UTENTE, -1, GRP_DELIBERA_AGGIORNAMENT);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_UTENTE, PPQRY_DEL7, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, MyGlb.PANEL_LIST, 100);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, MyGlb.PANEL_LIST, "Data   ");
    PAN_DELIBERA.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, MyGlb.PANEL_FORM, 524, 244, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, MyGlb.PANEL_FORM, 36);
    PAN_DELIBERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERA_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DELIBERA.SetFieldPage(PFL_DELIBERA_DATA, -1, GRP_DELIBERA_AGGIORNAMENT);
    PAN_DELIBERA.SetFieldPanel(PFL_DELIBERA_DATA, PPQRY_DEL7, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_DELIBERA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DELIBERA.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T11CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T11DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T11 A ");
    SQL.append("where (~~SEDE_DEL~~ = A.CODICE) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DELIBERA.SetQuery(PPQRY_T11, 0, SQL, PFL_DELIBERA_SEDE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T11CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T11DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T11 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DELIBERA.SetQuery(PPQRY_T11, 1, SQL, PFL_DELIBERA_SEDE, "");
    PAN_DELIBERA.SetQueryDB(PPQRY_T11, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T10CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T10DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T10 A ");
    SQL.append("where (A.CODICE = ~~TIPO_ESEC~~) ");
    PAN_DELIBERA.SetQuery(PPQRY_T10, 0, SQL, PFL_DELIBERA_ESECUTIVITA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T10CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T10DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T10 A ");
    PAN_DELIBERA.SetQuery(PPQRY_T10, 1, SQL, PFL_DELIBERA_ESECUTIVITA, "");
    PAN_DELIBERA.SetQueryDB(PPQRY_T10, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_DELIBERA.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_DELIBERA_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DELIBERA.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_DELIBERA_UTENTE1, "");
    PAN_DELIBERA.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_DELIBERA.SetQuery(PPQRY_DUAL, 0, SQL, PFL_DELIBERA_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DELIBERA.SetQuery(PPQRY_DUAL, 1, SQL, PFL_DELIBERA_UTENTE, "");
    PAN_DELIBERA.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DELIBERA.SetIMDB(IMDB, "PQRY_DEL7", true);
    PAN_DELIBERA.set_SetString(MyGlb.MASTER_ROWNAME, "DEL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_ESEC as TIPO_ESEC, ");
    SQL.append("  A.NUMERO_APP as NUMERO_APP, ");
    SQL.append("  A.DATA_APP as DATA_APP, ");
    SQL.append("  A.D_DATA_DEL as D_DATA_DEL, ");
    SQL.append("  A.D_DATA_APP as D_DATA_APP, ");
    SQL.append("  A.ANNO_PRO as ANNO_PRO, ");
    SQL.append("  A.NUMERO_PRO as NUMERO_PRO, ");
    SQL.append("  A.UNITA_PRO as UNITA_PRO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_DELIBERA.SetQuery(PPQRY_DEL7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DEL A ");
    PAN_DELIBERA.SetQuery(PPQRY_DEL7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SEDE_DEL = ~~TBL_PARAMETRI25.ROWNAMESEDE~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~TBL_PARAMETRI25.ROWNAMENUMER~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~TBL_PARAMETRI25.ROWNAMEANNO~~) ");
    PAN_DELIBERA.SetQuery(PPQRY_DEL7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERA.SetQuery(PPQRY_DEL7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERA.SetQuery(PPQRY_DEL7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERA.SetQuery(PPQRY_DEL7, 5, SQL, -1, "");
    PAN_DELIBERA.SetQueryDB(PPQRY_DEL7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DELIBERA.SetMasterTable(0, "DEL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DELIBERA.Status() == 2)
    {
      int oldListQBE = PAN_DELIBERA.iUseListQBE;
      PAN_DELIBERA.iUseListQBE = 0;
      PAN_DELIBERA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DELIBERA.PanelCommand(Glb.PCM_FIND);
      PAN_DELIBERA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_AfterUpdate();
  }

  public void AfterBlobUpdate(IDPanel SrcObj, IDVariant Column, IDVariant Size, IDVariant Extension)
  {
  }
  
  public void AfterDelete(IDPanel SrcObj)
  {
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DELIBERA) PAN_DELIBERA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
