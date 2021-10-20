// **********************************************
// Sit Capitoli Per Categorie Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SitCapitoliPerCategorieFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PERSIT_MISSIONI = 0;
  private static int PFL_PERSIT_PROGRAMMI = 1;
  private static int PFL_PERSIT_SOLOCOMPETEN = 2;
  private static int PFL_PERSIT_DATAELABORAZ = 3;
  private static int PFL_PERSIT_ETICHEELABOR = 4;
  private static int PFL_PERSIT_SOLOCAPIIMPE = 5;

  private static int PPQRY_PERSIT10 = 0;

  private static int PPQRY_VISTMISSPRO1 = 1;
  private static int PPQRY_VISTMISSPROG = 2;


  IDPanel PAN_PERSIT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PERSIT11(IMDB);
    //
    //
    Init_PQRY_PERSIT10(IMDB);
    Init_PQRY_PERSIT10_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PERSIT11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PERSIT11, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_PERSIT11, "TBL_PERSIT11");
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMEOGGEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMEOGGEPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMOGGSOLCOM, "NOMOGGSOLCOM");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMOGGSOLCOM,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMOGGSOCAIM, "NOMOGGSOCAIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT11,IMDBDef4.FLD_PERSIT11_NOMOGGSOCAIM,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PERSIT11, 0);
  }

  private static void Init_PQRY_PERSIT10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PERSIT10, 5);
    IMDB.set_TblCode(IMDBDef13.PQRY_PERSIT10, "PQRY_PERSIT10");
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMEOGGEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMEOGGEPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMOGGSOLCOM, "NOMOGGSOLCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMOGGSOLCOM,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMOGGSOCAIM, "NOMOGGSOCAIM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10,IMDBDef13.PQSL_PERSIT10_NOMOGGSOCAIM,5,2,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PERSIT10, 0);
  }

  private static void Init_PQRY_PERSIT10_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PERSIT10_RS, 5);
    IMDB.set_TblCode(IMDBDef13.PQRY_PERSIT10_RS, "PQRY_PERSIT10_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMEOGGEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMEOGGEPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMOGGSOLCOM, "NOMOGGSOLCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMOGGSOLCOM,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMOGGSOCAIM, "NOMOGGSOCAIM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT10_RS,IMDBDef13.PQSL_PERSIT10_NOMOGGSOCAIM,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SitCapitoliPerCategorieFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public SitCapitoliPerCategorieFinanziamento()
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
    FormIdx = MyGlb.FRM_SITCAPPECAFI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5C9934C9-788F-4EDE-9268-C950254DF272";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 524;
    DesignHeight = 174;
    set_Caption(new IDVariant("Sit. Capitoli per Categorie Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 524;
    Frames[1].Height = 148;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Per Sit";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 148;
    PAN_PERSIT = new IDPanel(w, this, 1, "PAN_PERSIT");
    Frames[1].Content = PAN_PERSIT;
    PAN_PERSIT.Lockable = false;
    PAN_PERSIT.iLocked = false;
    PAN_PERSIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PERSIT.VS = MainFrm.VisualStyleList;
    PAN_PERSIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 524-MyGlb.PAN_OFFS_X, 148-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BB4DA453-C55F-47E9-9F47-C0A1698ACBC1");
    PAN_PERSIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 476, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PERSIT.InitStatus = 1;
    PAN_PERSIT_Init();
    PAN_PERSIT_InitFields();
    PAN_PERSIT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PERSIT11, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITCAPPECAFI_PERSIT10();
      }
      PAN_PERSIT.UpdatePanel(MainFrm);
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
    return (obj instanceof SitCapitoliPerCategorieFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SitCapitoliPerCategorieFinanziamento.class.getName() : (Glb.ClassWithPackage(SitCapitoliPerCategorieFinanziamento.class) ? SitCapitoliPerCategorieFinanziamento.class.getName().substring(SitCapitoliPerCategorieFinanziamento.class.getPackage().getName().length() + 1) : SitCapitoliPerCategorieFinanziamento.class.getName()));
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
      LOAD_PERSITDELETE();
      IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGSOLCOM, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGDATELA, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SitCapitoliPerCategorieFinanziamento", "Load", _e);
    }
  }

  // **********************************************************************
  // Per Sit: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PERSITDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMEOGGEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMEOGGEPROG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGSOLCOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGDATELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGSOCAIM, 0, new IDVariant());
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
      UNLOAD_PERSITDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SitCapitoliPerCategorieFinanziamento", "Unload", _e);
    }
  }

  // **********************************************************************
  // Per Sit: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PERSITDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMEOGGEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMEOGGEPROG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGSOLCOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGDATELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGSOCAIM, 0, new IDVariant());
  }

  // **********************************************************************
  // Per Sit On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PERSIT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Per Sit On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PERSIT_MISSIONI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMEOGGEPROG, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PERSIT_PROGRAMMI)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMEOGGEPROG, 0))) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMEOGGEMISS, 0)))
        {
          IDVariant v_VMAX = new IDVariant(0,IDVariant.STRING);
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1, ");
          SQL.append("  MAX(A.MISSIONE) as MAXVISMIPRMI ");
          SQL.append("from ");
          SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
          SQL.append("where (A.PROGRAMMA = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMEOGGEPROG, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            v_VMAX = QV.Get("MAXVISMIPRMI", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(1)), true) && IDL.NullValue(v_VMAX,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            IMDB.set_Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMEOGGEMISS, 0, new IDVariant(v_VMAX));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SitCapitoliPerCategorieFinanziamento", "PerSitOnUpdatingRow", _e);
    }
  }

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
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMOGGDATELA, 0)))
      {
        IMDB.set_Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMOGGDATELA, 0, IDL.Today());
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_MISSIONE")), IMDB.Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMEOGGEMISS, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGRAMMA")), IMDB.Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMEOGGEPROG, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SOLO_COMP")), IMDB.Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMOGGSOLCOM, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_CAP_IMP")), IMDB.Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMOGGSOCAIM, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT10, IMDBDef13.PQSL_PERSIT10_NOMOGGDATELA, 0)));
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Sit_Cap_Categorie_Fin"));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SitCapitoliPerCategorieFinanziamento", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Per Sit
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SITCAPPECAFI_PERSIT10() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PERSIT10_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PERSIT11, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PERSIT11, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PERSIT10_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PERSIT10_RS, 0, IMDBDef4.TBL_PERSIT11, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT10_RS, 0, 0, IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMEOGGEMISS, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT10_RS, 1, 0, IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMEOGGEPROG, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT10_RS, 2, 0, IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGSOLCOM, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT10_RS, 3, 0, IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGDATELA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT10_RS, 4, 0, IMDBDef4.TBL_PERSIT11, IMDBDef4.FLD_PERSIT11_NOMOGGSOCAIM, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PERSIT11, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PERSIT11, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PERSIT11, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PERSIT10_RS, 0);
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
  private void PAN_PERSIT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PERSIT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PERSIT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PERSIT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PERSIT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PERSIT);
    // Stub
  }

  private void PAN_PERSIT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PERSIT_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PERSIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PERSIT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PERSIT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PERSIT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PERSIT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PERSIT_Init()
  {

    PAN_PERSIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PERSIT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PERSIT.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, "2D3595E3-AD75-4F79-BC7E-A481700140A2");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, "Missione");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, "6C8FC7CF-0A80-4987-BDEA-F274B521F36C");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, "Programma");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, "D9744E68-5258-4FF2-AFBE-769BD8467EB9");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, "Solo Competenza");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, "9DEA91AB-8118-44BB-B6DF-A00190CA4553");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, "Data Elaborazione");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, "AFBFA270-71AF-4A41-8C96-62D3990FF85E");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, "Elabora");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PERSIT.SetImage(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, "1C937DEA-AD50-48B5-88F3-DB40CA4CE51F");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, "Solo Cap. Impegnati");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, MyGlb.VIS_CHECKSTYLE);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PERSIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, MyGlb.PANEL_LIST, 56);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, MyGlb.PANEL_LIST, "Missione");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, MyGlb.PANEL_FORM, 28, 4, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, MyGlb.PANEL_FORM, 96);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_MISSIONI, MyGlb.PANEL_FORM, "Missione");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_MISSIONI, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_MISSIONI, PPQRY_PERSIT10, "A.NOMEOGGEMISS", "NOMEOGGEMISS", 5, 2, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, MyGlb.PANEL_LIST, 72);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, MyGlb.PANEL_LIST, "Programma");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, MyGlb.PANEL_FORM, 28, 28, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, MyGlb.PANEL_FORM, 96);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_PROGRAMMI, MyGlb.PANEL_FORM, "Programma");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_PROGRAMMI, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_PROGRAMMI, PPQRY_PERSIT10, "A.NOMEOGGEPROG", "NOMEOGGEPROG", 5, 4, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, 108);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Sl. Cmp.");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, 12, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, 112);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_SOLOCOMPETEN, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_SOLOCOMPETEN, PPQRY_PERSIT10, "A.NOMOGGSOLCOM", "NOMOGGSOLCOM", 5, 2, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_SOLOCOMPETEN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_SOLOCOMPETEN, (new IDVariant()), "Null", "", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, 112);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, 304, 52, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_DATAELABORAZ, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_DATAELABORAZ, PPQRY_PERSIT10, "A.NOMOGGDATELA", "NOMOGGDATELA", 6, 14, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_LIST, 376, 128, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_FORM, 424, 92, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_ETICHEELABOR, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, MyGlb.PANEL_LIST, 140);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, MyGlb.PANEL_LIST, "Solo Cap. Impegnati");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, MyGlb.PANEL_FORM, 156, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, MyGlb.PANEL_FORM, 120);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCAPIIMPE, MyGlb.PANEL_FORM, "Solo Cap. Impegnati");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_SOLOCAPIIMPE, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_SOLOCAPIIMPE, PPQRY_PERSIT10, "A.NOMOGGSOCAIM", "NOMOGGSOCAIM", 5, 2, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_SOLOCAPIIMPE, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_SOLOCAPIIMPE, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PERSIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PERSIT.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as VISMISPROMI1 ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = ~~NOMEOGGEMISS~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.MISSIONE ");
    PAN_PERSIT.SetQuery(PPQRY_VISTMISSPRO1, 0, SQL, PFL_PERSIT_MISSIONI, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as VISMISPROMI1 ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.MISSIONE ");
    PAN_PERSIT.SetQuery(PPQRY_VISTMISSPRO1, 1, SQL, PFL_PERSIT_MISSIONI, "");
    PAN_PERSIT.SetQueryDB(PPQRY_VISTMISSPRO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPROPR1 ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.PROGRAMMA = ~~NOMEOGGEPROG~~) ");
    SQL.append("and   (A.MISSIONE = NVL(~~NOMEOGGEMISS~~, A.MISSIONE)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.PROGRAMMA ");
    PAN_PERSIT.SetQuery(PPQRY_VISTMISSPROG, 0, SQL, PFL_PERSIT_PROGRAMMI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPROPR1 ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = NVL(~~NOMEOGGEMISS~~, A.MISSIONE)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.PROGRAMMA ");
    PAN_PERSIT.SetQuery(PPQRY_VISTMISSPROG, 1, SQL, PFL_PERSIT_PROGRAMMI, "");
    PAN_PERSIT.SetQueryDB(PPQRY_VISTMISSPROG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PERSIT.SetIMDB(IMDB, "PQRY_PERSIT10", true);
    PAN_PERSIT.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PERSIT.SetQueryIMDB(PPQRY_PERSIT10, IMDBDef13.PQRY_PERSIT10_RS, IMDBDef4.TBL_PERSIT11);
    JustLoaded = true;
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_MISSIONI, IMDBDef4.FLD_PERSIT11_NOMEOGGEMISS);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_PROGRAMMI, IMDBDef4.FLD_PERSIT11_NOMEOGGEPROG);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_SOLOCOMPETEN, IMDBDef4.FLD_PERSIT11_NOMOGGSOLCOM);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_DATAELABORAZ, IMDBDef4.FLD_PERSIT11_NOMOGGDATELA);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_SOLOCAPIIMPE, IMDBDef4.FLD_PERSIT11_NOMOGGSOCAIM);
    PAN_PERSIT.SetMasterTable(0, "PERSIT11");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PERSIT.Status() == 2)
    {
      int oldListQBE = PAN_PERSIT.iUseListQBE;
      PAN_PERSIT.iUseListQBE = 0;
      PAN_PERSIT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PERSIT.PanelCommand(Glb.PCM_FIND);
      PAN_PERSIT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
