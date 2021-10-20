// **********************************************
// Aggiorna Tipo Avanzo Su Capitoli Manuale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornaTipoAvanzoSuCapitoliManuale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PANNELOPZION_TIPOAVANZO = 0;
  private static int PFL_PANNELOPZION_ESERCISUCCES = 1;
  private static int PFL_PANNELOPZION_ETICHEELABOR = 2;

  private static int PPQRY_PANNELOPZIO1 = 0;

  private static int PPQRY_TIPIAVANZO = 1;


  IDPanel PAN_PANNELOPZION;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PANNELOPZION(IMDB);
    //
    //
    Init_PQRY_PANNELOPZIO1(IMDB);
    Init_PQRY_PANNELOPZIO1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PANNELOPZION(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PANNELOPZION, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PANNELOPZION, "TBL_PANNELOPZION");
    IMDB.set_FldCode(IMDBDef3.TBL_PANNELOPZION,IMDBDef3.FLD_PANNELOPZION_NOMOGGESESUC, "NOMOGGESESUC");
    IMDB.SetFldParams(IMDBDef3.TBL_PANNELOPZION,IMDBDef3.FLD_PANNELOPZION_NOMOGGESESUC,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PANNELOPZION,IMDBDef3.FLD_PANNELOPZION_NOMOGGTIPAVA, "NOMOGGTIPAVA");
    IMDB.SetFldParams(IMDBDef3.TBL_PANNELOPZION,IMDBDef3.FLD_PANNELOPZION_NOMOGGTIPAVA,3,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PANNELOPZION, 0);
  }

  private static void Init_PQRY_PANNELOPZIO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PANNELOPZIO1, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PANNELOPZIO1, "PQRY_PANNELOPZIO1");
    IMDB.set_FldCode(IMDBDef11.PQRY_PANNELOPZIO1,IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGESESUC, "NOMOGGESESUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PANNELOPZIO1,IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGESESUC,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PANNELOPZIO1,IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGTIPAVA, "NOMOGGTIPAVA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PANNELOPZIO1,IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGTIPAVA,3,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PANNELOPZIO1, 0);
  }

  private static void Init_PQRY_PANNELOPZIO1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PANNELOPZIO1_RS, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PANNELOPZIO1_RS, "PQRY_PANNELOPZIO1_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PANNELOPZIO1_RS,IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGESESUC, "NOMOGGESESUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PANNELOPZIO1_RS,IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGESESUC,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PANNELOPZIO1_RS,IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGTIPAVA, "NOMOGGTIPAVA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PANNELOPZIO1_RS,IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGTIPAVA,3,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornaTipoAvanzoSuCapitoliManuale(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornaTipoAvanzoSuCapitoliManuale()
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
    FormIdx = MyGlb.FRM_AGTIAVSUCAMA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8A26C4A2-7BA2-42D5-98ED-C390DE5698A6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 496;
    DesignHeight = 194;
    set_Caption(new IDVariant("Aggiorna Tipo Avanzo Su Capitoli"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 496;
    Frames[1].Height = 168;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pannello Opzioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 168;
    PAN_PANNELOPZION = new IDPanel(w, this, 1, "PAN_PANNELOPZION");
    Frames[1].Content = PAN_PANNELOPZION;
    PAN_PANNELOPZION.Lockable = false;
    PAN_PANNELOPZION.iLocked = false;
    PAN_PANNELOPZION.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELOPZION.VS = MainFrm.VisualStyleList;
    PAN_PANNELOPZION.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 496-MyGlb.PAN_OFFS_X, 168-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELOPZION.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EEA72CFD-3285-4D18-BFDE-FF015722F8F7");
    PAN_PANNELOPZION.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANNELOPZION.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELOPZION.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELOPZION.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELOPZION.InitStatus = 1;
    PAN_PANNELOPZION_Init();
    PAN_PANNELOPZION_InitFields();
    PAN_PANNELOPZION_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PANNELOPZION, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGTIAVSUCAMA_PANNELOPZIO1();
      }
      PAN_PANNELOPZION.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornaTipoAvanzoSuCapitoliManuale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornaTipoAvanzoSuCapitoliManuale.class.getName() : (Glb.ClassWithPackage(AggiornaTipoAvanzoSuCapitoliManuale.class) ? AggiornaTipoAvanzoSuCapitoliManuale.class.getName().substring(AggiornaTipoAvanzoSuCapitoliManuale.class.getPackage().getName().length() + 1) : AggiornaTipoAvanzoSuCapitoliManuale.class.getName()));
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
      IMDB.set_Value(IMDBDef3.TBL_PANNELOPZION, IMDBDef3.FLD_PANNELOPZION_NOMOGGESESUC, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef3.TBL_PANNELOPZION, IMDBDef3.FLD_PANNELOPZION_NOMOGGTIPAVA, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaTipoAvanzoSuCapitoliManuale", "Load", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PANNELOPZIO1, IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGTIPAVA, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare il Tipo Avanzo da valorizzare sui capitoli selezionati"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaTipoAvanzoSuCapitoliManuale", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pannello Opzioni
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AGTIAVSUCAMA_PANNELOPZIO1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PANNELOPZIO1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PANNELOPZION, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PANNELOPZION, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PANNELOPZIO1_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PANNELOPZIO1_RS, 0, IMDBDef3.TBL_PANNELOPZION, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PANNELOPZIO1_RS, 0, 0, IMDBDef3.TBL_PANNELOPZION, IMDBDef3.FLD_PANNELOPZION_NOMOGGESESUC, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PANNELOPZIO1_RS, 1, 0, IMDBDef3.TBL_PANNELOPZION, IMDBDef3.FLD_PANNELOPZION_NOMOGGTIPAVA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PANNELOPZION, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PANNELOPZION, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PANNELOPZION, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PANNELOPZIO1_RS, 0);
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
  private void PAN_PANNELOPZION_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELOPZION, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELOPZION_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELOPZION, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELOPZION_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PANNELOPZION);
    // Stub
  }

  private void PAN_PANNELOPZION_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PANNELOPZION_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PANNELOPZION.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PANNELOPZION_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELOPZION_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELOPZION_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PANNELOPZION_Init()
  {

    PAN_PANNELOPZION.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELOPZION.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELOPZION.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PANNELOPZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, "FD836A8F-B7CF-4FF6-9BF0-4D5493AF7DD8");
    PAN_PANNELOPZION.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, "Tipo Avanzo");
    PAN_PANNELOPZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, "");
    PAN_PANNELOPZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_PANNELOPZION.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PANNELOPZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, "C2D484AC-1D6C-4D8C-B779-F6307B7ABDC0");
    PAN_PANNELOPZION.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, "Anche Esercizi Successivi");
    PAN_PANNELOPZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, "");
    PAN_PANNELOPZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, MyGlb.VIS_CHECKSTYLE);
    PAN_PANNELOPZION.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PANNELOPZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, "7765B4FE-14E4-476B-963E-EE791310B586");
    PAN_PANNELOPZION.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, "Elabora");
    PAN_PANNELOPZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PANNELOPZION.SetImage(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PANNELOPZION.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PANNELOPZION_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELOPZION.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELOPZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, MyGlb.PANEL_LIST, 80);
    PAN_PANNELOPZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_PANNELOPZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_PANNELOPZION.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, MyGlb.PANEL_FORM, 16, 16, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELOPZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, MyGlb.PANEL_FORM, 80);
    PAN_PANNELOPZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_PANNELOPZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_PANNELOPZION.SetFieldPage(PFL_PANNELOPZION_TIPOAVANZO, -1, -1);
    PAN_PANNELOPZION.SetFieldPanel(PFL_PANNELOPZION_TIPOAVANZO, PPQRY_PANNELOPZIO1, "A.NOMOGGTIPAVA", "NOMOGGTIPAVA", 3, 10, 0, -13997);
    PAN_PANNELOPZION.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELOPZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, MyGlb.PANEL_LIST, 136);
    PAN_PANNELOPZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, MyGlb.PANEL_LIST, 1);
    PAN_PANNELOPZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, MyGlb.PANEL_LIST, "Anche Esercizi Successivi");
    PAN_PANNELOPZION.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, MyGlb.PANEL_FORM, 284, 48, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELOPZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, MyGlb.PANEL_FORM, 160);
    PAN_PANNELOPZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, MyGlb.PANEL_FORM, 1);
    PAN_PANNELOPZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ESERCISUCCES, MyGlb.PANEL_FORM, "Anche Esercizi Successivi");
    PAN_PANNELOPZION.SetFieldPage(PFL_PANNELOPZION_ESERCISUCCES, -1, -1);
    PAN_PANNELOPZION.SetFieldPanel(PFL_PANNELOPZION_ESERCISUCCES, PPQRY_PANNELOPZIO1, "A.NOMOGGESESUC", "NOMOGGESESUC", 5, 1, 0, -13997);
    PAN_PANNELOPZION.SetValueListItem(PFL_PANNELOPZION_ESERCISUCCES, (new IDVariant("S")), "S", "", "", -1);
    PAN_PANNELOPZION.SetValueListItem(PFL_PANNELOPZION_ESERCISUCCES, (new IDVariant("N")), "N", "", "", -1);
    PAN_PANNELOPZION.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, MyGlb.PANEL_LIST, 356, 124, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELOPZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PANNELOPZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PANNELOPZION.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, MyGlb.PANEL_FORM, 392, 96, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELOPZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PANNELOPZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELOPZION_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PANNELOPZION.SetFieldPage(PFL_PANNELOPZION_ETICHEELABOR, -1, -1);
    PAN_PANNELOPZION.SetFieldPanel(PFL_PANNELOPZION_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PANNELOPZION_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELOPZION.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPIAVANDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPAVA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PANNELOPZION.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_PANNELOPZION_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPIAVANDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PANNELOPZION.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_PANNELOPZION_TIPOAVANZO, "");
    PAN_PANNELOPZION.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PANNELOPZION.SetIMDB(IMDB, "PQRY_PANNELOPZIO1", true);
    PAN_PANNELOPZION.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PANNELOPZION.SetQueryIMDB(PPQRY_PANNELOPZIO1, IMDBDef11.PQRY_PANNELOPZIO1_RS, IMDBDef3.TBL_PANNELOPZION);
    JustLoaded = true;
    PAN_PANNELOPZION.SetFieldPrimaryIndex(PFL_PANNELOPZION_TIPOAVANZO, IMDBDef3.FLD_PANNELOPZION_NOMOGGTIPAVA);
    PAN_PANNELOPZION.SetFieldPrimaryIndex(PFL_PANNELOPZION_ESERCISUCCES, IMDBDef3.FLD_PANNELOPZION_NOMOGGESESUC);
    PAN_PANNELOPZION.SetMasterTable(0, "PANNELOPZION");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELOPZION.Status() == 2)
    {
      int oldListQBE = PAN_PANNELOPZION.iUseListQBE;
      PAN_PANNELOPZION.iUseListQBE = 0;
      PAN_PANNELOPZION.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELOPZION.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELOPZION.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PANNELOPZION) PAN_PANNELOPZION_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELOPZION) PAN_PANNELOPZION_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PANNELOPZION) PAN_PANNELOPZION_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELOPZION) PAN_PANNELOPZION_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PANNELOPZION) PAN_PANNELOPZION_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
