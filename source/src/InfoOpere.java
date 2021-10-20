// **********************************************
// Info Opere
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoOpere extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_OPERE_OPERA = 0;
  private static int PFL_OPERE_DESCRIFINANZ = 1;
  private static int PFL_OPERE_E = 2;
  private static int PFL_OPERE_INFOOPERA = 3;
  private static int PFL_OPERE_IMPORTO = 4;
  private static int PFL_OPERE_LABELOPERA = 5;
  private static int PFL_OPERE_CAPITOLO3 = 6;
  private static int PFL_OPERE_ARTICOLO = 7;
  private static int PFL_OPERE_IMPOTOTAOPER = 8;
  private static int PFL_OPERE_NEWPANELLABE = 9;
  private static int PFL_OPERE_FINANZIAMENT = 10;
  private static int PFL_OPERE_ANNOACC2 = 11;
  private static int PFL_OPERE_NUMEROACC2 = 12;

  private static int PPQRY_ACCOPE1 = 0;

  private static int PPQRY_OPERE = 1;


  IDPanel PAN_OPERE;
  private static int PFL_FINANZIAMENT_FINANZIAMEN1 = 0;
  private static int PFL_FINANZIAMENT_FINANZDESCRI = 1;
  private static int PFL_FINANZIAMENT_INFOFINANZIA = 2;

  private static int PPQRY_FINANZIAME11 = 0;

  private static int PPQRY_FINANZIAMENT = 1;


  IDPanel PAN_FINANZIAMENT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI76(IMDB);
    Init_TBL_FINANZIAMEN9(IMDB);
    //
    //
    Init_PQRY_ACCOPE1(IMDB);
    Init_PQRY_FINANZIAME11(IMDB);
    Init_PQRY_FINANZIAME11_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI76(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI76, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI76, "TBL_PARAMETRI76");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI76,IMDBDef4.FLD_PARAMETRI76_PARAMNUMEACC, "PARAMNUMEACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI76,IMDBDef4.FLD_PARAMETRI76_PARAMNUMEACC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI76,IMDBDef4.FLD_PARAMETRI76_PARAMANNOACC, "PARAMANNOACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI76,IMDBDef4.FLD_PARAMETRI76_PARAMANNOACC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI76, 0);
  }

  private static void Init_TBL_FINANZIAMEN9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_FINANZIAMEN9, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_FINANZIAMEN9, "TBL_FINANZIAMEN9");
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAMEN9,IMDBDef4.FLD_FINANZIAMEN9_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAMEN9,IMDBDef4.FLD_FINANZIAMEN9_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef4.TBL_FINANZIAMEN9, 0);
  }

  private static void Init_PQRY_ACCOPE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_ACCOPE1, 9);
    IMDB.set_TblCode(IMDBDef14.PQRY_ACCOPE1, "PQRY_ACCOPE1");
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_INFOOPERA, "INFOOPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_INFOOPERA,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_E, "E");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCOPE1,IMDBDef14.PQSL_ACCOPE1_E,5,1,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_ACCOPE1, 0);
  }

  private static void Init_PQRY_FINANZIAME11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_FINANZIAME11, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_FINANZIAME11, "PQRY_FINANZIAME11");
    IMDB.set_FldCode(IMDBDef14.PQRY_FINANZIAME11,IMDBDef14.PQSL_FINANZIAME11_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_FINANZIAME11,IMDBDef14.PQSL_FINANZIAME11_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_FINANZIAME11, 0);
  }

  private static void Init_PQRY_FINANZIAME11_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_FINANZIAME11_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_FINANZIAME11_RS, "PQRY_FINANZIAME11_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_FINANZIAME11_RS,IMDBDef14.PQSL_FINANZIAME11_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_FINANZIAME11_RS,IMDBDef14.PQSL_FINANZIAME11_PARAMFINANZI,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoOpere(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoOpere()
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
    FormIdx = MyGlb.FRM_INFOOPERE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FD7D6223-4EAD-4C8C-834F-7636D08B15E6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 740;
    DesignHeight = 462;
    set_Caption(new IDVariant("Info Opere"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 740;
    Frames[1].Height = 436;
    Frames[1].Caption = "Opere";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 436;
    PAN_OPERE = new IDPanel(w, this, 1, "PAN_OPERE");
    Frames[1].Content = PAN_OPERE;
    PAN_OPERE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OPERE.VS = MainFrm.VisualStyleList;
    PAN_OPERE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 740-MyGlb.PAN_OFFS_X, 436-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6D3223FB-4B0A-4C93-82D4-5627F3AD3890");
    PAN_OPERE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 4, 72, 672, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OPERE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OPERE.InitStatus = 2;
    PAN_OPERE_Init();
    PAN_OPERE_InitFields();
    PAN_OPERE_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_OPERE.SetSubFrame(PFL_OPERE_NEWPANELLABE,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Finanziamento";
    Frames[2].Parent = this;
    PAN_FINANZIAMENT = new IDPanel(w, this, 2, "PAN_FINANZIAMENT");
    Frames[2].Content = PAN_FINANZIAMENT;
    PAN_FINANZIAMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZIAMENT.VS = MainFrm.VisualStyleList;
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EB86CB8F-FF99-48CB-83F6-067083B8EC8C");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 552, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef4.TBL_FINANZIAMEN9, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFOOPERE_FINANZIAME11();
      }
      PAN_OPERE.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoOpere);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoOpere.class.getName() : (Glb.ClassWithPackage(InfoOpere.class) ? InfoOpere.class.getName().substring(InfoOpere.class.getPackage().getName().length() + 1) : InfoOpere.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Opere After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_OPERE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Opere After Find Event Body
      // Procedure Body
      // 
      PAN_OPERE.set_FieldText(PFL_OPERE_IMPOTOTAOPER, IDL.ToString(PAN_OPERE.GetFieldSum(PFL_OPERE_IMPORTO)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOpere", "OpereAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Opere On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OPERE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_OPERE);
      // 
      // Opere On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_OPERE.set_ToolTip(Glb.OBJ_FIELD,PFL_OPERE_DESCRIFINANZ,(new IDVariant(PAN_OPERE.FieldText(PFL_OPERE_DESCRIFINANZ))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOpere", "OpereOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento After Find Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_FINANZIAME11, IMDBDef14.PQSL_FINANZIAME11_PARAMFINANZI, 0))))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOpere", "FinanziamentoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento On Dynamic Properties Event
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
      // Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_FINANZDESCRI,(new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_FINANZDESCRI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOpere", "FinanziamentoOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Opere", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOpere", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Info Finanziamento
  // **********************************************************************
  public int ApriInfoFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Finanziamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef14.PQRY_ACCOPE1, IMDBDef14.PQSL_ACCOPE1_FINANZIAMENTO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOpere", "ApriInfoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI21, IMDBDef1.FLD_PARAMETRI21_PARAMOPERA, 0, IMDB.Value(IMDBDef14.PQRY_ACCOPE1, IMDBDef14.PQSL_ACCOPE1_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_INFOSULLOPER, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOpere", "ApriInfoOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Totale Finanziamento
  // **********************************************************************
  public int CalcolaTotaleFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcola Totale Finanziamento Body
      // Procedure Body
      // 
      PAN_OPERE.set_FieldText(PFL_OPERE_IMPOTOTAOPER, IDL.ToString(PAN_OPERE.GetFieldSum(PFL_OPERE_IMPORTO)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoOpere", "CalcolaTotaleFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Finanziamento
  // **********************************************************************
  private void INFOOPERE_FINANZIAME11() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_FINANZIAME11_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_FINANZIAMEN9, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_FINANZIAMEN9, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_FINANZIAME11_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_FINANZIAME11_RS, 0, IMDBDef4.TBL_FINANZIAMEN9, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FINANZIAME11_RS, 0, 0, IMDBDef4.TBL_FINANZIAMEN9, IMDBDef4.FLD_FINANZIAMEN9_PARAMFINANZI, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_FINANZIAMEN9, 0);
      if (IMDB.Eof(IMDBDef4.TBL_FINANZIAMEN9, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_FINANZIAMEN9, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_FINANZIAME11_RS, 0);
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
  private void PAN_OPERE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_OPERE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OPERE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OPERE, Cancel);
    // Stub
  }

  private void PAN_OPERE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_OPERE_INFOOPERA)
    {
      this.IdxPanelActived = this.PAN_OPERE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoOpera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_OPERE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_OPERE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACCOPE1, IMDBDef14.PQSL_ACCOPE1_E, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_ACCOPE1, IMDBDef14.PQSL_ACCOPE1_E, 0, (new IDVariant("S")));
      }
      if (Cancel.isFalse())
      {
        PAN_OPERE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

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
    if (ColIndex.intValue() == PFL_FINANZIAMENT_INFOFINANZIA)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoFinanziamento();
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
  private void PAN_OPERE_Init()
  {

    PAN_OPERE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OPERE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OPERE.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, "FD70447C-8E20-499F-857E-0BD590BE8435");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, "OPERA");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, "EBF0E418-ADFD-4CFE-B008-6C4F2188DADE");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISDESCR, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_E, "B1AE6D82-F0BB-4C1C-9A2C-E68491EE4013");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_E, "E");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_E, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_E, MyGlb.VIS_HYPELINKIMMA);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, "BF442262-B954-4A3B-A81E-FB7BBE01C87F");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, " ");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, MyGlb.VIS_HYPELINKIMMA);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, "335B77A4-259D-46D9-8D31-DD17658B764C");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, "Importo");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, "Importo Finanziamento");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, "17B31BFF-B75D-4D90-BECA-7619F50F524A");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, "Opera");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, "FE1FAB06-85CF-4CA1-B615-9F300A969618");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, "CAPITOLO");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, MyGlb.VIS_NONNULLAFIEL);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, "7A3A1DDB-CB4D-4FCC-97B2-DB36F5B46DA2");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, "ARTICOLO");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, "539B8A25-1C0D-4743-86C1-5CF95A147435");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, "ddd");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, MyGlb.VIS_CAMPTOTADISA);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, "581C5F9D-0E6B-491D-8897-961A36E227AC");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, "0CC29C5D-2671-4B36-A52A-C59E9D4243BF");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, "FINANZIAMENTO");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, "A4A62B9B-B07A-421C-A31B-00811FD655C8");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, "ANNO ACC");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, "42200DF4-4D0C-41CB-84D0-45B0BAFAE75E");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, "NUMERO ACC");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_OPERE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, MyGlb.PANEL_LIST, 4, 108, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, MyGlb.PANEL_FORM, 52, 304, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_OPERE.SetFieldPage(PFL_OPERE_OPERA, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_OPERA, PPQRY_ACCOPE1, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, MyGlb.PANEL_LIST, 76, 108, 496, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, MyGlb.PANEL_LIST, 160);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, MyGlb.PANEL_LIST, "Descrizione Finanziamento");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, MyGlb.PANEL_FORM, 168, 220, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, MyGlb.PANEL_FORM, 160);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, MyGlb.PANEL_FORM, 2);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIFINANZ, MyGlb.PANEL_FORM, "Descrizione Finanziamento");
    PAN_OPERE.SetFieldPage(PFL_OPERE_DESCRIFINANZ, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_DESCRIFINANZ, PPQRY_OPERE, "A.DESCRIZIONE", "OPEREDESCRIZ", 5, 200, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_E, MyGlb.PANEL_LIST, 572, 108, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_E, MyGlb.PANEL_LIST, 16);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_E, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_E, MyGlb.PANEL_LIST, "E");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_E, MyGlb.PANEL_FORM, 4, 400, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_E, MyGlb.PANEL_FORM, 16);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_E, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_E, MyGlb.PANEL_FORM, "E");
    PAN_OPERE.SetFieldPage(PFL_OPERE_E, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_E, PPQRY_ACCOPE1, "A.E", "E", 5, 1, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, MyGlb.PANEL_LIST, 572, 108, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, MyGlb.PANEL_LIST, 68);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, MyGlb.PANEL_LIST, " ");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, MyGlb.PANEL_FORM, 4, 424, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, MyGlb.PANEL_FORM, 68);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_INFOOPERA, MyGlb.PANEL_FORM, " ");
    PAN_OPERE.SetFieldPage(PFL_OPERE_INFOOPERA, -1, -1);
    PAN_OPERE.SetFieldUnbound(PFL_OPERE_INFOOPERA, true);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_INFOOPERA, PPQRY_ACCOPE1, "'I'", "INFOOPERA", 5, 1, 0, -13997);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_INFOOPERA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, MyGlb.PANEL_LIST, 592, 108, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, MyGlb.PANEL_FORM, 104);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_OPERE.SetFieldPage(PFL_OPERE_IMPORTO, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_IMPORTO, PPQRY_ACCOPE1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, MyGlb.PANEL_LIST, 4, 72, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, MyGlb.PANEL_LIST, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, MyGlb.PANEL_LIST, 2);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, MyGlb.PANEL_FORM, 4, 76, 612, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, MyGlb.PANEL_FORM, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_LABELOPERA, MyGlb.PANEL_FORM, 2);
    PAN_OPERE.SetFieldPage(PFL_OPERE_LABELOPERA, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_LABELOPERA, -1, "", "LABELOPERA", 0, 0, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, MyGlb.PANEL_LIST, 584, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, MyGlb.PANEL_LIST, 60);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, MyGlb.PANEL_FORM, 60);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CAPITOLO3, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_OPERE.SetFieldPage(PFL_OPERE_CAPITOLO3, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_CAPITOLO3, PPQRY_ACCOPE1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, MyGlb.PANEL_LIST, 584, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, MyGlb.PANEL_FORM, 4, 376, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_OPERE.SetFieldPage(PFL_OPERE_ARTICOLO, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_ARTICOLO, PPQRY_ACCOPE1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, MyGlb.PANEL_LIST, 592, 316, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, MyGlb.PANEL_LIST, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, MyGlb.PANEL_FORM, 380, 220, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, MyGlb.PANEL_FORM, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_IMPOTOTAOPER, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetFieldPage(PFL_OPERE_IMPOTOTAOPER, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_IMPOTOTAOPER, -1, "", "IMPOTOTAOPER", 0, 0, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, MyGlb.PANEL_LIST, 4, 4, 696, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, MyGlb.PANEL_LIST, 4);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, MyGlb.PANEL_FORM, 0, 4, 788, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NEWPANELLABE, MyGlb.PANEL_FORM, 4);
    PAN_OPERE.SetFieldPage(PFL_OPERE_NEWPANELLABE, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZ.");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 400, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_OPERE.SetFieldPage(PFL_OPERE_FINANZIAMENT, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_FINANZIAMENT, PPQRY_ACCOPE1, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, MyGlb.PANEL_LIST, 680, 108, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, MyGlb.PANEL_LIST, 64);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, MyGlb.PANEL_FORM, 4, 424, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, MyGlb.PANEL_FORM, 64);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOACC2, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_OPERE.SetFieldPage(PFL_OPERE_ANNOACC2, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_ANNOACC2, PPQRY_ACCOPE1, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, MyGlb.PANEL_LIST, 76);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, MyGlb.PANEL_LIST, "NUMERO ACC");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, MyGlb.PANEL_FORM, 4, 448, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, MyGlb.PANEL_FORM, 76);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROACC2, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_OPERE.SetFieldPage(PFL_OPERE_NUMEROACC2, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_NUMEROACC2, PPQRY_ACCOPE1, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
  }

  private void PAN_OPERE_InitQueries()
  {
    StringBuffer SQL;

    PAN_OPERE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    PAN_OPERE.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_OPERE.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OPERE.SetMasterTable(PPQRY_OPERE, "OPERE");
    PAN_OPERE.SetIMDB(IMDB, "PQRY_ACCOPE1", true);
    PAN_OPERE.set_SetString(MyGlb.MASTER_ROWNAME, "ACC OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  'I' as INFOOPERA, ");
    SQL.append("  A.E as E ");
    PAN_OPERE.SetQuery(PPQRY_ACCOPE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ACC_OPE A ");
    PAN_OPERE.SetQuery(PPQRY_ACCOPE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ACC = ~~TBL_PARAMETRI76.PARAMANNOACC~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~TBL_PARAMETRI76.PARAMNUMEACC~~) ");
    PAN_OPERE.SetQuery(PPQRY_ACCOPE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OPERE.SetQuery(PPQRY_ACCOPE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OPERE.SetQuery(PPQRY_ACCOPE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.OPERA ");
    PAN_OPERE.SetQuery(PPQRY_ACCOPE1, 5, SQL, -1, "");
    PAN_OPERE.SetQueryDB(PPQRY_ACCOPE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OPERE.SetMasterTable(0, "ACC_OPE");
    PAN_OPERE.AddToSortList(PFL_OPERE_OPERA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_OPERE.Status() == 2)
    {
      int oldListQBE = PAN_OPERE.iUseListQBE;
      PAN_OPERE.iUseListQBE = 0;
      PAN_OPERE.PanelCommand(Glb.PCM_SEARCH);
      PAN_OPERE.PanelCommand(Glb.PCM_FIND);
      PAN_OPERE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FINANZIAMENT_Init()
  {

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, "DB35E5F9-9B55-488D-B9DD-3487000B6286");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, "Finanziamento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, "F5ADAA66-2F3A-48CD-80A3-BC4B89C865BF");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, "FINANZIAMENTI DESCRIZIONE");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, "DA0C1695-B65D-4E8D-9123-7B59FD9C8B14");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, 0, "info.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_FINANZIAMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, MyGlb.PANEL_LIST, 40);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, MyGlb.PANEL_LIST, "Finanz.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, MyGlb.PANEL_FORM, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMEN1, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_FINANZIAMEN1, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_FINANZIAMEN1, PPQRY_FINANZIAME11, "A.PARAMFINANZI", "PARAMFINANZI", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_LIST, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_LIST, "FINANZIAMENTI DESCRIZIONE");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_FORM, 176, 4, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_FORM, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDESCRI, MyGlb.PANEL_FORM, "FINANZ. DESCR.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_FINANZDESCRI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_LIST, 628, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_FORM, 592, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_INFOFINANZIA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_INFOFINANZIA, -1, "", "INFOFINANZIA", 0, 0, 0, -13997);
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
    SQL.append("where (A.CODICE = ~~PARAMFINANZI~~) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_FINANZIAMENT.SetIMDB(IMDB, "PQRY_FINANZIAME11", true);
    PAN_FINANZIAMENT.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_FINANZIAMENT.SetQueryIMDB(PPQRY_FINANZIAME11, IMDBDef14.PQRY_FINANZIAME11_RS, IMDBDef4.TBL_FINANZIAMEN9);
    JustLoaded = true;
    PAN_FINANZIAMENT.SetFieldPrimaryIndex(PFL_FINANZIAMENT_FINANZIAMEN1, IMDBDef4.FLD_FINANZIAMEN9_PARAMFINANZI);
    PAN_FINANZIAMENT.SetMasterTable(0, "FINANZIAMEN9");
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
    if (SrcObj == PAN_OPERE) PAN_OPERE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_ValidateRow(Cancel);
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_DynamicProperties();
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_OPERE) PAN_OPERE_AfterFind(CmdFind);
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
