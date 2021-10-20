// **********************************************
// Parametri Controllo Disponibilita Rep 1
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriControlloDisponibilitaRep1 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_CONTRODISPON_TIPOCONTROLL = 0;

  private static int PFL_CONTRODISPON_TIPOCONTROLL = 0;
  private static int PFL_CONTRODISPON_ESERCIZIO = 1;
  private static int PFL_CONTRODISPON_SOLODISPNEGA = 2;
  private static int PFL_CONTRODISPON_SOLOPROPAPPR = 3;
  private static int PFL_CONTRODISPON_ELABORA = 4;

  private static int PPQRY_PAR99 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_CONTRODISPON;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR66(IMDB);
    Init_TBL_IN2(IMDB);
    //
    //
    Init_PQRY_PAR99(IMDB);
    Init_PQRY_PAR99_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR66(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR66, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR66, "TBL_PAR66");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR66,IMDBDef3.FLD_PAR66_ROWNAMTIPCON, "ROWNAMTIPCON");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR66,IMDBDef3.FLD_PAR66_ROWNAMTIPCON,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR66,IMDBDef3.FLD_PAR66_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR66,IMDBDef3.FLD_PAR66_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR66,IMDBDef3.FLD_PAR66_ROWNAMSODINE, "ROWNAMSODINE");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR66,IMDBDef3.FLD_PAR66_ROWNAMSODINE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR66,IMDBDef3.FLD_PAR66_ROWNAMSOPRAP, "ROWNAMSOPRAP");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR66,IMDBDef3.FLD_PAR66_ROWNAMSOPRAP,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR66, 0);
  }

  private static void Init_TBL_IN2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_IN2, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_IN2, "TBL_IN2");
    IMDB.set_FldCode(IMDBDef3.TBL_IN2,IMDBDef3.FLD_IN2_ROWNAMEBOZZA, "ROWNAMEBOZZA");
    IMDB.SetFldParams(IMDBDef3.TBL_IN2,IMDBDef3.FLD_IN2_ROWNAMEBOZZA,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN2,IMDBDef3.FLD_IN2_ROWNAMEFIRST, "ROWNAMEFIRST");
    IMDB.SetFldParams(IMDBDef3.TBL_IN2,IMDBDef3.FLD_IN2_ROWNAMEFIRST,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_IN2, 0);
  }

  private static void Init_PQRY_PAR99(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR99, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR99, "PQRY_PAR99");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR99,IMDBDef12.PQSL_PAR99_ROWNAMTIPCON, "ROWNAMTIPCON");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR99,IMDBDef12.PQSL_PAR99_ROWNAMTIPCON,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR99,IMDBDef12.PQSL_PAR99_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR99,IMDBDef12.PQSL_PAR99_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR99,IMDBDef12.PQSL_PAR99_ROWNAMSODINE, "ROWNAMSODINE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR99,IMDBDef12.PQSL_PAR99_ROWNAMSODINE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR99,IMDBDef12.PQSL_PAR99_ROWNAMSOPRAP, "ROWNAMSOPRAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR99,IMDBDef12.PQSL_PAR99_ROWNAMSOPRAP,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR99, 0);
  }

  private static void Init_PQRY_PAR99_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR99_RS, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR99_RS, "PQRY_PAR99_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR99_RS,IMDBDef12.PQSL_PAR99_ROWNAMTIPCON, "ROWNAMTIPCON");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR99_RS,IMDBDef12.PQSL_PAR99_ROWNAMTIPCON,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR99_RS,IMDBDef12.PQSL_PAR99_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR99_RS,IMDBDef12.PQSL_PAR99_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR99_RS,IMDBDef12.PQSL_PAR99_ROWNAMSODINE, "ROWNAMSODINE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR99_RS,IMDBDef12.PQSL_PAR99_ROWNAMSODINE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR99_RS,IMDBDef12.PQSL_PAR99_ROWNAMSOPRAP, "ROWNAMSOPRAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR99_RS,IMDBDef12.PQSL_PAR99_ROWNAMSOPRAP,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriControlloDisponibilitaRep1(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriControlloDisponibilitaRep1()
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
    FormIdx = MyGlb.FRM_PARCONDISRE1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "25002F3B-02A3-408D-B592-D31DBB311B89";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 424;
    DesignHeight = 270;
    set_Caption(new IDVariant("Parametri Controllo Disponibilita Rep 1"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 424;
    Frames[1].Height = 244;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Controllo Disponibilità";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 244;
    PAN_CONTRODISPON = new IDPanel(w, this, 1, "PAN_CONTRODISPON");
    Frames[1].Content = PAN_CONTRODISPON;
    PAN_CONTRODISPON.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTRODISPON.VS = MainFrm.VisualStyleList;
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 424-MyGlb.PAN_OFFS_X, 244-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "20FC14D4-E2C4-4A3F-8921-62E7C2771238");
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 376, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTRODISPON.InitStatus = 2;
    PAN_CONTRODISPON_Init();
    PAN_CONTRODISPON_InitFields();
    PAN_CONTRODISPON_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR66, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PARCONDISRE1_PAR99();
      }
      PAN_CONTRODISPON.UpdatePanel(MainFrm);
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
    return (obj instanceof ParametriControlloDisponibilitaRep1);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriControlloDisponibilitaRep1.class.getName() : (Glb.ClassWithPackage(ParametriControlloDisponibilitaRep1.class) ? ParametriControlloDisponibilitaRep1.class.getName().substring(ParametriControlloDisponibilitaRep1.class.getPackage().getName().length() + 1) : ParametriControlloDisponibilitaRep1.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // STAMPA
  // **********************************************************************
  public int STAMPA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // STAMPA Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR99, IMDBDef12.PQSL_PAR99_ROWNAMTIPCON, 0))))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR99, IMDBDef12.PQSL_PAR99_ROWNAMEESERC, 0)))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Esercizio obbligatorio", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.POLWORKDISPRAG(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PAR99, IMDBDef12.PQSL_PAR99_ROWNAMEESERC, 0), IMDB.Value(IMDBDef3.TBL_IN2, IMDBDef3.FLD_IN2_ROWNAMEBOZZA, 0), IMDB.Value(IMDBDef12.PQRY_PAR99, IMDBDef12.PQSL_PAR99_ROWNAMSODINE, 0), IMDB.Value(IMDBDef12.PQRY_PAR99, IMDBDef12.PQSL_PAR99_ROWNAMSOPRAP, 0), IMDB.Value(IMDBDef12.PQRY_PAR99, IMDBDef12.PQSL_PAR99_ROWNAMTIPCON, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMEBOZZA, 0, IMDB.Value(IMDBDef3.TBL_IN2, IMDBDef3.FLD_IN2_ROWNAMEBOZZA, 0));
          IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0, IMDB.Value(IMDBDef12.PQRY_PAR99, IMDBDef12.PQSL_PAR99_ROWNAMTIPCON, 0));
          IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMESESCE, 0, IMDB.Value(IMDBDef12.PQRY_PAR99, IMDBDef12.PQSL_PAR99_ROWNAMEESERC, 0));
          MainFrm.Show(MyGlb.FRM_REPOCONTDIS1, (new IDVariant(-1)).intValue(), this); 
        }
      }
      else
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Tipo Controllo obbligatorio", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriControlloDisponibilitaRep1", "STAMPA", _e);
      return -1;
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
    IDVariant v_CAPT = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPT = (new IDVariant("Controllo Disponibiltà", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPT));
      IMDB.set_Value(IMDBDef3.TBL_PAR66, IMDBDef3.FLD_PAR66_ROWNAMTIPCON, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef3.TBL_PAR66, IMDBDef3.FLD_PAR66_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef3.TBL_PAR66, IMDBDef3.FLD_PAR66_ROWNAMSODINE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_IN2, IMDBDef3.FLD_IN2_ROWNAMEFIRST, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PAR66, IMDBDef3.FLD_PAR66_ROWNAMSOPRAP, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriControlloDisponibilitaRep1", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Controllo Disponibilità After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_CONTRODISPON_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SEOBIETTIVI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VALUE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_VALUE = (new IDVariant("Bilancio Unità Organizzative", IDVariant.STRING));
      // 
      // Controllo Disponibilità After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_IN2, IMDBDef3.FLD_IN2_ROWNAMEFIRST, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_IN2, IMDBDef3.FLD_IN2_ROWNAMEFIRST, 0, (new IDVariant("NO")));
        PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_TIPOCONTROLL, (new IDVariant("U")), v_VALUE.stringValue(), v_VALUE.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A_GET_SE_OBIETTIVI_POL(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as AGESEOBPOSEE ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_SEOBIETTIVI = QV.Get("AGESEOBPOSEE", IDVariant.INTEGER) ;
        }
        QV.Close();
        // 
        // OBIETTIVI GESTITI
        // 
        if (v_SEOBIETTIVI.compareTo((new IDVariant(0)), true)!=0)
        {
          PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_TIPOCONTROLL, (new IDVariant("O")), (new IDVariant("Obiettivo")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_TIPOCONTROLL, (new IDVariant("F")), (new IDVariant("Finanziamento")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else
        {
          // 
          // Obiettivi non gestiti
          // 
          PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_TIPOCONTROLL, (new IDVariant("P")), (new IDVariant("Progetto")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_TIPOCONTROLL, (new IDVariant("F")), (new IDVariant("Finanziamento")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriControlloDisponibilitaRep1", "ControlloDisponibilitàAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PARCONDISRE1_PAR99() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR99_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR66, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR66, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR99_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR99_RS, 0, IMDBDef3.TBL_PAR66, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR99_RS, 0, 0, IMDBDef3.TBL_PAR66, IMDBDef3.FLD_PAR66_ROWNAMTIPCON, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR99_RS, 1, 0, IMDBDef3.TBL_PAR66, IMDBDef3.FLD_PAR66_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR99_RS, 2, 0, IMDBDef3.TBL_PAR66, IMDBDef3.FLD_PAR66_ROWNAMSODINE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR99_RS, 3, 0, IMDBDef3.TBL_PAR66, IMDBDef3.FLD_PAR66_ROWNAMSOPRAP, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR66, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR66, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR66, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR99_RS, 0);
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
  private void PAN_CONTRODISPON_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTRODISPON, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTRODISPON_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTRODISPON, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTRODISPON_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONTRODISPON);
    // Stub
  }

  private void PAN_CONTRODISPON_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CONTRODISPON_ELABORA)
    {
      this.IdxPanelActived = this.PAN_CONTRODISPON.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      STAMPA();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CONTRODISPON_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTRODISPON_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTRODISPON_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTRODISPON_Init()
  {

    PAN_CONTRODISPON.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTRODISPON.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, "A5D1A554-8BB8-41AD-A3CB-2E483C7CFA09");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, "Tipo Controllo");
    PAN_CONTRODISPON.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, "");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, MyGlb.VIS_GROUPSTYLE);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_FORM, 168, 3, 184, 117, 0, 0);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, 0, 78);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, 1, 13);
    PAN_CONTRODISPON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, 0, 4);
    PAN_CONTRODISPON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, 1, 4);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_GROUP, GRP_CONTRODISPON_TIPOCONTROLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CONTRODISPON.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, "4E2FD576-02F1-4340-A88D-911A36C233CA");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, "Tipo Controllo");
    PAN_CONTRODISPON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, "");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, MyGlb.VIS_OPTBUTSENBOR);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, "BCC768E9-AD96-4A0D-A383-6145F04F1B43");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, "Esercizio");
    PAN_CONTRODISPON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, "");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, "20DBA2F1-B589-4E97-A079-ACB3A23137CC");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, "Solo Disponibilità Negative");
    PAN_CONTRODISPON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, "");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, MyGlb.VIS_CHECKSTYLE);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, "69DD6492-7042-465F-82C6-67019B731663");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, "Solo Proposte Approvate");
    PAN_CONTRODISPON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, "");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, MyGlb.VIS_CHECKSTYLE);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, "A3B35D4B-0511-441D-9EBB-FEF5CA5CF911");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, "Elabora");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_CONTRODISPON.SetImage(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, 0, "button1.gif", false);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_CONTRODISPON_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_LIST, 76);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_LIST, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_LIST, "Tipo Controllo");
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_FORM, 172, 28, 176, 88, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_FORM, 80);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_FORM, 6);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_TIPOCONTROLL, MyGlb.PANEL_FORM, "Tipo Controllo");
    PAN_CONTRODISPON.SetFieldPage(PFL_CONTRODISPON_TIPOCONTROLL, -1, GRP_CONTRODISPON_TIPOCONTROLL);
    PAN_CONTRODISPON.SetFieldPanel(PFL_CONTRODISPON_TIPOCONTROLL, PPQRY_PAR99, "A.ROWNAMTIPCON", "ROWNAMTIPCON", 5, 1, 0, -13997);
    PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_TIPOCONTROLL, (new IDVariant("B")), "Bilancio", "", "", -1);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_LIST, 120, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_FORM, 104, 124, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_CONTRODISPON.SetFieldPage(PFL_CONTRODISPON_ESERCIZIO, -1, -1);
    PAN_CONTRODISPON.SetFieldPanel(PFL_CONTRODISPON_ESERCIZIO, PPQRY_PAR99, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, MyGlb.PANEL_LIST, 200, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, MyGlb.PANEL_LIST, 136);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, MyGlb.PANEL_LIST, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, MyGlb.PANEL_LIST, "Sl. Dsp. Neg.");
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, MyGlb.PANEL_FORM, 0, 148, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, MyGlb.PANEL_FORM, 164);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, MyGlb.PANEL_FORM, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLODISPNEGA, MyGlb.PANEL_FORM, "Solo Disponibilità Negative");
    PAN_CONTRODISPON.SetFieldPage(PFL_CONTRODISPON_SOLODISPNEGA, -1, -1);
    PAN_CONTRODISPON.SetFieldPanel(PFL_CONTRODISPON_SOLODISPNEGA, PPQRY_PAR99, "A.ROWNAMSODINE", "ROWNAMSODINE", 5, 2, 0, -13997);
    PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_SOLODISPNEGA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_SOLODISPNEGA, (new IDVariant()), "Null", "", "", -1);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, MyGlb.PANEL_LIST, 128);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, MyGlb.PANEL_LIST, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, MyGlb.PANEL_LIST, "Solo Proposte Approvate");
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, MyGlb.PANEL_FORM, 160);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, MyGlb.PANEL_FORM, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOLOPROPAPPR, MyGlb.PANEL_FORM, "Solo Proposte Approvate");
    PAN_CONTRODISPON.SetFieldPage(PFL_CONTRODISPON_SOLOPROPAPPR, -1, -1);
    PAN_CONTRODISPON.SetFieldPanel(PFL_CONTRODISPON_SOLOPROPAPPR, PPQRY_PAR99, "A.ROWNAMSOPRAP", "ROWNAMSOPRAP", 5, 2, 0, -13997);
    PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_SOLOPROPAPPR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_SOLOPROPAPPR, (new IDVariant()), "Null", "", "", -1);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_LIST, 212, 80, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_FORM, 272, 196, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_CONTRODISPON.SetFieldPage(PFL_CONTRODISPON_ELABORA, -1, -1);
    PAN_CONTRODISPON.SetFieldPanel(PFL_CONTRODISPON_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_CONTRODISPON_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTRODISPON.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (A.DUMMY = TO_CHAR ( ~~ROWNAMEESERC~~ )) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_CONTRODISPON.SetQuery(PPQRY_DUAL, 0, SQL, PFL_CONTRODISPON_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_CONTRODISPON.SetQuery(PPQRY_DUAL, 1, SQL, PFL_CONTRODISPON_ESERCIZIO, "");
    PAN_CONTRODISPON.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTRODISPON.SetIMDB(IMDB, "PQRY_PAR99", true);
    PAN_CONTRODISPON.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_CONTRODISPON.SetQueryIMDB(PPQRY_PAR99, IMDBDef12.PQRY_PAR99_RS, IMDBDef3.TBL_PAR66);
    JustLoaded = true;
    PAN_CONTRODISPON.SetFieldPrimaryIndex(PFL_CONTRODISPON_TIPOCONTROLL, IMDBDef3.FLD_PAR66_ROWNAMTIPCON);
    PAN_CONTRODISPON.SetFieldPrimaryIndex(PFL_CONTRODISPON_ESERCIZIO, IMDBDef3.FLD_PAR66_ROWNAMEESERC);
    PAN_CONTRODISPON.SetFieldPrimaryIndex(PFL_CONTRODISPON_SOLODISPNEGA, IMDBDef3.FLD_PAR66_ROWNAMSODINE);
    PAN_CONTRODISPON.SetFieldPrimaryIndex(PFL_CONTRODISPON_SOLOPROPAPPR, IMDBDef3.FLD_PAR66_ROWNAMSOPRAP);
    PAN_CONTRODISPON.SetMasterTable(0, "PAR66");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTRODISPON.Status() == 2)
    {
      int oldListQBE = PAN_CONTRODISPON.iUseListQBE;
      PAN_CONTRODISPON.iUseListQBE = 0;
      PAN_CONTRODISPON.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTRODISPON.PanelCommand(Glb.PCM_FIND);
      PAN_CONTRODISPON.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
