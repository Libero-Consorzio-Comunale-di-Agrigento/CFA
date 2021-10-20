// **********************************************
// Impegni Di Competenza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImpegniDiCompetenza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMPEGDICOMPE_CAPITOLO = 0;
  private static int PFL_IMPEGDICOMPE_ARTICOLO = 1;
  private static int PFL_IMPEGDICOMPE_NUMEROIMP = 2;
  private static int PFL_IMPEGDICOMPE_ANNOIMP = 3;
  private static int PFL_IMPEGDICOMPE_DATA = 4;
  private static int PFL_IMPEGDICOMPE_DESCRIZIONE = 5;
  private static int PFL_IMPEGDICOMPE_IMPORTO = 6;
  private static int PFL_IMPEGDICOMPE_DEBITORE = 7;
  private static int PFL_IMPEGDICOMPE_SEDEDEL = 8;
  private static int PFL_IMPEGDICOMPE_NUMERODEL = 9;
  private static int PFL_IMPEGDICOMPE_ANNODEL = 10;
  private static int PFL_IMPEGDICOMPE_UNITAPROPONE = 11;
  private static int PFL_IMPEGDICOMPE_NUMEROPROPOS = 12;
  private static int PFL_IMPEGDICOMPE_ANNOPROPOSTA = 13;
  private static int PFL_IMPEGDICOMPE_PROGETTO = 14;
  private static int PFL_IMPEGDICOMPE_LABELCAPITOL = 15;
  private static int PFL_IMPEGDICOMPE_LABELIMPEGNO = 16;
  private static int PFL_IMPEGDICOMPE_LABELDELIBER = 17;
  private static int PFL_IMPEGDICOMPE_LABELPROPOST = 18;
  private static int PFL_IMPEGDICOMPE_RIFBILANCAPI = 19;
  private static int PFL_IMPEGDICOMPE_IMPEGNO = 20;
  private static int PFL_IMPEGDICOMPE_DELIBERA = 21;
  private static int PFL_IMPEGDICOMPE_PROPOSTA = 22;
  private static int PFL_IMPEGDICOMPE_OBIETTIVO = 23;

  private static int PPQRY_ESEIMPFIN1 = 0;


  IDPanel PAN_IMPEGDICOMPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI26(IMDB);
    //
    //
    Init_PQRY_ESEIMPFIN1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI26(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI26, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI26, "TBL_PARAMETRI26");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI26,IMDBDef1.FLD_PARAMETRI26_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI26,IMDBDef1.FLD_PARAMETRI26_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI26,IMDBDef1.FLD_PARAMETRI26_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI26,IMDBDef1.FLD_PARAMETRI26_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI26,IMDBDef1.FLD_PARAMETRI26_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI26,IMDBDef1.FLD_PARAMETRI26_PARAMTIPO,5,15,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI26, 0);
  }

  private static void Init_PQRY_ESEIMPFIN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ESEIMPFIN1, 20);
    IMDB.set_TblCode(IMDBDef8.PQRY_ESEIMPFIN1, "PQRY_ESEIMPFIN1");
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEOPERIBICA, "ESEOPERIBICA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEOPERIBICA,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEACOPEIMPE, "ESEACOPEIMPE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEACOPEIMPE,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEACOPEIMPO, "ESEACOPEIMPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEACOPEIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEACOPEDELI, "ESEACOPEDELI");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEACOPEDELI,5,208,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEACOPEPROP, "ESEACOPEPROP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ESEACOPEPROP,5,212,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_PROGETTO_ID,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_OBIETTIVO_ID, "OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN1,IMDBDef8.PQSL_ESEIMPFIN1_OBIETTIVO_ID,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ESEIMPFIN1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImpegniDiCompetenza(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImpegniDiCompetenza()
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
    FormIdx = MyGlb.FRM_IMPEGDICOMPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D72790CA-6248-4E7F-AF7C-4EC690B5FB3B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 398;
    set_Caption(new IDVariant("Impegni Di Competenza"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 372;
    Frames[1].Caption = "Impegni Di Competenza";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    PAN_IMPEGDICOMPE = new IDPanel(w, this, 1, "PAN_IMPEGDICOMPE");
    Frames[1].Content = PAN_IMPEGDICOMPE;
    PAN_IMPEGDICOMPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPEGDICOMPE.VS = MainFrm.VisualStyleList;
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7174F95E-D8A4-4E0B-8916-261D063F5EEC");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1276, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPEGDICOMPE.InitStatus = 2;
    PAN_IMPEGDICOMPE_Init();
    PAN_IMPEGDICOMPE_InitFields();
    PAN_IMPEGDICOMPE_InitQueries();
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
      PAN_IMPEGDICOMPE.UpdatePanel(MainFrm);
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
    return (obj instanceof ImpegniDiCompetenza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImpegniDiCompetenza.class.getName() : (Glb.ClassWithPackage(ImpegniDiCompetenza.class) ? ImpegniDiCompetenza.class.getName().substring(ImpegniDiCompetenza.class.getPackage().getName().length() + 1) : ImpegniDiCompetenza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Impegni Di Competenza On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPEGDICOMPE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMPEGDICOMPE);
      // 
      // Impegni Di Competenza On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_IMPEGDICOMPE.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPEGDICOMPE_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_ESEIMPFIN1, IMDBDef8.PQSL_ESEIMPFIN1_DESCRIZIONE, 0).stringValue()); 
      PAN_IMPEGDICOMPE.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPEGDICOMPE_DEBITORE,IMDB.Value(IMDBDef8.PQRY_ESEIMPFIN1, IMDBDef8.PQSL_ESEIMPFIN1_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniDiCompetenza", "ImpegniDiCompetenzaOnDynamicPropertiesEvent", _e);
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
      // PAN_IMPEGDICOMPE.set_FixedCols((new IDVariant(1)).intValue());
      Frames[PAN_IMPEGDICOMPE.FrIndex].set_Caption(IDL.Add(IDL.Add((new IDVariant(Frames[PAN_IMPEGDICOMPE.FrIndex].Caption)), (new IDVariant(" "))), IMDB.Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMTIPO, 0)).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMTIPO, 0), MainFrm.ESERCIZIO))));
      if (MainFrm.GESTOBIEATTI.compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_IMPEGDICOMPE.SetFlags (Glb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_IMPEGDICOMPE.SetFlags (Glb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniDiCompetenza", "LoadEvent", _e);
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
  private void PAN_IMPEGDICOMPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPEGDICOMPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPEGDICOMPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPEGDICOMPE, Cancel);
    // Stub
  }

  private void PAN_IMPEGDICOMPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPEGDICOMPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPEGDICOMPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ESEIMPFIN1, IMDBDef8.PQSL_ESEIMPFIN1_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ESEIMPFIN1, IMDBDef8.PQSL_ESEIMPFIN1_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_IMPEGDICOMPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPEGDICOMPE_Init()
  {

    PAN_IMPEGDICOMPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPEGDICOMPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPEGDICOMPE.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, "C5EB1AC2-31E1-4841-8ED6-4162B90885F6");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, "CAPITOLO");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, "039226AC-DD03-417C-A012-22C0873DB4C1");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, "ARTICOLO");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, "FDB8B184-C09C-421E-95FA-B73DA65BDA85");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, "NUMERO IMP");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, "44C07CC7-2B82-44B4-A332-08498BF82716");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, "ANNO IMP");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, "2C854729-C13D-4FB1-89A6-4F11B62C4C2F");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, "Data");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, "72E6A3E4-0EC3-4350-9A60-A07C93732BCB");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, "Descrizione");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, "9FF86BF0-D03B-4A59-9E02-1E3A7B0D63ED");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, "Importo");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, "E822D9E4-7488-4DE7-A8D9-CE638E5BC561");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, "Debitore");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, "796C511D-3C68-4DFE-89E0-9522709EC5A0");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, "SEDE DEL");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, "5391418E-77E4-49AE-8D69-B5A780881993");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, "NUMERO DEL");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, "39E68F9D-92BE-4596-B1F6-A996507F63CF");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, "ANNO DEL");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, "52BBF2FD-20CE-41DA-BA28-A18A8B2ECBA2");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, "A6AF5E09-D688-4D13-A0DB-D1483B50452C");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, "406E1398-EC12-438F-AFCB-963C1C74FDDC");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, "7761806C-611A-4B5A-9908-0A1508D51D87");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, "Obiettivo Operativo");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, "168FB8A0-C5A5-482C-A25D-B130F996442D");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, "Capitolo");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, "5E161166-1BE3-4B70-B3F6-BD55E69ED1C0");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, "Impegno");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, "43737BA1-C545-48B7-BFAE-18D2B982323D");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, "Delibera");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, "9E9EDDAF-CAB7-48B2-A5EC-4D47827AE7D9");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, "Proposta");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, "814FE070-F715-4715-8C02-7FEAC08D416A");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, "Rif Bilancio Capitolo");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, "To String (ESEIMP FIN CAPITOLO) + \" / \" + To String (ESEIMP FIN ARTICOLO)");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, "41D6D61C-7BB2-4310-92E1-0C7B7617DA47");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, "Impegno");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, "To String (ESEIMP FIN NUMERO IMP) + \" / \" + To String (ESEIMP FIN ANNO IMP)");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, "1D124F10-139D-46AA-9F6C-91BC3E95D235");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, "Delibera");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, "IMP SEDE DEL + \" - \" + To String (IMP NUMERO DEL) + \" / \" + To String (IMP ANNO DEL)");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, "BBDB3CB5-D5C3-4E44-B752-8B761E036ABC");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, "Proposta");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, "IMP UNITA PROPONENTE + \" - \" + To String (IMP NUMERO PROPOSTA) + \" / \" + To String (IMP ANNO PROPOSTA)");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGDICOMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, "F717D4EA-082B-4E6D-964A-73885E07C91F");
    PAN_IMPEGDICOMPE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, "Obiettivo Gestionale");
    PAN_IMPEGDICOMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, "");
    PAN_IMPEGDICOMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGDICOMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMPEGDICOMPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, MyGlb.PANEL_FORM, 4, 640, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_CAPITOLO, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_CAPITOLO, PPQRY_ESEIMPFIN1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, MyGlb.PANEL_FORM, 4, 664, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_ARTICOLO, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_ARTICOLO, PPQRY_ESEIMPFIN1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, MyGlb.PANEL_LIST, 132, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, MyGlb.PANEL_FORM, 4, 688, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_NUMEROIMP, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_NUMEROIMP, PPQRY_ESEIMPFIN1, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, MyGlb.PANEL_LIST, 176, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, MyGlb.PANEL_FORM, 4, 712, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_ANNOIMP, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_ANNOIMP, PPQRY_ESEIMPFIN1, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, MyGlb.PANEL_LIST, 212, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, MyGlb.PANEL_LIST, 68);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, MyGlb.PANEL_FORM, 4, 496, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, MyGlb.PANEL_FORM, 68);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_DATA, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_DATA, PPQRY_ESEIMPFIN1, "B.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, MyGlb.PANEL_LIST, 284, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 148, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_DESCRIZIONE, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_DESCRIZIONE, PPQRY_ESEIMPFIN1, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, MyGlb.PANEL_LIST, 504, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, MyGlb.PANEL_FORM, 4, 400, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_IMPORTO, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldUnbound(PFL_IMPEGDICOMPE_IMPORTO, true);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_IMPORTO, PPQRY_ESEIMPFIN1, "NVL(A.SALDO_INI + A.VARIAZIONI, 0)", "ESEACOPEIMPO", 3, 28, 6, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, MyGlb.PANEL_LIST, 604, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, MyGlb.PANEL_LIST, 140);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, MyGlb.PANEL_FORM, 4, 376, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, MyGlb.PANEL_FORM, 140);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_DEBITORE, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_DEBITORE, PPQRY_ESEIMPFIN1, "C.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, MyGlb.PANEL_LIST, 824, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, MyGlb.PANEL_FORM, 4, 736, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_SEDEDEL, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_SEDEDEL, PPQRY_ESEIMPFIN1, "B.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, MyGlb.PANEL_LIST, 864, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, MyGlb.PANEL_FORM, 4, 760, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_NUMERODEL, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_NUMERODEL, PPQRY_ESEIMPFIN1, "B.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, MyGlb.PANEL_LIST, 908, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, MyGlb.PANEL_FORM, 4, 784, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_ANNODEL, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_ANNODEL, PPQRY_ESEIMPFIN1, "B.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, MyGlb.PANEL_LIST, 948, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 808, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_UNITAPROPONE, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_UNITAPROPONE, PPQRY_ESEIMPFIN1, "B.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 1056, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 832, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_NUMEROPROPOS, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_NUMEROPROPOS, PPQRY_ESEIMPFIN1, "B.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1096, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PROP.");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 856, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_ANNOPROPOSTA, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_ANNOPROPOSTA, PPQRY_ESEIMPFIN1, "B.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, MyGlb.PANEL_LIST, 1136, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_PROGETTO, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldUnbound(PFL_IMPEGDICOMPE_PROGETTO, true);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_PROGETTO, PPQRY_ESEIMPFIN1, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'SI')", "PROGETTO_ID", 5, 99, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 212, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_LABELCAPITOL, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, MyGlb.PANEL_LIST, 132, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, MyGlb.PANEL_FORM, 8, 8, 212, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_LABELIMPEGNO, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, MyGlb.PANEL_LIST, 824, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, MyGlb.PANEL_FORM, 16, 16, 212, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_LABELDELIBER, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, MyGlb.PANEL_LIST, 948, 0, 188, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, MyGlb.PANEL_FORM, 24, 24, 212, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_LABELPROPOST, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, MyGlb.PANEL_LIST, 88);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, MyGlb.PANEL_LIST, "Rif Bilancio Capitolo");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, MyGlb.PANEL_FORM, 4, 880, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, MyGlb.PANEL_FORM, 88);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_RIFBILANCAPI, MyGlb.PANEL_FORM, "Rif Bilancio Capitolo");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_RIFBILANCAPI, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldUnbound(PFL_IMPEGDICOMPE_RIFBILANCAPI, true);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_RIFBILANCAPI, PPQRY_ESEIMPFIN1, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "ESEOPERIBICA", 5, 201, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, MyGlb.PANEL_FORM, 12, 888, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_IMPEGNO, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldUnbound(PFL_IMPEGDICOMPE_IMPEGNO, true);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_IMPEGNO, PPQRY_ESEIMPFIN1, "TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP )", "ESEACOPEIMPE", 5, 201, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, MyGlb.PANEL_FORM, 4, 880, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_DELIBERA, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldUnbound(PFL_IMPEGDICOMPE_DELIBERA, true);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_DELIBERA, PPQRY_ESEIMPFIN1, "B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL )", "ESEACOPEDELI", 5, 208, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, MyGlb.PANEL_FORM, 4, 880, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_PROPOSTA, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldUnbound(PFL_IMPEGDICOMPE_PROPOSTA, true);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_PROPOSTA, PPQRY_ESEIMPFIN1, "B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA )", "ESEACOPEPROP", 5, 212, 0, -13997);
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, MyGlb.PANEL_LIST, 1204, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, MyGlb.PANEL_LIST, 76);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, MyGlb.PANEL_LIST, "Obiettivo Gestionale");
    PAN_IMPEGDICOMPE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, MyGlb.PANEL_FORM, 4, 880, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGDICOMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, MyGlb.PANEL_FORM, 76);
    PAN_IMPEGDICOMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGDICOMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGDICOMPE_OBIETTIVO, MyGlb.PANEL_FORM, "Obiet. Gest.");
    PAN_IMPEGDICOMPE.SetFieldPage(PFL_IMPEGDICOMPE_OBIETTIVO, -1, -1);
    PAN_IMPEGDICOMPE.SetFieldUnbound(PFL_IMPEGDICOMPE_OBIETTIVO, true);
    PAN_IMPEGDICOMPE.SetFieldPanel(PFL_IMPEGDICOMPE_OBIETTIVO, PPQRY_ESEIMPFIN1, "DUP.GET_OBIETTIVO_GESTIONE(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'SI')", "OBIETTIVO_ID", 5, 99, 0, -13997);
  }

  private void PAN_IMPEGDICOMPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPEGDICOMPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPEGDICOMPE.SetIMDB(IMDB, "PQRY_ESEIMPFIN1", true);
    PAN_IMPEGDICOMPE.set_SetString(MyGlb.MASTER_ROWNAME, "ESEACC OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as ESEOPERIBICA, ");
    SQL.append("  TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ) as ESEACOPEIMPE, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  NVL(A.SALDO_INI + A.VARIAZIONI, 0) as ESEACOPEIMPO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL ) as ESEACOPEDELI, ");
    SQL.append("  B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA ) as ESEACOPEPROP, ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'SI') as PROGETTO_ID, ");
    SQL.append("  B.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  B.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  B.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  B.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  B.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  B.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  DUP.GET_OBIETTIVO_GESTIONE(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'SI') as OBIETTIVO_ID ");
    PAN_IMPEGDICOMPE.SetQuery(PPQRY_ESEIMPFIN1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEIMP_FIN A, ");
    SQL.append("  IMP B, ");
    SQL.append("  BEN C, ");
    SQL.append("  POL_SCHEDE_OBIETTIVO D ");
    PAN_IMPEGDICOMPE.SetQuery(PPQRY_ESEIMPFIN1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.BENEFICIARIO = C.CODICE(+)) ");
    SQL.append("and   (A.ANNO_IMP = B.ANNO_IMP(+)) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_IMP = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI26.PARAMTIPO~~, 'Opera', A.OPERA, A.FINANZIAMENTO) = DECODE(~~TBL_PARAMETRI26.PARAMTIPO~~, 'Opera', ~~TBL_PARAMETRI26.PARAMOPERA~~, ~~TBL_PARAMETRI26.PARAMFINANZI~~)) ");
    SQL.append("and   (B.SCHEDA_OBIETTIVO_ID = D.SCHEDA_OBIETTIVO_ID(+)) ");
    PAN_IMPEGDICOMPE.SetQuery(PPQRY_ESEIMPFIN1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGDICOMPE.SetQuery(PPQRY_ESEIMPFIN1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGDICOMPE.SetQuery(PPQRY_ESEIMPFIN1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP ");
    PAN_IMPEGDICOMPE.SetQuery(PPQRY_ESEIMPFIN1, 5, SQL, -1, "");
    PAN_IMPEGDICOMPE.SetQueryDB(PPQRY_ESEIMPFIN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEGDICOMPE.SetMasterTable(0, "ESEIMP_FIN");
    PAN_IMPEGDICOMPE.AddToSortList(PFL_IMPEGDICOMPE_CAPITOLO, true);
    PAN_IMPEGDICOMPE.AddToSortList(PFL_IMPEGDICOMPE_ARTICOLO, true);
    PAN_IMPEGDICOMPE.AddToSortList(PFL_IMPEGDICOMPE_NUMEROIMP, true);
    PAN_IMPEGDICOMPE.AddToSortList(PFL_IMPEGDICOMPE_ANNOIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPEGDICOMPE.Status() == 2)
    {
      int oldListQBE = PAN_IMPEGDICOMPE.iUseListQBE;
      PAN_IMPEGDICOMPE.iUseListQBE = 0;
      PAN_IMPEGDICOMPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPEGDICOMPE.PanelCommand(Glb.PCM_FIND);
      PAN_IMPEGDICOMPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPEGDICOMPE) PAN_IMPEGDICOMPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPEGDICOMPE) PAN_IMPEGDICOMPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPEGDICOMPE) PAN_IMPEGDICOMPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPEGDICOMPE) PAN_IMPEGDICOMPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPEGDICOMPE) PAN_IMPEGDICOMPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
