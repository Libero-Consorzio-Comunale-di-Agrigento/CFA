// **********************************************
// Estrazione Imputazioni Ord
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstrazioneImputazioniOrd extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ESTRAZIMPUTA_DATALIQUSTIP = 0;
  private static int PFL_ESTRAZIMPUTA_GRUPPO = 1;
  private static int PFL_ESTRAZIMPUTA_BOLLO = 2;
  private static int PFL_ESTRAZIMPUTA_ELABORA = 3;
  private static int PFL_ESTRAZIMPUTA_BENBENEFICIA = 4;
  private static int PFL_ESTRAZIMPUTA_CODICEDEBITO = 5;
  private static int PFL_ESTRAZIMPUTA_SCEGBENFBUTT = 6;
  private static int PFL_ESTRAZIMPUTA_INFOBENFBUTT = 7;

  private static int PPQRY_ESTRAZIMPUT1 = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_T72 = 2;
  private static int PPQRY_T60 = 3;


  IDPanel PAN_ESTRAZIMPUTA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ESTRAZIMPUTA(IMDB);
    //
    //
    Init_PQRY_ESTRAZIMPUT1(IMDB);
    Init_PQRY_ESTRAZIMPUT1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ESTRAZIMPUTA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_ESTRAZIMPUTA, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_ESTRAZIMPUTA, "TBL_ESTRAZIMPUTA");
    IMDB.set_FldCode(IMDBDef6.TBL_ESTRAZIMPUTA,IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMDALIST, "ROWNAMDALIST");
    IMDB.SetFldParams(IMDBDef6.TBL_ESTRAZIMPUTA,IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMDALIST,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ESTRAZIMPUTA,IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEGRUPP, "ROWNAMEGRUPP");
    IMDB.SetFldParams(IMDBDef6.TBL_ESTRAZIMPUTA,IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEGRUPP,1,3,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ESTRAZIMPUTA,IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef6.TBL_ESTRAZIMPUTA,IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ESTRAZIMPUTA,IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef6.TBL_ESTRAZIMPUTA,IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef6.TBL_ESTRAZIMPUTA, 0);
  }

  private static void Init_PQRY_ESTRAZIMPUT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ESTRAZIMPUT1, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_ESTRAZIMPUT1, "PQRY_ESTRAZIMPUT1");
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRAZIMPUT1,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, "ROWNAMDALIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRAZIMPUT1,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRAZIMPUT1,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP, "ROWNAMEGRUPP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRAZIMPUT1,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRAZIMPUT1,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRAZIMPUT1,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRAZIMPUT1,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRAZIMPUT1,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ESTRAZIMPUT1, 0);
  }

  private static void Init_PQRY_ESTRAZIMPUT1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ESTRAZIMPUT1_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_ESTRAZIMPUT1_RS, "PQRY_ESTRAZIMPUT1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRAZIMPUT1_RS,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, "ROWNAMDALIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRAZIMPUT1_RS,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRAZIMPUT1_RS,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP, "ROWNAMEGRUPP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRAZIMPUT1_RS,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRAZIMPUT1_RS,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRAZIMPUT1_RS,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRAZIMPUT1_RS,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRAZIMPUT1_RS,IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstrazioneImputazioniOrd(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstrazioneImputazioniOrd()
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
    FormIdx = MyGlb.FRM_ESTRAZIMPUTA1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "45443551-C5A1-4D0B-9D3A-F54A800C568E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 532;
    DesignHeight = 210;
    set_Caption(new IDVariant("Estrazione Imputazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 532;
    Frames[1].Height = 184;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Estrazione Imputazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 184;
    PAN_ESTRAZIMPUTA = new IDPanel(w, this, 1, "PAN_ESTRAZIMPUTA");
    Frames[1].Content = PAN_ESTRAZIMPUTA;
    PAN_ESTRAZIMPUTA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTRAZIMPUTA.VS = MainFrm.VisualStyleList;
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESTRAZIMPUTA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D0F2489F-59BF-4A71-BC75-EF7F9E395829");
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 876, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTRAZIMPUTA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTRAZIMPUTA.InitStatus = 2;
    PAN_ESTRAZIMPUTA_Init();
    PAN_ESTRAZIMPUTA_InitFields();
    PAN_ESTRAZIMPUTA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_ESTRAZIMPUTA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESTRAZIMPUTA1_ESTRAZIMPUT1();
      }
      PAN_ESTRAZIMPUTA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_ESTRAZIMPUTA.FrIndex)
    {
      if (IdxFieldActived ==PFL_ESTRAZIMPUTA_SCEGBENFBUTT) {
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
    return (obj instanceof EstrazioneImputazioniOrd);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstrazioneImputazioniOrd.class.getName() : (Glb.ClassWithPackage(EstrazioneImputazioniOrd.class) ? EstrazioneImputazioniOrd.class.getName().substring(EstrazioneImputazioniOrd.class.getPackage().getName().length() + 1) : EstrazioneImputazioniOrd.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Info Soggetti
  // **********************************************************************
  public int InfoSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Soggetti Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniOrd", "InfoSoggetti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Soggetti
  // **********************************************************************
  public int SelezionaSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Soggetti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniOrd", "SelezionaSoggetti", _e);
      return -1;
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
    IDVariant v_ESTRAZIONI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_GRUPPO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Indicare un Gruppo", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Indicare la Data Liquidazione Stipendi", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP, 0).compareTo((new IDVariant(999)), true)!=0)
      {
        IDVariant v_SEZ = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.SEZIONE as T72SEZIONE ");
        SQL.append("from ");
        SQL.append("  T72 A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_SEZ = QV.Get("T72SEZIONE", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_SEZ.compareTo((new IDVariant()), true)!=0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Il gruppo è collegato a una Sezione: non può essere estratto singolarmente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        v_GRUPPO = IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP, 0);
      }
      else
      {
        v_GRUPPO = (new IDVariant(-1));
      }
      if ((new IDVariant(ControlliNonBlocc())).equals((new IDVariant(-1)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.GROESTRAZIONE(v_GRUPPO, IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, 0), ((IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEBOLLO, 0)), IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_ESTRAZIONI);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NEWVARIABLE = new IDVariant(0,IDVariant.STRING);
          v_NEWVARIABLE = (new IDVariant("Sono state estratte", IDVariant.STRING));
          v_MSG = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>"))), v_NEWVARIABLE), (new IDVariant(" "))), IDL.ToString(v_ESTRAZIONI)), (new IDVariant(" "))), (new IDVariant("Imputazioni")));
          MainFrm.set_AlertMessage(v_MSG); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniOrd", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Non Blocc
  // **********************************************************************
  public boolean ControlliNonBlocc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RETVALUE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_QUESTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Controlli Non Blocc Body
      // Procedure Body
      // 
      v_QUESTION = (new IDVariant(""));
      v_RETVALUE = (new IDVariant(-1));
      if (IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP, 0).equals((new IDVariant(999)), true))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant Q = new IDVariant(0,IDVariant.STRING);
        Q = (new IDVariant("Non tutti i Gruppi relativi a Entrate del Personale sono collegati alla Sezione ", IDVariant.STRING));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  T72 A ");
        SQL.append("where (A.TIPO = 'EP') ");
        SQL.append("and   ((A.SEZIONE IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
        {
          v_QUESTION = IDL.Add(Q, (new IDVariant("<BR/>")));
        }
      }
      // 
      // blocco
      // 
      {
        IDVariant v_SCODICEPERS = new IDVariant(0,IDVariant.STRING);
        IDVariant v_PDATAUGUALE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_PDATASUPERIO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_DDATAELAB = new IDVariant(0,IDVariant.DATETIME);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE_PERS as T99CODICPERS ");
        SQL.append("from ");
        SQL.append("  T99 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_SCODICEPERS = QV.Get("T99CODICPERS", IDVariant.STRING) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  1 as C1 ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        SQL.append("where (EXISTS(");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  1 ");
        SQL.append("from ");
        SQL.append("  IMPUTAZIONI_CONTABILI B, ");
        SQL.append("  T72 C ");
        SQL.append("where (B.SEZIONE LIKE C.SEZIONE) ");
        SQL.append("and   (B.E_S = 'E') ");
        SQL.append("and   (" + IDL.CSql(v_SCODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = NULL OR B.DIVISIONE = " + IDL.CSql(v_SCODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.DATA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (C.TIPO = 'EP') ");
        SQL.append("and   (C.D_DATA_ELAB1 = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_PDATAUGUALE = QV.Get("C1", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  1 as C1 ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        SQL.append("where (EXISTS(");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  1 ");
        SQL.append("from ");
        SQL.append("  IMPUTAZIONI_CONTABILI B, ");
        SQL.append("  T72 C ");
        SQL.append("where (B.SEZIONE LIKE C.SEZIONE) ");
        SQL.append("and   (B.E_S = 'E') ");
        SQL.append("and   (" + IDL.CSql(v_SCODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = NULL OR B.DIVISIONE = " + IDL.CSql(v_SCODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.DATA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (C.TIPO = 'EP') ");
        SQL.append("and   (C.D_DATA_ELAB1 > " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_PDATASUPERIO = QV.Get("C1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_PDATAUGUALE.equals((new IDVariant(1)), true))
        {
          IDVariant v_Q2 = new IDVariant(0,IDVariant.STRING);
          v_Q2 = (new IDVariant("La data liquidazione stipendi  e' maggiore o uguale alla data di ultima estrazione.", IDVariant.STRING));
          v_QUESTION = IDL.Add(IDL.Add(v_QUESTION, v_Q2), (new IDVariant("<BR/>")));
        }
        if (v_PDATASUPERIO.equals((new IDVariant(1)), true))
        {
          IDVariant v_Q3 = new IDVariant(0,IDVariant.STRING);
          v_Q3 = (new IDVariant("Data ultima estrazione di un gruppo superiore alla data liquidazione stipendi.", IDVariant.STRING));
          v_QUESTION = IDL.Add(IDL.Add(v_QUESTION, v_Q3), (new IDVariant("<BR/>")));
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.D_DATA_ELAB1 as T72DDATAELAB ");
        SQL.append("from ");
        SQL.append("  T72 A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DDATAELAB = QV.Get("T72DDATAELAB", IDVariant.DATETIME) ;
        }
        QV.Close();
        if (IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, 0).equals(v_DDATAELAB, true))
        {
          IDVariant v_Q4 = new IDVariant(0,IDVariant.STRING);
          v_Q4 = (new IDVariant("La data liquidazione stipendi  e' uguale a quella dell'ultima estrazione.", IDVariant.STRING));
          v_QUESTION = IDL.Add(IDL.Add(v_QUESTION, v_Q4), (new IDVariant("<BR/>")));
        }
        if (IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMDALIST, 0).compareTo(v_DDATAELAB, true)<0)
        {
          IDVariant v_Q5 = new IDVariant(0,IDVariant.STRING);
          v_Q5 = (new IDVariant("superiore alla data liquidazione stipendi.", IDVariant.STRING));
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Data Ultima estrazione: ", IDVariant.STRING));
          v_QUESTION = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_QUESTION, v_STR), IDL.ToString(v_DDATAELAB)), (new IDVariant(" "))), v_Q5), (new IDVariant("<BR/>")));
        }
      }
      if (v_QUESTION.compareTo((new IDVariant("")), true)!=0)
      {
        v_QUESTION = IDL.Add(v_QUESTION, (new IDVariant("Continuare?")));
        if (!(MainFrm.MessageConfirm(v_QUESTION)))
        {
          v_RETVALUE = (new IDVariant(0));
          return v_RETVALUE.booleanValue();
        }
      }
      return v_RETVALUE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniOrd", "ControlliNonBlocc", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMDALIST, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEBOLLO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEGRUPP, 0, (new IDVariant(999)));
      MainFrm.SettaNLSCHAR();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniOrd", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniOrd", "EndModalEvent", _e);
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
      PAN_ESTRAZIMPUTA.PanelCommand(Glb.PCM_UPDATE);
      UNLOADEVENT_ESTRIMPUDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniOrd", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Estrazione Imputazioni: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_ESTRIMPUDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMDALIST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEGRUPP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMCODDEB, 0, new IDVariant());
  }

  // **********************************************************************
  // Estrazione Imputazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTRAZIMPUTA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESTRAZIMPUTA);
      // 
      // Estrazione Imputazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ESTRAZIMPUT1, IMDBDef15.PQSL_ESTRAZIMPUT1_ROWNAMCODDEB, 0))))
      {
        PAN_ESTRAZIMPUTA.SetFlags (Glb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ESTRAZIMPUTA.SetFlags (Glb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniOrd", "EstrazioneImputazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Estrazione Imputazioni On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_ESTRAZIMPUTA_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Estrazione Imputazioni On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_ESTRAZIMPUTA_BENBENEFICIA)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_ESTRAZIMPUTA.FieldText(PFL_ESTRAZIMPUTA_BENBENEFICIA))), IDL.Today(), (new IDVariant("ESTIMP")), (new IDVariant(0)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneImputazioniOrd", "EstrazioneImputazioniOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Estrazione Imputazioni
  // Primary record source for panel data
  // **********************************************************************
  private void ESTRAZIMPUTA1_ESTRAZIMPUT1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ESTRAZIMPUT1_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_ESTRAZIMPUTA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_ESTRAZIMPUTA, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ESTRAZIMPUT1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ESTRAZIMPUT1_RS, 0, IMDBDef6.TBL_ESTRAZIMPUTA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ESTRAZIMPUT1_RS, 0, 0, IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMDALIST, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ESTRAZIMPUT1_RS, 1, 0, IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEGRUPP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ESTRAZIMPUT1_RS, 2, 0, IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ESTRAZIMPUT1_RS, 3, 0, IMDBDef6.TBL_ESTRAZIMPUTA, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMCODDEB, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_ESTRAZIMPUTA, 0);
      if (IMDB.Eof(IMDBDef6.TBL_ESTRAZIMPUTA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_ESTRAZIMPUTA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ESTRAZIMPUT1_RS, 0);
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
  private void PAN_ESTRAZIMPUTA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTRAZIMPUTA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTRAZIMPUTA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTRAZIMPUTA, Cancel);
    // Stub
  }

  private void PAN_ESTRAZIMPUTA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ESTRAZIMPUTA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ESTRAZIMPUTA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ESTRAZIMPUTA_SCEGBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_ESTRAZIMPUTA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ESTRAZIMPUTA_INFOBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_ESTRAZIMPUTA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ESTRAZIMPUTA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTRAZIMPUTA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESTRAZIMPUTA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESTRAZIMPUTA_Init()
  {

    PAN_ESTRAZIMPUTA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTRAZIMPUTA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESTRAZIMPUTA.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_ESTRAZIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, "7E8CC204-874F-4317-B9E9-25A26D2B3E2B");
    PAN_ESTRAZIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, "Data Liquidazione Stipendi");
    PAN_ESTRAZIMPUTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, "");
    PAN_ESTRAZIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRAZIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRAZIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, "59F60895-78EE-4606-835A-72148458D410");
    PAN_ESTRAZIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, "Gruppo");
    PAN_ESTRAZIMPUTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, "");
    PAN_ESTRAZIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRAZIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRAZIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, "09AD7D8E-7624-4045-BC9E-538C47538DE0");
    PAN_ESTRAZIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, "Bollo");
    PAN_ESTRAZIMPUTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, "");
    PAN_ESTRAZIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRAZIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRAZIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, "6BD0A6F9-1044-425E-BC8A-9B1986967834");
    PAN_ESTRAZIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, "Elabora");
    PAN_ESTRAZIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ESTRAZIMPUTA.SetImage(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, 0, "button1.gif", false);
    PAN_ESTRAZIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESTRAZIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, "F5568004-D507-44D0-AFA4-619AB220ED5D");
    PAN_ESTRAZIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, "Debitore");
    PAN_ESTRAZIMPUTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, "");
    PAN_ESTRAZIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRAZIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRAZIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, "C23C528B-BFD6-4EE0-A366-45EA0B033747");
    PAN_ESTRAZIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, "Codice Debitore");
    PAN_ESTRAZIMPUTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, "");
    PAN_ESTRAZIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRAZIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRAZIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, "FB8889DF-6414-4BA6-AD53-744DCAAD6D76");
    PAN_ESTRAZIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, "");
    PAN_ESTRAZIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ESTRAZIMPUTA.SetImage(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, 0, "wsearch1.gif", false);
    PAN_ESTRAZIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESTRAZIMPUTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, "6033F416-B694-43DF-AB4B-B64C423ED14F");
    PAN_ESTRAZIMPUTA.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, "");
    PAN_ESTRAZIMPUTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ESTRAZIMPUTA.SetImage(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, 0, "info.gif", false);
    PAN_ESTRAZIMPUTA.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ESTRAZIMPUTA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, MyGlb.PANEL_LIST, 136);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, MyGlb.PANEL_LIST, 1);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, MyGlb.PANEL_LIST, "Dt. Liquidazione Stipendi");
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, MyGlb.PANEL_FORM, 4, 8, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, MyGlb.PANEL_FORM, 160);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, MyGlb.PANEL_FORM, 1);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_DATALIQUSTIP, MyGlb.PANEL_FORM, "Data Liquidazione Stipendi");
    PAN_ESTRAZIMPUTA.SetFieldPage(PFL_ESTRAZIMPUTA_DATALIQUSTIP, -1, -1);
    PAN_ESTRAZIMPUTA.SetFieldPanel(PFL_ESTRAZIMPUTA_DATALIQUSTIP, PPQRY_ESTRAZIMPUT1, "A.ROWNAMDALIST", "ROWNAMDALIST", 6, 14, 0, -13997);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, MyGlb.PANEL_LIST, 44);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, MyGlb.PANEL_LIST, "Gruppo");
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, MyGlb.PANEL_FORM, 108, 32, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, MyGlb.PANEL_FORM, 56);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_GRUPPO, MyGlb.PANEL_FORM, "Gruppo");
    PAN_ESTRAZIMPUTA.SetFieldPage(PFL_ESTRAZIMPUTA_GRUPPO, -1, -1);
    PAN_ESTRAZIMPUTA.SetFieldPanel(PFL_ESTRAZIMPUTA_GRUPPO, PPQRY_ESTRAZIMPUT1, "A.ROWNAMEGRUPP", "ROWNAMEGRUPP", 1, 3, 0, -13997);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, MyGlb.PANEL_FORM, 120, 56, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, MyGlb.PANEL_FORM, 44);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_ESTRAZIMPUTA.SetFieldPage(PFL_ESTRAZIMPUTA_BOLLO, -1, -1);
    PAN_ESTRAZIMPUTA.SetFieldPanel(PFL_ESTRAZIMPUTA_BOLLO, PPQRY_ESTRAZIMPUT1, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 2, 0, -13997);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, MyGlb.PANEL_LIST, 280, 116, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, MyGlb.PANEL_FORM, 404, 120, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ESTRAZIMPUTA.SetFieldPage(PFL_ESTRAZIMPUTA_ELABORA, -1, -1);
    PAN_ESTRAZIMPUTA.SetFieldPanel(PFL_ESTRAZIMPUTA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, MyGlb.PANEL_LIST, 0, 36, 412, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, MyGlb.PANEL_LIST, 100);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, MyGlb.PANEL_LIST, 2);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, MyGlb.PANEL_LIST, "Debitore");
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, MyGlb.PANEL_FORM, 80, 80, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, MyGlb.PANEL_FORM, 84);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, MyGlb.PANEL_FORM, 1);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_BENBENEFICIA, MyGlb.PANEL_FORM, "Debitore");
    PAN_ESTRAZIMPUTA.SetFieldPage(PFL_ESTRAZIMPUTA_BENBENEFICIA, -1, -1);
    PAN_ESTRAZIMPUTA.SetFieldPanel(PFL_ESTRAZIMPUTA_BENBENEFICIA, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "BENEFICIARIO", 5, 162, 0, -13997);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, MyGlb.PANEL_LIST, 40);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, MyGlb.PANEL_LIST, "Codice Debitore");
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, MyGlb.PANEL_FORM, 420, 80, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, MyGlb.PANEL_FORM, 40);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRAZIMPUTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_CODICEDEBITO, MyGlb.PANEL_FORM, "C. Db.");
    PAN_ESTRAZIMPUTA.SetFieldPage(PFL_ESTRAZIMPUTA_CODICEDEBITO, -1, -1);
    PAN_ESTRAZIMPUTA.SetFieldPanel(PFL_ESTRAZIMPUTA_CODICEDEBITO, PPQRY_ESTRAZIMPUT1, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 2, 15, 0, -13997);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, MyGlb.PANEL_FORM, 484, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_SCEGBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_ESTRAZIMPUTA.SetFieldPage(PFL_ESTRAZIMPUTA_SCEGBENFBUTT, -1, -1);
    PAN_ESTRAZIMPUTA.SetFieldPanel(PFL_ESTRAZIMPUTA_SCEGBENFBUTT, -1, "", "SCEGBENFBUTT", 0, 0, 0, -13997);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_ESTRAZIMPUTA.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, MyGlb.PANEL_FORM, 500, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRAZIMPUTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_ESTRAZIMPUTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRAZIMPUTA_INFOBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_ESTRAZIMPUTA.SetFieldPage(PFL_ESTRAZIMPUTA_INFOBENFBUTT, -1, -1);
    PAN_ESTRAZIMPUTA.SetFieldPanel(PFL_ESTRAZIMPUTA_INFOBENFBUTT, -1, "", "INFOBENFBUTT", 0, 0, 0, -13997);
  }

  private void PAN_ESTRAZIMPUTA_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTRAZIMPUTA.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENEFICIARIO, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODDEB~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ESTRAZIMPUTA.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_ESTRAZIMPUTA.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESTRAZIMPUTA.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_ESTRAZIMPUTA.SetQueryLKE(PPQRY_BEN, PFL_ESTRAZIMPUTA_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENEFICIARIO, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ESTRAZIMPUTA.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_ESTRAZIMPUTA.SetQueryHeaderColumn(PPQRY_BEN, "BENEFICIARIO", "Beneficiario");
    PAN_ESTRAZIMPUTA.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_ESTRAZIMPUTA.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_ESTRAZIMPUTA.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_ESTRAZIMPUTA.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    PAN_ESTRAZIMPUTA.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_ESTRAZIMPUTA.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_ESTRAZIMPUTA.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_ESTRAZIMPUTA.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_ESTRAZIMPUTA.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_ESTRAZIMPUTA.SetQueryVisibleColumn(PPQRY_BEN, "AL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T72CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T72DESC ");
    SQL.append("from ");
    SQL.append("  T72 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEGRUPP~~) ");
    SQL.append("and   (A.TIPO = 'EP') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  999, ");
    SQL.append("  'Tutti i gruppi collegati a Sezioni' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEGRUPP~~ = 999) ");
    SQL.append("order by 1 ");
    PAN_ESTRAZIMPUTA.SetQuery(PPQRY_T72, 0, SQL, PFL_ESTRAZIMPUTA_GRUPPO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T72CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T72DESC ");
    SQL.append("from ");
    SQL.append("  T72 A ");
    SQL.append("where (A.TIPO = 'EP') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  999, ");
    SQL.append("  'Tutti i gruppi collegati a Sezioni' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ESTRAZIMPUTA.SetQuery(PPQRY_T72, 1, SQL, PFL_ESTRAZIMPUTA_GRUPPO, "");
    PAN_ESTRAZIMPUTA.SetQueryDB(PPQRY_T72, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEBOLLO~~) ");
    SQL.append("and   (A.TIPO = 'L' OR (A.TIPO IS NULL)) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEBOLLO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ESTRAZIMPUTA.SetQuery(PPQRY_T60, 0, SQL, PFL_ESTRAZIMPUTA_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.TIPO = 'L' OR (A.TIPO IS NULL)) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ESTRAZIMPUTA.SetQuery(PPQRY_T60, 1, SQL, PFL_ESTRAZIMPUTA_BOLLO, "");
    PAN_ESTRAZIMPUTA.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESTRAZIMPUTA.SetIMDB(IMDB, "PQRY_ESTRAZIMPUT1", true);
    PAN_ESTRAZIMPUTA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ESTRAZIMPUTA.SetQueryIMDB(PPQRY_ESTRAZIMPUT1, IMDBDef15.PQRY_ESTRAZIMPUT1_RS, IMDBDef6.TBL_ESTRAZIMPUTA);
    JustLoaded = true;
    PAN_ESTRAZIMPUTA.SetFieldPrimaryIndex(PFL_ESTRAZIMPUTA_DATALIQUSTIP, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMDALIST);
    PAN_ESTRAZIMPUTA.SetFieldPrimaryIndex(PFL_ESTRAZIMPUTA_GRUPPO, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEGRUPP);
    PAN_ESTRAZIMPUTA.SetFieldPrimaryIndex(PFL_ESTRAZIMPUTA_BOLLO, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMEBOLLO);
    PAN_ESTRAZIMPUTA.SetFieldPrimaryIndex(PFL_ESTRAZIMPUTA_CODICEDEBITO, IMDBDef6.FLD_ESTRAZIMPUTA_ROWNAMCODDEB);
    PAN_ESTRAZIMPUTA.SetMasterTable(0, "ESTRAZIMPUTA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTRAZIMPUTA.Status() == 2)
    {
      int oldListQBE = PAN_ESTRAZIMPUTA.iUseListQBE;
      PAN_ESTRAZIMPUTA.iUseListQBE = 0;
      PAN_ESTRAZIMPUTA.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTRAZIMPUTA.PanelCommand(Glb.PCM_FIND);
      PAN_ESTRAZIMPUTA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESTRAZIMPUTA) PAN_ESTRAZIMPUTA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESTRAZIMPUTA) PAN_ESTRAZIMPUTA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESTRAZIMPUTA) PAN_ESTRAZIMPUTA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESTRAZIMPUTA) PAN_ESTRAZIMPUTA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESTRAZIMPUTA) PAN_ESTRAZIMPUTA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_ESTRAZIMPUTA) PAN_ESTRAZIMPUTA_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
