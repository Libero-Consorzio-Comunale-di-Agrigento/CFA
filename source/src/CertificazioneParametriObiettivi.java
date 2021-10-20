// **********************************************
// Certificazione Parametri Obiettivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CertificazioneParametriObiettivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CERTPARAOBIE_CODICE = 0;
  private static int PFL_CERTPARAOBIE_DESCRIZIONE = 1;
  private static int PFL_CERTPARAOBIE_APRI = 2;
  private static int PFL_CERTPARAOBIE_VALORE = 3;
  private static int PFL_CERTPARAOBIE_DESCRIZLABEL = 4;
  private static int PFL_CERTPARAOBIE_SI = 5;
  private static int PFL_CERTPARAOBIE_NO = 6;
  private static int PFL_CERTPARAOBIE_STATUS = 7;

  private static int PPQRY_PARADEFCCES1 = 0;


  IDPanel PAN_CERTPARAOBIE;
  CIDREObj BUK_CERPAROBIBOO;
  OBook BKW_CERPAROBIBOO;
  //
  // Template Pages constants
  private static int BUK_CERPAROBIBOO_MST_CERPAROBBOPA = 1;
  private static int BUK_CERPAROBIBOO_RPTBOX_PAGEHEADER = 2;
  private static int BUK_CERPAROBIBOO_RPTBOX_PAGEBODY = 3;

  //
  // Reports constants
  private static int BUK_CERPAROBIBOO_RPT_NEWREPORT = 4;
  private static int BUK_CERPAROBIBOO_SEC_REPORTHEADER = 5;
  private static int BUK_CERPAROBIBOO_SEC_PAGEHEADER = 6;
  private static int BUK_CERPAROBIBOO_RPTBOX_TABELLA = 7;
  private static int BUK_CERPAROBIBOO_SPAN_TABELLA = 8;
  private static int BUK_CERPAROBIBOO_SEC_DETAIL = 9;
  private static int BUK_CERPAROBIBOO_RPTBOX_SI = 10;
  private static int BUK_CERPAROBIBOO_SPAN_SI = 11;
  private static int BUK_CERPAROBIBOO_RPTBOX_NO1 = 12;
  private static int BUK_CERPAROBIBOO_SPAN_NO1 = 13;
  private static int BUK_CERPAROBIBOO_RPTBOX_X = 14;
  private static int BUK_CERPAROBIBOO_SPAN_X = 15;
  private static int BUK_CERPAROBIBOO_RPTBOX_CODICE = 16;
  private static int BUK_CERPAROBIBOO_SPAN_CODICE = 17;
  private static int BUK_CERPAROBIBOO_RPTBOX_DESC = 18;
  private static int BUK_CERPAROBIBOO_SPAN_DESCRIZIONE = 19;
  private static int BUK_CERPAROBIBOO_RPTBOX_VAL = 20;
  private static int BUK_CERPAROBIBOO_SPAN_VAL = 21;
  private static int BUK_CERPAROBIBOO_SEC_REPORTFOOTER = 22;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_TEMP(IMDB);
    //
    //
    Init_PQRY_PARADEFCCES1(IMDB);
    Init_PQRY_PARADEFCCES1_RS(IMDB);
    Init_PQRY_PARADEFCCESE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_TEMP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_TEMP, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_TEMP, "TBL_TEMP");
    IMDB.set_FldCode(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMECODIC,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMEVALOR, "ROWNAMEVALOR");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMEVALOR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMESI, "ROWNAMESI");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMESI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMENO, "ROWNAMENO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMENO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMESTATU, "ROWNAMESTATU");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMESTATU,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMEDESCR,9,2000,0);
  }

  private static void Init_PQRY_PARADEFCCES1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARADEFCCES1, 7);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARADEFCCES1, "PQRY_PARADEFCCES1");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_RECORDAPRI, "RECORDAPRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_RECORDAPRI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR, "ROWNAMEVALOR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR,9,2000,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESI, "ROWNAMESI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMENO, "ROWNAMENO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMENO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU, "ROWNAMESTATU");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU,5,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARADEFCCES1, 0);
  }

  private static void Init_PQRY_PARADEFCCES1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARADEFCCES1_RS, 7);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARADEFCCES1_RS, "PQRY_PARADEFCCES1_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_RECORDAPRI, "RECORDAPRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_RECORDAPRI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR, "ROWNAMEVALOR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR,9,2000,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESI, "ROWNAMESI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMENO, "ROWNAMENO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMENO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU, "ROWNAMESTATU");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCES1_RS,IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU,5,1,0);
  }

  private static void Init_PQRY_PARADEFCCESE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARADEFCCESE, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARADEFCCESE, "PQRY_PARADEFCCESE");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCESE,IMDBDef12.PQSL_PARADEFCCESE_RECORDAPRI, "RECORDAPRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCESE,IMDBDef12.PQSL_PARADEFCCESE_RECORDAPRI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCESE,IMDBDef12.PQSL_PARADEFCCESE_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCESE,IMDBDef12.PQSL_PARADEFCCESE_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCESE,IMDBDef12.PQSL_PARADEFCCESE_VALORE, "VALORE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCESE,IMDBDef12.PQSL_PARADEFCCESE_VALORE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARADEFCCESE,IMDBDef12.PQSL_PARADEFCCESE_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARADEFCCESE,IMDBDef12.PQSL_PARADEFCCESE_DESCRIZIONE,5,2000,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARADEFCCESE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CertificazioneParametriObiettivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public CertificazioneParametriObiettivi()
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
    FormIdx = MyGlb.FRM_CERTPARAOBIE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "240E77F3-5CE4-4749-96B1-487B75969220";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 744;
    DesignHeight = 370;
    set_Caption(new IDVariant("Certificazione Parametri Obiettivi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 744;
    Frames[1].Height = 344;
    Frames[1].Caption = "Certificazione Parametri Obiettivi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_CERTPARAOBIE = new IDPanel(w, this, 1, "PAN_CERTPARAOBIE");
    Frames[1].Content = PAN_CERTPARAOBIE;
    PAN_CERTPARAOBIE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CERTPARAOBIE.VS = MainFrm.VisualStyleList;
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 744-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CERPAROBIBOO != null)
      PAN_CERTPARAOBIE.SetBook(BUK_CERPAROBIBOO);
    PAN_CERTPARAOBIE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "57A17C9C-0968-4937-9536-1E2EFCD66D36");
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 620, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CERTPARAOBIE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CERTPARAOBIE.InitStatus = 2;
    PAN_CERTPARAOBIE_Init();
    PAN_CERTPARAOBIE_InitFields();
    PAN_CERTPARAOBIE_InitQueries();
    BKW_CERPAROBIBOO = new OBook(this);
    BUK_CERPAROBIBOO = new CIDREObj(BKW_CERPAROBIBOO);
    BKW_CERPAROBIBOO.iGuid = "EB302334-1836-4EB1-A22E-C815AEDC5BD0";
    BKW_CERPAROBIBOO.Code = "BUK_CERPAROBIBOO";
    BKW_CERPAROBIBOO.BookObj = BUK_CERPAROBIBOO;
    BKW_CERPAROBIBOO.InitDefMasks();
    BUK_CERPAROBIBOO.InitBook(1, 196609, "Certificazione Parametri Obiettivi Book", IMDB, MainFrm.VisualStyleList);
    BUK_CERPAROBIBOO.InitHTML();
    BUK_CERPAROBIBOO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CERPAROBIBOO.Book.SetMainFrm(MainFrm);
    BUK_CERPAROBIBOO.SetRTCGuid(0, "EB302334-1836-4EB1-A22E-C815AEDC5BD0");
    BUK_CERPAROBIBOO.SetObjCode(0, "CERPAROBIBOO");
    if (PAN_CERTPARAOBIE != null)
      PAN_CERTPARAOBIE.SetBook(BUK_CERPAROBIBOO);
    BUK_CERPAROBIBOO_MST_CERPAROBBOPA_Init();
    BUK_CERPAROBIBOO_RPT_NEWREPORT_Init();
    BUK_CERPAROBIBOO_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI58+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI46+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI58+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DUPLDAESEPR1+BaseCmdLinIdx)
      {
        DuplicaDaEsercizioPrecedente();
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
      if (IMDB.TblModified(IMDBDef3.TBL_TEMP, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CERTPARAOBIE_PARADEFCCES1();
      }
      PAN_CERTPARAOBIE.UpdatePanel(MainFrm);
      // BUK_CERPAROBIBOO.UpdateBook();
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
    if (Code.equals("BUK_CERPAROBIBOO")) return BUK_CERPAROBIBOO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CertificazioneParametriObiettivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CertificazioneParametriObiettivi.class.getName() : (Glb.ClassWithPackage(CertificazioneParametriObiettivi.class) ? CertificazioneParametriObiettivi.class.getName().substring(CertificazioneParametriObiettivi.class.getPackage().getName().length() + 1) : CertificazioneParametriObiettivi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR, 0), (new IDVariant(PAN_CERTPARAOBIE.Header(Glb.OBJ_FIELD,PFL_CERTPARAOBIE_DESCRIZIONE))), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Procedure Body
      // 
      RIEMPIIMDB_TEMPDELETE();
      RIEMPIIMDB_TEMINSINTSEL();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Temp: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPIIMDB_TEMPDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_TEMP);
  }

  // **********************************************************************
  // Temp: Insert into... select
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEMPIIMDB_TEMINSINTSEL() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PARDEFCCESCO, ");
    SQL.append("  A.ESERCIZIO as PARDEFCCESES, ");
    SQL.append("  A.VALORE as PARDEFCCESVA, ");
    SQL.append("  A.DESCRIZIONE as PARDEFCCESDE, ");
    SQL.append("  CASE WHEN A.VALORE = 'SI' THEN 'SI' ELSE 'NO' END as IFPADECEVSSN, ");
    SQL.append("  CASE WHEN A.VALORE = 'SI' THEN 'NO' ELSE 'SI' END as IFPADECEVSNS ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_DEF_CC_ESE A ");
    SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef3.TBL_TEMP, 0);
      IMDB.set_Value(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMECODIC,0,RS.Get(1));
      IMDB.set_Value(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMEESERC,0,RS.Get(2));
      IMDB.set_Value(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMEVALOR,0,RS.Get(3));
      IMDB.set_Value(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMEDESCR,0,new IDVariant(RS.Get(4),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMESI,0,RS.Get(5));
      IMDB.set_Value(IMDBDef3.TBL_TEMP,IMDBDef3.FLD_TEMP_ROWNAMENO,0,RS.Get(6));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Updateprocedure
  // **********************************************************************
  public int Updateprocedure ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Updateprocedure Body
      // Procedure Body
      // 
      IMDB.TblMoveFirst (IMDBDef12.PQRY_PARADEFCCES1_RS, 0);
      while (!IMDB.Eof(IMDBDef12.PQRY_PARADEFCCES1_RS, 0))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1_RS, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU, 0).equals((new IDVariant("N")), true))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("insert into PARAMETRI_DEF_CC_ESE ");
            SQL.append("( ");
            SQL.append("  ESERCIZIO, ");
            SQL.append("  VALORE, ");
            SQL.append("  DESCRIZIONE, ");
            SQL.append("  CODICE ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1_RS, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1_RS, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1_RS, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e5)
          {
            MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
          }
        }
        if (IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1_RS, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU, 0).equals((new IDVariant("M")), true))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("update PARAMETRI_DEF_CC_ESE set ");
            SQL.append("  DESCRIZIONE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1_RS, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  VALORE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1_RS, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CODICE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1_RS, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e8)
          {
            MainFrm.set_AlertMessage(new IDVariant(e8.getMessage())); 
          }
        }
        IMDB.TblMoveNext(IMDBDef12.PQRY_PARADEFCCES1_RS, 0);
      }
      RiempiIMDB();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "Updateprocedure", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cancella
  // **********************************************************************
  public int Cancella ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cancella Body
      // Procedure Body
      // 
      CANCELLA_TEMPDELETE();
      try
      {
        SQL = new StringBuffer();
        SQL.append("delete from PARAMETRI_DEF_CC_ESE ");
        SQL.append("where (CODICE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      catch (Exception e3)
      {
        MainFrm.set_AlertMessage(new IDVariant(e3.getMessage())); 
      }
      RiempiIMDB();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "Cancella", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Temp: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void CANCELLA_TEMPDELETE() throws SQLException
  {
    boolean bDeleted = false;

    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMP, 0);
    while (!IMDB.Eof(IMDBDef3.TBL_TEMP, 0))
    {
      bDeleted = false;
      if (IMDB.Value(IMDBDef3.TBL_TEMP, IMDBDef3.FLD_TEMP_ROWNAMECODIC, 0).equals(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC, 0), true))
      {
        IMDB.TblDelete(IMDBDef3.TBL_TEMP, 0);
        bDeleted = true;
      }
      if (!bDeleted) IMDB.TblMoveNext(IMDBDef3.TBL_TEMP, 0);
    }
  }

  // **********************************************************************
  // Duplica Da Esercizio Precedente
  // **********************************************************************
  public int DuplicaDaEsercizioPrecedente ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Duplica Da Esercizio Precedente Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.DUPLICAPARAMDEFCCESE(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        PAN_CERTPARAOBIE.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "DuplicaDaEsercizioPrecedente", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      RiempiIMDB();
      PAN_CERTPARAOBIE.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "LoadEvent", _e);
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
      if (Result.equals((new IDVariant(-1)), true))
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Certificazione Parametri Obiettivi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CERTPARAOBIE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Certificazione Parametri Obiettivi On Updating Row Event Body
      // Procedure Body
      // 
      if (PAN_CERTPARAOBIE.IsNewRow())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU, 0, (new IDVariant("N")));
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_RECORDAPRI, 0, (new IDVariant("S")));
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESTATU, 0, (new IDVariant("M")));
        }
      }
      if (Column.equals((new IDVariant(PFL_CERTPARAOBIE_SI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESI, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMENO, 0, (new IDVariant("NO")));
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR, 0, (new IDVariant("NO")));
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMENO, 0, (new IDVariant("SI")));
        }
      }
      if (Column.equals((new IDVariant(PFL_CERTPARAOBIE_NO)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMENO, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR, 0, (new IDVariant("NO")));
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESI, 0, (new IDVariant("NO")));
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEVALOR, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESI, 0, (new IDVariant("SI")));
        }
      }
      if (Column.equals((new IDVariant(PFL_CERTPARAOBIE_DESCRIZIONE)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR, 0, IDL.SubStr(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMEDESCR, 0), (new IDVariant(1)), (new IDVariant(2000))));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "CertificazioneParametriObiettiviOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Certificazione Parametri Obiettivi On Database Error Event
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
  private void PAN_CERTPARAOBIE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CERTPARAOBIE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Certificazione Parametri Obiettivi On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "CertificazioneParametriObiettiviOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Certificazione Parametri Obiettivi On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CERTPARAOBIE_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Certificazione Parametri Obiettivi On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC, 0)))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Codice obbligatorio", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMESI, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMENO, 0)))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("E' necessario indicare una preferenza tra SI o NO per il Codice ", IDVariant.STRING));
          MainFrm.set_AlertMessage(IDL.Add(v_ERR, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARADEFCCES1, IMDBDef12.PQSL_PARADEFCCES1_ROWNAMECODIC, 0)))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
      if (Command.equals((new IDVariant(64)), true) || Command.equals((new IDVariant(32)), true))
      {
        RiempiIMDB();
      }
      if (Command.equals((new IDVariant(16)), true))
      {
        Cancella();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "CertificazioneParametriObiettiviOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Certificazione Parametri Obiettivi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CERTPARAOBIE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CERTPARAOBIE);
      // 
      // Certificazione Parametri Obiettivi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CERTPARAOBIE.IsNewRow()))
      {
        PAN_CERTPARAOBIE.SetFlags (Glb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CERTPARAOBIE.SetFlags (Glb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "CertificazioneParametriObiettiviOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Certificazione Parametri Obiettivi After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_CERTPARAOBIE_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Certificazione Parametri Obiettivi After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        Updateprocedure();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "CertificazioneParametriObiettiviAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Detail After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_CERPAROBIBOO_SEC_DETAIL_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail After Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_CERPAROBIBOO.SpanText(BUK_CERPAROBIBOO_SPAN_VAL))).equals((new IDVariant("SI")), true))
      {
        BUK_CERPAROBIBOO.set_BoxRect(BUK_CERPAROBIBOO_RPTBOX_X, IDREGlb.RECT_LEFT, (new IDVariant(BUK_CERPAROBIBOO.BoxRect(BUK_CERPAROBIBOO_RPTBOX_SI, IDREGlb.RECT_LEFT))).dblValue());
      }
      else
      {
        BUK_CERPAROBIBOO.set_BoxRect(BUK_CERPAROBIBOO_RPTBOX_X, IDREGlb.RECT_LEFT, (new IDVariant(BUK_CERPAROBIBOO.BoxRect(BUK_CERPAROBIBOO_RPTBOX_NO1, IDREGlb.RECT_LEFT))).dblValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CertificazioneParametriObiettivi", "DetailAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // PARAMETRI DEF CC ESE
  // Primary record source for panel data
  // **********************************************************************
  private void CERTPARAOBIE_PARADEFCCES1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARADEFCCES1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMP, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_TEMP, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARADEFCCES1_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARADEFCCES1_RS, 0, IMDBDef3.TBL_TEMP, 0);
      IMDB.set_Value(IMDBDef12.PQRY_PARADEFCCES1_RS, 0, 0, (new IDVariant("S")));
      IMDB.TblLinkField(IMDBDef12.PQRY_PARADEFCCES1_RS, 1, 0, IMDBDef3.TBL_TEMP, IMDBDef3.FLD_TEMP_ROWNAMECODIC, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARADEFCCES1_RS, 2, 0, IMDBDef3.TBL_TEMP, IMDBDef3.FLD_TEMP_ROWNAMEVALOR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARADEFCCES1_RS, 3, 0, IMDBDef3.TBL_TEMP, IMDBDef3.FLD_TEMP_ROWNAMEDESCR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARADEFCCES1_RS, 4, 0, IMDBDef3.TBL_TEMP, IMDBDef3.FLD_TEMP_ROWNAMESI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARADEFCCES1_RS, 5, 0, IMDBDef3.TBL_TEMP, IMDBDef3.FLD_TEMP_ROWNAMENO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARADEFCCES1_RS, 6, 0, IMDBDef3.TBL_TEMP, IMDBDef3.FLD_TEMP_ROWNAMESTATU, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_TEMP, 0);
      if (IMDB.Eof(IMDBDef3.TBL_TEMP, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_TEMP, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARADEFCCES1_RS, 0);
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
  private void PAN_CERTPARAOBIE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CERTPARAOBIE, Cancel);
    // Stub
  }

  private void PAN_CERTPARAOBIE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CERTPARAOBIE_APRI)
    {
      this.IdxPanelActived = this.PAN_CERTPARAOBIE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CERTPARAOBIE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CERTPARAOBIE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CERTPARAOBIE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CERTPARAOBIE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CERPAROBIBOO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CERPAROBIBOO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CERPAROBIBOO_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CERPAROBIBOO_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CERPAROBIBOO_SEC_DETAIL)
    {
      BUK_CERPAROBIBOO.set_SpanValue(BUK_CERPAROBIBOO_SPAN_CODICE, new IDVariant(IDL.Add(IDL.ToString(BUK_CERPAROBIBOO.GetReportColumn(BUK_CERPAROBIBOO_RPT_NEWREPORT, "CODICE")), (new IDVariant(")")))));
    }
    if (SectionID==BUK_CERPAROBIBOO_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CERPAROBIBOO_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CERPAROBIBOO_SEC_DETAIL)
    {
      BUK_CERPAROBIBOO_SEC_DETAIL_OnAfterFormattingSection();
    }
  }

  private void BUK_CERPAROBIBOO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CERPAROBIBOO_MST_CERPAROBBOPA)
    {
    }
  }

  private void BUK_CERPAROBIBOO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CERPAROBIBOO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CERPAROBIBOO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CERPAROBIBOO_OnPreview()
  {
    PreviewBook = BKW_CERPAROBIBOO;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CERTPARAOBIE_Init()
  {

    PAN_CERTPARAOBIE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CERTPARAOBIE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CERTPARAOBIE.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_CERTPARAOBIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, "52D35C6C-4564-428D-AF90-F0BD36C28312");
    PAN_CERTPARAOBIE.set_Header(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, "Codice");
    PAN_CERTPARAOBIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, "");
    PAN_CERTPARAOBIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CERTPARAOBIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CERTPARAOBIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, "58128ACE-3C6A-4C1C-826B-40B5BE71390D");
    PAN_CERTPARAOBIE.set_Header(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, "Descrizione");
    PAN_CERTPARAOBIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, "");
    PAN_CERTPARAOBIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CERTPARAOBIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CERTPARAOBIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, "6278B4A1-F5CF-4560-A610-C8FFDE0E94E7");
    PAN_CERTPARAOBIE.set_Header(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, "Apri");
    PAN_CERTPARAOBIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, "");
    PAN_CERTPARAOBIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, MyGlb.VIS_HYPELINKIMMA);
    PAN_CERTPARAOBIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CERTPARAOBIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, "A1099FEB-A715-4857-9742-D9F1190AAF41");
    PAN_CERTPARAOBIE.set_Header(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, "Valore");
    PAN_CERTPARAOBIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, "");
    PAN_CERTPARAOBIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, MyGlb.VIS_OPTIONBUTTON);
    PAN_CERTPARAOBIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CERTPARAOBIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, "4C8D6B39-573F-457E-B55A-658327E2D831");
    PAN_CERTPARAOBIE.set_Header(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, "Descrizione");
    PAN_CERTPARAOBIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_CERTPARAOBIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CERTPARAOBIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, "0B59B277-C537-475F-A866-618B34C13B59");
    PAN_CERTPARAOBIE.set_Header(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, "SI");
    PAN_CERTPARAOBIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, "");
    PAN_CERTPARAOBIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, MyGlb.VIS_CHECKSTYLE);
    PAN_CERTPARAOBIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CERTPARAOBIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, "C59BA2E4-1048-4981-B4E7-35868421FF82");
    PAN_CERTPARAOBIE.set_Header(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, "NO");
    PAN_CERTPARAOBIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, "");
    PAN_CERTPARAOBIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, MyGlb.VIS_CHECKSTYLE);
    PAN_CERTPARAOBIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CERTPARAOBIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, "786B1993-C874-4971-B122-9E92E3429D62");
    PAN_CERTPARAOBIE.set_Header(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, "Status");
    PAN_CERTPARAOBIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, "");
    PAN_CERTPARAOBIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, MyGlb.VIS_NORMFIELPADR);
    PAN_CERTPARAOBIE.SetFlags(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CERTPARAOBIE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, MyGlb.PANEL_LIST, 40);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, MyGlb.PANEL_FORM, 4, 172, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, MyGlb.PANEL_FORM, 40);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_CODICE, MyGlb.PANEL_FORM, "Cod.");
    PAN_CERTPARAOBIE.SetFieldPage(PFL_CERTPARAOBIE_CODICE, -1, -1);
    PAN_CERTPARAOBIE.SetFieldPanel(PFL_CERTPARAOBIE_CODICE, PPQRY_PARADEFCCES1, "A.ROWNAMECODIC", "ROWNAMECODIC", 1, 2, 0, -13997);
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, MyGlb.PANEL_LIST, 52, 36, 496, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_CERTPARAOBIE.SetFieldPage(PFL_CERTPARAOBIE_DESCRIZIONE, -1, -1);
    PAN_CERTPARAOBIE.SetFieldPanel(PFL_CERTPARAOBIE_DESCRIZIONE, PPQRY_PARADEFCCES1, "A.ROWNAMEDESCR", "ROWNAMEDESCR", 9, 2000, 0, -13997);
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, MyGlb.PANEL_LIST, 548, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, MyGlb.PANEL_LIST, 28);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, MyGlb.PANEL_LIST, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, MyGlb.PANEL_LIST, "Ap.");
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, MyGlb.PANEL_FORM, 4, 124, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, MyGlb.PANEL_FORM, 28);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, MyGlb.PANEL_FORM, 2);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_APRI, MyGlb.PANEL_FORM, "Ap.");
    PAN_CERTPARAOBIE.SetFieldPage(PFL_CERTPARAOBIE_APRI, -1, -1);
    PAN_CERTPARAOBIE.SetFieldUnbound(PFL_CERTPARAOBIE_APRI, true);
    PAN_CERTPARAOBIE.SetFieldPanel(PFL_CERTPARAOBIE_APRI, PPQRY_PARADEFCCES1, "", "RECORDAPRI", 5, 1, 0, -13997);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_APRI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, MyGlb.PANEL_LIST, 572, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, MyGlb.PANEL_LIST, 40);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, MyGlb.PANEL_LIST, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, MyGlb.PANEL_LIST, "Valore");
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, MyGlb.PANEL_FORM, 4, 196, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, MyGlb.PANEL_FORM, 40);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, MyGlb.PANEL_FORM, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_VALORE, MyGlb.PANEL_FORM, "Val.");
    PAN_CERTPARAOBIE.SetFieldPage(PFL_CERTPARAOBIE_VALORE, -1, -1);
    PAN_CERTPARAOBIE.SetFieldPanel(PFL_CERTPARAOBIE_VALORE, PPQRY_PARADEFCCES1, "A.ROWNAMEVALOR", "ROWNAMEVALOR", 5, 2, 0, -13997);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_VALORE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_VALORE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, MyGlb.PANEL_LIST, 52, 0, 520, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, MyGlb.PANEL_LIST, 0);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, MyGlb.PANEL_LIST, 2);
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, MyGlb.PANEL_FORM, 64, 0, 464, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, MyGlb.PANEL_FORM, 0);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_DESCRIZLABEL, MyGlb.PANEL_FORM, 2);
    PAN_CERTPARAOBIE.SetFieldPage(PFL_CERTPARAOBIE_DESCRIZLABEL, -1, -1);
    PAN_CERTPARAOBIE.SetFieldPanel(PFL_CERTPARAOBIE_DESCRIZLABEL, -1, "", "DESCRIZLABEL", 0, 0, 0, -13997);
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, MyGlb.PANEL_LIST, 572, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, MyGlb.PANEL_LIST, 20);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, MyGlb.PANEL_LIST, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, MyGlb.PANEL_LIST, "SI");
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, MyGlb.PANEL_FORM, 4, 268, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, MyGlb.PANEL_FORM, 20);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, MyGlb.PANEL_FORM, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_SI, MyGlb.PANEL_FORM, "SI");
    PAN_CERTPARAOBIE.SetFieldPage(PFL_CERTPARAOBIE_SI, -1, -1);
    PAN_CERTPARAOBIE.SetFieldPanel(PFL_CERTPARAOBIE_SI, PPQRY_PARADEFCCES1, "A.ROWNAMESI", "ROWNAMESI", 5, 2, 0, -13997);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_SI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_SI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, MyGlb.PANEL_LIST, 596, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, MyGlb.PANEL_LIST, 24);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, MyGlb.PANEL_LIST, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, MyGlb.PANEL_LIST, "NO");
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, MyGlb.PANEL_FORM, 4, 292, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, MyGlb.PANEL_FORM, 24);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, MyGlb.PANEL_FORM, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_NO, MyGlb.PANEL_FORM, "NO");
    PAN_CERTPARAOBIE.SetFieldPage(PFL_CERTPARAOBIE_NO, -1, -1);
    PAN_CERTPARAOBIE.SetFieldPanel(PFL_CERTPARAOBIE_NO, PPQRY_PARADEFCCES1, "A.ROWNAMENO", "ROWNAMENO", 5, 2, 0, -13997);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_NO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CERTPARAOBIE.SetValueListItem(PFL_CERTPARAOBIE_NO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, MyGlb.PANEL_LIST, 592, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, MyGlb.PANEL_LIST, 40);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, MyGlb.PANEL_LIST, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, MyGlb.PANEL_LIST, "Stat.");
    PAN_CERTPARAOBIE.SetRect(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, MyGlb.PANEL_FORM, 4, 316, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CERTPARAOBIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, MyGlb.PANEL_FORM, 40);
    PAN_CERTPARAOBIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, MyGlb.PANEL_FORM, 1);
    PAN_CERTPARAOBIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CERTPARAOBIE_STATUS, MyGlb.PANEL_FORM, "Stat.");
    PAN_CERTPARAOBIE.SetFieldPage(PFL_CERTPARAOBIE_STATUS, -1, -1);
    PAN_CERTPARAOBIE.SetFieldPanel(PFL_CERTPARAOBIE_STATUS, PPQRY_PARADEFCCES1, "A.ROWNAMESTATU", "ROWNAMESTATU", 5, 1, 0, -13997);
  }

  private void PAN_CERTPARAOBIE_InitQueries()
  {
    StringBuffer SQL;

    PAN_CERTPARAOBIE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CERTPARAOBIE.SetIMDB(IMDB, "PQRY_PARADEFCCES1", true);
    PAN_CERTPARAOBIE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_CERTPARAOBIE.SetQueryIMDB(PPQRY_PARADEFCCES1, IMDBDef12.PQRY_PARADEFCCES1_RS, IMDBDef3.TBL_TEMP);
    JustLoaded = true;
    PAN_CERTPARAOBIE.SetFieldPrimaryIndex(PFL_CERTPARAOBIE_CODICE, IMDBDef3.FLD_TEMP_ROWNAMECODIC);
    PAN_CERTPARAOBIE.SetFieldPrimaryIndex(PFL_CERTPARAOBIE_DESCRIZIONE, IMDBDef3.FLD_TEMP_ROWNAMEDESCR);
    PAN_CERTPARAOBIE.SetFieldPrimaryIndex(PFL_CERTPARAOBIE_VALORE, IMDBDef3.FLD_TEMP_ROWNAMEVALOR);
    PAN_CERTPARAOBIE.SetFieldPrimaryIndex(PFL_CERTPARAOBIE_SI, IMDBDef3.FLD_TEMP_ROWNAMESI);
    PAN_CERTPARAOBIE.SetFieldPrimaryIndex(PFL_CERTPARAOBIE_NO, IMDBDef3.FLD_TEMP_ROWNAMENO);
    PAN_CERTPARAOBIE.SetFieldPrimaryIndex(PFL_CERTPARAOBIE_STATUS, IMDBDef3.FLD_TEMP_ROWNAMESTATU);
    PAN_CERTPARAOBIE.SetMasterTable(0, "TEMP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CERTPARAOBIE.Status() == 2)
    {
      int oldListQBE = PAN_CERTPARAOBIE.iUseListQBE;
      PAN_CERTPARAOBIE.iUseListQBE = 0;
      PAN_CERTPARAOBIE.PanelCommand(Glb.PCM_SEARCH);
      PAN_CERTPARAOBIE.PanelCommand(Glb.PCM_FIND);
      PAN_CERTPARAOBIE.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CERPAROBIBOO_MST_CERPAROBBOPA_Init()
  {
    BUK_CERPAROBIBOO.InitMastro(BUK_CERPAROBIBOO_MST_CERPAROBBOPA, 3, 21000, 29700, 1, 1, 1);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_MST_CERPAROBBOPA, "4881A6DA-54C7-4273-AC9B-6BEC1B295F80");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_MST_CERPAROBBOPA, "CERPAROBBOPA");
    BUK_CERPAROBIBOO.InitMastroBox(BUK_CERPAROBIBOO_MST_CERPAROBBOPA, BUK_CERPAROBIBOO_RPTBOX_PAGEHEADER, 1000, 800, 19000, 1100, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPTBOX_PAGEHEADER, "15485391-511D-4368-BC52-E0BCDCC48AE0");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CERPAROBIBOO.InitMastroBox(BUK_CERPAROBIBOO_MST_CERPAROBBOPA, BUK_CERPAROBIBOO_RPTBOX_PAGEBODY, 1000, 2300, 19000, 26000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPTBOX_PAGEBODY, "87AA87B1-81FE-4204-B528-E2A130442A3D");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_CERPAROBIBOO_RPT_NEWREPORT_InitQuery() { BUK_CERPAROBIBOO_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CERPAROBIBOO_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  'S' as RECORDAPRI, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.VALORE as VALORE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  PARAMETRI_DEF_CC_ESE A ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      BUK_CERPAROBIBOO.SetReportQuery(BUK_CERPAROBIBOO_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "A6A91203-8AFF-413A-A84A-217B44AA788D");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CERPAROBIBOO_RPT_NEWREPORT_Init()
  {
    BUK_CERPAROBIBOO.InitReport(BUK_CERPAROBIBOO_RPT_NEWREPORT, 196609);
    BUK_CERPAROBIBOO_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPT_NEWREPORT, "BD6BF899-4C0D-454F-9689-AC4B14B9583A");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPT_NEWREPORT, "NEWREPORT");
    BUK_CERPAROBIBOO.InitSection(BUK_CERPAROBIBOO_RPT_NEWREPORT, BUK_CERPAROBIBOO_SEC_REPORTHEADER, 1100, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CERPAROBIBOO.SetSectionRendersInto(BUK_CERPAROBIBOO_SEC_REPORTHEADER, BUK_CERPAROBIBOO_RPTBOX_PAGEBODY);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SEC_REPORTHEADER, "7FB19649-9053-40FB-BBC5-565ED5875CB3");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CERPAROBIBOO.InitSection(BUK_CERPAROBIBOO_RPT_NEWREPORT, BUK_CERPAROBIBOO_SEC_PAGEHEADER, 1000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CERPAROBIBOO.SetSectionRendersInto(BUK_CERPAROBIBOO_SEC_PAGEHEADER, BUK_CERPAROBIBOO_RPTBOX_PAGEHEADER);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SEC_PAGEHEADER, "1EBECCB4-0D69-40E2-BC6A-126404276D43");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CERPAROBIBOO.InitReportBox(BUK_CERPAROBIBOO_SEC_PAGEHEADER, BUK_CERPAROBIBOO_RPTBOX_TABELLA, 0, 0, 19000, 1000, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPTBOX_TABELLA, "A83092C3-96F7-48E8-A518-762E137232C7");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPTBOX_TABELLA, "TABELLA");
    BUK_CERPAROBIBOO.InitBoxSpan(BUK_CERPAROBIBOO_RPTBOX_TABELLA, BUK_CERPAROBIBOO_SPAN_TABELLA, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271319425, "", "Certificazione Parametri Obiettivi", 1);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SPAN_TABELLA, "66F79E49-54A0-456C-8462-B97928F5E458");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SPAN_TABELLA, "TABELLA");
    BUK_CERPAROBIBOO.InitSection(BUK_CERPAROBIBOO_RPT_NEWREPORT, BUK_CERPAROBIBOO_SEC_DETAIL, 1300, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CERPAROBIBOO.SetSectionRendersInto(BUK_CERPAROBIBOO_SEC_DETAIL, BUK_CERPAROBIBOO_RPTBOX_PAGEBODY);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SEC_DETAIL, "A06E5772-3C0E-4090-9C97-D5E8EBAFC235");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SEC_DETAIL, "DETAIL");
    BUK_CERPAROBIBOO.InitReportBox(BUK_CERPAROBIBOO_SEC_DETAIL, BUK_CERPAROBIBOO_RPTBOX_SI, 16600, 100, 700, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPTBOX_SI, "BE617056-B89F-4E94-A800-F78D8306B8DB");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPTBOX_SI, "SI");
    BUK_CERPAROBIBOO.InitBoxSpan(BUK_CERPAROBIBOO_RPTBOX_SI, BUK_CERPAROBIBOO_SPAN_SI, MyGlb.VIS_BOX, 0, 0, 0, 271384961, "", "SI", 1);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SPAN_SI, "D2BD7695-12D1-4B51-A0E8-E44AF3B73684");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SPAN_SI, "SI");
    BUK_CERPAROBIBOO.InitReportBox(BUK_CERPAROBIBOO_SEC_DETAIL, BUK_CERPAROBIBOO_RPTBOX_NO1, 17500, 100, 643, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPTBOX_NO1, "1BA68605-D5C1-4C28-AC2F-C4C298B8AF82");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPTBOX_NO1, "NO1");
    BUK_CERPAROBIBOO.InitBoxSpan(BUK_CERPAROBIBOO_RPTBOX_NO1, BUK_CERPAROBIBOO_SPAN_NO1, MyGlb.VIS_BOX, 0, 0, 0, 271384961, "", "NO", 1);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SPAN_NO1, "DBF7C571-0DBA-4612-A677-853A7A94E67B");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SPAN_NO1, "NO1");
    BUK_CERPAROBIBOO.InitReportBox(BUK_CERPAROBIBOO_SEC_DETAIL, BUK_CERPAROBIBOO_RPTBOX_X, 16600, 100, 700, 600, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "X", 1, -33);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPTBOX_X, "73E86FB9-1922-4C9D-A94B-6EF5D7B8ADA2");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPTBOX_X, "X");
    BUK_CERPAROBIBOO.InitBoxSpan(BUK_CERPAROBIBOO_RPTBOX_X, BUK_CERPAROBIBOO_SPAN_X, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271319425, "", "X", 1);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SPAN_X, "34F0A1F4-8457-4D0A-9E8E-6AD4F5972E20");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SPAN_X, "X");
    BUK_CERPAROBIBOO.InitReportBox(BUK_CERPAROBIBOO_SEC_DETAIL, BUK_CERPAROBIBOO_RPTBOX_CODICE, 100, 200, 600, 700, 0, 1, 1, MyGlb.VIS_NORGRAFONMAG, 983041, 375, "", 1, -33);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPTBOX_CODICE, "FF0BB2D7-38D3-4864-8E62-BD49F35FD051");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPTBOX_CODICE, "CODICE");
    BUK_CERPAROBIBOO.InitBoxSpan(BUK_CERPAROBIBOO_RPTBOX_CODICE, BUK_CERPAROBIBOO_SPAN_CODICE, MyGlb.VIS_NORGRAFONMAG, 5, 100, 0, 271319169, "", "", 1);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SPAN_CODICE, "717FCDD9-9756-4E6D-95C7-53AB643EA5A3");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SPAN_CODICE, "CODICE");
    BUK_CERPAROBIBOO.InitReportBox(BUK_CERPAROBIBOO_SEC_DETAIL, BUK_CERPAROBIBOO_RPTBOX_DESC, 800, 100, 15600, 1000, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPTBOX_DESC, "F74114B4-0B22-4F1B-9B7F-EF658824A410");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPTBOX_DESC, "DESC");
    BUK_CERPAROBIBOO.InitBoxSpan(BUK_CERPAROBIBOO_RPTBOX_DESC, BUK_CERPAROBIBOO_SPAN_DESCRIZIONE, MyGlb.VIS_DEFAREPOSTYL, 5, 2000, 0, 271319169, "", "::DESCRIZIONE", 1);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SPAN_DESCRIZIONE, "6F2DBE7A-3B19-402C-A63D-00B5F5915087");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CERPAROBIBOO.InitReportBox(BUK_CERPAROBIBOO_SEC_DETAIL, BUK_CERPAROBIBOO_RPTBOX_VAL, 18900, 1100, 100, 100, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_RPTBOX_VAL, "7F75AD91-5733-404E-A78B-B84B33202F0D");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_RPTBOX_VAL, "VAL");
    BUK_CERPAROBIBOO.InitBoxSpan(BUK_CERPAROBIBOO_RPTBOX_VAL, BUK_CERPAROBIBOO_SPAN_VAL, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271319169, "", "::VALORE", 1);
    BUK_CERPAROBIBOO.SetSpanValueListItem(BUK_CERPAROBIBOO_SPAN_VAL, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "", -1);
    BUK_CERPAROBIBOO.SetSpanValueListItem(BUK_CERPAROBIBOO_SPAN_VAL, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "", -1);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SPAN_VAL, "B772CF56-EB89-4162-9E90-E1AA4545F189");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SPAN_VAL, "VAL");
    BUK_CERPAROBIBOO.InitSection(BUK_CERPAROBIBOO_RPT_NEWREPORT, BUK_CERPAROBIBOO_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_CERPAROBIBOO.SetSectionRendersInto(BUK_CERPAROBIBOO_SEC_REPORTFOOTER, BUK_CERPAROBIBOO_RPTBOX_PAGEBODY);
    BUK_CERPAROBIBOO.SetRTCGuid(BUK_CERPAROBIBOO_SEC_REPORTFOOTER, "1177BB08-7122-4A3D-B09B-9B0CFA580046");
    BUK_CERPAROBIBOO.SetObjCode(BUK_CERPAROBIBOO_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CERPAROBIBOO_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CERPAROBIBOO_InitLinks()
  {
    BUK_CERPAROBIBOO.SetBoxNextBox(BUK_CERPAROBIBOO_RPTBOX_PAGEBODY, BUK_CERPAROBIBOO_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CERTPARAOBIE) PAN_CERTPARAOBIE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CERTPARAOBIE) PAN_CERTPARAOBIE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CERTPARAOBIE) PAN_CERTPARAOBIE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CERTPARAOBIE) PAN_CERTPARAOBIE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CERTPARAOBIE) PAN_CERTPARAOBIE_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CERTPARAOBIE) PAN_CERTPARAOBIE_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_CERTPARAOBIE) PAN_CERTPARAOBIE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CERPAROBIBOO) BUK_CERPAROBIBOO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CERPAROBIBOO) BUK_CERPAROBIBOO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CERPAROBIBOO) BUK_CERPAROBIBOO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CERPAROBIBOO) BUK_CERPAROBIBOO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CERPAROBIBOO) BUK_CERPAROBIBOO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CERPAROBIBOO) BUK_CERPAROBIBOO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CERPAROBIBOO) BUK_CERPAROBIBOO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CERPAROBIBOO) BUK_CERPAROBIBOO_OnPreview();
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
