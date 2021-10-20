// **********************************************
// Saldi Vincoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SaldiVincoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARASALDVINC_TIPOVISUSALD = 0;

  private static int PPQRY_IMDPARSALVI1 = 0;


  IDPanel PAN_PARASALDVINC;
  private static int PFL_SALDIVINCOLI_TIPOVINCOLO = 0;
  private static int PFL_SALDIVINCOLI_VINCOLDESCRI = 1;
  private static int PFL_SALDIVINCOLI_ESERCIZIO = 2;
  private static int PFL_SALDIVINCOLI_SALDINIZCASS = 3;
  private static int PFL_SALDIVINCOLI_SALDINIZTESO = 4;

  private static int PPQRY_SALDIVINCOLI = 0;

  private static int PPQRY_VINCOLI1 = 1;


  IDPanel PAN_SALDIVINCOLI;
  CIDREObj BUK_SALDVINCBOOK;
  OBook BKW_SALDVINCBOOK;
  //
  // Template Pages constants
  private static int BUK_SALDVINCBOOK_MST_SALVINBOOPAG = 1;
  private static int BUK_SALDVINCBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_SALDVINCBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_SALDVINCBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_SALDVINCBOOK_SPAN_TITOLO = 5;
  private static int BUK_SALDVINCBOOK_RPTBOX_PAGEBODY = 6;

  //
  // Reports constants
  private static int BUK_SALDVINCBOOK_RPT_NEWREPORT = 7;
  private static int BUK_SALDVINCBOOK_SEC_REPORTHEADER = 8;
  private static int BUK_SALDVINCBOOK_SEC_PAGEHEADER = 9;
  private static int BUK_SALDVINCBOOK_RPTBOX_CODICEHEADER = 10;
  private static int BUK_SALDVINCBOOK_SPAN_CODICE = 11;
  private static int BUK_SALDVINCBOOK_RPTBOX_DESCRIHEADER = 12;
  private static int BUK_SALDVINCBOOK_SPAN_DESCRIZIONE = 13;
  private static int BUK_SALDVINCBOOK_RPTBOX_SALINICASHEA = 14;
  private static int BUK_SALDVINCBOOK_SPAN_SALDINIZCASS = 15;
  private static int BUK_SALDVINCBOOK_RPTBOX_SALINITESHEA = 16;
  private static int BUK_SALDVINCBOOK_SPAN_SALDINIZTESO = 17;
  private static int BUK_SALDVINCBOOK_SEC_DETAIL = 18;
  private static int BUK_SALDVINCBOOK_RPTBOX_CODICE = 19;
  private static int BUK_SALDVINCBOOK_SPAN_VICOSAVISAVB = 20;
  private static int BUK_SALDVINCBOOK_RPTBOX_DESCRIZIONE = 21;
  private static int BUK_SALDVINCBOOK_SPAN_VIDESAVISAVB = 22;
  private static int BUK_SALDVINCBOOK_RPTBOX_SALDOINICASS = 23;
  private static int BUK_SALDVINCBOOK_SPAN_VISAINCSVSVB = 24;
  private static int BUK_SALDVINCBOOK_RPTBOX_SALDOINITESO = 25;
  private static int BUK_SALDVINCBOOK_SPAN_VISAINTSVSVB = 26;
  private static int BUK_SALDVINCBOOK_SEC_PAGEFOOTER = 27;
  private static int BUK_SALDVINCBOOK_SEC_REPORTFOOTER = 28;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDPARSALVIN(IMDB);
    //
    //
    Init_PQRY_IMDPARSALVI1(IMDB);
    Init_PQRY_IMDPARSALVI1_RS(IMDB);
    Init_PQRY_SALDIVINCOLI(IMDB);
    Init_PQRY_VINCOLI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDPARSALVIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_IMDPARSALVIN, 1);
    IMDB.set_TblCode(IMDBDef6.TBL_IMDPARSALVIN, "TBL_IMDPARSALVIN");
    IMDB.set_FldCode(IMDBDef6.TBL_IMDPARSALVIN,IMDBDef6.FLD_IMDPARSALVIN_NOMOGGTIVISA, "NOMOGGTIVISA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDPARSALVIN,IMDBDef6.FLD_IMDPARSALVIN_NOMOGGTIVISA,5,50,0);
    IMDB.TblAddNew(IMDBDef6.TBL_IMDPARSALVIN, 0);
  }

  private static void Init_PQRY_IMDPARSALVI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_IMDPARSALVI1, 1);
    IMDB.set_TblCode(IMDBDef16.PQRY_IMDPARSALVI1, "PQRY_IMDPARSALVI1");
    IMDB.set_FldCode(IMDBDef16.PQRY_IMDPARSALVI1,IMDBDef16.PQSL_IMDPARSALVI1_NOMOGGTIVISA, "NOMOGGTIVISA");
    IMDB.SetFldParams(IMDBDef16.PQRY_IMDPARSALVI1,IMDBDef16.PQSL_IMDPARSALVI1_NOMOGGTIVISA,5,50,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_IMDPARSALVI1, 0);
  }

  private static void Init_PQRY_IMDPARSALVI1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_IMDPARSALVI1_RS, 1);
    IMDB.set_TblCode(IMDBDef16.PQRY_IMDPARSALVI1_RS, "PQRY_IMDPARSALVI1_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_IMDPARSALVI1_RS,IMDBDef16.PQSL_IMDPARSALVI1_NOMOGGTIVISA, "NOMOGGTIVISA");
    IMDB.SetFldParams(IMDBDef16.PQRY_IMDPARSALVI1_RS,IMDBDef16.PQSL_IMDPARSALVI1_NOMOGGTIVISA,5,50,0);
  }

  private static void Init_PQRY_SALDIVINCOLI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_SALDIVINCOLI, 4);
    IMDB.set_TblCode(IMDBDef16.PQRY_SALDIVINCOLI, "PQRY_SALDIVINCOLI");
    IMDB.set_FldCode(IMDBDef16.PQRY_SALDIVINCOLI,IMDBDef16.PQSL_SALDIVINCOLI_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_SALDIVINCOLI,IMDBDef16.PQSL_SALDIVINCOLI_TIPO_VINCOLO,1,7,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SALDIVINCOLI,IMDBDef16.PQSL_SALDIVINCOLI_SALDO_INI_CASSA, "SALDO_INI_CASSA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SALDIVINCOLI,IMDBDef16.PQSL_SALDIVINCOLI_SALDO_INI_CASSA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_SALDIVINCOLI,IMDBDef16.PQSL_SALDIVINCOLI_SALDO_INI_TESORERIA, "SALDO_INI_TESORERIA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SALDIVINCOLI,IMDBDef16.PQSL_SALDIVINCOLI_SALDO_INI_TESORERIA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_SALDIVINCOLI,IMDBDef16.PQSL_SALDIVINCOLI_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef16.PQRY_SALDIVINCOLI,IMDBDef16.PQSL_SALDIVINCOLI_ESERCIZIO,1,4,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_SALDIVINCOLI, 0);
  }

  private static void Init_PQRY_VINCOLI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_VINCOLI, 8);
    IMDB.set_TblCode(IMDBDef16.PQRY_VINCOLI, "PQRY_VINCOLI");
    IMDB.set_FldCode(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_CODICE,1,7,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_SALDO_INI_CASSA, "SALDO_INI_CASSA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_SALDO_INI_CASSA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_SALDO_INI_TESORERIA, "SALDO_INI_TESORERIA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_SALDO_INI_TESORERIA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef16.PQRY_VINCOLI,IMDBDef16.PQSL_VINCOLI_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_VINCOLI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SaldiVincoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public SaldiVincoli()
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
    FormIdx = MyGlb.FRM_SALDIVINCOLI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D247B5A4-B7E0-4D4A-A55D-A496FFF18627";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 712;
    DesignHeight = 406;
    set_Caption(new IDVariant("Saldi Vincoli"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 712;
    Frames[1].Height = 380;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.147368;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 712;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Saldi Vincoli";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARASALDVINC = new IDPanel(w, this, 2, "PAN_PARASALDVINC");
    Frames[2].Content = PAN_PARASALDVINC;
    PAN_PARASALDVINC.ShowRowSelector = false;
    PAN_PARASALDVINC.ShowToolbar = false;
    PAN_PARASALDVINC.ShowStatusbar = false;
    PAN_PARASALDVINC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARASALDVINC.VS = MainFrm.VisualStyleList;
    PAN_PARASALDVINC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARASALDVINC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "86F0531E-E74C-4C79-9743-3B5F865F4FF3");
    PAN_PARASALDVINC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 16, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARASALDVINC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARASALDVINC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARASALDVINC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARASALDVINC.InitStatus = 1;
    PAN_PARASALDVINC_Init();
    PAN_PARASALDVINC_InitFields();
    PAN_PARASALDVINC_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 712;
    Frames[3].Height = 324;
    Frames[3].Caption = "Saldi Vincoli";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 324;
    PAN_SALDIVINCOLI = new IDPanel(w, this, 3, "PAN_SALDIVINCOLI");
    Frames[3].Content = PAN_SALDIVINCOLI;
    PAN_SALDIVINCOLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SALDIVINCOLI.VS = MainFrm.VisualStyleList;
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 324-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SALDIVINCOLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B260D383-C11A-416B-AB02-F09BF21F4C07");
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 656, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SALDIVINCOLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SALDIVINCOLI.InitStatus = 2;
    PAN_SALDIVINCOLI_Init();
    PAN_SALDIVINCOLI_InitFields();
    PAN_SALDIVINCOLI_InitQueries();
    BKW_SALDVINCBOOK = new OBook(this);
    BUK_SALDVINCBOOK = new CIDREObj(BKW_SALDVINCBOOK);
    BKW_SALDVINCBOOK.iGuid = "33DD2D1B-6334-4476-A158-656B62D03F0D";
    BKW_SALDVINCBOOK.Code = "BUK_SALDVINCBOOK";
    BKW_SALDVINCBOOK.BookObj = BUK_SALDVINCBOOK;
    BKW_SALDVINCBOOK.InitDefMasks();
    BUK_SALDVINCBOOK.InitBook(1, 3342337, "Saldi Vincoli Book", IMDB, MainFrm.VisualStyleList);
    BUK_SALDVINCBOOK.InitHTML();
    BUK_SALDVINCBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SALDVINCBOOK.Book.SetMainFrm(MainFrm);
    BUK_SALDVINCBOOK.SetRTCGuid(0, "33DD2D1B-6334-4476-A158-656B62D03F0D");
    BUK_SALDVINCBOOK.SetObjCode(0, "SALDVINCBOOK");
    BUK_SALDVINCBOOK_MST_SALVINBOOPAG_Init();
    BUK_SALDVINCBOOK_RPT_NEWREPORT_Init();
    BUK_SALDVINCBOOK_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_STAMPA7+BaseCmdLinIdx)
      {
        StampaSaldiVincoli();
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
      if (IMDB.TblModified(IMDBDef6.TBL_IMDPARSALVIN, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SALDIVINCOLI_IMDPARSALVI1();
      }
      PAN_PARASALDVINC.UpdatePanel(MainFrm);
      PAN_SALDIVINCOLI.UpdatePanel(MainFrm);
      // BUK_SALDVINCBOOK.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAVINCOL && flRis && IdxPanelActived == PAN_SALDIVINCOLI.FrIndex)
    {
      if (IdxFieldActived ==PFL_SALDIVINCOLI_TIPOVINCOLO) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_SALDVINCBOOK")) return BUK_SALDVINCBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SaldiVincoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SaldiVincoli.class.getName() : (Glb.ClassWithPackage(SaldiVincoli.class) ? SaldiVincoli.class.getName().substring(SaldiVincoli.class.getPackage().getName().length() + 1) : SaldiVincoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Saldi Vincoli On Database Error Event
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
  private void PAN_SALDIVINCOLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_SALDIVINCOLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Saldi Vincoli On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiVincoli", "SaldiVincoliOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Saldi Vincoli On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SALDIVINCOLI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SALDIVINCOLI);
      // 
      // Saldi Vincoli On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SALDIVINCOLI.set_ToolTip(Glb.OBJ_FIELD,PFL_SALDIVINCOLI_VINCOLDESCRI,(new IDVariant(PAN_SALDIVINCOLI.FieldText(PFL_SALDIVINCOLI_VINCOLDESCRI))).stringValue()); 
      if (PAN_SALDIVINCOLI.IsNewRow())
      {
        PAN_SALDIVINCOLI.SetFlags (Glb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SALDIVINCOLI.SetFlags (Glb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SALDIVINCOLI.SetFlags (Glb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SALDIVINCOLI.SetFlags (Glb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiVincoli", "SaldiVincoliOnDynamicPropertiesEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_IMDPARSALVIN, IMDBDef6.FLD_IMDPARSALVIN_NOMOGGTIVISA, 0, (new IDVariant("E")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiVincoli", "Load", _e);
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
      UNLOAD_IMDPARSAVIDE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiVincoli", "Unload", _e);
    }
  }

  // **********************************************************************
  // Imdb Parametri Saldi Vincoli: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDPARSAVIDE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_IMDPARSALVIN, IMDBDef6.FLD_IMDPARSALVIN_NOMOGGTIVISA, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAVINCOL)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_SALDIVINCOLI, IMDBDef16.PQSL_SALDIVINCOLI_TIPO_VINCOLO, 0, IMDB.Value(IMDBDef7.PQRY_VINCOLI2, IMDBDef7.PQSL_VINCOLI2_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiVincoli", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Apri Scelta Vincolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriSceltaVincolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Vincolo Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_SCELTAVINCOL, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_SCELTAVINCOL,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI162, IMDBDef1.FLD_PARAMETRI162_PARADATASCAD, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI162, IMDBDef1.FLD_PARAMETRI162_PARANASCPARA, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTAVINCOL, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiVincoli", "ApriSceltaVincolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Saldi Vincoli
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int StampaSaldiVincoli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Saldi Vincoli Body
      // Corpo Procedura
      // 
      IDVariant v_VNOMEREPORT = new IDVariant(0,IDVariant.STRING);
      v_VNOMEREPORT = (new IDVariant("Saldi_Vincoli"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_VISUALIZZAZIONE")), IMDB.Value(IMDBDef16.PQRY_IMDPARSALVI1, IMDBDef16.PQSL_IMDPARSALVI1_NOMOGGTIVISA, 0));
      MainFrm.LanciaStampaJasper(v_VNOMEREPORT, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiVincoli", "StampaSaldiVincoli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imdb Parametri Saldi Vincoli
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SALDIVINCOLI_IMDPARSALVI1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_IMDPARSALVI1_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_IMDPARSALVIN, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_IMDPARSALVIN, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_IMDPARSALVI1_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_IMDPARSALVI1_RS, 0, IMDBDef6.TBL_IMDPARSALVIN, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_IMDPARSALVI1_RS, 0, 0, IMDBDef6.TBL_IMDPARSALVIN, IMDBDef6.FLD_IMDPARSALVIN_NOMOGGTIVISA, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_IMDPARSALVIN, 0);
      if (IMDB.Eof(IMDBDef6.TBL_IMDPARSALVIN, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_IMDPARSALVIN, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_IMDPARSALVI1_RS, 0);
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
  private void PAN_PARASALDVINC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARASALDVINC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARASALDVINC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARASALDVINC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARASALDVINC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARASALDVINC);
    // Stub
  }

  private void PAN_PARASALDVINC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARASALDVINC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARASALDVINC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARASALDVINC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SALDIVINCOLI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SALDIVINCOLI, Cancel);
    // Stub
  }

  private void PAN_SALDIVINCOLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SALDIVINCOLI_TIPOVINCOLO)
    {
      this.IdxPanelActived = this.PAN_SALDIVINCOLI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaVincolo();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SALDIVINCOLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SALDIVINCOLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SALDIVINCOLI, IMDBDef16.PQSL_SALDIVINCOLI_SALDO_INI_CASSA, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_SALDIVINCOLI, IMDBDef16.PQSL_SALDIVINCOLI_SALDO_INI_CASSA, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SALDIVINCOLI, IMDBDef16.PQSL_SALDIVINCOLI_SALDO_INI_TESORERIA, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_SALDIVINCOLI, IMDBDef16.PQSL_SALDIVINCOLI_SALDO_INI_TESORERIA, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_SALDIVINCOLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_SALDVINCBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SALDVINCBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SALDVINCBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_SALDVINCBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_SALDVINCBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_SALDVINCBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_SALDVINCBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_SALDVINCBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SALDVINCBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SALDVINCBOOK_MST_SALVINBOOPAG)
    {
      BUK_SALDVINCBOOK.set_SpanValue(BUK_SALDVINCBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_SALDVINCBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_SALDVINCBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_SALDVINCBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SALDVINCBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SALDVINCBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SALDVINCBOOK_OnPreview()
  {
    PreviewBook = BKW_SALDVINCBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARASALDVINC_Init()
  {

    PAN_PARASALDVINC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARASALDVINC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARASALDVINC.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARASALDVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, "D4DF9047-4C64-4D37-BCA9-F462BBAE6F55");
    PAN_PARASALDVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, "Visualizza Saldi");
    PAN_PARASALDVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, "");
    PAN_PARASALDVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARASALDVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARASALDVINC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARASALDVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARASALDVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_LIST, 152);
    PAN_PARASALDVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_LIST, 1);
    PAN_PARASALDVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_LIST, "Visualizza Saldi");
    PAN_PARASALDVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_FORM, 12, 16, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARASALDVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_FORM, 104);
    PAN_PARASALDVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_FORM, 1);
    PAN_PARASALDVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_FORM, "Visualizza Saldi");
    PAN_PARASALDVINC.SetFieldPage(PFL_PARASALDVINC_TIPOVISUSALD, -1, -1);
    PAN_PARASALDVINC.SetFieldPanel(PFL_PARASALDVINC_TIPOVISUSALD, PPQRY_IMDPARSALVI1, "A.NOMOGGTIVISA", "NOMOGGTIVISA", 5, 50, 0, -13997);
    PAN_PARASALDVINC.SetValueListItem(PFL_PARASALDVINC_TIPOVISUSALD, (new IDVariant("E")), "Esercizio più recente", "", "", -1);
    PAN_PARASALDVINC.SetValueListItem(PFL_PARASALDVINC_TIPOVISUSALD, (new IDVariant("T")), "Tutti gli Esercizi", "", "", -1);
  }

  private void PAN_PARASALDVINC_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARASALDVINC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARASALDVINC.SetIMDB(IMDB, "PQRY_IMDPARSALVI1", true);
    PAN_PARASALDVINC.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARASALDVINC.SetQueryIMDB(PPQRY_IMDPARSALVI1, IMDBDef16.PQRY_IMDPARSALVI1_RS, IMDBDef6.TBL_IMDPARSALVIN);
    JustLoaded = true;
    PAN_PARASALDVINC.SetFieldPrimaryIndex(PFL_PARASALDVINC_TIPOVISUSALD, IMDBDef6.FLD_IMDPARSALVIN_NOMOGGTIVISA);
    PAN_PARASALDVINC.SetMasterTable(0, "IMDPARSALVIN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARASALDVINC.Status() == 2)
    {
      int oldListQBE = PAN_PARASALDVINC.iUseListQBE;
      PAN_PARASALDVINC.iUseListQBE = 0;
      PAN_PARASALDVINC.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARASALDVINC.PanelCommand(Glb.PCM_FIND);
      PAN_PARASALDVINC.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SALDIVINCOLI_Init()
  {

    PAN_SALDIVINCOLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SALDIVINCOLI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SALDIVINCOLI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_SALDIVINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, "63658051-1551-45A4-876F-101325A3EF20");
    PAN_SALDIVINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, "Codice");
    PAN_SALDIVINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, "");
    PAN_SALDIVINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SALDIVINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISKEY, -1);
    PAN_SALDIVINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, "31F03B5C-0B94-4BC9-A03F-D15E7F31D194");
    PAN_SALDIVINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, "Descrizione");
    PAN_SALDIVINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, "");
    PAN_SALDIVINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_SALDIVINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_SALDIVINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, "C70D82CD-15C8-479C-AF04-DBAB7DD60688");
    PAN_SALDIVINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, "Esercizio");
    PAN_SALDIVINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, "");
    PAN_SALDIVINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SALDIVINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_SALDIVINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, "6FF7A65E-890F-4ED8-A470-38AF99FC8374");
    PAN_SALDIVINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, "Saldo Iniziale Cassa");
    PAN_SALDIVINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, "");
    PAN_SALDIVINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SALDIVINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SALDIVINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, "05D7D38A-57FA-4594-9DA8-8F0689C2F056");
    PAN_SALDIVINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, "Saldo Iniziale Tesoreria");
    PAN_SALDIVINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, "");
    PAN_SALDIVINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SALDIVINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SALDIVINCOLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, MyGlb.PANEL_LIST, 88);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, MyGlb.PANEL_LIST, "Codice");
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, MyGlb.PANEL_FORM, 124, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, MyGlb.PANEL_FORM, 48);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_TIPOVINCOLO, MyGlb.PANEL_FORM, "Codice");
    PAN_SALDIVINCOLI.SetFieldPage(PFL_SALDIVINCOLI_TIPOVINCOLO, -1, -1);
    PAN_SALDIVINCOLI.SetFieldPanel(PFL_SALDIVINCOLI_TIPOVINCOLO, PPQRY_SALDIVINCOLI, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 7, 0, -13997);
    PAN_SALDIVINCOLI.set_Alignment(PFL_SALDIVINCOLI_TIPOVINCOLO, 2);
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, MyGlb.PANEL_LIST, 88, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, MyGlb.PANEL_LIST, 132);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, MyGlb.PANEL_FORM, 256, 36, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, MyGlb.PANEL_FORM, 132);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_VINCOLDESCRI, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SALDIVINCOLI.SetFieldPage(PFL_SALDIVINCOLI_VINCOLDESCRI, -1, -1);
    PAN_SALDIVINCOLI.SetFieldPanel(PFL_SALDIVINCOLI_VINCOLDESCRI, PPQRY_VINCOLI1, "A.DESCRIZIONE", "VINCOLDESCRI", 5, 50, 0, -13997);
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, MyGlb.PANEL_LIST, 348, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, MyGlb.PANEL_FORM, 112, 60, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_SALDIVINCOLI.SetFieldPage(PFL_SALDIVINCOLI_ESERCIZIO, -1, -1);
    PAN_SALDIVINCOLI.SetFieldPanel(PFL_SALDIVINCOLI_ESERCIZIO, PPQRY_SALDIVINCOLI, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, MyGlb.PANEL_LIST, 416, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, MyGlb.PANEL_LIST, 96);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, MyGlb.PANEL_LIST, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, MyGlb.PANEL_LIST, "Saldo Iniziale Cassa");
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, MyGlb.PANEL_FORM, 48, 84, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, MyGlb.PANEL_FORM, 124);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, MyGlb.PANEL_FORM, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZCASS, MyGlb.PANEL_FORM, "Saldo Iniziale Cassa");
    PAN_SALDIVINCOLI.SetFieldPage(PFL_SALDIVINCOLI_SALDINIZCASS, -1, -1);
    PAN_SALDIVINCOLI.SetFieldPanel(PFL_SALDIVINCOLI_SALDINIZCASS, PPQRY_SALDIVINCOLI, "A.SALDO_INI_CASSA", "SALDO_INI_CASSA", 3, 14, 2, -13997);
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, MyGlb.PANEL_LIST, 536, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, MyGlb.PANEL_LIST, 120);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, MyGlb.PANEL_LIST, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, MyGlb.PANEL_LIST, "Saldo Iniziale Tesoreria");
    PAN_SALDIVINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, MyGlb.PANEL_FORM, 28, 108, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDIVINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, MyGlb.PANEL_FORM, 144);
    PAN_SALDIVINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, MyGlb.PANEL_FORM, 1);
    PAN_SALDIVINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDIVINCOLI_SALDINIZTESO, MyGlb.PANEL_FORM, "Saldo Iniziale Tesoreria");
    PAN_SALDIVINCOLI.SetFieldPage(PFL_SALDIVINCOLI_SALDINIZTESO, -1, -1);
    PAN_SALDIVINCOLI.SetFieldPanel(PFL_SALDIVINCOLI_SALDINIZTESO, PPQRY_SALDIVINCOLI, "A.SALDO_INI_TESORERIA", "SALDO_INI_TESORERIA", 3, 14, 2, -13997);
  }

  private void PAN_SALDIVINCOLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SALDIVINCOLI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    PAN_SALDIVINCOLI.SetQuery(PPQRY_VINCOLI1, 0, SQL, -1, "");
    PAN_SALDIVINCOLI.SetQueryDB(PPQRY_VINCOLI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SALDIVINCOLI.SetMasterTable(PPQRY_VINCOLI1, "VINCOLI");
    PAN_SALDIVINCOLI.SetIMDB(IMDB, "PQRY_SALDIVINCOLI", true);
    PAN_SALDIVINCOLI.set_SetString(MyGlb.MASTER_ROWNAME, "VINCOLI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.SALDO_INI_CASSA as SALDO_INI_CASSA, ");
    SQL.append("  A.SALDO_INI_TESORERIA as SALDO_INI_TESORERIA, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO ");
    PAN_SALDIVINCOLI.SetQuery(PPQRY_SALDIVINCOLI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  SALDI_VINCOLI A ");
    PAN_SALDIVINCOLI.SetQuery(PPQRY_SALDIVINCOLI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NVL(A.TIPO_VINCOLO, 0) <> 0) ");
    SQL.append("and   (~~PQRY_IMDPARSALVI1.NOMOGGTIVISA~~ = 'T' OR (~~PQRY_IMDPARSALVI1.NOMOGGTIVISA~~ = 'E' AND A.ESERCIZIO <= ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  '1' ");
    SQL.append("from ");
    SQL.append("  SALDI_VINCOLI sv2 ");
    SQL.append("where (sv2.TIPO_VINCOLO = A.TIPO_VINCOLO) ");
    SQL.append("and   (NVL(sv2.TIPO_VINCOLO, 0) <> 0) ");
    SQL.append("and   (sv2.ESERCIZIO <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (sv2.ESERCIZIO > A.ESERCIZIO) ");
    SQL.append("))))) ");
    PAN_SALDIVINCOLI.SetQuery(PPQRY_SALDIVINCOLI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SALDIVINCOLI.SetQuery(PPQRY_SALDIVINCOLI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SALDIVINCOLI.SetQuery(PPQRY_SALDIVINCOLI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPO_VINCOLO, ");
    SQL.append("  A.ESERCIZIO desc ");
    PAN_SALDIVINCOLI.SetQuery(PPQRY_SALDIVINCOLI, 5, SQL, -1, "");
    PAN_SALDIVINCOLI.SetQueryDB(PPQRY_SALDIVINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SALDIVINCOLI.SetMasterTable(0, "SALDI_VINCOLI");
    PAN_SALDIVINCOLI.AddToSortList(PFL_SALDIVINCOLI_TIPOVINCOLO, true);
    PAN_SALDIVINCOLI.AddToSortList(PFL_SALDIVINCOLI_ESERCIZIO, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SALDIVINCOLI.Status() == 2)
    {
      int oldListQBE = PAN_SALDIVINCOLI.iUseListQBE;
      PAN_SALDIVINCOLI.iUseListQBE = 0;
      PAN_SALDIVINCOLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SALDIVINCOLI.PanelCommand(Glb.PCM_FIND);
      PAN_SALDIVINCOLI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_SALDVINCBOOK_MST_SALVINBOOPAG_Init()
  {
    BUK_SALDVINCBOOK.InitMastro(BUK_SALDVINCBOOK_MST_SALVINBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_MST_SALVINBOOPAG, "6B9B5615-3FBF-4DEC-87C6-D93B0B66B54E");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_MST_SALVINBOOPAG, "SALVINBOOPAG");
    BUK_SALDVINCBOOK.InitMastroBox(BUK_SALDVINCBOOK_MST_SALVINBOOPAG, BUK_SALDVINCBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_NUMEROPAGINA, "3DBF31DD-5E37-403C-9BFA-EB8E7610B790");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_NUMEROPAGINA, BUK_SALDVINCBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_NUMEROPAGINA, "4B0D2BD1-B7FE-4390-9778-0DDF7FC2E750");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SALDVINCBOOK.InitMastroBox(BUK_SALDVINCBOOK_MST_SALVINBOOPAG, BUK_SALDVINCBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_PAGEHEADER, "487CD05A-6F0C-4377-A30C-A86445ACB240");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_PAGEHEADER, BUK_SALDVINCBOOK_SPAN_TITOLO, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Saldi Vincoli", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_TITOLO, "54809587-BAEB-4EB4-8C9A-5BEFEDE5163B");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_TITOLO, "TITOLO");
    BUK_SALDVINCBOOK.InitMastroBox(BUK_SALDVINCBOOK_MST_SALVINBOOPAG, BUK_SALDVINCBOOK_RPTBOX_PAGEBODY, 1000, 2400, 19000, 26000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_PAGEBODY, "90CFD079-879D-49C9-BE4C-159A6B1956B6");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_SALDVINCBOOK_RPT_NEWREPORT_InitQuery() { BUK_SALDVINCBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_SALDVINCBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.SALDO_INI_CASSA as SALDO_INI_CASSA, ");
      SQL.append("  A.SALDO_INI_TESORERIA as SALDO_INI_TESORERIA, ");
      SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
      SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
      SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
      SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
      SQL.append("from ");
      SQL.append("  VINCOLI A ");
      SQL.append("where (A.CODICE > 0) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_SALDVINCBOOK.SetReportQuery(BUK_SALDVINCBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "2CA1E6AB-7916-4769-8CD9-4FF67976C184");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SALDVINCBOOK_RPT_NEWREPORT_Init()
  {
    BUK_SALDVINCBOOK.InitReport(BUK_SALDVINCBOOK_RPT_NEWREPORT, 196609);
    BUK_SALDVINCBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPT_NEWREPORT, "8B81027E-1555-4A83-AB74-341FB8D7F683");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_SALDVINCBOOK.InitSection(BUK_SALDVINCBOOK_RPT_NEWREPORT, BUK_SALDVINCBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SALDVINCBOOK.SetSectionRendersInto(BUK_SALDVINCBOOK_SEC_REPORTHEADER, BUK_SALDVINCBOOK_RPTBOX_PAGEBODY);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SEC_REPORTHEADER, "046B3126-C044-4334-8025-CE15F4C7A4AB");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_SALDVINCBOOK.InitSection(BUK_SALDVINCBOOK_RPT_NEWREPORT, BUK_SALDVINCBOOK_SEC_PAGEHEADER, 700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SALDVINCBOOK.SetSectionRendersInto(BUK_SALDVINCBOOK_SEC_PAGEHEADER, BUK_SALDVINCBOOK_RPTBOX_PAGEBODY);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SEC_PAGEHEADER, "CB269DD1-694E-4A7A-92DC-F541E246A939");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_SALDVINCBOOK.InitReportBox(BUK_SALDVINCBOOK_SEC_PAGEHEADER, BUK_SALDVINCBOOK_RPTBOX_CODICEHEADER, 0, 0, 1337, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_CODICEHEADER, "F3E90C81-80C3-4898-A8A0-C6A7318FDE30");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_CODICEHEADER, BUK_SALDVINCBOOK_SPAN_CODICE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_CODICE, "DBAF425A-2E2D-4D4F-AB94-940538B221FF");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_CODICE, "CODICE");
    BUK_SALDVINCBOOK.InitReportBox(BUK_SALDVINCBOOK_SEC_PAGEHEADER, BUK_SALDVINCBOOK_RPTBOX_DESCRIHEADER, 1400, 0, 9100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_DESCRIHEADER, "C1ED5539-A5D4-459C-AFC6-543EB64EF676");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_DESCRIHEADER, BUK_SALDVINCBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_DESCRIZIONE, "5A427D43-837F-45CC-9623-229BC795894B");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_SALDVINCBOOK.InitReportBox(BUK_SALDVINCBOOK_SEC_PAGEHEADER, BUK_SALDVINCBOOK_RPTBOX_SALINICASHEA, 10600, 0, 3788, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_SALINICASHEA, "1A5AB394-DD10-422E-90CA-87E1B7492D33");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_SALINICASHEA, "SALINICASHEA");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_SALINICASHEA, BUK_SALDVINCBOOK_SPAN_SALDINIZCASS, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Saldo Iniziale Cassa", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_SALDINIZCASS, "66D98086-B918-4CD8-8BCC-E621BD9A92B2");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_SALDINIZCASS, "SALDINIZCASS");
    BUK_SALDVINCBOOK.InitReportBox(BUK_SALDVINCBOOK_SEC_PAGEHEADER, BUK_SALDVINCBOOK_RPTBOX_SALINITESHEA, 14500, 0, 3788, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_SALINITESHEA, "0711845A-5543-41D7-BB41-CFFFFD1D34B9");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_SALINITESHEA, "SALINITESHEA");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_SALINITESHEA, BUK_SALDVINCBOOK_SPAN_SALDINIZTESO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Saldo Iniziale Tesoreria", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_SALDINIZTESO, "25E03516-C000-4507-B5C7-B769478473D3");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_SALDINIZTESO, "SALDINIZTESO");
    BUK_SALDVINCBOOK.InitSection(BUK_SALDVINCBOOK_RPT_NEWREPORT, BUK_SALDVINCBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SALDVINCBOOK.SetSectionRendersInto(BUK_SALDVINCBOOK_SEC_DETAIL, BUK_SALDVINCBOOK_RPTBOX_PAGEBODY);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SEC_DETAIL, "1D101992-0DF8-4F8F-9D5D-CC2A8295A8FF");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SEC_DETAIL, "DETAIL");
    BUK_SALDVINCBOOK.InitReportBox(BUK_SALDVINCBOOK_SEC_DETAIL, BUK_SALDVINCBOOK_RPTBOX_CODICE, 0, 0, 1300, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_CODICE, "CC19CE01-6615-418F-B4B2-9ACB731D09CD");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_CODICE, "CODICE");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_CODICE, BUK_SALDVINCBOOK_SPAN_VICOSAVISAVB, MyGlb.VIS_CAMSENBORCEN, 1, 7, 0, 271384961, "", "::CODICE", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_VICOSAVISAVB, "3C13E8C7-4399-43F0-9D67-C7112DDC843F");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_VICOSAVISAVB, "VICOSAVISAVB");
    BUK_SALDVINCBOOK.InitReportBox(BUK_SALDVINCBOOK_SEC_DETAIL, BUK_SALDVINCBOOK_RPTBOX_DESCRIZIONE, 1400, 0, 9100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_DESCRIZIONE, "94B4F95C-6DBC-4DAE-9981-2C88E7815097");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_DESCRIZIONE, BUK_SALDVINCBOOK_SPAN_VIDESAVISAVB, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384961, "", "::DESCRIZIONE", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_VIDESAVISAVB, "FA0372CC-95FC-45D1-BBB0-40A5C8AF6857");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_VIDESAVISAVB, "VIDESAVISAVB");
    BUK_SALDVINCBOOK.InitReportBox(BUK_SALDVINCBOOK_SEC_DETAIL, BUK_SALDVINCBOOK_RPTBOX_SALDOINICASS, 10600, 0, 3700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_SALDOINICASS, "D5B4C6D1-EF8B-419D-9093-D5456F60866A");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_SALDOINICASS, "SALDOINICASS");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_SALDOINICASS, BUK_SALDVINCBOOK_SPAN_VISAINCSVSVB, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::SALDO_INI_CASSA", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_VISAINCSVSVB, "56D3FFDE-E926-4E19-A9AC-C2047266EA1D");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_VISAINCSVSVB, "VISAINCSVSVB");
    BUK_SALDVINCBOOK.InitReportBox(BUK_SALDVINCBOOK_SEC_DETAIL, BUK_SALDVINCBOOK_RPTBOX_SALDOINITESO, 14500, 0, 3788, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_RPTBOX_SALDOINITESO, "586513D3-B928-4578-BE62-5EFBF891C869");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_RPTBOX_SALDOINITESO, "SALDOINITESO");
    BUK_SALDVINCBOOK.InitBoxSpan(BUK_SALDVINCBOOK_RPTBOX_SALDOINITESO, BUK_SALDVINCBOOK_SPAN_VISAINTSVSVB, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::SALDO_INI_TESORERIA", 1);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SPAN_VISAINTSVSVB, "277EBED2-E7A3-4F59-8C42-9E14894A466E");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SPAN_VISAINTSVSVB, "VISAINTSVSVB");
    BUK_SALDVINCBOOK.InitSection(BUK_SALDVINCBOOK_RPT_NEWREPORT, BUK_SALDVINCBOOK_SEC_PAGEFOOTER, 100, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SALDVINCBOOK.SetSectionRendersInto(BUK_SALDVINCBOOK_SEC_PAGEFOOTER, BUK_SALDVINCBOOK_RPTBOX_PAGEBODY);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SEC_PAGEFOOTER, "8873E663-E28D-4B09-B461-5DE566A1302A");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_SALDVINCBOOK.InitSection(BUK_SALDVINCBOOK_RPT_NEWREPORT, BUK_SALDVINCBOOK_SEC_REPORTFOOTER, 100, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SALDVINCBOOK.SetSectionRendersInto(BUK_SALDVINCBOOK_SEC_REPORTFOOTER, BUK_SALDVINCBOOK_RPTBOX_PAGEBODY);
    BUK_SALDVINCBOOK.SetRTCGuid(BUK_SALDVINCBOOK_SEC_REPORTFOOTER, "0B958EE8-0FEB-43D3-9348-8464138A1E2B");
    BUK_SALDVINCBOOK.SetObjCode(BUK_SALDVINCBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_SALDVINCBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_SALDVINCBOOK_InitLinks()
  {
    BUK_SALDVINCBOOK.SetBoxNextBox(BUK_SALDVINCBOOK_RPTBOX_PAGEBODY, BUK_SALDVINCBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SALDIVINCOLI) PAN_SALDIVINCOLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_ValidateRow(Cancel);
    if (SrcObj == PAN_SALDIVINCOLI) PAN_SALDIVINCOLI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_DynamicProperties();
    if (SrcObj == PAN_SALDIVINCOLI) PAN_SALDIVINCOLI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SALDIVINCOLI) PAN_SALDIVINCOLI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SALDIVINCOLI) PAN_SALDIVINCOLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_SALDVINCBOOK) BUK_SALDVINCBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_SALDVINCBOOK) BUK_SALDVINCBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_SALDVINCBOOK) BUK_SALDVINCBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_SALDVINCBOOK) BUK_SALDVINCBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_SALDVINCBOOK) BUK_SALDVINCBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_SALDVINCBOOK) BUK_SALDVINCBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_SALDVINCBOOK) BUK_SALDVINCBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_SALDVINCBOOK) BUK_SALDVINCBOOK_OnPreview();
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
