// **********************************************
// Situazione Competenza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneCompetenza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_CRITERIO1 = 0;
  private static int PFL_PARAM_IMPORTO = 1;
  private static int PFL_PARAM_LABEL = 2;
  private static int PFL_PARAM_PARTE = 3;

  private static int PPQRY_PARAM55 = 0;


  IDPanel PAN_PARAM;
  CIDREObj BUK_SITUAZCOMPET;
  OBook BKW_SITUAZCOMPET;
  //
  // Template Pages constants
  private static int BUK_SITUAZCOMPET_MST_PAGPAGE = 1;
  private static int BUK_SITUAZCOMPET_RPTBOX_PAGEHEADER = 2;
  private static int BUK_SITUAZCOMPET_RPTBOX_PAGEBODY = 3;

  //
  // Reports constants
  private static int BUK_SITUAZCOMPET_RPT_SITCOMPETENZ = 4;
  private static int BUK_SITUAZCOMPET_SEC_PAGEHEADER = 5;
  private static int BUK_SITUAZCOMPET_RPTBOX_SITCOMPETENZ = 6;
  private static int BUK_SITUAZCOMPET_SPAN_CSCIERNPSCPE = 7;
  private static int BUK_SITUAZCOMPET_RPTBOX_ESERCIZIO = 8;
  private static int BUK_SITUAZCOMPET_SPAN_ES = 9;
  private static int BUK_SITUAZCOMPET_RPTBOX_PAG = 10;
  private static int BUK_SITUAZCOMPET_SPAN_PAG = 11;
  private static int BUK_SITUAZCOMPET_RPTBOX_BOXFAKE = 12;
  private static int BUK_SITUAZCOMPET_SPAN_BOX1 = 13;
  private static int BUK_SITUAZCOMPET_RPTBOX_BOXFAKE1 = 14;
  private static int BUK_SITUAZCOMPET_SPAN_BOX = 15;
  private static int BUK_SITUAZCOMPET_RPTBOX_VOCEPEG1 = 16;
  private static int BUK_SITUAZCOMPET_SPAN_VOCEPEG1 = 17;
  private static int BUK_SITUAZCOMPET_RPTBOX_DESC1 = 18;
  private static int BUK_SITUAZCOMPET_SPAN_DESC1 = 19;
  private static int BUK_SITUAZCOMPET_RPTBOX_STANZIAMENT1 = 20;
  private static int BUK_SITUAZCOMPET_SPAN_STANZ = 21;
  private static int BUK_SITUAZCOMPET_RPTBOX_ACCERTAMENTO = 22;
  private static int BUK_SITUAZCOMPET_SPAN_ACCERTATO1 = 23;
  private static int BUK_SITUAZCOMPET_RPTBOX_PER = 24;
  private static int BUK_SITUAZCOMPET_SPAN_ACCERTATO = 25;
  private static int BUK_SITUAZCOMPET_RPTBOX_DISPONIBILI1 = 26;
  private static int BUK_SITUAZCOMPET_SPAN_DISPONIBILI1 = 27;
  private static int BUK_SITUAZCOMPET_SEC_DETAIL = 28;
  private static int BUK_SITUAZCOMPET_RPTBOX_VOCEPEG = 29;
  private static int BUK_SITUAZCOMPET_SPAN_VOCEPEG = 30;
  private static int BUK_SITUAZCOMPET_RPTBOX_DESCRIZIONE = 31;
  private static int BUK_SITUAZCOMPET_SPAN_DESCRIZIONE = 32;
  private static int BUK_SITUAZCOMPET_RPTBOX_STANZIAMENTO = 33;
  private static int BUK_SITUAZCOMPET_SPAN_RBSICSCPRBVC = 34;
  private static int BUK_SITUAZCOMPET_RPTBOX_ACCERTIMPEGN = 35;
  private static int BUK_SITUAZCOMPET_SPAN_REACIMSICOPA = 36;
  private static int BUK_SITUAZCOMPET_RPTBOX_PERCENTUALE = 37;
  private static int BUK_SITUAZCOMPET_SPAN_PERC = 38;
  private static int BUK_SITUAZCOMPET_RPTBOX_DISPONIBILIT = 39;
  private static int BUK_SITUAZCOMPET_SPAN_DISPONIBILIT = 40;
  private static int BUK_SITUAZCOMPET_SEC_PAGEFOOTER = 41;
  private static int BUK_SITUAZCOMPET_SEC_REPORTFOOTER = 42;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM37(IMDB);
    //
    //
    Init_PQRY_PARAM55(IMDB);
    Init_PQRY_PARAM55_RS(IMDB);
    Init_PQRY_BIL1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM37(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAM37, 5);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAM37, "TBL_PARAM37");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMECRITE, "ROWNAMECRITE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMECRITE,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMEIMPOR,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMEOLDES, "ROWNAMEOLDES");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMEOLDES,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMOLDCRI, "ROWNAMOLDCRI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM37,IMDBDef6.FLD_PARAM37_ROWNAMOLDCRI,1,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAM37, 0);
  }

  private static void Init_PQRY_PARAM55(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAM55, 3);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAM55, "PQRY_PARAM55");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM55,IMDBDef16.PQSL_PARAM55_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM55,IMDBDef16.PQSL_PARAM55_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM55,IMDBDef16.PQSL_PARAM55_ROWNAMECRITE, "ROWNAMECRITE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM55,IMDBDef16.PQSL_PARAM55_ROWNAMECRITE,1,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM55,IMDBDef16.PQSL_PARAM55_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM55,IMDBDef16.PQSL_PARAM55_ROWNAMEIMPOR,3,14,2);
    IMDB.TblAddNew(IMDBDef16.PQRY_PARAM55, 0);
  }

  private static void Init_PQRY_PARAM55_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAM55_RS, 3);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAM55_RS, "PQRY_PARAM55_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM55_RS,IMDBDef16.PQSL_PARAM55_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM55_RS,IMDBDef16.PQSL_PARAM55_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM55_RS,IMDBDef16.PQSL_PARAM55_ROWNAMECRITE, "ROWNAMECRITE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM55_RS,IMDBDef16.PQSL_PARAM55_ROWNAMECRITE,1,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM55_RS,IMDBDef16.PQSL_PARAM55_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM55_RS,IMDBDef16.PQSL_PARAM55_ROWNAMEIMPOR,3,14,2);
  }

  private static void Init_PQRY_BIL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_BIL1, 8);
    IMDB.set_TblCode(IMDBDef16.PQRY_BIL1, "PQRY_BIL1");
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_RECOACCEIMPE, "RECOACCEIMPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_RECOACCEIMPE,3,28,6);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_RECORDPERCEN, "RECORDPERCEN");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_RECORDPERCEN,3,28,6);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL1,IMDBDef16.PQSL_BIL1_DISPONIBILITA,3,14,2);
    IMDB.TblAddNew(IMDBDef16.PQRY_BIL1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneCompetenza(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneCompetenza()
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
    FormIdx = MyGlb.FRM_SITUAZCOMPET;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "41B9F046-EED7-44EF-836F-B2567DF8CAEF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 630;
    set_Caption(new IDVariant("Situazione Competenza"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 604;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.165563;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 832;
    Frames[2].Height = 100;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 100;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 100-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0C1D8CAC-ECBB-47A7-9BB3-4439448290E4");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 280, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 832;
    Frames[3].Height = 504;
    Frames[3].Caption = "Situazione Competenza";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 504;
    BKW_SITUAZCOMPET = new OBook(this);
    BUK_SITUAZCOMPET = new CIDREObj(BKW_SITUAZCOMPET);
    Frames[3].Content = BKW_SITUAZCOMPET;
    BKW_SITUAZCOMPET.Height = 474;
    BKW_SITUAZCOMPET.Width = 832;
    BKW_SITUAZCOMPET.iGuid = "107BA08F-F6E4-4CB3-A99B-283C0FA53EDA";
    BKW_SITUAZCOMPET.Code = "BUK_SITUAZCOMPET";
    BKW_SITUAZCOMPET.BookObj = BUK_SITUAZCOMPET;
    BKW_SITUAZCOMPET.InitDefMasks();
    BUK_SITUAZCOMPET.set_FrIndex(3);
    BUK_SITUAZCOMPET.InitBook(1, 3342593, "Situazione Competenza", IMDB, MainFrm.VisualStyleList);
    BUK_SITUAZCOMPET.InitHTML();
    BUK_SITUAZCOMPET.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SITUAZCOMPET.SetSize(832, 474);
    BUK_SITUAZCOMPET.Book.SetMainFrm(MainFrm);
    BUK_SITUAZCOMPET.SetRTCGuid(0, "107BA08F-F6E4-4CB3-A99B-283C0FA53EDA");
    BUK_SITUAZCOMPET.SetObjCode(0, "SITUAZCOMPET");
    BUK_SITUAZCOMPET_MST_PAGPAGE_Init();
    BUK_SITUAZCOMPET_RPT_SITCOMPETENZ_Init();
    BUK_SITUAZCOMPET_InitLinks();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAM37, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITUAZCOMPET_PARAM55();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      BUK_SITUAZCOMPET.UpdateBook();
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
    if (Code.equals("BUK_SITUAZCOMPET")) return BUK_SITUAZCOMPET;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SituazioneCompetenza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneCompetenza.class.getName() : (Glb.ClassWithPackage(SituazioneCompetenza.class) ? SituazioneCompetenza.class.getName().substring(SituazioneCompetenza.class.getPackage().getName().length() + 1) : SituazioneCompetenza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Dynamic Properties Event
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
      // Param On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMECRITE, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMECRITE, 0).equals((new IDVariant(2)), true))
      {
        IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
        v_CAPTION = (new IDVariant("Importo", IDVariant.STRING));
        PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_IMPORTO, new IDVariant(v_CAPTION).stringValue());
        PAN_PARAM.set_Mask(PFL_PARAM_IMPORTO, (new IDVariant("###,###,###,##0.00")).stringValue());
      }
      else
      {
        IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
        v_CAPTION = (new IDVariant("Percentuale", IDVariant.STRING));
        PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_IMPORTO, new IDVariant(v_CAPTION).stringValue());
        PAN_PARAM.set_Mask(PFL_PARAM_IMPORTO, (new IDVariant("##0.00")).stringValue());
      }
      if (IMDB.Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        BUK_SITUAZCOMPET.set_SpanText(BUK_SITUAZCOMPET_SPAN_ACCERTATO1, (new IDVariant("Impegnato")).stringValue());
      }
      else
      {
        BUK_SITUAZCOMPET.set_SpanText(BUK_SITUAZCOMPET_SPAN_ACCERTATO1, (new IDVariant("Accertato")).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCompetenza", "ParamOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Param After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PARAM_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param After Find Body
      // Corpo Procedura
      // 
      AggiornaCriterio();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCompetenza", "ParamAfterFind", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEOLDES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMECRITE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMOLDCRI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEIMPOR, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCompetenza", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMECRITE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEIMPOR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEOLDES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMOLDCRI, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCompetenza", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param Criterio Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAM_CRITERIO1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Criterio Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMECRITE, 0).compareTo(IMDB.Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMOLDCRI, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMOLDCRI, 0, IMDB.Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMECRITE, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMEIMPOR, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCompetenza", "ParamCriterioValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Param Parte Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAM_PARTE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Parte Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMEES, 0).compareTo(IMDB.Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEOLDES, 0), true)!=0)
      {
        AggiornaCriterio();
        IMDB.set_Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMECRITE, 0, (new IDVariant(1)));
        IMDB.set_Value(IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEOLDES, 0, IMDB.Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMEES, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMEIMPOR, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCompetenza", "ParamParteValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiorna Criterio
  // **********************************************************************
  public int AggiornaCriterio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Criterio Body
      // Corpo Procedura
      // 
      PAN_PARAM.ClearValueList(PFL_PARAM_CRITERIO1);
      PAN_PARAM.SetValueListItem(PFL_PARAM_CRITERIO1, (new IDVariant(1)), ((new IDVariant(1)).equals((new IDVariant(1)))? new IDVariant("Disponibilità Maggiore di") : (new IDVariant(1)).equals((new IDVariant(2)))? new IDVariant("Disponibilità Minore di") : (new IDVariant(1)).equals((new IDVariant(3)))? new IDVariant("% Accertato Maggiore di") : (new IDVariant(1)).equals((new IDVariant(4)))? new IDVariant("% Accertato Minore di") : (new IDVariant(1)).equals((new IDVariant(5)))? new IDVariant("% Impegnato Maggiore di") : (new IDVariant(1)).equals((new IDVariant(6)))? new IDVariant("% Impegnato Minore di") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_PARAM.SetValueListItem(PFL_PARAM_CRITERIO1, (new IDVariant(2)), ((new IDVariant(2)).equals((new IDVariant(1)))? new IDVariant("Disponibilità Maggiore di") : (new IDVariant(2)).equals((new IDVariant(2)))? new IDVariant("Disponibilità Minore di") : (new IDVariant(2)).equals((new IDVariant(3)))? new IDVariant("% Accertato Maggiore di") : (new IDVariant(2)).equals((new IDVariant(4)))? new IDVariant("% Accertato Minore di") : (new IDVariant(2)).equals((new IDVariant(5)))? new IDVariant("% Impegnato Maggiore di") : (new IDVariant(2)).equals((new IDVariant(6)))? new IDVariant("% Impegnato Minore di") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      if (IMDB.Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_PARAM.SetValueListItem(PFL_PARAM_CRITERIO1, (new IDVariant(3)), ((new IDVariant(3)).equals((new IDVariant(1)))? new IDVariant("Disponibilità Maggiore di") : (new IDVariant(3)).equals((new IDVariant(2)))? new IDVariant("Disponibilità Minore di") : (new IDVariant(3)).equals((new IDVariant(3)))? new IDVariant("% Accertato Maggiore di") : (new IDVariant(3)).equals((new IDVariant(4)))? new IDVariant("% Accertato Minore di") : (new IDVariant(3)).equals((new IDVariant(5)))? new IDVariant("% Impegnato Maggiore di") : (new IDVariant(3)).equals((new IDVariant(6)))? new IDVariant("% Impegnato Minore di") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PARAM.SetValueListItem(PFL_PARAM_CRITERIO1, (new IDVariant(4)), ((new IDVariant(4)).equals((new IDVariant(1)))? new IDVariant("Disponibilità Maggiore di") : (new IDVariant(4)).equals((new IDVariant(2)))? new IDVariant("Disponibilità Minore di") : (new IDVariant(4)).equals((new IDVariant(3)))? new IDVariant("% Accertato Maggiore di") : (new IDVariant(4)).equals((new IDVariant(4)))? new IDVariant("% Accertato Minore di") : (new IDVariant(4)).equals((new IDVariant(5)))? new IDVariant("% Impegnato Maggiore di") : (new IDVariant(4)).equals((new IDVariant(6)))? new IDVariant("% Impegnato Minore di") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      else
      {
        PAN_PARAM.SetValueListItem(PFL_PARAM_CRITERIO1, (new IDVariant(5)), ((new IDVariant(5)).equals((new IDVariant(1)))? new IDVariant("Disponibilità Maggiore di") : (new IDVariant(5)).equals((new IDVariant(2)))? new IDVariant("Disponibilità Minore di") : (new IDVariant(5)).equals((new IDVariant(3)))? new IDVariant("% Accertato Maggiore di") : (new IDVariant(5)).equals((new IDVariant(4)))? new IDVariant("% Accertato Minore di") : (new IDVariant(5)).equals((new IDVariant(5)))? new IDVariant("% Impegnato Maggiore di") : (new IDVariant(5)).equals((new IDVariant(6)))? new IDVariant("% Impegnato Minore di") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PARAM.SetValueListItem(PFL_PARAM_CRITERIO1, (new IDVariant(6)), ((new IDVariant(6)).equals((new IDVariant(1)))? new IDVariant("Disponibilità Maggiore di") : (new IDVariant(6)).equals((new IDVariant(2)))? new IDVariant("Disponibilità Minore di") : (new IDVariant(6)).equals((new IDVariant(3)))? new IDVariant("% Accertato Maggiore di") : (new IDVariant(6)).equals((new IDVariant(4)))? new IDVariant("% Accertato Minore di") : (new IDVariant(6)).equals((new IDVariant(5)))? new IDVariant("% Impegnato Maggiore di") : (new IDVariant(6)).equals((new IDVariant(6)))? new IDVariant("% Impegnato Minore di") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCompetenza", "AggiornaCriterio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void SITUAZCOMPET_PARAM55() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PARAM55_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAM37, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAM37, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PARAM55_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PARAM55_RS, 0, IMDBDef6.TBL_PARAM37, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAM55_RS, 0, 0, IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEES, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAM55_RS, 1, 0, IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMECRITE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAM55_RS, 2, 0, IMDBDef6.TBL_PARAM37, IMDBDef6.FLD_PARAM37_ROWNAMEIMPOR, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAM37, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAM37, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAM37, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PARAM55_RS, 0);
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
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_CRITERIO1)
      {
        PFL_PARAM_CRITERIO1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_PARTE)
      {
        PFL_PARAM_PARTE_ValidateCell(Cancel);
      }
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

  private void BUK_SITUAZCOMPET_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SITUAZCOMPET_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SITUAZCOMPET_SEC_PAGEHEADER)
    {
      BUK_SITUAZCOMPET.set_SpanValue(BUK_SITUAZCOMPET_SPAN_CSCIERNPSCPE, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Situazione Competenza")), (new IDVariant(" "))), ((IMDB.Value(IMDBDef16.PQRY_PARAM55, IMDBDef16.PQSL_PARAM55_ROWNAMEES, 0).equals((new IDVariant("E"))))?(new IDVariant("Entrate")):(new IDVariant("Spese"))))));
      BUK_SITUAZCOMPET.set_SpanValue(BUK_SITUAZCOMPET_SPAN_ES, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Esercizio")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))));
      BUK_SITUAZCOMPET.set_SpanValue(BUK_SITUAZCOMPET_SPAN_PAG, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_SITUAZCOMPET.GetPageNumber())))), (new IDVariant("/"))), IDL.ToString((new IDVariant(BUK_SITUAZCOMPET.GetTotalPagesNumber()))))));
    }
    if (SectionID==BUK_SITUAZCOMPET_SEC_DETAIL)
    {
      BUK_SITUAZCOMPET.set_SpanValue(BUK_SITUAZCOMPET_SPAN_VOCEPEG, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_SITUAZCOMPET.GetReportColumn(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, "CAPITOLO")), (new IDVariant(" / "))), IDL.ToString(BUK_SITUAZCOMPET.GetReportColumn(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, "ARTICOLO")))));
      BUK_SITUAZCOMPET.set_SpanValue(BUK_SITUAZCOMPET_SPAN_RBSICSCPRBVC, new IDVariant(IDL.Add(BUK_SITUAZCOMPET.GetReportColumn(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, "STN_INI_CO"), BUK_SITUAZCOMPET.GetReportColumn(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, "VARIAZIONI_CO"))));
    }
    if (SectionID==BUK_SITUAZCOMPET_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_SITUAZCOMPET_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_SITUAZCOMPET_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SITUAZCOMPET_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SITUAZCOMPET_MST_PAGPAGE)
    {
    }
  }

  private void BUK_SITUAZCOMPET_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SITUAZCOMPET_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SITUAZCOMPET_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SITUAZCOMPET_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, "3D675055-5D08-4249-933E-782F4D8EF1BF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, "Criterio");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, "Criterio Entrata");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, "F5761D52-01B6-46E6-86E4-C8C945161EDE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, "Importo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, "A96502DD-FB8F-4AC9-83BE-218C6C32BCD8");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, "(Non Digitare per visualizzare Importi o Percentuali minori o maggiori di 0)");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "CCF94AC5-EDE0-4425-8EE5-20C3700FC96B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, MyGlb.PANEL_LIST, 64, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, MyGlb.PANEL_LIST, "Criterio");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, MyGlb.PANEL_FORM, 212, 8, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CRITERIO1, MyGlb.PANEL_FORM, "Criterio");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CRITERIO1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CRITERIO1, PPQRY_PARAM55, "A.ROWNAMECRITE", "ROWNAMECRITE", 1, 1, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, MyGlb.PANEL_LIST, 360, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, MyGlb.PANEL_FORM, 496, 8, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, MyGlb.PANEL_FORM, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_IMPORTO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_IMPORTO, PPQRY_PARAM55, "A.ROWNAMEIMPOR", "ROWNAMEIMPOR", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_LIST, 304, 52, 152, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_FORM, 504, 32, 188, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_FORM, 3);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABEL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 4, 8, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTE, PPQRY_PARAM55, "A.ROWNAMEES", "ROWNAMEES", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM55", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM55, IMDBDef16.PQRY_PARAM55_RS, IMDBDef6.TBL_PARAM37);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CRITERIO1, IMDBDef6.FLD_PARAM37_ROWNAMECRITE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_IMPORTO, IMDBDef6.FLD_PARAM37_ROWNAMEIMPOR);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARTE, IMDBDef6.FLD_PARAM37_ROWNAMEES);
    PAN_PARAM.SetMasterTable(0, "PARAM37");
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

  private void BUK_SITUAZCOMPET_MST_PAGPAGE_Init()
  {
    BUK_SITUAZCOMPET.InitMastro(BUK_SITUAZCOMPET_MST_PAGPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_MST_PAGPAGE, "C446009B-E4DC-4C44-A752-63F27C29A113");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_MST_PAGPAGE, "PAGPAGE");
    BUK_SITUAZCOMPET.InitMastroBox(BUK_SITUAZCOMPET_MST_PAGPAGE, BUK_SITUAZCOMPET_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 2400, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_PAGEHEADER, "A0C8CC31-100E-4566-BF81-B073A2AC72ED");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_SITUAZCOMPET.InitMastroBox(BUK_SITUAZCOMPET_MST_PAGPAGE, BUK_SITUAZCOMPET_RPTBOX_PAGEBODY, 1000, 3400, 19000, 25100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_PAGEBODY, "DF59B1BC-868E-4F51-8875-5DAB8651A1F3");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_SITUAZCOMPET_RPT_SITCOMPETENZ_InitQuery() { BUK_SITUAZCOMPET_RPT_SITCOMPETENZ_InitQuery(true, true); }
  private void BUK_SITUAZCOMPET_RPT_SITCOMPETENZ_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
      SQL.append("  A.VARIAZIONI_CO as VARIAZIONI_CO, ");
      SQL.append("  NVL(CASE WHEN A.E_S = 'S' THEN CASE WHEN (C.GESTIONE_IMPEGNABILE IS NULL) THEN NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0) ELSE NVL(A.IMPEGNABILE, 0) + NVL(A.VAR_IMPEGNABILE, 0) END - NVL(A.DISPONIBILITA, 0) ELSE GET_IMPORTI_SCHEDA_INFO_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAM55.ROWNAMEES~~,B.CAPITOLO,B.ARTICOLO,'IMP_ACC') END, 0) as RECOACCEIMPE, ");
      SQL.append("  CASE WHEN (A.STN_INI_CO + A.VARIAZIONI_CO) = 0 THEN 100 ELSE (CASE WHEN A.E_S = 'S' THEN CASE WHEN (C.GESTIONE_IMPEGNABILE IS NULL) THEN A.STN_INI_CO + A.VARIAZIONI_CO ELSE A.IMPEGNABILE + NVL(A.VAR_IMPEGNABILE, 0) END - A.DISPONIBILITA ELSE NVL(GET_IMPORTI_SCHEDA_INFO_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAM55.ROWNAMEES~~,B.CAPITOLO,B.ARTICOLO,'IMP_ACC'), 0) END * 100) / (A.STN_INI_CO + A.VARIAZIONI_CO) END as RECORDPERCEN, ");
      SQL.append("  A.DISPONIBILITA as DISPONIBILITA ");
      SQL.append("from ");
      SQL.append("  BIL A, ");
      SQL.append("  CAP B, ");
      SQL.append("  T99 C ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.E_S = ~~PQRY_PARAM55.ROWNAMEES~~) ");
      SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (B.E_S = A.E_S) ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (C.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   ((~~PQRY_PARAM55.ROWNAMECRITE~~ = 1 AND A.DISPONIBILITA > ~~PQRY_PARAM55.ROWNAMEIMPOR~~) OR (~~PQRY_PARAM55.ROWNAMECRITE~~ = 2 AND A.DISPONIBILITA < ~~PQRY_PARAM55.ROWNAMEIMPOR~~) OR (~~PQRY_PARAM55.ROWNAMECRITE~~ = DECODE(~~PQRY_PARAM55.ROWNAMEES~~, 'E', 3, 5) AND CASE WHEN (A.STN_INI_CO + A.VARIAZIONI_CO) = 0 THEN 100 ELSE (CASE WHEN (A.STN_INI_CO + A.VARIAZIONI_CO) = 0 THEN 100 ELSE (CASE WHEN A.E_S = 'S' THEN CASE WHEN (C.GESTIONE_IMPEGNABILE IS NULL) THEN A.STN_INI_CO + A.VARIAZIONI_CO ELSE A.IMPEGNABILE + NVL(A.VAR_IMPEGNABILE, 0) END - A.DISPONIBILITA ELSE NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0) - A.DISPONIBILITA END * 100) / (A.STN_INI_CO + A.VARIAZIONI_CO) END) END > ~~PQRY_PARAM55.ROWNAMEIMPOR~~) OR (~~PQRY_PARAM55.ROWNAMECRITE~~ = DECODE(~~PQRY_PARAM55.ROWNAMEES~~, 'E', 4, 6) AND CASE WHEN (A.STN_INI_CO + A.VARIAZIONI_CO) = 0 THEN 100 ELSE (CASE WHEN (A.STN_INI_CO + A.VARIAZIONI_CO) = 0 THEN 100 ELSE (CASE WHEN A.E_S = 'S' THEN CASE WHEN (C.GESTIONE_IMPEGNABILE IS NULL) THEN A.STN_INI_CO + A.VARIAZIONI_CO ELSE A.IMPEGNABILE + NVL(A.VAR_IMPEGNABILE, 0) END - A.DISPONIBILITA ELSE NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0) - A.DISPONIBILITA END * 100) / (A.STN_INI_CO + A.VARIAZIONI_CO) END) END < ~~PQRY_PARAM55.ROWNAMEIMPOR~~)) ");
      SQL.append("order by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO ");
      BUK_SITUAZCOMPET.SetReportQuery(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "D9011F7D-09CB-4413-A28C-F48281B7F78D");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SITUAZCOMPET_RPT_SITCOMPETENZ_Init()
  {
    BUK_SITUAZCOMPET.InitReport(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, 196609);
    BUK_SITUAZCOMPET_RPT_SITCOMPETENZ_InitQuery(true, false);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, "2CFCC6B8-E7CF-4F46-BFAE-57B2A13B8586");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, "SITCOMPETENZ");
    BUK_SITUAZCOMPET.InitSection(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, BUK_SITUAZCOMPET_SEC_PAGEHEADER, 2400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SITUAZCOMPET.SetSectionRendersInto(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_PAGEHEADER);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SEC_PAGEHEADER, "B0539145-A779-480D-9979-5781FEC3DB1A");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_SITCOMPETENZ, 100, 200, 9400, 700, 0, 1, 1, MyGlb.VIS_TITOREPNOBOR, 983297, 554, "Sit Competenze", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_SITCOMPETENZ, "2766708F-AA6F-47EC-9A05-6F7D34E5876A");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_SITCOMPETENZ, "SITCOMPETENZ");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_SITCOMPETENZ, BUK_SITUAZCOMPET_SPAN_CSCIERNPSCPE, MyGlb.VIS_TITOREPNOBOR, 5, 121, 0, 271384705, "", "", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_CSCIERNPSCPE, "EF69764C-5BF4-4106-BC50-5912BC7E6AA3");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_CSCIERNPSCPE, "CSCIERNPSCPE");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_ESERCIZIO, 10500, 200, 5200, 700, 0, 1, 1, MyGlb.VIS_TITOREPNOBOR, 983041, 554, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_ESERCIZIO, "0606E7B8-A90F-4624-BAFB-2ED5A0C5AF3E");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_ESERCIZIO, "ESERCIZIO");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_ESERCIZIO, BUK_SITUAZCOMPET_SPAN_ES, MyGlb.VIS_TITOREPNOBOR, 5, 109, 0, 271319169, "", "", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_ES, "63E0E724-2F18-4AC0-8F18-23B5A4203AE9");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_ES, "ES");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_PAG, 17300, 200, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_PAG, "E224A7E7-9722-4026-A5B1-5A7187D22D07");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_PAG, "PAG");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_PAG, BUK_SITUAZCOMPET_SPAN_PAG, MyGlb.VIS_DEFAREPOSTYL, 5, 204, 0, 271319425, "Pag.", "", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_PAG, "4EBC6639-0629-4143-B453-9CAE4900C3D2");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_PAG, "PAG");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_BOXFAKE, 0, 900, 19000, 500, 0, 1, 1, MyGlb.VIS_LINEAORIZZON, 983041, 375, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_BOXFAKE, "FF73FE34-2536-46C2-BAFA-744F79A43B0E");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_BOXFAKE, "BOXFAKE");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_BOXFAKE, BUK_SITUAZCOMPET_SPAN_BOX1, MyGlb.VIS_LINEAORIZZON, 0, 0, 0, 271319425, "", "", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_BOX1, "1B65B2A6-2B18-42ED-BEE1-5CC0AEC115AF");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_BOX1, "BOX1");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_BOXFAKE1, 0, 1800, 19000, 500, 0, 1, 1, MyGlb.VIS_LINEAORIZZON, 983041, 375, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_BOXFAKE1, "978C64DA-0125-4837-87CA-39D6FB74ED92");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_BOXFAKE1, "BOXFAKE1");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_BOXFAKE1, BUK_SITUAZCOMPET_SPAN_BOX, MyGlb.VIS_LINEAORIZZON, 0, 0, 0, 271319425, "", "", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_BOX, "355C61BD-FEA0-4EC9-ACF2-0D93A895BF81");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_BOX, "BOX");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_VOCEPEG1, 100, 1600, 3200, 600, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983297, 393, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_VOCEPEG1, "415A84BE-0E36-4433-8472-2ED368C26785");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_VOCEPEG1, "VOCEPEG1");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_VOCEPEG1, BUK_SITUAZCOMPET_SPAN_VOCEPEG1, MyGlb.VIS_HEADSENZBOR1, 0, 0, 0, 271319425, "", "Capitolo/Art.", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_VOCEPEG1, "2CBABE18-315E-4832-B6C4-3CDADC4F2FCE");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_VOCEPEG1, "VOCEPEG1");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_DESC1, 3000, 1600, 6300, 600, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983297, 393, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_DESC1, "2E4D964B-4345-4AAF-A9F8-61EB24B56631");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_DESC1, "DESC1");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_DESC1, BUK_SITUAZCOMPET_SPAN_DESC1, MyGlb.VIS_HEADSENZBOR1, 0, 0, 0, 271319425, "", "Descrizione", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_DESC1, "5EEEF12D-EB59-4C40-90FB-448362203D55");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_DESC1, "DESC1");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_STANZIAMENT1, 9400, 1600, 2400, 600, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983297, 393, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_STANZIAMENT1, "242078DD-1352-4A9F-938B-1E148838C09C");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_STANZIAMENT1, "STANZIAMENT1");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_STANZIAMENT1, BUK_SITUAZCOMPET_SPAN_STANZ, MyGlb.VIS_HEADSENZBOR1, 0, 0, 0, 271319425, "", "Stanziamento", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_STANZ, "55C174E9-6781-4B10-BAC8-ADDE4414BAFC");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_STANZ, "STANZ");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_ACCERTAMENTO, 12800, 1600, 1800, 600, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983297, 393, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_ACCERTAMENTO, "A6E295E0-32C4-471F-8C15-6D327C7A8D82");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_ACCERTAMENTO, BUK_SITUAZCOMPET_SPAN_ACCERTATO1, MyGlb.VIS_HEADSENZBOR1, 0, 0, 0, 271319425, "", "Accertato", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_ACCERTATO1, "EF16AD3B-B665-4A8A-92F4-1D3C4B20E741");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_ACCERTATO1, "ACCERTATO1");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_PER, 15700, 1600, 400, 600, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983297, 393, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_PER, "4AFE410D-500A-4D26-8579-3A4EBE92F07C");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_PER, "PER");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_PER, BUK_SITUAZCOMPET_SPAN_ACCERTATO, MyGlb.VIS_HEADSENZBOR1, 0, 0, 0, 271319425, "", "%", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_ACCERTATO, "DA84CBFA-E305-4EC3-9BB9-B21087FFA85C");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_ACCERTATO, "ACCERTATO");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_PAGEHEADER, BUK_SITUAZCOMPET_RPTBOX_DISPONIBILI1, 16800, 1600, 2100, 600, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983297, 393, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_DISPONIBILI1, "60A9AEE7-A9EE-4FDB-B0E9-880F209C9838");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_DISPONIBILI1, "DISPONIBILI1");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_DISPONIBILI1, BUK_SITUAZCOMPET_SPAN_DISPONIBILI1, MyGlb.VIS_HEADSENZBOR1, 0, 0, 0, 271319425, "", "Disponibilità", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_DISPONIBILI1, "3AEB1171-AD3A-4CAE-B43B-9AA5B2DDFA63");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_DISPONIBILI1, "DISPONIBILI1");
    BUK_SITUAZCOMPET.InitSection(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, BUK_SITUAZCOMPET_SEC_DETAIL, 800, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SITUAZCOMPET.SetSectionRendersInto(BUK_SITUAZCOMPET_SEC_DETAIL, BUK_SITUAZCOMPET_RPTBOX_PAGEBODY);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SEC_DETAIL, "EFBCF58A-AA3A-40F8-8FC6-EF4470D0F268");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SEC_DETAIL, "DETAIL");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_DETAIL, BUK_SITUAZCOMPET_RPTBOX_VOCEPEG, 0, 300, 3000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_VOCEPEG, "8CB486A2-F88E-4E85-8375-4CECB9240CE4");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_VOCEPEG, BUK_SITUAZCOMPET_SPAN_VOCEPEG, MyGlb.VIS_DEFAREPOSTYL, 5, 201, 0, 271319169, "", "", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_VOCEPEG, "307892D6-BBB5-4735-84EE-69CC8D9E8D50");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_VOCEPEG, "VOCEPEG");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_DETAIL, BUK_SITUAZCOMPET_RPTBOX_DESCRIZIONE, 3000, 300, 6000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_DESCRIZIONE, "D08200BE-E807-4232-813C-8ABE5983B1A6");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_DESCRIZIONE, BUK_SITUAZCOMPET_SPAN_DESCRIZIONE, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271319425, "", "::DESCRIZIONE", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_DESCRIZIONE, "0D548341-BB0A-4BA2-9BF1-331F2E9133E6");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_DETAIL, BUK_SITUAZCOMPET_RPTBOX_STANZIAMENTO, 9000, 300, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_STANZIAMENTO, "F8D742ED-7895-49DF-BED5-57DFA0A90BE9");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_STANZIAMENTO, "STANZIAMENTO");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_STANZIAMENTO, BUK_SITUAZCOMPET_SPAN_RBSICSCPRBVC, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_RBSICSCPRBVC, "94309682-3BD3-4A16-B4E6-E1362080210E");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_RBSICSCPRBVC, "RBSICSCPRBVC");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_DETAIL, BUK_SITUAZCOMPET_RPTBOX_ACCERTIMPEGN, 11800, 300, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_ACCERTIMPEGN, "03EF6500-AA96-448A-B537-3FF453EC32BC");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_ACCERTIMPEGN, "ACCERTIMPEGN");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_ACCERTIMPEGN, BUK_SITUAZCOMPET_SPAN_REACIMSICOPA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::RECOACCEIMPE", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_REACIMSICOPA, "6A324064-B502-44A6-8210-AA6A8147A1A3");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_REACIMSICOPA, "REACIMSICOPA");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_DETAIL, BUK_SITUAZCOMPET_RPTBOX_PERCENTUALE, 14700, 300, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_PERCENTUALE, "689E7CF4-D624-4A43-AEF2-343D484739AB");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_PERCENTUALE, "PERCENTUALE");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_PERCENTUALE, BUK_SITUAZCOMPET_SPAN_PERC, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271319169, "", "::RECORDPERCEN", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_PERC, "DE23619F-C762-4B09-A59D-DA31BEB183FD");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_PERC, "PERC");
    BUK_SITUAZCOMPET.InitReportBox(BUK_SITUAZCOMPET_SEC_DETAIL, BUK_SITUAZCOMPET_RPTBOX_DISPONIBILIT, 16100, 300, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_RPTBOX_DISPONIBILIT, "AB0087D7-EE12-4B54-97D9-AC9B147F7B95");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_SITUAZCOMPET.InitBoxSpan(BUK_SITUAZCOMPET_RPTBOX_DISPONIBILIT, BUK_SITUAZCOMPET_SPAN_DISPONIBILIT, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271319169, "", "::DISPONIBILITA", 1);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SPAN_DISPONIBILIT, "0A06EDC0-E383-447A-AEB0-294C25D44C63");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_SITUAZCOMPET.InitSection(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, BUK_SITUAZCOMPET_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_SITUAZCOMPET.SetSectionRendersInto(BUK_SITUAZCOMPET_SEC_PAGEFOOTER, BUK_SITUAZCOMPET_RPTBOX_PAGEBODY);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SEC_PAGEFOOTER, "9EC023BD-41FB-4445-9352-D51E1BE42690");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_SITUAZCOMPET.InitSection(BUK_SITUAZCOMPET_RPT_SITCOMPETENZ, BUK_SITUAZCOMPET_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_SITUAZCOMPET.SetSectionRendersInto(BUK_SITUAZCOMPET_SEC_REPORTFOOTER, BUK_SITUAZCOMPET_RPTBOX_PAGEBODY);
    BUK_SITUAZCOMPET.SetRTCGuid(BUK_SITUAZCOMPET_SEC_REPORTFOOTER, "B4B24253-4664-407B-91A7-940CA1FB4808");
    BUK_SITUAZCOMPET.SetObjCode(BUK_SITUAZCOMPET_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_SITUAZCOMPET_RPT_SITCOMPETENZ_InitQuery(false, true);
  }

  private void BUK_SITUAZCOMPET_InitLinks()
  {
    BUK_SITUAZCOMPET.SetBoxNextBox(BUK_SITUAZCOMPET_RPTBOX_PAGEBODY, BUK_SITUAZCOMPET_RPTBOX_PAGEBODY);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_AfterFind(CmdFind);
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
    if (SrcObj == BKW_SITUAZCOMPET) BUK_SITUAZCOMPET_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_SITUAZCOMPET) BUK_SITUAZCOMPET_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_SITUAZCOMPET) BUK_SITUAZCOMPET_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_SITUAZCOMPET) BUK_SITUAZCOMPET_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_SITUAZCOMPET) BUK_SITUAZCOMPET_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_SITUAZCOMPET) BUK_SITUAZCOMPET_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_SITUAZCOMPET) BUK_SITUAZCOMPET_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_SITUAZCOMPET) BUK_SITUAZCOMPET_OnPreview();
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
