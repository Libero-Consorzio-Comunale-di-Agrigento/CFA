// **********************************************
// Parametri Bilancio Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriBilancioPrev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SCELTABILANC_DELIAPPRBILA = 0;

  private static int PFL_SCELTABILANC_ESERCIZIO = 0;
  private static int PFL_SCELTABILANC_TIPOSTAMPREV = 1;
  private static int PFL_SCELTABILANC_DAPERIDIAMPR = 2;
  private static int PFL_SCELTABILANC_DATAPERCOLOB = 3;
  private static int PFL_SCELTABILANC_PRIMESERPREV = 4;
  private static int PFL_SCELTABILANC_SEDEDELRIACC = 5;
  private static int PFL_SCELTABILANC_NUMERDELRIAC = 6;
  private static int PFL_SCELTABILANC_ANNODELRIACC = 7;
  private static int PFL_SCELTABILANC_NUMDELAPPPRE = 8;
  private static int PFL_SCELTABILANC_TIPDELAPPPRE = 9;
  private static int PFL_SCELTABILANC_DATDELAPPPRE = 10;
  private static int PFL_SCELTABILANC_ETIDATPECOAE = 11;
  private static int PFL_SCELTABILANC_ESEPARDEFPRE = 12;

  private static int PPQRY_ESERCIFINAN2 = 0;


  IDPanel PAN_SCELTABILANC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_ESERCIFINAN2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_ESERCIFINAN2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_ESERCIFINAN2, 12);
    IMDB.set_TblCode(IMDBDef11.PQRY_ESERCIFINAN2, "PQRY_ESERCIFINAN2");
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_TIPO_STAMPE_PREV, "TIPO_STAMPE_PREV");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_TIPO_STAMPE_PREV,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_DATA_RIS_AMM_PRESUNTO, "DATA_RIS_AMM_PRESUNTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_DATA_RIS_AMM_PRESUNTO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_DATA_COMPOSIZIONE_FPV, "DATA_COMPOSIZIONE_FPV");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_DATA_COMPOSIZIONE_FPV,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_PRIMO_ESERC_PREVENTIVO, "PRIMO_ESERC_PREVENTIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_PRIMO_ESERC_PREVENTIVO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_SEDE_DEL_RIACC, "SEDE_DEL_RIACC");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_SEDE_DEL_RIACC,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_NUMERO_DEL_RIACC, "NUMERO_DEL_RIACC");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_NUMERO_DEL_RIACC,1,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_ANNO_DEL_RIACC, "ANNO_DEL_RIACC");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_ANNO_DEL_RIACC,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_NUMERO_DEL_APP_PREV, "NUMERO_DEL_APP_PREV");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_NUMERO_DEL_APP_PREV,1,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_TIPO_DEL_APP_PREV, "TIPO_DEL_APP_PREV");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_TIPO_DEL_APP_PREV,5,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_DATA_DEL_APP_PREV, "DATA_DEL_APP_PREV");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_DATA_DEL_APP_PREV,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_ESERCIZIO_PARAMETRI_DEF_PREV, "ESERCIZIO_PARAMETRI_DEF_PREV");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESERCIFINAN2,IMDBDef11.PQSL_ESERCIFINAN2_ESERCIZIO_PARAMETRI_DEF_PREV,1,4,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_ESERCIFINAN2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriBilancioPrev(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriBilancioPrev()
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
    FormIdx = MyGlb.FRM_PARABILAPREV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B568D3A2-9C09-4D3F-9D41-D3CF3A9D81BC";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 564;
    DesignHeight = 374;
    set_Caption(new IDVariant("Parametri Bilancio e Certificato Preventivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 564;
    Frames[1].Height = 348;
    Frames[1].Caption = "Scelta Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_SCELTABILANC = new IDPanel(w, this, 1, "PAN_SCELTABILANC");
    Frames[1].Content = PAN_SCELTABILANC;
    PAN_SCELTABILANC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTABILANC.FocusEventDef = RD3Glb.EVENT_ACTIVE;
    PAN_SCELTABILANC.VS = MainFrm.VisualStyleList;
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 564-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "974B13D1-C098-4B96-82C6-75B68DF96F5B");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1380, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTABILANC.InitStatus = 2;
    PAN_SCELTABILANC_Init();
    PAN_SCELTABILANC_InitFields();
    PAN_SCELTABILANC_InitQueries();
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
      PAN_SCELTABILANC.UpdatePanel(MainFrm);
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
    return (obj instanceof ParametriBilancioPrev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriBilancioPrev.class.getName() : (Glb.ClassWithPackage(ParametriBilancioPrev.class) ? ParametriBilancioPrev.class.getName().substring(ParametriBilancioPrev.class.getPackage().getName().length() + 1) : ParametriBilancioPrev.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Bilancio On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_SCELTABILANC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_SCELTABILANC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Scelta Bilancio On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriBilancioPrev", "SceltaBilancioOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Scelta Bilancio On Focus
  // Evento notificato dal pannello quando un campo acquista
  // o perde il fuoco
  // Field Index - Input
  // Got Focus - Input
  // **********************************************************************
  private void PAN_SCELTABILANC_OnFocus(IDVariant FieldIndex, IDVariant GotFocus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Bilancio On Focus Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_SCELTABILANC_TIPDELAPPPRE)), true) && GotFocus.booleanValue())
      {
        IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
        v_TOOLTIP = (new IDVariant("Corrisponde al codice 1005 del Certificato Preventivo"));
        MainFrm.ShowTooltip(v_TOOLTIP.stringValue(),(new IDVariant("Tipo")).stringValue(),new IDVariant(PAN_SCELTABILANC.bFields(PFL_SCELTABILANC_TIPDELAPPPRE).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriBilancioPrev", "SceltaBilancioOnFocus", _e);
    }
  }

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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      if (IDL.ToInteger(IDL.NullValue(MainFrm.PRIMOESERARM,(new IDVariant("2999")))).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)>0)
      {
        PAN_SCELTABILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCELTABILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCELTABILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SCELTABILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCELTABILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCELTABILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_SCELTABILANC.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriBilancioPrev", "Load", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTABILANC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTABILANC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTABILANC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCELTABILANC);
    // Stub
  }

  private void PAN_SCELTABILANC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTABILANC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTABILANC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTABILANC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTABILANC_Init()
  {

    PAN_SCELTABILANC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTABILANC.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, "091DB22E-9D41-437C-8242-D54B4E97343D");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, "Delibera Approvazione Bilancio");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, MyGlb.PANEL_LIST, 0, -9999, 136, 16, 0, 0);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, MyGlb.PANEL_FORM, 36, 63, 372, 49, 0, 0);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, 0, 174);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, 1, 13);
    PAN_SCELTABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, 0, 4);
    PAN_SCELTABILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, 1, 4);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTABILANC_DELIAPPRBILA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTABILANC.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, "B527B1B7-9DCF-4CA2-9391-669B80D53AEF");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, "ESERCIZIO");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, "0298E6FF-D6E1-437A-872E-F79B7E180E77");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, "Tipo Bilancio per Stampe Preventivo");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, MyGlb.VIS_OPTIONBUTTON);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, "B024D192-0AD0-453B-A778-8F0811B1FFF1");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, "Data per Risultato di Amministrazione Presunto");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, "62E0C14B-8573-4DCA-B570-983D5BFCF7B4");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, " ");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, "F132BE4F-CDDA-47BA-98E0-BE9DD2019AE6");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, "Primo Esercizio Preventivo");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, MyGlb.VIS_CHECKSTYLE);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, "1FC43EEF-3C7E-411C-B065-7C9891B21301");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, "Delibera Approvazione Riacc. Straordinario");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, "19DE6503-15A2-4833-B4A6-A05A27AC4350");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, "-");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, "1315ABA8-A0F7-4CAC-B496-D56CB964B52C");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, "/");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, "2D726630-05E6-40BD-A094-CA779DDF489D");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, "Numero");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, "E9E9D074-9CDF-4B24-B81C-78718E6DFA2D");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, "Tipo");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, "Corrisponde al codice 1005 del Certificato Preventivo");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, "A1B4C214-4A3B-4E98-9B15-26B04B89EB6B");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, "Data");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, "72BC0A19-90D9-45DD-8C6D-11C613EF62E6");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, "Data per Colonna (a) e (b) stampa FPV Preventivo e seconda colonna (esercizio+1) stampa Limiti di Indebitamento");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, MyGlb.VIS_LABELFIELD);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, "7D22099A-FF62-4E87-B453-3C142E4A9ADC");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, "Esercizio Rif. Indicatori (per Parametri Obiettivi)");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTABILANC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_FORM, 144);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_ESERCIZIO, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_ESERCIZIO, PPQRY_ESERCIFINAN2, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, MyGlb.PANEL_LIST, 116);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, MyGlb.PANEL_LIST, "T. B. p. S. P.");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, MyGlb.PANEL_FORM, 36, 12, 212, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, MyGlb.PANEL_FORM, 20);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPOSTAMPREV, MyGlb.PANEL_FORM, "Tipo Bilancio per Stampe Preventivo");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_TIPOSTAMPREV, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_TIPOSTAMPREV, PPQRY_ESERCIFINAN2, "A.TIPO_STAMPE_PREV", "TIPO_STAMPE_PREV", 5, 1, 0, -13997);
    PAN_SCELTABILANC.SetValueListItem(PFL_SCELTABILANC_TIPOSTAMPREV, (new IDVariant("E")), "Effettivo", "", "", -1);
    PAN_SCELTABILANC.SetValueListItem(PFL_SCELTABILANC_TIPOSTAMPREV, (new IDVariant("S")), "Simulato", "", "", -1);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, MyGlb.PANEL_LIST, 156);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, MyGlb.PANEL_LIST, "Data per Risultato di Amministrazione Presunto");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, MyGlb.PANEL_FORM, 36, 120, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, MyGlb.PANEL_FORM, 280);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DAPERIDIAMPR, MyGlb.PANEL_FORM, "Data per Risultato di Amministrazione Presunto");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_DAPERIDIAMPR, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_DAPERIDIAMPR, PPQRY_ESERCIFINAN2, "A.DATA_RIS_AMM_PRESUNTO", "DATA_RIS_AMM_PRESUNTO", 6, 10, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, MyGlb.PANEL_LIST, 152);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, MyGlb.PANEL_LIST, " ");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, MyGlb.PANEL_FORM, 320, 148, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, MyGlb.PANEL_FORM, 12);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAPERCOLOB, MyGlb.PANEL_FORM, " ");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_DATAPERCOLOB, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_DATAPERCOLOB, PPQRY_ESERCIFINAN2, "A.DATA_COMPOSIZIONE_FPV", "DATA_COMPOSIZIONE_FPV", 6, 10, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, MyGlb.PANEL_LIST, 156);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, MyGlb.PANEL_LIST, "Primo Esercizio Preventivo");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, MyGlb.PANEL_FORM, 100, 200, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, MyGlb.PANEL_FORM, 216);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_PRIMESERPREV, MyGlb.PANEL_FORM, "Primo Esercizio Preventivo");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_PRIMESERPREV, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_PRIMESERPREV, PPQRY_ESERCIFINAN2, "A.PRIMO_ESERC_PREVENTIVO", "PRIMO_ESERC_PREVENTIVO", 5, 2, 0, -13997);
    PAN_SCELTABILANC.SetValueListItem(PFL_SCELTABILANC_PRIMESERPREV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTABILANC.SetValueListItem(PFL_SCELTABILANC_PRIMESERPREV, (new IDVariant()), "Null", "", "", -1);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, MyGlb.PANEL_LIST, 96);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, MyGlb.PANEL_LIST, "Delib. Approv. Riac. Straord.");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, MyGlb.PANEL_FORM, 64, 224, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, MyGlb.PANEL_FORM, 252);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SEDEDELRIACC, MyGlb.PANEL_FORM, "Delibera Approvazione Riacc. Straordinario");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_SEDEDELRIACC, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_SEDEDELRIACC, PPQRY_ESERCIFINAN2, "A.SEDE_DEL_RIACC", "SEDE_DEL_RIACC", 5, 4, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, MyGlb.PANEL_LIST, 116);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, MyGlb.PANEL_LIST, "-");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, MyGlb.PANEL_FORM, 364, 224, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, MyGlb.PANEL_FORM, 16);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMERDELRIAC, MyGlb.PANEL_FORM, "-");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_NUMERDELRIAC, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_NUMERDELRIAC, PPQRY_ESERCIFINAN2, "A.NUMERO_DEL_RIACC", "NUMERO_DEL_RIACC", 1, 6, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, MyGlb.PANEL_LIST, 100);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, MyGlb.PANEL_LIST, "/");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, MyGlb.PANEL_FORM, 440, 224, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, MyGlb.PANEL_FORM, 16);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ANNODELRIACC, MyGlb.PANEL_FORM, "/");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_ANNODELRIACC, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_ANNODELRIACC, PPQRY_ESERCIFINAN2, "A.ANNO_DEL_RIACC", "ANNO_DEL_RIACC", 5, 4, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, MyGlb.PANEL_LIST, 136);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, MyGlb.PANEL_FORM, 40, 88, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, MyGlb.PANEL_FORM, 60);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_NUMDELAPPPRE, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_NUMDELAPPPRE, -1, GRP_SCELTABILANC_DELIAPPRBILA);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_NUMDELAPPPRE, PPQRY_ESERCIFINAN2, "A.NUMERO_DEL_APP_PREV", "NUMERO_DEL_APP_PREV", 1, 6, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, MyGlb.PANEL_LIST, 116);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, MyGlb.PANEL_LIST, "Tipo");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, MyGlb.PANEL_FORM, 168, 88, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, MyGlb.PANEL_FORM, 32);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_TIPDELAPPPRE, MyGlb.PANEL_FORM, "Tipo");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_TIPDELAPPPRE, -1, GRP_SCELTABILANC_DELIAPPRBILA);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_TIPDELAPPPRE, PPQRY_ESERCIFINAN2, "A.TIPO_DEL_APP_PREV", "TIPO_DEL_APP_PREV", 5, 6, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, MyGlb.PANEL_LIST, 120);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, MyGlb.PANEL_LIST, "Data");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, MyGlb.PANEL_FORM, 280, 88, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, MyGlb.PANEL_FORM, 36);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATDELAPPPRE, MyGlb.PANEL_FORM, "Data");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_DATDELAPPPRE, -1, GRP_SCELTABILANC_DELIAPPRBILA);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_DATDELAPPPRE, PPQRY_ESERCIFINAN2, "A.DATA_DEL_APP_PREV", "DATA_DEL_APP_PREV", 6, 10, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, MyGlb.PANEL_LIST, 448, 144, 84, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, MyGlb.PANEL_LIST, 0);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, MyGlb.PANEL_LIST, 3);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, MyGlb.PANEL_FORM, 16, 148, 296, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, MyGlb.PANEL_FORM, 0);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ETIDATPECOAE, MyGlb.PANEL_FORM, 3);
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_ETIDATPECOAE, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_ETIDATPECOAE, -1, "", "ETIDATPECOAE", 0, 0, 0, -13997);
    PAN_SCELTABILANC.set_Alignment(PFL_SCELTABILANC_ETIDATPECOAE, 4);
    PAN_SCELTABILANC.set_FontModifiers(PFL_SCELTABILANC_ETIDATPECOAE, "B");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, MyGlb.PANEL_LIST, 192);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, MyGlb.PANEL_LIST, "Esercizio Rif. Indicatori (per Parametri Obiettivi)");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, MyGlb.PANEL_FORM, 4, 248, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, MyGlb.PANEL_FORM, 312);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESEPARDEFPRE, MyGlb.PANEL_FORM, "Esercizio Rif. Indicatori (per Parametri Obiettivi)");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_ESEPARDEFPRE, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_ESEPARDEFPRE, PPQRY_ESERCIFINAN2, "A.ESERCIZIO_PARAMETRI_DEF_PREV", "ESERCIZIO_PARAMETRI_DEF_PREV", 1, 4, 0, -13997);
  }

  private void PAN_SCELTABILANC_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTABILANC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTABILANC.SetIMDB(IMDB, "PQRY_ESERCIFINAN2", true);
    PAN_SCELTABILANC.set_SetString(MyGlb.MASTER_ROWNAME, "ESEFIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.TIPO_STAMPE_PREV as TIPO_STAMPE_PREV, ");
    SQL.append("  A.DATA_RIS_AMM_PRESUNTO as DATA_RIS_AMM_PRESUNTO, ");
    SQL.append("  A.DATA_COMPOSIZIONE_FPV as DATA_COMPOSIZIONE_FPV, ");
    SQL.append("  A.PRIMO_ESERC_PREVENTIVO as PRIMO_ESERC_PREVENTIVO, ");
    SQL.append("  A.SEDE_DEL_RIACC as SEDE_DEL_RIACC, ");
    SQL.append("  A.NUMERO_DEL_RIACC as NUMERO_DEL_RIACC, ");
    SQL.append("  A.ANNO_DEL_RIACC as ANNO_DEL_RIACC, ");
    SQL.append("  A.NUMERO_DEL_APP_PREV as NUMERO_DEL_APP_PREV, ");
    SQL.append("  A.TIPO_DEL_APP_PREV as TIPO_DEL_APP_PREV, ");
    SQL.append("  A.DATA_DEL_APP_PREV as DATA_DEL_APP_PREV, ");
    SQL.append("  A.ESERCIZIO_PARAMETRI_DEF_PREV as ESERCIZIO_PARAMETRI_DEF_PREV ");
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINAN2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINAN2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINAN2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINAN2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINAN2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINAN2, 5, SQL, -1, "");
    PAN_SCELTABILANC.SetQueryDB(PPQRY_ESERCIFINAN2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTABILANC.SetMasterTable(0, "ESEFIN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTABILANC.Status() == 2)
    {
      int oldListQBE = PAN_SCELTABILANC.iUseListQBE;
      PAN_SCELTABILANC.iUseListQBE = 0;
      PAN_SCELTABILANC.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTABILANC.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTABILANC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_OnFocus(Field, GotFocus);
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
