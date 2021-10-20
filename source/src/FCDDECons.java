// **********************************************
// FCDDE Cons
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FCDDECons extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FCDDE_DCAPCSBDPC37 = 0;
  private static int GRP_FCDDE_CRSTDACODEBI = 1;
  private static int GRP_FCDDE_AIAESAQCIRSR = 2;

  private static int PFL_FCDDE_ESERCIZIO = 0;
  private static int PFL_FCDDE_ETICTIPO1010 = 1;
  private static int PFL_FCDDE_IMPORTA10101 = 2;
  private static int PFL_FCDDE_IMPORTB10101 = 3;
  private static int PFL_FCDDE_ETICHETTA1 = 4;
  private static int PFL_FCDDE_IMPORTOI = 5;
  private static int PFL_FCDDE_IMPORTOL = 6;
  private static int PFL_FCDDE_ETICLABECRED = 7;
  private static int PFL_FCDDE_IMPORTOM = 8;
  private static int PFL_FCDDE_ETICHLABEACC = 9;
  private static int PFL_FCDDE_ETICHEELABOR = 10;
  private static int PFL_FCDDE_ACCANEFF1010 = 11;
  private static int PFL_FCDDE_ACCAPERC1010 = 12;
  private static int PFL_FCDDE_ETICHCOMPFSC = 13;

  private static int PPQRY_BILACCFCDDE = 0;


  IDPanel PAN_FCDDE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARASTAMFCDD(IMDB);
    //
    //
    Init_PQRY_BILACCFCDDE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARASTAMFCDD(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARASTAMFCDD, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARASTAMFCDD, "TBL_PARASTAMFCDD");
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMOGGPROSTA, "NOMOGGPROSTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMOGGPROSTA,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOMSTA, "NOMOGGNOMSTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOMSTA,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOOGSTNUDIPA, "NOOGSTNUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOOGSTNUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOTSTA, "NOMOGGNOTSTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOTSTA,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMEOGGIDSTA, "NOMEOGGIDSTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMEOGGIDSTA,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOMFIL, "NOMOGGNOMFIL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCDD,IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOMFIL,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARASTAMFCDD, 0);
  }

  private static void Init_PQRY_BILACCFCDDE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BILACCFCDDE, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_BILACCFCDDE, "PQRY_BILACCFCDDE");
    IMDB.set_FldCode(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_A_10101, "IMPORTO_A_10101");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_A_10101,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_B_10101, "IMPORTO_B_10101");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_B_10101,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_D_10101, "IMPORTO_D_10101");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_D_10101,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_E_10101, "IMPORTO_E_10101");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_E_10101,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_I, "IMPORTO_I");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_I,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_L, "IMPORTO_L");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_L,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_M, "IMPORTO_M");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILACCFCDDE,IMDBDef12.PQSL_BILACCFCDDE_IMPORTO_M,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_BILACCFCDDE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FCDDECons(MyWebEntryPoint w, IMDBObj imdb)
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
  public FCDDECons()
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
    FormIdx = MyGlb.FRM_FCDDECONS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0A1DEE08-FF47-406C-BF13-0FB168589BF1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 608;
    DesignHeight = 454;
    set_Caption(new IDVariant("Fondo Crediti di Dubbia Esigibilità"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 608;
    Frames[1].Height = 428;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "FCDDE";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 428;
    PAN_FCDDE = new IDPanel(w, this, 1, "PAN_FCDDE");
    Frames[1].Content = PAN_FCDDE;
    PAN_FCDDE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FCDDE.VS = MainFrm.VisualStyleList;
    PAN_FCDDE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 608-MyGlb.PAN_OFFS_X, 428-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C39841BD-AEA0-41D6-B409-0B5F185D4AF7");
    PAN_FCDDE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 72, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FCDDE.InitStatus = 2;
    PAN_FCDDE_Init();
    PAN_FCDDE_InitFields();
    PAN_FCDDE_InitQueries();
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
      PAN_FCDDE.UpdatePanel(MainFrm);
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
    return (obj instanceof FCDDECons);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FCDDECons.class.getName() : (Glb.ClassWithPackage(FCDDECons.class) ? FCDDECons.class.getName().substring(FCDDECons.class.getPackage().getName().length() + 1) : FCDDECons.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPECONS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMOGGPROSTA, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMEOGGIDSTA, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOTSTA, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOOGSTNUDIPA, 0));
      MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMEOGGIDSTA, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOMSTA, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOTSTA, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOMFIL, 0), (new IDVariant("pdf")));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDECons", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      // 
      // Inserimento su BIL_ACC_FCDDE
      // 
      SQL = new StringBuffer();
      SQL.append("insert into BIL_CONS_FCDDE ");
      SQL.append("( ");
      SQL.append("  ESERCIZIO, ");
      SQL.append("  IMPORTO_A_10101, ");
      SQL.append("  IMPORTO_B_10101, ");
      SQL.append("  IMPORTO_D_10101, ");
      SQL.append("  IMPORTO_E_10101, ");
      SQL.append("  IMPORTO_I, ");
      SQL.append("  IMPORTO_L, ");
      SQL.append("  IMPORTO_M ");
      SQL.append(") ");
      SQL.append("select ");
      SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  GET_ACC_TITOLI_5_6_7(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  BIL_CONS_FCDDE B ");
      SQL.append("where (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append(")))) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDECons", "Load", _e);
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
      UNLOAD_PARSTAFCDDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDECons", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa FCDDE: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSTAFCDDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMOGGPROSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOMSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOOGSTNUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOTSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMEOGGIDSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCDD, IMDBDef3.FLD_PARASTAMFCDD_NOMOGGNOMFIL, 0, new IDVariant());
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
  private void PAN_FCDDE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FCDDE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FCDDE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FCDDE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FCDDE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FCDDE);
    // Stub
  }

  private void PAN_FCDDE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FCDDE_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_FCDDE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FCDDE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FCDDE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FCDDE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FCDDE_Init()
  {

    PAN_FCDDE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FCDDE.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, "EC26ADA0-B041-41D0-9028-78D57E018D26");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, "di cui accertati per cassa sulla base del principio contabile 3.7");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, MyGlb.VIS_GROUSTYNOBOR);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, MyGlb.PANEL_FORM, 24, 31, 556, 85, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 0, 345);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, "E13A4CD6-5054-414F-B5F3-A7DFA8A6E1C4");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, "CREDITI STRALCIATI DAL CONTO DEL BILANCIO");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, MyGlb.VIS_GROUPSTYLE);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, MyGlb.PANEL_LIST, 0, -9999, 8, 16, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, MyGlb.PANEL_FORM, 24, 179, 556, 85, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, 0, 261);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_CRSTDACODEBI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, "DCD2EF10-0680-4F68-BF25-4316E0B77588");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, "ACCERTAMENTI IMPUTATI AGLI ESERCIZI SUCCESSIVI A QUELLO CUI IL RENDICONTO SI RIFERISCE");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, MyGlb.VIS_GROUPSTYLE);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, MyGlb.PANEL_LIST, 0, -9999, 8, 16, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, MyGlb.PANEL_FORM, 24, 275, 556, 73, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, 0, 542);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_AIAESAQCIRSR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDE.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, "F53C74B2-3CB9-4AAF-970E-9E77905A5E77");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, "ESERCIZIO");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, "32896AC8-2128-4E83-A594-F49389EF476F");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, "Tipologia 10101: Imposte, tasse e proventi assimilati");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.VIS_VUONORALILEF);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, "0EF57A7F-74F8-45BE-93D1-34B32B28FFAD");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, "Residui Attivi Esercizio");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, "D5D5AE79-E80E-475D-A2D0-169BD0CE5073");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, "Residui Attivi Esercizi Prec.");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, "857111B6-F8A0-4FBA-A3D9-0B60BD917DF7");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, " ");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, "Finta 1");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.VIS_LABELFIELD);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, "21927787-FD61-4BB5-BAAA-6B4E1EB08107");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, "Totale Crediti");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, "206CBC9F-DD75-4839-AFAE-782396D3C620");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, "Fondo Svalutazione Crediti");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, "48A8A142-0549-4469-9A5F-74C5BEECF477");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, " ");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, MyGlb.VIS_LABELFIELD);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, "A8A0A814-E6FE-41BB-A808-CECF4F5E4C20");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, "Totale Crediti");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, "99E1A22A-E2EF-4154-B96F-43F39B9A5B12");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, " ");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, MyGlb.VIS_LABELFIELD);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, "086F1AC4-F091-4CA8-B7A8-A32D69A79736");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, "Elabora");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_FCDDE.SetImage(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, 0, "button1.gif", false);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, "10FC1612-193D-4135-875D-A8F4349DFFC3");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, "ACCANT EFF 10101");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, "C10EE0AC-7BEB-43CB-8687-314CCB1C5E64");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, "ACCANT PERC 10101");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, "E1A3169B-CFE2-42B7-988A-98A52E601E9E");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, "COMPOSIZIONE FONDO SVALUTAZIONE CREDITI");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, MyGlb.VIS_VUONORALILEF);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_FCDDE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_FORM, 160);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ESERCIZIO, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ESERCIZIO, PPQRY_BILACCFCDDE, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_LIST, 20, 16, 152, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_FORM, 24, 8, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICTIPO1010, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICTIPO1010, -1, "", "ETICTIPO1010", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, MyGlb.PANEL_LIST, 68);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, MyGlb.PANEL_LIST, "R. A. E.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, MyGlb.PANEL_FORM, 28, 56, 118, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, MyGlb.PANEL_FORM, 32);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTA10101, MyGlb.PANEL_FORM, "Residui Attivi Esercizio");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_IMPORTA10101, -1, GRP_FCDDE_DCAPCSBDPC37);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_IMPORTA10101, PPQRY_BILACCFCDDE, "A.IMPORTO_A_10101", "IMPORTO_A_10101", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, MyGlb.PANEL_LIST, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, MyGlb.PANEL_LIST, "R. A. E. P.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, MyGlb.PANEL_FORM, 152, 56, 118, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, MyGlb.PANEL_FORM, 32);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTB10101, MyGlb.PANEL_FORM, "Residui Attivi Esercizi Prec.");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_IMPORTB10101, -1, GRP_FCDDE_DCAPCSBDPC37);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_IMPORTB10101, PPQRY_BILACCFCDDE, "A.IMPORTO_B_10101", "IMPORTO_B_10101", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_LIST, 312, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_FORM, 512, 88, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHETTA1, -1, GRP_FCDDE_DCAPCSBDPC37);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHETTA1, -1, "", "ETICHETTA1", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, MyGlb.PANEL_LIST, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, MyGlb.PANEL_LIST, "T. C.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, MyGlb.PANEL_FORM, 28, 204, 118, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, MyGlb.PANEL_FORM, 32);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOI, MyGlb.PANEL_FORM, "Totale Crediti");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_IMPORTOI, -1, GRP_FCDDE_CRSTDACODEBI);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_IMPORTOI, PPQRY_BILACCFCDDE, "A.IMPORTO_I", "IMPORTO_I", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, MyGlb.PANEL_LIST, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, MyGlb.PANEL_LIST, "F. S. C.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, MyGlb.PANEL_FORM, 152, 204, 118, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, MyGlb.PANEL_FORM, 32);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOL, MyGlb.PANEL_FORM, "Fondo Svalutazione Crediti");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_IMPORTOL, -1, GRP_FCDDE_CRSTDACODEBI);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_IMPORTOL, PPQRY_BILACCFCDDE, "A.IMPORTO_L", "IMPORTO_L", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, MyGlb.PANEL_LIST, 544, 188, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, MyGlb.PANEL_FORM, 556, 240, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICLABECRED, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICLABECRED, -1, GRP_FCDDE_CRSTDACODEBI);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICLABECRED, -1, "", "ETICLABECRED", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, MyGlb.PANEL_LIST, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, MyGlb.PANEL_LIST, "T. C.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, MyGlb.PANEL_FORM, 28, 300, 118, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, MyGlb.PANEL_FORM, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_IMPORTOM, MyGlb.PANEL_FORM, "Totale Crediti");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_IMPORTOM, -1, GRP_FCDDE_AIAESAQCIRSR);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_IMPORTOM, PPQRY_BILACCFCDDE, "A.IMPORTO_M", "IMPORTO_M", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, MyGlb.PANEL_LIST, 396, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, MyGlb.PANEL_FORM, 560, 312, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHLABEACC, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHLABEACC, -1, GRP_FCDDE_AIAESAQCIRSR);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHLABEACC, -1, "", "ETICHLABEACC", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_LIST, 428, 1000, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_FORM, 496, 372, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHEELABOR, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_LIST, 112);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_LIST, "ACCANT EFF 10101");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_FORM, 4, 772, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_FORM, 112);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_FORM, "ACCANT EFF 10101");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCANEFF1010, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCANEFF1010, PPQRY_BILACCFCDDE, "A.IMPORTO_D_10101", "IMPORTO_D_10101", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_LIST, 124);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_LIST, "ACCANT PERC 10101");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_FORM, 4, 772, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_FORM, 124);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_FORM, "ACCANT PERC 10101");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCAPERC1010, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCAPERC1010, PPQRY_BILACCFCDDE, "A.IMPORTO_E_10101", "IMPORTO_E_10101", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, MyGlb.PANEL_LIST, 28, 24, 152, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, MyGlb.PANEL_FORM, 24, 156, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHCOMPFSC, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHCOMPFSC, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHCOMPFSC, -1, "", "ETICHCOMPFSC", 0, 0, 0, -13997);
  }

  private void PAN_FCDDE_InitQueries()
  {
    StringBuffer SQL;

    PAN_FCDDE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FCDDE.SetIMDB(IMDB, "PQRY_BILACCFCDDE", true);
    PAN_FCDDE.set_SetString(MyGlb.MASTER_ROWNAME, "BIL ACC FCDDE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.IMPORTO_A_10101 as IMPORTO_A_10101, ");
    SQL.append("  A.IMPORTO_B_10101 as IMPORTO_B_10101, ");
    SQL.append("  A.IMPORTO_D_10101 as IMPORTO_D_10101, ");
    SQL.append("  A.IMPORTO_E_10101 as IMPORTO_E_10101, ");
    SQL.append("  A.IMPORTO_I as IMPORTO_I, ");
    SQL.append("  A.IMPORTO_L as IMPORTO_L, ");
    SQL.append("  A.IMPORTO_M as IMPORTO_M ");
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_CONS_FCDDE A ");
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE, 5, SQL, -1, "");
    PAN_FCDDE.SetQueryDB(PPQRY_BILACCFCDDE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FCDDE.SetMasterTable(0, "BIL_CONS_FCDDE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FCDDE.Status() == 2)
    {
      int oldListQBE = PAN_FCDDE.iUseListQBE;
      PAN_FCDDE.iUseListQBE = 0;
      PAN_FCDDE.PanelCommand(Glb.PCM_SEARCH);
      PAN_FCDDE.PanelCommand(Glb.PCM_FIND);
      PAN_FCDDE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
