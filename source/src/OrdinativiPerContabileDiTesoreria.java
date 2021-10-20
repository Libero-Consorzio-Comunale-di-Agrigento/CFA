// **********************************************
// Ordinativi Per Contabile Di Tesoreria
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiPerContabileDiTesoreria extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ORDPERCODITE_CONTABILE = 0;
  private static int GRP_ORDPERCODITE_NEWGROUP = 1;

  private static int PFL_ORDPERCODITE_NUMERO = 0;
  private static int PFL_ORDPERCODITE_DATA = 1;
  private static int PFL_ORDPERCODITE_COMP = 2;
  private static int PFL_ORDPERCODITE_NEWPANELLABE = 3;
  private static int PFL_ORDPERCODITE_DATAELABORAZ = 4;
  private static int PFL_ORDPERCODITE_ELABORA = 5;

  private static int PPQRY_PAR37 = 0;


  IDPanel PAN_ORDPERCODITE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR38(IMDB);
    //
    //
    Init_PQRY_PAR37(IMDB);
    Init_PQRY_PAR37_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR38(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR38, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR38, "TBL_PAR38");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR38,IMDBDef6.FLD_PAR38_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR38,IMDBDef6.FLD_PAR38_ROWNAMENUMER,5,10,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR38,IMDBDef6.FLD_PAR38_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR38,IMDBDef6.FLD_PAR38_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR38,IMDBDef6.FLD_PAR38_ROWNAMECOMP, "ROWNAMECOMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR38,IMDBDef6.FLD_PAR38_ROWNAMECOMP,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR38,IMDBDef6.FLD_PAR38_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR38,IMDBDef6.FLD_PAR38_ROWNAMDATELA,6,14,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR38, 0);
  }

  private static void Init_PQRY_PAR37(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR37, 4);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR37, "PQRY_PAR37");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR37,IMDBDef16.PQSL_PAR37_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR37,IMDBDef16.PQSL_PAR37_ROWNAMENUMER,5,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR37,IMDBDef16.PQSL_PAR37_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR37,IMDBDef16.PQSL_PAR37_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR37,IMDBDef16.PQSL_PAR37_ROWNAMECOMP, "ROWNAMECOMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR37,IMDBDef16.PQSL_PAR37_ROWNAMECOMP,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR37,IMDBDef16.PQSL_PAR37_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR37,IMDBDef16.PQSL_PAR37_ROWNAMDATELA,6,14,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR37, 0);
  }

  private static void Init_PQRY_PAR37_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR37_RS, 4);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR37_RS, "PQRY_PAR37_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR37_RS,IMDBDef16.PQSL_PAR37_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR37_RS,IMDBDef16.PQSL_PAR37_ROWNAMENUMER,5,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR37_RS,IMDBDef16.PQSL_PAR37_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR37_RS,IMDBDef16.PQSL_PAR37_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR37_RS,IMDBDef16.PQSL_PAR37_ROWNAMECOMP, "ROWNAMECOMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR37_RS,IMDBDef16.PQSL_PAR37_ROWNAMECOMP,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR37_RS,IMDBDef16.PQSL_PAR37_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR37_RS,IMDBDef16.PQSL_PAR37_ROWNAMDATELA,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiPerContabileDiTesoreria(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiPerContabileDiTesoreria()
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
    FormIdx = MyGlb.FRM_ORDPERCODITE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7082836F-7A14-4530-B956-EDE7D086D112";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 364;
    DesignHeight = 346;
    set_Caption(new IDVariant("Ordinativi Per Contabile Di Tesoreria"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 364;
    Frames[1].Height = 320;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Ordinativi Per Contabile DI Tesoreria";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_ORDPERCODITE = new IDPanel(w, this, 1, "PAN_ORDPERCODITE");
    Frames[1].Content = PAN_ORDPERCODITE;
    PAN_ORDPERCODITE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDPERCODITE.VS = MainFrm.VisualStyleList;
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 364-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDPERCODITE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A85B56EB-1AA8-46A5-AF4F-3A739A1DE637");
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 408, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDPERCODITE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDPERCODITE.InitStatus = 2;
    PAN_ORDPERCODITE_Init();
    PAN_ORDPERCODITE_InitFields();
    PAN_ORDPERCODITE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR38, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDPERCODITE_PAR37();
      }
      PAN_ORDPERCODITE.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdinativiPerContabileDiTesoreria);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiPerContabileDiTesoreria.class.getName() : (Glb.ClassWithPackage(OrdinativiPerContabileDiTesoreria.class) ? OrdinativiPerContabileDiTesoreria.class.getName().substring(OrdinativiPerContabileDiTesoreria.class.getPackage().getName().length() + 1) : OrdinativiPerContabileDiTesoreria.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("NUMERO_CONT"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("DATA_CONT"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("COMP_RES"));
      IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR5 = (new IDVariant("DATA_ELAB"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Ordinativi_per_Cont_Tes"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, ((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR37, IMDBDef16.PQSL_PAR37_ROWNAMENUMER, 0)))?(new IDVariant("%25")):IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR37, IMDBDef16.PQSL_PAR37_ROWNAMENUMER, 0))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, ((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR37, IMDBDef16.PQSL_PAR37_ROWNAMEDATA, 0)))?IDL.ToString(IDL.ToDate((new IDVariant(1900)), (new IDVariant(1)), (new IDVariant(1)))):IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR37, IMDBDef16.PQSL_PAR37_ROWNAMEDATA, 0))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef16.PQRY_PAR37, IMDBDef16.PQSL_PAR37_ROWNAMECOMP, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR37, IMDBDef16.PQSL_PAR37_ROWNAMDATELA, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerContabileDiTesoreria", "Elabora", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PAR38, IMDBDef6.FLD_PAR38_ROWNAMENUMER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR38, IMDBDef6.FLD_PAR38_ROWNAMEDATA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR38, IMDBDef6.FLD_PAR38_ROWNAMECOMP, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef6.TBL_PAR38, IMDBDef6.FLD_PAR38_ROWNAMDATELA, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerContabileDiTesoreria", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ORDPERCODITE_PAR37() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR37_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR38, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR38, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR37_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR37_RS, 0, IMDBDef6.TBL_PAR38, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR37_RS, 0, 0, IMDBDef6.TBL_PAR38, IMDBDef6.FLD_PAR38_ROWNAMENUMER, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR37_RS, 1, 0, IMDBDef6.TBL_PAR38, IMDBDef6.FLD_PAR38_ROWNAMEDATA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR37_RS, 2, 0, IMDBDef6.TBL_PAR38, IMDBDef6.FLD_PAR38_ROWNAMECOMP, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR37_RS, 3, 0, IMDBDef6.TBL_PAR38, IMDBDef6.FLD_PAR38_ROWNAMDATELA, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR38, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR38, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR38, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR37_RS, 0);
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
  private void PAN_ORDPERCODITE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDPERCODITE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDPERCODITE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDPERCODITE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDPERCODITE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ORDPERCODITE);
    // Stub
  }

  private void PAN_ORDPERCODITE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDPERCODITE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ORDPERCODITE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDPERCODITE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDPERCODITE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDPERCODITE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDPERCODITE_Init()
  {

    PAN_ORDPERCODITE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDPERCODITE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ORDPERCODITE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, "55C37E8A-1F85-4145-92AD-2503CAE88230");
    PAN_ORDPERCODITE.set_Header(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, "Contabile");
    PAN_ORDPERCODITE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, "");
    PAN_ORDPERCODITE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, MyGlb.PANEL_LIST, 0, -9999, 176, 16, 0, 0);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, MyGlb.PANEL_FORM, 4, 7, 208, 73, 0, 0);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, 0, 53);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, 1, 13);
    PAN_ORDPERCODITE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, 0, 4);
    PAN_ORDPERCODITE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, 1, 4);
    PAN_ORDPERCODITE.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_CONTABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDPERCODITE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, "AAD13DA2-021C-40A5-BAFE-EE867F2835F9");
    PAN_ORDPERCODITE.set_Header(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, "New Group");
    PAN_ORDPERCODITE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, "");
    PAN_ORDPERCODITE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, MyGlb.PANEL_LIST, 176, -9999, 88, 0, 0, 0);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, MyGlb.PANEL_FORM, 4, 84, 208, 68, 0, 0);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, 0, 60);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, 1, 13);
    PAN_ORDPERCODITE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, 0, 1);
    PAN_ORDPERCODITE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, 1, 1);
    PAN_ORDPERCODITE.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDPERCODITE_NEWGROUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDPERCODITE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_ORDPERCODITE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, "BEB0F90D-E1F2-4F04-B609-242F335C9B5C");
    PAN_ORDPERCODITE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, "Numero");
    PAN_ORDPERCODITE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, "");
    PAN_ORDPERCODITE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDPERCODITE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERCODITE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, "B76816C9-8D50-4D92-8C75-B7436480B2DD");
    PAN_ORDPERCODITE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, "Data");
    PAN_ORDPERCODITE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, "");
    PAN_ORDPERCODITE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDPERCODITE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERCODITE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, "02333402-4FD7-4BFD-A515-25B470AAE9B7");
    PAN_ORDPERCODITE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, "Comp");
    PAN_ORDPERCODITE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, "");
    PAN_ORDPERCODITE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ORDPERCODITE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERCODITE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, "282A560B-C57E-4618-A658-59F50DB75388");
    PAN_ORDPERCODITE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, "");
    PAN_ORDPERCODITE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_ORDPERCODITE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDPERCODITE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, "A905B90E-1AB9-472F-8F9A-B1BE35C60F25");
    PAN_ORDPERCODITE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, "Data Elaborazione");
    PAN_ORDPERCODITE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, "");
    PAN_ORDPERCODITE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDPERCODITE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERCODITE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, "84C3A694-599F-4F72-8B03-25AC1F763668");
    PAN_ORDPERCODITE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, "Elabora");
    PAN_ORDPERCODITE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ORDPERCODITE.SetImage(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, 0, "button1.gif", false);
    PAN_ORDPERCODITE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ORDPERCODITE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, MyGlb.PANEL_LIST, 48);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERCODITE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, MyGlb.PANEL_FORM, 8, 32, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, MyGlb.PANEL_FORM, 56);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERCODITE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_ORDPERCODITE.SetFieldPage(PFL_ORDPERCODITE_NUMERO, -1, GRP_ORDPERCODITE_CONTABILE);
    PAN_ORDPERCODITE.SetFieldPanel(PFL_ORDPERCODITE_NUMERO, PPQRY_PAR37, "A.ROWNAMENUMER", "ROWNAMENUMER", 5, 10, 0, -13997);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, MyGlb.PANEL_LIST, 80, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, MyGlb.PANEL_LIST, 32);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERCODITE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, MyGlb.PANEL_FORM, 24, 56, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, MyGlb.PANEL_FORM, 40);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERCODITE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ORDPERCODITE.SetFieldPage(PFL_ORDPERCODITE_DATA, -1, GRP_ORDPERCODITE_CONTABILE);
    PAN_ORDPERCODITE.SetFieldPanel(PFL_ORDPERCODITE_DATA, PPQRY_PAR37, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 14, 0, -13997);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, MyGlb.PANEL_LIST, 176, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, MyGlb.PANEL_LIST, 36);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERCODITE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, MyGlb.PANEL_LIST, "Comp");
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, MyGlb.PANEL_FORM, 68, 88, 140, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, MyGlb.PANEL_FORM, 112);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, MyGlb.PANEL_FORM, 4);
    PAN_ORDPERCODITE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_COMP, MyGlb.PANEL_FORM, "Comp");
    PAN_ORDPERCODITE.SetFieldPage(PFL_ORDPERCODITE_COMP, -1, GRP_ORDPERCODITE_NEWGROUP);
    PAN_ORDPERCODITE.SetFieldPanel(PFL_ORDPERCODITE_COMP, PPQRY_PAR37, "A.ROWNAMECOMP", "ROWNAMECOMP", 12, 1, 0, -13997);
    PAN_ORDPERCODITE.SetValueListItem(PFL_ORDPERCODITE_COMP, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_ORDPERCODITE.SetValueListItem(PFL_ORDPERCODITE_COMP, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_ORDPERCODITE.SetValueListItem(PFL_ORDPERCODITE_COMP, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, MyGlb.PANEL_LIST, 216, 140, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, MyGlb.PANEL_FORM, 8, 132, 20, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERCODITE.SetFieldPage(PFL_ORDPERCODITE_NEWPANELLABE, -1, GRP_ORDPERCODITE_NEWGROUP);
    PAN_ORDPERCODITE.SetFieldPanel(PFL_ORDPERCODITE_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, MyGlb.PANEL_LIST, 264, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERCODITE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, MyGlb.PANEL_FORM, 16, 160, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERCODITE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_ORDPERCODITE.SetFieldPage(PFL_ORDPERCODITE_DATAELABORAZ, -1, -1);
    PAN_ORDPERCODITE.SetFieldPanel(PFL_ORDPERCODITE_DATAELABORAZ, PPQRY_PAR37, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, MyGlb.PANEL_LIST, 124, 184, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERCODITE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, MyGlb.PANEL_FORM, 128, 204, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERCODITE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ORDPERCODITE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERCODITE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERCODITE.SetFieldPage(PFL_ORDPERCODITE_ELABORA, -1, -1);
    PAN_ORDPERCODITE.SetFieldPanel(PFL_ORDPERCODITE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ORDPERCODITE_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDPERCODITE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDPERCODITE.SetIMDB(IMDB, "PQRY_PAR37", true);
    PAN_ORDPERCODITE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ORDPERCODITE.SetQueryIMDB(PPQRY_PAR37, IMDBDef16.PQRY_PAR37_RS, IMDBDef6.TBL_PAR38);
    JustLoaded = true;
    PAN_ORDPERCODITE.SetFieldPrimaryIndex(PFL_ORDPERCODITE_NUMERO, IMDBDef6.FLD_PAR38_ROWNAMENUMER);
    PAN_ORDPERCODITE.SetFieldPrimaryIndex(PFL_ORDPERCODITE_DATA, IMDBDef6.FLD_PAR38_ROWNAMEDATA);
    PAN_ORDPERCODITE.SetFieldPrimaryIndex(PFL_ORDPERCODITE_COMP, IMDBDef6.FLD_PAR38_ROWNAMECOMP);
    PAN_ORDPERCODITE.SetFieldPrimaryIndex(PFL_ORDPERCODITE_DATAELABORAZ, IMDBDef6.FLD_PAR38_ROWNAMDATELA);
    PAN_ORDPERCODITE.SetMasterTable(0, "PAR38");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDPERCODITE.Status() == 2)
    {
      int oldListQBE = PAN_ORDPERCODITE.iUseListQBE;
      PAN_ORDPERCODITE.iUseListQBE = 0;
      PAN_ORDPERCODITE.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDPERCODITE.PanelCommand(Glb.PCM_FIND);
      PAN_ORDPERCODITE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDPERCODITE) PAN_ORDPERCODITE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDPERCODITE) PAN_ORDPERCODITE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDPERCODITE) PAN_ORDPERCODITE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDPERCODITE) PAN_ORDPERCODITE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDPERCODITE) PAN_ORDPERCODITE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
