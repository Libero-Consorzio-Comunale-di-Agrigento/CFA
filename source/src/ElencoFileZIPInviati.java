// **********************************************
// Elenco File ZIP Inviati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoFileZIPInviati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARELEFILZIP_ESERCIZIO = 0;
  private static int PFL_PARELEFILZIP_ENTRATASPESA = 1;
  private static int PFL_PARELEFILZIP_PERIODO = 2;
  private static int PFL_PARELEFILZIP_FILEELIMINAT = 3;

  private static int PPQRY_PARELEFILZI1 = 0;

  private static int PPQRY_ESERCIFINANZ = 1;


  IDPanel PAN_PARELEFILZIP;
  private static int PFL_ELEFILZIPINV_NOMEFILEZIP = 0;
  private static int PFL_ELEFILZIPINV_SCARIFILEZIP = 1;
  private static int PFL_ELEFILZIPINV_FILEANNULLI = 2;
  private static int PFL_ELEFILZIPINV_DATACREAZION = 3;
  private static int PFL_ELEFILZIPINV_ELIMINATO = 4;

  private static int PPQRY_CFATFILEZIP = 0;


  IDPanel PAN_ELEFILZIPINV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARELEFILZIP(IMDB);
    //
    //
    Init_PQRY_PARELEFILZI1(IMDB);
    Init_PQRY_PARELEFILZI1_RS(IMDB);
    Init_PQRY_CFATFILEZIP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARELEFILZIP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARELEFILZIP, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARELEFILZIP, "TBL_PARELEFILZIP");
    IMDB.set_FldCode(IMDBDef2.TBL_PARELEFILZIP,IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARELEFILZIP,IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARELEFILZIP,IMDBDef2.FLD_PARELEFILZIP_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARELEFILZIP,IMDBDef2.FLD_PARELEFILZIP_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARELEFILZIP,IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARELEFILZIP,IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARELEFILZIP,IMDBDef2.FLD_PARELEFILZIP_NOMOGGFILELI, "NOMOGGFILELI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARELEFILZIP,IMDBDef2.FLD_PARELEFILZIP_NOMOGGFILELI,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARELEFILZIP, 0);
  }

  private static void Init_PQRY_PARELEFILZI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARELEFILZI1, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARELEFILZI1, "PQRY_PARELEFILZI1");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARELEFILZI1,IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARELEFILZI1,IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARELEFILZI1,IMDBDef10.PQSL_PARELEFILZI1_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARELEFILZI1,IMDBDef10.PQSL_PARELEFILZI1_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARELEFILZI1,IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARELEFILZI1,IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARELEFILZI1,IMDBDef10.PQSL_PARELEFILZI1_NOMOGGFILELI, "NOMOGGFILELI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARELEFILZI1,IMDBDef10.PQSL_PARELEFILZI1_NOMOGGFILELI,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARELEFILZI1, 0);
  }

  private static void Init_PQRY_PARELEFILZI1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARELEFILZI1_RS, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARELEFILZI1_RS, "PQRY_PARELEFILZI1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARELEFILZI1_RS,IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARELEFILZI1_RS,IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARELEFILZI1_RS,IMDBDef10.PQSL_PARELEFILZI1_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARELEFILZI1_RS,IMDBDef10.PQSL_PARELEFILZI1_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARELEFILZI1_RS,IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARELEFILZI1_RS,IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARELEFILZI1_RS,IMDBDef10.PQSL_PARELEFILZI1_NOMOGGFILELI, "NOMOGGFILELI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARELEFILZI1_RS,IMDBDef10.PQSL_PARELEFILZI1_NOMOGGFILELI,5,2,0);
  }

  private static void Init_PQRY_CFATFILEZIP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CFATFILEZIP, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_CFATFILEZIP, "PQRY_CFATFILEZIP");
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_RECCFANOFIZI, "RECCFANOFIZI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_RECCFANOFIZI,5,300,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_RECFFIZIDACR, "RECFFIZIDACR");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_RECFFIZIDACR,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_SCARIFILEZIP, "SCARIFILEZIP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_SCARIFILEZIP,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_RECORDELIMIN, "RECORDELIMIN");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_RECORDELIMIN,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_RECFFIZIFIAN, "RECFFIZIFIAN");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEZIP,IMDBDef10.PQSL_CFATFILEZIP_RECFFIZIFIAN,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CFATFILEZIP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoFileZIPInviati(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoFileZIPInviati()
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
    FormIdx = MyGlb.FRM_ELEFILZIPINV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D41F6CD7-38CF-4FC3-B573-189A753648EA";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 572;
    DesignHeight = 402;
    set_Caption(new IDVariant("Elenco File ZIP Inviati"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 572;
    Frames[1].Height = 376;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.170213;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 572;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars Elenco File Zip";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARELEFILZIP = new IDPanel(w, this, 2, "PAN_PARELEFILZIP");
    Frames[2].Content = PAN_PARELEFILZIP;
    PAN_PARELEFILZIP.Lockable = false;
    PAN_PARELEFILZIP.iLocked = false;
    PAN_PARELEFILZIP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARELEFILZIP.VS = MainFrm.VisualStyleList;
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 572-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARELEFILZIP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DBAE6A8A-AC36-4561-9CDE-31A29FD3B417");
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 456, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARELEFILZIP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARELEFILZIP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARELEFILZIP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARELEFILZIP.InitStatus = 2;
    PAN_PARELEFILZIP_Init();
    PAN_PARELEFILZIP_InitFields();
    PAN_PARELEFILZIP_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 572;
    Frames[3].Height = 312;
    Frames[3].Caption = "Elenco File ZIP Inviati";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 312;
    PAN_ELEFILZIPINV = new IDPanel(w, this, 3, "PAN_ELEFILZIPINV");
    Frames[3].Content = PAN_ELEFILZIPINV;
    PAN_ELEFILZIPINV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELEFILZIPINV.VS = MainFrm.VisualStyleList;
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 572-MyGlb.PAN_OFFS_X, 312-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELEFILZIPINV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7398864C-CF45-49BF-AC2C-220375B0861A");
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 496, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELEFILZIPINV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELEFILZIPINV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELEFILZIPINV.InitStatus = 2;
    PAN_ELEFILZIPINV_Init();
    PAN_ELEFILZIPINV_InitFields();
    PAN_ELEFILZIPINV_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_ELIMINA4+BaseCmdLinIdx)
      {
        Elimina();
        break fine;
      }
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARELEFILZIP, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELEFILZIPINV_PARELEFILZI1();
      }
      PAN_PARELEFILZIP.UpdatePanel(MainFrm);
      PAN_ELEFILZIPINV.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoFileZIPInviati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoFileZIPInviati.class.getName() : (Glb.ClassWithPackage(ElencoFileZIPInviati.class) ? ElencoFileZIPInviati.class.getName().substring(ElencoFileZIPInviati.class.getPackage().getName().length() + 1) : ElencoFileZIPInviati.class.getName()));
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
      IMDB.set_Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMOGGFILELI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0, IDL.Year(IDL.Today()));
      IMDB.set_Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMOGGENTSPE, 0, (new IDVariant("S")));
      PAN_ELEFILZIPINV.SetFlags (Glb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_PARELEFILZIP.SetFlags (Glb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      creaAggiornaListaPeriodi();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileZIPInviati", "Load", _e);
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
      UNLOAD_PARELEFIZIDE();
      if ((MainFrm.GetForm(MyGlb.FRM_ELENFILEINVI, 0, false)!=null))
      {
        ((ElencoFileInviati)MainFrm.GetForm(MyGlb.FRM_ELENFILEINVI,0)).PAN_ELENFILEINVI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileZIPInviati", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars Elenco File Zip: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARELEFIZIDE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMOGGENTSPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEPERI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMOGGFILELI, 0, new IDVariant());
  }

  // **********************************************************************
  // crea Aggiorna Lista Periodi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int creaAggiornaListaPeriodi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // crea Aggiorna Lista Periodi Body
      // Corpo Procedura
      // 
      PAN_PARELEFILZIP.ClearValueList(PFL_PARELEFILZIP_PERIODO);
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)).equals((new IDVariant(2017)), true))
      {
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Dal 01/01/2017 Al 30/06/2017"));
        IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
        v_S2 = (new IDVariant("Dal 01/07/2017 Al 31/12/2017"));
        PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(1)), v_S1.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(2)), v_S2.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      else
      {
        if (MainFrm.PERINVCOMFAT.equals((new IDVariant("SEMESTRALE")), true))
        {
          IDVariant v_TS1 = null;
          v_TS1 = (new IDVariant("Dal 01/01/|1 Al 30/06/|1"));
          IDVariant v_TS2 = null;
          v_TS2 = (new IDVariant("Dal 01/07/|1 Al 31/12/|1"));
          PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(1)), IDL.FormatMessage(v_TS1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(2)), IDL.FormatMessage(v_TS2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)).equals((new IDVariant(2018)), true))
        {
          IDVariant v_T1 = new IDVariant(0,IDVariant.STRING);
          v_T1 = (new IDVariant("Dal 01/01/|1 Al 31/03/|1"));
          IDVariant v_T2 = new IDVariant(0,IDVariant.STRING);
          v_T2 = (new IDVariant("Dal 01/04/|1 Al 30/06/|1"));
          IDVariant v_T3 = new IDVariant(0,IDVariant.STRING);
          v_T3 = (new IDVariant("Dal 01/07/|1 Al 30/09/|1"));
          IDVariant v_T4 = new IDVariant(0,IDVariant.STRING);
          v_T4 = (new IDVariant("Dal 01/10/|1 Al 31/12/|1"));
          PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(1)), IDL.FormatMessage(v_T1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(2)), IDL.FormatMessage(v_T2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(3)), IDL.FormatMessage(v_T3, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(4)), IDL.FormatMessage(v_T4, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else
        {
          // 
          // Esterometro dal 2019
          // 
          if (MainFrm.PERINVCOFAES.equals((new IDVariant("SEMESTRALE")), true))
          {
            IDVariant v_TS1 = null;
            v_TS1 = (new IDVariant("Dal 01/01/|1 Al 30/06/|1"));
            IDVariant v_TS2 = null;
            v_TS2 = (new IDVariant("Dal 01/07/|1 Al 31/12/|1"));
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(1)), IDL.FormatMessage(v_TS1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(2)), IDL.FormatMessage(v_TS2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          }
          else if (MainFrm.PERINVCOFAES.equals((new IDVariant("TRIMESTRALE")), true))
          {
            IDVariant v_T1 = new IDVariant(0,IDVariant.STRING);
            v_T1 = (new IDVariant("Dal 01/01/|1 Al 31/03/|1"));
            IDVariant v_T2 = new IDVariant(0,IDVariant.STRING);
            v_T2 = (new IDVariant("Dal 01/04/|1 Al 30/06/|1"));
            IDVariant v_T3 = new IDVariant(0,IDVariant.STRING);
            v_T3 = (new IDVariant("Dal 01/07/|1 Al 30/09/|1"));
            IDVariant v_T4 = new IDVariant(0,IDVariant.STRING);
            v_T4 = (new IDVariant("Dal 01/10/|1 Al 31/12/|1"));
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(1)), IDL.FormatMessage(v_T1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(2)), IDL.FormatMessage(v_T2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(3)), IDL.FormatMessage(v_T3, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(4)), IDL.FormatMessage(v_T4, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          }
          else
          {
            // 
            // MENSILE
            // 
            IDVariant v_TES1 = null;
            v_TES1 = IDL.Add((new IDVariant("Gennaio ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES2 = null;
            v_TES2 = IDL.Add((new IDVariant("Febbraio ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES3 = null;
            v_TES3 = IDL.Add((new IDVariant("Marzo ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES4 = null;
            v_TES4 = IDL.Add((new IDVariant("Aprile ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES5 = null;
            v_TES5 = IDL.Add((new IDVariant("Maggio ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES6 = null;
            v_TES6 = IDL.Add((new IDVariant("Giugno ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES7 = null;
            v_TES7 = IDL.Add((new IDVariant("Luglio ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES8 = null;
            v_TES8 = IDL.Add((new IDVariant("Agosto ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES9 = null;
            v_TES9 = IDL.Add((new IDVariant("Settembre ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES10 = null;
            v_TES10 = IDL.Add((new IDVariant("Ottobre ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES11 = null;
            v_TES11 = IDL.Add((new IDVariant("Novembre ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            IDVariant v_TES12 = null;
            v_TES12 = IDL.Add((new IDVariant("Dicembre ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARELEFILZI1, IMDBDef10.PQSL_PARELEFILZI1_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0))));
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(1)), v_TES1.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(2)), v_TES2.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(3)), v_TES3.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(4)), v_TES4.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(5)), v_TES5.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(6)), v_TES6.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(7)), v_TES7.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(8)), v_TES8.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(9)), v_TES9.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(10)), v_TES10.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(11)), v_TES11.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(12)), v_TES12.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          }
        }
      }
      UpdateScreen();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileZIPInviati", "creaAggiornaListaPeriodi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scarica File ZIP
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ScaricaFileZIP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scarica File ZIP Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFATFILEZIP, IMDBDef10.PQSL_CFATFILEZIP_RECCFANOFIZI, 0)))
      {
        return 0;
      }
      MainFrm.BlobindecompObject.DownloadBlobNativo(IMDB.Value(IMDBDef10.PQRY_CFATFILEZIP, IMDBDef10.PQSL_CFATFILEZIP_RECCFANOFIZI, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileZIPInviati", "ScaricaFileZIP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elimina
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Elimina ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elimina Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFATFILEZIP, IMDBDef10.PQSL_CFATFILEZIP_RECCFANOFIZI, 0)))
      {
        return 0;
      }
      if (IMDB.Value(IMDBDef10.PQRY_CFATFILEZIP, IMDBDef10.PQSL_CFATFILEZIP_RECORDELIMIN, 0).equals((new IDVariant("SI")), true))
      {
        IDVariant v_SERR = new IDVariant(0,IDVariant.STRING);
        v_SERR = (new IDVariant("Non è possibile eliminare File già eliminati"));
        MainFrm.set_AlertMessage(v_SERR); 
        return 0;
      }
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  CFAT_FILE_XML A ");
      SQL.append("where (A.NOME_FILE_ZIP = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CFATFILEZIP, IMDBDef10.PQSL_CFATFILEZIP_RECCFANOFIZI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.STATO_FILE_XML <> 'File ZIP Creato') ");
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
        S = (new IDVariant("Uno o più file compressi all'interno dello zip che si sta tentando di eliminare non si trovano nello stato File ZIP Creato. Non è possibile eliminare il File ZIP selezionato"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IDVariant v_S1 = null;
      v_S1 = (new IDVariant("ATTENZIONE. Se il file ZIP è stato già inviato all'Agenzia delle Entrate è sconsigliata la cancellazione.<br/>Proseguire?"));
      if (MainFrm.MessageConfirm(v_S1))
      {
        IDVariant v_STATOAMMESSO = new IDVariant(0,IDVariant.STRING);
        v_STATOAMMESSO = (new IDVariant("File XML creato"));
        MainFrm.Cf4armDBObject.BeginTrans();
        try
        {
          SQL = new StringBuffer();
          SQL.append("update CFAT_FILE_XML set ");
          SQL.append("  NOME_FILE_ZIP = NULL, ");
          SQL.append("  STATO_FILE_XML = " + IDL.CSql(v_STATOAMMESSO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (NOME_FILE_ZIP = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CFATFILEZIP, IMDBDef10.PQSL_CFATFILEZIP_RECCFANOFIZI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          SQL = new StringBuffer();
          SQL.append("update CFAT_FILE_ZIP set ");
          SQL.append("  ELIMINATO = 'SI' ");
          SQL.append("where (NOME_FILE_ZIP = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CFATFILEZIP, IMDBDef10.PQSL_CFATFILEZIP_RECCFANOFIZI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e10)
        {
          MainFrm.set_AlertMessage(new IDVariant(e10.getMessage())); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
        // 
        // tutto ok
        // 
        MainFrm.Cf4armDBObject.CommitTrans();
        PAN_ELEFILZIPINV.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileZIPInviati", "Elimina", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars Elenco File Zip
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELEFILZIPINV_PARELEFILZI1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARELEFILZI1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARELEFILZIP, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARELEFILZIP, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARELEFILZI1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARELEFILZI1_RS, 0, IMDBDef2.TBL_PARELEFILZIP, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARELEFILZI1_RS, 0, 0, IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARELEFILZI1_RS, 1, 0, IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMOGGENTSPE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARELEFILZI1_RS, 2, 0, IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEPERI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARELEFILZI1_RS, 3, 0, IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMOGGFILELI, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARELEFILZIP, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARELEFILZIP, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARELEFILZIP, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARELEFILZI1_RS, 0);
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
  private void PAN_PARELEFILZIP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARELEFILZIP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARELEFILZIP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARELEFILZIP, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARELEFILZIP_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARELEFILZIP);
    // Stub
  }

  private void PAN_PARELEFILZIP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARELEFILZIP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARELEFILZIP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARELEFILZIP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ELEFILZIPINV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELEFILZIPINV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELEFILZIPINV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELEFILZIPINV, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELEFILZIPINV_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELEFILZIPINV);
    // Stub
  }

  private void PAN_ELEFILZIPINV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELEFILZIPINV_SCARIFILEZIP)
    {
      this.IdxPanelActived = this.PAN_ELEFILZIPINV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScaricaFileZIP();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELEFILZIPINV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELEFILZIPINV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELEFILZIPINV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARELEFILZIP_Init()
  {

    PAN_PARELEFILZIP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARELEFILZIP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARELEFILZIP.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARELEFILZIP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, "4601AFE0-2791-481C-87B8-F2B368485A47");
    PAN_PARELEFILZIP.set_Header(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, "Esercizio");
    PAN_PARELEFILZIP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, "");
    PAN_PARELEFILZIP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARELEFILZIP.SetFlags(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARELEFILZIP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, "24283175-0843-492B-9665-81FB00363BAF");
    PAN_PARELEFILZIP.set_Header(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, "Entrata/Spesa");
    PAN_PARELEFILZIP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, "Entrata/Spesa");
    PAN_PARELEFILZIP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARELEFILZIP.SetFlags(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARELEFILZIP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, "660A1DB9-AB05-40BF-AFB4-59B0B20D2CE8");
    PAN_PARELEFILZIP.set_Header(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, "Periodo");
    PAN_PARELEFILZIP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, "");
    PAN_PARELEFILZIP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARELEFILZIP.SetFlags(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARELEFILZIP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, "46929DBA-9080-42E0-BFA7-E5C43AB79D38");
    PAN_PARELEFILZIP.set_Header(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, "File Eliminati");
    PAN_PARELEFILZIP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, "");
    PAN_PARELEFILZIP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARELEFILZIP.SetFlags(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARELEFILZIP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARELEFILZIP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARELEFILZIP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARELEFILZIP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, MyGlb.PANEL_FORM, 4, 8, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARELEFILZIP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, MyGlb.PANEL_FORM, 72);
    PAN_PARELEFILZIP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARELEFILZIP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARELEFILZIP.SetFieldPage(PFL_PARELEFILZIP_ESERCIZIO, -1, -1);
    PAN_PARELEFILZIP.SetFieldPanel(PFL_PARELEFILZIP_ESERCIZIO, PPQRY_PARELEFILZI1, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARELEFILZIP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, MyGlb.PANEL_LIST, 88);
    PAN_PARELEFILZIP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, MyGlb.PANEL_LIST, 1);
    PAN_PARELEFILZIP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, MyGlb.PANEL_LIST, "Entrata/Spesa");
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, MyGlb.PANEL_FORM, 136, 8, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARELEFILZIP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, MyGlb.PANEL_FORM, 104);
    PAN_PARELEFILZIP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, MyGlb.PANEL_FORM, 1);
    PAN_PARELEFILZIP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_ENTRATASPESA, MyGlb.PANEL_FORM, "Entrata/Spesa");
    PAN_PARELEFILZIP.SetFieldPage(PFL_PARELEFILZIP_ENTRATASPESA, -1, -1);
    PAN_PARELEFILZIP.SetFieldPanel(PFL_PARELEFILZIP_ENTRATASPESA, PPQRY_PARELEFILZI1, "A.NOMOGGENTSPE", "NOMOGGENTSPE", 5, 1, 0, -13997);
    PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_ENTRATASPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_ENTRATASPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARELEFILZIP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, MyGlb.PANEL_LIST, 52);
    PAN_PARELEFILZIP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_PARELEFILZIP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, MyGlb.PANEL_LIST, "Periodo");
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, MyGlb.PANEL_FORM, 24, 32, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARELEFILZIP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, MyGlb.PANEL_FORM, 52);
    PAN_PARELEFILZIP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_PARELEFILZIP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_PERIODO, MyGlb.PANEL_FORM, "Periodo");
    PAN_PARELEFILZIP.SetFieldPage(PFL_PARELEFILZIP_PERIODO, -1, -1);
    PAN_PARELEFILZIP.SetFieldPanel(PFL_PARELEFILZIP_PERIODO, PPQRY_PARELEFILZI1, "A.NOMEOGGEPERI", "NOMEOGGEPERI", 1, 1, 0, -13997);
    PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(1)), "Dal 01/01/2XXX Al 31/03/2XXX", "", "", -1);
    PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(2)), "Dal 01/04/2XXX Al 30/06/2XXX", "", "", -1);
    PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(3)), "Dal 01/07/2XXX Al 30/09/2XXX", "", "", -1);
    PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_PERIODO, (new IDVariant(4)), "Dal 01/10/2XXX Al 31/12/2XXX", "", "", -1);
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARELEFILZIP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, MyGlb.PANEL_LIST, 60);
    PAN_PARELEFILZIP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, MyGlb.PANEL_LIST, 1);
    PAN_PARELEFILZIP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, MyGlb.PANEL_LIST, "File Eliminati");
    PAN_PARELEFILZIP.SetRect(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, MyGlb.PANEL_FORM, 264, 32, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARELEFILZIP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, MyGlb.PANEL_FORM, 84);
    PAN_PARELEFILZIP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, MyGlb.PANEL_FORM, 1);
    PAN_PARELEFILZIP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARELEFILZIP_FILEELIMINAT, MyGlb.PANEL_FORM, "File Eliminati");
    PAN_PARELEFILZIP.SetFieldPage(PFL_PARELEFILZIP_FILEELIMINAT, -1, -1);
    PAN_PARELEFILZIP.SetFieldPanel(PFL_PARELEFILZIP_FILEELIMINAT, PPQRY_PARELEFILZI1, "A.NOMOGGFILELI", "NOMOGGFILELI", 5, 2, 0, -13997);
    PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_FILEELIMINAT, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARELEFILZIP.SetValueListItem(PFL_PARELEFILZIP_FILEELIMINAT, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARELEFILZIP_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARELEFILZIP.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO ) as ESEFINESERC1 ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~NOMEOGGEESER~~) ");
    SQL.append("and   ((A.ESERCIZIO BETWEEN 2017 AND TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')))) ");
    PAN_PARELEFILZIP.SetQuery(PPQRY_ESERCIFINANZ, 0, SQL, PFL_PARELEFILZIP_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO ) as ESEFINESERC1 ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where ((A.ESERCIZIO BETWEEN 2017 AND TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')))) ");
    PAN_PARELEFILZIP.SetQuery(PPQRY_ESERCIFINANZ, 1, SQL, PFL_PARELEFILZIP_ESERCIZIO, "");
    PAN_PARELEFILZIP.SetQueryDB(PPQRY_ESERCIFINANZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARELEFILZIP.SetIMDB(IMDB, "PQRY_PARELEFILZI1", true);
    PAN_PARELEFILZIP.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARELEFILZIP.SetQueryIMDB(PPQRY_PARELEFILZI1, IMDBDef10.PQRY_PARELEFILZI1_RS, IMDBDef2.TBL_PARELEFILZIP);
    JustLoaded = true;
    PAN_PARELEFILZIP.SetFieldPrimaryIndex(PFL_PARELEFILZIP_ESERCIZIO, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEESER);
    PAN_PARELEFILZIP.SetFieldPrimaryIndex(PFL_PARELEFILZIP_ENTRATASPESA, IMDBDef2.FLD_PARELEFILZIP_NOMOGGENTSPE);
    PAN_PARELEFILZIP.SetFieldPrimaryIndex(PFL_PARELEFILZIP_PERIODO, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEPERI);
    PAN_PARELEFILZIP.SetFieldPrimaryIndex(PFL_PARELEFILZIP_FILEELIMINAT, IMDBDef2.FLD_PARELEFILZIP_NOMOGGFILELI);
    PAN_PARELEFILZIP.SetMasterTable(0, "PARELEFILZIP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARELEFILZIP.Status() == 2)
    {
      int oldListQBE = PAN_PARELEFILZIP.iUseListQBE;
      PAN_PARELEFILZIP.iUseListQBE = 0;
      PAN_PARELEFILZIP.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARELEFILZIP.PanelCommand(Glb.PCM_FIND);
      PAN_PARELEFILZIP.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ELEFILZIPINV_Init()
  {

    PAN_ELEFILZIPINV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELEFILZIPINV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELEFILZIPINV.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_ELEFILZIPINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, "C8076AAB-1895-43FE-A7D5-0C733ABFB31C");
    PAN_ELEFILZIPINV.set_Header(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, "Nome File ZIP");
    PAN_ELEFILZIPINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, "");
    PAN_ELEFILZIPINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELEFILZIPINV.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELEFILZIPINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, "CC2AAE0B-F097-4A47-945B-E34D780641D4");
    PAN_ELEFILZIPINV.set_Header(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, " ");
    PAN_ELEFILZIPINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, "Scarica FIle ZIP");
    PAN_ELEFILZIPINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELEFILZIPINV.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELEFILZIPINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, "E1A49875-24AC-4ED3-AC29-CE9A10EFC03E");
    PAN_ELEFILZIPINV.set_Header(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, "File di Annullo");
    PAN_ELEFILZIPINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, "");
    PAN_ELEFILZIPINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, MyGlb.VIS_CHECKSTYLE);
    PAN_ELEFILZIPINV.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELEFILZIPINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, "6A3DA45B-93E5-4DF8-893D-09C9B16B77AD");
    PAN_ELEFILZIPINV.set_Header(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, "Data Creazione");
    PAN_ELEFILZIPINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, "");
    PAN_ELEFILZIPINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, MyGlb.VIS_NORMALFIELDS);
    PAN_ELEFILZIPINV.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELEFILZIPINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, "87ABCE37-0B48-49FD-8238-9AE20EBDE4CC");
    PAN_ELEFILZIPINV.set_Header(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, "Eliminato");
    PAN_ELEFILZIPINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, "");
    PAN_ELEFILZIPINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, MyGlb.VIS_CHECKSTYLE);
    PAN_ELEFILZIPINV.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELEFILZIPINV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, MyGlb.PANEL_LIST, 0, 36, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, MyGlb.PANEL_LIST, 88);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, MyGlb.PANEL_LIST, 1);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, MyGlb.PANEL_LIST, "Nome File ZIP");
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, MyGlb.PANEL_FORM, 4, 4, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, MyGlb.PANEL_FORM, 88);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, MyGlb.PANEL_FORM, 2);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_NOMEFILEZIP, MyGlb.PANEL_FORM, "Nome File ZIP");
    PAN_ELEFILZIPINV.SetFieldPage(PFL_ELEFILZIPINV_NOMEFILEZIP, -1, -1);
    PAN_ELEFILZIPINV.SetFieldPanel(PFL_ELEFILZIPINV_NOMEFILEZIP, PPQRY_CFATFILEZIP, "A.NOME_FILE_ZIP", "RECCFANOFIZI", 5, 300, 0, -13997);
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, MyGlb.PANEL_LIST, 288, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, MyGlb.PANEL_LIST, 96);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, MyGlb.PANEL_LIST, 1);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, MyGlb.PANEL_LIST, " ");
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, MyGlb.PANEL_FORM, 4, 52, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, MyGlb.PANEL_FORM, 96);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, MyGlb.PANEL_FORM, 1);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_SCARIFILEZIP, MyGlb.PANEL_FORM, " ");
    PAN_ELEFILZIPINV.SetFieldPage(PFL_ELEFILZIPINV_SCARIFILEZIP, -1, -1);
    PAN_ELEFILZIPINV.SetFieldUnbound(PFL_ELEFILZIPINV_SCARIFILEZIP, true);
    PAN_ELEFILZIPINV.SetFieldPanel(PFL_ELEFILZIPINV_SCARIFILEZIP, PPQRY_CFATFILEZIP, "'T'", "SCARIFILEZIP", 5, 1, 0, -13997);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_SCARIFILEZIP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, MyGlb.PANEL_LIST, 308, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, MyGlb.PANEL_LIST, 84);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, MyGlb.PANEL_LIST, 1);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, MyGlb.PANEL_LIST, "File di Annullo");
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, MyGlb.PANEL_FORM, 4, 124, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, MyGlb.PANEL_FORM, 84);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, MyGlb.PANEL_FORM, 1);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_FILEANNULLI, MyGlb.PANEL_FORM, "File di Annullo");
    PAN_ELEFILZIPINV.SetFieldPage(PFL_ELEFILZIPINV_FILEANNULLI, -1, -1);
    PAN_ELEFILZIPINV.SetFieldPanel(PFL_ELEFILZIPINV_FILEANNULLI, PPQRY_CFATFILEZIP, "A.FILE_ANNULLI", "RECFFIZIFIAN", 5, 2, 0, -13997);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_FILEANNULLI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_FILEANNULLI, (new IDVariant()), "Null", "", "", -1);
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, MyGlb.PANEL_LIST, 360, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, MyGlb.PANEL_LIST, 104);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, MyGlb.PANEL_LIST, 1);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, MyGlb.PANEL_LIST, "Data Creazione");
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, MyGlb.PANEL_FORM, 4, 76, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, MyGlb.PANEL_FORM, 104);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, MyGlb.PANEL_FORM, 1);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_DATACREAZION, MyGlb.PANEL_FORM, "Data Creazione");
    PAN_ELEFILZIPINV.SetFieldPage(PFL_ELEFILZIPINV_DATACREAZION, -1, -1);
    PAN_ELEFILZIPINV.SetFieldPanel(PFL_ELEFILZIPINV_DATACREAZION, PPQRY_CFATFILEZIP, "A.DATA_CREAZIONE", "RECFFIZIDACR", 6, 10, 0, -13997);
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, MyGlb.PANEL_LIST, 436, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, MyGlb.PANEL_LIST, 72);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, MyGlb.PANEL_LIST, 1);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, MyGlb.PANEL_LIST, "Eliminato");
    PAN_ELEFILZIPINV.SetRect(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, MyGlb.PANEL_FORM, 4, 100, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEFILZIPINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, MyGlb.PANEL_FORM, 72);
    PAN_ELEFILZIPINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, MyGlb.PANEL_FORM, 1);
    PAN_ELEFILZIPINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEFILZIPINV_ELIMINATO, MyGlb.PANEL_FORM, "Eliminato");
    PAN_ELEFILZIPINV.SetFieldPage(PFL_ELEFILZIPINV_ELIMINATO, -1, -1);
    PAN_ELEFILZIPINV.SetFieldPanel(PFL_ELEFILZIPINV_ELIMINATO, PPQRY_CFATFILEZIP, "A.ELIMINATO", "RECORDELIMIN", 5, 2, 0, -13997);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_ELIMINATO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELEFILZIPINV.SetValueListItem(PFL_ELEFILZIPINV_ELIMINATO, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_ELEFILZIPINV_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELEFILZIPINV.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELEFILZIPINV.SetIMDB(IMDB, "PQRY_CFATFILEZIP", true);
    PAN_ELEFILZIPINV.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NOME_FILE_ZIP as RECCFANOFIZI, ");
    SQL.append("  A.DATA_CREAZIONE as RECFFIZIDACR, ");
    SQL.append("  'T' as SCARIFILEZIP, ");
    SQL.append("  A.ELIMINATO as RECORDELIMIN, ");
    SQL.append("  A.FILE_ANNULLI as RECFFIZIFIAN ");
    PAN_ELEFILZIPINV.SetQuery(PPQRY_CFATFILEZIP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CFAT_FILE_ZIP A ");
    PAN_ELEFILZIPINV.SetQuery(PPQRY_CFATFILEZIP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~PQRY_PARELEFILZI1.NOMOGGENTSPE~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_PARELEFILZI1.NOMEOGGEESER~~) ");
    SQL.append("and   ((~~PQRY_PARELEFILZI1.NOMEOGGEPERI~~ IS NULL) OR COMUNICAZIONE_FATTURE.GET_TRIMESTER_FROM_DATA_RIF(A.DATA_RIF," + IDL.CSql(MainFrm.PERINVCOMFAT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PERINVCOFAES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") = ~~PQRY_PARELEFILZI1.NOMEOGGEPERI~~) ");
    SQL.append("and   ((A.ELIMINATO IS NULL) OR (A.ELIMINATO = ~~PQRY_PARELEFILZI1.NOMOGGFILELI~~ AND A.ELIMINATO = 'SI')) ");
    PAN_ELEFILZIPINV.SetQuery(PPQRY_CFATFILEZIP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELEFILZIPINV.SetQuery(PPQRY_CFATFILEZIP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELEFILZIPINV.SetQuery(PPQRY_CFATFILEZIP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DATA_CREAZIONE ");
    PAN_ELEFILZIPINV.SetQuery(PPQRY_CFATFILEZIP, 5, SQL, -1, "");
    PAN_ELEFILZIPINV.SetQueryDB(PPQRY_CFATFILEZIP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELEFILZIPINV.SetMasterTable(0, "CFAT_FILE_ZIP");
    PAN_ELEFILZIPINV.AddToSortList(PFL_ELEFILZIPINV_DATACREAZION, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELEFILZIPINV.Status() == 2)
    {
      int oldListQBE = PAN_ELEFILZIPINV.iUseListQBE;
      PAN_ELEFILZIPINV.iUseListQBE = 0;
      PAN_ELEFILZIPINV.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELEFILZIPINV.PanelCommand(Glb.PCM_FIND);
      PAN_ELEFILZIPINV.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARELEFILZIP) PAN_PARELEFILZIP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ELEFILZIPINV) PAN_ELEFILZIPINV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARELEFILZIP) PAN_PARELEFILZIP_ValidateRow(Cancel);
    if (SrcObj == PAN_ELEFILZIPINV) PAN_ELEFILZIPINV_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARELEFILZIP) PAN_PARELEFILZIP_DynamicProperties();
    if (SrcObj == PAN_ELEFILZIPINV) PAN_ELEFILZIPINV_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARELEFILZIP) PAN_PARELEFILZIP_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ELEFILZIPINV) PAN_ELEFILZIPINV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARELEFILZIP) PAN_PARELEFILZIP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ELEFILZIPINV) PAN_ELEFILZIPINV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
