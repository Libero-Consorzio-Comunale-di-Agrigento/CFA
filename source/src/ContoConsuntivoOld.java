// **********************************************
// Conto Consuntivo Old
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ContoConsuntivoOld extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_CONTOCONSUNT_STAMPA = 0;
  private static int GRP_CONTOCONSUNT_PARTE = 1;

  private static int PFL_CONTOCONSUNT_MAGOMIENCOSE = 0;
  private static int PFL_CONTOCONSUNT_DATAELABORAZ = 1;
  private static int PFL_CONTOCONSUNT_STAMPA = 2;
  private static int PFL_CONTOCONSUNT_NEWPANELABE2 = 3;
  private static int PFL_CONTOCONSUNT_PARTE = 4;
  private static int PFL_CONTOCONSUNT_NEWPANELABE1 = 5;
  private static int PFL_CONTOCONSUNT_ELABORA = 6;

  private static int PPQRY_PARAMETRIIN2 = 0;


  IDPanel PAN_CONTOCONSUNT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRIIN(IMDB);
    //
    //
    Init_PQRY_PARAMETRIIN2(IMDB);
    Init_PQRY_PARAMETRIIN2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRIIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRIIN, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRIIN, "TBL_PARAMETRIIN");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIIN,IMDBDef3.FLD_PARAMETRIIN_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIIN,IMDBDef3.FLD_PARAMETRIIN_ROWNAMESTAMP,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIIN,IMDBDef3.FLD_PARAMETRIIN_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIIN,IMDBDef3.FLD_PARAMETRIIN_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIIN,IMDBDef3.FLD_PARAMETRIIN_RONAMAOMIECS, "RONAMAOMIECS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIIN,IMDBDef3.FLD_PARAMETRIIN_RONAMAOMIECS,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIIN,IMDBDef3.FLD_PARAMETRIIN_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIIN,IMDBDef3.FLD_PARAMETRIIN_ROWNAMDATELA,6,14,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRIIN, 0);
  }

  private static void Init_PQRY_PARAMETRIIN2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRIIN2, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRIIN2, "PQRY_PARAMETRIIN2");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRIIN2,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRIIN2,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMESTAMP,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRIIN2,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRIIN2,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRIIN2,IMDBDef12.PQSL_PARAMETRIIN2_RONAMAOMIECS, "RONAMAOMIECS");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRIIN2,IMDBDef12.PQSL_PARAMETRIIN2_RONAMAOMIECS,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRIIN2,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRIIN2,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMDATELA,6,14,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRIIN2, 0);
  }

  private static void Init_PQRY_PARAMETRIIN2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRIIN2_RS, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRIIN2_RS, "PQRY_PARAMETRIIN2_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRIIN2_RS,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRIIN2_RS,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMESTAMP,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRIIN2_RS,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRIIN2_RS,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRIIN2_RS,IMDBDef12.PQSL_PARAMETRIIN2_RONAMAOMIECS, "RONAMAOMIECS");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRIIN2_RS,IMDBDef12.PQSL_PARAMETRIIN2_RONAMAOMIECS,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRIIN2_RS,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRIIN2_RS,IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMDATELA,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ContoConsuntivoOld(MyWebEntryPoint w, IMDBObj imdb)
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
  public ContoConsuntivoOld()
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
    FormIdx = MyGlb.FRM_CONTOCONSOLD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "86B198BE-8EE1-4056-9E2A-2DF29A7F7CAF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 328;
    DesignHeight = 290;
    set_Caption(new IDVariant("Conto Consuntivo Old"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 328;
    Frames[1].Height = 264;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Conto Consuntivo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 264;
    PAN_CONTOCONSUNT = new IDPanel(w, this, 1, "PAN_CONTOCONSUNT");
    Frames[1].Content = PAN_CONTOCONSUNT;
    PAN_CONTOCONSUNT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTOCONSUNT.VS = MainFrm.VisualStyleList;
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 328-MyGlb.PAN_OFFS_X, 264-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "609D8989-61DC-4571-8835-417FF403A543");
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 304, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTOCONSUNT.InitStatus = 2;
    PAN_CONTOCONSUNT_Init();
    PAN_CONTOCONSUNT_InitFields();
    PAN_CONTOCONSUNT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRIIN, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTOCONSOLD_PARAMETRIIN2();
      }
      PAN_CONTOCONSUNT.UpdatePanel(MainFrm);
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
    return (obj instanceof ContoConsuntivoOld);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ContoConsuntivoOld.class.getName() : (Glb.ClassWithPackage(ContoConsuntivoOld.class) ? ContoConsuntivoOld.class.getName().substring(ContoConsuntivoOld.class.getPackage().getName().length() + 1) : ContoConsuntivoOld.class.getName()));
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRIIN, IMDBDef3.FLD_PARAMETRIIN_ROWNAMESTAMP, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRIIN, IMDBDef3.FLD_PARAMETRIIN_ROWNAMEPARTE, 0, (new IDVariant("E")));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRIIN, IMDBDef3.FLD_PARAMETRIIN_ROWNAMDATELA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContoConsuntivoOld", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Conto Consuntivo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTOCONSUNT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONTOCONSUNT);
      // 
      // Conto Consuntivo On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMESTAMP, 0).equals((new IDVariant(0)), true))
      {
        PAN_CONTOCONSUNT.SetFlags (Glb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CONTOCONSUNT.SetFlags (Glb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CONTOCONSUNT.SetFlags (Glb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CONTOCONSUNT.SetFlags (Glb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_CAP2CAP = new IDVariant(0,IDVariant.STRING);
        v_CAP2CAP = (new IDVariant("Maggiori o minori entrate con segno", IDVariant.STRING));
        PAN_CONTOCONSUNT.set_Header(Glb.OBJ_FIELD,PFL_CONTOCONSUNT_MAGOMIENCOSE, new IDVariant(v_CAP2CAP).stringValue());
      }
      else
      {
        IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);
        v_CAP = (new IDVariant("Maggiori o minori spese con segno", IDVariant.STRING));
        PAN_CONTOCONSUNT.set_Header(Glb.OBJ_FIELD,PFL_CONTOCONSUNT_MAGOMIENCOSE, new IDVariant(v_CAP).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContoConsuntivoOld", "ContoConsuntivoOnDynamicPropertiesEvent", _e);
    }
  }

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
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMESTAMP, 0).equals((new IDVariant(1)), true))
      {
        IDVariant v_DATAWINDOWEN = new IDVariant(0,IDVariant.STRING);
        v_DATAWINDOWEN = (new IDVariant("d_cc_bil_e", IDVariant.STRING));
        IDVariant v_DATAWINDOWSP = new IDVariant(0,IDVariant.STRING);
        v_DATAWINDOWSP = (new IDVariant("d_cc_bil_s", IDVariant.STRING));
        IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMDATELA, 0).equals(IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))), true))
        {
          if (IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
          {
            v_DW = new IDVariant(v_DATAWINDOWEN);
          }
          else
          {
            v_DW = new IDVariant(v_DATAWINDOWSP);
          }
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMEPARTE, 0)));
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_RONAMAOMIECS, 0)));
          MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
        }
        else
        {
          IDVariant v_DATAWINDOWDA = new IDVariant(0,IDVariant.STRING);
          IDVariant v_DW1 = new IDVariant(0,IDVariant.STRING);
          v_DW1 = (new IDVariant("d_cc_bil_s_data", IDVariant.STRING));
          IDVariant v_DW2 = new IDVariant(0,IDVariant.STRING);
          v_DW2 = (new IDVariant("d_cc_bil_e_data", IDVariant.STRING));
          if (IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMEPARTE, 0).equals((new IDVariant("S")), true))
          {
            v_DATAWINDOWDA = new IDVariant(v_DW1);
          }
          else
          {
            v_DATAWINDOWDA = new IDVariant(v_DW2);
          }
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMEPARTE, 0)));
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_RONAMAOMIECS, 0)));
          MainFrm.SetParametroStampa(IDL.ToString((new IDVariant(1))));
          MainFrm.SetParametroStampa(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRIIN2, IMDBDef12.PQSL_PARAMETRIIN2_ROWNAMDATELA, 0)), (new IDVariant("%20%2000:00:00"))));
          MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOWDA);
        }
      }
      else
      {
        IDVariant v_DATAWINDOW1 = new IDVariant(0,IDVariant.STRING);
        v_DATAWINDOW1 = (new IDVariant("d_cc_bil_intestazione", IDVariant.STRING));
        MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOW1);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContoConsuntivoOld", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
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
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContoConsuntivoOld", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri IN
  // Primary record source for panel data
  // **********************************************************************
  private void CONTOCONSOLD_PARAMETRIIN2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRIIN2_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRIIN, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRIIN, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRIIN2_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRIIN2_RS, 0, IMDBDef3.TBL_PARAMETRIIN, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRIIN2_RS, 0, 0, IMDBDef3.TBL_PARAMETRIIN, IMDBDef3.FLD_PARAMETRIIN_ROWNAMESTAMP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRIIN2_RS, 1, 0, IMDBDef3.TBL_PARAMETRIIN, IMDBDef3.FLD_PARAMETRIIN_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRIIN2_RS, 2, 0, IMDBDef3.TBL_PARAMETRIIN, IMDBDef3.FLD_PARAMETRIIN_RONAMAOMIECS, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRIIN2_RS, 3, 0, IMDBDef3.TBL_PARAMETRIIN, IMDBDef3.FLD_PARAMETRIIN_ROWNAMDATELA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRIIN, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRIIN, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRIIN, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRIIN2_RS, 0);
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
  private void PAN_CONTOCONSUNT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTOCONSUNT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTOCONSUNT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTOCONSUNT, Cancel);
    // Stub
  }

  private void PAN_CONTOCONSUNT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CONTOCONSUNT_ELABORA)
    {
      this.IdxPanelActived = this.PAN_CONTOCONSUNT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CONTOCONSUNT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTOCONSUNT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTOCONSUNT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTOCONSUNT_Init()
  {

    PAN_CONTOCONSUNT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTOCONSUNT.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, "8585286A-42F4-4147-9FBC-086EE38F80E6");
    PAN_CONTOCONSUNT.set_Header(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, "Stampa");
    PAN_CONTOCONSUNT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, "");
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, MyGlb.VIS_GROUPSTYLE);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, MyGlb.PANEL_FORM, 20, 7, 260, 49, 0, 0);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, 0, 44);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, 1, 13);
    PAN_CONTOCONSUNT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, 0, 4);
    PAN_CONTOCONSUNT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, 1, 4);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, "5084239A-27A1-4A43-AFE9-3EBDBF531C8B");
    PAN_CONTOCONSUNT.set_Header(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, "Parte");
    PAN_CONTOCONSUNT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, "");
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, MyGlb.PANEL_LIST, 96, -9999, 64, 16, 0, 0);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, MyGlb.PANEL_FORM, 20, 59, 260, 53, 0, 0);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, 0, 31);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, 1, 13);
    PAN_CONTOCONSUNT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, 0, 4);
    PAN_CONTOCONSUNT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, 1, 4);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_GROUP, GRP_CONTOCONSUNT_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CONTOCONSUNT.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, "1A3E1B65-DA59-47D0-AC4B-3DC38D3170EE");
    PAN_CONTOCONSUNT.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, "Maggiori O Minori Entrate Con Segno");
    PAN_CONTOCONSUNT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, "");
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, MyGlb.VIS_CHECKSTYLE);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, "B4BD0304-4E02-4327-BA13-972E8B8C4D82");
    PAN_CONTOCONSUNT.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, "Data Elaborazione");
    PAN_CONTOCONSUNT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, "");
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, "E657F58A-669A-4FD9-AC8D-96E9A8D6C48B");
    PAN_CONTOCONSUNT.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, "Stampa");
    PAN_CONTOCONSUNT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, "");
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, "9C72FCF4-B5C8-419C-8BCE-B0D4A62D6EFB");
    PAN_CONTOCONSUNT.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, "");
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, "A77D95D5-F161-4D5F-B6BB-E7C26E2ABE75");
    PAN_CONTOCONSUNT.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, "Parte");
    PAN_CONTOCONSUNT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, "");
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, "37E0A5F2-A799-4F64-9288-902FE7512611");
    PAN_CONTOCONSUNT.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, "");
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTOCONSUNT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, "14562913-D4EF-4D36-ABF5-685961655483");
    PAN_CONTOCONSUNT.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, "Elabora");
    PAN_CONTOCONSUNT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_CONTOCONSUNT.SetImage(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, 0, "button1.gif", false);
    PAN_CONTOCONSUNT.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_CONTOCONSUNT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, MyGlb.PANEL_LIST, 160, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, MyGlb.PANEL_LIST, 184);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, MyGlb.PANEL_LIST, 1);
    PAN_CONTOCONSUNT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, MyGlb.PANEL_LIST, "M. O M. E. C. S.");
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, MyGlb.PANEL_FORM, 36, 120, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, MyGlb.PANEL_FORM, 220);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, MyGlb.PANEL_FORM, 1);
    PAN_CONTOCONSUNT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_MAGOMIENCOSE, MyGlb.PANEL_FORM, "Maggiori O Minori Entrate Con Segno");
    PAN_CONTOCONSUNT.SetFieldPage(PFL_CONTOCONSUNT_MAGOMIENCOSE, -1, -1);
    PAN_CONTOCONSUNT.SetFieldPanel(PFL_CONTOCONSUNT_MAGOMIENCOSE, PPQRY_PARAMETRIIN2, "A.RONAMAOMIECS", "RONAMAOMIECS", 1, 1, 0, -13997);
    PAN_CONTOCONSUNT.SetValueListItem(PFL_CONTOCONSUNT_MAGOMIENCOSE, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_CONTOCONSUNT.SetValueListItem(PFL_CONTOCONSUNT_MAGOMIENCOSE, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_CONTOCONSUNT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, MyGlb.PANEL_FORM, 40, 144, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, MyGlb.PANEL_FORM, 156);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_CONTOCONSUNT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_CONTOCONSUNT.SetFieldPage(PFL_CONTOCONSUNT_DATAELABORAZ, -1, -1);
    PAN_CONTOCONSUNT.SetFieldPanel(PFL_CONTOCONSUNT_DATAELABORAZ, PPQRY_PARAMETRIIN2, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, MyGlb.PANEL_LIST, 44);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, MyGlb.PANEL_LIST, 1);
    PAN_CONTOCONSUNT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, MyGlb.PANEL_LIST, "Stampa");
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, MyGlb.PANEL_FORM, 56, 32, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, MyGlb.PANEL_FORM, 44);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, MyGlb.PANEL_FORM, 1);
    PAN_CONTOCONSUNT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_STAMPA, MyGlb.PANEL_FORM, "Stam.");
    PAN_CONTOCONSUNT.SetFieldPage(PFL_CONTOCONSUNT_STAMPA, -1, GRP_CONTOCONSUNT_STAMPA);
    PAN_CONTOCONSUNT.SetFieldPanel(PFL_CONTOCONSUNT_STAMPA, PPQRY_PARAMETRIIN2, "A.ROWNAMESTAMP", "ROWNAMESTAMP", 1, 1, 0, -13997);
    PAN_CONTOCONSUNT.SetValueListItem(PFL_CONTOCONSUNT_STAMPA, (new IDVariant(0)), "Copertina", "", "", -1);
    PAN_CONTOCONSUNT.SetValueListItem(PFL_CONTOCONSUNT_STAMPA, (new IDVariant(1)), "C. Consuntivo", "", "", -1);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, MyGlb.PANEL_LIST, 216, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, MyGlb.PANEL_FORM, 24, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_CONTOCONSUNT.SetFieldPage(PFL_CONTOCONSUNT_NEWPANELABE2, -1, GRP_CONTOCONSUNT_STAMPA);
    PAN_CONTOCONSUNT.SetFieldPanel(PFL_CONTOCONSUNT_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, MyGlb.PANEL_LIST, 96, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_CONTOCONSUNT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, MyGlb.PANEL_FORM, 56, 84, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, MyGlb.PANEL_FORM, 44);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_CONTOCONSUNT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_CONTOCONSUNT.SetFieldPage(PFL_CONTOCONSUNT_PARTE, -1, GRP_CONTOCONSUNT_PARTE);
    PAN_CONTOCONSUNT.SetFieldPanel(PFL_CONTOCONSUNT_PARTE, PPQRY_PARAMETRIIN2, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_CONTOCONSUNT.SetValueListItem(PFL_CONTOCONSUNT_PARTE, (new IDVariant("E")), "Entrata          ", "Parte Entrata", "", -1);
    PAN_CONTOCONSUNT.SetValueListItem(PFL_CONTOCONSUNT_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, MyGlb.PANEL_LIST, 192, 76, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, MyGlb.PANEL_FORM, 24, 96, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_CONTOCONSUNT.SetFieldPage(PFL_CONTOCONSUNT_NEWPANELABE1, -1, GRP_CONTOCONSUNT_PARTE);
    PAN_CONTOCONSUNT.SetFieldPanel(PFL_CONTOCONSUNT_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, MyGlb.PANEL_LIST, 80, 168, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_CONTOCONSUNT.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, MyGlb.PANEL_FORM, 200, 192, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOCONSUNT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_CONTOCONSUNT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOCONSUNT_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_CONTOCONSUNT.SetFieldPage(PFL_CONTOCONSUNT_ELABORA, -1, -1);
    PAN_CONTOCONSUNT.SetFieldPanel(PFL_CONTOCONSUNT_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_CONTOCONSUNT_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTOCONSUNT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTOCONSUNT.SetIMDB(IMDB, "PQRY_PARAMETRIIN2", true);
    PAN_CONTOCONSUNT.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_CONTOCONSUNT.SetQueryIMDB(PPQRY_PARAMETRIIN2, IMDBDef12.PQRY_PARAMETRIIN2_RS, IMDBDef3.TBL_PARAMETRIIN);
    JustLoaded = true;
    PAN_CONTOCONSUNT.SetFieldPrimaryIndex(PFL_CONTOCONSUNT_MAGOMIENCOSE, IMDBDef3.FLD_PARAMETRIIN_RONAMAOMIECS);
    PAN_CONTOCONSUNT.SetFieldPrimaryIndex(PFL_CONTOCONSUNT_DATAELABORAZ, IMDBDef3.FLD_PARAMETRIIN_ROWNAMDATELA);
    PAN_CONTOCONSUNT.SetFieldPrimaryIndex(PFL_CONTOCONSUNT_STAMPA, IMDBDef3.FLD_PARAMETRIIN_ROWNAMESTAMP);
    PAN_CONTOCONSUNT.SetFieldPrimaryIndex(PFL_CONTOCONSUNT_PARTE, IMDBDef3.FLD_PARAMETRIIN_ROWNAMEPARTE);
    PAN_CONTOCONSUNT.SetMasterTable(0, "PARAMETRIIN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTOCONSUNT.Status() == 2)
    {
      int oldListQBE = PAN_CONTOCONSUNT.iUseListQBE;
      PAN_CONTOCONSUNT.iUseListQBE = 0;
      PAN_CONTOCONSUNT.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTOCONSUNT.PanelCommand(Glb.PCM_FIND);
      PAN_CONTOCONSUNT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTOCONSUNT) PAN_CONTOCONSUNT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTOCONSUNT) PAN_CONTOCONSUNT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTOCONSUNT) PAN_CONTOCONSUNT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTOCONSUNT) PAN_CONTOCONSUNT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTOCONSUNT) PAN_CONTOCONSUNT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
