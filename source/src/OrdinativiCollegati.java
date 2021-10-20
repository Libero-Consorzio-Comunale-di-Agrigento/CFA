// **********************************************
// Ordinativi Collegati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiCollegati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ORDINACOLLEG_ORDINATIVO = 0;
  private static int GRP_ORDINACOLLEG_ACCERTAMENTO = 1;

  private static int PFL_ORDINACOLLEG_NUMEROORD = 0;
  private static int PFL_ORDINACOLLEG_ANNOORD = 1;
  private static int PFL_ORDINACOLLEG_DDATAORD = 2;
  private static int PFL_ORDINACOLLEG_INFOORD = 3;
  private static int PFL_ORDINACOLLEG_IMPORTO = 4;
  private static int PFL_ORDINACOLLEG_INCASSATO = 5;
  private static int PFL_ORDINACOLLEG_ANNOMAND = 6;
  private static int PFL_ORDINACOLLEG_MOTIVO = 7;
  private static int PFL_ORDINACOLLEG_NUMEROACC = 8;
  private static int PFL_ORDINACOLLEG_ANNOACC = 9;
  private static int PFL_ORDINACOLLEG_INFOACC = 10;
  private static int PFL_ORDINACOLLEG_NUMEROMAND = 11;
  private static int PFL_ORDINACOLLEG_UFFICIO = 12;
  private static int PFL_ORDINACOLLEG_TIPOVINCOLO = 13;
  private static int PFL_ORDINACOLLEG_ETIMAN12DEL3 = 14;
  private static int PFL_ORDINACOLLEG_ET = 15;

  private static int PPQRY_VISMANORDCOL = 0;

  private static int PPQRY_T53 = 1;
  private static int PPQRY_VINCOLI = 2;


  IDPanel PAN_ORDINACOLLEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS(IMDB);
    //
    //
    Init_PQRY_VISMANORDCOL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARS, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARS, "TBL_PARS");
    IMDB.set_FldCode(IMDBDef5.TBL_PARS,IMDBDef5.FLD_PARS_NOMOGGPANNMA, "NOMOGGPANNMA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS,IMDBDef5.FLD_PARS_NOMOGGPANNMA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS,IMDBDef5.FLD_PARS_NOMOGGPNUMMA, "NOMOGGPNUMMA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS,IMDBDef5.FLD_PARS_NOMOGGPNUMMA,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARS, 0);
  }

  private static void Init_PQRY_VISMANORDCOL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_VISMANORDCOL, 14);
    IMDB.set_TblCode(IMDBDef15.PQRY_VISMANORDCOL, "PQRY_VISMANORDCOL");
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOANOR, "VIMAORCOANOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOANOR,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCONUOR, "VIMAORCONUOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCONUOR,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_INFOORD, "INFOORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_INFOORD,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCODDAO, "VIMAORCODDAO");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCODDAO,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOANMA, "VIMAORCOANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCONUMA, "VIMAORCONUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCONUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOANAC, "VIMAORCOANAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOANAC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCONUAC, "VIMAORCONUAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCONUAC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_INFOACC, "INFOACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_INFOACC,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VISMANORCOUF, "VISMANORCOUF");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VISMANORCOUF,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOTIVI, "VIMAORCOTIVI");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOTIVI,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VISMANORCOIM, "VISMANORCOIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VISMANORCOIM,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VISMANORCOIN, "VISMANORCOIN");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VISMANORCOIN,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VISMANORCOMO, "VISMANORCOMO");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISMANORDCOL,IMDBDef15.PQSL_VISMANORDCOL_VISMANORCOMO,5,28,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_VISMANORDCOL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiCollegati(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiCollegati()
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
    FormIdx = MyGlb.FRM_ORDINACOLLEG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7A4E1DCF-3E1F-4FC8-B5E5-1DD0E4FB2288";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1140;
    DesignHeight = 378;
    set_Caption(new IDVariant("Ordinativi Collegati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1140;
    Frames[1].Height = 352;
    Frames[1].Caption = "Ordinativi Collegati";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_ORDINACOLLEG = new IDPanel(w, this, 1, "PAN_ORDINACOLLEG");
    Frames[1].Content = PAN_ORDINACOLLEG;
    PAN_ORDINACOLLEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINACOLLEG.VS = MainFrm.VisualStyleList;
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1140-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "17ED6D3A-3278-4A76-B7D5-B6E4D710B219");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 44, 1068, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINACOLLEG.InitStatus = 1;
    PAN_ORDINACOLLEG_Init();
    PAN_ORDINACOLLEG_InitFields();
    PAN_ORDINACOLLEG_InitQueries();
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
      PAN_ORDINACOLLEG.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdinativiCollegati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiCollegati.class.getName() : (Glb.ClassWithPackage(OrdinativiCollegati.class) ? OrdinativiCollegati.class.getName().substring(OrdinativiCollegati.class.getPackage().getName().length() + 1) : OrdinativiCollegati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiCollegati", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARS, IMDBDef5.FLD_PARS_NOMOGGPANNMA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS, IMDBDef5.FLD_PARS_NOMOGGPNUMMA, 0, new IDVariant());
  }

  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      IDVariant v_VMANDDATAMAN = new IDVariant(0,IDVariant.DATETIME);
      IDVariant v_VMANIMPORTO = new IDVariant(0,IDVariant.DECIMAL);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.D_DATA_MAND as MANDDATAMAND, ");
      SQL.append("  A.IMPORTO as MANIMPORTO ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS, IMDBDef5.FLD_PARS_NOMOGGPANNMA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS, IMDBDef5.FLD_PARS_NOMOGGPNUMMA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VMANDDATAMAN = QV.Get("MANDDATAMAND", IDVariant.DATETIME) ;
        v_VMANIMPORTO = QV.Get("MANIMPORTO", IDVariant.DECIMAL) ;
      }
      QV.Close();
      PAN_ORDINACOLLEG.set_FieldText(PFL_ORDINACOLLEG_ETIMAN12DEL3, IDL.FormatMessage((new IDVariant(PAN_ORDINACOLLEG.FieldText(PFL_ORDINACOLLEG_ETIMAN12DEL3))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARS, IMDBDef5.FLD_PARS_NOMOGGPNUMMA, 0)), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARS, IMDBDef5.FLD_PARS_NOMOGGPANNMA, 0)), MainFrm.Datetostring(v_VMANDDATAMAN)).stringValue());
      PAN_ORDINACOLLEG.set_FieldText(PFL_ORDINACOLLEG_ET, IDL.FormatMessage((new IDVariant(PAN_ORDINACOLLEG.FieldText(PFL_ORDINACOLLEG_ET))), IDL.Format(v_VMANIMPORTO, (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiCollegati", "Load", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Collegati On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINACOLLEG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINACOLLEG);
      // 
      // Ordinativi Collegati On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ORDINACOLLEG.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINACOLLEG_TIPOVINCOLO,(new IDVariant(PAN_ORDINACOLLEG.FieldText(PFL_ORDINACOLLEG_TIPOVINCOLO))).stringValue()); 
      PAN_ORDINACOLLEG.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINACOLLEG_UFFICIO,(new IDVariant(PAN_ORDINACOLLEG.FieldText(PFL_ORDINACOLLEG_UFFICIO))).stringValue()); 
      PAN_ORDINACOLLEG.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINACOLLEG_MOTIVO,(new IDVariant(PAN_ORDINACOLLEG.FieldText(PFL_ORDINACOLLEG_MOTIVO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiCollegati", "OrdinativiCollegatiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Info Ord
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoOrd ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Ord Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD, 0, IMDB.Value(IMDBDef15.PQRY_VISMANORDCOL, IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOANOR, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD, 0, IMDB.Value(IMDBDef15.PQRY_VISMANORDCOL, IMDBDef15.PQSL_VISMANORDCOL_VIMAORCONUOR, 0));
      MainFrm.Show(MyGlb.FRM_INFOORDINATI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiCollegati", "InfoOrd", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Acc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef15.PQRY_VISMANORDCOL, IMDBDef15.PQSL_VISMANORDCOL_VIMAORCONUAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef15.PQRY_VISMANORDCOL, IMDBDef15.PQSL_VISMANORDCOL_VIMAORCOANAC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiCollegati", "InfoAcc", _e);
      return -1;
    }
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
  private void PAN_ORDINACOLLEG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINACOLLEG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINACOLLEG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINACOLLEG, Cancel);
    // Stub
  }

  private void PAN_ORDINACOLLEG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINACOLLEG_INFOORD)
    {
      this.IdxPanelActived = this.PAN_ORDINACOLLEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOrd();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINACOLLEG_INFOACC)
    {
      this.IdxPanelActived = this.PAN_ORDINACOLLEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINACOLLEG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINACOLLEG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINACOLLEG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINACOLLEG_Init()
  {

    PAN_ORDINACOLLEG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINACOLLEG.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, "47F186FB-F12C-4F9C-99DF-9277AE77B815");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, "Ordinativo");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, MyGlb.PANEL_LIST, 0, -9999, 176, 16, 0, 0);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, MyGlb.PANEL_FORM, 0, -21, 572, 337, 0, 0);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, 0, 59);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, 1, 13);
    PAN_ORDINACOLLEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, 0, 4);
    PAN_ORDINACOLLEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, 1, 4);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, "DD4D7FE5-B45F-479A-B4B4-DA4697161EC7");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, "Accertamento");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, MyGlb.PANEL_LIST, 632, -9999, 116, 16, 0, 0);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, MyGlb.PANEL_FORM, 0, 99, 572, 241, 0, 0);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, 0, 81);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, 1, 13);
    PAN_ORDINACOLLEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, 0, 4);
    PAN_ORDINACOLLEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, 1, 4);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINACOLLEG_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINACOLLEG.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, "0FBCE12F-74B3-48B5-A599-1F7E5A2208C8");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, "Numero");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, "2EF2C0D1-BFEC-4A8F-99CD-DA2C015910E5");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, "Anno");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, "Anno Ord.");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, "31BEFBA4-0460-4C21-AD6B-9B5007D9192B");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, "Data");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, "88C1E015-B728-46FD-9369-9AAD30750CF6");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, " ");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, "EAC177AC-2CF0-4E8D-88B7-783E39490371");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, "Importo");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, "3903413F-63A8-4715-8603-BB7E43EEA214");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, "Incassato");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, "470437AF-36C8-4980-B0D2-96BAE560CE79");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, "Anno Mand");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, "0CEA2CF7-D28E-497C-B070-322625DDB016");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, "Motivo Collegamento");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, "3A2B7E96-EB46-4603-8186-D3A1AC2484D2");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, "Numero");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, "Numero Acc.");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, "CB804A0D-4CCA-4AE4-9B87-4EE015592803");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, "Anno");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, "Anno Acc.");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, "B447A935-1AE9-4A83-8D48-F39811088FC4");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, " ");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, "1FAD5C1F-088F-43ED-AA0B-573403638D06");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, "Numero Mand.");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, "D5AA42BF-29A3-43B8-8654-AA8DFC0C201A");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, "Ufficio");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, "E593E78A-7542-4EBE-83F3-A385A9CEA9AA");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, "Tipo Vincolo");
    PAN_ORDINACOLLEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, "");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, "FC8712AA-4FBE-40C1-B964-B9D4256B73AE");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, "Mandato |1/|2 del |3");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, MyGlb.VIS_ETICHEGRASSE);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINACOLLEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, "C7AA3A72-D719-42A0-9E82-0836684C0408");
    PAN_ORDINACOLLEG.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, "Importo: |1");
    PAN_ORDINACOLLEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, MyGlb.VIS_ETICGRASIMPO);
    PAN_ORDINACOLLEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ORDINACOLLEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, MyGlb.PANEL_LIST, 0, 80, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, MyGlb.PANEL_LIST, 84);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, MyGlb.PANEL_LIST, "Numero");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROORD, MyGlb.PANEL_FORM, "Numero");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_NUMEROORD, -1, GRP_ORDINACOLLEG_ORDINATIVO);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_NUMEROORD, PPQRY_VISMANORDCOL, "A.NUMERO_ORD", "VIMAORCONUOR", 1, 5, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, MyGlb.PANEL_LIST, 56, 80, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, MyGlb.PANEL_LIST, 68);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, MyGlb.PANEL_LIST, "Anno");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOORD, MyGlb.PANEL_FORM, "Anno");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_ANNOORD, -1, GRP_ORDINACOLLEG_ORDINATIVO);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_ANNOORD, PPQRY_VISMANORDCOL, "A.ANNO_ORD", "VIMAORCOANOR", 1, 4, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, MyGlb.PANEL_LIST, 96, 80, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, MyGlb.PANEL_LIST, 80);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, MyGlb.PANEL_LIST, "Data");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, MyGlb.PANEL_FORM, 4, 52, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_DDATAORD, MyGlb.PANEL_FORM, "Data");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_DDATAORD, -1, GRP_ORDINACOLLEG_ORDINATIVO);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_DDATAORD, PPQRY_VISMANORDCOL, "A.D_DATA_ORD", "VIMAORCODDAO", 6, 10, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, MyGlb.PANEL_LIST, 156, 80, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, MyGlb.PANEL_LIST, 56);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, MyGlb.PANEL_LIST, " ");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, MyGlb.PANEL_FORM, 4, 292, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, MyGlb.PANEL_FORM, 56);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOORD, MyGlb.PANEL_FORM, " ");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_INFOORD, -1, GRP_ORDINACOLLEG_ORDINATIVO);
    PAN_ORDINACOLLEG.SetFieldUnbound(PFL_ORDINACOLLEG_INFOORD, true);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_INFOORD, PPQRY_VISMANORDCOL, "DECODE(A.NUMERO_ORD, to_number(NULL), NULL, 'I')", "INFOORD", 5, 99, 0, -13997);
    PAN_ORDINACOLLEG.SetValueListItem(PFL_ORDINACOLLEG_INFOORD, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINACOLLEG.SetValueListItem(PFL_ORDINACOLLEG_INFOORD, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINACOLLEG.SetValueListItem(PFL_ORDINACOLLEG_INFOORD, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, MyGlb.PANEL_LIST, 176, 80, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, MyGlb.PANEL_FORM, 4, 220, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_IMPORTO, -1, -1);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_IMPORTO, PPQRY_VISMANORDCOL, "A.IMPORTO", "VISMANORCOIM", 3, 14, 2, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, MyGlb.PANEL_LIST, 320, 80, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, MyGlb.PANEL_LIST, 72);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, MyGlb.PANEL_LIST, "Incassato");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, MyGlb.PANEL_FORM, 4, 244, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INCASSATO, MyGlb.PANEL_FORM, "Incassato");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_INCASSATO, -1, -1);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_INCASSATO, PPQRY_VISMANORDCOL, "A.INCASSATO", "VISMANORCOIN", 3, 14, 2, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, MyGlb.PANEL_LIST, 116, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, MyGlb.PANEL_LIST, 76);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, MyGlb.PANEL_LIST, "Anno Mand");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, MyGlb.PANEL_FORM, 4, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOMAND, MyGlb.PANEL_FORM, "Anno Mand");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_ANNOMAND, -1, -1);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_ANNOMAND, PPQRY_VISMANORDCOL, "A.ANNO_MAND", "VIMAORCOANMA", 1, 4, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, MyGlb.PANEL_LIST, 464, 80, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, MyGlb.PANEL_LIST, 56);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, MyGlb.PANEL_LIST, "Motivo Collegamento");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, MyGlb.PANEL_FORM, 4, 268, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_MOTIVO, MyGlb.PANEL_FORM, "Mot. Colleg.");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_MOTIVO, -1, -1);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_MOTIVO, PPQRY_VISMANORDCOL, "A.MOTIVO", "VISMANORCOMO", 5, 28, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, MyGlb.PANEL_LIST, 632, 80, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, MyGlb.PANEL_LIST, 80);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, MyGlb.PANEL_LIST, "Numero");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, MyGlb.PANEL_FORM, 4, 148, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROACC, MyGlb.PANEL_FORM, "Numero");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_NUMEROACC, -1, GRP_ORDINACOLLEG_ACCERTAMENTO);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_NUMEROACC, PPQRY_VISMANORDCOL, "A.NUMERO_ACC", "VIMAORCONUAC", 1, 5, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, MyGlb.PANEL_LIST, 688, 80, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, MyGlb.PANEL_LIST, "Anno");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, MyGlb.PANEL_FORM, 4, 124, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ANNOACC, MyGlb.PANEL_FORM, "Anno");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_ANNOACC, -1, GRP_ORDINACOLLEG_ACCERTAMENTO);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_ANNOACC, PPQRY_VISMANORDCOL, "A.ANNO_ACC", "VIMAORCOANAC", 1, 4, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, MyGlb.PANEL_LIST, 728, 80, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, MyGlb.PANEL_LIST, 56);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, MyGlb.PANEL_LIST, " ");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, MyGlb.PANEL_FORM, 4, 316, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, MyGlb.PANEL_FORM, 56);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_INFOACC, MyGlb.PANEL_FORM, " ");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_INFOACC, -1, GRP_ORDINACOLLEG_ACCERTAMENTO);
    PAN_ORDINACOLLEG.SetFieldUnbound(PFL_ORDINACOLLEG_INFOACC, true);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_INFOACC, PPQRY_VISMANORDCOL, "DECODE(A.ANNO_ACC, to_number(NULL), NULL, 'I')", "INFOACC", 5, 99, 0, -13997);
    PAN_ORDINACOLLEG.SetValueListItem(PFL_ORDINACOLLEG_INFOACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINACOLLEG.SetValueListItem(PFL_ORDINACOLLEG_INFOACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINACOLLEG.SetValueListItem(PFL_ORDINACOLLEG_INFOACC, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, MyGlb.PANEL_LIST, 156, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, MyGlb.PANEL_LIST, 92);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, MyGlb.PANEL_LIST, "Num. Mand");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_NUMEROMAND, MyGlb.PANEL_FORM, "Numero Mand.");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_NUMEROMAND, -1, -1);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_NUMEROMAND, PPQRY_VISMANORDCOL, "A.NUMERO_MAND", "VIMAORCONUMA", 1, 5, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, MyGlb.PANEL_LIST, 748, 80, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, MyGlb.PANEL_LIST, 56);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, MyGlb.PANEL_FORM, 4, 172, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_UFFICIO, -1, -1);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_UFFICIO, PPQRY_VISMANORDCOL, "A.UFFICIO", "VISMANORCOUF", 1, 5, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, MyGlb.PANEL_LIST, 908, 80, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, MyGlb.PANEL_LIST, 88);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 196, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, MyGlb.PANEL_FORM, 104);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_TIPOVINCOLO, -1, -1);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_TIPOVINCOLO, PPQRY_VISMANORDCOL, "A.TIPO_VINCOLO", "VIMAORCOTIVI", 1, 6, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, MyGlb.PANEL_LIST, 0, 12, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, MyGlb.PANEL_LIST, 0);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, MyGlb.PANEL_FORM, 8, 12, 484, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, MyGlb.PANEL_FORM, 0);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ETIMAN12DEL3, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_ETIMAN12DEL3, -1, -1);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_ETIMAN12DEL3, -1, "", "ETIMAN12DEL3", 0, 0, 0, -13997);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, MyGlb.PANEL_LIST, 632, 12, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, MyGlb.PANEL_LIST, 0);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, MyGlb.PANEL_LIST, 1);
    PAN_ORDINACOLLEG.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, MyGlb.PANEL_FORM, 172, 12, 144, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINACOLLEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, MyGlb.PANEL_FORM, 0);
    PAN_ORDINACOLLEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINACOLLEG_ET, MyGlb.PANEL_FORM, 1);
    PAN_ORDINACOLLEG.SetFieldPage(PFL_ORDINACOLLEG_ET, -1, -1);
    PAN_ORDINACOLLEG.SetFieldPanel(PFL_ORDINACOLLEG_ET, -1, "", "ET", 0, 0, 0, -13997);
    PAN_ORDINACOLLEG.set_Alignment(PFL_ORDINACOLLEG_ET, 2);
  }

  private void PAN_ORDINACOLLEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINACOLLEG.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~VISMANORCOUF~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINACOLLEG.SetQuery(PPQRY_T53, 0, SQL, PFL_ORDINACOLLEG_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINACOLLEG.SetQuery(PPQRY_T53, 1, SQL, PFL_ORDINACOLLEG_UFFICIO, "");
    PAN_ORDINACOLLEG.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~VIMAORCOTIVI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINACOLLEG.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_ORDINACOLLEG_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINACOLLEG.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_ORDINACOLLEG_TIPOVINCOLO, "");
    PAN_ORDINACOLLEG.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINACOLLEG.SetIMDB(IMDB, "PQRY_VISMANORDCOL", true);
    PAN_ORDINACOLLEG.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA MAN ORD COLLEGATI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_ORD as VIMAORCOANOR, ");
    SQL.append("  A.NUMERO_ORD as VIMAORCONUOR, ");
    SQL.append("  DECODE(A.NUMERO_ORD, to_number(NULL), NULL, 'I') as INFOORD, ");
    SQL.append("  A.D_DATA_ORD as VIMAORCODDAO, ");
    SQL.append("  A.ANNO_MAND as VIMAORCOANMA, ");
    SQL.append("  A.NUMERO_MAND as VIMAORCONUMA, ");
    SQL.append("  A.ANNO_ACC as VIMAORCOANAC, ");
    SQL.append("  A.NUMERO_ACC as VIMAORCONUAC, ");
    SQL.append("  DECODE(A.ANNO_ACC, to_number(NULL), NULL, 'I') as INFOACC, ");
    SQL.append("  A.UFFICIO as VISMANORCOUF, ");
    SQL.append("  A.TIPO_VINCOLO as VIMAORCOTIVI, ");
    SQL.append("  A.IMPORTO as VISMANORCOIM, ");
    SQL.append("  A.INCASSATO as VISMANORCOIN, ");
    SQL.append("  A.MOTIVO as VISMANORCOMO ");
    PAN_ORDINACOLLEG.SetQuery(PPQRY_VISMANORDCOL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_MAN_ORD_COLLEGATI A ");
    PAN_ORDINACOLLEG.SetQuery(PPQRY_VISMANORDCOL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_PARS.NOMOGGPANNMA~~) ");
    SQL.append("and   (A.NUMERO_MAND = ~~TBL_PARS.NOMOGGPNUMMA~~) ");
    PAN_ORDINACOLLEG.SetQuery(PPQRY_VISMANORDCOL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINACOLLEG.SetQuery(PPQRY_VISMANORDCOL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINACOLLEG.SetQuery(PPQRY_VISMANORDCOL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.MOTIVO, ");
    SQL.append("  A.ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD ");
    PAN_ORDINACOLLEG.SetQuery(PPQRY_VISMANORDCOL, 5, SQL, -1, "");
    PAN_ORDINACOLLEG.SetQueryDB(PPQRY_VISMANORDCOL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINACOLLEG.SetMasterTable(0, "VISTA_MAN_ORD_COLLEGATI");
    PAN_ORDINACOLLEG.AddToSortList(PFL_ORDINACOLLEG_MOTIVO, true);
    PAN_ORDINACOLLEG.AddToSortList(PFL_ORDINACOLLEG_ANNOORD, true);
    PAN_ORDINACOLLEG.AddToSortList(PFL_ORDINACOLLEG_NUMEROORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINACOLLEG.Status() == 2)
    {
      int oldListQBE = PAN_ORDINACOLLEG.iUseListQBE;
      PAN_ORDINACOLLEG.iUseListQBE = 0;
      PAN_ORDINACOLLEG.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINACOLLEG.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINACOLLEG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINACOLLEG) PAN_ORDINACOLLEG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINACOLLEG) PAN_ORDINACOLLEG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINACOLLEG) PAN_ORDINACOLLEG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINACOLLEG) PAN_ORDINACOLLEG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINACOLLEG) PAN_ORDINACOLLEG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
