// **********************************************
// Scelta Distinte Di Liquidazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaDistinteDiLiquidazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_TIPODISTINTA = 0;
  private static int PFL_PARAMETRI_NULLAOSTA = 1;

  private static int PPQRY_PARAMETRI404 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_DISTINTE_NUMERO = 0;
  private static int PFL_DISTINTE_ANNO = 1;
  private static int PFL_DISTINTE_DATA = 2;
  private static int PFL_DISTINTE_IMPORTO = 3;
  private static int PFL_DISTINTE_STATO = 4;
  private static int PFL_DISTINTE_DESCRIZIONUO = 5;

  private static int PPQRY_DISTINLIQUI7 = 0;


  IDPanel PAN_DISTINTE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI405(IMDB);
    //
    //
    Init_PQRY_PARAMETRI404(IMDB);
    Init_PQRY_PARAMETRI404_RS(IMDB);
    Init_PQRY_DISTINLIQUI7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI405(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI405, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI405, "TBL_PARAMETRI405");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI405,IMDBDef1.FLD_PARAMETRI405_PARATIPODIST, "PARATIPODIST");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI405,IMDBDef1.FLD_PARAMETRI405_PARATIPODIST,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI405,IMDBDef1.FLD_PARAMETRI405_PARAMLIQUIDA, "PARAMLIQUIDA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI405,IMDBDef1.FLD_PARAMETRI405_PARAMLIQUIDA,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI405,IMDBDef1.FLD_PARAMETRI405_PARANULLOSTA, "PARANULLOSTA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI405,IMDBDef1.FLD_PARAMETRI405_PARANULLOSTA,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI405, 0);
  }

  private static void Init_PQRY_PARAMETRI404(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI404, 2);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI404, "PQRY_PARAMETRI404");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI404,IMDBDef7.PQSL_PARAMETRI404_PARATIPODIST, "PARATIPODIST");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI404,IMDBDef7.PQSL_PARAMETRI404_PARATIPODIST,5,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI404,IMDBDef7.PQSL_PARAMETRI404_PARANULLOSTA, "PARANULLOSTA");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI404,IMDBDef7.PQSL_PARAMETRI404_PARANULLOSTA,5,2,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI404, 0);
  }

  private static void Init_PQRY_PARAMETRI404_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI404_RS, 2);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI404_RS, "PQRY_PARAMETRI404_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI404_RS,IMDBDef7.PQSL_PARAMETRI404_PARATIPODIST, "PARATIPODIST");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI404_RS,IMDBDef7.PQSL_PARAMETRI404_PARATIPODIST,5,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI404_RS,IMDBDef7.PQSL_PARAMETRI404_PARANULLOSTA, "PARANULLOSTA");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI404_RS,IMDBDef7.PQSL_PARAMETRI404_PARANULLOSTA,5,2,0);
  }

  private static void Init_PQRY_DISTINLIQUI7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_DISTINLIQUI7, 8);
    IMDB.set_TblCode(IMDBDef7.PQRY_DISTINLIQUI7, "PQRY_DISTINLIQUI7");
    IMDB.set_FldCode(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_LINK_GDM, "LINK_GDM");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_LINK_GDM,5,500,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_DATA_DISTINTA, "DATA_DISTINTA");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_DATA_DISTINTA,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_DISTLIQUIMPO, "DISTLIQUIMPO");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_DISTLIQUIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_TIPO_DIST, "TIPO_DIST");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_TIPO_DIST,5,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_STATO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_DISTLIQDESUO, "DISTLIQDESUO");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISTINLIQUI7,IMDBDef7.PQSL_DISTINLIQUI7_DISTLIQDESUO,5,99,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_DISTINLIQUI7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaDistinteDiLiquidazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaDistinteDiLiquidazione()
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
    FormIdx = MyGlb.FRM_SCELDISDILIQ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "87498F99-C32B-4067-BF3F-1E8997E281CA";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 768;
    DesignHeight = 414;
    set_Caption(new IDVariant("Scelta Distinte Di Liquidazione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 768;
    Frames[1].Height = 388;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.14433;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 768;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 768-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2112755B-F580-4C6B-B78C-70BDADBD8645");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 112, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 768;
    Frames[3].Height = 332;
    Frames[3].Caption = "Distinte";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 332;
    PAN_DISTINTE = new IDPanel(w, this, 3, "PAN_DISTINTE");
    Frames[3].Content = PAN_DISTINTE;
    PAN_DISTINTE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTINTE.VS = MainFrm.VisualStyleList;
    PAN_DISTINTE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 768-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0E7795BD-DFDE-4BBB-B773-94739FD0B9B5");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 724, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTINTE.InitStatus = 1;
    PAN_DISTINTE_Init();
    PAN_DISTINTE_InitFields();
    PAN_DISTINTE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI405, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELDISDILIQ_PARAMETRI404();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_DISTINTE.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaDistinteDiLiquidazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaDistinteDiLiquidazione.class.getName() : (Glb.ClassWithPackage(SceltaDistinteDiLiquidazione.class) ? SceltaDistinteDiLiquidazione.class.getName().substring(SceltaDistinteDiLiquidazione.class.getPackage().getName().length() + 1) : SceltaDistinteDiLiquidazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Distinte On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTINTE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISTINTE);
      // 
      // Distinte On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DISTINTE.set_ToolTip(Glb.OBJ_FIELD,PFL_DISTINTE_DESCRIZIONUO,(new IDVariant(PAN_DISTINTE.FieldText(PFL_DISTINTE_DESCRIZIONUO))).stringValue()); 
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARATIPODIST, 0).equals((new IDVariant("L")), true))
      {
        if (IDL.NullValue(MainFrm.VISUCHECDIST,(new IDVariant("N"))).equals((new IDVariant("S")), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDistinteDiLiquidazione", "DistinteOnDynamicProperties", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Distinte di Liquidazione", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      if (MainFrm.PROCEDUBUONI.compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARATIPODIST, 0, (new IDVariant("L")));
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.ATTILIQ.equals((new IDVariant("SI")), true))
        {
          PAN_PARAMETRI.ClearValueList(PFL_PARAMETRI_TIPODISTINTA);
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODISTINTA, (new IDVariant("B")), (new IDVariant("Ordini")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODISTINTA, (new IDVariant("D")), (new IDVariant("Disposizioni")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODISTINTA, (new IDVariant("L")), (new IDVariant("Liquidazioni")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else
        {
          PAN_PARAMETRI.ClearValueList(PFL_PARAMETRI_TIPODISTINTA);
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODISTINTA, (new IDVariant("B")), (new IDVariant("Ordini")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODISTINTA, (new IDVariant("D")), (new IDVariant("Disposizioni")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARANULLOSTA, 0, (new IDVariant("SI")));
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARATIPODIST, 0).equals((new IDVariant("L")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARATIPODIST, 0, (new IDVariant("L")));
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARATIPODIST, 0, (new IDVariant("B")));
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDistinteDiLiquidazione", "LoadEvent", _e);
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
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDistinteDiLiquidazione", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARATIPODIST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARAMLIQUIDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARANULLOSTA, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SCELDISDILIQ_PARAMETRI404() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_PARAMETRI404_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI405, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI405, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI404_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_PARAMETRI404_RS, 0, IMDBDef1.TBL_PARAMETRI405, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI404_RS, 0, 0, IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARATIPODIST, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI404_RS, 1, 0, IMDBDef1.TBL_PARAMETRI405, IMDBDef1.FLD_PARAMETRI405_PARANULLOSTA, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI405, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI405, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI405, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef7.PQRY_PARAMETRI404_RS, 0);
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
  private void PAN_DISTINTE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISTINTE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTINTE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTINTE, Cancel);
    // Stub
  }

  private void PAN_DISTINTE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISTINTE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISTINTE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISTINTE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, "D9DD26DD-8B1F-448E-9684-E0600D1CE22B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, "Tipo Distinta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, "EB815501-379F-4277-94AC-9B77EE15D6DE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, "Nulla Osta Rilasciato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, MyGlb.PANEL_LIST, "Tipo Distinta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, MyGlb.PANEL_FORM, 56, 4, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPODISTINTA, MyGlb.PANEL_FORM, "Tipo Distinta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPODISTINTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPODISTINTA, PPQRY_PARAMETRI404, "A.PARATIPODIST", "PARATIPODIST", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODISTINTA, (new IDVariant("B")), "Ordini", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODISTINTA, (new IDVariant("D")), "Disposizioni", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPODISTINTA, (new IDVariant("L")), "Liquidazioni", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, MyGlb.PANEL_LIST, "Nulla Osta Rilasciato");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, MyGlb.PANEL_FORM, 12, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NULLAOSTA, MyGlb.PANEL_FORM, "Nulla Osta Rilasciato");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NULLAOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NULLAOSTA, PPQRY_PARAMETRI404, "A.PARANULLOSTA", "PARANULLOSTA", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_NULLAOSTA, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_NULLAOSTA, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI404", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI404, IMDBDef7.PQRY_PARAMETRI404_RS, IMDBDef1.TBL_PARAMETRI405);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPODISTINTA, IMDBDef1.FLD_PARAMETRI405_PARATIPODIST);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NULLAOSTA, IMDBDef1.FLD_PARAMETRI405_PARANULLOSTA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI405");
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

  private void PAN_DISTINTE_Init()
  {

    PAN_DISTINTE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTINTE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISTINTE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, "1B460FEF-4E37-4B5E-8870-53C81009A68B");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, "Numero");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, "45004359-724D-46A0-9DB9-9B611294F23F");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, "Anno");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, "5D8F1463-2161-4390-AC74-0740754AE521");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, "Data");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, "DD038AE4-9996-4ADD-94D5-20B67BD6A784");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, "Importo");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, "EA78DAD1-7C8F-48BF-8758-9C12986A15DB");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, "Stato");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, "0AE72A19-C842-4A66-B051-1DE8971181EE");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, "Unità Organizzativa");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISTINTE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, MyGlb.PANEL_LIST, 104);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, MyGlb.PANEL_FORM, 4, 28, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, MyGlb.PANEL_FORM, 120);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_NUMERO, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_NUMERO, PPQRY_DISTINLIQUI7, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 5, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_LIST, 52, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_LIST, 88);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_FORM, 120);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ANNO, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ANNO, PPQRY_DISTINLIQUI7, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_LIST, 92, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_LIST, 88);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_FORM, 4, 100, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_FORM, 88);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_DATA, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_DATA, PPQRY_DISTINLIQUI7, "A.DATA_DISTINTA", "DATA_DISTINTA", 6, 19, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, MyGlb.PANEL_LIST, 168, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, MyGlb.PANEL_FORM, 4, 124, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_IMPORTO, -1, -1);
    SQL = new StringBuffer();
    SQL.append("NVL(DECODE(~~TBL_PARAMETRI405.PARATIPODIST~~, 'B', ( ");
  SQL.append("select ");
  SQL.append("  SUM(NVL(B.IMPORTO, 0)) ");
  SQL.append("from ");
  SQL.append("  LIQ_FATTURE_BUONI B ");
  SQL.append("where (B.ANNO_DISTINTA = A.ANNO_DISTINTA) ");
  SQL.append("and   (B.NUMERO_DISTINTA = A.NUMERO_DISTINTA) ");
  SQL.append("), DECODE(~~TBL_PARAMETRI405.PARATIPODIST~~, 'D', ( ");
  SQL.append("select ");
  SQL.append("  SUM(NVL(C.IMPORTO, 0)) ");
  SQL.append("from ");
  SQL.append("  LIQ_DISPOSIZIONI C ");
  SQL.append("where (C.ANNO_DISTINTA = A.ANNO_DISTINTA) ");
  SQL.append("and   (C.NUMERO_DISTINTA = A.NUMERO_DISTINTA) ");
  SQL.append("), ( ");
  SQL.append("select ");
  SQL.append("  SUM(NVL(D.IMPORTO, 0)) ");
  SQL.append("from ");
  SQL.append("  LIQ_DISTINTA D ");
  SQL.append("where (D.ANNO_DISTINTA = A.ANNO_DISTINTA) ");
  SQL.append("and   (D.NUMERO_DISTINTA = A.NUMERO_DISTINTA) ");
  SQL.append("))), 0)");
    PAN_DISTINTE.SetFieldUnbound(PFL_DISTINTE_IMPORTO, true);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_IMPORTO, PPQRY_DISTINLIQUI7, SQL.toString(), "DISTLIQUIMPO", 3, 28, 6, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, MyGlb.PANEL_LIST, 292, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, MyGlb.PANEL_LIST, 44);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, MyGlb.PANEL_FORM, 4, 148, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, MyGlb.PANEL_FORM, 44);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO, MyGlb.PANEL_FORM, "Stato");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_STATO, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_STATO, PPQRY_DISTINLIQUI7, "A.STATO", "STATO", 1, 2, 0, -13997);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO, (new IDVariant(10)), "In preparazione", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO, (new IDVariant(20)), "Completa", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO, (new IDVariant(25)), "Inclusa in Atto", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO, (new IDVariant(27)), "Liquidabile", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO, (new IDVariant(30)), "Liquidata", "", "", -1);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, MyGlb.PANEL_LIST, 392, 36, 332, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, MyGlb.PANEL_LIST, 80);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, MyGlb.PANEL_FORM, 4, 172, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, MyGlb.PANEL_FORM, 80);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DESCRIZIONUO, MyGlb.PANEL_FORM, "Un. Organiz.");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_DESCRIZIONUO, -1, -1);
    PAN_DISTINTE.SetFieldUnbound(PFL_DISTINTE_DESCRIZIONUO, true);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_DESCRIZIONUO, PPQRY_DISTINLIQUI7, "SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "DISTLIQDESUO", 5, 99, 0, -13997);
  }

  private void PAN_DISTINTE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTINTE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISTINTE.SetIMDB(IMDB, "PQRY_DISTINLIQUI7", true);
    PAN_DISTINTE.set_SetString(MyGlb.MASTER_ROWNAME, "DISTINTE LIQUIDAZIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.LINK_GDM as LINK_GDM, ");
    SQL.append("  A.DATA_DISTINTA as DATA_DISTINTA, ");
    SQL.append("  NVL(DECODE(~~TBL_PARAMETRI405.PARATIPODIST~~, 'B', ( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(B.IMPORTO, 0)) ");
    SQL.append("from ");
    SQL.append("  LIQ_FATTURE_BUONI B ");
    SQL.append("where (B.ANNO_DISTINTA = A.ANNO_DISTINTA) ");
    SQL.append("and   (B.NUMERO_DISTINTA = A.NUMERO_DISTINTA) ");
    SQL.append("), DECODE(~~TBL_PARAMETRI405.PARATIPODIST~~, 'D', ( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(C.IMPORTO, 0)) ");
    SQL.append("from ");
    SQL.append("  LIQ_DISPOSIZIONI C ");
    SQL.append("where (C.ANNO_DISTINTA = A.ANNO_DISTINTA) ");
    SQL.append("and   (C.NUMERO_DISTINTA = A.NUMERO_DISTINTA) ");
    SQL.append("), ( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(D.IMPORTO, 0)) ");
    SQL.append("from ");
    SQL.append("  LIQ_DISTINTA D ");
    SQL.append("where (D.ANNO_DISTINTA = A.ANNO_DISTINTA) ");
    SQL.append("and   (D.NUMERO_DISTINTA = A.NUMERO_DISTINTA) ");
    SQL.append("))), 0) as DISTLIQUIMPO, ");
    SQL.append("  A.TIPO_DIST as TIPO_DIST, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DISTLIQDESUO ");
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DISTINTE_LIQUIDAZIONE A ");
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NVL(A.FLAG_LIQUIDATO, 'NO') = NVL(~~TBL_PARAMETRI405.PARAMLIQUIDA~~, 'NO')) ");
    SQL.append("and   (A.TIPO_DIST = ~~TBL_PARAMETRI405.PARATIPODIST~~) ");
    SQL.append("and   (NVL(" + IDL.CSql(MainFrm.VISUCHECDIST, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'N') = 'N' OR ((NVL(" + IDL.CSql(MainFrm.VISUCHECDIST, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'N') = 'S' AND NVL(A.FLAG_NULLA_OSTA, 'NO') = 'SI' AND ~~TBL_PARAMETRI405.PARATIPODIST~~ = 'L' AND A.TIPO_DIST = 'L') OR ~~TBL_PARAMETRI405.PARATIPODIST~~ <> 'L')) ");
    SQL.append("and   (CHECK_DIST_INTEGRAZIONI_VALIDA(A.NUMERO_DISTINTA,A.ANNO_DISTINTA) = 'SI') ");
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA ");
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI7, 5, SQL, -1, "");
    PAN_DISTINTE.SetQueryDB(PPQRY_DISTINLIQUI7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINTE.SetMasterTable(0, "DISTINTE_LIQUIDAZIONE");
    PAN_DISTINTE.AddToSortList(PFL_DISTINTE_ANNO, true);
    PAN_DISTINTE.AddToSortList(PFL_DISTINTE_NUMERO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTINTE.Status() == 2)
    {
      int oldListQBE = PAN_DISTINTE.iUseListQBE;
      PAN_DISTINTE.iUseListQBE = 0;
      PAN_DISTINTE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTINTE.PanelCommand(Glb.PCM_FIND);
      PAN_DISTINTE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
