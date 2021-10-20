// **********************************************
// Situazione Variazioni Trattate
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneVariazioniTrattate extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int GRP_ENTRATA_COMPETENZA1 = 0;
  private static int GRP_ENTRATA_CASSA1 = 1;

  private static int PFL_ENTRATA_CODICESTRUT1 = 0;
  private static int PFL_ENTRATA_IVLIVELLO1 = 1;
  private static int PFL_ENTRATA_CAPITOLO1 = 2;
  private static int PFL_ENTRATA_ARTICOLO1 = 3;
  private static int PFL_ENTRATA_STNATTUALE1 = 4;
  private static int PFL_ENTRATA_VARIAZIONI1 = 5;
  private static int PFL_ENTRATA_STNDEFINITI1 = 6;
  private static int PFL_ENTRATA_RESIDUI1 = 7;
  private static int PFL_ENTRATA_STNATTUACAS1 = 8;
  private static int PFL_ENTRATA_VARIAZICASS1 = 9;
  private static int PFL_ENTRATA_DUASTNDEFCA1 = 10;
  private static int PFL_ENTRATA_DUALDIFF1 = 11;
  private static int PFL_ENTRATA_DUALINFO1 = 12;

  private static int PPQRY_VARCOM6 = 0;

  private static int PPQRY_DUAL1 = 1;


  IDPanel PAN_ENTRATA;
  private static int GRP_SPESA_COMPETENZA = 0;
  private static int GRP_SPESA_CASSA = 1;

  private static int PFL_SPESA_CODICESTRUTT = 0;
  private static int PFL_SPESA_IVLIVELLO = 1;
  private static int PFL_SPESA_CAPITOLO = 2;
  private static int PFL_SPESA_ARTICOLO = 3;
  private static int PFL_SPESA_STNATTUALE = 4;
  private static int PFL_SPESA_VARIAZIONI = 5;
  private static int PFL_SPESA_STNDEFINITIV = 6;
  private static int PFL_SPESA_RESIDUI = 7;
  private static int PFL_SPESA_STNATTUACASS = 8;
  private static int PFL_SPESA_VARIAZICASSA = 9;
  private static int PFL_SPESA_DUASTNDEFCAS = 10;
  private static int PFL_SPESA_DUALDIFF = 11;
  private static int PFL_SPESA_DUALINFO = 12;

  private static int PPQRY_VARCOM9 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_SPESA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS72(IMDB);
    //
    //
    Init_PQRY_VARCOM6(IMDB);
    Init_PQRY_VARCOM9(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS72(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS72, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS72, "TBL_PARS72");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS72,IMDBDef3.FLD_PARS72_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS72,IMDBDef3.FLD_PARS72_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS72,IMDBDef3.FLD_PARS72_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS72,IMDBDef3.FLD_PARS72_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS72,IMDBDef3.FLD_PARS72_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS72,IMDBDef3.FLD_PARS72_SEDE_DEL,5,255,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS72, 0);
  }

  private static void Init_PQRY_VARCOM6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM6, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM6, "PQRY_VARCOM6");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECCAPCODSTR, "RECCAPCODSTR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECCAPCODSTR,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_IVLIVELLO, "IVLIVELLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_IVLIVELLO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECORCAPARTI, "RECORCAPARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECORCAPARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECORSTNATTU, "RECORSTNATTU");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECORSTNATTU,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_VARIAZIONI,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RESIDUI, "RESIDUI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RESIDUI,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECSTNATTCAS, "RECSTNATTCAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_RECSTNATTCAS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_VARIAZICASSA, "VARIAZICASSA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM6,IMDBDef12.PQSL_VARCOM6_VARIAZICASSA,3,28,6);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM6, 0);
  }

  private static void Init_PQRY_VARCOM9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM9, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM9, "PQRY_VARCOM9");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECCAPCODSTR, "RECCAPCODSTR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECCAPCODSTR,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_IVLIVELLO, "IVLIVELLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_IVLIVELLO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECORCAPARTI, "RECORCAPARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECORCAPARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECORSTNATTU, "RECORSTNATTU");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECORSTNATTU,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_VARIAZIONI,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RESIDUI, "RESIDUI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RESIDUI,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECSTNATTCAS, "RECSTNATTCAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_RECSTNATTCAS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_VARIAZICASSA, "VARIAZICASSA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM9,IMDBDef12.PQSL_VARCOM9_VARIAZICASSA,3,28,6);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM9, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneVariazioniTrattate(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneVariazioniTrattate()
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
    FormIdx = MyGlb.FRM_SITUVARITRAT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "78814D23-9C21-4577-A212-03E1407B19D3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1100;
    DesignHeight = 602;
    set_Caption(new IDVariant("Situazioni variazioni trattate"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1100;
    Frames[1].Height = 576;
    Frames[1].Caption = "TAB";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 576;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "7F3255AE-533C-431A-8916-9C22408A0FA8";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Entrata";
    Frames[2].Parent = this;
    PAN_ENTRATA = new IDPanel(w, this, 2, "PAN_ENTRATA");
    Frames[2].Content = PAN_ENTRATA;
    PAN_ENTRATA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ENTRATA.VS = MainFrm.VisualStyleList;
    PAN_ENTRATA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1100-MyGlb.PAN_OFFS_X, 576-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "56078C1E-CAEC-4610-A61F-3F329CFF329C");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1596, 436, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ENTRATA.InitStatus = 2;
    PAN_ENTRATA_Init();
    PAN_ENTRATA_InitFields();
    PAN_ENTRATA_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Entrata", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Spesa";
    Frames[3].Parent = this;
    PAN_SPESA = new IDPanel(w, this, 3, "PAN_SPESA");
    Frames[3].Content = PAN_SPESA;
    PAN_SPESA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SPESA.VS = MainFrm.VisualStyleList;
    PAN_SPESA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1100-MyGlb.PAN_OFFS_X, 576-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DD8C0C51-C4A6-4101-B6BC-1DA194595BDC");
    PAN_SPESA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1596, 436, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SPESA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SPESA.InitStatus = 2;
    PAN_SPESA_Init();
    PAN_SPESA_InitFields();
    PAN_SPESA_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Spesa", "");
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG150+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_ANOMALICASS1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG150+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ANOMALICASSA+BaseCmdLinIdx)
      {
        AnomalieCassa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG162+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_ANOMALICASS1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG162+BaseCmdLinIdx), FormIdx, 1);
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
      PAN_ENTRATA.UpdatePanel(MainFrm);
      PAN_SPESA.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazioneVariazioniTrattate);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneVariazioniTrattate.class.getName() : (Glb.ClassWithPackage(SituazioneVariazioniTrattate.class) ? SituazioneVariazioniTrattate.class.getName().substring(SituazioneVariazioniTrattate.class.getPackage().getName().length() + 1) : SituazioneVariazioniTrattate.class.getName()));
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneVariazioniTrattate", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_SEDE_DEL, 0, new IDVariant());
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      IDVariant v_CAPTIONERR = new IDVariant(0,IDVariant.STRING);
      v_CAPTIONERR = (new IDVariant("Situazione Variazioni con anomalie di cassa"));
      if (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_SEDE_DEL, 0)))
      {
        set_Caption(new IDVariant(v_CAPTIONERR));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneVariazioniTrattate", "Load", _e);
    }
  }

  // **********************************************************************
  // Entrata On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ENTRATA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ENTRATA);
      // 
      // Entrata On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.ToFloat((new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_STNDEFINITI1)))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_STNDEFINITI1,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_STNDEFINITI1,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      if (IDL.ToFloat((new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_DUASTNDEFCA1)))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_DUASTNDEFCA1,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_DUASTNDEFCA1,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      if (IDL.ToFloat((new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_DUALDIFF1)))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_DUALDIFF1,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_DUALDIFF1,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneVariazioniTrattate", "EntrataOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Anomalie Cassa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AnomalieCassa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Anomalie Cassa Body
      // Corpo Procedura
      // 
      IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
      v_PAR1 = (new IDVariant("PROGR_SESSIONE"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Elenco_Cap_Cassa_Sup_Res_Comp"));
      MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneVariazioniTrattate", "AnomalieCassa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Spesa On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SPESA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SPESA);
      // 
      // Spesa On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.ToFloat((new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_STNDEFINITIV)))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_STNDEFINITIV,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_STNDEFINITIV,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      if (IDL.ToFloat((new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_DUASTNDEFCAS)))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_DUASTNDEFCAS,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_DUASTNDEFCAS,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      if (IDL.ToFloat((new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_DUALDIFF)))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_DUALDIFF,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_DUALDIFF,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneVariazioniTrattate", "SpesaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // DUAL Info E
  // **********************************************************************
  public int DUALInfoE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info E Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGETTES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_VARCOM6, IMDBDef12.PQSL_VARCOM6_RECORDCAPITO, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef12.PQRY_VARCOM6, IMDBDef12.PQSL_VARCOM6_RECORCAPARTI, 0));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_ANNO_DEL, 0, IMDB.Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_ANNO_DEL, 0));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NUMERO_DEL, 0, IMDB.Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_NUMERO_DEL, 0));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_SEDE_DEL, 0, IMDB.Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_SEDE_DEL, 0));
      MainFrm.Show(MyGlb.FRM_INFORMVARIAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneVariazioniTrattate", "DUALInfoE", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DUAL Info S
  // **********************************************************************
  public int DUALInfoS ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info S Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGETTES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_VARCOM9, IMDBDef12.PQSL_VARCOM9_RECORDCAPITO, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef12.PQRY_VARCOM9, IMDBDef12.PQSL_VARCOM9_RECORCAPARTI, 0));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_ANNO_DEL, 0, IMDB.Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_ANNO_DEL, 0));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NUMERO_DEL, 0, IMDB.Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_NUMERO_DEL, 0));
      IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_SEDE_DEL, 0, IMDB.Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_SEDE_DEL, 0));
      MainFrm.Show(MyGlb.FRM_INFORMVARIAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneVariazioniTrattate", "DUALInfoS", _e);
      return -1;
    }
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
  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ENTRATA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ENTRATA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ENTRATA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ENTRATA, Cancel);
    // Stub
  }

  private void PAN_ENTRATA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ENTRATA_DUALINFO1)
    {
      this.IdxPanelActived = this.PAN_ENTRATA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoE();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ENTRATA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ENTRATA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ENTRATA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SPESA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SPESA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SPESA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SPESA, Cancel);
    // Stub
  }

  private void PAN_SPESA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SPESA_DUALINFO)
    {
      this.IdxPanelActived = this.PAN_SPESA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoS();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SPESA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SPESA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SPESA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ENTRATA_Init()
  {

    PAN_ENTRATA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ENTRATA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, "9100CF30-91D6-4ACD-B4DF-F5E36CB302E3");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, "Competenza");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, MyGlb.VIS_DEFAPANESTYL);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, MyGlb.PANEL_LIST, 424, -9999, 412, 16, 0, 0);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, MyGlb.PANEL_FORM, 0, 99, 280, 97, 0, 0);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, 0, 71);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, 1, 13);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, 0, 4);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, 1, 4);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_GROUP, GRP_ENTRATA_COMPETENZA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, "00D83AD9-5C38-49BD-B438-DA0ECF7CB267");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, "Cassa");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, MyGlb.VIS_DEFAPANESTYL);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, MyGlb.PANEL_LIST, 984, -9999, 444, 16, 0, 0);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, MyGlb.PANEL_FORM, 0, 195, 316, 97, 0, 0);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, 0, 33);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, 1, 13);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, 0, 4);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, 1, 4);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_GROUP, GRP_ENTRATA_CASSA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ENTRATA.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, "DB73DD57-D055-4372-9FFA-96BDA4009981");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, "Codice");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, "FBFDBC57-231A-4DE8-B934-980B42E1AFF7");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, "IV Livello");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, "4684233F-8F15-4C30-B779-320FDB548CB2");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, "Capitolo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, "09C5797D-F397-4816-9B15-95395225DFEC");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, "Art.");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, "B15FFFEA-546A-4944-A158-3CE56A0DAAE5");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, "Stn. Attuale");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, "28B2AC2F-A581-43F6-8332-A10159072442");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, "Variazioni");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, "292B3CC2-FED5-4790-8598-D64A91B0CA59");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, "Stn. Definitivo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, "D349A7BF-135C-4688-8B97-C760076A9FA7");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, "Residui");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, "8B17732A-169D-4A03-A210-803112786B10");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, "Stn. Attuale");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, "F7F9C656-94C4-48FF-A42B-F997401BC58E");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, "Variazioni");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, "55F2CBDF-04F3-4522-ACB2-2265DEA3AF57");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, "Stn. Definitivo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, "C6062675-BB57-4DC3-9595-E284B0A1E352");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, "Diff. (Competenza + Residui) - Cassa");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, "EAD7ABA6-B581-49BD-9347-B164DD88B30C");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, " ");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, MyGlb.VIS_HYPELINKIMMA);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ENTRATA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, MyGlb.PANEL_LIST, 120);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, MyGlb.PANEL_LIST, "Codice");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, MyGlb.PANEL_FORM, 120);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICESTRUT1, MyGlb.PANEL_FORM, "Codice");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_CODICESTRUT1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_CODICESTRUT1, PPQRY_VARCOM6, "C.CODICE_STRUTTURA", "RECCAPCODSTR", 5, 10, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, MyGlb.PANEL_LIST, 120, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, MyGlb.PANEL_LIST, 56);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, MyGlb.PANEL_LIST, "IV Livello");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, MyGlb.PANEL_FORM, 56);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IVLIVELLO1, MyGlb.PANEL_FORM, "IV Liv.");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_IVLIVELLO1, -1, -1);
    PAN_ENTRATA.SetFieldUnbound(PFL_ENTRATA_IVLIVELLO1, true);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_IVLIVELLO1, PPQRY_VARCOM6, "TO_CHAR ( GET_COD_LIVELLO_4(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO) )", "IVLIVELLO", 5, 99, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, MyGlb.PANEL_LIST, 252, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, MyGlb.PANEL_FORM, 4, 76, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_CAPITOLO1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_CAPITOLO1, PPQRY_VARCOM6, "C.CAPITOLO", "RECORDCAPITO", 3, 16, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, MyGlb.PANEL_LIST, 392, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, MyGlb.PANEL_LIST, "Art.");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, MyGlb.PANEL_FORM, 68);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOLO1, MyGlb.PANEL_FORM, "Art.");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ARTICOLO1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ARTICOLO1, PPQRY_VARCOM6, "C.ARTICOLO", "RECORCAPARTI", 1, 2, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, MyGlb.PANEL_LIST, 424, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, MyGlb.PANEL_LIST, 88);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, MyGlb.PANEL_LIST, "Stn. Attuale");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, MyGlb.PANEL_FORM, 4, 124, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, MyGlb.PANEL_FORM, 88);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUALE1, MyGlb.PANEL_FORM, "Stn. Attuale");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_STNATTUALE1, -1, GRP_ENTRATA_COMPETENZA1);
    SQL = new StringBuffer();
    SQL.append("MAX(E.STN_INI_CO + NVL(( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(D.IMPORTO), 0) ");
  SQL.append("from ");
  SQL.append("  VARCOM D ");
  SQL.append("where (D.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (D.E_S = A.E_S) ");
  SQL.append("and   (D.CAPITOLO = C.CAPITOLO) ");
  SQL.append("and   (D.ARTICOLO = C.ARTICOLO) ");
  SQL.append("and   (D.SEDE_DEL || '-' || TO_CHAR ( D.NUMERO_DEL ) || '/' || TO_CHAR ( D.ANNO_DEL ) <> ~~TBL_PARS72.SEDE_DEL~~ || '-' || TO_CHAR ( ~~TBL_PARS72.NUMERO_DEL~~ ) || '/' || TO_CHAR ( ~~TBL_PARS72.ANNO_DEL~~ )) ");
  SQL.append("), 0))");
    PAN_ENTRATA.SetFieldUnbound(PFL_ENTRATA_STNATTUALE1, true);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_STNATTUALE1, PPQRY_VARCOM6, SQL.toString(), "RECORSTNATTU", 3, 28, 6, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, MyGlb.PANEL_LIST, 556, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, MyGlb.PANEL_LIST, "Variazioni");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, MyGlb.PANEL_FORM, 4, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZIONI1, MyGlb.PANEL_FORM, "Variazioni");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_VARIAZIONI1, -1, GRP_ENTRATA_COMPETENZA1);
    PAN_ENTRATA.SetFieldUnbound(PFL_ENTRATA_VARIAZIONI1, true);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_VARIAZIONI1, PPQRY_VARCOM6, "SUM(NVL(A.IMPORTO, 0))", "VARIAZIONI", 3, 28, 6, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, MyGlb.PANEL_LIST, 688, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, MyGlb.PANEL_LIST, 120);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, MyGlb.PANEL_LIST, "Stn. Definitivo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, MyGlb.PANEL_FORM, 4, 172, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, MyGlb.PANEL_FORM, 120);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNDEFINITI1, MyGlb.PANEL_FORM, "Stn. Definitivo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_STNDEFINITI1, -1, GRP_ENTRATA_COMPETENZA1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_STNDEFINITI1, PPQRY_DUAL1, "NVL(~~RECORSTNATTU~~, 0) + NVL(~~VARIAZIONI~~, 0)", "STNDEFINITIV", 3, 28, 6, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, MyGlb.PANEL_LIST, 836, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, MyGlb.PANEL_LIST, 52);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, MyGlb.PANEL_LIST, "Residui");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, MyGlb.PANEL_FORM, 4, 196, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, MyGlb.PANEL_FORM, 52);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_RESIDUI1, MyGlb.PANEL_FORM, "Residui");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_RESIDUI1, -1, -1);
    SQL = new StringBuffer();
    SQL.append("MAX(NVL(( ");
  SQL.append("select ");
  SQL.append("  SUM(F.SALDO_INI + NVL(F.VARIAZIONI, 0) + NVL(F.VARIAZIONI_RES, 0) - NVL(F.ORDINATIVI, 0)) ");
  SQL.append("from ");
  SQL.append("  ESEACC F ");
  SQL.append("where (F.ESERCIZIO = C.ESERCIZIO - 1) ");
  SQL.append("and   (F.CAPITOLO = C.CAPITOLO) ");
  SQL.append("and   (F.ARTICOLO = C.ARTICOLO) ");
  SQL.append("), 0))");
    PAN_ENTRATA.SetFieldUnbound(PFL_ENTRATA_RESIDUI1, true);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_RESIDUI1, PPQRY_VARCOM6, SQL.toString(), "RESIDUI", 3, 28, 6, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, MyGlb.PANEL_LIST, 984, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, MyGlb.PANEL_LIST, 108);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, MyGlb.PANEL_LIST, "Stn. Attuale");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, MyGlb.PANEL_FORM, 4, 220, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, MyGlb.PANEL_FORM, 108);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_STNATTUACAS1, MyGlb.PANEL_FORM, "Stn. Attuale");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_STNATTUACAS1, -1, GRP_ENTRATA_CASSA1);
    SQL = new StringBuffer();
    SQL.append("MAX(E.STN_INI_CA + NVL(( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(G.IMPORTO_CASSA), 0) ");
  SQL.append("from ");
  SQL.append("  VARCOM G ");
  SQL.append("where (G.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (G.E_S = A.E_S) ");
  SQL.append("and   (G.CAPITOLO = C.CAPITOLO) ");
  SQL.append("and   (G.ARTICOLO = C.ARTICOLO) ");
  SQL.append("and   (G.SEDE_DEL || '-' || TO_CHAR ( G.NUMERO_DEL ) || '/' || TO_CHAR ( G.ANNO_DEL ) <> ~~TBL_PARS72.SEDE_DEL~~ || '-' || TO_CHAR ( ~~TBL_PARS72.NUMERO_DEL~~ ) || '/' || TO_CHAR ( ~~TBL_PARS72.ANNO_DEL~~ )) ");
  SQL.append("), 0))");
    PAN_ENTRATA.SetFieldUnbound(PFL_ENTRATA_STNATTUACAS1, true);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_STNATTUACAS1, PPQRY_VARCOM6, SQL.toString(), "RECSTNATTCAS", 3, 28, 6, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, MyGlb.PANEL_LIST, 1132, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, MyGlb.PANEL_LIST, 100);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, MyGlb.PANEL_LIST, "Variazioni");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, MyGlb.PANEL_FORM, 4, 244, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, MyGlb.PANEL_FORM, 100);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_VARIAZICASS1, MyGlb.PANEL_FORM, "Variazioni");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_VARIAZICASS1, -1, GRP_ENTRATA_CASSA1);
    PAN_ENTRATA.SetFieldUnbound(PFL_ENTRATA_VARIAZICASS1, true);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_VARIAZICASS1, PPQRY_VARCOM6, "SUM(NVL(A.IMPORTO_CASSA, 0))", "VARIAZICASSA", 3, 28, 6, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, MyGlb.PANEL_LIST, 1280, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, MyGlb.PANEL_LIST, 156);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, MyGlb.PANEL_LIST, "Stn. Definitivo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, MyGlb.PANEL_FORM, 4, 268, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, MyGlb.PANEL_FORM, 156);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUASTNDEFCA1, MyGlb.PANEL_FORM, "Stn. Definitivo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_DUASTNDEFCA1, -1, GRP_ENTRATA_CASSA1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_DUASTNDEFCA1, PPQRY_DUAL1, "NVL(~~RECSTNATTCAS~~, 0) + NVL(~~VARIAZICASSA~~, 0)", "STNDEFINCASS", 3, 28, 6, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, MyGlb.PANEL_LIST, 1428, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, MyGlb.PANEL_LIST, 60);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, MyGlb.PANEL_LIST, "Diff. (Competenza + Residui) - Cassa");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, MyGlb.PANEL_FORM, 4, 292, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, MyGlb.PANEL_FORM, 60);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALDIFF1, MyGlb.PANEL_FORM, "D. C. R. C.");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_DUALDIFF1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_DUALDIFF1, PPQRY_DUAL1, "NVL(~~RECORSTNATTU~~, 0) + NVL(~~VARIAZIONI~~, 0) + ~~RESIDUI~~ - (NVL(~~RECSTNATTCAS~~, 0) + NVL(~~VARIAZICASSA~~, 0))", "DIFF", 3, 28, 6, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, MyGlb.PANEL_LIST, 1576, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, MyGlb.PANEL_LIST, " ");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, MyGlb.PANEL_FORM, 4, 316, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DUALINFO1, MyGlb.PANEL_FORM, " ");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_DUALINFO1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_DUALINFO1, PPQRY_DUAL1, "'I'", "DUALINFO", 5, 1, 0, -13997);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_DUALINFO1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_DUALINFO1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_DUALINFO1, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
  }

  private void PAN_ENTRATA_InitQueries()
  {
    StringBuffer SQL;

    PAN_ENTRATA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(~~RECORSTNATTU~~, 0) + NVL(~~VARIAZIONI~~, 0) as STNDEFINITIV, ");
    SQL.append("  NVL(~~RECSTNATTCAS~~, 0) + NVL(~~VARIAZICASSA~~, 0) as STNDEFINCASS, ");
    SQL.append("  NVL(~~RECORSTNATTU~~, 0) + NVL(~~VARIAZIONI~~, 0) + ~~RESIDUI~~ - (NVL(~~RECSTNATTCAS~~, 0) + NVL(~~VARIAZICASSA~~, 0)) as DIFF, ");
    SQL.append("  'I' as DUALINFO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECORDCAPITO~~ IS NULL))) ");
    PAN_ENTRATA.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetMasterTable(PPQRY_DUAL1, "DUAL");
    PAN_ENTRATA.SetIMDB(IMDB, "PQRY_VARCOM6", true);
    PAN_ENTRATA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.CODICE_STRUTTURA as RECCAPCODSTR, ");
    SQL.append("  TO_CHAR ( GET_COD_LIVELLO_4(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO) ) as IVLIVELLO, ");
    SQL.append("  C.CAPITOLO as RECORDCAPITO, ");
    SQL.append("  C.ARTICOLO as RECORCAPARTI, ");
    SQL.append("  MAX(E.STN_INI_CO + NVL(( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(D.IMPORTO), 0) ");
    SQL.append("from ");
    SQL.append("  VARCOM D ");
    SQL.append("where (D.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (D.E_S = A.E_S) ");
    SQL.append("and   (D.CAPITOLO = C.CAPITOLO) ");
    SQL.append("and   (D.ARTICOLO = C.ARTICOLO) ");
    SQL.append("and   (D.SEDE_DEL || '-' || TO_CHAR ( D.NUMERO_DEL ) || '/' || TO_CHAR ( D.ANNO_DEL ) <> ~~TBL_PARS72.SEDE_DEL~~ || '-' || TO_CHAR ( ~~TBL_PARS72.NUMERO_DEL~~ ) || '/' || TO_CHAR ( ~~TBL_PARS72.ANNO_DEL~~ )) ");
    SQL.append("), 0)) as RECORSTNATTU, ");
    SQL.append("  SUM(NVL(A.IMPORTO, 0)) as VARIAZIONI, ");
    SQL.append("  MAX(NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(F.SALDO_INI + NVL(F.VARIAZIONI, 0) + NVL(F.VARIAZIONI_RES, 0) - NVL(F.ORDINATIVI, 0)) ");
    SQL.append("from ");
    SQL.append("  ESEACC F ");
    SQL.append("where (F.ESERCIZIO = C.ESERCIZIO - 1) ");
    SQL.append("and   (F.CAPITOLO = C.CAPITOLO) ");
    SQL.append("and   (F.ARTICOLO = C.ARTICOLO) ");
    SQL.append("), 0)) as RESIDUI, ");
    SQL.append("  MAX(E.STN_INI_CA + NVL(( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(G.IMPORTO_CASSA), 0) ");
    SQL.append("from ");
    SQL.append("  VARCOM G ");
    SQL.append("where (G.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (G.E_S = A.E_S) ");
    SQL.append("and   (G.CAPITOLO = C.CAPITOLO) ");
    SQL.append("and   (G.ARTICOLO = C.ARTICOLO) ");
    SQL.append("and   (G.SEDE_DEL || '-' || TO_CHAR ( G.NUMERO_DEL ) || '/' || TO_CHAR ( G.ANNO_DEL ) <> ~~TBL_PARS72.SEDE_DEL~~ || '-' || TO_CHAR ( ~~TBL_PARS72.NUMERO_DEL~~ ) || '/' || TO_CHAR ( ~~TBL_PARS72.ANNO_DEL~~ )) ");
    SQL.append("), 0)) as RECSTNATTCAS, ");
    SQL.append("  SUM(NVL(A.IMPORTO_CASSA, 0)) as VARIAZICASSA ");
    PAN_ENTRATA.SetQuery(PPQRY_VARCOM6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOM A, ");
    SQL.append("  CAP C, ");
    SQL.append("  BIL E ");
    PAN_ENTRATA.SetQuery(PPQRY_VARCOM6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (((A.SEDE_DEL = ~~TBL_PARS72.SEDE_DEL~~ AND A.NUMERO_DEL = ~~TBL_PARS72.NUMERO_DEL~~ AND A.ANNO_DEL = ~~TBL_PARS72.ANNO_DEL~~) AND NOT ((~~TBL_PARS72.SEDE_DEL~~ IS NULL))) OR ((~~TBL_PARS72.SEDE_DEL~~ IS NULL) AND EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  WRK_CONTROLLO_ESEC_VAR B ");
    SQL.append("where (B.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append(")))) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (C.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (C.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (E.ESERCIZIO = C.ESERCIZIO) ");
    SQL.append("and   (E.E_S = C.E_S) ");
    SQL.append("and   (E.CAPITOLO = C.CAPITOLO) ");
    SQL.append("and   (E.ARTICOLO = C.ARTICOLO) ");
    PAN_ENTRATA.SetQuery(PPQRY_VARCOM6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  C.CODICE_STRUTTURA, ");
    SQL.append("  TO_CHAR ( GET_COD_LIVELLO_4(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO) ), ");
    SQL.append("  C.CAPITOLO, ");
    SQL.append("  C.ARTICOLO ");
    PAN_ENTRATA.SetQuery(PPQRY_VARCOM6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ENTRATA.SetQuery(PPQRY_VARCOM6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ENTRATA.SetQuery(PPQRY_VARCOM6, 5, SQL, -1, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_VARCOM6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetMasterTable(0, "VARCOM");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ENTRATA.Status() == 2)
    {
      int oldListQBE = PAN_ENTRATA.iUseListQBE;
      PAN_ENTRATA.iUseListQBE = 0;
      PAN_ENTRATA.PanelCommand(Glb.PCM_SEARCH);
      PAN_ENTRATA.PanelCommand(Glb.PCM_FIND);
      PAN_ENTRATA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SPESA_Init()
  {

    PAN_SPESA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SPESA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, "421928EA-B4AA-4C40-BBE0-F4EEAA0C2EC7");
    PAN_SPESA.set_Header(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, "Competenza");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, MyGlb.VIS_DEFAPANESTYL);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, MyGlb.PANEL_LIST, 424, -9999, 412, 16, 0, 0);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, MyGlb.PANEL_FORM, 0, 99, 280, 97, 0, 0);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, 0, 71);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, 1, 13);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, 0, 4);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, 1, 4);
    PAN_SPESA.SetFlags(MyGlb.OBJ_GROUP, GRP_SPESA_COMPETENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, "C48162AA-1DD8-4BC6-9406-73357ECCDD7D");
    PAN_SPESA.set_Header(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, "Cassa");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, MyGlb.VIS_DEFAPANESTYL);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, MyGlb.PANEL_LIST, 984, -9999, 444, 16, 0, 0);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, MyGlb.PANEL_FORM, 0, 195, 316, 97, 0, 0);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, 0, 33);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, 1, 13);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, 0, 4);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, 1, 4);
    PAN_SPESA.SetFlags(MyGlb.OBJ_GROUP, GRP_SPESA_CASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SPESA.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, "4C66BAE6-702D-449A-AB83-A0C3127AD738");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, "Codice");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, "FACA714B-5EC3-4A08-84B5-8D9EC33A5898");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, "IV Livello");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, "3F100548-8CDB-4239-8708-88B07524C6F3");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, "Capitolo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, "39EA8F1D-55B9-4592-8127-664622659333");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, "Art.");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, "41F0DFD7-ECE5-4007-9D49-2C4D7AAE8C1E");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, "Stn. Attuale");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, "7151BE37-3994-4030-87FE-72701AF840DA");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, "Variazioni");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, "44EF5446-156D-490A-81E2-519E3DAAD1E0");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, "Stn. Definitivo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, "84A13C5E-C0F8-43BA-93D2-3A7A1E09F642");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, "Residui");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, "D67205A2-FED2-445D-9F5B-37B345DDAD30");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, "Stn. Attuale");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, "52EBEC7E-7FCA-4174-AD86-546BE6C167CE");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, "Variazioni");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, "7CF58AAC-A8A1-4D7C-B0D4-E3ED4F7B680D");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, "Stn. Definitivo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, "A366BB40-CF74-4361-BD86-5E143B489526");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, "Diff. (Competenza + Residui) - Cassa");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, "B479051F-E3F3-494B-BCBD-1F94FA857953");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, " ");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SPESA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, MyGlb.PANEL_LIST, 120);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, MyGlb.PANEL_LIST, "Codice");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, MyGlb.PANEL_FORM, 120);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CODICESTRUTT, MyGlb.PANEL_FORM, "Codice");
    PAN_SPESA.SetFieldPage(PFL_SPESA_CODICESTRUTT, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_CODICESTRUTT, PPQRY_VARCOM9, "C.CODICE_STRUTTURA", "RECCAPCODSTR", 5, 10, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, MyGlb.PANEL_LIST, 120, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, MyGlb.PANEL_LIST, 56);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, MyGlb.PANEL_LIST, "IV Livello");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, MyGlb.PANEL_FORM, 56);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IVLIVELLO, MyGlb.PANEL_FORM, "IV Liv.");
    PAN_SPESA.SetFieldPage(PFL_SPESA_IVLIVELLO, -1, -1);
    PAN_SPESA.SetFieldUnbound(PFL_SPESA_IVLIVELLO, true);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_IVLIVELLO, PPQRY_VARCOM9, "TO_CHAR ( GET_COD_LIVELLO_4(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO) )", "IVLIVELLO", 5, 99, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, MyGlb.PANEL_LIST, 252, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, MyGlb.PANEL_FORM, 4, 76, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_CAPITOLO, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_CAPITOLO, PPQRY_VARCOM9, "C.CAPITOLO", "RECORDCAPITO", 3, 16, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, MyGlb.PANEL_LIST, 392, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ARTICOLO, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ARTICOLO, PPQRY_VARCOM9, "C.ARTICOLO", "RECORCAPARTI", 1, 2, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, MyGlb.PANEL_LIST, 424, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, MyGlb.PANEL_LIST, 88);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, MyGlb.PANEL_LIST, "Stn. Attuale");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, MyGlb.PANEL_FORM, 4, 124, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, MyGlb.PANEL_FORM, 88);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUALE, MyGlb.PANEL_FORM, "Stn. Attuale");
    PAN_SPESA.SetFieldPage(PFL_SPESA_STNATTUALE, -1, GRP_SPESA_COMPETENZA);
    SQL = new StringBuffer();
    SQL.append("MAX(E.STN_INI_CO + NVL(( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(D.IMPORTO), 0) ");
  SQL.append("from ");
  SQL.append("  VARCOM D ");
  SQL.append("where (D.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (D.E_S = A.E_S) ");
  SQL.append("and   (D.CAPITOLO = C.CAPITOLO) ");
  SQL.append("and   (D.ARTICOLO = C.ARTICOLO) ");
  SQL.append("and   (D.SEDE_DEL || '-' || TO_CHAR ( D.NUMERO_DEL ) || '/' || TO_CHAR ( D.ANNO_DEL ) <> ~~TBL_PARS72.SEDE_DEL~~ || '-' || TO_CHAR ( ~~TBL_PARS72.NUMERO_DEL~~ ) || '/' || TO_CHAR ( ~~TBL_PARS72.ANNO_DEL~~ )) ");
  SQL.append("), 0))");
    PAN_SPESA.SetFieldUnbound(PFL_SPESA_STNATTUALE, true);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_STNATTUALE, PPQRY_VARCOM9, SQL.toString(), "RECORSTNATTU", 3, 28, 6, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, MyGlb.PANEL_LIST, 556, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, MyGlb.PANEL_LIST, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, MyGlb.PANEL_FORM, 4, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, MyGlb.PANEL_FORM, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_SPESA.SetFieldPage(PFL_SPESA_VARIAZIONI, -1, GRP_SPESA_COMPETENZA);
    PAN_SPESA.SetFieldUnbound(PFL_SPESA_VARIAZIONI, true);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_VARIAZIONI, PPQRY_VARCOM9, "SUM(NVL(A.IMPORTO, 0))", "VARIAZIONI", 3, 28, 6, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, MyGlb.PANEL_LIST, 688, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, MyGlb.PANEL_LIST, 120);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, MyGlb.PANEL_LIST, "Stn. Definitivo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, MyGlb.PANEL_FORM, 4, 172, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, MyGlb.PANEL_FORM, 120);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_STNDEFINITIV, MyGlb.PANEL_FORM, "Stn. Definitivo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_STNDEFINITIV, -1, GRP_SPESA_COMPETENZA);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_STNDEFINITIV, PPQRY_DUAL, "NVL(~~RECORSTNATTU~~, 0) + NVL(~~VARIAZIONI~~, 0)", "STNDEFINITIV", 3, 28, 6, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, MyGlb.PANEL_LIST, 836, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, MyGlb.PANEL_LIST, 52);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, MyGlb.PANEL_LIST, "Residui");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, MyGlb.PANEL_FORM, 4, 196, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, MyGlb.PANEL_FORM, 52);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_RESIDUI, MyGlb.PANEL_FORM, "Residui");
    PAN_SPESA.SetFieldPage(PFL_SPESA_RESIDUI, -1, -1);
    SQL = new StringBuffer();
    SQL.append("MAX(NVL(( ");
  SQL.append("select ");
  SQL.append("  SUM(F.SALDO_INI + NVL(F.VARIAZIONI, 0) + NVL(F.VARIAZIONI_RES, 0) - NVL(F.MANDATI, 0)) ");
  SQL.append("from ");
  SQL.append("  ESEIMP F ");
  SQL.append("where (F.ESERCIZIO = C.ESERCIZIO - 1) ");
  SQL.append("and   (F.CAPITOLO = C.CAPITOLO) ");
  SQL.append("and   (F.ARTICOLO = C.ARTICOLO) ");
  SQL.append("), 0))");
    PAN_SPESA.SetFieldUnbound(PFL_SPESA_RESIDUI, true);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_RESIDUI, PPQRY_VARCOM9, SQL.toString(), "RESIDUI", 3, 28, 6, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, MyGlb.PANEL_LIST, 984, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, MyGlb.PANEL_LIST, 108);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, MyGlb.PANEL_LIST, "Stn. Attuale");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, MyGlb.PANEL_FORM, 4, 220, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, MyGlb.PANEL_FORM, 108);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_STNATTUACASS, MyGlb.PANEL_FORM, "Stn. Attuale");
    PAN_SPESA.SetFieldPage(PFL_SPESA_STNATTUACASS, -1, GRP_SPESA_CASSA);
    SQL = new StringBuffer();
    SQL.append("MAX(E.STN_INI_CA + NVL(( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(G.IMPORTO_CASSA), 0) ");
  SQL.append("from ");
  SQL.append("  VARCOM G ");
  SQL.append("where (G.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (G.E_S = A.E_S) ");
  SQL.append("and   (G.CAPITOLO = C.CAPITOLO) ");
  SQL.append("and   (G.ARTICOLO = C.ARTICOLO) ");
  SQL.append("and   (G.SEDE_DEL || '-' || TO_CHAR ( G.NUMERO_DEL ) || '/' || TO_CHAR ( G.ANNO_DEL ) <> ~~TBL_PARS72.SEDE_DEL~~ || '-' || TO_CHAR ( ~~TBL_PARS72.NUMERO_DEL~~ ) || '/' || TO_CHAR ( ~~TBL_PARS72.ANNO_DEL~~ )) ");
  SQL.append("), 0))");
    PAN_SPESA.SetFieldUnbound(PFL_SPESA_STNATTUACASS, true);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_STNATTUACASS, PPQRY_VARCOM9, SQL.toString(), "RECSTNATTCAS", 3, 28, 6, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, MyGlb.PANEL_LIST, 1132, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, MyGlb.PANEL_LIST, 100);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, MyGlb.PANEL_LIST, "Variazioni");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, MyGlb.PANEL_FORM, 4, 244, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, MyGlb.PANEL_FORM, 100);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_VARIAZICASSA, MyGlb.PANEL_FORM, "Variazioni");
    PAN_SPESA.SetFieldPage(PFL_SPESA_VARIAZICASSA, -1, GRP_SPESA_CASSA);
    PAN_SPESA.SetFieldUnbound(PFL_SPESA_VARIAZICASSA, true);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_VARIAZICASSA, PPQRY_VARCOM9, "SUM(NVL(A.IMPORTO_CASSA, 0))", "VARIAZICASSA", 3, 28, 6, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, MyGlb.PANEL_LIST, 1280, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, MyGlb.PANEL_LIST, 156);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, MyGlb.PANEL_LIST, "Stn. Definitivo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, MyGlb.PANEL_FORM, 4, 268, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, MyGlb.PANEL_FORM, 156);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DUASTNDEFCAS, MyGlb.PANEL_FORM, "Stn. Definitivo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_DUASTNDEFCAS, -1, GRP_SPESA_CASSA);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_DUASTNDEFCAS, PPQRY_DUAL, "NVL(~~RECSTNATTCAS~~, 0) + NVL(~~VARIAZICASSA~~, 0)", "STNDEFINCASS", 3, 28, 6, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, MyGlb.PANEL_LIST, 1428, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, MyGlb.PANEL_LIST, 60);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, MyGlb.PANEL_LIST, "Diff. (Competenza + Residui) - Cassa");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, MyGlb.PANEL_FORM, 4, 292, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, MyGlb.PANEL_FORM, 60);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DUALDIFF, MyGlb.PANEL_FORM, "D. C. R. C.");
    PAN_SPESA.SetFieldPage(PFL_SPESA_DUALDIFF, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_DUALDIFF, PPQRY_DUAL, "NVL(~~RECORSTNATTU~~, 0) + NVL(~~VARIAZIONI~~, 0) + ~~RESIDUI~~ - (NVL(~~RECSTNATTCAS~~, 0) + NVL(~~VARIAZICASSA~~, 0))", "DIFF", 3, 28, 6, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, MyGlb.PANEL_LIST, 1576, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, MyGlb.PANEL_LIST, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, MyGlb.PANEL_LIST, " ");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, MyGlb.PANEL_FORM, 4, 316, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, MyGlb.PANEL_FORM, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DUALINFO, MyGlb.PANEL_FORM, " ");
    PAN_SPESA.SetFieldPage(PFL_SPESA_DUALINFO, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_DUALINFO, PPQRY_DUAL, "'I'", "DUALINFO", 5, 1, 0, -13997);
    PAN_SPESA.SetValueListItem(PFL_SPESA_DUALINFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_DUALINFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_DUALINFO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
  }

  private void PAN_SPESA_InitQueries()
  {
    StringBuffer SQL;

    PAN_SPESA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(~~RECORSTNATTU~~, 0) + NVL(~~VARIAZIONI~~, 0) as STNDEFINITIV, ");
    SQL.append("  NVL(~~RECSTNATTCAS~~, 0) + NVL(~~VARIAZICASSA~~, 0) as STNDEFINCASS, ");
    SQL.append("  NVL(~~RECORSTNATTU~~, 0) + NVL(~~VARIAZIONI~~, 0) + ~~RESIDUI~~ - (NVL(~~RECSTNATTCAS~~, 0) + NVL(~~VARIAZICASSA~~, 0)) as DIFF, ");
    SQL.append("  'I' as DUALINFO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECORDCAPITO~~ IS NULL))) ");
    PAN_SPESA.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_SPESA.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_SPESA.SetIMDB(IMDB, "PQRY_VARCOM9", true);
    PAN_SPESA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.CODICE_STRUTTURA as RECCAPCODSTR, ");
    SQL.append("  TO_CHAR ( GET_COD_LIVELLO_4(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO) ) as IVLIVELLO, ");
    SQL.append("  C.CAPITOLO as RECORDCAPITO, ");
    SQL.append("  C.ARTICOLO as RECORCAPARTI, ");
    SQL.append("  MAX(E.STN_INI_CO + NVL(( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(D.IMPORTO), 0) ");
    SQL.append("from ");
    SQL.append("  VARCOM D ");
    SQL.append("where (D.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (D.E_S = A.E_S) ");
    SQL.append("and   (D.CAPITOLO = C.CAPITOLO) ");
    SQL.append("and   (D.ARTICOLO = C.ARTICOLO) ");
    SQL.append("and   (D.SEDE_DEL || '-' || TO_CHAR ( D.NUMERO_DEL ) || '/' || TO_CHAR ( D.ANNO_DEL ) <> ~~TBL_PARS72.SEDE_DEL~~ || '-' || TO_CHAR ( ~~TBL_PARS72.NUMERO_DEL~~ ) || '/' || TO_CHAR ( ~~TBL_PARS72.ANNO_DEL~~ )) ");
    SQL.append("), 0)) as RECORSTNATTU, ");
    SQL.append("  SUM(NVL(A.IMPORTO, 0)) as VARIAZIONI, ");
    SQL.append("  MAX(NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(F.SALDO_INI + NVL(F.VARIAZIONI, 0) + NVL(F.VARIAZIONI_RES, 0) - NVL(F.MANDATI, 0)) ");
    SQL.append("from ");
    SQL.append("  ESEIMP F ");
    SQL.append("where (F.ESERCIZIO = C.ESERCIZIO - 1) ");
    SQL.append("and   (F.CAPITOLO = C.CAPITOLO) ");
    SQL.append("and   (F.ARTICOLO = C.ARTICOLO) ");
    SQL.append("), 0)) as RESIDUI, ");
    SQL.append("  MAX(E.STN_INI_CA + NVL(( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(G.IMPORTO_CASSA), 0) ");
    SQL.append("from ");
    SQL.append("  VARCOM G ");
    SQL.append("where (G.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (G.E_S = A.E_S) ");
    SQL.append("and   (G.CAPITOLO = C.CAPITOLO) ");
    SQL.append("and   (G.ARTICOLO = C.ARTICOLO) ");
    SQL.append("and   (G.SEDE_DEL || '-' || TO_CHAR ( G.NUMERO_DEL ) || '/' || TO_CHAR ( G.ANNO_DEL ) <> ~~TBL_PARS72.SEDE_DEL~~ || '-' || TO_CHAR ( ~~TBL_PARS72.NUMERO_DEL~~ ) || '/' || TO_CHAR ( ~~TBL_PARS72.ANNO_DEL~~ )) ");
    SQL.append("), 0)) as RECSTNATTCAS, ");
    SQL.append("  SUM(NVL(A.IMPORTO_CASSA, 0)) as VARIAZICASSA ");
    PAN_SPESA.SetQuery(PPQRY_VARCOM9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOM A, ");
    SQL.append("  CAP C, ");
    SQL.append("  BIL E ");
    PAN_SPESA.SetQuery(PPQRY_VARCOM9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (((A.SEDE_DEL = ~~TBL_PARS72.SEDE_DEL~~ AND A.NUMERO_DEL = ~~TBL_PARS72.NUMERO_DEL~~ AND A.ANNO_DEL = ~~TBL_PARS72.ANNO_DEL~~) AND NOT ((~~TBL_PARS72.SEDE_DEL~~ IS NULL))) OR ((~~TBL_PARS72.SEDE_DEL~~ IS NULL) AND EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  WRK_CONTROLLO_ESEC_VAR B ");
    SQL.append("where (B.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append(")))) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (C.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (C.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (E.ESERCIZIO = C.ESERCIZIO) ");
    SQL.append("and   (E.E_S = C.E_S) ");
    SQL.append("and   (E.CAPITOLO = C.CAPITOLO) ");
    SQL.append("and   (E.ARTICOLO = C.ARTICOLO) ");
    PAN_SPESA.SetQuery(PPQRY_VARCOM9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  C.CODICE_STRUTTURA, ");
    SQL.append("  TO_CHAR ( GET_COD_LIVELLO_4(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO) ), ");
    SQL.append("  C.CAPITOLO, ");
    SQL.append("  C.ARTICOLO ");
    PAN_SPESA.SetQuery(PPQRY_VARCOM9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SPESA.SetQuery(PPQRY_VARCOM9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SPESA.SetQuery(PPQRY_VARCOM9, 5, SQL, -1, "");
    PAN_SPESA.SetQueryDB(PPQRY_VARCOM9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetMasterTable(0, "VARCOM");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SPESA.Status() == 2)
    {
      int oldListQBE = PAN_SPESA.iUseListQBE;
      PAN_SPESA.iUseListQBE = 0;
      PAN_SPESA.PanelCommand(Glb.PCM_SEARCH);
      PAN_SPESA.PanelCommand(Glb.PCM_FIND);
      PAN_SPESA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SPESA) PAN_SPESA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_ValidateRow(Cancel);
    if (SrcObj == PAN_SPESA) PAN_SPESA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_DynamicProperties();
    if (SrcObj == PAN_SPESA) PAN_SPESA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SPESA) PAN_SPESA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SPESA) PAN_SPESA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TAB) TAB_TAB_Click(PreviousPage, Cancel);
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
