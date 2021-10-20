// **********************************************
// Giornale Ordinativi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GiornaleOrdinativi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PAR_DATAORDINATI = 0;
  private static int GRP_PAR_VOCEPEG = 1;

  private static int PFL_PAR_DAL1 = 0;
  private static int PFL_PAR_AL1 = 1;
  private static int PFL_PAR_NEWPANELLAB1 = 2;
  private static int PFL_PAR_CAPITOLO1 = 3;
  private static int PFL_PAR_ARTICOLO1 = 4;
  private static int PFL_PAR_APRI = 5;
  private static int PFL_PAR_INFO = 6;
  private static int PFL_PAR_SLASH = 7;
  private static int PFL_PAR_NEWPANELLABE = 8;
  private static int PFL_PAR_ETICHETTASSS = 9;
  private static int PFL_PAR_DETTAGLI1 = 10;
  private static int PFL_PAR_VARIAZIONI1 = 11;
  private static int PFL_PAR_ELABORA = 12;

  private static int PPQRY_PAR90 = 0;


  IDPanel PAN_PAR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR54(IMDB);
    //
    //
    Init_PQRY_PAR90(IMDB);
    Init_PQRY_PAR90_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR54(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR54, 6);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR54, "TBL_PAR54");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEDETTA,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR54,IMDBDef6.FLD_PAR54_ROWNAMEVARIA,5,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR54, 0);
  }

  private static void Init_PQRY_PAR90(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR90, 6);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR90, "PQRY_PAR90");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEDETTA,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90,IMDBDef15.PQSL_PAR90_ROWNAMEVARIA,5,1,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PAR90, 0);
  }

  private static void Init_PQRY_PAR90_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR90_RS, 6);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR90_RS, "PQRY_PAR90_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEDETTA,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR90_RS,IMDBDef15.PQSL_PAR90_ROWNAMEVARIA,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GiornaleOrdinativi(MyWebEntryPoint w, IMDBObj imdb)
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
  public GiornaleOrdinativi()
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
    FormIdx = MyGlb.FRM_GIORNAORDINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A6B52961-7D0F-4E0F-99E6-583EF5EBB33D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 292;
    DesignHeight = 254;
    set_Caption(new IDVariant("Giornale Ordinativi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 292;
    Frames[1].Height = 228;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Par";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 228;
    PAN_PAR = new IDPanel(w, this, 1, "PAN_PAR");
    Frames[1].Content = PAN_PAR;
    PAN_PAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAR.VS = MainFrm.VisualStyleList;
    PAN_PAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 292-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AE05C285-922B-42D6-BED4-E4279B73C290");
    PAN_PAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 512, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAR.InitStatus = 2;
    PAN_PAR_Init();
    PAN_PAR_InitFields();
    PAN_PAR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR54, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GIORNAORDINA_PAR90();
      }
      PAN_PAR.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_PAR.FrIndex)
    {
      if (IdxFieldActived ==PFL_PAR_APRI) {
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
    return (obj instanceof GiornaleOrdinativi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GiornaleOrdinativi.class.getName() : (Glb.ClassWithPackage(GiornaleOrdinativi.class) ? GiornaleOrdinativi.class.getName().substring(GiornaleOrdinativi.class.getPackage().getName().length() + 1) : GiornaleOrdinativi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEAL, 0), true)>0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data Dal maggiore di data Al", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        if (IDL.Year(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEDAL, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0 || IDL.Year(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEAL, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Data non appartenente all'esercizio del contesto", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
        else
        {
          if ((IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, 0))) || (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, 0)))))
          {
            if (CheckPeg())
            {
              MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
              MainFrm.SetParametroStampaJasper((new IDVariant("DATA_DAL")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEDAL, 0)));
              MainFrm.SetParametroStampaJasper((new IDVariant("DATA_AL")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEAL, 0)));
              MainFrm.SetParametroStampaJasper((new IDVariant("DETTAGLIO")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEDETTA, 0)));
              MainFrm.SetParametroStampaJasper((new IDVariant("VARIAZIONI")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEVARIA, 0)));
              MainFrm.SetParametroStampaJasper((new IDVariant("CAP")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, 0),(new IDVariant(-1)))));
              MainFrm.SetParametroStampaJasper((new IDVariant("ART")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, 0),(new IDVariant(-1)))));
              MainFrm.SetParametroStampaJasper((new IDVariant("ENTE")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONEENTE, 0)));
              MainFrm.LanciaStampaJasper((new IDVariant("GiornaleOrdinativi")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
              // 
              // RILANCIO PER SALVARE
              // 
            }
          }
          else
          {
            IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
            v_ERR = (new IDVariant("Capitolo/Art. incompleto", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERR); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleOrdinativi", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Peg
  // **********************************************************************
  public int ApriPeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleOrdinativi", "ApriPeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info PEG
  // **********************************************************************
  public int InfoPEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info PEG Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, 0));
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleOrdinativi", "InfoPEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Check Peg
  // **********************************************************************
  public boolean CheckPeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RETVALUE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Check Peg Body
      // Procedure Body
      // 
      v_RETVALUE = (new IDVariant(-1));
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, 0)))
      {
        v_RETVALUE = (new IDVariant(-1));
        return v_RETVALUE.booleanValue();
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Capitolo/Art. non esistente", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        v_RETVALUE = (new IDVariant(0));
        return v_RETVALUE.booleanValue();
      }
      return v_RETVALUE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleOrdinativi", "CheckPeg", _e);
      return false;
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEDETTA, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEVARIA, 0, (new IDVariant("S")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleOrdinativi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleOrdinativi", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEARTIC, 0, (new IDVariant()));
      UNLOADEVENT_PARDELETROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleOrdinativi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Par: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARDELETROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEDETTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEVARIA, 0, new IDVariant());
  }

  // **********************************************************************
  // Par On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PAR_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PAR, Cancel);
      // 
      // Par On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, 0))))
      {
        CheckPeg();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleOrdinativi", "ParOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PAR);
      // 
      // Par On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR90, IMDBDef15.PQSL_PAR90_ROWNAMEARTIC, 0))))
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleOrdinativi", "ParOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void GIORNAORDINA_PAR90() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PAR90_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR54, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR54, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PAR90_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PAR90_RS, 0, IMDBDef6.TBL_PAR54, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR90_RS, 0, 0, IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR90_RS, 1, 0, IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR90_RS, 2, 0, IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR90_RS, 3, 0, IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR90_RS, 4, 0, IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEDETTA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR90_RS, 5, 0, IMDBDef6.TBL_PAR54, IMDBDef6.FLD_PAR54_ROWNAMEVARIA, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR54, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR54, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR54, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PAR90_RS, 0);
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
  private void PAN_PAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PAR_APRI)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_INFO)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoPEG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAR_Init()
  {

    PAN_PAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, "BFEED5F6-BBB3-468A-992A-7F36B3C0694F");
    PAN_PAR.set_Header(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, "Data Ordinativi");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, MyGlb.PANEL_LIST, 0, -9999, 208, 16, 0, 0);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, MyGlb.PANEL_FORM, 8, 7, 240, 49, 0, 0);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, 0, 85);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, 1, 13);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, 0, 4);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, 1, 4);
    PAN_PAR.SetFlags(MyGlb.OBJ_GROUP, GRP_PAR_DATAORDINATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, "F262D564-67BD-4276-A9B5-716576C9DE79");
    PAN_PAR.set_Header(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, "Capitolo/Art.");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, MyGlb.VIS_GROUPSTYLE);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, MyGlb.PANEL_LIST, 248, -9999, 144, 16, 0, 0);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, MyGlb.PANEL_FORM, 8, 59, 240, 53, 0, 0);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, 0, 60);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, 1, 13);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, 0, 4);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, 1, 4);
    PAN_PAR.SetFlags(MyGlb.OBJ_GROUP, GRP_PAR_VOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PAR.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, "40B670BC-8770-4A21-BD18-F290419194AC");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, "Dal");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_AL1, "AD95FC12-6262-4852-BD26-1FDE2CAEE814");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_AL1, "Al");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_AL1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, "9B9290EF-261D-4465-A56A-0986F78486CF");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, "4C8F885B-B7AC-4A4E-87FA-8EA860777124");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, "Capitolo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, "BABE8C5C-C105-45E9-AE03-6D1C2A1367B2");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, "Articolo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_APRI, "E6CF7BE7-037D-44B8-B15B-59E217C55B36");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_APRI, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_APRI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_APRI, 0, "wsearch1.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_INFO, "4ED06415-2EE9-4267-8199-1D9C6B53B6F3");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_INFO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_INFO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_INFO, 0, "info.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_INFO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, "97EB95FC-F645-413F-8E67-FE804F5B718C");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, "/");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, "8398D6FA-63AD-4A73-ACF0-DAE5F496B665");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, "F7D79618-D70A-4A8D-92C4-3A8BF968728E");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, MyGlb.VIS_LABELFIELD);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, "6736A069-2E4D-483F-93CD-E8F9E149B0DC");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, "Dettagli");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, "0342178B-FFFF-48C5-A1B7-6106C0D13BC6");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, "Variazioni");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, "4CF717F9-F3D6-4024-A186-288BCEEEF678");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, "Elabora");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, 0, "button1.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, MyGlb.PANEL_LIST, 24);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, MyGlb.PANEL_FORM, 12, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_PAR.SetFieldPage(PFL_PAR_DAL1, -1, GRP_PAR_DATAORDINATI);
    PAN_PAR.SetFieldPanel(PFL_PAR_DAL1, PPQRY_PAR90, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_AL1, MyGlb.PANEL_LIST, 104, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_AL1, MyGlb.PANEL_LIST, 20);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_AL1, MyGlb.PANEL_FORM, 136, 32, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_AL1, MyGlb.PANEL_FORM, 24);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PAR.SetFieldPage(PFL_PAR_AL1, -1, GRP_PAR_DATAORDINATI);
    PAN_PAR.SetFieldPanel(PFL_PAR_AL1, PPQRY_PAR90, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, MyGlb.PANEL_LIST, 208, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, MyGlb.PANEL_FORM, 228, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_NEWPANELLAB1, -1, GRP_PAR_DATAORDINATI);
    PAN_PAR.SetFieldPanel(PFL_PAR_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_LIST, 248, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_LIST, 48);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_FORM, 20, 88, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_FORM, 72);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_PAR.SetFieldPage(PFL_PAR_CAPITOLO1, -1, GRP_PAR_VOCEPEG);
    PAN_PAR.SetFieldPanel(PFL_PAR_CAPITOLO1, PPQRY_PAR90, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_LIST, 320, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_LIST, 44);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_FORM, 180, 88, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_FORM, 72);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_PAR.SetFieldPage(PFL_PAR_ARTICOLO1, -1, GRP_PAR_VOCEPEG);
    PAN_PAR.SetFieldPanel(PFL_PAR_ARTICOLO1, PPQRY_PAR90, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRI, MyGlb.PANEL_LIST, 60, 120, 12, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRI, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRI, MyGlb.PANEL_LIST, 2);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRI, MyGlb.PANEL_FORM, 212, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRI, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRI, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_APRI, -1, GRP_PAR_VOCEPEG);
    PAN_PAR.SetFieldPanel(PFL_PAR_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFO, MyGlb.PANEL_LIST, 68, 128, 12, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFO, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFO, MyGlb.PANEL_LIST, 2);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFO, MyGlb.PANEL_FORM, 228, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFO, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFO, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_INFO, -1, GRP_PAR_VOCEPEG);
    PAN_PAR.SetFieldPanel(PFL_PAR_INFO, -1, "", "INFO", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, MyGlb.PANEL_LIST, 52, 112, 12, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, MyGlb.PANEL_LIST, 2);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, MyGlb.PANEL_FORM, 164, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_SLASH, -1, GRP_PAR_VOCEPEG);
    PAN_PAR.SetFieldPanel(PFL_PAR_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_LIST, 180, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_FORM, 12, 88, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_NEWPANELLABE, -1, GRP_PAR_VOCEPEG);
    PAN_PAR.SetFieldPanel(PFL_PAR_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, MyGlb.PANEL_LIST, 208, 68, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, MyGlb.PANEL_FORM, 220, 84, 24, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ETICHETTASSS, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_ETICHETTASSS, -1, GRP_PAR_VOCEPEG);
    PAN_PAR.SetFieldPanel(PFL_PAR_ETICHETTASSS, -1, "", "ETICHETTASSS", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, MyGlb.PANEL_LIST, 392, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, MyGlb.PANEL_LIST, 48);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, MyGlb.PANEL_LIST, "Dettagli");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, MyGlb.PANEL_FORM, 8, 116, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, MyGlb.PANEL_FORM, 56);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLI1, MyGlb.PANEL_FORM, "Dettagli");
    PAN_PAR.SetFieldPage(PFL_PAR_DETTAGLI1, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_DETTAGLI1, PPQRY_PAR90, "A.ROWNAMEDETTA", "ROWNAMEDETTA", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_DETTAGLI1, (new IDVariant("S")), "S", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_DETTAGLI1, (new IDVariant("N")), "N", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, MyGlb.PANEL_LIST, 464, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, MyGlb.PANEL_LIST, 56);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, MyGlb.PANEL_FORM, 160, 116, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, MyGlb.PANEL_FORM, 64);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_VARIAZIONI1, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PAR.SetFieldPage(PFL_PAR_VARIAZIONI1, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_VARIAZIONI1, PPQRY_PAR90, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_VARIAZIONI1, (new IDVariant("S")), "S", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_VARIAZIONI1, (new IDVariant("N")), "N", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 144, 120, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 168, 156, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_ELABORA, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PAR.SetIMDB(IMDB, "PQRY_PAR90", true);
    PAN_PAR.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PAR.SetQueryIMDB(PPQRY_PAR90, IMDBDef15.PQRY_PAR90_RS, IMDBDef6.TBL_PAR54);
    JustLoaded = true;
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_DAL1, IMDBDef6.FLD_PAR54_ROWNAMEDAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_AL1, IMDBDef6.FLD_PAR54_ROWNAMEAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_CAPITOLO1, IMDBDef6.FLD_PAR54_ROWNAMECAPIT);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_ARTICOLO1, IMDBDef6.FLD_PAR54_ROWNAMEARTIC);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_DETTAGLI1, IMDBDef6.FLD_PAR54_ROWNAMEDETTA);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_VARIAZIONI1, IMDBDef6.FLD_PAR54_ROWNAMEVARIA);
    PAN_PAR.SetMasterTable(0, "PAR54");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAR.Status() == 2)
    {
      int oldListQBE = PAN_PAR.iUseListQBE;
      PAN_PAR.iUseListQBE = 0;
      PAN_PAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAR.PanelCommand(Glb.PCM_FIND);
      PAN_PAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PAR) PAN_PAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
