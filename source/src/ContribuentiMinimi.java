// **********************************************
// Contribuenti Minimi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ContribuentiMinimi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMEFILTRO_MANDATI = 0;

  private static int PFL_PARAMEFILTRO_MANDATI = 0;
  private static int PFL_PARAMEFILTRO_ETICHETEMPTY = 1;

  private static int PPQRY_PARAMEFILTR2 = 0;


  IDPanel PAN_PARAMEFILTRO;
  private static int PFL_CONTRIMINIMI_RAGIONSOCIAL = 0;
  private static int PFL_CONTRIMINIMI_CODICEFISCAL = 1;
  private static int PFL_CONTRIMINIMI_PARTITAIVA = 2;
  private static int PFL_CONTRIMINIMI_CONTRIMINIMI = 3;
  private static int PFL_CONTRIMINIMI_INDIRIZZO = 4;
  private static int PFL_CONTRIMINIMI_PROVINCIA = 5;
  private static int PFL_CONTRIMINIMI_COMUNEDOMICI = 6;
  private static int PFL_CONTRIMINIMI_DATANASCITA = 7;
  private static int PFL_CONTRIMINIMI_COMUNENASCIT = 8;
  private static int PFL_CONTRIMINIMI_NUMERODOC = 9;
  private static int PFL_CONTRIMINIMI_DDATADOC = 10;
  private static int PFL_CONTRIMINIMI_NUMEROLIQ = 11;
  private static int PFL_CONTRIMINIMI_ANNNOLIQ = 12;
  private static int PFL_CONTRIMINIMI_IMPORTO = 13;
  private static int PFL_CONTRIMINIMI_RITECASSPROF = 14;
  private static int PFL_CONTRIMINIMI_IMPONIBILE = 15;
  private static int PFL_CONTRIMINIMI_NUMEROMAND = 16;
  private static int PFL_CONTRIMINIMI_ANNOMAND = 17;
  private static int PFL_CONTRIMINIMI_PROVINDOMICI = 18;
  private static int PFL_CONTRIMINIMI_PROVINNASCIT = 19;

  private static int PPQRY_CONTRIMINIMI = 0;

  private static int PPQRY_PROVINCIE1 = 1;
  private static int PPQRY_COMUNI1 = 2;
  private static int PPQRY_COMUNI = 3;


  IDPanel PAN_CONTRIMINIMI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMEFILTRO(IMDB);
    //
    //
    Init_PQRY_PARAMEFILTR2(IMDB);
    Init_PQRY_PARAMEFILTR2_RS(IMDB);
    Init_PQRY_CONTRIMINIMI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMEFILTRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMEFILTRO, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMEFILTRO, "TBL_PARAMEFILTRO");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEFILTRO,IMDBDef5.FLD_PARAMEFILTRO_NOMEOGGEMAND, "NOMEOGGEMAND");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEFILTRO,IMDBDef5.FLD_PARAMEFILTRO_NOMEOGGEMAND,5,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMEFILTRO, 0);
  }

  private static void Init_PQRY_PARAMEFILTR2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMEFILTR2, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMEFILTR2, "PQRY_PARAMEFILTR2");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMEFILTR2,IMDBDef15.PQSL_PARAMEFILTR2_NOMEOGGEMAND, "NOMEOGGEMAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMEFILTR2,IMDBDef15.PQSL_PARAMEFILTR2_NOMEOGGEMAND,5,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMEFILTR2, 0);
  }

  private static void Init_PQRY_PARAMEFILTR2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMEFILTR2_RS, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMEFILTR2_RS, "PQRY_PARAMEFILTR2_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMEFILTR2_RS,IMDBDef15.PQSL_PARAMEFILTR2_NOMEOGGEMAND, "NOMEOGGEMAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMEFILTR2_RS,IMDBDef15.PQSL_PARAMEFILTR2_NOMEOGGEMAND,5,10,0);
  }

  private static void Init_PQRY_CONTRIMINIMI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_CONTRIMINIMI, 21);
    IMDB.set_TblCode(IMDBDef15.PQRY_CONTRIMINIMI, "PQRY_CONTRIMINIMI");
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_BENEFICIARIO,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_RAGIONE_SOCIALE,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_INDIRIZZO, "INDIRIZZO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_INDIRIZZO,5,35,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_DATA_NASCITA, "DATA_NASCITA");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_DATA_NASCITA,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_PROVINCIA,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_CODICE_FISCALE, "CODICE_FISCALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_CODICE_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_PARTITA_IVA,5,11,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_COMUNE_DOMICILIO, "COMUNE_DOMICILIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_COMUNE_DOMICILIO,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_PROVINCIA_DOMICILIO, "PROVINCIA_DOMICILIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_PROVINCIA_DOMICILIO,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_COMUNE_NASCITA, "COMUNE_NASCITA");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_COMUNE_NASCITA,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_PROVINCIA_NASCITA, "PROVINCIA_NASCITA");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_PROVINCIA_NASCITA,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_ANNNO_LIQ, "ANNNO_LIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_ANNNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_RITENUTE_CASSE_PROF, "RITENUTE_CASSE_PROF");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_RITENUTE_CASSE_PROF,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_IMPONIBILE, "IMPONIBILE");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_IMPONIBILE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_CONMINANNMAN, "CONMINANNMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_CONMINANNMAN,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_CONMINNUMMAN, "CONMINNUMMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_CONMINNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_CONTRIMINIMI, "CONTRIMINIMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_CONTRIMINIMI,IMDBDef15.PQSL_CONTRIMINIMI_CONTRIMINIMI,5,2,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_CONTRIMINIMI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ContribuentiMinimi(MyWebEntryPoint w, IMDBObj imdb)
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
  public ContribuentiMinimi()
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
    FormIdx = MyGlb.FRM_CONTRIMINIMI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5E948237-7613-41F4-82D7-B28B2C820C46";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 2104;
    DesignHeight = 418;
    set_Caption(new IDVariant("Contribuenti Minimi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 2104;
    Frames[1].Height = 392;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.163265;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 2104;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMEFILTRO = new IDPanel(w, this, 2, "PAN_PARAMEFILTRO");
    Frames[2].Content = PAN_PARAMEFILTRO;
    PAN_PARAMEFILTRO.ShowRowSelector = false;
    PAN_PARAMEFILTRO.ShowToolbar = false;
    PAN_PARAMEFILTRO.ShowStatusbar = false;
    PAN_PARAMEFILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEFILTRO.VS = MainFrm.VisualStyleList;
    PAN_PARAMEFILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 2104-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEFILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F0E0E1C0-478B-47CF-AA18-D7C8DA54B323");
    PAN_PARAMEFILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMEFILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEFILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEFILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEFILTRO.InitStatus = 2;
    PAN_PARAMEFILTRO_Init();
    PAN_PARAMEFILTRO_InitFields();
    PAN_PARAMEFILTRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 2104;
    Frames[3].Height = 328;
    Frames[3].Caption = "Contribuenti Minimi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 328;
    PAN_CONTRIMINIMI = new IDPanel(w, this, 3, "PAN_CONTRIMINIMI");
    Frames[3].Content = PAN_CONTRIMINIMI;
    PAN_CONTRIMINIMI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTRIMINIMI.VS = MainFrm.VisualStyleList;
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 2104-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FBA4F558-696F-43C5-93A7-AC438E29BAA1");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1944, 296, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTRIMINIMI.InitStatus = 2;
    PAN_CONTRIMINIMI_Init();
    PAN_CONTRIMINIMI_InitFields();
    PAN_CONTRIMINIMI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMEFILTRO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTRIMINIMI_PARAMEFILTR2();
      }
      PAN_PARAMEFILTRO.UpdatePanel(MainFrm);
      PAN_CONTRIMINIMI.UpdatePanel(MainFrm);
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
    return (obj instanceof ContribuentiMinimi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ContribuentiMinimi.class.getName() : (Glb.ClassWithPackage(ContribuentiMinimi.class) ? ContribuentiMinimi.class.getName().substring(ContribuentiMinimi.class.getPackage().getName().length() + 1) : ContribuentiMinimi.class.getName()));
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMEFILTRO, IMDBDef5.FLD_PARAMEFILTRO_NOMEOGGEMAND, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContribuentiMinimi", "Load", _e);
    }
  }

  // **********************************************************************
  // Parametri Filtro
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONTRIMINIMI_PARAMEFILTR2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMEFILTR2_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMEFILTRO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMEFILTRO, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMEFILTR2_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMEFILTR2_RS, 0, IMDBDef5.TBL_PARAMEFILTRO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMEFILTR2_RS, 0, 0, IMDBDef5.TBL_PARAMEFILTRO, IMDBDef5.FLD_PARAMEFILTRO_NOMEOGGEMAND, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMEFILTRO, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMEFILTRO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMEFILTRO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMEFILTR2_RS, 0);
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
  private void PAN_PARAMEFILTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEFILTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEFILTRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEFILTRO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEFILTRO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMEFILTRO);
    // Stub
  }

  private void PAN_PARAMEFILTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMEFILTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEFILTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEFILTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CONTRIMINIMI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTRIMINIMI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTRIMINIMI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTRIMINIMI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTRIMINIMI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONTRIMINIMI);
    // Stub
  }

  private void PAN_CONTRIMINIMI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTRIMINIMI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTRIMINIMI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTRIMINIMI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMEFILTRO_Init()
  {

    PAN_PARAMEFILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEFILTRO.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMEFILTRO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, "21D55C30-D061-48CF-BCC3-124CFDC12B98");
    PAN_PARAMEFILTRO.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, "Mandati");
    PAN_PARAMEFILTRO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, "");
    PAN_PARAMEFILTRO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMEFILTRO.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMEFILTRO.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, MyGlb.PANEL_FORM, 8, 7, 324, 49, 0, 0);
    PAN_PARAMEFILTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, 0, 46);
    PAN_PARAMEFILTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, 1, 13);
    PAN_PARAMEFILTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, 0, 4);
    PAN_PARAMEFILTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, 1, 4);
    PAN_PARAMEFILTRO.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRO_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMEFILTRO.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMEFILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, "5AF42CA8-C1DD-4763-AE94-B4F081482860");
    PAN_PARAMEFILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, "Mandati");
    PAN_PARAMEFILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, "");
    PAN_PARAMEFILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMEFILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEFILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, "30ED7934-EBC6-4996-B9E4-3D2FF98746BE");
    PAN_PARAMEFILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, " ");
    PAN_PARAMEFILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, "Empty");
    PAN_PARAMEFILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, MyGlb.VIS_LABELFIELD);
    PAN_PARAMEFILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMEFILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEFILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, MyGlb.PANEL_LIST, 56);
    PAN_PARAMEFILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEFILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_PARAMEFILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, MyGlb.PANEL_FORM, 56, 32, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMEFILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEFILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_MANDATI, MyGlb.PANEL_FORM, "Mandati");
    PAN_PARAMEFILTRO.SetFieldPage(PFL_PARAMEFILTRO_MANDATI, -1, GRP_PARAMEFILTRO_MANDATI);
    PAN_PARAMEFILTRO.SetFieldPanel(PFL_PARAMEFILTRO_MANDATI, PPQRY_PARAMEFILTR2, "A.NOMEOGGEMAND", "NOMEOGGEMAND", 5, 10, 0, -13997);
    PAN_PARAMEFILTRO.SetValueListItem(PFL_PARAMEFILTRO_MANDATI, (new IDVariant("SI")), "Estratti Per CU", "", "", -1);
    PAN_PARAMEFILTRO.SetValueListItem(PFL_PARAMEFILTRO_MANDATI, (new IDVariant("")), "Non Estratti Per CU", "", "", -1);
    PAN_PARAMEFILTRO.SetValueListItem(PFL_PARAMEFILTRO_MANDATI, (new IDVariant("TUTTI")), "Tutti", "", "", -1);
    PAN_PARAMEFILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, MyGlb.PANEL_LIST, 384, 24, 48, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEFILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEFILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, MyGlb.PANEL_FORM, 12, 32, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEFILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRO_ETICHETEMPTY, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEFILTRO.SetFieldPage(PFL_PARAMEFILTRO_ETICHETEMPTY, -1, GRP_PARAMEFILTRO_MANDATI);
    PAN_PARAMEFILTRO.SetFieldPanel(PFL_PARAMEFILTRO_ETICHETEMPTY, -1, "", "ETICHETEMPTY", 0, 0, 0, -13997);
  }

  private void PAN_PARAMEFILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEFILTRO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMEFILTRO.SetIMDB(IMDB, "PQRY_PARAMEFILTR2", true);
    PAN_PARAMEFILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARAMEFILTRO.SetQueryIMDB(PPQRY_PARAMEFILTR2, IMDBDef15.PQRY_PARAMEFILTR2_RS, IMDBDef5.TBL_PARAMEFILTRO);
    JustLoaded = true;
    PAN_PARAMEFILTRO.SetFieldPrimaryIndex(PFL_PARAMEFILTRO_MANDATI, IMDBDef5.FLD_PARAMEFILTRO_NOMEOGGEMAND);
    PAN_PARAMEFILTRO.SetMasterTable(0, "PARAMEFILTRO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEFILTRO.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEFILTRO.iUseListQBE;
      PAN_PARAMEFILTRO.iUseListQBE = 0;
      PAN_PARAMEFILTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEFILTRO.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEFILTRO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CONTRIMINIMI_Init()
  {

    PAN_CONTRIMINIMI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTRIMINIMI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTRIMINIMI.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, "744DC99F-5612-4D44-A31E-939EAA210B28");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, "Ragione Sociale");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, "51269099-4823-495B-B2C6-541BC40DECAC");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, "Cod. Fiscale");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, "3F5A66EF-A55D-4B67-AFCE-FD5D38BE1AFE");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, "Partita Iva");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, "AF6712EC-BE88-455C-A617-910A6A1ECC1B");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, "Contr. Minimi");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, MyGlb.VIS_CHECKSTYLE);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, "4F71F88F-30A2-4BB8-BA0A-821F25C51BDB");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, "Indirizzo");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, "FFE7F72F-4ECD-4B7C-AEEF-F674481EEBB0");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, "Provincia");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, "2DAC5FB0-1544-4A75-A073-4AE5C520E068");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, "Comune Domicilio");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, "9594B30E-5D37-4EB5-A3D0-5330D6EB5EFE");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, "Data Nascita");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, "9EACF017-3655-4436-A99B-387B6FBC738B");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, "Comune Nascita");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, "7FC8785C-140A-47B2-849A-50B9E56DDD2F");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, "Numero Documento");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, "B35037E3-9BCE-40DC-9BCE-5A4291CAB7F5");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, "Data Documento");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, "B491F88B-E8E9-4541-9DF0-1FB89E3AA8C0");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, "Num. Liq.");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, "41C83AFB-CAF9-469C-B5CF-793BE55BCDF6");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, "Anno Liq.");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, "6F3B8F25-6469-4CC0-BD50-4D6DBD3DB3D7");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, "Importo");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, "99FBD075-0543-45AB-B96A-6FB94E75F1A0");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, "Ritenute Casse Prof.");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, "808104F9-8299-48C5-9BEA-D98C2D787765");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, "Imponibile");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, "BC0D9B71-505F-43C9-B8FD-756D6B88B2FD");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, "Numero Mandato");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, "853EF2DA-1DF3-40FB-A627-D7214A263DDD");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, "Anno Mandato");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, "1974B5DD-B054-4AF6-BF04-FEBF8C1557F0");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, "PROVINCIA DOMICILIO");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRIMINIMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, "AD2FCAC5-A272-4B50-947D-F3F22F518527");
    PAN_CONTRIMINIMI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, "PROVINCIA NASCITA");
    PAN_CONTRIMINIMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, "");
    PAN_CONTRIMINIMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTRIMINIMI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTRIMINIMI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 28, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_RAGIONSOCIAL, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_RAGIONSOCIAL, PPQRY_CONTRIMINIMI, "A.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 60, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, MyGlb.PANEL_LIST, 160, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, MyGlb.PANEL_LIST, 100);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, MyGlb.PANEL_LIST, "Cod. Fiscale");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, MyGlb.PANEL_FORM, 4, 100, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CODICEFISCAL, MyGlb.PANEL_FORM, "Cod. Fiscale");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_CODICEFISCAL, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_CODICEFISCAL, PPQRY_CONTRIMINIMI, "A.CODICE_FISCALE", "CODICE_FISCALE", 5, 16, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, MyGlb.PANEL_LIST, 268, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, MyGlb.PANEL_LIST, 84);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, MyGlb.PANEL_LIST, "Partita Iva");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, MyGlb.PANEL_FORM, 300, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, MyGlb.PANEL_FORM, 96);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PARTITAIVA, MyGlb.PANEL_FORM, "Partita Iva");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_PARTITAIVA, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_PARTITAIVA, PPQRY_CONTRIMINIMI, "A.PARTITA_IVA", "PARTITA_IVA", 5, 11, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, MyGlb.PANEL_LIST, 344, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, MyGlb.PANEL_LIST, 136);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, MyGlb.PANEL_LIST, "Contr. Minimi");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, MyGlb.PANEL_FORM, 12, 300, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, MyGlb.PANEL_FORM, 136);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_CONTRIMINIMI, MyGlb.PANEL_FORM, "Contr. Minimi");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_CONTRIMINIMI, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_CONTRIMINIMI, PPQRY_CONTRIMINIMI, "A.CONTRIBUENTI_MINIMI", "CONTRIMINIMI", 5, 2, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, MyGlb.PANEL_LIST, 392, 36, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, MyGlb.PANEL_LIST, 68);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, MyGlb.PANEL_LIST, "Indirizzo");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, MyGlb.PANEL_FORM, 4, 52, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_INDIRIZZO, MyGlb.PANEL_FORM, "Indirizzo");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_INDIRIZZO, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_INDIRIZZO, PPQRY_CONTRIMINIMI, "A.INDIRIZZO", "INDIRIZZO", 5, 35, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, MyGlb.PANEL_LIST, 588, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, MyGlb.PANEL_LIST, 72);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, MyGlb.PANEL_LIST, "Provincia");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, MyGlb.PANEL_FORM, 252, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, MyGlb.PANEL_FORM, 88);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINCIA, MyGlb.PANEL_FORM, "Provincia");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_PROVINCIA, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_PROVINCIA, PPQRY_CONTRIMINIMI, "A.PROVINCIA", "PROVINCIA", 1, 3, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, MyGlb.PANEL_LIST, 720, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, MyGlb.PANEL_LIST, 120);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, MyGlb.PANEL_LIST, "Comune Domicilio");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, MyGlb.PANEL_FORM, 4, 124, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNEDOMICI, MyGlb.PANEL_FORM, "Comune Domicilio");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_COMUNEDOMICI, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_COMUNEDOMICI, PPQRY_CONTRIMINIMI, "A.COMUNE_DOMICILIO", "COMUNE_DOMICILIO", 1, 3, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, MyGlb.PANEL_LIST, 880, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, MyGlb.PANEL_LIST, 92);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, MyGlb.PANEL_LIST, "Data Nascita");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, MyGlb.PANEL_FORM, 4, 76, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DATANASCITA, MyGlb.PANEL_FORM, "Data Nascita");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_DATANASCITA, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_DATANASCITA, PPQRY_CONTRIMINIMI, "A.DATA_NASCITA", "DATA_NASCITA", 6, 10, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, MyGlb.PANEL_LIST, 948, 36, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, MyGlb.PANEL_LIST, 108);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, MyGlb.PANEL_LIST, "Comune Nascita");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, MyGlb.PANEL_FORM, 204, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, MyGlb.PANEL_FORM, 120);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_COMUNENASCIT, MyGlb.PANEL_FORM, "Comune Nascita");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_COMUNENASCIT, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_COMUNENASCIT, PPQRY_CONTRIMINIMI, "A.COMUNE_NASCITA", "COMUNE_NASCITA", 1, 3, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, MyGlb.PANEL_LIST, 1184, 36, 100, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, MyGlb.PANEL_LIST, "Numero Documento");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, MyGlb.PANEL_FORM, 4, 196, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMERODOC, MyGlb.PANEL_FORM, "Numero Documento");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_NUMERODOC, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_NUMERODOC, PPQRY_CONTRIMINIMI, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, MyGlb.PANEL_LIST, 1284, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, MyGlb.PANEL_LIST, 76);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, MyGlb.PANEL_LIST, "Data Documento");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, MyGlb.PANEL_FORM, 4, 220, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_DDATADOC, MyGlb.PANEL_FORM, "Data Documento");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_DDATADOC, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_DDATADOC, PPQRY_CONTRIMINIMI, "A.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, MyGlb.PANEL_LIST, 1360, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, MyGlb.PANEL_LIST, 80);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, MyGlb.PANEL_LIST, "Num. Liq.");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, MyGlb.PANEL_FORM, 380, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, MyGlb.PANEL_FORM, 96);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROLIQ, MyGlb.PANEL_FORM, "Num. Liq.");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_NUMEROLIQ, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_NUMEROLIQ, PPQRY_CONTRIMINIMI, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, MyGlb.PANEL_LIST, 1400, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, MyGlb.PANEL_LIST, 68);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, MyGlb.PANEL_LIST, "Anno Liq.");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, MyGlb.PANEL_FORM, 4, 148, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNNOLIQ, MyGlb.PANEL_FORM, "Anno Liq.");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_ANNNOLIQ, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_ANNNOLIQ, PPQRY_CONTRIMINIMI, "A.ANNNO_LIQ", "ANNNO_LIQ", 1, 4, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, MyGlb.PANEL_LIST, 1440, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, MyGlb.PANEL_LIST, 84);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, MyGlb.PANEL_FORM, 4, 244, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_IMPORTO, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_IMPORTO, PPQRY_CONTRIMINIMI, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, MyGlb.PANEL_LIST, 1548, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, MyGlb.PANEL_LIST, 132);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, MyGlb.PANEL_LIST, "Ritenute Casse Prof.");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, MyGlb.PANEL_FORM, 4, 172, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_RITECASSPROF, MyGlb.PANEL_FORM, "Ritenute Casse Prof.");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_RITECASSPROF, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_RITECASSPROF, PPQRY_CONTRIMINIMI, "A.RITENUTE_CASSE_PROF", "RITENUTE_CASSE_PROF", 3, 38, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, MyGlb.PANEL_LIST, 1664, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, MyGlb.PANEL_LIST, 96);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, MyGlb.PANEL_LIST, "Imponibile");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, MyGlb.PANEL_FORM, 4, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, MyGlb.PANEL_FORM, 144);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_IMPONIBILE, MyGlb.PANEL_FORM, "Imponibile");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_IMPONIBILE, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_IMPONIBILE, PPQRY_CONTRIMINIMI, "A.IMPONIBILE", "IMPONIBILE", 3, 14, 2, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, MyGlb.PANEL_LIST, 1776, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, MyGlb.PANEL_LIST, 92);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, MyGlb.PANEL_LIST, "Numero Mandato");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 292, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, MyGlb.PANEL_FORM, 92);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_NUMEROMAND, MyGlb.PANEL_FORM, "Num. Mandato");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_NUMEROMAND, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_NUMEROMAND, PPQRY_CONTRIMINIMI, "A.NUMERO_MAND", "CONMINNUMMAN", 1, 5, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, MyGlb.PANEL_LIST, 1868, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, MyGlb.PANEL_LIST, 76);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, MyGlb.PANEL_LIST, "Anno Mandato");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, MyGlb.PANEL_FORM, 4, 292, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, MyGlb.PANEL_FORM, 76);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_ANNOMAND, MyGlb.PANEL_FORM, "Ann. Mand.");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_ANNOMAND, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_ANNOMAND, PPQRY_CONTRIMINIMI, "A.ANNO_MAND", "CONMINANNMAN", 1, 4, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, MyGlb.PANEL_LIST, 136);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, MyGlb.PANEL_LIST, "PROVINCIA DOMICILIO");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, MyGlb.PANEL_FORM, 4, 292, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, MyGlb.PANEL_FORM, 136);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINDOMICI, MyGlb.PANEL_FORM, "PROVINCIA DOMICILIO");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_PROVINDOMICI, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_PROVINDOMICI, PPQRY_CONTRIMINIMI, "A.PROVINCIA_DOMICILIO", "PROVINCIA_DOMICILIO", 1, 3, 0, -13997);
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, MyGlb.PANEL_LIST, 124);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, MyGlb.PANEL_LIST, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, MyGlb.PANEL_LIST, "PROVINCIA NASCITA");
    PAN_CONTRIMINIMI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, MyGlb.PANEL_FORM, 4, 292, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRIMINIMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, MyGlb.PANEL_FORM, 124);
    PAN_CONTRIMINIMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, MyGlb.PANEL_FORM, 1);
    PAN_CONTRIMINIMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRIMINIMI_PROVINNASCIT, MyGlb.PANEL_FORM, "PROVINCIA NASCITA");
    PAN_CONTRIMINIMI.SetFieldPage(PFL_CONTRIMINIMI_PROVINNASCIT, -1, -1);
    PAN_CONTRIMINIMI.SetFieldPanel(PFL_CONTRIMINIMI_PROVINNASCIT, PPQRY_CONTRIMINIMI, "A.PROVINCIA_NASCITA", "PROVINCIA_NASCITA", 1, 3, 0, -13997);
  }

  private void PAN_CONTRIMINIMI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTRIMINIMI.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROVINCIA as PROVINCIA, ");
    SQL.append("  A.DENOMINAZIONE || ' (' || A.SIGLA || ')' as PROVINDENOMI ");
    SQL.append("from ");
    SQL.append("  AD4_PROVINCIE A ");
    SQL.append("where (A.PROVINCIA = ~~PROVINCIA~~) ");
    PAN_CONTRIMINIMI.SetQuery(PPQRY_PROVINCIE1, 0, SQL, PFL_CONTRIMINIMI_PROVINCIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROVINCIA as PROVINCIA, ");
    SQL.append("  A.DENOMINAZIONE || ' (' || A.SIGLA || ')' as PROVINDENOMI ");
    SQL.append("from ");
    SQL.append("  AD4_PROVINCIE A ");
    PAN_CONTRIMINIMI.SetQuery(PPQRY_PROVINCIE1, 1, SQL, PFL_CONTRIMINIMI_PROVINCIA, "");
    PAN_CONTRIMINIMI.SetQueryDB(PPQRY_PROVINCIE1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COMUNE as COMUNICOMUNE, ");
    SQL.append("  A.DENOMINAZIONE as COMUNIDENOMI ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A ");
    SQL.append("where (A.COMUNE = ~~COMUNE_DOMICILIO~~) ");
    SQL.append("and   (A.PROVINCIA_STATO = ~~PROVINCIA_DOMICILIO~~) ");
    PAN_CONTRIMINIMI.SetQuery(PPQRY_COMUNI1, 0, SQL, PFL_CONTRIMINIMI_COMUNEDOMICI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COMUNE as COMUNICOMUNE, ");
    SQL.append("  A.DENOMINAZIONE as COMUNIDENOMI ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A ");
    SQL.append("where (A.PROVINCIA_STATO = ~~PROVINCIA_DOMICILIO~~) ");
    PAN_CONTRIMINIMI.SetQuery(PPQRY_COMUNI1, 1, SQL, PFL_CONTRIMINIMI_COMUNEDOMICI, "");
    PAN_CONTRIMINIMI.SetQueryDB(PPQRY_COMUNI1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COMUNE as COMUNICOMUNE, ");
    SQL.append("  A.DENOMINAZIONE as COMUNIDENOMI ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A ");
    SQL.append("where (A.COMUNE = ~~COMUNE_NASCITA~~) ");
    SQL.append("and   (A.PROVINCIA_STATO = ~~PROVINCIA_NASCITA~~) ");
    PAN_CONTRIMINIMI.SetQuery(PPQRY_COMUNI, 0, SQL, PFL_CONTRIMINIMI_COMUNENASCIT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COMUNE as COMUNICOMUNE, ");
    SQL.append("  A.DENOMINAZIONE as COMUNIDENOMI ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A ");
    SQL.append("where (A.PROVINCIA_STATO = ~~PROVINCIA_NASCITA~~) ");
    PAN_CONTRIMINIMI.SetQuery(PPQRY_COMUNI, 1, SQL, PFL_CONTRIMINIMI_COMUNENASCIT, "");
    PAN_CONTRIMINIMI.SetQueryDB(PPQRY_COMUNI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTRIMINIMI.SetIMDB(IMDB, "PQRY_CONTRIMINIMI", true);
    PAN_CONTRIMINIMI.set_SetString(MyGlb.MASTER_ROWNAME, "CONTRIBUENTI MINIMI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.RAGIONE_SOCIALE as RAGIONE_SOCIALE, ");
    SQL.append("  A.INDIRIZZO as INDIRIZZO, ");
    SQL.append("  A.DATA_NASCITA as DATA_NASCITA, ");
    SQL.append("  A.PROVINCIA as PROVINCIA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.COMUNE_DOMICILIO as COMUNE_DOMICILIO, ");
    SQL.append("  A.PROVINCIA_DOMICILIO as PROVINCIA_DOMICILIO, ");
    SQL.append("  A.COMUNE_NASCITA as COMUNE_NASCITA, ");
    SQL.append("  A.PROVINCIA_NASCITA as PROVINCIA_NASCITA, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNNO_LIQ as ANNNO_LIQ, ");
    SQL.append("  A.RITENUTE_CASSE_PROF as RITENUTE_CASSE_PROF, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMPONIBILE as IMPONIBILE, ");
    SQL.append("  A.ANNO_MAND as CONMINANNMAN, ");
    SQL.append("  A.NUMERO_MAND as CONMINNUMMAN, ");
    SQL.append("  A.CONTRIBUENTI_MINIMI as CONTRIMINIMI ");
    PAN_CONTRIMINIMI.SetQuery(PPQRY_CONTRIMINIMI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CONTRIBUENTI_MINIMI A ");
    PAN_CONTRIMINIMI.SetQuery(PPQRY_CONTRIMINIMI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (DECODE(A.CONTRIBUENTI_MINIMI, NULL, '-1', A.CONTRIBUENTI_MINIMI) = DECODE(~~PQRY_PARAMEFILTR2.NOMEOGGEMAND~~, 'TUTTI', DECODE(A.CONTRIBUENTI_MINIMI, NULL, '-1', A.CONTRIBUENTI_MINIMI), DECODE(~~PQRY_PARAMEFILTR2.NOMEOGGEMAND~~, NULL, '-1', ~~PQRY_PARAMEFILTR2.NOMEOGGEMAND~~))) ");
    PAN_CONTRIMINIMI.SetQuery(PPQRY_CONTRIMINIMI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTRIMINIMI.SetQuery(PPQRY_CONTRIMINIMI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTRIMINIMI.SetQuery(PPQRY_CONTRIMINIMI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTRIMINIMI.SetQuery(PPQRY_CONTRIMINIMI, 5, SQL, -1, "");
    PAN_CONTRIMINIMI.SetQueryDB(PPQRY_CONTRIMINIMI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTRIMINIMI.SetMasterTable(0, "CONTRIBUENTI_MINIMI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTRIMINIMI.Status() == 2)
    {
      int oldListQBE = PAN_CONTRIMINIMI.iUseListQBE;
      PAN_CONTRIMINIMI.iUseListQBE = 0;
      PAN_CONTRIMINIMI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTRIMINIMI.PanelCommand(Glb.PCM_FIND);
      PAN_CONTRIMINIMI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMEFILTRO) PAN_PARAMEFILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CONTRIMINIMI) PAN_CONTRIMINIMI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEFILTRO) PAN_PARAMEFILTRO_ValidateRow(Cancel);
    if (SrcObj == PAN_CONTRIMINIMI) PAN_CONTRIMINIMI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMEFILTRO) PAN_PARAMEFILTRO_DynamicProperties();
    if (SrcObj == PAN_CONTRIMINIMI) PAN_CONTRIMINIMI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEFILTRO) PAN_PARAMEFILTRO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CONTRIMINIMI) PAN_CONTRIMINIMI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMEFILTRO) PAN_PARAMEFILTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CONTRIMINIMI) PAN_CONTRIMINIMI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
