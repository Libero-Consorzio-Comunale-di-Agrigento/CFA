// **********************************************
// Lancia Genera Varimp Crono
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LanciaGeneraVarimpCrono extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_GENERAVARIAZ_DELIBERA = 0;
  private static int PFL_GENERAVARIAZ_NUMERO = 1;
  private static int PFL_GENERAVARIAZ_ANNO = 2;
  private static int PFL_GENERAVARIAZ_SCELTADEL = 3;
  private static int PFL_GENERAVARIAZ_INFODEL = 4;
  private static int PFL_GENERAVARIAZ_PROPOSTA = 5;
  private static int PFL_GENERAVARIAZ_NUMEROPROP = 6;
  private static int PFL_GENERAVARIAZ_ANNOPROP = 7;
  private static int PFL_GENERAVARIAZ_SCELTAPROP = 8;
  private static int PFL_GENERAVARIAZ_INFOPROP = 9;
  private static int PFL_GENERAVARIAZ_DATAREG = 10;
  private static int PFL_GENERAVARIAZ_ETICHEELABOR = 11;

  private static int PPQRY_PARS88 = 0;


  IDPanel PAN_GENERAVARIAZ;

  // Definition of Global Variables
  private IDVariant CONFERMA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS89(IMDB);
    //
    //
    Init_PQRY_PARS88(IMDB);
    Init_PQRY_PARS88_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS89(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS89, 7);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS89, "TBL_PARS89");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMOGGSEDDEL,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMOGGNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMEOGGEPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMEOGGENUME,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMEOGGEANNO, "NOMEOGGEANNO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMEOGGEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS89,IMDBDef4.FLD_PARS89_NOMOGGDATREG,6,14,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS89, 0);
  }

  private static void Init_PQRY_PARS88(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARS88, 7);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARS88, "PQRY_PARS88");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMEOGGEPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMEOGGENUME,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMEOGGEANNO, "NOMEOGGEANNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMEOGGEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88,IMDBDef13.PQSL_PARS88_NOMOGGDATREG,6,14,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARS88, 0);
  }

  private static void Init_PQRY_PARS88_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARS88_RS, 7);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARS88_RS, "PQRY_PARS88_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMEOGGEPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMEOGGENUME,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMEOGGEANNO, "NOMEOGGEANNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMEOGGEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS88_RS,IMDBDef13.PQSL_PARS88_NOMOGGDATREG,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LanciaGeneraVarimpCrono(MyWebEntryPoint w, IMDBObj imdb)
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
  public LanciaGeneraVarimpCrono()
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
    FormIdx = MyGlb.FRM_LANGENVARCRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "35E1DECA-792A-47C9-B510-9C8F87AE1DC7";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 384;
    DesignHeight = 186;
    set_Caption(new IDVariant("Generazione Variazioni da Cronoprogramma"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 384;
    Frames[1].Height = 160;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Generazione Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 160;
    PAN_GENERAVARIAZ = new IDPanel(w, this, 1, "PAN_GENERAVARIAZ");
    Frames[1].Content = PAN_GENERAVARIAZ;
    PAN_GENERAVARIAZ.Lockable = false;
    PAN_GENERAVARIAZ.iLocked = false;
    PAN_GENERAVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENERAVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 384-MyGlb.PAN_OFFS_X, 160-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AF768206-0C1C-4AEF-B7B3-A397FEA2D649");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 400, 50, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GENERAVARIAZ.InitStatus = 1;
    PAN_GENERAVARIAZ_Init();
    PAN_GENERAVARIAZ_InitFields();
    PAN_GENERAVARIAZ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS89, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LANGENVARCRO_PARS88();
      }
      PAN_GENERAVARIAZ.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_GENERAVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_GENERAVARIAZ_SCELTADEL) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_GENERAVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_GENERAVARIAZ_SCELTAPROP) {
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
    return (obj instanceof LanciaGeneraVarimpCrono);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LanciaGeneraVarimpCrono.class.getName() : (Glb.ClassWithPackage(LanciaGeneraVarimpCrono.class) ? LanciaGeneraVarimpCrono.class.getName().substring(LanciaGeneraVarimpCrono.class.getPackage().getName().length() + 1) : LanciaGeneraVarimpCrono.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (CONFERMA.booleanValue())
      {
        SQL = new StringBuffer();
        SQL.append("delete from WRK_GEN_VAR_CRONO ");
        SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from WRK_GEN_VAR_CRONO_VARIMP ");
        SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        ((GenerazioneVariazioniImpegniDaCronoDaVarBil)MainFrm.GetForm(MyGlb.FRM_GEVAIMDACDVB,0)).PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarimpCrono", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMOGGSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMEOGGEPROP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMEOGGENUME, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMEOGGEANNO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMOGGDATREG, 0, new IDVariant());
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
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
          IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGENUME, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
          IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEANNO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarimpCrono", "EndModal", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMOGGDATREG, 0, IDL.Today());
      CONFERMA = (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarimpCrono", "Load", _e);
    }
  }

  // **********************************************************************
  // Generazione Variazioni On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_GENERAVARIAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Generazione Variazioni On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_GENERAVARIAZ_DELIBERA)), true) || Column.equals((new IDVariant(PFL_GENERAVARIAZ_NUMERO)), true) || Column.equals((new IDVariant(PFL_GENERAVARIAZ_ANNO)), true))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = (new IDVariant());
        v_ANNODEL = (new IDVariant());
        v_NUMERODEL = (new IDVariant());
        v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0));
        v_ANNODEL = IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("NO")));
        IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0, new IDVariant(v_ANNODEL));
        IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0, new IDVariant(v_NUMERODEL));
      }
      if (Column.equals((new IDVariant(PFL_GENERAVARIAZ_PROPOSTA)), true))
      {
        if (FieldWasModified.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0))))
          {
            IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0, IDL.Upper(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0)));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_GENERAVARIAZ_DATAREG)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGDATREG, 0))))
        {
          if (IDL.Year(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGDATREG, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Errore, l'anno della data di registrazione deve appartenere a quello dell'esercizio del contesto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGDATREG, 0, IDL.Today());
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarimpCrono", "GenerazioneVariazioniOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarimpCrono", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Del
  // **********************************************************************
  public int InfoDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Del Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_ANNOPARAM, 0, IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO, 0, IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_SEDEPARAM, 0, IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFORMDELIBE, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarimpCrono", "InfoDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
  // **********************************************************************
  public int InfoProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposta Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGENUME, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEANNO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGENUME, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEANNO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarimpCrono", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta Prop
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Prop Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarimpCrono", "EtichettaSceltaProp", _e);
      return -1;
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
      if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0),(new IDVariant(""))).equals((new IDVariant("")), true) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0)) && IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0),(new IDVariant(""))).equals((new IDVariant("")), true) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGENUME, 0)) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEANNO, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare la Delibera o la Proposta."));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      else
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 || !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0))))
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0),(new IDVariant(""))).equals((new IDVariant("")), true) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0)))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Delibera incompleta"));
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 || !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGENUME, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEANNO, 0))))
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0),(new IDVariant(""))).equals((new IDVariant("")), true) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGENUME, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEANNO, 0)))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Proposta incompleta"));
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGDATREG, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Data di Registrazione obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.GENERAVARIMPCRONO(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEPROP, 0), IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGENUME, 0), IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMEOGGEANNO, 0), IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGSEDDEL, 0), IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGNUMDEL, 0), IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGANNDEL, 0), IMDB.Value(IMDBDef13.PQRY_PARS88, IMDBDef13.PQSL_PARS88_NOMOGGDATREG, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        CONFERMA = (new IDVariant(-1));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarimpCrono", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void LANGENVARCRO_PARS88() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARS88_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS89, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS89, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARS88_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARS88_RS, 0, IMDBDef4.TBL_PARS89, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS88_RS, 0, 0, IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMOGGSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS88_RS, 1, 0, IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMOGGNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS88_RS, 2, 0, IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMOGGANNDEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS88_RS, 3, 0, IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMEOGGEPROP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS88_RS, 4, 0, IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMEOGGENUME, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS88_RS, 5, 0, IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMEOGGEANNO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS88_RS, 6, 0, IMDBDef4.TBL_PARS89, IMDBDef4.FLD_PARS89_NOMOGGDATREG, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS89, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS89, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS89, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARS88_RS, 0);
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
  private void PAN_GENERAVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_GENERAVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_GENERAVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GENERAVARIAZ, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENERAVARIAZ_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_GENERAVARIAZ);
    // Stub
  }

  private void PAN_GENERAVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GENERAVARIAZ_SCELTADEL)
    {
      this.IdxPanelActived = this.PAN_GENERAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENERAVARIAZ_INFODEL)
    {
      this.IdxPanelActived = this.PAN_GENERAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENERAVARIAZ_SCELTAPROP)
    {
      this.IdxPanelActived = this.PAN_GENERAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaProp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENERAVARIAZ_INFOPROP)
    {
      this.IdxPanelActived = this.PAN_GENERAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENERAVARIAZ_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_GENERAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GENERAVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_GENERAVARIAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_GENERAVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_GENERAVARIAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_GENERAVARIAZ_Init()
  {

    PAN_GENERAVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GENERAVARIAZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_GENERAVARIAZ.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, "684AA7A0-BE15-4C71-AB01-A676CC5E2525");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, "Delibera");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, "7B2E2433-F5B6-4B75-B74F-7F57C3481B5E");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, "-");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, "5E1B45B0-E2CE-4EAF-8254-ECF2B12A91F1");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, "/");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, "EECA89A4-8EE0-4CE6-99E0-29B6958B3B51");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENERAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, 0, "wsearch1.gif", false);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, "315346B5-C5C8-4156-9094-B666880A38E0");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENERAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, 0, "info.gif", false);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, "73F392DC-54ED-4A73-9666-C07A9EE92764");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, "Proposta");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, "47921AA2-C12D-4B64-896C-EE2B459DCC11");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, "-");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, MyGlb.VIS_NORMFIELPADR);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, "F1ECDFB8-9D54-4793-991B-6B876951ED69");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, "/");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, "DAE440B7-9A82-4C56-8DDA-039D3644B291");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENERAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, 0, "wsearch1.gif", false);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, "9597F7C1-0A69-4155-B8A5-9213DEAC65C1");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENERAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, 0, "info.gif", false);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, "3AFDB8FF-6B81-4F79-ADBC-156AAC1E1BB5");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, "Data Reg.");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.VIS_NORMFIELPADR);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, "52203594-59DE-45C4-B114-EAA9663C9A5E");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, "Elabora");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_GENERAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, 0, "button1.gif", false);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_GENERAVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 60);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 28, 8, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 72);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_DELIBERA, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_DELIBERA, PPQRY_PARS88, "A.NOMOGGSEDDEL", "NOMOGGSEDDEL", 5, 255, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_LIST, 52);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_LIST, "-");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_FORM, 172, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_FORM, 16);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_FORM, "-");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_NUMERO, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_NUMERO, PPQRY_PARS88, "A.NOMOGGNUMDEL", "NOMOGGNUMDEL", 1, 5, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_LIST, "/");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_FORM, 240, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_FORM, 16);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_FORM, "/");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_ANNO, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_ANNO, PPQRY_PARS88, "A.NOMOGGANNDEL", "NOMOGGANNDEL", 1, 4, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, MyGlb.PANEL_LIST, 272, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, MyGlb.PANEL_LIST, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, MyGlb.PANEL_FORM, 308, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, MyGlb.PANEL_FORM, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTADEL, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_SCELTADEL, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_SCELTADEL, -1, "", "SCELTADEL", 0, 0, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, MyGlb.PANEL_LIST, 280, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, MyGlb.PANEL_LIST, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, MyGlb.PANEL_FORM, 328, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, MyGlb.PANEL_FORM, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFODEL, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_INFODEL, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_INFODEL, -1, "", "INFODEL", 0, 0, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 60);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 40, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_PROPOSTA, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_PROPOSTA, PPQRY_PARS88, "A.NOMEOGGEPROP", "NOMEOGGEPROP", 5, 255, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, MyGlb.PANEL_LIST, 52);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, MyGlb.PANEL_LIST, "-");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, MyGlb.PANEL_FORM, 172, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, MyGlb.PANEL_FORM, 16);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMEROPROP, MyGlb.PANEL_FORM, "-");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_NUMEROPROP, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_NUMEROPROP, PPQRY_PARS88, "A.NOMEOGGENUME", "NOMEOGGENUME", 1, 4, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, MyGlb.PANEL_LIST, 40);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, MyGlb.PANEL_LIST, "/");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, MyGlb.PANEL_FORM, 240, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, MyGlb.PANEL_FORM, 16);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNOPROP, MyGlb.PANEL_FORM, "/");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_ANNOPROP, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_ANNOPROP, PPQRY_PARS88, "A.NOMEOGGEANNO", "NOMEOGGEANNO", 1, 4, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, MyGlb.PANEL_LIST, 272, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, MyGlb.PANEL_LIST, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, MyGlb.PANEL_FORM, 308, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, MyGlb.PANEL_FORM, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_SCELTAPROP, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_SCELTAPROP, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_SCELTAPROP, -1, "", "SCELTAPROP", 0, 0, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_LIST, 280, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_LIST, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_FORM, 328, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_FORM, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_INFOPROP, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_INFOPROP, -1, "", "INFOPROP", 0, 0, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_LIST, 60);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_FORM, 40, 64, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_FORM, 60);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_FORM, "Data Reg");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_DATAREG, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_DATAREG, PPQRY_PARS88, "A.NOMOGGDATREG", "NOMOGGDATREG", 6, 14, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_LIST, 224, 180, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_FORM, 264, 96, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_ETICHEELABOR, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_GENERAVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENERAVARIAZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_GENERAVARIAZ.SetIMDB(IMDB, "PQRY_PARS88", true);
    PAN_GENERAVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_GENERAVARIAZ.SetQueryIMDB(PPQRY_PARS88, IMDBDef13.PQRY_PARS88_RS, IMDBDef4.TBL_PARS89);
    JustLoaded = true;
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_DELIBERA, IMDBDef4.FLD_PARS89_NOMOGGSEDDEL);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_NUMERO, IMDBDef4.FLD_PARS89_NOMOGGNUMDEL);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_ANNO, IMDBDef4.FLD_PARS89_NOMOGGANNDEL);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_PROPOSTA, IMDBDef4.FLD_PARS89_NOMEOGGEPROP);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_NUMEROPROP, IMDBDef4.FLD_PARS89_NOMEOGGENUME);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_ANNOPROP, IMDBDef4.FLD_PARS89_NOMEOGGEANNO);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_DATAREG, IMDBDef4.FLD_PARS89_NOMOGGDATREG);
    PAN_GENERAVARIAZ.SetMasterTable(0, "PARS89");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GENERAVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_GENERAVARIAZ.iUseListQBE;
      PAN_GENERAVARIAZ.iUseListQBE = 0;
      PAN_GENERAVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_GENERAVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_GENERAVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
