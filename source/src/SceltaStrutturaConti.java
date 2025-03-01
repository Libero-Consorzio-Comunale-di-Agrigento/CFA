// **********************************************
// Scelta Struttura Conti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaStrutturaConti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_TIPOPIANO = 0;
  private static int PFL_PARAM_LIVELLO = 1;

  private static int PPQRY_PARAM185 = 0;


  IDPanel PAN_PARAM;
  private static int PFL_CONTI_CODICE = 0;
  private static int PFL_CONTI_DESCRIZIONE = 1;
  private static int PFL_CONTI_CONTOID = 2;

  private static int PPQRY_STRUTTUCONTI = 0;


  IDPanel PAN_CONTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM76(IMDB);
    //
    //
    Init_PQRY_PARAM185(IMDB);
    Init_PQRY_PARAM185_RS(IMDB);
    Init_PQRY_STRUTTUCONTI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM76(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM76, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM76, "TBL_PARAM76");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM76,IMDBDef1.FLD_PARAM76_NOMOGGTIPPIA, "NOMOGGTIPPIA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM76,IMDBDef1.FLD_PARAM76_NOMOGGTIPPIA,12,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM76,IMDBDef1.FLD_PARAM76_NOMEOGGELIVE, "NOMEOGGELIVE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM76,IMDBDef1.FLD_PARAM76_NOMEOGGELIVE,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM76,IMDBDef1.FLD_PARAM76_NOMOGGNAPASO, "NOMOGGNAPASO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM76,IMDBDef1.FLD_PARAM76_NOMOGGNAPASO,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM76, 0);
  }

  private static void Init_PQRY_PARAM185(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARAM185, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARAM185, "PQRY_PARAM185");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM185,IMDBDef8.PQSL_PARAM185_NOMOGGTIPPIA, "NOMOGGTIPPIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM185,IMDBDef8.PQSL_PARAM185_NOMOGGTIPPIA,12,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM185,IMDBDef8.PQSL_PARAM185_NOMEOGGELIVE, "NOMEOGGELIVE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM185,IMDBDef8.PQSL_PARAM185_NOMEOGGELIVE,1,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PARAM185, 0);
  }

  private static void Init_PQRY_PARAM185_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARAM185_RS, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARAM185_RS, "PQRY_PARAM185_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM185_RS,IMDBDef8.PQSL_PARAM185_NOMOGGTIPPIA, "NOMOGGTIPPIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM185_RS,IMDBDef8.PQSL_PARAM185_NOMOGGTIPPIA,12,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM185_RS,IMDBDef8.PQSL_PARAM185_NOMEOGGELIVE, "NOMEOGGELIVE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM185_RS,IMDBDef8.PQSL_PARAM185_NOMEOGGELIVE,1,2,0);
  }

  private static void Init_PQRY_STRUTTUCONTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_STRUTTUCONTI, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_STRUTTUCONTI, "PQRY_STRUTTUCONTI");
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTUCONTI,IMDBDef8.PQSL_STRUTTUCONTI_CESTPICOCOID, "CESTPICOCOID");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTUCONTI,IMDBDef8.PQSL_STRUTTUCONTI_CESTPICOCOID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTUCONTI,IMDBDef8.PQSL_STRUTTUCONTI_CEECONTIDESC, "CEECONTIDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTUCONTI,IMDBDef8.PQSL_STRUTTUCONTI_CEECONTIDESC,5,300,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STRUTTUCONTI,IMDBDef8.PQSL_STRUTTUCONTI_CEECONTICODI, "CEECONTICODI");
    IMDB.SetFldParams(IMDBDef8.PQRY_STRUTTUCONTI,IMDBDef8.PQSL_STRUTTUCONTI_CEECONTICODI,5,40,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_STRUTTUCONTI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaStrutturaConti(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaStrutturaConti()
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
    FormIdx = MyGlb.FRM_SCELSTRUCONT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6E059CD4-F539-48F7-A961-FBACD3A62563";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 796;
    DesignHeight = 378;
    set_Caption(new IDVariant("Conti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 796;
    Frames[1].Height = 352;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.125;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 796;
    Frames[2].Height = 44;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 44;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 44-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D4776934-92C5-4CE9-9A25-A495CBF6B740");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 92, 49, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 796;
    Frames[3].Height = 308;
    Frames[3].Caption = "Conti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 308;
    PAN_CONTI = new IDPanel(w, this, 3, "PAN_CONTI");
    Frames[3].Content = PAN_CONTI;
    PAN_CONTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTI.VS = MainFrm.VisualStyleList;
    PAN_CONTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 308-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3E50E5A1-C089-4BE8-B71E-A1DB6DFEA00B");
    PAN_CONTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 752, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTI.InitStatus = 2;
    PAN_CONTI_Init();
    PAN_CONTI_InitFields();
    PAN_CONTI_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAM76, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELSTRUCONT_PARAM185();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_CONTI.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SceltaStrutturaConti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaStrutturaConti.class.getName() : (Glb.ClassWithPackage(SceltaStrutturaConti.class) ? SceltaStrutturaConti.class.getName().substring(SceltaStrutturaConti.class.getPackage().getName().length() + 1) : SceltaStrutturaConti.class.getName()));
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
      if (IMDB.Value(IMDBDef1.TBL_PARAM76, IMDBDef1.FLD_PARAM76_NOMOGGTIPPIA, 0).compareTo((new IDVariant("E")), true)!=0)
      {
        PAN_PARAM.ClearValueList(PFL_PARAM_TIPOPIANO);
        PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOPIANO, (new IDVariant("PA")), ((new IDVariant("PA")).equals((new IDVariant("E")))? new IDVariant("Economico") : (new IDVariant("PA")).equals((new IDVariant("PA")))? new IDVariant("Patrimoniale Attivo") : (new IDVariant("PA")).equals((new IDVariant("PP")))? new IDVariant("Patrimoniale Passivo") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOPIANO, (new IDVariant("PP")), ((new IDVariant("PP")).equals((new IDVariant("E")))? new IDVariant("Economico") : (new IDVariant("PP")).equals((new IDVariant("PA")))? new IDVariant("Patrimoniale Attivo") : (new IDVariant("PP")).equals((new IDVariant("PP")))? new IDVariant("Patrimoniale Passivo") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAM76, IMDBDef1.FLD_PARAM76_NOMOGGNAPASO, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_PARAM.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaStrutturaConti", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("SceltaStrutturaConti", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perch� stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAM76, IMDBDef1.FLD_PARAM76_NOMOGGTIPPIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM76, IMDBDef1.FLD_PARAM76_NOMEOGGELIVE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM76, IMDBDef1.FLD_PARAM76_NOMOGGNAPASO, 0, new IDVariant());
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCELSTRUCONT_PARAM185() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_PARAM185_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAM76, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAM76, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_PARAM185_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_PARAM185_RS, 0, IMDBDef1.TBL_PARAM76, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARAM185_RS, 0, 0, IMDBDef1.TBL_PARAM76, IMDBDef1.FLD_PARAM76_NOMOGGTIPPIA, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARAM185_RS, 1, 0, IMDBDef1.TBL_PARAM76, IMDBDef1.FLD_PARAM76_NOMEOGGELIVE, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAM76, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAM76, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAM76, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_PARAM185_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cio� quando viene portata in primo piano
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
  // Consente l'aggiustamento delle propriet� visuali delle
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CONTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONTI);
    // Stub
  }

  private void PAN_CONTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTI_IntValidateRow(Cancel);
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
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, "46906702-7D82-4561-9460-3B87FC35C471");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, "Tipo Piano");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, "A40C99B2-CCEF-40C9-B709-3631D1F34793");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, "Livello");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, MyGlb.PANEL_LIST, "Tipo Piano");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, MyGlb.PANEL_FORM, 44, 12, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, MyGlb.PANEL_FORM, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOPIANO, MyGlb.PANEL_FORM, "Tipo Piano");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOPIANO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOPIANO, PPQRY_PARAM185, "A.NOMOGGTIPPIA", "NOMOGGTIPPIA", 12, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOPIANO, (new IDVariant("E ")), "Economico", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOPIANO, (new IDVariant("PA")), "Patrimoniale Attivo", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOPIANO, (new IDVariant("PP")), "Patrimoniale Passivo", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, MyGlb.PANEL_LIST, 44);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, MyGlb.PANEL_LIST, "Livello");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, MyGlb.PANEL_FORM, 264, 12, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, MyGlb.PANEL_FORM, 44);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_LIVELLO, MyGlb.PANEL_FORM, "Livello");
    PAN_PARAM.SetFieldPage(PFL_PARAM_LIVELLO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LIVELLO, PPQRY_PARAM185, "A.NOMEOGGELIVE", "NOMEOGGELIVE", 1, 2, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM185", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM185, IMDBDef8.PQRY_PARAM185_RS, IMDBDef1.TBL_PARAM76);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOPIANO, IMDBDef1.FLD_PARAM76_NOMOGGTIPPIA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_LIVELLO, IMDBDef1.FLD_PARAM76_NOMEOGGELIVE);
    PAN_PARAM.SetMasterTable(0, "PARAM76");
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CONTI_Init()
  {

    PAN_CONTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_CONTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, "240143D9-2662-47FD-9F28-DCF3F0444587");
    PAN_CONTI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, "Codice");
    PAN_CONTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, "");
    PAN_CONTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, "F9EB109D-003C-483B-A594-42A3CE887B44");
    PAN_CONTI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, "Descrizione");
    PAN_CONTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, "");
    PAN_CONTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, "A391A4A4-3802-4DD4-8C6B-AE903583B1AF");
    PAN_CONTI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, "CONTO ID");
    PAN_CONTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, "");
    PAN_CONTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CONTI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_CONTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_CONTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CONTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CONTI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_CONTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CONTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CONTI.SetFieldPage(PFL_CONTI_CODICE, -1, -1);
    PAN_CONTI.SetFieldPanel(PFL_CONTI_CODICE, PPQRY_STRUTTUCONTI, "A.CODICE", "CEECONTICODI", 5, 40, 0, -13997);
    PAN_CONTI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, MyGlb.PANEL_LIST, 120, 36, 632, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_CONTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CONTI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_CONTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CONTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CONTI.SetFieldPage(PFL_CONTI_DESCRIZIONE, -1, -1);
    PAN_CONTI.SetFieldPanel(PFL_CONTI_DESCRIZIONE, PPQRY_STRUTTUCONTI, "A.DESCRIZIONE", "CEECONTIDESC", 5, 300, 0, -13997);
    PAN_CONTI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, MyGlb.PANEL_LIST, 64);
    PAN_CONTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, MyGlb.PANEL_LIST, 1);
    PAN_CONTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, MyGlb.PANEL_LIST, "CONTO ID");
    PAN_CONTI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, MyGlb.PANEL_FORM, 4, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, MyGlb.PANEL_FORM, 64);
    PAN_CONTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, MyGlb.PANEL_FORM, 1);
    PAN_CONTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTI_CONTOID, MyGlb.PANEL_FORM, "CONTO ID");
    PAN_CONTI.SetFieldPage(PFL_CONTI_CONTOID, -1, -1);
    PAN_CONTI.SetFieldPanel(PFL_CONTI_CONTOID, PPQRY_STRUTTUCONTI, "A.CONTO_ID", "CESTPICOCOID", 3, 10, 0, -13997);
  }

  private void PAN_CONTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTI.SetIMDB(IMDB, "PQRY_STRUTTUCONTI", true);
    PAN_CONTI.set_SetString(MyGlb.MASTER_ROWNAME, "CEE CONTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CONTO_ID as CESTPICOCOID, ");
    SQL.append("  A.DESCRIZIONE as CEECONTIDESC, ");
    SQL.append("  A.CODICE as CEECONTICODI ");
    PAN_CONTI.SetQuery(PPQRY_STRUTTUCONTI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  STRUTTURA_PIANO_CONTI A, ");
    SQL.append("  TIPI_STRUTTURA_ECO B ");
    PAN_CONTI.SetQuery(PPQRY_STRUTTUCONTI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_PIANO = ~~TBL_PARAM76.NOMOGGTIPPIA~~) ");
    SQL.append("and   (A.LIVELLO = NVL(~~TBL_PARAM76.NOMEOGGELIVE~~, A.LIVELLO)) ");
    SQL.append("and   (B.PROGRESSIVO = A.PROGR_STRUTTURA) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN B.ESERCIZIO_INIZIO AND NVL(B.ESERCIZIO_FINE, 9999))) ");
    PAN_CONTI.SetQuery(PPQRY_STRUTTUCONTI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTI.SetQuery(PPQRY_STRUTTUCONTI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTI.SetQuery(PPQRY_STRUTTUCONTI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CONTI.SetQuery(PPQRY_STRUTTUCONTI, 5, SQL, -1, "");
    PAN_CONTI.SetQueryDB(PPQRY_STRUTTUCONTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTI.SetMasterTable(0, "STRUTTURA_PIANO_CONTI");
    PAN_CONTI.AddToSortList(PFL_CONTI_CODICE, true);
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_CONTI.Status() == 2)
    {
      int oldListQBE = PAN_CONTI.iUseListQBE;
      PAN_CONTI.iUseListQBE = 0;
      PAN_CONTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTI.PanelCommand(Glb.PCM_FIND);
      PAN_CONTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CONTI) PAN_CONTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_CONTI) PAN_CONTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_CONTI) PAN_CONTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CONTI) PAN_CONTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTI) PAN_CONTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
