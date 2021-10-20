// **********************************************
// Movimenti A Gruppi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MovimentiAGruppi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_MOVIMEAGRUPP_CODICE = 0;
  private static int PFL_MOVIMEAGRUPP_DESCRIZIONE = 1;
  private static int PFL_MOVIMEAGRUPP_TIPOMOVIMENT = 2;
  private static int PFL_MOVIMEAGRUPP_TIPOFILE = 3;
  private static int PFL_MOVIMEAGRUPP_UTENTEINSERI = 4;
  private static int PFL_MOVIMEAGRUPP_DATAINSERIME = 5;
  private static int PFL_MOVIMEAGRUPP_UTENTULTIAGG = 6;
  private static int PFL_MOVIMEAGRUPP_DATAULTIMAGG = 7;

  private static int PPQRY_GRUPPIMOVIME = 0;


  IDPanel PAN_MOVIMEAGRUPP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI644(IMDB);
    //
    //
    Init_PQRY_GRUPPIMOVIME(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI644(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI644, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI644, "TBL_PARAMETRI644");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI644,IMDBDef5.FLD_PARAMETRI644_PARATIPOMOVI, "PARATIPOMOVI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI644,IMDBDef5.FLD_PARAMETRI644_PARATIPOMOVI,5,20,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI644, 0);
  }

  private static void Init_PQRY_GRUPPIMOVIME(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_GRUPPIMOVIME, 8);
    IMDB.set_TblCode(IMDBDef14.PQRY_GRUPPIMOVIME, "PQRY_GRUPPIMOVIME");
    IMDB.set_FldCode(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_CODICE,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_MOVIMENTO, "TIPO_MOVIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_MOVIMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_FILE, "TIPO_FILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRUPPIMOVIME,IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_FILE,5,20,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_GRUPPIMOVIME, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MovimentiAGruppi(MyWebEntryPoint w, IMDBObj imdb)
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
  public MovimentiAGruppi()
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
    FormIdx = MyGlb.FRM_MOVIMEAGRUPP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3F5047F9-0D91-4BBE-A0F3-FCB23E8249D3";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 772;
    DesignHeight = 362;
    set_Caption(new IDVariant("Movimenti A Gruppi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 772;
    Frames[1].Height = 336;
    Frames[1].Caption = "Movimenti A Gruppi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_MOVIMEAGRUPP = new IDPanel(w, this, 1, "PAN_MOVIMEAGRUPP");
    Frames[1].Content = PAN_MOVIMEAGRUPP;
    PAN_MOVIMEAGRUPP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MOVIMEAGRUPP.VS = MainFrm.VisualStyleList;
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MOVIMEAGRUPP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FD04B95C-D760-4B7E-8C78-4F687E7FF8F7");
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 744, 276, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MOVIMEAGRUPP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MOVIMEAGRUPP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MOVIMEAGRUPP.InitStatus = 2;
    PAN_MOVIMEAGRUPP_Init();
    PAN_MOVIMEAGRUPP_InitFields();
    PAN_MOVIMEAGRUPP_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI13+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG186+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI13+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DETTAGGRUPPO+BaseCmdLinIdx)
      {
        ApriDettagliMovimento();
        break fine;
      }
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
      PAN_MOVIMEAGRUPP.UpdatePanel(MainFrm);
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
    return (obj instanceof MovimentiAGruppi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MovimentiAGruppi.class.getName() : (Glb.ClassWithPackage(MovimentiAGruppi.class) ? MovimentiAGruppi.class.getName().substring(MovimentiAGruppi.class.getPackage().getName().length() + 1) : MovimentiAGruppi.class.getName()));
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
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI644, IMDBDef5.FLD_PARAMETRI644_PARATIPOMOVI, 0).equals((new IDVariant("ACC")), true))
      {
        IDVariant v_ACCERTAMENTI = new IDVariant(0,IDVariant.STRING);
        v_ACCERTAMENTI = (new IDVariant("Accertamenti a Gruppi", IDVariant.STRING));
        set_Caption(new IDVariant(v_ACCERTAMENTI));
        Frames[PAN_MOVIMEAGRUPP.FrIndex].set_Caption(new IDVariant(v_ACCERTAMENTI).stringValue());
      }
      PAN_MOVIMEAGRUPP.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiAGruppi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Movimenti A Gruppi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MOVIMEAGRUPP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_MOVIMEAGRUPP);
      // 
      // Movimenti A Gruppi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_MOVIMEAGRUPP.set_ToolTip(Glb.OBJ_FIELD,PFL_MOVIMEAGRUPP_DESCRIZIONE,(new IDVariant(PAN_MOVIMEAGRUPP.FieldText(PFL_MOVIMEAGRUPP_DESCRIZIONE))).stringValue()); 
      if (PAN_MOVIMEAGRUPP.IsNewRow())
      {
        PAN_MOVIMEAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_MOVIMEAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiAGruppi", "MovimentiAGruppiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Movimenti A Gruppi On Database Error Event
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
  private void PAN_MOVIMEAGRUPP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_MOVIMEAGRUPP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Movimenti A Gruppi On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiAGruppi", "MovimentiAGruppiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Movimenti A Gruppi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_MOVIMEAGRUPP_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Movimenti A Gruppi On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_DATA_INSERIMENTO, 0, IDL.Today());
        }
        IMDB.set_Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_MOVIMENTO, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI644, IMDBDef5.FLD_PARAMETRI644_PARATIPOMOVI, 0));
      }
      else
      {
        if (IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_MOVIMEAGRUPP_TIPOFILE)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_FILE, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  TIPI_FILE_IMPORT A ");
          SQL.append("where (A.TIPO_FILE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_FILE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_MOVI = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI644, IMDBDef5.FLD_PARAMETRI644_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Tipo File non valido"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_FILE, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiAGruppi", "MovimentiAGruppiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Movimenti A Gruppi On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_MOVIMEAGRUPP_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Movimenti A Gruppi On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_MOVIMEAGRUPP.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET29+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET29+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiAGruppi", "MovimentiAGruppiOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Dettagli Movimento
  // **********************************************************************
  public int ApriDettagliMovimento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Dettagli Movimento Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_CODICE, 0))))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0, new IDVariant(IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_CODICE, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARADESCGRUP, 0, IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_DESCRIZIONE, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0, IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_MOVIMENTO, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOFILE, 0, IMDB.Value(IMDBDef14.PQRY_GRUPPIMOVIME, IMDBDef14.PQSL_GRUPPIMOVIME_TIPO_FILE, 0));
        MainFrm.Show(MyGlb.FRM_DETTGRUPMOVI, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiAGruppi", "ApriDettagliMovimento", _e);
      return -1;
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MOVIMEAGRUPP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MOVIMEAGRUPP, Cancel);
    // Stub
  }

  private void PAN_MOVIMEAGRUPP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MOVIMEAGRUPP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_MOVIMEAGRUPP_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_MOVIMEAGRUPP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MOVIMEAGRUPP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MOVIMEAGRUPP_Init()
  {

    PAN_MOVIMEAGRUPP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MOVIMEAGRUPP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MOVIMEAGRUPP.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_MOVIMEAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, "348D3D37-A21B-4D6D-ACE4-629FF3D88BC2");
    PAN_MOVIMEAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, "Codice");
    PAN_MOVIMEAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, "");
    PAN_MOVIMEAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, MyGlb.VIS_INTE10NORFIE);
    PAN_MOVIMEAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_MOVIMEAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, "1CBAC6D7-C52C-40E0-B395-A7770F00E707");
    PAN_MOVIMEAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, "Descrizione");
    PAN_MOVIMEAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, "");
    PAN_MOVIMEAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MOVIMEAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, "76686A77-9091-4CFE-BC89-35BE6C87CE6E");
    PAN_MOVIMEAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, "Tipo Movimento");
    PAN_MOVIMEAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, "");
    PAN_MOVIMEAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MOVIMEAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, "8DBE3813-3B68-4DE5-9FFC-453871BBB80C");
    PAN_MOVIMEAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, "Tipo File");
    PAN_MOVIMEAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, "");
    PAN_MOVIMEAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, "7AA272E3-CBEA-4BBD-87D8-FF579CA8DEC5");
    PAN_MOVIMEAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_MOVIMEAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, "");
    PAN_MOVIMEAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMEAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, "BE8BE15C-49F1-4A79-A38D-DE369DC56F6B");
    PAN_MOVIMEAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, "DATA INSERIMENTO");
    PAN_MOVIMEAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, "");
    PAN_MOVIMEAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMEAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, "88D6B911-69F1-44A1-B295-3DEEE132D451");
    PAN_MOVIMEAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_MOVIMEAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, "");
    PAN_MOVIMEAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMEAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, "706E4321-85DE-4667-88CC-B6F08632AD24");
    PAN_MOVIMEAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_MOVIMEAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, "");
    PAN_MOVIMEAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMEAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MOVIMEAGRUPP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_MOVIMEAGRUPP.SetFieldPage(PFL_MOVIMEAGRUPP_CODICE, -1, -1);
    PAN_MOVIMEAGRUPP.SetFieldPanel(PFL_MOVIMEAGRUPP_CODICE, PPQRY_GRUPPIMOVIME, "A.CODICE", "CODICE", 3, 10, 0, -13997);
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, MyGlb.PANEL_LIST, 92, 36, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_MOVIMEAGRUPP.SetFieldPage(PFL_MOVIMEAGRUPP_DESCRIZIONE, -1, -1);
    PAN_MOVIMEAGRUPP.SetFieldPanel(PFL_MOVIMEAGRUPP_DESCRIZIONE, PPQRY_GRUPPIMOVIME, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, MyGlb.PANEL_LIST, 440, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, MyGlb.PANEL_LIST, 32);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, MyGlb.PANEL_LIST, "Tipo Movimento");
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOMOVIMENT, MyGlb.PANEL_FORM, "Tp. Movimento");
    PAN_MOVIMEAGRUPP.SetFieldPage(PFL_MOVIMEAGRUPP_TIPOMOVIMENT, -1, -1);
    PAN_MOVIMEAGRUPP.SetFieldPanel(PFL_MOVIMEAGRUPP_TIPOMOVIMENT, PPQRY_GRUPPIMOVIME, "A.TIPO_MOVIMENTO", "TIPO_MOVIMENTO", 5, 20, 0, -13997);
    PAN_MOVIMEAGRUPP.SetValueListItem(PFL_MOVIMEAGRUPP_TIPOMOVIMENT, (new IDVariant("ACC")), "Accertamenti", "", "", -1);
    PAN_MOVIMEAGRUPP.SetValueListItem(PFL_MOVIMEAGRUPP_TIPOMOVIMENT, (new IDVariant("IMP")), "Impegni", "", "", -1);
    PAN_MOVIMEAGRUPP.SetValueListItem(PFL_MOVIMEAGRUPP_TIPOMOVIMENT, (new IDVariant("SUBIMP")), "Subimpegni", "", "", -1);
    PAN_MOVIMEAGRUPP.SetValueListItem(PFL_MOVIMEAGRUPP_TIPOMOVIMENT, (new IDVariant("ORD")), "Ordinativi", "", "", -1);
    PAN_MOVIMEAGRUPP.SetValueListItem(PFL_MOVIMEAGRUPP_TIPOMOVIMENT, (new IDVariant("LIQ")), "Liquidazioni", "", "", -1);
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, MyGlb.PANEL_LIST, 600, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, MyGlb.PANEL_LIST, 64);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, MyGlb.PANEL_LIST, "Tipo File");
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, MyGlb.PANEL_FORM, 4, 340, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, MyGlb.PANEL_FORM, 64);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_TIPOFILE, MyGlb.PANEL_FORM, "Tipo File");
    PAN_MOVIMEAGRUPP.SetFieldPage(PFL_MOVIMEAGRUPP_TIPOFILE, -1, -1);
    PAN_MOVIMEAGRUPP.SetFieldPanel(PFL_MOVIMEAGRUPP_TIPOFILE, PPQRY_GRUPPIMOVIME, "A.TIPO_FILE", "TIPO_FILE", 5, 20, 0, -13997);
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, MyGlb.PANEL_LIST, 480, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 196, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_MOVIMEAGRUPP.SetFieldPage(PFL_MOVIMEAGRUPP_UTENTEINSERI, -1, -1);
    PAN_MOVIMEAGRUPP.SetFieldPanel(PFL_MOVIMEAGRUPP_UTENTEINSERI, PPQRY_GRUPPIMOVIME, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, MyGlb.PANEL_LIST, 480, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_MOVIMEAGRUPP.SetFieldPage(PFL_MOVIMEAGRUPP_DATAINSERIME, -1, -1);
    PAN_MOVIMEAGRUPP.SetFieldPanel(PFL_MOVIMEAGRUPP_DATAINSERIME, PPQRY_GRUPPIMOVIME, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, MyGlb.PANEL_LIST, 480, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 244, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_MOVIMEAGRUPP.SetFieldPage(PFL_MOVIMEAGRUPP_UTENTULTIAGG, -1, -1);
    PAN_MOVIMEAGRUPP.SetFieldPanel(PFL_MOVIMEAGRUPP_UTENTULTIAGG, PPQRY_GRUPPIMOVIME, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, MyGlb.PANEL_LIST, 480, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_MOVIMEAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 268, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_MOVIMEAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEAGRUPP_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_MOVIMEAGRUPP.SetFieldPage(PFL_MOVIMEAGRUPP_DATAULTIMAGG, -1, -1);
    PAN_MOVIMEAGRUPP.SetFieldPanel(PFL_MOVIMEAGRUPP_DATAULTIMAGG, PPQRY_GRUPPIMOVIME, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
  }

  private void PAN_MOVIMEAGRUPP_InitQueries()
  {
    StringBuffer SQL;

    PAN_MOVIMEAGRUPP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MOVIMEAGRUPP.SetIMDB(IMDB, "PQRY_GRUPPIMOVIME", true);
    PAN_MOVIMEAGRUPP.set_SetString(MyGlb.MASTER_ROWNAME, "GRUPPI MOVIMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_MOVIMENTO as TIPO_MOVIMENTO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.TIPO_FILE as TIPO_FILE ");
    PAN_MOVIMEAGRUPP.SetQuery(PPQRY_GRUPPIMOVIME, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  GRUPPI_MOVIMENTI A ");
    PAN_MOVIMEAGRUPP.SetQuery(PPQRY_GRUPPIMOVIME, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_MOVIMENTO = ~~TBL_PARAMETRI644.PARATIPOMOVI~~) ");
    PAN_MOVIMEAGRUPP.SetQuery(PPQRY_GRUPPIMOVIME, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEAGRUPP.SetQuery(PPQRY_GRUPPIMOVIME, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEAGRUPP.SetQuery(PPQRY_GRUPPIMOVIME, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MOVIMEAGRUPP.SetQuery(PPQRY_GRUPPIMOVIME, 5, SQL, -1, "");
    PAN_MOVIMEAGRUPP.SetQueryDB(PPQRY_GRUPPIMOVIME, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MOVIMEAGRUPP.SetMasterTable(0, "GRUPPI_MOVIMENTI");
    PAN_MOVIMEAGRUPP.AddToSortList(PFL_MOVIMEAGRUPP_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MOVIMEAGRUPP.Status() == 2)
    {
      int oldListQBE = PAN_MOVIMEAGRUPP.iUseListQBE;
      PAN_MOVIMEAGRUPP.iUseListQBE = 0;
      PAN_MOVIMEAGRUPP.PanelCommand(Glb.PCM_SEARCH);
      PAN_MOVIMEAGRUPP.PanelCommand(Glb.PCM_FIND);
      PAN_MOVIMEAGRUPP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MOVIMEAGRUPP) PAN_MOVIMEAGRUPP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOVIMEAGRUPP) PAN_MOVIMEAGRUPP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MOVIMEAGRUPP) PAN_MOVIMEAGRUPP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOVIMEAGRUPP) PAN_MOVIMEAGRUPP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MOVIMEAGRUPP) PAN_MOVIMEAGRUPP_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_MOVIMEAGRUPP) PAN_MOVIMEAGRUPP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
