// **********************************************
// Situazione Liquidazioni Per Codice Utenza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneLiquidazioniPerCodiceUtenza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMESTAMPA_ESERCIZIO = 0;
  private static int PFL_PARAMESTAMPA_SELEZIUTENZE = 1;
  private static int PFL_PARAMESTAMPA_TIPOUTENZA = 2;
  private static int PFL_PARAMESTAMPA_ELABORBUTTON = 3;
  private static int PFL_PARAMESTAMPA_DATAELABORAZ = 4;
  private static int PFL_PARAMESTAMPA_CODICEUTENZA = 5;
  private static int PFL_PARAMESTAMPA_RESICOMPENTR = 6;
  private static int PFL_PARAMESTAMPA_SOLOEMESSE = 7;
  private static int PFL_PARAMESTAMPA_DESCTIPOUTE = 8;

  private static int PPQRY_PARAMESTAM10 = 0;

  private static int PPQRY_TIPIUTENZA1 = 1;


  IDPanel PAN_PARAMESTAMPA;

  // Definition of Global Variables
  private IDVariant TIPOUTENDEFA = new IDVariant(0,IDVariant.STRING);
  private IDVariant PROPALTRDATI = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMESTAM11(IMDB);
    //
    //
    Init_PQRY_PARAMESTAM10(IMDB);
    Init_PQRY_PARAMESTAM10_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMESTAM11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMESTAM11, 11);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMESTAM11, "TBL_PARAMESTAM11");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMENUMER,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMANNDEL,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMSEDDEL,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMOLTIUT, "ROWNAMOLTIUT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMOLTIUT,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMECODIC,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMRECOEN,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMSOLEME, "ROWNAMSOLEME");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM11,IMDBDef2.FLD_PARAMESTAM11_ROWNAMSOLEME,5,49,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMESTAM11, 0);
  }

  private static void Init_PQRY_PARAMESTAM10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAM10, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAM10, "PQRY_PARAMESTAM10");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMRECOEN,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMSOLEME, "ROWNAMSOLEME");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMSOLEME,5,49,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAM10, 0);
  }

  private static void Init_PQRY_PARAMESTAM10_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAM10_RS, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAM10_RS, "PQRY_PARAMESTAM10_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMRECOEN,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMSOLEME, "ROWNAMSOLEME");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM10_RS,IMDBDef9.PQSL_PARAMESTAM10_ROWNAMSOLEME,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneLiquidazioniPerCodiceUtenza(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneLiquidazioniPerCodiceUtenza()
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
    FormIdx = MyGlb.FRM_SITLIQPECOUT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B38E16B3-86BC-41BC-808F-14CB2CCFEC55";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 340;
    DesignHeight = 214;
    set_Caption(new IDVariant("Situazione Liquidazioni Per Codice Utenza"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 340;
    Frames[1].Height = 188;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Stampa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 188;
    PAN_PARAMESTAMPA = new IDPanel(w, this, 1, "PAN_PARAMESTAMPA");
    Frames[1].Content = PAN_PARAMESTAMPA;
    PAN_PARAMESTAMPA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMESTAMPA.VS = MainFrm.VisualStyleList;
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 340-MyGlb.PAN_OFFS_X, 188-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E850F926-5C86-45A6-BD8F-EA7D3165214E");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1440, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMESTAM11, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITLIQPECOUT_PARAMESTAM10();
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
    if (CallerIdx == MyGlb.FRM_CODICIUTENZE && flRis && IdxPanelActived == PAN_PARAMESTAMPA.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMESTAMPA_SELEZIUTENZE) {
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
    return (obj instanceof SituazioneLiquidazioniPerCodiceUtenza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneLiquidazioniPerCodiceUtenza.class.getName() : (Glb.ClassWithPackage(SituazioneLiquidazioniPerCodiceUtenza.class) ? SituazioneLiquidazioniPerCodiceUtenza.class.getName().substring(SituazioneLiquidazioniPerCodiceUtenza.class.getPackage().getName().length() + 1) : SituazioneLiquidazioniPerCodiceUtenza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Stampa On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMESTAMPA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Stampa On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMESTAMPA_TIPOUTENZA)), true) && FieldModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerCodiceUtenza", "ParametriStampaOnUpdatingRow", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Situazione Liquidazioni Per Codice Utenza", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMRECOEN, 0, (new IDVariant("T")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMDATELA, 0, IDL.Today());
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
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMTIPUTE, 0, new IDVariant(TIPOUTENDEFA));
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMOLTIUT, 0, IMDB.Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMTIPUTE, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerCodiceUtenza", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMOLTIUT, 0, (new IDVariant()));
      SQL = new StringBuffer();
      SQL.append("delete from WRK_SIT_UTENZE ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerCodiceUtenza", "UnloadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_CODICIUTENZE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0, IMDB.Value(IMDBDef7.PQRY_CODICIUTENZ1, IMDBDef7.PQSL_CODICIUTENZ1_CODUTECODUTE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerCodiceUtenza", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // richiamo procedura
      // 
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE, 0))))
        {
          // 
          // 
          // 
          // 
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CODICI_UTENZE A ");
          SQL.append("where (A.CODICE_UTENZA = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_UTENZA = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0))))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Codice Utenza non trovato"));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0, (new IDVariant()));
            return 0;
          }
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        SQL = new StringBuffer();
        SQL.append("delete from WRK_SIT_UTENZE ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        MainFrm.Cf4armDBObject.WORKSITUTENZECOD(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE, 0), IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0),(new IDVariant("-1"))), IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMRECOEN, 0), IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMSOLEME, 0), IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMDATELA, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Sit_Liq_CodUte"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGRESSIVO_SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMDATELA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO")), (new IDVariant("C")));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerCodiceUtenza", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Utenze
  // **********************************************************************
  public int SelezioneUtenze ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Utenze Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM93, IMDBDef1.FLD_PARAM93_NOMOGGTIPUTE, 0, IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE, 0));
      MainFrm.Show(MyGlb.FRM_CODICIUTENZE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerCodiceUtenza", "SelezioneUtenze", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Stampa Codice Utenza Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAMESTAMPA_CODICEUTENZA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Stampa Codice Utenza Validate Body
      // Corpo Procedura
      // 
      // 
      //  
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE, 0))) && IMDB.Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMTIPUTE, 0).compareTo(IMDB.Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMOLTIUT, 0), true)!=0)
        {
          // 
          // 
          // 
          // 
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CODICI_UTENZE A ");
          SQL.append("where (A.CODICE_UTENZA = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_UTENZA = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Codice Utenza non trovato"));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0, (new IDVariant()));
            return;
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerCodiceUtenza", "ParametriStampaCodiceUtenzaValidate", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa Tipo Utenza Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAMESTAMPA_TIPOUTENZA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Stampa Tipo Utenza Validate Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMTIPUTE, 0).compareTo(IMDB.Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMOLTIUT, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAM10, IMDBDef9.PQSL_PARAMESTAM10_ROWNAMECODIC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMOLTIUT, 0, IMDB.Value(IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMTIPUTE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerCodiceUtenza", "ParametriStampaTipoUtenzaValidate", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void SITLIQPECOUT_PARAMESTAM10() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMESTAM10_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMESTAM11, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMESTAM11, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAM10_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMESTAM10_RS, 0, IMDBDef2.TBL_PARAMESTAM11, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM10_RS, 0, 0, IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM10_RS, 1, 0, IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMTIPUTE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM10_RS, 2, 0, IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMEDESCT, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM10_RS, 3, 0, IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM10_RS, 4, 0, IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMECODIC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM10_RS, 5, 0, IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMRECOEN, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM10_RS, 6, 0, IMDBDef2.TBL_PARAMESTAM11, IMDBDef2.FLD_PARAMESTAM11_ROWNAMSOLEME, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMESTAM11, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMESTAM11, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMESTAM11, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMESTAM10_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_SELEZIUTENZE)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneUtenze();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMESTAMPA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMESTAMPA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMESTAMPA_TIPOUTENZA)
      {
        PFL_PARAMESTAMPA_TIPOUTENZA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMESTAMPA_CODICEUTENZA)
      {
        PFL_PARAMESTAMPA_CODICEUTENZA_ValidateCell(Cancel);
      }
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
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "D27A8BF5-9C8D-42CF-B19F-BC9DBBD59052");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "Esercizio");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, "CD2906F1-A26F-45E8-B811-7979EB449731");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, 0, "wsearch1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "6243EE45-7823-4987-8869-8A01BE11980D");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "Tipo Utenza");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, "8FACF70C-54E4-418F-A81A-23B3F2E7DBB1");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, "Elabora");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, "8BA48C0C-2732-45BA-A953-41C50705AD45");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, "D92E3522-9321-4EF6-8CEB-1FB8B13D11E5");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, "Codice Utenza");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, "74F7D5F1-1EAC-4D6F-A16B-C91C52163702");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, "Residui Competenza Entrambi");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, "262DF64C-7F70-4557-BD49-51E966374583");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, "Solo Emesse");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, "8C7CE799-C927-4913-BCD2-B44D7E0115ED");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, "Desctipoute");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, 0 | MyGlb.FLD_ISOPT, -1);
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
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ESERCIZIO, PPQRY_PARAMESTAM10, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, MyGlb.PANEL_LIST, 248, 314, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, MyGlb.PANEL_FORM, 304, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SELEZIUTENZE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_SELEZIUTENZE, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_SELEZIUTENZE, -1, "", "SELEZIUTENZE", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.set_ImageResizeMode(PFL_PARAMESTAMPA_SELEZIUTENZE, 3);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 208, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 64);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, "Tipo Utenza");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 16, 12, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 92);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, "Tipo Utenza");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_TIPOUTENZA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_TIPOUTENZA, PPQRY_PARAMESTAM10, "A.ROWNAMTIPUTE", "ROWNAMTIPUTE", 5, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 240, 128, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ELABORBUTTON, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, 124, 84, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_DATAELABORAZ, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_DATAELABORAZ, PPQRY_PARAMESTAM10, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, "Codice Utenza");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, 16, 36, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, 92);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, "Codice Utenza");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_CODICEUTENZA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_CODICEUTENZA, PPQRY_PARAMESTAM10, "A.ROWNAMECODIC", "ROWNAMECODIC", 5, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, MyGlb.PANEL_LIST, 144);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, MyGlb.PANEL_LIST, "Residui Competenza Entrambi");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, MyGlb.PANEL_FORM, 16, 60, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, MyGlb.PANEL_FORM, 144);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESICOMPENTR, MyGlb.PANEL_FORM, "Res. Compet. Entrambi");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_RESICOMPENTR, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_RESICOMPENTR, PPQRY_PARAMESTAM10, "A.ROWNAMRECOEN", "ROWNAMRECOEN", 5, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_RESICOMPENTR, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_RESICOMPENTR, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_RESICOMPENTR, (new IDVariant("T")), "Entrambi", "", "", -1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_LIST, 64);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_LIST, "Solo Emesse");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_FORM, 12, 84, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_FORM, 80);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_FORM, "Solo Emesse");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_SOLOEMESSE, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_SOLOEMESSE, PPQRY_PARAMESTAM10, "A.ROWNAMSOLEME", "ROWNAMSOLEME", 5, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_SOLOEMESSE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_SOLOEMESSE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, MyGlb.PANEL_LIST, 68);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, MyGlb.PANEL_LIST, "Desctipoute");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, MyGlb.PANEL_FORM, 4, 228, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, MyGlb.PANEL_FORM, 68);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DESCTIPOUTE, MyGlb.PANEL_FORM, "Desct.");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_DESCTIPOUTE, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_DESCTIPOUTE, PPQRY_PARAMESTAM10, "A.ROWNAMEDESCT", "ROWNAMEDESCT", 5, 49, 0, -13997);
  }

  private void PAN_PARAMESTAMPA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_QUERY, 2);
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
    PAN_PARAMESTAMPA.SetIMDB(IMDB, "PQRY_PARAMESTAM10", true);
    PAN_PARAMESTAMPA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMESTAMPA.SetQueryIMDB(PPQRY_PARAMESTAM10, IMDBDef9.PQRY_PARAMESTAM10_RS, IMDBDef2.TBL_PARAMESTAM11);
    JustLoaded = true;
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_ESERCIZIO, IMDBDef2.FLD_PARAMESTAM11_ROWNAMEESERC);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_TIPOUTENZA, IMDBDef2.FLD_PARAMESTAM11_ROWNAMTIPUTE);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_DATAELABORAZ, IMDBDef2.FLD_PARAMESTAM11_ROWNAMDATELA);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_CODICEUTENZA, IMDBDef2.FLD_PARAMESTAM11_ROWNAMECODIC);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_RESICOMPENTR, IMDBDef2.FLD_PARAMESTAM11_ROWNAMRECOEN);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_SOLOEMESSE, IMDBDef2.FLD_PARAMESTAM11_ROWNAMSOLEME);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_DESCTIPOUTE, IMDBDef2.FLD_PARAMESTAM11_ROWNAMEDESCT);
    PAN_PARAMESTAMPA.SetMasterTable(0, "PARAMESTAM11");
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
