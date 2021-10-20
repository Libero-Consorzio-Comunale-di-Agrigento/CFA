// **********************************************
// Registro Acquisti Vendite
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RegistroAcquistiVendite extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_REGIACQUVEND_TIPOREGISTO = 0;
  private static int PFL_REGIACQUVEND_TIPOBOLLATO = 1;
  private static int PFL_REGIACQUVEND_ANNO = 2;
  private static int PFL_REGIACQUVEND_DATADA = 3;
  private static int PFL_REGIACQUVEND_DATAA = 4;
  private static int PFL_REGIACQUVEND_INTESTREGIST = 5;
  private static int PFL_REGIACQUVEND_NUMEPRIMPAGI = 6;
  private static int PFL_REGIACQUVEND_ELABORA = 7;

  private static int PPQRY_PAR94 = 0;


  IDPanel PAN_REGIACQUVEND;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR68(IMDB);
    //
    //
    Init_PQRY_PAR94(IMDB);
    Init_PQRY_PAR94_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR68(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PAR68, 8);
    IMDB.set_TblCode(IMDBDef2.TBL_PAR68, "TBL_PAR68");
    IMDB.set_FldCode(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMINTREG,5,25,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMNUPRPA,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMELENGH, "ROWNAMELENGH");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR68,IMDBDef2.FLD_PAR68_ROWNAMELENGH,1,5,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PAR68, 0);
  }

  private static void Init_PQRY_PAR94(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PAR94, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_PAR94, "PQRY_PAR94");
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMINTREG,5,25,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94,IMDBDef10.PQSL_PAR94_ROWNAMNUPRPA,1,5,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PAR94, 0);
  }

  private static void Init_PQRY_PAR94_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PAR94_RS, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_PAR94_RS, "PQRY_PAR94_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMINTREG,5,25,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PAR94_RS,IMDBDef10.PQSL_PAR94_ROWNAMNUPRPA,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RegistroAcquistiVendite(MyWebEntryPoint w, IMDBObj imdb)
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
  public RegistroAcquistiVendite()
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
    FormIdx = MyGlb.FRM_REGIACQUVEND;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A497FB09-7540-4CED-9BB7-A9EEC1AEBA1A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 400;
    DesignHeight = 170;
    set_Caption(new IDVariant("Registro Acquisti Vendite"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 400;
    Frames[1].Height = 144;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Registro Acquisti Vendite";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 144;
    PAN_REGIACQUVEND = new IDPanel(w, this, 1, "PAN_REGIACQUVEND");
    Frames[1].Content = PAN_REGIACQUVEND;
    PAN_REGIACQUVEND.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_REGIACQUVEND.VS = MainFrm.VisualStyleList;
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 144-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_REGIACQUVEND.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E6467DCD-584B-4AFB-BF56-3068DAF7931B");
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 152, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_REGIACQUVEND.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_REGIACQUVEND.InitStatus = 2;
    PAN_REGIACQUVEND_Init();
    PAN_REGIACQUVEND_InitFields();
    PAN_REGIACQUVEND_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PAR68, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        REGIACQUVEND_PAR94();
      }
      PAN_REGIACQUVEND.UpdatePanel(MainFrm);
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
    return (obj instanceof RegistroAcquistiVendite);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RegistroAcquistiVendite.class.getName() : (Glb.ClassWithPackage(RegistroAcquistiVendite.class) ? RegistroAcquistiVendite.class.getName().substring(RegistroAcquistiVendite.class.getPackage().getName().length() + 1) : RegistroAcquistiVendite.class.getName()));
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
    IDVariant v_DESDOCREGIVA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PAR94, IMDBDef10.PQSL_PAR94_ROWNAMINTREG, 0),(new IDVariant(""))).equals((new IDVariant("")), true))
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Valore obbligatorio per l'Intestazione Registro", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG); 
      }
      else
      {
        IDVariant v_T04DESCRIZIO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NOME = new IDVariant(0,IDVariant.STRING);
        IDVariant v_INDIRIZZO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_PAR = new IDVariant(0,IDVariant.STRING);
        v_PAR = (new IDVariant("Partita I.V.A.: ", IDVariant.STRING));
        IDVariant v_PARTITAIVA = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CITTA = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
        SQL.append("from ");
        SQL.append("  T04 A ");
        SQL.append("where (A.TIPO_REGISTRO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPBOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_T04DESCRIZIO = QV.Get("T04DESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
        v_NOME = IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DENOMINAZIONE, 0);
        v_INDIRIZZO = IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_INDIRIZZO, 0);
        v_CITTA = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_CAP, 0)), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0))), (new IDVariant(" "))), IDL.ToString(((IDL.IsNull(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)))?(new IDVariant(" ")):IDL.Add(IDL.Add((new IDVariant("(")), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)), (new IDVariant(")"))))));
        v_PARTITAIVA = ((IDL.IsNull(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PARTITA_IVA, 0)))?(new IDVariant("")):IDL.Add(v_PAR, IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PARTITA_IVA, 0)), (new IDVariant(11)), IDL.ToString((new IDVariant(0))), true)));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE_DOC_REG_IVA as T99DESDOREIV ");
        SQL.append("from ");
        SQL.append("  T99 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESDOCREGIVA = QV.Get("T99DESDOREIV", IDVariant.STRING) ;
        }
        QV.Close();
        MainFrm.SetParametroStampaJasper((new IDVariant("TIPO_REGISTRO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("TIPO_BOLLATO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPBOL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEANNO, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_DA")), IDL.ToString(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IDL.Month(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATDA, 0))), (new IDVariant("/"))), IDL.ToString(IDL.Day(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATDA, 0)))), (new IDVariant("/"))), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATDA, 0))))));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_A")), IDL.ToString(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IDL.Month(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATAA, 0))), (new IDVariant("/"))), IDL.ToString(IDL.Day(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATAA, 0)))), (new IDVariant("/"))), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATAA, 0))))));
        MainFrm.SetParametroStampaJasper((new IDVariant("T04_DESCRIZIONE")), IDL.Replace(v_T04DESCRIZIO, (new IDVariant("%")), (new IDVariant("%25"))));
        MainFrm.SetParametroStampaJasper((new IDVariant("DESC_REG_IVA")), IDL.Replace(v_DESDOCREGIVA, (new IDVariant("%")), (new IDVariant("%25"))));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TESTO")), IMDB.Value(IMDBDef10.PQRY_PAR94, IMDBDef10.PQSL_PAR94_ROWNAMINTREG, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("NUM_PAGINA")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PAR94, IMDBDef10.PQSL_PAR94_ROWNAMNUPRPA, 0),(new IDVariant(0)))));
        MainFrm.LanciaStampaJasper((new IDVariant("REGISTRO_ACQUISTIVENDITE")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RegistroAcquistiVendite", "Elabora", _e);
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INTESTAZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Registro Acquisti/Vendite", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      if (IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0).equals((new IDVariant(2)), true))
      {
        IDVariant v_INT = new IDVariant(0,IDVariant.STRING);
        v_INT = (new IDVariant("REGISTRO I.V.A. FORNITORI", IDVariant.STRING));
        v_INTESTAZIONE = new IDVariant(v_INT);
      }
      if (IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0).equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0).equals((new IDVariant(6)), true))
      {
        IDVariant v_INT = new IDVariant(0,IDVariant.STRING);
        v_INT = (new IDVariant("REGISTRO I.V.A. DEBITORI", IDVariant.STRING));
        v_INTESTAZIONE = new IDVariant(v_INT);
      }
      if (IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0).equals((new IDVariant(4)), true))
      {
        IDVariant v_INT = new IDVariant(0,IDVariant.STRING);
        v_INT = (new IDVariant("REGISTRO I.V.A. CORRISPETTIVI", IDVariant.STRING));
        v_INTESTAZIONE = new IDVariant(v_INT);
      }
      IMDB.set_Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMINTREG, 0, new IDVariant(v_INTESTAZIONE));
      IMDB.set_Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMELENGH, 0, IDL.Length(v_INTESTAZIONE));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RegistroAcquistiVendite", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Registro Acquisti Vendite On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_REGIACQUVEND_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registro Acquisti Vendite On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_REGIACQUVEND_INTESTREGIST)), true) && FieldModified.booleanValue())
      {
        if (IDL.Length(IMDB.Value(IMDBDef10.PQRY_PAR94, IMDBDef10.PQSL_PAR94_ROWNAMINTREG, 0)).compareTo(IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMELENGH, 0), true)>0)
        {
          IMDB.set_Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMINTREG, 0, IDL.Left(IMDB.Value(IMDBDef10.PQRY_PAR94, IMDBDef10.PQSL_PAR94_ROWNAMINTREG, 0), IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMELENGH, 0)));
          IMDB.set_Value(IMDBDef10.PQRY_PAR94, IMDBDef10.PQSL_PAR94_ROWNAMINTREG, 0, IDL.Left(IMDB.Value(IMDBDef10.PQRY_PAR94, IMDBDef10.PQSL_PAR94_ROWNAMINTREG, 0), IMDB.Value(IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMELENGH, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RegistroAcquistiVendite", "RegistroAcquistiVenditeOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void REGIACQUVEND_PAR94() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PAR94_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PAR68, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PAR68, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PAR94_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PAR94_RS, 0, IMDBDef2.TBL_PAR68, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PAR94_RS, 0, 0, IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PAR94_RS, 1, 0, IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMTIPBOL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PAR94_RS, 2, 0, IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEANNO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PAR94_RS, 3, 0, IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATDA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PAR94_RS, 4, 0, IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMEDATAA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PAR94_RS, 5, 0, IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMINTREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PAR94_RS, 6, 0, IMDBDef2.TBL_PAR68, IMDBDef2.FLD_PAR68_ROWNAMNUPRPA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PAR68, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PAR68, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PAR68, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PAR94_RS, 0);
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
  private void PAN_REGIACQUVEND_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_REGIACQUVEND, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_REGIACQUVEND_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_REGIACQUVEND, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_REGIACQUVEND_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_REGIACQUVEND);
    // Stub
  }

  private void PAN_REGIACQUVEND_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_REGIACQUVEND_ELABORA)
    {
      this.IdxPanelActived = this.PAN_REGIACQUVEND.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_REGIACQUVEND_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_REGIACQUVEND_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_REGIACQUVEND_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_REGIACQUVEND_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_REGIACQUVEND_Init()
  {

    PAN_REGIACQUVEND.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_REGIACQUVEND.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_REGIACQUVEND.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_REGIACQUVEND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, "C12BAB96-6685-45C0-8A3B-AE93953E89F6");
    PAN_REGIACQUVEND.set_Header(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, "Tipo Registo");
    PAN_REGIACQUVEND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, "");
    PAN_REGIACQUVEND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, MyGlb.VIS_NORMFIELPADR);
    PAN_REGIACQUVEND.SetFlags(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGIACQUVEND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, "405BE8A5-1B80-4C26-8588-1045F504B487");
    PAN_REGIACQUVEND.set_Header(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, "Tipo Bollato");
    PAN_REGIACQUVEND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, "");
    PAN_REGIACQUVEND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_REGIACQUVEND.SetFlags(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGIACQUVEND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, "6C1E17BC-FF8F-43AD-B73C-A1CAEE1A7AE3");
    PAN_REGIACQUVEND.set_Header(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, "Anno");
    PAN_REGIACQUVEND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, "");
    PAN_REGIACQUVEND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, MyGlb.VIS_NORMFIELPADR);
    PAN_REGIACQUVEND.SetFlags(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGIACQUVEND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, "2157FFDC-B0EC-48D9-9BF9-10D2C81220D4");
    PAN_REGIACQUVEND.set_Header(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, "Data Da");
    PAN_REGIACQUVEND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, "");
    PAN_REGIACQUVEND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, MyGlb.VIS_NORMFIELPADR);
    PAN_REGIACQUVEND.SetFlags(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGIACQUVEND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, "716C1BF0-423D-4674-9E30-A4C787D90DC5");
    PAN_REGIACQUVEND.set_Header(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, "Data A");
    PAN_REGIACQUVEND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, "");
    PAN_REGIACQUVEND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, MyGlb.VIS_NORMFIELPADR);
    PAN_REGIACQUVEND.SetFlags(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGIACQUVEND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, "B98A8587-1B2D-4F4C-B7D6-418F98C0F9A8");
    PAN_REGIACQUVEND.set_Header(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, "Intestazione Registro");
    PAN_REGIACQUVEND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, "");
    PAN_REGIACQUVEND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, MyGlb.VIS_NORMALFIELDS);
    PAN_REGIACQUVEND.SetFlags(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_REGIACQUVEND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, "6562C735-0C59-4CE9-ACD7-89FCE786A23F");
    PAN_REGIACQUVEND.set_Header(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, "Numero Prima Pagina");
    PAN_REGIACQUVEND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, "");
    PAN_REGIACQUVEND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, MyGlb.VIS_NORMALFIELDS);
    PAN_REGIACQUVEND.SetFlags(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGIACQUVEND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, "FC0A5069-ADF9-4004-B814-E67C432BEB5D");
    PAN_REGIACQUVEND.set_Header(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, "Elabora");
    PAN_REGIACQUVEND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_REGIACQUVEND.SetImage(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, 0, "button1.gif", false);
    PAN_REGIACQUVEND.SetFlags(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_REGIACQUVEND_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, MyGlb.PANEL_LIST, 68);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, MyGlb.PANEL_LIST, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, MyGlb.PANEL_LIST, "Tipo Registo");
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, MyGlb.PANEL_FORM, 4, 4, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, MyGlb.PANEL_FORM, 128);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, MyGlb.PANEL_FORM, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOREGISTO, MyGlb.PANEL_FORM, "Tipo Registo");
    PAN_REGIACQUVEND.SetFieldPage(PFL_REGIACQUVEND_TIPOREGISTO, -1, -1);
    PAN_REGIACQUVEND.SetFieldPanel(PFL_REGIACQUVEND_TIPOREGISTO, PPQRY_PAR94, "A.ROWNAMTIPREG", "ROWNAMTIPREG", 1, 1, 0, -13997);
    PAN_REGIACQUVEND.SetValueListItem(PFL_REGIACQUVEND_TIPOREGISTO, (new IDVariant(1)), "1 - Acquisti", "", "", -1);
    PAN_REGIACQUVEND.SetValueListItem(PFL_REGIACQUVEND_TIPOREGISTO, (new IDVariant(2)), "2 - Acquisti in Attesa di Esigibilità", "", "", -1);
    PAN_REGIACQUVEND.SetValueListItem(PFL_REGIACQUVEND_TIPOREGISTO, (new IDVariant(3)), "3 - Vendite", "", "", -1);
    PAN_REGIACQUVEND.SetValueListItem(PFL_REGIACQUVEND_TIPOREGISTO, (new IDVariant(4)), "4 - Corrispettivi", "", "", -1);
    PAN_REGIACQUVEND.SetValueListItem(PFL_REGIACQUVEND_TIPOREGISTO, (new IDVariant(5)), "5 - Vendite Esigibili al Pagamento", "", "", -1);
    PAN_REGIACQUVEND.SetValueListItem(PFL_REGIACQUVEND_TIPOREGISTO, (new IDVariant(6)), "6 - Vendite Debitori non Codificati", "", "", -1);
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, MyGlb.PANEL_LIST, 184, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, MyGlb.PANEL_LIST, 64);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, MyGlb.PANEL_FORM, 128);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_REGIACQUVEND.SetFieldPage(PFL_REGIACQUVEND_TIPOBOLLATO, -1, -1);
    PAN_REGIACQUVEND.SetFieldPanel(PFL_REGIACQUVEND_TIPOBOLLATO, PPQRY_PAR94, "A.ROWNAMTIPBOL", "ROWNAMTIPBOL", 1, 2, 0, -13997);
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, MyGlb.PANEL_LIST, 224, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, MyGlb.PANEL_LIST, 36);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, MyGlb.PANEL_FORM, 128);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_REGIACQUVEND.SetFieldPage(PFL_REGIACQUVEND_ANNO, -1, -1);
    PAN_REGIACQUVEND.SetFieldPanel(PFL_REGIACQUVEND_ANNO, PPQRY_PAR94, "A.ROWNAMEANNO", "ROWNAMEANNO", 1, 4, 0, -13997);
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, MyGlb.PANEL_LIST, 264, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, MyGlb.PANEL_LIST, 48);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, MyGlb.PANEL_LIST, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, MyGlb.PANEL_LIST, "Data Da");
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, MyGlb.PANEL_FORM, 4, 76, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, MyGlb.PANEL_FORM, 128);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, MyGlb.PANEL_FORM, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATADA, MyGlb.PANEL_FORM, "Data Da");
    PAN_REGIACQUVEND.SetFieldPage(PFL_REGIACQUVEND_DATADA, -1, -1);
    PAN_REGIACQUVEND.SetFieldPanel(PFL_REGIACQUVEND_DATADA, PPQRY_PAR94, "A.ROWNAMEDATDA", "ROWNAMEDATDA", 6, 14, 0, -13997);
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, MyGlb.PANEL_LIST, 368, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, MyGlb.PANEL_LIST, 44);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, MyGlb.PANEL_LIST, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, MyGlb.PANEL_LIST, "Data A");
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, MyGlb.PANEL_FORM, 4, 100, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, MyGlb.PANEL_FORM, 128);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, MyGlb.PANEL_FORM, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_DATAA, MyGlb.PANEL_FORM, "Data A");
    PAN_REGIACQUVEND.SetFieldPage(PFL_REGIACQUVEND_DATAA, -1, -1);
    PAN_REGIACQUVEND.SetFieldPanel(PFL_REGIACQUVEND_DATAA, PPQRY_PAR94, "A.ROWNAMEDATAA", "ROWNAMEDATAA", 6, 14, 0, -13997);
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, MyGlb.PANEL_LIST, 472, 36, 112, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, MyGlb.PANEL_LIST, 112);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, MyGlb.PANEL_LIST, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, MyGlb.PANEL_LIST, "Intestazione Registro");
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, MyGlb.PANEL_FORM, 12, 12, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, MyGlb.PANEL_FORM, 136);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, MyGlb.PANEL_FORM, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_INTESTREGIST, MyGlb.PANEL_FORM, "Intestazione Registro");
    PAN_REGIACQUVEND.SetFieldPage(PFL_REGIACQUVEND_INTESTREGIST, -1, -1);
    PAN_REGIACQUVEND.SetFieldPanel(PFL_REGIACQUVEND_INTESTREGIST, PPQRY_PAR94, "A.ROWNAMINTREG", "ROWNAMINTREG", 5, 25, 0, -13997);
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 112);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, MyGlb.PANEL_LIST, "Nm. P. Pg.");
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 12, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 136);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 1);
    PAN_REGIACQUVEND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_NUMEPRIMPAGI, MyGlb.PANEL_FORM, "Numero Prima Pagina");
    PAN_REGIACQUVEND.SetFieldPage(PFL_REGIACQUVEND_NUMEPRIMPAGI, -1, -1);
    PAN_REGIACQUVEND.SetFieldPanel(PFL_REGIACQUVEND_NUMEPRIMPAGI, PPQRY_PAR94, "A.ROWNAMNUPRPA", "ROWNAMNUPRPA", 1, 5, 0, -13997);
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, MyGlb.PANEL_LIST, 228, 60, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_REGIACQUVEND.SetRect(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, MyGlb.PANEL_FORM, 276, 68, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGIACQUVEND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_REGIACQUVEND.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGIACQUVEND_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_REGIACQUVEND.SetFieldPage(PFL_REGIACQUVEND_ELABORA, -1, -1);
    PAN_REGIACQUVEND.SetFieldPanel(PFL_REGIACQUVEND_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_REGIACQUVEND_InitQueries()
  {
    StringBuffer SQL;

    PAN_REGIACQUVEND.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_REGIACQUVEND.SetIMDB(IMDB, "PQRY_PAR94", true);
    PAN_REGIACQUVEND.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_REGIACQUVEND.SetQueryIMDB(PPQRY_PAR94, IMDBDef10.PQRY_PAR94_RS, IMDBDef2.TBL_PAR68);
    JustLoaded = true;
    PAN_REGIACQUVEND.SetFieldPrimaryIndex(PFL_REGIACQUVEND_TIPOREGISTO, IMDBDef2.FLD_PAR68_ROWNAMTIPREG);
    PAN_REGIACQUVEND.SetFieldPrimaryIndex(PFL_REGIACQUVEND_TIPOBOLLATO, IMDBDef2.FLD_PAR68_ROWNAMTIPBOL);
    PAN_REGIACQUVEND.SetFieldPrimaryIndex(PFL_REGIACQUVEND_ANNO, IMDBDef2.FLD_PAR68_ROWNAMEANNO);
    PAN_REGIACQUVEND.SetFieldPrimaryIndex(PFL_REGIACQUVEND_DATADA, IMDBDef2.FLD_PAR68_ROWNAMEDATDA);
    PAN_REGIACQUVEND.SetFieldPrimaryIndex(PFL_REGIACQUVEND_DATAA, IMDBDef2.FLD_PAR68_ROWNAMEDATAA);
    PAN_REGIACQUVEND.SetFieldPrimaryIndex(PFL_REGIACQUVEND_INTESTREGIST, IMDBDef2.FLD_PAR68_ROWNAMINTREG);
    PAN_REGIACQUVEND.SetFieldPrimaryIndex(PFL_REGIACQUVEND_NUMEPRIMPAGI, IMDBDef2.FLD_PAR68_ROWNAMNUPRPA);
    PAN_REGIACQUVEND.SetMasterTable(0, "PAR68");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_REGIACQUVEND.Status() == 2)
    {
      int oldListQBE = PAN_REGIACQUVEND.iUseListQBE;
      PAN_REGIACQUVEND.iUseListQBE = 0;
      PAN_REGIACQUVEND.PanelCommand(Glb.PCM_SEARCH);
      PAN_REGIACQUVEND.PanelCommand(Glb.PCM_FIND);
      PAN_REGIACQUVEND.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_REGIACQUVEND) PAN_REGIACQUVEND_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_REGIACQUVEND) PAN_REGIACQUVEND_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_REGIACQUVEND) PAN_REGIACQUVEND_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_REGIACQUVEND) PAN_REGIACQUVEND_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_REGIACQUVEND) PAN_REGIACQUVEND_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
