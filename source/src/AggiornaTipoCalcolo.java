// **********************************************
// Aggiorna Tipo Calcolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornaTipoCalcolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_TIPOCLASSIF = 0;
  private static int PFL_PARS_TIPOCALCOLO = 1;
  private static int PFL_PARS_ESCLUSIONE = 2;
  private static int PFL_PARS_ETICHEELABOR = 3;

  private static int PPQRY_PARS44 = 0;

  private static int PPQRY_FSCTIPICALCO = 1;


  IDPanel PAN_PARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS46(IMDB);
    Init_TBL_IMDAGGTIPCAL(IMDB);
    //
    //
    Init_PQRY_PARS44(IMDB);
    Init_PQRY_PARS44_RS(IMDB);
    Init_QRY_IMDAGGTIPCA1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS46(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS46, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS46, "TBL_PARS46");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS46,IMDBDef3.FLD_PARS46_NOMOGGTIPCLA, "NOMOGGTIPCLA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS46,IMDBDef3.FLD_PARS46_NOMOGGTIPCLA,12,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS46,IMDBDef3.FLD_PARS46_NOMOGGTIPCAL, "NOMOGGTIPCAL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS46,IMDBDef3.FLD_PARS46_NOMOGGTIPCAL,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS46,IMDBDef3.FLD_PARS46_NOMEOGGEESCL, "NOMEOGGEESCL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS46,IMDBDef3.FLD_PARS46_NOMEOGGEESCL,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS46, 0);
  }

  private static void Init_TBL_IMDAGGTIPCAL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_IMDAGGTIPCAL, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_IMDAGGTIPCAL, "TBL_IMDAGGTIPCAL");
    IMDB.set_FldCode(IMDBDef3.TBL_IMDAGGTIPCAL,IMDBDef3.FLD_IMDAGGTIPCAL_NOMOGGTIPCAT, "NOMOGGTIPCAT");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDAGGTIPCAL,IMDBDef3.FLD_IMDAGGTIPCAL_NOMOGGTIPCAT,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDAGGTIPCAL,IMDBDef3.FLD_IMDAGGTIPCAL_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDAGGTIPCAL,IMDBDef3.FLD_IMDAGGTIPCAL_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDAGGTIPCAL,IMDBDef3.FLD_IMDAGGTIPCAL_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDAGGTIPCAL,IMDBDef3.FLD_IMDAGGTIPCAL_NOMEOGGEARTI,1,2,0);
  }

  private static void Init_PQRY_PARS44(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS44, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS44, "PQRY_PARS44");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS44,IMDBDef11.PQSL_PARS44_NOMOGGTIPCLA, "NOMOGGTIPCLA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS44,IMDBDef11.PQSL_PARS44_NOMOGGTIPCLA,12,3,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS44,IMDBDef11.PQSL_PARS44_NOMOGGTIPCAL, "NOMOGGTIPCAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS44,IMDBDef11.PQSL_PARS44_NOMOGGTIPCAL,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS44,IMDBDef11.PQSL_PARS44_NOMEOGGEESCL, "NOMEOGGEESCL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS44,IMDBDef11.PQSL_PARS44_NOMEOGGEESCL,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARS44, 0);
  }

  private static void Init_PQRY_PARS44_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS44_RS, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS44_RS, "PQRY_PARS44_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS44_RS,IMDBDef11.PQSL_PARS44_NOMOGGTIPCLA, "NOMOGGTIPCLA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS44_RS,IMDBDef11.PQSL_PARS44_NOMOGGTIPCLA,12,3,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS44_RS,IMDBDef11.PQSL_PARS44_NOMOGGTIPCAL, "NOMOGGTIPCAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS44_RS,IMDBDef11.PQSL_PARS44_NOMOGGTIPCAL,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS44_RS,IMDBDef11.PQSL_PARS44_NOMEOGGEESCL, "NOMEOGGEESCL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS44_RS,IMDBDef11.PQSL_PARS44_NOMEOGGEESCL,5,2,0);
  }

  private static void Init_QRY_IMDAGGTIPCA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.QRY_IMDAGGTIPCA1, 3);
    IMDB.set_TblCode(IMDBDef11.QRY_IMDAGGTIPCA1, "QRY_IMDAGGTIPCA1");
    IMDB.set_FldCode(IMDBDef11.QRY_IMDAGGTIPCA1,IMDBDef11.QSL_IMDAGGTIPCA1_TC, "TC");
    IMDB.SetFldParams(IMDBDef11.QRY_IMDAGGTIPCA1,IMDBDef11.QSL_IMDAGGTIPCA1_TC,1,5,0);
    IMDB.set_FldCode(IMDBDef11.QRY_IMDAGGTIPCA1,IMDBDef11.QSL_IMDAGGTIPCA1_CCAP, "CCAP");
    IMDB.SetFldParams(IMDBDef11.QRY_IMDAGGTIPCA1,IMDBDef11.QSL_IMDAGGTIPCA1_CCAP,3,16,0);
    IMDB.set_FldCode(IMDBDef11.QRY_IMDAGGTIPCA1,IMDBDef11.QSL_IMDAGGTIPCA1_CART, "CART");
    IMDB.SetFldParams(IMDBDef11.QRY_IMDAGGTIPCA1,IMDBDef11.QSL_IMDAGGTIPCA1_CART,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornaTipoCalcolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornaTipoCalcolo()
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
    FormIdx = MyGlb.FRM_AGGITIPOCALC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CAF83EC9-3FA6-4CA3-958C-E789CD3046B1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 420;
    DesignHeight = 146;
    set_Caption(new IDVariant("Aggiorna Tipo Calcolo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 420;
    Frames[1].Height = 120;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pars";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 120;
    PAN_PARS = new IDPanel(w, this, 1, "PAN_PARS");
    Frames[1].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 420-MyGlb.PAN_OFFS_X, 120-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ADDAF15E-3D07-4692-9131-FB51C41957C9");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 128, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 1;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARS46, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGITIPOCALC_PARS44();
      }
      PAN_PARS.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornaTipoCalcolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornaTipoCalcolo.class.getName() : (Glb.ClassWithPackage(AggiornaTipoCalcolo.class) ? AggiornaTipoCalcolo.class.getName().substring(AggiornaTipoCalcolo.class.getPackage().getName().length() + 1) : AggiornaTipoCalcolo.class.getName()));
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
      if (IMDB.Value(IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMOGGTIPCLA, 0).equals((new IDVariant("TIP")), true) || IMDB.Value(IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMOGGTIPCLA, 0).equals((new IDVariant("CAT")), true))
      {
        ((DefinizioneTipoCalcolo)MainFrm.GetForm(MyGlb.FRM_DEFITIPOCALC,0)).PAN_DEFTIPCATICA.PanelCommand(Glb.PCM_REQUERY);
      }
      else
      {
        ((DefinizioneTipoCalcolo)MainFrm.GetForm(MyGlb.FRM_DEFITIPOCALC,0)).PAN_DEFTIPCALCAP.PanelCommand(Glb.PCM_REQUERY);
      }
      UNLOAD_PARSDELETE();
      UNLOAD_IMDAGGTICADE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaTipoCalcolo", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMOGGTIPCLA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMOGGTIPCAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMEOGGEESCL, 0, new IDVariant());
  }

  // **********************************************************************
  // IMDB Agg Tipo Calcolo: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDAGGTICADE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_IMDAGGTIPCAL);
  }

  // **********************************************************************
  // Pars On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARS_TIPOCALCOLO)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS44, IMDBDef11.PQSL_PARS44_NOMOGGTIPCAL, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARS44, IMDBDef11.PQSL_PARS44_NOMEOGGEESCL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_ESCLUSIONE)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS44, IMDBDef11.PQSL_PARS44_NOMEOGGEESCL, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARS44, IMDBDef11.PQSL_PARS44_NOMOGGTIPCAL, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaTipoCalcolo", "ParsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      ETICHEELABOR_IMDAGGTIPCA1();
      while (!IMDB.Eof(IMDBDef11.QRY_IMDAGGTIPCA1, 0))
      {
        if (IMDB.Value(IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMOGGTIPCLA, 0).equals((new IDVariant("TIP")), true) || IMDB.Value(IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMOGGTIPCLA, 0).equals((new IDVariant("CAT")), true))
        {
          SQL = new StringBuffer();
          SQL.append("update FSC_TIPI_CALC_CLASSIF set ");
          SQL.append("  TIPO_CALCOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS44, IMDBDef11.PQSL_PARS44_NOMOGGTIPCAL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  ESCLUSO = CASE WHEN NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS44, IMDBDef11.PQSL_PARS44_NOMEOGGEESCL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') = 'NO' THEN NULL ELSE 'SI' END ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (TIPOLOGIA_CATEGORIA = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_IMDAGGTIPCA1, IMDBDef11.QSL_IMDAGGTIPCA1_TC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("update FSC_TIPI_CALC_CAP set ");
          SQL.append("  TIPO_CALCOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS44, IMDBDef11.PQSL_PARS44_NOMOGGTIPCAL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  ESCLUSO = CASE WHEN NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS44, IMDBDef11.PQSL_PARS44_NOMEOGGEESCL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') = 'NO' THEN NULL ELSE 'SI' END ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_IMDAGGTIPCA1, IMDBDef11.QSL_IMDAGGTIPCA1_CCAP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_IMDAGGTIPCA1, IMDBDef11.QSL_IMDAGGTIPCA1_CART, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        IMDB.TblMoveNext(IMDBDef11.QRY_IMDAGGTIPCA1, 0);
      }
      MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaTipoCalcolo", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB Agg Tipo Calcolo
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void ETICHEELABOR_IMDAGGTIPCA1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.QRY_IMDAGGTIPCA1);
    IMDB.TblMoveFirst(IMDBDef3.TBL_IMDAGGTIPCAL, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_IMDAGGTIPCAL, 0))
    {
      IMDB.TblAddNew(IMDBDef11.QRY_IMDAGGTIPCA1, 0);
      IMDB.TblLinkRow(IMDBDef11.QRY_IMDAGGTIPCA1, 0, IMDBDef3.TBL_IMDAGGTIPCAL, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_IMDAGGTIPCA1, 0, 0, IMDBDef3.TBL_IMDAGGTIPCAL, IMDBDef3.FLD_IMDAGGTIPCAL_NOMOGGTIPCAT, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_IMDAGGTIPCA1, 1, 0, IMDBDef3.TBL_IMDAGGTIPCAL, IMDBDef3.FLD_IMDAGGTIPCAL_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_IMDAGGTIPCA1, 2, 0, IMDBDef3.TBL_IMDAGGTIPCAL, IMDBDef3.FLD_IMDAGGTIPCAL_NOMEOGGEARTI, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_IMDAGGTIPCAL, 0);
      if (IMDB.Eof(IMDBDef3.TBL_IMDAGGTIPCAL, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_IMDAGGTIPCAL, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.QRY_IMDAGGTIPCA1, 0);
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AGGITIPOCALC_PARS44() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARS44_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS46, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS46, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARS44_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARS44_RS, 0, IMDBDef3.TBL_PARS46, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS44_RS, 0, 0, IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMOGGTIPCLA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS44_RS, 1, 0, IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMOGGTIPCAL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS44_RS, 2, 0, IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMEOGGEESCL, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS46, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS46, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS46, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARS44_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, "6D0B525F-A571-4CED-A62E-01DCE7551BCD");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, "Tipo Classif");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, "7FC3243F-C87C-43AE-89B5-5A0F40B61608");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, "Tipo Calcolo");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, "BA54F389-4B5F-44E1-B1C9-E7C6E0945C41");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, "Esclusione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "CFB8DAB4-F4E1-4583-AF7A-9E2685093B70");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "Elabora");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, MyGlb.PANEL_LIST, 72);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, MyGlb.PANEL_LIST, "Tipo Classif");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, MyGlb.PANEL_FORM, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCLASSIF, MyGlb.PANEL_FORM, "Tipo Classif");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPOCLASSIF, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPOCLASSIF, PPQRY_PARS44, "A.NOMOGGTIPCLA", "NOMOGGTIPCLA", 12, 3, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPOCLASSIF, (new IDVariant("TIP")), "Tipologie", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPOCLASSIF, (new IDVariant("CAT")), "Categorie", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPOCLASSIF, (new IDVariant("CAP")), "Capitoli", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, MyGlb.PANEL_LIST, "Tp. Calc.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, MyGlb.PANEL_FORM, 4, 12, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, MyGlb.PANEL_FORM, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOCALCOLO, MyGlb.PANEL_FORM, "Tipo Calcolo");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPOCALCOLO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPOCALCOLO, PPQRY_PARS44, "A.NOMOGGTIPCAL", "NOMOGGTIPCAL", 5, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, MyGlb.PANEL_LIST, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, MyGlb.PANEL_LIST, "Esclusione");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, MyGlb.PANEL_FORM, 4, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, MyGlb.PANEL_FORM, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESCLUSIONE, MyGlb.PANEL_FORM, "Esclusione");
    PAN_PARS.SetFieldPage(PFL_PARS_ESCLUSIONE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ESCLUSIONE, PPQRY_PARS44, "A.NOMEOGGEESCL", "NOMEOGGEESCL", 5, 2, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_ESCLUSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ESCLUSIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 296, 96, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 316, 52, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEELABOR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as FSCTIPCALTIP, ");
    SQL.append("  A.ORDINAMENTO as FSCTIPCALORD, ");
    SQL.append("  A.DESCRIZIONE as FSCTIPCALDES ");
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALCOLO A ");
    SQL.append("where (A.TIPO = ~~NOMOGGTIPCAL~~) ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_PARS.SetQuery(PPQRY_FSCTIPICALCO, 0, SQL, PFL_PARS_TIPOCALCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as FSCTIPCALTIP, ");
    SQL.append("  A.ORDINAMENTO as FSCTIPCALORD, ");
    SQL.append("  A.DESCRIZIONE as FSCTIPCALDES ");
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALCOLO A ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_PARS.SetQuery(PPQRY_FSCTIPICALCO, 1, SQL, PFL_PARS_TIPOCALCOLO, "");
    PAN_PARS.SetQueryDB(PPQRY_FSCTIPICALCO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS44", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS44, IMDBDef11.PQRY_PARS44_RS, IMDBDef3.TBL_PARS46);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TIPOCLASSIF, IMDBDef3.FLD_PARS46_NOMOGGTIPCLA);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TIPOCALCOLO, IMDBDef3.FLD_PARS46_NOMOGGTIPCAL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ESCLUSIONE, IMDBDef3.FLD_PARS46_NOMEOGGEESCL);
    PAN_PARS.SetMasterTable(0, "PARS46");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
