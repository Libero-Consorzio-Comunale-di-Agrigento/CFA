// **********************************************
// Nuovo Su Struttura Riclassificazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class NuovoSuStrutturaRiclassificazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_STRUTTRICLAS_INSERIMENTO = 0;
  private static int GRP_STRUTTRICLAS_AGGIORNAMENT = 1;

  private static int PFL_STRUTTRICLAS_STRUTTRICLID = 0;
  private static int PFL_STRUTTRICLAS_TIPORICLID = 1;
  private static int PFL_STRUTTRICLAS_SCHEMARICLID = 2;
  private static int PFL_STRUTTRICLAS_LABELINFO = 3;
  private static int PFL_STRUTTRICLAS_CODICE = 4;
  private static int PFL_STRUTTRICLAS_DESCRIZIONE = 5;
  private static int PFL_STRUTTRICLAS_CAPITOCOLLEG = 6;
  private static int PFL_STRUTTRICLAS_SIFAKE = 7;
  private static int PFL_STRUTTRICLAS_IMPECOIMPACC = 8;
  private static int PFL_STRUTTRICLAS_CONTROPARTIT = 9;
  private static int PFL_STRUTTRICLAS_FATTORDESCRI = 10;
  private static int PFL_STRUTTRICLAS_ES = 11;
  private static int PFL_STRUTTRICLAS_LIVELLO = 12;
  private static int PFL_STRUTTRICLAS_CODICEPADRE = 13;
  private static int PFL_STRUTTRICLAS_UTENTE1 = 14;
  private static int PFL_STRUTTRICLAS_DATA1 = 15;
  private static int PFL_STRUTTRICLAS_UTENTE = 16;
  private static int PFL_STRUTTRICLAS_DATA = 17;
  private static int PFL_STRUTTRICLAS_CODICE1 = 18;
  private static int PFL_STRUTTRICLAS_ESCLCONTDODI = 19;

  private static int PPQRY_STRUTTRICLAS = 0;

  private static int PPQRY_FATTORI = 1;

  private static int PPQRY_DUAL1 = 2;
  private static int PPQRY_DUAL = 3;


  IDPanel PAN_STRUTTRICLAS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN13(IMDB);
    //
    //
    Init_PQRY_STRUTTRICLAS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_IN13, 9);
    IMDB.set_TblCode(IMDBDef1.TBL_IN13, "TBL_IN13");
    IMDB.set_FldCode(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGSTRIID, "NOMOGGSTRIID");
    IMDB.SetFldParams(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGSTRIID,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGTIRIID, "NOMOGGTIRIID");
    IMDB.SetFldParams(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGTIRIID,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGSCRIID, "NOMOGGSCRIID");
    IMDB.SetFldParams(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGSCRIID,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMEOGGELIVE, "NOMEOGGELIVE");
    IMDB.SetFldParams(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMEOGGELIVE,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGCODPAD, "NOMOGGCODPAD");
    IMDB.SetFldParams(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGCODPAD,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGDESCAP, "NOMOGGDESCAP");
    IMDB.SetFldParams(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGDESCAP,5,50,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOOGDELIPELA, "NOOGDELIPELA");
    IMDB.SetFldParams(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOOGDELIPELA,9,300,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGCONVIS, "NOMOGGCONVIS");
    IMDB.SetFldParams(IMDBDef1.TBL_IN13,IMDBDef1.FLD_IN13_NOMOGGCONVIS,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_IN13, 0);
  }

  private static void Init_PQRY_STRUTTRICLAS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_STRUTTRICLAS, 18);
    IMDB.set_TblCode(IMDBDef8.PQRY_STRUTTRICLAS, "PQRY_STRUTTRICLAS");
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_STRUTTURA_RICL_ID, "STRUTTURA_RICL_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_STRUTTURA_RICL_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_TIPO_RICL_ID, "TIPO_RICL_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_TIPO_RICL_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_SCHEMA_RICL_ID, "SCHEMA_RICL_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_SCHEMA_RICL_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_LIVELLO, "LIVELLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_LIVELLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_SE_CAPITOLI, "SE_CAPITOLI");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_SE_CAPITOLI,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_CODICE_PADRE, "CODICE_PADRE");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_CODICE_PADRE,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_VALORE, "VALORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_VALORE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_DESCRIZIONE,5,300,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_CODICE,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_CONTROPARTITA, "CONTROPARTITA");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_CONTROPARTITA,5,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_IMP_ECO_IMPACC, "IMP_ECO_IMPACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_IMP_ECO_IMPACC,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_SIFAKE, "SIFAKE");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_SIFAKE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_ESCLUSIONE_12, "ESCLUSIONE_12");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTRICLAS,IMDBDef8.PQSL_STRUTTRICLAS_ESCLUSIONE_12,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_STRUTTRICLAS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public NuovoSuStrutturaRiclassificazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public NuovoSuStrutturaRiclassificazione()
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
    FormIdx = MyGlb.FRM_NUOVSUSTRRIC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EF0286F5-DBBC-426B-9300-E3E34D856FB2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 780;
    DesignHeight = 518;
    set_Caption(new IDVariant("Nuovo Su Struttura Riclassificazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 780;
    Frames[1].Height = 492;
    Frames[1].Caption = "Struttura Riclassificazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 492;
    PAN_STRUTTRICLAS = new IDPanel(w, this, 1, "PAN_STRUTTRICLAS");
    Frames[1].Content = PAN_STRUTTRICLAS;
    PAN_STRUTTRICLAS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STRUTTRICLAS.VS = MainFrm.VisualStyleList;
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 780-MyGlb.PAN_OFFS_X, 492-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E919C7C9-9C7E-45C1-B687-2AC9FDD735C6");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1716, 181, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STRUTTRICLAS.InitStatus = 2;
    PAN_STRUTTRICLAS_Init();
    PAN_STRUTTRICLAS_InitFields();
    PAN_STRUTTRICLAS_InitQueries();
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
      PAN_STRUTTRICLAS.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCEFATCOPAAT && flRis && IdxPanelActived == PAN_STRUTTRICLAS.FrIndex)
    {
      if (IdxFieldActived ==PFL_STRUTTRICLAS_CONTROPARTIT) {
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
    return (obj instanceof NuovoSuStrutturaRiclassificazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? NuovoSuStrutturaRiclassificazione.class.getName() : (Glb.ClassWithPackage(NuovoSuStrutturaRiclassificazione.class) ? NuovoSuStrutturaRiclassificazione.class.getName().substring(NuovoSuStrutturaRiclassificazione.class.getPackage().getName().length() + 1) : NuovoSuStrutturaRiclassificazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Struttura Riclassificazione Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_STRUTTRICLAS_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Struttura Riclassificazione Before Insert Body
      // Corpo Procedura
      // 
      IDVariant v_VSCHERICLFOR = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FORMATO as SCHERICLFORM ");
      SQL.append("from ");
      SQL.append("  SCHEMA_RICLASSIFICAZIONE A ");
      SQL.append("where (A.SCHEMA_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSCRIID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VSCHERICLFOR = QV.Get("SCHERICLFORM", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_TIPO_RICL_ID, 0, new IDVariant(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGTIRIID, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_E_S, 0, IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0));
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_LIVELLO, 0, IDL.Add(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_CODICE, 0, new IDVariant(IDL.ToFloat(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCODPAD, 0)), IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_VALORE, 0)), v_VSCHERICLFOR, (new IDVariant("0")), true))),IDVariant.INTEGER));
      // IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      // SQL = new StringBuffer();
      // SQL.append("select ");
      // SQL.append("  COUNT(*) as COUNT ");
      // SQL.append("from ");
      // SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
      // SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      // SQL.append("and   (A.CODICE_PADRE = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCODPAD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      // if (!QV.EOF()) QV.MoveNext();
      // if (!QV.EOF())
      // {
      //   v_VCOUNT = QV.Get("COUNT", IDVariant.INTEGER) ;
      // }
      // QV.Close();
      // if (v_VCOUNT.compareTo((new IDVariant(0)), true)!=0)
      // {
        // Cancel.set((new IDVariant(-1)));
        // IDVariant S = new IDVariant(0,IDVariant.STRING);
        // S = (new IDVariant(" già presente"));
        // MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_STRUTTRICLAS.Header(Glb.OBJ_FIELD,PFL_STRUTTRICLAS_CODICE))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_VALORE, 0))), S)); 
      // }
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_CODICE_PADRE, 0, new IDVariant(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCODPAD, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_SCHEMA_RICL_ID, 0, new IDVariant(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSCRIID, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_DATA_INSERIMENTO, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "StrutturaRiclassificazioneBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Struttura Riclassificazione Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_STRUTTRICLAS_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Struttura Riclassificazione Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "StrutturaRiclassificazioneBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Struttura Riclassificazione After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_STRUTTRICLAS_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Struttura Riclassificazione After Commit Body
      // Corpo Procedura
      // 
      if (RowsUpdated.compareTo((new IDVariant(0)), true)>0 && RowsInErrors.equals((new IDVariant(0)), true))
      {
        // PAN_STRUTTRICLAS.PanelCommand(Glb.PCM_REQUERY);
        IDVariant v_VSTRRISTRIID = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.STRUTTURA_RICL_ID as STRRICSTRIID ");
        SQL.append("from ");
        SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE_PADRE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_CODICE_PADRE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_TIPO_RICL_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_LIVELLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.SCHEMA_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_SCHEMA_RICL_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VSTRRISTRIID = QV.Get("STRRICSTRIID", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0, new IDVariant(v_VSTRRISTRIID));
        PAN_STRUTTRICLAS.PanelCommand(Glb.PCM_REQUERY);
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "StrutturaRiclassificazioneAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Struttura Riclassificazione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_STRUTTRICLAS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Struttura Riclassificazione On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_SIFAKE, 0)))
        {
          IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_SIFAKE, 0, (new IDVariant("SI")));
        }
      }
      if (Column.equals((new IDVariant(PFL_STRUTTRICLAS_CODICE)), true))
      {
        if (FieldWasModified.booleanValue())
        {
          IDVariant v_ICODICE = null;
          v_ICODICE = (new IDVariant());
          IDVariant v_VSCHERICLFOR = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.FORMATO as SCHERICLFORM ");
          SQL.append("from ");
          SQL.append("  SCHEMA_RICLASSIFICAZIONE A ");
          SQL.append("where (A.SCHEMA_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSCRIID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VSCHERICLFOR = QV.Get("SCHERICLFORM", IDVariant.INTEGER) ;
          }
          QV.Close();
          v_ICODICE = new IDVariant(IDL.ToFloat(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCODPAD, 0)), IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_VALORE, 0)), v_VSCHERICLFOR, (new IDVariant("0")), true))),IDVariant.INTEGER);
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(v_ICODICE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CODICE_PADRE = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCODPAD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGTIRIID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1) ");
          SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.compareTo((new IDVariant(0)), true)!=0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant(" già presente"));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_STRUTTRICLAS.Header(Glb.OBJ_FIELD,PFL_STRUTTRICLAS_CODICE))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_VALORE, 0))), S)); 
            IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_VALORE, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "StrutturaRiclassificazioneOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Struttura Riclassificazione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STRUTTRICLAS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STRUTTRICLAS);
      // 
      // Struttura Riclassificazione On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(PAN_STRUTTRICLAS.IsNewRow()))
      {
        PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "StrutturaRiclassificazioneOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Struttura Riclassificazione After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_STRUTTRICLAS_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Struttura Riclassificazione After Find Body
      // Corpo Procedura
      // 
      IDVariant v_CODICE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as TIPIRICLCODI ");
      SQL.append("from ");
      SQL.append("  TIPI_RICLASSIFICAZIONE A ");
      SQL.append("where (A.TIPO_RICL_ID = NVL(" + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_TIPO_RICL_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGTIRIID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICE = QV.Get("TIPIRICLCODI", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_LIV = new IDVariant(0,IDVariant.INTEGER);
      if (!(IDL.IsNull(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0))))
      {
        v_LIV = IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0);
      }
      else
      {
        v_LIV = IDL.Add(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), (new IDVariant(1)));
      }
      if ((IDL.NullValue(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_E_S, 0),IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0)).equals((new IDVariant("S")), true)) && (((IDL.NullValue(IMDB.Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_LIVELLO, 0),IDL.Add(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), (new IDVariant(1)))).equals((new IDVariant(2)), true)) && (v_CODICE.equals((new IDVariant("MACRO_5")), true))) || (v_CODICE.equals((new IDVariant("MACRO")), true))))
      {
        PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // if ((v_CODICE.equals((new IDVariant("MACRO")), true) || v_CODICE.equals((new IDVariant("MACRO_5")), true)) && v_LIV.compareTo((new IDVariant(2)), true)>=0 && (IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0).equals((new IDVariant("S")), true) || (IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0).equals((new IDVariant("E")), true) && IDL.NullValue(MainFrm.MODAIMPUENTR,(new IDVariant("ZZ"))).compareTo((new IDVariant("AC")), true)!=0)))
      // {
        // PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // }
      // else
      // {
        // PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "StrutturaRiclassificazioneAfterFind", _e);
    }
  }

  // **********************************************************************
  // Struttura Riclassificazione After Delete
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_STRUTTRICLAS_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Struttura Riclassificazione After Delete Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "StrutturaRiclassificazioneAfterDelete", _e);
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
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Struttura Riclassificazione"));
      PAN_STRUTTRICLAS.set_Header(Glb.OBJ_FIELD,PFL_STRUTTRICLAS_CODICE, IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGDESCAP, 0).stringValue());
      set_Caption(new IDVariant(v_CAPTION));
      PAN_STRUTTRICLAS.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STRUTTRICLAS.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_STRUTTRICLAS.set_FieldText(PFL_STRUTTRICLAS_LABELINFO, IDL.Add((IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0).equals((new IDVariant("E")))? new IDVariant("Entrata") : IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0).equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant()), ((IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0).compareTo((new IDVariant(0)), true)!=0)?IDL.Add((new IDVariant(" - ")), IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOOGDELIPELA, 0)):(new IDVariant("")))).stringValue());
      if (!(IDL.IsNull(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0))) && IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0).equals((new IDVariant(1)), true))
      {
        PAN_STRUTTRICLAS.set_FieldText(PFL_STRUTTRICLAS_LABELINFO, (IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0).equals((new IDVariant("E")))? new IDVariant("Entrata") : IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0).equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant()).stringValue());
      }
      IDVariant v_LIV = new IDVariant(0,IDVariant.INTEGER);
      if (!(IDL.IsNull(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0))))
      {
        v_LIV = IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0);
      }
      else
      {
        v_LIV = IDL.Add(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), (new IDVariant(1)));
      }
      IDVariant v_STRRICIDDPAS = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_PADRECONIMPA = new IDVariant(0,IDVariant.INTEGER);
      // 
      // primo caso nuova riga
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0)))
      {
        IDVariant v_VSTRUTTID = null;
        v_VSTRUTTID = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.STRUTTURA_RICL_ID as STRRICSTRIID ");
        SQL.append("from ");
        SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
        SQL.append("where (A.TIPO_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGTIRIID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCODPAD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VSTRUTTID = QV.Get("STRRICSTRIID", IDVariant.DECIMAL) ;
        }
        QV.Close();
        v_STRRICIDDPAS = new IDVariant(new IDVariant(v_VSTRUTTID),IDVariant.INTEGER);
      }
      else
      {
        v_STRRICIDDPAS = IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0);
      }
      IDVariant v_INTPADREIMPA = null;
      v_INTPADREIMPA = new IDVariant(MainFrm.PadreIVOVLivelloRiclassificazioneConImpeco(v_STRRICIDDPAS, IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0)),IDVariant.DECIMAL);
      IDVariant v_CAPTSEPADIMP = new IDVariant(0,IDVariant.STRING);
      if (!(IDL.IsNull(v_INTPADREIMPA)) && v_INTPADREIMPA.compareTo(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0),(new IDVariant(-1))), true)!=0)
      {
        v_PADRECONIMPA = (new IDVariant(-1));
        IDVariant v_VCODICE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_VDESCRIZIONE = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as STRURICLCODI, ");
        SQL.append("  A.DESCRIZIONE as STRURICLDESC ");
        SQL.append("from ");
        SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
        SQL.append("where (A.STRUTTURA_RICL_ID = " + IDL.CSql(v_INTPADREIMPA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCODICE = QV.Get("STRURICLCODI", IDVariant.INTEGER) ;
          v_VDESCRIZIONE = QV.Get("STRURICLDESC", IDVariant.STRING) ;
        }
        QV.Close();
        v_CAPTSEPADIMP = IDL.Add(IDL.Add(IDL.ToString(v_VCODICE), (new IDVariant(" - "))), v_VDESCRIZIONE);
      }
      else
      {
        v_PADRECONIMPA = (new IDVariant(0));
      }
      IDVariant v_VCODICERICL = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as TIPIRICLCODI ");
      SQL.append("from ");
      SQL.append("  TIPI_RICLASSIFICAZIONE A ");
      SQL.append("where (A.TIPO_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGTIRIID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCODICERICL = QV.Get("TIPIRICLCODI", IDVariant.STRING) ;
      }
      QV.Close();
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(0)), true)>0 && v_LIV.compareTo((new IDVariant(2)), true)>=0 && (IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0).equals((new IDVariant("S")), true) || (IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0).equals((new IDVariant("E")), true) && IDL.NullValue(MainFrm.MODAIMPUENTR,(new IDVariant("ZZ"))).compareTo((new IDVariant("AC")), true)!=0)) && (v_VCODICERICL.equals((new IDVariant("MACRO")), true) || v_VCODICERICL.equals((new IDVariant("MACRO_5")), true)))
      {
        IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);
        // 
        // caption
        // 
        {
          if (IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Imp. Economica su Accertamento"));
            v_CAPTION1 = new IDVariant(S);
          }
          else
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Imp. Economica su Impegno"));
            v_CAPTION1 = new IDVariant(S);
          }
        }
        if (!(v_PADRECONIMPA.booleanValue()))
        {
          PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STRUTTRICLAS.set_Header(Glb.OBJ_FIELD,PFL_STRUTTRICLAS_IMPECOIMPACC, new IDVariant(v_CAPTION1).stringValue());
        }
        else
        {
          PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Imputazione economica su "));
          PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STRUTTRICLAS.set_Header(Glb.OBJ_FIELD,PFL_STRUTTRICLAS_SIFAKE, IDL.Add(IDL.Add(IDL.Add(v_CAPTION1, (new IDVariant(" ("))), v_CAPTSEPADIMP), (new IDVariant(")"))).stringValue());
        }
      }
      else
      {
        PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, (((IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCONVIS, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)).booleanValue():(new IDVariant(0)).booleanValue()))? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_STRUTTRICLAS.SetFlags (Glb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, (((IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCONVIS, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)).booleanValue():(new IDVariant(0)).booleanValue()))? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "Load", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0, (new IDVariant()));
      // ((StrutturaRiclassificazione)MainFrm.GetForm(MyGlb.FRM_STRUTTRICLAS,0)).TRE_STRUTTRICLAS.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
      ((StrutturaRiclassificazione)MainFrm.GetForm(MyGlb.FRM_STRUTTRICLAS,0,true,this)).Refresha();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "Unload", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCEFATCOPAAT)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_STRUTTRICLAS, IMDBDef8.PQSL_STRUTTRICLAS_CONTROPARTITA, 0, IMDB.Value(IMDBDef8.PQRY_FATTORI7, IMDBDef8.PQSL_FATTORI7_FATTORE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Scelta Contropartita
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaContropartita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Contropartita Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI504, IMDBDef1.FLD_PARAMETRI504_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI504, IMDBDef1.FLD_PARAMETRI504_ROWNAMEES, 0, IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0));
      MainFrm.Show(MyGlb.FRM_SCEFATCOPAAT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaRiclassificazione", "SceltaContropartita", _e);
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
  private void PAN_STRUTTRICLAS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STRUTTRICLAS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STRUTTRICLAS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STRUTTRICLAS, Cancel);
    // Stub
  }

  private void PAN_STRUTTRICLAS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_STRUTTRICLAS_CONTROPARTIT)
    {
      this.IdxPanelActived = this.PAN_STRUTTRICLAS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaContropartita();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_STRUTTRICLAS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_STRUTTRICLAS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_STRUTTRICLAS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STRUTTRICLAS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STRUTTRICLAS_Init()
  {

    PAN_STRUTTRICLAS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STRUTTRICLAS.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, "803D6CC2-C808-4C51-9CFE-AB1F9C55D348");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, "Inserimento");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, MyGlb.PANEL_LIST, 0, -9999, 128, 16, 0, 0);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, MyGlb.PANEL_FORM, 128, 307, 252, 49, 0, 0);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, 0, 70);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, 1, 13);
    PAN_STRUTTRICLAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, 0, 4);
    PAN_STRUTTRICLAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, 1, 4);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, "817397DE-A076-42CE-B4EF-83250CFA9B39");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, "Aggiornamento");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, -9999, 124, 16, 0, 0);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, MyGlb.PANEL_FORM, 424, 307, 256, 49, 0, 0);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, 0, 88);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, 1, 13);
    PAN_STRUTTRICLAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, 0, 4);
    PAN_STRUTTRICLAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, 1, 4);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_GROUP, GRP_STRUTTRICLAS_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_STRUTTRICLAS.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, "8EBFC8B3-7F43-464F-8BCB-95440CF353D6");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, "STRUTTURA RICL ID");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, "A979BE8B-6F36-4BCF-8DF5-B4FD697A9A2D");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, "TIPO RICL ID");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, MyGlb.VIS_NONNULLAFIEL);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, 0, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, "7EFE3527-FE25-4F27-8714-0E6BDE7D30B6");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, "SCHEMA RICL ID");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, MyGlb.VIS_NONNULLAFIEL);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, 0, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, "81B5A348-CA35-4854-A0EA-F88F993A4EF4");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, MyGlb.VIS_ETICHEGRASSE);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, "EF2D3E8A-0585-48DD-A34E-9C6DA6CA1B0C");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, "CODICE");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, "AD1FD7F7-3971-4D97-A3AC-26D45567C426");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, "Descrizione");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, "1D982659-8184-4C2A-8D54-878DB7C402D5");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, "Capitoli collegabili");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, MyGlb.VIS_CHECKSTYLE);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, "735900B2-26B9-464B-851B-D064E657DF19");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, "Imp. Economica su Accertamento");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, MyGlb.VIS_CHECKSTYLE);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, "A212648A-A053-4D7A-8F5E-D3A2E5782101");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, "Imp. Economica su Accertamento");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, MyGlb.VIS_CHECKSTYLE);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, "476115FA-A593-4DC7-B62F-6BEE9EC05C2B");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, "Contropartita");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, MyGlb.VIS_NORMALFIELDS);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, "62AC1227-F761-4F8A-89D9-FBF743EB51EC");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, "38C07731-2AA8-42DB-AB4F-6001A5E60500");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, "E S");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, 0, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, "4E3C7D6B-6C3F-4F1D-918A-1A4C9D4B2948");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, "LIVELLO");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, 0, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, "FBB27001-86F4-44C3-83E2-389F3453F642");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, "CODICE PADRE");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, MyGlb.VIS_NONNULLAFIEL);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, 0, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, "2E2F32AF-063D-4F3F-95D1-FB78A6414E6C");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, "Utente");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, "804B615E-B801-4819-B74C-6BAC96BEA3C1");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, "Data");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, "DACA820B-FB47-4D2B-806D-CD4046E72505");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, "Utente ");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, "56D2C4E0-C177-498F-965E-0D320C083F5C");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, "Data ");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, "8720F124-CBFC-47FB-BBB7-CF8F8E10D208");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, "CODICE 1");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, MyGlb.VIS_NONNULLAFIEL);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, 0, -1);
    PAN_STRUTTRICLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, "F7984E9F-048E-48AF-828C-D36E685E816A");
    PAN_STRUTTRICLAS.set_Header(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, "Esclusione Controllo Dodicesimi");
    PAN_STRUTTRICLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, "");
    PAN_STRUTTRICLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, MyGlb.VIS_CHECKSTYLE);
    PAN_STRUTTRICLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_STRUTTRICLAS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, MyGlb.PANEL_LIST, 124);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, MyGlb.PANEL_LIST, "STRUTTURA RICL ID");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, MyGlb.PANEL_FORM, 4, 4, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, MyGlb.PANEL_FORM, 124);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_STRUTTRICLID, MyGlb.PANEL_FORM, "STRUTTURA RICL ID");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_STRUTTRICLID, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_STRUTTRICLID, PPQRY_STRUTTRICLAS, "A.STRUTTURA_RICL_ID", "STRUTTURA_RICL_ID", 3, 10, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, MyGlb.PANEL_LIST, 124, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, MyGlb.PANEL_LIST, 80);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, MyGlb.PANEL_LIST, "TIPO RICL ID");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, MyGlb.PANEL_FORM, 80);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_TIPORICLID, MyGlb.PANEL_FORM, "TIPO RICL ID");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_TIPORICLID, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_TIPORICLID, PPQRY_STRUTTRICLAS, "A.TIPO_RICL_ID", "TIPO_RICL_ID", 3, 10, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, MyGlb.PANEL_LIST, 204, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, MyGlb.PANEL_LIST, 100);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, MyGlb.PANEL_LIST, "SCHEMA RICL ID");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, MyGlb.PANEL_FORM, 4, 52, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, MyGlb.PANEL_FORM, 100);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SCHEMARICLID, MyGlb.PANEL_FORM, "SCHEMA RICL ID");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_SCHEMARICLID, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_SCHEMARICLID, PPQRY_STRUTTRICLAS, "A.SCHEMA_RICL_ID", "SCHEMA_RICL_ID", 3, 10, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, MyGlb.PANEL_LIST, 8, 8, 584, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, MyGlb.PANEL_LIST, 0);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, MyGlb.PANEL_LIST, 2);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, MyGlb.PANEL_FORM, 24, 8, 732, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, MyGlb.PANEL_FORM, 0);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LABELINFO, MyGlb.PANEL_FORM, 2);
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_LABELINFO, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_LABELINFO, -1, "", "LABELINFO", 0, 0, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, MyGlb.PANEL_FORM, 60, 56, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, MyGlb.PANEL_FORM, 136);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_CODICE, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_CODICE, PPQRY_STRUTTRICLAS, "A.VALORE", "VALORE", 1, 5, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, MyGlb.PANEL_FORM, 112, 80, 512, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_DESCRIZIONE, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_DESCRIZIONE, PPQRY_STRUTTRICLAS, "A.DESCRIZIONE", "DESCRIZIONE", 5, 300, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, MyGlb.PANEL_LIST, 80);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, MyGlb.PANEL_LIST, "Capitoli collegabili");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, MyGlb.PANEL_FORM, 480, 140, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, MyGlb.PANEL_FORM, 120);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CAPITOCOLLEG, MyGlb.PANEL_FORM, "Capitoli collegabili");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_CAPITOCOLLEG, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_CAPITOCOLLEG, PPQRY_STRUTTRICLAS, "A.SE_CAPITOLI", "SE_CAPITOLI", 5, 2, 0, -13997);
    PAN_STRUTTRICLAS.SetValueListItem(PFL_STRUTTRICLAS_CAPITOCOLLEG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STRUTTRICLAS.SetValueListItem(PFL_STRUTTRICLAS_CAPITOCOLLEG, (new IDVariant()), "Null", "", "", -1);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, MyGlb.PANEL_LIST, 48);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, MyGlb.PANEL_LIST, "I. Ecn. s. Acc.");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, MyGlb.PANEL_FORM, 104, 188, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, MyGlb.PANEL_FORM, 496);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_SIFAKE, MyGlb.PANEL_FORM, "Imp. Economica su Accertamento");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_SIFAKE, -1, -1);
    PAN_STRUTTRICLAS.SetFieldUnbound(PFL_STRUTTRICLAS_SIFAKE, true);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_SIFAKE, PPQRY_STRUTTRICLAS, "'SI'", "SIFAKE", 5, 2, 0, -13997);
    PAN_STRUTTRICLAS.SetValueListItem(PFL_STRUTTRICLAS_SIFAKE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STRUTTRICLAS.SetValueListItem(PFL_STRUTTRICLAS_SIFAKE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, MyGlb.PANEL_LIST, 104);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, MyGlb.PANEL_LIST, "Imp. Economica su Accertamento");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, MyGlb.PANEL_FORM, 400, 188, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, MyGlb.PANEL_FORM, 200);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_IMPECOIMPACC, MyGlb.PANEL_FORM, "Imp. Economica su Accertamento");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_IMPECOIMPACC, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_IMPECOIMPACC, PPQRY_STRUTTRICLAS, "A.IMP_ECO_IMPACC", "IMP_ECO_IMPACC", 5, 2, 0, -13997);
    PAN_STRUTTRICLAS.SetValueListItem(PFL_STRUTTRICLAS_IMPECOIMPACC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STRUTTRICLAS.SetValueListItem(PFL_STRUTTRICLAS_IMPECOIMPACC, (new IDVariant()), "Null", "", "", -1);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, MyGlb.PANEL_LIST, 104);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, MyGlb.PANEL_LIST, "Contropartita");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, MyGlb.PANEL_FORM, 104, 236, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, MyGlb.PANEL_FORM, 92);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CONTROPARTIT, MyGlb.PANEL_FORM, "Contropartita");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_CONTROPARTIT, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_CONTROPARTIT, PPQRY_STRUTTRICLAS, "A.CONTROPARTITA", "CONTROPARTITA", 5, 16, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, MyGlb.PANEL_LIST, 136);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, MyGlb.PANEL_FORM, 324, 236, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, MyGlb.PANEL_FORM, 136);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_FATTORDESCRI, MyGlb.PANEL_FORM, "FATTORI DESCRIZIONE");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_FATTORDESCRI, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, MyGlb.PANEL_LIST, 24);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, MyGlb.PANEL_LIST, "E S");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, MyGlb.PANEL_FORM, 4, 48, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, MyGlb.PANEL_FORM, 24);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ES, MyGlb.PANEL_FORM, "E S");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_ES, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_ES, PPQRY_STRUTTRICLAS, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, MyGlb.PANEL_LIST, 52);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, MyGlb.PANEL_LIST, "LIVELLO");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, MyGlb.PANEL_FORM, 4, 72, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, MyGlb.PANEL_FORM, 52);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_LIVELLO, MyGlb.PANEL_FORM, "LIVELLO");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_LIVELLO, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_LIVELLO, PPQRY_STRUTTRICLAS, "A.LIVELLO", "LIVELLO", 1, 2, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, MyGlb.PANEL_LIST, 92);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, MyGlb.PANEL_LIST, "CODICE PADRE");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, MyGlb.PANEL_FORM, 4, 216, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, MyGlb.PANEL_FORM, 92);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICEPADRE, MyGlb.PANEL_FORM, "CODICE PADRE");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_CODICEPADRE, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_CODICEPADRE, PPQRY_STRUTTRICLAS, "A.CODICE_PADRE", "CODICE_PADRE", 3, 10, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, MyGlb.PANEL_LIST, 128);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, MyGlb.PANEL_FORM, 132, 332, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, MyGlb.PANEL_FORM, 48);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_UTENTE1, -1, GRP_STRUTTRICLAS_INSERIMENTO);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_UTENTE1, PPQRY_STRUTTRICLAS, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, MyGlb.PANEL_LIST, 120);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, MyGlb.PANEL_FORM, 272, 332, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, MyGlb.PANEL_FORM, 36);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_DATA1, -1, GRP_STRUTTRICLAS_INSERIMENTO);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_DATA1, PPQRY_STRUTTRICLAS, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, MyGlb.PANEL_LIST, 124);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, MyGlb.PANEL_LIST, "Utente ");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, MyGlb.PANEL_FORM, 428, 332, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, MyGlb.PANEL_FORM, 48);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_UTENTE, MyGlb.PANEL_FORM, "Utente ");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_UTENTE, -1, GRP_STRUTTRICLAS_AGGIORNAMENT);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_UTENTE, PPQRY_STRUTTRICLAS, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, MyGlb.PANEL_LIST, 116);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, MyGlb.PANEL_LIST, "Data ");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, MyGlb.PANEL_FORM, 572, 332, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, MyGlb.PANEL_FORM, 36);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_DATA, MyGlb.PANEL_FORM, "Data ");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_DATA, -1, GRP_STRUTTRICLAS_AGGIORNAMENT);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_DATA, PPQRY_STRUTTRICLAS, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, MyGlb.PANEL_LIST, 52);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, MyGlb.PANEL_LIST, "CODICE 1");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, MyGlb.PANEL_FORM, 4, 244, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, MyGlb.PANEL_FORM, 52);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_CODICE1, MyGlb.PANEL_FORM, "COD. 1");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_CODICE1, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_CODICE1, PPQRY_STRUTTRICLAS, "A.CODICE", "CODICE", 1, 10, 0, -13997);
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, MyGlb.PANEL_LIST, 92);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, MyGlb.PANEL_LIST, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, MyGlb.PANEL_LIST, "Esclus. Contr. Dodicesimi");
    PAN_STRUTTRICLAS.SetRect(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, MyGlb.PANEL_FORM, 360, 164, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STRUTTRICLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, MyGlb.PANEL_FORM, 240);
    PAN_STRUTTRICLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, MyGlb.PANEL_FORM, 1);
    PAN_STRUTTRICLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STRUTTRICLAS_ESCLCONTDODI, MyGlb.PANEL_FORM, "Esclusione Controllo Dodicesimi");
    PAN_STRUTTRICLAS.SetFieldPage(PFL_STRUTTRICLAS_ESCLCONTDODI, -1, -1);
    PAN_STRUTTRICLAS.SetFieldPanel(PFL_STRUTTRICLAS_ESCLCONTDODI, PPQRY_STRUTTRICLAS, "A.ESCLUSIONE_12", "ESCLUSIONE_12", 5, 2, 0, -13997);
    PAN_STRUTTRICLAS.SetValueListItem(PFL_STRUTTRICLAS_ESCLCONTDODI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STRUTTRICLAS.SetValueListItem(PFL_STRUTTRICLAS_ESCLCONTDODI, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_STRUTTRICLAS_InitQueries()
  {
    StringBuffer SQL;

    PAN_STRUTTRICLAS.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~CONTROPARTITA~~) ");
    PAN_STRUTTRICLAS.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_STRUTTRICLAS.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STRUTTRICLAS.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_STRUTTRICLAS.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_STRUTTRICLAS_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_STRUTTRICLAS.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_STRUTTRICLAS_UTENTE1, "");
    PAN_STRUTTRICLAS.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_STRUTTRICLAS.SetQuery(PPQRY_DUAL, 0, SQL, PFL_STRUTTRICLAS_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_STRUTTRICLAS.SetQuery(PPQRY_DUAL, 1, SQL, PFL_STRUTTRICLAS_UTENTE, "");
    PAN_STRUTTRICLAS.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STRUTTRICLAS.SetIMDB(IMDB, "PQRY_STRUTTRICLAS", true);
    PAN_STRUTTRICLAS.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.STRUTTURA_RICL_ID as STRUTTURA_RICL_ID, ");
    SQL.append("  A.TIPO_RICL_ID as TIPO_RICL_ID, ");
    SQL.append("  A.SCHEMA_RICL_ID as SCHEMA_RICL_ID, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.LIVELLO as LIVELLO, ");
    SQL.append("  A.SE_CAPITOLI as SE_CAPITOLI, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.CODICE_PADRE as CODICE_PADRE, ");
    SQL.append("  A.VALORE as VALORE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.CONTROPARTITA as CONTROPARTITA, ");
    SQL.append("  A.IMP_ECO_IMPACC as IMP_ECO_IMPACC, ");
    SQL.append("  'SI' as SIFAKE, ");
    SQL.append("  A.ESCLUSIONE_12 as ESCLUSIONE_12 ");
    PAN_STRUTTRICLAS.SetQuery(PPQRY_STRUTTRICLAS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
    PAN_STRUTTRICLAS.SetQuery(PPQRY_STRUTTRICLAS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.STRUTTURA_RICL_ID = ~~TBL_IN13.NOMOGGSTRIID~~) ");
    SQL.append("and   (A.E_S = ~~TBL_IN13.NOMEOGGETTES~~) ");
    PAN_STRUTTRICLAS.SetQuery(PPQRY_STRUTTRICLAS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STRUTTRICLAS.SetQuery(PPQRY_STRUTTRICLAS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STRUTTRICLAS.SetQuery(PPQRY_STRUTTRICLAS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STRUTTRICLAS.SetQuery(PPQRY_STRUTTRICLAS, 5, SQL, -1, "");
    PAN_STRUTTRICLAS.SetQueryDB(PPQRY_STRUTTRICLAS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STRUTTRICLAS.SetMasterTable(0, "STRUTTURA_RICLASSIFICAZIONE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STRUTTRICLAS.Status() == 2)
    {
      int oldListQBE = PAN_STRUTTRICLAS.iUseListQBE;
      PAN_STRUTTRICLAS.iUseListQBE = 0;
      PAN_STRUTTRICLAS.PanelCommand(Glb.PCM_SEARCH);
      PAN_STRUTTRICLAS.PanelCommand(Glb.PCM_FIND);
      PAN_STRUTTRICLAS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_STRUTTRICLAS) PAN_STRUTTRICLAS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
