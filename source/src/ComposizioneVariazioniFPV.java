// **********************************************
// Composizione Variazioni FPV
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ComposizioneVariazioniFPV extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ELENCOVARIAZ_PROVVEDIMENT = 0;

  private static int PFL_ELENCOVARIAZ_DELIBERA = 0;
  private static int PFL_ELENCOVARIAZ_TRATTIDELIBE = 1;
  private static int PFL_ELENCOVARIAZ_NUMERODELIBE = 2;
  private static int PFL_ELENCOVARIAZ_BARRADELIBER = 3;
  private static int PFL_ELENCOVARIAZ_ANNODELIBERA = 4;
  private static int PFL_ELENCOVARIAZ_APRISCELDELI = 5;
  private static int PFL_ELENCOVARIAZ_PROPOSTA = 6;
  private static int PFL_ELENCOVARIAZ_TRATTIPROPOS = 7;
  private static int PFL_ELENCOVARIAZ_NUMEROPROPOS = 8;
  private static int PFL_ELENCOVARIAZ_BARRAPROPOST = 9;
  private static int PFL_ELENCOVARIAZ_ANNOPROPOSTA = 10;
  private static int PFL_ELENCOVARIAZ_APRISCELPROP = 11;
  private static int PFL_ELENCOVARIAZ_ETICHETTASF = 12;
  private static int PFL_ELENCOVARIAZ_ELABORA = 13;

  private static int PPQRY_PARAMETRI191 = 0;


  IDPanel PAN_ELENCOVARIAZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI516(IMDB);
    //
    //
    Init_PQRY_PARAMETRI191(IMDB);
    Init_PQRY_PARAMETRI191_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI516(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI516, 6);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI516, "TBL_PARAMETRI516");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI516,IMDBDef4.FLD_PARAMETRI516_ROWNAMANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI516, 0);
  }

  private static void Init_PQRY_PARAMETRI191(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI191, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI191, "PQRY_PARAMETRI191");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191,IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI191, 0);
  }

  private static void Init_PQRY_PARAMETRI191_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI191_RS, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI191_RS, "PQRY_PARAMETRI191_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI191_RS,IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ComposizioneVariazioniFPV(MyWebEntryPoint w, IMDBObj imdb)
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
  public ComposizioneVariazioniFPV()
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
    FormIdx = MyGlb.FRM_COMPOVARIFPV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EB302B43-2B17-4BA5-8688-38C81A33B428";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 376;
    DesignHeight = 194;
    set_Caption(new IDVariant("Composizione Variazioni FPV"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 376;
    Frames[1].Height = 168;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Elenco Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 168;
    PAN_ELENCOVARIAZ = new IDPanel(w, this, 1, "PAN_ELENCOVARIAZ");
    Frames[1].Content = PAN_ELENCOVARIAZ;
    PAN_ELENCOVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 376-MyGlb.PAN_OFFS_X, 168-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4F9FDEFD-2E75-49B0-8455-F6C00712C7C9");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 272, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOVARIAZ.InitStatus = 2;
    PAN_ELENCOVARIAZ_Init();
    PAN_ELENCOVARIAZ_InitFields();
    PAN_ELENCOVARIAZ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI516, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        COMPOVARIFPV_PARAMETRI191();
      }
      PAN_ELENCOVARIAZ.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_ELENCOVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ELENCOVARIAZ_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_ELENCOVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ELENCOVARIAZ_APRISCELPROP) {
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
    return (obj instanceof ComposizioneVariazioniFPV);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ComposizioneVariazioniFPV.class.getName() : (Glb.ClassWithPackage(ComposizioneVariazioniFPV.class) ? ComposizioneVariazioniFPV.class.getName().substring(ComposizioneVariazioniFPV.class.getPackage().getName().length() + 1) : ComposizioneVariazioniFPV.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioniFPV", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioniFPV", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERR2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_ERR1 = (new IDVariant("Errore. La data inserita non è corretta. Anno inferiore a 1900", IDVariant.STRING));
      v_ERR2 = (new IDVariant("Errore. Data Al inferiore a Data Dal", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, 0))))
      {
        MainFrm.set_AlertMessage((new IDVariant("Indicare la Delibera o la Proposta"))); 
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Delibera non presente", IDVariant.STRING));
          v_CONTATORE = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Delibera incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, 0)) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, 0))))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Proposta inesistente", IDVariant.STRING));
          if (MainFrm.GESTIODELIBE.booleanValue())
          {
            v_CONTATORE = (new IDVariant(0));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  PROPOSTE A ");
            SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(0)), true))
            {
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Proposta incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Indicare la Delibera o la Proposta"))); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKCOMPVARFPV(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("PROGR_SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("SEDE_DEL")), IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("NUM_DEL")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_DEL")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("UN_PROP")), IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("NUM_PROP")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_PROP")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, 0)));
      MainFrm.LanciaStampaJasper((new IDVariant("Comp_Var_FPV")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioniFPV", "Elabora", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMANNDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMANNPRO, 0, (new IDVariant()));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioniFPV", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioniFPV", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Variazioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Variazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI191, IMDBDef12.PQSL_PARAMETRI191_ROWNAMUNIPRO, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioniFPV", "ElencoVariazioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void COMPOVARIFPV_PARAMETRI191() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI191_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI516, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI516, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI191_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI191_RS, 0, IMDBDef4.TBL_PARAMETRI516, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI191_RS, 0, 0, IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI191_RS, 1, 0, IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI191_RS, 2, 0, IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI191_RS, 3, 0, IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI191_RS, 4, 0, IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI191_RS, 5, 0, IMDBDef4.TBL_PARAMETRI516, IMDBDef4.FLD_PARAMETRI516_ROWNAMANNPRO, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI516, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI516, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI516, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI191_RS, 0);
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
  private void PAN_ELENCOVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOVARIAZ, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELENCOVARIAZ);
    // Stub
  }

  private void PAN_ELENCOVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ELENCOVARIAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOVARIAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOVARIAZ_Init()
  {

    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "6433C701-5D47-493D-94EC-C90FDB69CCD9");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "Provvedimento");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.PANEL_FORM, 8, 11, 320, 73, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0, 87);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "5F807243-96C8-4847-B323-93581C49C7C8");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, "9C58FC2D-4CED-414F-8AD8-7F8C0C1E8566");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, "-");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "5B5395D1-4D3A-4166-BAB8-2CC755D2EBB0");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "Numero Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, "9754F986-56E2-46EA-84D1-6F36F9221D2F");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, "/");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "827BDD5C-5A5F-4EF1-90DF-67FCD29146DC");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "Anno Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, "3EBDD5C3-C270-420B-AF7B-E8E8C687123E");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "5CEC7B17-20BF-4AC9-95E4-4365A4D53B97");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, "F81946D5-7921-42A4-9DF7-4CB7D1F299BF");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, "-");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, "D0B65D0B-CB4C-4F92-B8D7-BFD0FA1F07E8");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, "Numero Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, "BE12ED01-1BE2-4A64-9854-0CDA9C24A9EB");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, "/");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, "F4C8B2D6-0DCD-4C2E-9B0D-BB8E41F08A76");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, "Anno Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, "29CB3F7E-3568-413B-991C-2F5BB099E4B8");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, "CE2A6AEA-C017-4C0E-9D32-1AE13EDD65DF");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, "8199380D-D9E6-4B4B-8BF5-5D05AB39A809");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, "Elabora");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, 0, "button1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ELENCOVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 16, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DELIBERA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DELIBERA, PPQRY_PARAMETRI191, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 188, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TRATTIDELIBE, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 208, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NUMERODELIBE, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NUMERODELIBE, PPQRY_PARAMETRI191, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 248, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_BARRADELIBER, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 268, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ANNODELIBERA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ANNODELIBERA, PPQRY_PARAMETRI191, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 308, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_APRISCELDELI, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 12, 60, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_PROPOSTA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_PROPOSTA, PPQRY_PARAMETRI191, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 188, 60, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TRATTIPROPOS, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 208, 60, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NUMEROPROPOS, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NUMEROPROPOS, PPQRY_PARAMETRI191, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 248, 60, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_BARRAPROPOST, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 268, 60, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ANNOPROPOSTA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ANNOPROPOSTA, PPQRY_PARAMETRI191, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 308, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_APRISCELPROP, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 596, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 316, 60, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ETICHETTASF, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_LIST, 428, 292, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_FORM, 244, 92, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ELABORA, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ELENCOVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCOVARIAZ.SetIMDB(IMDB, "PQRY_PARAMETRI191", true);
    PAN_ELENCOVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ELENCOVARIAZ.SetQueryIMDB(PPQRY_PARAMETRI191, IMDBDef12.PQRY_PARAMETRI191_RS, IMDBDef4.TBL_PARAMETRI516);
    JustLoaded = true;
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DELIBERA, IMDBDef4.FLD_PARAMETRI516_ROWNAMSEDDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_NUMERODELIBE, IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ANNODELIBERA, IMDBDef4.FLD_PARAMETRI516_ROWNAMANNDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_PROPOSTA, IMDBDef4.FLD_PARAMETRI516_ROWNAMUNIPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_NUMEROPROPOS, IMDBDef4.FLD_PARAMETRI516_ROWNAMNUMPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ANNOPROPOSTA, IMDBDef4.FLD_PARAMETRI516_ROWNAMANNPRO);
    PAN_ELENCOVARIAZ.SetMasterTable(0, "PARAMETRI516");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOVARIAZ.iUseListQBE;
      PAN_ELENCOVARIAZ.iUseListQBE = 0;
      PAN_ELENCOVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
