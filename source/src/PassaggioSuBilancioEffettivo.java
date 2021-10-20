// **********************************************
// Passaggio Su Bilancio Effettivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PassaggioSuBilancioEffettivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_ESEREFFDAAGG = 0;

  private static int PFL_PARAMETRI_ESERCDAAGGIO = 0;
  private static int PFL_PARAMETRI_ESERCIZIPLUR = 1;
  private static int PFL_PARAMETRI_ETICHLABELDX = 2;
  private static int PFL_PARAMETRI_RESIDUPRESUN = 3;
  private static int PFL_PARAMETRI_ETICRESIPRES = 4;
  private static int PFL_PARAMETRI_STANZICOMPET = 5;
  private static int PFL_PARAMETRI_ETICSTANCOMP = 6;
  private static int PFL_PARAMETRI_STANZIACASSA = 7;
  private static int PFL_PARAMETRI_ETICSTANCASS = 8;
  private static int PFL_PARAMETRI_GIAIMPEGNATO = 9;
  private static int PFL_PARAMETRI_ETICHGIAIMPE = 10;
  private static int PFL_PARAMETRI_PREVESERPREC = 11;
  private static int PFL_PARAMETRI_ETIPREESEPRE = 12;
  private static int PFL_PARAMETRI_PRECASESEPRE = 13;
  private static int PFL_PARAMETRI_ETIPRECAESPR = 14;
  private static int PFL_PARAMETRI_OK = 15;
  private static int PFL_PARAMETRI_ANNULLA = 16;
  private static int PFL_PARAMETRI_DATAAPPRBILA = 17;

  private static int PPQRY_OUT10 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OUT(IMDB);
    //
    //
    Init_PQRY_OUT10(IMDB);
    Init_PQRY_OUT10_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OUT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_OUT, 9);
    IMDB.set_TblCode(IMDBDef3.TBL_OUT, "TBL_OUT");
    IMDB.set_FldCode(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ESE_DA_GEN, "ESE_DA_GEN");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ESE_DA_GEN,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMRESPRE, "ROWNAMRESPRE");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMRESPRE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMSTACOM, "ROWNAMSTACOM");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMSTACOM,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMSTACAS, "ROWNAMSTACAS");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMSTACAS,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMGIAIMP, "ROWNAMGIAIMP");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMGIAIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMPRESPR, "ROWNAMPRESPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMPRESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_RONAPRCAESPR, "RONAPRCAESPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_RONAPRCAESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMDAAPBI, "ROWNAMDAAPBI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT,IMDBDef3.FLD_OUT_ROWNAMDAAPBI,6,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_OUT, 0);
  }

  private static void Init_PQRY_OUT10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT10, 9);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT10, "PQRY_OUT10");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ESE_DA_GEN, "ESE_DA_GEN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ESE_DA_GEN,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMSTACOM, "ROWNAMSTACOM");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMSTACOM,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMRESPRE, "ROWNAMRESPRE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMRESPRE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMSTACAS, "ROWNAMSTACAS");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMSTACAS,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMGIAIMP, "ROWNAMGIAIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMGIAIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMPRESPR, "ROWNAMPRESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMPRESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_RONAPRCAESPR, "RONAPRCAESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_RONAPRCAESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMDAAPBI, "ROWNAMDAAPBI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10,IMDBDef11.PQSL_OUT10_ROWNAMDAAPBI,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_OUT10, 0);
  }

  private static void Init_PQRY_OUT10_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT10_RS, 9);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT10_RS, "PQRY_OUT10_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ESE_DA_GEN, "ESE_DA_GEN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ESE_DA_GEN,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMSTACOM, "ROWNAMSTACOM");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMSTACOM,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMRESPRE, "ROWNAMRESPRE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMRESPRE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMSTACAS, "ROWNAMSTACAS");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMSTACAS,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMGIAIMP, "ROWNAMGIAIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMGIAIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMPRESPR, "ROWNAMPRESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMPRESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_RONAPRCAESPR, "RONAPRCAESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_RONAPRCAESPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMDAAPBI, "ROWNAMDAAPBI");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT10_RS,IMDBDef11.PQSL_OUT10_ROWNAMDAAPBI,6,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PassaggioSuBilancioEffettivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public PassaggioSuBilancioEffettivo()
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
    FormIdx = MyGlb.FRM_PASSSUBILEFF;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FFF6EB71-3F72-42C5-8B61-328F87DD66A4";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 412;
    DesignHeight = 418;
    set_Caption(new IDVariant("Passaggio su Bilancio Effettivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 412;
    Frames[1].Height = 392;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 392;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 412-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FC098F46-4EC6-492D-AB28-CD192F200C32");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 568, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef3.TBL_OUT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PASSSUBILEFF_OUT10();
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
    return (obj instanceof PassaggioSuBilancioEffettivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PassaggioSuBilancioEffettivo.class.getName() : (Glb.ClassWithPackage(PassaggioSuBilancioEffettivo.class) ? PassaggioSuBilancioEffettivo.class.getName().substring(PassaggioSuBilancioEffettivo.class.getPackage().getName().length() + 1) : PassaggioSuBilancioEffettivo.class.getName()));
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
      IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ESE_DA_GEN, 0, (new IDVariant("PE")));
      IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMRESPRE, 0, (new IDVariant("SI")));
      PAN_PARAMETRI.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PassaggioSuBilancioEffettivo", "LoadEvent", _e);
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
      PAN_PARAMETRI.PanelCommand(Glb.PCM_CANCEL);
      UNLOADEVENT_OUTDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PassaggioSuBilancioEffettivo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // OUT: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_OUTDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ESE_DA_GEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ESERCIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMRESPRE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMSTACOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMSTACAS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMGIAIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMPRESPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_RONAPRCAESPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMDAAPBI, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri On Database Error Event
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Parametri On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PassaggioSuBilancioEffettivo", "ParametriOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties
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
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0).equals((new IDVariant("PE")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0).equals((new IDVariant("EP")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMSTACOM, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PassaggioSuBilancioEffettivo", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
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
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCIZIPLUR)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ESERCIZIO, 0, IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESERCIZIO, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCDAAGGIO)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ESE_DA_GEN, 0, IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0));
        if (IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0).equals((new IDVariant("PE")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ESERCIZIO, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMRESPRE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMSTACAS, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMGIAIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMPRESPR, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_RONAPRCAESPR, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ESERCIZIO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PassaggioSuBilancioEffettivo", "ParametriOnUpdatingRow", _e);
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
      IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
      v_PAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Capitoli_Disp_Cassa_Neg"));
      IDVariant v_NOMESTANOMAL = null;
      v_NOMESTANOMAL = (new IDVariant("Capitoli_Disp_Finanz_Neg"));
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMRESPRE, 0)) && IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMSTACOM, 0)) && IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMSTACAS, 0)) && IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMGIAIMP, 0)) && IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMPRESPR, 0)) && IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_RONAPRCAESPR, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare il tipo di passaggio da effettuare"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0).equals((new IDVariant("EP")), true))
      {
        if (IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESERCIZIO, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<=0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("L'Esercizio di Pluriennale deve essere superiore all'Esercizio Corrente", IDVariant.STRING));
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
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
      }
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  BIL_PASSAGGI_DA_BPR A ");
      SQL.append("where (A.ESERCIZIO = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'PE', " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", DECODE(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'EP', " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.ESERCIZIO))) ");
      SQL.append("and   (A.ESERCIZIO > DECODE(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'TP', " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0)) ");
      SQL.append("and   (A.ESERCIZIO_RIF = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'PE', " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1, " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (NVL(A.RES_PRES, 'NO') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMRESPRE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO')) ");
      SQL.append("and   (NVL(A.STN_CO_REISCR, 'NO') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMSTACOM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO')) ");
      SQL.append("and   (NVL(A.STN_CA, 'NO') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMSTACAS, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO')) ");
      SQL.append("and   (NVL(A.GIA_IMP, 'NO') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMGIAIMP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO')) ");
      SQL.append("and   (NVL(A.PREV_ANNO_PREC, 'NO') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMPRESPR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO')) ");
      SQL.append("and   (NVL(A.PREV_CASSA_ANNO_PREC, 'NO') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_RONAPRCAESPR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO')) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Passaggio già eseguito, si vuole ripeterlo?"));
        if (!(MainFrm.MessageConfirm(v_AVVISO)))
        {
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.BILPASSAGGIOBPRBILARM(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?(new IDVariant(0)):((IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESE_DA_GEN, 0).equals((new IDVariant("EP"))))?IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ESERCIZIO, 0):(new IDVariant(9999)))), IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMRESPRE, 0), IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMSTACOM, 0), IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMSTACAS, 0), IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMGIAIMP, 0), IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMPRESPR, 0), IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_RONAPRCAESPR, 0), IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMDAAPBI, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        if (IMDB.Value(IMDBDef11.PQRY_OUT10, IMDBDef11.PQSL_OUT10_ROWNAMSTACAS, 0).equals((new IDVariant("SI")), true))
        {
          // 
          // In questo caso possiamo selezionare solo il Primo Esercizio
          // Esercizio di Sessione)
          // 
          IDVariant v_VCOUNTANOM = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  BIL A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NVL(A.DISPONIBILITA_CA, 0) < 0) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNTANOM = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNTANOM.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Sono presenti Capitoli con Disponibilità di Cassa Negativa"));
            MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
            MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
            v_SMS = IDL.Add(IDL.Add(v_SMS, (new IDVariant("<BR/>"))), v_AVVISO);
          }
        }
        if (IMDB.Value(IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMSTACOM, 0).equals((new IDVariant("SI")), true))
        {
          IDVariant v_VANOMALIEFIN = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  BIL_FIN_V A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NVL(A.DISPONIBILITA_CALC, 0) < 0) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VANOMALIEFIN = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VANOMALIEFIN.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_AVVISOFIN = null;
            v_AVVISOFIN = (new IDVariant("Sono presenti Capitoli con Finanziamento con Disponibilità Negativa"));
            MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
            MainFrm.LanciaStampaJasper(v_NOMESTANOMAL, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
            v_SMS = IDL.Add(IDL.Add(v_SMS, (new IDVariant("<BR/>"))), v_AVVISOFIN);
          }
        }
        MainFrm.set_AlertMessage(v_SMS); 
        // MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PassaggioSuBilancioEffettivo", "OkProc", _e);
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
      MainFrm.ErrObj.ProcError ("PassaggioSuBilancioEffettivo", "AnnullaProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OUT
  // Primary record source for panel data
  // **********************************************************************
  private void PASSSUBILEFF_OUT10() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_OUT10_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_OUT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_OUT, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_OUT10_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_OUT10_RS, 0, IMDBDef3.TBL_OUT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT10_RS, 0, 0, IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ESE_DA_GEN, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT10_RS, 1, 0, IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ESERCIZIO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT10_RS, 2, 0, IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMSTACOM, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT10_RS, 3, 0, IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMRESPRE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT10_RS, 4, 0, IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMSTACAS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT10_RS, 5, 0, IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMGIAIMP, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT10_RS, 6, 0, IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMPRESPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT10_RS, 7, 0, IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_RONAPRCAESPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT10_RS, 8, 0, IMDBDef3.TBL_OUT, IMDBDef3.FLD_OUT_ROWNAMDAAPBI, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_OUT, 0);
      if (IMDB.Eof(IMDBDef3.TBL_OUT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_OUT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_OUT10_RS, 0);
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
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_OK)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OkProc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AnnullaProc();
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, "13EDA300-A7F4-4773-B108-1436EFCBF308");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, "Esercizio Effettivo da Aggiornare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, MyGlb.PANEL_FORM, 44, 15, 316, 101, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, 0, 183);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESEREFFDAAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, "F353681C-3B45-45CD-BE7A-EAB412835AC1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, "Esercizio Da Aggiornare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, "A76ABDA6-35F4-4591-8657-8A780B0AA14F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, "3364CBC0-E348-4529-9AB0-F045E02B595A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, "99B80712-7178-4AA7-95DA-4BFC40061B11");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, "Residui Presunti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, "174D7667-54FF-4DCD-B2F2-77AF9502748D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, "Residui Presunti");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, "5FED8A3A-1053-4748-85BF-8A4B7530D89F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, "Stanziamento Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, "F0069868-2D8C-4F78-B34E-60CD04D13632");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, "Stanziamento di Competenza e Reiscrizioni");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, "F5492B33-400D-4C65-B95E-B084B945FFD6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, "Stanziamento Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, "9AA7ADF2-3095-4659-B154-AFD1EB213E09");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, "Stanziamento Cassa");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, "B6013BF4-826B-4CFF-B912-C78380FDE8B3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, "Gia Impegnato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, "967ADDA4-4662-4E43-89E8-F7EEBAFB4FA9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, "Già Impegnato");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, "30099EAA-73EF-464E-AF3B-1624C93DA6FA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, "Previsione Esercizio Precedente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, "18B4283A-AFE7-4DA7-85E7-58F7D11E438F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, "Previsione Definitiva Esercizio Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, "E578A0A5-6021-4A36-9058-B2EB6E467CA4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, "Previsione Cassa Esercizio Precedente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, "C0147D1B-8094-482E-91C1-1F77E089FD68");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, "Previsione Definitiva Cassa Esercizio Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, "A8514C4E-60A1-42CF-879B-7F0056964955");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, "OK");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, "C219F300-EBB0-4855-8571-18FA54C2D97E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, "Annulla");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, "C9E0BBC6-882A-4363-B5F1-0E3662218B5F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, "Data Approvazione Bilancio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, "Verranno cancellate le sole Variazioni di Bilancio con Data di Registrazione precedente alla data indicata");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, MyGlb.PANEL_LIST, "Eserc. Da Aggior.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, MyGlb.PANEL_FORM, 48, 40, 128, 72, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, MyGlb.PANEL_FORM, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, MyGlb.PANEL_FORM, 5);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAAGGIO, MyGlb.PANEL_FORM, "Esercizio Da Aggiornare");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCDAAGGIO, -1, GRP_PARAMETRI_ESEREFFDAAGG);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCDAAGGIO, PPQRY_OUT10, "A.ESE_DA_GEN", "ESE_DA_GEN", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_FORM, 180, 60, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIPLUR, -1, GRP_PARAMETRI_ESEREFFDAAGG);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIPLUR, PPQRY_OUT10, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, MyGlb.PANEL_LIST, 344, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, MyGlb.PANEL_FORM, 340, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHLABELDX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHLABELDX, -1, GRP_PARAMETRI_ESEREFFDAAGG);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHLABELDX, -1, "", "ETICHLABELDX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, "Residui Presunti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 48, 128, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, "Residui Presunti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RESIDUPRESUN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RESIDUPRESUN, PPQRY_OUT10, "A.ROWNAMRESPRE", "ROWNAMRESPRE", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUPRESUN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUPRESUN, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_LIST, 88, 140, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_FORM, 72, 128, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICRESIPRES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICRESIPRES, -1, "", "ETICRESIPRES", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, MyGlb.PANEL_LIST, "Stanziamento Competenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, MyGlb.PANEL_FORM, 48, 152, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZICOMPET, MyGlb.PANEL_FORM, "Stanziam. Compet.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZICOMPET, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZICOMPET, PPQRY_OUT10, "A.ROWNAMSTACOM", "ROWNAMSTACOM", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZICOMPET, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZICOMPET, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, MyGlb.PANEL_LIST, 80, 132, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, MyGlb.PANEL_FORM, 72, 152, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCOMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSTANCOMP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSTANCOMP, -1, "", "ETICSTANCOMP", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, "Stanziamento Cassa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, 48, 176, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, "Stanziamento Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZIACASSA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZIACASSA, PPQRY_OUT10, "A.ROWNAMSTACAS", "ROWNAMSTACAS", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIACASSA, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIACASSA, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_LIST, 96, 148, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_FORM, 72, 176, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSTANCASS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSTANCASS, -1, "", "ETICSTANCASS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, "Gia Impegnato");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, 48, 200, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, "Gia Impegnato");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_GIAIMPEGNATO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_GIAIMPEGNATO, PPQRY_OUT10, "A.ROWNAMGIAIMP", "ROWNAMGIAIMP", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_GIAIMPEGNATO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_GIAIMPEGNATO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_LIST, 120, 172, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_FORM, 72, 200, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHGIAIMPE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHGIAIMPE, -1, "", "ETICHGIAIMPE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_LIST, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_LIST, "Previsione Esercizio Precedente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_FORM, 48, 224, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_FORM, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVESERPREC, MyGlb.PANEL_FORM, "Previsione Esercizio Precedente");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PREVESERPREC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PREVESERPREC, PPQRY_OUT10, "A.ROWNAMPRESPR", "ROWNAMPRESPR", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PREVESERPREC, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PREVESERPREC, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_LIST, 128, 180, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_FORM, 72, 224, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPREESEPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETIPREESEPRE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETIPREESEPRE, -1, "", "ETIPREESEPRE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_LIST, 0, 36, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_LIST, 224);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_LIST, "Previsione Cassa Esercizio Precedente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_FORM, 48, 248, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_FORM, 224);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PRECASESEPRE, MyGlb.PANEL_FORM, "Previsione Cassa Esercizio Precedente");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PRECASESEPRE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PRECASESEPRE, PPQRY_OUT10, "A.RONAPRCAESPR", "RONAPRCAESPR", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PRECASESEPRE, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PRECASESEPRE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_LIST, 136, 188, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_FORM, 72, 248, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIPRECAESPR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETIPRECAESPR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETIPRECAESPR, -1, "", "ETIPRECAESPR", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 184, 260, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 192, 336, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OK, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 192, 268, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 280, 336, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNULLA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, MyGlb.PANEL_LIST, "Data Approvazione Bilancio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, MyGlb.PANEL_FORM, 48, 288, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, MyGlb.PANEL_FORM, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAPPRBILA, MyGlb.PANEL_FORM, "Data Approvazione Bilancio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAAPPRBILA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAAPPRBILA, PPQRY_OUT10, "A.ROWNAMDAAPBI", "ROWNAMDAAPBI", 6, 10, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'PE' as NUOVAESPRESS, ");
    SQL.append("  1 as ORDINAMENTO, ");
    SQL.append("  DECODE('PE', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') || ' (' || TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) || ')' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (~~ESE_DA_GEN~~ = 'PE') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'EP', ");
    SQL.append("  2, ");
    SQL.append("  DECODE('EP', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ESE_DA_GEN~~ = 'EP') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'TP', ");
    SQL.append("  3, ");
    SQL.append("  DECODE('TP', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where (~~ESE_DA_GEN~~ = 'TP') ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_PARAMETRI_ESERCDAAGGIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'PE' as NUOVAESPRESS, ");
    SQL.append("  1 as ORDINAMENTO, ");
    SQL.append("  DECODE('PE', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') || ' (' || TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) || ')' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'EP', ");
    SQL.append("  2, ");
    SQL.append("  DECODE('EP', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'TP', ");
    SQL.append("  3, ");
    SQL.append("  DECODE('TP', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_PARAMETRI_ESERCDAAGGIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_OUT10", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_OUT10, IMDBDef11.PQRY_OUT10_RS, IMDBDef3.TBL_OUT);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCDAAGGIO, IMDBDef3.FLD_OUT_ESE_DA_GEN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIPLUR, IMDBDef3.FLD_OUT_ESERCIZIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_RESIDUPRESUN, IMDBDef3.FLD_OUT_ROWNAMRESPRE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STANZICOMPET, IMDBDef3.FLD_OUT_ROWNAMSTACOM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STANZIACASSA, IMDBDef3.FLD_OUT_ROWNAMSTACAS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_GIAIMPEGNATO, IMDBDef3.FLD_OUT_ROWNAMGIAIMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PREVESERPREC, IMDBDef3.FLD_OUT_ROWNAMPRESPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PRECASESEPRE, IMDBDef3.FLD_OUT_RONAPRCAESPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAAPPRBILA, IMDBDef3.FLD_OUT_ROWNAMDAAPBI);
    PAN_PARAMETRI.SetMasterTable(0, "OUT");
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
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
