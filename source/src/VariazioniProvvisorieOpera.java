// **********************************************
// Variazioni Provvisorie Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniProvvisorieOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIPROVOPER_CAPITOLO = 0;
  private static int PFL_VARIPROVOPER_ARTICOLO = 1;
  private static int PFL_VARIPROVOPER_IMPORTO = 2;
  private static int PFL_VARIPROVOPER_FINANZIAMEN1 = 3;
  private static int PFL_VARIPROVOPER_DESCRIZIONE = 4;
  private static int PFL_VARIPROVOPER_DATA = 5;
  private static int PFL_VARIPROVOPER_UNITAPROPONE = 6;
  private static int PFL_VARIPROVOPER_NUMEROPROPOS = 7;
  private static int PFL_VARIPROVOPER_ANNOPROPOSTA = 8;
  private static int PFL_VARIPROVOPER_PROGETTO = 9;
  private static int PFL_VARIPROVOPER_LABELCAPITOL = 10;
  private static int PFL_VARIPROVOPER_LABELFINANZI = 11;
  private static int PFL_VARIPROVOPER_LABELPROPOST = 12;
  private static int PFL_VARIPROVOPER_RIFBILANCPEG = 13;
  private static int PFL_VARIPROVOPER_FINANZIAMENT = 14;
  private static int PFL_VARIPROVOPER_PROPOSTA = 15;

  private static int PPQRY_VARCOMPRO4 = 0;


  IDPanel PAN_VARIPROVOPER;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI27(IMDB);
    //
    //
    Init_PQRY_VARCOMPRO4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI27(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI27, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI27, "TBL_PARAMETRI27");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI27,IMDBDef1.FLD_PARAMETRI27_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI27,IMDBDef1.FLD_PARAMETRI27_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI27,IMDBDef1.FLD_PARAMETRI27_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI27,IMDBDef1.FLD_PARAMETRI27_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI27,IMDBDef1.FLD_PARAMETRI27_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI27,IMDBDef1.FLD_PARAMETRI27_PARAMTIPO,5,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI27, 0);
  }

  private static void Init_PQRY_VARCOMPRO4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VARCOMPRO4, 13);
    IMDB.set_TblCode(IMDBDef8.PQRY_VARCOMPRO4, "PQRY_VARCOMPRO4");
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_VARRIFBILPEG, "VARRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_VARRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_VARCOMFINANZ, "VARCOMFINANZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_VARCOMFINANZ,5,302,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_VARCOMPROPOS, "VARCOMPROPOS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_VARCOMPROPOS,5,459,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOMPRO4,IMDBDef8.PQSL_VARCOMPRO4_FINANZIAMENTO,1,5,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VARCOMPRO4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniProvvisorieOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniProvvisorieOpera()
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
    FormIdx = MyGlb.FRM_VARIPROVOPER;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B5564170-BB42-4584-B8DA-F3E49D36A28F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 948;
    DesignHeight = 386;
    set_Caption(new IDVariant("Variazioni Provvisorie Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 948;
    Frames[1].Height = 360;
    Frames[1].Caption = "Variazioni Provvisorie Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_VARIPROVOPER = new IDPanel(w, this, 1, "PAN_VARIPROVOPER");
    Frames[1].Content = PAN_VARIPROVOPER;
    PAN_VARIPROVOPER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIPROVOPER.VS = MainFrm.VisualStyleList;
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 948-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CD475593-32AC-445D-AA38-E15ACD06A41A");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 880, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIPROVOPER.InitStatus = 2;
    PAN_VARIPROVOPER_Init();
    PAN_VARIPROVOPER_InitFields();
    PAN_VARIPROVOPER_InitQueries();
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
      PAN_VARIPROVOPER.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniProvvisorieOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniProvvisorieOpera.class.getName() : (Glb.ClassWithPackage(VariazioniProvvisorieOpera.class) ? VariazioniProvvisorieOpera.class.getName().substring(VariazioniProvvisorieOpera.class.getPackage().getName().length() + 1) : VariazioniProvvisorieOpera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni Provvisorie Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIPROVOPER_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIPROVOPER);
      // 
      // Variazioni Provvisorie Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VARIPROVOPER.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIPROVOPER_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_VARCOMPRO4, IMDBDef8.PQSL_VARCOMPRO4_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniProvvisorieOpera", "VariazioniProvvisorieOperaOnDynamicPropertiesEvent", _e);
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
      Frames[PAN_VARIPROVOPER.FrIndex].set_Caption(IDL.Add(IDL.Add((new IDVariant(Frames[PAN_VARIPROVOPER.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), (new IDVariant(" "))))), IMDB.Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMTIPO, 0)).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMTIPO, 0), MainFrm.ESERCIZIO))))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniProvvisorieOpera", "LoadEvent", _e);
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
  private void PAN_VARIPROVOPER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIPROVOPER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIPROVOPER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIPROVOPER, Cancel);
    // Stub
  }

  private void PAN_VARIPROVOPER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VARIPROVOPER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIPROVOPER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIPROVOPER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIPROVOPER_Init()
  {

    PAN_VARIPROVOPER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIPROVOPER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIPROVOPER.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, "276F7D31-FA61-42D2-8C44-021C84502A36");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, "CAPITOLO");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, "51982C92-B2F1-4E46-9A24-93CEC0CD2D31");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, "ARTICOLO");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, "5ED52C5F-521C-4748-8B5D-7E3692486A92");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, "Importo");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, "0C06AF68-FF15-40B6-A560-854A22F2ADA6");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, "FINANZIAMENTO");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, "A47352DF-20FE-4B09-A552-6377E33E49A3");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, "DESCRIZIONE");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, "9250A702-457D-4C65-9CAE-0CC54825479E");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, "Data");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, "67053D8C-FDCF-4ECA-97B9-909E9BC4EE53");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, "B7167316-7499-42F2-B187-E615A80F55D4");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, "2B833BFC-41A5-4418-90B0-5211FDBA538B");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, "94C1AD6C-360E-4DAE-BCE4-E767DD6497F3");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, "Obiettivo Operativo");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, "407A8015-2B2E-4226-B3B9-5A7F2A638E2F");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, "Capitolo/Art.");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, "BE601DD2-94A6-4C89-80A0-12450CCEDC91");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, "Finanziamento");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, "29C258F3-2B57-43A0-B7B7-A6FD3ED20A6B");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, "Proposta");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, "36A2F368-BC36-494A-90B1-CEED5B2C1366");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, "To String (VARCOMPRO CAPITOLO) + \" / \" + To String (VARCOMPRO ARTICOLO)");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, "A12F705F-F0B5-4AF6-B230-200ECCD12FA6");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, "Finanziamento");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIPROVOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, "D47223F1-4336-4037-89A9-4E5C480927AF");
    PAN_VARIPROVOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, "Proposta");
    PAN_VARIPROVOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, "");
    PAN_VARIPROVOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIPROVOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIPROVOPER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, MyGlb.PANEL_FORM, 4, 544, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_CAPITOLO, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_CAPITOLO, PPQRY_VARCOMPRO4, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, MyGlb.PANEL_LIST, 96, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, MyGlb.PANEL_FORM, 4, 568, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_ARTICOLO, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_ARTICOLO, PPQRY_VARCOMPRO4, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, MyGlb.PANEL_LIST, 120, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, MyGlb.PANEL_FORM, 4, 352, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_IMPORTO, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_IMPORTO, PPQRY_VARCOMPRO4, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, MyGlb.PANEL_LIST, 224, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, MyGlb.PANEL_LIST, 92);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, MyGlb.PANEL_LIST, "FINAN.");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 592, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, MyGlb.PANEL_FORM, 92);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMEN1, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_FINANZIAMEN1, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_FINANZIAMEN1, PPQRY_VARCOMPRO4, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 268, 36, 284, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 616, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCR.");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_DESCRIZIONE, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_DESCRIZIONE, PPQRY_VARCOMPRO4, "B.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, MyGlb.PANEL_LIST, 552, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, MyGlb.PANEL_LIST, 68);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, MyGlb.PANEL_FORM, 4, 424, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, MyGlb.PANEL_FORM, 68);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_DATA, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_DATA, PPQRY_VARCOMPRO4, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, MyGlb.PANEL_LIST, 624, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 652, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_UNITAPROPONE, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_UNITAPROPONE, PPQRY_VARCOMPRO4, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, MyGlb.PANEL_LIST, 732, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 676, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_NUMEROPROPOS, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_NUMEROPROPOS, PPQRY_VARCOMPRO4, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, MyGlb.PANEL_LIST, 772, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 700, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_ANNOPROPOSTA, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_ANNOPROPOSTA, PPQRY_VARCOMPRO4, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, MyGlb.PANEL_LIST, 808, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, MyGlb.PANEL_FORM, 4, 496, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_PROGETTO, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_PROGETTO, PPQRY_VARCOMPRO4, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_LABELCAPITOL, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, MyGlb.PANEL_LIST, 224, 0, 328, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, MyGlb.PANEL_LIST, 0);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, MyGlb.PANEL_FORM, 8, 8, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, MyGlb.PANEL_FORM, 0);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELFINANZI, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_LABELFINANZI, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_LABELFINANZI, -1, "", "LABELFINANZI", 0, 0, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, MyGlb.PANEL_LIST, 624, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, MyGlb.PANEL_FORM, 16, 16, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_LABELPROPOST, -1, -1);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 724, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_RIFBILANCPEG, -1, -1);
    PAN_VARIPROVOPER.SetFieldUnbound(PFL_VARIPROVOPER_RIFBILANCPEG, true);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_RIFBILANCPEG, PPQRY_VARCOMPRO4, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "VARRIFBILPEG", 5, 201, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 724, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, MyGlb.PANEL_FORM, 80);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_FINANZIAMENT, -1, -1);
    PAN_VARIPROVOPER.SetFieldUnbound(PFL_VARIPROVOPER_FINANZIAMENT, true);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_FINANZIAMENT, PPQRY_VARCOMPRO4, "TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE", "VARCOMFINANZ", 5, 302, 0, -13997);
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIPROVOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, MyGlb.PANEL_FORM, 4, 724, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIPROVOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_VARIPROVOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_VARIPROVOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIPROVOPER_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_VARIPROVOPER.SetFieldPage(PFL_VARIPROVOPER_PROPOSTA, -1, -1);
    PAN_VARIPROVOPER.SetFieldUnbound(PFL_VARIPROVOPER_PROPOSTA, true);
    PAN_VARIPROVOPER.SetFieldPanel(PFL_VARIPROVOPER_PROPOSTA, PPQRY_VARCOMPRO4, "A.UNITA_PROPONENTE || ' - ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( A.ANNO_PROPOSTA )", "VARCOMPROPOS", 5, 459, 0, -13997);
  }

  private void PAN_VARIPROVOPER_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIPROVOPER.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIPROVOPER.SetIMDB(IMDB, "PQRY_VARCOMPRO4", true);
    PAN_VARIPROVOPER.set_SetString(MyGlb.MASTER_ROWNAME, "VARCOMPRO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as VARRIFBILPEG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE as VARCOMFINANZ, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.UNITA_PROPONENTE || ' - ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( A.ANNO_PROPOSTA ) as VARCOMPROPOS, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO ");
    PAN_VARIPROVOPER.SetQuery(PPQRY_VARCOMPRO4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOMPRO A, ");
    SQL.append("  FINANZIAMENTI B ");
    PAN_VARIPROVOPER.SetQuery(PPQRY_VARCOMPRO4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FINANZIAMENTO = B.CODICE(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.OPERA = ~~TBL_PARAMETRI27.PARAMOPERA~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI27.PARAMES~~) ");
    PAN_VARIPROVOPER.SetQuery(PPQRY_VARCOMPRO4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIPROVOPER.SetQuery(PPQRY_VARCOMPRO4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIPROVOPER.SetQuery(PPQRY_VARCOMPRO4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.D_DATA_REG, ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_VARIPROVOPER.SetQuery(PPQRY_VARCOMPRO4, 5, SQL, -1, "");
    PAN_VARIPROVOPER.SetQueryDB(PPQRY_VARCOMPRO4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIPROVOPER.SetMasterTable(0, "VARCOMPRO");
    PAN_VARIPROVOPER.AddToSortList(PFL_VARIPROVOPER_CAPITOLO, true);
    PAN_VARIPROVOPER.AddToSortList(PFL_VARIPROVOPER_ARTICOLO, true);
    PAN_VARIPROVOPER.AddToSortList(PFL_VARIPROVOPER_DATA, true);
    PAN_VARIPROVOPER.AddToSortList(PFL_VARIPROVOPER_FINANZIAMEN1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIPROVOPER.Status() == 2)
    {
      int oldListQBE = PAN_VARIPROVOPER.iUseListQBE;
      PAN_VARIPROVOPER.iUseListQBE = 0;
      PAN_VARIPROVOPER.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIPROVOPER.PanelCommand(Glb.PCM_FIND);
      PAN_VARIPROVOPER.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIPROVOPER) PAN_VARIPROVOPER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIPROVOPER) PAN_VARIPROVOPER_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIPROVOPER) PAN_VARIPROVOPER_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIPROVOPER) PAN_VARIPROVOPER_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIPROVOPER) PAN_VARIPROVOPER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
