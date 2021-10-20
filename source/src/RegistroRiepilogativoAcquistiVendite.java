// **********************************************
// Registro Riepilogativo Acquisti Vendite
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RegistroRiepilogativoAcquistiVendite extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_REGRIEACQVEN_TIPOREGISTRO = 0;

  private static int PFL_REGRIEACQVEN_TIPOREGISTRO = 0;
  private static int PFL_REGRIEACQVEN_ATTIVITA = 1;
  private static int PFL_REGRIEACQVEN_TIPOATTIVITA = 2;
  private static int PFL_REGRIEACQVEN_INTESTREGIST = 3;
  private static int PFL_REGRIEACQVEN_NUMEPRIMPAGI = 4;
  private static int PFL_REGRIEACQVEN_ELABORA = 5;

  private static int PPQRY_REGRIEACQVE2 = 0;

  private static int PPQRY_T04 = 1;


  IDPanel PAN_REGRIEACQVEN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_REGRIEACQVE3(IMDB);
    //
    //
    Init_PQRY_REGRIEACQVE2(IMDB);
    Init_PQRY_REGRIEACQVE2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_REGRIEACQVE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_REGRIEACQVE3, 11);
    IMDB.set_TblCode(IMDBDef2.TBL_REGRIEACQVE3, "TBL_REGRIEACQVE3");
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPRE1, "ROWNAMTIPRE1");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPRE1,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEATTIV, "ROWNAMEATTIV");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEATTIV,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPATT, "ROWNAMTIPATT");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPATT,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMINTREG,5,25,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMNUPRPA,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMELENGH, "ROWNAMELENGH");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMELENGH,1,25,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_REGRIEACQVE3,IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEANNO,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_REGRIEACQVE3, 0);
  }

  private static void Init_PQRY_REGRIEACQVE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_REGRIEACQVE2, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_REGRIEACQVE2, "PQRY_REGRIEACQVE2");
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPRE1, "ROWNAMTIPRE1");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPRE1,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMEATTIV, "ROWNAMEATTIV");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMEATTIV,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPATT, "ROWNAMTIPATT");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPATT,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMINTREG,5,25,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMNUPRPA,1,5,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_REGRIEACQVE2, 0);
  }

  private static void Init_PQRY_REGRIEACQVE2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_REGRIEACQVE2_RS, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_REGRIEACQVE2_RS, "PQRY_REGRIEACQVE2_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPRE1, "ROWNAMTIPRE1");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPRE1,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMEATTIV, "ROWNAMEATTIV");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMEATTIV,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPATT, "ROWNAMTIPATT");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPATT,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMINTREG,5,25,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_REGRIEACQVE2_RS,IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMNUPRPA,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RegistroRiepilogativoAcquistiVendite(MyWebEntryPoint w, IMDBObj imdb)
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
  public RegistroRiepilogativoAcquistiVendite()
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
    FormIdx = MyGlb.FRM_REGRIEACQVEN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0BD4E017-82B8-40B2-B5DB-5D3FDBAD07A0";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 476;
    DesignHeight = 266;
    set_Caption(new IDVariant("Registro Riepilogativo Acquisti Vendite"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 476;
    Frames[1].Height = 240;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Registro Riepilogativo Acquisti Vendite";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 240;
    PAN_REGRIEACQVEN = new IDPanel(w, this, 1, "PAN_REGRIEACQVEN");
    Frames[1].Content = PAN_REGRIEACQVEN;
    PAN_REGRIEACQVEN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_REGRIEACQVEN.VS = MainFrm.VisualStyleList;
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 476-MyGlb.PAN_OFFS_X, 240-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_REGRIEACQVEN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ADD313FF-4EA3-4159-A556-6A1A56BF592A");
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 536, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_REGRIEACQVEN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_REGRIEACQVEN.InitStatus = 2;
    PAN_REGRIEACQVEN_Init();
    PAN_REGRIEACQVEN_InitFields();
    PAN_REGRIEACQVEN_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_REGRIEACQVE3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        REGRIEACQVEN_REGRIEACQVE2();
      }
      PAN_REGRIEACQVEN.UpdatePanel(MainFrm);
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
    return (obj instanceof RegistroRiepilogativoAcquistiVendite);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RegistroRiepilogativoAcquistiVendite.class.getName() : (Glb.ClassWithPackage(RegistroRiepilogativoAcquistiVendite.class) ? RegistroRiepilogativoAcquistiVendite.class.getName().substring(RegistroRiepilogativoAcquistiVendite.class.getPackage().getName().length() + 1) : RegistroRiepilogativoAcquistiVendite.class.getName()));
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
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMINTREG, 0)))
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Valore obbligatorio per l'Intestazione Registro", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG); 
      }
      else
      {
        IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_INDIRIZZO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NOME = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CITTA = new IDVariant(0,IDVariant.STRING);
        IDVariant v_PARTITAIVA = new IDVariant(0,IDVariant.STRING);
        IDVariant v_PAR = new IDVariant(0,IDVariant.STRING);
        v_PAR = (new IDVariant("Partita I.V.A.: ", IDVariant.STRING));
        if (IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPRE1, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPRE1, 0).equals((new IDVariant(0)), true))
        {
          IDVariant v_ERROR = new IDVariant(0,IDVariant.STRING);
          v_ERROR = (new IDVariant("Per il periodo di elaborazione sono presenti documenti nel Registro Debitori non Codificati che non sono ancora stati Contabilizzati: il Registro Riepilogativo non può essere stampato.", IDVariant.STRING));
          IDVariant v_CHECK = new IDVariant(0,IDVariant.INTEGER);
          v_CHECK = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select distinct ");
          SQL.append("  1 as C1 ");
          SQL.append("from ");
          SQL.append("  FATPRI A, ");
          SQL.append("  T04 B ");
          SQL.append("where ((A.ANNO_PROG IS NULL)) ");
          SQL.append("and   ((A.DATA_DOC BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATDA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATAA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (A.TIPO_REGISTRO = B.TIPO_REGISTRO(+)) ");
          SQL.append("and   (A.TIPO_BOLLATO = B.TIPO_BOLLATO(+)) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CHECK = QV.Get("C1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CHECK.equals((new IDVariant(1)), true))
          {
            MainFrm.set_AlertMessage(v_ERROR); 
            return 0;
          }
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
        SQL.append("from ");
        SQL.append("  T04 A ");
        SQL.append("where (A.TIPO_REGISTRO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPREG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPBOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("T04DESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
        v_NOME = IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DENOMINAZIONE, 0);
        v_INDIRIZZO = IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_INDIRIZZO, 0);
        v_CITTA = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_CAP, 0)), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0))), (new IDVariant(" "))), IDL.ToString(((IDL.IsNull(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)))?(new IDVariant(" ")):IDL.Add(IDL.Add((new IDVariant("(")), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)), (new IDVariant(")"))))));
        v_PARTITAIVA = ((IDL.IsNull(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PARTITA_IVA, 0)))?(new IDVariant("")):IDL.Add(v_PAR, IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PARTITA_IVA, 0)), (new IDVariant(11)), IDL.ToString((new IDVariant(0))), true)));
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Registro_riep_acqv"));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_REGISTRO")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPRE1, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEANNO, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_DA")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATDA, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_A")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATAA, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ATTIVITA")), ((IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMEATTIV, 0).equals((new IDVariant(-1))))?(new IDVariant("0")):IDL.ToString(IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMEATTIV, 0))));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DENOMINAZIONE")), v_NOME);
        MainFrm.SetParametroStampaJasper((new IDVariant("P_INDIRIZZO")), v_INDIRIZZO);
        MainFrm.SetParametroStampaJasper((new IDVariant("P_CITTA")), v_CITTA);
        MainFrm.SetParametroStampaJasper((new IDVariant("P_PARTITA")), v_PARTITAIVA);
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DES_BOLLO")), IDL.Replace(v_DESCRIZIONE, (new IDVariant("%")), (new IDVariant("%25"))));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TITOLO")), IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMINTREG, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NUM_PAGINA")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMNUPRPA, 0),(new IDVariant(0)))));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPOA")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMTIPATT, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NMESE_DA")), MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATDA, 0))));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NMESE_A")), MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEDATAA, 0))));
        MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RegistroRiepilogativoAcquistiVendite", "Elabora", _e);
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
    IDVariant A = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LEN = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAPT = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      A = (new IDVariant("REGISTRO REPILOGATIVO REGISTRI I.V.A.", IDVariant.STRING));
      v_CAPT = (new IDVariant("Registro Riepilogativo Acquisti/Vendite", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPT));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPRE1, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEATTIV, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPATT, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMINTREG, 0, new IDVariant(A));
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMNUPRPA, 0, (new IDVariant()));
      v_LEN = IDL.Length(A);
      IMDB.set_Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMELENGH, 0, new IDVariant(v_LEN));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RegistroRiepilogativoAcquistiVendite", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Registro Riepilogativo Acquisti Vendite On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_REGRIEACQVEN_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registro Riepilogativo Acquisti Vendite On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_REGRIEACQVEN_INTESTREGIST)), true) && FieldModified.equals((new IDVariant(-1)), true))
      {
        if (IDL.Length(IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMINTREG, 0)).compareTo(IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMELENGH, 0), true)>0)
        {
          IMDB.set_Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMINTREG, 0, IDL.Left(IMDB.Value(IMDBDef10.PQRY_REGRIEACQVE2, IMDBDef10.PQSL_REGRIEACQVE2_ROWNAMINTREG, 0), IMDB.Value(IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMELENGH, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RegistroRiepilogativoAcquistiVendite", "RegistroRiepilogativoAcquistiVenditeOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Registro Riepilogativo Acquisti Vendite
  // Primary record source for panel data
  // **********************************************************************
  private void REGRIEACQVEN_REGRIEACQVE2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_REGRIEACQVE2_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_REGRIEACQVE3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_REGRIEACQVE3, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_REGRIEACQVE2_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_REGRIEACQVE2_RS, 0, IMDBDef2.TBL_REGRIEACQVE3, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_REGRIEACQVE2_RS, 0, 0, IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPRE1, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_REGRIEACQVE2_RS, 1, 0, IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEATTIV, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_REGRIEACQVE2_RS, 2, 0, IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPATT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_REGRIEACQVE2_RS, 3, 0, IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMINTREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_REGRIEACQVE2_RS, 4, 0, IMDBDef2.TBL_REGRIEACQVE3, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMNUPRPA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_REGRIEACQVE3, 0);
      if (IMDB.Eof(IMDBDef2.TBL_REGRIEACQVE3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_REGRIEACQVE3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_REGRIEACQVE2_RS, 0);
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
  private void PAN_REGRIEACQVEN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_REGRIEACQVEN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_REGRIEACQVEN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_REGRIEACQVEN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_REGRIEACQVEN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_REGRIEACQVEN);
    // Stub
  }

  private void PAN_REGRIEACQVEN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_REGRIEACQVEN_ELABORA)
    {
      this.IdxPanelActived = this.PAN_REGRIEACQVEN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_REGRIEACQVEN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_REGRIEACQVEN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_REGRIEACQVEN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_REGRIEACQVEN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_REGRIEACQVEN_Init()
  {

    PAN_REGRIEACQVEN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_REGRIEACQVEN.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_REGRIEACQVEN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, "BA8FA9A1-3C02-4589-B56A-03B9540C651D");
    PAN_REGRIEACQVEN.set_Header(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, "Tipo Registro");
    PAN_REGRIEACQVEN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, "");
    PAN_REGRIEACQVEN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, MyGlb.VIS_GROUPSTYLE);
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 7, 220, 49, 0, 0);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, 0, 75);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, 1, 13);
    PAN_REGRIEACQVEN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, 0, 4);
    PAN_REGRIEACQVEN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, 1, 4);
    PAN_REGRIEACQVEN.SetFlags(MyGlb.OBJ_GROUP, GRP_REGRIEACQVEN_TIPOREGISTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_REGRIEACQVEN.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_REGRIEACQVEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, "D48662A8-1B59-4692-9BB4-4B2D33040159");
    PAN_REGRIEACQVEN.set_Header(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, "Tipo Registro");
    PAN_REGRIEACQVEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, "");
    PAN_REGRIEACQVEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_REGRIEACQVEN.SetFlags(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGRIEACQVEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, "3A490D49-13B9-4459-914E-3B8F826305DC");
    PAN_REGRIEACQVEN.set_Header(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, "Attività");
    PAN_REGRIEACQVEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, "");
    PAN_REGRIEACQVEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, MyGlb.VIS_NORMALFIELDS);
    PAN_REGRIEACQVEN.SetFlags(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_REGRIEACQVEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, "5D0E87D2-A1A6-4544-84DD-0D47662CC2AD");
    PAN_REGRIEACQVEN.set_Header(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, "Tipo Attività");
    PAN_REGRIEACQVEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, "");
    PAN_REGRIEACQVEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, MyGlb.VIS_NORMALFIELDS);
    PAN_REGRIEACQVEN.SetFlags(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGRIEACQVEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, "B2889B03-E970-4FEA-A5ED-3F36A97D9830");
    PAN_REGRIEACQVEN.set_Header(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, "Intestazione Registro");
    PAN_REGRIEACQVEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, "");
    PAN_REGRIEACQVEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, MyGlb.VIS_NORMALFIELDS);
    PAN_REGRIEACQVEN.SetFlags(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGRIEACQVEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, "0A5778A3-1BC3-4347-87A6-D824640CEFDC");
    PAN_REGRIEACQVEN.set_Header(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, "Numero Prima Pagina");
    PAN_REGRIEACQVEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, "");
    PAN_REGRIEACQVEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, MyGlb.VIS_NORMALFIELDS);
    PAN_REGRIEACQVEN.SetFlags(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGRIEACQVEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, "659D4503-BF24-4031-BCE3-0FD3AE562E50");
    PAN_REGRIEACQVEN.set_Header(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, "Elabora");
    PAN_REGRIEACQVEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_REGRIEACQVEN.SetImage(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, 0, "button1.gif", false);
    PAN_REGRIEACQVEN.SetFlags(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_REGRIEACQVEN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_LIST, 72);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tipo Registro");
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_FORM, 8, 32, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_FORM, 128);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_REGRIEACQVEN.SetFieldPage(PFL_REGRIEACQVEN_TIPOREGISTRO, -1, GRP_REGRIEACQVEN_TIPOREGISTRO);
    PAN_REGRIEACQVEN.SetFieldPanel(PFL_REGRIEACQVEN_TIPOREGISTRO, PPQRY_REGRIEACQVE2, "A.ROWNAMTIPRE1", "ROWNAMTIPRE1", 1, 1, 0, -13997);
    PAN_REGRIEACQVEN.SetValueListItem(PFL_REGRIEACQVEN_TIPOREGISTRO, (new IDVariant(1)), "Acquisti", "", "", -1);
    PAN_REGRIEACQVEN.SetValueListItem(PFL_REGRIEACQVEN_TIPOREGISTRO, (new IDVariant(3)), "Vendite", "", "", -1);
    PAN_REGRIEACQVEN.SetValueListItem(PFL_REGRIEACQVEN_TIPOREGISTRO, (new IDVariant(0)), "Entrambi", "", "", -1);
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, MyGlb.PANEL_LIST, 112, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, MyGlb.PANEL_LIST, 44);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, MyGlb.PANEL_LIST, "Attività");
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, MyGlb.PANEL_FORM, 72, 64, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, MyGlb.PANEL_FORM, 80);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, MyGlb.PANEL_FORM, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ATTIVITA, MyGlb.PANEL_FORM, "Attività");
    PAN_REGRIEACQVEN.SetFieldPage(PFL_REGRIEACQVEN_ATTIVITA, -1, -1);
    PAN_REGRIEACQVEN.SetFieldPanel(PFL_REGRIEACQVEN_ATTIVITA, PPQRY_REGRIEACQVE2, "A.ROWNAMEATTIV", "ROWNAMEATTIV", 1, 2, 0, -13997);
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, MyGlb.PANEL_LIST, 184, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, MyGlb.PANEL_LIST, 68);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, MyGlb.PANEL_LIST, "Tipo Attività");
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, MyGlb.PANEL_FORM, 48, 88, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, MyGlb.PANEL_FORM, 104);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, MyGlb.PANEL_FORM, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_TIPOATTIVITA, MyGlb.PANEL_FORM, "Tipo Attività");
    PAN_REGRIEACQVEN.SetFieldPage(PFL_REGRIEACQVEN_TIPOATTIVITA, -1, -1);
    PAN_REGRIEACQVEN.SetFieldPanel(PFL_REGRIEACQVEN_TIPOATTIVITA, PPQRY_REGRIEACQVE2, "A.ROWNAMTIPATT", "ROWNAMTIPATT", 1, 1, 0, -13997);
    PAN_REGRIEACQVEN.SetValueListItem(PFL_REGRIEACQVEN_TIPOATTIVITA, (new IDVariant(1)), "Tutte", "", "", -1);
    PAN_REGRIEACQVEN.SetValueListItem(PFL_REGRIEACQVEN_TIPOATTIVITA, (new IDVariant(2)), "Mensili", "", "", -1);
    PAN_REGRIEACQVEN.SetValueListItem(PFL_REGRIEACQVEN_TIPOATTIVITA, (new IDVariant(3)), "Trimestrali", "", "", -1);
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, MyGlb.PANEL_LIST, 296, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, MyGlb.PANEL_LIST, 112);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, MyGlb.PANEL_LIST, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, MyGlb.PANEL_LIST, "Intestazione Registro");
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, MyGlb.PANEL_FORM, 4, 112, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, MyGlb.PANEL_FORM, 148);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, MyGlb.PANEL_FORM, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_INTESTREGIST, MyGlb.PANEL_FORM, "Intestazione Registro");
    PAN_REGRIEACQVEN.SetFieldPage(PFL_REGRIEACQVEN_INTESTREGIST, -1, -1);
    PAN_REGRIEACQVEN.SetFieldPanel(PFL_REGRIEACQVEN_INTESTREGIST, PPQRY_REGRIEACQVE2, "A.ROWNAMINTREG", "ROWNAMINTREG", 5, 25, 0, -13997);
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 496, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 112);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, MyGlb.PANEL_LIST, "Nm. P. Pg.");
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 4, 136, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 148);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 1);
    PAN_REGRIEACQVEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_NUMEPRIMPAGI, MyGlb.PANEL_FORM, "Numero Prima Pagina");
    PAN_REGRIEACQVEN.SetFieldPage(PFL_REGRIEACQVEN_NUMEPRIMPAGI, -1, -1);
    PAN_REGRIEACQVEN.SetFieldPanel(PFL_REGRIEACQVEN_NUMEPRIMPAGI, PPQRY_REGRIEACQVE2, "A.ROWNAMNUPRPA", "ROWNAMNUPRPA", 1, 5, 0, -13997);
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, MyGlb.PANEL_LIST, 284, 168, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_REGRIEACQVEN.SetRect(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, MyGlb.PANEL_FORM, 364, 164, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGRIEACQVEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_REGRIEACQVEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGRIEACQVEN_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_REGRIEACQVEN.SetFieldPage(PFL_REGRIEACQVEN_ELABORA, -1, -1);
    PAN_REGRIEACQVEN.SetFieldPanel(PFL_REGRIEACQVEN_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_REGRIEACQVEN_InitQueries()
  {
    StringBuffer SQL;

    PAN_REGRIEACQVEN.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ATTIVITA as T04ATTIVITA, ");
    SQL.append("  TO_CHAR ( A.ATTIVITA ) || ' - ' || B.DESCRIZIONE as T04NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T04 A, ");
    SQL.append("  T09 B ");
    SQL.append("where (A.ATTIVITA = ~~ROWNAMEATTIV~~) ");
    SQL.append("and   (A.ATTIVITA = B.CODICE) ");
    SQL.append("and   (NOT ((A.ATTIVITA IS NULL))) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where (~~ROWNAMEATTIV~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_REGRIEACQVEN.SetQuery(PPQRY_T04, 0, SQL, PFL_REGRIEACQVEN_ATTIVITA, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ATTIVITA as T04ATTIVITA, ");
    SQL.append("  TO_CHAR ( A.ATTIVITA ) || ' - ' || B.DESCRIZIONE as T04NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T04 A, ");
    SQL.append("  T09 B ");
    SQL.append("where (A.ATTIVITA = B.CODICE) ");
    SQL.append("and   (NOT ((A.ATTIVITA IS NULL))) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("order by 1 ");
    PAN_REGRIEACQVEN.SetQuery(PPQRY_T04, 1, SQL, PFL_REGRIEACQVEN_ATTIVITA, "");
    PAN_REGRIEACQVEN.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_REGRIEACQVEN.SetIMDB(IMDB, "PQRY_REGRIEACQVE2", true);
    PAN_REGRIEACQVEN.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_REGRIEACQVEN.SetQueryIMDB(PPQRY_REGRIEACQVE2, IMDBDef10.PQRY_REGRIEACQVE2_RS, IMDBDef2.TBL_REGRIEACQVE3);
    JustLoaded = true;
    PAN_REGRIEACQVEN.SetFieldPrimaryIndex(PFL_REGRIEACQVEN_TIPOREGISTRO, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPRE1);
    PAN_REGRIEACQVEN.SetFieldPrimaryIndex(PFL_REGRIEACQVEN_ATTIVITA, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMEATTIV);
    PAN_REGRIEACQVEN.SetFieldPrimaryIndex(PFL_REGRIEACQVEN_TIPOATTIVITA, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMTIPATT);
    PAN_REGRIEACQVEN.SetFieldPrimaryIndex(PFL_REGRIEACQVEN_INTESTREGIST, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMINTREG);
    PAN_REGRIEACQVEN.SetFieldPrimaryIndex(PFL_REGRIEACQVEN_NUMEPRIMPAGI, IMDBDef2.FLD_REGRIEACQVE3_ROWNAMNUPRPA);
    PAN_REGRIEACQVEN.SetMasterTable(0, "REGRIEACQVE3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_REGRIEACQVEN.Status() == 2)
    {
      int oldListQBE = PAN_REGRIEACQVEN.iUseListQBE;
      PAN_REGRIEACQVEN.iUseListQBE = 0;
      PAN_REGRIEACQVEN.PanelCommand(Glb.PCM_SEARCH);
      PAN_REGRIEACQVEN.PanelCommand(Glb.PCM_FIND);
      PAN_REGRIEACQVEN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_REGRIEACQVEN) PAN_REGRIEACQVEN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_REGRIEACQVEN) PAN_REGRIEACQVEN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_REGRIEACQVEN) PAN_REGRIEACQVEN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_REGRIEACQVEN) PAN_REGRIEACQVEN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_REGRIEACQVEN) PAN_REGRIEACQVEN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
