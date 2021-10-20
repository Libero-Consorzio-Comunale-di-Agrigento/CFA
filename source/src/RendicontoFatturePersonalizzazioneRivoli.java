// **********************************************
// Rendiconto Fatture Personalizzazione Rivoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RendicontoFatturePersonalizzazioneRivoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMESTAMPA_DATAPROTOCOL = 0;

  private static int PFL_PARAMESTAMPA_ESERCIZIO = 0;
  private static int PFL_PARAMESTAMPA_TIPOUTENZA = 1;
  private static int PFL_PARAMESTAMPA_DA = 2;
  private static int PFL_PARAMESTAMPA_A = 3;
  private static int PFL_PARAMESTAMPA_NEWPANELLABE = 4;
  private static int PFL_PARAMESTAMPA_ELABORBUTTON = 5;
  private static int PFL_PARAMESTAMPA_TIPIUTENDESC = 6;
  private static int PFL_PARAMESTAMPA_CODICEUTENZA = 7;
  private static int PFL_PARAMESTAMPA_NUMEROUTENTE = 8;

  private static int PPQRY_PARAMESTAMP5 = 0;

  private static int PPQRY_TIPIUTENZA = 1;

  private static int PPQRY_TIPIUTENZA1 = 2;


  IDPanel PAN_PARAMESTAMPA;

  // Definition of Global Variables
  private IDVariant TIPOUTENDEFA = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMESTAMP8(IMDB);
    //
    //
    Init_PQRY_PARAMESTAMP5(IMDB);
    Init_PQRY_PARAMESTAMP5_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMESTAMP8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMESTAMP8, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMESTAMP8, "TBL_PARAMESTAMP8");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATDA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATAA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMCODUTE, "ROWNAMCODUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMCODUTE,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMNUMUTE, "ROWNAMNUMUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP8,IMDBDef2.FLD_PARAMESTAMP8_ROWNAMNUMUTE,5,49,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMESTAMP8, 0);
  }

  private static void Init_PQRY_PARAMESTAMP5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAMP5, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAMP5, "PQRY_PARAMESTAMP5");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATDA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATAA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMCODUTE, "ROWNAMCODUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMCODUTE,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMNUMUTE, "ROWNAMNUMUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMNUMUTE,5,49,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAMP5, 0);
  }

  private static void Init_PQRY_PARAMESTAMP5_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAMP5_RS, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAMP5_RS, "PQRY_PARAMESTAMP5_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATDA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATAA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMCODUTE, "ROWNAMCODUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMCODUTE,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMNUMUTE, "ROWNAMNUMUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP5_RS,IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMNUMUTE,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RendicontoFatturePersonalizzazioneRivoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public RendicontoFatturePersonalizzazioneRivoli()
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
    FormIdx = MyGlb.FRM_RENFATPERRIV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DA4458BE-9D9D-4340-BEB3-C499FFE59BEF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 300;
    DesignHeight = 250;
    set_Caption(new IDVariant("Rendiconto Fatture Personalizzazione Rivoli"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 300;
    Frames[1].Height = 224;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Stampa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 224;
    PAN_PARAMESTAMPA = new IDPanel(w, this, 1, "PAN_PARAMESTAMPA");
    Frames[1].Content = PAN_PARAMESTAMPA;
    PAN_PARAMESTAMPA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMESTAMPA.VS = MainFrm.VisualStyleList;
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 300-MyGlb.PAN_OFFS_X, 224-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4126C4BC-7FD4-402F-A0C9-2AD0DF9746FD");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1316, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMESTAMPA.InitStatus = 1;
    PAN_PARAMESTAMPA_Init();
    PAN_PARAMESTAMPA_InitFields();
    PAN_PARAMESTAMPA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMESTAMP8, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RENFATPERRIV_PARAMESTAMP5();
      }
      PAN_PARAMESTAMPA.UpdatePanel(MainFrm);
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
    return (obj instanceof RendicontoFatturePersonalizzazioneRivoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RendicontoFatturePersonalizzazioneRivoli.class.getName() : (Glb.ClassWithPackage(RendicontoFatturePersonalizzazioneRivoli.class) ? RendicontoFatturePersonalizzazioneRivoli.class.getName().substring(RendicontoFatturePersonalizzazioneRivoli.class.getPackage().getName().length() + 1) : RendicontoFatturePersonalizzazioneRivoli.class.getName()));
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Rendiconto Fatture", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      // 
      // setto valori di default
      // 
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATDA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATAA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.CODICE) as MINTIPUTECOD ");
        SQL.append("from ");
        SQL.append("  TIPI_UTENZA A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          TIPOUTENDEFA = QV.Get("MINTIPUTECOD", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMTIPUTE, 0, new IDVariant(TIPOUTENDEFA));
      }
      // 
      // setto valori di default
      // 
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATDA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATAA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.CODICE) as MINTIPUTECOD ");
        SQL.append("from ");
        SQL.append("  TIPI_UTENZA A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          TIPOUTENDEFA = QV.Get("MINTIPUTECOD", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMTIPUTE, 0, new IDVariant(TIPOUTENDEFA));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RendicontoFatturePersonalizzazioneRivoli", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Stampa
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Procedure Body
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Rendiconto_Fatture_RIV"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPOUTENZA")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP5, IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMTIPUTE, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATADA")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP5, IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATDA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATAA")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP5, IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMEDATAA, 0)));
      // 
      // parametro codice utenza
      // 
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP5, IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMCODUTE, 0)))
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_COD_UT")), IDL.ToString((new IDVariant(-1))));
        }
        else
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_COD_UT")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP5, IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMCODUTE, 0)));
        }
      }
      // 
      // parametro numero utente
      // 
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP5, IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMNUMUTE, 0)))
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_NUM_UT")), IDL.ToString((new IDVariant(-1))));
        }
        else
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_NUM_UT")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP5, IMDBDef9.PQSL_PARAMESTAMP5_ROWNAMNUMUTE, 0)));
        }
      }
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RendicontoFatturePersonalizzazioneRivoli", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void RENFATPERRIV_PARAMESTAMP5() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMESTAMP5_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMESTAMP8, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMESTAMP8, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAMP5_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMESTAMP5_RS, 0, IMDBDef2.TBL_PARAMESTAMP8, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP5_RS, 0, 0, IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP5_RS, 1, 0, IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMTIPUTE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP5_RS, 2, 0, IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATDA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP5_RS, 3, 0, IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATAA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP5_RS, 4, 0, IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDESCT, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP5_RS, 5, 0, IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMCODUTE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP5_RS, 6, 0, IMDBDef2.TBL_PARAMESTAMP8, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMNUMUTE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMESTAMP8, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMESTAMP8, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMESTAMP8, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMESTAMP5_RS, 0);
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
  private void PAN_PARAMESTAMPA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMESTAMPA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMESTAMPA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMESTAMPA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMESTAMPA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMESTAMPA);
    // Stub
  }

  private void PAN_PARAMESTAMPA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Stampa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMESTAMPA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMESTAMPA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMESTAMPA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMESTAMPA_Init()
  {

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, "EF94E656-E181-4A4A-B2F3-FCD15D68E4C4");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, "Data Protocollo");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, MyGlb.PANEL_LIST, 416, -9999, 128, 16, 0, 0);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, MyGlb.PANEL_FORM, 8, 39, 264, 49, 0, 0);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 0, 87);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 1, 13);
    PAN_PARAMESTAMPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 0, 4);
    PAN_PARAMESTAMPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 1, 4);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "B95E77F1-D13D-4824-B7D8-85FBA62638B9");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "Esercizio");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "DD9A758F-E191-47A9-A444-FEDC2EB95E2E");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "Tipo Utenza");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, "AFE49AC5-4264-4C64-932F-185728D2E828");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, "Da");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, "57EBC72A-9CDC-46D8-B477-32847F97EB79");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, "A");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, "A4DD4310-8F59-43E3-8A26-7C6B641816C8");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, "F8ECA5B6-7111-4A91-B501-4B5EEDFA048F");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, "Elabora");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, "5537CA19-A2B3-40F9-B3F9-00F4C5D6EB5F");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, "TIPI UTENZA DESCRIZIONE");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, "9FD1C5A4-80BE-49BF-89E6-8B6403342BDD");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, "Codice Utenza");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, "88D6E949-1D24-4EFD-B150-ED4469787EB1");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, "Numero Utente");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMESTAMPA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ESERCIZIO, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ESERCIZIO, PPQRY_PARAMESTAMP5, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 208, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 64);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, "Tipo Utenza");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 8, 8, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, "Tipo Utenza");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_TIPOUTENZA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_TIPOUTENZA, PPQRY_PARAMESTAMP5, "A.ROWNAMTIPUTE", "ROWNAMTIPUTE", 5, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, MyGlb.PANEL_LIST, 4, 184, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, MyGlb.PANEL_LIST, 96);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, MyGlb.PANEL_LIST, "Da");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, MyGlb.PANEL_FORM, 12, 64, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, MyGlb.PANEL_FORM, 24);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DA, MyGlb.PANEL_FORM, "Da");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_DA, -1, GRP_PARAMESTAMPA_DATAPROTOCOL);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_DA, PPQRY_PARAMESTAMP5, "A.ROWNAMEDATDA", "ROWNAMEDATDA", 6, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, MyGlb.PANEL_LIST, 416, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, MyGlb.PANEL_LIST, 44);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, MyGlb.PANEL_LIST, "A");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, MyGlb.PANEL_FORM, 152, 64, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, MyGlb.PANEL_FORM, 16);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_A, MyGlb.PANEL_FORM, "A");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_A, -1, GRP_PARAMESTAMPA_DATAPROTOCOL);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_A, PPQRY_PARAMESTAMP5, "A.ROWNAMEDATAA", "ROWNAMEDATAA", 6, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_LIST, 232, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_FORM, 256, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_NEWPANELLABE, -1, GRP_PARAMESTAMPA_DATAPROTOCOL);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 192, 152, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ELABORBUTTON, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_LIST, 144);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_LIST, "TIPI UTENZA DESCRIZIONE");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_FORM, 20, 192, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_FORM, 144);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_FORM, "TP. UTEN. DESCRIZIONE");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_TIPIUTENDESC, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_TIPIUTENDESC, PPQRY_TIPIUTENZA, "A.DESCRIZIONE", "TIPIUTENDESC", 5, 50, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, "Codice Utenza");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, 8, 96, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, 92);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, "Codice Utenza");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_CODICEUTENZA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_CODICEUTENZA, PPQRY_PARAMESTAMP5, "A.ROWNAMCODUTE", "ROWNAMCODUTE", 1, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, MyGlb.PANEL_LIST, 84);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, MyGlb.PANEL_LIST, "Numero Utente");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, MyGlb.PANEL_FORM, 4, 120, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, MyGlb.PANEL_FORM, 96);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROUTENTE, MyGlb.PANEL_FORM, "Numero Utente");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_NUMEROUTENTE, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_NUMEROUTENTE, PPQRY_PARAMESTAMP5, "A.ROWNAMNUMUTE", "ROWNAMNUMUTE", 5, 49, 0, -13997);
  }

  private void PAN_PARAMESTAMPA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPUTE~~) ");
    PAN_PARAMESTAMPA.SetQuery(PPQRY_TIPIUTENZA, 0, SQL, -1, "");
    PAN_PARAMESTAMPA.SetQueryDB(PPQRY_TIPIUTENZA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMESTAMPA.SetMasterTable(PPQRY_TIPIUTENZA, "TIPI_UTENZA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPUTE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMESTAMPA.SetQuery(PPQRY_TIPIUTENZA1, 0, SQL, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMESTAMPA.SetQuery(PPQRY_TIPIUTENZA1, 1, SQL, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    PAN_PARAMESTAMPA.SetQueryDB(PPQRY_TIPIUTENZA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMESTAMPA.SetIMDB(IMDB, "PQRY_PARAMESTAMP5", true);
    PAN_PARAMESTAMPA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMESTAMPA.SetQueryIMDB(PPQRY_PARAMESTAMP5, IMDBDef9.PQRY_PARAMESTAMP5_RS, IMDBDef2.TBL_PARAMESTAMP8);
    JustLoaded = true;
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_ESERCIZIO, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEESERC);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_TIPOUTENZA, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMTIPUTE);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_DA, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATDA);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_A, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMEDATAA);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_CODICEUTENZA, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMCODUTE);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_NUMEROUTENTE, IMDBDef2.FLD_PARAMESTAMP8_ROWNAMNUMUTE);
    PAN_PARAMESTAMPA.SetMasterTable(0, "PARAMESTAMP8");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMESTAMPA.Status() == 2)
    {
      int oldListQBE = PAN_PARAMESTAMPA.iUseListQBE;
      PAN_PARAMESTAMPA.iUseListQBE = 0;
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMESTAMPA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
