// **********************************************
// Estrazione Imputazioni Liq
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstrazioneImputazioniLiq extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_DATALIQUIDAZ = 0;

  private static int PFL_PARAMETRI_STIPENDI = 0;
  private static int PFL_PARAMETRI_GRUPPO = 1;
  private static int PFL_PARAMETRI_BOLLO = 2;
  private static int PFL_PARAMETRI_BENBENEFICIA = 3;
  private static int PFL_PARAMETRI_CODICE = 4;
  private static int PFL_PARAMETRI_SCEBENBUTLAB = 5;
  private static int PFL_PARAMETRI_INFOBENEBUTT = 6;
  private static int PFL_PARAMETRI_DELIBERA = 7;
  private static int PFL_PARAMETRI_TRATTINO = 8;
  private static int PFL_PARAMETRI_NUMERODELIBE = 9;
  private static int PFL_PARAMETRI_SLASH = 10;
  private static int PFL_PARAMETRI_ANNODELIBERA = 11;
  private static int PFL_PARAMETRI_SCELTADELIBE = 12;
  private static int PFL_PARAMETRI_INFODELIBERA = 13;
  private static int PFL_PARAMETRI_ELABORA = 14;

  private static int PPQRY_PARAMETRI219 = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_T72 = 2;
  private static int PPQRY_T60 = 3;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI85(IMDB);
    //
    //
    Init_PQRY_PARAMETRI219(IMDB);
    Init_PQRY_PARAMETRI219_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI85(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI85, 11);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI85, "TBL_PARAMETRI85");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMCASSA,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMESERCIZ,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARADATARITE, "PARADATARITE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARADATARITE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMSTART, "PARAMSTART");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMSTART,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMGRUPPO, "PARAMGRUPPO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMGRUPPO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMBOLLO, "PARAMBOLLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMDELIBER, "PARAMDELIBER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMDELIBER,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARANUMEDELI, "PARANUMEDELI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARANUMEDELI,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAANNODELI, "PARAANNODELI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAANNODELI,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMSTIPEND, "PARAMSTIPEND");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMSTIPEND,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMCODICE, "PARAMCODICE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI85,IMDBDef5.FLD_PARAMETRI85_PARAMCODICE,2,15,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI85, 0);
  }

  private static void Init_PQRY_PARAMETRI219(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI219, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI219, "PQRY_PARAMETRI219");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, "PARAMGRUPPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMBOLLO, "PARAMBOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, "PARAMCODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, "PARAMDELIBER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, "PARANUMEDELI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, "PARAANNODELI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMSTIPEND, "PARAMSTIPEND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219,IMDBDef14.PQSL_PARAMETRI219_PARAMSTIPEND,6,49,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI219, 0);
  }

  private static void Init_PQRY_PARAMETRI219_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI219_RS, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI219_RS, "PQRY_PARAMETRI219_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, "PARAMGRUPPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMBOLLO, "PARAMBOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, "PARAMCODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, "PARAMDELIBER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, "PARANUMEDELI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, "PARAANNODELI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMSTIPEND, "PARAMSTIPEND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI219_RS,IMDBDef14.PQSL_PARAMETRI219_PARAMSTIPEND,6,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstrazioneImputazioniLiq(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstrazioneImputazioniLiq()
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
    FormIdx = MyGlb.FRM_ESTRAIMPULIQ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2EB5EA6E-7EE9-4297-A7EB-FB9DA462D537";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 452;
    DesignHeight = 274;
    set_Caption(new IDVariant("Estrazione Imputazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 452;
    Frames[1].Height = 248;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 248;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 452-MyGlb.PAN_OFFS_X, 248-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "69360C9A-ED32-4ED4-B1EC-1C526D1E3EB2");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1440, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI85, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESTRAIMPULIQ_PARAMETRI219();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCEBENBUTLAB) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCELTADELIBE) {
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
    return (obj instanceof EstrazioneImputazioniLiq);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstrazioneImputazioniLiq.class.getName() : (Glb.ClassWithPackage(EstrazioneImputazioniLiq.class) ? EstrazioneImputazioniLiq.class.getName().substring(EstrazioneImputazioniLiq.class.getPackage().getName().length() + 1) : EstrazioneImputazioniLiq.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_PARAMETRI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARAMETRI_BENBENEFICIA)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_BENBENEFICIA))), IDL.Today(), (new IDVariant("ESTIMP")), (new IDVariant(0)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "ParametriOnGetSmartLookup", _e);
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
      v_NOMECAPTION = (new IDVariant("Estrazione Imputazioni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARAMEDELETE();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMBOLLO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMGRUPPO, 0, (new IDVariant(999)));
      MainFrm.SettaNLSCHAR();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMCASSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARADATARITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMSTART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMGRUPPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMDELIBER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARANUMEDELI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAANNODELI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMSTIPEND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMCODICE, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "EndModalEvent", _e);
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
      PAN_PARAMETRI.PanelCommand(Glb.PCM_UPDATE);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "Unload", _e);
    }
  }

  // **********************************************************************
  // Apri Scegli Soggetto
  // **********************************************************************
  public int ApriScegliSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scegli Soggetto Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "ApriScegliSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MYGRUPPO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYDATAUGUALE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYDATASUPERI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYDATAELAB = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_TOTESTRAZION = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // controlli bloccanti
      // 
      {
        // 
        // mappo valore sul gruppo
        // 
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, 0).equals((new IDVariant(999)), true))
        {
          v_MYGRUPPO = (new IDVariant(-1));
        }
        else
        {
          v_MYGRUPPO = IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, 0);
        }
        // 
        // controllo se il gruppo è nullo
        // 
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, 0)))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Valore Obbligatorio sul Gruppo !", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
        // 
        // controllo se i dati della delibera sono incompleti
        // 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, 0))) && IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          // 
          // controllo se la delibera esiste
          // 
          {
            IDVariant v_ESISTE = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  DEL A ");
            SQL.append("where (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_ESISTE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (!(IDL.NullValue(v_ESISTE,(new IDVariant(0))).compareTo((new IDVariant(0)), true)>0))
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Delibera Non Presente !", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
              return 0;
            }
          }
        }
        else
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, 0))) || IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Dati della Delibera Incompleti!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            return 0;
          }
        }
        // 
        // controllo se data liq. stipendi è stata inserita
        // 
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMSTIPEND, 0)))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Valore Obbligatorio sulla Data !", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
        // 
        // controllo se il isngolo gruppo ha la sezione valorizzata
        // 
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, 0).compareTo((new IDVariant(999)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, 0))))
          {
            IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  T72 A ");
            SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
              v_MSG1 = (new IDVariant("Errore in lettura su T72 per il gruppo", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG1); 
              return 0;
            }
            else
            {
              if (!(IDL.NullValue(v_COUNT,(new IDVariant(0))).compareTo((new IDVariant(0)), true)>0))
              {
                IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
                v_MSG1 = (new IDVariant("Il gruppo è collegato a una Sezione: non può essere estratto singolarmente", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_MSG1); 
                return 0;
              }
            }
          }
        }
      }
      // 
      // controlli non bloccanti
      // 
      {
        // 
        // controllo se sono stati scelti tutti i gruppi se qualcuno non è collegato alla sezione
        // 
        {
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, 0).equals((new IDVariant(999)), true))
          {
            IDVariant v_TIPO = new IDVariant(0,IDVariant.STRING);
            v_TIPO = (new IDVariant("SP", IDVariant.STRING));
            IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  T72 A ");
            SQL.append("where (A.TIPO = " + IDL.CSql(v_TIPO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((A.SEZIONE IS NULL)) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
              v_MSG2 = (new IDVariant("Errore in lettura su T72 per il gruppo", IDVariant.STRING));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MSG2, (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, 0)))); 
            }
            else
            {
              if (IDL.NullValue(v_COUNT,(new IDVariant(0))).compareTo((new IDVariant(0)), true)>0)
              {
                IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                v_MSG = (new IDVariant("Non tutti i Gruppi relativi a Spese del Personale sono collegati alla sezione. ", IDVariant.STRING));
                IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
                v_MSG1 = (new IDVariant("Continuare?", IDVariant.STRING));
                if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_MSG, (new IDVariant("<BR/>"))), v_MSG1))))
                {
                  return 0;
                }
                else
                {
                  // 
                  // forse si può eliminare?
                  // 
                  v_MYGRUPPO = (new IDVariant(-1));
                }
              }
            }
          }
        }
        // 
        // controllo se dati liq stipendi è maggiore o uguale  alla data ultima estrazione
        // 
        {
          IDVariant v_TIPO = new IDVariant(0,IDVariant.STRING);
          v_TIPO = (new IDVariant("SP", IDVariant.STRING));
          // 
          // se è stao scelto gruppo= Tutti
          // 
          if (v_MYGRUPPO.equals((new IDVariant(-1)), true))
          {
            DataEstrazione(v_MYDATAUGUALE, v_MYDATASUPERI, (new IDVariant("S")), v_TIPO, IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMSTIPEND, 0));
            if (v_MYDATAUGUALE.equals((new IDVariant(1)), true))
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("La data liquidazione stipendi  e' ", IDVariant.STRING));
              IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
              v_MSG2 = (new IDVariant("uguale a quella dell'ultima estrazione di un gruppo.", IDVariant.STRING));
              IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);
              v_MSG3 = (new IDVariant("Si vuole continuare?", IDVariant.STRING));
              if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG, (new IDVariant("<BR/>"))), v_MSG2), (new IDVariant("<BR/>"))), v_MSG3))))
              {
                return 0;
              }
            }
            if (v_MYDATASUPERI.equals((new IDVariant(1)), true))
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Data ultima estrazione di un gruppo superiore alla data liquidazione stipendi.", IDVariant.STRING));
              IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);
              v_MSG3 = (new IDVariant("Si vuole continuare?", IDVariant.STRING));
              if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(IDL.Add(v_MSG, (new IDVariant("<BR/>"))), (new IDVariant("<BR/>"))), v_MSG3))))
              {
                return 0;
              }
            }
          }
          else
          {
            // 
            // se è stato scelto solo un gruppo
            // 
            IDVariant v_EC1 = new IDVariant(0,IDVariant.INTEGER);
            v_EC1 = Dataelab1(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMGRUPPO, 0), v_MYDATAELAB);
            if (v_EC1.equals((new IDVariant(-1)), true))
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Errore di accesso al database !", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
              return 0;
            }
            else
            {
              if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMSTIPEND, 0).equals(v_MYDATAELAB, true))
              {
                IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                v_MSG = (new IDVariant("La data liquidazione stipendi  e' uguale a quella dell'ultima estrazione.", IDVariant.STRING));
                IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
                v_MSG1 = (new IDVariant("Si vuole continuare?", IDVariant.STRING));
                if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_MSG, (new IDVariant("<BR/>"))), v_MSG1))))
                {
                  return 0;
                }
              }
              else
              {
                if (v_MYDATAELAB.compareTo(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMSTIPEND, 0), true)>0)
                {
                  IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                  v_MSG = (new IDVariant("Data ultima estrazione (", IDVariant.STRING));
                  IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
                  v_MSG1 = (new IDVariant(") superiore alla data liquidazione stipendi. Si vuole continuare?", IDVariant.STRING));
                  if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_MSG, IDL.ToString(v_MYDATAELAB)), v_MSG1))))
                  {
                    return 0;
                  }
                }
              }
            }
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.GRLESTRAZIONE(v_MYGRUPPO, IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMSTIPEND, 0), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMBOLLO, 0)), IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMDELIBER, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAANNODELI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARANUMEDELI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_TOTESTRAZION);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      else
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Elaborazione eseguita.", IDVariant.STRING));
        IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
        v_MSG1 = (new IDVariant("Sono state estratte", IDVariant.STRING));
        IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);
        v_MSG3 = (new IDVariant("imputazioni", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG, (new IDVariant("<BR/>"))), v_MSG1), (new IDVariant(" "))), IDL.ToString(v_TOTESTRAZION)), (new IDVariant(" "))), v_MSG3)); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Data Estrazione
  // Datauguale:  - Input/Output
  // Datasup:  - Input/Output
  // es:  - Input
  // ptipo:  - Input
  // Pdata:  - Input
  // **********************************************************************
  public int DataEstrazione (IDVariant Datauguale, IDVariant Datasup, IDVariant es, IDVariant ptipo, IDVariant Pdata)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTIO = (new IDVariant("Estrazione Imputazioni", IDVariant.STRING));
      // 
      // Data Estrazione Body
      // Procedure Body
      // 
      IDVariant v_ANNO = null;
      v_ANNO = IDL.Year(Pdata);
      IDVariant v_MESE = null;
      v_MESE = IDL.Month(Pdata);
      IDVariant v_GIORNO = null;
      v_GIORNO = IDL.Day(Pdata);
      set_Caption(IDL.Add(v_CAPTIO, MainFrm.ESERCIZIO));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  1 as UNO ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      SQL.append("where (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  C.CODICE ");
      SQL.append("from ");
      SQL.append("  IMPUTAZIONI_CONTABILI B, ");
      SQL.append("  T72 C ");
      SQL.append("where (B.SEZIONE LIKE C.SEZIONE) ");
      SQL.append("and   (B.E_S = " + IDL.CSql(es, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((" + IDL.CSql(MainFrm.CODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " IS NULL) OR B.DIVISIONE = " + IDL.CSql(MainFrm.CODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.DATA = TO_DATE((" + IDL.CSql(v_GIORNO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(v_MESE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(v_ANNO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "),'dd/mm/yyyy')) ");
      SQL.append("and   (C.TIPO = " + IDL.CSql(ptipo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (C.D_DATA_ELAB1 = TO_DATE((" + IDL.CSql(v_GIORNO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(v_MESE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(v_ANNO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "),'dd/mm/yyyy')) ");
      SQL.append("))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        Datauguale.set(QV.Get("UNO", IDVariant.INTEGER));
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  1 as UNO ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      SQL.append("where (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  C.CODICE ");
      SQL.append("from ");
      SQL.append("  IMPUTAZIONI_CONTABILI B, ");
      SQL.append("  T72 C ");
      SQL.append("where (B.SEZIONE LIKE C.SEZIONE) ");
      SQL.append("and   (B.E_S = " + IDL.CSql(es, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((" + IDL.CSql(MainFrm.CODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " IS NULL) OR B.DIVISIONE = " + IDL.CSql(MainFrm.CODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.DATA = TO_DATE((" + IDL.CSql(v_GIORNO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(v_MESE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(v_ANNO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "),'dd/mm/yyyy')) ");
      SQL.append("and   (C.TIPO = " + IDL.CSql(ptipo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (C.D_DATA_ELAB1 > TO_DATE((" + IDL.CSql(v_GIORNO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(v_MESE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(v_ANNO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "),'dd/mm/yyyy')) ");
      SQL.append("))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        Datasup.set(QV.Get("UNO", IDVariant.INTEGER));
      }
      QV.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "DataEstrazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dataelab1
  // Explain which processing is carried out by this procedure
  // gruppo:  - Input
  // Dataelab1:  - Input/Output
  // **********************************************************************
  public IDVariant Dataelab1 (IDVariant gruppo, IDVariant Dataelab1)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MYDATEELAB = new IDVariant(0,IDVariant.DATETIME);

    try
    {
      TransCount = 0;
      // 
      // Dataelab1 Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.D_DATA_ELAB1 as T72DDATAELAB ");
      SQL.append("from ");
      SQL.append("  T72 A ");
      SQL.append("where (A.CODICE = " + IDL.CSql(gruppo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MYDATEELAB = QV.Get("T72DDATAELAB", IDVariant.DATETIME) ;
      }
      QV.Close();
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        Dataelab1.set((new IDVariant()));
        return (new IDVariant(-1));
      }
      else
      {
        Dataelab1.set(new IDVariant(v_MYDATEELAB));
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "Dataelab1", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Apri Info Beneficiario
  // **********************************************************************
  public int ApriInfoBeneficiario ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Beneficiario Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI219, IMDBDef14.PQSL_PARAMETRI219_PARAMCODICE, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniLiq", "ApriInfoBeneficiario", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ESTRAIMPULIQ_PARAMETRI219() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI219_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI85, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI85, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI219_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI219_RS, 0, IMDBDef5.TBL_PARAMETRI85, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI219_RS, 0, 0, IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMGRUPPO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI219_RS, 1, 0, IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMBOLLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI219_RS, 2, 0, IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMCODICE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI219_RS, 3, 0, IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMDELIBER, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI219_RS, 4, 0, IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARANUMEDELI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI219_RS, 5, 0, IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAANNODELI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI219_RS, 6, 0, IMDBDef5.TBL_PARAMETRI85, IMDBDef5.FLD_PARAMETRI85_PARAMSTIPEND, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI85, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI85, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI85, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI219_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEBENBUTLAB)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriScegliSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOBENEBUTT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoBeneficiario();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SCELTADELIBE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, "B2C3755F-F1A8-4543-B8ED-6A195EBEE0DA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, "Data Liquidazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_LIST, 0, -9999, 412, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_FORM, 4, 11, 384, 161, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 0, 100);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, "BBEE06FB-F2B9-4DB8-924C-4EB720B33EFA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, "Stipendi");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, "C2CC3F66-F85D-450B-8428-A31EE06F5462");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, "Gruppo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "011F60DB-E98D-4599-9E02-BDF6E9AAB1E5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "Bollo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, "2A8EFC91-3FD0-414F-BF64-F6CD5DE6C397");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, "Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, "Beneficiario");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, "30FA5DC2-5BBD-446D-BB7C-C321DB420C0D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, "Codice");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, "03FD4CFE-12AA-4A12-A062-37A6DF6C5038");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, "45D1F2D4-2ED1-4EF4-979A-19BEF72B1B5E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "FEBB7F50-38F2-487C-8046-B903548A876A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, "88D424D1-189E-4516-A2E9-D7C0FAA0F429");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "536584F6-3348-45CB-96A5-E7CF3129A42F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "Numero Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, "10072E1D-22E5-401F-8D1B-968F699FD686");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "2C171181-AF4A-4E45-826C-BDB6FE30DDE7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "Anno Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, "CC12F306-585E-4E1B-8AB7-E4B6DB93CD34");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "222CF836-7E79-46D3-8AE9-FD316BA7C5B5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "647FF5F6-71EA-41F3-A043-1C210F2DA3A2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_LIST, "Stipendi");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_FORM, 24, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STIPENDI, MyGlb.PANEL_FORM, "Stipendi");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STIPENDI, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STIPENDI, PPQRY_PARAMETRI219, "A.PARAMSTIPEND", "PARAMSTIPEND", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, MyGlb.PANEL_LIST, "Gruppo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, MyGlb.PANEL_FORM, 28, 64, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPO, MyGlb.PANEL_FORM, "Gruppo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_GRUPPO, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_GRUPPO, PPQRY_PARAMETRI219, "A.PARAMGRUPPO", "PARAMGRUPPO", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 40, 92, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BOLLO, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BOLLO, PPQRY_PARAMETRI219, "A.PARAMBOLLO", "PARAMBOLLO", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_LIST, 0, 36, 412, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_FORM, 8, 120, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENBENEFICIA, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BENBENEFICIA, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BENBENEFICIA, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "BENBENEFICIA", 5, 162, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, 284, 120, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, "Cod.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICE, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICE, PPQRY_PARAMETRI219, "A.PARAMCODICE", "PARAMCODICE", 2, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_LIST, 308, 0, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_FORM, 348, 124, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEBENBUTLAB, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEBENBUTLAB, -1, "", "SCEBENBUTLAB", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_LIST, 324, 4, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_FORM, 368, 124, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOBENEBUTT, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOBENEBUTT, -1, "", "INFOBENEBUTT", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 28, 148, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMETRI219, "A.PARAMDELIBER", "PARAMDELIBER", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_LIST, 108, 28, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_FORM, 132, 148, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINO, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINO, -1, "", "TRATTINO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "Num. Delibera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 152, 148, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delib.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMETRI219, "A.PARANUMEDELI", "PARANUMEDELI", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_LIST, 116, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_FORM, 200, 148, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SLASH, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 220, 148, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "Ann. Delib.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMETRI219, "A.PARAANNODELI", "PARAANNODELI", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, MyGlb.PANEL_LIST, 240, 32, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, MyGlb.PANEL_FORM, 264, 152, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTADELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCELTADELIBE, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCELTADELIBE, -1, "", "SCELTADELIBE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 284, 152, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODELIBERA, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 188, 204, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 300, 188, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENBENEFICIA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~PARAMCODICE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BEN, PFL_PARAMETRI_CODICE, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENBENEFICIA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "BENBENEFICIA", "Beneficiario");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "AL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T72CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T72DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T72 A ");
    SQL.append("where (A.CODICE = ~~PARAMGRUPPO~~) ");
    SQL.append("and   (A.TIPO = 'SP') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  999, ");
    SQL.append("  'Tutti i gruppi collegati a Sezioni' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMGRUPPO~~ = 999) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T72, 0, SQL, PFL_PARAMETRI_GRUPPO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T72CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T72DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T72 A ");
    SQL.append("where (A.TIPO = 'SP') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  999, ");
    SQL.append("  'Tutti i gruppi collegati a Sezioni' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T72, 1, SQL, PFL_PARAMETRI_GRUPPO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T72, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~PARAMBOLLO~~) ");
    SQL.append("and   (A.TIPO = 'L' OR (A.TIPO IS NULL)) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMBOLLO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 0, SQL, PFL_PARAMETRI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.TIPO = 'L' OR (A.TIPO IS NULL)) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 1, SQL, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI219", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI219, IMDBDef14.PQRY_PARAMETRI219_RS, IMDBDef5.TBL_PARAMETRI85);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STIPENDI, IMDBDef5.FLD_PARAMETRI85_PARAMSTIPEND);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_GRUPPO, IMDBDef5.FLD_PARAMETRI85_PARAMGRUPPO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BOLLO, IMDBDef5.FLD_PARAMETRI85_PARAMBOLLO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICE, IMDBDef5.FLD_PARAMETRI85_PARAMCODICE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef5.FLD_PARAMETRI85_PARAMDELIBER);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef5.FLD_PARAMETRI85_PARANUMEDELI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef5.FLD_PARAMETRI85_PARAANNODELI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI85");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
