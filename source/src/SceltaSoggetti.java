// **********************************************
// Scelta Soggetti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaSoggetti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ANCHESCADUTI = 0;

  private static int PPQRY_PARAMETRI664 = 0;


  IDPanel PAN_PARAMETRI;
  private static int GRP_SOGGETTI_VALIDITA = 0;

  private static int PFL_SOGGETTI_RAGIONSOCIAL = 0;
  private static int PFL_SOGGETTI_NI = 1;
  private static int PFL_SOGGETTI_CODICE = 2;
  private static int PFL_SOGGETTI_TIPOSOGGETTO = 3;
  private static int PFL_SOGGETTI_SCADENZA = 4;
  private static int PFL_SOGGETTI_DAL = 5;
  private static int PFL_SOGGETTI_AL = 6;
  private static int PFL_SOGGETTI_CODICEFISCAL = 7;
  private static int PFL_SOGGETTI_PARTITAIVA = 8;
  private static int PFL_SOGGETTI_INDIRIZZO = 9;
  private static int PFL_SOGGETTI_CATEGORIA = 10;
  private static int PFL_SOGGETTI_PAGEURO = 11;

  private static int PPQRY_SOGGETTI4 = 0;

  private static int PPQRY_T05 = 1;


  IDPanel PAN_SOGGETTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI401(IMDB);
    //
    //
    Init_PQRY_SOGGETTI4(IMDB);
    Init_PQRY_PARAMETRI664(IMDB);
    Init_PQRY_PARAMETRI664_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI401(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI401, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI401, "TBL_PARAMETRI401");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI401,IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, "PARADATASCAD");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI401,IMDBDef1.FLD_PARAMETRI401_PARADATASCAD,6,19,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI401,IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, "PARAANCHSCAD");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI401,IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI401,IMDBDef1.FLD_PARAMETRI401_PARVISPANPAR, "PARVISPANPAR");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI401,IMDBDef1.FLD_PARAMETRI401_PARVISPANPAR,5,50,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI401, 0);
  }

  private static void Init_PQRY_SOGGETTI4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_SOGGETTI4, 12);
    IMDB.set_TblCode(IMDBDef7.PQRY_SOGGETTI4, "PQRY_SOGGETTI4");
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_CODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_D_SCADENZA, "D_SCADENZA");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_D_SCADENZA,6,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_CODICE_FISCALE, "CODICE_FISCALE");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_CODICE_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_PARTITA_IVA,5,11,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_INDIRIZZOBEN, "INDIRIZZOBEN");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_INDIRIZZOBEN,5,76,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_CATEGORIA,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_PAGAMENTO_IN_EURO, "PAGAMENTO_IN_EURO");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_PAGAMENTO_IN_EURO,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_BENNI, "BENNI");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_BENNI,1,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_BENDAL, "BENDAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_BENDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_BENAL, "BENAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_BENAL,6,14,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_BENTIPOSOGGE, "BENTIPOSOGGE");
    IMDB.SetFldParams(IMDBDef7.PQRY_SOGGETTI4,IMDBDef7.PQSL_SOGGETTI4_BENTIPOSOGGE,12,1,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_SOGGETTI4, 0);
  }

  private static void Init_PQRY_PARAMETRI664(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI664, 2);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI664, "PQRY_PARAMETRI664");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI664,IMDBDef7.PQSL_PARAMETRI664_PARADATASCAD, "PARADATASCAD");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI664,IMDBDef7.PQSL_PARAMETRI664_PARADATASCAD,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI664,IMDBDef7.PQSL_PARAMETRI664_PARAANCHSCAD, "PARAANCHSCAD");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI664,IMDBDef7.PQSL_PARAMETRI664_PARAANCHSCAD,5,2,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI664, 0);
  }

  private static void Init_PQRY_PARAMETRI664_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI664_RS, 2);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI664_RS, "PQRY_PARAMETRI664_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI664_RS,IMDBDef7.PQSL_PARAMETRI664_PARADATASCAD, "PARADATASCAD");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI664_RS,IMDBDef7.PQSL_PARAMETRI664_PARADATASCAD,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI664_RS,IMDBDef7.PQSL_PARAMETRI664_PARAANCHSCAD, "PARAANCHSCAD");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI664_RS,IMDBDef7.PQSL_PARAMETRI664_PARAANCHSCAD,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaSoggetti(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaSoggetti()
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
    FormIdx = MyGlb.FRM_SCELTASOGGET;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D5CB5964-A5D2-4507-B387-9BCC4335F662";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 976;
    DesignHeight = 466;
    set_Caption(new IDVariant("Scelta Soggetti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 976;
    Frames[1].Height = 440;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.127273;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 976;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 976-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "87225B3C-D977-4F26-BA2B-26EC7119FEED");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 40, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 976;
    Frames[3].Height = 384;
    Frames[3].Caption = "Soggetti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 384;
    PAN_SOGGETTI = new IDPanel(w, this, 3, "PAN_SOGGETTI");
    Frames[3].Content = PAN_SOGGETTI;
    PAN_SOGGETTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SOGGETTI.VS = MainFrm.VisualStyleList;
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 976-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A88A298C-8E26-4BF2-8EA0-22D0F60435DE");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1584, 316, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SOGGETTI.InitStatus = 1;
    PAN_SOGGETTI_Init();
    PAN_SOGGETTI_InitFields();
    PAN_SOGGETTI_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI401, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELTASOGGET_PARAMETRI664();
      }
      PAN_SOGGETTI.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SceltaSoggetti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaSoggetti.class.getName() : (Glb.ClassWithPackage(SceltaSoggetti.class) ? SceltaSoggetti.class.getName().substring(SceltaSoggetti.class.getPackage().getName().length() + 1) : SceltaSoggetti.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_SOGGETTI.set_FixedCols((new IDVariant(1)).intValue());
      PAN_SOGGETTI.set_iLockable((new IDVariant(0)).booleanValue());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      if (IDL.NullValue(MainFrm.ANAGRACONDIV,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_SOGGETTI.SetFlags (Glb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0).equals((new IDVariant("NO")), true))
        {
          PAN_PARAMETRI.set_Visible((new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        PAN_SOGGETTI.SetFlags (Glb.OBJ_FIELD, PFL_SOGGETTI_NI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SOGGETTI.SetFlags (Glb.OBJ_FIELD, PFL_SOGGETTI_DAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SOGGETTI.SetFlags (Glb.OBJ_FIELD, PFL_SOGGETTI_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SOGGETTI.SetFlags (Glb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (((IMDB.Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARVISPANPAR, 0).equals((new IDVariant())))?IMDB.Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0):IMDB.Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARVISPANPAR, 0)).equals((new IDVariant("NO")), true))
      {
        PAN_PARAMETRI.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_PARAMETRI.set_Visible((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSoggetti", "LoadEvent", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSoggetti", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perch� stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARVISPANPAR, 0, new IDVariant());
  }

  // **********************************************************************
  // Soggetti On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SOGGETTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SOGGETTI);
      // 
      // Soggetti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SOGGETTI.set_ToolTip(Glb.OBJ_FIELD,PFL_SOGGETTI_RAGIONSOCIAL,(new IDVariant(PAN_SOGGETTI.FieldText(PFL_SOGGETTI_RAGIONSOCIAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSoggetti", "SoggettiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SCELTASOGGET_PARAMETRI664() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_PARAMETRI664_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI401, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI401, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI664_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_PARAMETRI664_RS, 0, IMDBDef1.TBL_PARAMETRI401, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI664_RS, 0, 0, IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI664_RS, 1, 0, IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI401, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI401, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI401, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef7.PQRY_PARAMETRI664_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cio� quando viene portata in primo piano
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
  // Consente l'aggiustamento delle propriet� visuali delle
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SOGGETTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SOGGETTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SOGGETTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SOGGETTI, Cancel);
    // Stub
  }

  private void PAN_SOGGETTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SOGGETTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SOGGETTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SOGGETTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SOGGETTI_Init()
  {

    PAN_SOGGETTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SOGGETTI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, "A36C57CD-CCB9-413D-B9CE-F20DA22198DE");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, "Validit�");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, MyGlb.VIS_GROUPSTYLE);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, MyGlb.PANEL_LIST, 652, -9999, 160, 16, 0, 0);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, MyGlb.PANEL_FORM, 0, 291, 124, 73, 0, 0);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 0, 42);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 1, 13);
    PAN_SOGGETTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 0, 4);
    PAN_SOGGETTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 1, 4);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_GROUP, GRP_SOGGETTI_VALIDITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SOGGETTI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, "12BE0304-16A7-4763-A9F0-B358CD538A2A");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, "Ragione Sociale");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, "1FFBABA1-B00F-4D72-9A9F-A50D64334EE2");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, "Numero Identificativo");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, "49F30210-DFC3-40E2-9500-BCF6DE68A091");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, "Codice");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, "Codice del beneficiario");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.VIS_NORFIEINTLUN);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, "EB88D4BF-51D9-48D8-818D-6CFCF80DF561");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, "Tipo Soggetto");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, "13388C86-CCDE-4589-9A1D-B5A120D8CBE9");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, "Scadenza");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, "BF7561BE-8A00-428D-B4E6-C0D2FA6668FC");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, "Dal");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, "E19EC51D-E845-47F7-A23F-35809013227F");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, "Al");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, "671060AD-7932-4409-B570-D061CAFCA3A7");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, "Codice Fiscale");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, "5EFC5200-B9B6-4364-9DB3-E53C6D07AAC2");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, "Partita IVA");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, "0D42FF31-A81D-43A9-A941-A283B65D56BE");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, "Indirizzo");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, "56BE7623-E4D2-46BB-B3C5-75F8C8BB6F45");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, "Categoria");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, "Categoria");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, "F665FB4F-D456-4E10-BA4A-1E962DD2E782");
    PAN_SOGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, "Pag Euro");
    PAN_SOGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, "");
    PAN_SOGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.VIS_CHECKSTYLE);
    PAN_SOGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SOGGETTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 140);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 196, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 140);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_RAGIONSOCIAL, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_RAGIONSOCIAL, PPQRY_SOGGETTI4, "A.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_LIST, 308, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_LIST, 20);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_LIST, "Numero Identificativo");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_FORM, 4, 292, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_FORM, 20);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_NI, MyGlb.PANEL_FORM, "N. I.");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_NI, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_NI, PPQRY_SOGGETTI4, "A.NI", "BENNI", 1, 8, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, 392, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, 4, 28, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_CODICE, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_CODICE, PPQRY_SOGGETTI4, "A.CODICE", "CODICE", 2, 15, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_LIST, 476, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_LIST, 100);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_LIST, "Tipo Soggetto");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_FORM, 4, 364, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_FORM, 100);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_TIPOSOGGETTO, MyGlb.PANEL_FORM, "Tipo Soggetto");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_TIPOSOGGETTO, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_TIPOSOGGETTO, PPQRY_SOGGETTI4, "A.TIPO_SOGGETTO", "BENTIPOSOGGE", 12, 1, 0, -13997);
    PAN_SOGGETTI.SetValueListItem(PFL_SOGGETTI_TIPOSOGGETTO, (new IDVariant("G")), "Generico", "", "", -1);
    PAN_SOGGETTI.SetValueListItem(PFL_SOGGETTI_TIPOSOGGETTO, (new IDVariant("I")), "Fisico", "", "", -1);
    PAN_SOGGETTI.SetValueListItem(PFL_SOGGETTI_TIPOSOGGETTO, (new IDVariant("E")), "Giuridico", "Giuridico", "", -1);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_LIST, 576, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_LIST, 72);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_FORM, 4, 148, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_FORM, 72);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_SCADENZA, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_SCADENZA, PPQRY_SOGGETTI4, "A.D_SCADENZA", "D_SCADENZA", 6, 10, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_LIST, 652, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_LIST, 32);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_FORM, 4, 316, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_FORM, 32);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_DAL, -1, GRP_SOGGETTI_VALIDITA);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_DAL, PPQRY_SOGGETTI4, "A.DAL", "BENDAL", 6, 14, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_LIST, 732, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_LIST, 24);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_FORM, 4, 340, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_FORM, 24);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_AL, -1, GRP_SOGGETTI_VALIDITA);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_AL, PPQRY_SOGGETTI4, "A.AL", "BENAL", 6, 14, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, 812, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, 92);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, 4, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, 92);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_CODICEFISCAL, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_CODICEFISCAL, PPQRY_SOGGETTI4, "A.CODICE_FISCALE", "CODICE_FISCALE", 5, 16, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, 932, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, 72);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_LIST, "Partita IVA");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, 4, 76, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, 72);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PARTITAIVA, MyGlb.PANEL_FORM, "Partita IVA");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_PARTITAIVA, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_PARTITAIVA, PPQRY_SOGGETTI4, "A.PARTITA_IVA", "PARTITA_IVA", 5, 11, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, MyGlb.PANEL_LIST, 1032, 36, 296, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, MyGlb.PANEL_LIST, 48);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, MyGlb.PANEL_LIST, "Indirizzo");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, MyGlb.PANEL_FORM, 4, 244, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, MyGlb.PANEL_FORM, 48);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, MyGlb.PANEL_FORM, 2);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_INDIRIZZO, MyGlb.PANEL_FORM, "Indir.");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_INDIRIZZO, -1, -1);
    PAN_SOGGETTI.SetFieldUnbound(PFL_SOGGETTI_INDIRIZZO, true);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_INDIRIZZO, PPQRY_SOGGETTI4, "A.INDIRIZZO || ' ' || B.DENOMINAZIONE", "INDIRIZZOBEN", 5, 76, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_LIST, 1328, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_LIST, 68);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_FORM, 68);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_CATEGORIA, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_CATEGORIA, PPQRY_SOGGETTI4, "A.CATEGORIA", "CATEGORIA", 1, 3, 0, -13997);
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_LIST, 1212, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_LIST, 116);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_LIST, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_LIST, "Pag Euro");
    PAN_SOGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_FORM, 4, 172, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_FORM, 116);
    PAN_SOGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_FORM, 1);
    PAN_SOGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOGGETTI_PAGEURO, MyGlb.PANEL_FORM, "Pag Euro");
    PAN_SOGGETTI.SetFieldPage(PFL_SOGGETTI_PAGEURO, -1, -1);
    PAN_SOGGETTI.SetFieldPanel(PFL_SOGGETTI_PAGEURO, PPQRY_SOGGETTI4, "A.PAGAMENTO_IN_EURO", "PAGAMENTO_IN_EURO", 5, 2, 0, -13997);
  }

  private void PAN_SOGGETTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SOGGETTI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIOT05 ");
    SQL.append("from ");
    SQL.append("  T05 A ");
    SQL.append("where (A.CODICE = ~~CATEGORIA~~) ");
    PAN_SOGGETTI.SetQuery(PPQRY_T05, 0, SQL, PFL_SOGGETTI_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIOT05 ");
    SQL.append("from ");
    SQL.append("  T05 A ");
    PAN_SOGGETTI.SetQuery(PPQRY_T05, 1, SQL, PFL_SOGGETTI_CATEGORIA, "");
    PAN_SOGGETTI.SetQueryDB(PPQRY_T05, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SOGGETTI.SetIMDB(IMDB, "PQRY_SOGGETTI4", true);
    PAN_SOGGETTI.set_SetString(MyGlb.MASTER_ROWNAME, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.INDIRIZZO || ' ' || B.DENOMINAZIONE as INDIRIZZOBEN, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.PAGAMENTO_IN_EURO as PAGAMENTO_IN_EURO, ");
    SQL.append("  A.NI as BENNI, ");
    SQL.append("  A.DAL as BENDAL, ");
    SQL.append("  A.AL as BENAL, ");
    SQL.append("  A.TIPO_SOGGETTO as BENTIPOSOGGE ");
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BEN A, ");
    SQL.append("  AD4_COMUNI B ");
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.COMUNE = B.COMUNE(+)) ");
    SQL.append("and   (A.PROVINCIA = B.PROVINCIA_STATO(+)) ");
    SQL.append("and   (((NVL(~~PQRY_PARAMETRI664.PARAANCHSCAD~~, 'NO') = 'NO') AND ((~~TBL_PARAMETRI401.PARADATASCAD~~ BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD'))) AND NVL(A.D_SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= ~~TBL_PARAMETRI401.PARADATASCAD~~)) OR NVL(~~PQRY_PARAMETRI664.PARAANCHSCAD~~, 'NO') = 'SI') ");
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  A.CODICE ");
    PAN_SOGGETTI.SetQuery(PPQRY_SOGGETTI4, 5, SQL, -1, "");
    PAN_SOGGETTI.SetQueryDB(PPQRY_SOGGETTI4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SOGGETTI.SetMasterTable(0, "BEN");
    PAN_SOGGETTI.AddToSortList(PFL_SOGGETTI_RAGIONSOCIAL, true);
    PAN_SOGGETTI.AddToSortList(PFL_SOGGETTI_CODICE, true);
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_SOGGETTI.Status() == 2)
    {
      int oldListQBE = PAN_SOGGETTI.iUseListQBE;
      PAN_SOGGETTI.iUseListQBE = 0;
      PAN_SOGGETTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SOGGETTI.PanelCommand(Glb.PCM_FIND);
      PAN_SOGGETTI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, "027EB6DE-4D27-4EC4-894A-7D077CFA7B32");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, "Anche Scaduti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, MyGlb.PANEL_LIST, "Anc. Scad.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, MyGlb.PANEL_FORM, 12, 4, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHESCADUTI, MyGlb.PANEL_FORM, "Anche Scaduti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANCHESCADUTI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANCHESCADUTI, PPQRY_PARAMETRI664, "A.PARAANCHSCAD", "PARAANCHSCAD", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHESCADUTI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHESCADUTI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI664", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI664, IMDBDef7.PQRY_PARAMETRI664_RS, IMDBDef1.TBL_PARAMETRI401);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANCHESCADUTI, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI401");
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
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
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SOGGETTI) PAN_SOGGETTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
