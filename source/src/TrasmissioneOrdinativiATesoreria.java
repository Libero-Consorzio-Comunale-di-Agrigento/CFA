// **********************************************
// Trasmissione Ordinativi A Tesoreria
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TrasmissioneOrdinativiATesoreria extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_TRASORDIATES_ORDINATIVI = 0;

  private static int PFL_TRASORDIATES_DAL = 0;
  private static int PFL_TRASORDIATES_AL = 1;
  private static int PFL_TRASORDIATES_NEWPANELLABE = 2;
  private static int PFL_TRASORDIATES_NEWPANELABE1 = 3;
  private static int PFL_TRASORDIATES_UFFICIO = 4;
  private static int PFL_TRASORDIATES_DISTINNUMERO = 5;
  private static int PFL_TRASORDIATES_ELABORA = 6;

  private static int PPQRY_NEWTABLE46 = 0;

  private static int PPQRY_T53 = 1;


  IDPanel PAN_TRASORDIATES;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE50(IMDB);
    //
    //
    Init_PQRY_NEWTABLE46(IMDB);
    Init_PQRY_NEWTABLE46_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE50(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_NEWTABLE50, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_NEWTABLE50, "TBL_NEWTABLE50");
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE50,IMDBDef6.FLD_NEWTABLE50_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE50,IMDBDef6.FLD_NEWTABLE50_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE50,IMDBDef6.FLD_NEWTABLE50_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE50,IMDBDef6.FLD_NEWTABLE50_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE50,IMDBDef6.FLD_NEWTABLE50_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE50,IMDBDef6.FLD_NEWTABLE50_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE50,IMDBDef6.FLD_NEWTABLE50_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE50,IMDBDef6.FLD_NEWTABLE50_ROWNAMDISNUM,1,5,0);
    IMDB.TblAddNew(IMDBDef6.TBL_NEWTABLE50, 0);
  }

  private static void Init_PQRY_NEWTABLE46(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE46, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE46, "PQRY_NEWTABLE46");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE46,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE46,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE46,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE46,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE46,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE46,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE46,IMDBDef15.PQSL_NEWTABLE46_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE46,IMDBDef15.PQSL_NEWTABLE46_ROWNAMDISNUM,1,5,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE46, 0);
  }

  private static void Init_PQRY_NEWTABLE46_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE46_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE46_RS, "PQRY_NEWTABLE46_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE46_RS,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE46_RS,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE46_RS,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE46_RS,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE46_RS,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE46_RS,IMDBDef15.PQSL_NEWTABLE46_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE46_RS,IMDBDef15.PQSL_NEWTABLE46_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE46_RS,IMDBDef15.PQSL_NEWTABLE46_ROWNAMDISNUM,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TrasmissioneOrdinativiATesoreria(MyWebEntryPoint w, IMDBObj imdb)
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
  public TrasmissioneOrdinativiATesoreria()
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
    FormIdx = MyGlb.FRM_TRASORDIATES;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7A0D0EDF-76FD-4B49-87D5-333C44F833B0";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 400;
    DesignHeight = 218;
    set_Caption(new IDVariant("Trasmissione Ordinativi A Tesoreria"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 400;
    Frames[1].Height = 192;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Trasmissione Ordinativi A Tesoreria";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 192;
    PAN_TRASORDIATES = new IDPanel(w, this, 1, "PAN_TRASORDIATES");
    Frames[1].Content = PAN_TRASORDIATES;
    PAN_TRASORDIATES.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TRASORDIATES.VS = MainFrm.VisualStyleList;
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TRASORDIATES.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "24DD0CB1-8EF5-4444-A3E8-03E4A055560D");
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 380, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TRASORDIATES.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TRASORDIATES.InitStatus = 2;
    PAN_TRASORDIATES_Init();
    PAN_TRASORDIATES_InitFields();
    PAN_TRASORDIATES_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_NEWTABLE50, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        TRASORDIATES_NEWTABLE46();
      }
      PAN_TRASORDIATES.UpdatePanel(MainFrm);
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
    return (obj instanceof TrasmissioneOrdinativiATesoreria);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TrasmissioneOrdinativiATesoreria.class.getName() : (Glb.ClassWithPackage(TrasmissioneOrdinativiATesoreria.class) ? TrasmissioneOrdinativiATesoreria.class.getName().substring(TrasmissioneOrdinativiATesoreria.class.getPackage().getName().length() + 1) : TrasmissioneOrdinativiATesoreria.class.getName()));
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
    IDCachedRowSet C13;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMEDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMEAL, 0)))
      {
        if (IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_TIPO_MO, 0).compareTo((new IDVariant("BPT")), true)!=0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Valori Obbligatori su numeri ordinativi"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        else
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMDISNUM, 0)))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Indicare Numeri Ordinativi o il numero Distinta"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
          else
          {
            IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  MAN A ");
            SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMDISNUM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_VCOUNT.equals((new IDVariant(0)), true))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Distinta non esistente"));
              MainFrm.set_AlertMessage(v_AVVISO); 
              IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMDISNUM, 0, (new IDVariant()));
              return 0;
            }
          }
        }
      }
      SQL = new StringBuffer();
      SQL.append("delete from WORK_EXPORT_TESO ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("and   (FASE = 'ORD') ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.GENERATESOORD(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMEDAL, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMEAL, 0), ((IMDB.Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMEUFFIC, 0)), IMDB.Value(IMDBDef15.PQRY_NEWTABLE46, IMDBDef15.PQSL_NEWTABLE46_ROWNAMDISNUM, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_OUTPUTFILE = new IDVariant(0,IDVariant.STRING);
        v_OUTPUTFILE = (new IDVariant("ordinativi.txt", IDVariant.STRING));
        v_FD = MainFrm.VBFile.FreeFile();
        MainFrm.VBFile.OpenForOutput(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), v_OUTPUTFILE), v_FD, false); 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DATI as WOREXPTESDAT, ");
        SQL.append("  A.ORDINAMENTO as WOREXPTESORD ");
        SQL.append("from ");
        SQL.append("  WORK_EXPORT_TESO A ");
        SQL.append("where (A.FASE = 'ORD') ");
        SQL.append("and   (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
        SQL.append("order by ");
        SQL.append("  A.ORDINAMENTO ");
        C13 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C13.EOF()) C13.MoveNext();
        while (!C13.EOF())
        {
          MainFrm.VBFile.WriteLine(v_FD, C13.Get("WOREXPTESDAT")); 
          C13.MoveNext();
        }
        C13.Close();
        MainFrm.VBFile.Close(v_FD); 
        MainFrm.set_RedirectTo(v_OUTPUTFILE);
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneOrdinativiATesoreria", "Elabora", _e);
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
    IDVariant v_ULTORDTESO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMERO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ULT_ORD_TESO as N04ULTORDTES ");
      SQL.append("from ");
      SQL.append("  N04 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ULTORDTESO = QV.Get("N04ULTORDTES", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.NUMERO as N03NUMERO ");
      SQL.append("from ");
      SQL.append("  N03 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE = LOWER('ORD')) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMERO = QV.Get("N03NUMERO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_ULTORDTESO.compareTo(v_NUMERO, true)!=0)
      {
        IMDB.set_Value(IMDBDef6.TBL_NEWTABLE50, IMDBDef6.FLD_NEWTABLE50_ROWNAMEDAL, 0, IDL.Add(v_ULTORDTESO, (new IDVariant(1))));
        IMDB.set_Value(IMDBDef6.TBL_NEWTABLE50, IMDBDef6.FLD_NEWTABLE50_ROWNAMEAL, 0, new IDVariant(v_NUMERO));
      }
      if (IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_TIPO_MO, 0).compareTo((new IDVariant("RAC")), true)!=0)
      {
        PAN_TRASORDIATES.SetFlags (Glb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_TRASORDIATES.SetFlags (Glb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_TIPO_MO, 0).compareTo((new IDVariant("BPT")), true)!=0)
      {
        PAN_TRASORDIATES.SetFlags (Glb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_TRASORDIATES.SetFlags (Glb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IMDB.set_Value(IMDBDef6.TBL_NEWTABLE50, IMDBDef6.FLD_NEWTABLE50_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneOrdinativiATesoreria", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void TRASORDIATES_NEWTABLE46() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_NEWTABLE46_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_NEWTABLE50, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_NEWTABLE50, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE46_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_NEWTABLE46_RS, 0, IMDBDef6.TBL_NEWTABLE50, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE46_RS, 0, 0, IMDBDef6.TBL_NEWTABLE50, IMDBDef6.FLD_NEWTABLE50_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE46_RS, 1, 0, IMDBDef6.TBL_NEWTABLE50, IMDBDef6.FLD_NEWTABLE50_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE46_RS, 2, 0, IMDBDef6.TBL_NEWTABLE50, IMDBDef6.FLD_NEWTABLE50_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE46_RS, 3, 0, IMDBDef6.TBL_NEWTABLE50, IMDBDef6.FLD_NEWTABLE50_ROWNAMDISNUM, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_NEWTABLE50, 0);
      if (IMDB.Eof(IMDBDef6.TBL_NEWTABLE50, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_NEWTABLE50, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_NEWTABLE46_RS, 0);
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
  private void PAN_TRASORDIATES_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TRASORDIATES, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TRASORDIATES_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TRASORDIATES, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TRASORDIATES_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TRASORDIATES);
    // Stub
  }

  private void PAN_TRASORDIATES_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_TRASORDIATES_ELABORA)
    {
      this.IdxPanelActived = this.PAN_TRASORDIATES.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_TRASORDIATES_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TRASORDIATES_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TRASORDIATES_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TRASORDIATES_Init()
  {

    PAN_TRASORDIATES.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TRASORDIATES.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_TRASORDIATES.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, "9E1E093A-B96E-4D64-9C39-CBA149E73E96");
    PAN_TRASORDIATES.set_Header(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, "Ordinativi");
    PAN_TRASORDIATES.set_ToolTip(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, "");
    PAN_TRASORDIATES.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 208, 16, 0, 0);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, MyGlb.PANEL_FORM, 12, 7, 348, 105, 0, 0);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, 0, 55);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, 1, 13);
    PAN_TRASORDIATES.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, 0, 4);
    PAN_TRASORDIATES.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, 1, 4);
    PAN_TRASORDIATES.SetFlags(MyGlb.OBJ_GROUP, GRP_TRASORDIATES_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_TRASORDIATES.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_TRASORDIATES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, "4F3D55F4-3108-41D9-B0D1-0DB3B809BAC6");
    PAN_TRASORDIATES.set_Header(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, "Dal");
    PAN_TRASORDIATES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, "");
    PAN_TRASORDIATES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_TRASORDIATES.SetFlags(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TRASORDIATES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, "76DEF34A-862C-4E7F-946D-2AFBAA659413");
    PAN_TRASORDIATES.set_Header(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, "Al");
    PAN_TRASORDIATES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, "");
    PAN_TRASORDIATES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_TRASORDIATES.SetFlags(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TRASORDIATES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, "336BBC15-3AA0-4A67-AD59-134ED7F8FF58");
    PAN_TRASORDIATES.set_Header(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, "");
    PAN_TRASORDIATES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_TRASORDIATES.SetFlags(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TRASORDIATES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, "504AD293-206B-4639-A82D-16A4B59906C8");
    PAN_TRASORDIATES.set_Header(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, "");
    PAN_TRASORDIATES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_TRASORDIATES.SetFlags(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TRASORDIATES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, "B4C627A1-FF92-4C08-A7D0-6A29AD4CC6F3");
    PAN_TRASORDIATES.set_Header(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, "Ufficio");
    PAN_TRASORDIATES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, "");
    PAN_TRASORDIATES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_TRASORDIATES.SetFlags(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TRASORDIATES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, "FFA9BCAD-6354-4E3A-9DDF-4AB642640D6D");
    PAN_TRASORDIATES.set_Header(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, "Distinta n.");
    PAN_TRASORDIATES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, "");
    PAN_TRASORDIATES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_TRASORDIATES.SetFlags(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_TRASORDIATES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, "EF8522F4-69B6-488A-A8E4-BAD75FE9C5BE");
    PAN_TRASORDIATES.set_Header(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, "Elabora");
    PAN_TRASORDIATES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_TRASORDIATES.SetImage(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, 0, "button1.gif", false);
    PAN_TRASORDIATES.SetFlags(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_TRASORDIATES_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, MyGlb.PANEL_LIST, 24);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, MyGlb.PANEL_LIST, 1);
    PAN_TRASORDIATES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, MyGlb.PANEL_FORM, 60, 40, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, MyGlb.PANEL_FORM, 28);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, MyGlb.PANEL_FORM, 1);
    PAN_TRASORDIATES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_TRASORDIATES.SetFieldPage(PFL_TRASORDIATES_DAL, -1, GRP_TRASORDIATES_ORDINATIVI);
    PAN_TRASORDIATES.SetFieldPanel(PFL_TRASORDIATES_DAL, PPQRY_NEWTABLE46, "A.ROWNAMEDAL", "ROWNAMEDAL", 1, 5, 0, -13997);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, MyGlb.PANEL_LIST, 104, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, MyGlb.PANEL_LIST, 20);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, MyGlb.PANEL_LIST, 1);
    PAN_TRASORDIATES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, MyGlb.PANEL_LIST, "Al");
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, MyGlb.PANEL_FORM, 228, 40, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, MyGlb.PANEL_FORM, 24);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, MyGlb.PANEL_FORM, 1);
    PAN_TRASORDIATES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_AL, MyGlb.PANEL_FORM, "Al");
    PAN_TRASORDIATES.SetFieldPage(PFL_TRASORDIATES_AL, -1, GRP_TRASORDIATES_ORDINATIVI);
    PAN_TRASORDIATES.SetFieldPanel(PFL_TRASORDIATES_AL, PPQRY_NEWTABLE46, "A.ROWNAMEAL", "ROWNAMEAL", 1, 5, 0, -13997);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, MyGlb.PANEL_LIST, 288, 20, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, MyGlb.PANEL_FORM, 16, 32, 12, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELLABE, MyGlb.PANEL_FORM, 2);
    PAN_TRASORDIATES.SetFieldPage(PFL_TRASORDIATES_NEWPANELLABE, -1, GRP_TRASORDIATES_ORDINATIVI);
    PAN_TRASORDIATES.SetFieldPanel(PFL_TRASORDIATES_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, MyGlb.PANEL_LIST, 296, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, MyGlb.PANEL_FORM, 344, 80, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_TRASORDIATES.SetFieldPage(PFL_TRASORDIATES_NEWPANELABE1, -1, GRP_TRASORDIATES_ORDINATIVI);
    PAN_TRASORDIATES.SetFieldPanel(PFL_TRASORDIATES_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, MyGlb.PANEL_LIST, 44);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_TRASORDIATES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, MyGlb.PANEL_FORM, 44, 64, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_TRASORDIATES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_TRASORDIATES.SetFieldPage(PFL_TRASORDIATES_UFFICIO, -1, GRP_TRASORDIATES_ORDINATIVI);
    PAN_TRASORDIATES.SetFieldPanel(PFL_TRASORDIATES_UFFICIO, PPQRY_NEWTABLE46, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 10, 0, -13997);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, MyGlb.PANEL_LIST, 112);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, MyGlb.PANEL_LIST, 1);
    PAN_TRASORDIATES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, MyGlb.PANEL_LIST, "Distinta n.");
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, MyGlb.PANEL_FORM, 24, 88, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, MyGlb.PANEL_FORM, 64);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, MyGlb.PANEL_FORM, 1);
    PAN_TRASORDIATES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_DISTINNUMERO, MyGlb.PANEL_FORM, "Distinta n.");
    PAN_TRASORDIATES.SetFieldPage(PFL_TRASORDIATES_DISTINNUMERO, -1, GRP_TRASORDIATES_ORDINATIVI);
    PAN_TRASORDIATES.SetFieldPanel(PFL_TRASORDIATES_DISTINNUMERO, PPQRY_NEWTABLE46, "A.ROWNAMDISNUM", "ROWNAMDISNUM", 1, 5, 0, -13997);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, MyGlb.PANEL_LIST, 140, 72, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_TRASORDIATES.SetRect(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, MyGlb.PANEL_FORM, 280, 128, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TRASORDIATES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_TRASORDIATES.SetNumRow(MyGlb.OBJ_FIELD, PFL_TRASORDIATES_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_TRASORDIATES.SetFieldPage(PFL_TRASORDIATES_ELABORA, -1, -1);
    PAN_TRASORDIATES.SetFieldPanel(PFL_TRASORDIATES_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_TRASORDIATES_InitQueries()
  {
    StringBuffer SQL;

    PAN_TRASORDIATES.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_TRASORDIATES.SetQuery(PPQRY_T53, 0, SQL, PFL_TRASORDIATES_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_TRASORDIATES.SetQuery(PPQRY_T53, 1, SQL, PFL_TRASORDIATES_UFFICIO, "");
    PAN_TRASORDIATES.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TRASORDIATES.SetIMDB(IMDB, "PQRY_NEWTABLE46", true);
    PAN_TRASORDIATES.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_TRASORDIATES.SetQueryIMDB(PPQRY_NEWTABLE46, IMDBDef15.PQRY_NEWTABLE46_RS, IMDBDef6.TBL_NEWTABLE50);
    JustLoaded = true;
    PAN_TRASORDIATES.SetFieldPrimaryIndex(PFL_TRASORDIATES_DAL, IMDBDef6.FLD_NEWTABLE50_ROWNAMEDAL);
    PAN_TRASORDIATES.SetFieldPrimaryIndex(PFL_TRASORDIATES_AL, IMDBDef6.FLD_NEWTABLE50_ROWNAMEAL);
    PAN_TRASORDIATES.SetFieldPrimaryIndex(PFL_TRASORDIATES_UFFICIO, IMDBDef6.FLD_NEWTABLE50_ROWNAMEUFFIC);
    PAN_TRASORDIATES.SetFieldPrimaryIndex(PFL_TRASORDIATES_DISTINNUMERO, IMDBDef6.FLD_NEWTABLE50_ROWNAMDISNUM);
    PAN_TRASORDIATES.SetMasterTable(0, "NEWTABLE50");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TRASORDIATES.Status() == 2)
    {
      int oldListQBE = PAN_TRASORDIATES.iUseListQBE;
      PAN_TRASORDIATES.iUseListQBE = 0;
      PAN_TRASORDIATES.PanelCommand(Glb.PCM_SEARCH);
      PAN_TRASORDIATES.PanelCommand(Glb.PCM_FIND);
      PAN_TRASORDIATES.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TRASORDIATES) PAN_TRASORDIATES_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TRASORDIATES) PAN_TRASORDIATES_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TRASORDIATES) PAN_TRASORDIATES_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TRASORDIATES) PAN_TRASORDIATES_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TRASORDIATES) PAN_TRASORDIATES_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
