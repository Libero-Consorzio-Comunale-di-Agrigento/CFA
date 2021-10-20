// **********************************************
// Scelta Opere Bifin
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaOpereBifin extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTAOPERA_CODICE = 0;
  private static int PFL_SCELTAOPERA_DESCRIZIONE = 1;

  private static int PPQRY_BILFIN6 = 0;


  IDPanel PAN_SCELTAOPERA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDB8(IMDB);
    Init_TBL_OPERE6(IMDB);
    //
    //
    Init_PQRY_BILFIN6(IMDB);
    Init_PQRY_BILFIN6_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDB8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_IMDB8, 7);
    IMDB.set_TblCode(IMDBDef1.TBL_IMDB8, "TBL_IMDB8");
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMOGGNUMACC, "NOMOGGNUMACC");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMOGGNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMOGGANNACC, "NOMOGGANNACC");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB8,IMDBDef1.FLD_IMDB8_NOMOGGANNACC,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_IMDB8, 0);
  }

  private static void Init_TBL_OPERE6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_OPERE6, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_OPERE6, "TBL_OPERE6");
    IMDB.set_FldCode(IMDBDef1.TBL_OPERE6,IMDBDef1.FLD_OPERE6_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef1.TBL_OPERE6,IMDBDef1.FLD_OPERE6_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_OPERE6,IMDBDef1.FLD_OPERE6_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef1.TBL_OPERE6,IMDBDef1.FLD_OPERE6_DESCRIZIONE,5,200,0);
  }

  private static void Init_PQRY_BILFIN6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_BILFIN6, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_BILFIN6, "PQRY_BILFIN6");
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN6,IMDBDef8.PQSL_BILFIN6_RECOOPERCODI, "RECOOPERCODI");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN6,IMDBDef8.PQSL_BILFIN6_RECOOPERCODI,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN6,IMDBDef8.PQSL_BILFIN6_RECOOPERDESC, "RECOOPERDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN6,IMDBDef8.PQSL_BILFIN6_RECOOPERDESC,5,200,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_BILFIN6, 0);
  }

  private static void Init_PQRY_BILFIN6_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_BILFIN6_RS, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_BILFIN6_RS, "PQRY_BILFIN6_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN6_RS,IMDBDef8.PQSL_BILFIN6_RECOOPERCODI, "RECOOPERCODI");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN6_RS,IMDBDef8.PQSL_BILFIN6_RECOOPERCODI,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN6_RS,IMDBDef8.PQSL_BILFIN6_RECOOPERDESC, "RECOOPERDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN6_RS,IMDBDef8.PQSL_BILFIN6_RECOOPERDESC,5,200,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaOpereBifin(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaOpereBifin()
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
    FormIdx = MyGlb.FRM_SCELOPERBIFI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4663FB36-B453-4135-8544-2609B8694942";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 604;
    DesignHeight = 346;
    set_Caption(new IDVariant("Scelta Opere"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 604;
    Frames[1].Height = 320;
    Frames[1].Caption = "Scelta Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_SCELTAOPERA = new IDPanel(w, this, 1, "PAN_SCELTAOPERA");
    Frames[1].Content = PAN_SCELTAOPERA;
    PAN_SCELTAOPERA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTAOPERA.VS = MainFrm.VisualStyleList;
    PAN_SCELTAOPERA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 604-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTAOPERA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "32E2AC3B-F720-4732-BFC5-958BE29EB61C");
    PAN_SCELTAOPERA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 556, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCELTAOPERA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTAOPERA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTAOPERA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTAOPERA.InitStatus = 2;
    PAN_SCELTAOPERA_Init();
    PAN_SCELTAOPERA_InitFields();
    PAN_SCELTAOPERA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_OPERE6, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELOPERBIFI_BILFIN6();
      }
      PAN_SCELTAOPERA.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaOpereBifin);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaOpereBifin.class.getName() : (Glb.ClassWithPackage(SceltaOpereBifin.class) ? SceltaOpereBifin.class.getName().substring(SceltaOpereBifin.class.getPackage().getName().length() + 1) : SceltaOpereBifin.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Opera On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTAOPERA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTAOPERA);
      // 
      // Scelta Opera On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_SCELTAOPERA.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAOPERA_DESCRIZIONE,(new IDVariant(PAN_SCELTAOPERA.FieldText(PFL_SCELTAOPERA_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaOpereBifin", "SceltaOperaOnDynamicProperties", _e);
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
      Riempiimdb();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaOpereBifin", "Load", _e);
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
      UNLOAD_IMDBDELETE();
      UNLOAD_OPEREDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaOpereBifin", "Unload", _e);
    }
  }

  // **********************************************************************
  // IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDBDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGEFINA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMOGGNUMACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMOGGANNACC, 0, new IDVariant());
  }

  // **********************************************************************
  // OPERE: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_OPEREDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef1.TBL_OPERE6);
  }

  // **********************************************************************
  // Riempiimdb
  // **********************************************************************
  public int Riempiimdb ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempiimdb Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_OPEINSINTSEL();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaOpereBifin", "Riempiimdb", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OPERE: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_OPEINSINTSEL() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CODICE as OPERECODICE, ");
    SQL.append("  B.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  OPERE B ");
    SQL.append("where (B.CODICE = A.OPERA) ");
    SQL.append("and   (A.ESERCIZIO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
    SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGEFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMOGGANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  E.CODICE, ");
    SQL.append("  E.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ACC_OPE C, ");
    SQL.append("  ESEA_OPE D, ");
    SQL.append("  OPERE E ");
    SQL.append("where (C.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMOGGANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (C.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMOGGNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.ESERCIZIO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
    SQL.append("and   (D.ANNO_ACC = C.ANNO_ACC) ");
    SQL.append("and   (D.NUMERO_ACC = C.NUMERO_ACC) ");
    SQL.append("and   (D.OPERA = C.OPERA) ");
    SQL.append("and   (D.FINANZIAMENTO = C.FINANZIAMENTO) ");
    SQL.append("and   ((D.SALDO_INI + D.VARIAZIONI + D.VARIAZIONI_RES) > 0) ");
    SQL.append("and   (E.CODICE(+) = C.OPERA) ");
    SQL.append("and   (NOT ((" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB8, IMDBDef1.FLD_IMDB8_NOMOGGANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("order by 1, 2 ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef1.TBL_OPERE6, 0);
      IMDB.set_Value(IMDBDef1.TBL_OPERE6,IMDBDef1.FLD_OPERE6_CODICE,0,RS.Get(1));
      IMDB.set_Value(IMDBDef1.TBL_OPERE6,IMDBDef1.FLD_OPERE6_DESCRIZIONE,0,RS.Get(2));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // BIL FIN
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCELOPERBIFI_BILFIN6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_BILFIN6_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_OPERE6, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_OPERE6, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_BILFIN6_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_BILFIN6_RS, 0, IMDBDef1.TBL_OPERE6, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_BILFIN6_RS, 0, 0, IMDBDef1.TBL_OPERE6, IMDBDef1.FLD_OPERE6_CODICE, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_BILFIN6_RS, 1, 0, IMDBDef1.TBL_OPERE6, IMDBDef1.FLD_OPERE6_DESCRIZIONE, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_OPERE6, 0);
      if (IMDB.Eof(IMDBDef1.TBL_OPERE6, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_OPERE6, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_BILFIN6_RS, 0);
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
  private void PAN_SCELTAOPERA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTAOPERA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTAOPERA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTAOPERA, Cancel);
    // Stub
  }

  private void PAN_SCELTAOPERA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTAOPERA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTAOPERA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTAOPERA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTAOPERA_Init()
  {

    PAN_SCELTAOPERA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTAOPERA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTAOPERA.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_SCELTAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, "ECA96044-F349-41EC-BB0C-D844A0979245");
    PAN_SCELTAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, "Codice");
    PAN_SCELTAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, "");
    PAN_SCELTAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTAOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, "1BE2CD05-2368-4F65-89B7-532659F5AA64");
    PAN_SCELTAOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, "Descrizione");
    PAN_SCELTAOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, "");
    PAN_SCELTAOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
  }

  private void PAN_SCELTAOPERA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_SCELTAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_SCELTAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, MyGlb.PANEL_FORM, 4, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_SCELTAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_SCELTAOPERA.SetFieldPage(PFL_SCELTAOPERA_CODICE, -1, -1);
    PAN_SCELTAOPERA.SetFieldPanel(PFL_SCELTAOPERA_CODICE, PPQRY_BILFIN6, "A.CODICE", "RECOOPERCODI", 1, 5, 0, -13997);
    PAN_SCELTAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, 52, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTAOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 592, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTAOPERA.SetFieldPage(PFL_SCELTAOPERA_DESCRIZIONE, -1, -1);
    PAN_SCELTAOPERA.SetFieldPanel(PFL_SCELTAOPERA_DESCRIZIONE, PPQRY_BILFIN6, "A.DESCRIZIONE", "RECOOPERDESC", 5, 200, 0, -13997);
  }

  private void PAN_SCELTAOPERA_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTAOPERA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTAOPERA.SetIMDB(IMDB, "PQRY_BILFIN6", true);
    PAN_SCELTAOPERA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_SCELTAOPERA.SetQueryIMDB(PPQRY_BILFIN6, IMDBDef8.PQRY_BILFIN6_RS, IMDBDef1.TBL_OPERE6);
    JustLoaded = true;
    PAN_SCELTAOPERA.SetFieldPrimaryIndex(PFL_SCELTAOPERA_CODICE, IMDBDef1.FLD_OPERE6_CODICE);
    PAN_SCELTAOPERA.SetFieldPrimaryIndex(PFL_SCELTAOPERA_DESCRIZIONE, IMDBDef1.FLD_OPERE6_DESCRIZIONE);
    PAN_SCELTAOPERA.SetMasterTable(0, "OPERE6");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTAOPERA.Status() == 2)
    {
      int oldListQBE = PAN_SCELTAOPERA.iUseListQBE;
      PAN_SCELTAOPERA.iUseListQBE = 0;
      PAN_SCELTAOPERA.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTAOPERA.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTAOPERA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTAOPERA) PAN_SCELTAOPERA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAOPERA) PAN_SCELTAOPERA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTAOPERA) PAN_SCELTAOPERA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAOPERA) PAN_SCELTAOPERA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTAOPERA) PAN_SCELTAOPERA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
