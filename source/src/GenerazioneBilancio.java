// **********************************************
// Generazione Bilancio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneBilancio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_GENERABILANC_SORGENTEDATI = 0;
  private static int GRP_GENERABILANC_TIPOBILANCIO = 1;
  private static int GRP_GENERABILANC_ESERCDAGENER = 2;
  private static int GRP_GENERABILANC_PLURIDAGENER = 3;
  private static int GRP_GENERABILANC_STANZDICOMPE = 4;

  private static int PFL_GENERABILANC_SORGDATIBILA = 0;
  private static int PFL_GENERABILANC_ETICHETTASF2 = 1;
  private static int PFL_GENERABILANC_ETICHETTASF3 = 2;
  private static int PFL_GENERABILANC_ETICHETTASF4 = 3;
  private static int PFL_GENERABILANC_ETICHETTASF = 4;
  private static int PFL_GENERABILANC_SOLOFINANZIA = 5;
  private static int PFL_GENERABILANC_TIPODIBILANC = 6;
  private static int PFL_GENERABILANC_ESERCIZIO = 7;
  private static int PFL_GENERABILANC_ESERCIRIFERI = 8;
  private static int PFL_GENERABILANC_ETICHETTASF1 = 9;
  private static int PFL_GENERABILANC_STANZDICOMPE = 10;
  private static int PFL_GENERABILANC_OK = 11;
  private static int PFL_GENERABILANC_ANNULLA = 12;

  private static int PPQRY_OUT8 = 0;


  IDPanel PAN_GENERABILANC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OUT11(IMDB);
    //
    //
    Init_PQRY_OUT8(IMDB);
    Init_PQRY_OUT8_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OUT11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_OUT11, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_OUT11, "TBL_OUT11");
    IMDB.set_FldCode(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ESE_RIF, "ESE_RIF");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ESE_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ROWNAMTIDIBI, "ROWNAMTIDIBI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ROWNAMTIDIBI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ROWNAMSTDICO, "ROWNAMSTDICO");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ROWNAMSTDICO,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ROWNAMSODABI, "ROWNAMSODABI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ROWNAMSODABI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ROWNAMSOLFIN, "ROWNAMSOLFIN");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT11,IMDBDef3.FLD_OUT11_ROWNAMSOLFIN,5,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_OUT11, 0);
  }

  private static void Init_PQRY_OUT8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT8, 6);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT8, "PQRY_OUT8");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ESE_RIF, "ESE_RIF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ESE_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ROWNAMTIDIBI, "ROWNAMTIDIBI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ROWNAMTIDIBI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ROWNAMSTDICO, "ROWNAMSTDICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ROWNAMSTDICO,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ROWNAMSODABI, "ROWNAMSODABI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ROWNAMSODABI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ROWNAMSOLFIN, "ROWNAMSOLFIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8,IMDBDef11.PQSL_OUT8_ROWNAMSOLFIN,5,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_OUT8, 0);
  }

  private static void Init_PQRY_OUT8_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT8_RS, 6);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT8_RS, "PQRY_OUT8_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ESE_RIF, "ESE_RIF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ESE_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ROWNAMTIDIBI, "ROWNAMTIDIBI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ROWNAMTIDIBI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ROWNAMSTDICO, "ROWNAMSTDICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ROWNAMSTDICO,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ROWNAMSODABI, "ROWNAMSODABI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ROWNAMSODABI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ROWNAMSOLFIN, "ROWNAMSOLFIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT8_RS,IMDBDef11.PQSL_OUT8_ROWNAMSOLFIN,5,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneBilancio(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneBilancio()
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
    FormIdx = MyGlb.FRM_GENERABILANC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0F41791A-CAB1-4924-BF87-B3B04E2FBA6B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 420;
    DesignHeight = 374;
    set_Caption(new IDVariant("Generazione Bilancio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 420;
    Frames[1].Height = 348;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Generazione Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_GENERABILANC = new IDPanel(w, this, 1, "PAN_GENERABILANC");
    Frames[1].Content = PAN_GENERABILANC;
    PAN_GENERABILANC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENERABILANC.VS = MainFrm.VisualStyleList;
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 420-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "938CB291-0568-4937-8B23-5E94C7E174C2");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 588, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GENERABILANC.InitStatus = 2;
    PAN_GENERABILANC_Init();
    PAN_GENERABILANC_InitFields();
    PAN_GENERABILANC_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_OUT11, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENERABILANC_OUT8();
      }
      PAN_GENERABILANC.UpdatePanel(MainFrm);
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
    return (obj instanceof GenerazioneBilancio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneBilancio.class.getName() : (Glb.ClassWithPackage(GenerazioneBilancio.class) ? GenerazioneBilancio.class.getName().substring(GenerazioneBilancio.class.getPackage().getName().length() + 1) : GenerazioneBilancio.class.getName()));
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
      IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMSODABI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMTIDIBI, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMSTDICO, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSOLFIN, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneBilancio", "LoadEvent", _e);
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
      UNLOADEVENT_OUTDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneBilancio", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // OUT: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_OUTDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ESERCIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ESE_RIF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMTIDIBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMSTDICO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMSODABI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMSOLFIN, 0, new IDVariant());
  }

  // **********************************************************************
  // Generazione Bilancio On Database Error Event
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
  private void PAN_GENERABILANC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_GENERABILANC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Generazione Bilancio On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneBilancio", "GenerazioneBilancioOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Generazione Bilancio On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_GENERABILANC_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Generazione Bilancio On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_GENERABILANC_ESERCIZIO)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ESERCIZIO, 0, IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0))))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ESE_RIF, 0, IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_GENERABILANC_ESERCIRIFERI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ESE_RIF, 0, IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESE_RIF, 0));
      }
      if (Column.equals((new IDVariant(PFL_GENERABILANC_SORGDATIBILA)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSODABI, 0).equals((new IDVariant("S")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMTIDIBI, 0, (new IDVariant("S")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneBilancio", "GenerazioneBilancioOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Generazione Bilancio On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENERABILANC_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_GENERABILANC);
      // 
      // Generazione Bilancio On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (MainFrm.FINANZIAMENT.booleanValue() && IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMTIDIBI, 0).equals((new IDVariant("S")), true))
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSODABI, 0).equals((new IDVariant("S")), true))
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneBilancio", "GenerazioneBilancioOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Ok Proc
  // **********************************************************************
  public int OkProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_SMS = (new IDVariant("Elaborazione eseguita", IDVariant.STRING));
      // 
      // Ok Proc Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESE_RIF, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare l'esercizio pluriennale e l'esercizio di riferimento"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESE_RIF, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0), true)>0)
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant("L'Esercizio di Riferimento deve essere inferiore all'Esercizio Pluriennale", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MESSAGGIO); 
        return 0;
      }
      // 
      // Se generazione da bilancio simulato a bilancio simulato
      // non deve essere possibile la generazione per lo stesso
      // esercizio
      // 
      if (IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSODABI, 0).equals((new IDVariant("S")), true) && IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESE_RIF, 0).equals(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0), true))
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant("L'Esercizio di Riferimento non può essere uguale all'Esercizio Pluriennale"));
        MainFrm.set_AlertMessage(v_MESSAGGIO); 
        return 0;
      }
      IDVariant v_VESEFINTIPO = null;
      v_VESEFINTIPO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO as ESEFINTIPO ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.FASE_BILANCIO <= 7) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VESEFINTIPO = QV.Get("ESEFINTIPO", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.IsNull(v_VESEFINTIPO))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Esercizio Pluriennale non presente o non abilitato per la Generazione del Bilancio"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSODABI, 0).equals((new IDVariant("E")), true))
      {
        if (IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMTIDIBI, 0).equals((new IDVariant("S")), true))
        {
          if (IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSOLFIN, 0).equals((new IDVariant("SI")), true))
          {
            MainFrm.Cf4armDBObject.BPRGENERAZIONEARMFIN(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESE_RIF, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSTDICO, 0).equals((new IDVariant("P"))))?(new IDVariant("SI")):(new IDVariant("NO"))), IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSOLFIN, 0));
          }
          else
          {
            MainFrm.Cf4armDBObject.BPRGENERAZIONEARM(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESE_RIF, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSTDICO, 0).equals((new IDVariant("P"))))?(new IDVariant("SI")):(new IDVariant("NO"))));
          }
        }
        else
        {
          MainFrm.Cf4armDBObject.BILGENERAZIONEARM(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESE_RIF, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSTDICO, 0).equals((new IDVariant("P"))))?(new IDVariant("SI")):(new IDVariant("NO"))));
        }
      }
      else
      {
        // 
        // Sorgente dati = bilancio simulato
        // 
        if (IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSOLFIN, 0).equals((new IDVariant("SI")), true))
        {
          MainFrm.Cf4armDBObject.BPRGENERAZIONEARMBPRFIN(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESE_RIF, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSTDICO, 0).equals((new IDVariant("P"))))?(new IDVariant("SI")):(new IDVariant("NO"))), IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSOLFIN, 0));
        }
        else
        {
          MainFrm.Cf4armDBObject.BPRGENERAZIONEARMBPR(IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ESE_RIF, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT8, IMDBDef11.PQSL_OUT8_ROWNAMSTDICO, 0).equals((new IDVariant("P"))))?(new IDVariant("SI")):(new IDVariant("NO"))));
        }
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage(v_SMS); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneBilancio", "OkProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Proc
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AnnullaProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Proc Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneBilancio", "AnnullaProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OUT
  // Primary record source for panel data
  // **********************************************************************
  private void GENERABILANC_OUT8() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_OUT8_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_OUT11, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_OUT11, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_OUT8_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_OUT8_RS, 0, IMDBDef3.TBL_OUT11, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT8_RS, 0, 0, IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ESERCIZIO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT8_RS, 1, 0, IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ESE_RIF, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT8_RS, 2, 0, IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMTIDIBI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT8_RS, 3, 0, IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMSTDICO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT8_RS, 4, 0, IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMSODABI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT8_RS, 5, 0, IMDBDef3.TBL_OUT11, IMDBDef3.FLD_OUT11_ROWNAMSOLFIN, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_OUT11, 0);
      if (IMDB.Eof(IMDBDef3.TBL_OUT11, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_OUT11, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_OUT8_RS, 0);
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
  private void PAN_GENERABILANC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GENERABILANC, Cancel);
    // Stub
  }

  private void PAN_GENERABILANC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GENERABILANC_OK)
    {
      this.IdxPanelActived = this.PAN_GENERABILANC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OkProc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENERABILANC_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_GENERABILANC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AnnullaProc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GENERABILANC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_GENERABILANC_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_GENERABILANC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_GENERABILANC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_GENERABILANC_Init()
  {

    PAN_GENERABILANC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GENERABILANC.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, "5A42F715-15B7-4859-8454-8D1ADF62EC85");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, "Sorgente dati");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, MyGlb.PANEL_LIST, 0, -9999, 132, 16, 0, 0);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, MyGlb.PANEL_FORM, 44, 15, 328, 49, 0, 0);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, 0, 77);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, 1, 13);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, 0, 4);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, 1, 4);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_GENERABILANC_SORGENTEDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, "9F3CA5D1-8AD0-4498-AA2B-E15949C924BC");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, "Tipo Bilancio");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, MyGlb.VIS_GROUPSTYLE);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, MyGlb.PANEL_LIST, 0, -9999, 92, 16, 0, 0);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, MyGlb.PANEL_FORM, 44, 75, 328, 81, 0, 0);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, 0, 70);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, 1, 13);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, 0, 4);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, 1, 4);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_GENERABILANC_TIPOBILANCIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, "4C0A1226-F001-4630-87D8-B95949DB04B2");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, "Esercizio da generare");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, MyGlb.VIS_GROUPSTYLE);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, 0, 121);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, 1, 13);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, 0, 4);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, 1, 4);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_GENERABILANC_ESERCDAGENER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, "30673AC3-A46D-412C-A105-6302E1069CA1");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, "Pluriennale da Generare");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, MyGlb.VIS_GROUPSTYLE);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, MyGlb.PANEL_LIST, 0, -9999, 160, 16, 0, 0);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, MyGlb.PANEL_FORM, 44, 169, 328, 49, 0, 0);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, 0, 136);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, 1, 13);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, 0, 4);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, 1, 4);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIDAGENER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, "D507110A-ACCB-4CD1-A4A5-F765AD591C89");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, "Stanziamento di Competenza");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, MyGlb.VIS_GROUPSTYLE);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_LIST, 0, -9999, 176, 16, 0, 0);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_FORM, 44, 229, 328, 49, 0, 0);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, 0, 166);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, 1, 13);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, 0, 4);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, 1, 4);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_GENERABILANC_STANZDICOMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_GENERABILANC.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, "BDD1EF7A-34A8-4021-8D64-DAEE389D87AB");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, "Sorgente Dati Bilancio");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, "C2F3CBB7-5CC8-4B5F-908E-6A03B3DDC27E");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, MyGlb.VIS_SFONEBORDTRA);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, "145A6036-3A91-40CF-9F8F-8B5FFA28C289");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, MyGlb.VIS_SFONEBORDTRA);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, "7261B551-7CAD-44F7-8FB8-7C443F851868");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, MyGlb.VIS_SFONEBORDTRA);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, "AF28095B-BB24-4AE4-843F-629B12847D53");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, "4D931EA4-A5A0-42FE-AD21-33B47B31FB46");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, "Solo Finanziamenti");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, MyGlb.VIS_CHECKSTYLE);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, "1BE93C9D-46DA-444F-B7C9-A0F326A1B173");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, "Tipo Di Bilancio");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, MyGlb.VIS_OPTBUTSENBOR);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, "56E410CF-17E5-40B4-ABDA-E129F293B4E1");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, "Esercizio");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, "102377A8-4114-4C3C-A76A-F9E7CA15C975");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, "Esercizio Riferimento");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, "6B012CAF-0D23-4008-9AD0-95D932BE67A8");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, MyGlb.VIS_SFONEBORDTRA);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, "6BB8C613-DB09-4A8D-A404-12ED95528779");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, "Stanziamento Di Competenza");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, "809BDD57-BD2C-40EB-A0F0-575BAC7FDC98");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, "OK");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.VIS_STATICBUTTON);
    PAN_GENERABILANC.SetImage(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, 0, "button1.gif", false);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, "46280257-6F6D-4BDA-9270-3183CDDDE131");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, "Annulla");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_GENERABILANC.SetImage(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, 0, "button1.gif", false);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_GENERABILANC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, MyGlb.PANEL_LIST, 132);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, MyGlb.PANEL_LIST, "Sorgente Dati Bilancio");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, MyGlb.PANEL_FORM, 132, 40, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, MyGlb.PANEL_FORM, 132);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SORGDATIBILA, MyGlb.PANEL_FORM, "Sorgente Dati Bilancio");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_SORGDATIBILA, -1, GRP_GENERABILANC_SORGENTEDATI);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_SORGDATIBILA, PPQRY_OUT8, "A.ROWNAMSODABI", "ROWNAMSODABI", 5, 1, 0, -13997);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_SORGDATIBILA, (new IDVariant("E")), "Effettivo", "", "", -1);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_SORGDATIBILA, (new IDVariant("S")), "Simulato", "", "", -1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, MyGlb.PANEL_LIST, 52, 56, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, MyGlb.PANEL_FORM, 48, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF2, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ETICHETTASF2, -1, GRP_GENERABILANC_SORGENTEDATI);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ETICHETTASF2, -1, "", "ETICHETTASF2", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, MyGlb.PANEL_LIST, 60, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, MyGlb.PANEL_FORM, 352, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF3, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ETICHETTASF3, -1, GRP_GENERABILANC_SORGENTEDATI);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ETICHETTASF3, -1, "", "ETICHETTASF3", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, MyGlb.PANEL_LIST, 44, 48, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, MyGlb.PANEL_FORM, 48, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF4, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ETICHETTASF4, -1, GRP_GENERABILANC_TIPOBILANCIO);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ETICHETTASF4, -1, "", "ETICHETTASF4", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, MyGlb.PANEL_LIST, 352, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, MyGlb.PANEL_FORM, 352, 136, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ETICHETTASF, -1, GRP_GENERABILANC_TIPOBILANCIO);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, MyGlb.PANEL_LIST, 88);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, MyGlb.PANEL_LIST, "Sl. Finanz.");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, MyGlb.PANEL_FORM, 124, 128, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, MyGlb.PANEL_FORM, 116);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_SOLOFINANZIA, MyGlb.PANEL_FORM, "Solo Finanziamenti");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_SOLOFINANZIA, -1, GRP_GENERABILANC_TIPOBILANCIO);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_SOLOFINANZIA, PPQRY_OUT8, "A.ROWNAMSOLFIN", "ROWNAMSOLFIN", 5, 10, 0, -13997);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_SOLOFINANZIA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_SOLOFINANZIA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, MyGlb.PANEL_LIST, 92);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, MyGlb.PANEL_LIST, "Tipo Di Bilancio");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, MyGlb.PANEL_FORM, 132, 100, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, MyGlb.PANEL_FORM, 92);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_TIPODIBILANC, MyGlb.PANEL_FORM, "Tipo Di Bilancio");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_TIPODIBILANC, -1, GRP_GENERABILANC_TIPOBILANCIO);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_TIPODIBILANC, PPQRY_OUT8, "A.ROWNAMTIDIBI", "ROWNAMTIDIBI", 5, 1, 0, -13997);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_TIPODIBILANC, (new IDVariant("E")), "Effettivo", "", "", -1);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_TIPODIBILANC, (new IDVariant("S")), "Simulato", "", "", -1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, MyGlb.PANEL_FORM, 48, 194, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ESERCIZIO, -1, GRP_GENERABILANC_PLURIDAGENER);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ESERCIZIO, PPQRY_OUT8, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_LIST, 108);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_LIST, "Es. Rf.");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_FORM, 192, 194, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_FORM, 128);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_FORM, "Esercizio Riferimento");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ESERCIRIFERI, -1, GRP_GENERABILANC_PLURIDAGENER);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ESERCIRIFERI, PPQRY_OUT8, "A.ESE_RIF", "ESE_RIF", 1, 4, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, MyGlb.PANEL_LIST, 52, 56, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, MyGlb.PANEL_FORM, 48, 258, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ETICHETTASF1, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ETICHETTASF1, -1, GRP_GENERABILANC_STANZDICOMPE);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ETICHETTASF1, -1, "", "ETICHETTASF1", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_LIST, 176);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_LIST, "Stanziamento Di Competenza");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_FORM, 132, 254, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_FORM, 176);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZDICOMPE, MyGlb.PANEL_FORM, "Stanziamento Di Competenza");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_STANZDICOMPE, -1, GRP_GENERABILANC_STANZDICOMPE);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_STANZDICOMPE, PPQRY_OUT8, "A.ROWNAMSTDICO", "ROWNAMSTDICO", 5, 1, 0, -13997);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_STANZDICOMPE, (new IDVariant("P")), "Puro da Esercizio Rif.", "", "", -1);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_STANZDICOMPE, (new IDVariant("Z")), "a Zero", "", "", -1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_LIST, 184, 260, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_FORM, 200, 298, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_OK, -1, -1);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_LIST, 192, 268, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_FORM, 288, 298, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ANNULLA, -1, -1);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
  }

  private void PAN_GENERABILANC_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENERABILANC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_GENERABILANC.SetIMDB(IMDB, "PQRY_OUT8", true);
    PAN_GENERABILANC.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_GENERABILANC.SetQueryIMDB(PPQRY_OUT8, IMDBDef11.PQRY_OUT8_RS, IMDBDef3.TBL_OUT11);
    JustLoaded = true;
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_SORGDATIBILA, IMDBDef3.FLD_OUT11_ROWNAMSODABI);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_SOLOFINANZIA, IMDBDef3.FLD_OUT11_ROWNAMSOLFIN);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_TIPODIBILANC, IMDBDef3.FLD_OUT11_ROWNAMTIDIBI);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_ESERCIZIO, IMDBDef3.FLD_OUT11_ESERCIZIO);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_ESERCIRIFERI, IMDBDef3.FLD_OUT11_ESE_RIF);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_STANZDICOMPE, IMDBDef3.FLD_OUT11_ROWNAMSTDICO);
    PAN_GENERABILANC.SetMasterTable(0, "OUT11");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GENERABILANC.Status() == 2)
    {
      int oldListQBE = PAN_GENERABILANC.iUseListQBE;
      PAN_GENERABILANC.iUseListQBE = 0;
      PAN_GENERABILANC.PanelCommand(Glb.PCM_SEARCH);
      PAN_GENERABILANC.PanelCommand(Glb.PCM_FIND);
      PAN_GENERABILANC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_GENERABILANC) PAN_GENERABILANC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENERABILANC) PAN_GENERABILANC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_GENERABILANC) PAN_GENERABILANC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENERABILANC) PAN_GENERABILANC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_GENERABILANC) PAN_GENERABILANC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
