// **********************************************
// FCDDE Info Accertato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FCDDEInfoAccertato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARINFACCFCD_ESERCIZIO = 0;
  private static int PFL_PARINFACCFCD_CAPITOLOARTI = 1;
  private static int PFL_PARINFACCFCD_TIPOLOCATEGO = 2;
  private static int PFL_PARINFACCFCD_DESCRIZIONE = 3;

  private static int PPQRY_PARINFACCFC1 = 0;


  IDPanel PAN_PARINFACCFCD;
  private static int GRP_INFOACCERTAT_ACCERTAMENTO = 0;

  private static int PFL_INFOACCERTAT_ANNOACC = 0;
  private static int PFL_INFOACCERTAT_NUMEROACC = 1;
  private static int PFL_INFOACCERTAT_ETICHETOTALE = 2;
  private static int PFL_INFOACCERTAT_IMPORTO = 3;
  private static int PFL_INFOACCERTAT_SOMMADIIMPOR = 4;

  private static int PPQRY_FSCDETACCER1 = 0;


  IDPanel PAN_INFOACCERTAT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARINFACCFCD(IMDB);
    //
    //
    Init_PQRY_PARINFACCFC1(IMDB);
    Init_PQRY_PARINFACCFC1_RS(IMDB);
    Init_PQRY_FSCDETACCER1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARINFACCFCD(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARINFACCFCD, 9);
    IMDB.set_TblCode(IMDBDef3.TBL_PARINFACCFCD, "TBL_PARINFACCFCD");
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCLA, "NOMOGGTIPCLA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCLA,5,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCAT, "NOMOGGTIPCAT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCAT,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEREND, "NOMEOGGEREND");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEREND,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOOGPRESARFC, "NOOGPRESARFC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOOGPRESARFC,1,9,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGETTDN, "NOMEOGGETTDN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARINFACCFCD,IMDBDef3.FLD_PARINFACCFCD_NOMEOGGETTDN,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARINFACCFCD, 0);
  }

  private static void Init_PQRY_PARINFACCFC1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARINFACCFC1, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARINFACCFC1, "PQRY_PARINFACCFC1");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFACCFC1,IMDBDef11.PQSL_PARINFACCFC1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFACCFC1,IMDBDef11.PQSL_PARINFACCFC1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFACCFC1,IMDBDef11.PQSL_PARINFACCFC1_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFACCFC1,IMDBDef11.PQSL_PARINFACCFC1_RECORDCAPITO,5,201,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFACCFC1,IMDBDef11.PQSL_PARINFACCFC1_NOMOGGTIPCAT, "NOMOGGTIPCAT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFACCFC1,IMDBDef11.PQSL_PARINFACCFC1_NOMOGGTIPCAT,1,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFACCFC1,IMDBDef11.PQSL_PARINFACCFC1_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFACCFC1,IMDBDef11.PQSL_PARINFACCFC1_NOMEOGGEDESC,5,140,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARINFACCFC1, 0);
  }

  private static void Init_PQRY_PARINFACCFC1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARINFACCFC1_RS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARINFACCFC1_RS, "PQRY_PARINFACCFC1_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFACCFC1_RS,IMDBDef11.PQSL_PARINFACCFC1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFACCFC1_RS,IMDBDef11.PQSL_PARINFACCFC1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFACCFC1_RS,IMDBDef11.PQSL_PARINFACCFC1_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFACCFC1_RS,IMDBDef11.PQSL_PARINFACCFC1_RECORDCAPITO,5,201,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFACCFC1_RS,IMDBDef11.PQSL_PARINFACCFC1_NOMOGGTIPCAT, "NOMOGGTIPCAT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFACCFC1_RS,IMDBDef11.PQSL_PARINFACCFC1_NOMOGGTIPCAT,1,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARINFACCFC1_RS,IMDBDef11.PQSL_PARINFACCFC1_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARINFACCFC1_RS,IMDBDef11.PQSL_PARINFACCFC1_NOMEOGGEDESC,5,140,0);
  }

  private static void Init_PQRY_FSCDETACCER1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FSCDETACCER1, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_FSCDETACCER1, "PQRY_FSCDETACCER1");
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCDETACCER1,IMDBDef11.PQSL_FSCDETACCER1_REFSDEACANAC, "REFSDEACANAC");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCDETACCER1,IMDBDef11.PQSL_FSCDETACCER1_REFSDEACANAC,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCDETACCER1,IMDBDef11.PQSL_FSCDETACCER1_REFSDEACNUAC, "REFSDEACNUAC");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCDETACCER1,IMDBDef11.PQSL_FSCDETACCER1_REFSDEACNUAC,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCDETACCER1,IMDBDef11.PQSL_FSCDETACCER1_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCDETACCER1,IMDBDef11.PQSL_FSCDETACCER1_RECORDIMPORT,3,28,6);
    IMDB.TblAddNew(IMDBDef11.PQRY_FSCDETACCER1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FCDDEInfoAccertato(MyWebEntryPoint w, IMDBObj imdb)
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
  public FCDDEInfoAccertato()
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
    FormIdx = MyGlb.FRM_FCDDINFOACCE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6B51DFE7-8928-4698-A426-EC8605C70CC1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2131;
    DesignWidth = 376;
    DesignHeight = 434;
    set_Caption(new IDVariant("Dettaglio Accertato"));
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
    Frames[2].Caption = "Parametri Info Accertato Fcdde";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 112;
    PAN_PARINFACCFCD = new IDPanel(w, this, 2, "PAN_PARINFACCFCD");
    Frames[2].Content = PAN_PARINFACCFCD;
    PAN_PARINFACCFCD.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARINFACCFCD.VS = MainFrm.VisualStyleList;
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 376-MyGlb.PAN_OFFS_X, 112-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARINFACCFCD.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B0BDCEAE-3734-4AD6-AED8-21E2949562D2");
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1044, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARINFACCFCD.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARINFACCFCD.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARINFACCFCD.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARINFACCFCD.InitStatus = 1;
    PAN_PARINFACCFCD_Init();
    PAN_PARINFACCFCD_InitFields();
    PAN_PARINFACCFCD_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 376;
    Frames[3].Height = 296;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Info Accertato";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 296;
    PAN_INFOACCERTAT = new IDPanel(w, this, 3, "PAN_INFOACCERTAT");
    Frames[3].Content = PAN_INFOACCERTAT;
    PAN_INFOACCERTAT.ShowRowSelector = false;
    PAN_INFOACCERTAT.ShowToolbar = false;
    PAN_INFOACCERTAT.ShowStatusbar = false;
    PAN_INFOACCERTAT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INFOACCERTAT.VS = MainFrm.VisualStyleList;
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 376-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INFOACCERTAT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8BA6340E-DF9E-40CC-9B0A-45683B8B0483");
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 20, 0, 316, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_INFOACCERTAT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INFOACCERTAT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INFOACCERTAT.InitStatus = 1;
    PAN_INFOACCERTAT_Init();
    PAN_INFOACCERTAT_InitFields();
    PAN_INFOACCERTAT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARINFACCFCD, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FCDDINFOACCE_PARINFACCFC1();
      }
      PAN_PARINFACCFCD.UpdatePanel(MainFrm);
      PAN_INFOACCERTAT.UpdatePanel(MainFrm);
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
    return (obj instanceof FCDDEInfoAccertato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FCDDEInfoAccertato.class.getName() : (Glb.ClassWithPackage(FCDDEInfoAccertato.class) ? FCDDEInfoAccertato.class.getName().substring(FCDDEInfoAccertato.class.getPackage().getName().length() + 1) : FCDDEInfoAccertato.class.getName()));
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
      PAN_PARINFACCFCD.SetFlags (Glb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_PARINFACCFCD.SetFlags (Glb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      switch (1) // Allows the use of BREAK inside ifs
      {
        default:
        if (IMDB.Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCLA, 0).equals((new IDVariant("TIP"))))	
        {
          PAN_PARINFACCFCD.SetFlags (Glb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else if (IMDB.Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCLA, 0).equals((new IDVariant("CAP"))))	
        {
          PAN_PARINFACCFCD.SetFlags (Glb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        break;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEInfoAccertato", "Load", _e);
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
      UNLOAD_PARINFACFCDE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEInfoAccertato", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri Info Accertato Fcdde: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARINFACFCDE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCLA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEDESC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEREND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOOGPRESARFC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGETTDN, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Info Accertato Fcdde
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void FCDDINFOACCE_PARINFACCFC1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARINFACCFC1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARINFACCFCD, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARINFACCFCD, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARINFACCFC1_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARINFACCFC1_RS, 0, IMDBDef3.TBL_PARINFACCFCD, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARINFACCFC1_RS, 0, 0, IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEESER, 0);
      IMDB.set_Value(IMDBDef11.PQRY_PARINFACCFC1_RS, 1, 0, IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGECAPI, 0)), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEARTI, 0))));
      IMDB.TblLinkField(IMDBDef11.PQRY_PARINFACCFC1_RS, 2, 0, IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCAT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARINFACCFC1_RS, 3, 0, IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEDESC, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARINFACCFCD, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARINFACCFCD, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARINFACCFCD, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARINFACCFC1_RS, 0);
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
  private void PAN_PARINFACCFCD_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARINFACCFCD, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARINFACCFCD_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARINFACCFCD, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARINFACCFCD_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARINFACCFCD);
    // Stub
  }

  private void PAN_PARINFACCFCD_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARINFACCFCD_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARINFACCFCD_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARINFACCFCD_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_INFOACCERTAT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INFOACCERTAT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INFOACCERTAT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INFOACCERTAT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INFOACCERTAT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_INFOACCERTAT);
    // Stub
  }

  private void PAN_INFOACCERTAT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_INFOACCERTAT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INFOACCERTAT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INFOACCERTAT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARINFACCFCD_Init()
  {

    PAN_PARINFACCFCD.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARINFACCFCD.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARINFACCFCD.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARINFACCFCD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, "0A2BC23A-2BBB-450E-96A4-E0B01DC8D224");
    PAN_PARINFACCFCD.set_Header(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, "Esercizio");
    PAN_PARINFACCFCD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, "");
    PAN_PARINFACCFCD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARINFACCFCD.SetFlags(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PARINFACCFCD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, "5B4EB659-9F26-4B52-B577-9B24F79615E9");
    PAN_PARINFACCFCD.set_Header(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, "Capitolo/Articolo");
    PAN_PARINFACCFCD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, "");
    PAN_PARINFACCFCD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARINFACCFCD.SetFlags(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARINFACCFCD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, "D4825BC0-AC50-47C3-9A3D-17FA0AA87B79");
    PAN_PARINFACCFCD.set_Header(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, "Tipologia ");
    PAN_PARINFACCFCD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, "");
    PAN_PARINFACCFCD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARINFACCFCD.SetFlags(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARINFACCFCD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, "D018981C-5812-4CE0-A4B8-2C9E7583A7FD");
    PAN_PARINFACCFCD.set_Header(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, "Descrizione");
    PAN_PARINFACCFCD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, "");
    PAN_PARINFACCFCD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARINFACCFCD.SetFlags(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARINFACCFCD_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFACCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARINFACCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARINFACCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, MyGlb.PANEL_FORM, 48, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFACCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARINFACCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARINFACCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARINFACCFCD.SetFieldPage(PFL_PARINFACCFCD_ESERCIZIO, -1, -1);
    PAN_PARINFACCFCD.SetFieldPanel(PFL_PARINFACCFCD_ESERCIZIO, PPQRY_PARINFACCFC1, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, MyGlb.PANEL_LIST, 0, 36, 508, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARINFACCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, MyGlb.PANEL_LIST, 104);
    PAN_PARINFACCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, MyGlb.PANEL_LIST, 2);
    PAN_PARINFACCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, MyGlb.PANEL_LIST, "Capitolo/Articolo");
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, MyGlb.PANEL_FORM, 4, 28, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFACCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, MyGlb.PANEL_FORM, 104);
    PAN_PARINFACCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, MyGlb.PANEL_FORM, 1);
    PAN_PARINFACCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_CAPITOLOARTI, MyGlb.PANEL_FORM, "Capitolo/Articolo");
    PAN_PARINFACCFCD.SetFieldPage(PFL_PARINFACCFCD_CAPITOLOARTI, -1, -1);
    PAN_PARINFACCFCD.SetFieldUnbound(PFL_PARINFACCFCD_CAPITOLOARTI, true);
    PAN_PARINFACCFCD.SetFieldPanel(PFL_PARINFACCFCD_CAPITOLOARTI, PPQRY_PARINFACCFC1, "", "RECORDCAPITO", 5, 201, 0, -13997);
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFACCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, MyGlb.PANEL_LIST, 120);
    PAN_PARINFACCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, MyGlb.PANEL_LIST, 1);
    PAN_PARINFACCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, MyGlb.PANEL_LIST, "Tipologia ");
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, MyGlb.PANEL_FORM, 48, 28, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFACCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, MyGlb.PANEL_FORM, 60);
    PAN_PARINFACCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, MyGlb.PANEL_FORM, 1);
    PAN_PARINFACCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_TIPOLOCATEGO, MyGlb.PANEL_FORM, "Tipologia ");
    PAN_PARINFACCFCD.SetFieldPage(PFL_PARINFACCFCD_TIPOLOCATEGO, -1, -1);
    PAN_PARINFACCFCD.SetFieldPanel(PFL_PARINFACCFCD_TIPOLOCATEGO, PPQRY_PARINFACCFC1, "A.NOMOGGTIPCAT", "NOMOGGTIPCAT", 1, 10, 0, -13997);
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARINFACCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PARINFACCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARINFACCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARINFACCFCD.SetRect(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 52, 304, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARINFACCFCD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARINFACCFCD.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_PARINFACCFCD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARINFACCFCD_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARINFACCFCD.SetFieldPage(PFL_PARINFACCFCD_DESCRIZIONE, -1, -1);
    PAN_PARINFACCFCD.SetFieldPanel(PFL_PARINFACCFCD_DESCRIZIONE, PPQRY_PARINFACCFC1, "A.NOMEOGGEDESC", "NOMEOGGEDESC", 5, 140, 0, -13997);
  }

  private void PAN_PARINFACCFCD_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARINFACCFCD.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARINFACCFCD.SetIMDB(IMDB, "PQRY_PARINFACCFC1", true);
    PAN_PARINFACCFCD.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARINFACCFCD.SetQueryIMDB(PPQRY_PARINFACCFC1, IMDBDef11.PQRY_PARINFACCFC1_RS, IMDBDef3.TBL_PARINFACCFCD);
    JustLoaded = true;
    PAN_PARINFACCFCD.SetFieldPrimaryIndex(PFL_PARINFACCFCD_ESERCIZIO, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEESER);
    PAN_PARINFACCFCD.SetFieldPrimaryIndex(PFL_PARINFACCFCD_TIPOLOCATEGO, IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCAT);
    PAN_PARINFACCFCD.SetFieldPrimaryIndex(PFL_PARINFACCFCD_DESCRIZIONE, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEDESC);
    PAN_PARINFACCFCD.SetMasterTable(0, "PARINFACCFCD");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARINFACCFCD.Status() == 2)
    {
      int oldListQBE = PAN_PARINFACCFCD.iUseListQBE;
      PAN_PARINFACCFCD.iUseListQBE = 0;
      PAN_PARINFACCFCD.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARINFACCFCD.PanelCommand(Glb.PCM_FIND);
      PAN_PARINFACCFCD.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_INFOACCERTAT_Init()
  {

    PAN_INFOACCERTAT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INFOACCERTAT.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_INFOACCERTAT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, "3207D459-FEBF-406C-87F7-57FCE039C427");
    PAN_INFOACCERTAT.set_Header(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, "Accertamento");
    PAN_INFOACCERTAT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, "");
    PAN_INFOACCERTAT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, MyGlb.PANEL_LIST, 20, -9999, 156, 16, 0, 0);
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, MyGlb.PANEL_FORM, 0, -21, 132, 73, 0, 0);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, 0, 81);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, 1, 13);
    PAN_INFOACCERTAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, 0, 4);
    PAN_INFOACCERTAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, 1, 4);
    PAN_INFOACCERTAT.SetFlags(MyGlb.OBJ_GROUP, GRP_INFOACCERTAT_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INFOACCERTAT.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_INFOACCERTAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, "83A1C4D1-D331-4E43-AD1D-2B6BE20B5B1B");
    PAN_INFOACCERTAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, "Anno");
    PAN_INFOACCERTAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, "");
    PAN_INFOACCERTAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_INFOACCERTAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOACCERTAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, "855523A0-07A7-4610-B537-5AA084875237");
    PAN_INFOACCERTAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, "Numero");
    PAN_INFOACCERTAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, "");
    PAN_INFOACCERTAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_INFOACCERTAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOACCERTAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, "B59F9B3D-F9AC-458A-8F02-D344819AC678");
    PAN_INFOACCERTAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, "Totale");
    PAN_INFOACCERTAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, "0");
    PAN_INFOACCERTAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, MyGlb.VIS_ETICGRASIMPO);
    PAN_INFOACCERTAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INFOACCERTAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, "6EA11005-D6CA-4B9A-93A9-CB6AB27C0674");
    PAN_INFOACCERTAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, "Importo");
    PAN_INFOACCERTAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, "");
    PAN_INFOACCERTAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOACCERTAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOACCERTAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, "F8024FC3-2BAD-46E0-B907-452543A2819B");
    PAN_INFOACCERTAT.set_Header(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, " ");
    PAN_INFOACCERTAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, "0");
    PAN_INFOACCERTAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, MyGlb.VIS_DISABIIMPORT);
    PAN_INFOACCERTAT.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INFOACCERTAT.SetSumField(PFL_INFOACCERTAT_SOMMADIIMPOR, PFL_INFOACCERTAT_IMPORTO);
  }

  private void PAN_INFOACCERTAT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, MyGlb.PANEL_LIST, 20, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_INFOACCERTAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, MyGlb.PANEL_LIST, "Anno");
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, MyGlb.PANEL_FORM, 4, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_INFOACCERTAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ANNOACC, MyGlb.PANEL_FORM, "Anno");
    PAN_INFOACCERTAT.SetFieldPage(PFL_INFOACCERTAT_ANNOACC, -1, GRP_INFOACCERTAT_ACCERTAMENTO);
    PAN_INFOACCERTAT.SetFieldPanel(PFL_INFOACCERTAT_ANNOACC, PPQRY_FSCDETACCER1, "A.ANNO_ACC", "REFSDEACANAC", 1, 4, 0, -13997);
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, MyGlb.PANEL_LIST, 96, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, MyGlb.PANEL_LIST, 80);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_INFOACCERTAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, MyGlb.PANEL_LIST, "Numero");
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, MyGlb.PANEL_FORM, 4, 28, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, MyGlb.PANEL_FORM, 80);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_INFOACCERTAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_NUMEROACC, MyGlb.PANEL_FORM, "Numero");
    PAN_INFOACCERTAT.SetFieldPage(PFL_INFOACCERTAT_NUMEROACC, -1, GRP_INFOACCERTAT_ACCERTAMENTO);
    PAN_INFOACCERTAT.SetFieldPanel(PFL_INFOACCERTAT_NUMEROACC, PPQRY_FSCDETACCER1, "A.NUMERO_ACC", "REFSDEACNUAC", 1, 5, 0, -13997);
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, MyGlb.PANEL_LIST, 96, 260, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, MyGlb.PANEL_FORM, 0, 0, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_INFOACCERTAT.SetFieldPage(PFL_INFOACCERTAT_ETICHETOTALE, -1, GRP_INFOACCERTAT_ACCERTAMENTO);
    PAN_INFOACCERTAT.SetFieldPanel(PFL_INFOACCERTAT_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_INFOACCERTAT.set_Mask(PFL_INFOACCERTAT_ETICHETOTALE, "####0");
    PAN_INFOACCERTAT.set_Alignment(PFL_INFOACCERTAT_ETICHETOTALE, 4);
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, MyGlb.PANEL_LIST, 176, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_INFOACCERTAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_INFOACCERTAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_INFOACCERTAT.SetFieldPage(PFL_INFOACCERTAT_IMPORTO, -1, -1);
    PAN_INFOACCERTAT.SetFieldUnbound(PFL_INFOACCERTAT_IMPORTO, true);
    PAN_INFOACCERTAT.SetFieldPanel(PFL_INFOACCERTAT_IMPORTO, PPQRY_FSCDETACCER1, "CASE WHEN NVL(~~TBL_PARINFACCFCD.NOMEOGGEREND~~, 'NO') = 'SI' THEN A.IMPORTO_REND ELSE A.IMPORTO END", "RECORDIMPORT", 3, 28, 6, -13997);
    PAN_INFOACCERTAT.set_Mask(PFL_INFOACCERTAT_IMPORTO, "#,##0.00");
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, MyGlb.PANEL_LIST, 176, 260, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, MyGlb.PANEL_LIST, 0);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, MyGlb.PANEL_LIST, 1);
    PAN_INFOACCERTAT.SetRect(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, MyGlb.PANEL_FORM, 0, 0, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOACCERTAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, MyGlb.PANEL_FORM, 0);
    PAN_INFOACCERTAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOACCERTAT_SOMMADIIMPOR, MyGlb.PANEL_FORM, 1);
    PAN_INFOACCERTAT.SetFieldPage(PFL_INFOACCERTAT_SOMMADIIMPOR, -1, -1);
    PAN_INFOACCERTAT.SetFieldPanel(PFL_INFOACCERTAT_SOMMADIIMPOR, -1, "", "SOMMADIIMPOR", 0, 0, 0, -13997);
    PAN_INFOACCERTAT.set_Mask(PFL_INFOACCERTAT_SOMMADIIMPOR, "#,##0.00");
    PAN_INFOACCERTAT.set_Alignment(PFL_INFOACCERTAT_SOMMADIIMPOR, 4);
  }

  private void PAN_INFOACCERTAT_InitQueries()
  {
    StringBuffer SQL;

    PAN_INFOACCERTAT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_INFOACCERTAT.SetIMDB(IMDB, "PQRY_FSCDETACCER1", true);
    PAN_INFOACCERTAT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_ACC as REFSDEACANAC, ");
    SQL.append("  A.NUMERO_ACC as REFSDEACNUAC, ");
    SQL.append("  CASE WHEN NVL(~~TBL_PARINFACCFCD.NOMEOGGEREND~~, 'NO') = 'SI' THEN A.IMPORTO_REND ELSE A.IMPORTO END as RECORDIMPORT ");
    PAN_INFOACCERTAT.SetQuery(PPQRY_FSCDETACCER1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FSC_DET_ACCERTATO A ");
    PAN_INFOACCERTAT.SetQuery(PPQRY_FSCDETACCER1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARINFACCFC1.NOMEOGGEESER~~) ");
    SQL.append("and   (NVL(A.TIPOLOGIA_CATEGORIA, -1) = NVL(~~TBL_PARINFACCFCD.NOMOGGTIPCAT~~, NVL(A.TIPOLOGIA_CATEGORIA, -1))) ");
    SQL.append("and   (NVL(A.CAPITOLO, -1) = NVL(~~TBL_PARINFACCFCD.NOMEOGGECAPI~~, NVL(A.CAPITOLO, -1))) ");
    SQL.append("and   (NVL(A.ARTICOLO, -1) = NVL(~~TBL_PARINFACCFCD.NOMEOGGEARTI~~, NVL(A.ARTICOLO, -1))) ");
    SQL.append("and   ((NVL(~~TBL_PARINFACCFCD.NOMEOGGEREND~~, 'NO') <> 'SI' AND A.ANNO_ACC = A.ESERCIZIO) OR (A.ANNO_ACC < A.ESERCIZIO AND NVL(A.ANNO_INTROD, -1) < A.ESERCIZIO AND NVL(~~TBL_PARINFACCFCD.NOMEOGGEREND~~, 'NO') = 'SI')) ");
    PAN_INFOACCERTAT.SetQuery(PPQRY_FSCDETACCER1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOACCERTAT.SetQuery(PPQRY_FSCDETACCER1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOACCERTAT.SetQuery(PPQRY_FSCDETACCER1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC ");
    PAN_INFOACCERTAT.SetQuery(PPQRY_FSCDETACCER1, 5, SQL, -1, "");
    PAN_INFOACCERTAT.SetQueryDB(PPQRY_FSCDETACCER1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INFOACCERTAT.SetMasterTable(0, "FSC_DET_ACCERTATO");
    PAN_INFOACCERTAT.AddToSortList(PFL_INFOACCERTAT_ANNOACC, true);
    PAN_INFOACCERTAT.AddToSortList(PFL_INFOACCERTAT_NUMEROACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INFOACCERTAT.Status() == 2)
    {
      int oldListQBE = PAN_INFOACCERTAT.iUseListQBE;
      PAN_INFOACCERTAT.iUseListQBE = 0;
      PAN_INFOACCERTAT.PanelCommand(Glb.PCM_SEARCH);
      PAN_INFOACCERTAT.PanelCommand(Glb.PCM_FIND);
      PAN_INFOACCERTAT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARINFACCFCD) PAN_PARINFACCFCD_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_INFOACCERTAT) PAN_INFOACCERTAT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARINFACCFCD) PAN_PARINFACCFCD_ValidateRow(Cancel);
    if (SrcObj == PAN_INFOACCERTAT) PAN_INFOACCERTAT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARINFACCFCD) PAN_PARINFACCFCD_DynamicProperties();
    if (SrcObj == PAN_INFOACCERTAT) PAN_INFOACCERTAT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARINFACCFCD) PAN_PARINFACCFCD_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_INFOACCERTAT) PAN_INFOACCERTAT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARINFACCFCD) PAN_PARINFACCFCD_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_INFOACCERTAT) PAN_INFOACCERTAT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
