// **********************************************
// Situazione Proposte
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneProposte extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_DATALIMITE = 0;
  private static int PFL_PARS_SCELTADATA = 1;

  private static int PPQRY_PARS24 = 0;


  IDPanel PAN_PARS;
  private static int PFL_PROPOSTE_UNITAORGANIZ = 0;
  private static int PFL_PROPOSTE_NUMERO = 1;
  private static int PFL_PROPOSTE_DATA = 2;
  private static int PFL_PROPOSTE_URGENTE = 3;
  private static int PFL_PROPOSTE_DESCRIZIONE = 4;
  private static int PFL_PROPOSTE_PROGUNITORGA = 5;
  private static int PFL_PROPOSTE_PROPOSTVARID = 6;

  private static int PPQRY_POLPROPOSVAR = 0;

  private static int PPQRY_ANAGUNITORGA = 1;


  IDPanel PAN_PROPOSTE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS9(IMDB);
    //
    //
    Init_PQRY_PARS24(IMDB);
    Init_PQRY_PARS24_RS(IMDB);
    Init_PQRY_POLPROPOSVAR(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS9, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS9, "TBL_PARS9");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS9,IMDBDef4.FLD_PARS9_ROWNAMDATLIM, "ROWNAMDATLIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS9,IMDBDef4.FLD_PARS9_ROWNAMDATLIM,6,14,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS9, 0);
  }

  private static void Init_PQRY_PARS24(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS24, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS24, "PQRY_PARS24");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS24,IMDBDef12.PQSL_PARS24_ROWNAMDATLIM, "ROWNAMDATLIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS24,IMDBDef12.PQSL_PARS24_ROWNAMDATLIM,6,14,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS24, 0);
  }

  private static void Init_PQRY_PARS24_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS24_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS24_RS, "PQRY_PARS24_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS24_RS,IMDBDef12.PQSL_PARS24_ROWNAMDATLIM, "ROWNAMDATLIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS24_RS,IMDBDef12.PQSL_PARS24_ROWNAMDATLIM,6,14,0);
  }

  private static void Init_PQRY_POLPROPOSVAR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROPOSVAR, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROPOSVAR, "PQRY_POLPROPOSVAR");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_DESCRIZIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_NUM_PROPOSTA, "NUM_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_NUM_PROPOSTA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_URGENTE, "URGENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_URGENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_PROPOSTA_VAR_ID, "PROPOSTA_VAR_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROPOSVAR,IMDBDef12.PQSL_POLPROPOSVAR_PROPOSTA_VAR_ID,3,10,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROPOSVAR, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneProposte(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneProposte()
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
    FormIdx = MyGlb.FRM_SITUAZPROPOS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "42B9537F-0148-4D29-BF86-6A437C802A1F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 656;
    DesignHeight = 422;
    set_Caption(new IDVariant("Situazione Proposte"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 656;
    Frames[1].Height = 396;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.181818;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 656;
    Frames[2].Height = 72;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 72;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 656-MyGlb.PAN_OFFS_X, 72-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F781E1B5-61E2-42B8-BF8B-59AF4486C0C0");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 104, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 656;
    Frames[3].Height = 324;
    Frames[3].Caption = "Proposte";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 324;
    PAN_PROPOSTE = new IDPanel(w, this, 3, "PAN_PROPOSTE");
    Frames[3].Content = PAN_PROPOSTE;
    PAN_PROPOSTE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROPOSTE.VS = MainFrm.VisualStyleList;
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 656-MyGlb.PAN_OFFS_X, 324-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D6789B8A-40C8-4082-8AD8-2D5C7235E34D");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 616, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROPOSTE.InitStatus = 2;
    PAN_PROPOSTE_Init();
    PAN_PROPOSTE_InitFields();
    PAN_PROPOSTE_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FA3+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI85+BaseCmdSetIdx, "M" + (MyGlb.CMD_FA3+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DETTAGPROPOS+BaseCmdLinIdx)
      {
        ApriDettagliProposta();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SOLLECCHIUSU+BaseCmdLinIdx)
      {
        ApriSollecitoChiusura();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS9, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITUAZPROPOS_PARS24();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_PROPOSTE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELDATALIMI && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_SCELTADATA) {
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
    return (obj instanceof SituazioneProposte);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneProposte.class.getName() : (Glb.ClassWithPackage(SituazioneProposte.class) ? SituazioneProposte.class.getName().substring(SituazioneProposte.class.getPackage().getName().length() + 1) : SituazioneProposte.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Data Da Form
  // **********************************************************************
  public int SceltaDataDaForm ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Data Da Form Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELDATALIMI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposte", "SceltaDataDaForm", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Dettagli Proposta
  // **********************************************************************
  public int ApriDettagliProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Dettagli Proposta Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_IN8, IMDBDef4.FLD_IN8_ROWNAMPRVAID, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_POLPROPOSVAR, IMDBDef12.PQSL_POLPROPOSVAR_PROPOSTA_VAR_ID, 0),IDVariant.INTEGER));
      MainFrm.Show(MyGlb.FRM_DETTAGPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposte", "ApriDettagliProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Sollecito Chiusura
  // **********************************************************************
  public int ApriSollecitoChiusura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Sollecito Chiusura Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMPRVAID, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_POLPROPOSVAR, IMDBDef12.PQSL_POLPROPOSVAR_PROPOSTA_VAR_ID, 0),IDVariant.INTEGER));
      MainFrm.Show(MyGlb.FRM_SOLLCHIUPROP, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposte", "ApriSollecitoChiusura", _e);
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
    IDVariant v_TOOL = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOL = (new IDVariant("Elenco Date Limite da Bozze", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_PARS.set_ToolTip(Glb.OBJ_FIELD,PFL_PARS_SCELTADATA,v_TOOL.stringValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARS9, IMDBDef4.FLD_PARS9_ROWNAMDATLIM, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposte", "LoadEvent", _e);
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
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELDATALIMI)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARS24, IMDBDef12.PQSL_PARS24_ROWNAMDATLIM, 0, IMDB.Value(IMDBDef7.PQRY_POLBOZZEVARI, IMDBDef7.PQSL_POLBOZZEVARI_DATA_LIMITE_PROPOSTE, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARS9, IMDBDef4.FLD_PARS9_ROWNAMDATLIM, 0, IMDB.Value(IMDBDef7.PQRY_POLBOZZEVARI, IMDBDef7.PQSL_POLBOZZEVARI_DATA_LIMITE_PROPOSTE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposte", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Proposte On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROPOSTE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROPOSTE);
      // 
      // Proposte On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PROPOSTE.set_ToolTip(Glb.OBJ_FIELD,PFL_PROPOSTE_UNITAORGANIZ,(new IDVariant(PAN_PROPOSTE.FieldText(PFL_PROPOSTE_UNITAORGANIZ))).stringValue()); 
      PAN_PROPOSTE.set_ToolTip(Glb.OBJ_FIELD,PFL_PROPOSTE_DESCRIZIONE,(new IDVariant(PAN_PROPOSTE.FieldText(PFL_PROPOSTE_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposte", "ProposteOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Proposte On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_PROPOSTE_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proposte On Change Row Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROPOSVAR, IMDBDef12.PQSL_POLPROPOSVAR_PROPOSTA_VAR_ID, 0)))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CS30+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CS30+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposte", "ProposteOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Primary record source for panel data
  // **********************************************************************
  private void SITUAZPROPOS_PARS24() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS24_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS9, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS9, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS24_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS24_RS, 0, IMDBDef4.TBL_PARS9, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS24_RS, 0, 0, IMDBDef4.TBL_PARS9, IMDBDef4.FLD_PARS9_ROWNAMDATLIM, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS9, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS9, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS9, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS24_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_SCELTADATA)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDataDaForm();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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
  private void PAN_PROPOSTE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROPOSTE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROPOSTE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROPOSTE, Cancel);
    // Stub
  }

  private void PAN_PROPOSTE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PROPOSTE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PROPOSTE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROPOSTE_IntValidateRow(Cancel);
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
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, "B8C7FE66-4A37-49D5-B47B-4B33C439F0D3");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, "Data Limite");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, "2A56EBBD-8D4B-43ED-ADDB-DB08FF2DD577");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, 0, "wsearch.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, MyGlb.PANEL_LIST, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, MyGlb.PANEL_LIST, "Data Limite");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, MyGlb.PANEL_FORM, 4, 16, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, MyGlb.PANEL_FORM, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATALIMITE, MyGlb.PANEL_FORM, "Data Limite");
    PAN_PARS.SetFieldPage(PFL_PARS_DATALIMITE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_DATALIMITE, PPQRY_PARS24, "A.ROWNAMDATLIM", "ROWNAMDATLIM", 6, 14, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, MyGlb.PANEL_LIST, 152, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, MyGlb.PANEL_FORM, 176, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SCELTADATA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_SCELTADATA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_SCELTADATA, -1, "", "SCELTADATA", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS24", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS24, IMDBDef12.PQRY_PARS24_RS, IMDBDef4.TBL_PARS9);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DATALIMITE, IMDBDef4.FLD_PARS9_ROWNAMDATLIM);
    PAN_PARS.SetMasterTable(0, "PARS9");
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

  private void PAN_PROPOSTE_Init()
  {

    PAN_PROPOSTE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROPOSTE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROPOSTE.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, "C56D334F-2570-4097-8650-36AAE3EBD360");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, "B5E2869B-7962-48CC-8683-7EC8784546A7");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, "Numero");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, "5EFD83E3-4DF4-466A-8603-EEDC507F80F6");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, "Data");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, "AEDEADF9-969B-4E0C-AD61-81257F284362");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, "Urgente");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, "E8F55F56-5454-4AFD-9787-44CA35CDEFC3");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, "Descrizione");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, "3381454F-F4D7-492F-8C02-3F5AFDAC1B95");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, MyGlb.VIS_NONNULLAFIEL);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, 0, -1);
    PAN_PROPOSTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, "02127B68-5339-46A0-AAFD-3179906DCD25");
    PAN_PROPOSTE.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, "PROPOSTA VAR ID");
    PAN_PROPOSTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, "");
    PAN_PROPOSTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PROPOSTE.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_PROPOSTE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_LIST, 252);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_FORM, 4, 88, 560, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_FORM, 252);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_FORM, 2);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_UNITAORGANIZ, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_UNITAORGANIZ, PPQRY_ANAGUNITORGA, "SUBSTR(A.DESCRIZIONE, 1, 30)", "ANAUNIORGDES", 5, 99, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_LIST, 208, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_LIST, 88);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_FORM, 4, 64, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_FORM, 88);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_NUMERO, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_NUMERO, PPQRY_POLPROPOSVAR, "A.NUM_PROPOSTA", "NUM_PROPOSTA", 1, 8, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, 268, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, 36);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, 36);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_DATA, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_DATA, PPQRY_POLPROPOSVAR, "A.DATA", "DATA", 6, 19, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, MyGlb.PANEL_LIST, 336, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, MyGlb.PANEL_LIST, 56);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, MyGlb.PANEL_LIST, "Urgente");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, MyGlb.PANEL_FORM, 4, 148, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, MyGlb.PANEL_FORM, 56);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_URGENTE, MyGlb.PANEL_FORM, "Urgente");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_URGENTE, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_URGENTE, PPQRY_POLPROPOSVAR, "A.URGENTE", "URGENTE", 5, 2, 0, -13997);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_URGENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PROPOSTE.SetValueListItem(PFL_PROPOSTE_URGENTE, (new IDVariant()), "Null", "", "", -1);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_LIST, 392, 36, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_DESCRIZIONE, -1, -1);
    PAN_PROPOSTE.SetFieldUnbound(PFL_PROPOSTE_DESCRIZIONE, true);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_DESCRIZIONE, PPQRY_POLPROPOSVAR, "SUBSTR(A.DESCRIZIONE, 1, 40)", "DESCRIZIONE", 5, 99, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 40, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROGUNITORGA, MyGlb.PANEL_FORM, "PR. UNITA ORGANIZZATIVA");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_PROGUNITORGA, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_PROGUNITORGA, PPQRY_POLPROPOSVAR, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, MyGlb.PANEL_LIST, 608, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, MyGlb.PANEL_LIST, 100);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, MyGlb.PANEL_LIST, "PROPOSTA VAR ID");
    PAN_PROPOSTE.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, MyGlb.PANEL_FORM, 4, 172, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, MyGlb.PANEL_FORM, 100);
    PAN_PROPOSTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSTE_PROPOSTVARID, MyGlb.PANEL_FORM, "PROP. VAR ID");
    PAN_PROPOSTE.SetFieldPage(PFL_PROPOSTE_PROPOSTVARID, -1, -1);
    PAN_PROPOSTE.SetFieldPanel(PFL_PROPOSTE_PROPOSTVARID, PPQRY_POLPROPOSVAR, "A.PROPOSTA_VAR_ID", "PROPOSTA_VAR_ID", 3, 10, 0, -13997);
  }

  private void PAN_PROPOSTE_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROPOSTE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 30) as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    PAN_PROPOSTE.SetQuery(PPQRY_ANAGUNITORGA, 0, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_ANAGUNITORGA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(PPQRY_ANAGUNITORGA, "ANAGRAFE_UNITA_ORGANIZZATIVE");
    PAN_PROPOSTE.SetIMDB(IMDB, "PQRY_POLPROPOSVAR", true);
    PAN_PROPOSTE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 40) as DESCRIZIONE, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.NUM_PROPOSTA as NUM_PROPOSTA, ");
    SQL.append("  A.DATA as DATA, ");
    SQL.append("  A.URGENTE as URGENTE, ");
    SQL.append("  A.PROPOSTA_VAR_ID as PROPOSTA_VAR_ID ");
    PAN_PROPOSTE.SetQuery(PPQRY_POLPROPOSVAR, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR A ");
    PAN_PROPOSTE.SetQuery(PPQRY_POLPROPOSVAR, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.STATO = 'A') ");
    SQL.append("and   (A.DATA <= ~~PQRY_PARS24.ROWNAMDATLIM~~) ");
    PAN_PROPOSTE.SetQuery(PPQRY_POLPROPOSVAR, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROPOSTE.SetQuery(PPQRY_POLPROPOSVAR, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROPOSTE.SetQuery(PPQRY_POLPROPOSVAR, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.NUM_PROPOSTA ");
    PAN_PROPOSTE.SetQuery(PPQRY_POLPROPOSVAR, 5, SQL, -1, "");
    PAN_PROPOSTE.SetQueryDB(PPQRY_POLPROPOSVAR, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSTE.SetMasterTable(0, "POL_PROPOSTE_VAR");
    PAN_PROPOSTE.AddToSortList(PFL_PROPOSTE_PROGUNITORGA, true);
    PAN_PROPOSTE.AddToSortList(PFL_PROPOSTE_NUMERO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROPOSTE.Status() == 2)
    {
      int oldListQBE = PAN_PROPOSTE.iUseListQBE;
      PAN_PROPOSTE.iUseListQBE = 0;
      PAN_PROPOSTE.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROPOSTE.PanelCommand(Glb.PCM_FIND);
      PAN_PROPOSTE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_OnChangeRow();
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PROPOSTE) PAN_PROPOSTE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
