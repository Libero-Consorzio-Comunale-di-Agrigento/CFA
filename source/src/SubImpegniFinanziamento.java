// **********************************************
// Sub Impegni Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SubImpegniFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SUBIMPEGFINA_CAPITOLO = 0;
  private static int PFL_SUBIMPEGFINA_ARTICOLO = 1;
  private static int PFL_SUBIMPEGFINA_NUMEROIMP = 2;
  private static int PFL_SUBIMPEGFINA_ANNOIMP = 3;
  private static int PFL_SUBIMPEGFINA_NUMEROSUBIMP = 4;
  private static int PFL_SUBIMPEGFINA_ANNOSUBIMP = 5;
  private static int PFL_SUBIMPEGFINA_IMPORTO = 6;
  private static int PFL_SUBIMPEGFINA_DATA = 7;
  private static int PFL_SUBIMPEGFINA_DESCRIZIONE = 8;
  private static int PFL_SUBIMPEGFINA_BENEFICIARIO = 9;
  private static int PFL_SUBIMPEGFINA_SEDEDEL = 10;
  private static int PFL_SUBIMPEGFINA_NUMERODEL = 11;
  private static int PFL_SUBIMPEGFINA_ANNODEL = 12;
  private static int PFL_SUBIMPEGFINA_UNITAPROPONE = 13;
  private static int PFL_SUBIMPEGFINA_NUMEROPROPOS = 14;
  private static int PFL_SUBIMPEGFINA_ANNOPROPOSTA = 15;
  private static int PFL_SUBIMPEGFINA_LABELCAPITOL = 16;
  private static int PFL_SUBIMPEGFINA_RIFBILANCPEG = 17;
  private static int PFL_SUBIMPEGFINA_IMPEGNO = 18;
  private static int PFL_SUBIMPEGFINA_SUBIMPEGNO = 19;
  private static int PFL_SUBIMPEGFINA_DELIBERA = 20;
  private static int PFL_SUBIMPEGFINA_PROPOSTA = 21;
  private static int PFL_SUBIMPEGFINA_LABELIMPEGNO = 22;
  private static int PFL_SUBIMPEGFINA_LABELSUBIMPE = 23;
  private static int PFL_SUBIMPEGFINA_LABELDELIBER = 24;
  private static int PFL_SUBIMPEGFINA_LABELPROPOST = 25;

  private static int PPQRY_ESESUBFIN = 0;


  IDPanel PAN_SUBIMPEGFINA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI43(IMDB);
    //
    //
    Init_PQRY_ESESUBFIN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI43(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI43, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI43, "TBL_PARAMETRI43");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI43,IMDBDef1.FLD_PARAMETRI43_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI43,IMDBDef1.FLD_PARAMETRI43_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI43, 0);
  }

  private static void Init_PQRY_ESESUBFIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ESESUBFIN, 22);
    IMDB.set_TblCode(IMDBDef8.PQRY_ESESUBFIN, "PQRY_ESESUBFIN");
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESEFIRIBIPEG, "ESEFIRIBIPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESEFIRIBIPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESESUFINIMPE, "ESESUFINIMPE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESESUFINIMPE,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESEFINSUBIMP, "ESEFINSUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESEFINSUBIMP,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESESUFINIMPO, "ESESUFINIMPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESESUFINIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESESUFINDELI, "ESESUFINDELI");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESESUFINDELI,5,208,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESESUFINPROP, "ESESUFINPROP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ESESUFINPROP,5,212,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESESUBFIN,IMDBDef8.PQSL_ESESUBFIN_NUMERO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ESESUBFIN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SubImpegniFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public SubImpegniFinanziamento()
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
    FormIdx = MyGlb.FRM_SUBIMPEGFINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E3DC2FE1-AF65-4E69-9A6D-C356EB4B3962";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 394;
    set_Caption(new IDVariant("Sub Impegni Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 368;
    Frames[1].Caption = "Sub Impegni Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_SUBIMPEGFINA = new IDPanel(w, this, 1, "PAN_SUBIMPEGFINA");
    Frames[1].Content = PAN_SUBIMPEGFINA;
    PAN_SUBIMPEGFINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SUBIMPEGFINA.VS = MainFrm.VisualStyleList;
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "20881A78-5E8E-4FFB-BEE2-67AEBA8DE3E2");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1164, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SUBIMPEGFINA.InitStatus = 2;
    PAN_SUBIMPEGFINA_Init();
    PAN_SUBIMPEGFINA_InitFields();
    PAN_SUBIMPEGFINA_InitQueries();
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
      PAN_SUBIMPEGFINA.UpdatePanel(MainFrm);
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
    return (obj instanceof SubImpegniFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SubImpegniFinanziamento.class.getName() : (Glb.ClassWithPackage(SubImpegniFinanziamento.class) ? SubImpegniFinanziamento.class.getName().substring(SubImpegniFinanziamento.class.getPackage().getName().length() + 1) : SubImpegniFinanziamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Sub Impegni Finanziamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SUBIMPEGFINA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SUBIMPEGFINA);
      // 
      // Sub Impegni Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SUBIMPEGFINA.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGFINA_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_ESESUBFIN, IMDBDef8.PQSL_ESESUBFIN_DESCRIZIONE, 0).stringValue()); 
      PAN_SUBIMPEGFINA.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGFINA_BENEFICIARIO,IMDB.Value(IMDBDef8.PQRY_ESESUBFIN, IMDBDef8.PQSL_ESESUBFIN_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubImpegniFinanziamento", "SubImpegniFinanziamentoOnDynamicPropertiesEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubImpegniFinanziamento", "LoadEvent", _e);
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
  private void PAN_SUBIMPEGFINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SUBIMPEGFINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SUBIMPEGFINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SUBIMPEGFINA, Cancel);
    // Stub
  }

  private void PAN_SUBIMPEGFINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SUBIMPEGFINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SUBIMPEGFINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SUBIMPEGFINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SUBIMPEGFINA_Init()
  {

    PAN_SUBIMPEGFINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SUBIMPEGFINA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SUBIMPEGFINA.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, "BDBD4186-7ED1-406D-BDFD-412B314DF662");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, "CAPITOLO");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, "06657739-BD4C-4A3D-83C1-566352078E50");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, "ARTICOLO");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, "97F0BA39-208B-4036-87E7-B92A462E4C84");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, "NUMERO IMP");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, "E960F4A4-0A91-40E6-A565-C6B9E9E780F4");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, "ANNO IMP");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, "AE326F25-15F9-40A4-A1D7-E0847F4864AD");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, "8BF3DB99-ECCE-4792-97F2-BE38124E4EF2");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, "10C4A832-245E-4911-B943-433E4A4F6A3D");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, "Importo");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, "6390601C-068E-44B8-B2A4-4EFAC91CAEB1");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, "Data");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, "1D23D201-2F8F-4FC4-941E-323C12307E9A");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, "Descrizione");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, "F70D40F7-B357-4DB9-A38F-01C58F9D6A97");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, "Beneficiario");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, "51D58D33-2021-4210-9773-274DE3225805");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, "SEDE DEL");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, "DCEE8D23-426E-48E6-B0BC-C7FF29D82BDA");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, "NUMERO DEL");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, "40E82A15-48A4-4197-B3E6-4A2021DCCAB9");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, "ANNO DEL");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, "C964EA40-7001-4FB5-A2D9-012B9EBEACD4");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, "8B60E826-3EE5-4D43-AB7E-2434148B157F");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, "D7301728-4946-4E3E-B44A-5C146CD244A9");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, "10DA281A-0674-4605-A2E9-5B94ABDB4617");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, "Capitolo/Art.");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, "C3A0DF46-5762-4797-B8C9-58EAD6DD324F");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, "To String (ESESUB FIN CAPITOLO) + \" / \" + To String (ESESUB FIN ARTICOLO)");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, "B0E72348-F032-4826-8653-6DD731205281");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, "Impegno");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, "45308055-AA71-42C9-A065-981032EFE3A8");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, "Sub Impegno");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, "");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, "FCB235E3-A353-4AE4-B248-74A5E2F6910A");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, "Delibera");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, "SUBIMP SEDE DEL + \" - \" + To String (SUBIMP NUMERO DEL) + \" / \" + To String (SUBIMP ANNO DEL)");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, "ABF50040-006D-4A9C-A24B-B88CB561898A");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, "Proposta");
    PAN_SUBIMPEGFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, "SUBIMP UNITA PROPONENTE + \" - \" + To String (SUBIMP NUMERO PROPOSTA) + \" / \" + To String (SUBIMP ANNO PROPOSTA)");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, "CB68B6EA-1B86-41F8-B494-2DDF77BB9760");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, "Impegno");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, "1AC2CA85-FE60-4788-AF11-8B4AFE7B6D9F");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, "Sub-Impegno");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, "2C875EC9-7D00-4A8D-B5C6-8F165577BA7B");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, "Delibera");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SUBIMPEGFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, "6BF92429-AD80-4167-8F9E-BC2FEDE76B23");
    PAN_SUBIMPEGFINA.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, "Proposta");
    PAN_SUBIMPEGFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_SUBIMPEGFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_SUBIMPEGFINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, MyGlb.PANEL_FORM, 4, 796, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_CAPITOLO, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_CAPITOLO, PPQRY_ESESUBFIN, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, MyGlb.PANEL_FORM, 4, 820, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_ARTICOLO, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_ARTICOLO, PPQRY_ESESUBFIN, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, MyGlb.PANEL_LIST, 136, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, MyGlb.PANEL_FORM, 4, 844, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_NUMEROIMP, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_NUMEROIMP, PPQRY_ESESUBFIN, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, MyGlb.PANEL_LIST, 180, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, MyGlb.PANEL_FORM, 4, 868, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_ANNOIMP, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_ANNOIMP, PPQRY_ESESUBFIN, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 216, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 892, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_NUMEROSUBIMP, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_NUMEROSUBIMP, PPQRY_ESESUBFIN, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, MyGlb.PANEL_LIST, 264, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 916, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_ANNOSUBIMP, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_ANNOSUBIMP, PPQRY_ESESUBFIN, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, MyGlb.PANEL_LIST, 308, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, MyGlb.PANEL_FORM, 4, 628, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_IMPORTO, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldUnbound(PFL_SUBIMPEGFINA_IMPORTO, true);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_IMPORTO, PPQRY_ESESUBFIN, "A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES", "ESESUFINIMPO", 3, 28, 6, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, MyGlb.PANEL_LIST, 408, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, MyGlb.PANEL_LIST, 68);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, MyGlb.PANEL_FORM, 4, 652, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, MyGlb.PANEL_FORM, 68);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_DATA, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_DATA, PPQRY_ESESUBFIN, "B.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, MyGlb.PANEL_LIST, 484, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 592, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_DESCRIZIONE, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_DESCRIZIONE, PPQRY_ESESUBFIN, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, MyGlb.PANEL_LIST, 668, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, MyGlb.PANEL_LIST, 140);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 424, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, MyGlb.PANEL_FORM, 140);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_BENEFICIARIO, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_BENEFICIARIO, PPQRY_ESESUBFIN, "C.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, MyGlb.PANEL_LIST, 860, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, MyGlb.PANEL_FORM, 4, 940, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_SEDEDEL, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_SEDEDEL, PPQRY_ESESUBFIN, "B.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, MyGlb.PANEL_LIST, 900, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, MyGlb.PANEL_FORM, 4, 964, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_NUMERODEL, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_NUMERODEL, PPQRY_ESESUBFIN, "B.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, MyGlb.PANEL_LIST, 944, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, MyGlb.PANEL_FORM, 4, 988, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_ANNODEL, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_ANNODEL, PPQRY_ESESUBFIN, "B.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, MyGlb.PANEL_LIST, 980, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 1012, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_UNITAPROPONE, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_UNITAPROPONE, PPQRY_ESESUBFIN, "B.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, 1084, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 1036, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_NUMEROPROPOS, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_NUMEROPROPOS, PPQRY_ESESUBFIN, "B.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1128, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 1060, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_ANNOPROPOSTA, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_ANNOPROPOSTA, PPQRY_ESESUBFIN, "B.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_LABELCAPITOL, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 1084, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_RIFBILANCPEG, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldUnbound(PFL_SUBIMPEGFINA_RIFBILANCPEG, true);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_RIFBILANCPEG, PPQRY_ESESUBFIN, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "ESEFIRIBIPEG", 5, 201, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, MyGlb.PANEL_FORM, 12, 1092, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_IMPEGNO, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldUnbound(PFL_SUBIMPEGFINA_IMPEGNO, true);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_IMPEGNO, PPQRY_ESESUBFIN, "TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP )", "ESESUFINIMPE", 5, 201, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, MyGlb.PANEL_LIST, 72);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, MyGlb.PANEL_LIST, "Sub Impegno");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, MyGlb.PANEL_FORM, 4, 1084, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, MyGlb.PANEL_FORM, 72);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_SUBIMPEGNO, MyGlb.PANEL_FORM, "Sub Impegno");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_SUBIMPEGNO, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldUnbound(PFL_SUBIMPEGFINA_SUBIMPEGNO, true);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_SUBIMPEGNO, PPQRY_ESESUBFIN, "TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP )", "ESEFINSUBIMP", 5, 201, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, MyGlb.PANEL_FORM, 4, 1084, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_DELIBERA, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldUnbound(PFL_SUBIMPEGFINA_DELIBERA, true);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_DELIBERA, PPQRY_ESESUBFIN, "B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL )", "ESESUFINDELI", 5, 208, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, MyGlb.PANEL_FORM, 4, 1084, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_PROPOSTA, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldUnbound(PFL_SUBIMPEGFINA_PROPOSTA, true);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_PROPOSTA, PPQRY_ESESUBFIN, "B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA )", "ESESUFINPROP", 5, 212, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, MyGlb.PANEL_LIST, 136, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, MyGlb.PANEL_FORM, 8, 8, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_LABELIMPEGNO, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, MyGlb.PANEL_LIST, 216, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, MyGlb.PANEL_FORM, 16, 16, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELSUBIMPE, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_LABELSUBIMPE, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_LABELSUBIMPE, -1, "", "LABELSUBIMPE", 0, 0, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, MyGlb.PANEL_LIST, 860, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, MyGlb.PANEL_FORM, 24, 24, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_LABELDELIBER, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, MyGlb.PANEL_LIST, 980, 0, 188, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGFINA.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, MyGlb.PANEL_FORM, 32, 32, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGFINA_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGFINA.SetFieldPage(PFL_SUBIMPEGFINA_LABELPROPOST, -1, -1);
    PAN_SUBIMPEGFINA.SetFieldPanel(PFL_SUBIMPEGFINA_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
  }

  private void PAN_SUBIMPEGFINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_SUBIMPEGFINA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SUBIMPEGFINA.SetIMDB(IMDB, "PQRY_ESESUBFIN", true);
    PAN_SUBIMPEGFINA.set_SetString(MyGlb.MASTER_ROWNAME, "ESESUB FIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as ESEFIRIBIPEG, ");
    SQL.append("  TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ) as ESESUFINIMPE, ");
    SQL.append("  TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP ) as ESEFINSUBIMP, ");
    SQL.append("  A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES as ESESUFINIMPO, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL ) as ESESUFINDELI, ");
    SQL.append("  B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA ) as ESESUFINPROP, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  B.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  B.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  B.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  B.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  B.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  B.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  B.NUMERO_PROPOSTA as NUMERO_PROPOSTA ");
    PAN_SUBIMPEGFINA.SetQuery(PPQRY_ESESUBFIN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESESUB_FIN A, ");
    SQL.append("  SUBIMP B, ");
    SQL.append("  BEN C ");
    PAN_SUBIMPEGFINA.SetQuery(PPQRY_ESESUBFIN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.BENEFICIARIO = C.CODICE(+)) ");
    SQL.append("and   (A.ANNO_SUBIMP = B.ANNO_SUBIMP) ");
    SQL.append("and   (A.NUMERO_SUBIMP = B.NUMERO_SUBIMP) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~TBL_PARAMETRI43.PARAMFINANZI~~) ");
    PAN_SUBIMPEGFINA.SetQuery(PPQRY_ESESUBFIN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SUBIMPEGFINA.SetQuery(PPQRY_ESESUBFIN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SUBIMPEGFINA.SetQuery(PPQRY_ESESUBFIN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP ");
    PAN_SUBIMPEGFINA.SetQuery(PPQRY_ESESUBFIN, 5, SQL, -1, "");
    PAN_SUBIMPEGFINA.SetQueryDB(PPQRY_ESESUBFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGFINA.SetMasterTable(0, "ESESUB_FIN");
    PAN_SUBIMPEGFINA.AddToSortList(PFL_SUBIMPEGFINA_CAPITOLO, true);
    PAN_SUBIMPEGFINA.AddToSortList(PFL_SUBIMPEGFINA_ARTICOLO, true);
    PAN_SUBIMPEGFINA.AddToSortList(PFL_SUBIMPEGFINA_ANNOIMP, true);
    PAN_SUBIMPEGFINA.AddToSortList(PFL_SUBIMPEGFINA_NUMEROIMP, true);
    PAN_SUBIMPEGFINA.AddToSortList(PFL_SUBIMPEGFINA_ANNOSUBIMP, true);
    PAN_SUBIMPEGFINA.AddToSortList(PFL_SUBIMPEGFINA_NUMEROSUBIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SUBIMPEGFINA.Status() == 2)
    {
      int oldListQBE = PAN_SUBIMPEGFINA.iUseListQBE;
      PAN_SUBIMPEGFINA.iUseListQBE = 0;
      PAN_SUBIMPEGFINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_SUBIMPEGFINA.PanelCommand(Glb.PCM_FIND);
      PAN_SUBIMPEGFINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SUBIMPEGFINA) PAN_SUBIMPEGFINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBIMPEGFINA) PAN_SUBIMPEGFINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SUBIMPEGFINA) PAN_SUBIMPEGFINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBIMPEGFINA) PAN_SUBIMPEGFINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SUBIMPEGFINA) PAN_SUBIMPEGFINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
