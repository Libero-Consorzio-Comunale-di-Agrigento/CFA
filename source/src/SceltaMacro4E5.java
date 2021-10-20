// **********************************************
// Scelta Macro 4 E 5
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaMacro4E5 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPOCOD_TIPIRICLASSI = 0;

  private static int PPQRY_TIPOCOD1 = 0;

  private static int PPQRY_TIPIRICLASSI = 1;


  IDPanel PAN_TIPOCOD;
  private static int PFL_VISTSTRURICL_TIPORICLID1 = 0;
  private static int PFL_VISTSTRURICL_LIVELLO1 = 1;
  private static int PFL_VISTSTRURICL_LIVELLO2 = 2;
  private static int PFL_VISTSTRURICL_CODICE1 = 3;
  private static int PFL_VISTSTRURICL_DESCRIZIONE1 = 4;
  private static int PFL_VISTSTRURICL_STRUTTRICLI1 = 5;

  private static int PPQRY_VISTSTRURICL = 0;


  IDPanel PAN_VISTSTRURICL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS95(IMDB);
    Init_TBL_TIPOCOD(IMDB);
    //
    //
    Init_PQRY_TIPOCOD1(IMDB);
    Init_PQRY_TIPOCOD1_RS(IMDB);
    Init_PQRY_VISTSTRURICL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS95(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARS95, 4);
    IMDB.set_TblCode(IMDBDef1.TBL_PARS95, "TBL_PARS95");
    IMDB.set_FldCode(IMDBDef1.TBL_PARS95,IMDBDef1.FLD_PARS95_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS95,IMDBDef1.FLD_PARS95_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS95,IMDBDef1.FLD_PARS95_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS95,IMDBDef1.FLD_PARS95_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS95,IMDBDef1.FLD_PARS95_NOMOGGMISTIT, "NOMOGGMISTIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS95,IMDBDef1.FLD_PARS95_NOMOGGMISTIT,1,9,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS95,IMDBDef1.FLD_PARS95_NOMOGGPROTIP, "NOMOGGPROTIP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS95,IMDBDef1.FLD_PARS95_NOMOGGPROTIP,1,9,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARS95, 0);
  }

  private static void Init_TBL_TIPOCOD(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_TIPOCOD, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_TIPOCOD, "TBL_TIPOCOD");
    IMDB.set_FldCode(IMDBDef1.TBL_TIPOCOD,IMDBDef1.FLD_TIPOCOD_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef1.TBL_TIPOCOD,IMDBDef1.FLD_TIPOCOD_NOMOGGTIPRIC,1,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_TIPOCOD, 0);
  }

  private static void Init_PQRY_TIPOCOD1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPOCOD1, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPOCOD1, "PQRY_TIPOCOD1");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPOCOD1,IMDBDef8.PQSL_TIPOCOD1_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPOCOD1,IMDBDef8.PQSL_TIPOCOD1_NOMOGGTIPRIC,1,10,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_TIPOCOD1, 0);
  }

  private static void Init_PQRY_TIPOCOD1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPOCOD1_RS, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPOCOD1_RS, "PQRY_TIPOCOD1_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPOCOD1_RS,IMDBDef8.PQSL_TIPOCOD1_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPOCOD1_RS,IMDBDef8.PQSL_TIPOCOD1_NOMOGGTIPRIC,1,10,0);
  }

  private static void Init_PQRY_VISTSTRURICL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISTSTRURICL, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISTSTRURICL, "PQRY_VISTSTRURICL");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_REVISTRITIRI, "REVISTRITIRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_REVISTRITIRI,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_RECVISSTRILI, "RECVISSTRILI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_RECVISSTRILI,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_RECORDCODICE,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_REVISTRISTRI, "REVISTRISTRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_REVISTRISTRI,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_RECORDLIVELL, "RECORDLIVELL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_RECORDLIVELL,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTSTRURICL,IMDBDef8.PQSL_VISTSTRURICL_RECORDDESCRI,5,300,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISTSTRURICL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaMacro4E5(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaMacro4E5()
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
    FormIdx = MyGlb.FRM_SCELTMACR4E5;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "414E9229-0E6B-4358-A226-1854FEAF8BF1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 672;
    DesignHeight = 370;
    set_Caption(new IDVariant("Scelta Livello IV/V"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 672;
    Frames[1].Height = 344;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0930233;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 672;
    Frames[2].Height = 32;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Tipo Cod";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 32;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_TIPOCOD = new IDPanel(w, this, 2, "PAN_TIPOCOD");
    Frames[2].Content = PAN_TIPOCOD;
    PAN_TIPOCOD.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPOCOD.VS = MainFrm.VisualStyleList;
    PAN_TIPOCOD.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 672-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TIPOCOD.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6867EFC5-E35D-4B6C-B7D2-D95563F4095A");
    PAN_TIPOCOD.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 124, 61, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOCOD.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPOCOD.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPOCOD.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPOCOD.InitStatus = 2;
    PAN_TIPOCOD_Init();
    PAN_TIPOCOD_InitFields();
    PAN_TIPOCOD_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 672;
    Frames[3].Height = 312;
    Frames[3].Caption = "Vista Struttura Ricl";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 312;
    PAN_VISTSTRURICL = new IDPanel(w, this, 3, "PAN_VISTSTRURICL");
    Frames[3].Content = PAN_VISTSTRURICL;
    PAN_VISTSTRURICL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VISTSTRURICL.VS = MainFrm.VisualStyleList;
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 672-MyGlb.PAN_OFFS_X, 312-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C4FEE00E-4AE4-4A9D-B3BB-940FFA5CB645");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 620, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VISTSTRURICL.InitStatus = 2;
    PAN_VISTSTRURICL_Init();
    PAN_VISTSTRURICL_InitFields();
    PAN_VISTSTRURICL_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_TIPOCOD, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELTMACR4E5_TIPOCOD1();
      }
      PAN_TIPOCOD.UpdatePanel(MainFrm);
      PAN_VISTSTRURICL.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaMacro4E5);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaMacro4E5.class.getName() : (Glb.ClassWithPackage(SceltaMacro4E5.class) ? SceltaMacro4E5.class.getName().substring(SceltaMacro4E5.class.getPackage().getName().length() + 1) : SceltaMacro4E5.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      UNLOAD_PARSDELETE();
      UNLOAD_TIPOCODDELET();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaMacro4E5", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARS95, IMDBDef1.FLD_PARS95_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS95, IMDBDef1.FLD_PARS95_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS95, IMDBDef1.FLD_PARS95_NOMOGGMISTIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS95, IMDBDef1.FLD_PARS95_NOMOGGPROTIP, 0, new IDVariant());
  }

  // **********************************************************************
  // Tipo Cod: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_TIPOCODDELET() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_TIPOCOD, IMDBDef1.FLD_TIPOCOD_NOMOGGTIPRIC, 0, new IDVariant());
  }

  // **********************************************************************
  // Vista Struttura Ricl On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VISTSTRURICL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VISTSTRURICL);
      // 
      // Vista Struttura Ricl On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VISTSTRURICL.set_ToolTip(Glb.OBJ_FIELD,PFL_VISTSTRURICL_LIVELLO2,(new IDVariant(PAN_VISTSTRURICL.FieldText(PFL_VISTSTRURICL_LIVELLO2))).stringValue()); 
      PAN_VISTSTRURICL.set_ToolTip(Glb.OBJ_FIELD,PFL_VISTSTRURICL_DESCRIZIONE1,(new IDVariant(PAN_VISTSTRURICL.FieldText(PFL_VISTSTRURICL_DESCRIZIONE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaMacro4E5", "VistaStrutturaRiclOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tipo Cod
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCELTMACR4E5_TIPOCOD1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_TIPOCOD1_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_TIPOCOD, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_TIPOCOD, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_TIPOCOD1_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_TIPOCOD1_RS, 0, IMDBDef1.TBL_TIPOCOD, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_TIPOCOD1_RS, 0, 0, IMDBDef1.TBL_TIPOCOD, IMDBDef1.FLD_TIPOCOD_NOMOGGTIPRIC, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_TIPOCOD, 0);
      if (IMDB.Eof(IMDBDef1.TBL_TIPOCOD, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_TIPOCOD, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_TIPOCOD1_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
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
  private void PAN_TIPOCOD_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TIPOCOD, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPOCOD_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPOCOD, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPOCOD_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TIPOCOD);
    // Stub
  }

  private void PAN_TIPOCOD_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPOCOD_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPOCOD_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPOCOD_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VISTSTRURICL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VISTSTRURICL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VISTSTRURICL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VISTSTRURICL, Cancel);
    // Stub
  }

  private void PAN_VISTSTRURICL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VISTSTRURICL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VISTSTRURICL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VISTSTRURICL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPOCOD_Init()
  {

    PAN_TIPOCOD.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPOCOD.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPOCOD.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_TIPOCOD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, "896A6292-CEC3-484A-9DD5-19F5EA2E04F4");
    PAN_TIPOCOD.set_Header(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, "Tipi Riclassificazione");
    PAN_TIPOCOD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, "");
    PAN_TIPOCOD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPOCOD.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPOCOD_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPOCOD.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOCOD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_LIST, 124);
    PAN_TIPOCOD.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_LIST, 1);
    PAN_TIPOCOD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_LIST, "Tipi Riclassificazione");
    PAN_TIPOCOD.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_FORM, 4, 4, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOCOD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_FORM, 124);
    PAN_TIPOCOD.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_FORM, 1);
    PAN_TIPOCOD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_FORM, "Tipi Riclassificazione");
    PAN_TIPOCOD.SetFieldPage(PFL_TIPOCOD_TIPIRICLASSI, -1, -1);
    PAN_TIPOCOD.SetFieldPanel(PFL_TIPOCOD_TIPIRICLASSI, PPQRY_TIPOCOD1, "A.NOMOGGTIPRIC", "NOMOGGTIPRIC", 1, 10, 0, -13997);
  }

  private void PAN_TIPOCOD_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPOCOD.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as TIPRICTIRIID, ");
    SQL.append("  A.CODICE as TIPIRICLCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIRICLDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    SQL.append("where (A.TIPO_RICL_ID = ~~NOMOGGTIPRIC~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 2999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A_GET_ESERCIZIO_INI_RICL(A.CODICE,A.ESERCIZIO_SCADENZA), 1) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CODICE <> 'COFOG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPOCOD.SetQuery(PPQRY_TIPIRICLASSI, 0, SQL, PFL_TIPOCOD_TIPIRICLASSI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as TIPRICTIRIID, ");
    SQL.append("  A.CODICE as TIPIRICLCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIRICLDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    SQL.append("where (NVL(A.ESERCIZIO_SCADENZA, 2999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A_GET_ESERCIZIO_INI_RICL(A.CODICE,A.ESERCIZIO_SCADENZA), 1) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CODICE <> 'COFOG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPOCOD.SetQuery(PPQRY_TIPIRICLASSI, 1, SQL, PFL_TIPOCOD_TIPIRICLASSI, "");
    PAN_TIPOCOD.SetQueryDB(PPQRY_TIPIRICLASSI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPOCOD.SetIMDB(IMDB, "PQRY_TIPOCOD1", true);
    PAN_TIPOCOD.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_TIPOCOD.SetQueryIMDB(PPQRY_TIPOCOD1, IMDBDef8.PQRY_TIPOCOD1_RS, IMDBDef1.TBL_TIPOCOD);
    JustLoaded = true;
    PAN_TIPOCOD.SetFieldPrimaryIndex(PFL_TIPOCOD_TIPIRICLASSI, IMDBDef1.FLD_TIPOCOD_NOMOGGTIPRIC);
    PAN_TIPOCOD.SetMasterTable(0, "TIPOCOD");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPOCOD.Status() == 2)
    {
      int oldListQBE = PAN_TIPOCOD.iUseListQBE;
      PAN_TIPOCOD.iUseListQBE = 0;
      PAN_TIPOCOD.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPOCOD.PanelCommand(Glb.PCM_FIND);
      PAN_TIPOCOD.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VISTSTRURICL_Init()
  {

    PAN_VISTSTRURICL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VISTSTRURICL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VISTSTRURICL.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, "2AAF8B5B-AD11-4FE6-AE80-951D75032B3D");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, "TIPO RICL ID");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, 0, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, "7CD2F5CB-5A68-4075-9DE7-52604646B399");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, "LIVELLO");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, 0, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, "DF8F70BD-BB0F-4FA0-9633-BF795DCDD852");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, "Livello");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, "729AA1B0-E6E7-452D-BE7B-B8C74187EDC6");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, "Codice");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.VIS_NORMALFIELDS);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, "B1EE474D-F0DD-43A5-8B4F-0D01D4763220");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, "Descrizione");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, "64C95CBA-0C94-4152-9C5C-CCCC6A46AC55");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, "STRUTTURA RICL ID");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, 0, -1);
  }

  private void PAN_VISTSTRURICL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_LIST, 80);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_LIST, "TIPO RICL ID");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_FORM, 80);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_FORM, "TIPO RICL ID");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_TIPORICLID1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_TIPORICLID1, PPQRY_VISTSTRURICL, "A.TIPO_RICL_ID", "REVISTRITIRI", 1, 10, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_LIST, 52);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_LIST, "LIVELLO");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_FORM, 4, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_FORM, 52);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_FORM, "LIVELLO");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_LIVELLO1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_LIVELLO1, PPQRY_VISTSTRURICL, "A.LIVELLO", "RECVISSTRILI", 1, 2, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_LIST, 76);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_LIST, "Livello");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_FORM, 4, 4, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_FORM, 76);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_FORM, "Livello");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_LIVELLO2, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_LIVELLO2, PPQRY_VISTSTRURICL, "A.DES_LIVELLO", "RECORDLIVELL", 5, 40, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_LIST, 208, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_LIST, 52);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_FORM, 4, 76, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_FORM, 52);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_CODICE1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_CODICE1, PPQRY_VISTSTRURICL, "A.CODICE", "RECORDCODICE", 1, 10, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_LIST, 280, 36, 340, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 4, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_DESCRIZIONE1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_DESCRIZIONE1, PPQRY_VISTSTRURICL, "A.DESCRIZIONE", "RECORDDESCRI", 5, 300, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_LIST, 124);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_LIST, "STRUTTURA RICL ID");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_FORM, 4, 172, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_FORM, 124);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_FORM, "STRUTTURA RICL ID");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_STRUTTRICLI1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_STRUTTRICLI1, PPQRY_VISTSTRURICL, "A.STRUTTURA_RICL_ID", "REVISTRISTRI", 1, 10, 0, -13997);
  }

  private void PAN_VISTSTRURICL_InitQueries()
  {
    StringBuffer SQL;

    PAN_VISTSTRURICL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VISTSTRURICL.SetIMDB(IMDB, "PQRY_VISTSTRURICL", true);
    PAN_VISTSTRURICL.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as REVISTRITIRI, ");
    SQL.append("  A.LIVELLO as RECVISSTRILI, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.STRUTTURA_RICL_ID as REVISTRISTRI, ");
    SQL.append("  A.DES_LIVELLO as RECORDLIVELL, ");
    SQL.append("  A.DESCRIZIONE as RECORDDESCRI ");
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTSTRURICL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTSTRURICL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~TBL_PARS95.NOMEOGGETTES~~) ");
    SQL.append("and   (A.LIVELLO = A.MAX_LIVELLO_RICL) ");
    SQL.append("and   (A.TIPO_RICL_ID = ~~PQRY_TIPOCOD1.NOMOGGTIPRIC~~) ");
    SQL.append("and   ((~~TBL_PARS95.NOMOGGMISTIT~~ IS NULL) OR CONTROLLA_COD_STRUTT_MACRO4(~~TBL_PARS95.NOMEOGGEESER~~,~~TBL_PARS95.NOMEOGGETTES~~,A.CODICE,~~TBL_PARS95.NOMOGGMISTIT~~,~~TBL_PARS95.NOMOGGPROTIP~~) = 'SI') ");
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTSTRURICL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTSTRURICL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTSTRURICL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTSTRURICL, 5, SQL, -1, "");
    PAN_VISTSTRURICL.SetQueryDB(PPQRY_VISTSTRURICL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISTSTRURICL.SetMasterTable(0, "VISTA_STRUTTURA_RICL");
    PAN_VISTSTRURICL.AddToSortList(PFL_VISTSTRURICL_CODICE1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VISTSTRURICL.Status() == 2)
    {
      int oldListQBE = PAN_VISTSTRURICL.iUseListQBE;
      PAN_VISTSTRURICL.iUseListQBE = 0;
      PAN_VISTSTRURICL.PanelCommand(Glb.PCM_SEARCH);
      PAN_VISTSTRURICL.PanelCommand(Glb.PCM_FIND);
      PAN_VISTSTRURICL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_ValidateRow(Cancel);
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_DynamicProperties();
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
