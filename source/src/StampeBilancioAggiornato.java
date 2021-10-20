// **********************************************
// Stampe Bilancio Aggiornato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StampeBilancioAggiornato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_PROGRSTAMPA = 0;
  private static int PFL_PARAM_ETICHEELABOR = 1;
  private static int PFL_PARAM_SIGLA = 2;
  private static int PFL_PARAM_NOMEREPORT = 3;
  private static int PFL_PARAM_NUMERDIPAGIN = 4;

  private static int PPQRY_PARAM153 = 0;

  private static int PPQRY_TIPISTAMBILP = 1;

  private static int PPQRY_TIPISTAMBIL1 = 2;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM161(IMDB);
    //
    //
    Init_PQRY_PARAM153(IMDB);
    Init_PQRY_PARAM153_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM161(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM161, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM161, "TBL_PARAM161");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM161,IMDBDef3.FLD_PARAM161_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM161,IMDBDef3.FLD_PARAM161_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM161,IMDBDef3.FLD_PARAM161_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM161,IMDBDef3.FLD_PARAM161_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM161,IMDBDef3.FLD_PARAM161_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM161,IMDBDef3.FLD_PARAM161_PARSTANUDIPA,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM161, 0);
  }

  private static void Init_PQRY_PARAM153(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM153, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM153, "PQRY_PARAM153");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM153,IMDBDef11.PQSL_PARAM153_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM153,IMDBDef11.PQSL_PARAM153_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM153,IMDBDef11.PQSL_PARAM153_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM153,IMDBDef11.PQSL_PARAM153_PARSTANUDIPA,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAM153, 0);
  }

  private static void Init_PQRY_PARAM153_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM153_RS, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM153_RS, "PQRY_PARAM153_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM153_RS,IMDBDef11.PQSL_PARAM153_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM153_RS,IMDBDef11.PQSL_PARAM153_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM153_RS,IMDBDef11.PQSL_PARAM153_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM153_RS,IMDBDef11.PQSL_PARAM153_PARSTANUDIPA,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StampeBilancioAggiornato(MyWebEntryPoint w, IMDBObj imdb)
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
  public StampeBilancioAggiornato()
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
    FormIdx = MyGlb.FRM_STAMBILAAGGI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "26E021CF-D206-42CF-AF2C-FBC89E99AF35";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 400;
    DesignHeight = 154;
    set_Caption(new IDVariant("Stampe Bilancio Aggiornato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 400;
    Frames[1].Height = 128;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 128;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 128-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9DAD0120-A829-4CD4-87DB-B5898EA0B6E7");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 700, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM161, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMBILAAGGI_PARAM153();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof StampeBilancioAggiornato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StampeBilancioAggiornato.class.getName() : (Glb.ClassWithPackage(StampeBilancioAggiornato.class) ? StampeBilancioAggiornato.class.getName().substring(StampeBilancioAggiornato.class.getPackage().getName().length() + 1) : StampeBilancioAggiornato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("LEB")), true))
      {
        MainFrm.UnloadForm(MyGlb.FRM_EQUILBILAAGG,(new IDVariant(0)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_EQUILBILAAGG, (new IDVariant(0)).intValue(), this); 
        return 0;
      }
      if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("LQGR")), true))
      {
        MainFrm.UnloadForm(MyGlb.FRM_QUAGENRIAAGG,(new IDVariant(0)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_QUAGENRIAAGG, (new IDVariant(0)).intValue(), this); 
        return 0;
      }
      if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("LVV")), true))
      {
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo((new IDVariant(2016)), true)<=0)
        {
          MainFrm.UnloadForm(MyGlb.FRM_VERIFIVINCOL,(new IDVariant(0)).booleanValue()); 
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_RONASTNUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM153, IMDBDef11.PQSL_PARAM153_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMTIPSTA, 0, (new IDVariant("PREV_AGG")));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMEVARIA, 0, (new IDVariant("P")));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMDATELA, 0, IDL.Today());
          MainFrm.Show(MyGlb.FRM_VERIFIVINCOL, (new IDVariant(0)).intValue(), this); 
        }
        else
        {
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Verifica Vincoli di Finanza Pubblica"));
          MainFrm.UnloadForm(MyGlb.FRM_STAMPCONPARA,(new IDVariant(0)).booleanValue()); 
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOOGSTNUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM153, IMDBDef11.PQSL_PARAM153_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGFORCAP, 0, new IDVariant(v_CAPTION));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0, (new IDVariant("LVVA17")));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMSTA, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMEOGGEVARI, 0, (new IDVariant("P")));
          MainFrm.Show(MyGlb.FRM_STAMPCONPARA, (new IDVariant(0)).intValue(), this); 
        }
        return 0;
      }
      if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("EBT14")), true) || (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SBT14")), true))
      {
        IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
        v_CAPTION = (new IDVariant("Stampa Bilancio Aggiornato - "));
        MainFrm.UnloadForm(MyGlb.FRM_STAMPCONPARA,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGFORCAP, 0, IDL.Add(v_CAPTION, (((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("EBT14"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMEOGGEVARI, 0, (new IDVariant("P")));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMSTA, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOOGSTNUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM153, IMDBDef11.PQSL_PARAM153_PARSTANUDIPA, 0));
        MainFrm.Show(MyGlb.FRM_STAMPCONPARA, (new IDVariant(0)).intValue(), this); 
        return 0;
      }
      if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("LCFPV")), true))
      {
        MainFrm.UnloadForm(MyGlb.FRM_COMPOSFPVAGG,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI658, IMDBDef3.FLD_PARAMETRI658_ROWNAMNOMREP, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
        MainFrm.Show(MyGlb.FRM_COMPOSFPVAGG, (new IDVariant(0)).intValue(), this); 
        return 0;
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.LanciaStampaJasper((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampeBilancioAggiornato", "EtichettaElabora", _e);
      return -1;
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampeBilancioAggiornato", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAM161, IMDBDef3.FLD_PARAM161_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM161, IMDBDef3.FLD_PARAM161_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM161, IMDBDef3.FLD_PARAM161_PARSTANUDIPA, 0, new IDVariant());
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
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo((new IDVariant(2013)), true)>0)
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM161, IMDBDef3.FLD_PARAM161_PARAMESERCIZ, 0, (new IDVariant(2014)));
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM161, IMDBDef3.FLD_PARAM161_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAM161, IMDBDef3.FLD_PARAM161_PARSTANUDIPA, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampeBilancioAggiornato", "Load", _e);
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STAMBILAAGGI_PARAM153() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAM153_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM161, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM161, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAM153_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAM153_RS, 0, IMDBDef3.TBL_PARAM161, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM153_RS, 0, 0, IMDBDef3.TBL_PARAM161, IMDBDef3.FLD_PARAM161_PARAPROGSTAM, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM153_RS, 1, 0, IMDBDef3.TBL_PARAM161, IMDBDef3.FLD_PARAM161_PARSTANUDIPA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM161, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM161, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM161, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAM153_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "3D8FEF77-D114-43B1-A734-2C7F2F805367");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "Stampa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "BD44D20A-80CE-48C5-9199-3F44B1DEF67C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "10CDEEBF-A20C-4B33-B68A-63AD8AC0C515");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "SIGLA");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "B0D045CF-9AEF-4E91-8EA1-B73424C40C1D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "NOME REPORT");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "41C34B4E-B6C0-42CA-82FA-FE407FB1CFFE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "Numero di pagina");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 0, 36, 544, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, "Stampa");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 32, 24, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, "Stampa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROGRSTAMPA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROGRSTAMPA, PPQRY_PARAM153, "A.PARAPROGSTAM", "PARAPROGSTAM", 3, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 516, 696, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 252, 80, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHEELABOR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 168);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, "SIGLA");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, -40, 56, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 168);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, "SIGLA");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SIGLA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SIGLA, PPQRY_TIPISTAMBILP, "A.SIGLA", "TISTBITISTBS", 5, 20, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 212);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, "NOME REPORT");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 4, 116, 724, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 212);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, "NOME REPORT");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NOMEREPORT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NOMEREPORT, PPQRY_TIPISTAMBILP, "A.NOME_REPORT", "TISTBITISBNR", 5, 100, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 156);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, "Numero di pagina");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 152, 52, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 156);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, "Numero di pagina");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMERDIPAGIN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMERDIPAGIN, PPQRY_PARAM153, "A.PARSTANUDIPA", "PARSTANUDIPA", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUMERDIPAGIN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUMERDIPAGIN, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SIGLA as TISTBITISTBS, ");
    SQL.append("  A.NOME_REPORT as TISTBITISBNR ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_BILAGG A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMBILP, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISTAMBILP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_TIPISTAMBILP, "TIPI_STAMPE_BILAGG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TISTBITISTBP, ");
    SQL.append("  A.ORDINE as TISTBITISTBO, ");
    SQL.append("  A.RAGGRUPPAMENTO || '' as GROUPID, ");
    SQL.append("  A.DESCRIZIONE as TISTBITISTBD ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_BILAGG A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAM161.PARAMESERCIZ~~) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMBIL1, 0, SQL, PFL_PARAM_PROGRSTAMPA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TISTBITISTBP, ");
    SQL.append("  A.ORDINE as TISTBITISTBO, ");
    SQL.append("  A.RAGGRUPPAMENTO || '' as GROUPID, ");
    SQL.append("  A.DESCRIZIONE as TISTBITISTBD ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_BILAGG A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAM161.PARAMESERCIZ~~) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMBIL1, 1, SQL, PFL_PARAM_PROGRSTAMPA, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISTAMBIL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM153", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM153, IMDBDef11.PQRY_PARAM153_RS, IMDBDef3.TBL_PARAM161);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROGRSTAMPA, IMDBDef3.FLD_PARAM161_PARAPROGSTAM);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMERDIPAGIN, IMDBDef3.FLD_PARAM161_PARSTANUDIPA);
    PAN_PARAM.SetMasterTable(0, "PARAM161");
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
