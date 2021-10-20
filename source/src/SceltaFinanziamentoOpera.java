// **********************************************
// Scelta Finanziamento Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaFinanziamentoOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELFINAOPER_CODICEFINANZ = 0;
  private static int PFL_SCELFINAOPER_DESCRIFINANZ = 1;
  private static int PFL_SCELFINAOPER_CODICEOPERA = 2;
  private static int PFL_SCELFINAOPER_DESCRIZOPERA = 3;
  private static int PFL_SCELFINAOPER_FINANZILABEL = 4;
  private static int PFL_SCELFINAOPER_OPERALABEL = 5;

  private static int PPQRY_BILFIN2 = 0;


  IDPanel PAN_SCELFINAOPER;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI322(IMDB);
    //
    //
    Init_PQRY_BILFIN2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI322(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI322, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI322, "TBL_PARAMETRI322");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI322,IMDBDef1.FLD_PARAMETRI322_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI322,IMDBDef1.FLD_PARAMETRI322_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI322,IMDBDef1.FLD_PARAMETRI322_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI322,IMDBDef1.FLD_PARAMETRI322_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI322,IMDBDef1.FLD_PARAMETRI322_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI322,IMDBDef1.FLD_PARAMETRI322_PARAMARTICOL,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI322, 0);
  }

  private static void Init_PQRY_BILFIN2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_BILFIN2, 4);
    IMDB.set_TblCode(IMDBDef7.PQRY_BILFIN2, "PQRY_BILFIN2");
    IMDB.set_FldCode(IMDBDef7.PQRY_BILFIN2,IMDBDef7.PQSL_BILFIN2_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_BILFIN2,IMDBDef7.PQSL_BILFIN2_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BILFIN2,IMDBDef7.PQSL_BILFIN2_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef7.PQRY_BILFIN2,IMDBDef7.PQSL_BILFIN2_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BILFIN2,IMDBDef7.PQSL_BILFIN2_BILFINDESFIN, "BILFINDESFIN");
    IMDB.SetFldParams(IMDBDef7.PQRY_BILFIN2,IMDBDef7.PQSL_BILFIN2_BILFINDESFIN,5,200,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_BILFIN2,IMDBDef7.PQSL_BILFIN2_BILFINDESOPE, "BILFINDESOPE");
    IMDB.SetFldParams(IMDBDef7.PQRY_BILFIN2,IMDBDef7.PQSL_BILFIN2_BILFINDESOPE,5,200,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_BILFIN2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaFinanziamentoOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaFinanziamentoOpera()
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
    FormIdx = MyGlb.FRM_SCELFINAOPER;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "09C5B3A4-09F7-4B5D-A186-4FB8C2FB5D1E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 656;
    DesignHeight = 370;
    set_Caption(new IDVariant("Scelta Finanziamento Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 656;
    Frames[1].Height = 344;
    Frames[1].Caption = "Scelta Finanziamento Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_SCELFINAOPER = new IDPanel(w, this, 1, "PAN_SCELFINAOPER");
    Frames[1].Content = PAN_SCELFINAOPER;
    PAN_SCELFINAOPER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELFINAOPER.VS = MainFrm.VisualStyleList;
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 656-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELFINAOPER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "35371850-1C87-4CFB-B1E1-72A7F2077505");
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 600, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELFINAOPER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELFINAOPER.InitStatus = 1;
    PAN_SCELFINAOPER_Init();
    PAN_SCELFINAOPER_InitFields();
    PAN_SCELFINAOPER_InitQueries();
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
      PAN_SCELFINAOPER.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaFinanziamentoOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaFinanziamentoOpera.class.getName() : (Glb.ClassWithPackage(SceltaFinanziamentoOpera.class) ? SceltaFinanziamentoOpera.class.getName().substring(SceltaFinanziamentoOpera.class.getPackage().getName().length() + 1) : SceltaFinanziamentoOpera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Finanziamento Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELFINAOPER_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELFINAOPER);
      // 
      // Scelta Finanziamento Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SCELFINAOPER.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELFINAOPER_DESCRIFINANZ,(new IDVariant(PAN_SCELFINAOPER.FieldText(PFL_SCELFINAOPER_DESCRIFINANZ))).stringValue()); 
      PAN_SCELFINAOPER.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELFINAOPER_DESCRIZOPERA,(new IDVariant(PAN_SCELFINAOPER.FieldText(PFL_SCELFINAOPER_DESCRIZOPERA))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaFinanziamentoOpera", "SceltaFinanziamentoOperaOnDynamicPropertiesEvent", _e);
    }
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
  private void PAN_SCELFINAOPER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELFINAOPER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELFINAOPER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELFINAOPER, Cancel);
    // Stub
  }

  private void PAN_SCELFINAOPER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELFINAOPER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELFINAOPER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELFINAOPER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELFINAOPER_Init()
  {

    PAN_SCELFINAOPER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELFINAOPER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELFINAOPER.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_SCELFINAOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, "2619BCD5-45C6-4049-ADEE-77C8D8078BC2");
    PAN_SCELFINAOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, "Codice Finanziamento");
    PAN_SCELFINAOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, "");
    PAN_SCELFINAOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELFINAOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELFINAOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, "77B1BB52-CEAD-457E-8AAB-DF8BC42E96F9");
    PAN_SCELFINAOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_SCELFINAOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, "");
    PAN_SCELFINAOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELFINAOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_SCELFINAOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, "9496F7B2-49CF-41D5-9FB5-6086C56BF1CA");
    PAN_SCELFINAOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, "Codice Opera");
    PAN_SCELFINAOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, "");
    PAN_SCELFINAOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELFINAOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELFINAOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, "B8B977BC-612A-408C-BE1A-CBFC4B68B414");
    PAN_SCELFINAOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, "Descrizione Opera");
    PAN_SCELFINAOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, "");
    PAN_SCELFINAOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELFINAOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_SCELFINAOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, "00727BE7-F20B-47E6-9A70-DE5E209FD61E");
    PAN_SCELFINAOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, "Finanziamento");
    PAN_SCELFINAOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELFINAOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELFINAOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, "5B9B36EE-6D4F-49DF-A794-6C217DE44109");
    PAN_SCELFINAOPER.set_Header(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, "Opera");
    PAN_SCELFINAOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELFINAOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_SCELFINAOPER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, MyGlb.PANEL_LIST, 92);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_SCELFINAOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, MyGlb.PANEL_LIST, "Cod. Finan.");
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, MyGlb.PANEL_FORM, 92);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_SCELFINAOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEFINANZ, MyGlb.PANEL_FORM, "Cod. Finanz.");
    PAN_SCELFINAOPER.SetFieldPage(PFL_SCELFINAOPER_CODICEFINANZ, -1, -1);
    PAN_SCELFINAOPER.SetFieldPanel(PFL_SCELFINAOPER_CODICEFINANZ, PPQRY_BILFIN2, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, MyGlb.PANEL_LIST, 44, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, MyGlb.PANEL_LIST, 76);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_SCELFINAOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, MyGlb.PANEL_LIST, "Descrizione Finanziamento");
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, MyGlb.PANEL_FORM, 4, 52, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, MyGlb.PANEL_FORM, 76);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, MyGlb.PANEL_FORM, 2);
    PAN_SCELFINAOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIFINANZ, MyGlb.PANEL_FORM, "Descr. Finanz.");
    PAN_SCELFINAOPER.SetFieldPage(PFL_SCELFINAOPER_DESCRIFINANZ, -1, -1);
    PAN_SCELFINAOPER.SetFieldPanel(PFL_SCELFINAOPER_DESCRIFINANZ, PPQRY_BILFIN2, "B.DESCRIZIONE", "BILFINDESFIN", 5, 200, 0, -13997);
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, MyGlb.PANEL_LIST, 300, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, MyGlb.PANEL_LIST, 44);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, MyGlb.PANEL_LIST, 1);
    PAN_SCELFINAOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, MyGlb.PANEL_LIST, "Codice Opera");
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, MyGlb.PANEL_FORM, 4, 28, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, MyGlb.PANEL_FORM, 44);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, MyGlb.PANEL_FORM, 1);
    PAN_SCELFINAOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_CODICEOPERA, MyGlb.PANEL_FORM, "Cd. Op.");
    PAN_SCELFINAOPER.SetFieldPage(PFL_SCELFINAOPER_CODICEOPERA, -1, -1);
    PAN_SCELFINAOPER.SetFieldPanel(PFL_SCELFINAOPER_CODICEOPERA, PPQRY_BILFIN2, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, 344, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, 76);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, 1);
    PAN_SCELFINAOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, "Descrizione Opera");
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, 4, 88, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, 76);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, 2);
    PAN_SCELFINAOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, "Descrizione Opera");
    PAN_SCELFINAOPER.SetFieldPage(PFL_SCELFINAOPER_DESCRIZOPERA, -1, -1);
    PAN_SCELFINAOPER.SetFieldPanel(PFL_SCELFINAOPER_DESCRIZOPERA, PPQRY_BILFIN2, "C.DESCRIZIONE", "BILFINDESOPE", 5, 200, 0, -13997);
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, MyGlb.PANEL_LIST, 0, 0, 300, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, MyGlb.PANEL_LIST, 0);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, MyGlb.PANEL_LIST, 2);
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, MyGlb.PANEL_FORM, 4, 0, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, MyGlb.PANEL_FORM, 0);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_FINANZILABEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELFINAOPER.SetFieldPage(PFL_SCELFINAOPER_FINANZILABEL, -1, -1);
    PAN_SCELFINAOPER.SetFieldPanel(PFL_SCELFINAOPER_FINANZILABEL, -1, "", "FINANZILABEL", 0, 0, 0, -13997);
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, MyGlb.PANEL_LIST, 300, 0, 300, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, MyGlb.PANEL_LIST, 0);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, MyGlb.PANEL_LIST, 2);
    PAN_SCELFINAOPER.SetRect(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, MyGlb.PANEL_FORM, 12, 8, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELFINAOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, MyGlb.PANEL_FORM, 0);
    PAN_SCELFINAOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELFINAOPER_OPERALABEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELFINAOPER.SetFieldPage(PFL_SCELFINAOPER_OPERALABEL, -1, -1);
    PAN_SCELFINAOPER.SetFieldPanel(PFL_SCELFINAOPER_OPERALABEL, -1, "", "OPERALABEL", 0, 0, 0, -13997);
  }

  private void PAN_SCELFINAOPER_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELFINAOPER.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELFINAOPER.SetIMDB(IMDB, "PQRY_BILFIN2", true);
    PAN_SCELFINAOPER.set_SetString(MyGlb.MASTER_ROWNAME, "BIL FIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  B.DESCRIZIONE as BILFINDESFIN, ");
    SQL.append("  C.DESCRIZIONE as BILFINDESOPE ");
    PAN_SCELFINAOPER.SetQuery(PPQRY_BILFIN2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    PAN_SCELFINAOPER.SetQuery(PPQRY_BILFIN2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI322.PARAENTRSPES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI322.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI322.PARAMARTICOL~~) ");
    SQL.append("and   (B.CODICE(+) = A.FINANZIAMENTO) ");
    SQL.append("and   (C.CODICE(+) = A.OPERA) ");
    SQL.append("and   ((B.SCADENZA IS NULL) OR B.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SCELFINAOPER.SetQuery(PPQRY_BILFIN2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELFINAOPER.SetQuery(PPQRY_BILFIN2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELFINAOPER.SetQuery(PPQRY_BILFIN2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO, ");
    SQL.append("  A.OPERA ");
    PAN_SCELFINAOPER.SetQuery(PPQRY_BILFIN2, 5, SQL, -1, "");
    PAN_SCELFINAOPER.SetQueryDB(PPQRY_BILFIN2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELFINAOPER.SetMasterTable(0, "BIL_FIN");
    PAN_SCELFINAOPER.AddToSortList(PFL_SCELFINAOPER_CODICEFINANZ, true);
    PAN_SCELFINAOPER.AddToSortList(PFL_SCELFINAOPER_CODICEOPERA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELFINAOPER.Status() == 2)
    {
      int oldListQBE = PAN_SCELFINAOPER.iUseListQBE;
      PAN_SCELFINAOPER.iUseListQBE = 0;
      PAN_SCELFINAOPER.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELFINAOPER.PanelCommand(Glb.PCM_FIND);
      PAN_SCELFINAOPER.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELFINAOPER) PAN_SCELFINAOPER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELFINAOPER) PAN_SCELFINAOPER_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELFINAOPER) PAN_SCELFINAOPER_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELFINAOPER) PAN_SCELFINAOPER_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELFINAOPER) PAN_SCELFINAOPER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
