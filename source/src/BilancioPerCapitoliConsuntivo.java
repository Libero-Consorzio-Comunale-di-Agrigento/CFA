// **********************************************
// Bilancio Per Capitoli Consuntivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class BilancioPerCapitoliConsuntivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_PROGRSTAMPA = 0;
  private static int PFL_PARAM_MISSIOTITOLO = 1;
  private static int PFL_PARAM_PROGRATIPOLO = 2;
  private static int PFL_PARAM_UNITAORGANIZ = 3;
  private static int PFL_PARAM_NUMERDIPAGIN = 4;
  private static int PFL_PARAM_SUDDSUPUO = 5;
  private static int PFL_PARAM_ETICHEELABOR = 6;
  private static int PFL_PARAM_SIGLA = 7;
  private static int PFL_PARAM_NOMEREPORT = 8;
  private static int PFL_PARAM_RAGGRUPPAMEN = 9;

  private static int PPQRY_PARAM171 = 0;

  private static int PPQRY_TIPISTAMCAPA = 1;

  private static int PPQRY_TIPISTAMCAP1 = 2;
  private static int PPQRY_VISTMISSPRO1 = 3;
  private static int PPQRY_VISTMISSPROG = 4;
  private static int PPQRY_CAPUO = 5;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM177(IMDB);
    //
    //
    Init_PQRY_PARAM171(IMDB);
    Init_PQRY_PARAM171_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM177(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM177, 9);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM177, "TBL_PARAM177");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAMISSTITO, "PARAMISSTITO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAMISSTITO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAPROGTIPO, "PARAPROGTIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAPROGTIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARASUDSUPUO, "PARASUDSUPUO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARASUDSUPUO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAMSIGLA, "PARAMSIGLA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAMSIGLA,5,20,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAPROGUNIT, "PARAPROGUNIT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARAPROGUNIT,3,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM177,IMDBDef3.FLD_PARAM177_PARSTANUDIPA,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM177, 0);
  }

  private static void Init_PQRY_PARAM171(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM171, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM171, "PQRY_PARAM171");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARAMISSTITO, "PARAMISSTITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARAMISSTITO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARAPROGTIPO, "PARAPROGTIPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARAPROGTIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARASUDSUPUO, "PARASUDSUPUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARASUDSUPUO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARAPROGUNIT, "PARAPROGUNIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARAPROGUNIT,3,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171,IMDBDef12.PQSL_PARAM171_PARSTANUDIPA,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAM171, 0);
  }

  private static void Init_PQRY_PARAM171_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM171_RS, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM171_RS, "PQRY_PARAM171_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARAMISSTITO, "PARAMISSTITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARAMISSTITO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARAPROGTIPO, "PARAPROGTIPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARAPROGTIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARASUDSUPUO, "PARASUDSUPUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARASUDSUPUO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARAPROGUNIT, "PARAPROGUNIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARAPROGUNIT,3,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM171_RS,IMDBDef12.PQSL_PARAM171_PARSTANUDIPA,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public BilancioPerCapitoliConsuntivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public BilancioPerCapitoliConsuntivo()
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
    FormIdx = MyGlb.FRM_BILPERCAPCON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D2025C20-A650-48B6-B1A1-C45E54FBC157";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 480;
    DesignHeight = 282;
    set_Caption(new IDVariant("Bilancio per Capitoli"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 480;
    Frames[1].Height = 256;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 256;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 480-MyGlb.PAN_OFFS_X, 256-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D4280BD6-1A97-48D7-951D-C13FBA3A52F5");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1076, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM177, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        BILPERCAPCON_PARAM171();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof BilancioPerCapitoliConsuntivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BilancioPerCapitoliConsuntivo.class.getName() : (Glb.ClassWithPackage(BilancioPerCapitoliConsuntivo.class) ? BilancioPerCapitoliConsuntivo.class.getName().substring(BilancioPerCapitoliConsuntivo.class.getPackage().getName().length() + 1) : BilancioPerCapitoliConsuntivo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_PROGRSTAMPA)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMSIGLA, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))));
        if (IDL.Find((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_RAGGRUPPAMEN))), (new IDVariant("Entrate"))).compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_TITOLO = new IDVariant(0,IDVariant.STRING);
          v_TITOLO = (new IDVariant("Titolo"));
          IDVariant v_TIPOLOGIA = new IDVariant(0,IDVariant.STRING);
          v_TIPOLOGIA = (new IDVariant("Tipologia"));
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_MISSIOTITOLO, new IDVariant(v_TITOLO).stringValue());
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_PROGRATIPOLO, new IDVariant(v_TIPOLOGIA).stringValue());
          if (IMDB.Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAENTRSPES, 0).compareTo((new IDVariant("E")), true)!=0)
          {
            IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAENTRSPES, 0, (new IDVariant("E")));
            IMDB.set_Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAMISSTITO, 0, (new IDVariant("-1")));
            IMDB.set_Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAPROGTIPO, 0, (new IDVariant("-1")));
          }
        }
        else if (IDL.Find((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_RAGGRUPPAMEN))), (new IDVariant("Spese"))).compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_MISSIONE = new IDVariant(0,IDVariant.STRING);
          v_MISSIONE = (new IDVariant("Missione"));
          IDVariant v_PROGRAMMA = new IDVariant(0,IDVariant.STRING);
          v_PROGRAMMA = (new IDVariant("Programma"));
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_MISSIOTITOLO, new IDVariant(v_MISSIONE).stringValue());
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_PROGRATIPOLO, new IDVariant(v_PROGRAMMA).stringValue());
          if (IMDB.Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAENTRSPES, 0).compareTo((new IDVariant("S")), true)!=0)
          {
            IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAENTRSPES, 0, (new IDVariant("S")));
            IMDB.set_Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAMISSTITO, 0, (new IDVariant("-1")));
            IMDB.set_Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAPROGTIPO, 0, (new IDVariant("-1")));
          }
        }
        IMDB.set_Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAPROGUNIT, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      }
      if (Column.equals((new IDVariant(PFL_PARAM_MISSIOTITOLO)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAMISSTITO, 0),(new IDVariant("-1"))).equals((new IDVariant("-1")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAMISSTITO, 0, (new IDVariant("-1")));
        }
        IMDB.set_Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAPROGTIPO, 0, (new IDVariant("-1")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliConsuntivo", "ParamOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (((IMDB.Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMSIGLA, 0).equals((new IDVariant("SBCMPTMUOS")), true)) || (IMDB.Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMSIGLA, 0).equals((new IDVariant("SBCTTCUOE")), true))) && !(IDL.IsNull(MainFrm.SUDDIVISIONE_UNITA_SUP)))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if ((IMDB.Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMSIGLA, 0).equals((new IDVariant("SBCMPTMUOS")), true)) || (IMDB.Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMSIGLA, 0).equals((new IDVariant("SBCTTCUOE")), true)))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliConsuntivo", "ParamOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  private int EtichettaElabora ()
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
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SBCTTE")), true) || (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SBCTTCE")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILCONSCAPE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAMISSTITO, 0), IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAPROGTIPO, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SBCMPTS")), true) || (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SBCMPTMS")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILCONSCAPS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAMISSTITO, 0), IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAPROGTIPO, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SBCMPTMUOS")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILCONSCAPSUO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAMISSTITO, 0), IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAPROGTIPO, 0), IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAPROGUNIT, 0));
      }
      else
      {
        return 0;
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("TITOLO")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAMISSTITO, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("TIPOLOGIA")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARAPROGTIPO, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("SUP_UO")), IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARASUDSUPUO, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef12.PQRY_PARAM171, IMDBDef12.PQSL_PARAM171_PARSTANUDIPA, 0));
        MainFrm.LanciaStampaJasper((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliConsuntivo", "EtichettaElabora", _e);
      return -1;
    }
  }

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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliConsuntivo", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMISSTITO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAPROGTIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAENTRSPES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARASUDSUPUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMSIGLA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAPROGUNIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARSTANUDIPA, 0, new IDVariant());
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
      IDVariant v_TIPOSTAMPREV = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_STAMPE_PREV as ESETIPSTAPRE ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TIPOSTAMPREV = QV.Get("ESETIPSTAPRE", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMESERCIZ, 0, (new IDVariant(2014)));
      IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMISSTITO, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAPROGTIPO, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAPROGUNIT, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARASUDSUPUO, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARSTANUDIPA, 0, (new IDVariant("SI")));
      if (!(IDL.IsNull(MainFrm.SUDDIVISIONE_UNITA_SUP)))
      {
        IDVariant v_VDESCRSUP1 = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as SUSTENTIDESC ");
        SQL.append("from ");
        SQL.append("  SO4_SUST_ENTI A ");
        SQL.append("where (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VDESCRSUP1 = QV.Get("SUSTENTIDESC", IDVariant.STRING) ;
        }
        QV.Close();
        PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_SUDDSUPUO, new IDVariant(v_VDESCRSUP1).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliConsuntivo", "Load", _e);
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void BILPERCAPCON_PARAM171() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAM171_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM177, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM177, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAM171_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAM171_RS, 0, IMDBDef3.TBL_PARAM177, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM171_RS, 0, 0, IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAPROGSTAM, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM171_RS, 1, 0, IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAMISSTITO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM171_RS, 2, 0, IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAPROGTIPO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM171_RS, 3, 0, IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARASUDSUPUO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM171_RS, 4, 0, IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARAPROGUNIT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM171_RS, 5, 0, IMDBDef3.TBL_PARAM177, IMDBDef3.FLD_PARAM177_PARSTANUDIPA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM177, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM177, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM177, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAM171_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "5315FED6-C253-4BDD-9127-D916B4C19090");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "Stampa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, "FF31126E-1A57-4A21-A95E-C9747A3EB329");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, "Missione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, "B1A923C6-E806-4895-8EDA-C66E4D47FBBA");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, "Programma");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, "9DAD1E55-DC54-451E-ACD6-E3CC77D5AACC");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "DA4190D7-19B9-4D1A-9D7B-B1E03AF666F5");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "Numero di pagina");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, "4047464B-E7F5-40F2-9F70-8ED0733B049D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, "Suddivisione Sup.");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "9DADE8F0-1899-487A-9B7A-77A9B0AD5E51");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "A51D84E9-CE42-4D97-B86D-04849AF40640");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "SIGLA");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "79B3DD32-F06D-4E1F-9A6F-971651F60658");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "NOME REPORT");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, "25607C5D-9790-489D-93A1-072246F87389");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, "RAGGRUPPAMENTO");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 0, 36, 544, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, "Stampa");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 72, 24, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, "Stampa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROGRSTAMPA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROGRSTAMPA, PPQRY_PARAM171, "A.PARAPROGSTAM", "PARAPROGSTAM", 3, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_LIST, "Missione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_FORM, 44, 48, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_FORM, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_FORM, "Missione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_MISSIOTITOLO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_MISSIOTITOLO, PPQRY_PARAM171, "A.PARAMISSTITO", "PARAMISSTITO", 5, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_LIST, 132);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_LIST, "Programma");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_FORM, 4, 72, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_FORM, 132);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_FORM, "Programma");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROGRATIPOLO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROGRATIPOLO, PPQRY_PARAM171, "A.PARAPROGTIPO", "PARAPROGTIPO", 5, 5, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, 16, 96, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_UNITAORGANIZ, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_UNITAORGANIZ, PPQRY_PARAM171, "A.PARAPROGUNIT", "PARAPROGUNIT", 3, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 156);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, "Numero di pagina");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 28, 120, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 108);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, "Numero di pagina");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMERDIPAGIN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMERDIPAGIN, PPQRY_PARAM171, "A.PARSTANUDIPA", "PARSTANUDIPA", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUMERDIPAGIN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUMERDIPAGIN, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_LIST, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_LIST, "Suddivisione Sup.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_FORM, 4, 120, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_FORM, 428);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_FORM, "Suddivisione Sup.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SUDDSUPUO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SUDDSUPUO, PPQRY_PARAM171, "A.PARASUDSUPUO", "PARASUDSUPUO", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SUDDSUPUO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SUDDSUPUO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 516, 696, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 376, 160, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHEELABOR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 168);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, "SIGLA");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 4, 92, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 168);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, "SIGLA");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SIGLA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SIGLA, PPQRY_TIPISTAMCAPA, "A.SIGLA", "TIPSTACAPSIG", 5, 20, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 212);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, "NOME REPORT");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 4, 116, 724, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 212);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, "NOME REPORT");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NOMEREPORT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NOMEREPORT, PPQRY_TIPISTAMCAPA, "A.NOME_REPORT", "TIPSTACANORE", 5, 100, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 240);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_LIST, "RAGGRUPPAMENTO");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 4, 176, 752, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 240);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_FORM, "RAGGRUPPAMENTO");
    PAN_PARAM.SetFieldPage(PFL_PARAM_RAGGRUPPAMEN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_RAGGRUPPAMEN, PPQRY_TIPISTAMCAPA, "A.RAGGRUPPAMENTO", "TIPSTACAPRAG", 5, 100, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SIGLA as TIPSTACAPSIG, ");
    SQL.append("  A.NOME_REPORT as TIPSTACANORE, ");
    SQL.append("  A.RAGGRUPPAMENTO as TIPSTACAPRAG ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_CAPAGG A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMCAPA, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISTAMCAPA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_TIPISTAMCAPA, "TIPI_STAMPE_CAPAGG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPSTACAPPRO, ");
    SQL.append("  A.ORDINE as TIPSTACAPORD, ");
    SQL.append("  A.RAGGRUPPAMENTO || '' as GROUPID, ");
    SQL.append("  A.DESCRIZIONE as TIPSTACAPDES ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_CAPAGG A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAM177.PARAMESERCIZ~~) ");
    SQL.append("and   (A.TIPO = 'CNS') ");
    SQL.append("order by 2, 3 ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMCAP1, 0, SQL, PFL_PARAM_PROGRSTAMPA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPSTACAPPRO, ");
    SQL.append("  A.ORDINE as TIPSTACAPORD, ");
    SQL.append("  A.RAGGRUPPAMENTO || '' as GROUPID, ");
    SQL.append("  A.DESCRIZIONE as TIPSTACAPDES ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_CAPAGG A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAM177.PARAMESERCIZ~~) ");
    SQL.append("and   (A.TIPO = 'CNS') ");
    SQL.append("order by 2, 3 ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMCAP1, 1, SQL, PFL_PARAM_PROGRSTAMPA, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISTAMCAP1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  TO_CHAR ( A.MISSIONE ) as ORDINAMENTO, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = ~~PARAMISSTITO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM177.PARAENTRSPES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TITOLO, ");
    SQL.append("  TO_CHAR ( B.TITOLO ), ");
    SQL.append("  B.TITOLO || ' - ' || B.DES_TITOLO ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.TITOLO = ~~PARAMISSTITO~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM177.PARAENTRSPES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where ('-1' = ~~PARAMISSTITO~~) ");
    PAN_PARAM.SetQuery(PPQRY_VISTMISSPRO1, 0, SQL, PFL_PARAM_MISSIOTITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  TO_CHAR ( A.MISSIONE ) as ORDINAMENTO, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM177.PARAENTRSPES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TITOLO, ");
    SQL.append("  TO_CHAR ( B.TITOLO ), ");
    SQL.append("  B.TITOLO || ' - ' || B.DES_TITOLO ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM177.PARAENTRSPES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_PARAM.SetQuery(PPQRY_VISTMISSPRO1, 1, SQL, PFL_PARAM_MISSIOTITOLO, "");
    PAN_PARAM.SetQueryDB(PPQRY_VISTMISSPRO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  TO_CHAR ( A.PROGRAMMA ) as ORDINAMENTO, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPRODES ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.PROGRAMMA = ~~PARAPROGTIPO~~) ");
    SQL.append("and   (A.MISSIONE = ~~PARAMISSTITO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM177.PARAENTRSPES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TIPOLOGIA, ");
    SQL.append("  TO_CHAR ( B.TIPOLOGIA ), ");
    SQL.append("  B.TIPOLOGIA || ' - ' || B.DES_TIPOLOGIA ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.TIPOLOGIA = ~~PARAPROGTIPO~~) ");
    SQL.append("and   (B.TITOLO = ~~PARAMISSTITO~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM177.PARAENTRSPES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where ('-1' = ~~PARAPROGTIPO~~) ");
    PAN_PARAM.SetQuery(PPQRY_VISTMISSPROG, 0, SQL, PFL_PARAM_PROGRATIPOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  TO_CHAR ( A.PROGRAMMA ) as ORDINAMENTO, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPRODES ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = ~~PARAMISSTITO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM177.PARAENTRSPES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TIPOLOGIA, ");
    SQL.append("  TO_CHAR ( B.TIPOLOGIA ), ");
    SQL.append("  B.TIPOLOGIA || ' - ' || B.DES_TIPOLOGIA ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.TITOLO = ~~PARAMISSTITO~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM177.PARAENTRSPES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_PARAM.SetQuery(PPQRY_VISTMISSPROG, 1, SQL, PFL_PARAM_PROGRATIPOLO, "");
    PAN_PARAM.SetQueryDB(PPQRY_VISTMISSPROG, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARAPROGUNIT~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (((A.E_S = 'S') AND (~~TBL_PARAM177.PARAMSIGLA~~ IN ('SBCMPTMUOS', 'SBCMPTMUOSU', 'SAAMPTMUOSU', 'SAPMPTMUOSU', 'SAPMPTMUOS', 'SAAMPTMUOS'))) OR ((A.E_S = 'E') AND (~~TBL_PARAM177.PARAMSIGLA~~ IN ('SBCTTCUOE', 'SAATTCEUO', 'SAPTTCEUO')))) ");
    SQL.append("and   ((A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND (~~TBL_PARAM177.PARAMSIGLA~~ IN ('SBCTTCUOE', 'SAATTCEUO', 'SAPTTCEUO', 'SBCMPTMUOS', 'SAPMPTMUOS', 'SAAMPTMUOS'))) OR (A.TIPO_UNITA_ORGANIZZATIVA = 'U' AND (~~TBL_PARAM177.PARAMSIGLA~~ IN ('SBCMPTMUOSU', 'SAAMPTMUOSU', 'SAPMPTMUOSU')))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (-1 = ~~PARAPROGUNIT~~) ");
    SQL.append("order by 2 ");
    PAN_PARAM.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_PARAM_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (((A.E_S = 'S') AND (~~TBL_PARAM177.PARAMSIGLA~~ IN ('SBCMPTMUOS', 'SBCMPTMUOSU', 'SAAMPTMUOSU', 'SAPMPTMUOSU', 'SAPMPTMUOS', 'SAAMPTMUOS'))) OR ((A.E_S = 'E') AND (~~TBL_PARAM177.PARAMSIGLA~~ IN ('SBCTTCUOE', 'SAATTCEUO', 'SAPTTCEUO')))) ");
    SQL.append("and   ((A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND (~~TBL_PARAM177.PARAMSIGLA~~ IN ('SBCTTCUOE', 'SAATTCEUO', 'SAPTTCEUO', 'SBCMPTMUOS', 'SAPMPTMUOS', 'SAAMPTMUOS'))) OR (A.TIPO_UNITA_ORGANIZZATIVA = 'U' AND (~~TBL_PARAM177.PARAMSIGLA~~ IN ('SBCMPTMUOSU', 'SAAMPTMUOSU', 'SAPMPTMUOSU')))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_PARAM.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_PARAM_UNITAORGANIZ, "");
    PAN_PARAM.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM171", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM171, IMDBDef12.PQRY_PARAM171_RS, IMDBDef3.TBL_PARAM177);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROGRSTAMPA, IMDBDef3.FLD_PARAM177_PARAPROGSTAM);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_MISSIOTITOLO, IMDBDef3.FLD_PARAM177_PARAMISSTITO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROGRATIPOLO, IMDBDef3.FLD_PARAM177_PARAPROGTIPO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_UNITAORGANIZ, IMDBDef3.FLD_PARAM177_PARAPROGUNIT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMERDIPAGIN, IMDBDef3.FLD_PARAM177_PARSTANUDIPA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SUDDSUPUO, IMDBDef3.FLD_PARAM177_PARASUDSUPUO);
    PAN_PARAM.SetMasterTable(0, "PARAM177");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
