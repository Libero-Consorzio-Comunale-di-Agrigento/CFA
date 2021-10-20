// **********************************************
// Finanziamenti Subimp
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FinanziamentiSubimp extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FINANZIAMENT_CODICEFINAZI = 0;
  private static int PFL_FINANZIAMENT_DESCRIFINANZ = 1;
  private static int PFL_FINANZIAMENT_INFO = 2;
  private static int PFL_FINANZIAMENT_IMPORTO = 3;
  private static int PFL_FINANZIAMENT_LABELFINANZI = 4;
  private static int PFL_FINANZIAMENT_ANNOIMP = 5;
  private static int PFL_FINANZIAMENT_NUMEROIMP = 6;
  private static int PFL_FINANZIAMENT_IMPOTOTAFINA = 7;
  private static int PFL_FINANZIAMENT_CONFERMA = 8;
  private static int PFL_FINANZIAMENT_ANNULLA = 9;

  private static int PPQRY_IMPFIN3 = 0;

  private static int PPQRY_FINANZIAMENT = 1;


  IDPanel PAN_FINANZIAMENT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI81(IMDB);
    Init_TBL_FINANZIAME13(IMDB);
    //
    //
    Init_PQRY_IMPFIN3(IMDB);
    Init_PQRY_IMPFIN3_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI81(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI81, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI81, "TBL_PARAMETRI81");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI81,IMDBDef4.FLD_PARAMETRI81_ROWNAMANNSUB, "ROWNAMANNSUB");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI81,IMDBDef4.FLD_PARAMETRI81_ROWNAMANNSUB,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI81,IMDBDef4.FLD_PARAMETRI81_ROWNAMNUMSUB, "ROWNAMNUMSUB");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI81,IMDBDef4.FLD_PARAMETRI81_ROWNAMNUMSUB,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI81,IMDBDef4.FLD_PARAMETRI81_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI81,IMDBDef4.FLD_PARAMETRI81_ROWNAMANNIMP,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI81,IMDBDef4.FLD_PARAMETRI81_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI81,IMDBDef4.FLD_PARAMETRI81_ROWNAMNUMIMP,1,49,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI81, 0);
  }

  private static void Init_TBL_FINANZIAME13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_FINANZIAME13, 8);
    IMDB.set_TblCode(IMDBDef4.TBL_FINANZIAME13, "TBL_FINANZIAME13");
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAME13,IMDBDef4.FLD_FINANZIAME13_IMPORTO,3,14,2);
  }

  private static void Init_PQRY_IMPFIN3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_IMPFIN3, 9);
    IMDB.set_TblCode(IMDBDef13.PQRY_IMPFIN3, "PQRY_IMPFIN3");
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_IMPFININFO, "IMPFININFO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3,IMDBDef13.PQSL_IMPFIN3_IMPFININFO,5,1,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_IMPFIN3, 0);
  }

  private static void Init_PQRY_IMPFIN3_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_IMPFIN3_RS, 9);
    IMDB.set_TblCode(IMDBDef13.PQRY_IMPFIN3_RS, "PQRY_IMPFIN3_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_IMPFININFO, "IMPFININFO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN3_RS,IMDBDef13.PQSL_IMPFIN3_IMPFININFO,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FinanziamentiSubimp(MyWebEntryPoint w, IMDBObj imdb)
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
  public FinanziamentiSubimp()
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
    FormIdx = MyGlb.FRM_FINANZSUBIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "772ABD88-1F3C-40D5-A06E-EAFD95C3F014";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 712;
    DesignHeight = 498;
    set_Caption(new IDVariant("Finanziamenti Subimp"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 712;
    Frames[1].Height = 472;
    Frames[1].Caption = "Finanziamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 472;
    PAN_FINANZIAMENT = new IDPanel(w, this, 1, "PAN_FINANZIAMENT");
    Frames[1].Content = PAN_FINANZIAMENT;
    PAN_FINANZIAMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZIAMENT.VS = MainFrm.VisualStyleList;
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 472-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3388621B-9271-478B-9E26-C0DB3427A053");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 648, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FINANZIAMENT.InitStatus = 2;
    PAN_FINANZIAMENT_Init();
    PAN_FINANZIAMENT_InitFields();
    PAN_FINANZIAMENT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_FINANZIAME13, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FINANZSUBIMP_IMPFIN3();
      }
      PAN_FINANZIAMENT.UpdatePanel(MainFrm);
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
    return (obj instanceof FinanziamentiSubimp);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FinanziamentiSubimp.class.getName() : (Glb.ClassWithPackage(FinanziamentiSubimp.class) ? FinanziamentiSubimp.class.getName().substring(FinanziamentiSubimp.class.getPackage().getName().length() + 1) : FinanziamentiSubimp.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Finanziamenti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      RiempiSubimpfin();
      PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSubimp", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Riempi Subimpfin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int RiempiSubimpfin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Riempi Subimpfin Body
      // Procedure Body
      // 
      RIEMPISUBIMP_FINADELEROWS();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.IMPORTO as IMPFINIMPORT, ");
      SQL.append("  A.FINANZIAMENTO as IMPFINFINANZ ");
      SQL.append("from ");
      SQL.append("  IMP_FIN A ");
      SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMNUMIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        IDVariant v_IMPORTO1 = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTO2 = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTOSUBFI = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_PERCENT = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.IMPORTO as IMPIMPORTO, ");
        SQL.append("  A.CAPITOLO as IMPCAPITOLO, ");
        SQL.append("  A.ARTICOLO as IMPARTICOLO ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMNUMIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTO1 = QV.Get("IMPIMPORTO", IDVariant.DECIMAL) ;
          v_CAPITOLO = QV.Get("IMPCAPITOLO", IDVariant.DECIMAL) ;
          v_ARTICOLO = QV.Get("IMPARTICOLO", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.IMPORTO as VARIMPVARIMP ");
        SQL.append("from ");
        SQL.append("  VARIMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMNUMIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(C2.Get("IMPFINFINANZ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTO2 = QV.Get("VARIMPVARIMP", IDVariant.DECIMAL) ;
        }
        QV.Close();
        v_IMPORTOSUBFI = IDL.Add(C2.Get("IMPFINIMPORT"), v_IMPORTO2);
        v_PERCENT = IDL.Div((IDL.Mul(v_IMPORTOSUBFI, (new IDVariant(100)))), v_IMPORTO1);
        v_IMPORTO = IDL.Div((IDL.Mul(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_SUBIMP6, IMDBDef13.PQSL_SUBIMP6_IMPORTO, 0),(new IDVariant(0))), v_PERCENT)), (new IDVariant(100)));
        RIEMPISUBIMP_FINAINSEVALU(C2.Get("IMPFINFINANZ"), v_CAPITOLO, v_ARTICOLO, v_IMPORTO);
        C2.MoveNext();
      }
      C2.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSubimp", "RiempiSubimpfin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPISUBIMP_FINADELEROWS() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef4.TBL_FINANZIAME13);
  }

  // **********************************************************************
  // Finanziamenti: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void RIEMPISUBIMP_FINAINSEVALU(IDVariant C2_IMPFINFINANZ, IDVariant v_CAPITOLO, IDVariant v_ARTICOLO, IDVariant v_IMPORTO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef4.TBL_FINANZIAME13, 0);
    IMDB.set_Value(IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_FINANZIAMENTO, 0, C2_IMPFINFINANZ);
    IMDB.set_Value(IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_ANNO_IMP, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMANNIMP, 0));
    IMDB.set_Value(IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_NUMERO_IMP, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMNUMIMP, 0));
    IMDB.set_Value(IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_CAPITOLO, 0, v_CAPITOLO);
    IMDB.set_Value(IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_ARTICOLO, 0, v_ARTICOLO);
    IMDB.set_Value(IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_IMPORTO, 0, v_IMPORTO);
    IMDB.set_Value(IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMANNSUB, 0));
    IMDB.set_Value(IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI81, IMDBDef4.FLD_PARAMETRI81_ROWNAMNUMSUB, 0));
  }

  // **********************************************************************
  // Finanziamenti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti After Find Event Body
      // Procedure Body
      // 
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_IMPOTOTAFINA, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_IMPORTO)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSubimp", "FinanziamentiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FINANZIAMENT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FINANZIAMENT);
      // 
      // Finanziamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_FINANZIAMENT.IsNewRow()))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_DESCRIFINANZ,(new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_DESCRIFINANZ))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSubimp", "FinanziamentiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti Importo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FINANZIAMENT_IMPORTO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti Importo Validate Event Body
      // Procedure Body
      // 
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_IMPOTOTAFINA, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_IMPORTO)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSubimp", "FinanziamentiImportoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Cmdconferma
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Cmdconferma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CANCEL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONFERMA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Cmdconferma Body
      // Procedure Body
      // 
      v_CANCEL = (new IDVariant(0));
      if (PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_IMPORTO).compareTo(IMDB.Value(IMDBDef13.PQRY_SUBIMP6, IMDBDef13.PQSL_SUBIMP6_IMPORTO, 0), true)<0)
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant("Totale Finanziamenti inferiore all'importo definitivo del sub-impegno. Si vuole registrare ugualmente?", IDVariant.STRING));
        v_CONFERMA = (new IDVariant(MainFrm.MessageConfirm(v_MESSAGGIO)));
        if (!(v_CONFERMA.booleanValue()))
        {
          v_CANCEL = (new IDVariant(-1));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR2, IMDBDef4.FLD_PARAMETRVAR2_ROWNAMESALVA, 0, (new IDVariant(1)));
          ((SubImpegno)MainFrm.GetForm(MyGlb.FRM_SUBIMPEGNO,0,true,this)).SalvaTuttoConFinanziamentiDellImpegno();
        }
      }
      else
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant("Finanziamenti superiori all'importo del sub-impegno", IDVariant.STRING));
        if (PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_IMPORTO).compareTo(IMDB.Value(IMDBDef13.PQRY_SUBIMP6, IMDBDef13.PQSL_SUBIMP6_IMPORTO, 0), true)>0)
        {
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          return 0;
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR2, IMDBDef4.FLD_PARAMETRVAR2_ROWNAMESALVA, 0, (new IDVariant(1)));
          ((SubImpegno)MainFrm.GetForm(MyGlb.FRM_SUBIMPEGNO,0,true,this)).SalvaTuttoConFinanziamentiDellImpegno();
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSubimp", "Cmdconferma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSubimp", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Finanziamento
  // **********************************************************************
  public int ApriInfoFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Finanziamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef13.PQRY_IMPFIN3, IMDBDef13.PQSL_IMPFIN3_FINANZIAMENTO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiSubimp", "ApriInfoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMP FIN
  // Primary record source for panel data
  // **********************************************************************
  private void FINANZSUBIMP_IMPFIN3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_IMPFIN3_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_FINANZIAME13, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_FINANZIAME13, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_IMPFIN3_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_IMPFIN3_RS, 0, IMDBDef4.TBL_FINANZIAME13, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_IMPFIN3_RS, 0, 0, IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_ANNO_IMP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_IMPFIN3_RS, 1, 0, IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_NUMERO_IMP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_IMPFIN3_RS, 2, 0, IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_FINANZIAMENTO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_IMPFIN3_RS, 3, 0, IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_IMPFIN3_RS, 4, 0, IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_IMPFIN3_RS, 5, 0, IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_IMPFIN3_RS, 6, 0, IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_ANNO_SUBIMP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_IMPFIN3_RS, 7, 0, IMDBDef4.TBL_FINANZIAME13, IMDBDef4.FLD_FINANZIAME13_NUMERO_SUBIMP, 0);
      IMDB.set_Value(IMDBDef13.PQRY_IMPFIN3_RS, 8, 0, (new IDVariant("S")));
      IMDB.TblMoveNext(IMDBDef4.TBL_FINANZIAME13, 0);
      if (IMDB.Eof(IMDBDef4.TBL_FINANZIAME13, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_FINANZIAME13, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef13.PQRY_IMPFIN3_RS);
    IMDB.TblSortBy(IMDBDef13.PQRY_IMPFIN3_RS,2,true);
    IMDB.TblStartSort(IMDBDef13.PQRY_IMPFIN3_RS);
    IMDB.TblMoveFirst(IMDBDef13.PQRY_IMPFIN3_RS, 0);
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
  private void PAN_FINANZIAMENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FINANZIAMENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FINANZIAMENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FINANZIAMENT, Cancel);
    // Stub
  }

  private void PAN_FINANZIAMENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FINANZIAMENT_INFO)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_CONFERMA)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Cmdconferma();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FINANZIAMENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FINANZIAMENT_IMPORTO)
      {
        PFL_FINANZIAMENT_IMPORTO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_FINANZIAMENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FINANZIAMENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FINANZIAMENT_Init()
  {

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, "A3D6DAA7-79A2-4EE8-A1E6-7F5BB0EB6A17");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, "Codice Finaziamento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, "Codice Finaziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, "E33300EC-0CB6-452C-A9E0-A277D48A0183");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISDESCR, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, "C68E5FE1-DB13-4DD6-BDCE-A3D44D05599C");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, "Info");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, "Informazioni Finanziamenti");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "77F2B8AE-6B70-4AA7-8689-FBE15765A15C");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "Importo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "Importo Finanziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, "685C3DBE-AB95-4EB3-8C11-2E2A60488193");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, "Finanziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.VIS_LABEVISUSTYL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, "D49F5C96-03B6-4F43-A795-6F1922E5A196");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, "ANNO IMP");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, "F0CC983A-6D76-4D35-8535-004697F840A7");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, "NUMERO IMP");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, "2ADD35ED-51DD-40E8-875F-52BC2607D76F");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, "ddd");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, "EDF0CE99-F9FC-47EF-BDC2-BD7C745C9D42");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, "Conferma");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, 0, "button1.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, "BAED7BC8-686A-4A56-8093-66436D4AF4CD");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, "Annulla");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, 0, "button1.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_FINANZIAMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_LIST, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_LIST, "Cod. Finaziam.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_FORM, 112, 52, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_FORM, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_FORM, "Cod. Finaziam.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CODICEFINAZI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CODICEFINAZI, PPQRY_IMPFIN3, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_LIST, 72, 36, 468, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_LIST, 160);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_LIST, "Descrizione Finanziamento");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_FORM, 168, 220, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_FORM, 160);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_FORM, "Descrizione Finanziamento");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DESCRIFINANZ, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DESCRIFINANZ, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, MyGlb.PANEL_LIST, 540, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, MyGlb.PANEL_LIST, 28);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, MyGlb.PANEL_LIST, "In.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, MyGlb.PANEL_FORM, 4, 400, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, MyGlb.PANEL_FORM, 28);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFO, MyGlb.PANEL_FORM, "Inf.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_INFO, -1, -1);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_INFO, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_INFO, PPQRY_IMPFIN3, "", "IMPFININFO", 5, 1, 0, -13997);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFO, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFO, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 564, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_IMPORTO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_IMPORTO, PPQRY_IMPFIN3, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_LIST, 0, 0, 564, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_LIST, 2);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_FORM, 4, 76, 612, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABELFINANZI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABELFINANZI, -1, "", "LABELFINANZI", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_LIST, 584, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_FORM, 4, 256, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ANNOIMP, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ANNOIMP, PPQRY_IMPFIN3, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_LIST, 584, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_FORM, 4, 280, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_NUMEROIMP, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_NUMEROIMP, PPQRY_IMPFIN3, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_LIST, 564, 248, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_FORM, 380, 220, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_IMPOTOTAFINA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_IMPOTOTAFINA, -1, "", "IMPOTOTAFINA", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, MyGlb.PANEL_LIST, 484, 292, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, MyGlb.PANEL_FORM, 444, 288, 108, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CONFERMA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CONFERMA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CONFERMA, -1, "", "CONFERMA", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, MyGlb.PANEL_LIST, 572, 292, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, MyGlb.PANEL_FORM, 452, 296, 108, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ANNULLA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
  }

  private void PAN_FINANZIAMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_FINANZIAMENT.SetIMDB(IMDB, "PQRY_IMPFIN3", true);
    PAN_FINANZIAMENT.set_SetString(MyGlb.MASTER_ROWNAME, "IMP FIN");
    PAN_FINANZIAMENT.SetQueryIMDB(PPQRY_IMPFIN3, IMDBDef13.PQRY_IMPFIN3_RS, IMDBDef4.TBL_FINANZIAME13);
    JustLoaded = true;
    PAN_FINANZIAMENT.SetFieldPrimaryIndex(PFL_FINANZIAMENT_CODICEFINAZI, IMDBDef4.FLD_FINANZIAME13_FINANZIAMENTO);
    PAN_FINANZIAMENT.SetFieldPrimaryIndex(PFL_FINANZIAMENT_IMPORTO, IMDBDef4.FLD_FINANZIAME13_IMPORTO);
    PAN_FINANZIAMENT.SetFieldPrimaryIndex(PFL_FINANZIAMENT_ANNOIMP, IMDBDef4.FLD_FINANZIAME13_ANNO_IMP);
    PAN_FINANZIAMENT.SetFieldPrimaryIndex(PFL_FINANZIAMENT_NUMEROIMP, IMDBDef4.FLD_FINANZIAME13_NUMERO_IMP);
    PAN_FINANZIAMENT.SetMasterTable(0, "FINANZIAME13");
    PAN_FINANZIAMENT.AddToSortList(PFL_FINANZIAMENT_CODICEFINAZI, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FINANZIAMENT.Status() == 2)
    {
      int oldListQBE = PAN_FINANZIAMENT.iUseListQBE;
      PAN_FINANZIAMENT.iUseListQBE = 0;
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_FIND);
      PAN_FINANZIAMENT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
