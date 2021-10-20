// **********************************************
// Sub Impegni Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SubImpegniOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SUBIMPEGOPER_CAPITOLO = 0;
  private static int PFL_SUBIMPEGOPER_ARTICOLO = 1;
  private static int PFL_SUBIMPEGOPER_NUMEROIMP = 2;
  private static int PFL_SUBIMPEGOPER_ANNOIMP = 3;
  private static int PFL_SUBIMPEGOPER_NUMEROSUBIMP = 4;
  private static int PFL_SUBIMPEGOPER_ANNOSUBIMP = 5;
  private static int PFL_SUBIMPEGOPER_IMPORTO = 6;
  private static int PFL_SUBIMPEGOPER_DATA = 7;
  private static int PFL_SUBIMPEGOPER_DESCRIZIONE = 8;
  private static int PFL_SUBIMPEGOPER_BENEFICIARIO = 9;
  private static int PFL_SUBIMPEGOPER_SEDEDEL = 10;
  private static int PFL_SUBIMPEGOPER_NUMERODEL = 11;
  private static int PFL_SUBIMPEGOPER_ANNODEL = 12;
  private static int PFL_SUBIMPEGOPER_UNITAPROPONE = 13;
  private static int PFL_SUBIMPEGOPER_NUMEROPROPOS = 14;
  private static int PFL_SUBIMPEGOPER_ANNOPROPOSTA = 15;
  private static int PFL_SUBIMPEGOPER_LABELCAPITOL = 16;
  private static int PFL_SUBIMPEGOPER_LABELIMPEGNO = 17;
  private static int PFL_SUBIMPEGOPER_LABELSUBIMPE = 18;
  private static int PFL_SUBIMPEGOPER_LABELDELIBER = 19;
  private static int PFL_SUBIMPEGOPER_LABELPROPOST = 20;
  private static int PFL_SUBIMPEGOPER_RIFBILANCPEG = 21;
  private static int PFL_SUBIMPEGOPER_IMPEGNO = 22;
  private static int PFL_SUBIMPEGOPER_SUBIMPEGNO = 23;
  private static int PFL_SUBIMPEGOPER_DELIBERA = 24;
  private static int PFL_SUBIMPEGOPER_PROPOSTA = 25;

  private static int PPQRY_ESESUB = 0;


  IDPanel PAN_SUBIMPEGOPER;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI30(IMDB);
    //
    //
    Init_PQRY_ESESUB(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI30(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI30, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI30, "TBL_PARAMETRI30");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI30,IMDBDef1.FLD_PARAMETRI30_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI30,IMDBDef1.FLD_PARAMETRI30_PARAMOPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI30, 0);
  }

  private static void Init_PQRY_ESESUB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ESESUB, 22);
    IMDB.set_TblCode(IMDBDef8.PQRY_ESESUB, "PQRY_ESESUB");
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESERIFBILPEG, "ESERIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESERIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUBIMPEGN, "ESESUBIMPEGN");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUBIMPEGN,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUSUBIMPE, "ESESUSUBIMPE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUSUBIMPE,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUBIMPORT, "ESESUBIMPORT");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUBIMPORT,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUBDELIBE, "ESESUBDELIBE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUBDELIBE,5,208,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUBPROPOS, "ESESUBPROPOS");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ESESUBPROPOS,5,212,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUB,IMDBDef8.PQSL_ESESUB_NUMERO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ESESUB, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SubImpegniOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public SubImpegniOpera()
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
    FormIdx = MyGlb.FRM_SUBIMPEGOPER;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "286F30C9-166A-4738-BDC2-5CED9DC3D1DB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 394;
    set_Caption(new IDVariant("Sub Impegni Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 368;
    Frames[1].Caption = "Sub Impegni Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_SUBIMPEGOPER = new IDPanel(w, this, 1, "PAN_SUBIMPEGOPER");
    Frames[1].Content = PAN_SUBIMPEGOPER;
    PAN_SUBIMPEGOPER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SUBIMPEGOPER.VS = MainFrm.VisualStyleList;
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DE7C797A-70E1-4DBD-A567-5C4AD7BC6FC6");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1144, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SUBIMPEGOPER.InitStatus = 2;
    PAN_SUBIMPEGOPER_Init();
    PAN_SUBIMPEGOPER_InitFields();
    PAN_SUBIMPEGOPER_InitQueries();
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
      PAN_SUBIMPEGOPER.UpdatePanel(MainFrm);
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
    return (obj instanceof SubImpegniOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SubImpegniOpera.class.getName() : (Glb.ClassWithPackage(SubImpegniOpera.class) ? SubImpegniOpera.class.getName().substring(SubImpegniOpera.class.getPackage().getName().length() + 1) : SubImpegniOpera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Sub Impegni Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SUBIMPEGOPER_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SUBIMPEGOPER);
      // 
      // Sub Impegni Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SUBIMPEGOPER.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGOPER_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_ESESUB, IMDBDef8.PQSL_ESESUB_DESCRIZIONE, 0).stringValue()); 
      PAN_SUBIMPEGOPER.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGOPER_BENEFICIARIO,IMDB.Value(IMDBDef8.PQRY_ESESUB, IMDBDef8.PQSL_ESESUB_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubImpegniOpera", "SubImpegniOperaOnDynamicPropertiesEvent", _e);
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
      // PAN_SUBIMPEGOPER.set_FixedCols((new IDVariant(1)).intValue());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubImpegniOpera", "LoadEvent", _e);
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
  private void PAN_SUBIMPEGOPER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SUBIMPEGOPER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SUBIMPEGOPER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SUBIMPEGOPER, Cancel);
    // Stub
  }

  private void PAN_SUBIMPEGOPER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SUBIMPEGOPER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SUBIMPEGOPER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SUBIMPEGOPER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SUBIMPEGOPER_Init()
  {

    PAN_SUBIMPEGOPER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SUBIMPEGOPER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SUBIMPEGOPER.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, "8C1A97EE-5E2B-4703-A849-3FF989BD46D6");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, "CAPITOLO");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, "1912B0D9-454B-4FD6-8B4E-6008C764A435");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, "ARTICOLO");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, "133BA5F1-DF70-4B27-983E-66C38483712A");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, "NUMERO IMP");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, "1C570FB2-DEF3-4D39-9157-1ABCF24B96D6");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, "ANNO IMP");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, "0387797F-F9ED-4680-B5EA-59422FBD746B");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, "F6C3663A-C4D9-481B-A687-974ED7A74A6B");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, "3BAE1001-FB01-40FC-AAD1-93A0E35D4CCF");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, "Importo");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, "F94357F0-6A73-4C05-A353-1A2331970942");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, "Data");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, "3F226ECA-B3E5-4F9D-8049-EA37923C8CE6");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, "Descrizione");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, "63D09385-DE9A-45AE-B119-B4A298EE958C");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, "Beneficiario");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, "8928C08E-C2EC-4946-8C31-DE12EADCD3E6");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, "SEDE DEL");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, "388FF4F8-3A13-4CA4-8FD7-068CA4ABC010");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, "NUMERO DEL");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, "3B9125B0-F38C-40A6-A0A1-A8582247D05D");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, "ANNO DEL");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, "E671C7D2-75E9-48B3-86CA-304CD24FD162");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, "E98DFB31-AD77-4CB9-940F-32F754B6BFEE");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, "D7F05952-6D20-4498-B393-F0A8F68E4BD9");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, "7E43C137-79CF-4324-9C26-74D5E320932F");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, "Capitolo/Art.");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, "3DB823A4-B730-4320-B8A7-36BD5CA0D2FE");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, "Impegno");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, "E600288E-7761-4CEB-968A-7D8872957D21");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, "Sub-Impegno");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, "D18B3408-7CF1-41AD-848B-39B0AE9D1C3B");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, "Delibera");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, "5091027E-41D3-4260-9B55-259DD23FD896");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, "Proposta");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, "E184551F-0D02-4A15-830E-263E199AF5CB");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, "To String (ESESUB CAPITOLO) + \" / \" + To String (ESESUB ARTICOLO)");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, "B5614A05-6D9A-4B86-B7B0-9960C4037D84");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, "Impegno");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, "B3AC047D-B3BA-4FCE-A1A5-70FF59095B97");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, "Sub Impegno");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, "");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, "4FE6A394-1801-44FF-BDBD-820454B59E10");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, "Delibera");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, "SUBIMP SEDE DEL + \" - \" + To String (SUBIMP NUMERO DEL) + \" / \" + To String (SUBIMP ANNO DEL)");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, "3A5C3F87-0475-45DF-8A71-833ADBF195F3");
    PAN_SUBIMPEGOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, "Proposta");
    PAN_SUBIMPEGOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, "SUBIMP UNITA PROPONENTE + \" - \" + To String (SUBIMP NUMERO PROPOSTA) + \" / \" + To String (SUBIMP ANNO PROPOSTA)");
    PAN_SUBIMPEGOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SUBIMPEGOPER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, MyGlb.PANEL_FORM, 4, 796, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_CAPITOLO, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_CAPITOLO, PPQRY_ESESUB, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, MyGlb.PANEL_FORM, 4, 820, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_ARTICOLO, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_ARTICOLO, PPQRY_ESESUB, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, MyGlb.PANEL_LIST, 132, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, MyGlb.PANEL_FORM, 4, 844, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_NUMEROIMP, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_NUMEROIMP, PPQRY_ESESUB, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, MyGlb.PANEL_LIST, 176, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, MyGlb.PANEL_FORM, 4, 868, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_ANNOIMP, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_ANNOIMP, PPQRY_ESESUB, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, MyGlb.PANEL_LIST, 212, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 892, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_NUMEROSUBIMP, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_NUMEROSUBIMP, PPQRY_ESESUB, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, MyGlb.PANEL_LIST, 260, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 916, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_ANNOSUBIMP, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_ANNOSUBIMP, PPQRY_ESESUB, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, MyGlb.PANEL_LIST, 300, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, MyGlb.PANEL_FORM, 4, 628, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_IMPORTO, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldUnbound(PFL_SUBIMPEGOPER_IMPORTO, true);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_IMPORTO, PPQRY_ESESUB, "A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES", "ESESUBIMPORT", 3, 28, 6, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, MyGlb.PANEL_LIST, 400, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, MyGlb.PANEL_LIST, 68);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, MyGlb.PANEL_FORM, 4, 652, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, MyGlb.PANEL_FORM, 68);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_DATA, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_DATA, PPQRY_ESESUB, "B.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 472, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 592, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_DESCRIZIONE, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_DESCRIZIONE, PPQRY_ESESUB, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, MyGlb.PANEL_LIST, 656, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, MyGlb.PANEL_LIST, 140);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 424, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, MyGlb.PANEL_FORM, 140);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_BENEFICIARIO, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_BENEFICIARIO, PPQRY_ESESUB, "D.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, MyGlb.PANEL_LIST, 840, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, MyGlb.PANEL_FORM, 4, 940, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_SEDEDEL, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_SEDEDEL, PPQRY_ESESUB, "B.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, MyGlb.PANEL_LIST, 876, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, MyGlb.PANEL_FORM, 4, 964, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_NUMERODEL, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_NUMERODEL, PPQRY_ESESUB, "B.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, MyGlb.PANEL_LIST, 920, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, MyGlb.PANEL_FORM, 4, 988, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_ANNODEL, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_ANNODEL, PPQRY_ESESUB, "B.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, MyGlb.PANEL_LIST, 956, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 1012, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_UNITAPROPONE, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_UNITAPROPONE, PPQRY_ESESUB, "B.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, MyGlb.PANEL_LIST, 1064, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 1036, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_NUMEROPROPOS, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_NUMEROPROPOS, PPQRY_ESESUB, "B.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1108, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 1060, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_ANNOPROPOSTA, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_ANNOPROPOSTA, PPQRY_ESESUB, "B.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_LABELCAPITOL, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, MyGlb.PANEL_LIST, 132, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, MyGlb.PANEL_FORM, 8, 8, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_LABELIMPEGNO, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, MyGlb.PANEL_LIST, 212, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, MyGlb.PANEL_FORM, 16, 16, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELSUBIMPE, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_LABELSUBIMPE, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_LABELSUBIMPE, -1, "", "LABELSUBIMPE", 0, 0, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, MyGlb.PANEL_LIST, 840, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, MyGlb.PANEL_FORM, 24, 24, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_LABELDELIBER, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, MyGlb.PANEL_LIST, 956, 0, 188, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, MyGlb.PANEL_FORM, 32, 32, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_LABELPROPOST, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 1084, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_RIFBILANCPEG, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldUnbound(PFL_SUBIMPEGOPER_RIFBILANCPEG, true);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_RIFBILANCPEG, PPQRY_ESESUB, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "ESERIFBILPEG", 5, 201, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, MyGlb.PANEL_FORM, 12, 1092, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_IMPEGNO, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldUnbound(PFL_SUBIMPEGOPER_IMPEGNO, true);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_IMPEGNO, PPQRY_ESESUB, "TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP )", "ESESUBIMPEGN", 5, 201, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, MyGlb.PANEL_LIST, 72);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, MyGlb.PANEL_LIST, "Sub Impegno");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, MyGlb.PANEL_FORM, 4, 1084, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, MyGlb.PANEL_FORM, 72);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_SUBIMPEGNO, MyGlb.PANEL_FORM, "Sub Impegno");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_SUBIMPEGNO, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldUnbound(PFL_SUBIMPEGOPER_SUBIMPEGNO, true);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_SUBIMPEGNO, PPQRY_ESESUB, "TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP )", "ESESUSUBIMPE", 5, 201, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, MyGlb.PANEL_FORM, 4, 1084, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_DELIBERA, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldUnbound(PFL_SUBIMPEGOPER_DELIBERA, true);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_DELIBERA, PPQRY_ESESUB, "B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL )", "ESESUBDELIBE", 5, 208, 0, -13997);
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_SUBIMPEGOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, MyGlb.PANEL_FORM, 4, 1084, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_SUBIMPEGOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGOPER_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_SUBIMPEGOPER.SetFieldPage(PFL_SUBIMPEGOPER_PROPOSTA, -1, -1);
    PAN_SUBIMPEGOPER.SetFieldUnbound(PFL_SUBIMPEGOPER_PROPOSTA, true);
    PAN_SUBIMPEGOPER.SetFieldPanel(PFL_SUBIMPEGOPER_PROPOSTA, PPQRY_ESESUB, "B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA )", "ESESUBPROPOS", 5, 212, 0, -13997);
  }

  private void PAN_SUBIMPEGOPER_InitQueries()
  {
    StringBuffer SQL;

    PAN_SUBIMPEGOPER.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SUBIMPEGOPER.SetIMDB(IMDB, "PQRY_ESESUB", true);
    PAN_SUBIMPEGOPER.set_SetString(MyGlb.MASTER_ROWNAME, "ESESUB");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as ESERIFBILPEG, ");
    SQL.append("  TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ) as ESESUBIMPEGN, ");
    SQL.append("  TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP ) as ESESUSUBIMPE, ");
    SQL.append("  A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES as ESESUBIMPORT, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  D.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL ) as ESESUBDELIBE, ");
    SQL.append("  B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA ) as ESESUBPROPOS, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  B.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  B.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  B.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  B.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  B.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  B.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  B.NUMERO_PROPOSTA as NUMERO_PROPOSTA ");
    PAN_SUBIMPEGOPER.SetQuery(PPQRY_ESESUB, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESESUB A, ");
    SQL.append("  SUBIMP B, ");
    SQL.append("  IMP C, ");
    SQL.append("  BEN D ");
    PAN_SUBIMPEGOPER.SetQuery(PPQRY_ESESUB, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.BENEFICIARIO = D.CODICE(+)) ");
    SQL.append("and   (A.ANNO_SUBIMP = B.ANNO_SUBIMP) ");
    SQL.append("and   (A.NUMERO_SUBIMP = B.NUMERO_SUBIMP) ");
    SQL.append("and   (C.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   (C.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (C.OPERA = ~~TBL_PARAMETRI30.PARAMOPERA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SUBIMPEGOPER.SetQuery(PPQRY_ESESUB, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SUBIMPEGOPER.SetQuery(PPQRY_ESESUB, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SUBIMPEGOPER.SetQuery(PPQRY_ESESUB, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP ");
    PAN_SUBIMPEGOPER.SetQuery(PPQRY_ESESUB, 5, SQL, -1, "");
    PAN_SUBIMPEGOPER.SetQueryDB(PPQRY_ESESUB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGOPER.SetMasterTable(0, "ESESUB");
    PAN_SUBIMPEGOPER.AddToSortList(PFL_SUBIMPEGOPER_CAPITOLO, true);
    PAN_SUBIMPEGOPER.AddToSortList(PFL_SUBIMPEGOPER_ARTICOLO, true);
    PAN_SUBIMPEGOPER.AddToSortList(PFL_SUBIMPEGOPER_ANNOIMP, true);
    PAN_SUBIMPEGOPER.AddToSortList(PFL_SUBIMPEGOPER_NUMEROIMP, true);
    PAN_SUBIMPEGOPER.AddToSortList(PFL_SUBIMPEGOPER_ANNOSUBIMP, true);
    PAN_SUBIMPEGOPER.AddToSortList(PFL_SUBIMPEGOPER_NUMEROSUBIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SUBIMPEGOPER.Status() == 2)
    {
      int oldListQBE = PAN_SUBIMPEGOPER.iUseListQBE;
      PAN_SUBIMPEGOPER.iUseListQBE = 0;
      PAN_SUBIMPEGOPER.PanelCommand(Glb.PCM_SEARCH);
      PAN_SUBIMPEGOPER.PanelCommand(Glb.PCM_FIND);
      PAN_SUBIMPEGOPER.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SUBIMPEGOPER) PAN_SUBIMPEGOPER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBIMPEGOPER) PAN_SUBIMPEGOPER_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SUBIMPEGOPER) PAN_SUBIMPEGOPER_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBIMPEGOPER) PAN_SUBIMPEGOPER_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SUBIMPEGOPER) PAN_SUBIMPEGOPER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
