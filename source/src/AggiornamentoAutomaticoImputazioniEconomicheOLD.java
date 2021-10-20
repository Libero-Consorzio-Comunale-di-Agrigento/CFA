// **********************************************
// Aggiornamento Automatico Imputazioni Economiche OLD
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoAutomaticoImputazioniEconomicheOLD extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_MOVIMDAIMPUT_MOVIMDAIMPUT = 0;

  private static int PFL_MOVIMDAIMPUT_LABEL1 = 0;
  private static int PFL_MOVIMDAIMPUT_OK = 1;
  private static int PFL_MOVIMDAIMPUT_ANNULLA = 2;
  private static int PFL_MOVIMDAIMPUT_IMPEESUBIMPE = 3;
  private static int PFL_MOVIMDAIMPUT_ACCERTAMENTI = 4;
  private static int PFL_MOVIMDAIMPUT_LIQUIDAZIONI = 5;
  private static int PFL_MOVIMDAIMPUT_ORDINATIVI = 6;

  private static int PPQRY_PARAMETRI460 = 0;


  IDPanel PAN_MOVIMDAIMPUT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI116(IMDB);
    //
    //
    Init_PQRY_PARAMETRI460(IMDB);
    Init_PQRY_PARAMETRI460_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI116(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI116, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI116, "TBL_PARAMETRI116");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI116,IMDBDef3.FLD_PARAMETRI116_ROWNAMIMPSUB, "ROWNAMIMPSUB");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI116,IMDBDef3.FLD_PARAMETRI116_ROWNAMIMPSUB,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI116,IMDBDef3.FLD_PARAMETRI116_ROWNAMEACCER, "ROWNAMEACCER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI116,IMDBDef3.FLD_PARAMETRI116_ROWNAMEACCER,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI116,IMDBDef3.FLD_PARAMETRI116_ROWNAMELIQUI, "ROWNAMELIQUI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI116,IMDBDef3.FLD_PARAMETRI116_ROWNAMELIQUI,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI116,IMDBDef3.FLD_PARAMETRI116_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI116,IMDBDef3.FLD_PARAMETRI116_ROWNAMEORDIN,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI116, 0);
  }

  private static void Init_PQRY_PARAMETRI460(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI460, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI460, "PQRY_PARAMETRI460");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI460,IMDBDef10.PQSL_PARAMETRI460_ROWNAMIMPSUB, "ROWNAMIMPSUB");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI460,IMDBDef10.PQSL_PARAMETRI460_ROWNAMIMPSUB,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI460,IMDBDef10.PQSL_PARAMETRI460_ROWNAMEACCER, "ROWNAMEACCER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI460,IMDBDef10.PQSL_PARAMETRI460_ROWNAMEACCER,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI460,IMDBDef10.PQSL_PARAMETRI460_ROWNAMELIQUI, "ROWNAMELIQUI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI460,IMDBDef10.PQSL_PARAMETRI460_ROWNAMELIQUI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI460,IMDBDef10.PQSL_PARAMETRI460_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI460,IMDBDef10.PQSL_PARAMETRI460_ROWNAMEORDIN,1,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI460, 0);
  }

  private static void Init_PQRY_PARAMETRI460_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI460_RS, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI460_RS, "PQRY_PARAMETRI460_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI460_RS,IMDBDef10.PQSL_PARAMETRI460_ROWNAMIMPSUB, "ROWNAMIMPSUB");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI460_RS,IMDBDef10.PQSL_PARAMETRI460_ROWNAMIMPSUB,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI460_RS,IMDBDef10.PQSL_PARAMETRI460_ROWNAMEACCER, "ROWNAMEACCER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI460_RS,IMDBDef10.PQSL_PARAMETRI460_ROWNAMEACCER,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI460_RS,IMDBDef10.PQSL_PARAMETRI460_ROWNAMELIQUI, "ROWNAMELIQUI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI460_RS,IMDBDef10.PQSL_PARAMETRI460_ROWNAMELIQUI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI460_RS,IMDBDef10.PQSL_PARAMETRI460_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI460_RS,IMDBDef10.PQSL_PARAMETRI460_ROWNAMEORDIN,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoAutomaticoImputazioniEconomicheOLD(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoAutomaticoImputazioniEconomicheOLD()
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
    FormIdx = MyGlb.FRM_AGGAUTIMECOL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "54C80BA5-59FE-4940-8CA8-AA20D739FD54";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 500;
    DesignHeight = 286;
    set_Caption(new IDVariant("Aggiornamento Automatico Imputazioni Economiche OLD"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 500;
    Frames[1].Height = 260;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Movimenti Da Imputare";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 260;
    PAN_MOVIMDAIMPUT = new IDPanel(w, this, 1, "PAN_MOVIMDAIMPUT");
    Frames[1].Content = PAN_MOVIMDAIMPUT;
    PAN_MOVIMDAIMPUT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MOVIMDAIMPUT.VS = MainFrm.VisualStyleList;
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 500-MyGlb.PAN_OFFS_X, 260-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MOVIMDAIMPUT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "854954BD-BEA3-462D-A29D-17EB8DBC6BC8");
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 336, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MOVIMDAIMPUT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MOVIMDAIMPUT.InitStatus = 2;
    PAN_MOVIMDAIMPUT_Init();
    PAN_MOVIMDAIMPUT_InitFields();
    PAN_MOVIMDAIMPUT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI116, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGAUTIMECOL_PARAMETRI460();
      }
      PAN_MOVIMDAIMPUT.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornamentoAutomaticoImputazioniEconomicheOLD);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoAutomaticoImputazioniEconomicheOLD.class.getName() : (Glb.ClassWithPackage(AggiornamentoAutomaticoImputazioniEconomicheOLD.class) ? AggiornamentoAutomaticoImputazioniEconomicheOLD.class.getName().substring(AggiornamentoAutomaticoImputazioniEconomicheOLD.class.getPackage().getName().length() + 1) : AggiornamentoAutomaticoImputazioniEconomicheOLD.class.getName()));
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMIMPSUB, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMEACCER, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMELIQUI, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMEORDIN, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoImputazioniEconomicheOLD", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // OK P
  // **********************************************************************
  public int OKP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // OK P Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMEORDIN, 0).equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMELIQUI, 0).equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMEACCER, 0).equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMIMPSUB, 0).equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("Specificarne almeno uno"))); 
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        // MainFrm.Cf4armDBObject.IMPUTAECOMOVIMENTI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoImputazioniEconomicheOLD", "OKP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla P
  // **********************************************************************
  public int AnnullaP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla P Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoImputazioniEconomicheOLD", "AnnullaP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void AGGAUTIMECOL_PARAMETRI460() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI460_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI116, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI116, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI460_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI460_RS, 0, IMDBDef3.TBL_PARAMETRI116, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI460_RS, 0, 0, IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMIMPSUB, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI460_RS, 1, 0, IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMEACCER, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI460_RS, 2, 0, IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMELIQUI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI460_RS, 3, 0, IMDBDef3.TBL_PARAMETRI116, IMDBDef3.FLD_PARAMETRI116_ROWNAMEORDIN, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI116, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI116, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI116, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI460_RS, 0);
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
  private void PAN_MOVIMDAIMPUT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MOVIMDAIMPUT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MOVIMDAIMPUT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MOVIMDAIMPUT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MOVIMDAIMPUT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MOVIMDAIMPUT);
    // Stub
  }

  private void PAN_MOVIMDAIMPUT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_MOVIMDAIMPUT_OK)
    {
      this.IdxPanelActived = this.PAN_MOVIMDAIMPUT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OKP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMDAIMPUT_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_MOVIMDAIMPUT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AnnullaP();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_MOVIMDAIMPUT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MOVIMDAIMPUT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MOVIMDAIMPUT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MOVIMDAIMPUT_Init()
  {

    PAN_MOVIMDAIMPUT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MOVIMDAIMPUT.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_MOVIMDAIMPUT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, "B70E305A-615A-4E10-BD9E-3153D304A614");
    PAN_MOVIMDAIMPUT.set_Header(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, "Movimenti da Imputare");
    PAN_MOVIMDAIMPUT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, "");
    PAN_MOVIMDAIMPUT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, MyGlb.VIS_GROUPSTYLE);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, MyGlb.PANEL_LIST, 0, -9999, 336, 16, 0, 0);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, MyGlb.PANEL_FORM, 20, 91, 428, 77, 0, 0);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, 0, 134);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, 1, 13);
    PAN_MOVIMDAIMPUT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, 0, 4);
    PAN_MOVIMDAIMPUT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, 1, 4);
    PAN_MOVIMDAIMPUT.SetFlags(MyGlb.OBJ_GROUP, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MOVIMDAIMPUT.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_MOVIMDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, "5BB208BF-719A-428B-A631-BB578B67B098");
    PAN_MOVIMDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, "La presente fase assegna l'imputazione economica (centro e/o fattore) alla movimentazione prescelta, sulla base dell'imputazione indicata nel Piano dei Conti.\nL'aggiornamento viene eseguito solo sui movimenti privi di imputazione, pertanto la fase può essere eseguita più volte.");
    PAN_MOVIMDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, MyGlb.VIS_VUONORALILEF);
    PAN_MOVIMDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MOVIMDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, "17EB26FA-EFD1-41B4-93B0-1AB4E4D6080F");
    PAN_MOVIMDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, "OK");
    PAN_MOVIMDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, MyGlb.VIS_STATICBUTTON);
    PAN_MOVIMDAIMPUT.SetImage(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, 0, "button1.gif", false);
    PAN_MOVIMDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_MOVIMDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, "13A7718E-379C-42D6-93B2-ED69206D3A75");
    PAN_MOVIMDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, "Annulla");
    PAN_MOVIMDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_MOVIMDAIMPUT.SetImage(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, 0, "button1.gif", false);
    PAN_MOVIMDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_MOVIMDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, "688FDC77-F0C6-411D-8178-6E74B4523A60");
    PAN_MOVIMDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, "Impegni e Sub-Impegni");
    PAN_MOVIMDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, "");
    PAN_MOVIMDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, MyGlb.VIS_CHECKSTYLE);
    PAN_MOVIMDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, "25445952-7437-4B3D-8680-32E8A905B13E");
    PAN_MOVIMDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, "Accertamenti");
    PAN_MOVIMDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, "");
    PAN_MOVIMDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, MyGlb.VIS_CHECKSTYLE);
    PAN_MOVIMDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, "263673FC-C041-46ED-9C65-48FEAA9FFC67");
    PAN_MOVIMDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, "Liquidazioni");
    PAN_MOVIMDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, "");
    PAN_MOVIMDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_MOVIMDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, "3A23A881-227B-48C9-BDAD-82F527311E93");
    PAN_MOVIMDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, "Ordinativi");
    PAN_MOVIMDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, "");
    PAN_MOVIMDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, MyGlb.VIS_CHECKSTYLE);
    PAN_MOVIMDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MOVIMDAIMPUT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, MyGlb.PANEL_LIST, 32, 12, 492, 128, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, MyGlb.PANEL_LIST, 9);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, MyGlb.PANEL_FORM, 16, 8, 468, 76, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LABEL1, MyGlb.PANEL_FORM, 5);
    PAN_MOVIMDAIMPUT.SetFieldPage(PFL_MOVIMDAIMPUT_LABEL1, -1, -1);
    PAN_MOVIMDAIMPUT.SetFieldPanel(PFL_MOVIMDAIMPUT_LABEL1, -1, "", "LABEL1", 0, 0, 0, -13997);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, MyGlb.PANEL_LIST, 220, 204, 60, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, MyGlb.PANEL_FORM, 272, 196, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_OK, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMDAIMPUT.SetFieldPage(PFL_MOVIMDAIMPUT_OK, -1, -1);
    PAN_MOVIMDAIMPUT.SetFieldPanel(PFL_MOVIMDAIMPUT_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, MyGlb.PANEL_LIST, 308, 204, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, MyGlb.PANEL_FORM, 364, 196, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMDAIMPUT.SetFieldPage(PFL_MOVIMDAIMPUT_ANNULLA, -1, -1);
    PAN_MOVIMDAIMPUT.SetFieldPanel(PFL_MOVIMDAIMPUT_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, MyGlb.PANEL_LIST, 104);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, MyGlb.PANEL_LIST, "I. e S. I.");
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, MyGlb.PANEL_FORM, 24, 116, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, MyGlb.PANEL_FORM, 140);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_IMPEESUBIMPE, MyGlb.PANEL_FORM, "Impegni e Sub-Impegni");
    PAN_MOVIMDAIMPUT.SetFieldPage(PFL_MOVIMDAIMPUT_IMPEESUBIMPE, -1, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT);
    PAN_MOVIMDAIMPUT.SetFieldPanel(PFL_MOVIMDAIMPUT_IMPEESUBIMPE, PPQRY_PARAMETRI460, "A.ROWNAMIMPSUB", "ROWNAMIMPSUB", 1, 1, 0, -13997);
    PAN_MOVIMDAIMPUT.SetValueListItem(PFL_MOVIMDAIMPUT_IMPEESUBIMPE, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_MOVIMDAIMPUT.SetValueListItem(PFL_MOVIMDAIMPUT_IMPEESUBIMPE, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, MyGlb.PANEL_LIST, 40, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, MyGlb.PANEL_LIST, 72);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, MyGlb.PANEL_LIST, "Accertamenti");
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, MyGlb.PANEL_FORM, 316, 116, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, MyGlb.PANEL_FORM, 104);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ACCERTAMENTI, MyGlb.PANEL_FORM, "Accertamenti");
    PAN_MOVIMDAIMPUT.SetFieldPage(PFL_MOVIMDAIMPUT_ACCERTAMENTI, -1, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT);
    PAN_MOVIMDAIMPUT.SetFieldPanel(PFL_MOVIMDAIMPUT_ACCERTAMENTI, PPQRY_PARAMETRI460, "A.ROWNAMEACCER", "ROWNAMEACCER", 1, 1, 0, -13997);
    PAN_MOVIMDAIMPUT.SetValueListItem(PFL_MOVIMDAIMPUT_ACCERTAMENTI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_MOVIMDAIMPUT.SetValueListItem(PFL_MOVIMDAIMPUT_ACCERTAMENTI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, MyGlb.PANEL_LIST, 144, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, MyGlb.PANEL_LIST, 64);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, MyGlb.PANEL_LIST, "Liquidazioni");
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, MyGlb.PANEL_FORM, 44, 144, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, MyGlb.PANEL_FORM, 120);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_LIQUIDAZIONI, MyGlb.PANEL_FORM, "Liquidazioni");
    PAN_MOVIMDAIMPUT.SetFieldPage(PFL_MOVIMDAIMPUT_LIQUIDAZIONI, -1, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT);
    PAN_MOVIMDAIMPUT.SetFieldPanel(PFL_MOVIMDAIMPUT_LIQUIDAZIONI, PPQRY_PARAMETRI460, "A.ROWNAMELIQUI", "ROWNAMELIQUI", 1, 1, 0, -13997);
    PAN_MOVIMDAIMPUT.SetValueListItem(PFL_MOVIMDAIMPUT_LIQUIDAZIONI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_MOVIMDAIMPUT.SetValueListItem(PFL_MOVIMDAIMPUT_LIQUIDAZIONI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, MyGlb.PANEL_LIST, 248, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, MyGlb.PANEL_LIST, 56);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, MyGlb.PANEL_LIST, "Ordinativi");
    PAN_MOVIMDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, MyGlb.PANEL_FORM, 320, 144, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, MyGlb.PANEL_FORM, 100);
    PAN_MOVIMDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMDAIMPUT_ORDINATIVI, MyGlb.PANEL_FORM, "Ordinativi");
    PAN_MOVIMDAIMPUT.SetFieldPage(PFL_MOVIMDAIMPUT_ORDINATIVI, -1, GRP_MOVIMDAIMPUT_MOVIMDAIMPUT);
    PAN_MOVIMDAIMPUT.SetFieldPanel(PFL_MOVIMDAIMPUT_ORDINATIVI, PPQRY_PARAMETRI460, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 1, 1, 0, -13997);
    PAN_MOVIMDAIMPUT.SetValueListItem(PFL_MOVIMDAIMPUT_ORDINATIVI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_MOVIMDAIMPUT.SetValueListItem(PFL_MOVIMDAIMPUT_ORDINATIVI, (new IDVariant(0)), "Zero", "", "", -1);
  }

  private void PAN_MOVIMDAIMPUT_InitQueries()
  {
    StringBuffer SQL;

    PAN_MOVIMDAIMPUT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MOVIMDAIMPUT.SetIMDB(IMDB, "PQRY_PARAMETRI460", true);
    PAN_MOVIMDAIMPUT.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_MOVIMDAIMPUT.SetQueryIMDB(PPQRY_PARAMETRI460, IMDBDef10.PQRY_PARAMETRI460_RS, IMDBDef3.TBL_PARAMETRI116);
    JustLoaded = true;
    PAN_MOVIMDAIMPUT.SetFieldPrimaryIndex(PFL_MOVIMDAIMPUT_IMPEESUBIMPE, IMDBDef3.FLD_PARAMETRI116_ROWNAMIMPSUB);
    PAN_MOVIMDAIMPUT.SetFieldPrimaryIndex(PFL_MOVIMDAIMPUT_ACCERTAMENTI, IMDBDef3.FLD_PARAMETRI116_ROWNAMEACCER);
    PAN_MOVIMDAIMPUT.SetFieldPrimaryIndex(PFL_MOVIMDAIMPUT_LIQUIDAZIONI, IMDBDef3.FLD_PARAMETRI116_ROWNAMELIQUI);
    PAN_MOVIMDAIMPUT.SetFieldPrimaryIndex(PFL_MOVIMDAIMPUT_ORDINATIVI, IMDBDef3.FLD_PARAMETRI116_ROWNAMEORDIN);
    PAN_MOVIMDAIMPUT.SetMasterTable(0, "PARAMETRI116");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MOVIMDAIMPUT.Status() == 2)
    {
      int oldListQBE = PAN_MOVIMDAIMPUT.iUseListQBE;
      PAN_MOVIMDAIMPUT.iUseListQBE = 0;
      PAN_MOVIMDAIMPUT.PanelCommand(Glb.PCM_SEARCH);
      PAN_MOVIMDAIMPUT.PanelCommand(Glb.PCM_FIND);
      PAN_MOVIMDAIMPUT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MOVIMDAIMPUT) PAN_MOVIMDAIMPUT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOVIMDAIMPUT) PAN_MOVIMDAIMPUT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MOVIMDAIMPUT) PAN_MOVIMDAIMPUT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOVIMDAIMPUT) PAN_MOVIMDAIMPUT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MOVIMDAIMPUT) PAN_MOVIMDAIMPUT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
