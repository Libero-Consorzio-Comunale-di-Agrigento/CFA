// **********************************************
// Variazioni Accertamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniAccertamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PERIODO = 0;

  private static int PFL_PARAMETRI_DAL = 0;
  private static int PFL_PARAMETRI_AL = 1;
  private static int PFL_PARAMETRI_NEWPANELLABE = 2;
  private static int PFL_PARAMETRI_RESIDUCOMPET = 3;
  private static int PFL_PARAMETRI_PROPOSTA = 4;
  private static int PFL_PARAMETRI_TRATTIPROPOS = 5;
  private static int PFL_PARAMETRI_NUMEROPROP = 6;
  private static int PFL_PARAMETRI_BARRAPROPOST = 7;
  private static int PFL_PARAMETRI_ANNOPROP = 8;
  private static int PFL_PARAMETRI_DELIBERA = 9;
  private static int PFL_PARAMETRI_SLASHLABEL = 10;
  private static int PFL_PARAMETRI_NUMERODEL = 11;
  private static int PFL_PARAMETRI_TRATTILABEL1 = 12;
  private static int PFL_PARAMETRI_ANNODEL = 13;
  private static int PFL_PARAMETRI_TIPOVARIAZIO = 14;
  private static int PFL_PARAMETRI_APRSELDELBUT = 15;
  private static int PFL_PARAMETRI_APRINFDELBUT = 16;
  private static int PFL_PARAMETRI_ELABORBUTTON = 17;
  private static int PFL_PARAMETRI_APRISELEPROP = 18;
  private static int PFL_PARAMETRI_APRIINFOPROP = 19;

  private static int PPQRY_PARAMETRI209 = 0;

  private static int PPQRY_T56 = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI265(IMDB);
    //
    //
    Init_PQRY_PARAMETRI209(IMDB);
    Init_PQRY_PARAMETRI209_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI265(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI265, 10);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI265, "TBL_PARAMETRI265");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMPERDAL, "ROWNAMPERDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMPERDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMEPERAL, "ROWNAMEPERAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMEPERAL,6,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMRESCOM,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMEPROPO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI265,IMDBDef4.FLD_PARAMETRI265_ROWNAMNUMPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI265, 0);
  }

  private static void Init_PQRY_PARAMETRI209(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI209, 10);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI209, "PQRY_PARAMETRI209");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMPERDAL, "ROWNAMPERDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMPERDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPERAL, "ROWNAMEPERAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPERAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMRESCOM,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209,IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI209, 0);
  }

  private static void Init_PQRY_PARAMETRI209_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI209_RS, 10);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI209_RS, "PQRY_PARAMETRI209_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMPERDAL, "ROWNAMPERDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMPERDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPERAL, "ROWNAMEPERAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPERAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMRESCOM,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI209_RS,IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniAccertamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniAccertamenti()
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
    FormIdx = MyGlb.FRM_VARIAZACCERT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D30708F1-BA9D-4345-9EBF-BFAF806B3CF8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 344;
    DesignHeight = 294;
    set_Caption(new IDVariant("Variazioni Accertamenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 344;
    Frames[1].Height = 268;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 268;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 344-MyGlb.PAN_OFFS_X, 268-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "25103828-3F04-4BDB-8E73-6DBD53EFCB9E");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1136, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI265, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAZACCERT_PARAMETRI209();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRSELDELBUT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRISELEPROP) {
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
    return (obj instanceof VariazioniAccertamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniAccertamenti.class.getName() : (Glb.ClassWithPackage(VariazioniAccertamenti.class) ? VariazioniAccertamenti.class.getName().substring(VariazioniAccertamenti.class.getPackage().getName().length() + 1) : VariazioniAccertamenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
      // 
      // Parametri On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, 0))))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0));
        v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0);
        MainFrm.ControlloDelibereNonDaInserire(v_SEDEDEL, v_ANNODEL, v_NUMERODEL);
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0))))
      {
        IDVariant v_UNITAPROP = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NUMEROPROP = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANNOPROP = new IDVariant(0,IDVariant.INTEGER);
        v_UNITAPROP = IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0));
        v_NUMEROPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0);
        v_ANNOPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0);
        MainFrm.ControlloProposte(v_UNITAPROP, v_ANNOPROP, v_NUMEROPROP);
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0, new IDVariant(v_UNITAPROP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0, new IDVariant(v_NUMEROPROP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0, new IDVariant(v_ANNOPROP));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "ParametriOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0))) && MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "ParametriOnDynamicPropertiesEvent", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Variazioni Accertamenti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMPERDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMEPERAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMRESCOM, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "LoadEvent", _e);
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
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMPERDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMEPERAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMRESCOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMTIPVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMEPROPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMNUMPRO, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora Procedure
  // **********************************************************************
  public int ElaboraProcedure ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Procedure Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMPERDAL, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPERAL, 0), true)>0)
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Invalidazione date di ricerca: possibile incoerenza nei dati di ricerca per data", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG); 
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, 0))))
      {
        if ((IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, 0))))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("I dati della Delibera sono incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0),(new IDVariant("-1"))).compareTo((new IDVariant("-1")), true)!=0 || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0))))
      {
        if ((IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0),(new IDVariant("-1"))).equals((new IDVariant("-1")), true) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0))))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("I dati della Proposta sono incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
      }
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("COMP"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("DATA_DAL"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("DATA_AL"));
      IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR5 = (new IDVariant("SEDE_DEL"));
      IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR6 = (new IDVariant("NUMERO_DEL"));
      IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR7 = (new IDVariant("ANNO_DEL"));
      IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR8 = (new IDVariant("UNITA_PROP"));
      IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR9 = (new IDVariant("NUMERO_PROP"));
      IDVariant v_NOMEPAR10 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR10 = (new IDVariant("ANNO_PROP"));
      IDVariant v_NOMEPAR11 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR11 = (new IDVariant("TIPO_VAR"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Variazioni_Accertamenti"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMRESCOM, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMPERDAL, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPERAL, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_SEDE_DEL, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_NUMERO_DEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ANNO_DEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR10, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR11, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMTIPVAR, 0),(new IDVariant(-1)))));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "ElaboraProcedure", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposte Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "SelezioneProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposte Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMEPROPO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMNUMPRO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI209, IMDBDef14.PQSL_PARAMETRI209_ROWNAMANNPRO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAccertamenti", "InfoProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAZACCERT_PARAMETRI209() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI209_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI265, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI265, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI209_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI209_RS, 0, IMDBDef4.TBL_PARAMETRI265, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 0, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMPERDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 1, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMEPERAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 2, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMRESCOM, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 3, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 4, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 5, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 6, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 7, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMEPROPO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 8, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI209_RS, 9, 0, IMDBDef4.TBL_PARAMETRI265, IMDBDef4.FLD_PARAMETRI265_ROWNAMNUMPRO, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI265, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI265, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI265, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI209_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_APRSELDELBUT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRINFDELBUT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ElaboraProcedure();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRISELEPROP)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIINFOPROP)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "2AD225EB-9D4C-401D-96DB-1ECA911E3A55");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "Periodo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 0, -9999, 416, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 28, 11, 272, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 43);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "134D6BA8-99EF-40F1-8752-DEC8D9A5EBEA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "5323A34D-077B-4552-B069-F3AF97681316");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "97418046-AD09-4973-B5DD-C1F88A60400D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, "A3F673DC-0D09-41A2-B89B-EF3037D0A39A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, "Residui Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "0BBA776E-6E10-4D8A-AC91-8C0E04946EDD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "AE57198C-EEC8-43A3-B1E8-0648D52B5497");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, "AB064C12-DC1C-4168-9D20-AE4DCFD52081");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, "Numero Prop");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "B68DA8D7-A076-4D15-AA4F-5F27F7288759");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, "EE8BEE48-F247-4E61-BBD6-A937C92F330F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, "Anno Prop");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "CB6A750B-130B-4DE0-AEFD-BA7D180DF341");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, "50FC0164-7A7E-43B8-BDBC-D0CC2662780D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "B9E99290-81D0-4338-86D5-FB55D9E873BD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "NUMERO DEL");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, "4591E3AB-1B7C-4F51-A66B-77B29ABC43C2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "ABC4CFE3-837C-478E-8DC1-5E3851E951CE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "ANNO DEL");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "449F76CF-8A18-4F8A-AED6-466E1B34A7B4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, "00A44324-8901-4DCC-8B9C-B592AAC81281");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, "A7FF20C5-789A-46FC-953F-54DD46CDB778");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "2E36954F-061C-44C2-A23D-6637F18FA4B1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, "E5ACA3DC-62B3-4F48-AB81-26F8595342C3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, "D06F461B-C6FB-40BB-94FA-6576EC27DA78");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 32, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI209, "A.ROWNAMPERDAL", "ROWNAMPERDAL", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 208, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 160, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI209, "A.ROWNAMEPERAL", "ROWNAMEPERAL", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 76, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 284, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, MyGlb.PANEL_LIST, 416, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, MyGlb.PANEL_LIST, 172);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, MyGlb.PANEL_LIST, "Residui Competenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, MyGlb.PANEL_FORM, 68, 68, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, MyGlb.PANEL_FORM, 200);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUCOMPET, MyGlb.PANEL_FORM, "Residui Competenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RESIDUCOMPET, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RESIDUCOMPET, PPQRY_PARAMETRI209, "A.ROWNAMRESCOM", "ROWNAMRESCOM", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUCOMPET, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUCOMPET, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUCOMPET, (new IDVariant("T")), "Entrambi", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, "Prop.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 24, 96, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTA, PPQRY_PARAMETRI209, "A.ROWNAMEPROPO", "ROWNAMEPROPO", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 64, 60, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 196, 96, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTIPROPOS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, "Numero Prop");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, 148, 96, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, "Num. Prop");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROP, PPQRY_PARAMETRI209, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 56, 52, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 132, 96, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRAPROPOST, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, "Anno Prop");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, 216, 96, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, "Ann. Prop");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROP, PPQRY_PARAMETRI209, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 832, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 28, 124, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMETRI209, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_LIST, 48, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_FORM, 132, 124, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SLASHLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SLASHLABEL, -1, "", "SLASHLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 872, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 148, 124, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, "NUMERO DEL");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODEL, PPQRY_PARAMETRI209, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_LIST, 56, 52, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_FORM, 196, 124, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTILABEL1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTILABEL1, -1, "", "TRATTILABEL1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 912, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 216, 124, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODEL, PPQRY_PARAMETRI209, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 624, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 152, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVARIAZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVARIAZIO, PPQRY_PARAMETRI209, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, MyGlb.PANEL_LIST, 120, 80, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, MyGlb.PANEL_FORM, 260, 128, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELDELBUT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRSELDELBUT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRSELDELBUT, -1, "", "APRSELDELBUT", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, MyGlb.PANEL_LIST, 128, 88, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, MyGlb.PANEL_FORM, 280, 128, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFDELBUT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRINFDELBUT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRINFDELBUT, -1, "", "APRINFDELBUT", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 172, 112, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 172, 192, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, MyGlb.PANEL_LIST, 128, 88, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, MyGlb.PANEL_FORM, 260, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISELEPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISELEPROP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISELEPROP, -1, "", "APRISELEPROP", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, MyGlb.PANEL_LIST, 136, 96, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, MyGlb.PANEL_FORM, 280, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIINFOPROP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIINFOPROP, -1, "", "APRIINFOPROP", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T56DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVAR~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMTIPVAR~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T56, 0, SQL, PFL_PARAMETRI_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T56DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T56, 1, SQL, PFL_PARAMETRI_TIPOVARIAZIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T56, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI209", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI209, IMDBDef14.PQRY_PARAMETRI209_RS, IMDBDef4.TBL_PARAMETRI265);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef4.FLD_PARAMETRI265_ROWNAMPERDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef4.FLD_PARAMETRI265_ROWNAMEPERAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_RESIDUCOMPET, IMDBDef4.FLD_PARAMETRI265_ROWNAMRESCOM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROPOSTA, IMDBDef4.FLD_PARAMETRI265_ROWNAMEPROPO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROP, IMDBDef4.FLD_PARAMETRI265_ROWNAMNUMPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROP, IMDBDef4.FLD_PARAMETRI265_ROWNAMANNPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef4.FLD_PARAMETRI265_SEDE_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODEL, IMDBDef4.FLD_PARAMETRI265_NUMERO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODEL, IMDBDef4.FLD_PARAMETRI265_ANNO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVARIAZIO, IMDBDef4.FLD_PARAMETRI265_ROWNAMTIPVAR);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI265");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
