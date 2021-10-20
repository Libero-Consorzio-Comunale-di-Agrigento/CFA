// **********************************************
// Scelta Voce P E G Personalizzata Senza Obiettivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaVocePEGPersonalizzataSenzaObiettivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VOCEPEG_CAPITOLO = 0;
  private static int PFL_VOCEPEG_ARTICOLO = 1;
  private static int PFL_VOCEPEG_TITOLO = 2;
  private static int PFL_VOCEPEG_ORDINAMENEXP = 3;
  private static int PFL_VOCEPEG_ORDINAMENTO1 = 4;
  private static int PFL_VOCEPEG_ORDINAMENTO2 = 5;
  private static int PFL_VOCEPEG_ORDINAMENTO3 = 6;
  private static int PFL_VOCEPEG_GRANDE = 7;
  private static int PFL_VOCEPEG_PICCOLA = 8;
  private static int PFL_VOCEPEG_PROGRAMMA = 9;
  private static int PFL_VOCEPEG_DESPROGRAMMA = 10;
  private static int PFL_VOCEPEG_PROGETTO = 11;
  private static int PFL_VOCEPEG_DESPROGETTO = 12;
  private static int PFL_VOCEPEG_FATTORE = 13;
  private static int PFL_VOCEPEG_DESFATTORE = 14;
  private static int PFL_VOCEPEG_CENTRO = 15;
  private static int PFL_VOCEPEG_DESCENTRO = 16;

  private static int PPQRY_CAP19 = 0;


  IDPanel PAN_VOCEPEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI383(IMDB);
    //
    //
    Init_PQRY_CAP19(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI383(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI383, 11);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI383, "TBL_PARAMETRI383");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMESECF4, "ROWNAMESECF4");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMESECF4,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_TIPO_VOCE_PEG, "TIPO_VOCE_PEG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_TIPO_VOCE_PEG,1,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI383,IMDBDef1.FLD_PARAMETRI383_ROWNAMCODTER,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI383, 0);
  }

  private static void Init_PQRY_CAP19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_CAP19, 16);
    IMDB.set_TblCode(IMDBDef7.PQRY_CAP19, "PQRY_CAP19");
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_RECORORDIEXP, "RECORORDIEXP");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_RECORORDIEXP,1,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_RECORDORDINA, "RECORDORDINA");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_RECORDORDINA,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_RECORDORDIN2, "RECORDORDIN2");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_RECORDORDIN2,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_RECORDORDIN3, "RECORDORDIN3");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_RECORDORDIN3,1,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_PROGRAMMA,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_DES_PROGRAMMA, "DES_PROGRAMMA");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_DES_PROGRAMMA,5,100,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_DES_PROGETTO, "DES_PROGETTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_DES_PROGETTO,5,100,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_DES_FATTORE, "DES_FATTORE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_DES_FATTORE,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_DES_CENTRO, "DES_CENTRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP19,IMDBDef7.PQSL_CAP19_DES_CENTRO,5,60,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_CAP19, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaVocePEGPersonalizzataSenzaObiettivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaVocePEGPersonalizzataSenzaObiettivi()
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
    FormIdx = MyGlb.FRM_SCVOPEGPESEO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F5CB9C67-EF61-4E35-8FA7-BA1244C70E53";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 390;
    set_Caption(new IDVariant("Scelta Voce P E G Personalizzata Senza Obiettivi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 364;
    Frames[1].Caption = "Voce P E G";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_VOCEPEG = new IDPanel(w, this, 1, "PAN_VOCEPEG");
    Frames[1].Content = PAN_VOCEPEG;
    PAN_VOCEPEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VOCEPEG.VS = MainFrm.VisualStyleList;
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "524F4FE3-E6EA-453A-B1DA-A369C4595849");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1312, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VOCEPEG.InitStatus = 1;
    PAN_VOCEPEG_Init();
    PAN_VOCEPEG_InitFields();
    PAN_VOCEPEG_InitQueries();
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
      PAN_VOCEPEG.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaVocePEGPersonalizzataSenzaObiettivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaVocePEGPersonalizzataSenzaObiettivi.class.getName() : (Glb.ClassWithPackage(SceltaVocePEGPersonalizzataSenzaObiettivi.class) ? SceltaVocePEGPersonalizzataSenzaObiettivi.class.getName().substring(SceltaVocePEGPersonalizzataSenzaObiettivi.class.getPackage().getName().length() + 1) : SceltaVocePEGPersonalizzataSenzaObiettivi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Voce P E G On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VOCEPEG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VOCEPEG);
      // 
      // Voce P E G On Dynamic Properties Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePEGPersonalizzataSenzaObiettivi", "VocePEGOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Voce P E G On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VOCEPEG_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Voce P E G On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_VOCEPEG.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_VOCEPEG.Freezed = (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePEGPersonalizzataSenzaObiettivi", "VocePEGOnCommandEvent", _e);
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
    IDVariant v_TIPOVOCEPEG = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SECF4 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add((new IDVariant("Scelta Capitolo")), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_ROWNAMEESERC, 0))));
      VisibilitàASecondaES();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_VOCE_PEG as POLPARTIVOPE, ");
      SQL.append("  A.SE_CF4 as POLPARASECF4 ");
      SQL.append("from ");
      SQL.append("  POL_PARAMETRI A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TIPOVOCEPEG = QV.Get("POLPARTIVOPE", IDVariant.INTEGER) ;
        v_SECF4 = QV.Get("POLPARASECF4", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_ROWNAMESECF4, 0, new IDVariant(v_SECF4));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_TIPO_VOCE_PEG, 0, new IDVariant(v_TIPOVOCEPEG));
      if ((new IDVariant(MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))).equals((new IDVariant(-1)), true))
      {
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // caption a null
      // 
      {
        PAN_VOCEPEG.set_Header(Glb.OBJ_FIELD,PFL_VOCEPEG_DESPROGRAMMA, (new IDVariant("")).stringValue());
        PAN_VOCEPEG.set_Header(Glb.OBJ_FIELD,PFL_VOCEPEG_DESPROGETTO, (new IDVariant("")).stringValue());
        PAN_VOCEPEG.set_Header(Glb.OBJ_FIELD,PFL_VOCEPEG_DESFATTORE, (new IDVariant("")).stringValue());
        PAN_VOCEPEG.set_Header(Glb.OBJ_FIELD,PFL_VOCEPEG_DESCENTRO, (new IDVariant("")).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePEGPersonalizzataSenzaObiettivi", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_ROWNAMETITOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_ROWNAMEFUNZI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_ROWNAMESERVI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_ROWNAMECATEG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_ROWNAMCODTER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_ROWNAMCODINT, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePEGPersonalizzataSenzaObiettivi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Visibilità A Seconda ES
  // **********************************************************************
  public int VisibilitàASecondaES ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità A Seconda ES Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI383, IMDBDef1.FLD_PARAMETRI383_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        // 
        // sono in spesa
        // 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePEGPersonalizzataSenzaObiettivi", "VisibilitàASecondaES", _e);
      return -1;
    }
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
  private void PAN_VOCEPEG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VOCEPEG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VOCEPEG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VOCEPEG, Cancel);
    // Stub
  }

  private void PAN_VOCEPEG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VOCEPEG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VOCEPEG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VOCEPEG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VOCEPEG_Init()
  {

    PAN_VOCEPEG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VOCEPEG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VOCEPEG.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, "400DAB9C-B434-4ED2-A083-2796A54EE4C9");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, "Capitolo");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, "9A87CFED-5C55-4C07-8DEF-AE5D27995801");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, "Articolo");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, "6F20915A-5622-49DC-AE02-3970F9012106");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, "Titolo");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, "E34556AA-776A-4576-A949-5720E248047A");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, "Ordinamento Exp");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, "If (Is Null (Row Name SE CF4), To Integer (To String (POL ELENCO PROG FC BIL CAPITOLO) + To String (POL ELENCO PROG FC BIL ARTICOLO)), To Integer (To String (POL ELENCO PROG FC BIL CAPITOLO) + To String (POL ELENCO PROG FC BIL ARTICOLO)))");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, "C75B034C-047A-4660-95D1-F22FA28FA944");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, "Ordinamento1");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, "If (Is Null (Row Name SE CF4), POL ELENCO PROG FC BIL CAPITOLO, POL ELENCO PROG FC BIL CAPITOLO)");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, "56294F9A-5EC8-4240-829F-BB084E59607D");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, "Ordinamento 2");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, "If (Is Null (Row Name SE CF4), POL ELENCO PROG FC BIL ARTICOLO, POL ELENCO PROG FC BIL CAPITOLO)");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, "E7D46729-DCED-4AD7-A4B4-F03C12ADB9E4");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, "Ordinamento 3");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, "If (Is Null (Row Name SE CF4), Uno, POL ELENCO PROG FC BIL ARTICOLO)");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, "1DFC1870-B811-4EBF-A121-DC852E353717");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, "Capitolo/Art.");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.VIS_LABEVISUSTYL);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, "1A261576-602B-432F-8F25-6CC7D672093A");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, "Capitolo/Art.");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, "5EE344C1-F98A-44F9-A8D0-653DBB07C397");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, "Programma");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, MyGlb.VIS_VISULOOUPCF4);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, "738E5705-A570-4F91-9137-B73D46EB4EBA");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, " ");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, MyGlb.VIS_NOFINOBOVEHE);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, "7B446575-3338-4FE1-B370-2D79C244A61B");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, "Obiettivo Operativo");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, "93FCD7E7-3BB1-4FE2-9EC8-3F1A6E78072D");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, " ");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, MyGlb.VIS_NOFINOBOVEHE);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, "FADD0727-C5B7-447D-A274-71665BD5D5C6");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, "Fattore");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, "5462D3AA-FAF7-48FE-91A8-D1E133CD5145");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, "DES FATTORE");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, MyGlb.VIS_HEADNOBORLEF);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, "DA4B00EB-C269-4947-BB52-6E78FA5FDFDE");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, "Centro");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, "1E44823C-2797-415D-8BA0-34317FB63D0A");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, "DES CENTRO");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, MyGlb.VIS_HEADNOBORLEF);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VOCEPEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_CAPITOLO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_CAPITOLO, PPQRY_CAP19, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, 116, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, 4, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_ARTICOLO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ARTICOLO, PPQRY_CAP19, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_LIST, 144, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_LIST, 48);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_FORM, 4, 100, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_FORM, 48);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_TITOLO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_TITOLO, PPQRY_CAP19, "A.TITOLO", "TITOLO", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.PANEL_LIST, 92);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.PANEL_LIST, 2);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.PANEL_LIST, "Ordinamento Exp");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.PANEL_FORM, 4, 280, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.PANEL_FORM, 92);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.PANEL_FORM, 2);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.PANEL_FORM, "Ordinamento Exp");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_ORDINAMENEXP, -1, -1);
    PAN_VOCEPEG.SetFieldUnbound(PFL_VOCEPEG_ORDINAMENEXP, true);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ORDINAMENEXP, PPQRY_CAP19, "CASE WHEN (~~TBL_PARAMETRI383.ROWNAMESECF4~~ IS NULL) THEN TRUNC(TO_NUMBER(TO_CHAR ( A.CAPITOLO ) || TO_CHAR ( A.ARTICOLO ))) ELSE TRUNC(TO_NUMBER(TO_CHAR ( A.CAPITOLO ) || TO_CHAR ( A.ARTICOLO ))) END", "RECORORDIEXP", 1, 19, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.PANEL_LIST, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.PANEL_LIST, "Ordinamento1");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.PANEL_FORM, 4, 280, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.PANEL_FORM, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.PANEL_FORM, "Ordinam.");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_ORDINAMENTO1, -1, -1);
    PAN_VOCEPEG.SetFieldUnbound(PFL_VOCEPEG_ORDINAMENTO1, true);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ORDINAMENTO1, PPQRY_CAP19, "CASE WHEN (~~TBL_PARAMETRI383.ROWNAMESECF4~~ IS NULL) THEN A.CAPITOLO ELSE A.CAPITOLO END", "RECORDORDINA", 3, 28, 6, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.PANEL_LIST, 8, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.PANEL_LIST, 80);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.PANEL_LIST, "Ordinamento 2");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.PANEL_FORM, 12, 288, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.PANEL_FORM, 80);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.PANEL_FORM, "Ordin. 2");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_ORDINAMENTO2, -1, -1);
    PAN_VOCEPEG.SetFieldUnbound(PFL_VOCEPEG_ORDINAMENTO2, true);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ORDINAMENTO2, PPQRY_CAP19, "CASE WHEN (~~TBL_PARAMETRI383.ROWNAMESECF4~~ IS NULL) THEN A.ARTICOLO ELSE A.CAPITOLO END", "RECORDORDIN2", 3, 28, 6, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.PANEL_LIST, 80);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.PANEL_LIST, "Ordinamento 3");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.PANEL_FORM, 4, 280, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.PANEL_FORM, 80);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.PANEL_FORM, "Ordin. 3");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_ORDINAMENTO3, -1, -1);
    PAN_VOCEPEG.SetFieldUnbound(PFL_VOCEPEG_ORDINAMENTO3, true);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ORDINAMENTO3, PPQRY_CAP19, "CASE WHEN (~~TBL_PARAMETRI383.ROWNAMESECF4~~ IS NULL) THEN 1 ELSE A.ARTICOLO END", "RECORDORDIN3", 1, 19, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_LIST, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_LIST, 0);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_LIST, 2);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_FORM, 0, 0, 152, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_FORM, 0);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_GRANDE, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_GRANDE, -1, "", "GRANDE", 0, 0, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_LIST, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_LIST, 0);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_LIST, 2);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_FORM, 8, 8, 152, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_FORM, 0);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_PICCOLA, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_PICCOLA, -1, "", "PICCOLA", 0, 0, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, MyGlb.PANEL_LIST, 184, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, MyGlb.PANEL_LIST, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, MyGlb.PANEL_FORM, 4, 364, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, MyGlb.PANEL_FORM, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_PROGRAMMA, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_PROGRAMMA, PPQRY_CAP19, "A.PROGRAMMA", "PROGRAMMA", 5, 4, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, MyGlb.PANEL_LIST, 260, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, MyGlb.PANEL_LIST, 96);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, MyGlb.PANEL_LIST, " ");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, MyGlb.PANEL_FORM, 4, 340, 608, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, MyGlb.PANEL_FORM, 96);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGRAMMA, MyGlb.PANEL_FORM, " ");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_DESPROGRAMMA, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_DESPROGRAMMA, PPQRY_CAP19, "A.DES_PROGRAMMA", "DES_PROGRAMMA", 5, 100, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, MyGlb.PANEL_LIST, 480, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, MyGlb.PANEL_FORM, 4, 124, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_PROGETTO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_PROGETTO, PPQRY_CAP19, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, MyGlb.PANEL_LIST, 544, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, MyGlb.PANEL_LIST, 84);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, MyGlb.PANEL_LIST, " ");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, MyGlb.PANEL_FORM, 4, 316, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, MyGlb.PANEL_FORM, 84);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESPROGETTO, MyGlb.PANEL_FORM, " ");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_DESPROGETTO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_DESPROGETTO, PPQRY_CAP19, "A.DES_PROGETTO", "DES_PROGETTO", 5, 100, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, MyGlb.PANEL_LIST, 764, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, MyGlb.PANEL_FORM, 4, 220, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_FATTORE, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_FATTORE, PPQRY_CAP19, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, MyGlb.PANEL_LIST, 820, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, MyGlb.PANEL_LIST, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, MyGlb.PANEL_LIST, "DES FATTORE");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, MyGlb.PANEL_FORM, 84, 268, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, MyGlb.PANEL_FORM, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESFATTORE, MyGlb.PANEL_FORM, "DES FATTORE");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_DESFATTORE, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_DESFATTORE, PPQRY_CAP19, "A.DES_FATTORE", "DES_FATTORE", 5, 60, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, MyGlb.PANEL_LIST, 1040, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, MyGlb.PANEL_FORM, 4, 244, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_CENTRO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_CENTRO, PPQRY_CAP19, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, MyGlb.PANEL_LIST, 1092, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, MyGlb.PANEL_LIST, 72);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, MyGlb.PANEL_LIST, "DES CENTRO");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, MyGlb.PANEL_FORM, 4, 292, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, MyGlb.PANEL_FORM, 72);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCENTRO, MyGlb.PANEL_FORM, "DES CENTRO");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_DESCENTRO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_DESCENTRO, PPQRY_CAP19, "A.DES_CENTRO", "DES_CENTRO", 5, 60, 0, -13997);
  }

  private void PAN_VOCEPEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_VOCEPEG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VOCEPEG.SetIMDB(IMDB, "PQRY_CAP19", true);
    PAN_VOCEPEG.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  CASE WHEN (~~TBL_PARAMETRI383.ROWNAMESECF4~~ IS NULL) THEN TRUNC(TO_NUMBER(TO_CHAR ( A.CAPITOLO ) || TO_CHAR ( A.ARTICOLO ))) ELSE TRUNC(TO_NUMBER(TO_CHAR ( A.CAPITOLO ) || TO_CHAR ( A.ARTICOLO ))) END as RECORORDIEXP, ");
    SQL.append("  CASE WHEN (~~TBL_PARAMETRI383.ROWNAMESECF4~~ IS NULL) THEN A.CAPITOLO ELSE A.CAPITOLO END as RECORDORDINA, ");
    SQL.append("  CASE WHEN (~~TBL_PARAMETRI383.ROWNAMESECF4~~ IS NULL) THEN A.ARTICOLO ELSE A.CAPITOLO END as RECORDORDIN2, ");
    SQL.append("  CASE WHEN (~~TBL_PARAMETRI383.ROWNAMESECF4~~ IS NULL) THEN 1 ELSE A.ARTICOLO END as RECORDORDIN3, ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.DES_PROGRAMMA as DES_PROGRAMMA, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.DES_PROGETTO as DES_PROGETTO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.DES_FATTORE as DES_FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.DES_CENTRO as DES_CENTRO ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP19, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_ELENCO_PROG_FC_BIL A ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP19, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI383.ROWNAMEESERC~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI383.ROWNAMEES~~) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI383.PROGR_UNITA_ORGANIZZATIVA~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP19, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCEPEG.SetQuery(PPQRY_CAP19, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCEPEG.SetQuery(PPQRY_CAP19, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 6, 7, 8 ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP19, 5, SQL, -1, "");
    PAN_VOCEPEG.SetQueryDB(PPQRY_CAP19, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VOCEPEG.SetMasterTable(0, "POL_ELENCO_PROG_FC_BIL");
    PAN_VOCEPEG.AddToSortList(PFL_VOCEPEG_ORDINAMENTO1, true);
    PAN_VOCEPEG.AddToSortList(PFL_VOCEPEG_ORDINAMENTO2, true);
    PAN_VOCEPEG.AddToSortList(PFL_VOCEPEG_ORDINAMENTO3, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VOCEPEG.Status() == 2)
    {
      int oldListQBE = PAN_VOCEPEG.iUseListQBE;
      PAN_VOCEPEG.iUseListQBE = 0;
      PAN_VOCEPEG.PanelCommand(Glb.PCM_SEARCH);
      PAN_VOCEPEG.PanelCommand(Glb.PCM_FIND);
      PAN_VOCEPEG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
