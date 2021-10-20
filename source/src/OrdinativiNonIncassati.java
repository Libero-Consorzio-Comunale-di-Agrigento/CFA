// **********************************************
// Ordinativi Non Incassati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiNonIncassati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ORDINNONINCA_EMESSIAL = 0;
  private static int PFL_ORDINNONINCA_NONINCASSAAL = 1;
  private static int PFL_ORDINNONINCA_ELABORA = 2;

  private static int PPQRY_NEWTABLE23 = 0;


  IDPanel PAN_ORDINNONINCA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE24(IMDB);
    //
    //
    Init_PQRY_NEWTABLE23(IMDB);
    Init_PQRY_NEWTABLE23_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE24(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_NEWTABLE24, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_NEWTABLE24, "TBL_NEWTABLE24");
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE24,IMDBDef6.FLD_NEWTABLE24_ROWNAMEEMEAL, "ROWNAMEEMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE24,IMDBDef6.FLD_NEWTABLE24_ROWNAMEEMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE24,IMDBDef6.FLD_NEWTABLE24_ROWNAMNOINAL, "ROWNAMNOINAL");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE24,IMDBDef6.FLD_NEWTABLE24_ROWNAMNOINAL,6,14,0);
    IMDB.TblAddNew(IMDBDef6.TBL_NEWTABLE24, 0);
  }

  private static void Init_PQRY_NEWTABLE23(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE23, 2);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE23, "PQRY_NEWTABLE23");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE23,IMDBDef15.PQSL_NEWTABLE23_ROWNAMEEMEAL, "ROWNAMEEMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE23,IMDBDef15.PQSL_NEWTABLE23_ROWNAMEEMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE23,IMDBDef15.PQSL_NEWTABLE23_ROWNAMNOINAL, "ROWNAMNOINAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE23,IMDBDef15.PQSL_NEWTABLE23_ROWNAMNOINAL,6,14,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE23, 0);
  }

  private static void Init_PQRY_NEWTABLE23_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE23_RS, 2);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE23_RS, "PQRY_NEWTABLE23_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE23_RS,IMDBDef15.PQSL_NEWTABLE23_ROWNAMEEMEAL, "ROWNAMEEMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE23_RS,IMDBDef15.PQSL_NEWTABLE23_ROWNAMEEMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE23_RS,IMDBDef15.PQSL_NEWTABLE23_ROWNAMNOINAL, "ROWNAMNOINAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE23_RS,IMDBDef15.PQSL_NEWTABLE23_ROWNAMNOINAL,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiNonIncassati(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiNonIncassati()
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
    FormIdx = MyGlb.FRM_ORDINNONINCA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F601CC9C-BB5C-4092-9775-28E793726D02";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 280;
    DesignHeight = 170;
    set_Caption(new IDVariant("Ordinativi Non Incassati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 280;
    Frames[1].Height = 144;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Ordinativi Non Incassati";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 144;
    PAN_ORDINNONINCA = new IDPanel(w, this, 1, "PAN_ORDINNONINCA");
    Frames[1].Content = PAN_ORDINNONINCA;
    PAN_ORDINNONINCA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINNONINCA.VS = MainFrm.VisualStyleList;
    PAN_ORDINNONINCA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 280-MyGlb.PAN_OFFS_X, 144-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINNONINCA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AE4D3E65-7C48-4266-93E3-1DD7DF977E5B");
    PAN_ORDINNONINCA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 240, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINNONINCA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINNONINCA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINNONINCA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINNONINCA.InitStatus = 2;
    PAN_ORDINNONINCA_Init();
    PAN_ORDINNONINCA_InitFields();
    PAN_ORDINNONINCA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_NEWTABLE24, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDINNONINCA_NEWTABLE23();
      }
      PAN_ORDINNONINCA.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdinativiNonIncassati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiNonIncassati.class.getName() : (Glb.ClassWithPackage(OrdinativiNonIncassati.class) ? OrdinativiNonIncassati.class.getName().substring(OrdinativiNonIncassati.class.getPackage().getName().length() + 1) : OrdinativiNonIncassati.class.getName()));
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
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE23, IMDBDef15.PQSL_NEWTABLE23_ROWNAMEEMEAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE23, IMDBDef15.PQSL_NEWTABLE23_ROWNAMNOINAL, 0)) || IDL.Year(IMDB.Value(IMDBDef15.PQRY_NEWTABLE23, IMDBDef15.PQSL_NEWTABLE23_ROWNAMEEMEAL, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0 || IDL.Year(IMDB.Value(IMDBDef15.PQRY_NEWTABLE23, IMDBDef15.PQSL_NEWTABLE23_ROWNAMNOINAL, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Date non valorizzate o non appartenenti all'esercizio del contesto", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_ORD")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE23, IMDBDef15.PQSL_NEWTABLE23_ROWNAMEEMEAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_INC")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE23, IMDBDef15.PQSL_NEWTABLE23_ROWNAMNOINAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("ENTE")), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONEENTE, 0));
        MainFrm.LanciaStampaJasper((new IDVariant("Ordinativi_non_Incassati")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiNonIncassati", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_NEWTABLE24, IMDBDef6.FLD_NEWTABLE24_ROWNAMEEMEAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_NEWTABLE24, IMDBDef6.FLD_NEWTABLE24_ROWNAMNOINAL, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiNonIncassati", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void ORDINNONINCA_NEWTABLE23() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_NEWTABLE23_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_NEWTABLE24, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_NEWTABLE24, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE23_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_NEWTABLE23_RS, 0, IMDBDef6.TBL_NEWTABLE24, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE23_RS, 0, 0, IMDBDef6.TBL_NEWTABLE24, IMDBDef6.FLD_NEWTABLE24_ROWNAMEEMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE23_RS, 1, 0, IMDBDef6.TBL_NEWTABLE24, IMDBDef6.FLD_NEWTABLE24_ROWNAMNOINAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_NEWTABLE24, 0);
      if (IMDB.Eof(IMDBDef6.TBL_NEWTABLE24, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_NEWTABLE24, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_NEWTABLE23_RS, 0);
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
  private void PAN_ORDINNONINCA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINNONINCA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINNONINCA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINNONINCA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINNONINCA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ORDINNONINCA);
    // Stub
  }

  private void PAN_ORDINNONINCA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINNONINCA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ORDINNONINCA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINNONINCA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINNONINCA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINNONINCA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINNONINCA_Init()
  {

    PAN_ORDINNONINCA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINNONINCA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDINNONINCA.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_ORDINNONINCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, "DDAB7D84-A4ED-43FB-8D78-10CD6327C1C5");
    PAN_ORDINNONINCA.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, "Emessi Al");
    PAN_ORDINNONINCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, "");
    PAN_ORDINNONINCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINNONINCA.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINNONINCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, "6CB91A19-B58B-4D62-B4EE-609F7D063453");
    PAN_ORDINNONINCA.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, "Non Incassati Al");
    PAN_ORDINNONINCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, "");
    PAN_ORDINNONINCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINNONINCA.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINNONINCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, "3DE6C6B6-9B4C-4DE2-AD66-6C383CBFC9C7");
    PAN_ORDINNONINCA.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, "Elabora");
    PAN_ORDINNONINCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ORDINNONINCA.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, 0, "button1.gif", false);
    PAN_ORDINNONINCA.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ORDINNONINCA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINNONINCA.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINNONINCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, MyGlb.PANEL_LIST, 52);
    PAN_ORDINNONINCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINNONINCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, MyGlb.PANEL_LIST, "Emessi Al");
    PAN_ORDINNONINCA.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, MyGlb.PANEL_FORM, 44, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINNONINCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, MyGlb.PANEL_FORM, 84);
    PAN_ORDINNONINCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINNONINCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_EMESSIAL, MyGlb.PANEL_FORM, "Emessi Al");
    PAN_ORDINNONINCA.SetFieldPage(PFL_ORDINNONINCA_EMESSIAL, -1, -1);
    PAN_ORDINNONINCA.SetFieldPanel(PFL_ORDINNONINCA_EMESSIAL, PPQRY_NEWTABLE23, "A.ROWNAMEEMEAL", "ROWNAMEEMEAL", 6, 14, 0, -13997);
    PAN_ORDINNONINCA.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, MyGlb.PANEL_LIST, 104, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINNONINCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, MyGlb.PANEL_LIST, 88);
    PAN_ORDINNONINCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINNONINCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, MyGlb.PANEL_LIST, "Non Incassati Al");
    PAN_ORDINNONINCA.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, MyGlb.PANEL_FORM, 8, 28, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINNONINCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, MyGlb.PANEL_FORM, 120);
    PAN_ORDINNONINCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINNONINCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_NONINCASSAAL, MyGlb.PANEL_FORM, "Non Incassati Al");
    PAN_ORDINNONINCA.SetFieldPage(PFL_ORDINNONINCA_NONINCASSAAL, -1, -1);
    PAN_ORDINNONINCA.SetFieldPanel(PFL_ORDINNONINCA_NONINCASSAAL, PPQRY_NEWTABLE23, "A.ROWNAMNOINAL", "ROWNAMNOINAL", 6, 14, 0, -13997);
    PAN_ORDINNONINCA.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, MyGlb.PANEL_LIST, 96, 56, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINNONINCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINNONINCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINNONINCA.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, MyGlb.PANEL_FORM, 132, 56, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINNONINCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINNONINCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINNONINCA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINNONINCA.SetFieldPage(PFL_ORDINNONINCA_ELABORA, -1, -1);
    PAN_ORDINNONINCA.SetFieldPanel(PFL_ORDINNONINCA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ORDINNONINCA_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINNONINCA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDINNONINCA.SetIMDB(IMDB, "PQRY_NEWTABLE23", true);
    PAN_ORDINNONINCA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ORDINNONINCA.SetQueryIMDB(PPQRY_NEWTABLE23, IMDBDef15.PQRY_NEWTABLE23_RS, IMDBDef6.TBL_NEWTABLE24);
    JustLoaded = true;
    PAN_ORDINNONINCA.SetFieldPrimaryIndex(PFL_ORDINNONINCA_EMESSIAL, IMDBDef6.FLD_NEWTABLE24_ROWNAMEEMEAL);
    PAN_ORDINNONINCA.SetFieldPrimaryIndex(PFL_ORDINNONINCA_NONINCASSAAL, IMDBDef6.FLD_NEWTABLE24_ROWNAMNOINAL);
    PAN_ORDINNONINCA.SetMasterTable(0, "NEWTABLE24");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINNONINCA.Status() == 2)
    {
      int oldListQBE = PAN_ORDINNONINCA.iUseListQBE;
      PAN_ORDINNONINCA.iUseListQBE = 0;
      PAN_ORDINNONINCA.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINNONINCA.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINNONINCA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINNONINCA) PAN_ORDINNONINCA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINNONINCA) PAN_ORDINNONINCA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINNONINCA) PAN_ORDINNONINCA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINNONINCA) PAN_ORDINNONINCA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINNONINCA) PAN_ORDINNONINCA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
