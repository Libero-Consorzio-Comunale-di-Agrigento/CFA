// **********************************************
// Tipi Quietanza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiQuietanza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPIQUIETANZ_CODICE = 0;
  private static int PFL_TIPIQUIETANZ_DESCRIZIONE = 1;
  private static int PFL_TIPIQUIETANZ_AVVISO = 2;
  private static int PFL_TIPIQUIETANZ_RIFTESORERIA = 3;
  private static int PFL_TIPIQUIETANZ_RIFTESORMINF = 4;
  private static int PFL_TIPIQUIETANZ_DESPERMANINF = 5;
  private static int PFL_TIPIQUIETANZ_CODICEFE = 6;
  private static int PFL_TIPIQUIETANZ_UTENTEINSERI = 7;
  private static int PFL_TIPIQUIETANZ_DATAINSERIME = 8;
  private static int PFL_TIPIQUIETANZ_UTENTULTIAGG = 9;
  private static int PFL_TIPIQUIETANZ_DATAULTIMAGG = 10;

  private static int PPQRY_T3 = 0;


  IDPanel PAN_TIPIQUIETANZ;
  CIDREObj BUK_TIPIQUIEBOOK;
  OBook BKW_TIPIQUIEBOOK;
  //
  // Template Pages constants
  private static int BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG = 1;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_TIPIQUIEBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_TIPIQUIEBOOK_RPT_NEWREPORT = 6;
  private static int BUK_TIPIQUIEBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_TIPIQUIEBOOK_SPAN_CODICE = 9;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_TIPIQUIEBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_STAMAVVIHEAD = 12;
  private static int BUK_TIPIQUIEBOOK_SPAN_AVVISO = 13;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_RIFERIHEADER = 14;
  private static int BUK_TIPIQUIEBOOK_SPAN_RIFTESORERIA = 15;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_RIFTESMINHEA = 16;
  private static int BUK_TIPIQUIEBOOK_SPAN_RIFTESORMINF = 17;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_DESCMINFHEAD = 18;
  private static int BUK_TIPIQUIEBOOK_SPAN_DESPERMANINF = 19;
  private static int BUK_TIPIQUIEBOOK_SEC_TITOLO = 20;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_NEWBOX = 21;
  private static int BUK_TIPIQUIEBOOK_SPAN_VARIADIBILAN = 22;
  private static int BUK_TIPIQUIEBOOK_SEC_DETAIL = 23;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_CODICE = 24;
  private static int BUK_TIPIQUIEBOOK_SPAN_T0COTIQUTIQB = 25;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIONE = 26;
  private static int BUK_TIPIQUIEBOOK_SPAN_T0DETIQUTIQB = 27;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_STAMPAAVVISO = 28;
  private static int BUK_TIPIQUIEBOOK_SPAN_NUVATATQTQBN = 29;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_RIFERIMENTO = 30;
  private static int BUK_TIPIQUIEBOOK_SPAN_T0RITETIQTQB = 31;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_RIFTESOMINF = 32;
  private static int BUK_TIPIQUIEBOOK_SPAN_T0RITMITQTQB = 33;
  private static int BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIMINF = 34;
  private static int BUK_TIPIQUIEBOOK_SPAN_T0DEPMITQTQB = 35;
  private static int BUK_TIPIQUIEBOOK_SEC_PAGEFOOTER = 36;
  private static int BUK_TIPIQUIEBOOK_SEC_REPORTFOOTER = 37;


  // Definition of Global Variables
  private IDVariant LICENZA = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_LUNGHEZZE(IMDB);
    //
    //
    Init_PQRY_T3(IMDB);
    Init_PQRY_T02(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_LUNGHEZZE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_LUNGHEZZE, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_LUNGHEZZE, "TBL_LUNGHEZZE");
    IMDB.set_FldCode(IMDBDef1.TBL_LUNGHEZZE,IMDBDef1.FLD_LUNGHEZZE_ROWNARITEMIN, "ROWNARITEMIN");
    IMDB.SetFldParams(IMDBDef1.TBL_LUNGHEZZE,IMDBDef1.FLD_LUNGHEZZE_ROWNARITEMIN,1,9,0);
    IMDB.set_FldCode(IMDBDef1.TBL_LUNGHEZZE,IMDBDef1.FLD_LUNGHEZZE_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef1.TBL_LUNGHEZZE,IMDBDef1.FLD_LUNGHEZZE_ROWNAMEDESCR,1,9,0);
    IMDB.TblAddNew(IMDBDef1.TBL_LUNGHEZZE, 0);
  }

  private static void Init_PQRY_T3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T3, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_T3, "PQRY_T3");
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_STAMPA_AVVISO, "STAMPA_AVVISO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_STAMPA_AVVISO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_RIFERIMENTO, "RIFERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_RIFERIMENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_RIF_TESO_MINF, "RIF_TESO_MINF");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_RIF_TESO_MINF,5,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_DESCRIZIONE_MINF, "DESCRIZIONE_MINF");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_DESCRIZIONE_MINF,5,100,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_CODICE_FE, "CODICE_FE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T3,IMDBDef9.PQSL_T3_CODICE_FE,5,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T3, 0);
  }

  private static void Init_PQRY_T02(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T02, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_T02, "PQRY_T02");
    IMDB.set_FldCode(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_STAMPA_AVVISO, "STAMPA_AVVISO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_STAMPA_AVVISO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_RIFERIMENTO, "RIFERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_RIFERIMENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_RIF_TESO_MINF, "RIF_TESO_MINF");
    IMDB.SetFldParams(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_RIF_TESO_MINF,5,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_DESCRIZIONE_MINF, "DESCRIZIONE_MINF");
    IMDB.SetFldParams(IMDBDef9.PQRY_T02,IMDBDef9.PQSL_T02_DESCRIZIONE_MINF,5,100,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T02, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiQuietanza(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiQuietanza()
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
    FormIdx = MyGlb.FRM_TIPIQUIETANZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5D39257E-677F-472E-9A16-D8906960943C";
    ResModeW = 3;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 390;
    set_Caption(new IDVariant("Tipi Quietanza"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 364;
    Frames[1].Caption = "Tipi Quietanza";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_TIPIQUIETANZ = new IDPanel(w, this, 1, "PAN_TIPIQUIETANZ");
    Frames[1].Content = PAN_TIPIQUIETANZ;
    PAN_TIPIQUIETANZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIQUIETANZ.VS = MainFrm.VisualStyleList;
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_TIPIQUIEBOOK != null)
      PAN_TIPIQUIETANZ.SetBook(BUK_TIPIQUIEBOOK);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "21BB01C3-3AFF-4727-BDD4-BE85CCD5FD67");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 848, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIQUIETANZ.InitStatus = 2;
    PAN_TIPIQUIETANZ_Init();
    PAN_TIPIQUIETANZ_InitFields();
    PAN_TIPIQUIETANZ_InitQueries();
    BKW_TIPIQUIEBOOK = new OBook(this);
    BUK_TIPIQUIEBOOK = new CIDREObj(BKW_TIPIQUIEBOOK);
    BKW_TIPIQUIEBOOK.iGuid = "0DB9D849-FD16-4466-BA74-4540FDF7271E";
    BKW_TIPIQUIEBOOK.Code = "BUK_TIPIQUIEBOOK";
    BKW_TIPIQUIEBOOK.BookObj = BUK_TIPIQUIEBOOK;
    BKW_TIPIQUIEBOOK.InitDefMasks();
    BUK_TIPIQUIEBOOK.InitBook(1, 1245185, "Tipi Quietanza Book", IMDB, MainFrm.VisualStyleList);
    BUK_TIPIQUIEBOOK.InitHTML();
    BUK_TIPIQUIEBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_TIPIQUIEBOOK.Book.SetMainFrm(MainFrm);
    BUK_TIPIQUIEBOOK.SetRTCGuid(0, "0DB9D849-FD16-4466-BA74-4540FDF7271E");
    BUK_TIPIQUIEBOOK.SetObjCode(0, "TIPIQUIEBOOK");
    if (PAN_TIPIQUIETANZ != null)
      PAN_TIPIQUIETANZ.SetBook(BUK_TIPIQUIEBOOK);
    BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG_Init();
    BUK_TIPIQUIEBOOK_RPT_NEWREPORT_Init();
    BUK_TIPIQUIEBOOK_InitLinks();
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
      PAN_TIPIQUIETANZ.UpdatePanel(MainFrm);
      // BUK_TIPIQUIEBOOK.UpdateBook();
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
    if (Code.equals("BUK_TIPIQUIEBOOK")) return BUK_TIPIQUIEBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiQuietanza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiQuietanza.class.getName() : (Glb.ClassWithPackage(TipiQuietanza.class) ? TipiQuietanza.class.getName().substring(TipiQuietanza.class.getPackage().getName().length() + 1) : TipiQuietanza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Quietanza On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIQUIETANZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIQUIETANZ);
      // 
      // Tipi Quietanza On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_TIPIQUIETANZ.IsNewRow()))
      {
        PAN_TIPIQUIETANZ.SetFlags (Glb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIQUIETANZ.SetFlags (Glb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (LICENZA.equals((new IDVariant("S")), true))
      {
        PAN_TIPIQUIETANZ.set_ObjRect(Glb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IMDB.Value(IMDBDef1.TBL_LUNGHEZZE, IMDBDef1.FLD_LUNGHEZZE_ROWNARITEMIN, 0).intValue());
        PAN_TIPIQUIETANZ.set_ObjRect(Glb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IMDB.Value(IMDBDef1.TBL_LUNGHEZZE, IMDBDef1.FLD_LUNGHEZZE_ROWNAMEDESCR, 0).intValue());
      }
      else
      {
        PAN_TIPIQUIETANZ.set_ObjRect(Glb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_TIPIQUIETANZ.set_ObjRect(Glb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
      }
      PAN_TIPIQUIETANZ.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIQUIETANZ_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T3, IMDBDef9.PQSL_T3_DESCRIZIONE, 0).stringValue()); 
      PAN_TIPIQUIETANZ.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIQUIETANZ_DESPERMANINF,IMDB.Value(IMDBDef9.PQRY_T3, IMDBDef9.PQSL_T3_DESCRIZIONE_MINF, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiQuietanza", "TipiQuietanzaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Quietanza On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_TIPIQUIETANZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPIQUIETANZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Quietanza On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiQuietanza", "TipiQuietanzaOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Quietanza On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_TIPIQUIETANZ_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Quietanza On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T02PD(IMDB.Value(IMDBDef9.PQRY_T3, IMDBDef9.PQSL_T3_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
      if (Command.equals((new IDVariant(16384)), true))
      {
        if (LICENZA.compareTo((new IDVariant("S")), true)!=0)
        {
          BUK_TIPIQUIEBOOK.set_BoxVisible(BUK_TIPIQUIEBOOK_RPTBOX_RIFTESMINHEA, (new IDVariant(0)).booleanValue());
          BUK_TIPIQUIEBOOK.set_BoxVisible(BUK_TIPIQUIEBOOK_RPTBOX_DESCMINFHEAD, (new IDVariant(0)).booleanValue());
          BUK_TIPIQUIEBOOK.set_BoxVisible(BUK_TIPIQUIEBOOK_RPTBOX_RIFTESOMINF, (new IDVariant(0)).booleanValue());
          BUK_TIPIQUIEBOOK.set_BoxVisible(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIMINF, (new IDVariant(0)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiQuietanza", "TipiQuietanzaOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Quietanza After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_TIPIQUIETANZ_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Quietanza After Find Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_LUNGHEZZE, IMDBDef1.FLD_LUNGHEZZE_ROWNARITEMIN, 0, (new IDVariant(PAN_TIPIQUIETANZ.ObjRect(Glb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, IDPanel.RT_WIDTH, Glb.PANEL_LIST))));
      IMDB.set_Value(IMDBDef1.TBL_LUNGHEZZE, IMDBDef1.FLD_LUNGHEZZE_ROWNAMEDESCR, 0, (new IDVariant(PAN_TIPIQUIETANZ.ObjRect(Glb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, IDPanel.RT_WIDTH, Glb.PANEL_LIST))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiQuietanza", "TipiQuietanzaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Quietanza On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_TIPIQUIETANZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Quietanza On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T3, IMDBDef9.PQSL_T3_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T3, IMDBDef9.PQSL_T3_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T3, IMDBDef9.PQSL_T3_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T3, IMDBDef9.PQSL_T3_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T3, IMDBDef9.PQSL_T3_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T3, IMDBDef9.PQSL_T3_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiQuietanza", "TipiQuietanzaOnUpdatingRowEvent", _e);
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
      if (MainFrm.MOD_PAGAM_DIVERSE.equals((new IDVariant("SI")), true) && MainFrm.Licenza(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0),(new IDVariant("CF4"))), (new IDVariant("MIF"))))
      {
        LICENZA = (new IDVariant("S"));
      }
      else
      {
        LICENZA = (new IDVariant("N"));
      }
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiQuietanza", "LoadEvent", _e);
    }
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPIQUIETANZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIQUIETANZ, Cancel);
    // Stub
  }

  private void PAN_TIPIQUIETANZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIQUIETANZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPIQUIETANZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIQUIETANZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIQUIETANZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_TIPIQUIEBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_TIPIQUIEBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_TIPIQUIEBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_TIPIQUIEBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_TIPIQUIEBOOK_SEC_DETAIL)
    {
      BUK_TIPIQUIEBOOK.set_SpanValue(BUK_TIPIQUIEBOOK_SPAN_NUVATATQTQBN, new IDVariant(IDL.NullValue(BUK_TIPIQUIEBOOK.GetReportColumn(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, "STAMPA_AVVISO"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_TIPIQUIEBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_TIPIQUIEBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_TIPIQUIEBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_TIPIQUIEBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG)
    {
      BUK_TIPIQUIEBOOK.set_SpanValue(BUK_TIPIQUIEBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIQUIEBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIQUIEBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_TIPIQUIEBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_TIPIQUIEBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_TIPIQUIEBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_TIPIQUIEBOOK_OnPreview()
  {
    PreviewBook = BKW_TIPIQUIEBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIQUIETANZ_Init()
  {

    PAN_TIPIQUIETANZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIQUIETANZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIQUIETANZ.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, "CC271410-7525-484A-85F7-632574A3E3B3");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, "Codice");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, "64CD429B-417A-476C-9463-5492AA4F48E8");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, "Descrizione");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, "3DBDD361-9218-4A40-84F7-CAC4C06E7831");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, "Avviso");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, "DA27874B-8899-4EC8-BFD1-82421C77A243");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, "Rif. Tesoreria");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, "24227936-46F2-4FD2-A17B-423352242EB7");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, "Rif.Tesoreria M.Inf.");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, "EBBC8351-D593-4E0A-B39D-EEC37F8C5437");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, "Descrizione per Mandato Informatico");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, "8118C84B-ECA6-4B96-BA8D-0CCBF092FB75");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, "Cod. Fattura Elettronica");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, "A3F3D914-9938-4986-86A6-64C4240C896A");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, "EEAD986B-2987-4ABF-A2E3-7A607A1AB62C");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, "DATA INSERIMENTO");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, "634CFDE3-1C65-4B85-9F94-487B59C44A24");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, "961188A0-82BB-43C9-AFCE-E3F70DAF6DCE");
    PAN_TIPIQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_TIPIQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, "");
    PAN_TIPIQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPIQUIETANZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, MyGlb.PANEL_FORM, 120);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_CODICE, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_CODICE, PPQRY_T3, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 48, 36, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 120);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_DESCRIZIONE, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_DESCRIZIONE, PPQRY_T3, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, MyGlb.PANEL_LIST, 276, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, MyGlb.PANEL_LIST, 88);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, MyGlb.PANEL_LIST, "Avviso");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, MyGlb.PANEL_FORM, 120);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_AVVISO, MyGlb.PANEL_FORM, "Avviso");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_AVVISO, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_AVVISO, PPQRY_T3, "A.STAMPA_AVVISO", "STAMPA_AVVISO", 5, 2, 0, -13997);
    PAN_TIPIQUIETANZ.SetValueListItem(PFL_TIPIQUIETANZ_AVVISO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIQUIETANZ.SetValueListItem(PFL_TIPIQUIETANZ_AVVISO, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, MyGlb.PANEL_LIST, 324, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, MyGlb.PANEL_LIST, 80);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, MyGlb.PANEL_LIST, "Rif. Tesoreria");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, MyGlb.PANEL_FORM, 4, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, MyGlb.PANEL_FORM, 120);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORERIA, MyGlb.PANEL_FORM, "Rif. Tesoreria");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_RIFTESORERIA, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_RIFTESORERIA, PPQRY_T3, "A.RIFERIMENTO", "RIFERIMENTO", 1, 2, 0, -13997);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, MyGlb.PANEL_LIST, 400, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, MyGlb.PANEL_LIST, 84);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, MyGlb.PANEL_LIST, "Rif.Tesoreria M.Inf.");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, MyGlb.PANEL_FORM, 120);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_RIFTESORMINF, MyGlb.PANEL_FORM, "Rif.Tesoreria M.Inf.");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_RIFTESORMINF, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_RIFTESORMINF, PPQRY_T3, "A.RIF_TESO_MINF", "RIF_TESO_MINF", 5, 3, 0, -13997);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, MyGlb.PANEL_LIST, 504, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, MyGlb.PANEL_LIST, 128);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, MyGlb.PANEL_LIST, "Descrizione per Mandato Informatico");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, MyGlb.PANEL_FORM, 4, 148, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, MyGlb.PANEL_FORM, 120);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DESPERMANINF, MyGlb.PANEL_FORM, "Desc. per Mnd. Inf.");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_DESPERMANINF, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_DESPERMANINF, PPQRY_T3, "A.DESCRIZIONE_MINF", "DESCRIZIONE_MINF", 5, 100, 0, -13997);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, MyGlb.PANEL_LIST, 768, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, MyGlb.PANEL_LIST, 64);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, MyGlb.PANEL_LIST, "Cod. Fattura Elettronica");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, MyGlb.PANEL_FORM, 4, 172, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, MyGlb.PANEL_FORM, 64);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_CODICEFE, MyGlb.PANEL_FORM, "C. Ftt. Elt.");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_CODICEFE, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_CODICEFE, PPQRY_T3, "A.CODICE_FE", "CODICE_FE", 5, 4, 0, -13997);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, MyGlb.PANEL_LIST, 804, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 172, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_UTENTEINSERI, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_UTENTEINSERI, PPQRY_T3, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, MyGlb.PANEL_LIST, 924, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, MyGlb.PANEL_FORM, 4, 196, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_DATAINSERIME, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_DATAINSERIME, PPQRY_T3, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 1032, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 220, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_UTENTULTIAGG, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_UTENTULTIAGG, PPQRY_T3, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 1144, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_TIPIQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_TIPIQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIQUIETANZ_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_TIPIQUIETANZ.SetFieldPage(PFL_TIPIQUIETANZ_DATAULTIMAGG, -1, -1);
    PAN_TIPIQUIETANZ.SetFieldPanel(PFL_TIPIQUIETANZ_DATAULTIMAGG, PPQRY_T3, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
  }

  private void PAN_TIPIQUIETANZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIQUIETANZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIQUIETANZ.SetIMDB(IMDB, "PQRY_T3", true);
    PAN_TIPIQUIETANZ.set_SetString(MyGlb.MASTER_ROWNAME, "T02");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.STAMPA_AVVISO as STAMPA_AVVISO, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.RIFERIMENTO as RIFERIMENTO, ");
    SQL.append("  A.RIF_TESO_MINF as RIF_TESO_MINF, ");
    SQL.append("  A.DESCRIZIONE_MINF as DESCRIZIONE_MINF, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.CODICE_FE as CODICE_FE ");
    PAN_TIPIQUIETANZ.SetQuery(PPQRY_T3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T02 A ");
    PAN_TIPIQUIETANZ.SetQuery(PPQRY_T3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIQUIETANZ.SetQuery(PPQRY_T3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIQUIETANZ.SetQuery(PPQRY_T3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIQUIETANZ.SetQuery(PPQRY_T3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIQUIETANZ.SetQuery(PPQRY_T3, 5, SQL, -1, "");
    PAN_TIPIQUIETANZ.SetQueryDB(PPQRY_T3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIQUIETANZ.SetMasterTable(0, "T02");
    PAN_TIPIQUIETANZ.AddToSortList(PFL_TIPIQUIETANZ_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIQUIETANZ.Status() == 2)
    {
      int oldListQBE = PAN_TIPIQUIETANZ.iUseListQBE;
      PAN_TIPIQUIETANZ.iUseListQBE = 0;
      PAN_TIPIQUIETANZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIQUIETANZ.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIQUIETANZ.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG_Init()
  {
    BUK_TIPIQUIEBOOK.InitMastro(BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG, "C11EF709-CCA1-4378-8EA3-AE2ACD3EEFEB");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG, "TIPQUIBOOPAG");
    BUK_TIPIQUIEBOOK.InitMastroBox(BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG, BUK_TIPIQUIEBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_NUMEROPAGINA, "F0BF8DF3-2B7D-4B99-B0D0-ECB95A9D88FA");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_NUMEROPAGINA, BUK_TIPIQUIEBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_NUMEROPAGINA, "F972E626-7C4B-42D3-92B4-5953597FD30D");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIQUIEBOOK.InitMastroBox(BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG, BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY, 1000, 3000, 19000, 25200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY, "70CF97DC-5F8B-4D2F-B434-A6D8BBC6FACF");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_TIPIQUIEBOOK.InitMastroBox(BUK_TIPIQUIEBOOK_MST_TIPQUIBOOPAG, BUK_TIPIQUIEBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_TITOLO, "149C82DB-C423-4720-A808-2E8D30578C61");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_TIPIQUIEBOOK_RPT_NEWREPORT_InitQuery() { BUK_TIPIQUIEBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_TIPIQUIEBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.STAMPA_AVVISO as STAMPA_AVVISO, ");
      SQL.append("  A.TIPO as TIPO, ");
      SQL.append("  A.RIFERIMENTO as RIFERIMENTO, ");
      SQL.append("  A.RIF_TESO_MINF as RIF_TESO_MINF, ");
      SQL.append("  A.DESCRIZIONE_MINF as DESCRIZIONE_MINF ");
      SQL.append("from ");
      SQL.append("  T02 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_TIPIQUIEBOOK.SetReportQuery(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "DF178091-0FC0-46C9-B3BA-32734F5FD2FD");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_TIPIQUIEBOOK_RPT_NEWREPORT_Init()
  {
    BUK_TIPIQUIEBOOK.InitReport(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, 196609);
    BUK_TIPIQUIEBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, "273D17A1-6B01-4D4B-ABFA-F9F336B76BBC");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_TIPIQUIEBOOK.InitSection(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIQUIEBOOK.SetSectionRendersInto(BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, "CED4AC15-9473-45E8-A5AB-8299AE34FF1E");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, BUK_TIPIQUIEBOOK_RPTBOX_CODICEHEADER, 100, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_CODICEHEADER, "AAA063CE-BA2C-450F-8B28-FDD6B3565CC3");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_CODICEHEADER, BUK_TIPIQUIEBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_CODICE, "CF60DAB8-47FD-4568-91C8-4468F8D2F709");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_CODICE, "CODICE");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, BUK_TIPIQUIEBOOK_RPTBOX_DESCRIHEADER, 1300, 0, 5600, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIHEADER, "E99493F0-B839-4D18-98D0-1383A3DFC883");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIHEADER, BUK_TIPIQUIEBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_DESCRIZIONE, "CF9A8B19-B1A9-4847-9FDE-022410C1A917");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, BUK_TIPIQUIEBOOK_RPTBOX_STAMAVVIHEAD, 7000, 0, 1089, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_STAMAVVIHEAD, "2A7DD6AE-6DEE-4785-BADF-589B28CB533E");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_STAMAVVIHEAD, "STAMAVVIHEAD");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_STAMAVVIHEAD, BUK_TIPIQUIEBOOK_SPAN_AVVISO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Avviso", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_AVVISO, "38C099E2-7784-417A-AE16-9D0302302347");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_AVVISO, "AVVISO");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, BUK_TIPIQUIEBOOK_RPTBOX_RIFERIHEADER, 8800, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_RIFERIHEADER, "C9F5599A-0293-4C00-891D-0FCEBB71ECF3");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_RIFERIHEADER, "RIFERIHEADER");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_RIFERIHEADER, BUK_TIPIQUIEBOOK_SPAN_RIFTESORERIA, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Rif.", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_RIFTESORERIA, "91D60503-9672-4000-B0DA-13A23781D33E");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_RIFTESORERIA, "RIFTESORERIA");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, BUK_TIPIQUIEBOOK_RPTBOX_RIFTESMINHEA, 10300, 0, 2248, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_RIFTESMINHEA, "81BFA214-86AE-4DBC-B30B-B723DB617450");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_RIFTESMINHEA, "RIFTESMINHEA");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_RIFTESMINHEA, BUK_TIPIQUIEBOOK_SPAN_RIFTESORMINF, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Rif.Teso. M.Inf.", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_RIFTESORMINF, "119629F8-194E-4B69-BC33-174B93DD0610");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_RIFTESORMINF, "RIFTESORMINF");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_PAGEHEADER, BUK_TIPIQUIEBOOK_RPTBOX_DESCMINFHEAD, 12710, 0, 6290, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_DESCMINFHEAD, "51657DCD-D370-4F85-BB2B-0B061D2492D6");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_DESCMINFHEAD, "DESCMINFHEAD");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_DESCMINFHEAD, BUK_TIPIQUIEBOOK_SPAN_DESPERMANINF, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione per Mandato Informatico", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_DESPERMANINF, "A4A1E5CF-799C-45E2-B151-2927DBB2977A");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_DESPERMANINF, "DESPERMANINF");
    BUK_TIPIQUIEBOOK.InitSection(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, BUK_TIPIQUIEBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIQUIEBOOK.SetSectionRendersInto(BUK_TIPIQUIEBOOK_SEC_TITOLO, BUK_TIPIQUIEBOOK_RPTBOX_TITOLO);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SEC_TITOLO, "AEED4506-0BED-497B-BDCB-A1C45A315048");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SEC_TITOLO, "TITOLO");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_TITOLO, BUK_TIPIQUIEBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_NEWBOX, "26FCB7E9-3F82-47F9-A296-E0ADF40F2FF4");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_NEWBOX, BUK_TIPIQUIEBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Tipi di Quietanza", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_VARIADIBILAN, "56EC765D-91A7-4C72-BAFD-B65184A1A75A");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_TIPIQUIEBOOK.InitSection(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, BUK_TIPIQUIEBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIQUIEBOOK.SetSectionRendersInto(BUK_TIPIQUIEBOOK_SEC_DETAIL, BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SEC_DETAIL, "766B2ABD-F50A-4393-9BFA-119FFCC0233F");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SEC_DETAIL, "DETAIL");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_DETAIL, BUK_TIPIQUIEBOOK_RPTBOX_CODICE, 0, 0, 1000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_CODICE, "0C9E829C-BCAC-4A47-9DAD-FEC3EC2A3EBE");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_CODICE, "CODICE");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_CODICE, BUK_TIPIQUIEBOOK_SPAN_T0COTIQUTIQB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_T0COTIQUTIQB, "21EB7550-CDD0-4463-A759-955F2D6EDD7F");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_T0COTIQUTIQB, "T0COTIQUTIQB");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_DETAIL, BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIONE, 1300, 0, 5661, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIONE, "5F2DFA96-BAD7-4859-918B-88E598129990");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIONE, BUK_TIPIQUIEBOOK_SPAN_T0DETIQUTIQB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_T0DETIQUTIQB, "9025FCCE-14D5-4081-B38E-9C89E96066E0");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_T0DETIQUTIQB, "T0DETIQUTIQB");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_DETAIL, BUK_TIPIQUIEBOOK_RPTBOX_STAMPAAVVISO, 7300, 0, 489, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_STAMPAAVVISO, "10346644-CB03-4F37-AFEA-23BF7332F989");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_STAMPAAVVISO, "STAMPAAVVISO");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_STAMPAAVVISO, BUK_TIPIQUIEBOOK_SPAN_NUVATATQTQBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_TIPIQUIEBOOK.SetSpanValueListItem(BUK_TIPIQUIEBOOK_SPAN_NUVATATQTQBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_TIPIQUIEBOOK.SetSpanValueListItem(BUK_TIPIQUIEBOOK_SPAN_NUVATATQTQBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_NUVATATQTQBN, "AFE82BB3-4006-41DC-B07E-D751730F235E");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_NUVATATQTQBN, "NUVATATQTQBN");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_DETAIL, BUK_TIPIQUIEBOOK_RPTBOX_RIFERIMENTO, 8300, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_RIFERIMENTO, "15C27F69-02F9-4537-A839-E87FAE30E9A3");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_RIFERIMENTO, "RIFERIMENTO");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_RIFERIMENTO, BUK_TIPIQUIEBOOK_SPAN_T0RITETIQTQB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::RIFERIMENTO", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_T0RITETIQTQB, "D3C423CE-8B9B-4E05-B4D4-C93717AAFF54");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_T0RITETIQTQB, "T0RITETIQTQB");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_DETAIL, BUK_TIPIQUIEBOOK_RPTBOX_RIFTESOMINF, 10300, 0, 2048, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_RIFTESOMINF, "F6A79DCE-186D-4941-B7C4-30E8F1964A30");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_RIFTESOMINF, "RIFTESOMINF");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_RIFTESOMINF, BUK_TIPIQUIEBOOK_SPAN_T0RITMITQTQB, MyGlb.VIS_DEFAREPOSTYL, 5, 3, 0, 271384705, "Brief description of field content.", "::RIF_TESO_MINF", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_T0RITMITQTQB, "145CA844-3BD2-40D7-B745-5F16C34E5E0B");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_T0RITMITQTQB, "T0RITMITQTQB");
    BUK_TIPIQUIEBOOK.InitReportBox(BUK_TIPIQUIEBOOK_SEC_DETAIL, BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIMINF, 12710, 0, 6290, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIMINF, "14259FAC-ED82-4633-967E-441E884480B0");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIMINF, "DESCRIZIMINF");
    BUK_TIPIQUIEBOOK.InitBoxSpan(BUK_TIPIQUIEBOOK_RPTBOX_DESCRIZIMINF, BUK_TIPIQUIEBOOK_SPAN_T0DEPMITQTQB, MyGlb.VIS_DEFAREPOSTYL, 5, 100, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE_MINF", 1);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SPAN_T0DEPMITQTQB, "1A6CFE88-3B48-4E8E-BF05-9FE7DBB35834");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SPAN_T0DEPMITQTQB, "T0DEPMITQTQB");
    BUK_TIPIQUIEBOOK.InitSection(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, BUK_TIPIQUIEBOOK_SEC_PAGEFOOTER, 400, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_TIPIQUIEBOOK.SetSectionRendersInto(BUK_TIPIQUIEBOOK_SEC_PAGEFOOTER, BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SEC_PAGEFOOTER, "C0D9AD3D-1F63-4255-AE73-CE34BD47DFCF");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_TIPIQUIEBOOK.InitSection(BUK_TIPIQUIEBOOK_RPT_NEWREPORT, BUK_TIPIQUIEBOOK_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_TIPIQUIEBOOK.SetSectionRendersInto(BUK_TIPIQUIEBOOK_SEC_REPORTFOOTER, BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIQUIEBOOK.SetRTCGuid(BUK_TIPIQUIEBOOK_SEC_REPORTFOOTER, "EC6A4867-C221-416F-9F48-EFAB46392E93");
    BUK_TIPIQUIEBOOK.SetObjCode(BUK_TIPIQUIEBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_TIPIQUIEBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_TIPIQUIEBOOK_InitLinks()
  {
    BUK_TIPIQUIEBOOK.SetBoxNextBox(BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY, BUK_TIPIQUIEBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIQUIETANZ) PAN_TIPIQUIETANZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIQUIETANZ) PAN_TIPIQUIETANZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIQUIETANZ) PAN_TIPIQUIETANZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIQUIETANZ) PAN_TIPIQUIETANZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIQUIETANZ) PAN_TIPIQUIETANZ_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_TIPIQUIETANZ) PAN_TIPIQUIETANZ_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_TIPIQUIETANZ) PAN_TIPIQUIETANZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_TIPIQUIEBOOK) BUK_TIPIQUIEBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_TIPIQUIEBOOK) BUK_TIPIQUIEBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_TIPIQUIEBOOK) BUK_TIPIQUIEBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_TIPIQUIEBOOK) BUK_TIPIQUIEBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_TIPIQUIEBOOK) BUK_TIPIQUIEBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_TIPIQUIEBOOK) BUK_TIPIQUIEBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_TIPIQUIEBOOK) BUK_TIPIQUIEBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_TIPIQUIEBOOK) BUK_TIPIQUIEBOOK_OnPreview();
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
