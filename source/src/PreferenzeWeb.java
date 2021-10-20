// **********************************************
// Preferenze Web
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PreferenzeWeb extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREFERENZWEB_DISTINTE = 0;

  private static int PFL_PREFERENZWEB_PROGRESSIVO = 0;
  private static int PFL_PREFERENZWEB_OTTICA = 1;
  private static int PFL_PREFERENZWEB_SUDDUNITSUP2 = 2;
  private static int PFL_PREFERENZWEB_SUDDIVISIONE = 3;
  private static int PFL_PREFERENZWEB_TIPOASSEGSO4 = 4;
  private static int PFL_PREFERENZWEB_UTENTEINSERI = 5;
  private static int PFL_PREFERENZWEB_DATAINSERIME = 6;
  private static int PFL_PREFERENZWEB_UTENTULTIAGG = 7;
  private static int PFL_PREFERENZWEB_DATAULTIMAGG = 8;
  private static int PFL_PREFERENZWEB_COMPESUFINAN = 9;
  private static int PFL_PREFERENZWEB_GESTATTDILIQ = 10;
  private static int PFL_PREFERENZWEB_DATASTRUORGA = 11;
  private static int PFL_PREFERENZWEB_PLUGINSFERA = 12;
  private static int PFL_PREFERENZWEB_PLUGINDISTLI = 13;
  private static int PFL_PREFERENZWEB_PLUGINDISTOR = 14;
  private static int PFL_PREFERENZWEB_PLUGINDISTEC = 15;
  private static int PFL_PREFERENZWEB_RUORESUNIORG = 16;
  private static int PFL_PREFERENZWEB_SUDDIVUFFICI = 17;
  private static int PFL_PREFERENZWEB_OTTICAISTITU = 18;
  private static int PFL_PREFERENZWEB_ANAGRACONDIV = 19;
  private static int PFL_PREFERENZWEB_ATTILIGHT = 20;

  private static int PPQRY_PARAMETRIWEB = 0;

  private static int PPQRY_OTTICHEENTI = 1;

  private static int PPQRY_OTTICHEIST = 2;
  private static int PPQRY_SUSTENTI1 = 3;
  private static int PPQRY_SUDDIVSTRUTT = 4;
  private static int PPQRY_RUOLI = 5;
  private static int PPQRY_SUSTENTI = 6;


  IDPanel PAN_PREFERENZWEB;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PARAMETRIWEB(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PARAMETRIWEB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRIWEB, 20);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRIWEB, "PQRY_PARAMETRIWEB");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PROGRESSIVO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_OTTICA, "OTTICA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_OTTICA,5,18,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_SUDDIVISIONE_UNITA_SUP, "SUDDIVISIONE_UNITA_SUP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_SUDDIVISIONE_UNITA_SUP,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_DATA_STRUTTURA_ORGANIZZATIVA, "DATA_STRUTTURA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_DATA_STRUTTURA_ORGANIZZATIVA,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_COMPETENZA_FINANZIAMENTI, "COMPETENZA_FINANZIAMENTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_COMPETENZA_FINANZIAMENTI,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_ATTI_LIQ, "ATTI_LIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_ATTI_LIQ,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_RUOLO_RESP_UO, "RUOLO_RESP_UO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_RUOLO_RESP_UO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_TIPO_ASSEGNAZIONE_SO4, "TIPO_ASSEGNAZIONE_SO4");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_TIPO_ASSEGNAZIONE_SO4,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_SUDDIVISIONE_UFFICIO, "SUDDIVISIONE_UFFICIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_SUDDIVISIONE_UFFICIO,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_SUDDIVISIONE_UNITA_SUP_2, "SUDDIVISIONE_UNITA_SUP_2");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_SUDDIVISIONE_UNITA_SUP_2,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_SFERA, "PLUGIN_SFERA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_SFERA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_DISTLIQ, "PLUGIN_DISTLIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_DISTLIQ,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_DISTORD, "PLUGIN_DISTORD");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_DISTORD,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_DISTECON, "PLUGIN_DISTECON");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_DISTECON,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_ANAGRAFE_CONDIVISA, "ANAGRAFE_CONDIVISA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_ANAGRAFE_CONDIVISA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_ATTI_LIGHT, "ATTI_LIGHT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRIWEB,IMDBDef9.PQSL_PARAMETRIWEB_ATTI_LIGHT,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRIWEB, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PreferenzeWeb(MyWebEntryPoint w, IMDBObj imdb)
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
  public PreferenzeWeb()
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
    FormIdx = MyGlb.FRM_PREFERENZWEB;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EFDB455C-ED7C-4713-8140-937ED31A7958";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 736;
    DesignHeight = 422;
    set_Caption(new IDVariant("Preferenze Web"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 736;
    Frames[1].Height = 396;
    Frames[1].Caption = "Preferenze Web";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 396;
    PAN_PREFERENZWEB = new IDPanel(w, this, 1, "PAN_PREFERENZWEB");
    Frames[1].Content = PAN_PREFERENZWEB;
    PAN_PREFERENZWEB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREFERENZWEB.VS = MainFrm.VisualStyleList;
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 736-MyGlb.PAN_OFFS_X, 396-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C01DE3B9-A9D5-487D-B12C-1B654491FC1B");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2188, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREFERENZWEB.InitStatus = 2;
    PAN_PREFERENZWEB_Init();
    PAN_PREFERENZWEB_InitFields();
    PAN_PREFERENZWEB_InitQueries();
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
      PAN_PREFERENZWEB.UpdatePanel(MainFrm);
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
    return (obj instanceof PreferenzeWeb);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PreferenzeWeb.class.getName() : (Glb.ClassWithPackage(PreferenzeWeb.class) ? PreferenzeWeb.class.getName().substring(PreferenzeWeb.class.getPackage().getName().length() + 1) : PreferenzeWeb.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Preferenze Web After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PREFERENZWEB_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Preferenze Web After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_PREFERENZWEB.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_PREFERENZWEB.PanelCommand(Glb.PCM_INSERT);
        ProponiOttica();
        PAN_PREFERENZWEB.UpdatePanel(MainFrm);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PreferenzeWeb", "PreferenzeWebAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Preferenze Web Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_PREFERENZWEB_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Preferenze Web Before Insert Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_UTENTE_INSERIMENTO, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_DATA_INSERIMENTO, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_DATA_INSERIMENTO, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PreferenzeWeb", "PreferenzeWebBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Preferenze Web Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_PREFERENZWEB_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Preferenze Web Before Update Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_UTENTE_ULTIMO_AGG, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_DATA_ULTIMO_AGG, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PreferenzeWeb", "PreferenzeWebBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Preferenze Web After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_PREFERENZWEB_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Preferenze Web After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        MainFrm.SettaParametriWEB();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PreferenzeWeb", "PreferenzeWebAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Preferenze Web On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREFERENZWEB_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREFERENZWEB);
      // 
      // Preferenze Web On Dynamic Properties Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_PREFERENZWEB.FieldText(PFL_PREFERENZWEB_OTTICAISTITU))).equals((new IDVariant("SI")), true))
      {
        PAN_PREFERENZWEB.SetFlags (Glb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PREFERENZWEB.SetFlags (Glb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_SFERA, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_PREFERENZWEB.SetFlags (Glb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PREFERENZWEB.SetFlags (Glb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PreferenzeWeb", "PreferenzeWebOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Preferenze Web On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PREFERENZWEB_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Preferenze Web On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PREFERENZWEB_OTTICA)), true) && FieldWasModified.booleanValue())
      {
        if ((new IDVariant(PAN_PREFERENZWEB.FieldText(PFL_PREFERENZWEB_OTTICAISTITU))).compareTo((new IDVariant("SI")), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_TIPO_ASSEGNAZIONE_SO4, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PREFERENZWEB_PLUGINSFERA)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_SFERA, 0).compareTo((new IDVariant("SI")), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_DISTLIQ, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_DISTORD, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_PLUGIN_DISTECON, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PreferenzeWeb", "PreferenzeWebOnUpdatingRow", _e);
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
      PAN_PREFERENZWEB.SetFlags (Glb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_PREFERENZWEB.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PREFERENZWEB.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PreferenzeWeb", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Proponi Ottica
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ProponiOttica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Ottica Body
      // Procedure Body
      // 
      IDVariant v_VOTTICA = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MIN(A.OTTICA) as MINOTTENTOTT ");
      SQL.append("from ");
      SQL.append("  SO4_OTTICHE_ENTI A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_VOTTICA = QV.Get("MINOTTENTOTT", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRIWEB, IMDBDef9.PQSL_PARAMETRIWEB_OTTICA, 0, new IDVariant(v_VOTTICA));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PreferenzeWeb", "ProponiOttica", _e);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PREFERENZWEB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREFERENZWEB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREFERENZWEB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREFERENZWEB, Cancel);
    // Stub
  }

  private void PAN_PREFERENZWEB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PREFERENZWEB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PREFERENZWEB_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PREFERENZWEB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREFERENZWEB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREFERENZWEB_Init()
  {

    PAN_PREFERENZWEB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREFERENZWEB.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, "CB22D03B-5162-4A4F-A5FD-367FF826D901");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, "Distinte Gestite da Plugin");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, MyGlb.PANEL_LIST, 0, -9999, 108, 16, 0, 0);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, MyGlb.PANEL_FORM, 464, 207, 228, 97, 0, 0);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, 0, 44);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, 1, 13);
    PAN_PREFERENZWEB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, 0, 4);
    PAN_PREFERENZWEB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, 1, 4);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_GROUP, GRP_PREFERENZWEB_DISTINTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREFERENZWEB.SetSize(MyGlb.OBJ_FIELD, 21);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, "CF38B3F9-CB5F-4DF3-836B-74F1160179D4");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, "PROGRESSIVO");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, "0EB47F49-2D0F-42DB-B771-F67CBE40BC64");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, "Ottica");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, MyGlb.VIS_NORMALFIELDS);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, "9E2D428B-F80C-4671-BDDB-08AFFBD30880");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, "2° Suddivisione");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, MyGlb.VIS_NORMALFIELDS);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, "48641427-D954-426B-AA00-9E9071CD2272");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, "1° Suddivisione");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, "62906E83-D05A-42BC-B08B-1B688F7FB1E5");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, "Tipo Assegnazione");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, MyGlb.VIS_OPTIONBUTTON);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, "14A7B938-AED6-499D-A9A0-C56805974E84");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, "0D52D851-CC27-4342-AA32-8F6E3B0AD16A");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, "DATA INSERIMENTO");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, "5BC4E195-9DE2-487E-A65B-010B9922DE39");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, "7929DD59-87A4-4320-B119-3DDA900D1995");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, "E8356BBE-A952-433C-9E94-DA6E908A4FD1");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, "Competenza su Finanziamenti");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, MyGlb.VIS_CHECKSTYLE);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, "CEAB94F8-7216-4D16-876C-3F581482A669");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, "Gestione Atti di Liquidazione");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, MyGlb.VIS_CHECKSTYLE);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, "A40098EF-FC20-4588-872D-5BDBD68F6D76");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, "Data Struttura Organizzativa");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, "6F8A4090-5DFB-49ED-8BC4-C347CBE14896");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, "Plugin Sfera");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, MyGlb.VIS_CHECKSTYLE);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, "48A945D1-D2F1-4D94-A4C6-F905F163D288");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, "Distinte Liquidazione");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, "F915EBAC-D436-4F38-AA5C-9D9EB376903F");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, "Distinte Liquidazioni Ordini");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, "09874ACD-0CD5-48EC-A760-62BD82407855");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, "Distinte Economato");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, MyGlb.VIS_CHECKSTYLE);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, "CD46F470-C911-4F37-B9E3-EA82F7FE75D4");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, "Ruolo Resp. Unità Org.");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, "Ruolo Resp. Unità Org.");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, MyGlb.VIS_NORMALFIELDS);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, "0DEE09B2-891B-4929-A82E-BBCBF46908D7");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, "Suddivisione Ufficio");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, MyGlb.VIS_NORMALFIELDS);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, "ACEF7D83-CA24-4C17-A722-C80DD855B878");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, "OTTICA ISTITUZIONALE");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, 0, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, "10DA9826-2D00-4FF3-90CA-3FB4F88DAA81");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, "Anagrafe Condivisa");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, "Anagrafe COndivisa");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERENZWEB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, "5615E45C-7EC6-4A52-8E4D-E9B1C1C63AEE");
    PAN_PREFERENZWEB.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, "Atti Light");
    PAN_PREFERENZWEB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, "");
    PAN_PREFERENZWEB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, MyGlb.VIS_CHECKSTYLE);
    PAN_PREFERENZWEB.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PREFERENZWEB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, MyGlb.PANEL_FORM, 96);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_PROGRESSIVO, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_PROGRESSIVO, PPQRY_PARAMETRIWEB, "A.PROGRESSIVO", "PROGRESSIVO", 1, 1, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, MyGlb.PANEL_LIST, 48);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, MyGlb.PANEL_LIST, "Ottica");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, MyGlb.PANEL_FORM, 100, 20, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, MyGlb.PANEL_FORM, 56);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICA, MyGlb.PANEL_FORM, "Ottica");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_OTTICA, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_OTTICA, PPQRY_PARAMETRIWEB, "A.OTTICA", "OTTICA", 5, 18, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, MyGlb.PANEL_LIST, 164);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, MyGlb.PANEL_LIST, "2° Suddivisione");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, MyGlb.PANEL_FORM, 20, 44, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, MyGlb.PANEL_FORM, 136);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDUNITSUP2, MyGlb.PANEL_FORM, "2° Suddivisione");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_SUDDUNITSUP2, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_SUDDUNITSUP2, PPQRY_PARAMETRIWEB, "A.SUDDIVISIONE_UNITA_SUP_2", "SUDDIVISIONE_UNITA_SUP_2", 1, 8, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, MyGlb.PANEL_LIST, 136);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, MyGlb.PANEL_LIST, "1° Suddivisione");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, MyGlb.PANEL_FORM, 20, 68, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, MyGlb.PANEL_FORM, 136);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVISIONE, MyGlb.PANEL_FORM, "1° Suddivisione");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_SUDDIVISIONE, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_SUDDIVISIONE, PPQRY_PARAMETRIWEB, "A.SUDDIVISIONE_UNITA_SUP", "SUDDIVISIONE_UNITA_SUP", 1, 8, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, MyGlb.PANEL_LIST, 148);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, MyGlb.PANEL_LIST, "Tipo Assegnazione");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, MyGlb.PANEL_FORM, 40, 92, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, MyGlb.PANEL_FORM, 116);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_TIPOASSEGSO4, MyGlb.PANEL_FORM, "Tipo Assegnazione");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_TIPOASSEGSO4, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_TIPOASSEGSO4, PPQRY_PARAMETRIWEB, "A.TIPO_ASSEGNAZIONE_SO4", "TIPO_ASSEGNAZIONE_SO4", 5, 4, 0, -13997);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_TIPOASSEGSO4, (new IDVariant("I")), "Istituzionale", "", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_TIPOASSEGSO4, (new IDVariant("F")), "Funzionale", "", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_TIPOASSEGSO4, (new IDVariant()), "Tutte", "", "", -1);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, MyGlb.PANEL_FORM, 0, 72, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_UTENTEINSERI, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_UTENTEINSERI, PPQRY_PARAMETRIWEB, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, MyGlb.PANEL_FORM, 0, 96, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_DATAINSERIME, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_DATAINSERIME, PPQRY_PARAMETRIWEB, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, MyGlb.PANEL_FORM, 0, 120, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_UTENTULTIAGG, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_UTENTULTIAGG, PPQRY_PARAMETRIWEB, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, MyGlb.PANEL_FORM, 0, 144, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_DATAULTIMAGG, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_DATAULTIMAGG, PPQRY_PARAMETRIWEB, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, MyGlb.PANEL_LIST, 0, 36, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, MyGlb.PANEL_LIST, 172);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, MyGlb.PANEL_LIST, "Competenza su Finanziamenti");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, MyGlb.PANEL_FORM, 236, 140, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, MyGlb.PANEL_FORM, 180);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_COMPESUFINAN, MyGlb.PANEL_FORM, "Competenza su Finanziamenti");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_COMPESUFINAN, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_COMPESUFINAN, PPQRY_PARAMETRIWEB, "A.COMPETENZA_FINANZIAMENTI", "COMPETENZA_FINANZIAMENTI", 5, 2, 0, -13997);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_COMPESUFINAN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_COMPESUFINAN, (new IDVariant()), "Null", "", "", -1);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, MyGlb.PANEL_LIST, 60);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, MyGlb.PANEL_LIST, "Gest. Att. di Liquid.");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, MyGlb.PANEL_FORM, 248, 164, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, MyGlb.PANEL_FORM, 168);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_GESTATTDILIQ, MyGlb.PANEL_FORM, "Gestione Atti di Liquidazione");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_GESTATTDILIQ, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_GESTATTDILIQ, PPQRY_PARAMETRIWEB, "A.ATTI_LIQ", "ATTI_LIQ", 5, 2, 0, -13997);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_GESTATTDILIQ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_GESTATTDILIQ, (new IDVariant()), "Null", "", "", -1);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, MyGlb.PANEL_LIST, 208);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, MyGlb.PANEL_LIST, "Data Struttura Organizzativa");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, MyGlb.PANEL_FORM, 176, 116, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, MyGlb.PANEL_FORM, 176);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_DATASTRUORGA, MyGlb.PANEL_FORM, "Data Struttura Organizzativa");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_DATASTRUORGA, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_DATASTRUORGA, PPQRY_PARAMETRIWEB, "A.DATA_STRUTTURA_ORGANIZZATIVA", "DATA_STRUTTURA_ORGANIZZATIVA", 6, 10, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, MyGlb.PANEL_LIST, 88);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, MyGlb.PANEL_LIST, "Plugin Sfera");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, MyGlb.PANEL_FORM, 328, 188, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, MyGlb.PANEL_FORM, 88);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINSFERA, MyGlb.PANEL_FORM, "Plugin Sfera");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_PLUGINSFERA, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_PLUGINSFERA, PPQRY_PARAMETRIWEB, "A.PLUGIN_SFERA", "PLUGIN_SFERA", 5, 2, 0, -13997);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_PLUGINSFERA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_PLUGINSFERA, (new IDVariant()), "Null", "", "", -1);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, MyGlb.PANEL_LIST, 100);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, MyGlb.PANEL_LIST, "Dist. Liquid.");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, MyGlb.PANEL_FORM, 476, 232, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, MyGlb.PANEL_FORM, 188);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTLI, MyGlb.PANEL_FORM, "Distinte Liquidazione");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_PLUGINDISTLI, -1, GRP_PREFERENZWEB_DISTINTE);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_PLUGINDISTLI, PPQRY_PARAMETRIWEB, "A.PLUGIN_DISTLIQ", "PLUGIN_DISTLIQ", 5, 2, 0, -13997);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_PLUGINDISTLI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_PLUGINDISTLI, (new IDVariant()), "Null", "", "", -1);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, MyGlb.PANEL_LIST, 104);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, MyGlb.PANEL_LIST, "Dist. Liquid. Ord.");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, MyGlb.PANEL_FORM, 472, 256, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, MyGlb.PANEL_FORM, 192);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTOR, MyGlb.PANEL_FORM, "Distinte Liquidazioni Ordini");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_PLUGINDISTOR, -1, GRP_PREFERENZWEB_DISTINTE);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_PLUGINDISTOR, PPQRY_PARAMETRIWEB, "A.PLUGIN_DISTORD", "PLUGIN_DISTORD", 5, 2, 0, -13997);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_PLUGINDISTOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_PLUGINDISTOR, (new IDVariant()), "Null", "", "", -1);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, MyGlb.PANEL_LIST, 108);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, MyGlb.PANEL_LIST, "Dist. Economato");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, MyGlb.PANEL_FORM, 468, 280, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, MyGlb.PANEL_FORM, 196);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_PLUGINDISTEC, MyGlb.PANEL_FORM, "Distinte Economato");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_PLUGINDISTEC, -1, GRP_PREFERENZWEB_DISTINTE);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_PLUGINDISTEC, PPQRY_PARAMETRIWEB, "A.PLUGIN_DISTECON", "PLUGIN_DISTECON", 5, 2, 0, -13997);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_PLUGINDISTEC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_PLUGINDISTEC, (new IDVariant()), "Null", "", "", -1);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, MyGlb.PANEL_LIST, 96);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, MyGlb.PANEL_LIST, "Ruolo Resp. Unità Org.");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, MyGlb.PANEL_FORM, 72, 236, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, MyGlb.PANEL_FORM, 136);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_RUORESUNIORG, MyGlb.PANEL_FORM, "Ruolo Resp. Unità Org.");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_RUORESUNIORG, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_RUORESUNIORG, PPQRY_PARAMETRIWEB, "A.RUOLO_RESP_UO", "RUOLO_RESP_UO", 5, 8, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, MyGlb.PANEL_LIST, 140);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, MyGlb.PANEL_LIST, "Suddivisione Ufficio");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, MyGlb.PANEL_FORM, 36, 260, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, MyGlb.PANEL_FORM, 120);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_SUDDIVUFFICI, MyGlb.PANEL_FORM, "Suddivisione Ufficio");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_SUDDIVUFFICI, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_SUDDIVUFFICI, PPQRY_PARAMETRIWEB, "A.SUDDIVISIONE_UFFICIO", "SUDDIVISIONE_UFFICIO", 1, 8, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, MyGlb.PANEL_LIST, 0, 36, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, MyGlb.PANEL_LIST, 220);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, MyGlb.PANEL_LIST, "OTTICA ISTITUZIONALE");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, MyGlb.PANEL_FORM, 4, 192, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, MyGlb.PANEL_FORM, 220);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_OTTICAISTITU, MyGlb.PANEL_FORM, "OTTICA ISTITUZIONALE");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_OTTICAISTITU, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_OTTICAISTITU, PPQRY_OTTICHEENTI, "A.OTTICA_ISTITUZIONALE", "OTTENTOTTIST", 5, 2, 0, -13997);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, MyGlb.PANEL_LIST, 132);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, MyGlb.PANEL_LIST, "Anagrafe Condivisa");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, MyGlb.PANEL_FORM, 284, 284, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, MyGlb.PANEL_FORM, 132);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ANAGRACONDIV, MyGlb.PANEL_FORM, "Anagrafe Condivisa");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_ANAGRACONDIV, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_ANAGRACONDIV, PPQRY_PARAMETRIWEB, "A.ANAGRAFE_CONDIVISA", "ANAGRAFE_CONDIVISA", 5, 2, 0, -13997);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_ANAGRACONDIV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_ANAGRACONDIV, (new IDVariant()), "Null", "", "", -1);
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, MyGlb.PANEL_LIST, 72);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, MyGlb.PANEL_LIST, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, MyGlb.PANEL_LIST, "Atti Light");
    PAN_PREFERENZWEB.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, MyGlb.PANEL_FORM, 328, 212, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERENZWEB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, MyGlb.PANEL_FORM, 88);
    PAN_PREFERENZWEB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, MyGlb.PANEL_FORM, 1);
    PAN_PREFERENZWEB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERENZWEB_ATTILIGHT, MyGlb.PANEL_FORM, "Atti Light");
    PAN_PREFERENZWEB.SetFieldPage(PFL_PREFERENZWEB_ATTILIGHT, -1, -1);
    PAN_PREFERENZWEB.SetFieldPanel(PFL_PREFERENZWEB_ATTILIGHT, PPQRY_PARAMETRIWEB, "A.ATTI_LIGHT", "ATTI_LIGHT", 5, 2, 0, -13997);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_ATTILIGHT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREFERENZWEB.SetValueListItem(PFL_PREFERENZWEB_ATTILIGHT, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PREFERENZWEB_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREFERENZWEB.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OTTICA_ISTITUZIONALE as OTTENTOTTIST ");
    SQL.append("from ");
    SQL.append("  SO4_OTTICHE_ENTI A ");
    SQL.append("where (A.OTTICA = ~~OTTICA~~) ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_OTTICHEENTI, 0, SQL, -1, "");
    PAN_PREFERENZWEB.SetQueryDB(PPQRY_OTTICHEENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREFERENZWEB.SetMasterTable(PPQRY_OTTICHEENTI, "SO4_OTTICHE_ENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OTTICA as OTTISTOTENOT, ");
    SQL.append("  A.OTTICA || ' - ' || A.DESCRIZIONE as OTTICISTDESC ");
    SQL.append("from ");
    SQL.append("  SO4_OTTICHE_ENTI A ");
    SQL.append("where (A.OTTICA = ~~OTTICA~~) ");
    SQL.append("order by ");
    SQL.append("  A.OTTICA ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_OTTICHEIST, 0, SQL, PFL_PREFERENZWEB_OTTICA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OTTICA as OTTISTOTENOT, ");
    SQL.append("  A.OTTICA || ' - ' || A.DESCRIZIONE as OTTICISTDESC ");
    SQL.append("from ");
    SQL.append("  SO4_OTTICHE_ENTI A ");
    SQL.append("order by ");
    SQL.append("  A.OTTICA ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_OTTICHEIST, 1, SQL, PFL_PREFERENZWEB_OTTICA, "");
    PAN_PREFERENZWEB.SetQueryDB(PPQRY_OTTICHEIST, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SUDDIVISIONE as SUSTENTIDSUD, ");
    SQL.append("  A.DESCRIZIONE as SUSTENTIDESC ");
    SQL.append("from ");
    SQL.append("  SO4_SUST_ENTI A ");
    SQL.append("where (A.ID_SUDDIVISIONE = ~~SUDDIVISIONE_UNITA_SUP_2~~) ");
    SQL.append("and   (A.OTTICA = ~~OTTICA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_SUSTENTI1, 0, SQL, PFL_PREFERENZWEB_SUDDUNITSUP2, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SUDDIVISIONE as SUSTENTIDSUD, ");
    SQL.append("  A.DESCRIZIONE as SUSTENTIDESC ");
    SQL.append("from ");
    SQL.append("  SO4_SUST_ENTI A ");
    SQL.append("where (A.OTTICA = ~~OTTICA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_SUSTENTI1, 1, SQL, PFL_PREFERENZWEB_SUDDUNITSUP2, "");
    PAN_PREFERENZWEB.SetQueryDB(PPQRY_SUSTENTI1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SUDDIVISIONE as SUSTSUENIDSU, ");
    SQL.append("  A.DESCRIZIONE as SUDSTRSUENDE ");
    SQL.append("from ");
    SQL.append("  SO4_SUST_ENTI A ");
    SQL.append("where (A.ID_SUDDIVISIONE = ~~SUDDIVISIONE_UNITA_SUP~~) ");
    SQL.append("and   (A.OTTICA = ~~OTTICA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_SUDDIVSTRUTT, 0, SQL, PFL_PREFERENZWEB_SUDDIVISIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SUDDIVISIONE as SUSTSUENIDSU, ");
    SQL.append("  A.DESCRIZIONE as SUDSTRSUENDE ");
    SQL.append("from ");
    SQL.append("  SO4_SUST_ENTI A ");
    SQL.append("where (A.OTTICA = ~~OTTICA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_SUDDIVSTRUTT, 1, SQL, PFL_PREFERENZWEB_SUDDIVISIONE, "");
    PAN_PREFERENZWEB.SetQueryDB(PPQRY_SUDDIVSTRUTT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RUOLO as RUOLIRUOLO, ");
    SQL.append("  A.RUOLO || ' - ' || A.DESCRIZIONE as RUOLIDESCRIZ ");
    SQL.append("from ");
    SQL.append("  AD4_RUOLI A ");
    SQL.append("where (A.RUOLO = ~~RUOLO_RESP_UO~~) ");
    SQL.append("and   (A.GRUPPO_SO = 'S') ");
    SQL.append("and   (A.GRUPPO_LAVORO = 'S') ");
    SQL.append("and   (A.STATO = 'U') ");
    SQL.append("order by 1, 2 ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_RUOLI, 0, SQL, PFL_PREFERENZWEB_RUORESUNIORG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RUOLO as RUOLIRUOLO, ");
    SQL.append("  A.RUOLO || ' - ' || A.DESCRIZIONE as RUOLIDESCRIZ ");
    SQL.append("from ");
    SQL.append("  AD4_RUOLI A ");
    SQL.append("where (A.GRUPPO_SO = 'S') ");
    SQL.append("and   (A.GRUPPO_LAVORO = 'S') ");
    SQL.append("and   (A.STATO = 'U') ");
    SQL.append("order by 1, 2 ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_RUOLI, 1, SQL, PFL_PREFERENZWEB_RUORESUNIORG, "");
    PAN_PREFERENZWEB.SetQueryDB(PPQRY_RUOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SUDDIVISIONE as SUSTENTIDSUD, ");
    SQL.append("  A.DESCRIZIONE as SUSTENTIDESC ");
    SQL.append("from ");
    SQL.append("  SO4_SUST_ENTI A ");
    SQL.append("where (A.ID_SUDDIVISIONE = ~~SUDDIVISIONE_UFFICIO~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_SUSTENTI, 0, SQL, PFL_PREFERENZWEB_SUDDIVUFFICI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SUDDIVISIONE as SUSTENTIDSUD, ");
    SQL.append("  A.DESCRIZIONE as SUSTENTIDESC ");
    SQL.append("from ");
    SQL.append("  SO4_SUST_ENTI A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_SUSTENTI, 1, SQL, PFL_PREFERENZWEB_SUDDIVUFFICI, "");
    PAN_PREFERENZWEB.SetQueryDB(PPQRY_SUSTENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREFERENZWEB.SetIMDB(IMDB, "PQRY_PARAMETRIWEB", true);
    PAN_PREFERENZWEB.set_SetString(MyGlb.MASTER_ROWNAME, "PARAMETRI WEB");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.OTTICA as OTTICA, ");
    SQL.append("  A.SUDDIVISIONE_UNITA_SUP as SUDDIVISIONE_UNITA_SUP, ");
    SQL.append("  A.DATA_STRUTTURA_ORGANIZZATIVA as DATA_STRUTTURA_ORGANIZZATIVA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.COMPETENZA_FINANZIAMENTI as COMPETENZA_FINANZIAMENTI, ");
    SQL.append("  A.ATTI_LIQ as ATTI_LIQ, ");
    SQL.append("  A.RUOLO_RESP_UO as RUOLO_RESP_UO, ");
    SQL.append("  A.TIPO_ASSEGNAZIONE_SO4 as TIPO_ASSEGNAZIONE_SO4, ");
    SQL.append("  A.SUDDIVISIONE_UFFICIO as SUDDIVISIONE_UFFICIO, ");
    SQL.append("  A.SUDDIVISIONE_UNITA_SUP_2 as SUDDIVISIONE_UNITA_SUP_2, ");
    SQL.append("  A.PLUGIN_SFERA as PLUGIN_SFERA, ");
    SQL.append("  A.PLUGIN_DISTLIQ as PLUGIN_DISTLIQ, ");
    SQL.append("  A.PLUGIN_DISTORD as PLUGIN_DISTORD, ");
    SQL.append("  A.PLUGIN_DISTECON as PLUGIN_DISTECON, ");
    SQL.append("  A.ANAGRAFE_CONDIVISA as ANAGRAFE_CONDIVISA, ");
    SQL.append("  A.ATTI_LIGHT as ATTI_LIGHT ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_PARAMETRIWEB, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAMETRI_WEB A ");
    PAN_PREFERENZWEB.SetQuery(PPQRY_PARAMETRIWEB, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREFERENZWEB.SetQuery(PPQRY_PARAMETRIWEB, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREFERENZWEB.SetQuery(PPQRY_PARAMETRIWEB, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREFERENZWEB.SetQuery(PPQRY_PARAMETRIWEB, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREFERENZWEB.SetQuery(PPQRY_PARAMETRIWEB, 5, SQL, -1, "");
    PAN_PREFERENZWEB.SetQueryDB(PPQRY_PARAMETRIWEB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREFERENZWEB.SetMasterTable(0, "PARAMETRI_WEB");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREFERENZWEB.Status() == 2)
    {
      int oldListQBE = PAN_PREFERENZWEB.iUseListQBE;
      PAN_PREFERENZWEB.iUseListQBE = 0;
      PAN_PREFERENZWEB.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREFERENZWEB.PanelCommand(Glb.PCM_FIND);
      PAN_PREFERENZWEB.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREFERENZWEB) PAN_PREFERENZWEB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREFERENZWEB) PAN_PREFERENZWEB_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREFERENZWEB) PAN_PREFERENZWEB_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREFERENZWEB) PAN_PREFERENZWEB_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREFERENZWEB) PAN_PREFERENZWEB_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREFERENZWEB) PAN_PREFERENZWEB_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_PREFERENZWEB) PAN_PREFERENZWEB_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_PREFERENZWEB) PAN_PREFERENZWEB_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PREFERENZWEB) PAN_PREFERENZWEB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
