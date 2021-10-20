// **********************************************
// Collegamento Capitoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CollegamentoCapitoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_COLLEGCAPITO_ES = 0;
  private static int PFL_COLLEGCAPITO_TIPOREGISTRO = 1;
  private static int PFL_COLLEGCAPITO_TIPOBOLLATO = 2;
  private static int PFL_COLLEGCAPITO_CAPITOLO = 3;
  private static int PFL_COLLEGCAPITO_ARTICOLO = 4;
  private static int PFL_COLLEGCAPITO_APRI = 5;
  private static int PFL_COLLEGCAPITO_INFO = 6;
  private static int PFL_COLLEGCAPITO_DESCRIZIONE = 7;

  private static int PPQRY_CAPITOREGIST = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_DUAL = 2;
  private static int PPQRY_DUAL1 = 3;


  IDPanel PAN_COLLEGCAPITO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI563(IMDB);
    //
    //
    Init_PQRY_CAPITOREGIST(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI563(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI563, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI563, "TBL_PARAMETRI563");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI563,IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPREG, "NOMOGGTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI563,IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI563,IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPBOL, "NOMOGGTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI563,IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI563,IMDBDef2.FLD_PARAMETRI563_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI563,IMDBDef2.FLD_PARAMETRI563_NOMEOGGETTES,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI563,IMDBDef2.FLD_PARAMETRI563_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI563,IMDBDef2.FLD_PARAMETRI563_NOMEOGGEPROP,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI563, 0);
  }

  private static void Init_PQRY_CAPITOREGIST(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CAPITOREGIST, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_CAPITOREGIST, "PQRY_CAPITOREGIST");
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_TIPO_REGISTRO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPITOREGIST,IMDBDef10.PQSL_CAPITOREGIST_TIPO_BOLLATO,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CAPITOREGIST, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CollegamentoCapitoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public CollegamentoCapitoli()
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
    FormIdx = MyGlb.FRM_COLLEGCAPITO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4E05C051-9E61-4543-98DC-B30ACF7C80B1";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 676;
    DesignHeight = 414;
    set_Caption(new IDVariant("Collegamento Capitoli"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 676;
    Frames[1].Height = 388;
    Frames[1].Caption = "Collegamento Capitoli";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 388;
    PAN_COLLEGCAPITO = new IDPanel(w, this, 1, "PAN_COLLEGCAPITO");
    Frames[1].Content = PAN_COLLEGCAPITO;
    PAN_COLLEGCAPITO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_COLLEGCAPITO.VS = MainFrm.VisualStyleList;
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_COLLEGCAPITO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1DAC4CAB-2F9D-4B61-97C9-5130D67CB4EB");
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 580, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_COLLEGCAPITO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_COLLEGCAPITO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_COLLEGCAPITO.InitStatus = 2;
    PAN_COLLEGCAPITO_Init();
    PAN_COLLEGCAPITO_InitFields();
    PAN_COLLEGCAPITO_InitQueries();
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
      PAN_COLLEGCAPITO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_COLLEGCAPITO.FrIndex)
    {
      if (IdxFieldActived ==PFL_COLLEGCAPITO_APRI) {
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
    return (obj instanceof CollegamentoCapitoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CollegamentoCapitoli.class.getName() : (Glb.ClassWithPackage(CollegamentoCapitoli.class) ? CollegamentoCapitoli.class.getName().substring(CollegamentoCapitoli.class.getPackage().getName().length() + 1) : CollegamentoCapitoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Collegamento Capitoli On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_COLLEGCAPITO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Collegamento Capitoli On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_TIPO_REGISTRO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPREG, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_E_S, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGETTES, 0));
      }
      if ((Column.equals((new IDVariant(PFL_COLLEGCAPITO_CAPITOLO)), true)) || (Column.equals((new IDVariant(PFL_COLLEGCAPITO_ARTICOLO)), true)))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_ARTICOLO, 0))) && FieldModified.booleanValue())
        {
          if (!(MainFrm.CapitoloPresente(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGETTES, 0), IMDB.Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_CAPITOLO, 0), IMDB.Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_ARTICOLO, 0))))
          {
            IMDB.set_Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_CAPITOLO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_ARTICOLO, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "CollegamentoCapitoliOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Collegamento Capitoli On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_COLLEGCAPITO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Collegamento Capitoli On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(8)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGEPROP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_TIPO_REGISTRO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPREG, 0));
      }
      if (Command.equals((new IDVariant(32)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGEPROP, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "CollegamentoCapitoliOnCommand", _e);
    }
  }

  // **********************************************************************
  // Collegamento Capitoli Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_COLLEGCAPITO_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Collegamento Capitoli Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_TIPO_BOLLATO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPBOL, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "CollegamentoCapitoliBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Collegamento Capitoli On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_COLLEGCAPITO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_COLLEGCAPITO);
      // 
      // Collegamento Capitoli On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(PAN_COLLEGCAPITO.IsNewRow()))
      {
        PAN_COLLEGCAPITO.SetFlags (Glb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_COLLEGCAPITO.SetFlags (Glb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_COLLEGCAPITO.SetFlags (Glb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_COLLEGCAPITO.SetFlags (Glb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_COLLEGCAPITO.set_ToolTip(Glb.OBJ_FIELD,PFL_COLLEGCAPITO_DESCRIZIONE,(new IDVariant(PAN_COLLEGCAPITO.FieldText(PFL_COLLEGCAPITO_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "CollegamentoCapitoliOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Collegamento Capitoli On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_COLLEGCAPITO_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Collegamento Capitoli On Change Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGEPROP, 0).compareTo((new IDVariant("NO")), true)!=0)
      {
        if (PAN_COLLEGCAPITO.IsNewRow())
        {
          IMDB.set_Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_TIPO_REGISTRO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPREG, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "CollegamentoCapitoliOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Collegamento Capitoli On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_COLLEGCAPITO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_COLLEGCAPITO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Collegamento Capitoli On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "CollegamentoCapitoliOnDatabaseError", _e);
    }
  }

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
      PAN_COLLEGCAPITO.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_COLLEGCAPITO.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_COLLEGCAPITO.set_ToolTip(Glb.OBJ_FIELD,PFL_COLLEGCAPITO_APRI,(new IDVariant("Scelta Capitolo")).stringValue()); 
      PAN_COLLEGCAPITO.set_ToolTip(Glb.OBJ_FIELD,PFL_COLLEGCAPITO_INFO,(new IDVariant("Info Capitolo")).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "Load", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "EndModal", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMOGGTIPBOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGEPROP, 0, new IDVariant());
  }

  // **********************************************************************
  // Scelta Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Cap Body
      // Corpo Procedura
      // 
      if (PAN_COLLEGCAPITO.IsNewRow())
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGETTES, 0));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "SceltaCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Cap Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI563, IMDBDef2.FLD_PARAMETRI563_NOMEOGGETTES, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef10.PQRY_CAPITOREGIST, IMDBDef10.PQSL_CAPITOREGIST_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CollegamentoCapitoli", "InfoCap", _e);
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
  private void PAN_COLLEGCAPITO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_COLLEGCAPITO, Cancel);
    // Stub
  }

  private void PAN_COLLEGCAPITO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_COLLEGCAPITO_APRI)
    {
      this.IdxPanelActived = this.PAN_COLLEGCAPITO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_COLLEGCAPITO_INFO)
    {
      this.IdxPanelActived = this.PAN_COLLEGCAPITO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCap();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_COLLEGCAPITO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_COLLEGCAPITO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_COLLEGCAPITO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_COLLEGCAPITO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_COLLEGCAPITO_Init()
  {

    PAN_COLLEGCAPITO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_COLLEGCAPITO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_COLLEGCAPITO.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_COLLEGCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, "3EB314D0-876B-4266-B22F-E9FCBF14BF49");
    PAN_COLLEGCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, "E S");
    PAN_COLLEGCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, "");
    PAN_COLLEGCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_COLLEGCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_COLLEGCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, "A803112D-B466-4EC5-B395-8B0C1452A96E");
    PAN_COLLEGCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, "TIPO REGISTRO");
    PAN_COLLEGCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, "");
    PAN_COLLEGCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_COLLEGCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_COLLEGCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, "F1FB165D-87E0-4FAC-BD5D-C86A3BCF306D");
    PAN_COLLEGCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, "TIPO BOLLATO");
    PAN_COLLEGCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, "");
    PAN_COLLEGCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_COLLEGCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_COLLEGCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, "4E2004ED-FDA3-47BC-B5DB-8A14448BB955");
    PAN_COLLEGCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, "Capitolo");
    PAN_COLLEGCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, "");
    PAN_COLLEGCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_COLLEGCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_COLLEGCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, "83650872-A803-46F9-B6F2-D546C4C147C9");
    PAN_COLLEGCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, "Art.");
    PAN_COLLEGCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, "");
    PAN_COLLEGCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_COLLEGCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_COLLEGCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, "5E22AD40-B483-42F0-A0EB-F3D1F2359FB5");
    PAN_COLLEGCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, " ");
    PAN_COLLEGCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, "");
    PAN_COLLEGCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, MyGlb.VIS_HYPELINKIMMA);
    PAN_COLLEGCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_COLLEGCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, "69639877-5678-4D8D-B2E9-65A3EE43BCF6");
    PAN_COLLEGCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, " ");
    PAN_COLLEGCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, "");
    PAN_COLLEGCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_COLLEGCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_COLLEGCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, "D38E0D4B-DC03-4F9B-AD6E-6750D62C8EB1");
    PAN_COLLEGCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, "Descrizione");
    PAN_COLLEGCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, "");
    PAN_COLLEGCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, MyGlb.VIS_VISULOOUPCF4);
    PAN_COLLEGCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_COLLEGCAPITO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, MyGlb.PANEL_LIST, 24);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, MyGlb.PANEL_LIST, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, MyGlb.PANEL_LIST, "E S");
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, MyGlb.PANEL_FORM, 4, 4, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, MyGlb.PANEL_FORM, 24);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, MyGlb.PANEL_FORM, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ES, MyGlb.PANEL_FORM, "E S");
    PAN_COLLEGCAPITO.SetFieldPage(PFL_COLLEGCAPITO_ES, -1, -1);
    PAN_COLLEGCAPITO.SetFieldPanel(PFL_COLLEGCAPITO_ES, PPQRY_CAPITOREGIST, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, MyGlb.PANEL_LIST, 96);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 52, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, MyGlb.PANEL_FORM, 96);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOREGISTRO, MyGlb.PANEL_FORM, "TIPO REGISTRO");
    PAN_COLLEGCAPITO.SetFieldPage(PFL_COLLEGCAPITO_TIPOREGISTRO, -1, -1);
    PAN_COLLEGCAPITO.SetFieldPanel(PFL_COLLEGCAPITO_TIPOREGISTRO, PPQRY_CAPITOREGIST, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 1, 0, -13997);
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, MyGlb.PANEL_LIST, 88);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, MyGlb.PANEL_LIST, "TIPO BOLLATO");
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 28, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, MyGlb.PANEL_FORM, 88);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_TIPOBOLLATO, MyGlb.PANEL_FORM, "TIPO BOLLATO");
    PAN_COLLEGCAPITO.SetFieldPage(PFL_COLLEGCAPITO_TIPOBOLLATO, -1, -1);
    PAN_COLLEGCAPITO.SetFieldPanel(PFL_COLLEGCAPITO_TIPOBOLLATO, PPQRY_CAPITOREGIST, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, MyGlb.PANEL_FORM, 4, 100, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_COLLEGCAPITO.SetFieldPage(PFL_COLLEGCAPITO_CAPITOLO, -1, -1);
    PAN_COLLEGCAPITO.SetFieldPanel(PFL_COLLEGCAPITO_CAPITOLO, PPQRY_CAPITOREGIST, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, MyGlb.PANEL_LIST, 140, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_COLLEGCAPITO.SetFieldPage(PFL_COLLEGCAPITO_ARTICOLO, -1, -1);
    PAN_COLLEGCAPITO.SetFieldPanel(PFL_COLLEGCAPITO_ARTICOLO, PPQRY_CAPITOREGIST, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, MyGlb.PANEL_LIST, 176, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, MyGlb.PANEL_LIST, 64);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, MyGlb.PANEL_LIST, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, MyGlb.PANEL_LIST, " ");
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, MyGlb.PANEL_FORM, 4, 184, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, MyGlb.PANEL_FORM, 64);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, MyGlb.PANEL_FORM, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_APRI, MyGlb.PANEL_FORM, " ");
    PAN_COLLEGCAPITO.SetFieldPage(PFL_COLLEGCAPITO_APRI, -1, -1);
    PAN_COLLEGCAPITO.SetFieldPanel(PFL_COLLEGCAPITO_APRI, PPQRY_DUAL, "'A'", "APRI", 5, 1, 0, -13997);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_APRI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, MyGlb.PANEL_LIST, 200, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, MyGlb.PANEL_LIST, 64);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, MyGlb.PANEL_LIST, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, MyGlb.PANEL_LIST, " ");
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, MyGlb.PANEL_FORM, 4, 208, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, MyGlb.PANEL_FORM, 64);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, MyGlb.PANEL_FORM, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_INFO, MyGlb.PANEL_FORM, " ");
    PAN_COLLEGCAPITO.SetFieldPage(PFL_COLLEGCAPITO_INFO, -1, -1);
    PAN_COLLEGCAPITO.SetFieldPanel(PFL_COLLEGCAPITO_INFO, PPQRY_DUAL1, "CASE WHEN NOT ((~~CAPITOLO~~ IS NULL)) AND NOT ((~~ARTICOLO~~ IS NULL)) THEN 'I' ELSE NULL END", "INFO", 5, 99, 0, -13997);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_COLLEGCAPITO.SetValueListItem(PFL_COLLEGCAPITO_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, 224, 36, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, 108);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_COLLEGCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 148, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COLLEGCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, 108);
    PAN_COLLEGCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_COLLEGCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COLLEGCAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_COLLEGCAPITO.SetFieldPage(PFL_COLLEGCAPITO_DESCRIZIONE, -1, -1);
    PAN_COLLEGCAPITO.SetFieldPanel(PFL_COLLEGCAPITO_DESCRIZIONE, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
  }

  private void PAN_COLLEGCAPITO_InitQueries()
  {
    StringBuffer SQL;

    PAN_COLLEGCAPITO.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI563.NOMEOGGETTES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_COLLEGCAPITO.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_COLLEGCAPITO.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COLLEGCAPITO.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'A' as APRI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~TIPO_REGISTRO~~ IS NULL))) ");
    SQL.append("and   ((~~TIPO_BOLLATO~~ IS NULL)) ");
    PAN_COLLEGCAPITO.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_COLLEGCAPITO.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COLLEGCAPITO.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN NOT ((~~CAPITOLO~~ IS NULL)) AND NOT ((~~ARTICOLO~~ IS NULL)) THEN 'I' ELSE NULL END as INFO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_COLLEGCAPITO.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_COLLEGCAPITO.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COLLEGCAPITO.SetMasterTable(PPQRY_DUAL1, "DUAL");
    PAN_COLLEGCAPITO.SetIMDB(IMDB, "PQRY_CAPITOREGIST", true);
    PAN_COLLEGCAPITO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO ");
    PAN_COLLEGCAPITO.SetQuery(PPQRY_CAPITOREGIST, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAPITOLI_REGISTRI A ");
    PAN_COLLEGCAPITO.SetQuery(PPQRY_CAPITOREGIST, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_REGISTRO = ~~TBL_PARAMETRI563.NOMOGGTIPREG~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TBL_PARAMETRI563.NOMOGGTIPBOL~~) ");
    PAN_COLLEGCAPITO.SetQuery(PPQRY_CAPITOREGIST, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_COLLEGCAPITO.SetQuery(PPQRY_CAPITOREGIST, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_COLLEGCAPITO.SetQuery(PPQRY_CAPITOREGIST, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_COLLEGCAPITO.SetQuery(PPQRY_CAPITOREGIST, 5, SQL, -1, "");
    PAN_COLLEGCAPITO.SetQueryDB(PPQRY_CAPITOREGIST, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COLLEGCAPITO.SetMasterTable(0, "CAPITOLI_REGISTRI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_COLLEGCAPITO.Status() == 2)
    {
      int oldListQBE = PAN_COLLEGCAPITO.iUseListQBE;
      PAN_COLLEGCAPITO.iUseListQBE = 0;
      PAN_COLLEGCAPITO.PanelCommand(Glb.PCM_SEARCH);
      PAN_COLLEGCAPITO.PanelCommand(Glb.PCM_FIND);
      PAN_COLLEGCAPITO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_COLLEGCAPITO) PAN_COLLEGCAPITO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_COLLEGCAPITO) PAN_COLLEGCAPITO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_COLLEGCAPITO) PAN_COLLEGCAPITO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_COLLEGCAPITO) PAN_COLLEGCAPITO_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_COLLEGCAPITO) PAN_COLLEGCAPITO_OnChangeRow();
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
    if (SrcObj == PAN_COLLEGCAPITO) PAN_COLLEGCAPITO_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_COLLEGCAPITO) PAN_COLLEGCAPITO_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_COLLEGCAPITO) PAN_COLLEGCAPITO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
