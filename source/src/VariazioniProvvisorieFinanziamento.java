// **********************************************
// Variazioni Provvisorie Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniProvvisorieFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIPROVFINA_CAPITOLO = 0;
  private static int PFL_VARIPROVFINA_ARTICOLO = 1;
  private static int PFL_VARIPROVFINA_IMPORTO = 2;
  private static int PFL_VARIPROVFINA_OPERA1 = 3;
  private static int PFL_VARIPROVFINA_DESCRIZIONE = 4;
  private static int PFL_VARIPROVFINA_DATA = 5;
  private static int PFL_VARIPROVFINA_UNITAPROPONE = 6;
  private static int PFL_VARIPROVFINA_NUMEROPROPOS = 7;
  private static int PFL_VARIPROVFINA_ANNOPROPOSTA = 8;
  private static int PFL_VARIPROVFINA_PROGETTO = 9;
  private static int PFL_VARIPROVFINA_LABELCAPITOL = 10;
  private static int PFL_VARIPROVFINA_LABELOPERA = 11;
  private static int PFL_VARIPROVFINA_LABELPROPOST = 12;
  private static int PFL_VARIPROVFINA_RIFBILANCPEG = 13;
  private static int PFL_VARIPROVFINA_OPERA = 14;
  private static int PFL_VARIPROVFINA_PROPOSTA = 15;

  private static int PPQRY_VARCOMPRO2 = 0;


  IDPanel PAN_VARIPROVFINA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI41(IMDB);
    //
    //
    Init_PQRY_VARCOMPRO2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI41(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI41, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI41, "TBL_PARAMETRI41");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI41,IMDBDef1.FLD_PARAMETRI41_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI41,IMDBDef1.FLD_PARAMETRI41_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI41,IMDBDef1.FLD_PARAMETRI41_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI41,IMDBDef1.FLD_PARAMETRI41_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI41,IMDBDef1.FLD_PARAMETRI41_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI41,IMDBDef1.FLD_PARAMETRI41_PARAMTIPO,5,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI41, 0);
  }

  private static void Init_PQRY_VARCOMPRO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VARCOMPRO2, 13);
    IMDB.set_TblCode(IMDBDef8.PQRY_VARCOMPRO2, "PQRY_VARCOMPRO2");
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_VARRIFBILPEG, "VARRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_VARRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_VARCOMPOPERA, "VARCOMPOPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_VARCOMPOPERA,5,302,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_VARCOMPROPOS, "VARCOMPROPOS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_VARCOMPROPOS,5,459,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO2,IMDBDef8.PQSL_VARCOMPRO2_OPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VARCOMPRO2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniProvvisorieFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniProvvisorieFinanziamento()
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
    FormIdx = MyGlb.FRM_VARIPROVFINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4EDD4E60-E664-49CF-B907-A8AD27397A1E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 410;
    set_Caption(new IDVariant("Variazioni Provvisorie Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 384;
    Frames[1].Caption = "Variazioni Provvisorie Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 384;
    PAN_VARIPROVFINA = new IDPanel(w, this, 1, "PAN_VARIPROVFINA");
    Frames[1].Content = PAN_VARIPROVFINA;
    PAN_VARIPROVFINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIPROVFINA.VS = MainFrm.VisualStyleList;
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5A4B14D2-F802-404C-B989-1B708A6637BD");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 880, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIPROVFINA.InitStatus = 2;
    PAN_VARIPROVFINA_Init();
    PAN_VARIPROVFINA_InitFields();
    PAN_VARIPROVFINA_InitQueries();
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
      PAN_VARIPROVFINA.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniProvvisorieFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniProvvisorieFinanziamento.class.getName() : (Glb.ClassWithPackage(VariazioniProvvisorieFinanziamento.class) ? VariazioniProvvisorieFinanziamento.class.getName().substring(VariazioniProvvisorieFinanziamento.class.getPackage().getName().length() + 1) : VariazioniProvvisorieFinanziamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni Provvisorie Finanziamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIPROVFINA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIPROVFINA);
      // 
      // Variazioni Provvisorie Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VARIPROVFINA.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIPROVFINA_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_VARCOMPRO2, IMDBDef8.PQSL_VARCOMPRO2_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniProvvisorieFinanziamento", "VariazioniProvvisorieFinanziamentoOnDynamicPropertiesEvent", _e);
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
      Frames[PAN_VARIPROVFINA.FrIndex].set_Caption(IDL.Add(IDL.Add((new IDVariant(Frames[PAN_VARIPROVFINA.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), (new IDVariant(" "))))), IMDB.Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMTIPO, 0)).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMTIPO, 0), MainFrm.ESERCIZIO))))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniProvvisorieFinanziamento", "LoadEvent", _e);
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
  private void PAN_VARIPROVFINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIPROVFINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIPROVFINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIPROVFINA, Cancel);
    // Stub
  }

  private void PAN_VARIPROVFINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VARIPROVFINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIPROVFINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIPROVFINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIPROVFINA_Init()
  {

    PAN_VARIPROVFINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIPROVFINA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIPROVFINA.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, "FAA2A0B7-077F-4DE0-9707-238B0B772523");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, "CAPITOLO");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, "8C5A2D4B-BAB0-4E94-8DFA-2FB14685A8BF");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, "ARTICOLO");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, "29FBC035-9DBA-45E3-9059-3257F27BEB1F");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, "Importo");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, "0FD8A4A4-2BE1-4077-A43B-69954537645F");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, "OPERA");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, "54A6D0BF-53DB-4F68-A7E3-A46EF8E590AF");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, "DESCRIZIONE");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, "5ADCE3A0-9C37-4446-BA9D-3523D963DDA4");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, "Data");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, "41051611-978F-49A3-8DB8-EBA5ED0E3EDE");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, "0C9BA4E4-ECBE-43AF-9C2E-665F169C1A78");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, "F69FF573-53D9-4440-9112-BB5F7113FA86");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, "AD31FDB1-2FA7-4521-8A2E-5FEF2202F9EC");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, "Obiettivo Operativo");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, "55B34BE1-8622-4B64-9FC2-DB46018BCA73");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, "Capitolo/Art.");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, "0A6446BE-672B-4019-BFEB-5FD21103530A");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, "Opera");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, "18E473D7-48D8-4F1A-BE92-6E962BBAFD5C");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, "Proposta");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, "CAC50D9D-4554-4A50-B9AE-868C98AD52EC");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, "To String (VARCOMPRO CAPITOLO) + \" / \" + To String (VARCOMPRO ARTICOLO)");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, "8251FC56-0A80-45DB-9A55-7BCB42D09B83");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, "Opera");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, "CE6965C5-ED91-4D1D-8A67-D93BCDCCF80F");
    PAN_VARIPROVFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, "Proposta");
    PAN_VARIPROVFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, "");
    PAN_VARIPROVFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIPROVFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIPROVFINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, MyGlb.PANEL_FORM, 4, 544, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_CAPITOLO, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_CAPITOLO, PPQRY_VARCOMPRO2, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, MyGlb.PANEL_FORM, 4, 568, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_ARTICOLO, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_ARTICOLO, PPQRY_VARCOMPRO2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, MyGlb.PANEL_LIST, 136, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, MyGlb.PANEL_FORM, 4, 352, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_IMPORTO, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_IMPORTO, PPQRY_VARCOMPRO2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, MyGlb.PANEL_LIST, 244, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, MyGlb.PANEL_LIST, 44);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, MyGlb.PANEL_LIST, "OPERA");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, MyGlb.PANEL_FORM, 4, 592, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, MyGlb.PANEL_FORM, 44);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA1, MyGlb.PANEL_FORM, "OPERA");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_OPERA1, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_OPERA1, PPQRY_VARCOMPRO2, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, MyGlb.PANEL_LIST, 288, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 616, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCR.");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_DESCRIZIONE, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_DESCRIZIONE, PPQRY_VARCOMPRO2, "B.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, MyGlb.PANEL_LIST, 552, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, MyGlb.PANEL_LIST, 68);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, MyGlb.PANEL_FORM, 4, 424, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, MyGlb.PANEL_FORM, 68);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_DATA, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_DATA, PPQRY_VARCOMPRO2, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, MyGlb.PANEL_LIST, 628, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 652, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_UNITAPROPONE, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_UNITAPROPONE, PPQRY_VARCOMPRO2, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 676, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_NUMEROPROPOS, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_NUMEROPROPOS, PPQRY_VARCOMPRO2, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 700, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_ANNOPROPOSTA, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_ANNOPROPOSTA, PPQRY_VARCOMPRO2, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, MyGlb.PANEL_LIST, 812, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, MyGlb.PANEL_FORM, 4, 496, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_PROGETTO, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_PROGETTO, PPQRY_VARCOMPRO2, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_LABELCAPITOL, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, MyGlb.PANEL_LIST, 244, 0, 308, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, MyGlb.PANEL_LIST, 0);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, MyGlb.PANEL_FORM, 8, 8, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, MyGlb.PANEL_FORM, 0);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELOPERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_LABELOPERA, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_LABELOPERA, -1, "", "LABELOPERA", 0, 0, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, MyGlb.PANEL_LIST, 628, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, MyGlb.PANEL_FORM, 16, 16, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_LABELPROPOST, -1, -1);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 724, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_RIFBILANCPEG, -1, -1);
    PAN_VARIPROVFINA.SetFieldUnbound(PFL_VARIPROVFINA_RIFBILANCPEG, true);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_RIFBILANCPEG, PPQRY_VARCOMPRO2, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "VARRIFBILPEG", 5, 201, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, MyGlb.PANEL_LIST, 40);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, MyGlb.PANEL_FORM, 4, 724, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, MyGlb.PANEL_FORM, 40);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_OPERA, -1, -1);
    PAN_VARIPROVFINA.SetFieldUnbound(PFL_VARIPROVFINA_OPERA, true);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_OPERA, PPQRY_VARCOMPRO2, "TO_CHAR ( A.OPERA ) || ' - ' || B.DESCRIZIONE", "VARCOMPOPERA", 5, 302, 0, -13997);
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIPROVFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, MyGlb.PANEL_FORM, 4, 724, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_VARIPROVFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVFINA_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_VARIPROVFINA.SetFieldPage(PFL_VARIPROVFINA_PROPOSTA, -1, -1);
    PAN_VARIPROVFINA.SetFieldUnbound(PFL_VARIPROVFINA_PROPOSTA, true);
    PAN_VARIPROVFINA.SetFieldPanel(PFL_VARIPROVFINA_PROPOSTA, PPQRY_VARCOMPRO2, "A.UNITA_PROPONENTE || ' - ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( A.ANNO_PROPOSTA )", "VARCOMPROPOS", 5, 459, 0, -13997);
  }

  private void PAN_VARIPROVFINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIPROVFINA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIPROVFINA.SetIMDB(IMDB, "PQRY_VARCOMPRO2", true);
    PAN_VARIPROVFINA.set_SetString(MyGlb.MASTER_ROWNAME, "VARCOMPRO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as VARRIFBILPEG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || B.DESCRIZIONE as VARCOMPOPERA, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.UNITA_PROPONENTE || ' - ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( A.ANNO_PROPOSTA ) as VARCOMPROPOS, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.OPERA as OPERA ");
    PAN_VARIPROVFINA.SetQuery(PPQRY_VARCOMPRO2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOMPRO A, ");
    SQL.append("  OPERE B ");
    PAN_VARIPROVFINA.SetQuery(PPQRY_VARCOMPRO2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.OPERA = B.CODICE(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~TBL_PARAMETRI41.PARAMFINANZI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI41.PARAMES~~) ");
    PAN_VARIPROVFINA.SetQuery(PPQRY_VARCOMPRO2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIPROVFINA.SetQuery(PPQRY_VARCOMPRO2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIPROVFINA.SetQuery(PPQRY_VARCOMPRO2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.D_DATA_REG, ");
    SQL.append("  A.OPERA ");
    PAN_VARIPROVFINA.SetQuery(PPQRY_VARCOMPRO2, 5, SQL, -1, "");
    PAN_VARIPROVFINA.SetQueryDB(PPQRY_VARCOMPRO2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIPROVFINA.SetMasterTable(0, "VARCOMPRO");
    PAN_VARIPROVFINA.AddToSortList(PFL_VARIPROVFINA_CAPITOLO, true);
    PAN_VARIPROVFINA.AddToSortList(PFL_VARIPROVFINA_ARTICOLO, true);
    PAN_VARIPROVFINA.AddToSortList(PFL_VARIPROVFINA_DATA, true);
    PAN_VARIPROVFINA.AddToSortList(PFL_VARIPROVFINA_OPERA1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIPROVFINA.Status() == 2)
    {
      int oldListQBE = PAN_VARIPROVFINA.iUseListQBE;
      PAN_VARIPROVFINA.iUseListQBE = 0;
      PAN_VARIPROVFINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIPROVFINA.PanelCommand(Glb.PCM_FIND);
      PAN_VARIPROVFINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIPROVFINA) PAN_VARIPROVFINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIPROVFINA) PAN_VARIPROVFINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIPROVFINA) PAN_VARIPROVFINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIPROVFINA) PAN_VARIPROVFINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIPROVFINA) PAN_VARIPROVFINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
