// **********************************************
// Prospetto Trimestrale Di Cassa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ProspettoTrimestraleDiCassa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PROSTRIDICAS_ENTE = 0;
  private static int GRP_PROSTRIDICAS_REGOLARIZZAZ = 1;

  private static int PFL_PROSTRIDICAS_TIPO = 0;
  private static int PFL_PROSTRIDICAS_NUMERO = 1;
  private static int PFL_PROSTRIDICAS_DATAELABORAZ = 2;
  private static int PFL_PROSTRIDICAS_INCASSI = 3;
  private static int PFL_PROSTRIDICAS_PAGAMENTI = 4;
  private static int PFL_PROSTRIDICAS_NEWPANELLABE = 5;
  private static int PFL_PROSTRIDICAS_ELABORA = 6;

  private static int PPQRY_PAR23 = 0;


  IDPanel PAN_PROSTRIDICAS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR26(IMDB);
    //
    //
    Init_PQRY_PAR23(IMDB);
    Init_PQRY_PAR23_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR26(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR26, 5);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR26, "TBL_PAR26");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMETIPO,5,10,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMENUMER,5,10,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMEINCAS, "ROWNAMEINCAS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMEINCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMEPAGAM, "ROWNAMEPAGAM");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR26,IMDBDef6.FLD_PAR26_ROWNAMEPAGAM,3,14,2);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR26, 0);
  }

  private static void Init_PQRY_PAR23(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR23, 5);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR23, "PQRY_PAR23");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMETIPO,5,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMENUMER,5,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMEINCAS, "ROWNAMEINCAS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMEINCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMEPAGAM, "ROWNAMEPAGAM");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23,IMDBDef16.PQSL_PAR23_ROWNAMEPAGAM,3,14,2);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR23, 0);
  }

  private static void Init_PQRY_PAR23_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR23_RS, 5);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR23_RS, "PQRY_PAR23_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMETIPO,5,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMENUMER,5,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMEINCAS, "ROWNAMEINCAS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMEINCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMEPAGAM, "ROWNAMEPAGAM");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR23_RS,IMDBDef16.PQSL_PAR23_ROWNAMEPAGAM,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ProspettoTrimestraleDiCassa(MyWebEntryPoint w, IMDBObj imdb)
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
  public ProspettoTrimestraleDiCassa()
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
    FormIdx = MyGlb.FRM_PROSTRIDICAS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FBD7A166-F8F2-41A3-A2A5-A725DCAECB9B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 376;
    DesignHeight = 314;
    set_Caption(new IDVariant("Prospetto Trimestrale Di Cassa"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 376;
    Frames[1].Height = 288;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Prospetto Trimestrale Di Cassa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 288;
    PAN_PROSTRIDICAS = new IDPanel(w, this, 1, "PAN_PROSTRIDICAS");
    Frames[1].Content = PAN_PROSTRIDICAS;
    PAN_PROSTRIDICAS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROSTRIDICAS.VS = MainFrm.VisualStyleList;
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 376-MyGlb.PAN_OFFS_X, 288-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DABE7CD8-737E-48D4-8504-EB3E244B001A");
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 384, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROSTRIDICAS.InitStatus = 2;
    PAN_PROSTRIDICAS_Init();
    PAN_PROSTRIDICAS_InitFields();
    PAN_PROSTRIDICAS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR26, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PROSTRIDICAS_PAR23();
      }
      PAN_PROSTRIDICAS.UpdatePanel(MainFrm);
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
    return (obj instanceof ProspettoTrimestraleDiCassa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ProspettoTrimestraleDiCassa.class.getName() : (Glb.ClassWithPackage(ProspettoTrimestraleDiCassa.class) ? ProspettoTrimestraleDiCassa.class.getName().substring(ProspettoTrimestraleDiCassa.class.getPackage().getName().length() + 1) : ProspettoTrimestraleDiCassa.class.getName()));
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
    IDVariant v_PRIMOTRIM = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_PRIMOTRIM1 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_PRIMOTRIM2 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_PRIMOTRIM3 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MID = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONDIZIONE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONDIZIONE1 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_FINALE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONDIZIONE2 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONDIZIONE3 = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_PRIMOTRIM = (new IDVariant(3103, IDVariant.INTEGER));
      v_PRIMOTRIM1 = (new IDVariant(3006, IDVariant.INTEGER));
      v_PRIMOTRIM2 = (new IDVariant(3009, IDVariant.INTEGER));
      v_PRIMOTRIM3 = (new IDVariant(3112, IDVariant.INTEGER));
      // 
      // Elabora Body
      // Procedure Body
      // 
      v_MID = IDL.Replace(IDL.Trim(IDL.SubStr(MainFrm.Datetostring(IMDB.Value(IMDBDef16.PQRY_PAR23, IMDBDef16.PQSL_PAR23_ROWNAMDATELA, 0)), (new IDVariant(1)), (new IDVariant(5))), true, true), (new IDVariant("/")), (new IDVariant("")));
      v_CONDIZIONE = (new IDVariant(IDL.ToInteger(v_MID).compareTo(v_PRIMOTRIM, true)!=0));
      v_CONDIZIONE1 = (new IDVariant(IDL.ToInteger(v_MID).compareTo(v_PRIMOTRIM1, true)!=0));
      v_CONDIZIONE2 = (new IDVariant(IDL.ToInteger(v_MID).compareTo(v_PRIMOTRIM2, true)!=0));
      v_CONDIZIONE3 = (new IDVariant(IDL.ToInteger(v_MID).compareTo(v_PRIMOTRIM3, true)!=0));
      v_FINALE = (new IDVariant(v_CONDIZIONE.booleanValue() && v_CONDIZIONE1.booleanValue() && v_CONDIZIONE2.booleanValue() && v_CONDIZIONE3.booleanValue()));
      if (v_FINALE.equals((new IDVariant(-1)), true))
      {
        if (!(Fake()))
        {
          return 0;
        }
      }
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("TIPO_ENTE"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("NUMERO_ENTE"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("INCASSI"));
      IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR5 = (new IDVariant("PAGAMENTI"));
      IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR6 = (new IDVariant("DATA_ELAB"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Prospetto_Trimestrale_Cassa"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IMDB.Value(IMDBDef16.PQRY_PAR23, IMDBDef16.PQSL_PAR23_ROWNAMETIPO, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IMDB.Value(IMDBDef16.PQRY_PAR23, IMDBDef16.PQSL_PAR23_ROWNAMENUMER, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR23, IMDBDef16.PQSL_PAR23_ROWNAMEINCAS, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR23, IMDBDef16.PQSL_PAR23_ROWNAMEPAGAM, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR23, IMDBDef16.PQSL_PAR23_ROWNAMDATELA, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProspettoTrimestraleDiCassa", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Fake
  // **********************************************************************
  public boolean Fake ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RETURNVALUE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_RETURNVALUE = (new IDVariant(0, IDVariant.INTEGER));
      v_MESSAGGIO = (new IDVariant("La data inserita non è una data di fine trimestre. Si desidera continuare?", IDVariant.STRING));
      // 
      // Fake Body
      // Procedure Body
      // 
      if (!(MainFrm.MessageConfirm(v_MESSAGGIO)))
      {
        v_RETURNVALUE = (new IDVariant(0));
        return v_RETURNVALUE.booleanValue();
      }
      v_RETURNVALUE = (new IDVariant(-1));
      return v_RETURNVALUE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProspettoTrimestraleDiCassa", "Fake", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMETIPO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMENUMER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMDATELA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMEINCAS, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMEPAGAM, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProspettoTrimestraleDiCassa", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMETIPO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMENUMER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMEINCAS, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMEPAGAM, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProspettoTrimestraleDiCassa", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PROSTRIDICAS_PAR23() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR23_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR26, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR26, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR23_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR23_RS, 0, IMDBDef6.TBL_PAR26, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR23_RS, 0, 0, IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMETIPO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR23_RS, 1, 0, IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMENUMER, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR23_RS, 2, 0, IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR23_RS, 3, 0, IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMEINCAS, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR23_RS, 4, 0, IMDBDef6.TBL_PAR26, IMDBDef6.FLD_PAR26_ROWNAMEPAGAM, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR26, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR26, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR26, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR23_RS, 0);
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
  private void PAN_PROSTRIDICAS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROSTRIDICAS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROSTRIDICAS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROSTRIDICAS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROSTRIDICAS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PROSTRIDICAS);
    // Stub
  }

  private void PAN_PROSTRIDICAS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PROSTRIDICAS_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PROSTRIDICAS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PROSTRIDICAS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PROSTRIDICAS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROSTRIDICAS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PROSTRIDICAS_Init()
  {

    PAN_PROSTRIDICAS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROSTRIDICAS.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, "2D103DEB-8660-4BE1-AC9A-F967403BF927");
    PAN_PROSTRIDICAS.set_Header(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, "Ente");
    PAN_PROSTRIDICAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, "");
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, MyGlb.PANEL_FORM, 4, 7, 312, 73, 0, 0);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, 0, 25);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, 1, 13);
    PAN_PROSTRIDICAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, 0, 4);
    PAN_PROSTRIDICAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, 1, 4);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_ENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, "239F210C-AE71-4FE4-915D-3F4E6A814948");
    PAN_PROSTRIDICAS.set_Header(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, "Regolarizzazioni");
    PAN_PROSTRIDICAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, "");
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, MyGlb.VIS_GROUPSTYLE);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, MyGlb.PANEL_LIST, 240, -9999, 144, 16, 0, 0);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, MyGlb.PANEL_FORM, 4, 119, 312, 73, 0, 0);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, 0, 92);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, 1, 13);
    PAN_PROSTRIDICAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, 0, 4);
    PAN_PROSTRIDICAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, 1, 4);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_GROUP, GRP_PROSTRIDICAS_REGOLARIZZAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PROSTRIDICAS.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, "2A13F64D-0AE5-4073-ADC2-2BB44CCB41B6");
    PAN_PROSTRIDICAS.set_Header(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, "Tipo");
    PAN_PROSTRIDICAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, "");
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, "CD63DCD6-6BC3-485D-9A92-81FFB54515C0");
    PAN_PROSTRIDICAS.set_Header(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, "Numero");
    PAN_PROSTRIDICAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, "");
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, "91E7A240-7C6D-419C-8C24-37FDFFE3EA81");
    PAN_PROSTRIDICAS.set_Header(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, "Data Elaborazione");
    PAN_PROSTRIDICAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, "");
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, "EEC310A1-D52F-4EA6-B1AC-68298DB1AC1F");
    PAN_PROSTRIDICAS.set_Header(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, "Incassi");
    PAN_PROSTRIDICAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, "");
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, "91D64AC6-D03C-428F-9883-EEF813D9AAF4");
    PAN_PROSTRIDICAS.set_Header(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, "Pagamenti");
    PAN_PROSTRIDICAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, "");
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, "4E44EA1C-9B39-4681-B4B2-7D371CC8ECE1");
    PAN_PROSTRIDICAS.set_Header(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, "");
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROSTRIDICAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, "94035C51-0F7F-42EB-B08B-FB46FAE222A4");
    PAN_PROSTRIDICAS.set_Header(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, "Elabora");
    PAN_PROSTRIDICAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PROSTRIDICAS.SetImage(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, 0, "button1.gif", false);
    PAN_PROSTRIDICAS.SetFlags(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PROSTRIDICAS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, MyGlb.PANEL_LIST, 28);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, MyGlb.PANEL_FORM, 28, 32, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, MyGlb.PANEL_FORM, 52);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PROSTRIDICAS.SetFieldPage(PFL_PROSTRIDICAS_TIPO, -1, GRP_PROSTRIDICAS_ENTE);
    PAN_PROSTRIDICAS.SetFieldPanel(PFL_PROSTRIDICAS_TIPO, PPQRY_PAR23, "A.ROWNAMETIPO", "ROWNAMETIPO", 5, 10, 0, -13997);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, MyGlb.PANEL_LIST, 40, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, MyGlb.PANEL_LIST, 48);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, MyGlb.PANEL_FORM, 8, 56, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, MyGlb.PANEL_FORM, 72);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PROSTRIDICAS.SetFieldPage(PFL_PROSTRIDICAS_NUMERO, -1, GRP_PROSTRIDICAS_ENTE);
    PAN_PROSTRIDICAS.SetFieldPanel(PFL_PROSTRIDICAS_NUMERO, PPQRY_PAR23, "A.ROWNAMENUMER", "ROWNAMENUMER", 5, 10, 0, -13997);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, MyGlb.PANEL_LIST, 96, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, MyGlb.PANEL_FORM, 20, 88, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PROSTRIDICAS.SetFieldPage(PFL_PROSTRIDICAS_DATAELABORAZ, -1, -1);
    PAN_PROSTRIDICAS.SetFieldPanel(PFL_PROSTRIDICAS_DATAELABORAZ, PPQRY_PAR23, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, MyGlb.PANEL_LIST, 240, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, MyGlb.PANEL_LIST, 44);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, MyGlb.PANEL_LIST, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, MyGlb.PANEL_LIST, "Incassi");
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, MyGlb.PANEL_FORM, 8, 144, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, MyGlb.PANEL_FORM, 72);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, MyGlb.PANEL_FORM, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_INCASSI, MyGlb.PANEL_FORM, "Incassi");
    PAN_PROSTRIDICAS.SetFieldPage(PFL_PROSTRIDICAS_INCASSI, -1, GRP_PROSTRIDICAS_REGOLARIZZAZ);
    PAN_PROSTRIDICAS.SetFieldPanel(PFL_PROSTRIDICAS_INCASSI, PPQRY_PAR23, "A.ROWNAMEINCAS", "ROWNAMEINCAS", 3, 14, 2, -13997);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, MyGlb.PANEL_LIST, 304, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, MyGlb.PANEL_LIST, 60);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, MyGlb.PANEL_LIST, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, MyGlb.PANEL_LIST, "Pagamenti");
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, MyGlb.PANEL_FORM, 8, 168, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, MyGlb.PANEL_FORM, 72);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, MyGlb.PANEL_FORM, 1);
    PAN_PROSTRIDICAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_PAGAMENTI, MyGlb.PANEL_FORM, "Pagamenti");
    PAN_PROSTRIDICAS.SetFieldPage(PFL_PROSTRIDICAS_PAGAMENTI, -1, GRP_PROSTRIDICAS_REGOLARIZZAZ);
    PAN_PROSTRIDICAS.SetFieldPanel(PFL_PROSTRIDICAS_PAGAMENTI, PPQRY_PAR23, "A.ROWNAMEPAGAM", "ROWNAMEPAGAM", 3, 14, 2, -13997);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, MyGlb.PANEL_LIST, 168, 124, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, MyGlb.PANEL_FORM, 300, 156, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PROSTRIDICAS.SetFieldPage(PFL_PROSTRIDICAS_NEWPANELLABE, -1, GRP_PROSTRIDICAS_REGOLARIZZAZ);
    PAN_PROSTRIDICAS.SetFieldPanel(PFL_PROSTRIDICAS_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, MyGlb.PANEL_LIST, 184, 212, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PROSTRIDICAS.SetRect(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, MyGlb.PANEL_FORM, 236, 216, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROSTRIDICAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PROSTRIDICAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROSTRIDICAS_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PROSTRIDICAS.SetFieldPage(PFL_PROSTRIDICAS_ELABORA, -1, -1);
    PAN_PROSTRIDICAS.SetFieldPanel(PFL_PROSTRIDICAS_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PROSTRIDICAS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROSTRIDICAS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PROSTRIDICAS.SetIMDB(IMDB, "PQRY_PAR23", true);
    PAN_PROSTRIDICAS.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PROSTRIDICAS.SetQueryIMDB(PPQRY_PAR23, IMDBDef16.PQRY_PAR23_RS, IMDBDef6.TBL_PAR26);
    JustLoaded = true;
    PAN_PROSTRIDICAS.SetFieldPrimaryIndex(PFL_PROSTRIDICAS_TIPO, IMDBDef6.FLD_PAR26_ROWNAMETIPO);
    PAN_PROSTRIDICAS.SetFieldPrimaryIndex(PFL_PROSTRIDICAS_NUMERO, IMDBDef6.FLD_PAR26_ROWNAMENUMER);
    PAN_PROSTRIDICAS.SetFieldPrimaryIndex(PFL_PROSTRIDICAS_DATAELABORAZ, IMDBDef6.FLD_PAR26_ROWNAMDATELA);
    PAN_PROSTRIDICAS.SetFieldPrimaryIndex(PFL_PROSTRIDICAS_INCASSI, IMDBDef6.FLD_PAR26_ROWNAMEINCAS);
    PAN_PROSTRIDICAS.SetFieldPrimaryIndex(PFL_PROSTRIDICAS_PAGAMENTI, IMDBDef6.FLD_PAR26_ROWNAMEPAGAM);
    PAN_PROSTRIDICAS.SetMasterTable(0, "PAR26");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROSTRIDICAS.Status() == 2)
    {
      int oldListQBE = PAN_PROSTRIDICAS.iUseListQBE;
      PAN_PROSTRIDICAS.iUseListQBE = 0;
      PAN_PROSTRIDICAS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROSTRIDICAS.PanelCommand(Glb.PCM_FIND);
      PAN_PROSTRIDICAS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PROSTRIDICAS) PAN_PROSTRIDICAS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROSTRIDICAS) PAN_PROSTRIDICAS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PROSTRIDICAS) PAN_PROSTRIDICAS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROSTRIDICAS) PAN_PROSTRIDICAS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PROSTRIDICAS) PAN_PROSTRIDICAS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
