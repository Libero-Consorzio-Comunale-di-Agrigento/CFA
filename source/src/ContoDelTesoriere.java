// **********************************************
// Conto Del Tesoriere
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ContoDelTesoriere extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_CONTODELTESO_PARTE = 0;
  private static int GRP_CONTODELTESO_STAMPA = 1;

  private static int PFL_CONTODELTESO_PAGPERAZIESE = 0;
  private static int PFL_CONTODELTESO_PARTE = 1;
  private static int PFL_CONTODELTESO_NEWPANELLAB1 = 2;
  private static int PFL_CONTODELTESO_ELABORA = 3;
  private static int PFL_CONTODELTESO_NEWPANELLABE = 4;
  private static int PFL_CONTODELTESO_COPERTINA = 5;
  private static int PFL_CONTODELTESO_CCONSUNTIVO = 6;
  private static int PFL_CONTODELTESO_QRIASGESTCAS = 7;

  private static int PPQRY_PARAMETRI127 = 0;


  IDPanel PAN_CONTODELTESO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI197(IMDB);
    //
    //
    Init_PQRY_PARAMETRI127(IMDB);
    Init_PQRY_PARAMETRI127_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI197(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI197, 5);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI197, "TBL_PARAMETRI197");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_RONAPAPEAZES, "RONAPAPEAZES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_RONAPAPEAZES,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_ROWNAMECOPER, "ROWNAMECOPER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_ROWNAMECOPER,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_ROWNAMECCONS, "ROWNAMECCONS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_ROWNAMECCONS,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_ROWNAQRIGECA, "ROWNAQRIGECA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI197,IMDBDef3.FLD_PARAMETRI197_ROWNAQRIGECA,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI197, 0);
  }

  private static void Init_PQRY_PARAMETRI127(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI127, 5);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI127, "PQRY_PARAMETRI127");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_RONAPAPEAZES, "RONAPAPEAZES");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_RONAPAPEAZES,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_ROWNAMECOPER, "ROWNAMECOPER");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_ROWNAMECOPER,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_ROWNAMECCONS, "ROWNAMECCONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_ROWNAMECCONS,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_ROWNAQRIGECA, "ROWNAQRIGECA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127,IMDBDef12.PQSL_PARAMETRI127_ROWNAQRIGECA,1,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI127, 0);
  }

  private static void Init_PQRY_PARAMETRI127_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI127_RS, 5);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI127_RS, "PQRY_PARAMETRI127_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_RONAPAPEAZES, "RONAPAPEAZES");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_RONAPAPEAZES,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_ROWNAMECOPER, "ROWNAMECOPER");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_ROWNAMECOPER,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_ROWNAMECCONS, "ROWNAMECCONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_ROWNAMECCONS,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_ROWNAQRIGECA, "ROWNAQRIGECA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI127_RS,IMDBDef12.PQSL_PARAMETRI127_ROWNAQRIGECA,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ContoDelTesoriere(MyWebEntryPoint w, IMDBObj imdb)
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
  public ContoDelTesoriere()
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
    FormIdx = MyGlb.FRM_CONTODELTESO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D45220C0-6400-4D27-9428-0DA49C793862";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 392;
    DesignHeight = 266;
    set_Caption(new IDVariant("Conto Del Tesoriere"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 392;
    Frames[1].Height = 240;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Conto Del Tesoriere";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 240;
    PAN_CONTODELTESO = new IDPanel(w, this, 1, "PAN_CONTODELTESO");
    Frames[1].Content = PAN_CONTODELTESO;
    PAN_CONTODELTESO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTODELTESO.VS = MainFrm.VisualStyleList;
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 392-MyGlb.PAN_OFFS_X, 240-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3BD713AB-2527-4E89-8D58-D59122CA12AC");
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 360, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTODELTESO.InitStatus = 2;
    PAN_CONTODELTESO_Init();
    PAN_CONTODELTESO_InitFields();
    PAN_CONTODELTESO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI197, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTODELTESO_PARAMETRI127();
      }
      PAN_CONTODELTESO.UpdatePanel(MainFrm);
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
    return (obj instanceof ContoDelTesoriere);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ContoDelTesoriere.class.getName() : (Glb.ClassWithPackage(ContoDelTesoriere.class) ? ContoDelTesoriere.class.getName().substring(ContoDelTesoriere.class.getPackage().getName().length() + 1) : ContoDelTesoriere.class.getName()));
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
    IDVariant v_DATAWINDOW1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DATAWINDOW2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DWFINALE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DATAWINDOW1 = (new IDVariant("d_conto_tesoriere_entrata", IDVariant.STRING));
      v_DATAWINDOW2 = (new IDVariant("d_conto_tesoriere_spesa", IDVariant.STRING));
      v_DW = (new IDVariant("d_conto_tesoriere_intestazione", IDVariant.STRING));
      v_DWFINALE = (new IDVariant("d_conto_tesoriere_gest_cassa", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAMECCONS, 0).equals((new IDVariant(1)), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAMEPARTE, 0)));
          MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOW1);
        }
        else
        {
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAMEPARTE, 0)));
          MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOW2);
        }
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAMECOPER, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAQRIGECA, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_RONAPAPEAZES, 0)), (new IDVariant(".")), (new IDVariant(","))));
        MainFrm.SetParametroStampa(MainFrm.Datetostring(IDL.Today()));
        MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DWFINALE);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContoDelTesoriere", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Conto Del Tesoriere On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTODELTESO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONTODELTESO);
      // 
      // Conto Del Tesoriere On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAMEPARTE, 0).equals((new IDVariant("S")), true))
      {
        PAN_CONTODELTESO.SetFlags (Glb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CONTODELTESO.SetFlags (Glb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAMECCONS, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMECOPER, 0, (new IDVariant(0)));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAQRIGECA, 0, (new IDVariant(0)));
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAMECOPER, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMECCONS, 0, (new IDVariant(0)));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAQRIGECA, 0, (new IDVariant(0)));
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAQRIGECA, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMECOPER, 0, (new IDVariant(0)));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMECCONS, 0, (new IDVariant(0)));
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAQRIGECA, 0).equals((new IDVariant(1)), true) && IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAQRIGECA, 0, (new IDVariant(0)));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMECCONS, 0, (new IDVariant(1)));
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI127, IMDBDef12.PQSL_PARAMETRI127_ROWNAQRIGECA, 0).equals((new IDVariant(1)), true))
      {
        PAN_CONTODELTESO.SetFlags (Glb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CONTODELTESO.SetFlags (Glb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContoDelTesoriere", "ContoDelTesoriereOnDynamicPropertiesEvent", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMEPARTE, 0, (new IDVariant("E")));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_RONAPAPEAZES, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMECOPER, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMECCONS, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAQRIGECA, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContoDelTesoriere", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void CONTODELTESO_PARAMETRI127() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI127_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI197, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI197, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI127_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI127_RS, 0, IMDBDef3.TBL_PARAMETRI197, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI127_RS, 0, 0, IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI127_RS, 1, 0, IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_RONAPAPEAZES, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI127_RS, 2, 0, IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMECOPER, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI127_RS, 3, 0, IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAMECCONS, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI127_RS, 4, 0, IMDBDef3.TBL_PARAMETRI197, IMDBDef3.FLD_PARAMETRI197_ROWNAQRIGECA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI197, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI197, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI197, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI127_RS, 0);
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
  private void PAN_CONTODELTESO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTODELTESO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTODELTESO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTODELTESO, Cancel);
    // Stub
  }

  private void PAN_CONTODELTESO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CONTODELTESO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_CONTODELTESO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CONTODELTESO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTODELTESO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTODELTESO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTODELTESO_Init()
  {

    PAN_CONTODELTESO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTODELTESO.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, "3DF5D765-1A96-46FD-83D3-037B182E72ED");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, "Parte");
    PAN_CONTODELTESO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, "");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, MyGlb.PANEL_LIST, 0, -9999, 64, 16, 0, 0);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, MyGlb.PANEL_FORM, 4, 11, 324, 49, 0, 0);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, 0, 31);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, 1, 13);
    PAN_CONTODELTESO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, 0, 4);
    PAN_CONTODELTESO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, 1, 4);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, "D066DA41-4DD3-4E95-A5FE-AAAEFD242D63");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, "Stampa");
    PAN_CONTODELTESO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, "");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, MyGlb.VIS_GROUPSTYLE);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, MyGlb.PANEL_FORM, 4, 67, 324, 49, 0, 0);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, 0, 44);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, 1, 13);
    PAN_CONTODELTESO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, 0, 4);
    PAN_CONTODELTESO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, 1, 4);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_GROUP, GRP_CONTODELTESO_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CONTODELTESO.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, "04F74545-F28D-44FD-9E6E-89920EE73545");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, "Pagamenti Per Azioni Esecutive");
    PAN_CONTODELTESO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, "");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, "81EBC26B-D6E9-47B5-BB70-7ECD8E89722D");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, "Parte");
    PAN_CONTODELTESO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, "");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, "1B7BE14B-B2A8-4577-9908-5480A579F147");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, "");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, "512F4033-FC01-41A7-A5D1-4A37DD736F44");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, "Elabora");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_CONTODELTESO.SetImage(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, 0, "button1.gif", false);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, "B1231755-9328-4ACC-AAC1-C3AB55C3E3B8");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, "");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, "FD2A0C9E-BDF0-4E26-964B-3ED09199A681");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, "Copertina");
    PAN_CONTODELTESO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, "");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, "5FD2FC5C-5712-4880-8E54-1A7389E385BA");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, "C Consuntivo");
    PAN_CONTODELTESO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, "");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTODELTESO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, "EF4DA8FD-F5E4-4026-9202-35DCA9E2E7EF");
    PAN_CONTODELTESO.set_Header(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, "Q Riass Gest Cassa");
    PAN_CONTODELTESO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, "");
    PAN_CONTODELTESO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, MyGlb.VIS_OPTBUTSENBOR);
    PAN_CONTODELTESO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTODELTESO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, MyGlb.PANEL_LIST, 64, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, MyGlb.PANEL_LIST, 160);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, MyGlb.PANEL_LIST, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, MyGlb.PANEL_LIST, "Pag. Per Az. Esec.");
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, MyGlb.PANEL_FORM, 24, 124, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, MyGlb.PANEL_FORM, 188);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, MyGlb.PANEL_FORM, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PAGPERAZIESE, MyGlb.PANEL_FORM, "Pagamenti Per Azioni Esecutive");
    PAN_CONTODELTESO.SetFieldPage(PFL_CONTODELTESO_PAGPERAZIESE, -1, -1);
    PAN_CONTODELTESO.SetFieldPanel(PFL_CONTODELTESO_PAGPERAZIESE, PPQRY_PARAMETRI127, "A.RONAPAPEAZES", "RONAPAPEAZES", 3, 14, 2, -13997);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, MyGlb.PANEL_FORM, 24, 36, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_CONTODELTESO.SetFieldPage(PFL_CONTODELTESO_PARTE, -1, GRP_CONTODELTESO_PARTE);
    PAN_CONTODELTESO.SetFieldPanel(PFL_CONTODELTESO_PARTE, PPQRY_PARAMETRI127, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_CONTODELTESO.SetValueListItem(PFL_CONTODELTESO_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_CONTODELTESO.SetValueListItem(PFL_CONTODELTESO_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, MyGlb.PANEL_LIST, 112, 8, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, MyGlb.PANEL_FORM, 8, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_CONTODELTESO.SetFieldPage(PFL_CONTODELTESO_NEWPANELLAB1, -1, GRP_CONTODELTESO_PARTE);
    PAN_CONTODELTESO.SetFieldPanel(PFL_CONTODELTESO_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, MyGlb.PANEL_LIST, 116, 100, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, MyGlb.PANEL_FORM, 252, 160, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_CONTODELTESO.SetFieldPage(PFL_CONTODELTESO_ELABORA, -1, -1);
    PAN_CONTODELTESO.SetFieldPanel(PFL_CONTODELTESO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, MyGlb.PANEL_LIST, 100, 76, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, MyGlb.PANEL_FORM, 8, 92, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_CONTODELTESO.SetFieldPage(PFL_CONTODELTESO_NEWPANELLABE, -1, GRP_CONTODELTESO_STAMPA);
    PAN_CONTODELTESO.SetFieldPanel(PFL_CONTODELTESO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, MyGlb.PANEL_LIST, 56);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, MyGlb.PANEL_LIST, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, MyGlb.PANEL_LIST, "Coper.");
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, MyGlb.PANEL_FORM, 28, 92, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, MyGlb.PANEL_FORM, 56);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, MyGlb.PANEL_FORM, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_COPERTINA, MyGlb.PANEL_FORM, "Coper.");
    PAN_CONTODELTESO.SetFieldPage(PFL_CONTODELTESO_COPERTINA, -1, GRP_CONTODELTESO_STAMPA);
    PAN_CONTODELTESO.SetFieldPanel(PFL_CONTODELTESO_COPERTINA, PPQRY_PARAMETRI127, "A.ROWNAMECOPER", "ROWNAMECOPER", 1, 1, 0, -13997);
    PAN_CONTODELTESO.SetValueListItem(PFL_CONTODELTESO_COPERTINA, (new IDVariant(1)), "Copertina", "", "", -1);
    PAN_CONTODELTESO.SetValueListItem(PFL_CONTODELTESO_COPERTINA, (new IDVariant(0)), "fake", "", "", -1);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, MyGlb.PANEL_LIST, 72);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, MyGlb.PANEL_LIST, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, MyGlb.PANEL_LIST, "C Consun.");
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, MyGlb.PANEL_FORM, 100, 92, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, MyGlb.PANEL_FORM, 72);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, MyGlb.PANEL_FORM, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_CCONSUNTIVO, MyGlb.PANEL_FORM, "C Consun.");
    PAN_CONTODELTESO.SetFieldPage(PFL_CONTODELTESO_CCONSUNTIVO, -1, GRP_CONTODELTESO_STAMPA);
    PAN_CONTODELTESO.SetFieldPanel(PFL_CONTODELTESO_CCONSUNTIVO, PPQRY_PARAMETRI127, "A.ROWNAMECCONS", "ROWNAMECCONS", 1, 1, 0, -13997);
    PAN_CONTODELTESO.SetValueListItem(PFL_CONTODELTESO_CCONSUNTIVO, (new IDVariant(1)), "C. Tesoriere", "", "", -1);
    PAN_CONTODELTESO.SetValueListItem(PFL_CONTODELTESO_CCONSUNTIVO, (new IDVariant(0)), "fake", "", "", -1);
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, MyGlb.PANEL_LIST, 104);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, MyGlb.PANEL_LIST, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, MyGlb.PANEL_LIST, "Q Rias. Gst. Cas.");
    PAN_CONTODELTESO.SetRect(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, MyGlb.PANEL_FORM, 180, 92, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTODELTESO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, MyGlb.PANEL_FORM, 104);
    PAN_CONTODELTESO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, MyGlb.PANEL_FORM, 1);
    PAN_CONTODELTESO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTODELTESO_QRIASGESTCAS, MyGlb.PANEL_FORM, "Q Rias. Gst. Cas.");
    PAN_CONTODELTESO.SetFieldPage(PFL_CONTODELTESO_QRIASGESTCAS, -1, GRP_CONTODELTESO_STAMPA);
    PAN_CONTODELTESO.SetFieldPanel(PFL_CONTODELTESO_QRIASGESTCAS, PPQRY_PARAMETRI127, "A.ROWNAQRIGECA", "ROWNAQRIGECA", 1, 1, 0, -13997);
    PAN_CONTODELTESO.SetValueListItem(PFL_CONTODELTESO_QRIASGESTCAS, (new IDVariant(1)), "Q. Riass. Gest. Cassa", "", "", -1);
    PAN_CONTODELTESO.SetValueListItem(PFL_CONTODELTESO_QRIASGESTCAS, (new IDVariant(0)), "fake", "", "", -1);
  }

  private void PAN_CONTODELTESO_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTODELTESO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTODELTESO.SetIMDB(IMDB, "PQRY_PARAMETRI127", true);
    PAN_CONTODELTESO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_CONTODELTESO.SetQueryIMDB(PPQRY_PARAMETRI127, IMDBDef12.PQRY_PARAMETRI127_RS, IMDBDef3.TBL_PARAMETRI197);
    JustLoaded = true;
    PAN_CONTODELTESO.SetFieldPrimaryIndex(PFL_CONTODELTESO_PAGPERAZIESE, IMDBDef3.FLD_PARAMETRI197_RONAPAPEAZES);
    PAN_CONTODELTESO.SetFieldPrimaryIndex(PFL_CONTODELTESO_PARTE, IMDBDef3.FLD_PARAMETRI197_ROWNAMEPARTE);
    PAN_CONTODELTESO.SetFieldPrimaryIndex(PFL_CONTODELTESO_COPERTINA, IMDBDef3.FLD_PARAMETRI197_ROWNAMECOPER);
    PAN_CONTODELTESO.SetFieldPrimaryIndex(PFL_CONTODELTESO_CCONSUNTIVO, IMDBDef3.FLD_PARAMETRI197_ROWNAMECCONS);
    PAN_CONTODELTESO.SetFieldPrimaryIndex(PFL_CONTODELTESO_QRIASGESTCAS, IMDBDef3.FLD_PARAMETRI197_ROWNAQRIGECA);
    PAN_CONTODELTESO.SetMasterTable(0, "PARAMETRI197");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTODELTESO.Status() == 2)
    {
      int oldListQBE = PAN_CONTODELTESO.iUseListQBE;
      PAN_CONTODELTESO.iUseListQBE = 0;
      PAN_CONTODELTESO.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTODELTESO.PanelCommand(Glb.PCM_FIND);
      PAN_CONTODELTESO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTODELTESO) PAN_CONTODELTESO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTODELTESO) PAN_CONTODELTESO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTODELTESO) PAN_CONTODELTESO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTODELTESO) PAN_CONTODELTESO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTODELTESO) PAN_CONTODELTESO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
