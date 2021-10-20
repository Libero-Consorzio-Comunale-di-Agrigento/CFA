// **********************************************
// FCDDE Info Incassato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FCDDEInfoIncassato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARINFINCFCD_ESERCIZIO = 0;
  private static int PFL_PARINFINCFCD_CAPITOLOARTI = 1;
  private static int PFL_PARINFINCFCD_TIPOLOCATEGO = 2;
  private static int PFL_PARINFINCFCD_DESCRIZIONE = 3;

  private static int PPQRY_PARINFINCFC2 = 0;


  IDPanel PAN_PARINFINCFCD;
  private static int GRP_INFOINCASSAT_ORDINATIVO = 0;

  private static int PFL_INFOINCASSAT_ANNOORD = 0;
  private static int PFL_INFOINCASSAT_NUMEROORD = 1;
  private static int PFL_INFOINCASSAT_ETICHETOTALE = 2;
  private static int PFL_INFOINCASSAT_IMPORTO = 3;
  private static int PFL_INFOINCASSAT_SOMMADIIMPOR = 4;

  private static int PPQRY_FSCDETACCER2 = 0;


  IDPanel PAN_INFOINCASSAT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARINFINCFC3(IMDB);
    //
    //
    Init_PQRY_PARINFINCFC2(IMDB);
    Init_PQRY_PARINFINCFC2_RS(IMDB);
    Init_PQRY_FSCDETACCER2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARINFINCFC3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARINFINCFC3, 8);
    IMDB.set_TblCode(IMDBDef3.TBL_PARINFINCFC3, "TBL_PARINFINCFC3");
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCLA, "NOMOGGTIPCLA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCLA,5,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOOGTICANUOR, "NOOGTICANUOR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOOGTICANUOR,5,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMOGGPERRIF, "NOMOGGPERRIF");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMOGGPERRIF,5,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCAT, "NOMOGGTIPCAT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCAT,5,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFINCFC3,IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEDESC,5,140,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARINFINCFC3, 0);
  }

  private static void Init_PQRY_PARINFINCFC2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARINFINCFC2, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARINFINCFC2, "PQRY_PARINFINCFC2");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFINCFC2,IMDBDef11.PQSL_PARINFINCFC2_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFINCFC2,IMDBDef11.PQSL_PARINFINCFC2_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFINCFC2,IMDBDef11.PQSL_PARINFINCFC2_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFINCFC2,IMDBDef11.PQSL_PARINFINCFC2_RECORDCAPITO,5,201,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFINCFC2,IMDBDef11.PQSL_PARINFINCFC2_NOMOGGTIPCAT, "NOMOGGTIPCAT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFINCFC2,IMDBDef11.PQSL_PARINFINCFC2_NOMOGGTIPCAT,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFINCFC2,IMDBDef11.PQSL_PARINFINCFC2_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFINCFC2,IMDBDef11.PQSL_PARINFINCFC2_NOMEOGGEDESC,5,140,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARINFINCFC2, 0);
  }

  private static void Init_PQRY_PARINFINCFC2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARINFINCFC2_RS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARINFINCFC2_RS, "PQRY_PARINFINCFC2_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFINCFC2_RS,IMDBDef11.PQSL_PARINFINCFC2_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFINCFC2_RS,IMDBDef11.PQSL_PARINFINCFC2_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFINCFC2_RS,IMDBDef11.PQSL_PARINFINCFC2_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFINCFC2_RS,IMDBDef11.PQSL_PARINFINCFC2_RECORDCAPITO,5,201,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFINCFC2_RS,IMDBDef11.PQSL_PARINFINCFC2_NOMOGGTIPCAT, "NOMOGGTIPCAT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFINCFC2_RS,IMDBDef11.PQSL_PARINFINCFC2_NOMOGGTIPCAT,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFINCFC2_RS,IMDBDef11.PQSL_PARINFINCFC2_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFINCFC2_RS,IMDBDef11.PQSL_PARINFINCFC2_NOMEOGGEDESC,5,140,0);
  }

  private static void Init_PQRY_FSCDETACCER2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FSCDETACCER2, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_FSCDETACCER2, "PQRY_FSCDETACCER2");
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCDETACCER2,IMDBDef11.PQSL_FSCDETACCER2_REFSDEINANOR, "REFSDEINANOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCDETACCER2,IMDBDef11.PQSL_FSCDETACCER2_REFSDEINANOR,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCDETACCER2,IMDBDef11.PQSL_FSCDETACCER2_REFSDEINNUOR, "REFSDEINNUOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCDETACCER2,IMDBDef11.PQSL_FSCDETACCER2_REFSDEINNUOR,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCDETACCER2,IMDBDef11.PQSL_FSCDETACCER2_RECFSCDEINIM, "RECFSCDEINIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCDETACCER2,IMDBDef11.PQSL_FSCDETACCER2_RECFSCDEINIM,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_FSCDETACCER2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FCDDEInfoIncassato(MyWebEntryPoint w, IMDBObj imdb)
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
  public FCDDEInfoIncassato()
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
    FormIdx = MyGlb.FRM_FCDDINFOINCA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9EE0B907-82C1-466D-BF07-C87CAED0397B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2131;
    DesignWidth = 376;
    DesignHeight = 434;
    set_Caption(new IDVariant("Dettaglio Incassato"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 376;
    Frames[1].Height = 408;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.27451;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 376;
    Frames[2].Height = 112;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Info Incassato Fcdde";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 112;
    PAN_PARINFINCFCD = new IDPanel(w, this, 2, "PAN_PARINFINCFCD");
    Frames[2].Content = PAN_PARINFINCFCD;
    PAN_PARINFINCFCD.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARINFINCFCD.VS = MainFrm.VisualStyleList;
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 376-MyGlb.PAN_OFFS_X, 112-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARINFINCFCD.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6B3CE628-AC8F-4CAC-9B59-7069A1379C56");
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1044, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARINFINCFCD.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARINFINCFCD.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARINFINCFCD.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARINFINCFCD.InitStatus = 1;
    PAN_PARINFINCFCD_Init();
    PAN_PARINFINCFCD_InitFields();
    PAN_PARINFINCFCD_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 376;
    Frames[3].Height = 296;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Info Incassato";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 296;
    PAN_INFOINCASSAT = new IDPanel(w, this, 3, "PAN_INFOINCASSAT");
    Frames[3].Content = PAN_INFOINCASSAT;
    PAN_INFOINCASSAT.ShowRowSelector = false;
    PAN_INFOINCASSAT.ShowToolbar = false;
    PAN_INFOINCASSAT.ShowStatusbar = false;
    PAN_INFOINCASSAT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INFOINCASSAT.VS = MainFrm.VisualStyleList;
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 376-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INFOINCASSAT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C30BAFC5-C871-494D-9B06-237361401955");
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 20, 0, 312, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_INFOINCASSAT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INFOINCASSAT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INFOINCASSAT.InitStatus = 1;
    PAN_INFOINCASSAT_Init();
    PAN_INFOINCASSAT_InitFields();
    PAN_INFOINCASSAT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARINFINCFC3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FCDDINFOINCA_PARINFINCFC2();
      }
      PAN_PARINFINCFCD.UpdatePanel(MainFrm);
      PAN_INFOINCASSAT.UpdatePanel(MainFrm);
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
    return (obj instanceof FCDDEInfoIncassato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FCDDEInfoIncassato.class.getName() : (Glb.ClassWithPackage(FCDDEInfoIncassato.class) ? FCDDEInfoIncassato.class.getName().substring(FCDDEInfoIncassato.class.getPackage().getName().length() + 1) : FCDDEInfoIncassato.class.getName()));
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
      PAN_PARINFINCFCD.SetFlags (Glb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_PARINFINCFCD.SetFlags (Glb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      switch (1) // Allows the use of BREAK inside ifs
      {
        default:
        if (IMDB.Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCLA, 0).equals((new IDVariant("TIP"))))	
        {
          PAN_PARINFINCFCD.SetFlags (Glb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else if (IMDB.Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCLA, 0).equals((new IDVariant("CAP"))))	
        {
          PAN_PARINFINCFCD.SetFlags (Glb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        break;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEInfoIncassato", "Load", _e);
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
      UNLOAD_PARINFINFCDE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEInfoIncassato", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri Info Incassato Fcdde: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARINFINFCDE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCLA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOOGTICANUOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMOGGPERRIF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEDESC, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Info Incassato Fcdde
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void FCDDINFOINCA_PARINFINCFC2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARINFINCFC2_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARINFINCFC3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARINFINCFC3, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARINFINCFC2_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARINFINCFC2_RS, 0, IMDBDef3.TBL_PARINFINCFC3, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARINFINCFC2_RS, 0, 0, IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEESER, 0);
      IMDB.set_Value(IMDBDef11.PQRY_PARINFINCFC2_RS, 1, 0, IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGECAPI, 0)), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEARTI, 0))));
      IMDB.TblLinkField(IMDBDef11.PQRY_PARINFINCFC2_RS, 2, 0, IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCAT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARINFINCFC2_RS, 3, 0, IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEDESC, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARINFINCFC3, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARINFINCFC3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARINFINCFC3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARINFINCFC2_RS, 0);
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
  private void PAN_PARINFINCFCD_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARINFINCFCD, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARINFINCFCD_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARINFINCFCD, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARINFINCFCD_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARINFINCFCD);
    // Stub
  }

  private void PAN_PARINFINCFCD_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARINFINCFCD_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARINFINCFCD_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARINFINCFCD_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_INFOINCASSAT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INFOINCASSAT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INFOINCASSAT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INFOINCASSAT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INFOINCASSAT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_INFOINCASSAT);
    // Stub
  }

  private void PAN_INFOINCASSAT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_INFOINCASSAT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INFOINCASSAT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INFOINCASSAT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARINFINCFCD_Init()
  {

    PAN_PARINFINCFCD.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARINFINCFCD.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARINFINCFCD.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARINFINCFCD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, "4275A4BD-4E7A-4B85-BEA4-A0232BAC0079");
    PAN_PARINFINCFCD.set_Header(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, "Esercizio");
    PAN_PARINFINCFCD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, "");
    PAN_PARINFINCFCD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARINFINCFCD.SetFlags(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PARINFINCFCD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, "FF0C4FB0-36AA-4FAD-B4B9-6F16ACEA561B");
    PAN_PARINFINCFCD.set_Header(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, "Capitolo/Articolo");
    PAN_PARINFINCFCD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, "");
    PAN_PARINFINCFCD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARINFINCFCD.SetFlags(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARINFINCFCD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, "CD68EAC6-E464-4E07-9751-3BE6B15E5059");
    PAN_PARINFINCFCD.set_Header(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, "Tipologia ");
    PAN_PARINFINCFCD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, "");
    PAN_PARINFINCFCD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARINFINCFCD.SetFlags(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARINFINCFCD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, "2998EE62-D95E-466B-892B-E5D651A76EC9");
    PAN_PARINFINCFCD.set_Header(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, "Descrizione");
    PAN_PARINFINCFCD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, "");
    PAN_PARINFINCFCD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARINFINCFCD.SetFlags(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARINFINCFCD_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFINCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARINFINCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARINFINCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, MyGlb.PANEL_FORM, 48, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFINCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARINFINCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARINFINCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARINFINCFCD.SetFieldPage(PFL_PARINFINCFCD_ESERCIZIO, -1, -1);
    PAN_PARINFINCFCD.SetFieldPanel(PFL_PARINFINCFCD_ESERCIZIO, PPQRY_PARINFINCFC2, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, MyGlb.PANEL_LIST, 0, 36, 508, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARINFINCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, MyGlb.PANEL_LIST, 104);
    PAN_PARINFINCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, MyGlb.PANEL_LIST, 2);
    PAN_PARINFINCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, MyGlb.PANEL_LIST, "Capitolo/Articolo");
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, MyGlb.PANEL_FORM, 4, 28, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFINCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, MyGlb.PANEL_FORM, 104);
    PAN_PARINFINCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, MyGlb.PANEL_FORM, 1);
    PAN_PARINFINCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_CAPITOLOARTI, MyGlb.PANEL_FORM, "Capitolo/Articolo");
    PAN_PARINFINCFCD.SetFieldPage(PFL_PARINFINCFCD_CAPITOLOARTI, -1, -1);
    PAN_PARINFINCFCD.SetFieldUnbound(PFL_PARINFINCFCD_CAPITOLOARTI, true);
    PAN_PARINFINCFCD.SetFieldPanel(PFL_PARINFINCFCD_CAPITOLOARTI, PPQRY_PARINFINCFC2, "", "RECORDCAPITO", 5, 201, 0, -13997);
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFINCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, MyGlb.PANEL_LIST, 120);
    PAN_PARINFINCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, MyGlb.PANEL_LIST, 1);
    PAN_PARINFINCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, MyGlb.PANEL_LIST, "Tipologia ");
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, MyGlb.PANEL_FORM, 48, 28, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFINCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, MyGlb.PANEL_FORM, 60);
    PAN_PARINFINCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, MyGlb.PANEL_FORM, 1);
    PAN_PARINFINCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_TIPOLOCATEGO, MyGlb.PANEL_FORM, "Tipologia ");
    PAN_PARINFINCFCD.SetFieldPage(PFL_PARINFINCFCD_TIPOLOCATEGO, -1, -1);
    PAN_PARINFINCFCD.SetFieldPanel(PFL_PARINFINCFCD_TIPOLOCATEGO, PPQRY_PARINFINCFC2, "A.NOMOGGTIPCAT", "NOMOGGTIPCAT", 5, 10, 0, -13997);
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARINFINCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PARINFINCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARINFINCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARINFINCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 52, 300, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFINCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARINFINCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_PARINFINCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFINCFCD_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARINFINCFCD.SetFieldPage(PFL_PARINFINCFCD_DESCRIZIONE, -1, -1);
    PAN_PARINFINCFCD.SetFieldPanel(PFL_PARINFINCFCD_DESCRIZIONE, PPQRY_PARINFINCFC2, "A.NOMEOGGEDESC", "NOMEOGGEDESC", 5, 140, 0, -13997);
  }

  private void PAN_PARINFINCFCD_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARINFINCFCD.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARINFINCFCD.SetIMDB(IMDB, "PQRY_PARINFINCFC2", true);
    PAN_PARINFINCFCD.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARINFINCFCD.SetQueryIMDB(PPQRY_PARINFINCFC2, IMDBDef11.PQRY_PARINFINCFC2_RS, IMDBDef3.TBL_PARINFINCFC3);
    JustLoaded = true;
    PAN_PARINFINCFCD.SetFieldPrimaryIndex(PFL_PARINFINCFCD_ESERCIZIO, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEESER);
    PAN_PARINFINCFCD.SetFieldPrimaryIndex(PFL_PARINFINCFCD_TIPOLOCATEGO, IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCAT);
    PAN_PARINFINCFCD.SetFieldPrimaryIndex(PFL_PARINFINCFCD_DESCRIZIONE, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEDESC);
    PAN_PARINFINCFCD.SetMasterTable(0, "PARINFINCFC3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARINFINCFCD.Status() == 2)
    {
      int oldListQBE = PAN_PARINFINCFCD.iUseListQBE;
      PAN_PARINFINCFCD.iUseListQBE = 0;
      PAN_PARINFINCFCD.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARINFINCFCD.PanelCommand(Glb.PCM_FIND);
      PAN_PARINFINCFCD.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_INFOINCASSAT_Init()
  {

    PAN_INFOINCASSAT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INFOINCASSAT.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_INFOINCASSAT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, "1968A18A-B325-495D-AEF6-4E3A11E79498");
    PAN_INFOINCASSAT.set_Header(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, "Ordinativo");
    PAN_INFOINCASSAT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, "");
    PAN_INFOINCASSAT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, MyGlb.VIS_DEFAPANESTYL);
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, MyGlb.PANEL_LIST, 20, -9999, 152, 16, 0, 0);
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, MyGlb.PANEL_FORM, 0, 51, 136, 73, 0, 0);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, 0, 59);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, 1, 13);
    PAN_INFOINCASSAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, 0, 4);
    PAN_INFOINCASSAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, 1, 4);
    PAN_INFOINCASSAT.SetFlags(MyGlb.OBJ_GROUP, GRP_INFOINCASSAT_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INFOINCASSAT.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_INFOINCASSAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, "149695BB-1430-44A3-B436-AD7AE0D5AC55");
    PAN_INFOINCASSAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, "Anno");
    PAN_INFOINCASSAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, "");
    PAN_INFOINCASSAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_INFOINCASSAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_INFOINCASSAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, "7FE44B1E-2FDF-4A29-A0F5-272ED1134907");
    PAN_INFOINCASSAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, "Numero");
    PAN_INFOINCASSAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, "");
    PAN_INFOINCASSAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_INFOINCASSAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_INFOINCASSAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, "DC606AE8-2AA3-442C-95E2-F31D25AA5494");
    PAN_INFOINCASSAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, "Totale");
    PAN_INFOINCASSAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, MyGlb.VIS_ETICGRASIMPO);
    PAN_INFOINCASSAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INFOINCASSAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, "7459FD49-EC08-4FBC-B5F2-18EB3E17567C");
    PAN_INFOINCASSAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, "Importo");
    PAN_INFOINCASSAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, "");
    PAN_INFOINCASSAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOINCASSAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOINCASSAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, "40917762-11BB-4C4A-A55C-6BC372093FBA");
    PAN_INFOINCASSAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, " ");
    PAN_INFOINCASSAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, "0");
    PAN_INFOINCASSAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, MyGlb.VIS_DISABIIMPORT);
    PAN_INFOINCASSAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INFOINCASSAT.SetSumField(PFL_INFOINCASSAT_SOMMADIIMPOR, PFL_INFOINCASSAT_IMPORTO);
  }

  private void PAN_INFOINCASSAT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, MyGlb.PANEL_LIST, 20, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, MyGlb.PANEL_LIST, 68);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_INFOINCASSAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, MyGlb.PANEL_LIST, "Anno");
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, MyGlb.PANEL_FORM, 68);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_INFOINCASSAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ANNOORD, MyGlb.PANEL_FORM, "Anno");
    PAN_INFOINCASSAT.SetFieldPage(PFL_INFOINCASSAT_ANNOORD, -1, GRP_INFOINCASSAT_ORDINATIVO);
    PAN_INFOINCASSAT.SetFieldPanel(PFL_INFOINCASSAT_ANNOORD, PPQRY_FSCDETACCER2, "A.ANNO_ORD", "REFSDEINANOR", 1, 4, 0, -13997);
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, MyGlb.PANEL_LIST, 88, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, MyGlb.PANEL_LIST, 84);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_INFOINCASSAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, MyGlb.PANEL_LIST, "Numero");
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, MyGlb.PANEL_FORM, 4, 100, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, MyGlb.PANEL_FORM, 84);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_INFOINCASSAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_NUMEROORD, MyGlb.PANEL_FORM, "Numero");
    PAN_INFOINCASSAT.SetFieldPage(PFL_INFOINCASSAT_NUMEROORD, -1, GRP_INFOINCASSAT_ORDINATIVO);
    PAN_INFOINCASSAT.SetFieldPanel(PFL_INFOINCASSAT_NUMEROORD, PPQRY_FSCDETACCER2, "A.NUMERO_ORD", "REFSDEINNUOR", 1, 5, 0, -13997);
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, MyGlb.PANEL_LIST, 88, 260, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, MyGlb.PANEL_FORM, 0, 0, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_INFOINCASSAT.SetFieldPage(PFL_INFOINCASSAT_ETICHETOTALE, -1, GRP_INFOINCASSAT_ORDINATIVO);
    PAN_INFOINCASSAT.SetFieldPanel(PFL_INFOINCASSAT_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_INFOINCASSAT.set_Mask(PFL_INFOINCASSAT_ETICHETOTALE, "####0");
    PAN_INFOINCASSAT.set_Alignment(PFL_INFOINCASSAT_ETICHETOTALE, 4);
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, MyGlb.PANEL_LIST, 172, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_INFOINCASSAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_INFOINCASSAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_INFOINCASSAT.SetFieldPage(PFL_INFOINCASSAT_IMPORTO, -1, -1);
    PAN_INFOINCASSAT.SetFieldPanel(PFL_INFOINCASSAT_IMPORTO, PPQRY_FSCDETACCER2, "A.IMPORTO", "RECFSCDEINIM", 3, 14, 2, -13997);
    PAN_INFOINCASSAT.set_Mask(PFL_INFOINCASSAT_IMPORTO, "#,##0.00");
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, MyGlb.PANEL_LIST, 172, 260, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, MyGlb.PANEL_LIST, 0);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, MyGlb.PANEL_LIST, 1);
    PAN_INFOINCASSAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, MyGlb.PANEL_FORM, 0, 0, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOINCASSAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, MyGlb.PANEL_FORM, 0);
    PAN_INFOINCASSAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOINCASSAT_SOMMADIIMPOR, MyGlb.PANEL_FORM, 1);
    PAN_INFOINCASSAT.SetFieldPage(PFL_INFOINCASSAT_SOMMADIIMPOR, -1, -1);
    PAN_INFOINCASSAT.SetFieldPanel(PFL_INFOINCASSAT_SOMMADIIMPOR, -1, "", "SOMMADIIMPOR", 0, 0, 0, -13997);
    PAN_INFOINCASSAT.set_Mask(PFL_INFOINCASSAT_SOMMADIIMPOR, "#,##0.00");
    PAN_INFOINCASSAT.set_Alignment(PFL_INFOINCASSAT_SOMMADIIMPOR, 4);
  }

  private void PAN_INFOINCASSAT_InitQueries()
  {
    StringBuffer SQL;

    PAN_INFOINCASSAT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_INFOINCASSAT.SetIMDB(IMDB, "PQRY_FSCDETACCER2", true);
    PAN_INFOINCASSAT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_ORD as REFSDEINANOR, ");
    SQL.append("  A.NUMERO_ORD as REFSDEINNUOR, ");
    SQL.append("  A.IMPORTO as RECFSCDEINIM ");
    PAN_INFOINCASSAT.SetQuery(PPQRY_FSCDETACCER2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FSC_DET_INCASSATO A ");
    PAN_INFOINCASSAT.SetQuery(PPQRY_FSCDETACCER2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARINFINCFC2.NOMEOGGEESER~~) ");
    SQL.append("and   (((A.TIPO_CALCOLO_NUOVO_ORD IS NULL) OR (~~TBL_PARINFINCFC3.NOOGTICANUOR~~ IS NULL) OR A.TIPO_CALCOLO_NUOVO_ORD = ~~TBL_PARINFINCFC3.NOOGTICANUOR~~)) ");
    SQL.append("and   (A.TIPOLOGIA_CATEGORIA = NVL(~~TBL_PARINFINCFC3.NOMOGGTIPCAT~~, A.TIPOLOGIA_CATEGORIA)) ");
    SQL.append("and   (A.CAPITOLO = NVL(~~TBL_PARINFINCFC3.NOMEOGGECAPI~~, A.CAPITOLO)) ");
    SQL.append("and   (A.ARTICOLO = NVL(~~TBL_PARINFINCFC3.NOMEOGGEARTI~~, A.ARTICOLO)) ");
    PAN_INFOINCASSAT.SetQuery(PPQRY_FSCDETACCER2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOINCASSAT.SetQuery(PPQRY_FSCDETACCER2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOINCASSAT.SetQuery(PPQRY_FSCDETACCER2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD ");
    PAN_INFOINCASSAT.SetQuery(PPQRY_FSCDETACCER2, 5, SQL, -1, "");
    PAN_INFOINCASSAT.SetQueryDB(PPQRY_FSCDETACCER2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INFOINCASSAT.SetMasterTable(0, "FSC_DET_INCASSATO");
    PAN_INFOINCASSAT.AddToSortList(PFL_INFOINCASSAT_ANNOORD, true);
    PAN_INFOINCASSAT.AddToSortList(PFL_INFOINCASSAT_NUMEROORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INFOINCASSAT.Status() == 2)
    {
      int oldListQBE = PAN_INFOINCASSAT.iUseListQBE;
      PAN_INFOINCASSAT.iUseListQBE = 0;
      PAN_INFOINCASSAT.PanelCommand(Glb.PCM_SEARCH);
      PAN_INFOINCASSAT.PanelCommand(Glb.PCM_FIND);
      PAN_INFOINCASSAT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARINFINCFCD) PAN_PARINFINCFCD_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_INFOINCASSAT) PAN_INFOINCASSAT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARINFINCFCD) PAN_PARINFINCFCD_ValidateRow(Cancel);
    if (SrcObj == PAN_INFOINCASSAT) PAN_INFOINCASSAT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARINFINCFCD) PAN_PARINFINCFCD_DynamicProperties();
    if (SrcObj == PAN_INFOINCASSAT) PAN_INFOINCASSAT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARINFINCFCD) PAN_PARINFINCFCD_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_INFOINCASSAT) PAN_INFOINCASSAT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARINFINCFCD) PAN_PARINFINCFCD_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_INFOINCASSAT) PAN_INFOINCASSAT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
