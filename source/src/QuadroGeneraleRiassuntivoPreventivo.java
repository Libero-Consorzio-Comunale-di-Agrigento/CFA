// **********************************************
// Quadro Generale Riassuntivo Preventivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class QuadroGeneraleRiassuntivoPreventivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_QUADGENERIAS_DABILANSIMUL = 0;
  private static int PFL_QUADGENERIAS_DATA = 1;
  private static int PFL_QUADGENERIAS_ELABORA = 2;

  private static int PPQRY_PAR9 = 0;


  IDPanel PAN_QUADGENERIAS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR12(IMDB);
    //
    //
    Init_PQRY_PAR9(IMDB);
    Init_PQRY_PAR9_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR12, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR12, "TBL_PAR12");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR12,IMDBDef3.FLD_PAR12_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR12,IMDBDef3.FLD_PAR12_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR12,IMDBDef3.FLD_PAR12_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR12,IMDBDef3.FLD_PAR12_ROWNAMEDATA,6,14,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR12, 0);
  }

  private static void Init_PQRY_PAR9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PAR9, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PAR9, "PQRY_PAR9");
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR9,IMDBDef11.PQSL_PAR9_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR9,IMDBDef11.PQSL_PAR9_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR9,IMDBDef11.PQSL_PAR9_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR9,IMDBDef11.PQSL_PAR9_ROWNAMEDATA,6,14,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PAR9, 0);
  }

  private static void Init_PQRY_PAR9_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PAR9_RS, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PAR9_RS, "PQRY_PAR9_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR9_RS,IMDBDef11.PQSL_PAR9_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR9_RS,IMDBDef11.PQSL_PAR9_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR9_RS,IMDBDef11.PQSL_PAR9_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR9_RS,IMDBDef11.PQSL_PAR9_ROWNAMEDATA,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public QuadroGeneraleRiassuntivoPreventivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public QuadroGeneraleRiassuntivoPreventivo()
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
    FormIdx = MyGlb.FRM_QUAGENRIAPRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FCCEE078-75C2-4C02-88DC-E3AE5A3843CF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 284;
    DesignHeight = 190;
    set_Caption(new IDVariant("Quadro Generale Riassuntivo Preventivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 284;
    Frames[1].Height = 164;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Quadro Generale Riassuntivo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 164;
    PAN_QUADGENERIAS = new IDPanel(w, this, 1, "PAN_QUADGENERIAS");
    Frames[1].Content = PAN_QUADGENERIAS;
    PAN_QUADGENERIAS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUADGENERIAS.VS = MainFrm.VisualStyleList;
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 284-MyGlb.PAN_OFFS_X, 164-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "38338DBE-67B6-44C0-ADF2-CA60E43640D7");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 144, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUADGENERIAS.InitStatus = 2;
    PAN_QUADGENERIAS_Init();
    PAN_QUADGENERIAS_InitFields();
    PAN_QUADGENERIAS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR12, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        QUAGENRIAPRE_PAR9();
      }
      PAN_QUADGENERIAS.UpdatePanel(MainFrm);
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
    return (obj instanceof QuadroGeneraleRiassuntivoPreventivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? QuadroGeneraleRiassuntivoPreventivo.class.getName() : (Glb.ClassWithPackage(QuadroGeneraleRiassuntivoPreventivo.class) ? QuadroGeneraleRiassuntivoPreventivo.class.getName().substring(QuadroGeneraleRiassuntivoPreventivo.class.getPackage().getName().length() + 1) : QuadroGeneraleRiassuntivoPreventivo.class.getName()));
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
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DW = (new IDVariant("d_bil_qgen_rdiff", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_PAR9, IMDBDef11.PQSL_PAR9_ROWNAMDABISI, 0));
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PAR9, IMDBDef11.PQSL_PAR9_ROWNAMEDATA, 0)));
      MainFrm.SetParametroStampa((new IDVariant("NO")));
      MainFrm.SetParametroStampa(IDL.ToString((new IDVariant(0))));
      MainFrm.SetParametroStampa((new IDVariant("E")));
      MainFrm.SetParametroStampa(IDL.ToString(((MainFrm.FINANZIAMENT.booleanValue())?(new IDVariant(1)):(new IDVariant(0)))));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoPreventivo", "Elabora", _e);
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Quadro Generale Riassuntivo", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAP, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PAR12, IMDBDef3.FLD_PAR12_ROWNAMDABISI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PAR12, IMDBDef3.FLD_PAR12_ROWNAMEDATA, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoPreventivo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void QUAGENRIAPRE_PAR9() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PAR9_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR12, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR12, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PAR9_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PAR9_RS, 0, IMDBDef3.TBL_PAR12, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR9_RS, 0, 0, IMDBDef3.TBL_PAR12, IMDBDef3.FLD_PAR12_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR9_RS, 1, 0, IMDBDef3.TBL_PAR12, IMDBDef3.FLD_PAR12_ROWNAMEDATA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR12, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR12, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR12, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PAR9_RS, 0);
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
  private void PAN_QUADGENERIAS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_QUADGENERIAS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUADGENERIAS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUADGENERIAS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUADGENERIAS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_QUADGENERIAS);
    // Stub
  }

  private void PAN_QUADGENERIAS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_QUADGENERIAS_ELABORA)
    {
      this.IdxPanelActived = this.PAN_QUADGENERIAS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_QUADGENERIAS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_QUADGENERIAS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_QUADGENERIAS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_QUADGENERIAS_Init()
  {

    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, "A2D84369-AAF6-4CBA-B6BD-874FA890AD5D");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, "0F257D45-F860-4FFA-8770-B06165AA1DE3");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, "Data  ");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, "03286590-07F3-46AF-8708-68B4553B6747");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, "Elabora");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_QUADGENERIAS.SetImage(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, 0, "button1.gif", false);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_QUADGENERIAS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, MyGlb.PANEL_FORM, 60, 16, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, MyGlb.PANEL_FORM, 132);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_DABILANSIMUL, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_DABILANSIMUL, PPQRY_PAR9, "A.ROWNAMDABISI", "ROWNAMDABISI", 5, 1, 0, -13997);
    PAN_QUADGENERIAS.SetValueListItem(PFL_QUADGENERIAS_DABILANSIMUL, (new IDVariant("S")), "S", "", "", -1);
    PAN_QUADGENERIAS.SetValueListItem(PFL_QUADGENERIAS_DABILANSIMUL, (new IDVariant("E")), "E", "", "", -1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, MyGlb.PANEL_LIST, 40, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, MyGlb.PANEL_LIST, 32);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, MyGlb.PANEL_LIST, "Data  ");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, MyGlb.PANEL_FORM, 48, 44, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, MyGlb.PANEL_FORM, 84);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_DATA, MyGlb.PANEL_FORM, "Data  ");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_DATA, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_DATA, PPQRY_PAR9, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 14, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_LIST, 68, 76, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_FORM, 136, 88, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ELABORA, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_QUADGENERIAS_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_QUADGENERIAS.SetIMDB(IMDB, "PQRY_PAR9", true);
    PAN_QUADGENERIAS.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_QUADGENERIAS.SetQueryIMDB(PPQRY_PAR9, IMDBDef11.PQRY_PAR9_RS, IMDBDef3.TBL_PAR12);
    JustLoaded = true;
    PAN_QUADGENERIAS.SetFieldPrimaryIndex(PFL_QUADGENERIAS_DABILANSIMUL, IMDBDef3.FLD_PAR12_ROWNAMDABISI);
    PAN_QUADGENERIAS.SetFieldPrimaryIndex(PFL_QUADGENERIAS_DATA, IMDBDef3.FLD_PAR12_ROWNAMEDATA);
    PAN_QUADGENERIAS.SetMasterTable(0, "PAR12");
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_QUADGENERIAS.Status() == 2)
    {
      int oldListQBE = PAN_QUADGENERIAS.iUseListQBE;
      PAN_QUADGENERIAS.iUseListQBE = 0;
      PAN_QUADGENERIAS.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUADGENERIAS.PanelCommand(Glb.PCM_FIND);
      PAN_QUADGENERIAS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
