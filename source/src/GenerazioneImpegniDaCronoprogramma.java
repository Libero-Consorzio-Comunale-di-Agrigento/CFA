// **********************************************
// Generazione Impegni Da Cronoprogramma
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneImpegniDaCronoprogramma extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_DELIBERA = 0;
  private static int PFL_PARS_NUMERODEL = 1;
  private static int PFL_PARS_ANNODEL = 2;
  private static int PFL_PARS_ANNOESIGIBI1 = 3;
  private static int PFL_PARS_PROGRUO = 4;
  private static int PFL_PARS_ETICHSCELDEL = 5;
  private static int PFL_PARS_ETICHINFODEL = 6;

  private static int PPQRY_PARS70 = 0;

  private static int PPQRY_IMP = 1;


  IDPanel PAN_PARS;
  private static int GRP_VARIAZIONI_IMPEGNO = 0;

  private static int PFL_VARIAZIONI_CAPITOLO = 0;
  private static int PFL_VARIAZIONI_ARTICOLO = 1;
  private static int PFL_VARIAZIONI_INFOCAP = 2;
  private static int PFL_VARIAZIONI_NUMEROIMP = 3;
  private static int PFL_VARIAZIONI_ANNOIMP = 4;
  private static int PFL_VARIAZIONI_INFOIMP = 5;
  private static int PFL_VARIAZIONI_IMPDESCRIZIO = 6;
  private static int PFL_VARIAZIONI_ANNOESIGIBI2 = 7;
  private static int PFL_VARIAZIONI_IMPORTO1 = 8;
  private static int PFL_VARIAZIONI_TIPOVARIAZIO = 9;
  private static int PFL_VARIAZIONI_TIPOVAR1 = 10;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 11;

  private static int PPQRY_VARIMP13 = 0;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS99(IMDB);
    //
    //
    Init_PQRY_PARS70(IMDB);
    Init_PQRY_PARS70_RS(IMDB);
    Init_PQRY_VARIMP13(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS99(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS99, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS99, "TBL_PARS99");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS99,IMDBDef4.FLD_PARS99_NOMEOGGPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS99, 0);
  }

  private static void Init_PQRY_PARS70(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARS70, 5);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARS70, "PQRY_PARS70");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70,IMDBDef13.PQSL_PARS70_NOMEOGGPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARS70, 0);
  }

  private static void Init_PQRY_PARS70_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARS70_RS, 5);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARS70_RS, "PQRY_PARS70_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS70_RS,IMDBDef13.PQSL_PARS70_NOMEOGGPROUO,1,8,0);
  }

  private static void Init_PQRY_VARIMP13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VARIMP13, 13);
    IMDB.set_TblCode(IMDBDef13.PQRY_VARIMP13, "PQRY_VARIMP13");
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECOVARICAPI, "RECOVARICAPI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECOVARICAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECOVARIARTI, "RECOVARIARTI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECOVARIARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_INFOCAP, "INFOCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_INFOCAP,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECVARANNIMP, "RECVARANNIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECVARANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECVARNUMIMP, "RECVARNUMIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECVARNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_INFOIMP, "INFOIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_INFOIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECORIMPDESC, "RECORIMPDESC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECORIMPDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_REVAANESCRCR, "REVAANESCRCR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_REVAANESCRCR,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECOTIPOVARI, "RECOTIPOVARI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECOTIPOVARI,5,142,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECVARFINDES, "RECVARFINDES");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECVARFINDES,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECORDIMPORT,3,28,6);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECVARTIPVAR, "RECVARTIPVAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECVARTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECOVARIPROG, "RECOVARIPROG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP13,IMDBDef13.PQSL_VARIMP13_RECOVARIPROG,3,10,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VARIMP13, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneImpegniDaCronoprogramma(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneImpegniDaCronoprogramma()
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
    FormIdx = MyGlb.FRM_GENEIMPDACRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8CDAF272-5DF2-452B-969F-E9F4E2814785";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 940;
    DesignHeight = 406;
    set_Caption(new IDVariant("Generazione Impegni da Cronoprogramma"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 940;
    Frames[1].Height = 380;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.231579;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 940;
    Frames[2].Height = 88;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 88;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 940-MyGlb.PAN_OFFS_X, 88-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "350DDE35-88B9-427A-AB8E-9751AC75D744");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 296, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 940;
    Frames[3].Height = 292;
    Frames[3].Caption = "Variazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 292;
    PAN_VARIAZIONI = new IDPanel(w, this, 3, "PAN_VARIAZIONI");
    Frames[3].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 940-MyGlb.PAN_OFFS_X, 292-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "75F0562A-6FEE-4200-B2B1-29F4064DC0FB");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 904, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 1;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG11+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG199+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG11+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENERAIMPEGN+BaseCmdLinIdx)
      {
        GenerazioneImpegni();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS99, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENEIMPDACRO_PARS70();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_ETICHSCELDEL) {
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
    return (obj instanceof GenerazioneImpegniDaCronoprogramma);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneImpegniDaCronoprogramma.class.getName() : (Glb.ClassWithPackage(GenerazioneImpegniDaCronoprogramma.class) ? GenerazioneImpegniDaCronoprogramma.class.getName().substring(GenerazioneImpegniDaCronoprogramma.class.getPackage().getName().length() + 1) : GenerazioneImpegniDaCronoprogramma.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      PAN_VARIAZIONI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIONI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "Load", _e);
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMEOGGEDELI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMOGGANNESI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMEOGGPROUO, 0, new IDVariant());
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
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_PARGENIMDACR)), true))
        {
          IDVariant v_NUMIMP = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NUMVARIMP = new IDVariant(0,IDVariant.INTEGER);
          v_NUMVARIMP = (new IDVariant(0));
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.GENERAIMPDACRONOVIMP(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_PAR119, IMDBDef13.PQSL_PAR119_NOMEOGGEDELI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_NUMIMP, v_NUMVARIMP);
          if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Inseriti "));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("\n"))), S), ((v_NUMIMP.compareTo((new IDVariant(0)), true)>0)?IDL.Add(IDL.Add(IDL.Add((new IDVariant("nr. ")), IDL.ToString(v_NUMIMP)), (new IDVariant(" "))), (new IDVariant("Impegni"))):(new IDVariant("nessun Impegno")))), (new IDVariant(", "))), ((v_NUMVARIMP.compareTo((new IDVariant(0)), true)>0)?IDL.Add(IDL.Add(IDL.Add((new IDVariant("nr. ")), IDL.ToString(v_NUMVARIMP)), (new IDVariant(" "))), (new IDVariant("Variazioni Impegni"))):(new IDVariant("nessuna Variazione Impegno"))))); 
            PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Pars On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_PARS_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PARS_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_PARS_ANNODEL)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, 0))))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, 0, IDL.Upper(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGANNDEL, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Delibera inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGANNDEL, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "ParsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Pars On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARS);
      // 
      // Pars On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGANNDEL, 0))))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "ParsOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Etichetta Scelta Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI333, IMDBDef1.FLD_PARAMETRI333_PARAMFILTRO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI333, IMDBDef1.FLD_PARAMETRI333_PARAANNOESIG, 0, IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGANNESI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI333, IMDBDef1.FLD_PARAMETRI333_PARPROUNIORG, 0, IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGPROUO, 0));
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "EtichettaSceltaDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Info Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaInfoDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Info Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_ANNOPARAM, 0, IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGANNDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO, 0, IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMOGGNUMDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_SEDEPARAM, 0, IMDB.Value(IMDBDef13.PQRY_PARS70, IMDBDef13.PQSL_PARS70_NOMEOGGEDELI, 0));
      MainFrm.Show(MyGlb.FRM_INFORMDELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "EtichettaInfoDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Variazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIONI);
      // 
      // Variazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPDESCRIZIO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_IMPDESCRIZIO))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_TIPOVARIAZIO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_TIPOVARIAZIO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "VariazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_VARIAZIONI.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_VARIAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "VariazioniOnCommand", _e);
    }
  }

  // **********************************************************************
  // Generazione Impegni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int GenerazioneImpegni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Generazione Impegni Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_IMP_DA_CRONO ");
      SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Nessun record selezionato"));
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      if (PAN_VARIAZIONI.ShowMultipleSel())
      {
        C3 = PAN_VARIAZIONI.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_VARIAZIONI.GotoFirst();
        while (!PAN_VARIAZIONI.RSEOF())
        {
          if (PAN_VARIAZIONI.IsRowSelected(I.intValue()))
          {
            v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
            SQL = new StringBuffer();
            SQL.append("insert into WRK_GEN_IMP_DA_CRONO ");
            SQL.append("( ");
            SQL.append("  PROGR_SESSIONE, ");
            SQL.append("  PROGRESSIVO_VARIAZIONE, ");
            SQL.append("  DATA_INSERIMENTO ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("RECOVARIPROG"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_VARIAZIONI.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        if (v_COUNT.equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECOVARIPROG, 0)))
        {
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("insert into WRK_GEN_IMP_DA_CRONO ");
          SQL.append("( ");
          SQL.append("  PROGR_SESSIONE, ");
          SQL.append("  PROGRESSIVO_VARIAZIONE, ");
          SQL.append("  DATA_INSERIMENTO ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECOVARIPROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  TRUNC( SYSDATE ) ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
      }
      MainFrm.Show(MyGlb.FRM_PARGENIMDACR, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "GenerazioneImpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Cap Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECOVARICAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECOVARIARTI, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECOVARICAPI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECOVARIARTI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "InfoCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Imp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Imp Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECVARNUMIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECVARANNIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECVARNUMIMP, 0));
        if (IMDB.Value(IMDBDef13.PQRY_VARIMP13, IMDBDef13.PQSL_VARIMP13_RECVARANNIMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        }
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaCronoprogramma", "InfoImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENEIMPDACRO_PARS70() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARS70_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS99, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS99, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARS70_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARS70_RS, 0, IMDBDef4.TBL_PARS99, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS70_RS, 0, 0, IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMEOGGEDELI, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS70_RS, 1, 0, IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMOGGNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS70_RS, 2, 0, IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMOGGANNDEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS70_RS, 3, 0, IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMOGGANNESI, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS70_RS, 4, 0, IMDBDef4.TBL_PARS99, IMDBDef4.FLD_PARS99_NOMEOGGPROUO, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS99, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS99, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS99, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARS70_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ETICHSCELDEL)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaDel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICHINFODEL)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfoDel();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VARIAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
    // Stub
  }

  private void PAN_VARIAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOCAP)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOIMP)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImp();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, "07E75052-C0C6-464D-A54B-676DEB7F94DF");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, "Delibera");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "1AA6B1E8-D470-4746-8DD9-8F3014EA261D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "-");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "B92E6604-BAB2-4049-8CE4-37CD2D431965");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, "ADDCF6C3-373B-487D-876C-CC7682FF2D01");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, "Anno Esigibilità");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "A43DF746-90B8-4B7B-8CC8-D223809C4AFF");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "Unità Organizzativa");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "F3BB813B-5647-4D4F-8028-B7DB89723336");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, "AF89EF2A-2CF8-4367-9DA3-2D892CB7483A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, 0, "info.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, 24, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, 112);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARS.SetFieldPage(PFL_PARS_DELIBERA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_DELIBERA, PPQRY_PARS70, "A.NOMEOGGEDELI", "NOMEOGGEDELI", 5, 255, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, "-");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 184, 4, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, "-");
    PAN_PARS.SetFieldPage(PFL_PARS_NUMERODEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_NUMERODEL, PPQRY_PARS70, "A.NOMOGGNUMDEL", "NOMOGGNUMDEL", 1, 6, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 248, 4, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNODEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNODEL, PPQRY_PARS70, "A.NOMOGGANNDEL", "NOMOGGANNDEL", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, 96);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, "Ann. Esig.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, 24, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, 112);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNOESIGIBI1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNOESIGIBI1, PPQRY_PARS70, "A.NOMOGGANNESI", "NOMOGGANNESI", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 16, 52, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 120);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARS.SetFieldPage(PFL_PARS_PROGRUO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PROGRUO, PPQRY_PARS70, "A.NOMEOGGPROUO", "NOMEOGGPROUO", 1, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 304, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 304, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHSCELDEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHSCELDEL, -1, "", "ETICHSCELDEL", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_LIST, 312, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_FORM, 324, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHINFODEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHINFODEL, -1, "", "ETICHINFODEL", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as IMPPROUNIORG, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCUO ");
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  VARIMP B ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (A.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (NOT ((A.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    SQL.append("order by 2, 1 ");
    PAN_PARS.SetQuery(PPQRY_IMP, 0, SQL, PFL_PARS_PROGRUO, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as IMPPROUNIORG, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCUO ");
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  VARIMP B ");
    SQL.append("where (A.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (NOT ((A.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    SQL.append("order by 2, 1 ");
    PAN_PARS.SetQuery(PPQRY_IMP, 1, SQL, PFL_PARS_PROGRUO, "");
    PAN_PARS.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS70", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS70, IMDBDef13.PQRY_PARS70_RS, IMDBDef4.TBL_PARS99);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DELIBERA, IMDBDef4.FLD_PARS99_NOMEOGGEDELI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_NUMERODEL, IMDBDef4.FLD_PARS99_NOMOGGNUMDEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNODEL, IMDBDef4.FLD_PARS99_NOMOGGANNDEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNOESIGIBI1, IMDBDef4.FLD_PARS99_NOMOGGANNESI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_PROGRUO, IMDBDef4.FLD_PARS99_NOMEOGGPROUO);
    PAN_PARS.SetMasterTable(0, "PARS99");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, "75163DA5-D873-4CF9-8A0C-87127BE83E71");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, "Impegno");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 192, -9999, 324, 16, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 0, 51, 576, 253, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, 0, 51);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "41DADE22-DF20-4936-AD63-75C6020FCB52");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "Capitolo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.VIS_NOFIINLUHELE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "D029952A-E306-452D-86DD-B99BD9169EF5");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "Art.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, "A906468F-1B9D-40AF-8CAD-C6337744BB1B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "1087256A-23CB-4861-8145-783F405ADB22");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "Numero");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "C252FD66-13CD-4BAA-A4A6-6D18F72338EB");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "Anno");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, "3BCDC780-4BC7-4BA1-B242-725FAA5991D2");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, "3C76DE81-01FE-45CC-A221-967BCD85CB28");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, "Descrizione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, "632AD740-118D-4749-B75E-D373CD600B74");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, "67844A9D-9E2C-40B2-B1A8-C740444553E6");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "13B961BE-2608-4A1C-8341-A6905C13B274");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, "D6C0CD72-09B8-409F-833C-D3375AEB9661");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, "TIPO VAR");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, 0, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "D0DCE9E7-5C5F-4059-AA94-25729C69F47C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO, PPQRY_VARIMP13, "C.CAPITOLO", "RECOVARICAPI", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 136, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ARTICOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ARTICOLO, PPQRY_VARIMP13, "C.ARTICOLO", "RECOVARIARTI", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_LIST, 168, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_FORM, 4, 52, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOCAP, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFOCAP, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOCAP, PPQRY_VARIMP13, "CASE WHEN NOT ((C.CAPITOLO IS NULL)) THEN 'I' ELSE NULL END", "INFOCAP", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOCAP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOCAP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOCAP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 192, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 4, 76, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROIMP, -1, GRP_VARIAZIONI_IMPEGNO);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROIMP, PPQRY_VARIMP13, "C.NUMERO_IMP", "RECVARNUMIMP", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 252, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 4, 100, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOIMP, -1, GRP_VARIAZIONI_IMPEGNO);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOIMP, PPQRY_VARIMP13, "C.ANNO_IMP", "RECVARANNIMP", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_LIST, 292, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_FORM, 4, 124, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOIMP, -1, GRP_VARIAZIONI_IMPEGNO);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFOIMP, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOIMP, PPQRY_VARIMP13, "CASE WHEN NOT ((C.NUMERO_IMP IS NULL)) THEN 'I' ELSE NULL END", "INFOIMP", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOIMP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, MyGlb.PANEL_LIST, 316, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, MyGlb.PANEL_FORM, 4, 268, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPDESCRIZIO, -1, GRP_VARIAZIONI_IMPEGNO);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPDESCRIZIO, PPQRY_VARIMP13, "D.DESCRIZIONE", "RECORIMPDESC", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_LIST, 516, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_FORM, 4, 148, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGIBI2, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGIBI2, PPQRY_VARIMP13, "C.ANNO_ESIGIBILITA_CRONO", "REVAANESCRCR", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_LIST, 580, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_FORM, 4, 172, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO1, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_IMPORTO1, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO1, PPQRY_VARIMP13, "ABS(C.IMPORTO)", "RECORDIMPORT", 3, 28, 6, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 704, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 304, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tp. Variaz.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVARIAZIO, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_TIPOVARIAZIO, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVARIAZIO, PPQRY_VARIMP13, "TO_CHAR ( E.CODICE ) || ' - ' || E.DESCRIZIONE", "RECOTIPOVARI", 5, 142, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_LIST, "TIPO VAR");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_FORM, 4, 196, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_FORM, "TIPO VAR");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVAR1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVAR1, PPQRY_VARIMP13, "C.TIPO_VAR", "RECVARTIPVAR", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 268, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_VARIMP13, "C.PROGRESSIVO", "RECOVARIPROG", 3, 10, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARIMP13", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.CAPITOLO as RECOVARICAPI, ");
    SQL.append("  C.ARTICOLO as RECOVARIARTI, ");
    SQL.append("  CASE WHEN NOT ((C.CAPITOLO IS NULL)) THEN 'I' ELSE NULL END as INFOCAP, ");
    SQL.append("  C.ANNO_IMP as RECVARANNIMP, ");
    SQL.append("  C.NUMERO_IMP as RECVARNUMIMP, ");
    SQL.append("  CASE WHEN NOT ((C.NUMERO_IMP IS NULL)) THEN 'I' ELSE NULL END as INFOIMP, ");
    SQL.append("  D.DESCRIZIONE as RECORIMPDESC, ");
    SQL.append("  C.ANNO_ESIGIBILITA_CRONO as REVAANESCRCR, ");
    SQL.append("  TO_CHAR ( E.CODICE ) || ' - ' || E.DESCRIZIONE as RECOTIPOVARI, ");
    SQL.append("  C.FINANZIAMENTO_DESTINAZIONE as RECVARFINDES, ");
    SQL.append("  ABS(C.IMPORTO) as RECORDIMPORT, ");
    SQL.append("  C.TIPO_VAR as RECVARTIPVAR, ");
    SQL.append("  C.PROGRESSIVO as RECOVARIPROG ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP13, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARIMP C, ");
    SQL.append("  IMP D, ");
    SQL.append("  T55 E ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP13, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (D.ANNO_IMP = C.ANNO_IMP) ");
    SQL.append("and   (D.NUMERO_IMP = C.NUMERO_IMP) ");
    SQL.append("and   (E.CODICE = C.TIPO_VAR) ");
    SQL.append("and   (C.IMPORTO < 0) ");
    SQL.append("and   ((NOT ((C.ANNO_ESIGIBILITA_CRONO IS NULL)) OR NOT ((C.FINANZIAMENTO_DESTINAZIONE IS NULL)))) ");
    SQL.append("and   ((C.IMP_GENERATO IS NULL)) ");
    SQL.append("and   (E.MOTIVO IN ('RCA', 'RCP', 'CFC')) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  VAR_PIANI_CRONOPROGRAMMI A, ");
    SQL.append("  VARCOM B ");
    SQL.append("where (B.PROGRESSIVO_VAR_CRONO = A.PROGRESSIVO_VAR) ");
    SQL.append("and   (A.PROGR_VARIMP_PROVENIENZA = C.PROGRESSIVO) ");
    SQL.append("and   (A.VARIAZIONE_GENERATA = 'SI') ");
    SQL.append("and   (NVL(B.ANNO_DEL, -1) = NVL(~~PQRY_PARS70.NOMOGGANNDEL~~, NVL(B.ANNO_DEL, -1))) ");
    SQL.append("and   (NVL(B.NUMERO_DEL, -1) = NVL(~~PQRY_PARS70.NOMOGGNUMDEL~~, NVL(B.NUMERO_DEL, -1))) ");
    SQL.append("and   (NVL(B.SEDE_DEL, 'X') = NVL(~~PQRY_PARS70.NOMEOGGEDELI~~, NVL(B.SEDE_DEL, 'X'))) ");
    SQL.append("))) ");
    SQL.append("and   (NVL(C.ANNO_ESIGIBILITA_CRONO, -1) = NVL(~~PQRY_PARS70.NOMOGGANNESI~~, NVL(C.ANNO_ESIGIBILITA_CRONO, -1))) ");
    SQL.append("and   (NVL(D.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~PQRY_PARS70.NOMEOGGPROUO~~, NVL(D.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP13, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP13, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP13, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  C.CAPITOLO, ");
    SQL.append("  C.ARTICOLO, ");
    SQL.append("  C.ANNO_IMP, ");
    SQL.append("  C.NUMERO_IMP, ");
    SQL.append("  C.ANNO_ESIGIBILITA_CRONO ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP13, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARIMP13, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "VARIMP");
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_CAPITOLO, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ARTICOLO, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ANNOIMP, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_NUMEROIMP, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ANNOESIGIBI2, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIONI.iUseListQBE;
      PAN_VARIAZIONI.iUseListQBE = 0;
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
