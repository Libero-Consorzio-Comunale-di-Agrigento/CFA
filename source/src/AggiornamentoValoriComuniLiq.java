// **********************************************
// Aggiornamento Valori Comuni Liq
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoValoriComuniLiq extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VALORCOMULIQ_DIVERSBENEFI = 0;
  private static int GRP_VALORCOMULIQ_CONTABILE = 1;
  private static int GRP_VALORCOMULIQ_CIG = 2;
  private static int GRP_VALORCOMULIQ_ESCLUSIONCIG = 3;

  private static int PFL_VALORCOMULIQ_INTESTALABEL = 0;
  private static int PFL_VALORCOMULIQ_CKDIVERSOBEN = 1;
  private static int PFL_VALORCOMULIQ_CODICDIVEBEN = 2;
  private static int PFL_VALORCOMULIQ_BENBENEFICIA = 3;
  private static int PFL_VALORCOMULIQ_SELEZISOGGET = 4;
  private static int PFL_VALORCOMULIQ_NUMQTNDIVBEN = 5;
  private static int PFL_VALORCOMULIQ_T02DESCRIZIO = 6;
  private static int PFL_VALORCOMULIQ_INEMISSIONE = 7;
  private static int PFL_VALORCOMULIQ_CKCONTABILE = 8;
  private static int PFL_VALORCOMULIQ_NUMEROCONTAB = 9;
  private static int PFL_VALORCOMULIQ_DATACONTABIL = 10;
  private static int PFL_VALORCOMULIQ_NUMECONTLABE = 11;
  private static int PFL_VALORCOMULIQ_DATACONTLABE = 12;
  private static int PFL_VALORCOMULIQ_LABELDX = 13;
  private static int PFL_VALORCOMULIQ_CKCIG = 14;
  private static int PFL_VALORCOMULIQ_CIG = 15;
  private static int PFL_VALORCOMULIQ_CKESCLUSICIG = 16;
  private static int PFL_VALORCOMULIQ_ESCLUSIONCIG = 17;
  private static int PFL_VALORCOMULIQ_CONFERMLABEL = 18;

  private static int PPQRY_PARAMETRI692 = 0;

  private static int PPQRY_BEN = 1;
  private static int PPQRY_QTN = 2;

  private static int PPQRY_ATTRIBUTIOPI = 3;


  IDPanel PAN_VALORCOMULIQ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VALORCOMULIQ(IMDB);
    //
    //
    Init_PQRY_PARAMETRI692(IMDB);
    Init_PQRY_PARAMETRI692_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VALORCOMULIQ(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_VALORCOMULIQ, 11);
    IMDB.set_TblCode(IMDBDef5.TBL_VALORCOMULIQ, "TBL_VALORCOMULIQ");
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKDIBE, "VALCOMCKDIBE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKDIBE,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALCOMCODIBE, "VALCOMCODIBE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALCOMCODIBE,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VACONUQTDIBE, "VACONUQTDIBE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VACONUQTDIBE,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALOCOMINEMI, "VALOCOMINEMI");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALOCOMINEMI,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCON, "VALOCOMCKCON");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCON,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_DATA_CONTABILE,6,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCIG, "VALOCOMCKCIG");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCIG,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKESCI, "VALCOMCKESCI");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKESCI,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_ESCLUSIONE_CIG, "ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMULIQ,IMDBDef5.FLD_VALORCOMULIQ_ESCLUSIONE_CIG,5,50,0);
    IMDB.TblAddNew(IMDBDef5.TBL_VALORCOMULIQ, 0);
  }

  private static void Init_PQRY_PARAMETRI692(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI692, 11);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI692, "PQRY_PARAMETRI692");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALCOMCKDIBE, "VALCOMCKDIBE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALCOMCKDIBE,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALCOMCODIBE, "VALCOMCODIBE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALCOMCODIBE,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VACONUQTDIBE, "VACONUQTDIBE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VACONUQTDIBE,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALOCOMINEMI, "VALOCOMINEMI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALOCOMINEMI,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCON, "VALOCOMCKCON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCON,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_DATA_CONTABILE,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCIG, "VALOCOMCKCIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCIG,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALCOMCKESCI, "VALCOMCKESCI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_VALCOMCKESCI,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_ESCLUSIONE_CIG, "ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692,IMDBDef14.PQSL_PARAMETRI692_ESCLUSIONE_CIG,5,50,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI692, 0);
  }

  private static void Init_PQRY_PARAMETRI692_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI692_RS, 11);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI692_RS, "PQRY_PARAMETRI692_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALCOMCKDIBE, "VALCOMCKDIBE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALCOMCKDIBE,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALCOMCODIBE, "VALCOMCODIBE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALCOMCODIBE,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VACONUQTDIBE, "VACONUQTDIBE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VACONUQTDIBE,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALOCOMINEMI, "VALOCOMINEMI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALOCOMINEMI,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCON, "VALOCOMCKCON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCON,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_DATA_CONTABILE,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCIG, "VALOCOMCKCIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCIG,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALCOMCKESCI, "VALCOMCKESCI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_VALCOMCKESCI,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_ESCLUSIONE_CIG, "ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI692_RS,IMDBDef14.PQSL_PARAMETRI692_ESCLUSIONE_CIG,5,50,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoValoriComuniLiq(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoValoriComuniLiq()
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
    FormIdx = MyGlb.FRM_AGGVALCOMLIQ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "967BA506-A8DE-42B4-981C-B126FA35D444";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 552;
    DesignHeight = 350;
    set_Caption(new IDVariant("Aggiornamento Valori Comuni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 552;
    Frames[1].Height = 324;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Valori Comuni Liq";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 324;
    PAN_VALORCOMULIQ = new IDPanel(w, this, 1, "PAN_VALORCOMULIQ");
    Frames[1].Content = PAN_VALORCOMULIQ;
    PAN_VALORCOMULIQ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VALORCOMULIQ.VS = MainFrm.VisualStyleList;
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 552-MyGlb.PAN_OFFS_X, 324-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1ABC7A6E-51E9-43AE-A58E-32DFD892083E");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1728, 568, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VALORCOMULIQ.InitStatus = 2;
    PAN_VALORCOMULIQ_Init();
    PAN_VALORCOMULIQ_InitFields();
    PAN_VALORCOMULIQ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_VALORCOMULIQ, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGVALCOMLIQ_PARAMETRI692();
      }
      PAN_VALORCOMULIQ.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_VALORCOMULIQ.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALORCOMULIQ_SELEZISOGGET) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEQUIDELSOG && flRis && IdxPanelActived == PAN_VALORCOMULIQ.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALORCOMULIQ_NUMQTNDIVBEN) {
      }
    }
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
    return (obj instanceof AggiornamentoValoriComuniLiq);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoValoriComuniLiq.class.getName() : (Glb.ClassWithPackage(AggiornamentoValoriComuniLiq.class) ? AggiornamentoValoriComuniLiq.class.getName().substring(AggiornamentoValoriComuniLiq.class.getPackage().getName().length() + 1) : AggiornamentoValoriComuniLiq.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Valori Comuni Liq On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VALORCOMULIQ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Valori Comuni Liq On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_VALORCOMULIQ_NUMEROCONTAB)), true) || Column.equals((new IDVariant(PFL_VALORCOMULIQ_DATACONTABIL)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_NUMERO_CONTABILE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_DATA_CONTABILE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCON, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCON, 0, (new IDVariant()));
        }
      }
      // 
      // Caricamento quietanza diverso beneficiario
      // 
      if (Column.equals((new IDVariant(PFL_VALORCOMULIQ_CODICDIVEBEN)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCODIBE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VACONUQTDIBE, 0, MainFrm.SettaQuietanzaBeneficiario(new IDVariant(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCODIBE, 0),IDVariant.FLOAT), IDL.Today()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCKDIBE, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VACONUQTDIBE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCKDIBE, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMULIQ_CIG)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_CIG, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCIG, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCIG, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMULIQ_ESCLUSIONCIG)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_ESCLUSIONE_CIG, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCKESCI, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCKESCI, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniLiq", "ValoriComuniLiqOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Valori Comuni Liq On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VALORCOMULIQ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VALORCOMULIQ);
      // 
      // Valori Comuni Liq On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VALORCOMULIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMULIQ_NUMEROCONTAB,(new IDVariant(PAN_VALORCOMULIQ.FieldText(PFL_VALORCOMULIQ_NUMEROCONTAB))).stringValue()); 
      PAN_VALORCOMULIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMULIQ_ESCLUSIONCIG,(new IDVariant(PAN_VALORCOMULIQ.FieldText(PFL_VALORCOMULIQ_ESCLUSIONCIG))).stringValue()); 
      PAN_VALORCOMULIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMULIQ_BENBENEFICIA,(new IDVariant(PAN_VALORCOMULIQ.FieldText(PFL_VALORCOMULIQ_BENBENEFICIA))).stringValue()); 
      PAN_VALORCOMULIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMULIQ_T02DESCRIZIO,(new IDVariant(PAN_VALORCOMULIQ.FieldText(PFL_VALORCOMULIQ_T02DESCRIZIO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniLiq", "ValoriComuniLiqOnDynamicPropertiesEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCODIBE, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0),IDVariant.INTEGER));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEQUIDELSOG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VACONUQTDIBE, 0, IMDB.Value(IMDBDef7.PQRY_QTN4, IMDBDef7.PQSL_QTN4_NUM_QUIETANZA, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniLiq", "EndModalEvent", _e);
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
      PAN_VALORCOMULIQ.PanelCommand(Glb.PCM_UPDATE);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniLiq", "UnloadEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniLiq", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Conferma
  // **********************************************************************
  public int Conferma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conferma Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniLiq", "Conferma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Diverso Beneficiario
  // **********************************************************************
  public int SceltaDiversoBeneficiario ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Diverso Beneficiario Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniLiq", "SceltaDiversoBeneficiario", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Quietanza Div Ben
  // **********************************************************************
  public int SceltaQuietanzaDivBen ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Quietanza Div Ben Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESOGGE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCODIBE, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESCADE, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCEQUIDELSOG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniLiq", "SceltaQuietanzaDivBen", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void AGGVALCOMLIQ_PARAMETRI692() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI692_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_VALORCOMULIQ, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_VALORCOMULIQ, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI692_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI692_RS, 0, IMDBDef5.TBL_VALORCOMULIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 0, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKDIBE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 1, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALCOMCODIBE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 2, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VACONUQTDIBE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 3, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALOCOMINEMI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 4, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCON, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 5, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_NUMERO_CONTABILE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 6, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_DATA_CONTABILE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 7, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCIG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 8, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_CIG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 9, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKESCI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI692_RS, 10, 0, IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_ESCLUSIONE_CIG, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_VALORCOMULIQ, 0);
      if (IMDB.Eof(IMDBDef5.TBL_VALORCOMULIQ, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_VALORCOMULIQ, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI692_RS, 0);
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
  private void PAN_VALORCOMULIQ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VALORCOMULIQ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VALORCOMULIQ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VALORCOMULIQ, Cancel);
    // Stub
  }

  private void PAN_VALORCOMULIQ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VALORCOMULIQ_SELEZISOGGET)
    {
      this.IdxPanelActived = this.PAN_VALORCOMULIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDiversoBeneficiario();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALORCOMULIQ_NUMQTNDIVBEN)
    {
      this.IdxPanelActived = this.PAN_VALORCOMULIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaQuietanzaDivBen();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALORCOMULIQ_CONFERMLABEL)
    {
      this.IdxPanelActived = this.PAN_VALORCOMULIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Conferma();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VALORCOMULIQ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VALORCOMULIQ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VALORCOMULIQ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VALORCOMULIQ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VALORCOMULIQ_Init()
  {

    PAN_VALORCOMULIQ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VALORCOMULIQ.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, "33F8F36C-3D4F-4072-A37F-C0A2EBA2D1E6");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, "Diverso Beneficiario");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, MyGlb.PANEL_LIST, 0, -9999, 404, 16, 0, 0);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, MyGlb.PANEL_FORM, 8, 47, 400, 73, 0, 0);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, 0, 112);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, 1, 13);
    PAN_VALORCOMULIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, 0, 4);
    PAN_VALORCOMULIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, 1, 4);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_DIVERSBENEFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, "FBC74B77-E527-46FA-AD3B-C3A2408C6CF2");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, "Contabile");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, MyGlb.PANEL_FORM, 8, 127, 400, 49, 0, 0);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, 0, 53);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, 1, 13);
    PAN_VALORCOMULIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, 0, 4);
    PAN_VALORCOMULIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, 1, 4);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CONTABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, "79D67D2C-A5C2-4FDD-94E9-CCF6C4215576");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, "Cig");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, MyGlb.PANEL_LIST, 0, -9999, 116, 16, 0, 0);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, MyGlb.PANEL_FORM, 8, 183, 400, 49, 0, 0);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, 0, 17);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, 1, 13);
    PAN_VALORCOMULIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, 0, 4);
    PAN_VALORCOMULIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, 1, 4);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_CIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, "A77FD353-17DA-4A53-BEBD-A24116FA0B84");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, "Esclusione Cig");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_LIST, 0, -9999, 260, 16, 0, 0);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_FORM, 8, 239, 400, 49, 0, 0);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, 0, 78);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, 1, 13);
    PAN_VALORCOMULIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, 0, 4);
    PAN_VALORCOMULIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, 1, 4);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMULIQ_ESCLUSIONCIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMULIQ.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, "F44AE99A-89D1-4CBA-87A2-D27D6297CA51");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, "I valori indicati verranno valorizzati su tutte le righe selezionate. \nI campi considerati sono quelli selezionati tramite checkbox");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, MyGlb.VIS_ETICGRASLEFT);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, "0CCFA228-58CF-4965-AE52-4A5EB474E38B");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, "CK DIVERSO BEN");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, "2D9B07B5-C925-41DE-909A-FBAF50B067B5");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, "Beneficiario");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, "0DB2B179-EBAA-433C-8007-D6B5C5A2739F");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, "Beneficiario");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, "B05075AB-03E1-473E-9009-010353E4D7E7");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, MyGlb.VIS_STATICBUTTON);
    PAN_VALORCOMULIQ.SetImage(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, 0, "wsearch1.gif", false);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, "256AD0C4-EE16-4B86-B050-EB54519E4B61");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, "Quietanza");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, "FEE3B27B-C148-469C-9627-16F00DBBE0CE");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, "T02 DESCRIZIONE");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, "F297ACBD-E6F8-455F-AD38-AFFAE2237B0C");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, "In Emissione");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, "90E9CB89-B54A-4CD5-A050-D5F5B14EA7DA");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, "CK CONTABILE");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, "35BA2311-D2F5-4C41-9FB6-6C572F8896F9");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, "Numero Contabile");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, "C71F837F-CEE4-4B78-B250-9B1A6E8BA318");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, "Data Contabile");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, "B426D9C1-4008-431C-B5E3-E4D1514E334F");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, "Numero");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, "E766A2AF-AE71-4F37-A51E-5C00C9E9E315");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, "Data");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, "E7B8E4C8-C3E9-4798-A71C-FF25CFF28C02");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, MyGlb.VIS_VUOTONORMALE);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, "8AB76501-1798-4E42-8FBC-CA1C2B9C1C41");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, "CK CIG");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, "D42810BC-8218-4E2F-B01F-23CAFAC7839A");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, "Cig");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, "4A5BC216-611B-4187-BDF2-8C98A2FDC74A");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, "CK ESCLUSIONE CIG");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, "EEEC869A-5757-4E48-8B01-BD97EDA7B547");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, "Esclusione Cig");
    PAN_VALORCOMULIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, "");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMULIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, "95FDC983-CDFC-48CC-ADA7-6A2932A323B6");
    PAN_VALORCOMULIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, "Conferma");
    PAN_VALORCOMULIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, MyGlb.VIS_STATICBUTTON);
    PAN_VALORCOMULIQ.SetImage(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, 0, "button1.gif", false);
    PAN_VALORCOMULIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_VALORCOMULIQ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, MyGlb.PANEL_LIST, 80, 8, 484, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, MyGlb.PANEL_FORM, 8, 8, 520, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INTESTALABEL, MyGlb.PANEL_FORM, 2);
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_INTESTALABEL, -1, -1);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, MyGlb.PANEL_LIST, 100);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, MyGlb.PANEL_LIST, "CK DIVERSO BEN");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, MyGlb.PANEL_FORM, 12, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, MyGlb.PANEL_FORM, 100);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKDIVERSOBEN, MyGlb.PANEL_FORM, "CK DIVERSO BEN");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_CKDIVERSOBEN, -1, GRP_VALORCOMULIQ_DIVERSBENEFI);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_CKDIVERSOBEN, PPQRY_PARAMETRI692, "A.VALCOMCKDIBE", "VALCOMCKDIBE", 5, 2, 0, -13997);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_CKDIVERSOBEN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_CKDIVERSOBEN, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, MyGlb.PANEL_LIST, 124);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, MyGlb.PANEL_FORM, 36, 404, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, MyGlb.PANEL_FORM, 80);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CODICDIVEBEN, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_CODICDIVEBEN, -1, GRP_VALORCOMULIQ_DIVERSBENEFI);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_CODICDIVEBEN, PPQRY_PARAMETRI692, "A.VALCOMCODIBE", "VALCOMCODIBE", 1, 6, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, MyGlb.PANEL_LIST, 100);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, MyGlb.PANEL_LIST, 2);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, MyGlb.PANEL_FORM, 36, 72, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, MyGlb.PANEL_FORM, 76);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_BENBENEFICIA, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_BENBENEFICIA, -1, GRP_VALORCOMULIQ_DIVERSBENEFI);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_BENBENEFICIA, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "BENBENEFICIA", 5, 160, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, MyGlb.PANEL_LIST, 580, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, MyGlb.PANEL_FORM, 388, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_SELEZISOGGET, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_SELEZISOGGET, -1, GRP_VALORCOMULIQ_DIVERSBENEFI);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_SELEZISOGGET, -1, "", "SELEZISOGGET", 0, 0, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, MyGlb.PANEL_LIST, 136);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, MyGlb.PANEL_LIST, "Quietanza");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, MyGlb.PANEL_FORM, 44, 96, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, MyGlb.PANEL_FORM, 68);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMQTNDIVBEN, MyGlb.PANEL_FORM, "Quietanza");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_NUMQTNDIVBEN, -1, GRP_VALORCOMULIQ_DIVERSBENEFI);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_NUMQTNDIVBEN, PPQRY_PARAMETRI692, "A.VACONUQTDIBE", "VACONUQTDIBE", 1, 2, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, MyGlb.PANEL_LIST, "T02 DESCRIZIONE");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, MyGlb.PANEL_FORM, 160, 96, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_T02DESCRIZIO, MyGlb.PANEL_FORM, "T02 DESCRIZIONE");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_T02DESCRIZIO, -1, GRP_VALORCOMULIQ_DIVERSBENEFI);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_T02DESCRIZIO, PPQRY_QTN, "B.DESCRIZIONE", "QTNT02DESCRI", 5, 40, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, MyGlb.PANEL_LIST, 80);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, MyGlb.PANEL_LIST, "In Emissione");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, MyGlb.PANEL_FORM, 424, 96, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, MyGlb.PANEL_FORM, 80);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_INEMISSIONE, MyGlb.PANEL_FORM, "In Emissione");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_INEMISSIONE, -1, -1);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_INEMISSIONE, PPQRY_PARAMETRI692, "A.VALOCOMINEMI", "VALOCOMINEMI", 5, 2, 0, -13997);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_INEMISSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_INEMISSIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, MyGlb.PANEL_LIST, 80);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, MyGlb.PANEL_LIST, "CK CNT.");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, MyGlb.PANEL_FORM, 12, 152, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCONTABILE, MyGlb.PANEL_FORM, "CK CONT.");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_CKCONTABILE, -1, GRP_VALORCOMULIQ_CONTABILE);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_CKCONTABILE, PPQRY_PARAMETRI692, "A.VALOCOMCKCON", "VALOCOMCKCON", 5, 2, 0, -13997);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_CKCONTABILE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_CKCONTABILE, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, MyGlb.PANEL_LIST, 112);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, MyGlb.PANEL_LIST, "Num. Cont.");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, MyGlb.PANEL_FORM, 104, 152, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, MyGlb.PANEL_FORM, 48);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMEROCONTAB, MyGlb.PANEL_FORM, "N. Cnt.");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_NUMEROCONTAB, -1, GRP_VALORCOMULIQ_CONTABILE);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_NUMEROCONTAB, PPQRY_PARAMETRI692, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, MyGlb.PANEL_LIST, 96);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, MyGlb.PANEL_LIST, "Data Contabile");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, MyGlb.PANEL_FORM, 272, 152, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, MyGlb.PANEL_FORM, 32);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTABIL, MyGlb.PANEL_FORM, "D. C.");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_DATACONTABIL, -1, GRP_VALORCOMULIQ_CONTABILE);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_DATACONTABIL, PPQRY_PARAMETRI692, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 10, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, MyGlb.PANEL_LIST, 24, 328, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, MyGlb.PANEL_FORM, 48, 152, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_NUMECONTLABE, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_NUMECONTLABE, -1, GRP_VALORCOMULIQ_CONTABILE);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_NUMECONTLABE, -1, "", "NUMECONTLABE", 0, 0, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, MyGlb.PANEL_LIST, 32, 336, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, MyGlb.PANEL_FORM, 232, 152, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_DATACONTLABE, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_DATACONTLABE, -1, GRP_VALORCOMULIQ_CONTABILE);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_DATACONTLABE, -1, "", "DATACONTLABE", 0, 0, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, MyGlb.PANEL_LIST, 340, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, MyGlb.PANEL_FORM, 392, 160, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_LABELDX, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_LABELDX, -1, GRP_VALORCOMULIQ_CONTABILE);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_LABELDX, -1, "", "LABELDX", 0, 0, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, MyGlb.PANEL_LIST, 116);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, MyGlb.PANEL_LIST, "CK CIG");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, MyGlb.PANEL_FORM, 12, 208, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, MyGlb.PANEL_FORM, 116);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKCIG, MyGlb.PANEL_FORM, "CK CIG");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_CKCIG, -1, GRP_VALORCOMULIQ_CIG);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_CKCIG, PPQRY_PARAMETRI692, "A.VALOCOMCKCIG", "VALOCOMCKCIG", 5, 2, 0, -13997);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_CKCIG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_CKCIG, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, MyGlb.PANEL_LIST, 28);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, MyGlb.PANEL_LIST, "Cig");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, MyGlb.PANEL_FORM, 36, 208, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, MyGlb.PANEL_FORM, 28);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CIG, MyGlb.PANEL_FORM, "Cig");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_CIG, -1, GRP_VALORCOMULIQ_CIG);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_CIG, PPQRY_PARAMETRI692, "A.CIG", "CIG", 5, 15, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, MyGlb.PANEL_LIST, 116);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, MyGlb.PANEL_LIST, "CK ESCLUSIONE CIG");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, MyGlb.PANEL_FORM, 12, 264, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, MyGlb.PANEL_FORM, 116);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CKESCLUSICIG, MyGlb.PANEL_FORM, "CK ESCLUSIONE CIG");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_CKESCLUSICIG, -1, GRP_VALORCOMULIQ_ESCLUSIONCIG);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_CKESCLUSICIG, PPQRY_PARAMETRI692, "A.VALCOMCKESCI", "VALCOMCKESCI", 5, 2, 0, -13997);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_CKESCLUSICIG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMULIQ.SetValueListItem(PFL_VALORCOMULIQ_CKESCLUSICIG, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_LIST, 100);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_LIST, "Esclusione Cig");
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_FORM, 36, 264, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_FORM, 88);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_ESCLUSIONCIG, MyGlb.PANEL_FORM, "Esclusione Cig");
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_ESCLUSIONCIG, -1, GRP_VALORCOMULIQ_ESCLUSIONCIG);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_ESCLUSIONCIG, PPQRY_PARAMETRI692, "A.ESCLUSIONE_CIG", "ESCLUSIONE_CIG", 5, 50, 0, -13997);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, MyGlb.PANEL_LIST, 552, 336, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMULIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, MyGlb.PANEL_FORM, 448, 268, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMULIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMULIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMULIQ_CONFERMLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMULIQ.SetFieldPage(PFL_VALORCOMULIQ_CONFERMLABEL, -1, -1);
    PAN_VALORCOMULIQ.SetFieldPanel(PFL_VALORCOMULIQ_CONFERMLABEL, -1, "", "CONFERMLABEL", 0, 0, 0, -13997);
  }

  private void PAN_VALORCOMULIQ_InitQueries()
  {
    StringBuffer SQL;

    PAN_VALORCOMULIQ.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as BENBENEFICIA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~VALCOMCODIBE~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALORCOMULIQ.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_VALORCOMULIQ.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALORCOMULIQ.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_VALORCOMULIQ.SetQueryLKE(PPQRY_BEN, PFL_VALORCOMULIQ_CODICDIVEBEN, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as BENBENEFICIA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALORCOMULIQ.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_VALORCOMULIQ.SetQueryHeaderColumn(PPQRY_BEN, "BENBENEFICIA", "Beneficiario");
    PAN_VALORCOMULIQ.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_VALORCOMULIQ.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_VALORCOMULIQ.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_VALORCOMULIQ.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as QTNT02DESCRI ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (B.CODICE = A.TIPO_QUIETANZA) ");
    SQL.append("and   (A.CODICE = ~~VALCOMCODIBE~~) ");
    SQL.append("and   (A.NUM_QUIETANZA = ~~VACONUQTDIBE~~) ");
    SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    PAN_VALORCOMULIQ.SetQuery(PPQRY_QTN, 0, SQL, -1, "");
    PAN_VALORCOMULIQ.SetQueryDB(PPQRY_QTN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALORCOMULIQ.SetMasterTable(PPQRY_QTN, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.CODICE = ~~ESCLUSIONE_CIG~~) ");
    SQL.append("and   (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALORCOMULIQ.SetQuery(PPQRY_ATTRIBUTIOPI, 0, SQL, PFL_VALORCOMULIQ_ESCLUSIONCIG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALORCOMULIQ.SetQuery(PPQRY_ATTRIBUTIOPI, 1, SQL, PFL_VALORCOMULIQ_ESCLUSIONCIG, "");
    PAN_VALORCOMULIQ.SetQueryDB(PPQRY_ATTRIBUTIOPI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALORCOMULIQ.SetIMDB(IMDB, "PQRY_PARAMETRI692", true);
    PAN_VALORCOMULIQ.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_VALORCOMULIQ.SetQueryIMDB(PPQRY_PARAMETRI692, IMDBDef14.PQRY_PARAMETRI692_RS, IMDBDef5.TBL_VALORCOMULIQ);
    JustLoaded = true;
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_CKDIVERSOBEN, IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKDIBE);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_CODICDIVEBEN, IMDBDef5.FLD_VALORCOMULIQ_VALCOMCODIBE);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_NUMQTNDIVBEN, IMDBDef5.FLD_VALORCOMULIQ_VACONUQTDIBE);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_INEMISSIONE, IMDBDef5.FLD_VALORCOMULIQ_VALOCOMINEMI);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_CKCONTABILE, IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCON);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_NUMEROCONTAB, IMDBDef5.FLD_VALORCOMULIQ_NUMERO_CONTABILE);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_DATACONTABIL, IMDBDef5.FLD_VALORCOMULIQ_DATA_CONTABILE);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_CKCIG, IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCIG);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_CIG, IMDBDef5.FLD_VALORCOMULIQ_CIG);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_CKESCLUSICIG, IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKESCI);
    PAN_VALORCOMULIQ.SetFieldPrimaryIndex(PFL_VALORCOMULIQ_ESCLUSIONCIG, IMDBDef5.FLD_VALORCOMULIQ_ESCLUSIONE_CIG);
    PAN_VALORCOMULIQ.SetMasterTable(0, "VALORCOMULIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VALORCOMULIQ.Status() == 2)
    {
      int oldListQBE = PAN_VALORCOMULIQ.iUseListQBE;
      PAN_VALORCOMULIQ.iUseListQBE = 0;
      PAN_VALORCOMULIQ.PanelCommand(Glb.PCM_SEARCH);
      PAN_VALORCOMULIQ.PanelCommand(Glb.PCM_FIND);
      PAN_VALORCOMULIQ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VALORCOMULIQ) PAN_VALORCOMULIQ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VALORCOMULIQ) PAN_VALORCOMULIQ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VALORCOMULIQ) PAN_VALORCOMULIQ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VALORCOMULIQ) PAN_VALORCOMULIQ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VALORCOMULIQ) PAN_VALORCOMULIQ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
