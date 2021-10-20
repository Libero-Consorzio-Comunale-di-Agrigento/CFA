// **********************************************
// Caricamento Imputazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CaricamentoImputazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CARICAIMPUTA_ELABORA = 0;
  private static int PFL_CARICAIMPUTA_PANNELLO = 1;
  private static int PFL_CARICAIMPUTA_PROGRESSIVO = 2;
  private static int PFL_CARICAIMPUTA_PATH = 3;

  private static int PPQRY_NEWTABLE1 = 0;


  IDPanel PAN_CARICAIMPUTA;
  private static int PFL_DATALIQSTIPE_DATALIQUSTIP = 0;

  private static int PPQRY_NEWTABLE49 = 0;


  IDPanel PAN_DATALIQSTIPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR75(IMDB);
    //
    //
    Init_PQRY_NEWTABLE1(IMDB);
    Init_PQRY_NEWTABLE49(IMDB);
    Init_PQRY_NEWTABLE49_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR75(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR75, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR75, "TBL_PAR75");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMENTSPE, "ROWNAMENTSPE");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMDALIST, "ROWNAMDALIST");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMDALIST,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMEPATH, "ROWNAMEPATH");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMEPATH,5,250,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMEPERCO, "ROWNAMEPERCO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMEPERCO,9,266,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMEBLOBI, "ROWNAMEBLOBI");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMEBLOBI,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMEPROGR,1,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMTIPTRA, "ROWNAMTIPTRA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR75,IMDBDef6.FLD_PAR75_ROWNAMTIPTRA,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR75, 0);
  }

  private static void Init_PQRY_NEWTABLE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE1, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE1, "PQRY_NEWTABLE1");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE1,IMDBDef15.PQSL_NEWTABLE1_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE1,IMDBDef15.PQSL_NEWTABLE1_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE1,IMDBDef15.PQSL_NEWTABLE1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE1,IMDBDef15.PQSL_NEWTABLE1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE1,IMDBDef15.PQSL_NEWTABLE1_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE1,IMDBDef15.PQSL_NEWTABLE1_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE1, 0);
  }

  private static void Init_PQRY_NEWTABLE49(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE49, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE49, "PQRY_NEWTABLE49");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE49,IMDBDef15.PQSL_NEWTABLE49_ROWNAMDALIST, "ROWNAMDALIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE49,IMDBDef15.PQSL_NEWTABLE49_ROWNAMDALIST,6,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE49, 0);
  }

  private static void Init_PQRY_NEWTABLE49_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE49_RS, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE49_RS, "PQRY_NEWTABLE49_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE49_RS,IMDBDef15.PQSL_NEWTABLE49_ROWNAMDALIST, "ROWNAMDALIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE49_RS,IMDBDef15.PQSL_NEWTABLE49_ROWNAMDALIST,6,19,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CaricamentoImputazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public CaricamentoImputazioni()
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
    FormIdx = MyGlb.FRM_CARICAIMPUTA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "46C91801-039C-4FDB-9337-5B42D157F455";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 616;
    DesignHeight = 254;
    set_Caption(new IDVariant("Caricamento Imputazioni"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 616;
    Frames[1].Height = 228;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Caricamento Imputazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 228;
    PAN_CARICAIMPUTA = new IDPanel(w, this, 1, "PAN_CARICAIMPUTA");
    Frames[1].Content = PAN_CARICAIMPUTA;
    PAN_CARICAIMPUTA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CARICAIMPUTA.VS = MainFrm.VisualStyleList;
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 616-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CARICAIMPUTA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "59837319-7AB0-4B8C-810F-811F09271634");
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CARICAIMPUTA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CARICAIMPUTA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CARICAIMPUTA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CARICAIMPUTA.InitStatus = 2;
    PAN_CARICAIMPUTA_Init();
    PAN_CARICAIMPUTA_InitFields();
    PAN_CARICAIMPUTA_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_CARICAIMPUTA.SetSubFrame(PFL_CARICAIMPUTA_PANNELLO,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Data Liq Stipendi";
    Frames[2].Parent = this;
    PAN_DATALIQSTIPE = new IDPanel(w, this, 2, "PAN_DATALIQSTIPE");
    Frames[2].Content = PAN_DATALIQSTIPE;
    PAN_DATALIQSTIPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DATALIQSTIPE.VS = MainFrm.VisualStyleList;
    PAN_DATALIQSTIPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5AE7D4B9-4EE6-49A3-87E1-116B5FF52879");
    PAN_DATALIQSTIPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 104, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATALIQSTIPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATALIQSTIPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATALIQSTIPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATALIQSTIPE.InitStatus = 2;
    PAN_DATALIQSTIPE_Init();
    PAN_DATALIQSTIPE_InitFields();
    PAN_DATALIQSTIPE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR75, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CARICAIMPUTA_NEWTABLE49();
      }
      PAN_CARICAIMPUTA.UpdatePanel(MainFrm);
      PAN_DATALIQSTIPE.UpdatePanel(MainFrm);
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
    return (obj instanceof CaricamentoImputazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CaricamentoImputazioni.class.getName() : (Glb.ClassWithPackage(CaricamentoImputazioni.class) ? CaricamentoImputazioni.class.getName().substring(CaricamentoImputazioni.class.getPackage().getName().length() + 1) : CaricamentoImputazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (IMDB.Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMEBLOBI, 0).equals((new IDVariant("NO")), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Selezionare un file", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (MainFrm.TRACCIATPERS.compareTo((new IDVariant("AD")), true)!=0)
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_CONFIRM = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CONTATORE1 = new IDVariant(0,IDVariant.INTEGER);
        v_CONFIRM = (new IDVariant(""));
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE49, IMDBDef15.PQSL_NEWTABLE49_ROWNAMDALIST, 0)))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Data Liquidazioni stipendi obbligatoria", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  IMPUTAZIONI_CONTABILI A ");
        SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMENTSPE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.DATA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE49, IMDBDef15.PQSL_NEWTABLE49_ROWNAMDALIST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Data Liquidazioni Stipendi già caricata", IDVariant.STRING));
          v_CONFIRM = IDL.Add(v_ERR, (new IDVariant("<BR/>")));
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  IMPUTAZIONI_CONTABILI A ");
        SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMENTSPE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.DATA > " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE49, IMDBDef15.PQSL_NEWTABLE49_ROWNAMDALIST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE1.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Data Liquidazioni Stipendi inferiore all'ultima data caricata", IDVariant.STRING));
          v_CONFIRM = IDL.Add(IDL.Add(v_CONFIRM, v_ERR), (new IDVariant("<BR/>")));
        }
        if (v_CONFIRM.compareTo((new IDVariant("")), true)!=0)
        {
          if (!(Mymessageconfirm(IDL.Add(v_CONFIRM, (new IDVariant("Continuare?"))))))
          {
            return 0;
          }
        }
      }
      Go();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoImputazioni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Go
  // **********************************************************************
  public int Go ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_OUT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTATOREERR = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_PROG = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Go Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WRK_IMPUTAZIONI_CONTABILI ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      v_FD = MainFrm.VBFile.FreeFile();
      MainFrm.VBFile.OpenForInput(IMDB.Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMEPERCO, 0), v_FD); 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROGRESSIVO) as MAXWRKIMCOPR ");
      SQL.append("from ");
      SQL.append("  WRK_IMPUTAZIONI_CONTABILI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PROG = QV.Get("MAXWRKIMCOPR", IDVariant.INTEGER) ;
      }
      QV.Close();
      v_PROG = IDL.NullValue(v_PROG,(new IDVariant(0)));
      while (!(MainFrm.VBFile.EOF(v_FD)))
      {
        v_PROG = IDL.Add(v_PROG, (new IDVariant(1)));
        v_OUT = MainFrm.VBFile.ReadLine(v_FD); 
        SQL = new StringBuffer();
        SQL.append("insert into WRK_IMPUTAZIONI_CONTABILI ");
        SQL.append("( ");
        SQL.append("  SESSIONE, ");
        SQL.append("  DATI, ");
        SQL.append("  PROGRESSIVO ");
        SQL.append(") ");
        SQL.append("values ");
        SQL.append("( ");
        SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
        SQL.append("  " + IDL.CSql(v_OUT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  " + IDL.CSql(v_PROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
        SQL.append(") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      MainFrm.VBFile.Close(v_FD); 
      if (MainFrm.TRACCIATPERS.equals((new IDVariant("AD")), true))
      {
        if ((new IDVariant(Errorcheck())).equals((new IDVariant(0)), true))
        {
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("delete from WRK_ERRORI ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      if (IMDB.Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMENTSPE, 0).equals((new IDVariant("E")), true))
      {
        MainFrm.Cf4armDBObject.CARICAPAGHEESTE(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE49, IMDBDef15.PQSL_NEWTABLE49_ROWNAMDALIST, 0));
      }
      else
      {
        MainFrm.Cf4armDBObject.CARICAPAGHEESTS(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE49, IMDBDef15.PQSL_NEWTABLE49_ROWNAMDALIST, 0));
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATOREERR = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATOREERR.compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.LanciaErrorReport((new IDVariant("STAMPA ANOMALIE IMPUTAZIONI")), (new IDVariant("NO")));
      }
      else
      {
        IDVariant v_CAR = new IDVariant(0,IDVariant.STRING);
        v_CAR = (new IDVariant("Caricamento Eseguito", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_CAR); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoImputazioni", "Go", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Mymessageconfirm
  // Messaggio:  - Input
  // **********************************************************************
  public boolean Mymessageconfirm (IDVariant Messaggio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RETVAL = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Mymessageconfirm Body
      // Procedure Body
      // 
      v_RETVAL = (new IDVariant(-1));
      if (!(MainFrm.MessageConfirm(Messaggio)))
      {
        v_RETVAL = (new IDVariant(0));
        return v_RETVAL.booleanValue();
      }
      return v_RETVAL.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoImputazioni", "Mymessageconfirm", _e);
      return false;
    }
  }

  // **********************************************************************
  // Errorcheck
  // **********************************************************************
  public boolean Errorcheck ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MAXDATA1 = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_MAXDATA = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_RETVALUE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Errorcheck Body
      // Procedure Body
      // 
      v_RETVALUE = (new IDVariant(-1));
      v_MAXDATA1 = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(to_date(substr(A.DATI,1,8),'ddmmyyyy')) as MACFDTSDWICD ");
      SQL.append("from ");
      SQL.append("  WRK_IMPUTAZIONI_CONTABILI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("and   (SUBSTR(A.DATI, 14, 1) = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMENTSPE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MAXDATA1 = QV.Get("MACFDTSDWICD", IDVariant.DATETIME) ;
      }
      QV.Close();
      v_MAXDATA = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DATA as IMPUCONTDATA ");
      SQL.append("from ");
      SQL.append("  IMPUTAZIONI_CONTABILI A ");
      SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMENTSPE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MAXDATA = QV.Get("IMPUCONTDATA", IDVariant.DATETIME) ;
      }
      QV.Close();
      if (!(IDL.IsNull(v_MAXDATA1)) && !(IDL.IsNull(v_MAXDATA)))
      {
        if (v_MAXDATA1.compareTo(v_MAXDATA, true)>0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Data Liquidazioni Stipendi inferiore all'ultima data caricata", IDVariant.STRING));
          if ((new IDVariant(Mymessageconfirm(IDL.Add(IDL.Add(v_SMS, (new IDVariant("<BR/>"))), (new IDVariant("Continuare?")))))).equals((new IDVariant(0)), true))
          {
            v_RETVALUE = (new IDVariant(0));
            return v_RETVALUE.booleanValue();
          }
        }
        if (v_MAXDATA1.equals(v_MAXDATA, true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Data Liquidazioni Stipendi già caricata", IDVariant.STRING));
          if ((new IDVariant(Mymessageconfirm(IDL.Add(IDL.Add(v_SMS, (new IDVariant("<BR/>"))), (new IDVariant("Continuare?")))))).equals((new IDVariant(0)), true))
          {
            v_RETVALUE = (new IDVariant(0));
            return v_RETVALUE.booleanValue();
          }
        }
      }
      return v_RETVALUE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoImputazioni", "Errorcheck", _e);
      return false;
    }
  }

  // **********************************************************************
  // Predisposizione
  // **********************************************************************
  public IDVariant Predisposizione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ISESSIONE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione Body
      // Procedure Body
      // 
      v_DARESTITUIRE = (new IDVariant(1));
      v_IFASE = (new IDVariant("TMP"));
      v_ISESSIONE = new IDVariant(new IDVariant(MainFrm.PROGRESESSIO),IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("delete from WORK_EXPORT_ID ");
      SQL.append("where (FASE = 'TMP') ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(MAX(A.PROGRESSIVO), 0) + 1 as NUVAMAWEIP01 ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("NUVAMAWEIP01", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("insert into WORK_EXPORT_ID ");
      SQL.append("( ");
      SQL.append("  PROGRESSIVO, ");
      SQL.append("  FASE, ");
      SQL.append("  SESSIONE ");
      SQL.append(") ");
      SQL.append("values ");
      SQL.append("( ");
      SQL.append("  " + IDL.CSql(v_DARESTITUIRE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_IFASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_ISESSIONE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
      SQL.append(") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return v_DARESTITUIRE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoImputazioni", "Predisposizione", _e);
      return new IDVariant();
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (MainFrm.TRACCIATPERS.equals((new IDVariant("AD")), true))
      {
        PAN_CARICAIMPUTA.SetFlags (Glb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CARICAIMPUTA.SetFlags (Glb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IMDB.set_Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMEBLOBI, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMEPROGR, 0, Predisposizione());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoImputazioni", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMDALIST, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoImputazioni", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Caricamento Imputazioni After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
  // **********************************************************************
  private void PAN_CARICAIMPUTA_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PERCORSO = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Caricamento Imputazioni After BLOB Update Event Body
      // Procedure Body
      // 
      C2 = PAN_CARICAIMPUTA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_CARICAIMPUTA.GotoFirst();
      while (!PAN_CARICAIMPUTA.RSEOF())
      {
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE1, IMDBDef15.PQSL_NEWTABLE1_PROGRESSIVO, 0).equals(C2.Get("PROGRESSIVO"), true))
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),(new IDVariant(MainFrm.RealPath)),IDL.Add(IDL.Add(IDL.Add((new IDVariant("temp")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant("_"))), IDL.ToString(MainFrm.PROGRESESSIO)));
          IMDB.set_Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMEPERCO, 0, new IDVariant(v_PERCORSO));
        }
        PAN_CARICAIMPUTA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMEBLOBI, 0, (new IDVariant("SI")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoImputazioni", "CaricamentoImputazioniAfterBLOBUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Caricamento Imputazioni On Database Error Event
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
  private void PAN_CARICAIMPUTA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CARICAIMPUTA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Caricamento Imputazioni On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoImputazioni", "CaricamentoImputazioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void CARICAIMPUTA_NEWTABLE49() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_NEWTABLE49_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR75, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR75, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE49_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_NEWTABLE49_RS, 0, IMDBDef6.TBL_PAR75, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE49_RS, 0, 0, IMDBDef6.TBL_PAR75, IMDBDef6.FLD_PAR75_ROWNAMDALIST, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR75, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR75, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR75, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_NEWTABLE49_RS, 0);
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
  private void PAN_CARICAIMPUTA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CARICAIMPUTA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CARICAIMPUTA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CARICAIMPUTA);
    // Stub
  }

  private void PAN_CARICAIMPUTA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CARICAIMPUTA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_CARICAIMPUTA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CARICAIMPUTA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CARICAIMPUTA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE1, IMDBDef15.PQSL_NEWTABLE1_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE1, IMDBDef15.PQSL_NEWTABLE1_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_CARICAIMPUTA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DATALIQSTIPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DATALIQSTIPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATALIQSTIPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATALIQSTIPE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATALIQSTIPE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DATALIQSTIPE);
    // Stub
  }

  private void PAN_DATALIQSTIPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DATALIQSTIPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DATALIQSTIPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATALIQSTIPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CARICAIMPUTA_Init()
  {

    PAN_CARICAIMPUTA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CARICAIMPUTA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CARICAIMPUTA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_CARICAIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, "6896224E-F553-47DB-9A2B-027540870E0E");
    PAN_CARICAIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, "Elabora");
    PAN_CARICAIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_CARICAIMPUTA.SetImage(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, 0, "button1.gif", false);
    PAN_CARICAIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CARICAIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, "2A56775E-1CFA-42D8-90D3-1B9EE9B897AD");
    PAN_CARICAIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, "");
    PAN_CARICAIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, MyGlb.VIS_VUOTONORMALE);
    PAN_CARICAIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CARICAIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, "B0FD9669-402B-42D8-8AAE-76E62C37B61B");
    PAN_CARICAIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, "PROGRESSIVO");
    PAN_CARICAIMPUTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, "");
    PAN_CARICAIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CARICAIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CARICAIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, "5235CE66-A9A8-4424-B69A-68458BC25553");
    PAN_CARICAIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, "Path");
    PAN_CARICAIMPUTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, "");
    PAN_CARICAIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, MyGlb.VIS_NORMFIELPADR);
    PAN_CARICAIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CARICAIMPUTA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, MyGlb.PANEL_LIST, 448, 80, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CARICAIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_CARICAIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, MyGlb.PANEL_FORM, 444, 168, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CARICAIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_CARICAIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_CARICAIMPUTA.SetFieldPage(PFL_CARICAIMPUTA_ELABORA, -1, -1);
    PAN_CARICAIMPUTA.SetFieldPanel(PFL_CARICAIMPUTA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, MyGlb.PANEL_LIST, 16, 4, 284, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CARICAIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, MyGlb.PANEL_LIST, 0);
    PAN_CARICAIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, MyGlb.PANEL_LIST, 3);
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, MyGlb.PANEL_FORM, 4, 4, 260, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CARICAIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, MyGlb.PANEL_FORM, 0);
    PAN_CARICAIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PANNELLO, MyGlb.PANEL_FORM, 3);
    PAN_CARICAIMPUTA.SetFieldPage(PFL_CARICAIMPUTA_PANNELLO, -1, -1);
    PAN_CARICAIMPUTA.SetFieldPanel(PFL_CARICAIMPUTA_PANNELLO, -1, "", "PANNELLO", 0, 0, 0, -13997);
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CARICAIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_CARICAIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_CARICAIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 180, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CARICAIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_CARICAIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_CARICAIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_CARICAIMPUTA.SetFieldPage(PFL_CARICAIMPUTA_PROGRESSIVO, -1, -1);
    PAN_CARICAIMPUTA.SetFieldPanel(PFL_CARICAIMPUTA_PROGRESSIVO, PPQRY_NEWTABLE1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CARICAIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, MyGlb.PANEL_LIST, 64);
    PAN_CARICAIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, MyGlb.PANEL_LIST, 2);
    PAN_CARICAIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, MyGlb.PANEL_LIST, "Path");
    PAN_CARICAIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, MyGlb.PANEL_FORM, 12, 64, 508, 80, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CARICAIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, MyGlb.PANEL_FORM, 64);
    PAN_CARICAIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, MyGlb.PANEL_FORM, 5);
    PAN_CARICAIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CARICAIMPUTA_PATH, MyGlb.PANEL_FORM, "Path");
    PAN_CARICAIMPUTA.SetFieldPage(PFL_CARICAIMPUTA_PATH, -1, -1);
    PAN_CARICAIMPUTA.SetFieldPanel(PFL_CARICAIMPUTA_PATH, PPQRY_NEWTABLE1, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
  }

  private void PAN_CARICAIMPUTA_InitQueries()
  {
    StringBuffer SQL;

    PAN_CARICAIMPUTA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CARICAIMPUTA.SetIMDB(IMDB, "PQRY_NEWTABLE1", true);
    PAN_CARICAIMPUTA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_CARICAIMPUTA.SetQuery(PPQRY_NEWTABLE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_CARICAIMPUTA.SetQuery(PPQRY_NEWTABLE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PAR75.ROWNAMEPROGR~~) ");
    PAN_CARICAIMPUTA.SetQuery(PPQRY_NEWTABLE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CARICAIMPUTA.SetQuery(PPQRY_NEWTABLE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CARICAIMPUTA.SetQuery(PPQRY_NEWTABLE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CARICAIMPUTA.SetQuery(PPQRY_NEWTABLE1, 5, SQL, -1, "");
    PAN_CARICAIMPUTA.SetQueryDB(PPQRY_NEWTABLE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CARICAIMPUTA.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CARICAIMPUTA.Status() == 2)
    {
      int oldListQBE = PAN_CARICAIMPUTA.iUseListQBE;
      PAN_CARICAIMPUTA.iUseListQBE = 0;
      PAN_CARICAIMPUTA.PanelCommand(Glb.PCM_SEARCH);
      PAN_CARICAIMPUTA.PanelCommand(Glb.PCM_FIND);
      PAN_CARICAIMPUTA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DATALIQSTIPE_Init()
  {

    PAN_DATALIQSTIPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATALIQSTIPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DATALIQSTIPE.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_DATALIQSTIPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, "88F30693-5F28-452A-A4C1-1D1512A80BAD");
    PAN_DATALIQSTIPE.set_Header(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, "Data Liquidazioni Stipendi");
    PAN_DATALIQSTIPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, "");
    PAN_DATALIQSTIPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, MyGlb.VIS_NORMALFIELDS);
    PAN_DATALIQSTIPE.SetFlags(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DATALIQSTIPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATALIQSTIPE.SetRect(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATALIQSTIPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, MyGlb.PANEL_LIST, 132);
    PAN_DATALIQSTIPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, MyGlb.PANEL_LIST, 1);
    PAN_DATALIQSTIPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, MyGlb.PANEL_LIST, "Data Liquidazioni Stipendi");
    PAN_DATALIQSTIPE.SetRect(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, MyGlb.PANEL_FORM, 0, 4, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATALIQSTIPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, MyGlb.PANEL_FORM, 156);
    PAN_DATALIQSTIPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, MyGlb.PANEL_FORM, 1);
    PAN_DATALIQSTIPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATALIQSTIPE_DATALIQUSTIP, MyGlb.PANEL_FORM, "Data Liquidazioni Stipendi");
    PAN_DATALIQSTIPE.SetFieldPage(PFL_DATALIQSTIPE_DATALIQUSTIP, -1, -1);
    PAN_DATALIQSTIPE.SetFieldPanel(PFL_DATALIQSTIPE_DATALIQUSTIP, PPQRY_NEWTABLE49, "A.ROWNAMDALIST", "ROWNAMDALIST", 6, 19, 0, -13997);
  }

  private void PAN_DATALIQSTIPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATALIQSTIPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATALIQSTIPE.SetIMDB(IMDB, "PQRY_NEWTABLE49", true);
    PAN_DATALIQSTIPE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_DATALIQSTIPE.SetQueryIMDB(PPQRY_NEWTABLE49, IMDBDef15.PQRY_NEWTABLE49_RS, IMDBDef6.TBL_PAR75);
    JustLoaded = true;
    PAN_DATALIQSTIPE.SetFieldPrimaryIndex(PFL_DATALIQSTIPE_DATALIQUSTIP, IMDBDef6.FLD_PAR75_ROWNAMDALIST);
    PAN_DATALIQSTIPE.SetMasterTable(0, "PAR75");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATALIQSTIPE.Status() == 2)
    {
      int oldListQBE = PAN_DATALIQSTIPE.iUseListQBE;
      PAN_DATALIQSTIPE.iUseListQBE = 0;
      PAN_DATALIQSTIPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATALIQSTIPE.PanelCommand(Glb.PCM_FIND);
      PAN_DATALIQSTIPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CARICAIMPUTA) PAN_CARICAIMPUTA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DATALIQSTIPE) PAN_DATALIQSTIPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CARICAIMPUTA) PAN_CARICAIMPUTA_ValidateRow(Cancel);
    if (SrcObj == PAN_DATALIQSTIPE) PAN_DATALIQSTIPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CARICAIMPUTA) PAN_CARICAIMPUTA_DynamicProperties();
    if (SrcObj == PAN_DATALIQSTIPE) PAN_DATALIQSTIPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CARICAIMPUTA) PAN_CARICAIMPUTA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DATALIQSTIPE) PAN_DATALIQSTIPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CARICAIMPUTA) PAN_CARICAIMPUTA_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_CARICAIMPUTA) PAN_CARICAIMPUTA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DATALIQSTIPE) PAN_DATALIQSTIPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
