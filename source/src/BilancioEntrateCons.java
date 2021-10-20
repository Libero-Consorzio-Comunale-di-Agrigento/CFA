// **********************************************
// Bilancio Entrate Cons
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class BilancioEntrateCons extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_BILAENTRCONS_ESERCIZIO = 0;
  private static int PFL_BILAENTRCONS_ETICUTILAVAN = 1;
  private static int PFL_BILAENTRCONS_ETIPREANNPRE = 2;
  private static int PFL_BILAENTRCONS_UTFONDANTLIQ = 3;
  private static int PFL_BILAENTRCONS_ETICHEELABOR = 4;

  private static int PPQRY_BILCONSEQUI5 = 0;


  IDPanel PAN_BILAENTRCONS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI690(IMDB);
    //
    //
    Init_PQRY_BILCONSEQUI5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI690(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI690, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI690, "TBL_PARAMETRI690");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI690,IMDBDef3.FLD_PARAMETRI690_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI690, 0);
  }

  private static void Init_PQRY_BILCONSEQUI5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BILCONSEQUI5, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_BILCONSEQUI5, "PQRY_BILCONSEQUI5");
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI5,IMDBDef12.PQSL_BILCONSEQUI5_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI5,IMDBDef12.PQSL_BILCONSEQUI5_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI5,IMDBDef12.PQSL_BILCONSEQUI5_UT_FONDO_ANTIC_LIQUIDITA, "UT_FONDO_ANTIC_LIQUIDITA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI5,IMDBDef12.PQSL_BILCONSEQUI5_UT_FONDO_ANTIC_LIQUIDITA,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_BILCONSEQUI5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public BilancioEntrateCons(MyWebEntryPoint w, IMDBObj imdb)
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
  public BilancioEntrateCons()
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
    FormIdx = MyGlb.FRM_BILAENTRCONS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CD2763FF-6B57-45E6-B16A-9D830EB930AE";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 496;
    DesignHeight = 198;
    set_Caption(new IDVariant("Bilancio Entrate"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 496;
    Frames[1].Height = 172;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Bilancio Entrate Cons";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 172;
    PAN_BILAENTRCONS = new IDPanel(w, this, 1, "PAN_BILAENTRCONS");
    Frames[1].Content = PAN_BILAENTRCONS;
    PAN_BILAENTRCONS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BILAENTRCONS.VS = MainFrm.VisualStyleList;
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 496-MyGlb.PAN_OFFS_X, 172-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BILAENTRCONS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0D9C7DB1-A498-4C1C-8CA7-F6A2A657DFD8");
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 40, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BILAENTRCONS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BILAENTRCONS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BILAENTRCONS.InitStatus = 2;
    PAN_BILAENTRCONS_Init();
    PAN_BILAENTRCONS_InitFields();
    PAN_BILAENTRCONS_InitQueries();
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
      PAN_BILAENTRCONS.UpdatePanel(MainFrm);
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
    return (obj instanceof BilancioEntrateCons);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BilancioEntrateCons.class.getName() : (Glb.ClassWithPackage(BilancioEntrateCons.class) ? BilancioEntrateCons.class.getName().substring(BilancioEntrateCons.class.getPackage().getName().length() + 1) : BilancioEntrateCons.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Bilancio Entrate Cons On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_BILAENTRCONS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bilancio Entrate Cons On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUI5, IMDBDef12.PQSL_BILCONSEQUI5_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI5, IMDBDef12.PQSL_BILCONSEQUI5_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI5, IMDBDef12.PQSL_BILCONSEQUI5_UT_FONDO_ANTIC_LIQUIDITA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntrateCons", "BilancioEntrateConsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Bilancio Entrate Cons After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_BILAENTRCONS_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bilancio Entrate Cons After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_BILAENTRCONS.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_BILAENTRCONS.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntrateCons", "BilancioEntrateConsAfterFind", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_BILAENTRCONS.Status()).equals((new IDVariant(3)), true))
      {
        PAN_BILAENTRCONS.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_BILAENTRCONS.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPECONS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARANOTESTAM, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
        v_PAR1 = (new IDVariant("SESSIONE"));
        IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
        v_PAR2 = (new IDVariant("ESERCIZIO"));
        MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntrateCons", "EtichettaElabora", _e);
      return -1;
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
      PAN_BILAENTRCONS.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntrateCons", "Load", _e);
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
      if (new IDVariant(PAN_BILAENTRCONS.Status()).equals((new IDVariant(3)), true))
      {
        PAN_BILAENTRCONS.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntrateCons", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI690, IMDBDef3.FLD_PARAMETRI690_PARANOMEFILE, 0, new IDVariant());
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_BILAENTRCONS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BILAENTRCONS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BILAENTRCONS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BILAENTRCONS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BILAENTRCONS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BILAENTRCONS);
    // Stub
  }

  private void PAN_BILAENTRCONS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BILAENTRCONS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_BILAENTRCONS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BILAENTRCONS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_BILAENTRCONS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_BILAENTRCONS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BILAENTRCONS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BILAENTRCONS_Init()
  {

    PAN_BILAENTRCONS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BILAENTRCONS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BILAENTRCONS.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_BILAENTRCONS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, "92A6E102-E953-4565-A038-2AEF1197002A");
    PAN_BILAENTRCONS.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, "ESERCIZIO");
    PAN_BILAENTRCONS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, "");
    PAN_BILAENTRCONS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BILAENTRCONS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_BILAENTRCONS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, "18274FC1-9D58-417F-8B6A-BCAE178EB105");
    PAN_BILAENTRCONS.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, "Utilizzo Avanzo di Amministrazione");
    PAN_BILAENTRCONS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILAENTRCONS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILAENTRCONS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, "C9CA93B2-270F-44C4-8609-CA48BABEC66D");
    PAN_BILAENTRCONS.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, "Previsioni Definitive di Competenza (CP)");
    PAN_BILAENTRCONS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, "");
    PAN_BILAENTRCONS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, MyGlb.VIS_VUOTOGRASSET);
    PAN_BILAENTRCONS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILAENTRCONS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, "ECC4809D-A2BD-49C5-A782-A80CA078534E");
    PAN_BILAENTRCONS.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, "- di cui Utilizzo Fondo anticipazioni di liquidità");
    PAN_BILAENTRCONS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, "");
    PAN_BILAENTRCONS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILAENTRCONS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILAENTRCONS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, "1555C229-AC24-4350-B6A5-12BA7D1D6454");
    PAN_BILAENTRCONS.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, "Elabora");
    PAN_BILAENTRCONS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_BILAENTRCONS.SetImage(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_BILAENTRCONS.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_BILAENTRCONS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRCONS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, MyGlb.PANEL_FORM, 112);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRCONS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_BILAENTRCONS.SetFieldPage(PFL_BILAENTRCONS_ESERCIZIO, -1, -1);
    PAN_BILAENTRCONS.SetFieldPanel(PFL_BILAENTRCONS_ESERCIZIO, PPQRY_BILCONSEQUI5, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, MyGlb.PANEL_LIST, 0);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, MyGlb.PANEL_FORM, 16, 40, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, MyGlb.PANEL_FORM, 0);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICUTILAVAN, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRCONS.SetFieldPage(PFL_BILAENTRCONS_ETICUTILAVAN, -1, -1);
    PAN_BILAENTRCONS.SetFieldPanel(PFL_BILAENTRCONS_ETICUTILAVAN, -1, "", "ETICUTILAVAN", 0, 0, 0, -13997);
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, MyGlb.PANEL_LIST, 0);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, MyGlb.PANEL_FORM, 336, 12, 124, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, MyGlb.PANEL_FORM, 0);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETIPREANNPRE, MyGlb.PANEL_FORM, 3);
    PAN_BILAENTRCONS.SetFieldPage(PFL_BILAENTRCONS_ETIPREANNPRE, -1, -1);
    PAN_BILAENTRCONS.SetFieldPanel(PFL_BILAENTRCONS_ETIPREANNPRE, -1, "", "ETIPREANNPRE", 0, 0, 0, -13997);
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, MyGlb.PANEL_LIST, 80);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRCONS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, MyGlb.PANEL_LIST, "d. c. U. F. a. d. l.");
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, MyGlb.PANEL_FORM, 16, 60, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, MyGlb.PANEL_FORM, 316);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRCONS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_UTFONDANTLIQ, MyGlb.PANEL_FORM, "- di cui Utilizzo Fondo anticipazioni di liquidità");
    PAN_BILAENTRCONS.SetFieldPage(PFL_BILAENTRCONS_UTFONDANTLIQ, -1, -1);
    PAN_BILAENTRCONS.SetFieldPanel(PFL_BILAENTRCONS_UTFONDANTLIQ, PPQRY_BILCONSEQUI5, "A.UT_FONDO_ANTIC_LIQUIDITA", "UT_FONDO_ANTIC_LIQUIDITA", 3, 14, 2, -13997);
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_BILAENTRCONS.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, MyGlb.PANEL_FORM, 380, 108, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRCONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_BILAENTRCONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRCONS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRCONS.SetFieldPage(PFL_BILAENTRCONS_ETICHEELABOR, -1, -1);
    PAN_BILAENTRCONS.SetFieldPanel(PFL_BILAENTRCONS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_BILAENTRCONS_InitQueries()
  {
    StringBuffer SQL;

    PAN_BILAENTRCONS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BILAENTRCONS.SetIMDB(IMDB, "PQRY_BILCONSEQUI5", true);
    PAN_BILAENTRCONS.set_SetString(MyGlb.MASTER_ROWNAME, "BIL CONS EQUILIBRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.UT_FONDO_ANTIC_LIQUIDITA as UT_FONDO_ANTIC_LIQUIDITA ");
    PAN_BILAENTRCONS.SetQuery(PPQRY_BILCONSEQUI5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_CONS_EQUILIBRI A ");
    PAN_BILAENTRCONS.SetQuery(PPQRY_BILCONSEQUI5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_BILAENTRCONS.SetQuery(PPQRY_BILCONSEQUI5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILAENTRCONS.SetQuery(PPQRY_BILCONSEQUI5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILAENTRCONS.SetQuery(PPQRY_BILCONSEQUI5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILAENTRCONS.SetQuery(PPQRY_BILCONSEQUI5, 5, SQL, -1, "");
    PAN_BILAENTRCONS.SetQueryDB(PPQRY_BILCONSEQUI5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BILAENTRCONS.SetMasterTable(0, "BIL_CONS_EQUILIBRI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BILAENTRCONS.Status() == 2)
    {
      int oldListQBE = PAN_BILAENTRCONS.iUseListQBE;
      PAN_BILAENTRCONS.iUseListQBE = 0;
      PAN_BILAENTRCONS.PanelCommand(Glb.PCM_SEARCH);
      PAN_BILAENTRCONS.PanelCommand(Glb.PCM_FIND);
      PAN_BILAENTRCONS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BILAENTRCONS) PAN_BILAENTRCONS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILAENTRCONS) PAN_BILAENTRCONS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BILAENTRCONS) PAN_BILAENTRCONS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILAENTRCONS) PAN_BILAENTRCONS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BILAENTRCONS) PAN_BILAENTRCONS_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_BILAENTRCONS) PAN_BILAENTRCONS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
