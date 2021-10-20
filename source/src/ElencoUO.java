// **********************************************
// Elenco UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMESTAMPA_CAPITOLO = 0;
  private static int PFL_PARAMESTAMPA_ANCHEUOSCADU = 1;
  private static int PFL_PARAMESTAMPA_TIPO = 2;
  private static int PFL_PARAMESTAMPA_PARTE = 3;
  private static int PFL_PARAMESTAMPA_ELABORA = 4;

  private static int PPQRY_PARAMESTAM13 = 0;


  IDPanel PAN_PARAMESTAMPA;
  CIDREObj BUK_CONTROLLOUO;
  OBook BKW_CONTROLLOUO;
  //
  // Template Pages constants
  private static int BUK_CONTROLLOUO_MST_CONTROUOPAGE = 1;
  private static int BUK_CONTROLLOUO_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CONTROLLOUO_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CONTROLLOUO_RPTBOX_PAGEBODY = 4;

  //
  // Reports constants
  private static int BUK_CONTROLLOUO_RPT_CONTROLLOUO = 5;
  private static int BUK_CONTROLLOUO_SEC_REPORTHEADER = 6;
  private static int BUK_CONTROLLOUO_SEC_PAGEHEADER = 7;
  private static int BUK_CONTROLLOUO_SEC_CAPESGROUHEA = 8;
  private static int BUK_CONTROLLOUO_RPTBOX_TITOLO = 9;
  private static int BUK_CONTROLLOUO_SPAN_CONTROLLOUO = 10;
  private static int BUK_CONTROLLOUO_RPTBOX_PARTE = 11;
  private static int BUK_CONTROLLOUO_SPAN_PARTE = 12;
  private static int BUK_CONTROLLOUO_RPTBOX_CAPDESCRHEAD = 13;
  private static int BUK_CONTROLLOUO_SPAN_CAPDESCRIZIO = 14;
  private static int BUK_CONTROLLOUO_RPTBOX_DESCRUOHEADE = 15;
  private static int BUK_CONTROLLOUO_SPAN_DESCRIZIONUO = 16;
  private static int BUK_CONTROLLOUO_RPTBOX_CAPUOSCADHEA = 17;
  private static int BUK_CONTROLLOUO_SPAN_CAPUOSCADENZ = 18;
  private static int BUK_CONTROLLOUO_RPTBOX_CAPITOLOART = 19;
  private static int BUK_CONTROLLOUO_SPAN_NUOVASPAN = 20;
  private static int BUK_CONTROLLOUO_SEC_VOCPEGGROHEA = 21;
  private static int BUK_CONTROLLOUO_RPTBOX_CAPCAPITOLO = 22;
  private static int BUK_CONTROLLOUO_SPAN_RECACAELUOCU = 23;
  private static int BUK_CONTROLLOUO_RPTBOX_CAPARTICOLO = 24;
  private static int BUK_CONTROLLOUO_SPAN_RECAARELUOCU = 25;
  private static int BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO = 26;
  private static int BUK_CONTROLLOUO_SPAN_RECADEELUOCU = 27;
  private static int BUK_CONTROLLOUO_RPTBOX_DESCRIZIONU1 = 28;
  private static int BUK_CONTROLLOUO_SPAN_REDEUOELUOC1 = 29;
  private static int BUK_CONTROLLOUO_RPTBOX_CAPUOSCADEN1 = 30;
  private static int BUK_CONTROLLOUO_SPAN_RECAUOSCEUC1 = 31;
  private static int BUK_CONTROLLOUO_SEC_DETAIL = 32;
  private static int BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO = 33;
  private static int BUK_CONTROLLOUO_SPAN_REDEUOELUOCU = 34;
  private static int BUK_CONTROLLOUO_RPTBOX_CAPUOSCADENZ = 35;
  private static int BUK_CONTROLLOUO_SPAN_RECAUOSCEUCU = 36;
  private static int BUK_CONTROLLOUO_SEC_VOCPEGGROFOO = 37;
  private static int BUK_CONTROLLOUO_SEC_CAPESGROUFOO = 38;
  private static int BUK_CONTROLLOUO_SEC_PAGEFOOTER = 39;
  private static int BUK_CONTROLLOUO_SEC_REPORTFOOTER = 40;


  // Definition of Global Variables
  private IDVariant NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMESTAM12(IMDB);
    //
    //
    Init_PQRY_PARAMESTAM13(IMDB);
    Init_PQRY_PARAMESTAM13_RS(IMDB);
    Init_PQRY_CAP14(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMESTAM12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMESTAM12, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMESTAM12, "TBL_PARAMESTAM12");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESTAM12,IMDBDef3.FLD_PARAMESTAM12_PARSTAVOCPEG, "PARSTAVOCPEG");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESTAM12,IMDBDef3.FLD_PARAMESTAM12_PARSTAVOCPEG,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESTAM12,IMDBDef3.FLD_PARAMESTAM12_PARSTAANUOSC, "PARSTAANUOSC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESTAM12,IMDBDef3.FLD_PARAMESTAM12_PARSTAANUOSC,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESTAM12,IMDBDef3.FLD_PARAMESTAM12_PARASTAMTIPO, "PARASTAMTIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESTAM12,IMDBDef3.FLD_PARAMESTAM12_PARASTAMTIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESTAM12,IMDBDef3.FLD_PARAMESTAM12_PARASTAMPART, "PARASTAMPART");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESTAM12,IMDBDef3.FLD_PARAMESTAM12_PARASTAMPART,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMESTAM12, 0);
  }

  private static void Init_PQRY_PARAMESTAM13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMESTAM13, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMESTAM13, "PQRY_PARAMESTAM13");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMESTAM13,IMDBDef10.PQSL_PARAMESTAM13_PARSTAVOCPEG, "PARSTAVOCPEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMESTAM13,IMDBDef10.PQSL_PARAMESTAM13_PARSTAVOCPEG,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMESTAM13,IMDBDef10.PQSL_PARAMESTAM13_PARSTAANUOSC, "PARSTAANUOSC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMESTAM13,IMDBDef10.PQSL_PARAMESTAM13_PARSTAANUOSC,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMESTAM13,IMDBDef10.PQSL_PARAMESTAM13_PARASTAMTIPO, "PARASTAMTIPO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMESTAM13,IMDBDef10.PQSL_PARAMESTAM13_PARASTAMTIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMESTAM13,IMDBDef10.PQSL_PARAMESTAM13_PARASTAMPART, "PARASTAMPART");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMESTAM13,IMDBDef10.PQSL_PARAMESTAM13_PARASTAMPART,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMESTAM13, 0);
  }

  private static void Init_PQRY_PARAMESTAM13_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMESTAM13_RS, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMESTAM13_RS, "PQRY_PARAMESTAM13_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMESTAM13_RS,IMDBDef10.PQSL_PARAMESTAM13_PARSTAVOCPEG, "PARSTAVOCPEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMESTAM13_RS,IMDBDef10.PQSL_PARAMESTAM13_PARSTAVOCPEG,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMESTAM13_RS,IMDBDef10.PQSL_PARAMESTAM13_PARSTAANUOSC, "PARSTAANUOSC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMESTAM13_RS,IMDBDef10.PQSL_PARAMESTAM13_PARSTAANUOSC,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMESTAM13_RS,IMDBDef10.PQSL_PARAMESTAM13_PARASTAMTIPO, "PARASTAMTIPO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMESTAM13_RS,IMDBDef10.PQSL_PARAMESTAM13_PARASTAMTIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMESTAM13_RS,IMDBDef10.PQSL_PARAMESTAM13_PARASTAMPART, "PARASTAMPART");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMESTAM13_RS,IMDBDef10.PQSL_PARAMESTAM13_PARASTAMPART,5,1,0);
  }

  private static void Init_PQRY_CAP14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CAP14, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_CAP14, "PQRY_CAP14");
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_RECORVOCEPEG,5,198,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_RECORDESCRUO, "RECORDESCRUO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_RECORDESCRUO,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP14,IMDBDef10.PQSL_CAP14_SCADENZA,6,19,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CAP14, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoUO()
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
    FormIdx = MyGlb.FRM_ELENCOUO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DA001EE6-5CF8-4D83-A619-4A4F7129CEAB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 364;
    DesignHeight = 250;
    set_Caption(new IDVariant("Elenco UO"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 364;
    Frames[1].Height = 224;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Stampa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 224;
    PAN_PARAMESTAMPA = new IDPanel(w, this, 1, "PAN_PARAMESTAMPA");
    Frames[1].Content = PAN_PARAMESTAMPA;
    PAN_PARAMESTAMPA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMESTAMPA.VS = MainFrm.VisualStyleList;
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 364-MyGlb.PAN_OFFS_X, 224-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "417306C1-A0B5-4CEF-AB25-681550F4FC53");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 292, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMESTAMPA.InitStatus = 2;
    PAN_PARAMESTAMPA_Init();
    PAN_PARAMESTAMPA_InitFields();
    PAN_PARAMESTAMPA_InitQueries();
    BKW_CONTROLLOUO = new OBook(this);
    BUK_CONTROLLOUO = new CIDREObj(BKW_CONTROLLOUO);
    BKW_CONTROLLOUO.iGuid = "BC3A3FC7-62D4-497C-A6FE-A6A1EA46FA9F";
    BKW_CONTROLLOUO.Code = "BUK_CONTROLLOUO";
    BKW_CONTROLLOUO.BookObj = BUK_CONTROLLOUO;
    BKW_CONTROLLOUO.InitDefMasks();
    BUK_CONTROLLOUO.InitBook(1, 1245441, "Controllo UO", IMDB, MainFrm.VisualStyleList);
    BUK_CONTROLLOUO.InitHTML();
    BUK_CONTROLLOUO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTROLLOUO.Book.SetMainFrm(MainFrm);
    BUK_CONTROLLOUO.SetRTCGuid(0, "BC3A3FC7-62D4-497C-A6FE-A6A1EA46FA9F");
    BUK_CONTROLLOUO.SetObjCode(0, "CONTROLLOUO");
    BUK_CONTROLLOUO_MST_CONTROUOPAGE_Init();
    BUK_CONTROLLOUO_RPT_CONTROLLOUO_Init();
    BUK_CONTROLLOUO_InitLinks();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMESTAM12, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENCOUO_PARAMESTAM13();
      }
      PAN_PARAMESTAMPA.UpdatePanel(MainFrm);
      // BUK_CONTROLLOUO.UpdateBook();
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
    if (Code.equals("BUK_CONTROLLOUO")) return BUK_CONTROLLOUO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoUO.class.getName() : (Glb.ClassWithPackage(ElencoUO.class) ? ElencoUO.class.getName().substring(ElencoUO.class.getPackage().getName().length() + 1) : ElencoUO.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Stampa On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMESTAMPA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMESTAMPA);
      // 
      // Parametri Stampa On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PARAMESTAM13, IMDBDef10.PQSL_PARAMESTAM13_PARSTAVOCPEG, 0).equals((new IDVariant("C")), true))
      {
        PAN_PARAMESTAMPA.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMESTAMPA.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoUO", "ParametriStampaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_UOGESTIONE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_UOUTILIZZO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONUO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SENZAUO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_UOGESTIONE = (new IDVariant("U.O. Gestione", IDVariant.STRING));
      v_UOUTILIZZO = (new IDVariant("U.O. Utilizzo", IDVariant.STRING));
      v_CONUO = (new IDVariant("Controllo Unità Organizzative", IDVariant.STRING));
      v_SENZAUO = (new IDVariant("Capitolo/Art. senza Unità Organizzative", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PARAMESTAM13, IMDBDef10.PQSL_PARAMESTAM13_PARSTAVOCPEG, 0).equals((new IDVariant("S")), true))
      {
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_DESCRUOHEADE, (new IDVariant(0)).booleanValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO, (new IDVariant(0)).booleanValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONU1, (new IDVariant(0)).booleanValue());
        BUK_CONTROLLOUO.set_BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPDESCRHEAD, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPDESCRHEAD, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_DESCRUOHEADE, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADHEA, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_CONTROLLOUO.set_BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADEN1, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADHEA, (new IDVariant(0)).booleanValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADEN1, (new IDVariant(0)).booleanValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADENZ, (new IDVariant(0)).booleanValue());
        BUK_CONTROLLOUO.set_SpanText(BUK_CONTROLLOUO_SPAN_CONTROLLOUO, new IDVariant(v_SENZAUO).stringValue());
      }
      else
      {
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_DESCRUOHEADE, (new IDVariant(-1)).booleanValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO, (new IDVariant(-1)).booleanValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONU1, (new IDVariant(-1)).booleanValue());
        BUK_CONTROLLOUO.set_BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPDESCRHEAD, IDREGlb.RECT_WIDTH, IDL.Sub((new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONU1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO, IDREGlb.RECT_LEFT)))).dblValue());
        BUK_CONTROLLOUO.set_BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO, IDREGlb.RECT_WIDTH, IDL.Sub((new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONU1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTROLLOUO.BoxRect(BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO, IDREGlb.RECT_LEFT)))).dblValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADHEA, (new IDVariant(-1)).booleanValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADEN1, (new IDVariant(-1)).booleanValue());
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADENZ, (new IDVariant(-1)).booleanValue());
        BUK_CONTROLLOUO.set_SpanText(BUK_CONTROLLOUO_SPAN_CONTROLLOUO, new IDVariant(v_CONUO).stringValue());
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAMESTAM13, IMDBDef10.PQSL_PARAMESTAM13_PARASTAMTIPO, 0).equals((new IDVariant("G")), true))
      {
        BUK_CONTROLLOUO.set_SpanText(BUK_CONTROLLOUO_SPAN_DESCRIZIONUO, new IDVariant(v_UOGESTIONE).stringValue());
      }
      else
      {
        BUK_CONTROLLOUO.set_SpanText(BUK_CONTROLLOUO_SPAN_DESCRIZIONUO, new IDVariant(v_UOUTILIZZO).stringValue());
      }
      BUK_CONTROLLOUO.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_CONTROLLOUO.ReportRefreshQuery(BUK_CONTROLLOUO_RPT_CONTROLLOUO);
      BUK_CONTROLLOUO.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_CONTROLLOUO.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoUO", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Voce Peg Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONTROLLOUO_SEC_VOCPEGGROHEA_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Voce Peg Group Header Before Formatting Event Body
      // Procedure Body
      // 
      NUMERORIGA = (new IDVariant(1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoUO", "VocePegGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONTROLLOUO_SEC_DETAIL_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Before Formatting Event Body
      // Procedure Body
      // 
      if (NUMERORIGA.equals((new IDVariant(1)), true))
      {
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO, (new IDVariant(0)).booleanValue());
        NUMERORIGA = (new IDVariant(2));
        if (IMDB.Value(IMDBDef10.PQRY_PARAMESTAM13, IMDBDef10.PQSL_PARAMESTAM13_PARSTAVOCPEG, 0).equals((new IDVariant("C")), true))
        {
          BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADENZ, (new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO, (new IDVariant(-1)).booleanValue());
        if (IMDB.Value(IMDBDef10.PQRY_PARAMESTAM13, IMDBDef10.PQSL_PARAMESTAM13_PARSTAVOCPEG, 0).equals((new IDVariant("C")), true))
        {
          BUK_CONTROLLOUO.set_BoxVisible(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADENZ, (new IDVariant(-1)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoUO", "DetailBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void ELENCOUO_PARAMESTAM13() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMESTAM13_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMESTAM12, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMESTAM12, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMESTAM13_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMESTAM13_RS, 0, IMDBDef3.TBL_PARAMESTAM12, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMESTAM13_RS, 0, 0, IMDBDef3.TBL_PARAMESTAM12, IMDBDef3.FLD_PARAMESTAM12_PARSTAVOCPEG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMESTAM13_RS, 1, 0, IMDBDef3.TBL_PARAMESTAM12, IMDBDef3.FLD_PARAMESTAM12_PARSTAANUOSC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMESTAM13_RS, 2, 0, IMDBDef3.TBL_PARAMESTAM12, IMDBDef3.FLD_PARAMESTAM12_PARASTAMTIPO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMESTAM13_RS, 3, 0, IMDBDef3.TBL_PARAMESTAM12, IMDBDef3.FLD_PARAMESTAM12_PARASTAMPART, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMESTAM12, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMESTAM12, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMESTAM12, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMESTAM13_RS, 0);
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
  private void PAN_PARAMESTAMPA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMESTAMPA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMESTAMPA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMESTAMPA, Cancel);
    // Stub
  }

  private void PAN_PARAMESTAMPA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMESTAMPA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMESTAMPA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMESTAMPA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CONTROLLOUO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTROLLOUO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTROLLOUO_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CONTROLLOUO_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CONTROLLOUO_SEC_CAPESGROUHEA)
    {
      BUK_CONTROLLOUO.set_SpanValue(BUK_CONTROLLOUO_SPAN_PARTE, new IDVariant(((BUK_CONTROLLOUO.GetReportColumn(BUK_CONTROLLOUO_RPT_CONTROLLOUO, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))));
    }
    if (SectionID==BUK_CONTROLLOUO_SEC_VOCPEGGROHEA)
    {
      BUK_CONTROLLOUO_SEC_VOCPEGGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_CONTROLLOUO_SEC_DETAIL)
    {
      BUK_CONTROLLOUO_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_CONTROLLOUO_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_CONTROLLOUO_SEC_CAPESGROUFOO)
    {
    }
    if (SectionID==BUK_CONTROLLOUO_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CONTROLLOUO_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CONTROLLOUO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTROLLOUO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTROLLOUO_MST_CONTROUOPAGE)
    {
      BUK_CONTROLLOUO.set_SpanValue(BUK_CONTROLLOUO_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTROLLOUO.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTROLLOUO.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONTROLLOUO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTROLLOUO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTROLLOUO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTROLLOUO_OnPreview()
  {
    PreviewBook = BKW_CONTROLLOUO;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMESTAMPA_Init()
  {

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, "4092F1CE-094F-469F-8207-C17C85AB5FA0");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, "Capitolo");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, "19123F8F-D60D-40B5-964F-D164092C3404");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, "Anche U.O. Scadute");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, "4EC0E7F2-5BE3-403E-B8E3-CC2B793C7A1A");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, "Tipo");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, "8C5F3CC6-91EC-45E0-8EC7-D21C0F116687");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, "Parte");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, "EE9B60F5-DA5B-480C-B73B-32618730DD0D");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, "Elabora");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, 0, "button1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMESTAMPA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_LIST, 100);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_LIST, "Capit.");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_FORM, 52, 24, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_CAPITOLO, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_CAPITOLO, PPQRY_PARAMESTAM13, "A.PARSTAVOCPEG", "PARSTAVOCPEG", 5, 1, 0, -13997);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_CAPITOLO, (new IDVariant("C")), "Con U.O.", "", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_CAPITOLO, (new IDVariant("S")), "Senza U.O.", "", "", -1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, MyGlb.PANEL_LIST, 100);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, MyGlb.PANEL_LIST, "Anche U.O. Scadute");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, MyGlb.PANEL_FORM, 4, 56, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, MyGlb.PANEL_FORM, 120);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANCHEUOSCADU, MyGlb.PANEL_FORM, "Anche U.O. Scadute");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ANCHEUOSCADU, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ANCHEUOSCADU, PPQRY_PARAMESTAM13, "A.PARSTAANUOSC", "PARSTAANUOSC", 5, 2, 0, -13997);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_ANCHEUOSCADU, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_ANCHEUOSCADU, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, MyGlb.PANEL_LIST, 48, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, MyGlb.PANEL_LIST, 28);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, MyGlb.PANEL_FORM, 76, 88, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, MyGlb.PANEL_FORM, 48);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_TIPO, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_TIPO, PPQRY_PARAMESTAM13, "A.PARASTAMTIPO", "PARASTAMTIPO", 5, 1, 0, -13997);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_TIPO, (new IDVariant("G")), "Gestione", "", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_TIPO, (new IDVariant("U")), "Utilizzo", "", "", -1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, MyGlb.PANEL_LIST, 120, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, MyGlb.PANEL_FORM, 76, 124, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_PARTE, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_PARTE, PPQRY_PARAMESTAM13, "A.PARASTAMPART", "PARASTAMPART", 5, 1, 0, -13997);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_PARTE, (new IDVariant()), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, MyGlb.PANEL_LIST, 256, 176, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, MyGlb.PANEL_FORM, 248, 164, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ELABORA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMESTAMPA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMESTAMPA.SetIMDB(IMDB, "PQRY_PARAMESTAM13", true);
    PAN_PARAMESTAMPA.set_SetString(MyGlb.MASTER_ROWNAME, "Param Stampa");
    PAN_PARAMESTAMPA.SetQueryIMDB(PPQRY_PARAMESTAM13, IMDBDef10.PQRY_PARAMESTAM13_RS, IMDBDef3.TBL_PARAMESTAM12);
    JustLoaded = true;
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_CAPITOLO, IMDBDef3.FLD_PARAMESTAM12_PARSTAVOCPEG);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_ANCHEUOSCADU, IMDBDef3.FLD_PARAMESTAM12_PARSTAANUOSC);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_TIPO, IMDBDef3.FLD_PARAMESTAM12_PARASTAMTIPO);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_PARTE, IMDBDef3.FLD_PARAMESTAM12_PARASTAMPART);
    PAN_PARAMESTAMPA.SetMasterTable(0, "PARAMESTAM12");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMESTAMPA.Status() == 2)
    {
      int oldListQBE = PAN_PARAMESTAMPA.iUseListQBE;
      PAN_PARAMESTAMPA.iUseListQBE = 0;
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMESTAMPA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CONTROLLOUO_MST_CONTROUOPAGE_Init()
  {
    BUK_CONTROLLOUO.InitMastro(BUK_CONTROLLOUO_MST_CONTROUOPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_MST_CONTROUOPAGE, "521B7003-0FBA-4E33-9FAE-5811341E03C8");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_MST_CONTROUOPAGE, "CONTROUOPAGE");
    BUK_CONTROLLOUO.InitMastroBox(BUK_CONTROLLOUO_MST_CONTROUOPAGE, BUK_CONTROLLOUO_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_NUMEROPAGINA, "F9BF7684-3B7E-4479-9B71-6B5BD86067EA");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_NUMEROPAGINA, BUK_CONTROLLOUO_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_NUMEROPAGINA, "46218B74-5410-43AA-B7DC-1C7F1DF1D06C");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTROLLOUO.InitMastroBox(BUK_CONTROLLOUO_MST_CONTROUOPAGE, BUK_CONTROLLOUO_RPTBOX_PAGEBODY, 900, 1100, 19000, 27000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_PAGEBODY, "B43DD8F7-C58B-42B5-A23F-8247AF553EA0");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_CONTROLLOUO_RPT_CONTROLLOUO_InitQuery() { BUK_CONTROLLOUO_RPT_CONTROLLOUO_InitQuery(true, true); }
  private void BUK_CONTROLLOUO_RPT_CONTROLLOUO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  LPAD(TO_CHAR ( A.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.ARTICOLO ), 2, SUBSTR('0', 1, 1)) as RECORVOCEPEG, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  DECODE(K.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(K.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as RECORDESCRUO, ");
      SQL.append("  K.SCADENZA as SCADENZA ");
      SQL.append("from ");
      SQL.append("  CAP A, ");
      SQL.append("  CAP_UO K ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.E_S = NVL(~~TBL_PARAMESTAM12.PARASTAMPART~~, A.E_S)) ");
      SQL.append("and   (~~TBL_PARAMESTAM12.PARSTAVOCPEG~~ = 'S') ");
      SQL.append("and   (K.ESERCIZIO(+) = A.ESERCIZIO) ");
      SQL.append("and   (K.E_S(+) = A.E_S) ");
      SQL.append("and   (K.CAPITOLO(+) = A.CAPITOLO) ");
      SQL.append("and   (K.ARTICOLO(+) = A.ARTICOLO) ");
      SQL.append("and   (A.CAPITOLO <> 0) ");
      SQL.append("and   (A.ARTICOLO <> 0) ");
      SQL.append("and   (NOT ((A.CODICE_STRUTTURA IS NULL))) ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  J.CAPITOLO ");
      SQL.append("from ");
      SQL.append("  CAP_UO J ");
      SQL.append("where (J.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (J.E_S = A.E_S) ");
      SQL.append("and   (J.TIPO_UNITA_ORGANIZZATIVA = ~~TBL_PARAMESTAM12.PARASTAMTIPO~~) ");
      SQL.append("and   (J.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (J.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   ((J.SCADENZA IS NULL) OR J.SCADENZA > TRUNC( SYSDATE )) ");
      SQL.append(")))) ");
      SQL.append("UNION ALL ");
      SQL.append("select ");
      SQL.append("  B.E_S, ");
      SQL.append("  LPAD(TO_CHAR ( B.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( B.ARTICOLO ), 2, SUBSTR('0', 1, 1)), ");
      SQL.append("  B.CAPITOLO, ");
      SQL.append("  B.ARTICOLO, ");
      SQL.append("  B.DESCRIZIONE, ");
      SQL.append("  DECODE(D.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(D.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))), ");
      SQL.append("  D.SCADENZA ");
      SQL.append("from ");
      SQL.append("  CAP B, ");
      SQL.append("  CAP_UO D ");
      SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (B.E_S = NVL(~~TBL_PARAMESTAM12.PARASTAMPART~~, B.E_S)) ");
      SQL.append("and   (~~TBL_PARAMESTAM12.PARSTAVOCPEG~~ = 'S') ");
      SQL.append("and   (D.ESERCIZIO(+) = B.ESERCIZIO) ");
      SQL.append("and   (D.E_S(+) = B.E_S) ");
      SQL.append("and   (D.CAPITOLO(+) = B.CAPITOLO) ");
      SQL.append("and   (D.ARTICOLO(+) = B.ARTICOLO) ");
      SQL.append("and   (B.CAPITOLO <> 0) ");
      SQL.append("and   (B.ARTICOLO = 0) ");
      SQL.append("and   (NOT ((B.CODICE_STRUTTURA IS NULL))) ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  C.CAPITOLO ");
      SQL.append("from ");
      SQL.append("  CAP_UO C ");
      SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (C.E_S = B.E_S) ");
      SQL.append("and   (C.TIPO_UNITA_ORGANIZZATIVA = ~~TBL_PARAMESTAM12.PARASTAMTIPO~~) ");
      SQL.append("and   (C.CAPITOLO = B.CAPITOLO) ");
      SQL.append("and   ((C.SCADENZA IS NULL) OR C.SCADENZA > TRUNC( SYSDATE )) ");
      SQL.append(")))) ");
      SQL.append("UNION ALL ");
      SQL.append("select ");
      SQL.append("  E.E_S, ");
      SQL.append("  LPAD(TO_CHAR ( E.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( E.ARTICOLO ), 2, SUBSTR('0', 1, 1)), ");
      SQL.append("  E.CAPITOLO, ");
      SQL.append("  E.ARTICOLO, ");
      SQL.append("  E.DESCRIZIONE, ");
      SQL.append("  DECODE(G.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(G.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))), ");
      SQL.append("  G.SCADENZA ");
      SQL.append("from ");
      SQL.append("  CAP E, ");
      SQL.append("  CAP_UO G ");
      SQL.append("where (E.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (E.E_S = NVL(~~TBL_PARAMESTAM12.PARASTAMPART~~, E.E_S)) ");
      SQL.append("and   (~~TBL_PARAMESTAM12.PARSTAVOCPEG~~ = 'S') ");
      SQL.append("and   (G.ESERCIZIO(+) = E.ESERCIZIO) ");
      SQL.append("and   (G.E_S(+) = E.E_S) ");
      SQL.append("and   (G.CAPITOLO(+) = E.CAPITOLO) ");
      SQL.append("and   (G.ARTICOLO(+) = E.CAPITOLO) ");
      SQL.append("and   (E.CAPITOLO = 0) ");
      SQL.append("and   (E.ARTICOLO = 0) ");
      SQL.append("and   (NOT ((E.CODICE_STRUTTURA IS NULL))) ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  F.CAPITOLO ");
      SQL.append("from ");
      SQL.append("  CAP_UO F ");
      SQL.append("where (F.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (F.E_S = E.E_S) ");
      SQL.append("and   (F.TIPO_UNITA_ORGANIZZATIVA = ~~TBL_PARAMESTAM12.PARASTAMTIPO~~) ");
      SQL.append("and   ((F.SCADENZA IS NULL) OR F.SCADENZA > TRUNC( SYSDATE )) ");
      SQL.append(")))) ");
      SQL.append("UNION ALL ");
      SQL.append("select ");
      SQL.append("  H.E_S, ");
      SQL.append("  LPAD(TO_CHAR ( H.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( H.ARTICOLO ), 2, SUBSTR('0', 1, 1)), ");
      SQL.append("  H.CAPITOLO, ");
      SQL.append("  H.ARTICOLO, ");
      SQL.append("  I.DESCRIZIONE, ");
      SQL.append("  DECODE(H.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(H.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))), ");
      SQL.append("  H.SCADENZA ");
      SQL.append("from ");
      SQL.append("  CAP_UO H, ");
      SQL.append("  CAP I ");
      SQL.append("where (H.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (H.E_S = NVL(~~TBL_PARAMESTAM12.PARASTAMPART~~, H.E_S)) ");
      SQL.append("and   (~~TBL_PARAMESTAM12.PARSTAVOCPEG~~ = 'C') ");
      SQL.append("and   (I.ESERCIZIO(+) = H.ESERCIZIO) ");
      SQL.append("and   (I.E_S(+) = H.E_S) ");
      SQL.append("and   (I.CAPITOLO(+) = H.CAPITOLO) ");
      SQL.append("and   (I.ARTICOLO(+) = H.ARTICOLO) ");
      SQL.append("and   (NOT ((I.CODICE_STRUTTURA IS NULL))) ");
      SQL.append("and   (H.TIPO_UNITA_ORGANIZZATIVA = ~~TBL_PARAMESTAM12.PARASTAMTIPO~~) ");
      SQL.append("and   ((~~PQRY_PARAMESTAM13.PARSTAANUOSC~~ = 'SI') OR (((H.SCADENZA IS NULL) OR H.SCADENZA > TRUNC( SYSDATE )) AND (~~PQRY_PARAMESTAM13.PARSTAANUOSC~~ IS NULL))) ");
      SQL.append("order by 1, 2 ");
      BUK_CONTROLLOUO.SetReportQuery(BUK_CONTROLLOUO_RPT_CONTROLLOUO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "E4178A40-4E66-4E42-A595-59BCC2F3F561");
      if (BUK_CONTROLLOUO.FindObjByID(BUK_CONTROLLOUO_SEC_CAPESGROUHEA) != null)
        BUK_CONTROLLOUO.AddReportGroup(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, "E_S");
      if (BUK_CONTROLLOUO.FindObjByID(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA) != null)
        BUK_CONTROLLOUO.AddReportGroup(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, "RECORVOCEPEG");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTROLLOUO_RPT_CONTROLLOUO_Init()
  {
    BUK_CONTROLLOUO.InitReport(BUK_CONTROLLOUO_RPT_CONTROLLOUO, 196865);
    BUK_CONTROLLOUO_RPT_CONTROLLOUO_InitQuery(true, false);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPT_CONTROLLOUO, "1AA8525A-85F2-4B5A-8FBE-082FB6AB5211");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPT_CONTROLLOUO, "CONTROLLOUO");
    BUK_CONTROLLOUO.InitSection(BUK_CONTROLLOUO_RPT_CONTROLLOUO, BUK_CONTROLLOUO_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_CONTROLLOUO.SetSectionRendersInto(BUK_CONTROLLOUO_SEC_REPORTHEADER, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SEC_REPORTHEADER, "0D7421D1-F547-42EA-A0E9-81305C6DDE13");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONTROLLOUO.InitSection(BUK_CONTROLLOUO_RPT_CONTROLLOUO, BUK_CONTROLLOUO_SEC_PAGEHEADER, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_CONTROLLOUO.SetSectionRendersInto(BUK_CONTROLLOUO_SEC_PAGEHEADER, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SEC_PAGEHEADER, "89DD1E09-4D68-4D8E-A473-02676059A270");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONTROLLOUO.InitSection(BUK_CONTROLLOUO_RPT_CONTROLLOUO, BUK_CONTROLLOUO_SEC_CAPESGROUHEA, 3500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42532865, "E_S");
    BUK_CONTROLLOUO.SetSectionRendersInto(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, "D554CBA2-E412-4F99-B6DD-272D0F1746B9");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, "CAPESGROUHEA");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, BUK_CONTROLLOUO_RPTBOX_TITOLO, 100, 0, 18800, 600, 0, 1, 1, MyGlb.VIS_TITOLIINBOX, 983041, 590, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_TITOLO, "7DED29C4-5622-4071-9065-A1E057987269");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_TITOLO, "TITOLO");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_TITOLO, BUK_CONTROLLOUO_SPAN_CONTROLLOUO, MyGlb.VIS_TITOLIINBOX, 0, 0, 0, 271384961, "", "Controllo U.O.", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_CONTROLLOUO, "0887CAAE-B756-49B5-9A07-8B2C0CFEDF0D");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_CONTROLLOUO, "CONTROLLOUO");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, BUK_CONTROLLOUO_RPTBOX_PARTE, 100, 800, 18800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_PARTE, "ED1D6971-AF6A-4678-BA68-C2FA8EEE5D45");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_PARTE, "PARTE");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_PARTE, BUK_CONTROLLOUO_SPAN_PARTE, MyGlb.VIS_INTSENBORCE1, 5, 99, 0, 271319169, "", "", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_PARTE, "4792B2D9-7585-49B1-AE85-447E8481102C");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_PARTE, "PARTE");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, BUK_CONTROLLOUO_RPTBOX_CAPDESCRHEAD, 3700, 2900, 7800, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_CAPDESCRHEAD, "7F8B6494-D372-45B4-B53C-210D5CC6401A");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_CAPDESCRHEAD, "CAPDESCRHEAD");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_CAPDESCRHEAD, BUK_CONTROLLOUO_SPAN_CAPDESCRIZIO, MyGlb.VIS_BOX, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_CAPDESCRIZIO, "223B62FF-2DDA-4ACA-9609-52ED9060D061");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_CAPDESCRIZIO, "CAPDESCRIZIO");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, BUK_CONTROLLOUO_RPTBOX_DESCRUOHEADE, 11500, 2900, 5900, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_DESCRUOHEADE, "F4796BEE-9A1E-4D31-9814-B29D4CFA8943");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_DESCRUOHEADE, "DESCRUOHEADE");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_DESCRUOHEADE, BUK_CONTROLLOUO_SPAN_DESCRIZIONUO, MyGlb.VIS_BOX, 0, 0, 0, 271384961, "", "Descrizione UO", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_DESCRIZIONUO, "6B58E4E1-7AD7-4AC3-B744-0BA69FC271E5");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, BUK_CONTROLLOUO_RPTBOX_CAPUOSCADHEA, 17400, 2900, 1600, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADHEA, "58EE5BA9-7160-4191-B84D-77D63CA75C56");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADHEA, "CAPUOSCADHEA");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADHEA, BUK_CONTROLLOUO_SPAN_CAPUOSCADENZ, MyGlb.VIS_BOX, 0, 0, 0, 271384961, "", "Scadenza", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_CAPUOSCADENZ, "ECFE565D-D143-4B75-9814-DC60A4B05270");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_CAPUOSCADENZ, "CAPUOSCADENZ");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, BUK_CONTROLLOUO_RPTBOX_CAPITOLOART, 0, 2900, 3700, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_CAPITOLOART, "8730C3AE-5B85-4DDB-A004-D73A7E1CF982");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_CAPITOLOART, "CAPITOLOART");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_CAPITOLOART, BUK_CONTROLLOUO_SPAN_NUOVASPAN, MyGlb.VIS_BOX, 0, 0, 0, 271384705, "", "Capitolo/Art.", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_NUOVASPAN, "F4025622-C4D2-487C-948A-9D5B2A1EA8F8");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_CONTROLLOUO.InitSection(BUK_CONTROLLOUO_RPT_CONTROLLOUO, BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, 500, 1, 0, 3, MyGlb.VIS_BORDOSUPERIO, 8978433, "RECORVOCEPEG");
    BUK_CONTROLLOUO.SetSectionRendersInto(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, "6BC0A408-A2B7-47E8-9562-17251E8C5D92");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, BUK_CONTROLLOUO_RPTBOX_CAPCAPITOLO, 0, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_CAPCAPITOLO, "B94B0A85-C6F0-4EC1-B26D-603666CEE0D5");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_CAPCAPITOLO, "CAPCAPITOLO");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_CAPCAPITOLO, BUK_CONTROLLOUO_SPAN_RECACAELUOCU, MyGlb.VIS_NORMA8INTLUN, 3, 16, 6, 271384705, "Brief description of field content.", "::CAPITOLO", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_RECACAELUOCU, "F3B67B7D-DCBB-471F-A47C-14B205CB22DF");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_RECACAELUOCU, "RECACAELUOCU");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, BUK_CONTROLLOUO_RPTBOX_CAPARTICOLO, 3000, 0, 600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_CAPARTICOLO, "8D0B97C5-6D0E-49D0-84A5-E57AF55E47F8");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_CAPARTICOLO, "CAPARTICOLO");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_CAPARTICOLO, BUK_CONTROLLOUO_SPAN_RECAARELUOCU, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::ARTICOLO", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_RECAARELUOCU, "F78D2C60-B866-47D0-9D70-B797AAD5EE31");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_RECAARELUOCU, "RECAARELUOCU");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO, 3700, 0, 7800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO, "93B30C6E-669F-4C4A-90F8-CC63ABFDEDF4");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO, "CAPDESCRIZIO");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_CAPDESCRIZIO, BUK_CONTROLLOUO_SPAN_RECADEELUOCU, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_RECADEELUOCU, "E341EF13-98F6-49F6-9ABD-8CFA6D2864CA");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_RECADEELUOCU, "RECADEELUOCU");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, BUK_CONTROLLOUO_RPTBOX_DESCRIZIONU1, 11500, 0, 5900, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONU1, "C4792C9C-0EFF-403C-8AF4-0FC08E5DC1B0");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONU1, BUK_CONTROLLOUO_SPAN_REDEUOELUOC1, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "If Equal (CAP UO PROGR UNITA ORGANIZZATIVA, Null Number, Null String, ANAGRAFE UNITA ORGANIZZATIVA GET DESCRIZIONE (CAP UO PROGR UNITA ORGANIZZATIVA, Today ()))", "::RECORDESCRUO", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_REDEUOELUOC1, "E8266D69-11E4-4D9E-8D56-82B043AF7171");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_REDEUOELUOC1, "REDEUOELUOC1");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, BUK_CONTROLLOUO_RPTBOX_CAPUOSCADEN1, 17400, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADEN1, "FD3741C7-909F-4DC5-A271-5FD43E3CCA7C");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADEN1, "CAPUOSCADEN1");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADEN1, BUK_CONTROLLOUO_SPAN_RECAUOSCEUC1, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::SCADENZA", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_RECAUOSCEUC1, "6373C1E2-EF33-48FF-A22A-77B7A421C636");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_RECAUOSCEUC1, "RECAUOSCEUC1");
    BUK_CONTROLLOUO.InitSection(BUK_CONTROLLOUO_RPT_CONTROLLOUO, BUK_CONTROLLOUO_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_CONTROLLOUO.SetSectionRendersInto(BUK_CONTROLLOUO_SEC_DETAIL, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SEC_DETAIL, "E079D67A-C970-4742-B893-8EE98B156D52");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SEC_DETAIL, "DETAIL");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_DETAIL, BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO, 11500, 0, 5900, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO, "3F5E0ABA-803D-479D-8758-EE9DE8A04FA7");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_DESCRIZIONUO, BUK_CONTROLLOUO_SPAN_REDEUOELUOCU, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "If Equal (CAP UO PROGR UNITA ORGANIZZATIVA, Null Number, Null String, ANAGRAFE UNITA ORGANIZZATIVA GET DESCRIZIONE (CAP UO PROGR UNITA ORGANIZZATIVA, Today ()))", "::RECORDESCRUO", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_REDEUOELUOCU, "8AE340BD-B034-4C2D-AE75-95BCDBA74696");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_REDEUOELUOCU, "REDEUOELUOCU");
    BUK_CONTROLLOUO.InitReportBox(BUK_CONTROLLOUO_SEC_DETAIL, BUK_CONTROLLOUO_RPTBOX_CAPUOSCADENZ, 17400, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADENZ, "908ABA25-8B84-4CAC-A991-F053442C4470");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADENZ, "CAPUOSCADENZ");
    BUK_CONTROLLOUO.InitBoxSpan(BUK_CONTROLLOUO_RPTBOX_CAPUOSCADENZ, BUK_CONTROLLOUO_SPAN_RECAUOSCEUCU, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::SCADENZA", 1);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SPAN_RECAUOSCEUCU, "670BEBF7-A8F9-4E6A-AE2E-AC13D62CED9A");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SPAN_RECAUOSCEUCU, "RECAUOSCEUCU");
    BUK_CONTROLLOUO.InitSection(BUK_CONTROLLOUO_RPT_CONTROLLOUO, BUK_CONTROLLOUO_SEC_VOCPEGGROFOO, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 11075585, "RECORVOCEPEG");
    BUK_CONTROLLOUO.SetSectionRendersInto(BUK_CONTROLLOUO_SEC_VOCPEGGROFOO, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SEC_VOCPEGGROFOO, "3972DC89-EDF1-4590-AB36-92A224558AEC");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_CONTROLLOUO.InitSection(BUK_CONTROLLOUO_RPT_CONTROLLOUO, BUK_CONTROLLOUO_SEC_CAPESGROUFOO, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "E_S");
    BUK_CONTROLLOUO.SetSectionRendersInto(BUK_CONTROLLOUO_SEC_CAPESGROUFOO, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SEC_CAPESGROUFOO, "C407E2F6-5267-4004-8747-C5AB29207849");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SEC_CAPESGROUFOO, "CAPESGROUFOO");
    BUK_CONTROLLOUO.InitSection(BUK_CONTROLLOUO_RPT_CONTROLLOUO, BUK_CONTROLLOUO_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_CONTROLLOUO.SetSectionRendersInto(BUK_CONTROLLOUO_SEC_PAGEFOOTER, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SEC_PAGEFOOTER, "59B07295-09A5-4942-B2DA-5E36921806EE");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONTROLLOUO.InitSection(BUK_CONTROLLOUO_RPT_CONTROLLOUO, BUK_CONTROLLOUO_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_CONTROLLOUO.SetSectionRendersInto(BUK_CONTROLLOUO_SEC_REPORTFOOTER, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
    BUK_CONTROLLOUO.SetRTCGuid(BUK_CONTROLLOUO_SEC_REPORTFOOTER, "AC78060E-3A44-481C-ACE6-56C6F56EE94F");
    BUK_CONTROLLOUO.SetObjCode(BUK_CONTROLLOUO_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CONTROLLOUO.AddReportGroup(BUK_CONTROLLOUO_SEC_CAPESGROUHEA, "E_S");
    BUK_CONTROLLOUO.AddReportGroup(BUK_CONTROLLOUO_SEC_VOCPEGGROHEA, "RECORVOCEPEG");
    BUK_CONTROLLOUO_RPT_CONTROLLOUO_InitQuery(false, true);
  }

  private void BUK_CONTROLLOUO_InitLinks()
  {
    BUK_CONTROLLOUO.SetBoxNextBox(BUK_CONTROLLOUO_RPTBOX_PAGEBODY, BUK_CONTROLLOUO_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CONTROLLOUO) BUK_CONTROLLOUO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONTROLLOUO) BUK_CONTROLLOUO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONTROLLOUO) BUK_CONTROLLOUO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONTROLLOUO) BUK_CONTROLLOUO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CONTROLLOUO) BUK_CONTROLLOUO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONTROLLOUO) BUK_CONTROLLOUO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONTROLLOUO) BUK_CONTROLLOUO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONTROLLOUO) BUK_CONTROLLOUO_OnPreview();
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
