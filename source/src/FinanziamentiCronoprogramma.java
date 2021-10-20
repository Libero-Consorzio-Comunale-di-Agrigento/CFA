// **********************************************
// Finanziamenti Cronoprogramma
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FinanziamentiCronoprogramma extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FINANZCRONOP_FINANZIAMENT = 0;
  private static int PFL_FINANZCRONOP_DESCRIZIONE = 1;
  private static int PFL_FINANZCRONOP_IMPORTO = 2;
  private static int PFL_FINANZCRONOP_ETICHEFINANZ = 3;

  private static int PPQRY_CROESIBPRDE6 = 0;


  IDPanel PAN_FINANZCRONOP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARSCRONO(IMDB);
    Init_TBL_FINANZIAME29(IMDB);
    //
    //
    Init_PQRY_CROESIBPRDE6(IMDB);
    Init_PQRY_CROESIBPRDE6_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARSCRONO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARSCRONO, 6);
    IMDB.set_TblCode(IMDBDef7.TBL_PARSCRONO, "TBL_PARSCRONO");
    IMDB.set_FldCode(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGECRON, "NOMEOGGECRON");
    IMDB.SetFldParams(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGECRON,1,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMOGGANNPLU, "NOMOGGANNPLU");
    IMDB.SetFldParams(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMOGGANNPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARSCRONO,IMDBDef7.FLD_PARSCRONO_NOMEOGGEIMPO,3,14,2);
    IMDB.TblAddNew(IMDBDef7.TBL_PARSCRONO, 0);
  }

  private static void Init_TBL_FINANZIAME29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_FINANZIAME29, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_FINANZIAME29, "TBL_FINANZIAME29");
    IMDB.set_FldCode(IMDBDef7.TBL_FINANZIAME29,IMDBDef7.FLD_FINANZIAME29_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef7.TBL_FINANZIAME29,IMDBDef7.FLD_FINANZIAME29_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_FINANZIAME29,IMDBDef7.FLD_FINANZIAME29_DES_FINANZIAMENTO, "DES_FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef7.TBL_FINANZIAME29,IMDBDef7.FLD_FINANZIAME29_DES_FINANZIAMENTO,5,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_FINANZIAME29,IMDBDef7.FLD_FINANZIAME29_FINANZIMPORT, "FINANZIMPORT");
    IMDB.SetFldParams(IMDBDef7.TBL_FINANZIAME29,IMDBDef7.FLD_FINANZIAME29_FINANZIMPORT,3,14,2);
  }

  private static void Init_PQRY_CROESIBPRDE6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CROESIBPRDE6, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_CROESIBPRDE6, "PQRY_CROESIBPRDE6");
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE6,IMDBDef17.PQSL_CROESIBPRDE6_RECOFINAFINA, "RECOFINAFINA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE6,IMDBDef17.PQSL_CROESIBPRDE6_RECOFINAFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE6,IMDBDef17.PQSL_CROESIBPRDE6_RECFINDESFIN, "RECFINDESFIN");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE6,IMDBDef17.PQSL_CROESIBPRDE6_RECFINDESFIN,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE6,IMDBDef17.PQSL_CROESIBPRDE6_RECOFINAIMPO, "RECOFINAIMPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE6,IMDBDef17.PQSL_CROESIBPRDE6_RECOFINAIMPO,3,14,2);
    IMDB.TblAddNew(IMDBDef17.PQRY_CROESIBPRDE6, 0);
  }

  private static void Init_PQRY_CROESIBPRDE6_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CROESIBPRDE6_RS, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_CROESIBPRDE6_RS, "PQRY_CROESIBPRDE6_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE6_RS,IMDBDef17.PQSL_CROESIBPRDE6_RECOFINAFINA, "RECOFINAFINA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE6_RS,IMDBDef17.PQSL_CROESIBPRDE6_RECOFINAFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE6_RS,IMDBDef17.PQSL_CROESIBPRDE6_RECFINDESFIN, "RECFINDESFIN");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE6_RS,IMDBDef17.PQSL_CROESIBPRDE6_RECFINDESFIN,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CROESIBPRDE6_RS,IMDBDef17.PQSL_CROESIBPRDE6_RECOFINAIMPO, "RECOFINAIMPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CROESIBPRDE6_RS,IMDBDef17.PQSL_CROESIBPRDE6_RECOFINAIMPO,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FinanziamentiCronoprogramma(MyWebEntryPoint w, IMDBObj imdb)
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
  public FinanziamentiCronoprogramma()
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
    FormIdx = MyGlb.FRM_FINANZCRONOP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F849486D-5DD0-44A8-B38F-78659C61264B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 660;
    DesignHeight = 362;
    set_Caption(new IDVariant("Finanziamenti Cronoprogramma"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 660;
    Frames[1].Height = 336;
    Frames[1].Caption = "Finanziamenti Cronoprogramma";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_FINANZCRONOP = new IDPanel(w, this, 1, "PAN_FINANZCRONOP");
    Frames[1].Content = PAN_FINANZCRONOP;
    PAN_FINANZCRONOP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZCRONOP.VS = MainFrm.VisualStyleList;
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 660-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FINANZCRONOP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7C14C0C2-ECFD-49C5-8340-C6321C39977D");
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 600, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FINANZCRONOP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZCRONOP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANZCRONOP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FINANZCRONOP.InitStatus = 2;
    PAN_FINANZCRONOP_Init();
    PAN_FINANZCRONOP_InitFields();
    PAN_FINANZCRONOP_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_FINANZIAME29, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FINANZCRONOP_CROESIBPRDE6();
      }
      PAN_FINANZCRONOP.UpdatePanel(MainFrm);
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
    return (obj instanceof FinanziamentiCronoprogramma);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FinanziamentiCronoprogramma.class.getName() : (Glb.ClassWithPackage(FinanziamentiCronoprogramma.class) ? FinanziamentiCronoprogramma.class.getName().substring(FinanziamentiCronoprogramma.class.getPackage().getName().length() + 1) : FinanziamentiCronoprogramma.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      LOAD_FINANZDELETE();
      LOAD_FININSINTSEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiCronoprogramma", "Load", _e);
    }
  }

  // **********************************************************************
  // FINANZIAMENTI: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_FINANZDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef7.TBL_FINANZIAME29);
  }

  // **********************************************************************
  // FINANZIAMENTI: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void LOAD_FININSINTSEL() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI, ");
    SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEIMPO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " as NOMEOGGEIMPO ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.FINANZIAMENTO, ");
    SQL.append("  B.DES_FINANZIAMENTO, ");
    SQL.append("  B.IMPORTO ");
    SQL.append("from ");
    SQL.append("  FPV_CRONO_BPR_DEP B ");
    SQL.append("where (B.CRONOPROGRAMMA_ID = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGECRON, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.ESERCIZIO_PLUR = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMOGGANNPLU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("order by 1 ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef7.TBL_FINANZIAME29, 0);
      IMDB.set_Value(IMDBDef7.TBL_FINANZIAME29,IMDBDef7.FLD_FINANZIAME29_FINANZIAMENTO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef7.TBL_FINANZIAME29,IMDBDef7.FLD_FINANZIAME29_DES_FINANZIAMENTO,0,RS.Get(2));
      IMDB.set_Value(IMDBDef7.TBL_FINANZIAME29,IMDBDef7.FLD_FINANZIAME29_FINANZIMPORT,0,RS.Get(3));
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
      UNLOAD_PARSCRDELETE();
      UNLOAD_FINANZDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiCronoprogramma", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parscrono: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSCRDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGECRON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMOGGANNPLU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEFINA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEIMPO, 0, new IDVariant());
  }

  // **********************************************************************
  // FINANZIAMENTI: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FINANZDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef7.TBL_FINANZIAME29);
  }

  // **********************************************************************
  // Finanziamenti Cronoprogramma On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FINANZCRONOP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FINANZCRONOP);
      // 
      // Finanziamenti Cronoprogramma On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_FINANZCRONOP.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZCRONOP_DESCRIZIONE,(new IDVariant(PAN_FINANZCRONOP.FieldText(PFL_FINANZCRONOP_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiCronoprogramma", "FinanziamentiCronoprogrammaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // CRONO ESIG BPR DEP
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void FINANZCRONOP_CROESIBPRDE6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_CROESIBPRDE6_RS);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef7.TBL_FINANZIAME29, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_FINANZIAME29, 0))
    {
      IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
      IMDB.TblLinkRow(IMDBDef1.TMP_RECORDSET, 0, IMDBDef7.TBL_FINANZIAME29, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 0, 0, IMDBDef7.TBL_FINANZIAME29, IMDBDef7.FLD_FINANZIAME29_FINANZIAMENTO, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 1, 0, IMDBDef7.TBL_FINANZIAME29, IMDBDef7.FLD_FINANZIAME29_DES_FINANZIAMENTO, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 2, 0, IMDBDef7.TBL_FINANZIAME29, IMDBDef7.FLD_FINANZIAME29_FINANZIMPORT, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_FINANZIAME29, 0);
      if (IMDB.Eof(IMDBDef7.TBL_FINANZIAME29, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_FINANZIAME29, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,0,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,1,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,2,true);
    IMDB.TblStartSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[3];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[3];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0);
          AggrBuff[1] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0);
          AggrBuff[2] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0);
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          AggrNewGroup = AggrNewGroup || !AggrBuff[0].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[1].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[2].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0));
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef17.PQRY_CROESIBPRDE6_RS, 0);
              IMDB.set_Value(IMDBDef17.PQRY_CROESIBPRDE6_RS, 0, 0, AggrBuff[0]);
              IMDB.set_Value(IMDBDef17.PQRY_CROESIBPRDE6_RS, 1, 0, AggrBuff[1]);
              IMDB.set_Value(IMDBDef17.PQRY_CROESIBPRDE6_RS, 2, 0, AggrBuff[2]);
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
      IMDB.TblInitSort(IMDBDef17.PQRY_CROESIBPRDE6_RS);
      IMDB.TblSortBy(IMDBDef17.PQRY_CROESIBPRDE6_RS,0,true);
      IMDB.TblStartSort(IMDBDef17.PQRY_CROESIBPRDE6_RS);
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_CROESIBPRDE6_RS, 0);
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
  private void PAN_FINANZCRONOP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FINANZCRONOP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FINANZCRONOP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FINANZCRONOP, Cancel);
    // Stub
  }

  private void PAN_FINANZCRONOP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FINANZCRONOP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FINANZCRONOP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FINANZCRONOP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FINANZCRONOP_Init()
  {

    PAN_FINANZCRONOP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANZCRONOP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FINANZCRONOP.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_FINANZCRONOP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, "CA63E3A3-B328-43F8-A12B-A41BA2EDBC0A");
    PAN_FINANZCRONOP.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, "Finanziamento");
    PAN_FINANZCRONOP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, "");
    PAN_FINANZCRONOP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZCRONOP.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZCRONOP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, "B2894049-90D6-4F37-A516-A676F224BE0D");
    PAN_FINANZCRONOP.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, "DESCRIZIONE");
    PAN_FINANZCRONOP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, "");
    PAN_FINANZCRONOP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZCRONOP.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZCRONOP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, "9B1A412A-7BFE-4991-A7B0-F4F62BAD4E0D");
    PAN_FINANZCRONOP.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, "Importo");
    PAN_FINANZCRONOP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, "");
    PAN_FINANZCRONOP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZCRONOP.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZCRONOP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, "BF9A5A9A-D654-4E0C-B300-F8C19BED21CE");
    PAN_FINANZCRONOP.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, "Finanziamento");
    PAN_FINANZCRONOP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, MyGlb.VIS_LABEVISUSTYL);
    PAN_FINANZCRONOP.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_FINANZCRONOP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZCRONOP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_FINANZCRONOP.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_FINANZCRONOP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, MyGlb.PANEL_LIST, "Finan.");
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZCRONOP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_FINANZCRONOP.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_FINANZCRONOP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_FINANZCRONOP.SetFieldPage(PFL_FINANZCRONOP_FINANZIAMENT, -1, -1);
    PAN_FINANZCRONOP.SetFieldPanel(PFL_FINANZCRONOP_FINANZIAMENT, PPQRY_CROESIBPRDE6, "A.FINANZIAMENTO", "RECOFINAFINA", 1, 5, 0, -13997);
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, MyGlb.PANEL_LIST, 40, 36, 436, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZCRONOP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_FINANZCRONOP.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZCRONOP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 592, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZCRONOP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_FINANZCRONOP.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_FINANZCRONOP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_FINANZCRONOP.SetFieldPage(PFL_FINANZCRONOP_DESCRIZIONE, -1, -1);
    PAN_FINANZCRONOP.SetFieldPanel(PFL_FINANZCRONOP_DESCRIZIONE, PPQRY_CROESIBPRDE6, "A.DES_FINANZIAMENTO", "RECFINDESFIN", 5, 200, 0, -13997);
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, MyGlb.PANEL_LIST, 476, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZCRONOP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_FINANZCRONOP.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZCRONOP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, MyGlb.PANEL_FORM, 4, 64, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZCRONOP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_FINANZCRONOP.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZCRONOP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_FINANZCRONOP.SetFieldPage(PFL_FINANZCRONOP_IMPORTO, -1, -1);
    PAN_FINANZCRONOP.SetFieldPanel(PFL_FINANZCRONOP_IMPORTO, PPQRY_CROESIBPRDE6, "A.FINANZIMPORT", "RECOFINAIMPO", 3, 14, 2, -13997);
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, MyGlb.PANEL_LIST, 0, 0, 476, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZCRONOP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, MyGlb.PANEL_LIST, 0);
    PAN_FINANZCRONOP.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, MyGlb.PANEL_LIST, 2);
    PAN_FINANZCRONOP.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, MyGlb.PANEL_FORM, 568, 172, 52, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZCRONOP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, MyGlb.PANEL_FORM, 0);
    PAN_FINANZCRONOP.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZCRONOP_ETICHEFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_FINANZCRONOP.SetFieldPage(PFL_FINANZCRONOP_ETICHEFINANZ, -1, -1);
    PAN_FINANZCRONOP.SetFieldPanel(PFL_FINANZCRONOP_ETICHEFINANZ, -1, "", "ETICHEFINANZ", 0, 0, 0, -13997);
  }

  private void PAN_FINANZCRONOP_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANZCRONOP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FINANZCRONOP.SetIMDB(IMDB, "PQRY_CROESIBPRDE6", true);
    PAN_FINANZCRONOP.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FINANZCRONOP.SetQueryIMDB(PPQRY_CROESIBPRDE6, IMDBDef17.PQRY_CROESIBPRDE6_RS, IMDBDef7.TBL_FINANZIAME29);
    JustLoaded = true;
    PAN_FINANZCRONOP.SetFieldPrimaryIndex(PFL_FINANZCRONOP_FINANZIAMENT, IMDBDef7.FLD_FINANZIAME29_FINANZIAMENTO);
    PAN_FINANZCRONOP.SetFieldPrimaryIndex(PFL_FINANZCRONOP_DESCRIZIONE, IMDBDef7.FLD_FINANZIAME29_DES_FINANZIAMENTO);
    PAN_FINANZCRONOP.SetFieldPrimaryIndex(PFL_FINANZCRONOP_IMPORTO, IMDBDef7.FLD_FINANZIAME29_FINANZIMPORT);
    PAN_FINANZCRONOP.SetMasterTable(0, "FINANZIAME29");
    PAN_FINANZCRONOP.AddToSortList(PFL_FINANZCRONOP_FINANZIAMENT, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FINANZCRONOP.Status() == 2)
    {
      int oldListQBE = PAN_FINANZCRONOP.iUseListQBE;
      PAN_FINANZCRONOP.iUseListQBE = 0;
      PAN_FINANZCRONOP.PanelCommand(Glb.PCM_SEARCH);
      PAN_FINANZCRONOP.PanelCommand(Glb.PCM_FIND);
      PAN_FINANZCRONOP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FINANZCRONOP) PAN_FINANZCRONOP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZCRONOP) PAN_FINANZCRONOP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FINANZCRONOP) PAN_FINANZCRONOP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZCRONOP) PAN_FINANZCRONOP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FINANZCRONOP) PAN_FINANZCRONOP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
