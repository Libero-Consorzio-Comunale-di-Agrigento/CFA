// **********************************************
// Scelta Finanziamento BILFIN
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaFinanziamentoBILFIN extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTAFINANZ_FINANZIAMENT = 0;
  private static int PFL_SCELTAFINANZ_DESCRIZIONE = 1;

  private static int PPQRY_FINANZIAME32 = 0;


  IDPanel PAN_SCELTAFINANZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDB7(IMDB);
    Init_TBL_FINANZIAME31(IMDB);
    //
    //
    Init_PQRY_FINANZIAME32(IMDB);
    Init_PQRY_FINANZIAME32_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDB7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_IMDB7, 6);
    IMDB.set_TblCode(IMDBDef1.TBL_IMDB7, "TBL_IMDB7");
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMOGGNUMACC, "NOMOGGNUMACC");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMOGGNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMOGGANNACC, "NOMOGGANNACC");
    IMDB.SetFldParams(IMDBDef1.TBL_IMDB7,IMDBDef1.FLD_IMDB7_NOMOGGANNACC,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_IMDB7, 0);
  }

  private static void Init_TBL_FINANZIAME31(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_FINANZIAME31, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_FINANZIAME31, "TBL_FINANZIAME31");
    IMDB.set_FldCode(IMDBDef1.TBL_FINANZIAME31,IMDBDef1.FLD_FINANZIAME31_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef1.TBL_FINANZIAME31,IMDBDef1.FLD_FINANZIAME31_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_FINANZIAME31,IMDBDef1.FLD_FINANZIAME31_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef1.TBL_FINANZIAME31,IMDBDef1.FLD_FINANZIAME31_DESCRIZIONE,5,200,0);
  }

  private static void Init_PQRY_FINANZIAME32(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FINANZIAME32, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_FINANZIAME32, "PQRY_FINANZIAME32");
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME32,IMDBDef8.PQSL_FINANZIAME32_RECORDFINANZ, "RECORDFINANZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME32,IMDBDef8.PQSL_FINANZIAME32_RECORDFINANZ,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME32,IMDBDef8.PQSL_FINANZIAME32_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME32,IMDBDef8.PQSL_FINANZIAME32_RECORDDESCRI,5,200,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FINANZIAME32, 0);
  }

  private static void Init_PQRY_FINANZIAME32_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FINANZIAME32_RS, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_FINANZIAME32_RS, "PQRY_FINANZIAME32_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME32_RS,IMDBDef8.PQSL_FINANZIAME32_RECORDFINANZ, "RECORDFINANZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME32_RS,IMDBDef8.PQSL_FINANZIAME32_RECORDFINANZ,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME32_RS,IMDBDef8.PQSL_FINANZIAME32_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME32_RS,IMDBDef8.PQSL_FINANZIAME32_RECORDDESCRI,5,200,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaFinanziamentoBILFIN(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaFinanziamentoBILFIN()
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
    FormIdx = MyGlb.FRM_SCELFINABILF;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B68C1551-30D7-41C8-AD89-8C144ECC5B4E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 632;
    DesignHeight = 358;
    set_Caption(new IDVariant("Scelta Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 632;
    Frames[1].Height = 332;
    Frames[1].Caption = "Scelta Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 332;
    PAN_SCELTAFINANZ = new IDPanel(w, this, 1, "PAN_SCELTAFINANZ");
    Frames[1].Content = PAN_SCELTAFINANZ;
    PAN_SCELTAFINANZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTAFINANZ.VS = MainFrm.VisualStyleList;
    PAN_SCELTAFINANZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 632-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTAFINANZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1A4446D4-94CF-4DD8-BBF0-3F48414DE728");
    PAN_SCELTAFINANZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 596, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCELTAFINANZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTAFINANZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTAFINANZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTAFINANZ.InitStatus = 2;
    PAN_SCELTAFINANZ_Init();
    PAN_SCELTAFINANZ_InitFields();
    PAN_SCELTAFINANZ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_FINANZIAME31, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELFINABILF_FINANZIAME32();
      }
      PAN_SCELTAFINANZ.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaFinanziamentoBILFIN);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaFinanziamentoBILFIN.class.getName() : (Glb.ClassWithPackage(SceltaFinanziamentoBILFIN.class) ? SceltaFinanziamentoBILFIN.class.getName().substring(SceltaFinanziamentoBILFIN.class.getPackage().getName().length() + 1) : SceltaFinanziamentoBILFIN.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Finanziamento On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTAFINANZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTAFINANZ);
      // 
      // Scelta Finanziamento On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_SCELTAFINANZ.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAFINANZ_DESCRIZIONE,(new IDVariant(PAN_SCELTAFINANZ.FieldText(PFL_SCELTAFINANZ_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaFinanziamentoBILFIN", "SceltaFinanziamentoOnDynamicProperties", _e);
    }
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
      RIEMPIIMDB_FININSINTSE1();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaFinanziamentoBILFIN", "Riempiimdb", _e);
      return -1;
    }
  }

  // **********************************************************************
  // FINANZIAMENTI: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_FININSINTSE1() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CODICE as FINANZCODICE, ");
    SQL.append("  B.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("and   (A.ESERCIZIO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
    SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMOGGANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  E.CODICE, ");
    SQL.append("  E.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ACC_OPE C, ");
    SQL.append("  ESEA_OPE D, ");
    SQL.append("  FINANZIAMENTI E ");
    SQL.append("where (C.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMOGGANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (C.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMOGGNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.ESERCIZIO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
    SQL.append("and   (D.ANNO_ACC = C.ANNO_ACC) ");
    SQL.append("and   (D.NUMERO_ACC = C.NUMERO_ACC) ");
    SQL.append("and   (D.OPERA = C.OPERA) ");
    SQL.append("and   (D.FINANZIAMENTO = C.FINANZIAMENTO) ");
    SQL.append("and   ((D.SALDO_INI + D.VARIAZIONI + D.VARIAZIONI_RES) > 0) ");
    SQL.append("and   (E.CODICE(+) = C.FINANZIAMENTO) ");
    SQL.append("and   (NOT ((" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMOGGANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("order by 1, 2 ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef1.TBL_FINANZIAME31, 0);
      IMDB.set_Value(IMDBDef1.TBL_FINANZIAME31,IMDBDef1.FLD_FINANZIAME31_CODICE,0,RS.Get(1));
      IMDB.set_Value(IMDBDef1.TBL_FINANZIAME31,IMDBDef1.FLD_FINANZIAME31_DESCRIZIONE,0,RS.Get(2));
      RS.MoveNext();
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
      UNLOAD_FINANZDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaFinanziamentoBILFIN", "Unload", _e);
    }
  }

  // **********************************************************************
  // IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDBDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMOGGNUMACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IMDB7, IMDBDef1.FLD_IMDB7_NOMOGGANNACC, 0, new IDVariant());
  }

  // **********************************************************************
  // FINANZIAMENTI: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FINANZDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef1.TBL_FINANZIAME31);
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
      MainFrm.ErrObj.ProcError ("SceltaFinanziamentoBILFIN", "Load", _e);
    }
  }

  // **********************************************************************
  // FINANZIAMENTI
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCELFINABILF_FINANZIAME32() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_FINANZIAME32_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_FINANZIAME31, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_FINANZIAME31, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_FINANZIAME32_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_FINANZIAME32_RS, 0, IMDBDef1.TBL_FINANZIAME31, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_FINANZIAME32_RS, 0, 0, IMDBDef1.TBL_FINANZIAME31, IMDBDef1.FLD_FINANZIAME31_CODICE, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_FINANZIAME32_RS, 1, 0, IMDBDef1.TBL_FINANZIAME31, IMDBDef1.FLD_FINANZIAME31_DESCRIZIONE, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_FINANZIAME31, 0);
      if (IMDB.Eof(IMDBDef1.TBL_FINANZIAME31, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_FINANZIAME31, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef8.PQRY_FINANZIAME32_RS);
    IMDB.TblSortBy(IMDBDef8.PQRY_FINANZIAME32_RS,0,true);
    IMDB.TblSortBy(IMDBDef8.PQRY_FINANZIAME32_RS,1,true);
    IMDB.TblStartSort(IMDBDef8.PQRY_FINANZIAME32_RS);
    IMDB.TblMoveFirst(IMDBDef8.PQRY_FINANZIAME32_RS, 0);
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
  private void PAN_SCELTAFINANZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTAFINANZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTAFINANZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTAFINANZ, Cancel);
    // Stub
  }

  private void PAN_SCELTAFINANZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTAFINANZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTAFINANZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTAFINANZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTAFINANZ_Init()
  {

    PAN_SCELTAFINANZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTAFINANZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTAFINANZ.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_SCELTAFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, "C8C132CE-21F8-4F4A-BE0E-58F226006E6F");
    PAN_SCELTAFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, "Finanziamento");
    PAN_SCELTAFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, "");
    PAN_SCELTAFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTAFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, "1D29082A-824E-4C5A-9C1A-98CE42788214");
    PAN_SCELTAFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, "Descrizione");
    PAN_SCELTAFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, "");
    PAN_SCELTAFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
  }

  private void PAN_SCELTAFINANZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTAFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, MyGlb.PANEL_LIST, 52);
    PAN_SCELTAFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_SCELTAFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, MyGlb.PANEL_FORM, 52);
    PAN_SCELTAFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_SCELTAFINANZ.SetFieldPage(PFL_SCELTAFINANZ_FINANZIAMENT, -1, -1);
    PAN_SCELTAFINANZ.SetFieldPanel(PFL_SCELTAFINANZ_FINANZIAMENT, PPQRY_FINANZIAME32, "A.CODICE", "RECORDFINANZ", 1, 5, 0, -13997);
    PAN_SCELTAFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 92, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTAFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 592, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTAFINANZ.SetFieldPage(PFL_SCELTAFINANZ_DESCRIZIONE, -1, -1);
    PAN_SCELTAFINANZ.SetFieldPanel(PFL_SCELTAFINANZ_DESCRIZIONE, PPQRY_FINANZIAME32, "A.DESCRIZIONE", "RECORDDESCRI", 5, 200, 0, -13997);
  }

  private void PAN_SCELTAFINANZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTAFINANZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTAFINANZ.SetIMDB(IMDB, "PQRY_FINANZIAME32", true);
    PAN_SCELTAFINANZ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_SCELTAFINANZ.SetQueryIMDB(PPQRY_FINANZIAME32, IMDBDef8.PQRY_FINANZIAME32_RS, IMDBDef1.TBL_FINANZIAME31);
    JustLoaded = true;
    PAN_SCELTAFINANZ.SetFieldPrimaryIndex(PFL_SCELTAFINANZ_FINANZIAMENT, IMDBDef1.FLD_FINANZIAME31_CODICE);
    PAN_SCELTAFINANZ.SetFieldPrimaryIndex(PFL_SCELTAFINANZ_DESCRIZIONE, IMDBDef1.FLD_FINANZIAME31_DESCRIZIONE);
    PAN_SCELTAFINANZ.SetMasterTable(0, "FINANZIAME31");
    PAN_SCELTAFINANZ.AddToSortList(PFL_SCELTAFINANZ_FINANZIAMENT, true);
    PAN_SCELTAFINANZ.AddToSortList(PFL_SCELTAFINANZ_DESCRIZIONE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTAFINANZ.Status() == 2)
    {
      int oldListQBE = PAN_SCELTAFINANZ.iUseListQBE;
      PAN_SCELTAFINANZ.iUseListQBE = 0;
      PAN_SCELTAFINANZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTAFINANZ.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTAFINANZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTAFINANZ) PAN_SCELTAFINANZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAFINANZ) PAN_SCELTAFINANZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTAFINANZ) PAN_SCELTAFINANZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAFINANZ) PAN_SCELTAFINANZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTAFINANZ) PAN_SCELTAFINANZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
