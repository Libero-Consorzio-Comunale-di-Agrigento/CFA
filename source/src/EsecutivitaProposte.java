// **********************************************
// Esecutivita Proposte
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EsecutivitaProposte extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ESECUTPROPOS_PROPOSTA = 0;
  private static int PFL_ESECUTPROPOS_NUMEROPROPOS = 1;
  private static int PFL_ESECUTPROPOS_ANNOPROPOSTA = 2;
  private static int PFL_ESECUTPROPOS_DELIBERA = 3;
  private static int PFL_ESECUTPROPOS_NUMERODELIBE = 4;
  private static int PFL_ESECUTPROPOS_ANNODELIBERA = 5;
  private static int PFL_ESECUTPROPOS_TRATTINO = 6;
  private static int PFL_ESECUTPROPOS_SLASH = 7;
  private static int PFL_ESECUTPROPOS_SLASH1 = 8;
  private static int PFL_ESECUTPROPOS_TRATTINO1 = 9;
  private static int PFL_ESECUTPROPOS_ELABORA = 10;
  private static int PFL_ESECUTPROPOS_APRI = 11;
  private static int PFL_ESECUTPROPOS_INFODELIBERA = 12;

  private static int PPQRY_PAER1 = 0;


  IDPanel PAN_ESECUTPROPOS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAER(IMDB);
    //
    //
    Init_PQRY_PAER1(IMDB);
    Init_PQRY_PAER1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAER(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PAER, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_PAER, "TBL_PAER");
    IMDB.set_FldCode(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PAER,IMDBDef2.FLD_PAER_ROWNAMANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PAER, 0);
  }

  private static void Init_PQRY_PAER1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PAER1, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PAER1, "PQRY_PAER1");
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1,IMDBDef9.PQSL_PAER1_ROWNAMANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PAER1, 0);
  }

  private static void Init_PQRY_PAER1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PAER1_RS, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PAER1_RS, "PQRY_PAER1_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAER1_RS,IMDBDef9.PQSL_PAER1_ROWNAMANNPRO,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EsecutivitaProposte(MyWebEntryPoint w, IMDBObj imdb)
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
  public EsecutivitaProposte()
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
    FormIdx = MyGlb.FRM_ESECUTPROPOS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CB272716-6213-48FE-9CB6-D51426DBDB76";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 356;
    DesignHeight = 162;
    set_Caption(new IDVariant("Esecutivita Proposte"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 356;
    Frames[1].Height = 136;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Esecutività Proposte";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 136;
    PAN_ESECUTPROPOS = new IDPanel(w, this, 1, "PAN_ESECUTPROPOS");
    Frames[1].Content = PAN_ESECUTPROPOS;
    PAN_ESECUTPROPOS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESECUTPROPOS.VS = MainFrm.VisualStyleList;
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 356-MyGlb.PAN_OFFS_X, 136-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3E3F93D1-C96E-43E8-BBE8-0D5B65E4B887");
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 320, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESECUTPROPOS.InitStatus = 2;
    PAN_ESECUTPROPOS_Init();
    PAN_ESECUTPROPOS_InitFields();
    PAN_ESECUTPROPOS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PAER, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESECUTPROPOS_PAER1();
      }
      PAN_ESECUTPROPOS.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_ESECUTPROPOS.FrIndex)
    {
      if (IdxFieldActived ==PFL_ESECUTPROPOS_APRI) {
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
    return (obj instanceof EsecutivitaProposte);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EsecutivitaProposte.class.getName() : (Glb.ClassWithPackage(EsecutivitaProposte.class) ? EsecutivitaProposte.class.getName().substring(EsecutivitaProposte.class.getPackage().getName().length() + 1) : EsecutivitaProposte.class.getName()));
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
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMUNIPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNPRO, 0)))
      {
        IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
        v_ERRORMESSAGE = (new IDVariant("Proposta e/o Delibera non indicate o incomplete", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
      }
      else
      {
        IDVariant v_NUMERORIGHE = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CF4WEBBILESECUTIVITAMOV(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_NUMERORIGHE);
        // 
        // ERRORI
        // 
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          // 
          // NIENTE ERRORI
          // 
          if (v_NUMERORIGHE.equals((new IDVariant(0)), true))
          {
            IDVariant v_NESS = new IDVariant(0,IDVariant.STRING);
            v_NESS = (new IDVariant("Nessun Movimento aggiornato", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_NESS); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
          else
          {
            MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "Elabora", _e);
      return -1;
    }
  }

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
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "Info", _e);
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
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "LoadEvent", _e);
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
        IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMANNDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMANNPRO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Esecutività Proposte On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ESECUTPROPOS_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_ESECUTPROPOS, Cancel);
      // 
      // Esecutività Proposte On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0))))
      {
        IDVariant v_SEDEDELIBERA = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NUMERODELIBE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANNODELIBERA = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDELIBERA = IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0);
        v_NUMERODELIBE = IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0);
        v_ANNODELIBERA = IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDELIBERA, v_ANNODELIBERA, v_NUMERODELIBE, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMSEDDEL, 0, new IDVariant(v_SEDEDELIBERA));
        IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODELIBE));
        IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMANNDEL, 0, new IDVariant(v_ANNODELIBERA));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "EsecutivitàProposteOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Esecutività Proposte On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_ESECUTPROPOS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ESECUTPROPOS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Esecutività Proposte On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "EsecutivitàProposteOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Esecutività Proposte On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESECUTPROPOS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESECUTPROPOS);
      // 
      // Esecutività Proposte On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMANNDEL, 0))))
      {
        PAN_ESECUTPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ESECUTPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "EsecutivitàProposteOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Esecutività Proposte On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ESECUTPROPOS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esecutività Proposte On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ESECUTPROPOS_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_ESECUTPROPOS_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef9.PQRY_PAER1, IMDBDef9.PQSL_PAER1_ROWNAMUNIPRO, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposte", "EsecutivitàProposteOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Paer
  // Primary record source for panel data
  // **********************************************************************
  private void ESECUTPROPOS_PAER1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PAER1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PAER, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PAER, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PAER1_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PAER1_RS, 0, IMDBDef2.TBL_PAER, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAER1_RS, 0, 0, IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAER1_RS, 1, 0, IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAER1_RS, 2, 0, IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAER1_RS, 3, 0, IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAER1_RS, 4, 0, IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAER1_RS, 5, 0, IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMANNPRO, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PAER, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PAER, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PAER, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PAER1_RS, 0);
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
  private void PAN_ESECUTPROPOS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ESECUTPROPOS_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ESECUTPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ESECUTPROPOS_APRI)
    {
      this.IdxPanelActived = this.PAN_ESECUTPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ESECUTPROPOS_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_ESECUTPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ESECUTPROPOS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ESECUTPROPOS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ESECUTPROPOS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESECUTPROPOS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESECUTPROPOS_Init()
  {

    PAN_ESECUTPROPOS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESECUTPROPOS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESECUTPROPOS.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, "601BBEF0-5990-47C2-91CF-824DAA7594EF");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, "Proposta");
    PAN_ESECUTPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, "");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, "5E9F2F49-2E4F-406B-8348-BED0B690A2E9");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, "Numero Proposta");
    PAN_ESECUTPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, "");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, "880E74AF-147E-4E8B-938E-1EF5068CB9C0");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, "Anno Proposta");
    PAN_ESECUTPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, "");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, "4A290B4D-C294-4DD2-BAEC-694F5D98661C");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, "Delibera");
    PAN_ESECUTPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, "");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, "09963447-E6F5-4467-BB29-EBF1C75B3549");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, "Numero Delibera");
    PAN_ESECUTPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, "");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, "0B03AC74-FBC8-4A92-B0F2-1FEEC16A838A");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, "Anno Delibera");
    PAN_ESECUTPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, "");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, "1676F95B-7B5F-4CDC-A6DF-20FB33EB0AC8");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, "-");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, "92D712E6-C2DB-485A-B956-0F5F5ADE7CDD");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, "/");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, "695E2122-75FD-4154-97C8-FF726265991E");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, "/");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, "0973E72A-015F-4B5B-8F50-DE4FA35496E1");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, "-");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, "C3F40B1E-5799-4E93-ACFB-AA888F772A2E");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, "Elabora");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ESECUTPROPOS.SetImage(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, 0, "button1.gif", false);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, "B42B48E3-116C-4472-ACFF-3BF6A30D49A8");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, "");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, MyGlb.VIS_STATICBUTTON);
    PAN_ESECUTPROPOS.SetImage(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, 0, "wsearch1.gif", false);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESECUTPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, "C8384B90-2E1F-4794-8490-9EB7F1E5654C");
    PAN_ESECUTPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, "");
    PAN_ESECUTPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_ESECUTPROPOS.SetImage(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, 0, "info.gif", false);
    PAN_ESECUTPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ESECUTPROPOS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, MyGlb.PANEL_LIST, 120, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, MyGlb.PANEL_FORM, 4, 12, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_PROPOSTA, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_PROPOSTA, PPQRY_PAER1, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, MyGlb.PANEL_LIST, 240, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num. Prop.");
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, MyGlb.PANEL_FORM, 196, 12, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, MyGlb.PANEL_FORM, 104);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_NUMEROPROPOS, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_NUMEROPROPOS, PPQRY_PAER1, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, MyGlb.PANEL_LIST, 280, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Ann. Prop.");
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, MyGlb.PANEL_FORM, 264, 12, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_ANNOPROPOSTA, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_ANNOPROPOSTA, PPQRY_PAER1, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, MyGlb.PANEL_FORM, 8, 40, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_DELIBERA, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_DELIBERA, PPQRY_PAER1, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, MyGlb.PANEL_LIST, "Num. Delib.");
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, MyGlb.PANEL_FORM, 144, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, MyGlb.PANEL_FORM, 104);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_NUMERODELIBE, MyGlb.PANEL_FORM, "Numero Delibera");
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_NUMERODELIBE, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_NUMERODELIBE, PPQRY_PAER1, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 6, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, MyGlb.PANEL_FORM, 212, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, MyGlb.PANEL_FORM, 104);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_ANNODELIBERA, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_ANNODELIBERA, PPQRY_PAER1, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, MyGlb.PANEL_LIST, 100, 92, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, MyGlb.PANEL_FORM, 176, 12, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_TRATTINO, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_TRATTINO, -1, "", "TRATTINO", 0, 0, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, MyGlb.PANEL_LIST, 108, 100, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, MyGlb.PANEL_FORM, 244, 12, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_SLASH, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, MyGlb.PANEL_LIST, 116, 108, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, MyGlb.PANEL_FORM, 192, 40, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_SLASH1, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_SLASH1, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_SLASH1, -1, "", "SLASH1", 0, 0, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, MyGlb.PANEL_LIST, 108, 100, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, MyGlb.PANEL_FORM, 124, 40, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_TRATTINO1, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_TRATTINO1, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_TRATTINO1, -1, "", "TRATTINO1", 0, 0, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, MyGlb.PANEL_LIST, 156, 120, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, MyGlb.PANEL_FORM, 220, 80, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_ELABORA, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, MyGlb.PANEL_LIST, 232, 36, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, MyGlb.PANEL_FORM, 248, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_APRI, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_APRI, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, MyGlb.PANEL_LIST, 248, 44, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, MyGlb.PANEL_FORM, 264, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTPROPOS_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTPROPOS.SetFieldPage(PFL_ESECUTPROPOS_INFODELIBERA, -1, -1);
    PAN_ESECUTPROPOS.SetFieldPanel(PFL_ESECUTPROPOS_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
  }

  private void PAN_ESECUTPROPOS_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESECUTPROPOS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESECUTPROPOS.SetIMDB(IMDB, "PQRY_PAER1", true);
    PAN_ESECUTPROPOS.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ESECUTPROPOS.SetQueryIMDB(PPQRY_PAER1, IMDBDef9.PQRY_PAER1_RS, IMDBDef2.TBL_PAER);
    JustLoaded = true;
    PAN_ESECUTPROPOS.SetFieldPrimaryIndex(PFL_ESECUTPROPOS_PROPOSTA, IMDBDef2.FLD_PAER_ROWNAMUNIPRO);
    PAN_ESECUTPROPOS.SetFieldPrimaryIndex(PFL_ESECUTPROPOS_NUMEROPROPOS, IMDBDef2.FLD_PAER_ROWNAMNUMPRO);
    PAN_ESECUTPROPOS.SetFieldPrimaryIndex(PFL_ESECUTPROPOS_ANNOPROPOSTA, IMDBDef2.FLD_PAER_ROWNAMANNPRO);
    PAN_ESECUTPROPOS.SetFieldPrimaryIndex(PFL_ESECUTPROPOS_DELIBERA, IMDBDef2.FLD_PAER_ROWNAMSEDDEL);
    PAN_ESECUTPROPOS.SetFieldPrimaryIndex(PFL_ESECUTPROPOS_NUMERODELIBE, IMDBDef2.FLD_PAER_ROWNAMNUMDEL);
    PAN_ESECUTPROPOS.SetFieldPrimaryIndex(PFL_ESECUTPROPOS_ANNODELIBERA, IMDBDef2.FLD_PAER_ROWNAMANNDEL);
    PAN_ESECUTPROPOS.SetMasterTable(0, "PAER");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESECUTPROPOS.Status() == 2)
    {
      int oldListQBE = PAN_ESECUTPROPOS.iUseListQBE;
      PAN_ESECUTPROPOS.iUseListQBE = 0;
      PAN_ESECUTPROPOS.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESECUTPROPOS.PanelCommand(Glb.PCM_FIND);
      PAN_ESECUTPROPOS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESECUTPROPOS) PAN_ESECUTPROPOS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESECUTPROPOS) PAN_ESECUTPROPOS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESECUTPROPOS) PAN_ESECUTPROPOS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESECUTPROPOS) PAN_ESECUTPROPOS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESECUTPROPOS) PAN_ESECUTPROPOS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
