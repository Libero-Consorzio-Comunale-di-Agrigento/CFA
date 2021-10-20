// **********************************************
// Liquidazioni Ordinativi A Gruppi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioniOrdinativiAGruppi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_LIQUIDAGRUPP_CODICE = 0;
  private static int PFL_LIQUIDAGRUPP_DESCRIZIONE = 1;
  private static int PFL_LIQUIDAGRUPP_DATAULTIELAB = 2;
  private static int PFL_LIQUIDAGRUPP_SEZIONE = 3;
  private static int PFL_LIQUIDAGRUPP_IMPORTDAFILE = 4;
  private static int PFL_LIQUIDAGRUPP_TIPOFILE = 5;
  private static int PFL_LIQUIDAGRUPP_TIPOMOVI = 6;
  private static int PFL_LIQUIDAGRUPP_TIPO = 7;
  private static int PFL_LIQUIDAGRUPP_UTENTEINSERI = 8;
  private static int PFL_LIQUIDAGRUPP_DATAINSERIME = 9;
  private static int PFL_LIQUIDAGRUPP_UTENTULTIAGG = 10;
  private static int PFL_LIQUIDAGRUPP_DATAULTIMAGG = 11;

  private static int PPQRY_T73 = 0;

  private static int PPQRY_TIPIFILEIMP1 = 1;


  IDPanel PAN_LIQUIDAGRUPP;
  CIDREObj BUK_LIQUAGRUPBOO;
  OBook BKW_LIQUAGRUPBOO;
  //
  // Template Pages constants
  private static int BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA = 1;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIQUAGRUPBOO_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_PAGELIQUHEAD = 4;
  private static int BUK_LIQUAGRUPBOO_SPAN_LIQUIDAGRUP1 = 5;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_PAGEORDIHEAD = 6;
  private static int BUK_LIQUAGRUPBOO_SPAN_ORDINAAGRUPP = 7;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY = 8;

  //
  // Reports constants
  private static int BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP = 9;
  private static int BUK_LIQUAGRUPBOO_SEC_REPORTHEADER = 10;
  private static int BUK_LIQUAGRUPBOO_SEC_PAGEHEADER = 11;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_CODICEHEADER = 12;
  private static int BUK_LIQUAGRUPBOO_SPAN_CODICE = 13;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_DESCRIHEADER = 14;
  private static int BUK_LIQUAGRUPBOO_SPAN_DESCRIZIONE = 15;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_DDATAELABHEA = 16;
  private static int BUK_LIQUAGRUPBOO_SPAN_DATAULTIELAB = 17;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_SEZIONHEADER = 18;
  private static int BUK_LIQUAGRUPBOO_SPAN_C = 19;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_IMPODAFILHEA = 20;
  private static int BUK_LIQUAGRUPBOO_SPAN_IMPORTDAFILE = 21;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILEHEAD = 22;
  private static int BUK_LIQUAGRUPBOO_SPAN_TIPOFILE1 = 23;
  private static int BUK_LIQUAGRUPBOO_SEC_DETAIL = 24;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_CODICE = 25;
  private static int BUK_LIQUAGRUPBOO_SPAN_T7COLOAGLAGB = 26;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_DESCRIZIONE = 27;
  private static int BUK_LIQUAGRUPBOO_SPAN_T7DELOAGLAGB = 28;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_DDATAELAB = 29;
  private static int BUK_LIQUAGRUPBOO_SPAN_TDUELOAGLAGB = 30;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_SEZIONE = 31;
  private static int BUK_LIQUAGRUPBOO_SPAN_T7SELOAGLAGB = 32;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_IMPORTDAFILE = 33;
  private static int BUK_LIQUAGRUPBOO_SPAN_TIDFLOAGLAGB = 34;
  private static int BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILE = 35;
  private static int BUK_LIQUAGRUPBOO_SPAN_TIPOFILE = 36;
  private static int BUK_LIQUAGRUPBOO_SEC_PAGEFOOTER = 37;
  private static int BUK_LIQUAGRUPBOO_SEC_REPORTFOOTER = 38;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI266(IMDB);
    //
    //
    Init_PQRY_T73(IMDB);
    Init_PQRY_T72(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI266(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI266, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI266, "TBL_PARAMETRI266");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI266,IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, "PARAMLIQORD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI266,IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD,5,20,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI266, 0);
  }

  private static void Init_PQRY_T73(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_T73, 12);
    IMDB.set_TblCode(IMDBDef14.PQRY_T73, "PQRY_T73");
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_TIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_D_DATA_ELAB, "D_DATA_ELAB");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_D_DATA_ELAB,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_SEZIONE, "SEZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_SEZIONE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_IMPORT_DA_FILE, "IMPORT_DA_FILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_IMPORT_DA_FILE,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_TIPO_FILE, "TIPO_FILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_TIPO_FILE,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_TIPO_MOVI, "TIPO_MOVI");
    IMDB.SetFldParams(IMDBDef14.PQRY_T73,IMDBDef14.PQSL_T73_TIPO_MOVI,5,20,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_T73, 0);
  }

  private static void Init_PQRY_T72(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_T72, 11);
    IMDB.set_TblCode(IMDBDef14.PQRY_T72, "PQRY_T72");
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_TIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_D_DATA_ELAB, "D_DATA_ELAB");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_D_DATA_ELAB,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_T72SEZIONE, "T72SEZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_T72SEZIONE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_T72IMPODAFIL, "T72IMPODAFIL");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_T72IMPODAFIL,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_T72TIPOFILE, "T72TIPOFILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_T72,IMDBDef14.PQSL_T72_T72TIPOFILE,5,20,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_T72, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioniOrdinativiAGruppi(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioniOrdinativiAGruppi()
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
    FormIdx = MyGlb.FRM_LIQUORDIAGRU;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "75360783-97A8-4672-B04A-A9F11945109F";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 760;
    DesignHeight = 362;
    set_Caption(new IDVariant("Liquidazioni Ordinativi A Gruppi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 760;
    Frames[1].Height = 336;
    Frames[1].Caption = "Liquidazioni A Gruppi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_LIQUIDAGRUPP = new IDPanel(w, this, 1, "PAN_LIQUIDAGRUPP");
    Frames[1].Content = PAN_LIQUIDAGRUPP;
    PAN_LIQUIDAGRUPP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAGRUPP.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIQUAGRUPBOO != null)
      PAN_LIQUIDAGRUPP.SetBook(BUK_LIQUAGRUPBOO);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3E01AEBE-AEA7-4278-A138-CD18B30DD950");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 728, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAGRUPP.InitStatus = 2;
    PAN_LIQUIDAGRUPP_Init();
    PAN_LIQUIDAGRUPP_InitFields();
    PAN_LIQUIDAGRUPP_InitQueries();
    BKW_LIQUAGRUPBOO = new OBook(this);
    BUK_LIQUAGRUPBOO = new CIDREObj(BKW_LIQUAGRUPBOO);
    BKW_LIQUAGRUPBOO.iGuid = "5CC770E3-DD29-4EF6-8053-D4F14979EFE6";
    BKW_LIQUAGRUPBOO.Code = "BUK_LIQUAGRUPBOO";
    BKW_LIQUAGRUPBOO.BookObj = BUK_LIQUAGRUPBOO;
    BKW_LIQUAGRUPBOO.InitDefMasks();
    BUK_LIQUAGRUPBOO.InitBook(1, 1245185, "Liquidazioni A Gruppi Book", IMDB, MainFrm.VisualStyleList);
    BUK_LIQUAGRUPBOO.InitHTML();
    BUK_LIQUAGRUPBOO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIQUAGRUPBOO.Book.SetMainFrm(MainFrm);
    BUK_LIQUAGRUPBOO.SetRTCGuid(0, "5CC770E3-DD29-4EF6-8053-D4F14979EFE6");
    BUK_LIQUAGRUPBOO.SetObjCode(0, "LIQUAGRUPBOO");
    if (PAN_LIQUIDAGRUPP != null)
      PAN_LIQUIDAGRUPP.SetBook(BUK_LIQUAGRUPBOO);
    BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA_Init();
    BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP_Init();
    BUK_LIQUAGRUPBOO_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG187+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI48+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG187+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DETTAGGRUPP1+BaseCmdLinIdx)
      {
        ApriDettagliGruppo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DUPLICGRUPPO+BaseCmdLinIdx)
      {
        ApriDuplicaGruppo();
        break fine;
      }
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
      PAN_LIQUIDAGRUPP.UpdatePanel(MainFrm);
      // BUK_LIQUAGRUPBOO.UpdateBook();
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
    if (Code.equals("BUK_LIQUAGRUPBOO")) return BUK_LIQUAGRUPBOO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof LiquidazioniOrdinativiAGruppi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioniOrdinativiAGruppi.class.getName() : (Glb.ClassWithPackage(LiquidazioniOrdinativiAGruppi.class) ? LiquidazioniOrdinativiAGruppi.class.getName().substring(LiquidazioniOrdinativiAGruppi.class.getPackage().getName().length() + 1) : LiquidazioniOrdinativiAGruppi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("LIQ")), true) || IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("SP")), true))
      {
        IDVariant v_LIQUIDAZIONI = new IDVariant(0,IDVariant.STRING);
        v_LIQUIDAZIONI = (new IDVariant("Liquidazioni a Gruppi", IDVariant.STRING));
        set_Caption(new IDVariant(v_LIQUIDAZIONI));
        Frames[PAN_LIQUIDAGRUPP.FrIndex].set_Caption(new IDVariant(v_LIQUIDAZIONI).stringValue());
      }
      else
      {
        IDVariant v_ORDINATIVI = new IDVariant(0,IDVariant.STRING);
        v_ORDINATIVI = (new IDVariant("Ordinativi a Gruppi", IDVariant.STRING));
        set_Caption(new IDVariant(v_ORDINATIVI));
        Frames[PAN_LIQUIDAGRUPP.FrIndex].set_Caption(new IDVariant(v_ORDINATIVI).stringValue());
      }
      PAN_LIQUIDAGRUPP.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("SP")), true) || IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("EP")), true))
      {
        PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_IMPODAFILHEA, (new IDVariant(0)).booleanValue());
        BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILEHEAD, (new IDVariant(0)).booleanValue());
        BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_IMPORTDAFILE, (new IDVariant(0)).booleanValue());
        BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILE, (new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("LIQ")), true))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          // 
          // In caso di liquidazioni l'import file è visibile se
          // esiste almeno un record su TIPI_FILE_IMPORT con TIPO
          // MOVI = LIQ
          // 
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  TIPI_FILE_IMPORT A ");
          SQL.append("where (A.TIPO_MOVI = 'LIQ') ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
          {
            PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_IMPODAFILHEA, (new IDVariant(0)).booleanValue());
          BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILEHEAD, (new IDVariant(0)).booleanValue());
          BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_IMPORTDAFILE, (new IDVariant(0)).booleanValue());
          BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILE, (new IDVariant(0)).booleanValue());
        }
        else
        {
          PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_IMPODAFILHEA, (new IDVariant(-1)).booleanValue());
          BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILEHEAD, (new IDVariant(-1)).booleanValue());
          BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_IMPORTDAFILE, (new IDVariant(-1)).booleanValue());
          BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILE, (new IDVariant(-1)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_DUPLICGRUPPO)), true)) && Result.booleanValue())
      {
        PAN_LIQUIDAGRUPP.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni A Gruppi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAGRUPP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIDAGRUPP);
      // 
      // Liquidazioni A Gruppi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_LIQUIDAGRUPP.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAGRUPP_DESCRIZIONE,(new IDVariant(PAN_LIQUIDAGRUPP.FieldText(PFL_LIQUIDAGRUPP_DESCRIZIONE))).stringValue()); 
      PAN_LIQUIDAGRUPP.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAGRUPP_TIPOMOVI,(new IDVariant(PAN_LIQUIDAGRUPP.FieldText(PFL_LIQUIDAGRUPP_TIPOMOVI))).stringValue()); 
      if (PAN_LIQUIDAGRUPP.IsNewRow())
      {
        PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_IMPORT_DA_FILE, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_LIQUIDAGRUPP.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "LiquidazioniAGruppiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni A Gruppi On Database Error Event
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
  private void PAN_LIQUIDAGRUPP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_LIQUIDAGRUPP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Liquidazioni A Gruppi On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "LiquidazioniAGruppiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni A Gruppi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_LIQUIDAGRUPP_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni A Gruppi On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQUIDAGRUPP_IMPORTDAFILE)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_IMPORT_DA_FILE, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO_FILE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO_MOVI, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQUIDAGRUPP_TIPOFILE)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO_FILE, 0))))
        {
          IDVariant v_VTIPOMOVI = null;
          v_VTIPOMOVI = (new IDVariant("ORD"));
          if (IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("LIQ")), true))
          {
            v_VTIPOMOVI = (new IDVariant("LIQ"));
          }
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  TIPI_FILE_IMPORT A ");
          SQL.append("where (A.TIPO_FILE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO_FILE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_MOVI = " + IDL.CSql(v_VTIPOMOVI, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
            v_AVVISO = (new IDVariant("Tipo File non valido"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO_FILE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO_MOVI, 0, (new IDVariant()));
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO_MOVI, 0, new IDVariant(v_VTIPOMOVI));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO_MOVI, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "LiquidazioniAGruppiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni A Gruppi On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_LIQUIDAGRUPP_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni A Gruppi On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.T72PD(IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "LiquidazioniAGruppiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni A Gruppi On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_LIQUIDAGRUPP_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni A Gruppi On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_LIQUIDAGRUPP.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET17+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET17+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "LiquidazioniAGruppiOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni A Gruppi Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_LIQUIDAGRUPP_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni A Gruppi Before Insert Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).compareTo((new IDVariant("LIQ")), true)!=0 && IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).compareTo((new IDVariant("ORD")), true)!=0)
      {
        IMDB.set_Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "LiquidazioniAGruppiBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni A Gruppi On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_LIQUIDAGRUPP_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni A Gruppi On Change Row Body
      // Corpo Procedura
      // 
      if (PAN_LIQUIDAGRUPP.IsNewRow())
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DUPLICGRUPPO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DUPLICGRUPPO+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "LiquidazioniAGruppiOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni A Gruppi Book Page On Formatting Event
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA_OnFormattingPage()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni A Gruppi Book Page On Formatting Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("LIQ")), true))
      {
        BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_PAGELIQUHEAD, (new IDVariant(-1)).booleanValue());
        BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_PAGEORDIHEAD, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_PAGELIQUHEAD, (new IDVariant(0)).booleanValue());
        BUK_LIQUAGRUPBOO.set_BoxVisible(BUK_LIQUAGRUPBOO_RPTBOX_PAGEORDIHEAD, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "LiquidazioniAGruppiBookPageOnFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Duplica Gruppo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriDuplicaGruppo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Duplica Gruppo Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("LIQ")), true) || IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("SP")), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGLIQORD, 0, (new IDVariant("L")));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGLIQORD, 0, (new IDVariant("O")));
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGOLDGRU, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_CODICE, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGOLDDES, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_DESCRIZIONE, 0));
      MainFrm.Show(MyGlb.FRM_DUPLICGRUPPO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "ApriDuplicaGruppo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Dettagli Gruppo
  // **********************************************************************
  public int ApriDettagliGruppo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Dettagli Gruppo Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_CODICE, 0))))
      {
        if (IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("LIQ")), true) || IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0).equals((new IDVariant("SP")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI273, IMDBDef5.FLD_PARAMETRI273_PARACODIGRUP, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_CODICE, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI273, IMDBDef5.FLD_PARAMETRI273_PARADESCGRUP, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_DESCRIZIONE, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI273, IMDBDef5.FLD_PARAMETRI273_PARAMTIPO, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI273, IMDBDef5.FLD_PARAMETRI273_PARAENTRSPES, 0, (new IDVariant("S")));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI273, IMDBDef5.FLD_PARAMETRI273_PARDATULTELA, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_D_DATA_ELAB, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI273, IMDBDef5.FLD_PARAMETRI273_PARATIPOLIQU, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI266, IMDBDef5.FLD_PARAMETRI266_PARAMLIQORD, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI273, IMDBDef5.FLD_PARAMETRI273_PARAIMPOFILE, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_IMPORT_DA_FILE, 0));
          MainFrm.Show(MyGlb.FRM_DETTGRUPLIQU, (new IDVariant(0)).intValue(), this); 
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARACODIGRUP, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_CODICE, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARADESCGRUP, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_DESCRIZIONE, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAMTIPO, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_TIPO, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAENTRSPES, 0, (new IDVariant("E")));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARDATULTELA, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_D_DATA_ELAB, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI311, IMDBDef5.FLD_PARAMETRI311_PARAIMPDAFIL, 0, IMDB.Value(IMDBDef14.PQRY_T73, IMDBDef14.PQSL_T73_IMPORT_DA_FILE, 0));
          MainFrm.Show(MyGlb.FRM_DETTGRUPORDI, (new IDVariant(0)).intValue(), this); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniOrdinativiAGruppi", "ApriDettagliGruppo", _e);
      return -1;
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
  private void PAN_LIQUIDAGRUPP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDAGRUPP, Cancel);
    // Stub
  }

  private void PAN_LIQUIDAGRUPP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_LIQUIDAGRUPP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_LIQUIDAGRUPP_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAGRUPP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAGRUPP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIQUAGRUPBOO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIQUAGRUPBOO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIQUAGRUPBOO_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_LIQUAGRUPBOO_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_LIQUAGRUPBOO_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_LIQUAGRUPBOO_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_LIQUAGRUPBOO_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_LIQUAGRUPBOO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIQUAGRUPBOO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA)
    {
      BUK_LIQUAGRUPBOO.set_SpanValue(BUK_LIQUAGRUPBOO_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIQUAGRUPBOO.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIQUAGRUPBOO.GetTotalPagesNumber()))))));
      BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA_OnFormattingPage();
    }
  }

  private void BUK_LIQUAGRUPBOO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIQUAGRUPBOO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIQUAGRUPBOO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIQUAGRUPBOO_OnPreview()
  {
    PreviewBook = BKW_LIQUAGRUPBOO;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIDAGRUPP_Init()
  {

    PAN_LIQUIDAGRUPP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAGRUPP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDAGRUPP.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, "B46D1883-FC46-4C87-AB33-A7D9859B8522");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, "Codice");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, "BA934D6A-2429-45CE-9FAA-1A76E0DD860D");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, "Descrizione");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, "747C5EE2-1FD8-4217-9701-3B92E6C5AB46");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, "Data Ultima Elaborazione");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, "45EE802E-F143-4051-89F4-ED54BF4A590E");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, "Sezione");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, "C886F8E2-798C-4F19-91A0-9A965B40D296");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, "Import da File");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, "016BAC39-5B8E-4BB5-B781-D855F6930016");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, "Tipo File");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, "9CB890FF-FAD0-429C-BEEF-668A1B3633E7");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, "Tipo Movimenti");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, 0 | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, "48C1E8A1-0CAF-4FAD-BE29-4E024AE22B0B");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, "TIPO");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, "8383FBE7-BC5F-4911-AA46-8484898F5535");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, "F7A45A62-CC05-48E2-88AF-A856CE4E6BF6");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, "DATA INSERIMENTO");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, "38ADF2D0-9AEC-4F39-B48E-F98528DD2774");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAGRUPP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, "C0D9BB8F-96D2-42D9-8380-126C0DCF0425");
    PAN_LIQUIDAGRUPP.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_LIQUIDAGRUPP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, "");
    PAN_LIQUIDAGRUPP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAGRUPP.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LIQUIDAGRUPP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_CODICE, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_CODICE, PPQRY_T73, "A.CODICE", "CODICE", 1, 3, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, MyGlb.PANEL_LIST, 48, 36, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_DESCRIZIONE, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_DESCRIZIONE, PPQRY_T73, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, MyGlb.PANEL_LIST, 396, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, MyGlb.PANEL_LIST, "Data Ultima Elaborazione");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, MyGlb.PANEL_FORM, 4, 124, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, MyGlb.PANEL_FORM, 96);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIELAB, MyGlb.PANEL_FORM, "Dt. Ult. Elabor.");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_DATAULTIELAB, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_DATAULTIELAB, PPQRY_T73, "A.D_DATA_ELAB", "D_DATA_ELAB", 6, 10, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, MyGlb.PANEL_LIST, 484, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, MyGlb.PANEL_LIST, "Sezione");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, MyGlb.PANEL_FORM, 4, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_SEZIONE, MyGlb.PANEL_FORM, "Sezione");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_SEZIONE, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_SEZIONE, PPQRY_T73, "A.SEZIONE", "SEZIONE", 5, 8, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, MyGlb.PANEL_LIST, 552, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, MyGlb.PANEL_LIST, "Import da File");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, MyGlb.PANEL_FORM, 4, 316, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_IMPORTDAFILE, MyGlb.PANEL_FORM, "Import da File");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_IMPORTDAFILE, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_IMPORTDAFILE, PPQRY_T73, "A.IMPORT_DA_FILE", "IMPORT_DA_FILE", 5, 2, 0, -13997);
    PAN_LIQUIDAGRUPP.SetValueListItem(PFL_LIQUIDAGRUPP_IMPORTDAFILE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_LIQUIDAGRUPP.SetValueListItem(PFL_LIQUIDAGRUPP_IMPORTDAFILE, (new IDVariant()), "Null", "", "", -1);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, MyGlb.PANEL_LIST, 600, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, MyGlb.PANEL_LIST, 64);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, MyGlb.PANEL_LIST, "Tipo File");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, MyGlb.PANEL_FORM, 4, 340, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOFILE, MyGlb.PANEL_FORM, "Tipo File");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_TIPOFILE, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_TIPOFILE, PPQRY_T73, "A.TIPO_FILE", "TIPO_FILE", 5, 20, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, MyGlb.PANEL_LIST, 716, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, MyGlb.PANEL_LIST, "Tipo Movimenti");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, MyGlb.PANEL_FORM, 4, 364, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPOMOVI, MyGlb.PANEL_FORM, "Tp. Movim.");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_TIPOMOVI, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_TIPOMOVI, PPQRY_T73, "A.TIPO_MOVI", "TIPO_MOVI", 5, 20, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, MyGlb.PANEL_LIST, 440, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, MyGlb.PANEL_FORM, 96);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_TIPO, MyGlb.PANEL_FORM, "TIPO");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_TIPO, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_TIPO, PPQRY_T73, "A.TIPO", "TIPO", 5, 2, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, MyGlb.PANEL_LIST, 480, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 196, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_UTENTEINSERI, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_UTENTEINSERI, PPQRY_T73, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, MyGlb.PANEL_LIST, 480, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_DATAINSERIME, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_DATAINSERIME, PPQRY_T73, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, MyGlb.PANEL_LIST, 480, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 244, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_UTENTULTIAGG, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_UTENTULTIAGG, PPQRY_T73, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, MyGlb.PANEL_LIST, 480, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_LIQUIDAGRUPP.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 268, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAGRUPP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAGRUPP.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAGRUPP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAGRUPP_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_LIQUIDAGRUPP.SetFieldPage(PFL_LIQUIDAGRUPP_DATAULTIMAGG, -1, -1);
    PAN_LIQUIDAGRUPP.SetFieldPanel(PFL_LIQUIDAGRUPP_DATAULTIMAGG, PPQRY_T73, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
  }

  private void PAN_LIQUIDAGRUPP_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAGRUPP.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_MOVI as TIPFILIMTIMO, ");
    SQL.append("  A.DESCR_TIPO_MOVI as TIFIIMDETIMO ");
    SQL.append("from ");
    SQL.append("  TIPI_FILE_IMPORT A ");
    SQL.append("where (A.TIPO_MOVI = ~~TIPO_MOVI~~) ");
    SQL.append("and   (A.TIPO_FILE = ~~TIPO_FILE~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCR_TIPO_MOVI ");
    PAN_LIQUIDAGRUPP.SetQuery(PPQRY_TIPIFILEIMP1, 0, SQL, PFL_LIQUIDAGRUPP_TIPOMOVI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_MOVI as TIPFILIMTIMO, ");
    SQL.append("  A.DESCR_TIPO_MOVI as TIFIIMDETIMO ");
    SQL.append("from ");
    SQL.append("  TIPI_FILE_IMPORT A ");
    SQL.append("where (A.TIPO_FILE = ~~TIPO_FILE~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCR_TIPO_MOVI ");
    PAN_LIQUIDAGRUPP.SetQuery(PPQRY_TIPIFILEIMP1, 1, SQL, PFL_LIQUIDAGRUPP_TIPOMOVI, "");
    PAN_LIQUIDAGRUPP.SetQueryDB(PPQRY_TIPIFILEIMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAGRUPP.SetIMDB(IMDB, "PQRY_T73", true);
    PAN_LIQUIDAGRUPP.set_SetString(MyGlb.MASTER_ROWNAME, "T72");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.D_DATA_ELAB as D_DATA_ELAB, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.SEZIONE as SEZIONE, ");
    SQL.append("  A.IMPORT_DA_FILE as IMPORT_DA_FILE, ");
    SQL.append("  A.TIPO_FILE as TIPO_FILE, ");
    SQL.append("  A.TIPO_MOVI as TIPO_MOVI ");
    PAN_LIQUIDAGRUPP.SetQuery(PPQRY_T73, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T72 A ");
    PAN_LIQUIDAGRUPP.SetQuery(PPQRY_T73, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (((A.TIPO IS NULL) AND (~~TBL_PARAMETRI266.PARAMLIQORD~~ = 'LIQ' OR ~~TBL_PARAMETRI266.PARAMLIQORD~~ = 'ORD')) OR (NVL(A.TIPO, 'XXX') = ~~TBL_PARAMETRI266.PARAMLIQORD~~)) ");
    SQL.append("and   ((A.IMPORT_DA_FILE IS NULL) OR A.TIPO_MOVI = ~~TBL_PARAMETRI266.PARAMLIQORD~~) ");
    PAN_LIQUIDAGRUPP.SetQuery(PPQRY_T73, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAGRUPP.SetQuery(PPQRY_T73, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAGRUPP.SetQuery(PPQRY_T73, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_LIQUIDAGRUPP.SetQuery(PPQRY_T73, 5, SQL, -1, "");
    PAN_LIQUIDAGRUPP.SetQueryDB(PPQRY_T73, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAGRUPP.SetMasterTable(0, "T72");
    PAN_LIQUIDAGRUPP.AddToSortList(PFL_LIQUIDAGRUPP_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAGRUPP.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAGRUPP.iUseListQBE;
      PAN_LIQUIDAGRUPP.iUseListQBE = 0;
      PAN_LIQUIDAGRUPP.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAGRUPP.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAGRUPP.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA_Init()
  {
    BUK_LIQUAGRUPBOO.InitMastro(BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA, 3, 21000, 29700, 1, 1, 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA, "20758B99-E673-48EE-A411-32536206D7F0");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA, "LIQAGRUBOOPA");
    BUK_LIQUAGRUPBOO.InitMastroBox(BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA, BUK_LIQUAGRUPBOO_RPTBOX_NUMEROPAGINA, 18400, 500, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_NUMEROPAGINA, "BE79E172-BD48-4DE0-A74F-A2E7E37F513D");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_NUMEROPAGINA, BUK_LIQUAGRUPBOO_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_NUMEROPAGINA, "D78CE52C-D5C8-48AE-A625-8B5647F92BCB");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIQUAGRUPBOO.InitMastroBox(BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA, BUK_LIQUAGRUPBOO_RPTBOX_PAGELIQUHEAD, 1000, 1000, 19000, 1200, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_PAGELIQUHEAD, "B11BC537-65DC-4D65-BAC0-D465FE590D9C");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_PAGELIQUHEAD, "PAGELIQUHEAD");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_PAGELIQUHEAD, BUK_LIQUAGRUPBOO_SPAN_LIQUIDAGRUP1, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Liquidazione a Gruppi", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_LIQUIDAGRUP1, "D0FFA303-58C4-417C-81BE-E0F60ACE8305");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_LIQUIDAGRUP1, "LIQUIDAGRUP1");
    BUK_LIQUAGRUPBOO.InitMastroBox(BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA, BUK_LIQUAGRUPBOO_RPTBOX_PAGEORDIHEAD, 1000, 1000, 19000, 1200, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_PAGEORDIHEAD, "BF839121-04F7-4847-8245-79CE9944E2E7");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_PAGEORDIHEAD, "PAGEORDIHEAD");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_PAGEORDIHEAD, BUK_LIQUAGRUPBOO_SPAN_ORDINAAGRUPP, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Ordinativi a Gruppi", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_ORDINAAGRUPP, "12A90AD8-C387-413F-B2D1-44B18BB0DEC4");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_ORDINAAGRUPP, "ORDINAAGRUPP");
    BUK_LIQUAGRUPBOO.InitMastroBox(BUK_LIQUAGRUPBOO_MST_LIQAGRUBOOPA, BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY, 1000, 2400, 19000, 26200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY, "98258F77-7946-41ED-9866-912ABF28B6AF");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP_InitQuery() { BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP_InitQuery(true, true); }
  private void BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.TIPO as TIPO, ");
      SQL.append("  A.D_DATA_ELAB as D_DATA_ELAB, ");
      SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
      SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
      SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
      SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
      SQL.append("  A.SEZIONE as T72SEZIONE, ");
      SQL.append("  A.IMPORT_DA_FILE as T72IMPODAFIL, ");
      SQL.append("  A.TIPO_FILE as T72TIPOFILE ");
      SQL.append("from ");
      SQL.append("  T72 A ");
      SQL.append("where (((A.TIPO IS NULL) AND (~~TBL_PARAMETRI266.PARAMLIQORD~~ = 'LIQ' OR ~~TBL_PARAMETRI266.PARAMLIQORD~~ = 'ORD')) OR (NVL(A.TIPO, 'XXX') = ~~TBL_PARAMETRI266.PARAMLIQORD~~)) ");
      SQL.append("and   ((A.IMPORT_DA_FILE IS NULL) OR A.TIPO_MOVI = ~~TBL_PARAMETRI266.PARAMLIQORD~~) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_LIQUAGRUPBOO.SetReportQuery(BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "7876FC93-1E44-4570-9926-BA5CC293AEE4");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP_Init()
  {
    BUK_LIQUAGRUPBOO.InitReport(BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP, 196865);
    BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP_InitQuery(true, false);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP, "74E8F1C3-8221-45CF-BD32-C3F27770B6F4");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP, "LIQUAGRUPREP");
    BUK_LIQUAGRUPBOO.InitSection(BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP, BUK_LIQUAGRUPBOO_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUAGRUPBOO.SetSectionRendersInto(BUK_LIQUAGRUPBOO_SEC_REPORTHEADER, BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SEC_REPORTHEADER, "3C8BCD97-EDE7-4CB5-A5A8-8299ED9416AE");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_LIQUAGRUPBOO.InitSection(BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP, BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, 2200, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUAGRUPBOO.SetSectionRendersInto(BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, "68076DA8-071A-4E4D-B753-8AAC547E6A8E");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, BUK_LIQUAGRUPBOO_RPTBOX_CODICEHEADER, 0, 200, 1100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_CODICEHEADER, "23B7CC70-2BEA-4BD5-994D-62FB0B5C4A66");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_CODICEHEADER, BUK_LIQUAGRUPBOO_SPAN_CODICE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_CODICE, "4B009028-1B2D-484D-9C15-053C9A6E1A96");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_CODICE, "CODICE");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, BUK_LIQUAGRUPBOO_RPTBOX_DESCRIHEADER, 1300, 200, 9000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_DESCRIHEADER, "E5F455C6-FCBA-419A-8525-3F9F9B5C0206");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_DESCRIHEADER, BUK_LIQUAGRUPBOO_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_DESCRIZIONE, "C03EEEFA-DB5D-40C1-81E1-F1AD5DE0800E");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, BUK_LIQUAGRUPBOO_RPTBOX_DDATAELABHEA, 10500, 0, 2300, 1100, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_DDATAELABHEA, "DC3353ED-F368-4B68-8885-FFA62A179546");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_DDATAELABHEA, "DDATAELABHEA");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_DDATAELABHEA, BUK_LIQUAGRUPBOO_SPAN_DATAULTIELAB, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Data Ultima Elaborazione", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_DATAULTIELAB, "4D90F7DE-23EB-4C01-ACA4-C5C15B328D2F");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_DATAULTIELAB, "DATAULTIELAB");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, BUK_LIQUAGRUPBOO_RPTBOX_SEZIONHEADER, 12900, 200, 1700, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_SEZIONHEADER, "BF6B195D-981A-43E3-BF42-EF1BF9FCBCA9");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_SEZIONHEADER, "SEZIONHEADER");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_SEZIONHEADER, BUK_LIQUAGRUPBOO_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Sezione", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_C, "52F8E08F-F2A1-419B-8BF5-81DF9868DD4F");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_C, "C");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, BUK_LIQUAGRUPBOO_RPTBOX_IMPODAFILHEA, 14700, 0, 1200, 1100, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_IMPODAFILHEA, "D09EFB2E-65B7-4339-9FFC-0E79B5537C6A");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_IMPODAFILHEA, "IMPODAFILHEA");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_IMPODAFILHEA, BUK_LIQUAGRUPBOO_SPAN_IMPORTDAFILE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Import da File", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_IMPORTDAFILE, "C4197A9B-EE3B-433A-8544-6E3C11F3DDE7");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_IMPORTDAFILE, "IMPORTDAFILE");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_PAGEHEADER, BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILEHEAD, 16000, 0, 3000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILEHEAD, "D54BE3D4-2075-436D-AE34-918AD886BF36");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILEHEAD, "TIPOFILEHEAD");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILEHEAD, BUK_LIQUAGRUPBOO_SPAN_TIPOFILE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Tipo File", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_TIPOFILE1, "BB755A76-E73D-4154-B533-1F2DB68EAEBE");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_TIPOFILE1, "TIPOFILE1");
    BUK_LIQUAGRUPBOO.InitSection(BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP, BUK_LIQUAGRUPBOO_SEC_DETAIL, 1000, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUAGRUPBOO.SetSectionRendersInto(BUK_LIQUAGRUPBOO_SEC_DETAIL, BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SEC_DETAIL, "49CB9667-4CE2-4377-AA38-A9BE9F97D363");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SEC_DETAIL, "DETAIL");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_DETAIL, BUK_LIQUAGRUPBOO_RPTBOX_CODICE, 0, 0, 800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_CODICE, "18194C44-EFAE-4F76-B676-8AB5A3205E7D");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_CODICE, "CODICE");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_CODICE, BUK_LIQUAGRUPBOO_SPAN_T7COLOAGLAGB, MyGlb.VIS_DEFAREPOSTYL, 1, 3, 0, 271384705, "", "::CODICE", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_T7COLOAGLAGB, "B2BF12B4-3F16-4068-9182-ACF4F47EC480");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_T7COLOAGLAGB, "T7COLOAGLAGB");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_DETAIL, BUK_LIQUAGRUPBOO_RPTBOX_DESCRIZIONE, 1300, 0, 9000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_DESCRIZIONE, "1E0B26E3-BD2E-4784-B775-6300AC1A1030");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_DESCRIZIONE, BUK_LIQUAGRUPBOO_SPAN_T7DELOAGLAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "", "::DESCRIZIONE", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_T7DELOAGLAGB, "D1261881-2276-4CE8-B5DF-A7B52EC142B4");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_T7DELOAGLAGB, "T7DELOAGLAGB");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_DETAIL, BUK_LIQUAGRUPBOO_RPTBOX_DDATAELAB, 10500, 0, 2300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_DDATAELAB, "60F47031-BA55-4CB1-A6B6-97165D799FC6");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_DDATAELAB, "DDATAELAB");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_DDATAELAB, BUK_LIQUAGRUPBOO_SPAN_TDUELOAGLAGB, MyGlb.VIS_DEFAREPOSTYL, 6, 10, 0, 271384705, "", "::D_DATA_ELAB", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_TDUELOAGLAGB, "A5901336-F412-413F-BA05-DC717E549FBD");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_TDUELOAGLAGB, "TDUELOAGLAGB");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_DETAIL, BUK_LIQUAGRUPBOO_RPTBOX_SEZIONE, 12900, 0, 1700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_SEZIONE, "104ADF8D-C574-42D9-A98D-675FD3CB5F43");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_SEZIONE, "SEZIONE");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_SEZIONE, BUK_LIQUAGRUPBOO_SPAN_T7SELOAGLAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 8, 0, 271384705, "Brief description of field content.", "::T72SEZIONE", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_T7SELOAGLAGB, "D99CE38F-C9A7-4880-80E2-EA3B896C26F8");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_T7SELOAGLAGB, "T7SELOAGLAGB");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_DETAIL, BUK_LIQUAGRUPBOO_RPTBOX_IMPORTDAFILE, 15000, 0, 600, 500, 0, 1, 1, MyGlb.VIS_CHECKBOX, 983041, 322, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_IMPORTDAFILE, "4DCF2C86-64B0-4D05-8BF9-F7B7FCE24FEA");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_IMPORTDAFILE, "IMPORTDAFILE");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_IMPORTDAFILE, BUK_LIQUAGRUPBOO_SPAN_TIDFLOAGLAGB, MyGlb.VIS_CHECKBOX, 5, 2, 0, 271384705, "", "::T72IMPODAFIL", 1);
    BUK_LIQUAGRUPBOO.SetSpanValueListItem(BUK_LIQUAGRUPBOO_SPAN_TIDFLOAGLAGB, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "", -1);
    BUK_LIQUAGRUPBOO.SetSpanValueListItem(BUK_LIQUAGRUPBOO_SPAN_TIDFLOAGLAGB, "Null", "Type the value and explain what it means.", (new IDVariant()), null, "", -1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_TIDFLOAGLAGB, "82DBF9B6-C16A-4DBF-9BA9-5BDC7B0A4C33");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_TIDFLOAGLAGB, "TIDFLOAGLAGB");
    BUK_LIQUAGRUPBOO.InitReportBox(BUK_LIQUAGRUPBOO_SEC_DETAIL, BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILE, 16000, 0, 3000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILE, "86503CD6-4C89-4D1D-92F7-CE66330D8554");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILE, "TIPOFILE");
    BUK_LIQUAGRUPBOO.InitBoxSpan(BUK_LIQUAGRUPBOO_RPTBOX_TIPOFILE, BUK_LIQUAGRUPBOO_SPAN_TIPOFILE, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384705, "", "::T72TIPOFILE", 1);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SPAN_TIPOFILE, "2F2B703E-920B-4EAE-A3F9-37047E6AD12A");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SPAN_TIPOFILE, "TIPOFILE");
    BUK_LIQUAGRUPBOO.InitSection(BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP, BUK_LIQUAGRUPBOO_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUAGRUPBOO.SetSectionRendersInto(BUK_LIQUAGRUPBOO_SEC_PAGEFOOTER, BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SEC_PAGEFOOTER, "0D5B26A1-2EEA-45BC-B21D-BD23C11DBA16");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_LIQUAGRUPBOO.InitSection(BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP, BUK_LIQUAGRUPBOO_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUAGRUPBOO.SetSectionRendersInto(BUK_LIQUAGRUPBOO_SEC_REPORTFOOTER, BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY);
    BUK_LIQUAGRUPBOO.SetRTCGuid(BUK_LIQUAGRUPBOO_SEC_REPORTFOOTER, "CFD7D590-3FCE-4FE1-9E09-3A9BDDD2629C");
    BUK_LIQUAGRUPBOO.SetObjCode(BUK_LIQUAGRUPBOO_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_LIQUAGRUPBOO_RPT_LIQUAGRUPREP_InitQuery(false, true);
  }

  private void BUK_LIQUAGRUPBOO_InitLinks()
  {
    BUK_LIQUAGRUPBOO.SetBoxNextBox(BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY, BUK_LIQUAGRUPBOO_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQUIDAGRUPP) PAN_LIQUIDAGRUPP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAGRUPP) PAN_LIQUIDAGRUPP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDAGRUPP) PAN_LIQUIDAGRUPP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAGRUPP) PAN_LIQUIDAGRUPP_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDAGRUPP) PAN_LIQUIDAGRUPP_OnChangeRow();
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
    if (SrcObj == PAN_LIQUIDAGRUPP) PAN_LIQUIDAGRUPP_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_LIQUIDAGRUPP) PAN_LIQUIDAGRUPP_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAGRUPP) PAN_LIQUIDAGRUPP_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_LIQUIDAGRUPP) PAN_LIQUIDAGRUPP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIQUAGRUPBOO) BUK_LIQUAGRUPBOO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIQUAGRUPBOO) BUK_LIQUAGRUPBOO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIQUAGRUPBOO) BUK_LIQUAGRUPBOO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIQUAGRUPBOO) BUK_LIQUAGRUPBOO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIQUAGRUPBOO) BUK_LIQUAGRUPBOO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIQUAGRUPBOO) BUK_LIQUAGRUPBOO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIQUAGRUPBOO) BUK_LIQUAGRUPBOO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIQUAGRUPBOO) BUK_LIQUAGRUPBOO_OnPreview();
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
