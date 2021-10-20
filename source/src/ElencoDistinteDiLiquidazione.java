// **********************************************
// Elenco Distinte Di Liquidazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoDistinteDiLiquidazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DISTIDILIQUI_NUMERO = 0;
  private static int PFL_DISTIDILIQUI_ANNO = 1;
  private static int PFL_DISTIDILIQUI_DATA = 2;
  private static int PFL_DISTIDILIQUI_UTENZA = 3;
  private static int PFL_DISTIDILIQUI_FLAGCONDCONT = 4;
  private static int PFL_DISTIDILIQUI_FLAGSCELFORN = 5;
  private static int PFL_DISTIDILIQUI_FLAGREGOCONT = 6;
  private static int PFL_DISTIDILIQUI_FLAGNULLOSTA = 7;
  private static int PFL_DISTIDILIQUI_UTENTEINSERI = 8;
  private static int PFL_DISTIDILIQUI_DATAINSERIME = 9;
  private static int PFL_DISTIDILIQUI_UTENTULTIAGG = 10;
  private static int PFL_DISTIDILIQUI_DATAULTIMAGG = 11;
  private static int PFL_DISTIDILIQUI_STORICOCHECK = 12;
  private static int PFL_DISTIDILIQUI_VISUALIZZAST = 13;
  private static int PFL_DISTIDILIQUI_ULTIUTEFLACC = 14;
  private static int PFL_DISTIDILIQUI_ULTIDATFLACC = 15;
  private static int PFL_DISTIDILIQUI_ULTIUTEFLANO = 16;
  private static int PFL_DISTIDILIQUI_ULTIDATFLANO = 17;
  private static int PFL_DISTIDILIQUI_ULTIUTEFLARC = 18;
  private static int PFL_DISTIDILIQUI_ULTIDATFLARC = 19;
  private static int PFL_DISTIDILIQUI_ULTIUTEFLASF = 20;
  private static int PFL_DISTIDILIQUI_ULTIDATFLASF = 21;
  private static int PFL_DISTIDILIQUI_CONTALIQ = 22;

  private static int PPQRY_DISTILIQUIUT = 0;

  private static int PPQRY_TIPIUTENZA = 1;


  IDPanel PAN_DISTIDILIQUI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_DISTILIQUIUT(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_DISTILIQUIUT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_DISTILIQUIUT, 23);
    IMDB.set_TblCode(IMDBDef10.PQRY_DISTILIQUIUT, "PQRY_DISTILIQUIUT");
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ANNO, "ANNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_NUMERO, "NUMERO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_NUMERO,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_UTENZA, "UTENZA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_UTENZA,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI, "FLAG_COND_CONTRATTUALI");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI, "FLAG_SCELTA_FORNITORI");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA, "FLAG_REGOLARITA_CONTRIBUTIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_FLAG_NULLA_OSTA, "FLAG_NULLA_OSTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_FLAG_NULLA_OSTA,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, "STORICO_CHECK");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK,5,4000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_VISUALIZZAST, "VISUALIZZAST");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_VISUALIZZAST,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_CC, "ULTIMO_UTENTE_FLAG_CC");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_CC,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_NO, "ULTIMO_UTENTE_FLAG_NO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_NO,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_RC, "ULTIMO_UTENTE_FLAG_RC");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_RC,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_SF, "ULTIMO_UTENTE_FLAG_SF");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_SF,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_CC, "ULTIMA_DATA_FLAG_CC");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_CC,8,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_NO, "ULTIMA_DATA_FLAG_NO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_NO,8,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_SF, "ULTIMA_DATA_FLAG_SF");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_SF,8,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_RC, "ULTIMA_DATA_FLAG_RC");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_RC,8,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_CONTALIQ, "CONTALIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_DISTILIQUIUT,IMDBDef10.PQSL_DISTILIQUIUT_CONTALIQ,1,19,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_DISTILIQUIUT, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoDistinteDiLiquidazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoDistinteDiLiquidazione()
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
    FormIdx = MyGlb.FRM_ELENDISDILIQ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6CA3FAAC-7895-4807-8D2E-A8385E509EB9";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 756;
    DesignHeight = 450;
    set_Caption(new IDVariant("Elenco Distinte Di Liquidazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 756;
    Frames[1].Height = 424;
    Frames[1].Caption = "Distinte di Liquidanzione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 424;
    PAN_DISTIDILIQUI = new IDPanel(w, this, 1, "PAN_DISTIDILIQUI");
    Frames[1].Content = PAN_DISTIDILIQUI;
    PAN_DISTIDILIQUI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTIDILIQUI.VS = MainFrm.VisualStyleList;
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 756-MyGlb.PAN_OFFS_X, 424-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0AC4B033-F985-43F0-8418-271E1CAA940B");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 24, 712, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTIDILIQUI.InitStatus = 1;
    PAN_DISTIDILIQUI_Init();
    PAN_DISTIDILIQUI_InitFields();
    PAN_DISTIDILIQUI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA12+BaseCmdLinIdx)
      {
        Stampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG169+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_NUOVOCOMMSE4+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG169+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISLIQDADIS+BaseCmdLinIdx)
      {
        CmdEmissiLiqDaDist1();
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
      PAN_DISTIDILIQUI.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoDistinteDiLiquidazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoDistinteDiLiquidazione.class.getName() : (Glb.ClassWithPackage(ElencoDistinteDiLiquidazione.class) ? ElencoDistinteDiLiquidazione.class.getName().substring(ElencoDistinteDiLiquidazione.class.getPackage().getName().length() + 1) : ElencoDistinteDiLiquidazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Distinte di Liquidanzione Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DISTIDILIQUI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Distinte di Liquidanzione Before Insert Body
      // Corpo Procedura
      // 
      IDVariant v_VAGETAD4NOMI = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A_GET_AD4_NOMINATIVO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as AGEADNOSEUSN ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VAGETAD4NOMI = QV.Get("AGEADNOSEUSN", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_S1 = null;
      v_S1 = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IDL.Now()), (new IDVariant(" "))), v_VAGETAD4NOMI), (new IDVariant(" "))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI, 0).equals((new IDVariant())))?(new IDVariant("Condizioni Contrattuali annullate")):(new IDVariant("Condizioni Contrattuali selezionate"))));
      IDVariant v_S2 = null;
      v_S2 = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IDL.Now()), (new IDVariant(" "))), v_VAGETAD4NOMI), (new IDVariant(" "))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI, 0).equals((new IDVariant())))?(new IDVariant("Scelta Fornitori annullata")):(new IDVariant("Scelta Fornitori selezionata"))));
      IDVariant v_S3 = null;
      v_S3 = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IDL.Now()), (new IDVariant(" "))), v_VAGETAD4NOMI), (new IDVariant(" "))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA, 0).equals((new IDVariant())))?(new IDVariant("Regolarità Contributiva annullata")):(new IDVariant("Regolarità Contributiva selezionata"))));
      IDVariant v_S4 = null;
      v_S4 = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IDL.Now()), (new IDVariant(" "))), v_VAGETAD4NOMI), (new IDVariant(" "))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_NULLA_OSTA, 0).equals((new IDVariant())))?(new IDVariant("Nulla Osta annullato")):(new IDVariant("Nulla Osta selezionato"))));
      IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0, IDL.Add(IDL.Add(IDL.Add(((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI, 0).equals((new IDVariant())))?(new IDVariant()):v_S1), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI, 0).equals((new IDVariant())))?(new IDVariant()):IDL.Add(((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI, 0).equals((new IDVariant())))?(new IDVariant()):(new IDVariant(";"))), v_S2))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA, 0).equals((new IDVariant())))?(new IDVariant()):IDL.Add(((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI, 0).equals((new IDVariant())))?(new IDVariant()):(new IDVariant(";"))), v_S3))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_NULLA_OSTA, 0).equals((new IDVariant())))?(new IDVariant()):IDL.Add(((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA, 0).equals((new IDVariant())))?(new IDVariant()):(new IDVariant(";"))), v_S4))));
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_CC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_CC, 0, IDL.Now());
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_NULLA_OSTA, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_NO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_NO, 0, IDL.Now());
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_SF, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_SF, 0, IDL.Now());
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_RC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_RC, 0, IDL.Now());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDistinteDiLiquidazione", "DistintediLiquidanzioneBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Distinte di Liquidanzione Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DISTIDILIQUI_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Distinte di Liquidanzione Before Update Body
      // Corpo Procedura
      // 
      IDVariant v_VAGETAD4NOMI = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A_GET_AD4_NOMINATIVO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as AGEADNOSEUSN ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VAGETAD4NOMI = QV.Get("AGEADNOSEUSN", IDVariant.STRING) ;
      }
      QV.Close();
      if (PAN_DISTIDILIQUI.GetOrgValue(PFL_DISTIDILIQUI_FLAGCONDCONT).compareTo(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0).equals((new IDVariant())))?(new IDVariant()):(new IDVariant(";")))), IDL.ToString(IDL.Now())), (new IDVariant(" "))), v_VAGETAD4NOMI), (new IDVariant(" Condizioni Contrattuali "))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI, 0).equals((new IDVariant())))?(new IDVariant("annullata")):(new IDVariant("selezionata")))));
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_CC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_CC, 0, IDL.Now());
        }
        else
        {
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_CC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_CC, 0, (new IDVariant()));
        }
      }
      if (PAN_DISTIDILIQUI.GetOrgValue(PFL_DISTIDILIQUI_FLAGSCELFORN).compareTo(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0).equals((new IDVariant())))?(new IDVariant()):(new IDVariant(";")))), IDL.ToString(IDL.Now())), (new IDVariant(" "))), v_VAGETAD4NOMI), (new IDVariant(" Scelta Fornitori "))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI, 0).equals((new IDVariant())))?(new IDVariant("annullata")):(new IDVariant("selezionata")))));
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_SF, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_SF, 0, IDL.Now());
        }
        else
        {
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_SF, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_SF, 0, (new IDVariant()));
        }
      }
      if (PAN_DISTIDILIQUI.GetOrgValue(PFL_DISTIDILIQUI_FLAGREGOCONT).compareTo(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0).equals((new IDVariant())))?(new IDVariant()):(new IDVariant(";")))), IDL.ToString(IDL.Now())), (new IDVariant(" "))), v_VAGETAD4NOMI), (new IDVariant(" Regolarità Contributiva "))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA, 0).equals((new IDVariant())))?(new IDVariant("annullata")):(new IDVariant("selezionata")))));
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_RC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_RC, 0, IDL.Now());
        }
        else
        {
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_RC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_RC, 0, (new IDVariant()));
        }
      }
      if (PAN_DISTIDILIQUI.GetOrgValue(PFL_DISTIDILIQUI_FLAGNULLOSTA).compareTo(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_NULLA_OSTA, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_STORICO_CHECK, 0).equals((new IDVariant())))?(new IDVariant()):(new IDVariant(";")))), IDL.ToString(IDL.Now())), (new IDVariant(" "))), v_VAGETAD4NOMI), (new IDVariant(" Nulla Osta "))), ((IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_NULLA_OSTA, 0).equals((new IDVariant())))?(new IDVariant("annullata")):(new IDVariant("selezionata")))));
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_FLAG_NULLA_OSTA, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_NO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_NO, 0, IDL.Now());
        }
        else
        {
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_NO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_NO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDistinteDiLiquidazione", "DistintediLiquidanzioneBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Distinte di Liquidanzione After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_DISTIDILIQUI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Distinte di Liquidanzione After Commit Body
      // Corpo Procedura
      // 
      PAN_DISTIDILIQUI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDistinteDiLiquidazione", "DistintediLiquidanzioneAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Distinte di Liquidanzione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTIDILIQUI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISTIDILIQUI);
      // 
      // Distinte di Liquidanzione On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_CONTALIQ, 0).compareTo((new IDVariant(0)), true)>0)
      {
        PAN_DISTIDILIQUI.SetFlags (Glb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DISTIDILIQUI.SetFlags (Glb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DISTIDILIQUI.SetFlags (Glb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DISTIDILIQUI.SetFlags (Glb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_DISTIDILIQUI.SetFlags (Glb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DISTIDILIQUI.SetFlags (Glb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DISTIDILIQUI.SetFlags (Glb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DISTIDILIQUI.SetFlags (Glb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDistinteDiLiquidazione", "DistintediLiquidanzioneOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Cmd Emissi Liq Da Dist 1
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdEmissiLiqDaDist1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Emissi Liq Da Dist 1 Body
      // Procedure Body
      // 
      if (IDL.NullValue(MainFrm.VISUCHECDIST,(new IDVariant("N"))).equals((new IDVariant("S")), true))
      {
        IDVariant v_VDILIUTFLNUO = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.FLAG_NULLA_OSTA as DILIUTFLNUOS ");
        SQL.append("from ");
        SQL.append("  DISTINTE_LIQUIDAZIONE_UT A ");
        SQL.append("where (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_NUMERO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VDILIUTFLNUO = QV.Get("DILIUTFLNUOS", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.NullValue(v_VDILIUTFLNUO,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("La distinta non ha il nulla osta per cui non è liquidabile"))); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_DATA_ULTIMA_ELAB, 0).compareTo(IDL.Today(), true)<=0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Attenzione! La data di ultima elaborazione è il "));
        IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
        v_SMS1 = (new IDVariant("Si conferma l'operazione ?"));
        IDVariant v_CONFERMA = null;
        v_CONFERMA = (new IDVariant(MainFrm.MessageConfirmEx(IDL.Add(IDL.Add(IDL.Add(v_SMS, MainFrm.Datetostring(IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_DATA_ULTIMA_ELAB, 0))), (new IDVariant("<BR/>"))), v_SMS1))));
        if (!(IDL.IsNull(v_CONFERMA)))
        {
          if (v_CONFERMA.booleanValue())
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA, 0, IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_CODICE, 0));
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMBENEFIC, 0, IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_BENEFICIARIO, 0));
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMQUIETAN, 0, IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_NUM_QUIETANZA, 0));
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADESCUTEN, 0, IDL.Add((new IDVariant("Utenza ")), IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_DESCRIZIONE, 0)));
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMDISTINN, 0, IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_NUMERO, 0));
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADISTANNO, 0, IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ANNO, 0));
            MainFrm.Show(MyGlb.FRM_EMISLIQDADIS, (new IDVariant(0)).intValue(), this); 
          }
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA, 0, IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_CODICE, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMBENEFIC, 0, IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_BENEFICIARIO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMQUIETAN, 0, IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_NUM_QUIETANZA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADESCUTEN, 0, IDL.Add((new IDVariant("Utenza ")), IMDB.Value(IMDBDef10.PQRY_TIPIUTENZA, IMDBDef10.PQSL_TIPIUTENZA_DESCRIZIONE, 0)));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMDISTINN, 0, IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_NUMERO, 0));
        MainFrm.Show(MyGlb.FRM_EMISLIQDADIS, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDistinteDiLiquidazione", "CmdEmissiLiqDaDist1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM31, IMDBDef2.FLD_PARAMESTAM31_PARSTAANNDIS, 0, IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_ANNO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM31, IMDBDef2.FLD_PARAMESTAM31_PARSTANUMDIS, 0, IMDB.Value(IMDBDef10.PQRY_DISTILIQUIUT, IMDBDef10.PQSL_DISTILIQUIUT_NUMERO, 0));
      ((Utenze)MainFrm.GetForm(MyGlb.FRM_UTENZE,0)).BUK_STADISMONUTE.set_PrintDestination((new IDVariant(3)).intValue());
      ((Utenze)MainFrm.GetForm(MyGlb.FRM_UTENZE,0)).BUK_STADISMONUTE.RefreshQuery();
      ((Utenze)MainFrm.GetForm(MyGlb.FRM_UTENZE,0)).BUK_STADISMONUTE.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(((Utenze)MainFrm.GetForm(MyGlb.FRM_UTENZE,0)).BUK_STADISMONUTE.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoDistinteDiLiquidazione", "Stampa", _e);
      return -1;
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
    // Stub
  }

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
  private void PAN_DISTIDILIQUI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISTIDILIQUI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTIDILIQUI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTIDILIQUI, Cancel);
    // Stub
  }

  private void PAN_DISTIDILIQUI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISTIDILIQUI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISTIDILIQUI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISTIDILIQUI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISTIDILIQUI_Init()
  {

    PAN_DISTIDILIQUI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTIDILIQUI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISTIDILIQUI.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, "0996A6F7-915F-4BE8-BFFA-662CBD85F752");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, "Num. Distinta");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, "F1D93C7C-F743-4237-983E-61E325081150");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, "Anno Distinta");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, "5EACF8FB-C6E0-4CBC-9516-CBF0161D8AB8");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, "Data");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, "68735AEB-B1D1-4248-ACFE-550B5E011FB6");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, "Utenza");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, "37E5E880-2736-46BB-9583-5B0AC123CA40");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, "Condizioni Contrattuali");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, "Le forniture e/o prestazioni cui la suddetta documentazione si riferisce sono state eseguite secondo le condizioni contrattuali e, per quanto riguarda i prodotti, con i requisiti merceologici e tipologici chiesti");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, "6CD3126D-F3BB-4F2A-A491-801144C6AFDA");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, "Scelta Fornitori");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, "La scelta dei fornitori è avvenuta secondo le procedure previste");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, "4522F8BD-56F6-4981-BE88-27B7F691B621");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, "Regolarità Contributiva");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, "Si attesta la verifica della regolarità contributiva di cui all’art. 2 della Legge n. 266/2002");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, "767BC578-3626-4DD0-B55D-884EC4889713");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, "Nulla Osta");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, "Vista la proposta sopracitata e constatata la regolarità della stessa, ai sensi e per gli effetti di quanto contemplato nel regolamento interno di contabilità, si rilascia il nulla osta per l’esecuzione della proposta");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, "D1758E1B-2E5E-494D-8498-620B3E7DAA99");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, "4386B7C5-E221-4A2A-A6C1-502F56FC710A");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, "E72830F5-8CA7-4D85-9E0E-1F704F8FAB23");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, "ED014F59-DF69-4D5D-A0C0-56D1109A270D");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, "F63F566B-1E09-438D-9BC8-8ECC1558A110");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, "Storico Check");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, "B8FFBA5A-7D4E-4997-9EB7-FBB4D4B43F7E");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, "Storico Check");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, "6009DB6F-BEB5-4C19-AABD-A8A3C8569C77");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, "ULTIMO UTENTE FLAG CC");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, "2CA485B2-3911-43AF-8651-68B8963FB3B1");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, "ULTIMA DATA FLAG CC");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, "B33D9CDC-0299-45AD-8E36-CD148DA50B13");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, "ULTIMO UTENTE FLAG NO");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, "066E032B-08BC-4D34-A6B2-9BB477B76A4F");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, "ULTIMA DATA FLAG NO");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, "57C0B7FB-DD07-495E-9A82-C1BCF01A2F52");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, "ULTIMO UTENTE FLAG RC");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, "15AC11C9-84FC-44A8-BDAF-4A49245D7486");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, "ULTIMA DATA FLAG RC");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, "D2B333E2-F0AB-417B-965E-D048DE5DE90B");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, "ULTIMO UTENTE FLAG SF");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, "0E95267F-FBCA-4AF9-BB03-2154DBA0848D");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, "ULTIMA DATA FLAG SF");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTIDILIQUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, "1B681A5D-866D-4CD8-B625-50DEFEBE8B55");
    PAN_DISTIDILIQUI.set_Header(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, "Conta Liq");
    PAN_DISTIDILIQUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, "");
    PAN_DISTIDILIQUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTIDILIQUI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISTIDILIQUI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, MyGlb.PANEL_LIST, 0, 60, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, MyGlb.PANEL_LIST, 56);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, MyGlb.PANEL_LIST, "Num. Distinta");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, MyGlb.PANEL_FORM, 4, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_NUMERO, MyGlb.PANEL_FORM, "Num. Distinta");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_NUMERO, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_NUMERO, PPQRY_DISTILIQUIUT, "A.NUMERO", "NUMERO", 1, 5, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, MyGlb.PANEL_LIST, 72, 60, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, MyGlb.PANEL_LIST, "Anno Distinta");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, MyGlb.PANEL_FORM, 4, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ANNO, MyGlb.PANEL_FORM, "Anno Distinta");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_ANNO, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_ANNO, PPQRY_DISTILIQUIUT, "A.ANNO", "ANNO", 1, 4, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, MyGlb.PANEL_LIST, 124, 60, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, MyGlb.PANEL_LIST, 40);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, MyGlb.PANEL_FORM, 4, 52, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_DATA, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_DATA, PPQRY_DISTILIQUIUT, "A.DATA", "DATA", 6, 19, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, MyGlb.PANEL_LIST, 192, 60, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, MyGlb.PANEL_LIST, 52);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, MyGlb.PANEL_LIST, "Utenza");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, MyGlb.PANEL_FORM, 4, 76, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENZA, MyGlb.PANEL_FORM, "Utenza");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_UTENZA, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_UTENZA, PPQRY_DISTILIQUIUT, "A.UTENZA", "UTENZA", 5, 2, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, MyGlb.PANEL_LIST, 408, 60, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, MyGlb.PANEL_LIST, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, MyGlb.PANEL_LIST, "Condizioni Contrattuali");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, MyGlb.PANEL_FORM, 4, 100, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGCONDCONT, MyGlb.PANEL_FORM, "Condizioni Contrattuali");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_FLAGCONDCONT, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_FLAGCONDCONT, PPQRY_DISTILIQUIUT, "A.FLAG_COND_CONTRATTUALI", "FLAG_COND_CONTRATTUALI", 5, 2, 0, -13997);
    PAN_DISTIDILIQUI.SetValueListItem(PFL_DISTIDILIQUI_FLAGCONDCONT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTIDILIQUI.SetValueListItem(PFL_DISTIDILIQUI_FLAGCONDCONT, (new IDVariant()), "Null", "", "", -1);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, MyGlb.PANEL_LIST, 492, 60, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, MyGlb.PANEL_LIST, 148);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, MyGlb.PANEL_LIST, "Scelta Fornitori");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGSCELFORN, MyGlb.PANEL_FORM, "Scelta Fornitori");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_FLAGSCELFORN, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_FLAGSCELFORN, PPQRY_DISTILIQUIUT, "A.FLAG_SCELTA_FORNITORI", "FLAG_SCELTA_FORNITORI", 5, 2, 0, -13997);
    PAN_DISTIDILIQUI.SetValueListItem(PFL_DISTIDILIQUI_FLAGSCELFORN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTIDILIQUI.SetValueListItem(PFL_DISTIDILIQUI_FLAGSCELFORN, (new IDVariant()), "Null", "", "", -1);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, MyGlb.PANEL_LIST, 560, 60, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, MyGlb.PANEL_LIST, 200);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, MyGlb.PANEL_LIST, "Regolarità Contributiva");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, MyGlb.PANEL_FORM, 4, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGREGOCONT, MyGlb.PANEL_FORM, "Regolarità Contributiva");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_FLAGREGOCONT, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_FLAGREGOCONT, PPQRY_DISTILIQUIUT, "A.FLAG_REGOLARITA_CONTRIBUTIVA", "FLAG_REGOLARITA_CONTRIBUTIVA", 5, 2, 0, -13997);
    PAN_DISTIDILIQUI.SetValueListItem(PFL_DISTIDILIQUI_FLAGREGOCONT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTIDILIQUI.SetValueListItem(PFL_DISTIDILIQUI_FLAGREGOCONT, (new IDVariant()), "Null", "", "", -1);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, MyGlb.PANEL_LIST, 640, 60, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, MyGlb.PANEL_LIST, 108);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, MyGlb.PANEL_LIST, "Nulla Osta");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, MyGlb.PANEL_FORM, 4, 172, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_FLAGNULLOSTA, MyGlb.PANEL_FORM, "Nulla Osta");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_FLAGNULLOSTA, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_FLAGNULLOSTA, PPQRY_DISTILIQUIUT, "A.FLAG_NULLA_OSTA", "FLAG_NULLA_OSTA", 5, 2, 0, -13997);
    PAN_DISTIDILIQUI.SetValueListItem(PFL_DISTIDILIQUI_FLAGNULLOSTA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTIDILIQUI.SetValueListItem(PFL_DISTIDILIQUI_FLAGNULLOSTA, (new IDVariant()), "Null", "", "", -1);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, MyGlb.PANEL_LIST, 36, 264, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 196, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_UTENTEINSERI, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_UTENTEINSERI, PPQRY_DISTILIQUIUT, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, MyGlb.PANEL_LIST, 252, 264, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 220, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_DATAINSERIME, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_DATAINSERIME, PPQRY_DISTILIQUIUT, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, MyGlb.PANEL_LIST, 416, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 244, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_UTENTULTIAGG, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_UTENTULTIAGG, PPQRY_DISTILIQUIUT, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, MyGlb.PANEL_LIST, 416, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 268, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, MyGlb.PANEL_FORM, 160);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_DATAULTIMAGG, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_DATAULTIMAGG, PPQRY_DISTILIQUIUT, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, MyGlb.PANEL_LIST, 0, 280, 524, 80, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, MyGlb.PANEL_LIST, 48);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, MyGlb.PANEL_LIST, 5);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, MyGlb.PANEL_LIST, "Storico Check");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, MyGlb.PANEL_FORM, 4, 292, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, MyGlb.PANEL_FORM, 96);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, MyGlb.PANEL_FORM, 2);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_STORICOCHECK, MyGlb.PANEL_FORM, "Storico Check");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_STORICOCHECK, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_STORICOCHECK, PPQRY_DISTILIQUIUT, "A.STORICO_CHECK", "STORICO_CHECK", 5, 4000, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, MyGlb.PANEL_LIST, -8, 276, 720, 76, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, MyGlb.PANEL_LIST, 52);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, MyGlb.PANEL_LIST, 5);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, MyGlb.PANEL_LIST, "Storico Check");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, MyGlb.PANEL_FORM, 4, 340, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, MyGlb.PANEL_FORM, 104);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_VISUALIZZAST, MyGlb.PANEL_FORM, "Storico Check");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_VISUALIZZAST, -1, -1);
    PAN_DISTIDILIQUI.SetFieldUnbound(PFL_DISTIDILIQUI_VISUALIZZAST, true);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_VISUALIZZAST, PPQRY_DISTILIQUIUT, "REPLACE(A.STORICO_CHECK, ';', CHR(10))", "VISUALIZZAST", 5, 99, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, MyGlb.PANEL_LIST, 144);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, MyGlb.PANEL_LIST, 2);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, MyGlb.PANEL_LIST, "ULTIMO UTENTE FLAG CC");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, MyGlb.PANEL_FORM, 4, 364, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, MyGlb.PANEL_FORM, 144);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, MyGlb.PANEL_FORM, 2);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLACC, MyGlb.PANEL_FORM, "ULTIMO UTENTE FLAG CC");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_ULTIUTEFLACC, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_ULTIUTEFLACC, PPQRY_DISTILIQUIUT, "A.ULTIMO_UTENTE_FLAG_CC", "ULTIMO_UTENTE_FLAG_CC", 5, 255, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, MyGlb.PANEL_LIST, 136);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, MyGlb.PANEL_LIST, "ULTIMA DATA FLAG CC");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, MyGlb.PANEL_FORM, 4, 364, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, MyGlb.PANEL_FORM, 136);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLACC, MyGlb.PANEL_FORM, "ULTIMA DATA FLAG CC");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_ULTIDATFLACC, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_ULTIDATFLACC, PPQRY_DISTILIQUIUT, "A.ULTIMA_DATA_FLAG_CC", "ULTIMA_DATA_FLAG_CC", 8, 16, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, MyGlb.PANEL_LIST, 148);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, MyGlb.PANEL_LIST, 2);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, MyGlb.PANEL_LIST, "ULTIMO UTENTE FLAG NO");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, MyGlb.PANEL_FORM, 4, 364, 580, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, MyGlb.PANEL_FORM, 148);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, MyGlb.PANEL_FORM, 2);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLANO, MyGlb.PANEL_FORM, "ULTIMO UTENTE FLAG NO");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_ULTIUTEFLANO, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_ULTIUTEFLANO, PPQRY_DISTILIQUIUT, "A.ULTIMO_UTENTE_FLAG_NO", "ULTIMO_UTENTE_FLAG_NO", 5, 255, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, MyGlb.PANEL_LIST, 8, 44, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, MyGlb.PANEL_LIST, 136);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, MyGlb.PANEL_LIST, "ULTIMA DATA FLAG NO");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, MyGlb.PANEL_FORM, 12, 372, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, MyGlb.PANEL_FORM, 136);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLANO, MyGlb.PANEL_FORM, "ULTIMA DATA FLAG NO");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_ULTIDATFLANO, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_ULTIDATFLANO, PPQRY_DISTILIQUIUT, "A.ULTIMA_DATA_FLAG_NO", "ULTIMA_DATA_FLAG_NO", 8, 16, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, MyGlb.PANEL_LIST, 148);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, MyGlb.PANEL_LIST, 2);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, MyGlb.PANEL_LIST, "ULTIMO UTENTE FLAG RC");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, MyGlb.PANEL_FORM, 12, 372, 580, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, MyGlb.PANEL_FORM, 148);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, MyGlb.PANEL_FORM, 2);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLARC, MyGlb.PANEL_FORM, "ULTIMO UTENTE FLAG RC");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_ULTIUTEFLARC, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_ULTIUTEFLARC, PPQRY_DISTILIQUIUT, "A.ULTIMO_UTENTE_FLAG_RC", "ULTIMO_UTENTE_FLAG_RC", 5, 255, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, MyGlb.PANEL_LIST, 16, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, MyGlb.PANEL_LIST, 136);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, MyGlb.PANEL_LIST, "ULTIMA DATA FLAG RC");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, MyGlb.PANEL_FORM, 20, 380, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, MyGlb.PANEL_FORM, 136);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLARC, MyGlb.PANEL_FORM, "ULTIMA DATA FLAG RC");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_ULTIDATFLARC, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_ULTIDATFLARC, PPQRY_DISTILIQUIUT, "A.ULTIMA_DATA_FLAG_RC", "ULTIMA_DATA_FLAG_RC", 8, 16, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, MyGlb.PANEL_LIST, 144);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, MyGlb.PANEL_LIST, 2);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, MyGlb.PANEL_LIST, "ULTIMO UTENTE FLAG SF");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, MyGlb.PANEL_FORM, 12, 372, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, MyGlb.PANEL_FORM, 144);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, MyGlb.PANEL_FORM, 2);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIUTEFLASF, MyGlb.PANEL_FORM, "ULTIMO UTENTE FLAG SF");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_ULTIUTEFLASF, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_ULTIUTEFLASF, PPQRY_DISTILIQUIUT, "A.ULTIMO_UTENTE_FLAG_SF", "ULTIMO_UTENTE_FLAG_SF", 5, 255, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, MyGlb.PANEL_LIST, 24, 60, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, MyGlb.PANEL_LIST, 136);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, MyGlb.PANEL_LIST, "ULTIMA DATA FLAG SF");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, MyGlb.PANEL_FORM, 28, 388, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, MyGlb.PANEL_FORM, 136);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_ULTIDATFLASF, MyGlb.PANEL_FORM, "ULTIMA DATA FLAG SF");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_ULTIDATFLASF, -1, -1);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_ULTIDATFLASF, PPQRY_DISTILIQUIUT, "A.ULTIMA_DATA_FLAG_SF", "ULTIMA_DATA_FLAG_SF", 8, 16, 0, -13997);
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, MyGlb.PANEL_LIST, 60);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, MyGlb.PANEL_LIST, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, MyGlb.PANEL_LIST, "Conta Liq");
    PAN_DISTIDILIQUI.SetRect(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, MyGlb.PANEL_FORM, 4, 364, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTIDILIQUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, MyGlb.PANEL_FORM, 60);
    PAN_DISTIDILIQUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, MyGlb.PANEL_FORM, 1);
    PAN_DISTIDILIQUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTIDILIQUI_CONTALIQ, MyGlb.PANEL_FORM, "Conta Liq");
    PAN_DISTIDILIQUI.SetFieldPage(PFL_DISTIDILIQUI_CONTALIQ, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  COUNT(*) ");
  SQL.append("from ");
  SQL.append("  LIQ B, ");
  SQL.append("  FAT C ");
  SQL.append("where (B.FAT_NUMERO_PROG = C.NUMERO_PROG) ");
  SQL.append("and   (B.FAT_ANNO_PROG = C.ANNO_PROG) ");
  SQL.append("and   (C.NUMERO_DISTINTA_UT = A.NUMERO) ");
  SQL.append("and   (C.ANNO_DISTINTA_UT = A.ANNO) ");
  SQL.append(")");
    PAN_DISTIDILIQUI.SetFieldUnbound(PFL_DISTIDILIQUI_CONTALIQ, true);
    PAN_DISTIDILIQUI.SetFieldPanel(PFL_DISTIDILIQUI_CONTALIQ, PPQRY_DISTILIQUIUT, SQL.toString(), "CONTALIQ", 1, 19, 0, -13997);
  }

  private void PAN_DISTIDILIQUI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTIDILIQUI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIUTENCOD1 ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("where (A.CODICE = ~~UTENZA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DISTIDILIQUI.SetQuery(PPQRY_TIPIUTENZA, 0, SQL, PFL_DISTIDILIQUI_UTENZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIUTENCOD1 ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DISTIDILIQUI.SetQuery(PPQRY_TIPIUTENZA, 1, SQL, PFL_DISTIDILIQUI_UTENZA, "");
    PAN_DISTIDILIQUI.SetQueryDB(PPQRY_TIPIUTENZA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTIDILIQUI.SetIMDB(IMDB, "PQRY_DISTILIQUIUT", true);
    PAN_DISTIDILIQUI.set_SetString(MyGlb.MASTER_ROWNAME, "DISTINTE LIQUIDAZIONE UT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO as ANNO, ");
    SQL.append("  A.NUMERO as NUMERO, ");
    SQL.append("  A.DATA as DATA, ");
    SQL.append("  A.UTENZA as UTENZA, ");
    SQL.append("  A.FLAG_COND_CONTRATTUALI as FLAG_COND_CONTRATTUALI, ");
    SQL.append("  A.FLAG_SCELTA_FORNITORI as FLAG_SCELTA_FORNITORI, ");
    SQL.append("  A.FLAG_REGOLARITA_CONTRIBUTIVA as FLAG_REGOLARITA_CONTRIBUTIVA, ");
    SQL.append("  A.FLAG_NULLA_OSTA as FLAG_NULLA_OSTA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.STORICO_CHECK as STORICO_CHECK, ");
    SQL.append("  REPLACE(A.STORICO_CHECK, ';', CHR(10)) as VISUALIZZAST, ");
    SQL.append("  A.ULTIMO_UTENTE_FLAG_CC as ULTIMO_UTENTE_FLAG_CC, ");
    SQL.append("  A.ULTIMO_UTENTE_FLAG_NO as ULTIMO_UTENTE_FLAG_NO, ");
    SQL.append("  A.ULTIMO_UTENTE_FLAG_RC as ULTIMO_UTENTE_FLAG_RC, ");
    SQL.append("  A.ULTIMO_UTENTE_FLAG_SF as ULTIMO_UTENTE_FLAG_SF, ");
    SQL.append("  A.ULTIMA_DATA_FLAG_CC as ULTIMA_DATA_FLAG_CC, ");
    SQL.append("  A.ULTIMA_DATA_FLAG_NO as ULTIMA_DATA_FLAG_NO, ");
    SQL.append("  A.ULTIMA_DATA_FLAG_SF as ULTIMA_DATA_FLAG_SF, ");
    SQL.append("  A.ULTIMA_DATA_FLAG_RC as ULTIMA_DATA_FLAG_RC, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  LIQ B, ");
    SQL.append("  FAT C ");
    SQL.append("where (B.FAT_NUMERO_PROG = C.NUMERO_PROG) ");
    SQL.append("and   (B.FAT_ANNO_PROG = C.ANNO_PROG) ");
    SQL.append("and   (C.NUMERO_DISTINTA_UT = A.NUMERO) ");
    SQL.append("and   (C.ANNO_DISTINTA_UT = A.ANNO) ");
    SQL.append(") as CONTALIQ ");
    PAN_DISTIDILIQUI.SetQuery(PPQRY_DISTILIQUIUT, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DISTINTE_LIQUIDAZIONE_UT A ");
    PAN_DISTIDILIQUI.SetQuery(PPQRY_DISTILIQUIUT, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTIDILIQUI.SetQuery(PPQRY_DISTILIQUIUT, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTIDILIQUI.SetQuery(PPQRY_DISTILIQUIUT, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTIDILIQUI.SetQuery(PPQRY_DISTILIQUIUT, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTIDILIQUI.SetQuery(PPQRY_DISTILIQUIUT, 5, SQL, -1, "");
    PAN_DISTIDILIQUI.SetQueryDB(PPQRY_DISTILIQUIUT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTIDILIQUI.SetMasterTable(0, "DISTINTE_LIQUIDAZIONE_UT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTIDILIQUI.Status() == 2)
    {
      int oldListQBE = PAN_DISTIDILIQUI.iUseListQBE;
      PAN_DISTIDILIQUI.iUseListQBE = 0;
      PAN_DISTIDILIQUI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTIDILIQUI.PanelCommand(Glb.PCM_FIND);
      PAN_DISTIDILIQUI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISTIDILIQUI) PAN_DISTIDILIQUI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTIDILIQUI) PAN_DISTIDILIQUI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISTIDILIQUI) PAN_DISTIDILIQUI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTIDILIQUI) PAN_DISTIDILIQUI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISTIDILIQUI) PAN_DISTIDILIQUI_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTIDILIQUI) PAN_DISTIDILIQUI_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_DISTIDILIQUI) PAN_DISTIDILIQUI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DISTIDILIQUI) PAN_DISTIDILIQUI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
