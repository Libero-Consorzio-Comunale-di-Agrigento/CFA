// **********************************************
// Anomalie Associazione Centro A Capitoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AnomalieAssociazioneCentroACapitoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ANOMALIASSOC_ESERCIZIO = 0;
  private static int PFL_ANOMALIASSOC_CAPITOLO = 1;
  private static int PFL_ANOMALIASSOC_ARTICOLO = 2;
  private static int PFL_ANOMALIASSOC_FATTORE = 3;
  private static int PFL_ANOMALIASSOC_ANOMALIA = 4;

  private static int PPQRY_ANOMALIASSO1 = 0;


  IDPanel PAN_ANOMALIASSOC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_ANOMALIASSO1(IMDB);
    Init_PQRY_ANOMALIASSO1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_ANOMALIASSO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_ANOMALIASSO1, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_ANOMALIASSO1, "PQRY_ANOMALIASSO1");
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEFATT, "NOMEOGGEFATT");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEFATT,5,40,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEANOM, "NOMEOGGEANOM");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEANOM,9,500,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_ANOMALIASSO1, 0);
  }

  private static void Init_PQRY_ANOMALIASSO1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_ANOMALIASSO1_RS, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_ANOMALIASSO1_RS, "PQRY_ANOMALIASSO1_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEFATT, "NOMEOGGEFATT");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEFATT,5,40,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEANOM, "NOMEOGGEANOM");
    IMDB.SetFldParams(IMDBDef11.PQRY_ANOMALIASSO1_RS,IMDBDef11.PQSL_ANOMALIASSO1_NOMEOGGEANOM,9,500,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AnomalieAssociazioneCentroACapitoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public AnomalieAssociazioneCentroACapitoli()
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
    FormIdx = MyGlb.FRM_ANOASSCENACA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DCB18A51-D823-4128-9167-F181A7C4AA1F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 936;
    DesignHeight = 26;
    set_Caption(new IDVariant("Anomalie associazione Centro a Capitoli"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 936;
    Frames[1].Height = 380;
    Frames[1].Caption = "Anomalie Assoc";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_ANOMALIASSOC = new IDPanel(w, this, 1, "PAN_ANOMALIASSOC");
    Frames[1].Content = PAN_ANOMALIASSOC;
    PAN_ANOMALIASSOC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ANOMALIASSOC.VS = MainFrm.VisualStyleList;
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 936-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ANOMALIASSOC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9D24E235-5C08-471F-A411-2C488AE20DA8");
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 904, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ANOMALIASSOC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ANOMALIASSOC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ANOMALIASSOC.InitStatus = 2;
    PAN_ANOMALIASSOC_Init();
    PAN_ANOMALIASSOC_InitFields();
    PAN_ANOMALIASSOC_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_ANOMALIASSOC, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ANOASSCENACA_ANOMALIASSO1();
      }
      PAN_ANOMALIASSOC.UpdatePanel(MainFrm);
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
    return (obj instanceof AnomalieAssociazioneCentroACapitoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AnomalieAssociazioneCentroACapitoli.class.getName() : (Glb.ClassWithPackage(AnomalieAssociazioneCentroACapitoli.class) ? AnomalieAssociazioneCentroACapitoli.class.getName().substring(AnomalieAssociazioneCentroACapitoli.class.getPackage().getName().length() + 1) : AnomalieAssociazioneCentroACapitoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Anomalie Assoc On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ANOMALIASSOC_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ANOMALIASSOC);
      // 
      // Anomalie Assoc On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ANOMALIASSOC.set_ToolTip(Glb.OBJ_FIELD,PFL_ANOMALIASSOC_ANOMALIA,(new IDVariant(PAN_ANOMALIASSOC.FieldText(PFL_ANOMALIASSOC_ANOMALIA))).stringValue()); 
      PAN_ANOMALIASSOC.set_ToolTip(Glb.OBJ_FIELD,PFL_ANOMALIASSOC_FATTORE,(new IDVariant(PAN_ANOMALIASSOC.FieldText(PFL_ANOMALIASSOC_FATTORE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnomalieAssociazioneCentroACapitoli", "AnomalieAssocOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Anomalie Assoc
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ANOASSCENACA_ANOMALIASSO1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_ANOMALIASSO1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_ANOMALIASSOC, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_ANOMALIASSOC, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_ANOMALIASSO1_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_ANOMALIASSO1_RS, 0, IMDBDef3.TBL_ANOMALIASSOC, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_ANOMALIASSO1_RS, 0, 0, IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_ANOMALIASSO1_RS, 1, 0, IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_ANOMALIASSO1_RS, 2, 0, IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_ANOMALIASSO1_RS, 3, 0, IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEFATT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_ANOMALIASSO1_RS, 4, 0, IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEANOM, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_ANOMALIASSOC, 0);
      if (IMDB.Eof(IMDBDef3.TBL_ANOMALIASSOC, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_ANOMALIASSOC, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef11.PQRY_ANOMALIASSO1_RS);
    IMDB.TblSortBy(IMDBDef11.PQRY_ANOMALIASSO1_RS,0,true);
    IMDB.TblSortBy(IMDBDef11.PQRY_ANOMALIASSO1_RS,1,true);
    IMDB.TblSortBy(IMDBDef11.PQRY_ANOMALIASSO1_RS,2,true);
    IMDB.TblStartSort(IMDBDef11.PQRY_ANOMALIASSO1_RS);
    IMDB.TblMoveFirst(IMDBDef11.PQRY_ANOMALIASSO1_RS, 0);
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
  private void PAN_ANOMALIASSOC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ANOMALIASSOC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ANOMALIASSOC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ANOMALIASSOC, Cancel);
    // Stub
  }

  private void PAN_ANOMALIASSOC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ANOMALIASSOC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ANOMALIASSOC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ANOMALIASSOC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ANOMALIASSOC_Init()
  {

    PAN_ANOMALIASSOC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ANOMALIASSOC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ANOMALIASSOC.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_ANOMALIASSOC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, "2495E200-1A22-48B6-949A-3AF4EC8C9BB9");
    PAN_ANOMALIASSOC.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, "Esercizio");
    PAN_ANOMALIASSOC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, "");
    PAN_ANOMALIASSOC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALIASSOC.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALIASSOC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, "161AFB85-30B5-447D-84C7-87C211BD304C");
    PAN_ANOMALIASSOC.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, "Capitolo");
    PAN_ANOMALIASSOC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, "");
    PAN_ANOMALIASSOC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ANOMALIASSOC.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALIASSOC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, "0AAC247F-A00B-40FB-95C0-29D35364E7E6");
    PAN_ANOMALIASSOC.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, "Articolo");
    PAN_ANOMALIASSOC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, "");
    PAN_ANOMALIASSOC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALIASSOC.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALIASSOC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, "D9223738-AB51-436D-9E4A-044746247982");
    PAN_ANOMALIASSOC.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, "Fattore");
    PAN_ANOMALIASSOC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, "");
    PAN_ANOMALIASSOC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALIASSOC.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALIASSOC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, "2D99B25C-81F3-4A19-8DD2-7960F34D072C");
    PAN_ANOMALIASSOC.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, "Anomalia");
    PAN_ANOMALIASSOC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, "");
    PAN_ANOMALIASSOC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALIASSOC.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ANOMALIASSOC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_ANOMALIASSOC.SetFieldPage(PFL_ANOMALIASSOC_ESERCIZIO, -1, -1);
    PAN_ANOMALIASSOC.SetFieldPanel(PFL_ANOMALIASSOC_ESERCIZIO, PPQRY_ANOMALIASSO1, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, MyGlb.PANEL_LIST, 60, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, MyGlb.PANEL_LIST, 56);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ANOMALIASSOC.SetFieldPage(PFL_ANOMALIASSOC_CAPITOLO, -1, -1);
    PAN_ANOMALIASSOC.SetFieldPanel(PFL_ANOMALIASSOC_CAPITOLO, PPQRY_ANOMALIASSO1, "A.NOMEOGGECAPI", "NOMEOGGECAPI", 1, 16, 0, -13997);
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, MyGlb.PANEL_LIST, 172, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, MyGlb.PANEL_LIST, 52);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, MyGlb.PANEL_FORM, 80);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_ANOMALIASSOC.SetFieldPage(PFL_ANOMALIASSOC_ARTICOLO, -1, -1);
    PAN_ANOMALIASSOC.SetFieldPanel(PFL_ANOMALIASSOC_ARTICOLO, PPQRY_ANOMALIASSO1, "A.NOMEOGGEARTI", "NOMEOGGEARTI", 1, 2, 0, -13997);
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, MyGlb.PANEL_LIST, 204, 36, 280, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, MyGlb.PANEL_LIST, 52);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, MyGlb.PANEL_FORM, 4, 76, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, MyGlb.PANEL_FORM, 80);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_ANOMALIASSOC.SetFieldPage(PFL_ANOMALIASSOC_FATTORE, -1, -1);
    PAN_ANOMALIASSOC.SetFieldPanel(PFL_ANOMALIASSOC_FATTORE, PPQRY_ANOMALIASSO1, "A.NOMEOGGEFATT", "NOMEOGGEFATT", 5, 40, 0, -13997);
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, MyGlb.PANEL_LIST, 484, 36, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, MyGlb.PANEL_LIST, 80);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, MyGlb.PANEL_LIST, "Anomalia");
    PAN_ANOMALIASSOC.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, MyGlb.PANEL_FORM, 4, 100, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALIASSOC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, MyGlb.PANEL_FORM, 80);
    PAN_ANOMALIASSOC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, MyGlb.PANEL_FORM, 2);
    PAN_ANOMALIASSOC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALIASSOC_ANOMALIA, MyGlb.PANEL_FORM, "Anomalia");
    PAN_ANOMALIASSOC.SetFieldPage(PFL_ANOMALIASSOC_ANOMALIA, -1, -1);
    PAN_ANOMALIASSOC.SetFieldPanel(PFL_ANOMALIASSOC_ANOMALIA, PPQRY_ANOMALIASSO1, "A.NOMEOGGEANOM", "NOMEOGGEANOM", 9, 500, 0, -13997);
  }

  private void PAN_ANOMALIASSOC_InitQueries()
  {
    StringBuffer SQL;

    PAN_ANOMALIASSOC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ANOMALIASSOC.SetIMDB(IMDB, "PQRY_ANOMALIASSO1", true);
    PAN_ANOMALIASSOC.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_ANOMALIASSOC.SetQueryIMDB(PPQRY_ANOMALIASSO1, IMDBDef11.PQRY_ANOMALIASSO1_RS, IMDBDef3.TBL_ANOMALIASSOC);
    JustLoaded = true;
    PAN_ANOMALIASSOC.SetFieldPrimaryIndex(PFL_ANOMALIASSOC_ESERCIZIO, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEESER);
    PAN_ANOMALIASSOC.SetFieldPrimaryIndex(PFL_ANOMALIASSOC_CAPITOLO, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGECAPI);
    PAN_ANOMALIASSOC.SetFieldPrimaryIndex(PFL_ANOMALIASSOC_ARTICOLO, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEARTI);
    PAN_ANOMALIASSOC.SetFieldPrimaryIndex(PFL_ANOMALIASSOC_FATTORE, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEFATT);
    PAN_ANOMALIASSOC.SetFieldPrimaryIndex(PFL_ANOMALIASSOC_ANOMALIA, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEANOM);
    PAN_ANOMALIASSOC.SetMasterTable(0, "ANOMALIASSOC");
    PAN_ANOMALIASSOC.AddToSortList(PFL_ANOMALIASSOC_ESERCIZIO, true);
    PAN_ANOMALIASSOC.AddToSortList(PFL_ANOMALIASSOC_CAPITOLO, true);
    PAN_ANOMALIASSOC.AddToSortList(PFL_ANOMALIASSOC_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ANOMALIASSOC.Status() == 2)
    {
      int oldListQBE = PAN_ANOMALIASSOC.iUseListQBE;
      PAN_ANOMALIASSOC.iUseListQBE = 0;
      PAN_ANOMALIASSOC.PanelCommand(Glb.PCM_SEARCH);
      PAN_ANOMALIASSOC.PanelCommand(Glb.PCM_FIND);
      PAN_ANOMALIASSOC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ANOMALIASSOC) PAN_ANOMALIASSOC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ANOMALIASSOC) PAN_ANOMALIASSOC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ANOMALIASSOC) PAN_ANOMALIASSOC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ANOMALIASSOC) PAN_ANOMALIASSOC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ANOMALIASSOC) PAN_ANOMALIASSOC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
