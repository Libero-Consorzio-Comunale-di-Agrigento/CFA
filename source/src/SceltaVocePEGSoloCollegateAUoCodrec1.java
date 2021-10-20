// **********************************************
// Scelta Voce P E G Solo Collegate A Uo Codrec1
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaVocePEGSoloCollegateAUoCodrec1 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VOCEPEG_CAPITOLO = 0;
  private static int PFL_VOCEPEG_ARTICOLO = 1;
  private static int PFL_VOCEPEG_TITOLO = 2;
  private static int PFL_VOCEPEG_FUNZIONE = 3;
  private static int PFL_VOCEPEG_CATEGORIA = 4;
  private static int PFL_VOCEPEG_SERVIZIO = 5;
  private static int PFL_VOCEPEG_INTERVENTO = 6;
  private static int PFL_VOCEPEG_CODTERZI = 7;
  private static int PFL_VOCEPEG_DESCRIZIONE = 8;
  private static int PFL_VOCEPEG_ORDINAMENEXP = 9;
  private static int PFL_VOCEPEG_ORDINAMENTO1 = 10;
  private static int PFL_VOCEPEG_ORDINAMENTO2 = 11;
  private static int PFL_VOCEPEG_ORDINAMENTO3 = 12;
  private static int PFL_VOCEPEG_GRANDE = 13;
  private static int PFL_VOCEPEG_PICCOLA = 14;

  private static int PPQRY_CAP15 = 0;


  IDPanel PAN_VOCEPEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI131(IMDB);
    //
    //
    Init_PQRY_CAP15(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI131(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI131, 11);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI131, "TBL_PARAMETRI131");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMESECF4, "ROWNAMESECF4");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMESECF4,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_TIPO_VOCE_PEG, "TIPO_VOCE_PEG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_TIPO_VOCE_PEG,1,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI131,IMDBDef1.FLD_PARAMETRI131_ROWNAMCODTER,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI131, 0);
  }

  private static void Init_PQRY_CAP15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_CAP15, 15);
    IMDB.set_TblCode(IMDBDef7.PQRY_CAP15, "PQRY_CAP15");
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_DESCRIZIONE_ABBREVIATA, "DESCRIZIONE_ABBREVIATA");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_DESCRIZIONE_ABBREVIATA,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_CATEGORIA,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_COD_TERZI, "COD_TERZI");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_COD_TERZI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_FUNZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_SERVIZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_COD_INTERVENTO, "COD_INTERVENTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_COD_INTERVENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_RECORORDIEXP, "RECORORDIEXP");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_RECORORDIEXP,1,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_RECORDORDINA, "RECORDORDINA");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_RECORDORDINA,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_RECORDORDIN2, "RECORDORDIN2");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_RECORDORDIN2,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_RECORDORDIN3, "RECORDORDIN3");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP15,IMDBDef7.PQSL_CAP15_RECORDORDIN3,1,19,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_CAP15, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaVocePEGSoloCollegateAUoCodrec1(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaVocePEGSoloCollegateAUoCodrec1()
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
    FormIdx = MyGlb.FRM_SCVOPEGSCAUC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E3AC4E93-5B7D-4A7A-8667-3C6FB2A61731";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 414;
    set_Caption(new IDVariant("Scelta Voce P E G Solo Collegate A Uo Codrec1"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 388;
    Frames[1].Caption = "Voce P E G";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 388;
    PAN_VOCEPEG = new IDPanel(w, this, 1, "PAN_VOCEPEG");
    Frames[1].Content = PAN_VOCEPEG;
    PAN_VOCEPEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VOCEPEG.VS = MainFrm.VisualStyleList;
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3104F60A-0ACD-4A75-A8EF-2C9D6077CBAC");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 828, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    return (obj instanceof SceltaVocePEGSoloCollegateAUoCodrec1);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaVocePEGSoloCollegateAUoCodrec1.class.getName() : (Glb.ClassWithPackage(SceltaVocePEGSoloCollegateAUoCodrec1.class) ? SceltaVocePEGSoloCollegateAUoCodrec1.class.getName().substring(SceltaVocePEGSoloCollegateAUoCodrec1.class.getPackage().getName().length() + 1) : SceltaVocePEGSoloCollegateAUoCodrec1.class.getName()));
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
      PAN_VOCEPEG.set_ToolTip(Glb.OBJ_FIELD,PFL_VOCEPEG_DESCRIZIONE,(new IDVariant(PAN_VOCEPEG.FieldText(PFL_VOCEPEG_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePEGSoloCollegateAUoCodrec1", "VocePEGOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("SceltaVocePEGSoloCollegateAUoCodrec1", "VocePEGOnCommandEvent", _e);
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
      set_Caption(IDL.Add(IDL.Add((new IDVariant("Scelta Capitolo")), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMEESERC, 0))));
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMESECF4, 0, new IDVariant(v_SECF4));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_TIPO_VOCE_PEG, 0, new IDVariant(v_TIPOVOCEPEG));
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePEGSoloCollegateAUoCodrec1", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMETITOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMEFUNZI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMESERVI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMECATEG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMCODTER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMCODINT, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePEGSoloCollegateAUoCodrec1", "UnloadEvent", _e);
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
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        // 
        // sono in spesa
        // 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VOCEPEG.SetFlags (Glb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePEGSoloCollegateAUoCodrec1", "VisibilitàASecondaES", _e);
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
    PAN_VOCEPEG.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, "A5E4562B-7CE8-4E9E-A302-37478EC527C0");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, "Capitolo");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, "C51E15D4-B750-44E6-8BFE-0C41469E0254");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, "Articolo");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, "8068BEAD-CA2F-4732-8DED-2254FB993B61");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, "Titolo");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, "0C18E6C1-2620-4B0C-B341-726E00B43BC0");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, "Funzione");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, "BC530944-E923-4E4A-88C5-0133AD63B0B8");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, "Categoria");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, "2661C217-FE04-4FBC-83FC-F623362D79F0");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, "Servizio");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, "37138CC0-A082-444D-AD83-1053CBB8B54A");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, "Intervento");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, "207A8F6D-6E7B-443A-822B-04F4EE732AAD");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, "Cod. Terzi");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, "7164A0AE-C57F-4FF9-9366-567F15321745");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, "Descrizione");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, "ACDD6B7D-889C-4C4C-A72C-C5637FD8EEF7");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, "Ordinamento Exp");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, "If (Is Null (Row Name SE CF4), To Integer (To String (CAP CAPITOLO) + To String (CAP ARTICOLO)), To Integer (To String (CAP CAPITOLO) + To String (CAP ARTICOLO)))");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENEXP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, "A8F076AA-7C17-41AA-A683-B3472F986401");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, "Ordinamento1");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, "If (Is Null (Row Name SE CF4), CAP CAPITOLO, CAP CAPITOLO)");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, "43CD985C-10C5-47CF-8914-69169F9EC70E");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, "Ordinamento 2");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, "If (Is Null (Row Name SE CF4), CAP ARTICOLO, CAP CAPITOLO)");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, "22DA8BC6-32CB-474B-AEF9-308C969E5E58");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, "Ordinamento 3");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, "If (Is Null (Row Name SE CF4), Uno, CAP ARTICOLO)");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ORDINAMENTO3, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, "E771BF05-8FEB-4EB0-9E90-8CED0C2439B8");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, "Capitolo/Art.");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.VIS_LABEVISUSTYL);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, "B0E04E36-EE37-4895-AE20-C5FC5F4B1F63");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, "Capitolo/Art.");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_VOCEPEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_CAPITOLO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_CAPITOLO, PPQRY_CAP15, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, 104, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, "Ar.");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, 4, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_ARTICOLO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ARTICOLO, PPQRY_CAP15, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_LIST, 128, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_LIST, 48);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_FORM, 4, 100, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_FORM, 48);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_TITOLO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_TITOLO, PPQRY_CAP15, "A.TITOLO", "TITOLO", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, MyGlb.PANEL_LIST, 168, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, MyGlb.PANEL_LIST, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, MyGlb.PANEL_LIST, "Funzione");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, MyGlb.PANEL_FORM, 4, 232, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, MyGlb.PANEL_FORM, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_FUNZIONE, MyGlb.PANEL_FORM, "Funzione");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_FUNZIONE, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_FUNZIONE, PPQRY_CAP15, "A.FUNZIONE", "FUNZIONE", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, MyGlb.PANEL_LIST, 228, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, MyGlb.PANEL_LIST, 68);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, MyGlb.PANEL_FORM, 68);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_CATEGORIA, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_CATEGORIA, PPQRY_CAP15, "A.CATEGORIA", "CATEGORIA", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, MyGlb.PANEL_LIST, 292, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, MyGlb.PANEL_LIST, 56);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, MyGlb.PANEL_FORM, 4, 256, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, MyGlb.PANEL_FORM, 56);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_SERVIZIO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_SERVIZIO, PPQRY_CAP15, "A.SERVIZIO", "SERVIZIO", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, MyGlb.PANEL_LIST, 348, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, MyGlb.PANEL_LIST, 96);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, MyGlb.PANEL_LIST, "Intervento");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, MyGlb.PANEL_FORM, 4, 208, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, MyGlb.PANEL_FORM, 96);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_INTERVENTO, MyGlb.PANEL_FORM, "Intervento");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_INTERVENTO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_INTERVENTO, PPQRY_CAP15, "A.COD_INTERVENTO", "COD_INTERVENTO", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, MyGlb.PANEL_LIST, 420, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, MyGlb.PANEL_LIST, 64);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, MyGlb.PANEL_LIST, "Cod. Terzi");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, MyGlb.PANEL_FORM, 4, 148, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, MyGlb.PANEL_FORM, 64);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CODTERZI, MyGlb.PANEL_FORM, "Cod. Terzi");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_CODTERZI, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_CODTERZI, PPQRY_CAP15, "A.COD_TERZI", "COD_TERZI", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 480, 36, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 172, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_DESCRIZIONE, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_DESCRIZIONE, PPQRY_CAP15, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
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
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ORDINAMENEXP, PPQRY_CAP15, "CASE WHEN (~~TBL_PARAMETRI131.ROWNAMESECF4~~ IS NULL) THEN TRUNC(TO_NUMBER(TO_CHAR ( A.CAPITOLO ) || TO_CHAR ( A.ARTICOLO ))) ELSE TRUNC(TO_NUMBER(TO_CHAR ( A.CAPITOLO ) || TO_CHAR ( A.ARTICOLO ))) END", "RECORORDIEXP", 1, 19, 0, -13997);
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
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ORDINAMENTO1, PPQRY_CAP15, "CASE WHEN (~~TBL_PARAMETRI131.ROWNAMESECF4~~ IS NULL) THEN A.CAPITOLO ELSE A.CAPITOLO END", "RECORDORDINA", 3, 28, 6, -13997);
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
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ORDINAMENTO2, PPQRY_CAP15, "CASE WHEN (~~TBL_PARAMETRI131.ROWNAMESECF4~~ IS NULL) THEN A.ARTICOLO ELSE A.CAPITOLO END", "RECORDORDIN2", 3, 28, 6, -13997);
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
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ORDINAMENTO3, PPQRY_CAP15, "CASE WHEN (~~TBL_PARAMETRI131.ROWNAMESECF4~~ IS NULL) THEN 1 ELSE A.ARTICOLO END", "RECORDORDIN3", 1, 19, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_LIST, 0, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_LIST, 0);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_LIST, 2);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_FORM, 0, 0, 152, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_FORM, 0);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_GRANDE, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_GRANDE, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_GRANDE, -1, "", "GRANDE", 0, 0, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_LIST, 0, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_LIST, 0);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_LIST, 2);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_FORM, 8, 8, 152, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_FORM, 0);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_PICCOLA, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_PICCOLA, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_PICCOLA, -1, "", "PICCOLA", 0, 0, 0, -13997);
  }

  private void PAN_VOCEPEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_VOCEPEG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VOCEPEG.SetIMDB(IMDB, "PQRY_CAP15", true);
    PAN_VOCEPEG.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE_ABBREVIATA as DESCRIZIONE_ABBREVIATA, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.COD_TERZI as COD_TERZI, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.SERVIZIO as SERVIZIO, ");
    SQL.append("  A.COD_INTERVENTO as COD_INTERVENTO, ");
    SQL.append("  CASE WHEN (~~TBL_PARAMETRI131.ROWNAMESECF4~~ IS NULL) THEN TRUNC(TO_NUMBER(TO_CHAR ( A.CAPITOLO ) || TO_CHAR ( A.ARTICOLO ))) ELSE TRUNC(TO_NUMBER(TO_CHAR ( A.CAPITOLO ) || TO_CHAR ( A.ARTICOLO ))) END as RECORORDIEXP, ");
    SQL.append("  CASE WHEN (~~TBL_PARAMETRI131.ROWNAMESECF4~~ IS NULL) THEN A.CAPITOLO ELSE A.CAPITOLO END as RECORDORDINA, ");
    SQL.append("  CASE WHEN (~~TBL_PARAMETRI131.ROWNAMESECF4~~ IS NULL) THEN A.ARTICOLO ELSE A.CAPITOLO END as RECORDORDIN2, ");
    SQL.append("  CASE WHEN (~~TBL_PARAMETRI131.ROWNAMESECF4~~ IS NULL) THEN 1 ELSE A.ARTICOLO END as RECORDORDIN3 ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP15, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  CAP_UO B ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP15, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI131.ROWNAMEESERC~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI131.ROWNAMEES~~) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.PROGR_UNITA_ORGANIZZATIVA = NVL(~~TBL_PARAMETRI131.PROGR_UNITA_ORGANIZZATIVA~~, B.PROGR_UNITA_ORGANIZZATIVA)) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP15, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCEPEG.SetQuery(PPQRY_CAP15, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCEPEG.SetQuery(PPQRY_CAP15, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 13, 14, 15 ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP15, 5, SQL, -1, "");
    PAN_VOCEPEG.SetQueryDB(PPQRY_CAP15, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VOCEPEG.SetMasterTable(0, "CAP");
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
