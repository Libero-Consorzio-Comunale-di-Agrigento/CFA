// **********************************************
// Emissione Corrispettivi Incassi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneCorrispettiviIncassi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_EMISSIORDINA_INCASSI = 0;
  private static int GRP_EMISSIORDINA_CORRISPETTIV = 1;

  private static int PFL_EMISSIORDINA_TIPOREGISTRO = 0;
  private static int PFL_EMISSIORDINA_TIPOBOLLATO = 1;
  private static int PFL_EMISSIORDINA_PERIOINCADAL = 2;
  private static int PFL_EMISSIORDINA_AL = 3;
  private static int PFL_EMISSIORDINA_TIPOREGIBOL1 = 4;
  private static int PFL_EMISSIORDINA_ELABORA = 5;
  private static int PFL_EMISSIORDINA_DESCRIZIONE = 6;
  private static int PFL_EMISSIORDINA_TIPOREGICORR = 7;
  private static int PFL_EMISSIORDINA_TIPOBOLLCORR = 8;
  private static int PFL_EMISSIORDINA_TIPOREGIBOLL = 9;

  private static int PPQRY_ORDINDACORR6 = 0;

  private static int PPQRY_T04 = 1;
  private static int PPQRY_T5 = 2;


  IDPanel PAN_EMISSIORDINA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_EMISSIORDIN3(IMDB);
    //
    //
    Init_PQRY_ORDINDACORR6(IMDB);
    Init_PQRY_ORDINDACORR6_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_EMISSIORDIN3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_EMISSIORDIN3, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_EMISSIORDIN3, "TBL_EMISSIORDIN3");
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINDA, "ROWNAMPEINDA");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINDA,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINAL, "ROWNAMPEINAL");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIRECO, "ROWNAMTIRECO");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIRECO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIBOCO, "ROWNAMTIBOCO");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN3,IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIBOCO,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_EMISSIORDIN3, 0);
  }

  private static void Init_PQRY_ORDINDACORR6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ORDINDACORR6, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_ORDINDACORR6, "PQRY_ORDINDACORR6");
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINDA, "ROWNAMPEINDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINDA,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINAL, "ROWNAMPEINAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIRECO, "ROWNAMTIRECO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIRECO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIBOCO, "ROWNAMTIBOCO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIBOCO,1,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_ORDINDACORR6, 0);
  }

  private static void Init_PQRY_ORDINDACORR6_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ORDINDACORR6_RS, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_ORDINDACORR6_RS, "PQRY_ORDINDACORR6_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINDA, "ROWNAMPEINDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINDA,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINAL, "ROWNAMPEINAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIRECO, "ROWNAMTIRECO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIRECO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIBOCO, "ROWNAMTIBOCO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR6_RS,IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIBOCO,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneCorrispettiviIncassi(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneCorrispettiviIncassi()
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
    FormIdx = MyGlb.FRM_EMISCORRINCA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "50AF2F25-A0A4-4E4C-91FB-7D9D8A1C2204";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 580;
    DesignHeight = 282;
    set_Caption(new IDVariant("Emissione Corrispettivi Incassi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 580;
    Frames[1].Height = 256;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Emissione Ordinativi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 256;
    PAN_EMISSIORDINA = new IDPanel(w, this, 1, "PAN_EMISSIORDINA");
    Frames[1].Content = PAN_EMISSIORDINA;
    PAN_EMISSIORDINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISSIORDINA.VS = MainFrm.VisualStyleList;
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 256-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C5EF9333-74DC-4851-9A62-A4AF64D43E3E");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1312, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISSIORDINA.InitStatus = 2;
    PAN_EMISSIORDINA_Init();
    PAN_EMISSIORDINA_InitFields();
    PAN_EMISSIORDINA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_EMISSIORDIN3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISCORRINCA_ORDINDACORR6();
      }
      PAN_EMISSIORDINA.UpdatePanel(MainFrm);
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
    return (obj instanceof EmissioneCorrispettiviIncassi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneCorrispettiviIncassi.class.getName() : (Glb.ClassWithPackage(EmissioneCorrispettiviIncassi.class) ? EmissioneCorrispettiviIncassi.class.getName().substring(EmissioneCorrispettiviIncassi.class.getPackage().getName().length() + 1) : EmissioneCorrispettiviIncassi.class.getName()));
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
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_ROWNAMEDESCR, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Descrizione Obbligatoria", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        IDVariant v_NCORRDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NCORRA = new IDVariant(0,IDVariant.INTEGER);
        if ((IDL.Year(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINDA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0) || (IDL.Year(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINAL, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0))
        {
          MainFrm.set_AlertMessage((new IDVariant("Il periodo di incasso non nell'esercizio"))); 
          return 0;
        }
        if ((IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_TIPO_REGISTRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_TIPO_BOLLATO, 0))) || (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIRECO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIBOCO, 0))))
        {
          MainFrm.set_AlertMessage((new IDVariant("Indicare un registro/bollato"))); 
          return 0;
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.EMISSIONECORRISPETTIVIFS4(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_TIPO_REGISTRO, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_TIPO_BOLLATO, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINDA, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_ROWNAMPEINAL, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_ROWNAMTIBOCO, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR6, IMDBDef9.PQSL_ORDINDACORR6_ROWNAMEDESCR, 0), v_NCORRDA, v_NCORRA);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_RETMSG = new IDVariant(0,IDVariant.STRING);
          v_RETMSG = IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>")));
          if (v_NCORRDA.compareTo(v_NCORRA, true)<=0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Emessi corrispettivi da ", IDVariant.STRING));
            v_MSG = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(v_NCORRDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_NCORRA));
            v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
          }
          else
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Non sono stati emessi corrispettivi", IDVariant.STRING));
            v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
          }
          MainFrm.set_AlertMessage(v_RETMSG); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneCorrispettiviIncassi", "Elabora", _e);
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
      set_Caption(IDL.Add((new IDVariant("Emissione Corrispettivi Incassi")), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneCorrispettiviIncassi", "LoadEvent", _e);
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
      UNLOADEVENT_EMISORDIDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneCorrispettiviIncassi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_EMISORDIDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMEDESCR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_TIPO_REGISTRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_TIPO_BOLLATO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIRECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIBOCO, 0, new IDVariant());
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi
  // Primary record source for panel data
  // **********************************************************************
  private void EMISCORRINCA_ORDINDACORR6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_ORDINDACORR6_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_EMISSIORDIN3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_EMISSIORDIN3, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_ORDINDACORR6_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_ORDINDACORR6_RS, 0, IMDBDef2.TBL_EMISSIORDIN3, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR6_RS, 0, 0, IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMEDESCR, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR6_RS, 1, 0, IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_TIPO_REGISTRO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR6_RS, 2, 0, IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_TIPO_BOLLATO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR6_RS, 3, 0, IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINDA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR6_RS, 4, 0, IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR6_RS, 5, 0, IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIRECO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR6_RS, 6, 0, IMDBDef2.TBL_EMISSIORDIN3, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIBOCO, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_EMISSIORDIN3, 0);
      if (IMDB.Eof(IMDBDef2.TBL_EMISSIORDIN3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_EMISSIORDIN3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_ORDINDACORR6_RS, 0);
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
  private void PAN_EMISSIORDINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISSIORDINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISSIORDINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISSIORDINA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISSIORDINA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_EMISSIORDINA);
    // Stub
  }

  private void PAN_EMISSIORDINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISSIORDINA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISSIORDINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_EMISSIORDINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EMISSIORDINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISSIORDINA_Init()
  {

    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, "C88371A7-5DFB-4C9C-BC86-CDE94AE8B461");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, "Incassi");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, MyGlb.PANEL_LIST, 0, -9999, 412, 10, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, MyGlb.PANEL_FORM, 16, 18, 524, 62, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 0, 40);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 0, 2);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 1, 2);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, "684A033E-30D2-4391-9A89-0C35DBFE9422");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, "Corrispettivi");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, MyGlb.PANEL_LIST, 0, -9999, 412, 16, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, MyGlb.PANEL_FORM, 16, 94, 524, 62, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, 0, 70);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, 0, 4);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, 1, 2);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CORRISPETTIV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, "57AC14B2-7E7B-43CA-988F-959596BFD79E");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, "Tipo Registro");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, "CBD6591C-8B8C-4983-BE1F-917A15D57858");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, "Tipo Bollato");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, "D159DB1B-1F61-4A65-9638-95E874C708C7");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, "Periodo Incassi: dal");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, "5CBE8C2A-A0CD-46C0-8D23-CEF55FDE430F");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, "al");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, "D95F1045-7725-4CA6-8D65-30620B640EBC");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, "Tipo Registro/Bollato");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, "C509E26D-D7BC-4A9A-B317-DAC1E5F8DDBF");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, "Elabora");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, 0, "button1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, "3F1F6C43-12F1-43E5-B628-FB01A4733F16");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, "Descrizione");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, "E1342BC0-A890-4F26-AC7C-BC35B598647C");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, "Tipo Registro Corr");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, "B2D7D78D-D173-49E6-89C1-F5148B969D1B");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, "Tipo Bollato Corr");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, "1DEEA4F2-E6B7-4613-B74E-40ED79F41E51");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, "Tipo Registro/Bollato ");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_EMISSIORDINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_LIST, 84);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tipo Registro");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_FORM, 104, 16, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_FORM, 84);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_TIPOREGISTRO, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_TIPOREGISTRO, PPQRY_ORDINDACORR6, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, 76);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tipo Bollato");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, 104, 40, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, 76);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_TIPOBOLLATO, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_TIPOBOLLATO, PPQRY_ORDINDACORR6, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_LIST, 120);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_LIST, "Periodo Incassi: dal");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_FORM, 32, 56, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_FORM, 120);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_FORM, "Periodo Incassi: dal");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_PERIOINCADAL, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_PERIOINCADAL, PPQRY_ORDINDACORR6, "A.ROWNAMPEINDA", "ROWNAMPEINDA", 6, 15, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_LIST, 112);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_LIST, "al");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_FORM, 244, 56, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_FORM, 20);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_FORM, "al");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_AL, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_AL, PPQRY_ORDINDACORR6, "A.ROWNAMPEINAL", "ROWNAMPEINAL", 6, 15, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, MyGlb.PANEL_LIST, 0, 36, 412, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, MyGlb.PANEL_LIST, 100);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, MyGlb.PANEL_LIST, "Tipo Registro/Bollato");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, MyGlb.PANEL_FORM, 20, 32, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, MyGlb.PANEL_FORM, 132);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOL1, MyGlb.PANEL_FORM, "Tipo Registro/Bollato");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_TIPOREGIBOL1, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_TIPOREGIBOL1, PPQRY_T04, "TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "DESCRIZIONE", 5, 244, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_LIST, 400, 480, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_FORM, 460, 176, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ELABORA, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 20, 132, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 132);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DESCRIZIONE, -1, GRP_EMISSIORDINA_CORRISPETTIV);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DESCRIZIONE, PPQRY_ORDINDACORR6, "A.ROWNAMEDESCR", "ROWNAMEDESCR", 5, 49, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, MyGlb.PANEL_LIST, 112);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, MyGlb.PANEL_LIST, "Tipo Registro Corr");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, MyGlb.PANEL_FORM, 4, 300, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, MyGlb.PANEL_FORM, 112);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGICORR, MyGlb.PANEL_FORM, "Tipo Registro Corr");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_TIPOREGICORR, -1, GRP_EMISSIORDINA_CORRISPETTIV);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_TIPOREGICORR, PPQRY_ORDINDACORR6, "A.ROWNAMTIRECO", "ROWNAMTIRECO", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, MyGlb.PANEL_LIST, 104);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, MyGlb.PANEL_LIST, "Tipo Bollato Corr");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, MyGlb.PANEL_FORM, 4, 324, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, MyGlb.PANEL_FORM, 104);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLCORR, MyGlb.PANEL_FORM, "Tipo Bollato Corr");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_TIPOBOLLCORR, -1, GRP_EMISSIORDINA_CORRISPETTIV);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_TIPOBOLLCORR, PPQRY_ORDINDACORR6, "A.ROWNAMTIBOCO", "ROWNAMTIBOCO", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_LIST, 0, 36, 412, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_LIST, 100);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_LIST, "Tipo Registro/Bollato ");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_FORM, 24, 108, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_FORM, 128);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_FORM, "Tipo Registro/Bollato ");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_TIPOREGIBOLL, -1, GRP_EMISSIORDINA_CORRISPETTIV);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_TIPOREGIBOLL, PPQRY_T5, "TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "DESCRIZIONE", 5, 244, 0, -13997);
  }

  private void PAN_EMISSIORDINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) as CODICE, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~TIPO_BOLLATO~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~TIPO_REGISTRO~~) ");
    SQL.append("and   (A.CORRISPETTIVI = 'SI') ");
    SQL.append("and   ((A.TIPO_REGISTRO = 3) OR (A.TIPO_REGISTRO = 5)) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T04, 0, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetMasterTable(PPQRY_T04, "T04");
    PAN_EMISSIORDINA.SetQueryLKE(PPQRY_T04, PFL_EMISSIORDINA_TIPOREGISTRO, "T04TIPOREGIS");
    PAN_EMISSIORDINA.SetQueryLKE(PPQRY_T04, PFL_EMISSIORDINA_TIPOBOLLATO, "T04TIPOBOLLA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) as CODICE, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.CORRISPETTIVI = 'SI') ");
    SQL.append("and   ((A.TIPO_REGISTRO = 3) OR (A.TIPO_REGISTRO = 5)) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T04, 1, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_T04, "CODICE", "Codice");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_T04, "DESCRIZIONE", "Descrizione");
    PAN_EMISSIORDINA.SetQueryVisibleColumn(PPQRY_T04, "DESCRIZIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) as CODICE, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~ROWNAMTIBOCO~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~ROWNAMTIRECO~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 4) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T5, 0, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetMasterTable(PPQRY_T5, "T04");
    PAN_EMISSIORDINA.SetQueryLKE(PPQRY_T5, PFL_EMISSIORDINA_TIPOREGICORR, "T04TIPOREGIS");
    PAN_EMISSIORDINA.SetQueryLKE(PPQRY_T5, PFL_EMISSIORDINA_TIPOBOLLCORR, "T04TIPOBOLLA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) as CODICE, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 4) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T5, 1, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_T5, "CODICE", "Codice");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_T5, "DESCRIZIONE", "Descrizione");
    PAN_EMISSIORDINA.SetQueryVisibleColumn(PPQRY_T5, "DESCRIZIONE");
    PAN_EMISSIORDINA.SetIMDB(IMDB, "PQRY_ORDINDACORR6", true);
    PAN_EMISSIORDINA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_EMISSIORDINA.SetQueryIMDB(PPQRY_ORDINDACORR6, IMDBDef9.PQRY_ORDINDACORR6_RS, IMDBDef2.TBL_EMISSIORDIN3);
    JustLoaded = true;
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_TIPOREGISTRO, IMDBDef2.FLD_EMISSIORDIN3_TIPO_REGISTRO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_TIPOBOLLATO, IMDBDef2.FLD_EMISSIORDIN3_TIPO_BOLLATO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_PERIOINCADAL, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINDA);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_AL, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMPEINAL);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DESCRIZIONE, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMEDESCR);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_TIPOREGICORR, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIRECO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_TIPOBOLLCORR, IMDBDef2.FLD_EMISSIORDIN3_ROWNAMTIBOCO);
    PAN_EMISSIORDINA.SetMasterTable(0, "EMISSIORDIN3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISSIORDINA.Status() == 2)
    {
      int oldListQBE = PAN_EMISSIORDINA.iUseListQBE;
      PAN_EMISSIORDINA.iUseListQBE = 0;
      PAN_EMISSIORDINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISSIORDINA.PanelCommand(Glb.PCM_FIND);
      PAN_EMISSIORDINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
