// **********************************************
// Tipi Motivazioni Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiMotivazioniVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_MOTIVAZIONI_QUADRATURA = 0;

  private static int PFL_MOTIVAZIONI_CODICE1 = 0;
  private static int PFL_MOTIVAZIONI_DESCRIZIONE1 = 1;
  private static int PFL_MOTIVAZIONI_TIPOIMPORTO = 2;
  private static int PFL_MOTIVAZIONI_PARTE = 3;
  private static int PFL_MOTIVAZIONI_TIPO = 4;
  private static int PFL_MOTIVAZIONI_OBBLIGCOMPET = 5;
  private static int PFL_MOTIVAZIONI_OBBLIGCASSA = 6;

  private static int PPQRY_TIPIMOTIVAZ4 = 0;

  private static int PPQRY_TIPIIMPOVBIL = 1;


  IDPanel PAN_MOTIVAZIONI;
  private static int PFL_TIPIVARIAZIO_CODICE = 0;
  private static int PFL_TIPIVARIAZIO_DESCRIZIONE = 1;
  private static int PFL_TIPIVARIAZIO_TIPOLOGIA = 2;
  private static int PFL_TIPIVARIAZIO_UTENTEINSERI = 3;
  private static int PFL_TIPIVARIAZIO_DATAINSERIME = 4;
  private static int PFL_TIPIVARIAZIO_UTENTULTIAGG = 5;
  private static int PFL_TIPIVARIAZIO_DATAULTIMAGG = 6;

  private static int PPQRY_T80 = 0;


  IDPanel PAN_TIPIVARIAZIO;

  // Definition of Global Variables
  private IDVariant RIGAMOTIVAZI = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_TIPIMOTIVAZ4(IMDB);
    Init_PQRY_T80(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_TIPIMOTIVAZ4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPIMOTIVAZ4, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPIMOTIVAZ4, "PQRY_TIPIMOTIVAZ4");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_CODICE,5,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_TIPO_IMPORTO, "TIPO_IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_TIPO_IMPORTO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_PARTE, "PARTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_PARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_TIPO_QUADRATURA, "TIPO_QUADRATURA");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_TIPO_QUADRATURA,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_QUADRATURA_OBBLIG, "QUADRATURA_OBBLIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_QUADRATURA_OBBLIG,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_QUADRATURA_OBBLIG_CASSA, "QUADRATURA_OBBLIG_CASSA");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZ4,IMDBDef8.PQSL_TIPIMOTIVAZ4_QUADRATURA_OBBLIG_CASSA,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_TIPIMOTIVAZ4, 0);
  }

  private static void Init_PQRY_T80(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_T80, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_T80, "PQRY_T80");
    IMDB.set_FldCode(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_TIPOLOGIA, "TIPOLOGIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_TIPOLOGIA,5,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T80,IMDBDef8.PQSL_T80_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_T80, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiMotivazioniVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiMotivazioniVariazioni()
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
    FormIdx = MyGlb.FRM_TIPIMOTIVARI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "96E146FF-75C0-4330-A015-45C0F5187943";
    ResModeW = 3;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 868;
    DesignHeight = 698;
    set_Caption(new IDVariant("Tipi Motivazioni Variazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 868;
    Frames[1].Height = 672;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.5;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 868;
    Frames[2].Height = 336;
    Frames[2].Caption = "Motivazioni";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 336;
    PAN_MOTIVAZIONI = new IDPanel(w, this, 2, "PAN_MOTIVAZIONI");
    Frames[2].Content = PAN_MOTIVAZIONI;
    PAN_MOTIVAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MOTIVAZIONI.VS = MainFrm.VisualStyleList;
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 868-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MOTIVAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8FAC2C23-E2F7-443A-9119-BEB24CB22873");
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 836, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MOTIVAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MOTIVAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MOTIVAZIONI.InitStatus = 2;
    PAN_MOTIVAZIONI_Init();
    PAN_MOTIVAZIONI_InitFields();
    PAN_MOTIVAZIONI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 868;
    Frames[3].Height = 336;
    Frames[3].Caption = "Tipi Variazione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 336;
    PAN_TIPIVARIAZIO = new IDPanel(w, this, 3, "PAN_TIPIVARIAZIO");
    Frames[3].Content = PAN_TIPIVARIAZIO;
    PAN_TIPIVARIAZIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIVARIAZIO.VS = MainFrm.VisualStyleList;
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 868-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "75B71799-6610-4114-BEF8-95D4D2B41000");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 448, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIVARIAZIO.InitStatus = 2;
    PAN_TIPIVARIAZIO_Init();
    PAN_TIPIVARIAZIO_InitFields();
    PAN_TIPIVARIAZIO_InitQueries();
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
      PAN_MOTIVAZIONI.UpdatePanel(MainFrm);
      PAN_TIPIVARIAZIO.UpdatePanel(MainFrm);
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
    return (obj instanceof TipiMotivazioniVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiMotivazioniVariazioni.class.getName() : (Glb.ClassWithPackage(TipiMotivazioniVariazioni.class) ? TipiMotivazioniVariazioni.class.getName().substring(TipiMotivazioniVariazioni.class.getPackage().getName().length() + 1) : TipiMotivazioniVariazioni.class.getName()));
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
      IDVariant v_CAPTION = null;
      v_CAPTION = (new IDVariant("Tipi Motivazioni/Variazioni"));
      set_Caption(new IDVariant(v_CAPTION));
      PAN_TIPIVARIAZIO.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_MOTIVAZIONI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "Load", _e);
    }
  }

  // **********************************************************************
  // Motivazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MOTIVAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_MOTIVAZIONI);
      // 
      // Motivazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(PAN_MOTIVAZIONI.IsNewRow()))
      {
        PAN_MOTIVAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_MOTIVAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_MOTIVAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_MOTIVAZIONI_DESCRIZIONE1,(new IDVariant(PAN_MOTIVAZIONI.FieldText(PFL_MOTIVAZIONI_DESCRIZIONE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "MotivazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Motivazioni On Database Error
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
  private void PAN_MOTIVAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_MOTIVAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Motivazioni On Database Error Body
      // Corpo Procedura
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "MotivazioniOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Motivazioni On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_MOTIVAZIONI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Motivazioni On Change Row Body
      // Corpo Procedura
      // 
      if (RIGAMOTIVAZI.compareTo((new IDVariant(PAN_MOTIVAZIONI.SelectedRow(true))), true)!=0)
      {
        if (new IDVariant(PAN_TIPIVARIAZIO.Status()).equals((new IDVariant(3)), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Modifiche in sospeso sui Tipi Variazioni associate alla Motivazione corrente. Confermare o annullare."));
          MainFrm.set_AlertMessage(v_AVVISO); 
          PAN_MOTIVAZIONI.set_SelectedRow(true, new IDVariant(RIGAMOTIVAZI).intValue());
        }
        else
        {
          RIGAMOTIVAZI = (new IDVariant(PAN_MOTIVAZIONI.SelectedRow(true)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "MotivazioniOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIVARIAZIO);
      // 
      // Tipi Variazione On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(PAN_TIPIVARIAZIO.IsNewRow()))
      {
        PAN_TIPIVARIAZIO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIVARIAZIO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_TIPIVARIAZIO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIVARIAZIO_DESCRIZIONE,(new IDVariant(PAN_TIPIVARIAZIO.FieldText(PFL_TIPIVARIAZIO_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "TipiVariazioneOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Variazione Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_TIPOLOGIA, 0, IMDB.Value(IMDBDef8.PQRY_TIPIMOTIVAZ4, IMDBDef8.PQSL_TIPIMOTIVAZ4_CODICE, 0));
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_CODICE, 0)))
      {
        IDVariant v_CODICE = null;
        v_CODICE = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MAX(A.CODICE) as MAXT54CODICE ");
        SQL.append("from ");
        SQL.append("  T54 A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CODICE = QV.Get("MAXT54CODICE", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_CODICE, 0, IDL.Add(IDL.NullValue(v_CODICE,(new IDVariant(0))), (new IDVariant(1))));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "TipiVariazioneBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Variazione Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "TipiVariazioneBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione On Database Error
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
  private void PAN_TIPIVARIAZIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPIVARIAZIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Variazione On Database Error Body
      // Corpo Procedura
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "TipiVariazioneOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Variazione On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.T54PD(IMDB.Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "TipiVariazioneOnCommand", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Variazione On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_CODICE, 0)))
        {
          IDVariant v_VMAX = null;
          v_VMAX = (new IDVariant(1));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(MAX(A.CODICE), 0) + 1 as NUVAMAT5CO01 ");
          SQL.append("from ");
          SQL.append("  T54 A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VMAX = QV.Get("NUVAMAT5CO01", IDVariant.INTEGER) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef8.PQRY_T80, IMDBDef8.PQSL_T80_CODICE, 0, new IDVariant(v_VMAX));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazioniVariazioni", "TipiVariazioneOnUpdatingRow", _e);
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
  private void PAN_MOTIVAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MOTIVAZIONI, Cancel);
    // Stub
  }

  private void PAN_MOTIVAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MOTIVAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MOTIVAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MOTIVAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIVARIAZIO, Cancel);
    // Stub
  }

  private void PAN_TIPIVARIAZIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIVARIAZIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPIVARIAZIO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIVARIAZIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIVARIAZIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MOTIVAZIONI_Init()
  {

    PAN_MOTIVAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MOTIVAZIONI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_MOTIVAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, "D075058B-00D4-4139-AA06-C2BFC5EE7578");
    PAN_MOTIVAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, "Quadratura");
    PAN_MOTIVAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, "");
    PAN_MOTIVAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, MyGlb.VIS_DEFAPANESTYL);
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, MyGlb.PANEL_LIST, 516, -9999, 320, 16, 0, 0);
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, MyGlb.PANEL_FORM, 0, 75, 224, 97, 0, 0);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, 0, 65);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, 1, 13);
    PAN_MOTIVAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, 0, 4);
    PAN_MOTIVAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, 1, 4);
    PAN_MOTIVAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_MOTIVAZIONI_QUADRATURA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MOTIVAZIONI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_MOTIVAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, "FB1A7373-B8B8-4F05-88C4-8612C8E5AE45");
    PAN_MOTIVAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, "Codice");
    PAN_MOTIVAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, "");
    PAN_MOTIVAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, MyGlb.VIS_NORMALFIELDS);
    PAN_MOTIVAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_MOTIVAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, "BADA8EFE-202A-4F8C-A9E6-FC0A374ABBF8");
    PAN_MOTIVAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, "Descrizione");
    PAN_MOTIVAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, "");
    PAN_MOTIVAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_MOTIVAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MOTIVAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, "9506FB74-7D2A-4F1B-AF8B-B1880BCEC40B");
    PAN_MOTIVAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, "Tipo Importo");
    PAN_MOTIVAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, "");
    PAN_MOTIVAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOTIVAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MOTIVAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, "C48A21B5-6CB9-481B-A7EB-E46F409B6BC3");
    PAN_MOTIVAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, "Parte");
    PAN_MOTIVAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, "");
    PAN_MOTIVAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, MyGlb.VIS_NORMALFIELDS);
    PAN_MOTIVAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MOTIVAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, "D05C509B-9C30-4279-A60E-E4DA81C04882");
    PAN_MOTIVAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, "Tipo");
    PAN_MOTIVAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, "");
    PAN_MOTIVAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOTIVAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MOTIVAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, "C12A9C4B-B9DD-4419-9074-330025D8746F");
    PAN_MOTIVAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, "Obblig. Competenza");
    PAN_MOTIVAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, "");
    PAN_MOTIVAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, MyGlb.VIS_CHECKSTYLE);
    PAN_MOTIVAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MOTIVAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, "F6504B3B-956F-4E7B-8597-5D283244E687");
    PAN_MOTIVAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, "Obblig. Cassa");
    PAN_MOTIVAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, "");
    PAN_MOTIVAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, MyGlb.VIS_CHECKSTYLE);
    PAN_MOTIVAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MOTIVAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, MyGlb.PANEL_LIST, 48);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, MyGlb.PANEL_FORM, 88);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_MOTIVAZIONI.SetFieldPage(PFL_MOTIVAZIONI_CODICE1, -1, -1);
    PAN_MOTIVAZIONI.SetFieldPanel(PFL_MOTIVAZIONI_CODICE1, PPQRY_TIPIMOTIVAZ4, "A.CODICE", "CODICE", 5, 3, 0, -13997);
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, MyGlb.PANEL_LIST, 56, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 28, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, MyGlb.PANEL_FORM, 88);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_MOTIVAZIONI.SetFieldPage(PFL_MOTIVAZIONI_DESCRIZIONE1, -1, -1);
    PAN_MOTIVAZIONI.SetFieldPanel(PFL_MOTIVAZIONI_DESCRIZIONE1, PPQRY_TIPIMOTIVAZ4, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, MyGlb.PANEL_LIST, 276, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, MyGlb.PANEL_LIST, 92);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, MyGlb.PANEL_LIST, "Tipo Importo");
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, MyGlb.PANEL_FORM, 92);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPOIMPORTO, MyGlb.PANEL_FORM, "Tipo Importo");
    PAN_MOTIVAZIONI.SetFieldPage(PFL_MOTIVAZIONI_TIPOIMPORTO, -1, -1);
    PAN_MOTIVAZIONI.SetFieldPanel(PFL_MOTIVAZIONI_TIPOIMPORTO, PPQRY_TIPIMOTIVAZ4, "A.TIPO_IMPORTO", "TIPO_IMPORTO", 5, 2, 0, -13997);
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, MyGlb.PANEL_LIST, 408, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, MyGlb.PANEL_LIST, 44);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, MyGlb.PANEL_FORM, 4, 76, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, MyGlb.PANEL_FORM, 44);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_MOTIVAZIONI.SetFieldPage(PFL_MOTIVAZIONI_PARTE, -1, -1);
    PAN_MOTIVAZIONI.SetFieldPanel(PFL_MOTIVAZIONI_PARTE, PPQRY_TIPIMOTIVAZ4, "A.PARTE", "PARTE", 5, 2, 0, -13997);
    PAN_MOTIVAZIONI.SetValueListItem(PFL_MOTIVAZIONI_PARTE, (new IDVariant("E")), "Entrate", "", "", -1);
    PAN_MOTIVAZIONI.SetValueListItem(PFL_MOTIVAZIONI_PARTE, (new IDVariant("S")), "Spese", "", "", -1);
    PAN_MOTIVAZIONI.SetValueListItem(PFL_MOTIVAZIONI_PARTE, (new IDVariant("ES")), "Entrate e Spese", "", "", -1);
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, MyGlb.PANEL_LIST, 516, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, MyGlb.PANEL_LIST, 120);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, MyGlb.PANEL_FORM, 120);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_MOTIVAZIONI.SetFieldPage(PFL_MOTIVAZIONI_TIPO, -1, GRP_MOTIVAZIONI_QUADRATURA);
    PAN_MOTIVAZIONI.SetFieldPanel(PFL_MOTIVAZIONI_TIPO, PPQRY_TIPIMOTIVAZ4, "A.TIPO_QUADRATURA", "TIPO_QUADRATURA", 5, 2, 0, -13997);
    PAN_MOTIVAZIONI.SetValueListItem(PFL_MOTIVAZIONI_TIPO, (new IDVariant("ES")), "Entrate-Spese", "", "", -1);
    PAN_MOTIVAZIONI.SetValueListItem(PFL_MOTIVAZIONI_TIPO, (new IDVariant("PM")), "Positive-Negative", "", "", -1);
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, MyGlb.PANEL_LIST, 632, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, MyGlb.PANEL_LIST, 132);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, MyGlb.PANEL_LIST, "Obblig. Competenza");
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, MyGlb.PANEL_FORM, 132);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCOMPET, MyGlb.PANEL_FORM, "Obblig. Competenza");
    PAN_MOTIVAZIONI.SetFieldPage(PFL_MOTIVAZIONI_OBBLIGCOMPET, -1, GRP_MOTIVAZIONI_QUADRATURA);
    PAN_MOTIVAZIONI.SetFieldPanel(PFL_MOTIVAZIONI_OBBLIGCOMPET, PPQRY_TIPIMOTIVAZ4, "A.QUADRATURA_OBBLIG", "QUADRATURA_OBBLIG", 5, 2, 0, -13997);
    PAN_MOTIVAZIONI.SetValueListItem(PFL_MOTIVAZIONI_OBBLIGCOMPET, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_MOTIVAZIONI.SetValueListItem(PFL_MOTIVAZIONI_OBBLIGCOMPET, (new IDVariant()), "Null", "", "", -1);
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, MyGlb.PANEL_LIST, 752, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, MyGlb.PANEL_LIST, 172);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, MyGlb.PANEL_LIST, "Obblig. Cassa");
    PAN_MOTIVAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, MyGlb.PANEL_FORM, 4, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, MyGlb.PANEL_FORM, 172);
    PAN_MOTIVAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVAZIONI_OBBLIGCASSA, MyGlb.PANEL_FORM, "Obblig. Cassa");
    PAN_MOTIVAZIONI.SetFieldPage(PFL_MOTIVAZIONI_OBBLIGCASSA, -1, GRP_MOTIVAZIONI_QUADRATURA);
    PAN_MOTIVAZIONI.SetFieldPanel(PFL_MOTIVAZIONI_OBBLIGCASSA, PPQRY_TIPIMOTIVAZ4, "A.QUADRATURA_OBBLIG_CASSA", "QUADRATURA_OBBLIG_CASSA", 5, 2, 0, -13997);
    PAN_MOTIVAZIONI.SetValueListItem(PFL_MOTIVAZIONI_OBBLIGCASSA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_MOTIVAZIONI.SetValueListItem(PFL_MOTIVAZIONI_OBBLIGCASSA, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_MOTIVAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MOTIVAZIONI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIMPVBICOD, ");
    SQL.append("  A.ORDINAMENTO as TIPIMPVBIORD, ");
    SQL.append("  A.DESCRIZIONE as TIPIMPVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_IMPORTO_VBIL A ");
    SQL.append("where (A.CODICE = ~~TIPO_IMPORTO~~) ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_MOTIVAZIONI.SetQuery(PPQRY_TIPIIMPOVBIL, 0, SQL, PFL_MOTIVAZIONI_TIPOIMPORTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIMPVBICOD, ");
    SQL.append("  A.ORDINAMENTO as TIPIMPVBIORD, ");
    SQL.append("  A.DESCRIZIONE as TIPIMPVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_IMPORTO_VBIL A ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_MOTIVAZIONI.SetQuery(PPQRY_TIPIIMPOVBIL, 1, SQL, PFL_MOTIVAZIONI_TIPOIMPORTO, "");
    PAN_MOTIVAZIONI.SetQueryDB(PPQRY_TIPIIMPOVBIL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MOTIVAZIONI.SetIMDB(IMDB, "PQRY_TIPIMOTIVAZ4", true);
    PAN_MOTIVAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "TIPI MOTIVAZIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_IMPORTO as TIPO_IMPORTO, ");
    SQL.append("  A.PARTE as PARTE, ");
    SQL.append("  A.TIPO_QUADRATURA as TIPO_QUADRATURA, ");
    SQL.append("  A.QUADRATURA_OBBLIG as QUADRATURA_OBBLIG, ");
    SQL.append("  A.QUADRATURA_OBBLIG_CASSA as QUADRATURA_OBBLIG_CASSA ");
    PAN_MOTIVAZIONI.SetQuery(PPQRY_TIPIMOTIVAZ4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
    PAN_MOTIVAZIONI.SetQuery(PPQRY_TIPIMOTIVAZ4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOTIVAZIONI.SetQuery(PPQRY_TIPIMOTIVAZ4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOTIVAZIONI.SetQuery(PPQRY_TIPIMOTIVAZ4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOTIVAZIONI.SetQuery(PPQRY_TIPIMOTIVAZ4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MOTIVAZIONI.SetQuery(PPQRY_TIPIMOTIVAZ4, 5, SQL, -1, "");
    PAN_MOTIVAZIONI.SetQueryDB(PPQRY_TIPIMOTIVAZ4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MOTIVAZIONI.SetMasterTable(0, "TIPI_MOTIVAZIONE_VBIL");
    PAN_MOTIVAZIONI.AddToSortList(PFL_MOTIVAZIONI_CODICE1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MOTIVAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_MOTIVAZIONI.iUseListQBE;
      PAN_MOTIVAZIONI.iUseListQBE = 0;
      PAN_MOTIVAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MOTIVAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_MOTIVAZIONI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_TIPIVARIAZIO_Init()
  {

    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, "AD7BF0DA-D540-445F-88DB-7A4516B0DB85");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, "Codice");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, "02391F05-713C-493A-9E98-40E911B907F7");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, "Descrizione");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, "F72B7F4D-48F7-475D-8DCE-60FCE3A8FA40");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, "Tipologia");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, "B01978CC-057F-4347-9542-1E6551797D17");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, "5DFCC1AE-40FE-49C6-AB35-D4E85D48DE4D");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, "985D68C5-BE7A-4AE4-AC87-9B9E47BF52E4");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, "2E541961-01FD-4075-8F41-0A3691B49E42");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPIVARIAZIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_CODICE, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_CODICE, PPQRY_T80, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 392, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_DESCRIZIONE, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_DESCRIZIONE, PPQRY_T80, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, MyGlb.PANEL_LIST, 396, 36, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, MyGlb.PANEL_LIST, 64);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, MyGlb.PANEL_LIST, "Tipologia");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, MyGlb.PANEL_FORM, 88);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOLOGIA, MyGlb.PANEL_FORM, "Tipologia");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_TIPOLOGIA, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_TIPOLOGIA, PPQRY_T80, "A.TIPOLOGIA", "TIPOLOGIA", 5, 3, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_LIST, 488, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 76, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_UTENTEINSERI, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_UTENTEINSERI, PPQRY_T80, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_LIST, 608, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 100, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_DATAINSERIME, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_DATAINSERIME, PPQRY_T80, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 716, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 124, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_UTENTULTIAGG, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_UTENTULTIAGG, PPQRY_T80, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 828, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_DATAULTIMAGG, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_DATAULTIMAGG, PPQRY_T80, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_TIPIVARIAZIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIVARIAZIO.SetIMDB(IMDB, "PQRY_T80", true);
    PAN_TIPIVARIAZIO.set_SetString(MyGlb.MASTER_ROWNAME, "T54");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPOLOGIA as TIPOLOGIA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T80, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T80, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPOLOGIA = ~~PQRY_TIPIMOTIVAZ4.CODICE~~) ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T80, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T80, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T80, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T80, 5, SQL, -1, "");
    PAN_TIPIVARIAZIO.SetQueryDB(PPQRY_T80, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIVARIAZIO.SetMasterTable(0, "T54");
    PAN_TIPIVARIAZIO.AddToSortList(PFL_TIPIVARIAZIO_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIVARIAZIO.Status() == 2)
    {
      int oldListQBE = PAN_TIPIVARIAZIO.iUseListQBE;
      PAN_TIPIVARIAZIO.iUseListQBE = 0;
      PAN_TIPIVARIAZIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIVARIAZIO.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIVARIAZIO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MOTIVAZIONI) PAN_MOTIVAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOTIVAZIONI) PAN_MOTIVAZIONI_ValidateRow(Cancel);
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MOTIVAZIONI) PAN_MOTIVAZIONI_DynamicProperties();
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOTIVAZIONI) PAN_MOTIVAZIONI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MOTIVAZIONI) PAN_MOTIVAZIONI_OnChangeRow();
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
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_MOTIVAZIONI) PAN_MOTIVAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
