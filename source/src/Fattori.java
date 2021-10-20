// **********************************************
// Fattori
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Fattori extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FATTORI_FATTORE1 = 0;
  private static int PFL_FATTORI_DESCRIZIONE = 1;
  private static int PFL_FATTORI_TIPO = 2;
  private static int PFL_FATTORI_ETICHETLABEL = 3;
  private static int PFL_FATTORI_DATAVALIDITA = 4;

  private static int PPQRY_FATTORI1 = 0;


  IDPanel PAN_FATTORI;
  CIDREObj BUK_LIBROFATTORI;
  OBook BKW_LIBROFATTORI;
  //
  // Template Pages constants
  private static int BUK_LIBROFATTORI_MST_FATTORMASTRO = 1;
  private static int BUK_LIBROFATTORI_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBROFATTORI_SPAN_PAG = 3;
  private static int BUK_LIBROFATTORI_SPAN_LIBFATFAPANU = 4;
  private static int BUK_LIBROFATTORI_SPAN_DI = 5;
  private static int BUK_LIBROFATTORI_SPAN_LIFAFANUOFPA = 6;
  private static int BUK_LIBROFATTORI_RPTBOX_TESTATPAGINA = 7;
  private static int BUK_LIBROFATTORI_RPTBOX_CORPOPAGINA = 8;
  private static int BUK_LIBROFATTORI_RPTBOX_PIEDEPAGINA = 9;

  //
  // Reports constants
  private static int BUK_LIBROFATTORI_RPT_FATTORREPORT = 10;
  private static int BUK_LIBROFATTORI_SEC_INTESTREPORT = 11;
  private static int BUK_LIBROFATTORI_SEC_INTESTPAGINA = 12;
  private static int BUK_LIBROFATTORI_RPTBOX_TITOLO = 13;
  private static int BUK_LIBROFATTORI_SPAN_FATTORI = 14;
  private static int BUK_LIBROFATTORI_RPTBOX_FATTORHEADER = 15;
  private static int BUK_LIBROFATTORI_SPAN_FATTORE1 = 16;
  private static int BUK_LIBROFATTORI_RPTBOX_DESCRIHEADER = 17;
  private static int BUK_LIBROFATTORI_SPAN_DESCRIZIONE1 = 18;
  private static int BUK_LIBROFATTORI_RPTBOX_TIPOHEADER = 19;
  private static int BUK_LIBROFATTORI_SPAN_TIPO1 = 20;
  private static int BUK_LIBROFATTORI_RPTBOX_DATAFINEVALI = 21;
  private static int BUK_LIBROFATTORI_SPAN_NUOVASPAN = 22;
  private static int BUK_LIBROFATTORI_SEC_DETTAGLIO = 23;
  private static int BUK_LIBROFATTORI_RPTBOX_FATTORE = 24;
  private static int BUK_LIBROFATTORI_SPAN_FATTORE = 25;
  private static int BUK_LIBROFATTORI_RPTBOX_DESCRIZIONE = 26;
  private static int BUK_LIBROFATTORI_SPAN_DESCRIZIONE = 27;
  private static int BUK_LIBROFATTORI_RPTBOX_TIPO = 28;
  private static int BUK_LIBROFATTORI_SPAN_TIPO = 29;
  private static int BUK_LIBROFATTORI_RPTBOX_DATA = 30;
  private static int BUK_LIBROFATTORI_SPAN_FADAVAFALIFA = 31;
  private static int BUK_LIBROFATTORI_SEC_PIEDEPAGINA = 32;
  private static int BUK_LIBROFATTORI_SEC_PIEDEREPORT = 33;

  private static int PFL_FATTORATTRIB_FATTORE = 0;
  private static int PFL_FATTORATTRIB_DESTINAZIONE = 1;
  private static int PFL_FATTORATTRIB_SERATEIRISC = 2;

  private static int PPQRY_FATTORATTRIB = 0;


  IDPanel PAN_FATTORATTRIB;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI560(IMDB);
    //
    //
    Init_PQRY_FATTORI1(IMDB);
    Init_PQRY_FATTORI6(IMDB);
    Init_PQRY_FATTORATTRIB(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI560(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI560, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI560, "TBL_PARAMETRI560");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI560,IMDBDef1.FLD_PARAMETRI560_PARAMLOOKUP, "PARAMLOOKUP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI560,IMDBDef1.FLD_PARAMETRI560_PARAMLOOKUP,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI560,IMDBDef1.FLD_PARAMETRI560_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI560,IMDBDef1.FLD_PARAMETRI560_PARAMTIPO,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI560, 0);
  }

  private static void Init_PQRY_FATTORI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FATTORI1, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_FATTORI1, "PQRY_FATTORI1");
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI1,IMDBDef9.PQSL_FATTORI1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI1,IMDBDef9.PQSL_FATTORI1_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI1,IMDBDef9.PQSL_FATTORI1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI1,IMDBDef9.PQSL_FATTORI1_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI1,IMDBDef9.PQSL_FATTORI1_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI1,IMDBDef9.PQSL_FATTORI1_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI1,IMDBDef9.PQSL_FATTORI1_DATA_VALIDITA, "DATA_VALIDITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI1,IMDBDef9.PQSL_FATTORI1_DATA_VALIDITA,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FATTORI1, 0);
  }

  private static void Init_PQRY_FATTORI6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FATTORI6, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_FATTORI6, "PQRY_FATTORI6");
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI6,IMDBDef9.PQSL_FATTORI6_FATTORFATTOR, "FATTORFATTOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI6,IMDBDef9.PQSL_FATTORI6_FATTORFATTOR,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI6,IMDBDef9.PQSL_FATTORI6_FATTORDESCRI, "FATTORDESCRI");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI6,IMDBDef9.PQSL_FATTORI6_FATTORDESCRI,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI6,IMDBDef9.PQSL_FATTORI6_FATTORITIPO, "FATTORITIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI6,IMDBDef9.PQSL_FATTORI6_FATTORITIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI6,IMDBDef9.PQSL_FATTORI6_FATTDATAVALI, "FATTDATAVALI");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI6,IMDBDef9.PQSL_FATTORI6_FATTDATAVALI,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FATTORI6, 0);
  }

  private static void Init_PQRY_FATTORATTRIB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FATTORATTRIB, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_FATTORATTRIB, "PQRY_FATTORATTRIB");
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORATTRIB,IMDBDef9.PQSL_FATTORATTRIB_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORATTRIB,IMDBDef9.PQSL_FATTORATTRIB_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORATTRIB,IMDBDef9.PQSL_FATTORATTRIB_DESTINAZIONE, "DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORATTRIB,IMDBDef9.PQSL_FATTORATTRIB_DESTINAZIONE,5,11,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORATTRIB,IMDBDef9.PQSL_FATTORATTRIB_SE_RATEI_RISC, "SE_RATEI_RISC");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORATTRIB,IMDBDef9.PQSL_FATTORATTRIB_SE_RATEI_RISC,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FATTORATTRIB, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Fattori(MyWebEntryPoint w, IMDBObj imdb)
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
  public Fattori()
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
    FormIdx = MyGlb.FRM_FATTORI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F9BD486E-5262-4255-8255-19E24E658A5F";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 422;
    set_Caption(new IDVariant("Fattori"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 396;
    Frames[1].Caption = "Fattori";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 396;
    PAN_FATTORI = new IDPanel(w, this, 1, "PAN_FATTORI");
    Frames[1].Content = PAN_FATTORI;
    PAN_FATTORI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FATTORI.VS = MainFrm.VisualStyleList;
    PAN_FATTORI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 396-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBROFATTORI != null)
      PAN_FATTORI.SetBook(BUK_LIBROFATTORI);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D26C0695-FC6D-4C0F-A856-D1491C1D9ABC");
    PAN_FATTORI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 740, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FATTORI.InitStatus = 2;
    PAN_FATTORI_Init();
    PAN_FATTORI_InitFields();
    PAN_FATTORI_InitQueries();
    BKW_LIBROFATTORI = new OBook(this);
    BUK_LIBROFATTORI = new CIDREObj(BKW_LIBROFATTORI);
    BKW_LIBROFATTORI.iGuid = "A3D7700E-521F-4BC3-A860-5A3742577ACD";
    BKW_LIBROFATTORI.Code = "BUK_LIBROFATTORI";
    BKW_LIBROFATTORI.BookObj = BUK_LIBROFATTORI;
    BKW_LIBROFATTORI.InitDefMasks();
    BUK_LIBROFATTORI.InitBook(1, 1245441, "Libro Fattori", IMDB, MainFrm.VisualStyleList);
    BUK_LIBROFATTORI.InitHTML();
    BUK_LIBROFATTORI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBROFATTORI.Book.SetMainFrm(MainFrm);
    BUK_LIBROFATTORI.SetRTCGuid(0, "A3D7700E-521F-4BC3-A860-5A3742577ACD");
    BUK_LIBROFATTORI.SetObjCode(0, "LIBROFATTORI");
    if (PAN_FATTORI != null)
      PAN_FATTORI.SetBook(BUK_LIBROFATTORI);
    BUK_LIBROFATTORI_MST_FATTORMASTRO_Init();
    BUK_LIBROFATTORI_RPT_FATTORREPORT_Init();
    BUK_LIBROFATTORI_InitLinks();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_FATTORI.SetSubFrame(PFL_FATTORI_ETICHETLABEL,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "FATTORI ATTRIBUTI";
    Frames[2].Parent = this;
    PAN_FATTORATTRIB = new IDPanel(w, this, 2, "PAN_FATTORATTRIB");
    Frames[2].Content = PAN_FATTORATTRIB;
    PAN_FATTORATTRIB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FATTORATTRIB.VS = MainFrm.VisualStyleList;
    PAN_FATTORATTRIB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3B4E9D41-D796-4B52-B6A7-510450ABA231");
    PAN_FATTORATTRIB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 88, 156, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_FATTORATTRIB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTORATTRIB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FATTORATTRIB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FATTORATTRIB.InitStatus = 2;
    PAN_FATTORATTRIB_Init();
    PAN_FATTORATTRIB_InitFields();
    PAN_FATTORATTRIB_InitQueries();
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
      PAN_FATTORI.UpdatePanel(MainFrm);
      PAN_FATTORATTRIB.UpdatePanel(MainFrm);
      // BUK_LIBROFATTORI.UpdateBook();
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
    if (Code.equals("BUK_LIBROFATTORI")) return BUK_LIBROFATTORI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Fattori);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Fattori.class.getName() : (Glb.ClassWithPackage(Fattori.class) ? Fattori.class.getName().substring(Fattori.class.getPackage().getName().length() + 1) : Fattori.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Fattori On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FATTORI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FATTORI);
      // 
      // Fattori On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_FATTORI.set_ToolTip(Glb.OBJ_FIELD,PFL_FATTORI_DESCRIZIONE,(new IDVariant(PAN_FATTORI.FieldText(PFL_FATTORI_DESCRIZIONE))).stringValue()); 
      if (PAN_FATTORI.IsNewRow())
      {
        PAN_FATTORI.SetFlags (Glb.OBJ_FIELD, PFL_FATTORI_FATTORE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FATTORI.SetFlags (Glb.OBJ_FIELD, PFL_FATTORI_FATTORE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "FattoriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Fattori After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_FATTORI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fattori After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        if (new IDVariant(PAN_FATTORATTRIB.Status()).compareTo((new IDVariant(2)), true)!=0)
        {
          PAN_FATTORATTRIB.PanelCommand(Glb.PCM_UPDATE);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "FattoriAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Fattori On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_FATTORI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fattori On Change Row Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAMETRI560, IMDBDef1.FLD_PARAMETRI560_PARAMLOOKUP, 0),(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0)
      {
        if (IMDB.Value(IMDBDef9.PQRY_FATTORI1, IMDBDef9.PQSL_FATTORI1_TIPO, 0).equals((new IDVariant("E")), true))
        {
          PAN_FATTORI.SetFlags (Glb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_FATTORI.SetFlags (Glb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "FattoriOnChangeRow", _e);
    }
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
      IDVariant v_TIPOFATTORI = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI560, IMDBDef1.FLD_PARAMETRI560_PARAMLOOKUP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_FATTORI.set_Locked((new IDVariant(-1)).booleanValue());
        PAN_FATTORI.SetFlags (Glb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue(MainFrm.SIBEC,(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_FATTORATTRIB.SetFlags (Glb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.OBJECT_TYPE as USEOBJOBJTYP ");
      SQL.append("from ");
      SQL.append("  USER_OBJECTS A ");
      SQL.append("where (A.OBJECT_NAME = 'FATTORI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TIPOFATTORI = QV.Get("USEOBJOBJTYP", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_TIPOFATTORI.equals((new IDVariant("TABLE")), true))
      {
        PAN_FATTORI.SetFlags (Glb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FATTORI.SetFlags (Glb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "Load", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI560, IMDBDef1.FLD_PARAMETRI560_PARAMLOOKUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI560, IMDBDef1.FLD_PARAMETRI560_PARAMTIPO, 0, new IDVariant());
  }

  // **********************************************************************
  // FATTORI ATTRIBUTI Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FATTORATTRIB_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // FATTORI ATTRIBUTI Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef9.PQRY_FATTORATTRIB, IMDBDef9.PQSL_FATTORATTRIB_FATTORE, 0, IMDB.Value(IMDBDef9.PQRY_FATTORI1, IMDBDef9.PQSL_FATTORI1_FATTORE, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "FATTORIATTRIBUTIBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // FATTORI ATTRIBUTI Destinazione Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_FATTORATTRIB_DESTINAZIONE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // FATTORI ATTRIBUTI Destinazione Validate Body
      // Corpo Procedura
      // 
      PAN_FATTORI.SetModified(MainFrm);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "FATTORIATTRIBUTIDestinazioneValidate", _e);
    }
  }

  // **********************************************************************
  // Fattori Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FATTORI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fattori Before Insert Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_FATTORI1, IMDBDef9.PQSL_FATTORI1_TIPO, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Tipo obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        PAN_FATTORI.SetModified(MainFrm);
        Cancel.set((new IDVariant(-1)));
        return;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "FattoriBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Fattori On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_FATTORI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fattori On Command Body
      // Corpo Procedura
      // 
      // if (Command.equals((new IDVariant(128)), true) && UserOperation.booleanValue())
      // {
        // IDVariant I = null;
        // I = (new IDVariant(1));
        // for (// I = (new IDVariant(1)); I.compareTo((new IDVariant(PAN_FATTORI.NumRows)), true)<0; // I = IDL.Add(I, (new IDVariant(1))))
        // {
          // IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          // IDVariant v_RECFATTORE = null;
          // v_RECFATTORE = PAN_FATTORI.GetValueAt(PFL_FATTORI_FATTORE1,I.intValue());
          // IDVariant v_RECTIPO = null;
          // v_RECTIPO = PAN_FATTORI.GetValueAt(PFL_FATTORI_TIPO,I.intValue());
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  COUNT(*) as COUNT1 ");
          // SQL.append("from ");
          // SQL.append("  FATTORI A ");
          // SQL.append("where (A.FATTORE = " + IDL.CSql(v_RECFATTORE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!QV.EOF()) QV.MoveNext();
          // if (!QV.EOF())
          // {
          //   v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          // }
          // QV.Close();
          // if (v_VCOUNT.equals((new IDVariant(0)), true) && IDL.NullValue(v_RECFATTORE,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          // {
            // if (IDL.IsNull(v_RECTIPO))
            // {
              // IDVariant S = new IDVariant(0,IDVariant.STRING);
              // S = (new IDVariant("Tipo obbligatorio"));
              // MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Fattore")), (new IDVariant(" "))), v_RECFATTORE), (new IDVariant(" "))), S)); 
              // Cancel.set((new IDVariant(-1)));
              // break;
            // }
          // }
        // }
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "FattoriOnCommand", _e);
    }
  }

  // **********************************************************************
  // FATTORI ATTRIBUTI SE RATEI RISC Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_FATTORATTRIB_SERATEIRISC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // FATTORI ATTRIBUTI SE RATEI RISC Validate Body
      // Corpo Procedura
      // 
      PAN_FATTORI.SetModified(MainFrm);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fattori", "FATTORIATTRIBUTISERATEIRISCValidate", _e);
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
  private void PAN_FATTORI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FATTORI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FATTORI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FATTORI, Cancel);
    // Stub
  }

  private void PAN_FATTORI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FATTORI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FATTORI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FATTORI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBROFATTORI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBROFATTORI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBROFATTORI_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBROFATTORI_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBROFATTORI_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_LIBROFATTORI_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_LIBROFATTORI_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBROFATTORI_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBROFATTORI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBROFATTORI_MST_FATTORMASTRO)
    {
      BUK_LIBROFATTORI.set_SpanValue(BUK_LIBROFATTORI_SPAN_LIBFATFAPANU, new IDVariant((new IDVariant(BUK_LIBROFATTORI.GetPageNumber()))));
      BUK_LIBROFATTORI.set_SpanValue(BUK_LIBROFATTORI_SPAN_LIFAFANUOFPA, new IDVariant((new IDVariant(BUK_LIBROFATTORI.GetTotalPagesNumber()))));
    }
  }

  private void BUK_LIBROFATTORI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBROFATTORI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBROFATTORI_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBROFATTORI_OnPreview()
  {
    PreviewBook = BKW_LIBROFATTORI;
    SetRD();
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_FATTORATTRIB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FATTORATTRIB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FATTORATTRIB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FATTORATTRIB, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FATTORATTRIB_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FATTORATTRIB);
    // Stub
  }

  private void PAN_FATTORATTRIB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FATTORATTRIB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FATTORATTRIB_DESTINAZIONE)
      {
        PFL_FATTORATTRIB_DESTINAZIONE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FATTORATTRIB_SERATEIRISC)
      {
        PFL_FATTORATTRIB_SERATEIRISC_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_FATTORATTRIB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FATTORATTRIB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FATTORI_Init()
  {

    PAN_FATTORI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FATTORI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FATTORI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, "AA265174-9D3C-4938-94F3-E4AF1CE1752E");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, "Fattore");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "7172EDEE-6A1B-4B65-A63F-6416BA6D5B5F");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "Descrizione");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "34B8038E-458D-462A-837A-C67BB3DCC765");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "Tipo");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, "8168D110-8371-4227-9B4F-C9EF6F555950");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, "label");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, "7700BEB3-0CFD-44E0-86AD-1AE7A8DD557D");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, "Data Fine Validità");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FATTORI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, MyGlb.PANEL_LIST, 60);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, MyGlb.PANEL_LIST, "Fattore");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, MyGlb.PANEL_FORM, 120);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_FATTORE1, MyGlb.PANEL_FORM, "Fattore");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_FATTORE1, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_FATTORE1, PPQRY_FATTORI1, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 124, 36, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 120);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_DESCRIZIONE, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_DESCRIZIONE, PPQRY_FATTORI1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 532, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 4, 76, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 120);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_TIPO, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_TIPO, PPQRY_FATTORI1, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, MyGlb.PANEL_LIST, 0, 248, 664, 84, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, MyGlb.PANEL_LIST, 0);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, MyGlb.PANEL_LIST, 6);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, MyGlb.PANEL_FORM, 132, 268, 420, 108, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, MyGlb.PANEL_FORM, 0);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_ETICHETLABEL, MyGlb.PANEL_FORM, 8);
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_ETICHETLABEL, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_ETICHETLABEL, -1, "", "ETICHETLABEL", 0, 0, 0, -13997);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, MyGlb.PANEL_LIST, 660, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, MyGlb.PANEL_LIST, 96);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, MyGlb.PANEL_LIST, "Data Fine Validità");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, MyGlb.PANEL_FORM, 4, 100, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, MyGlb.PANEL_FORM, 96);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DATAVALIDITA, MyGlb.PANEL_FORM, "Dt. Fine Validità");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_DATAVALIDITA, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_DATAVALIDITA, PPQRY_FATTORI1, "A.DATA_VALIDITA", "DATA_VALIDITA", 6, 19, 0, -13997);
  }

  private void PAN_FATTORI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FATTORI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FATTORI.SetIMDB(IMDB, "PQRY_FATTORI1", true);
    PAN_FATTORI.set_SetString(MyGlb.MASTER_ROWNAME, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.DATA_VALIDITA as DATA_VALIDITA ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (((A.TIPO = 'P' OR A.TIPO = 'A') AND ~~TBL_PARAMETRI560.PARAMTIPO~~ = 'P') OR (~~TBL_PARAMETRI560.PARAMTIPO~~ IS NULL)) ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORI.SetQuery(PPQRY_FATTORI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORI.SetQuery(PPQRY_FATTORI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.FATTORE ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI1, 5, SQL, -1, "");
    PAN_FATTORI.SetQueryDB(PPQRY_FATTORI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FATTORI.SetMasterTable(0, "FATTORI");
    PAN_FATTORI.AddToSortList(PFL_FATTORI_FATTORE1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FATTORI.Status() == 2)
    {
      int oldListQBE = PAN_FATTORI.iUseListQBE;
      PAN_FATTORI.iUseListQBE = 0;
      PAN_FATTORI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FATTORI.PanelCommand(Glb.PCM_FIND);
      PAN_FATTORI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FATTORATTRIB_Init()
  {

    PAN_FATTORATTRIB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FATTORATTRIB.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FATTORATTRIB.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_FATTORATTRIB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, "132044DC-42A2-4CC2-9F07-C66F8FA603E3");
    PAN_FATTORATTRIB.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, "FATTORE");
    PAN_FATTORATTRIB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, "");
    PAN_FATTORATTRIB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FATTORATTRIB.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_FATTORATTRIB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, "AC8F8136-3F7C-401C-811E-78E01C1B5926");
    PAN_FATTORATTRIB.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, "Destinazione");
    PAN_FATTORATTRIB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, "");
    PAN_FATTORATTRIB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_FATTORATTRIB.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTORATTRIB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, "D51FB664-56D7-4F1F-AAD4-E1FA5D195B6D");
    PAN_FATTORATTRIB.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, "Ratei/Risconti");
    PAN_FATTORATTRIB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, "");
    PAN_FATTORATTRIB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, MyGlb.VIS_CHECKSTYLE);
    PAN_FATTORATTRIB.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FATTORATTRIB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FATTORATTRIB.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORATTRIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_FATTORATTRIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_FATTORATTRIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_FATTORATTRIB.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, MyGlb.PANEL_FORM, 4, 4, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORATTRIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, MyGlb.PANEL_FORM, 104);
    PAN_FATTORATTRIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_FATTORATTRIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_FATTORATTRIB.SetFieldPage(PFL_FATTORATTRIB_FATTORE, -1, -1);
    PAN_FATTORATTRIB.SetFieldPanel(PFL_FATTORATTRIB_FATTORE, PPQRY_FATTORATTRIB, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_FATTORATTRIB.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, MyGlb.PANEL_LIST, 136, 36, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORATTRIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, MyGlb.PANEL_LIST, 92);
    PAN_FATTORATTRIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FATTORATTRIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, MyGlb.PANEL_LIST, "Destinazione");
    PAN_FATTORATTRIB.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, MyGlb.PANEL_FORM, 4, 4, 420, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORATTRIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, MyGlb.PANEL_FORM, 20);
    PAN_FATTORATTRIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_FATTORATTRIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_DESTINAZIONE, MyGlb.PANEL_FORM, "Destinazione");
    PAN_FATTORATTRIB.SetFieldPage(PFL_FATTORATTRIB_DESTINAZIONE, -1, -1);
    PAN_FATTORATTRIB.SetFieldPanel(PFL_FATTORATTRIB_DESTINAZIONE, PPQRY_FATTORATTRIB, "A.DESTINAZIONE", "DESTINAZIONE", 5, 11, 0, -13997);
    PAN_FATTORATTRIB.SetValueListItem(PFL_FATTORATTRIB_DESTINAZIONE, (new IDVariant("CONTRIBUTI")), "Contrib. in conto capitale da amm. pubbliche", "", "", -1);
    PAN_FATTORATTRIB.SetValueListItem(PFL_FATTORATTRIB_DESTINAZIONE, (new IDVariant("CONCESSIONI")), "Concessione Pluriennali", "", "", -1);
    PAN_FATTORATTRIB.SetValueListItem(PFL_FATTORATTRIB_DESTINAZIONE, (new IDVariant()), "Altro", "", "", -1);
    PAN_FATTORATTRIB.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORATTRIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, MyGlb.PANEL_LIST, 88);
    PAN_FATTORATTRIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, MyGlb.PANEL_LIST, 1);
    PAN_FATTORATTRIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, MyGlb.PANEL_LIST, "Ratei/Risconti");
    PAN_FATTORATTRIB.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, MyGlb.PANEL_FORM, 540, 24, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORATTRIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, MyGlb.PANEL_FORM, 92);
    PAN_FATTORATTRIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, MyGlb.PANEL_FORM, 1);
    PAN_FATTORATTRIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORATTRIB_SERATEIRISC, MyGlb.PANEL_FORM, "Ratei/Risconti");
    PAN_FATTORATTRIB.SetFieldPage(PFL_FATTORATTRIB_SERATEIRISC, -1, -1);
    PAN_FATTORATTRIB.SetFieldPanel(PFL_FATTORATTRIB_SERATEIRISC, PPQRY_FATTORATTRIB, "A.SE_RATEI_RISC", "SE_RATEI_RISC", 5, 2, 0, -13997);
    PAN_FATTORATTRIB.SetValueListItem(PFL_FATTORATTRIB_SERATEIRISC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FATTORATTRIB.SetValueListItem(PFL_FATTORATTRIB_SERATEIRISC, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_FATTORATTRIB_InitQueries()
  {
    StringBuffer SQL;

    PAN_FATTORATTRIB.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FATTORATTRIB.SetIMDB(IMDB, "PQRY_FATTORATTRIB", true);
    PAN_FATTORATTRIB.set_SetString(MyGlb.MASTER_ROWNAME, "FATTORI ATTRIBUTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.DESTINAZIONE as DESTINAZIONE, ");
    SQL.append("  A.SE_RATEI_RISC as SE_RATEI_RISC ");
    PAN_FATTORATTRIB.SetQuery(PPQRY_FATTORATTRIB, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FATTORI_ATTRIBUTI A ");
    PAN_FATTORATTRIB.SetQuery(PPQRY_FATTORATTRIB, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FATTORE = ~~PQRY_FATTORI1.FATTORE~~) ");
    PAN_FATTORATTRIB.SetQuery(PPQRY_FATTORATTRIB, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORATTRIB.SetQuery(PPQRY_FATTORATTRIB, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORATTRIB.SetQuery(PPQRY_FATTORATTRIB, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORATTRIB.SetQuery(PPQRY_FATTORATTRIB, 5, SQL, -1, "");
    PAN_FATTORATTRIB.SetQueryDB(PPQRY_FATTORATTRIB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FATTORATTRIB.SetMasterTable(0, "FATTORI_ATTRIBUTI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FATTORATTRIB.Status() == 2)
    {
      int oldListQBE = PAN_FATTORATTRIB.iUseListQBE;
      PAN_FATTORATTRIB.iUseListQBE = 0;
      PAN_FATTORATTRIB.PanelCommand(Glb.PCM_SEARCH);
      PAN_FATTORATTRIB.PanelCommand(Glb.PCM_FIND);
      PAN_FATTORATTRIB.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBROFATTORI_MST_FATTORMASTRO_Init()
  {
    BUK_LIBROFATTORI.InitMastro(BUK_LIBROFATTORI_MST_FATTORMASTRO, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_MST_FATTORMASTRO, "F7D20043-8D0B-4294-8F29-CAFD29B6E533");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_MST_FATTORMASTRO, "FATTORMASTRO");
    BUK_LIBROFATTORI.InitMastroBox(BUK_LIBROFATTORI_MST_FATTORMASTRO, BUK_LIBROFATTORI_RPTBOX_NUMEROPAGINA, 16900, 200, 3100, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_NUMEROPAGINA, "F76A8ACF-4BA2-475C-A3FA-1C66A90CE52E");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_NUMEROPAGINA, BUK_LIBROFATTORI_SPAN_PAG, MyGlb.VIS_NORMAA8RIGHT, 0, 0, 0, 271384961, "", "Pag. ", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_PAG, "8E1EF18F-F168-4426-82E4-C3A44DD74A27");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_PAG, "PAG");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_NUMEROPAGINA, BUK_LIBROFATTORI_SPAN_LIBFATFAPANU, MyGlb.VIS_NORMAA8RIGHT, 1, 19, 0, 271384705, "", "", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_LIBFATFAPANU, "AA04A787-867C-4CB3-8885-67F70CA138FA");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_LIBFATFAPANU, "LIBFATFAPANU");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_NUMEROPAGINA, BUK_LIBROFATTORI_SPAN_DI, MyGlb.VIS_NORMAA8RIGHT, 0, 0, 0, 271384961, "", " di ", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_DI, "5F6FD104-EB48-4F27-BD8B-AAA346705FFA");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_DI, "DI");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_NUMEROPAGINA, BUK_LIBROFATTORI_SPAN_LIFAFANUOFPA, MyGlb.VIS_NORMAA8RIGHT, 1, 19, 0, 271384705, "", "", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_LIFAFANUOFPA, "0C8B4238-EBAF-4DCD-B4E4-E8BEF73E8866");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_LIFAFANUOFPA, "LIFAFANUOFPA");
    BUK_LIBROFATTORI.InitMastroBox(BUK_LIBROFATTORI_MST_FATTORMASTRO, BUK_LIBROFATTORI_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 2800, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_TESTATPAGINA, "C4C74982-9060-49CE-B94C-992CA6EC7EBD");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBROFATTORI.InitMastroBox(BUK_LIBROFATTORI_MST_FATTORMASTRO, BUK_LIBROFATTORI_RPTBOX_CORPOPAGINA, 1000, 4000, 19000, 24200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_CORPOPAGINA, "413766BA-23B0-406A-BD54-AB35031E70D1");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_LIBROFATTORI.InitMastroBox(BUK_LIBROFATTORI_MST_FATTORMASTRO, BUK_LIBROFATTORI_RPTBOX_PIEDEPAGINA, 1000, 28400, 19000, 300, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_PIEDEPAGINA, "1FB88093-4B48-4F41-B0A1-957BC7EB400C");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
  }

  private void BUK_LIBROFATTORI_RPT_FATTORREPORT_InitQuery() { BUK_LIBROFATTORI_RPT_FATTORREPORT_InitQuery(true, true); }
  private void BUK_LIBROFATTORI_RPT_FATTORREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FATTORE as FATTORFATTOR, ");
      SQL.append("  A.DESCRIZIONE as FATTORDESCRI, ");
      SQL.append("  A.TIPO as FATTORITIPO, ");
      SQL.append("  A.DATA_VALIDITA as FATTDATAVALI ");
      SQL.append("from ");
      SQL.append("  FATTORI A ");
      SQL.append("order by ");
      SQL.append("  A.FATTORE ");
      BUK_LIBROFATTORI.SetReportQuery(BUK_LIBROFATTORI_RPT_FATTORREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "10CBD59E-65C3-4898-884D-B725C169F1C1");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBROFATTORI_RPT_FATTORREPORT_Init()
  {
    BUK_LIBROFATTORI.InitReport(BUK_LIBROFATTORI_RPT_FATTORREPORT, 196865);
    BUK_LIBROFATTORI_RPT_FATTORREPORT_InitQuery(true, false);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPT_FATTORREPORT, "E4E7F84D-0D0C-4A20-B154-B1C0BE4AD573");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPT_FATTORREPORT, "FATTORREPORT");
    BUK_LIBROFATTORI.InitSection(BUK_LIBROFATTORI_RPT_FATTORREPORT, BUK_LIBROFATTORI_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFATTORI.SetSectionRendersInto(BUK_LIBROFATTORI_SEC_INTESTREPORT, BUK_LIBROFATTORI_RPTBOX_CORPOPAGINA);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SEC_INTESTREPORT, "0E968985-F196-4CA5-9A53-8073E6D4B641");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBROFATTORI.InitSection(BUK_LIBROFATTORI_RPT_FATTORREPORT, BUK_LIBROFATTORI_SEC_INTESTPAGINA, 2800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFATTORI.SetSectionRendersInto(BUK_LIBROFATTORI_SEC_INTESTPAGINA, BUK_LIBROFATTORI_RPTBOX_TESTATPAGINA);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SEC_INTESTPAGINA, "3BA0DA59-F82C-4F12-B5A0-2218238083D4");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBROFATTORI.InitReportBox(BUK_LIBROFATTORI_SEC_INTESTPAGINA, BUK_LIBROFATTORI_RPTBOX_TITOLO, 0, 0, 19000, 1400, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_TITOLO, "8FE7F9EB-1626-4BFA-ABF3-6A705F10DC44");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_TITOLO, BUK_LIBROFATTORI_SPAN_FATTORI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Fattori", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_FATTORI, "9F9CD663-EEA9-49E2-8404-D6A634B64D20");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_FATTORI, "FATTORI");
    BUK_LIBROFATTORI.InitReportBox(BUK_LIBROFATTORI_SEC_INTESTPAGINA, BUK_LIBROFATTORI_RPTBOX_FATTORHEADER, 0, 2200, 1900, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_FATTORHEADER, "5D05D084-C7C1-488F-B2A1-8B93C01BF7D2");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_FATTORHEADER, "FATTORHEADER");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_FATTORHEADER, BUK_LIBROFATTORI_SPAN_FATTORE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Fattore", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_FATTORE1, "0050B066-126B-406C-8B48-2DF760FF4E6D");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_FATTORE1, "FATTORE1");
    BUK_LIBROFATTORI.InitReportBox(BUK_LIBROFATTORI_SEC_INTESTPAGINA, BUK_LIBROFATTORI_RPTBOX_DESCRIHEADER, 2000, 2200, 10395, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_DESCRIHEADER, "221B1753-8EFF-4F88-A897-C5C8CE24BA45");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_DESCRIHEADER, BUK_LIBROFATTORI_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_DESCRIZIONE1, "D5C12025-74BE-45A2-8155-1261AC38A544");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_LIBROFATTORI.InitReportBox(BUK_LIBROFATTORI_SEC_INTESTPAGINA, BUK_LIBROFATTORI_RPTBOX_TIPOHEADER, 12500, 2200, 3318, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_TIPOHEADER, "0C514C9B-7923-4EFB-BAFC-EF3EBAE16B98");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_TIPOHEADER, "TIPOHEADER");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_TIPOHEADER, BUK_LIBROFATTORI_SPAN_TIPO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Tipo", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_TIPO1, "5B98FF6A-3788-44E5-AC08-6A2D43CB8847");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_TIPO1, "TIPO1");
    BUK_LIBROFATTORI.InitReportBox(BUK_LIBROFATTORI_SEC_INTESTPAGINA, BUK_LIBROFATTORI_RPTBOX_DATAFINEVALI, 16200, 2200, 2600, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_DATAFINEVALI, "29F447C9-A6B9-4FB5-9D18-4641F48C8675");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_DATAFINEVALI, "DATAFINEVALI");
    BUK_LIBROFATTORI.set_BoxAlignment(BUK_LIBROFATTORI_RPTBOX_DATAFINEVALI, 3);
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_DATAFINEVALI, BUK_LIBROFATTORI_SPAN_NUOVASPAN, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Data Fine Validità", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_NUOVASPAN, "5FCF75D2-9DE6-4922-AD9C-E67652FBA3DE");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_LIBROFATTORI.InitSection(BUK_LIBROFATTORI_RPT_FATTORREPORT, BUK_LIBROFATTORI_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFATTORI.SetSectionRendersInto(BUK_LIBROFATTORI_SEC_DETTAGLIO, BUK_LIBROFATTORI_RPTBOX_CORPOPAGINA);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SEC_DETTAGLIO, "A818A783-FC7B-4AD2-8EBA-DE6DDFDD1105");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBROFATTORI.InitReportBox(BUK_LIBROFATTORI_SEC_DETTAGLIO, BUK_LIBROFATTORI_RPTBOX_FATTORE, 0, 0, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_FATTORE, "62AA8EF9-AFDE-4D67-84E3-B6BC501020A5");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_FATTORE, "FATTORE");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_FATTORE, BUK_LIBROFATTORI_SPAN_FATTORE, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "", "::FATTORFATTOR", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_FATTORE, "98C919E0-1920-41D1-B0D7-50E0A0FC36C5");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_FATTORE, "FATTORE");
    BUK_LIBROFATTORI.InitReportBox(BUK_LIBROFATTORI_SEC_DETTAGLIO, BUK_LIBROFATTORI_RPTBOX_DESCRIZIONE, 2000, 0, 10395, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_DESCRIZIONE, "76879594-E4F3-461F-AD07-8110F70CE6B2");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_DESCRIZIONE, BUK_LIBROFATTORI_SPAN_DESCRIZIONE, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "::FATTORDESCRI", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_DESCRIZIONE, "CE2EF09F-41D7-4A98-BAFE-8769192E4E0B");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBROFATTORI.InitReportBox(BUK_LIBROFATTORI_SEC_DETTAGLIO, BUK_LIBROFATTORI_RPTBOX_TIPO, 12500, 0, 3318, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_TIPO, "C9FBF33F-3C55-4E2B-A56A-3954AABF4E04");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_TIPO, "TIPO");
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_TIPO, BUK_LIBROFATTORI_SPAN_TIPO, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "", "::FATTORITIPO", 1);
    BUK_LIBROFATTORI.SetSpanValueListItem(BUK_LIBROFATTORI_SPAN_TIPO, "Economico", "Type the value and explain what it means.", (new IDVariant("E")), null, "", -1);
    BUK_LIBROFATTORI.SetSpanValueListItem(BUK_LIBROFATTORI_SPAN_TIPO, "Patrimoniale Attivo", "Type the value and explain what it means.", (new IDVariant("A")), null, "", -1);
    BUK_LIBROFATTORI.SetSpanValueListItem(BUK_LIBROFATTORI_SPAN_TIPO, "Patrimoniale Passivo", "Type the value and explain what it means.", (new IDVariant("P")), null, "", -1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_TIPO, "12533D64-663E-4360-BA12-4971DA28841F");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_TIPO, "TIPO");
    BUK_LIBROFATTORI.InitReportBox(BUK_LIBROFATTORI_SEC_DETTAGLIO, BUK_LIBROFATTORI_RPTBOX_DATA, 16200, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_RPTBOX_DATA, "BE629A39-0091-4240-B80D-68D274526267");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_RPTBOX_DATA, "DATA");
    BUK_LIBROFATTORI.set_BoxAlignment(BUK_LIBROFATTORI_RPTBOX_DATA, 3);
    BUK_LIBROFATTORI.InitBoxSpan(BUK_LIBROFATTORI_RPTBOX_DATA, BUK_LIBROFATTORI_SPAN_FADAVAFALIFA, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Data", "::FATTDATAVALI", 1);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SPAN_FADAVAFALIFA, "C485D8C0-1FE5-46C7-B882-86DFD84DC9DE");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SPAN_FADAVAFALIFA, "FADAVAFALIFA");
    BUK_LIBROFATTORI.InitSection(BUK_LIBROFATTORI_RPT_FATTORREPORT, BUK_LIBROFATTORI_SEC_PIEDEPAGINA, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFATTORI.SetSectionRendersInto(BUK_LIBROFATTORI_SEC_PIEDEPAGINA, BUK_LIBROFATTORI_RPTBOX_PIEDEPAGINA);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SEC_PIEDEPAGINA, "8F817B00-452F-4F7A-9BF8-BBC034FDB162");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_LIBROFATTORI.InitSection(BUK_LIBROFATTORI_RPT_FATTORREPORT, BUK_LIBROFATTORI_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFATTORI.SetSectionRendersInto(BUK_LIBROFATTORI_SEC_PIEDEREPORT, BUK_LIBROFATTORI_RPTBOX_CORPOPAGINA);
    BUK_LIBROFATTORI.SetRTCGuid(BUK_LIBROFATTORI_SEC_PIEDEREPORT, "2BAAD470-D123-4188-A48A-4C752C7D2FF8");
    BUK_LIBROFATTORI.SetObjCode(BUK_LIBROFATTORI_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBROFATTORI_RPT_FATTORREPORT_InitQuery(false, true);
  }

  private void BUK_LIBROFATTORI_InitLinks()
  {
    BUK_LIBROFATTORI.SetBoxNextBox(BUK_LIBROFATTORI_RPTBOX_CORPOPAGINA, BUK_LIBROFATTORI_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FATTORATTRIB) PAN_FATTORATTRIB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_ValidateRow(Cancel);
    if (SrcObj == PAN_FATTORATTRIB) PAN_FATTORATTRIB_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_DynamicProperties();
    if (SrcObj == PAN_FATTORATTRIB) PAN_FATTORATTRIB_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FATTORATTRIB) PAN_FATTORATTRIB_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_OnChangeRow();
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
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_BeforeInsert(Cancel);
    if (SrcObj == PAN_FATTORATTRIB) PAN_FATTORATTRIB_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FATTORATTRIB) PAN_FATTORATTRIB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBROFATTORI) BUK_LIBROFATTORI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBROFATTORI) BUK_LIBROFATTORI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBROFATTORI) BUK_LIBROFATTORI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBROFATTORI) BUK_LIBROFATTORI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBROFATTORI) BUK_LIBROFATTORI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBROFATTORI) BUK_LIBROFATTORI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBROFATTORI) BUK_LIBROFATTORI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBROFATTORI) BUK_LIBROFATTORI_OnPreview();
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
