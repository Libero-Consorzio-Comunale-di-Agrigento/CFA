// **********************************************
// Risultato Amm Presunto 2014
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RisultatoAmmPresunto2014 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_BILPRERIAMPR_PARTEACCANTO = 0;
  private static int GRP_BILPRERIAMPR_PARTEVINCOLA = 1;
  private static int GRP_BILPRERIAMPR_UTILDIQUOVIN = 2;

  private static int PFL_BILPRERIAMPR_ESERCIZIO = 0;
  private static int PFL_BILPRERIAMPR_RISAMMESEPRE = 1;
  private static int PFL_BILPRERIAMPR_FPVESERCPREC = 2;
  private static int PFL_BILPRERIAMPR_ENTRATPRESUN = 3;
  private static int PFL_BILPRERIAMPR_SPESEPRESUNT = 4;
  private static int PFL_BILPRERIAMPR_VARRESATPRNE = 5;
  private static int PFL_BILPRERIAMPR_VARRESATTPRE = 6;
  private static int PFL_BILPRERIAMPR_VARRESPASPRE = 7;
  private static int PFL_BILPRERIAMPR_FPV = 8;
  private static int PFL_BILPRERIAMPR_FONCREDUBESI = 9;
  private static int PFL_BILPRERIAMPR_FONDIRISERVA = 10;
  private static int PFL_BILPRERIAMPR_FONDISPECIAL = 11;
  private static int PFL_BILPRERIAMPR_FONDRINNCONT = 12;
  private static int PFL_BILPRERIAMPR_FONDOAMMTITO = 13;
  private static int PFL_BILPRERIAMPR_ALTRIFONDNAC = 14;
  private static int PFL_BILPRERIAMPR_VINCODALEGGI = 15;
  private static int PFL_BILPRERIAMPR_VINCODATRASF = 16;
  private static int PFL_BILPRERIAMPR_VINCODAMUTUI = 17;
  private static int PFL_BILPRERIAMPR_VINCATTRENTE = 18;
  private static int PFL_BILPRERIAMPR_VINCOLIALTRI = 19;
  private static int PFL_BILPRERIAMPR_TOTDESTININV = 20;
  private static int PFL_BILPRERIAMPR_UTILVINDALEG = 21;
  private static int PFL_BILPRERIAMPR_UTILVINDATRA = 22;
  private static int PFL_BILPRERIAMPR_UTILVINDAMUT = 23;
  private static int PFL_BILPRERIAMPR_UTIVINATTENT = 24;
  private static int PFL_BILPRERIAMPR_UTILVINCALTR = 25;
  private static int PFL_BILPRERIAMPR_ETICHEELABOR = 26;

  private static int PPQRY_BILPRERIAMP1 = 0;


  IDPanel PAN_BILPRERIAMPR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI659(IMDB);
    //
    //
    Init_PQRY_BILPRERIAMP1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI659(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI659, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI659, "TBL_PARAMETRI659");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI659,IMDBDef3.FLD_PARAMETRI659_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI659, 0);
  }

  private static void Init_PQRY_BILPRERIAMP1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILPRERIAMP1, 26);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILPRERIAMP1, "PQRY_BILPRERIAMP1");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_ENTRATE_PRESUNTE, "ENTRATE_PRESUNTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_ENTRATE_PRESUNTE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_SPESE_PRESUNTE, "SPESE_PRESUNTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_SPESE_PRESUNTE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VAR_RES_ATTIVI_PRESUNTI_NEG, "VAR_RES_ATTIVI_PRESUNTI_NEG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VAR_RES_ATTIVI_PRESUNTI_NEG,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VAR_RES_ATTIVI_PRESUNTI, "VAR_RES_ATTIVI_PRESUNTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VAR_RES_ATTIVI_PRESUNTI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VAR_RES_PASSIVI_PRESUNTI, "VAR_RES_PASSIVI_PRESUNTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VAR_RES_PASSIVI_PRESUNTI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FPV, "FPV");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FPV,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDO_CRED_DUBBIA_ESIG, "FONDO_CRED_DUBBIA_ESIG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDO_CRED_DUBBIA_ESIG,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDI_RISERVA, "FONDI_RISERVA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDI_RISERVA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDI_SPECIALI, "FONDI_SPECIALI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDI_SPECIALI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDI_RINNOVI_CONTR, "FONDI_RINNOVI_CONTR");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDI_RINNOVI_CONTR,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDO_AMM_TITOLI, "FONDO_AMM_TITOLI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FONDO_AMM_TITOLI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_ALTRI_FONDI_NAC, "ALTRI_FONDI_NAC");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_ALTRI_FONDI_NAC,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_DA_LEGGI, "VINCOLI_DA_LEGGI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_DA_LEGGI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_DA_TRASF, "VINCOLI_DA_TRASF");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_DA_TRASF,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_DA_MUTUI, "VINCOLI_DA_MUTUI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_DA_MUTUI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_ATTR_ENTE, "VINCOLI_ATTR_ENTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_ATTR_ENTE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_ALTRI, "VINCOLI_ALTRI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_ALTRI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_TOT_DESTINATO_INV, "TOT_DESTINATO_INV");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_TOT_DESTINATO_INV,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_DA_LEGGI, "UTIL_VINC_DA_LEGGI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_DA_LEGGI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_DA_TRASF, "UTIL_VINC_DA_TRASF");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_DA_TRASF,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_DA_MUTUI, "UTIL_VINC_DA_MUTUI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_DA_MUTUI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_ATTR_ENTE, "UTIL_VINC_ATTR_ENTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_ATTR_ENTE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_ALTRI, "UTIL_VINC_ALTRI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_ALTRI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_RIS_AMM_ESE_PREC, "RIS_AMM_ESE_PREC");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_RIS_AMM_ESE_PREC,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FPV_ESERC_PREC, "FPV_ESERC_PREC");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMP1,IMDBDef11.PQSL_BILPRERIAMP1_FPV_ESERC_PREC,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILPRERIAMP1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RisultatoAmmPresunto2014(MyWebEntryPoint w, IMDBObj imdb)
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
  public RisultatoAmmPresunto2014()
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
    FormIdx = MyGlb.FRM_RISAMMPRE201;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "600250D3-E7DE-42D1-B297-17489137B48E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 640;
    DesignHeight = 794;
    set_Caption(new IDVariant("Risultato Am.ne Presunto"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 640;
    Frames[1].Height = 768;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Risultato Am.ne Presunto";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 768;
    PAN_BILPRERIAMPR = new IDPanel(w, this, 1, "PAN_BILPRERIAMPR");
    Frames[1].Content = PAN_BILPRERIAMPR;
    PAN_BILPRERIAMPR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BILPRERIAMPR.VS = MainFrm.VisualStyleList;
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 640-MyGlb.PAN_OFFS_X, 768-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CB76BD56-601F-43D4-A3B4-CF889C3FA99A");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1540, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BILPRERIAMPR.InitStatus = 2;
    PAN_BILPRERIAMPR_Init();
    PAN_BILPRERIAMPR_InitFields();
    PAN_BILPRERIAMPR_InitQueries();
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
      PAN_BILPRERIAMPR.UpdatePanel(MainFrm);
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
    return (obj instanceof RisultatoAmmPresunto2014);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RisultatoAmmPresunto2014.class.getName() : (Glb.ClassWithPackage(RisultatoAmmPresunto2014.class) ? RisultatoAmmPresunto2014.class.getName().substring(RisultatoAmmPresunto2014.class.getPackage().getName().length() + 1) : RisultatoAmmPresunto2014.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // BIL PREV RIS AMM PRES On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_BILPRERIAMPR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL PREV RIS AMM PRES On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_RIS_AMM_ESE_PREC, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_FPV_ESERC_PREC, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_ENTRATE_PRESUNTE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_SPESE_PRESUNTE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_VAR_RES_ATTIVI_PRESUNTI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_VAR_RES_PASSIVI_PRESUNTI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_FPV, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_FONDO_CRED_DUBBIA_ESIG, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_FONDI_RISERVA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_FONDI_SPECIALI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_FONDI_RINNOVI_CONTR, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_FONDO_AMM_TITOLI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_ALTRI_FONDI_NAC, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_DA_LEGGI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_DA_TRASF, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_DA_MUTUI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_ATTR_ENTE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_VINCOLI_ALTRI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_TOT_DESTINATO_INV, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_DA_LEGGI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_DA_TRASF, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_DA_MUTUI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_ATTR_ENTE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMP1, IMDBDef11.PQSL_BILPRERIAMP1_UTIL_VINC_ALTRI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoAmmPresunto2014", "BILPREVRISAMMPRESOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // BIL PREV RIS AMM PRES After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_BILPRERIAMPR_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL PREV RIS AMM PRES After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_BILPRERIAMPR.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_BILPRERIAMPR.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoAmmPresunto2014", "BILPREVRISAMMPRESAfterFind", _e);
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
      if (new IDVariant(PAN_BILPRERIAMPR.Status()).equals((new IDVariant(3)), true))
      {
        PAN_BILPRERIAMPR.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_BILPRERIAMPR.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOTESTAM, 0), (new IDVariant()));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA")), MainFrm.Datetostring(IDL.Today()));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoAmmPresunto2014", "EtichettaElabora", _e);
      return -1;
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
      IDVariant v_REGIONI = new IDVariant(0,IDVariant.STRING);
      v_REGIONI = (new IDVariant(" (solo per le regioni)"));
      PAN_BILPRERIAMPR.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_BILPRERIAMPR.set_Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_RISAMMESEPRE, IDL.Add((new IDVariant(PAN_BILPRERIAMPR.Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_RISAMMESEPRE))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRERIAMPR.set_Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_FPVESERCPREC, IDL.Add((new IDVariant(PAN_BILPRERIAMPR.Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_FPVESERCPREC))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRERIAMPR.set_Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_ENTRATPRESUN, IDL.Add((new IDVariant(PAN_BILPRERIAMPR.Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_ENTRATPRESUN))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRERIAMPR.set_Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_SPESEPRESUNT, IDL.Add((new IDVariant(PAN_BILPRERIAMPR.Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_SPESEPRESUNT))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRERIAMPR.set_Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_VARRESATPRNE, IDL.Add((new IDVariant(PAN_BILPRERIAMPR.Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_VARRESATPRNE))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRERIAMPR.set_Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_VARRESATTPRE, IDL.Add((new IDVariant(PAN_BILPRERIAMPR.Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_VARRESATTPRE))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRERIAMPR.set_Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_VARRESPASPRE, IDL.Add((new IDVariant(PAN_BILPRERIAMPR.Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_VARRESPASPRE))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRERIAMPR.set_Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_FONCREDUBESI, IDL.Add((new IDVariant(PAN_BILPRERIAMPR.Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_FONCREDUBESI))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRERIAMPR.set_Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_FONDIRISERVA, IDL.Add(IDL.Add((new IDVariant(PAN_BILPRERIAMPR.Header(Glb.OBJ_FIELD,PFL_BILPRERIAMPR_FONDIRISERVA))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_REGIONI).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoAmmPresunto2014", "Load", _e);
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
      if (new IDVariant(PAN_BILPRERIAMPR.Status()).equals((new IDVariant(3)), true))
      {
        PAN_BILPRERIAMPR.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoAmmPresunto2014", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOMEFILE, 0, new IDVariant());
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
  private void PAN_BILPRERIAMPR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BILPRERIAMPR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BILPRERIAMPR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BILPRERIAMPR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BILPRERIAMPR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BILPRERIAMPR);
    // Stub
  }

  private void PAN_BILPRERIAMPR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BILPRERIAMPR_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_BILPRERIAMPR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BILPRERIAMPR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_BILPRERIAMPR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_BILPRERIAMPR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BILPRERIAMPR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BILPRERIAMPR_Init()
  {

    PAN_BILPRERIAMPR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BILPRERIAMPR.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, "E5B7B8E6-63E3-4285-92E9-DEA1060AC215");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, "Parte accantonata");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, MyGlb.VIS_GROUPSTYLE);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, MyGlb.PANEL_LIST, 0, -9999, 64, 16, 0, 0);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, MyGlb.PANEL_FORM, 16, 239, 596, 145, 0, 0);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, 0, 105);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, 1, 13);
    PAN_BILPRERIAMPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, 0, 4);
    PAN_BILPRERIAMPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, 1, 4);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEACCANTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, "EB45F7B1-731D-428A-8888-16F6F6EF7412");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, "Parte Vincolata");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, MyGlb.VIS_GROUPSTYLE);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, MyGlb.PANEL_LIST, 0, -9999, 64, 16, 0, 0);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, MyGlb.PANEL_FORM, 16, 387, 596, 145, 0, 0);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, 0, 86);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, 1, 13);
    PAN_BILPRERIAMPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, 0, 4);
    PAN_BILPRERIAMPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, 1, 4);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_PARTEVINCOLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, "C2916AC1-0F22-4EE1-99A2-E52DA78DC26B");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, "Utilizzo di quota vincolata");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, MyGlb.VIS_GROUPSTYLE);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, MyGlb.PANEL_LIST, 0, -9999, 64, 16, 0, 0);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, MyGlb.PANEL_FORM, 16, 567, 596, 145, 0, 0);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, 0, 145);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, 1, 13);
    PAN_BILPRERIAMPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, 0, 4);
    PAN_BILPRERIAMPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, 1, 4);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_GROUP, GRP_BILPRERIAMPR_UTILDIQUOVIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILPRERIAMPR.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, "7AC9F678-497A-4BEA-A3D6-0DA2152DB066");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, "ESERCIZIO");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, "3A66C6BA-29FF-4FCD-A165-0B7D14B20918");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, "Risultato di amministrazione iniziale dell'esercizio ");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, "04F7F3B1-6292-4D2A-A0A6-5ECB4D2FDDF2");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, "Fondo pluriennale vincolato iniziale dell'esercizio ");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, "CB45517E-10E2-482C-B7A3-261021DE8020");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, "Entrate che prevedo di accertare per il restante periodo dell' esercizio ");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, "9A9B4454-EB1E-4F9D-84CF-32F1D1B24980");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, "Uscite che prevedo di impegnare per il restante periodo dell'esercizio ");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, "3E25A590-CEEF-4A40-ABF1-54EE3C7DD009");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, "Riduzione dei residui attivi presunti per il restante periodo dell'esercizio ");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, "000A0CCA-1809-4F38-B9FA-4FF2F56332E1");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, "Incremento dei residui attivi presunti per il restante periodo dell'esercizio ");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, "B3F67C0A-30B5-45E4-AB91-21F331980906");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, "Riduzione dei residui passivi presunti per il restante periodo dell'esercizio ");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, "39734742-A01B-4125-BA90-8E49D94E62F7");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, "Fondo pluriennale vincolato dell'esercizio ");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, "E73941DD-BDBE-4B05-BF44-DBF299095571");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, "Fondo crediti di dubbia esigibilità al 31/12/");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, "B2D1EC14-F4F8-4CDE-8474-B3B343FC83DE");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, "Accantonamento residui perenti al 31/12/");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, "17A9B6B1-20F1-4E43-BEBD-9337B196AB12");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, "Fondo anticipazioni liquidità");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, "C300BECB-A926-4E5C-B3D8-851BAF9E18FD");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, "Fondo  perdite società partecipate");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, "0B021E8D-B580-4666-89BE-E222858A18ED");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, "Fondo contenzioso");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, "8D960588-1A79-44F0-B4A4-91BF6CE64BD1");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, "Altri accantonamenti");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, "689CC5BC-7131-40ED-B89F-649EA0FD5CA7");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, "Vincoli derivanti da leggi e dai principi contabili");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, "9416E9CE-3E4A-4A4D-A716-02235F7EF346");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, "Vincoli derivanti da trasferimenti");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, "5BF2A4D2-2B2F-4DB6-B876-E4E021CEEB47");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, "Vincoli derivanti dalla contrazione di mutui");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, "8C569772-79F1-47AD-9715-6346F95DFC2D");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, "Vincoli formalmente attribuiti dall'ente");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, "E35EF0EB-24D2-481B-92F9-0EC87A410512");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, "Altri vincoli");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, "EC527667-38ED-421F-927C-99EA893D6C05");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, "Parte destinata agli investimenti");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, "6FDF2491-53A6-4C05-82C6-D8F92A25B742");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, "Utilizzo vincoli derivanti da leggi e principi contabili");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, "3342CFE5-86D4-4B5C-B939-CBC0B859744E");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, "Utilizzo vincoli derivanti da trasferimenti");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, "5DF68FB1-3B2E-4D82-892C-26184E962F03");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, "Utilizzo vincoli derivanti dalla contrazione di mutui");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, "EDF98D0F-8A5C-46B1-86A6-D0D8DB4B0C7F");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, "Utilizzo di vincoli formalmente attribuiti all'ente");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, "CFD11AB2-834B-47AA-97E2-EF4D29A46C43");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, "Utilizzo altri vincoli");
    PAN_BILPRERIAMPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, "");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRERIAMPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, "558A5DB4-C06B-463F-88C7-E998D8353192");
    PAN_BILPRERIAMPR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, "Elabora");
    PAN_BILPRERIAMPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_BILPRERIAMPR.SetImage(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, 0, "button1.gif", false);
    PAN_BILPRERIAMPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_BILPRERIAMPR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, MyGlb.PANEL_FORM, 160);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_ESERCIZIO, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_ESERCIZIO, PPQRY_BILPRERIAMP1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, MyGlb.PANEL_LIST, 112);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, MyGlb.PANEL_LIST, "Risul. di amminist. iniz. dell esercizio");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, MyGlb.PANEL_FORM, 20, 12, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_RISAMMESEPRE, MyGlb.PANEL_FORM, "Risultato di amministrazione iniziale dell'esercizio ");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_RISAMMESEPRE, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_RISAMMESEPRE, PPQRY_BILPRERIAMP1, "A.RIS_AMM_ESE_PREC", "RIS_AMM_ESE_PREC", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, MyGlb.PANEL_LIST, 96);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, MyGlb.PANEL_LIST, "Fon. plur. vinc. iniz. dll. eserc.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, MyGlb.PANEL_FORM, 20, 40, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPVESERCPREC, MyGlb.PANEL_FORM, "Fondo pluriennale vincolato iniziale dell'esercizio ");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_FPVESERCPREC, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_FPVESERCPREC, PPQRY_BILPRERIAMP1, "A.FPV_ESERC_PREC", "FPV_ESERC_PREC", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, MyGlb.PANEL_LIST, 116);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, MyGlb.PANEL_LIST, "E. c. p. d. a. p. i. r. p. d. e.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, MyGlb.PANEL_FORM, 20, 68, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ENTRATPRESUN, MyGlb.PANEL_FORM, "Entrate che prevedo di accertare per il restante periodo dell' esercizio ");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_ENTRATPRESUN, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_ENTRATPRESUN, PPQRY_BILPRERIAMP1, "A.ENTRATE_PRESUNTE", "ENTRATE_PRESUNTE", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, MyGlb.PANEL_LIST, 100);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, MyGlb.PANEL_LIST, "U. c. p. d. i. p. i. r. p. d. e.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, MyGlb.PANEL_FORM, 20, 92, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_SPESEPRESUNT, MyGlb.PANEL_FORM, "Uscite che prevedo di impegnare per il restante periodo dell'esercizio ");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_SPESEPRESUNT, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_SPESEPRESUNT, PPQRY_BILPRERIAMP1, "A.SPESE_PRESUNTE", "SPESE_PRESUNTE", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, MyGlb.PANEL_LIST, 0, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, MyGlb.PANEL_LIST, 180);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, MyGlb.PANEL_LIST, "Riduz. dei res. att. pres. per il restante periodo dell esercizio");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, MyGlb.PANEL_FORM, 20, 124, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATPRNE, MyGlb.PANEL_FORM, "Riduzione dei residui attivi presunti per il restante periodo dell'esercizio ");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_VARRESATPRNE, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_VARRESATPRNE, PPQRY_BILPRERIAMP1, "A.VAR_RES_ATTIVI_PRESUNTI_NEG", "VAR_RES_ATTIVI_PRESUNTI_NEG", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, MyGlb.PANEL_LIST, 156);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, MyGlb.PANEL_LIST, "I. d. r. a. p. p. i. r. p. d. e.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, MyGlb.PANEL_FORM, 20, 148, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESATTPRE, MyGlb.PANEL_FORM, "Incremento dei residui attivi presunti per il restante periodo dell'esercizio ");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_VARRESATTPRE, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_VARRESATTPRE, PPQRY_BILPRERIAMP1, "A.VAR_RES_ATTIVI_PRESUNTI", "VAR_RES_ATTIVI_PRESUNTI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, MyGlb.PANEL_LIST, 164);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, MyGlb.PANEL_LIST, "R. d. r. p. p. p. i. r. p. d. e.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, MyGlb.PANEL_FORM, 20, 172, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VARRESPASPRE, MyGlb.PANEL_FORM, "Riduzione dei residui passivi presunti per il restante periodo dell'esercizio ");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_VARRESPASPRE, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_VARRESPASPRE, PPQRY_BILPRERIAMP1, "A.VAR_RES_PASSIVI_PRESUNTI", "VAR_RES_PASSIVI_PRESUNTI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, MyGlb.PANEL_LIST, 28);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, MyGlb.PANEL_LIST, "F. plr. vnc. d. esr.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, MyGlb.PANEL_FORM, 20, 208, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FPV, MyGlb.PANEL_FORM, "Fondo pluriennale vincolato dell'esercizio ");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_FPV, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_FPV, PPQRY_BILPRERIAMP1, "A.FPV", "FPV", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, MyGlb.PANEL_LIST, 152);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, MyGlb.PANEL_LIST, "F. c. d. d. e. a. 3. 1.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, MyGlb.PANEL_FORM, 20, 264, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONCREDUBESI, MyGlb.PANEL_FORM, "Fondo crediti di dubbia esigibilità al 31/12/");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_FONCREDUBESI, -1, GRP_BILPRERIAMPR_PARTEACCANTO);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_FONCREDUBESI, PPQRY_BILPRERIAMP1, "A.FONDO_CRED_DUBBIA_ESIG", "FONDO_CRED_DUBBIA_ESIG", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, MyGlb.PANEL_LIST, 96);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, MyGlb.PANEL_LIST, "A. r. p. a. 3. 1.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, MyGlb.PANEL_FORM, 20, 264, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDIRISERVA, MyGlb.PANEL_FORM, "Accantonamento residui perenti al 31/12/");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_FONDIRISERVA, -1, GRP_BILPRERIAMPR_PARTEACCANTO);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_FONDIRISERVA, PPQRY_BILPRERIAMP1, "A.FONDI_RISERVA", "FONDI_RISERVA", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, MyGlb.PANEL_LIST, 96);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, MyGlb.PANEL_LIST, "F. ant. liq.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, MyGlb.PANEL_FORM, 20, 288, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDISPECIAL, MyGlb.PANEL_FORM, "Fondo anticipazioni liquidità");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_FONDISPECIAL, -1, GRP_BILPRERIAMPR_PARTEACCANTO);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_FONDISPECIAL, PPQRY_BILPRERIAMP1, "A.FONDI_SPECIALI", "FONDI_SPECIALI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, MyGlb.PANEL_LIST, 132);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, MyGlb.PANEL_LIST, "F. p. s. prt.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, MyGlb.PANEL_FORM, 20, 312, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDRINNCONT, MyGlb.PANEL_FORM, "Fondo  perdite società partecipate");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_FONDRINNCONT, -1, GRP_BILPRERIAMPR_PARTEACCANTO);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_FONDRINNCONT, PPQRY_BILPRERIAMP1, "A.FONDI_RINNOVI_CONTR", "FONDI_RINNOVI_CONTR", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, MyGlb.PANEL_LIST, 120);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, MyGlb.PANEL_LIST, "Fon. cont.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, MyGlb.PANEL_FORM, 20, 336, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_FONDOAMMTITO, MyGlb.PANEL_FORM, "Fondo contenzioso");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_FONDOAMMTITO, -1, GRP_BILPRERIAMPR_PARTEACCANTO);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_FONDOAMMTITO, PPQRY_BILPRERIAMP1, "A.FONDO_AMM_TITOLI", "FONDO_AMM_TITOLI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, MyGlb.PANEL_LIST, 104);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, MyGlb.PANEL_LIST, "Alt. accan.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, MyGlb.PANEL_FORM, 20, 360, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ALTRIFONDNAC, MyGlb.PANEL_FORM, "Altri accantonamenti");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_ALTRIFONDNAC, -1, GRP_BILPRERIAMPR_PARTEACCANTO);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_ALTRIFONDNAC, PPQRY_BILPRERIAMP1, "A.ALTRI_FONDI_NAC", "ALTRI_FONDI_NAC", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, MyGlb.PANEL_LIST, 108);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, MyGlb.PANEL_LIST, "V. d. d. l. e d. p. c.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, MyGlb.PANEL_FORM, 20, 412, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODALEGGI, MyGlb.PANEL_FORM, "Vincoli derivanti da leggi e dai principi contabili");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_VINCODALEGGI, -1, GRP_BILPRERIAMPR_PARTEVINCOLA);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_VINCODALEGGI, PPQRY_BILPRERIAMP1, "A.VINCOLI_DA_LEGGI", "VINCOLI_DA_LEGGI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, MyGlb.PANEL_LIST, 112);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, MyGlb.PANEL_LIST, "V. dr. d. tr.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, MyGlb.PANEL_FORM, 20, 436, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODATRASF, MyGlb.PANEL_FORM, "Vincoli derivanti da trasferimenti");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_VINCODATRASF, -1, GRP_BILPRERIAMPR_PARTEVINCOLA);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_VINCODATRASF, PPQRY_BILPRERIAMP1, "A.VINCOLI_DA_TRASF", "VINCOLI_DA_TRASF", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, MyGlb.PANEL_LIST, 116);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, MyGlb.PANEL_LIST, "V. d. d. c. d. m.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, MyGlb.PANEL_FORM, 20, 460, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCODAMUTUI, MyGlb.PANEL_FORM, "Vincoli derivanti dalla contrazione di mutui");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_VINCODAMUTUI, -1, GRP_BILPRERIAMPR_PARTEVINCOLA);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_VINCODAMUTUI, PPQRY_BILPRERIAMP1, "A.VINCOLI_DA_MUTUI", "VINCOLI_DA_MUTUI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, MyGlb.PANEL_LIST, 116);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, MyGlb.PANEL_LIST, "V. f. a. d. e.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, MyGlb.PANEL_FORM, 20, 484, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCATTRENTE, MyGlb.PANEL_FORM, "Vincoli formalmente attribuiti dall'ente");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_VINCATTRENTE, -1, GRP_BILPRERIAMPR_PARTEVINCOLA);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_VINCATTRENTE, PPQRY_BILPRERIAMP1, "A.VINCOLI_ATTR_ENTE", "VINCOLI_ATTR_ENTE", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, MyGlb.PANEL_LIST, 92);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, MyGlb.PANEL_LIST, "Alt. vincoli");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, MyGlb.PANEL_FORM, 20, 508, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_VINCOLIALTRI, MyGlb.PANEL_FORM, "Altri vincoli");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_VINCOLIALTRI, -1, GRP_BILPRERIAMPR_PARTEVINCOLA);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_VINCOLIALTRI, PPQRY_BILPRERIAMP1, "A.VINCOLI_ALTRI", "VINCOLI_ALTRI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, MyGlb.PANEL_LIST, 120);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, MyGlb.PANEL_LIST, "Par. dest. agl. inves.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, MyGlb.PANEL_FORM, 20, 540, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_TOTDESTININV, MyGlb.PANEL_FORM, "Parte destinata agli investimenti");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_TOTDESTININV, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_TOTDESTININV, PPQRY_BILPRERIAMP1, "A.TOT_DESTINATO_INV", "TOT_DESTINATO_INV", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, MyGlb.PANEL_LIST, 120);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, MyGlb.PANEL_LIST, "U. v. d. d. l. e p. c.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, MyGlb.PANEL_FORM, 20, 592, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDALEG, MyGlb.PANEL_FORM, "Utilizzo vincoli derivanti da leggi e principi contabili");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_UTILVINDALEG, -1, GRP_BILPRERIAMPR_UTILDIQUOVIN);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_UTILVINDALEG, PPQRY_BILPRERIAMP1, "A.UTIL_VINC_DA_LEGGI", "UTIL_VINC_DA_LEGGI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, MyGlb.PANEL_LIST, 124);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, MyGlb.PANEL_LIST, "U. v. d. d. t.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, MyGlb.PANEL_FORM, 20, 616, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDATRA, MyGlb.PANEL_FORM, "Utilizzo vincoli derivanti da trasferimenti");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_UTILVINDATRA, -1, GRP_BILPRERIAMPR_UTILDIQUOVIN);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_UTILVINDATRA, PPQRY_BILPRERIAMP1, "A.UTIL_VINC_DA_TRASF", "UTIL_VINC_DA_TRASF", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, MyGlb.PANEL_LIST, 4, 224, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, MyGlb.PANEL_LIST, 160);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, MyGlb.PANEL_LIST, "Utl. vnc. der. dl. cnt. d. mut.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, MyGlb.PANEL_FORM, 20, 640, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINDAMUT, MyGlb.PANEL_FORM, "Utilizzo vincoli derivanti dalla contrazione di mutui");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_UTILVINDAMUT, -1, GRP_BILPRERIAMPR_UTILDIQUOVIN);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_UTILVINDAMUT, PPQRY_BILPRERIAMP1, "A.UTIL_VINC_DA_MUTUI", "UTIL_VINC_DA_MUTUI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, MyGlb.PANEL_LIST, 4, 248, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, MyGlb.PANEL_LIST, 160);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, MyGlb.PANEL_LIST, "Utl. di vnc. frm. att. all ent.");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, MyGlb.PANEL_FORM, 20, 664, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTIVINATTENT, MyGlb.PANEL_FORM, "Utilizzo di vincoli formalmente attribuiti all'ente");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_UTIVINATTENT, -1, GRP_BILPRERIAMPR_UTILDIQUOVIN);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_UTIVINATTENT, PPQRY_BILPRERIAMP1, "A.UTIL_VINC_ATTR_ENTE", "UTIL_VINC_ATTR_ENTE", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, MyGlb.PANEL_LIST, 4, 272, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, MyGlb.PANEL_LIST, 160);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, MyGlb.PANEL_LIST, "Utilizzo altri vincoli");
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, MyGlb.PANEL_FORM, 20, 688, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, MyGlb.PANEL_FORM, 464);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_UTILVINCALTR, MyGlb.PANEL_FORM, "Utilizzo altri vincoli");
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_UTILVINCALTR, -1, GRP_BILPRERIAMPR_UTILDIQUOVIN);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_UTILVINCALTR, PPQRY_BILPRERIAMP1, "A.UTIL_VINC_ALTRI", "UTIL_VINC_ALTRI", 3, 14, 2, -13997);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, MyGlb.PANEL_LIST, 516, 696, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_BILPRERIAMPR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, MyGlb.PANEL_FORM, 532, 728, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRERIAMPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_BILPRERIAMPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRERIAMPR_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_BILPRERIAMPR.SetFieldPage(PFL_BILPRERIAMPR_ETICHEELABOR, -1, -1);
    PAN_BILPRERIAMPR.SetFieldPanel(PFL_BILPRERIAMPR_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_BILPRERIAMPR_InitQueries()
  {
    StringBuffer SQL;

    PAN_BILPRERIAMPR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BILPRERIAMPR.SetIMDB(IMDB, "PQRY_BILPRERIAMP1", true);
    PAN_BILPRERIAMPR.set_SetString(MyGlb.MASTER_ROWNAME, "BIL PREV RIS AMM PRES");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.ENTRATE_PRESUNTE as ENTRATE_PRESUNTE, ");
    SQL.append("  A.SPESE_PRESUNTE as SPESE_PRESUNTE, ");
    SQL.append("  A.VAR_RES_ATTIVI_PRESUNTI_NEG as VAR_RES_ATTIVI_PRESUNTI_NEG, ");
    SQL.append("  A.VAR_RES_ATTIVI_PRESUNTI as VAR_RES_ATTIVI_PRESUNTI, ");
    SQL.append("  A.VAR_RES_PASSIVI_PRESUNTI as VAR_RES_PASSIVI_PRESUNTI, ");
    SQL.append("  A.FPV as FPV, ");
    SQL.append("  A.FONDO_CRED_DUBBIA_ESIG as FONDO_CRED_DUBBIA_ESIG, ");
    SQL.append("  A.FONDI_RISERVA as FONDI_RISERVA, ");
    SQL.append("  A.FONDI_SPECIALI as FONDI_SPECIALI, ");
    SQL.append("  A.FONDI_RINNOVI_CONTR as FONDI_RINNOVI_CONTR, ");
    SQL.append("  A.FONDO_AMM_TITOLI as FONDO_AMM_TITOLI, ");
    SQL.append("  A.ALTRI_FONDI_NAC as ALTRI_FONDI_NAC, ");
    SQL.append("  A.VINCOLI_DA_LEGGI as VINCOLI_DA_LEGGI, ");
    SQL.append("  A.VINCOLI_DA_TRASF as VINCOLI_DA_TRASF, ");
    SQL.append("  A.VINCOLI_DA_MUTUI as VINCOLI_DA_MUTUI, ");
    SQL.append("  A.VINCOLI_ATTR_ENTE as VINCOLI_ATTR_ENTE, ");
    SQL.append("  A.VINCOLI_ALTRI as VINCOLI_ALTRI, ");
    SQL.append("  A.TOT_DESTINATO_INV as TOT_DESTINATO_INV, ");
    SQL.append("  A.UTIL_VINC_DA_LEGGI as UTIL_VINC_DA_LEGGI, ");
    SQL.append("  A.UTIL_VINC_DA_TRASF as UTIL_VINC_DA_TRASF, ");
    SQL.append("  A.UTIL_VINC_DA_MUTUI as UTIL_VINC_DA_MUTUI, ");
    SQL.append("  A.UTIL_VINC_ATTR_ENTE as UTIL_VINC_ATTR_ENTE, ");
    SQL.append("  A.UTIL_VINC_ALTRI as UTIL_VINC_ALTRI, ");
    SQL.append("  A.RIS_AMM_ESE_PREC as RIS_AMM_ESE_PREC, ");
    SQL.append("  A.FPV_ESERC_PREC as FPV_ESERC_PREC ");
    PAN_BILPRERIAMPR.SetQuery(PPQRY_BILPRERIAMP1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PREV_RIS_AMM_PRES A ");
    PAN_BILPRERIAMPR.SetQuery(PPQRY_BILPRERIAMP1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_BILPRERIAMPR.SetQuery(PPQRY_BILPRERIAMP1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILPRERIAMPR.SetQuery(PPQRY_BILPRERIAMP1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILPRERIAMPR.SetQuery(PPQRY_BILPRERIAMP1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILPRERIAMPR.SetQuery(PPQRY_BILPRERIAMP1, 5, SQL, -1, "");
    PAN_BILPRERIAMPR.SetQueryDB(PPQRY_BILPRERIAMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BILPRERIAMPR.SetMasterTable(0, "BIL_PREV_RIS_AMM_PRES");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BILPRERIAMPR.Status() == 2)
    {
      int oldListQBE = PAN_BILPRERIAMPR.iUseListQBE;
      PAN_BILPRERIAMPR.iUseListQBE = 0;
      PAN_BILPRERIAMPR.PanelCommand(Glb.PCM_SEARCH);
      PAN_BILPRERIAMPR.PanelCommand(Glb.PCM_FIND);
      PAN_BILPRERIAMPR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BILPRERIAMPR) PAN_BILPRERIAMPR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILPRERIAMPR) PAN_BILPRERIAMPR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BILPRERIAMPR) PAN_BILPRERIAMPR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILPRERIAMPR) PAN_BILPRERIAMPR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BILPRERIAMPR) PAN_BILPRERIAMPR_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_BILPRERIAMPR) PAN_BILPRERIAMPR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
