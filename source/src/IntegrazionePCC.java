// **********************************************
// Integrazione PCC
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class IntegrazionePCC extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_INTEGRAZIPCC_ETICHETITOLO = 0;
  private static int PFL_INTEGRAZIPCC_ETICNUMEDOCU = 1;
  private static int PFL_INTEGRAZIPCC_INSERITDACFA = 2;
  private static int PFL_INTEGRAZIPCC_INFOINSDACFA = 3;
  private static int PFL_INTEGRAZIPCC_COMUNIRICEZI = 4;
  private static int PFL_INTEGRAZIPCC_INFOCOMRIC = 5;
  private static int PFL_INTEGRAZIPCC_ATTESAACCETT = 6;
  private static int PFL_INTEGRAZIPCC_INFOATTACC = 7;
  private static int PFL_INTEGRAZIPCC_FEINPCCDASDI = 8;
  private static int PFL_INTEGRAZIPCC_INFOFEPCC = 9;
  private static int PFL_INTEGRAZIPCC_COMUNICONTAB = 10;
  private static int PFL_INTEGRAZIPCC_INFOCOMCONT = 11;
  private static int PFL_INTEGRAZIPCC_COMUNISCADUT = 12;
  private static int PFL_INTEGRAZIPCC_INFOCOMSCAD = 13;
  private static int PFL_INTEGRAZIPCC_COMUPAGAPARZ = 14;
  private static int PFL_INTEGRAZIPCC_INFCOMPAGPAR = 15;

  private static int PPQRY_PCCDOCUMENT1 = 0;


  IDPanel PAN_INTEGRAZIPCC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI611(IMDB);
    //
    //
    Init_PQRY_PCCDOCUMENT1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI611(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI611, 1);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI611, "TBL_PARAMETRI611");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI611,IMDBDef2.FLD_PARAMETRI611_PARAMAGGIORN, "PARAMAGGIORN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI611,IMDBDef2.FLD_PARAMETRI611_PARAMAGGIORN,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI611, 0);
  }

  private static void Init_PQRY_PCCDOCUMENT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PCCDOCUMENT1, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_PCCDOCUMENT1, "PQRY_PCCDOCUMENT1");
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_INSERITDACFA, "INSERITDACFA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_INSERITDACFA,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_ATTESAACCETT, "ATTESAACCETT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_ATTESAACCETT,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_COMUNIRICEZI, "COMUNIRICEZI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_COMUNIRICEZI,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_FEINPCCDASDI, "FEINPCCDASDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_FEINPCCDASDI,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_COMUNICONTAB, "COMUNICONTAB");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_COMUNICONTAB,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_COMUNISCADUT, "COMUNISCADUT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_COMUNISCADUT,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_COMUPAGAPARZ, "COMUPAGAPARZ");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCDOCUMENT1,IMDBDef10.PQSL_PCCDOCUMENT1_COMUPAGAPARZ,1,19,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PCCDOCUMENT1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public IntegrazionePCC(MyWebEntryPoint w, IMDBObj imdb)
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
  public IntegrazionePCC()
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
    FormIdx = MyGlb.FRM_INTEGRAZIPCC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C19E13D7-FCAA-4685-A917-D2119A6C22EE";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 744;
    DesignHeight = 294;
    set_Caption(new IDVariant("Integrazione PCC"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 744;
    Frames[1].Height = 268;
    Frames[1].Caption = "Integrazione PCC";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 268;
    PAN_INTEGRAZIPCC = new IDPanel(w, this, 1, "PAN_INTEGRAZIPCC");
    Frames[1].Content = PAN_INTEGRAZIPCC;
    PAN_INTEGRAZIPCC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INTEGRAZIPCC.VS = MainFrm.VisualStyleList;
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 744-MyGlb.PAN_OFFS_X, 268-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EEA5571B-CAC5-42E5-A60A-80EAA4CB9EF8");
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2644, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INTEGRAZIPCC.InitStatus = 2;
    PAN_INTEGRAZIPCC_Init();
    PAN_INTEGRAZIPCC_InitFields();
    PAN_INTEGRAZIPCC_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG180+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG179+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG180+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INSEDOCDACFA+BaseCmdLinIdx)
      {
        InserisciDocumentiDaCFA();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMURICEAPCC+BaseCmdLinIdx)
      {
        ComunicaRicezioneAPCC();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REICOMRICAPC+BaseCmdLinIdx)
      {
        ReinviaComunicaRicezioneaPCC();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMUCONTAPCC+BaseCmdLinIdx)
      {
        ComunicaContabilizzazioneAPCC();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMUSCADAPCC+BaseCmdLinIdx)
      {
        ComunicaScadutoAPCC();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FILECOMUNPCC+BaseCmdLinIdx)
      {
        FileComunicazioniPCC();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DETTAGDOCUME+BaseCmdLinIdx)
      {
        DettaglioDocumenti();
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
      PAN_INTEGRAZIPCC.UpdatePanel(MainFrm);
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
    return (obj instanceof IntegrazionePCC);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? IntegrazionePCC.class.getName() : (Glb.ClassWithPackage(IntegrazionePCC.class) ? IntegrazionePCC.class.getName().substring(IntegrazionePCC.class.getPackage().getName().length() + 1) : IntegrazionePCC.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Integrazione PCC After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_INTEGRAZIPCC_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Integrazione PCC After Find Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENT1, IMDBDef10.PQSL_PCCDOCUMENT1_INSERITDACFA, 0).compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_COMURICEAPCC+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_COMURICEAPCC+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENT1, IMDBDef10.PQSL_PCCDOCUMENT1_COMUNIRICEZI, 0).compareTo((new IDVariant(0)), true)>0 || IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENT1, IMDBDef10.PQSL_PCCDOCUMENT1_FEINPCCDASDI, 0).compareTo((new IDVariant(0)), true)>0 || IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENT1, IMDBDef10.PQSL_PCCDOCUMENT1_COMUNICONTAB, 0).compareTo((new IDVariant(0)), true)>0 || IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENT1, IMDBDef10.PQSL_PCCDOCUMENT1_COMUNISCADUT, 0).compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_COMUCONTAPCC+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_COMUCONTAPCC+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENT1, IMDBDef10.PQSL_PCCDOCUMENT1_COMUNICONTAB, 0).compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_COMUSCADAPCC+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_COMUSCADAPCC+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "IntegrazionePCCAfterFind", _e);
    }
  }

  // **********************************************************************
  // Info Ins Da CFA
  // **********************************************************************
  public int InfoInsDaCFA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Ins Da CFA Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGDOCUME,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0, (new IDVariant("10")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARTIPPROREG, 0, (new IDVariant("RUF")));
      MainFrm.Show(MyGlb.FRM_DETTAGDOCUME, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "InfoInsDaCFA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Com Ric
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoComRic ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Com Ric Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGDOCUME,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0, (new IDVariant("30")));
      MainFrm.Show(MyGlb.FRM_DETTAGDOCUME, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "InfoComRic", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Att Acc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAttAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Att Acc Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGDOCUME,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0, (new IDVariant("25")));
      MainFrm.Show(MyGlb.FRM_DETTAGDOCUME, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "InfoAttAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info FE PCC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoFEPCC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info FE PCC Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGDOCUME,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0, (new IDVariant("31")));
      MainFrm.Show(MyGlb.FRM_DETTAGDOCUME, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "InfoFEPCC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Com Cont
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoComCont ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Com Cont Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGDOCUME,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0, (new IDVariant("40")));
      MainFrm.Show(MyGlb.FRM_DETTAGDOCUME, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "InfoComCont", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Com Scad
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoComScad ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Com Scad Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGDOCUME,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0, (new IDVariant("50")));
      MainFrm.Show(MyGlb.FRM_DETTAGDOCUME, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "InfoComScad", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Com Pag Parz
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoComPagParz ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Com Pag Parz Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGDOCUME,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARAMAZIONE, 0, (new IDVariant("70")));
      MainFrm.Show(MyGlb.FRM_DETTAGDOCUME, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "InfoComPagParz", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Inserisci Documenti Da CFA
  // **********************************************************************
  public int InserisciDocumentiDaCFA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Inserisci Documenti Da CFA Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_INSEDOCDACFA, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "InserisciDocumentiDaCFA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comunica Ricezione A PCC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ComunicaRicezioneAPCC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comunica Ricezione A PCC Body
      // Corpo Procedura
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Confermi la produzione del file excel da comunicare a PCC relativamente ai "));
      IDVariant v_AVVISO2 = new IDVariant(0,IDVariant.STRING);
      v_AVVISO2 = (new IDVariant(" documenti estratti da CFA e non ancora comunicati a PCC?"));
      if (MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENT1, IMDBDef10.PQSL_PCCDOCUMENT1_INSERITDACFA, 0))), v_AVVISO2)))
      {
        IDVariant v_NUMDOCELAB = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NOMEFILE = null;
        v_NOMEFILE = (new IDVariant());
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.PCCFILERICEZIONE(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_NUMDOCELAB, v_NOMEFILE);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI605, IMDBDef2.FLD_PARAMETRI605_PARAMDOCELAB, 0, new IDVariant(v_NUMDOCELAB));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI605, IMDBDef2.FLD_PARAMETRI605_PARANOMEFILE, 0, new IDVariant(v_NOMEFILE));
          MainFrm.Show(MyGlb.FRM_ESITCOMUAPCC, (new IDVariant(1)).intValue(), this); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "ComunicaRicezioneAPCC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Reinvia Comunica Ricezione a PCC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ReinviaComunicaRicezioneaPCC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Reinvia Comunica Ricezione a PCC Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_REICOMRICPCC, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "ReinviaComunicaRicezioneaPCC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comunica Contabilizzazione A PCC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ComunicaContabilizzazioneAPCC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comunica Contabilizzazione A PCC Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI619, IMDBDef2.FLD_PARAMETRI619_PARAMNUMDOC, 0, IDL.Add(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENT1, IMDBDef10.PQSL_PCCDOCUMENT1_COMUNIRICEZI, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PCCDOCUMENT1, IMDBDef10.PQSL_PCCDOCUMENT1_FEINPCCDASDI, 0),(new IDVariant(0)))));
      MainFrm.Show(MyGlb.FRM_COMUNCONTPCC, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "ComunicaContabilizzazioneAPCC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comunica Scaduto A PCC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ComunicaScadutoAPCC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comunica Scaduto A PCC Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_COMUNSCADPCC, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "ComunicaScadutoAPCC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // File Comunicazioni PCC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int FileComunicazioniPCC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // File Comunicazioni PCC Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_FILECOMUNPCC, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "FileComunicazioniPCC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dettaglio Documenti
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DettaglioDocumenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettaglio Documenti Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGDOCUME,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI601, IMDBDef2.FLD_PARAMETRI601_PARTIPPROREG, 0, (new IDVariant("RUF")));
      MainFrm.Show(MyGlb.FRM_DETTAGDOCUME, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "DettaglioDocumenti", _e);
      return -1;
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
      PAN_INTEGRAZIPCC.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioè quando viene portata in primo piano
  // **********************************************************************
  public void Form_Activate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.Form_Activate(this);
      // 
      // Activate Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI611, IMDBDef2.FLD_PARAMETRI611_PARAMAGGIORN, 0).equals((new IDVariant("SI")), true))
      {
        PAN_INTEGRAZIPCC.PanelCommand(Glb.PCM_REQUERY);
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI611, IMDBDef2.FLD_PARAMETRI611_PARAMAGGIORN, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "Activate", _e);
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
      if (MainFrm.ESITODOC002.equals((new IDVariant("SI")), true))
      {
        PAN_INTEGRAZIPCC.SetFlags (Glb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INTEGRAZIPCC.SetFlags (Glb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_REICOMRICAPC+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_INTEGRAZIPCC.SetFlags (Glb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INTEGRAZIPCC.SetFlags (Glb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_REICOMRICAPC+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "Load", _e);
    }
  }

  // **********************************************************************
  // Deactivate
  // Evento notificato alla videata quando essa viene messa
  // in secondo piano
  // Cancel - Input/Output
  // **********************************************************************
  public void Form_Deactivate(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Deactivate Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI611, IMDBDef2.FLD_PARAMETRI611_PARAMAGGIORN, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IntegrazionePCC", "Deactivate", _e);
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
  private void PAN_INTEGRAZIPCC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INTEGRAZIPCC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INTEGRAZIPCC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INTEGRAZIPCC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INTEGRAZIPCC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_INTEGRAZIPCC);
    // Stub
  }

  private void PAN_INTEGRAZIPCC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_INTEGRAZIPCC_INFOINSDACFA)
    {
      this.IdxPanelActived = this.PAN_INTEGRAZIPCC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoInsDaCFA();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INTEGRAZIPCC_INFOCOMRIC)
    {
      this.IdxPanelActived = this.PAN_INTEGRAZIPCC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoComRic();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INTEGRAZIPCC_INFOATTACC)
    {
      this.IdxPanelActived = this.PAN_INTEGRAZIPCC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAttAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INTEGRAZIPCC_INFOFEPCC)
    {
      this.IdxPanelActived = this.PAN_INTEGRAZIPCC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFEPCC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INTEGRAZIPCC_INFOCOMCONT)
    {
      this.IdxPanelActived = this.PAN_INTEGRAZIPCC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoComCont();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INTEGRAZIPCC_INFOCOMSCAD)
    {
      this.IdxPanelActived = this.PAN_INTEGRAZIPCC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoComScad();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INTEGRAZIPCC_INFCOMPAGPAR)
    {
      this.IdxPanelActived = this.PAN_INTEGRAZIPCC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoComPagParz();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_INTEGRAZIPCC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INTEGRAZIPCC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INTEGRAZIPCC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_INTEGRAZIPCC_Init()
  {

    PAN_INTEGRAZIPCC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INTEGRAZIPCC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_INTEGRAZIPCC.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, "6CCB9B5D-9810-4C26-93E1-66449D453372");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, "Comunicazioni a Piattaforma Certificazione Debiti");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, MyGlb.VIS_VUOGRAALILEF);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, "2ADB6BA1-2BDA-445F-999B-D463968CA967");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, "Numero Documenti:");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, MyGlb.VIS_VUOGRAALILEF);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, "8F825AC1-5012-43F4-815D-1F63E3F9428A");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, "Inseriti da CFA, ancora da passare a PCC");
    PAN_INTEGRAZIPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, MyGlb.VIS_NORMALFIELDS);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, "20391D01-074D-44D9-90E7-C1993A5E6067");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INTEGRAZIPCC.SetImage(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, 0, "info.gif", false);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, "1DEF6C44-0C48-4408-89A0-FEDC694D24C6");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, "Comunicata Ricezione a PCC");
    PAN_INTEGRAZIPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, MyGlb.VIS_NORMALFIELDS);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, "5AE9D962-37E5-47EA-95A9-904AF58BD8A1");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INTEGRAZIPCC.SetImage(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, 0, "info.gif", false);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, "B967FCF0-9C73-4C47-AF01-8E111C53E5E5");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, "di cui in Attesa Accettazione da PCC");
    PAN_INTEGRAZIPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, MyGlb.VIS_NORMALFIELDS);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, "8F1FDFE9-BF89-4682-AEBA-5DBD64D6E414");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INTEGRAZIPCC.SetImage(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, 0, "info.gif", false);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, "50DAC8E0-A7B0-405E-A5E8-1B698D934C19");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, "Fattura Elettronica in PCC da SDI");
    PAN_INTEGRAZIPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, MyGlb.VIS_NORMALFIELDS);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, "464F986B-0FA3-47E0-8C3F-7E7C3AC95D83");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INTEGRAZIPCC.SetImage(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, 0, "info.gif", false);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, "28E3D8ED-F228-465D-B7D8-F93B8B9022BD");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, "Comunicata Contabilizzazione a PCC");
    PAN_INTEGRAZIPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, MyGlb.VIS_NORMFIELPADR);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, "072F8F0E-011A-463A-8B45-A3CE93008A29");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INTEGRAZIPCC.SetImage(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, 0, "info.gif", false);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, "7507D046-4AFA-46B6-9A59-88FCE955CC9E");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, "Comunicato Scaduto a PCC");
    PAN_INTEGRAZIPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, MyGlb.VIS_NORMALFIELDS);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, "8553FCE7-0413-4E59-A088-F850F2A08820");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INTEGRAZIPCC.SetImage(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, 0, "info.gif", false);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, "19400C69-C63F-4D1C-B5E7-32BBCB0584B7");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, "Comunicato Pagamento Parziale a PCC");
    PAN_INTEGRAZIPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, MyGlb.VIS_NORMALFIELDS);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_INTEGRAZIPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, "07133BE1-8587-45FF-B788-697591FB8036");
    PAN_INTEGRAZIPCC.set_Header(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, "");
    PAN_INTEGRAZIPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INTEGRAZIPCC.SetImage(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, 0, "info.gif", true);
    PAN_INTEGRAZIPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, 0 | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_INTEGRAZIPCC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, MyGlb.PANEL_LIST, 12, 12, 520, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, MyGlb.PANEL_LIST, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, MyGlb.PANEL_LIST, 2);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, MyGlb.PANEL_FORM, 12, 12, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, MyGlb.PANEL_FORM, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICHETITOLO, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_ETICHETITOLO, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_ETICHETITOLO, -1, "", "ETICHETITOLO", 0, 0, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, MyGlb.PANEL_LIST, 20, 20, 520, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, MyGlb.PANEL_LIST, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, MyGlb.PANEL_LIST, 2);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, MyGlb.PANEL_FORM, 12, 44, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, MyGlb.PANEL_FORM, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ETICNUMEDOCU, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_ETICNUMEDOCU, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_ETICNUMEDOCU, -1, "", "ETICNUMEDOCU", 0, 0, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, MyGlb.PANEL_LIST, 92);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, MyGlb.PANEL_LIST, "Inseriti da CFA, ancora da passare a PCC");
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, MyGlb.PANEL_FORM, 12, 72, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, MyGlb.PANEL_FORM, 236);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INSERITDACFA, MyGlb.PANEL_FORM, "Inseriti da CFA, ancora da passare a PCC");
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_INSERITDACFA, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldUnbound(PFL_INTEGRAZIPCC_INSERITDACFA, true);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_INSERITDACFA, PPQRY_PCCDOCUMENT1, "SUM(DECODE(SUBSTR(B.AZIONE, 1, 1), '1', DECODE(SUBSTR(A.PROGRESSIVO_REGISTRAZIONE, 1, 3), 'RUF', 1, 0), 0))", "INSERITDACFA", 1, 19, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, MyGlb.PANEL_LIST, 352, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, MyGlb.PANEL_LIST, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, MyGlb.PANEL_FORM, 352, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, MyGlb.PANEL_FORM, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOINSDACFA, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_INFOINSDACFA, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_INFOINSDACFA, -1, "", "INFOINSDACFA", 0, 0, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, MyGlb.PANEL_LIST, 132);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, MyGlb.PANEL_LIST, "Comunicata Ricezione a PCC");
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, MyGlb.PANEL_FORM, 68, 100, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, MyGlb.PANEL_FORM, 180);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNIRICEZI, MyGlb.PANEL_FORM, "Comunicata Ricezione a PCC");
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_COMUNIRICEZI, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldUnbound(PFL_INTEGRAZIPCC_COMUNIRICEZI, true);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_COMUNIRICEZI, PPQRY_PCCDOCUMENT1, "SUM(DECODE(SUBSTR(B.AZIONE, 1, 2), 30, 1, DECODE(SUBSTR(B.AZIONE, 1, 2), 25, 1, 0)))", "COMUNIRICEZI", 1, 19, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, MyGlb.PANEL_LIST, 360, 80, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, MyGlb.PANEL_LIST, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, MyGlb.PANEL_FORM, 352, 104, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, MyGlb.PANEL_FORM, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMRIC, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_INFOCOMRIC, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_INFOCOMRIC, -1, "", "INFOCOMRIC", 0, 0, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, MyGlb.PANEL_LIST, 124);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, MyGlb.PANEL_LIST, "di cui in Attesa Accettazione da PCC");
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, MyGlb.PANEL_FORM, 376, 100, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, MyGlb.PANEL_FORM, 212);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_ATTESAACCETT, MyGlb.PANEL_FORM, "di cui in Attesa Accettazione da PCC");
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_ATTESAACCETT, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldUnbound(PFL_INTEGRAZIPCC_ATTESAACCETT, true);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_ATTESAACCETT, PPQRY_PCCDOCUMENT1, "SUM(DECODE(SUBSTR(B.AZIONE, 1, 2), 25, 1, 0))", "ATTESAACCETT", 1, 19, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, MyGlb.PANEL_LIST, 368, 88, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, MyGlb.PANEL_LIST, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, MyGlb.PANEL_FORM, 704, 104, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, MyGlb.PANEL_FORM, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOATTACC, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_INFOATTACC, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_INFOATTACC, -1, "", "INFOATTACC", 0, 0, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, MyGlb.PANEL_LIST, 100);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, MyGlb.PANEL_LIST, "Fattura Elettronica in PCC da SDI");
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, MyGlb.PANEL_FORM, 24, 128, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, MyGlb.PANEL_FORM, 224);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_FEINPCCDASDI, MyGlb.PANEL_FORM, "Fattura Elettronica in PCC da SDI");
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_FEINPCCDASDI, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldUnbound(PFL_INTEGRAZIPCC_FEINPCCDASDI, true);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_FEINPCCDASDI, PPQRY_PCCDOCUMENT1, "SUM(DECODE(SUBSTR(B.AZIONE, 1, 2), 31, 1, 0))", "FEINPCCDASDI", 1, 19, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, MyGlb.PANEL_LIST, 368, 88, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, MyGlb.PANEL_LIST, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, MyGlb.PANEL_FORM, 352, 132, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, MyGlb.PANEL_FORM, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOFEPCC, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_INFOFEPCC, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_INFOFEPCC, -1, "", "INFOFEPCC", 0, 0, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, MyGlb.PANEL_LIST, 176);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, MyGlb.PANEL_LIST, "Comunicata Contabilizzazione a PCC");
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, MyGlb.PANEL_FORM, 24, 156, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, MyGlb.PANEL_FORM, 224);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNICONTAB, MyGlb.PANEL_FORM, "Comunicata Contabilizzazione a PCC");
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_COMUNICONTAB, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldUnbound(PFL_INTEGRAZIPCC_COMUNICONTAB, true);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_COMUNICONTAB, PPQRY_PCCDOCUMENT1, "SUM(DECODE(SUBSTR(B.AZIONE, 1, 1), 4, 1, 0))", "COMUNICONTAB", 1, 19, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, MyGlb.PANEL_LIST, 376, 96, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, MyGlb.PANEL_LIST, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, MyGlb.PANEL_FORM, 352, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, MyGlb.PANEL_FORM, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMCONT, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_INFOCOMCONT, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_INFOCOMCONT, -1, "", "INFOCOMCONT", 0, 0, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, MyGlb.PANEL_LIST, 124);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, MyGlb.PANEL_LIST, "Comunicato Scaduto a PCC");
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, MyGlb.PANEL_FORM, 88, 184, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, MyGlb.PANEL_FORM, 160);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUNISCADUT, MyGlb.PANEL_FORM, "Comunicato Scaduto a PCC");
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_COMUNISCADUT, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldUnbound(PFL_INTEGRAZIPCC_COMUNISCADUT, true);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_COMUNISCADUT, PPQRY_PCCDOCUMENT1, "SUM(DECODE(SUBSTR(B.AZIONE, 1, 1), 5, 1, 0))", "COMUNISCADUT", 1, 19, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, MyGlb.PANEL_LIST, 384, 104, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, MyGlb.PANEL_LIST, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, MyGlb.PANEL_FORM, 352, 188, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, MyGlb.PANEL_FORM, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFOCOMSCAD, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_INFOCOMSCAD, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_INFOCOMSCAD, -1, "", "INFOCOMSCAD", 0, 0, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, MyGlb.PANEL_LIST, 192);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, MyGlb.PANEL_LIST, "Comunicato Pagamento Parziale a PCC");
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, MyGlb.PANEL_FORM, 20, 212, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, MyGlb.PANEL_FORM, 228);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_COMUPAGAPARZ, MyGlb.PANEL_FORM, "Comunicato Pagamento Parziale a PCC");
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_COMUPAGAPARZ, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldUnbound(PFL_INTEGRAZIPCC_COMUPAGAPARZ, true);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_COMUPAGAPARZ, PPQRY_PCCDOCUMENT1, "SUM(DECODE(SUBSTR(B.AZIONE, 1, 1), 7, 1, 0))", "COMUPAGAPARZ", 1, 19, 0, -13997);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, MyGlb.PANEL_LIST, 392, 112, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, MyGlb.PANEL_LIST, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, MyGlb.PANEL_LIST, 1);
    PAN_INTEGRAZIPCC.SetRect(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, MyGlb.PANEL_FORM, 352, 216, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INTEGRAZIPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, MyGlb.PANEL_FORM, 0);
    PAN_INTEGRAZIPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_INTEGRAZIPCC_INFCOMPAGPAR, MyGlb.PANEL_FORM, 1);
    PAN_INTEGRAZIPCC.SetFieldPage(PFL_INTEGRAZIPCC_INFCOMPAGPAR, -1, -1);
    PAN_INTEGRAZIPCC.SetFieldPanel(PFL_INTEGRAZIPCC_INFCOMPAGPAR, -1, "", "INFCOMPAGPAR", 0, 0, 0, -13997);
  }

  private void PAN_INTEGRAZIPCC_InitQueries()
  {
    StringBuffer SQL;

    PAN_INTEGRAZIPCC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_INTEGRAZIPCC.SetIMDB(IMDB, "PQRY_PCCDOCUMENT1", true);
    PAN_INTEGRAZIPCC.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(DECODE(SUBSTR(B.AZIONE, 1, 1), '1', DECODE(SUBSTR(A.PROGRESSIVO_REGISTRAZIONE, 1, 3), 'RUF', 1, 0), 0)) as INSERITDACFA, ");
    SQL.append("  SUM(DECODE(SUBSTR(B.AZIONE, 1, 2), 25, 1, 0)) as ATTESAACCETT, ");
    SQL.append("  SUM(DECODE(SUBSTR(B.AZIONE, 1, 2), 30, 1, DECODE(SUBSTR(B.AZIONE, 1, 2), 25, 1, 0))) as COMUNIRICEZI, ");
    SQL.append("  SUM(DECODE(SUBSTR(B.AZIONE, 1, 2), 31, 1, 0)) as FEINPCCDASDI, ");
    SQL.append("  SUM(DECODE(SUBSTR(B.AZIONE, 1, 1), 4, 1, 0)) as COMUNICONTAB, ");
    SQL.append("  SUM(DECODE(SUBSTR(B.AZIONE, 1, 1), 5, 1, 0)) as COMUNISCADUT, ");
    SQL.append("  SUM(DECODE(SUBSTR(B.AZIONE, 1, 1), 7, 1, 0)) as COMUPAGAPARZ ");
    PAN_INTEGRAZIPCC.SetQuery(PPQRY_PCCDOCUMENT1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PCC_DOCUMENTI A, ");
    SQL.append("  PCC_STEP B, ");
    SQL.append("  FAT E ");
    PAN_INTEGRAZIPCC.SetQuery(PPQRY_PCCDOCUMENT1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (E.ANNO_PROG = A.ANNO_PROG) ");
    SQL.append("and   (E.NUMERO_PROG = A.NUMERO_PROG) ");
    SQL.append("and   (B.PROGRESSIVO_REGISTRAZIONE = A.PROGRESSIVO_REGISTRAZIONE) ");
    SQL.append("and   (A.PROCESSO_CONCLUSO = 'NO') ");
    SQL.append("and   ((A.PROGRESSIVO_REGISTRAZIONE LIKE 'RUF%' OR A.PROGRESSIVO_REGISTRAZIONE LIKE 'NR2%')) ");
    SQL.append("and   (B.SEQUENZA = A.ULTIMO_STEP) ");
    SQL.append("and   ((((SUBSTR(B.AZIONE, 1, 1) = '4' OR SUBSTR(B.AZIONE, 1, 1) = '5' OR SUBSTR(B.AZIONE, 1, 2) = '31') AND (");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(C.IMPORTO), -1) ");
    SQL.append("from ");
    SQL.append("  LIQ C, ");
    SQL.append("  MAN D ");
    SQL.append("where (D.ANNO_MAND = C.ANNO_MAND) ");
    SQL.append("and   (D.NUMERO_MAND = C.NUMERO_MAND) ");
    SQL.append("and   (C.FAT_ANNO_PROG = A.ANNO_PROG) ");
    SQL.append("and   (C.FAT_NUMERO_PROG = A.NUMERO_PROG) ");
    SQL.append("and   (D.D_DATA_MAND <= TRUNC( SYSDATE )) ");
    SQL.append(") < E.IMPORTO + NVL(E.VARIAZIONI, 0))) OR (SUBSTR(B.AZIONE, 1, 1) <> '4' AND SUBSTR(B.AZIONE, 1, 1) <> '5' AND SUBSTR(B.AZIONE, 1, 2) <> '31'))) ");
    PAN_INTEGRAZIPCC.SetQuery(PPQRY_PCCDOCUMENT1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INTEGRAZIPCC.SetQuery(PPQRY_PCCDOCUMENT1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INTEGRAZIPCC.SetQuery(PPQRY_PCCDOCUMENT1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INTEGRAZIPCC.SetQuery(PPQRY_PCCDOCUMENT1, 5, SQL, -1, "");
    PAN_INTEGRAZIPCC.SetQueryDB(PPQRY_PCCDOCUMENT1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INTEGRAZIPCC.SetMasterTable(0, "PCC_DOCUMENTI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INTEGRAZIPCC.Status() == 2)
    {
      int oldListQBE = PAN_INTEGRAZIPCC.iUseListQBE;
      PAN_INTEGRAZIPCC.iUseListQBE = 0;
      PAN_INTEGRAZIPCC.PanelCommand(Glb.PCM_SEARCH);
      PAN_INTEGRAZIPCC.PanelCommand(Glb.PCM_FIND);
      PAN_INTEGRAZIPCC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_INTEGRAZIPCC) PAN_INTEGRAZIPCC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INTEGRAZIPCC) PAN_INTEGRAZIPCC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INTEGRAZIPCC) PAN_INTEGRAZIPCC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_INTEGRAZIPCC) PAN_INTEGRAZIPCC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_INTEGRAZIPCC) PAN_INTEGRAZIPCC_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_INTEGRAZIPCC) PAN_INTEGRAZIPCC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
