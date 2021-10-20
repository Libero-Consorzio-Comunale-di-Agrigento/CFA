// **********************************************
// Selezione Banca
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SelezioneBanca extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_BANCHE_ABI1 = 0;
  private static int PFL_BANCHE_DENOMINAZION = 1;
  private static int PFL_BANCHE_CAB1 = 2;
  private static int PFL_BANCHE_DESCRIZIONE = 3;
  private static int PFL_BANCHE_INDIRIZZO1 = 4;
  private static int PFL_BANCHE_LOCALITA = 5;
  private static int PFL_BANCHE_COMUNE1 = 6;
  private static int PFL_BANCHE_PROVINCIA1 = 7;
  private static int PFL_BANCHE_CAP = 8;
  private static int PFL_BANCHE_PNLRICERCA = 9;

  private static int PPQRY_BANCHE1 = 0;


  IDPanel PAN_BANCHE;
  private static int PFL_PARAMETRI_BANCA = 0;
  private static int PFL_PARAMETRI_ABI = 1;
  private static int PFL_PARAMETRI_CAB = 2;
  private static int PFL_PARAMETRI_COMUNE = 3;
  private static int PFL_PARAMETRI_INDIRIZZO = 4;
  private static int PFL_PARAMETRI_SPORTELLO = 5;
  private static int PFL_PARAMETRI_PROVINCIA = 6;
  private static int PFL_PARAMETRI_CMDTROVA = 7;
  private static int PFL_PARAMETRI_CMDANNULLA = 8;

  private static int PPQRY_PARAMETRI185 = 0;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI196(IMDB);
    //
    //
    Init_PQRY_BANCHE1(IMDB);
    Init_PQRY_PARAMETRI185(IMDB);
    Init_PQRY_PARAMETRI185_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI196(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI196, 7);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI196, "TBL_PARAMETRI196");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMEBANCA, "ROWNAMEBANCA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMEBANCA,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMEABI, "ROWNAMEABI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMEABI,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMECAB, "ROWNAMECAB");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMECAB,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMECOMUN, "ROWNAMECOMUN");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMECOMUN,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMEINDIR, "ROWNAMEINDIR");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMEINDIR,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMESPORT, "ROWNAMESPORT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMESPORT,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMEPROVI, "ROWNAMEPROVI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI196,IMDBDef1.FLD_PARAMETRI196_ROWNAMEPROVI,5,49,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI196, 0);
  }

  private static void Init_PQRY_BANCHE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_BANCHE1, 9);
    IMDB.set_TblCode(IMDBDef7.PQRY_BANCHE1, "PQRY_BANCHE1");
    IMDB.set_FldCode(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_ABI, "ABI");
    IMDB.SetFldParams(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_ABI,5,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_DENOMINAZIONE, "DENOMINAZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_DENOMINAZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_CAB, "CAB");
    IMDB.SetFldParams(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_CAB,5,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_COMUNE,5,20,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_INDIRIZZO, "INDIRIZZO");
    IMDB.SetFldParams(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_INDIRIZZO,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_PROVINCIA,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_CAP,5,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_LOCALITA, "LOCALITA");
    IMDB.SetFldParams(IMDBDef7.PQRY_BANCHE1,IMDBDef7.PQSL_BANCHE1_LOCALITA,5,20,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_BANCHE1, 0);
  }

  private static void Init_PQRY_PARAMETRI185(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI185, 7);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI185, "PQRY_PARAMETRI185");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEBANCA, "ROWNAMEBANCA");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEBANCA,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEABI, "ROWNAMEABI");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEABI,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMECAB, "ROWNAMECAB");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMECAB,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMECOMUN, "ROWNAMECOMUN");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMECOMUN,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEINDIR, "ROWNAMEINDIR");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEINDIR,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMESPORT, "ROWNAMESPORT");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMESPORT,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEPROVI, "ROWNAMEPROVI");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEPROVI,5,49,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI185, 0);
  }

  private static void Init_PQRY_PARAMETRI185_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI185_RS, 7);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI185_RS, "PQRY_PARAMETRI185_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEBANCA, "ROWNAMEBANCA");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEBANCA,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEABI, "ROWNAMEABI");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEABI,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMECAB, "ROWNAMECAB");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMECAB,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMECOMUN, "ROWNAMECOMUN");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMECOMUN,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEINDIR, "ROWNAMEINDIR");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEINDIR,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMESPORT, "ROWNAMESPORT");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMESPORT,5,49,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEPROVI, "ROWNAMEPROVI");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI185_RS,IMDBDef7.PQSL_PARAMETRI185_ROWNAMEPROVI,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SelezioneBanca(MyWebEntryPoint w, IMDBObj imdb)
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
  public SelezioneBanca()
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
    FormIdx = MyGlb.FRM_SELEZIOBANCA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "755B98B5-9B82-4F77-B2D8-F64225DC2031";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 696;
    DesignHeight = 394;
    set_Caption(new IDVariant("Selezione Banca"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 696;
    Frames[1].Height = 368;
    Frames[1].Caption = "Banche";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_BANCHE = new IDPanel(w, this, 1, "PAN_BANCHE");
    Frames[1].Content = PAN_BANCHE;
    PAN_BANCHE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BANCHE.VS = MainFrm.VisualStyleList;
    PAN_BANCHE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 696-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "763C5DF0-C06E-4E90-BB21-6E891B25CA29");
    PAN_BANCHE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1232, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BANCHE.InitStatus = 1;
    PAN_BANCHE_Init();
    PAN_BANCHE_InitFields();
    PAN_BANCHE_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_BANCHE.SetSubFrame(PFL_BANCHE_PNLRICERCA,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2BF30632-BD71-41DB-A042-A68E6820C968");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1456, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SELEZIOBANCA+BaseCmdLinIdx)
      {
        RicercaBanca();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI196, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SELEZIOBANCA_PARAMETRI185();
      }
      PAN_BANCHE.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SELEZIOBANCA && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_CMDTROVA) {
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
    return (obj instanceof SelezioneBanca);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SelezioneBanca.class.getName() : (Glb.ClassWithPackage(SelezioneBanca.class) ? SelezioneBanca.class.getName().substring(SelezioneBanca.class.getPackage().getName().length() + 1) : SelezioneBanca.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Banche On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BANCHE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BANCHE);
      // 
      // Banche On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_BANCHE.set_ToolTip(Glb.OBJ_FIELD,PFL_BANCHE_DENOMINAZION,(new IDVariant(PAN_BANCHE.FieldText(PFL_BANCHE_DENOMINAZION))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneBanca", "BancheOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Trova
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Trova ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SELEZIONATI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Trova Body
      // Procedure Body
      // 
      v_SELEZIONATI = (new IDVariant(0));
      PAN_BANCHE.PanelCommand(Glb.PCM_SEARCH);
      // 
      // seleziono i qbe filter se non sono nulli
      // 
      if (!(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEBANCA, 0),(new IDVariant("0"))).equals((new IDVariant("0")), true)))
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_DENOMINAZION, IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEBANCA, 0).stringValue());
        v_SELEZIONATI = (new IDVariant(-1));
      }
      else
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_DENOMINAZION, (new IDVariant()).stringValue());
      }
      // 
      // seleziono i qbe filter se non sono nulli
      // 
      if (!(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEABI, 0),(new IDVariant("0"))).equals((new IDVariant("0")), true)))
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_ABI1, IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEABI, 0).stringValue());
        v_SELEZIONATI = (new IDVariant(-1));
      }
      else
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_ABI1, (new IDVariant()).stringValue());
      }
      // 
      // seleziono i qbe filter se non sono nulli
      // 
      if (!(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMECAB, 0),(new IDVariant("0"))).equals((new IDVariant("0")), true)))
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_CAB1, IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMECAB, 0).stringValue());
        v_SELEZIONATI = (new IDVariant(-1));
      }
      else
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_CAB1, (new IDVariant()).stringValue());
      }
      // 
      // seleziono i qbe filter se non sono nulli
      // 
      if (!(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMECOMUN, 0),(new IDVariant("0"))).equals((new IDVariant("0")), true)))
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_COMUNE1, IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMECOMUN, 0).stringValue());
        v_SELEZIONATI = (new IDVariant(-1));
      }
      else
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_COMUNE1, (new IDVariant()).stringValue());
      }
      // 
      // seleziono i qbe filter se non sono nulli
      // 
      if (!(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEINDIR, 0),(new IDVariant("0"))).equals((new IDVariant("0")), true)))
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_INDIRIZZO1, IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEINDIR, 0).stringValue());
        v_SELEZIONATI = (new IDVariant(-1));
      }
      else
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_INDIRIZZO1, (new IDVariant()).stringValue());
      }
      // 
      // seleziono i qbe filter se non sono nulli
      // 
      if (!(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMESPORT, 0),(new IDVariant("0"))).equals((new IDVariant("0")), true)))
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_DESCRIZIONE, IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMESPORT, 0).stringValue());
        v_SELEZIONATI = (new IDVariant(-1));
      }
      else
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_DESCRIZIONE, (new IDVariant()).stringValue());
      }
      // 
      // seleziono i qbe filter se non sono nulli
      // 
      if (!(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEPROVI, 0),(new IDVariant("0"))).equals((new IDVariant("0")), true)))
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_PROVINCIA1, IMDB.Value(IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEPROVI, 0).stringValue());
        v_SELEZIONATI = (new IDVariant(-1));
      }
      else
      {
        PAN_BANCHE.set_QBEFilter(PFL_BANCHE_PROVINCIA1, (new IDVariant()).stringValue());
      }
      if (v_SELEZIONATI.equals((new IDVariant(-1)), true))
      {
      }
      PAN_BANCHE.PanelCommand(Glb.PCM_FIND);
      Annulla();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneBanca", "Trova", _e);
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
      PAN_BANCHE.set_Layout((new IDVariant(0)).intValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneBanca", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ricerca Banca
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int RicercaBanca ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ricerca Banca Body
      // Procedure Body
      // 
      PAN_BANCHE.set_Layout((new IDVariant(1)).intValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneBanca", "RicercaBanca", _e);
      return -1;
    }
  }

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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_BANCHE.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
      MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI29+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneBanca", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SELEZIOBANCA_PARAMETRI185() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_PARAMETRI185_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI196, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI196, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI185_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_PARAMETRI185_RS, 0, IMDBDef1.TBL_PARAMETRI196, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI185_RS, 0, 0, IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEBANCA, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI185_RS, 1, 0, IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEABI, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI185_RS, 2, 0, IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMECAB, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI185_RS, 3, 0, IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMECOMUN, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI185_RS, 4, 0, IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEINDIR, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI185_RS, 5, 0, IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMESPORT, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI185_RS, 6, 0, IMDBDef1.TBL_PARAMETRI196, IMDBDef1.FLD_PARAMETRI196_ROWNAMEPROVI, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI196, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI196, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI196, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef7.PQRY_PARAMETRI185_RS, 0);
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
  private void PAN_BANCHE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BANCHE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BANCHE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BANCHE, Cancel);
    // Stub
  }

  private void PAN_BANCHE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BANCHE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BANCHE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BANCHE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_CMDTROVA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Trova();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_CMDANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BANCHE_Init()
  {

    PAN_BANCHE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BANCHE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BANCHE.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, "D8354622-2D86-4C13-AD33-E2B2D1EC048D");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, "ABI");
    PAN_BANCHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, "");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, MyGlb.VIS_NORMALFIELDS);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, "7C1FA251-3391-427F-9EB3-75DCC357C468");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, "Denominazione");
    PAN_BANCHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, "Denominazione della Banca");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, MyGlb.VIS_NORMALFIELDS);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISDESCR, -1);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, "825384B2-DE9B-4FE4-8F5B-FFE53DA7B657");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, "CAB");
    PAN_BANCHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, "");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, MyGlb.VIS_NORMALFIELDS);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, "D6687D07-657A-4DFC-A558-49848920B12E");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, "Descrizione");
    PAN_BANCHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, "Denominazione dello Sportello ");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, "E0562E75-53E4-4183-9C32-4D68D00CAF11");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, "Indirizzo");
    PAN_BANCHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, "");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, MyGlb.VIS_NORMALFIELDS);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, "8F320E4B-6BF1-4BEC-ACED-38A9B973AAF2");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, "Località");
    PAN_BANCHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, "");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, MyGlb.VIS_NORMALFIELDS);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, "AB303A50-A1F1-4D12-8358-1428A712F967");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, "Comune");
    PAN_BANCHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, "");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, MyGlb.VIS_NORMALFIELDS);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, "476362B7-2BE0-4CB0-8447-2D5CDD355065");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, "Provincia");
    PAN_BANCHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, "");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, MyGlb.VIS_NORMALFIELDS);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, "6A872984-D1AE-455E-87A8-B6F6F254912F");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, "CAP");
    PAN_BANCHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, "");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, MyGlb.VIS_NORMALFIELDS);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_BANCHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, "472641A2-581D-4345-B5E4-02E660BA879E");
    PAN_BANCHE.set_Header(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, "");
    PAN_BANCHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, MyGlb.VIS_VUOTONORMALE);
    PAN_BANCHE.SetFlags(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_BANCHE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, MyGlb.PANEL_LIST, 28);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, MyGlb.PANEL_LIST, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, MyGlb.PANEL_LIST, "ABI");
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, MyGlb.PANEL_FORM, 112);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, MyGlb.PANEL_FORM, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_ABI1, MyGlb.PANEL_FORM, "ABI");
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_ABI1, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_ABI1, PPQRY_BANCHE1, "A.ABI", "ABI", 5, 5, 0, -13997);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, MyGlb.PANEL_LIST, 48, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, MyGlb.PANEL_LIST, 96);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, MyGlb.PANEL_LIST, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, MyGlb.PANEL_LIST, "Denominazione");
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, MyGlb.PANEL_FORM, 4, 28, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, MyGlb.PANEL_FORM, 96);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, MyGlb.PANEL_FORM, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_DENOMINAZION, MyGlb.PANEL_FORM, "Denominazione");
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_DENOMINAZION, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_DENOMINAZION, PPQRY_BANCHE1, "A.DENOMINAZIONE", "DENOMINAZIONE", 5, 60, 0, -13997);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, MyGlb.PANEL_LIST, 356, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, MyGlb.PANEL_LIST, 28);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, MyGlb.PANEL_LIST, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, MyGlb.PANEL_LIST, "CAB");
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, MyGlb.PANEL_FORM, 4, 52, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, MyGlb.PANEL_FORM, 28);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, MyGlb.PANEL_FORM, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_CAB1, MyGlb.PANEL_FORM, "CAB");
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_CAB1, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_CAB1, PPQRY_BANCHE1, "B.CAB", "CAB", 5, 5, 0, -13997);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, MyGlb.PANEL_LIST, 396, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_DESCRIZIONE, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_DESCRIZIONE, PPQRY_BANCHE1, "B.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, MyGlb.PANEL_LIST, 604, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, MyGlb.PANEL_LIST, 64);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, MyGlb.PANEL_LIST, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, MyGlb.PANEL_LIST, "Indirizzo");
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, MyGlb.PANEL_FORM, 4, 100, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, MyGlb.PANEL_FORM, 64);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, MyGlb.PANEL_FORM, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_INDIRIZZO1, MyGlb.PANEL_FORM, "Indirizzo");
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_INDIRIZZO1, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_INDIRIZZO1, PPQRY_BANCHE1, "B.INDIRIZZO", "INDIRIZZO", 5, 60, 0, -13997);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, MyGlb.PANEL_LIST, 912, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, MyGlb.PANEL_LIST, 60);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, MyGlb.PANEL_LIST, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, MyGlb.PANEL_LIST, "Località");
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, MyGlb.PANEL_FORM, 4, 124, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, MyGlb.PANEL_FORM, 60);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, MyGlb.PANEL_FORM, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_LOCALITA, MyGlb.PANEL_FORM, "Località");
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_LOCALITA, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_LOCALITA, PPQRY_BANCHE1, "B.LOCALITA", "LOCALITA", 5, 20, 0, -13997);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, MyGlb.PANEL_LIST, 1020, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, MyGlb.PANEL_LIST, 52);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, MyGlb.PANEL_LIST, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, MyGlb.PANEL_LIST, "Comune");
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, MyGlb.PANEL_FORM, 52);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, MyGlb.PANEL_FORM, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_COMUNE1, MyGlb.PANEL_FORM, "Comune");
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_COMUNE1, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_COMUNE1, PPQRY_BANCHE1, "B.COMUNE", "COMUNE", 5, 20, 0, -13997);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, MyGlb.PANEL_LIST, 1128, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, MyGlb.PANEL_LIST, 64);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, MyGlb.PANEL_LIST, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, MyGlb.PANEL_LIST, "Provincia");
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, MyGlb.PANEL_FORM, 4, 172, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, MyGlb.PANEL_FORM, 64);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, MyGlb.PANEL_FORM, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_PROVINCIA1, MyGlb.PANEL_FORM, "Provincia");
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_PROVINCIA1, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_PROVINCIA1, PPQRY_BANCHE1, "B.PROVINCIA", "PROVINCIA", 5, 2, 0, -13997);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, MyGlb.PANEL_LIST, 1192, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, MyGlb.PANEL_LIST, 28);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, MyGlb.PANEL_LIST, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, MyGlb.PANEL_LIST, "CAP");
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, MyGlb.PANEL_FORM, 4, 196, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, MyGlb.PANEL_FORM, 28);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, MyGlb.PANEL_FORM, 1);
    PAN_BANCHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BANCHE_CAP, MyGlb.PANEL_FORM, "CAP");
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_CAP, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_CAP, PPQRY_BANCHE1, "B.CAP", "CAP", 5, 5, 0, -13997);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, MyGlb.PANEL_LIST, 232, 4, 504, 200, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, MyGlb.PANEL_LIST, 0);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, MyGlb.PANEL_LIST, 15);
    PAN_BANCHE.SetRect(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, MyGlb.PANEL_FORM, 60, 12, 508, 196, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BANCHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, MyGlb.PANEL_FORM, 0);
    PAN_BANCHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BANCHE_PNLRICERCA, MyGlb.PANEL_FORM, 15);
    PAN_BANCHE.SetFieldPage(PFL_BANCHE_PNLRICERCA, -1, -1);
    PAN_BANCHE.SetFieldPanel(PFL_BANCHE_PNLRICERCA, -1, "", "PNLRICERCA", 0, 0, 0, -13997);
  }

  private void PAN_BANCHE_InitQueries()
  {
    StringBuffer SQL;

    PAN_BANCHE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BANCHE.SetIMDB(IMDB, "PQRY_BANCHE1", true);
    PAN_BANCHE.set_SetString(MyGlb.MASTER_ROWNAME, "BANCHE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ABI as ABI, ");
    SQL.append("  A.DENOMINAZIONE as DENOMINAZIONE, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  B.CAB as CAB, ");
    SQL.append("  B.COMUNE as COMUNE, ");
    SQL.append("  B.INDIRIZZO as INDIRIZZO, ");
    SQL.append("  B.PROVINCIA as PROVINCIA, ");
    SQL.append("  B.CAP as CAP, ");
    SQL.append("  B.LOCALITA as LOCALITA ");
    PAN_BANCHE.SetQuery(PPQRY_BANCHE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  AD4_BANCHE A, ");
    SQL.append("  AD4_SPORTELLI B ");
    PAN_BANCHE.SetQuery(PPQRY_BANCHE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where A.ABI = B.ABI ");
    SQL.append("and   (A.ABI = B.ABI(+)) ");
    PAN_BANCHE.SetQuery(PPQRY_BANCHE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BANCHE.SetQuery(PPQRY_BANCHE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BANCHE.SetQuery(PPQRY_BANCHE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ABI, ");
    SQL.append("  B.CAB ");
    PAN_BANCHE.SetQuery(PPQRY_BANCHE1, 5, SQL, -1, "");
    PAN_BANCHE.SetQueryDB(PPQRY_BANCHE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BANCHE.SetMasterTable(0, "AD4_BANCHE");
    PAN_BANCHE.AddToSortList(PFL_BANCHE_ABI1, true);
    PAN_BANCHE.AddToSortList(PFL_BANCHE_CAB1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BANCHE.Status() == 2)
    {
      int oldListQBE = PAN_BANCHE.iUseListQBE;
      PAN_BANCHE.iUseListQBE = 0;
      PAN_BANCHE.PanelCommand(Glb.PCM_SEARCH);
      PAN_BANCHE.PanelCommand(Glb.PCM_FIND);
      PAN_BANCHE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, "115CB6C2-E925-424A-A738-03D09EB2E239");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, "Banca");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, "E2A163D9-A6FA-41FB-B1AA-4F561C0A74CB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, "ABI");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, "C90B308A-6B63-498E-8E27-2E23C060F461");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, "CAB");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, "FF1595D7-F0C6-4355-8600-F19E80C9A415");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, "Comune");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, "03F127B4-B115-4166-BE8E-98776933FEC2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, "Indirizzo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, "AC182035-B518-4ACB-8A5B-BAEEF07B69A8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, "Sportello");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, "455C6504-2BB2-489F-857D-6C07E2096DC8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, "Provincia");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, "F8AB7F41-A8A7-4078-8685-027E9EB6A8E4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, "Trova");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, "C23B7DDB-AC89-42D2-9B6C-1090DC74BEA9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, "Annulla");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, MyGlb.PANEL_LIST, "Banca");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, MyGlb.PANEL_FORM, 4, 4, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BANCA, MyGlb.PANEL_FORM, "Banca");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BANCA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BANCA, PPQRY_PARAMETRI185, "A.ROWNAMEBANCA", "ROWNAMEBANCA", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, MyGlb.PANEL_LIST, "ABI");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, MyGlb.PANEL_FORM, 4, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ABI, MyGlb.PANEL_FORM, "ABI");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ABI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ABI, PPQRY_PARAMETRI185, "A.ROWNAMEABI", "ROWNAMEABI", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, MyGlb.PANEL_LIST, "CAB");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, MyGlb.PANEL_FORM, 220, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAB, MyGlb.PANEL_FORM, "CAB");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAB, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAB, PPQRY_PARAMETRI185, "A.ROWNAMECAB", "ROWNAMECAB", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, MyGlb.PANEL_LIST, "Comune");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, MyGlb.PANEL_FORM, 4, 56, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMUNE, MyGlb.PANEL_FORM, "Comune");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_COMUNE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_COMUNE, PPQRY_PARAMETRI185, "A.ROWNAMECOMUN", "ROWNAMECOMUN", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, MyGlb.PANEL_LIST, "Indirizzo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, MyGlb.PANEL_FORM, 4, 84, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INDIRIZZO, MyGlb.PANEL_FORM, "Indirizzo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INDIRIZZO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INDIRIZZO, PPQRY_PARAMETRI185, "A.ROWNAMEINDIR", "ROWNAMEINDIR", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, MyGlb.PANEL_LIST, "Sportello");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, MyGlb.PANEL_FORM, 4, 108, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPORTELLO, MyGlb.PANEL_FORM, "Sportello");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SPORTELLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SPORTELLO, PPQRY_PARAMETRI185, "A.ROWNAMESPORT", "ROWNAMESPORT", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, MyGlb.PANEL_LIST, "Provincia");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, MyGlb.PANEL_FORM, 328, 56, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROVINCIA, MyGlb.PANEL_FORM, "Prov.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROVINCIA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROVINCIA, PPQRY_PARAMETRI185, "A.ROWNAMEPROVI", "ROWNAMEPROVI", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, MyGlb.PANEL_LIST, 280, 140, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, MyGlb.PANEL_FORM, 312, 140, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDTROVA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CMDTROVA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CMDTROVA, -1, "", "CMDTROVA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, MyGlb.PANEL_LIST, 368, 148, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, MyGlb.PANEL_FORM, 396, 140, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CMDANNULLA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CMDANNULLA, -1, "", "CMDANNULLA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI185", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Parametri");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI185, IMDBDef7.PQRY_PARAMETRI185_RS, IMDBDef1.TBL_PARAMETRI196);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BANCA, IMDBDef1.FLD_PARAMETRI196_ROWNAMEBANCA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ABI, IMDBDef1.FLD_PARAMETRI196_ROWNAMEABI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAB, IMDBDef1.FLD_PARAMETRI196_ROWNAMECAB);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_COMUNE, IMDBDef1.FLD_PARAMETRI196_ROWNAMECOMUN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INDIRIZZO, IMDBDef1.FLD_PARAMETRI196_ROWNAMEINDIR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SPORTELLO, IMDBDef1.FLD_PARAMETRI196_ROWNAMESPORT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROVINCIA, IMDBDef1.FLD_PARAMETRI196_ROWNAMEPROVI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI196");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BANCHE) PAN_BANCHE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BANCHE) PAN_BANCHE_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BANCHE) PAN_BANCHE_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BANCHE) PAN_BANCHE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BANCHE) PAN_BANCHE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
