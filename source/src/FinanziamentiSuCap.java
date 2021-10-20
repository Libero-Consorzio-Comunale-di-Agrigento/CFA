// **********************************************
// Finanziamenti Su Cap
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FinanziamentiSuCap extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FINANZIAMENT_LABEL = 0;
  private static int PFL_FINANZIAMENT_ESERCIZIO = 1;
  private static int PFL_FINANZIAMENT_ES = 2;
  private static int PFL_FINANZIAMENT_CAPITOLO = 3;
  private static int PFL_FINANZIAMENT_ARTICOLO = 4;
  private static int PFL_FINANZIAMENT_UTENTEINSERI = 5;
  private static int PFL_FINANZIAMENT_DATAINSERIME = 6;
  private static int PFL_FINANZIAMENT_UTENTULTIAGG = 7;
  private static int PFL_FINANZIAMENT_DATAULTIMAGG = 8;
  private static int PFL_FINANZIAMENT_SCADENZA = 9;
  private static int PFL_FINANZIAMENT_FINANZIAMENT = 10;
  private static int PFL_FINANZIAMENT_FINANZDESCRI = 11;
  private static int PFL_FINANZIAMENT_FINLABEL = 12;

  private static int PPQRY_CAPFIN = 0;

  private static int PPQRY_FINANZIAMENT = 1;


  IDPanel PAN_FINANZIAMENT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS14(IMDB);
    //
    //
    Init_PQRY_CAPFIN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS14, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS14, "TBL_PARS14");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS14,IMDBDef3.FLD_PARS14_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS14,IMDBDef3.FLD_PARS14_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS14,IMDBDef3.FLD_PARS14_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS14,IMDBDef3.FLD_PARS14_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS14,IMDBDef3.FLD_PARS14_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS14,IMDBDef3.FLD_PARS14_NOMEOGGEARTI,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS14, 0);
  }

  private static void Init_PQRY_CAPFIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CAPFIN, 10);
    IMDB.set_TblCode(IMDBDef10.PQRY_CAPFIN, "PQRY_CAPFIN");
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_SCADENZA,8,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAPFIN,IMDBDef10.PQSL_CAPFIN_FINANZIAMENTO,1,5,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CAPFIN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FinanziamentiSuCap(MyWebEntryPoint w, IMDBObj imdb)
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
  public FinanziamentiSuCap()
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
    FormIdx = MyGlb.FRM_FINANZISUCAP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C96D733A-949D-4E7D-A3B1-CD7A178BD8C5";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 516;
    DesignHeight = 418;
    set_Caption(new IDVariant("Finanziamenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 516;
    Frames[1].Height = 392;
    Frames[1].Caption = "Finanziamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 392;
    PAN_FINANZIAMENT = new IDPanel(w, this, 1, "PAN_FINANZIAMENT");
    Frames[1].Content = PAN_FINANZIAMENT;
    PAN_FINANZIAMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZIAMENT.VS = MainFrm.VisualStyleList;
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 516-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "81F9ECD2-11F3-4493-8530-6D27B3526A12");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 44, 416, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FINANZIAMENT.InitStatus = 2;
    PAN_FINANZIAMENT_Init();
    PAN_FINANZIAMENT_InitFields();
    PAN_FINANZIAMENT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG160+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG158+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG160+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVOFIANAZI+BaseCmdLinIdx)
      {
        NuovoFianaziamento();
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
      PAN_FINANZIAMENT.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_ELENCOFINANZ && flRis && IdxPanelActived == PAN_FINANZIAMENT.FrIndex)
    {
      if (IdxFieldActived ==PFL_FINANZIAMENT_FINANZIAMENT) {
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
    return (obj instanceof FinanziamentiSuCap);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FinanziamentiSuCap.class.getName() : (Glb.ClassWithPackage(FinanziamentiSuCap.class) ? FinanziamentiSuCap.class.getName().substring(FinanziamentiSuCap.class.getPackage().getName().length() + 1) : FinanziamentiSuCap.class.getName()));
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Capitolo/Art.")), (new IDVariant(" "))), ((IMDB.Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMENTSPE, 0).equals((new IDVariant("E"))))?(new IDVariant("di Entrata")):(new IDVariant("di Spesa")))), (new IDVariant(":"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARS14, IMDBDef3.FLD_PARS14_NOMEOGGECAPI, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARS14, IMDBDef3.FLD_PARS14_NOMEOGGECAPI, 0))).stringValue());
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSuCap", "Load", _e);
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
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_ELENCOFINANZ)), true))
        {
          IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_FINANZIAMENTO, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME24, IMDBDef7.PQSL_FINANZIAME24_FINANZCODICE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSuCap", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FINANZIAMENT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FINANZIAMENT);
      // 
      // Finanziamenti On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_FINANZDESCRI,(new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_FINANZDESCRI))).stringValue()); 
      if (!(PAN_FINANZIAMENT.IsNewRow()))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSuCap", "FinanziamentiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FINANZIAMENT_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_E_S, 0, IMDB.Value(IMDBDef3.TBL_PARS14, IMDBDef3.FLD_PARS14_NOMEOGGETTES, 0));
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_CAPITOLO, 0, IMDB.Value(IMDBDef3.TBL_PARS14, IMDBDef3.FLD_PARS14_NOMEOGGECAPI, 0));
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_ARTICOLO, 0, IMDB.Value(IMDBDef3.TBL_PARS14, IMDBDef3.FLD_PARS14_NOMEOGGEARTI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSuCap", "FinanziamentiBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FINANZIAMENT_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef10.PQRY_CAPFIN, IMDBDef10.PQSL_CAPFIN_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSuCap", "FinanziamentiBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Seleziona Finanziamento
  // **********************************************************************
  public int SelezionaFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Finanziamento Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_ELENCOFINANZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSuCap", "SelezionaFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo Fianaziamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int NuovoFianaziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Fianaziamento Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0, (new IDVariant("N")));
      MainFrm.Show(MyGlb.FRM_FINANZIAMENT, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSuCap", "NuovoFianaziamento", _e);
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
  private void PAN_FINANZIAMENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FINANZIAMENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FINANZIAMENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FINANZIAMENT, Cancel);
    // Stub
  }

  private void PAN_FINANZIAMENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FINANZIAMENT_FINANZIAMENT)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FINANZIAMENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FINANZIAMENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FINANZIAMENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FINANZIAMENT_Init()
  {

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, "B6640354-9404-4D54-985F-07BE7B222DDE");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, "3B53F069-51E4-4676-AD56-9EE4F62A6474");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, "Esercizio");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, "333C5BE7-8BC2-41FA-AA71-6FBE7D33372C");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, "ES");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "F9BFEAD7-4A9D-4008-AC8D-69DD34809AA7");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "Capitolo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "3E7C3F25-012B-4428-BDE6-39855E2AD9AC");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "Articolo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, "4C49D374-6E9C-4A04-8317-169EFA3A82EF");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, "14494BBF-A14B-4856-B620-3E1D6B7592E7");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, "BA452E75-4FDE-47A1-ABBB-603E36D962BE");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, "29D49860-A84A-435E-93A5-DE5F44E19BE1");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, "2EC6D921-DD44-4DE1-9D52-4748B0D26838");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, "Scadenza");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, "63DC9FEF-8DF7-4D7E-AA52-8D9BDFC0DF59");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, "FINANZIAMENTO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, "EB70EF63-0A80-42E1-9725-2742A9F65C15");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, "FINANZIAMENTI DESCRIZIONE");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, "61ABF3A3-3C9F-43A2-8BB3-F849573EBDBB");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, "Finanziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_FINANZIAMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, MyGlb.PANEL_LIST, 0, 12, 416, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, MyGlb.PANEL_FORM, -4, 12, 600, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABEL, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABEL, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ESERCIZIO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ESERCIZIO, PPQRY_CAPFIN, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, MyGlb.PANEL_LIST, 68, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, MyGlb.PANEL_LIST, 24);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, MyGlb.PANEL_LIST, "ES");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, MyGlb.PANEL_FORM, 4, 28, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, MyGlb.PANEL_FORM, 24);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ES, MyGlb.PANEL_FORM, "ES");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ES, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ES, PPQRY_CAPFIN, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 108, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPITOLO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPITOLO, PPQRY_CAPFIN, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 220, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ARTICOLO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ARTICOLO, PPQRY_CAPFIN, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, 20, 248, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 100, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, 128);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_UTENTEINSERI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_UTENTEINSERI, PPQRY_CAPFIN, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, 304, 244, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, 4, 124, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DATAINSERIME, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DATAINSERIME, PPQRY_CAPFIN, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 36, 284, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 124);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_UTENTULTIAGG, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_UTENTULTIAGG, PPQRY_CAPFIN, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 324, 288, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 172, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 116);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DATAULTIMAGG, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DATAULTIMAGG, PPQRY_CAPFIN, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_LIST, 0, 96, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_FORM, 4, 196, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_SCADENZA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_SCADENZA, PPQRY_CAPFIN, "A.SCADENZA", "SCADENZA", 8, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 80, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZ.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZIAMENTO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_FINANZIAMENT, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_FINANZIAMENT, PPQRY_CAPFIN, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_LIST, 56, 80, 360, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_LIST, "FINANZIAMENTI DESCRIZIONE");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_FORM, 4, 244, 684, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_FORM, "FINANZIAMENTI DESCRIZIONE");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_FINANZDESCRI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, MyGlb.PANEL_LIST, 0, 44, 416, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, MyGlb.PANEL_LIST, 2);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, MyGlb.PANEL_FORM, 0, 60, 284, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINLABEL, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_FINLABEL, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_FINLABEL, -1, "", "FINLABEL", 0, 0, 0, -13997);
  }

  private void PAN_FINANZIAMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_FINANZIAMENT.SetIMDB(IMDB, "PQRY_CAPFIN", true);
    PAN_FINANZIAMENT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_CAPFIN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP_FIN A ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_CAPFIN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARS14.NOMEOGGETTES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARS14.NOMEOGGECAPI~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARS14.NOMEOGGEARTI~~) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_CAPFIN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_CAPFIN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_CAPFIN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_CAPFIN, 5, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_CAPFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(0, "CAP_FIN");
    PAN_FINANZIAMENT.AddToSortList(PFL_FINANZIAMENT_FINANZIAMENT, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FINANZIAMENT.Status() == 2)
    {
      int oldListQBE = PAN_FINANZIAMENT.iUseListQBE;
      PAN_FINANZIAMENT.iUseListQBE = 0;
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_FIND);
      PAN_FINANZIAMENT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
