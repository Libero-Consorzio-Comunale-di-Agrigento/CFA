// **********************************************
// Previsioni Per Servizio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniPerServizio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREVIPERSERV_PARTE = 0;

  private static int PFL_PREVIPERSERV_TITOLO = 0;
  private static int PFL_PREVIPERSERV_FUNZIONI = 1;
  private static int PFL_PREVIPERSERV_SERVIZIO = 2;
  private static int PFL_PREVIPERSERV_DABILANSIMUL = 3;
  private static int PFL_PREVIPERSERV_VARIAZIONI = 4;
  private static int PFL_PREVIPERSERV_DETTAGCAPITO = 5;
  private static int PFL_PREVIPERSERV_PREVANNINCOR = 6;
  private static int PFL_PREVIPERSERV_DESCRIINTERV = 7;
  private static int PFL_PREVIPERSERV_TOTALPERTITO = 8;
  private static int PFL_PREVIPERSERV_PARTE = 9;
  private static int PFL_PREVIPERSERV_ELABORA = 10;

  private static int PPQRY_PAR88 = 0;

  private static int PPQRY_TITOLI = 1;
  private static int PPQRY_FUNZIONI = 2;
  private static int PPQRY_SERVIZI = 3;


  IDPanel PAN_PREVIPERSERV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR10(IMDB);
    //
    //
    Init_PQRY_PAR88(IMDB);
    Init_PQRY_PAR88_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR10, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR10, "TBL_PAR10");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMTOPETI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR10,IMDBDef3.FLD_PAR10_RONAPRANINCO,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR10, 0);
  }

  private static void Init_PQRY_PAR88(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PAR88, 10);
    IMDB.set_TblCode(IMDBDef11.PQRY_PAR88, "PQRY_PAR88");
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMTOPETI,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88,IMDBDef11.PQSL_PAR88_RONAPRANINCO,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PAR88, 0);
  }

  private static void Init_PQRY_PAR88_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PAR88_RS, 10);
    IMDB.set_TblCode(IMDBDef11.PQRY_PAR88_RS, "PQRY_PAR88_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMTOPETI,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR88_RS,IMDBDef11.PQSL_PAR88_RONAPRANINCO,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniPerServizio(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniPerServizio()
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
    FormIdx = MyGlb.FRM_PREVIPERSERV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F4EDB379-70CB-42D9-8417-435CE6846734";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 476;
    DesignHeight = 334;
    set_Caption(new IDVariant("Previsioni Per Servizio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 476;
    Frames[1].Height = 308;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Per Servizio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 308;
    PAN_PREVIPERSERV = new IDPanel(w, this, 1, "PAN_PREVIPERSERV");
    Frames[1].Content = PAN_PREVIPERSERV;
    PAN_PREVIPERSERV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVIPERSERV.VS = MainFrm.VisualStyleList;
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 476-MyGlb.PAN_OFFS_X, 308-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4D99F34A-B1FB-4B59-A94D-8DF3DF28C7B2");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 560, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVIPERSERV.InitStatus = 2;
    PAN_PREVIPERSERV_Init();
    PAN_PREVIPERSERV_InitFields();
    PAN_PREVIPERSERV_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR10, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREVIPERSERV_PAR88();
      }
      PAN_PREVIPERSERV.UpdatePanel(MainFrm);
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
    return (obj instanceof PrevisioniPerServizio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniPerServizio.class.getName() : (Glb.ClassWithPackage(PrevisioniPerServizio.class) ? PrevisioniPerServizio.class.getName().substring(PrevisioniPerServizio.class.getPackage().getName().length() + 1) : PrevisioniPerServizio.class.getName()));
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
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DW = (new IDVariant("d_bil_previsioni_servizio", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMDABISI, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMEVARIA, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_RONAPRANINCO, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMDETCAP, 0));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMETITOL, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMEFUNZI, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMESERVI, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMDESINT, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMTOPETI, 0));
      MainFrm.SetParametroStampa((new IDVariant("E")));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerServizio", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMDABISI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMDETCAP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMDESINT, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMTOPETI, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMEVARIA, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_RONAPRANINCO, 0, (new IDVariant("NO")));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerServizio", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Servizio On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVIPERSERV_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVIPERSERV);
      // 
      // Previsioni Per Servizio On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMEPARTE, 0).equals((new IDVariant("ES")), true))
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMEFUNZI, 0)))
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMEPARTE, 0).compareTo((new IDVariant("E")), true)!=0)
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerServizio", "PrevisioniPerServizioOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Servizio After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PREVIPERSERV_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Per Servizio After Find Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMETITOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMEFUNZI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMESERVI, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerServizio", "PrevisioniPerServizioAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Servizio On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PREVIPERSERV_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Per Servizio On Updating Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMEPARTE, 0).equals((new IDVariant("ES")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMETITOL, 0, (new IDVariant()));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMEFUNZI, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PAR88, IMDBDef11.PQSL_PAR88_ROWNAMESERVI, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerServizio", "PrevisioniPerServizioOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PREVIPERSERV_PAR88() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PAR88_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR10, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR10, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PAR88_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PAR88_RS, 0, IMDBDef3.TBL_PAR10, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 0, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 1, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMETITOL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 2, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMEFUNZI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 3, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMESERVI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 4, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 5, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 6, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMDESINT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 7, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMTOPETI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 8, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR88_RS, 9, 0, IMDBDef3.TBL_PAR10, IMDBDef3.FLD_PAR10_RONAPRANINCO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR10, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR10, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR10, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PAR88_RS, 0);
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
  private void PAN_PREVIPERSERV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVIPERSERV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVIPERSERV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVIPERSERV, Cancel);
    // Stub
  }

  private void PAN_PREVIPERSERV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREVIPERSERV_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREVIPERSERV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREVIPERSERV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PREVIPERSERV_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PREVIPERSERV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVIPERSERV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVIPERSERV_Init()
  {

    PAN_PREVIPERSERV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVIPERSERV.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, "942DD151-B83D-42ED-AEEC-CE6B4CC0F297");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, "Parte");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 8, 7, 200, 49, 0, 0);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 0, 31);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 1, 13);
    PAN_PREVIPERSERV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 0, 4);
    PAN_PREVIPERSERV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 1, 4);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVIPERSERV.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, "E8A42AFD-7F0B-421E-A689-7AEB8BDD23C2");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, "Titolo");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, "E2F34A29-18FD-4B03-8B9E-8C065DD41986");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, "Funzioni");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, "731517A4-DA79-49B0-9B23-6E792367454B");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, "Servizio");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, "AFAAD2E0-D638-495E-82F9-8D0302FB5903");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, "D330A183-8D89-4AED-9832-6AD1578CFA4D");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, "Variazioni");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, "AEA73603-9C62-49F2-B009-6D4045A6CB81");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, "AFB05033-7B67-41B9-8C97-AFD9E3476F4A");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, "Previsione Anno In Corso");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, "20FA99F0-51A1-4D36-A433-8F53EDDBBEC3");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, "Descrizioni Intervernto");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, "BA9CEB0D-8C03-4307-B985-367BE28CC65E");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, "Totali Per Titolo");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, "63A1859C-84E0-4E18-B4AA-C75FB6215CEC");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, "Parte");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, "DA619A4C-A591-4F20-8912-7B9D89FF1B25");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, "Elabora");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVIPERSERV.SetImage(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, 0, "button1.gif", false);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PREVIPERSERV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_LIST, 72, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_LIST, 36);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_FORM, 4, 64, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_FORM, 56);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_TITOLO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_TITOLO, PPQRY_PAR88, "A.ROWNAMETITOL", "ROWNAMETITOL", 1, 2, 0, -13997);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, MyGlb.PANEL_LIST, 128, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, MyGlb.PANEL_LIST, 48);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, MyGlb.PANEL_LIST, "Funzioni");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, MyGlb.PANEL_FORM, 4, 88, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, MyGlb.PANEL_FORM, 56);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_FUNZIONI, MyGlb.PANEL_FORM, "Funzioni");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_FUNZIONI, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_FUNZIONI, PPQRY_PAR88, "A.ROWNAMEFUNZI", "ROWNAMEFUNZI", 1, 2, 0, -13997);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_LIST, 200, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_LIST, 48);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_FORM, 4, 112, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_FORM, 56);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_SERVIZIO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_SERVIZIO, PPQRY_PAR88, "A.ROWNAMESERVI", "ROWNAMESERVI", 1, 2, 0, -13997);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, 272, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, 4, 140, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_DABILANSIMUL, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_DABILANSIMUL, PPQRY_PAR88, "A.ROWNAMDABISI", "ROWNAMDABISI", 5, 1, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DABILANSIMUL, (new IDVariant("S")), "S", "", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DABILANSIMUL, (new IDVariant("E")), "E", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, 432, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, 252, 144, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, 152);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_VARIAZIONI, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_VARIAZIONI, PPQRY_PAR88, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, 312, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, 4, 164, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_DETTAGCAPITO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_DETTAGCAPITO, PPQRY_PAR88, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, 520, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, "Pr. A. I. C.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, 252, 168, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, 152);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, "Previsione Anno In Corso");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_PREVANNINCOR, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_PREVANNINCOR, PPQRY_PAR88, "A.RONAPRANINCO", "RONAPRANINCO", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Inter.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, 4, 188, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizioni Intervernto");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_DESCRIINTERV, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_DESCRIINTERV, PPQRY_PAR88, "A.ROWNAMDESINT", "ROWNAMDESINT", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, 84);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, "Tot. P. Tit.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, 4, 212, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali Per Titolo");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_TOTALPERTITO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_TOTALPERTITO, PPQRY_PAR88, "A.ROWNAMTOPETI", "ROWNAMTOPETI", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_TOTALPERTITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_TOTALPERTITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 12, 32, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_PARTE, -1, GRP_PREVIPERSERV_PARTE);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_PARTE, PPQRY_PAR88, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_LIST, 248, 244, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_FORM, 348, 236, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_ELABORA, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PREVIPERSERV_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVIPERSERV.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("and   (A.E_S = ~~ROWNAMEPARTE~~ OR ~~ROWNAMEPARTE~~ = 'ES') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_TITOLI, 0, SQL, PFL_PREVIPERSERV_TITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.E_S = ~~ROWNAMEPARTE~~ OR ~~ROWNAMEPARTE~~ = 'ES') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_TITOLI, 1, SQL, PFL_PREVIPERSERV_TITOLO, "");
    PAN_PREVIPERSERV.SetQueryDB(PPQRY_TITOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIOFUNZIO, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as FUNZINEWEXPR ");
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    SQL.append("where (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_FUNZIONI, 0, SQL, PFL_PREVIPERSERV_FUNZIONI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIOFUNZIO, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as FUNZINEWEXPR ");
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_FUNZIONI, 1, SQL, PFL_PREVIPERSERV_FUNZIONI, "");
    PAN_PREVIPERSERV.SetQueryDB(PPQRY_FUNZIONI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as SERVIZSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as SERVINEWEXPR ");
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    SQL.append("where (A.SERVIZIO = ~~ROWNAMESERVI~~) ");
    SQL.append("and   (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_SERVIZI, 0, SQL, PFL_PREVIPERSERV_SERVIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as SERVIZSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as SERVINEWEXPR ");
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    SQL.append("where (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_SERVIZI, 1, SQL, PFL_PREVIPERSERV_SERVIZIO, "");
    PAN_PREVIPERSERV.SetQueryDB(PPQRY_SERVIZI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVIPERSERV.SetIMDB(IMDB, "PQRY_PAR88", true);
    PAN_PREVIPERSERV.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PREVIPERSERV.SetQueryIMDB(PPQRY_PAR88, IMDBDef11.PQRY_PAR88_RS, IMDBDef3.TBL_PAR10);
    JustLoaded = true;
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_TITOLO, IMDBDef3.FLD_PAR10_ROWNAMETITOL);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_FUNZIONI, IMDBDef3.FLD_PAR10_ROWNAMEFUNZI);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_SERVIZIO, IMDBDef3.FLD_PAR10_ROWNAMESERVI);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_DABILANSIMUL, IMDBDef3.FLD_PAR10_ROWNAMDABISI);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_VARIAZIONI, IMDBDef3.FLD_PAR10_ROWNAMEVARIA);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_DETTAGCAPITO, IMDBDef3.FLD_PAR10_ROWNAMDETCAP);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_PREVANNINCOR, IMDBDef3.FLD_PAR10_RONAPRANINCO);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_DESCRIINTERV, IMDBDef3.FLD_PAR10_ROWNAMDESINT);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_TOTALPERTITO, IMDBDef3.FLD_PAR10_ROWNAMTOPETI);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_PARTE, IMDBDef3.FLD_PAR10_ROWNAMEPARTE);
    PAN_PREVIPERSERV.SetMasterTable(0, "PAR10");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVIPERSERV.Status() == 2)
    {
      int oldListQBE = PAN_PREVIPERSERV.iUseListQBE;
      PAN_PREVIPERSERV.iUseListQBE = 0;
      PAN_PREVIPERSERV.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVIPERSERV.PanelCommand(Glb.PCM_FIND);
      PAN_PREVIPERSERV.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
