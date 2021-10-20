// **********************************************
// Generazione Nuovo Bilancio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneNuovoBilancio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_GENERABILANC_NUOVOBILANCI = 0;
  private static int GRP_GENERABILANC_PLURIENNALE = 1;
  private static int GRP_GENERABILANC_DAESERCIZIO = 2;

  private static int PFL_GENERABILANC_STANZIAAZERO = 0;
  private static int PFL_GENERABILANC_NUOVOBILANCI = 1;
  private static int PFL_GENERABILANC_NEWPANELLAB1 = 2;
  private static int PFL_GENERABILANC_NEWPANELABE2 = 3;
  private static int PFL_GENERABILANC_PLURIENNALE = 4;
  private static int PFL_GENERABILANC_ESERCIRIFERI = 5;
  private static int PFL_GENERABILANC_DABILAEFFSIM = 6;
  private static int PFL_GENERABILANC_DAESERCIZIO = 7;
  private static int PFL_GENERABILANC_NEWPANELLABE = 8;
  private static int PFL_GENERABILANC_NEWPANELABE1 = 9;
  private static int PFL_GENERABILANC_OK = 10;
  private static int PFL_GENERABILANC_ANNULLA = 11;

  private static int PPQRY_OUT1 = 0;


  IDPanel PAN_GENERABILANC;

  // Definition of Global Variables
  private IDVariant TOUCHED = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant TOUCHED2 = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OUT3(IMDB);
    Init_TBL_PARAMETRI119(IMDB);
    //
    //
    Init_PQRY_OUT1(IMDB);
    Init_PQRY_OUT1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OUT3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_OUT3, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_OUT3, "TBL_OUT3");
    IMDB.set_FldCode(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMNUOBIL, "ROWNAMNUOBIL");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMNUOBIL,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMESERIF, "ROWNAMESERIF");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMESERIF,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMEPLURI, "ROWNAMEPLURI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMEPLURI,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_RONADABIEFSI, "RONADABIEFSI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_RONADABIEFSI,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMEDAESE, "ROWNAMEDAESE");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMEDAESE,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMSTAAZE, "ROWNAMSTAAZE");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT3,IMDBDef3.FLD_OUT3_ROWNAMSTAAZE,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_OUT3, 0);
  }

  private static void Init_TBL_PARAMETRI119(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI119, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI119, "TBL_PARAMETRI119");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI119,IMDBDef3.FLD_PARAMETRI119_ROWNAMEESEIN, "ROWNAMEESEIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI119,IMDBDef3.FLD_PARAMETRI119_ROWNAMEESEIN,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI119,IMDBDef3.FLD_PARAMETRI119_ROWNAMECOUNT, "ROWNAMECOUNT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI119,IMDBDef3.FLD_PARAMETRI119_ROWNAMECOUNT,1,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI119,IMDBDef3.FLD_PARAMETRI119_ROWNAMECOUN2, "ROWNAMECOUN2");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI119,IMDBDef3.FLD_PARAMETRI119_ROWNAMECOUN2,1,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI119,IMDBDef3.FLD_PARAMETRI119_ROWNAMESERIF, "ROWNAMESERIF");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI119,IMDBDef3.FLD_PARAMETRI119_ROWNAMESERIF,1,6,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI119, 0);
  }

  private static void Init_PQRY_OUT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT1, 6);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT1, "PQRY_OUT1");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMNUOBIL, "ROWNAMNUOBIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMNUOBIL,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMESERIF, "ROWNAMESERIF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMESERIF,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMEPLURI, "ROWNAMEPLURI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMEPLURI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_RONADABIEFSI, "RONADABIEFSI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_RONADABIEFSI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMEDAESE, "ROWNAMEDAESE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMEDAESE,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMSTAAZE, "ROWNAMSTAAZE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1,IMDBDef11.PQSL_OUT1_ROWNAMSTAAZE,1,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_OUT1, 0);
  }

  private static void Init_PQRY_OUT1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT1_RS, 6);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT1_RS, "PQRY_OUT1_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMNUOBIL, "ROWNAMNUOBIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMNUOBIL,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMESERIF, "ROWNAMESERIF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMESERIF,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMEPLURI, "ROWNAMEPLURI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMEPLURI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_RONADABIEFSI, "RONADABIEFSI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_RONADABIEFSI,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMEDAESE, "ROWNAMEDAESE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMEDAESE,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMSTAAZE, "ROWNAMSTAAZE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT1_RS,IMDBDef11.PQSL_OUT1_ROWNAMSTAAZE,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneNuovoBilancio(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneNuovoBilancio()
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
    FormIdx = MyGlb.FRM_GENENUOVBILA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0C8368D4-A1D2-426D-8998-CEA76500603A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 464;
    DesignHeight = 394;
    set_Caption(new IDVariant("Generazione Nuovo Bilancio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 464;
    Frames[1].Height = 368;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Generazione Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_GENERABILANC = new IDPanel(w, this, 1, "PAN_GENERABILANC");
    Frames[1].Content = PAN_GENERABILANC;
    PAN_GENERABILANC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENERABILANC.VS = MainFrm.VisualStyleList;
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 464-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "09889AE9-7005-43D7-8DEA-6F25AA274092");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 528, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
      if (IMDB.TblModified(IMDBDef3.TBL_OUT3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENENUOVBILA_OUT1();
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
    return (obj instanceof GenerazioneNuovoBilancio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneNuovoBilancio.class.getName() : (Glb.ClassWithPackage(GenerazioneNuovoBilancio.class) ? GenerazioneNuovoBilancio.class.getName().substring(GenerazioneNuovoBilancio.class.getPackage().getName().length() + 1) : GenerazioneNuovoBilancio.class.getName()));
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
      IMDB.set_Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMEPLURI, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMSTAAZE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMEDAESE, 0, (new IDVariant(1)));
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(Caption(), (new IDVariant(" - "))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMEESEIN, 0))));
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMECOUNT, 0).equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMECOUN2, 0).equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMNUOBIL, 0, (new IDVariant(1)));
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneNuovoBilancio", "LoadEvent", _e);
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
      TOUCHED = (new IDVariant(0));
      TOUCHED2 = (new IDVariant(0));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMESERIF, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneNuovoBilancio", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Generazione Bilancio After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_GENERABILANC_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ESER = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Generazione Bilancio After Find Event Body
      // Procedure Body
      // 
      if (TOUCHED.equals((new IDVariant(0)), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ESERCIZIO_RIF_PL as T99ESERRIFPL ");
        SQL.append("from ");
        SQL.append("  T99 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMEESEIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ESER = QV.Get("T99ESERRIFPL", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMESERIF, 0, new IDVariant(v_ESER));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMESERIF, 0, new IDVariant(v_ESER));
        if (IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMECOUN2, 0).compareTo((new IDVariant(0)), true)>0)
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMNUOBIL, 0, (new IDVariant(1)));
          PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
          PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMECOUNT, 0).compareTo((new IDVariant(0)), true)>0)
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMNUOBIL, 0, (new IDVariant(0)));
          PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
          PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
          PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        }
        TOUCHED = (new IDVariant(1));
      }
      // 
      // -----------------------------------------
      // 
      if (IMDB.Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMNUOBIL, 0).equals((new IDVariant(0)), true))
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMNUOBIL, 0).equals((new IDVariant(1)), true))
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMEPLURI, 0).equals((new IDVariant(0)), true))
        {
          PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneNuovoBilancio", "GenerazioneBilancioAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Generazione Bilancio On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_GENERABILANC_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_GENERABILANC, Cancel);
      // 
      // Generazione Bilancio On Validate Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMNUOBIL, 0).equals((new IDVariant(0)), true))
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMNUOBIL, 0).equals((new IDVariant(1)), true))
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMEPLURI, 0).equals((new IDVariant(1)), true))
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (TOUCHED2.equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_RONADABIEFSI, 0, (new IDVariant(0)));
          TOUCHED2 = (new IDVariant(1));
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMEPLURI, 0).equals((new IDVariant(0)), true))
      {
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_GENERABILANC.SetFlags (Glb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMESERIF, 0).compareTo(IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMEESEIN, 0), true)>=0 && IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMNUOBIL, 0).equals((new IDVariant(1)), true) && IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMEPLURI, 0).equals((new IDVariant(1)), true))
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant("L'Esercizio di riferimento deve essere precedente all'Esercizio Corrente ", IDVariant.STRING));
        IMDB.set_Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMESERIF, 0, IDL.ToInteger(PAN_GENERABILANC.GetOrgValue(PFL_GENERABILANC_ESERCIRIFERI)));
        MainFrm.set_AlertMessage(v_MESSAGGIO); 
        IMDB.set_Value(IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMESERIF, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMESERIF, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneNuovoBilancio", "GenerazioneBilancioOnValidateRowEvent", _e);
    }
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
      MainFrm.ErrObj.ProcError ("GenerazioneNuovoBilancio", "GenerazioneBilancioOnDatabaseErrorEvent", _e);
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
      if (IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMNUOBIL, 0).equals((new IDVariant(1)), true))
      {
        if (IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMEPLURI, 0).equals((new IDVariant(1)), true) && IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMESERIF, 0).compareTo(IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMEESEIN, 0), true)>=0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("L'Esercizio di riferimento deve essere precedente all'Esercizio Corrente ", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
        }
        else
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.BILGENERAZIONE(IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMEESEIN, 0), IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMEPLURI, 0), IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_RONADABIEFSI, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMEPLURI, 0).equals((new IDVariant(1))))?IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMESERIF, 0):IDL.Sub(IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMESERIF, 0), (new IDVariant(1)))), IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMSTAAZE, 0));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            MainFrm.set_AlertMessage(v_SMS); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
        }
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BPRGENERAZIONE(IMDB.Value(IMDBDef3.TBL_PARAMETRI119, IMDBDef3.FLD_PARAMETRI119_ROWNAMEESEIN, 0), IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMEDAESE, 0), IMDB.Value(IMDBDef11.PQRY_OUT1, IMDBDef11.PQSL_OUT1_ROWNAMSTAAZE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_SMS); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneNuovoBilancio", "OkProc", _e);
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
      MainFrm.ErrObj.ProcError ("GenerazioneNuovoBilancio", "AnnullaProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OUT
  // Primary record source for panel data
  // **********************************************************************
  private void GENENUOVBILA_OUT1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_OUT1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_OUT3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_OUT3, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_OUT1_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_OUT1_RS, 0, IMDBDef3.TBL_OUT3, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT1_RS, 0, 0, IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMNUOBIL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT1_RS, 1, 0, IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMESERIF, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT1_RS, 2, 0, IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMEPLURI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT1_RS, 3, 0, IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_RONADABIEFSI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT1_RS, 4, 0, IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMEDAESE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT1_RS, 5, 0, IMDBDef3.TBL_OUT3, IMDBDef3.FLD_OUT3_ROWNAMSTAAZE, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_OUT3, 0);
      if (IMDB.Eof(IMDBDef3.TBL_OUT3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_OUT3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_OUT1_RS, 0);
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
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENERABILANC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_GENERABILANC);
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
    PAN_GENERABILANC.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, "F321C60C-0B2F-49D4-ACB1-764E0BCFAA08");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, "Nuovo Bilancio");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, MyGlb.VIS_GROUPSTYLE);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_FORM, 44, 15, 328, 49, 0, 0);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, 0, 81);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, 1, 13);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, 0, 4);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, 1, 4);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_GENERABILANC_NUOVOBILANCI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, "A5D49E39-8B0F-402B-83F3-BE9AE443CEF6");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, "Pluriennale");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, MyGlb.VIS_GROUPSTYLE);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, MyGlb.PANEL_LIST, 120, -9999, 256, 16, 0, 0);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, MyGlb.PANEL_FORM, 44, 67, 328, 89, 0, 0);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, 0, 63);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, 1, 13);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, 0, 4);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, 1, 4);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_GENERABILANC_PLURIENNALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, "557ABDE9-B677-45CD-8E84-1EC0B249D193");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, "Da Esercizio");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, MyGlb.VIS_GROUPSTYLE);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_LIST, 376, -9999, 104, 16, 0, 0);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_FORM, 44, 159, 328, 49, 0, 0);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, 0, 67);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, 1, 13);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, 0, 4);
    PAN_GENERABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, 1, 4);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_GENERABILANC_DAESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_GENERABILANC.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, "01BF4987-9B08-406F-891B-BD32782A133E");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, "Stanziamenti A Zero");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, MyGlb.VIS_CHECKSTYLE);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, "292E3DAB-E862-4227-9423-059AD0D14D72");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, "Nuovo Bilancio");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, "B8D07E1D-B4F3-4E98-BA6D-196C0FD99CD1");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, "F84CB7A4-A54E-4BE2-A615-72363075B978");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, "669B1140-EF64-48C5-93C3-58BAB030FFF3");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, "Pluriennale");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, MyGlb.VIS_CHECKSTYLE);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, "DB755D1E-45E9-495F-A9BE-FEBE6BA0CC49");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, "Esercizio Riferimento");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, "D0F179E5-D6EF-4603-BB63-B979ED914D93");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, "Da Bilancio Effettivo Simulato");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, MyGlb.VIS_OPTBUTSENBOR);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, "1198B3B7-214F-43AC-92A7-2409D89934A6");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, "Da Esercizio");
    PAN_GENERABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, "F9F6C742-02FD-4833-8BC8-24A7B804CCC2");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, "180234F7-8C46-4D20-B6D0-892F8D4D2A20");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, "");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, "9E32D208-50D3-43E1-93CB-0FA18116F017");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, "OK");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.VIS_STATICBUTTON);
    PAN_GENERABILANC.SetImage(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, 0, "button1.gif", false);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENERABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, "EB1A3448-B4ED-4F54-88EF-9A5FFEA42D4C");
    PAN_GENERABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, "Annulla");
    PAN_GENERABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_GENERABILANC.SetImage(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, 0, "button1.gif", false);
    PAN_GENERABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_GENERABILANC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, MyGlb.PANEL_LIST, 480, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, MyGlb.PANEL_LIST, 104);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, MyGlb.PANEL_LIST, "Stanz. A Zr.");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, MyGlb.PANEL_FORM, 220, 220, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, MyGlb.PANEL_FORM, 124);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_STANZIAAZERO, MyGlb.PANEL_FORM, "Stanziamenti A Zero");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_STANZIAAZERO, -1, -1);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_STANZIAAZERO, PPQRY_OUT1, "A.ROWNAMSTAAZE", "ROWNAMSTAAZE", 1, 1, 0, -13997);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_STANZIAAZERO, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_STANZIAAZERO, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_LIST, 80);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_LIST, "Nuovo Bilancio");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_FORM, 124, 40, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_FORM, 160);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NUOVOBILANCI, MyGlb.PANEL_FORM, "Nuovo Bilancio");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_NUOVOBILANCI, -1, GRP_GENERABILANC_NUOVOBILANCI);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_NUOVOBILANCI, PPQRY_OUT1, "A.ROWNAMNUOBIL", "ROWNAMNUOBIL", 1, 1, 0, -13997);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_NUOVOBILANCI, (new IDVariant(1)), "Effettivo", "", "", -1);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_NUOVOBILANCI, (new IDVariant(0)), "Simulato", "Simulato", "", -1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, MyGlb.PANEL_LIST, 164, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, MyGlb.PANEL_FORM, 48, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_NEWPANELLAB1, -1, GRP_GENERABILANC_NUOVOBILANCI);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, MyGlb.PANEL_LIST, 172, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, MyGlb.PANEL_FORM, 356, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_NEWPANELABE2, -1, GRP_GENERABILANC_NUOVOBILANCI);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, MyGlb.PANEL_LIST, 160, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, MyGlb.PANEL_LIST, 60);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, MyGlb.PANEL_LIST, "Pluriennale");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, MyGlb.PANEL_FORM, 48, 92, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, MyGlb.PANEL_FORM, 72);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_PLURIENNALE, MyGlb.PANEL_FORM, "Pluriennale");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_PLURIENNALE, -1, GRP_GENERABILANC_PLURIENNALE);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_PLURIENNALE, PPQRY_OUT1, "A.ROWNAMEPLURI", "ROWNAMEPLURI", 1, 1, 0, -13997);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_PLURIENNALE, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_PLURIENNALE, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_LIST, 108);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_LIST, "Es. Rf.");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_FORM, 192, 92, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_FORM, 128);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ESERCIRIFERI, MyGlb.PANEL_FORM, "Esercizio Riferimento");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ESERCIRIFERI, -1, GRP_GENERABILANC_PLURIENNALE);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ESERCIRIFERI, PPQRY_OUT1, "A.ROWNAMESERIF", "ROWNAMESERIF", 1, 4, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, MyGlb.PANEL_LIST, 256, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, MyGlb.PANEL_LIST, 148);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, MyGlb.PANEL_LIST, "Da Bil. Effet. Simul.");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, MyGlb.PANEL_FORM, 124, 132, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, MyGlb.PANEL_FORM, 160);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DABILAEFFSIM, MyGlb.PANEL_FORM, "Da Bilan. Effettivo Simulato");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_DABILAEFFSIM, -1, GRP_GENERABILANC_PLURIENNALE);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_DABILAEFFSIM, PPQRY_OUT1, "A.RONADABIEFSI", "RONADABIEFSI", 1, 1, 0, -13997);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_DABILAEFFSIM, (new IDVariant(1)), "Da Bilancio Simulato", "", "", -1);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_DABILAEFFSIM, (new IDVariant(0)), "Da Bilancio Effettivo", "", "", -1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_LIST, 376, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_LIST, "Da Esercizio");
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_FORM, 124, 184, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_FORM, 160);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERABILANC_DAESERCIZIO, MyGlb.PANEL_FORM, "Da Esercizio");
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_DAESERCIZIO, -1, GRP_GENERABILANC_DAESERCIZIO);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_DAESERCIZIO, PPQRY_OUT1, "A.ROWNAMEDAESE", "ROWNAMEDAESE", 1, 1, 0, -13997);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_DAESERCIZIO, (new IDVariant(1)), "Precedente", "", "", -1);
    PAN_GENERABILANC.SetValueListItem(PFL_GENERABILANC_DAESERCIZIO, (new IDVariant(0)), "Attuale", "", "", -1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, MyGlb.PANEL_LIST, 192, 168, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, MyGlb.PANEL_FORM, 48, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_NEWPANELLABE, -1, GRP_GENERABILANC_DAESERCIZIO);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, MyGlb.PANEL_LIST, 200, 176, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, MyGlb.PANEL_FORM, 356, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_NEWPANELABE1, -1, GRP_GENERABILANC_DAESERCIZIO);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_LIST, 184, 260, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_FORM, 200, 268, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_OK, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_OK, -1, -1);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_LIST, 192, 268, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_GENERABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_FORM, 288, 268, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_GENERABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERABILANC_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_GENERABILANC.SetFieldPage(PFL_GENERABILANC_ANNULLA, -1, -1);
    PAN_GENERABILANC.SetFieldPanel(PFL_GENERABILANC_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
  }

  private void PAN_GENERABILANC_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENERABILANC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_GENERABILANC.SetIMDB(IMDB, "PQRY_OUT1", true);
    PAN_GENERABILANC.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_GENERABILANC.SetQueryIMDB(PPQRY_OUT1, IMDBDef11.PQRY_OUT1_RS, IMDBDef3.TBL_OUT3);
    JustLoaded = true;
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_STANZIAAZERO, IMDBDef3.FLD_OUT3_ROWNAMSTAAZE);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_NUOVOBILANCI, IMDBDef3.FLD_OUT3_ROWNAMNUOBIL);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_PLURIENNALE, IMDBDef3.FLD_OUT3_ROWNAMEPLURI);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_ESERCIRIFERI, IMDBDef3.FLD_OUT3_ROWNAMESERIF);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_DABILAEFFSIM, IMDBDef3.FLD_OUT3_RONADABIEFSI);
    PAN_GENERABILANC.SetFieldPrimaryIndex(PFL_GENERABILANC_DAESERCIZIO, IMDBDef3.FLD_OUT3_ROWNAMEDAESE);
    PAN_GENERABILANC.SetMasterTable(0, "OUT3");
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
    if (SrcObj == PAN_GENERABILANC) PAN_GENERABILANC_AfterFind(CmdFind);
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
