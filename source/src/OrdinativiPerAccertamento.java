// **********************************************
// Ordinativi Per Accertamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiPerAccertamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ORDINPERACCE_NEWGROUP = 0;
  private static int GRP_ORDINPERACCE_DATAELABORAZ = 1;

  private static int PFL_ORDINPERACCE_CAPITOLO = 0;
  private static int PFL_ORDINPERACCE_ARTICOLO = 1;
  private static int PFL_ORDINPERACCE_ACCERTAMENTO = 2;
  private static int PFL_ORDINPERACCE_ANNOACC = 3;
  private static int PFL_ORDINPERACCE_COMP = 4;
  private static int PFL_ORDINPERACCE_NEWPANELABE3 = 5;
  private static int PFL_ORDINPERACCE_NEWPANELLABE = 6;
  private static int PFL_ORDINPERACCE_NEWPANELABE2 = 7;
  private static int PFL_ORDINPERACCE_DAL = 8;
  private static int PFL_ORDINPERACCE_AL = 9;
  private static int PFL_ORDINPERACCE_ELABORA = 10;
  private static int PFL_ORDINPERACCE_APRIPEG = 11;
  private static int PFL_ORDINPERACCE_APRIACC = 12;
  private static int PFL_ORDINPERACCE_INFOPEG = 13;
  private static int PFL_ORDINPERACCE_INFOACC = 14;

  private static int PPQRY_PAR39 = 0;


  IDPanel PAN_ORDINPERACCE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR40(IMDB);
    Init_TBL_PAROLD2(IMDB);
    //
    //
    Init_PQRY_PAR39(IMDB);
    Init_PQRY_PAR39_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR40(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR40, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR40, "TBL_PAR40");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMECOMP, "ROWNAMECOMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMECOMP,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR40,IMDBDef6.FLD_PAR40_ROWNAMEAL,6,14,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR40, 0);
  }

  private static void Init_TBL_PAROLD2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAROLD2, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PAROLD2, "TBL_PAROLD2");
    IMDB.set_FldCode(IMDBDef6.TBL_PAROLD2,IMDBDef6.FLD_PAROLD2_CAPITOLOOLD, "CAPITOLOOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PAROLD2,IMDBDef6.FLD_PAROLD2_CAPITOLOOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAROLD2,IMDBDef6.FLD_PAROLD2_ARTICOLOOLD, "ARTICOLOOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PAROLD2,IMDBDef6.FLD_PAROLD2_ARTICOLOOLD,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAROLD2, 0);
  }

  private static void Init_PQRY_PAR39(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR39, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR39, "PQRY_PAR39");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMECOMP, "ROWNAMECOMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMECOMP,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39,IMDBDef16.PQSL_PAR39_ROWNAMEAL,6,14,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR39, 0);
  }

  private static void Init_PQRY_PAR39_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR39_RS, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR39_RS, "PQRY_PAR39_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMECOMP, "ROWNAMECOMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMECOMP,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR39_RS,IMDBDef16.PQSL_PAR39_ROWNAMEAL,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiPerAccertamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiPerAccertamento()
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
    FormIdx = MyGlb.FRM_ORDINPERACCE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DF7814CE-3505-4D0F-9C39-C8B9E42F8EA4";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 408;
    DesignHeight = 274;
    set_Caption(new IDVariant("Ordinativi Per Accertamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 408;
    Frames[1].Height = 248;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Ordinativi Per Accertamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 248;
    PAN_ORDINPERACCE = new IDPanel(w, this, 1, "PAN_ORDINPERACCE");
    Frames[1].Content = PAN_ORDINPERACCE;
    PAN_ORDINPERACCE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINPERACCE.VS = MainFrm.VisualStyleList;
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 408-MyGlb.PAN_OFFS_X, 248-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "92EFCA6E-BB27-4FC0-9C29-9922A167A191");
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 528, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINPERACCE.InitStatus = 2;
    PAN_ORDINPERACCE_Init();
    PAN_ORDINPERACCE_InitFields();
    PAN_ORDINPERACCE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR40, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDINPERACCE_PAR39();
      }
      PAN_ORDINPERACCE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_ORDINPERACCE.FrIndex)
    {
      if (IdxFieldActived ==PFL_ORDINPERACCE_APRIPEG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_ORDINPERACCE.FrIndex)
    {
      if (IdxFieldActived ==PFL_ORDINPERACCE_APRIACC) {
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
    return (obj instanceof OrdinativiPerAccertamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiPerAccertamento.class.getName() : (Glb.ClassWithPackage(OrdinativiPerAccertamento.class) ? OrdinativiPerAccertamento.class.getName().substring(OrdinativiPerAccertamento.class.getPackage().getName().length() + 1) : OrdinativiPerAccertamento.class.getName()));
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
      if (IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEDAL, 0), true)<0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data Dal superiore a data Al", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0))) || ((!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0)))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0))))) && ((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0))) || (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0))))))
      {
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("NUMERO_ACC"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("ANNO_ACC"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("COMP_RES"));
        IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR5 = (new IDVariant("DATA_ELAB_DAL"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("DATA_ELAB_AL"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("CAPITOLO"));
        IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR9 = (new IDVariant("ARTICOLO"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Ordinativi_per_Accertamento"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0),(new IDVariant(0)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0),(new IDVariant(0)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECOMP, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEDAL, 0))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0),(new IDVariant(-1)))));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      else
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Capitolo o Accertamento incompleti", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Voce Peg
  // **********************************************************************
  public int ApriVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "ApriVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Acc
  // **********************************************************************
  public int ApriAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Acc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "ApriAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Peg
  // **********************************************************************
  public int InfoPeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "InfoPeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Acc
  // **********************************************************************
  public int InfoAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Acc Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "InfoAcc", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMECOMP, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "LoadEvent", _e);
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
        IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "EndModalEvent", _e);
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
      UNLOADEVENT_PARDELETROWS();
      UNLOADEVENT_PAROLDDELROW();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Par: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARDELETROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMECOMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMNUMACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMANNACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMEAL, 0, new IDVariant());
  }

  // **********************************************************************
  // Par Old: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PAROLDDELROW() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PAROLD2, IMDBDef6.FLD_PAROLD2_CAPITOLOOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAROLD2, IMDBDef6.FLD_PAROLD2_ARTICOLOOLD, 0, new IDVariant());
  }

  // **********************************************************************
  // Ordinativi Per Accertamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINPERACCE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINPERACCE);
      // 
      // Ordinativi Per Accertamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0))))
      {
        PAN_ORDINPERACCE.SetFlags (Glb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINPERACCE.SetFlags (Glb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0))))
      {
        PAN_ORDINPERACCE.SetFlags (Glb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINPERACCE.SetFlags (Glb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "OrdinativiPerAccertamentoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Per Accertamento On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ORDINPERACCE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi Per Accertamento On Updating Row Event Body
      // Procedure Body
      // 
      if ((Column.equals((new IDVariant(PFL_ORDINPERACCE_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_ORDINPERACCE_ARTICOLO)), true)) && FieldWasModified.booleanValue())
      {
        // if (IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PAROLD2, IMDBDef6.FLD_PAROLD2_CAPITOLOOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PAROLD2, IMDBDef6.FLD_PAROLD2_ARTICOLOOLD, 0),(new IDVariant(-1))), true)!=0)
        // {
        // }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0))))
        {
          IDVariant v_VCOUNT1 = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'E') ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT1.equals((new IDVariant(0)), true))
          {
            IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0, (new IDVariant()));
          }
          else
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0))))
            {
              IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  ACC A ");
              SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_VCOUNT.equals((new IDVariant(0)), true))
              {
                IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0, (new IDVariant()));
              }
            }
          }
          IMDB.set_Value(IMDBDef6.TBL_PAROLD2, IMDBDef6.FLD_PAROLD2_CAPITOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0));
          IMDB.set_Value(IMDBDef6.TBL_PAROLD2, IMDBDef6.FLD_PAROLD2_ARTICOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_ORDINPERACCE_ACCERTAMENTO)), true) || Column.equals((new IDVariant(PFL_ORDINPERACCE_ANNOACC)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0))))
        {
          if (MainFrm.AccPresente(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0), IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0)).equals((new IDVariant(1)), true))
          {
            IDVariant v_CAPITOLOACC = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_ARTICOLOACC = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.CAPITOLO as ACCCAPITOLO, ");
            SQL.append("  A.ARTICOLO as ACCARTICOLO ");
            SQL.append("from ");
            SQL.append("  ACC A ");
            SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CAPITOLOACC = QV.Get("ACCCAPITOLO", IDVariant.DECIMAL) ;
              v_ARTICOLOACC = QV.Get("ACCARTICOLO", IDVariant.INTEGER) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMECAPIT, 0, new IDVariant(v_CAPITOLOACC));
            IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMEARTIC, 0, new IDVariant(v_ARTICOLOACC));
            IMDB.set_Value(IMDBDef6.TBL_PAROLD2, IMDBDef6.FLD_PAROLD2_CAPITOLOOLD, 0, new IDVariant(v_CAPITOLOACC));
            IMDB.set_Value(IMDBDef6.TBL_PAROLD2, IMDBDef6.FLD_PAROLD2_ARTICOLOOLD, 0, new IDVariant(v_ARTICOLOACC));
          }
          else
          {
            IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMANNACC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef16.PQRY_PAR39, IMDBDef16.PQSL_PAR39_ROWNAMNUMACC, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerAccertamento", "OrdinativiPerAccertamentoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ORDINPERACCE_PAR39() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR39_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR40, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR40, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR39_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR39_RS, 0, IMDBDef6.TBL_PAR40, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR39_RS, 0, 0, IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR39_RS, 1, 0, IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR39_RS, 2, 0, IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMECOMP, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR39_RS, 3, 0, IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMNUMACC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR39_RS, 4, 0, IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMANNACC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR39_RS, 5, 0, IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR39_RS, 6, 0, IMDBDef6.TBL_PAR40, IMDBDef6.FLD_PAR40_ROWNAMEAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR40, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR40, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR40, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR39_RS, 0);
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
  private void PAN_ORDINPERACCE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINPERACCE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINPERACCE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINPERACCE, Cancel);
    // Stub
  }

  private void PAN_ORDINPERACCE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINPERACCE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ORDINPERACCE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINPERACCE_APRIPEG)
    {
      this.IdxPanelActived = this.PAN_ORDINPERACCE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINPERACCE_APRIACC)
    {
      this.IdxPanelActived = this.PAN_ORDINPERACCE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINPERACCE_INFOPEG)
    {
      this.IdxPanelActived = this.PAN_ORDINPERACCE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoPeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINPERACCE_INFOACC)
    {
      this.IdxPanelActived = this.PAN_ORDINPERACCE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINPERACCE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ORDINPERACCE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINPERACCE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINPERACCE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINPERACCE_Init()
  {

    PAN_ORDINPERACCE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINPERACCE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, "B7C6DBB9-851C-4412-BD63-E5E14EC23B37");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, "New Group");
    PAN_ORDINPERACCE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, MyGlb.PANEL_LIST, 200, -9999, 88, 0, 0, 0);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, MyGlb.PANEL_FORM, 44, 56, 224, 68, 0, 0);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, 0, 60);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, 1, 13);
    PAN_ORDINPERACCE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, 0, 1);
    PAN_ORDINPERACCE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, 1, 1);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_NEWGROUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, "005D0971-1151-4472-B3AE-C8A10E2CFC0D");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, "Data Elaborazione");
    PAN_ORDINPERACCE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, MyGlb.PANEL_LIST, 392, -9999, 208, 16, 0, 0);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, MyGlb.PANEL_FORM, 44, 131, 224, 49, 0, 0);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, 0, 102);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, 1, 13);
    PAN_ORDINPERACCE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, 0, 4);
    PAN_ORDINPERACCE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, 1, 4);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINPERACCE_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINPERACCE.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, "D7D0273A-3159-4DB5-A249-28FE17335B32");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, "Capitolo/Art.");
    PAN_ORDINPERACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, "6FD001D7-5E93-4C40-B9A5-1D8D5FD69670");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, "Articolo");
    PAN_ORDINPERACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, "A3D700E8-2589-4ABE-A2B7-7B6753068B95");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, "Accertamento");
    PAN_ORDINPERACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, "81454577-28E9-41AC-8314-6F87AA085B48");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, "Anno Acc");
    PAN_ORDINPERACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, "6910B406-C6D1-4096-8E83-EA6555D3DD6B");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, "Comp");
    PAN_ORDINPERACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, "D97BDEAB-9D44-4F58-92E1-5AFADA82F02D");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, MyGlb.VIS_VUOTONORMALE);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, "216C78F2-42BB-4D52-B216-087422EA8CE1");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, "/");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, "DDFBBBAE-095C-4388-BB7D-85496AFE6097");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, "/");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, MyGlb.VIS_VUOTONORMALE);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, "2C0417AB-9D0E-479A-B1BE-B649265242E8");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, "Dal");
    PAN_ORDINPERACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, "0CC00BAF-54C5-42F3-BA5F-8DF513B3D03A");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, "Al");
    PAN_ORDINPERACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, "E03244B1-D77E-45E3-8E98-FB471D703C02");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, "Elabora");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ORDINPERACCE.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, 0, "button1.gif", false);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, "8EC84487-E8D4-49FF-9BC2-F8CB9446E9BB");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINPERACCE.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, 0, "wsearch.gif", false);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, "3F7959DE-BCC3-42F3-BD57-A531B9253B69");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINPERACCE.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, 0, "wsearch.gif", false);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, "D5C8D379-6EFB-4F01-970B-6510449F74A6");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINPERACCE.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, 0, "info.gif", false);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINPERACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, "96D56507-35C5-47DE-BBC8-A6C4CFBBF732");
    PAN_ORDINPERACCE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, "");
    PAN_ORDINPERACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINPERACCE.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, 0, "info.gif", false);
    PAN_ORDINPERACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ORDINPERACCE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, MyGlb.PANEL_LIST, 72, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo Art");
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, MyGlb.PANEL_FORM, 24, 4, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, MyGlb.PANEL_FORM, 84);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_CAPITOLO, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_CAPITOLO, PPQRY_PAR39, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, MyGlb.PANEL_LIST, 136, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, MyGlb.PANEL_FORM, 276, 4, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, MyGlb.PANEL_FORM, 80);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_ARTICOLO, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_ARTICOLO, PPQRY_PAR39, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, MyGlb.PANEL_LIST, 288, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, MyGlb.PANEL_LIST, 68);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, MyGlb.PANEL_LIST, "Acc.");
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, MyGlb.PANEL_FORM, 16, 32, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, MyGlb.PANEL_FORM, 92);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accertamento");
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_ACCERTAMENTO, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_ACCERTAMENTO, PPQRY_PAR39, "A.ROWNAMNUMACC", "ROWNAMNUMACC", 1, 5, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, MyGlb.PANEL_LIST, 328, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, MyGlb.PANEL_LIST, 56);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, MyGlb.PANEL_LIST, "Anno Acc");
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, MyGlb.PANEL_FORM, 176, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, MyGlb.PANEL_FORM, 80);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ANNOACC, MyGlb.PANEL_FORM, "Anno Acc");
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_ANNOACC, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_ANNOACC, PPQRY_PAR39, "A.ROWNAMANNACC", "ROWNAMANNACC", 1, 4, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, MyGlb.PANEL_LIST, 200, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, MyGlb.PANEL_LIST, 36);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, MyGlb.PANEL_LIST, "Comp");
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, MyGlb.PANEL_FORM, 120, 60, 144, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, MyGlb.PANEL_FORM, 80);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, MyGlb.PANEL_FORM, 4);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_COMP, MyGlb.PANEL_FORM, "Comp");
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_COMP, -1, GRP_ORDINPERACCE_NEWGROUP);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_COMP, PPQRY_PAR39, "A.ROWNAMECOMP", "ROWNAMECOMP", 12, 1, 0, -13997);
    PAN_ORDINPERACCE.SetValueListItem(PFL_ORDINPERACCE_COMP, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_ORDINPERACCE.SetValueListItem(PFL_ORDINPERACCE_COMP, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_ORDINPERACCE.SetValueListItem(PFL_ORDINPERACCE_COMP, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, MyGlb.PANEL_LIST, 4, 112, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, MyGlb.PANEL_FORM, 48, 108, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_NEWPANELABE3, -1, GRP_ORDINPERACCE_NEWGROUP);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, MyGlb.PANEL_LIST, 128, 32, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, MyGlb.PANEL_FORM, 160, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_NEWPANELLABE, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, MyGlb.PANEL_LIST, 144, 48, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, MyGlb.PANEL_FORM, 260, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_NEWPANELABE2, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, MyGlb.PANEL_LIST, 392, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, MyGlb.PANEL_LIST, 24);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, MyGlb.PANEL_FORM, 48, 156, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, MyGlb.PANEL_FORM, 28);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_DAL, -1, GRP_ORDINPERACCE_DATAELABORAZ);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_DAL, PPQRY_PAR39, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, MyGlb.PANEL_LIST, 496, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, MyGlb.PANEL_LIST, 20);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, MyGlb.PANEL_LIST, "Al");
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, MyGlb.PANEL_FORM, 160, 156, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, MyGlb.PANEL_FORM, 20);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_AL, MyGlb.PANEL_FORM, "Al");
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_AL, -1, GRP_ORDINPERACCE_DATAELABORAZ);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_AL, PPQRY_PAR39, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, MyGlb.PANEL_LIST, 184, 192, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, MyGlb.PANEL_FORM, 228, 196, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_ELABORA, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, MyGlb.PANEL_LIST, 248, 8, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, MyGlb.PANEL_FORM, 304, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIPEG, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_APRIPEG, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_APRIPEG, -1, "", "APRIPEG", 0, 0, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, MyGlb.PANEL_LIST, 256, 16, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, MyGlb.PANEL_FORM, 224, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_APRIACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_APRIACC, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_APRIACC, -1, "", "APRIACC", 0, 0, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, MyGlb.PANEL_LIST, 268, 8, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, MyGlb.PANEL_FORM, 320, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOPEG, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_INFOPEG, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_INFOPEG, -1, "", "INFOPEG", 0, 0, 0, -13997);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, MyGlb.PANEL_LIST, 276, 16, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERACCE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, MyGlb.PANEL_FORM, 240, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERACCE_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERACCE.SetFieldPage(PFL_ORDINPERACCE_INFOACC, -1, -1);
    PAN_ORDINPERACCE.SetFieldPanel(PFL_ORDINPERACCE_INFOACC, -1, "", "INFOACC", 0, 0, 0, -13997);
  }

  private void PAN_ORDINPERACCE_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINPERACCE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDINPERACCE.SetIMDB(IMDB, "PQRY_PAR39", true);
    PAN_ORDINPERACCE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ORDINPERACCE.SetQueryIMDB(PPQRY_PAR39, IMDBDef16.PQRY_PAR39_RS, IMDBDef6.TBL_PAR40);
    JustLoaded = true;
    PAN_ORDINPERACCE.SetFieldPrimaryIndex(PFL_ORDINPERACCE_CAPITOLO, IMDBDef6.FLD_PAR40_ROWNAMECAPIT);
    PAN_ORDINPERACCE.SetFieldPrimaryIndex(PFL_ORDINPERACCE_ARTICOLO, IMDBDef6.FLD_PAR40_ROWNAMEARTIC);
    PAN_ORDINPERACCE.SetFieldPrimaryIndex(PFL_ORDINPERACCE_ACCERTAMENTO, IMDBDef6.FLD_PAR40_ROWNAMNUMACC);
    PAN_ORDINPERACCE.SetFieldPrimaryIndex(PFL_ORDINPERACCE_ANNOACC, IMDBDef6.FLD_PAR40_ROWNAMANNACC);
    PAN_ORDINPERACCE.SetFieldPrimaryIndex(PFL_ORDINPERACCE_COMP, IMDBDef6.FLD_PAR40_ROWNAMECOMP);
    PAN_ORDINPERACCE.SetFieldPrimaryIndex(PFL_ORDINPERACCE_DAL, IMDBDef6.FLD_PAR40_ROWNAMEDAL);
    PAN_ORDINPERACCE.SetFieldPrimaryIndex(PFL_ORDINPERACCE_AL, IMDBDef6.FLD_PAR40_ROWNAMEAL);
    PAN_ORDINPERACCE.SetMasterTable(0, "PAR40");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINPERACCE.Status() == 2)
    {
      int oldListQBE = PAN_ORDINPERACCE.iUseListQBE;
      PAN_ORDINPERACCE.iUseListQBE = 0;
      PAN_ORDINPERACCE.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINPERACCE.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINPERACCE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINPERACCE) PAN_ORDINPERACCE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINPERACCE) PAN_ORDINPERACCE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINPERACCE) PAN_ORDINPERACCE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINPERACCE) PAN_ORDINPERACCE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINPERACCE) PAN_ORDINPERACCE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
