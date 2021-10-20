// **********************************************
// Aggiornamento Bilancio P E G
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoBilancioPEG extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PANNELLO_ETICHEWARNIN = 0;
  private static int PFL_PANNELLO_UP = 1;
  private static int PFL_PANNELLO_ETICHEWARNI1 = 2;
  private static int PFL_PANNELLO_DOWN = 3;
  private static int PFL_PANNELLO_ESEGUI = 4;
  private static int PFL_PANNELLO_NEWEXPRESSIO = 5;

  private static int PPQRY_DUAL40 = 0;


  IDPanel PAN_PANNELLO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN6(IMDB);
    //
    //
    Init_PQRY_DUAL40(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IN6, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_IN6, "TBL_IN6");
    IMDB.set_FldCode(IMDBDef4.TBL_IN6,IMDBDef4.FLD_IN6_ROWNAMEBOZZA, "ROWNAMEBOZZA");
    IMDB.SetFldParams(IMDBDef4.TBL_IN6,IMDBDef4.FLD_IN6_ROWNAMEBOZZA,1,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IN6, 0);
  }

  private static void Init_PQRY_DUAL40(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_DUAL40, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_DUAL40, "PQRY_DUAL40");
    IMDB.set_FldCode(IMDBDef12.PQRY_DUAL40,IMDBDef12.PQSL_DUAL40_RECORNEWEXPR, "RECORNEWEXPR");
    IMDB.SetFldParams(IMDBDef12.PQRY_DUAL40,IMDBDef12.PQSL_DUAL40_RECORNEWEXPR,1,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_DUAL40, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoBilancioPEG(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoBilancioPEG()
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
    FormIdx = MyGlb.FRM_AGGIOBILAPEG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AED15355-876A-47E3-8B19-0EA1DA2C6154";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 400;
    DesignHeight = 206;
    set_Caption(new IDVariant("Aggiornamento Bilancio P E G"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 400;
    Frames[1].Height = 180;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pannello";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 180;
    PAN_PANNELLO = new IDPanel(w, this, 1, "PAN_PANNELLO");
    Frames[1].Content = PAN_PANNELLO;
    PAN_PANNELLO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELLO.VS = MainFrm.VisualStyleList;
    PAN_PANNELLO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 180-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EF0A3BC2-91EB-4834-8214-3316FB536776");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 276, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELLO.InitStatus = 2;
    PAN_PANNELLO_Init();
    PAN_PANNELLO_InitFields();
    PAN_PANNELLO_InitQueries();
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
      PAN_PANNELLO.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornamentoBilancioPEG);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoBilancioPEG.class.getName() : (Glb.ClassWithPackage(AggiornamentoBilancioPEG.class) ? AggiornamentoBilancioPEG.class.getName().substring(AggiornamentoBilancioPEG.class.getPackage().getName().length() + 1) : AggiornamentoBilancioPEG.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Esegui
  // **********************************************************************
  public int Esegui ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esegui Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.POLAGGBILPEG(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef4.TBL_IN6, IMDBDef4.FLD_IN6_ROWNAMEBOZZA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Elaborazione eseguita", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoBilancioPEG", "Esegui", _e);
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
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Aggiornamento Bilancio/P.e.g.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  POL_BOZZE_VARIAZIONE A, ");
      SQL.append("  POL_PROPOSTE_VAR_DETT B ");
      SQL.append("where (B.COD_REC = 2) ");
      SQL.append("and   (B.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
      SQL.append("and   ((B.STATO IS NULL)) ");
      SQL.append("and   (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_IN6, IMDBDef4.FLD_IN6_ROWNAMEBOZZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        PAN_PANNELLO.SetFlags (Glb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PANNELLO.SetFlags (Glb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PANNELLO.set_ObjRect(Glb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(PAN_PANNELLO.ObjRect(Glb.OBJ_FIELD, PFL_PANNELLO_UP, IDPanel.RT_TOP, Glb.PANEL_FORM))).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoBilancioPEG", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unload Event Body
      // Procedure Body
      // 
      ((BozzeVariazione)MainFrm.GetForm(MyGlb.FRM_BOZZEVARIAZI,0)).PAN_BOZZEVARIAZI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoBilancioPEG", "UnloadEvent", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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
  private void PAN_PANNELLO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELLO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELLO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELLO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELLO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PANNELLO);
    // Stub
  }

  private void PAN_PANNELLO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PANNELLO_ESEGUI)
    {
      this.IdxPanelActived = this.PAN_PANNELLO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Esegui();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PANNELLO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELLO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELLO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PANNELLO_Init()
  {

    PAN_PANNELLO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELLO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELLO.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, "6B0C09F2-3471-4275-BE4E-F7EDB9132258");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, "Attenzione: sulla bozza sono presenti proposte in Attesa di Approvazione");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, MyGlb.VIS_ETICHEGRASSE);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, "DD2E2B26-DFEE-4CD3-A74D-3B94975D7AF1");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, "");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, MyGlb.VIS_SFONEBORDTRA);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, "9C33292C-7AC4-4442-A6E0-A7140DCDCC8F");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, "La funzione aggiorna la tipologia di variazione, di Bilancio o di P.e.g., solo sulle proposte approvate");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, MyGlb.VIS_ETICHEGRASSE);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, "77B4D423-E19A-4A9A-9F46-A47C1CFD6B58");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, "");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, MyGlb.VIS_SFONEBORDTRA);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, "4C8AF9F0-A320-4BB1-BC02-969FD43F6DF8");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, "Esegui");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, MyGlb.VIS_STATICBUTTON);
    PAN_PANNELLO.SetImage(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, 0, "button1.gif", false);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, "582C8F02-3470-4020-B75A-4DB78715DF8A");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, "New Expression");
    PAN_PANNELLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, "");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PANNELLO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, MyGlb.PANEL_LIST, 8, 4, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, MyGlb.PANEL_FORM, 108, 4, 204, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNIN, MyGlb.PANEL_FORM, 3);
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_ETICHEWARNIN, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_ETICHEWARNIN, -1, "", "ETICHEWARNIN", 0, 0, 0, -13997);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, MyGlb.PANEL_LIST, 8, 4, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, MyGlb.PANEL_FORM, 92, 4, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_UP, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_UP, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_UP, -1, "", "UP", 0, 0, 0, -13997);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, MyGlb.PANEL_LIST, 16, 12, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, MyGlb.PANEL_FORM, 108, 64, 204, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_ETICHEWARNI1, MyGlb.PANEL_FORM, 3);
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_ETICHEWARNI1, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_ETICHEWARNI1, -1, "", "ETICHEWARNI1", 0, 0, 0, -13997);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, MyGlb.PANEL_LIST, 16, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, MyGlb.PANEL_FORM, 92, 68, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_DOWN, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_DOWN, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_DOWN, -1, "", "DOWN", 0, 0, 0, -13997);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, MyGlb.PANEL_LIST, 64, 144, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, MyGlb.PANEL_FORM, 168, 128, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_ESEGUI, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_ESEGUI, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_ESEGUI, -1, "", "ESEGUI", 0, 0, 0, -13997);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, MyGlb.PANEL_LIST, 84);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, MyGlb.PANEL_LIST, "New Expression");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, MyGlb.PANEL_FORM, 4, 156, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, MyGlb.PANEL_FORM, 84);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_NEWEXPRESSIO, MyGlb.PANEL_FORM, "New Expres.");
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_NEWEXPRESSIO, -1, -1);
    PAN_PANNELLO.SetFieldUnbound(PFL_PANNELLO_NEWEXPRESSIO, true);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_NEWEXPRESSIO, PPQRY_DUAL40, "1", "RECORNEWEXPR", 1, 19, 0, -13997);
  }

  private void PAN_PANNELLO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELLO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PANNELLO.SetIMDB(IMDB, "PQRY_DUAL40", true);
    PAN_PANNELLO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  1 as RECORNEWEXPR ");
    PAN_PANNELLO.SetQuery(PPQRY_DUAL40, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PANNELLO.SetQuery(PPQRY_DUAL40, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PANNELLO.SetQuery(PPQRY_DUAL40, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PANNELLO.SetQuery(PPQRY_DUAL40, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PANNELLO.SetQuery(PPQRY_DUAL40, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PANNELLO.SetQuery(PPQRY_DUAL40, 5, SQL, -1, "");
    PAN_PANNELLO.SetQueryDB(PPQRY_DUAL40, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PANNELLO.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELLO.Status() == 2)
    {
      int oldListQBE = PAN_PANNELLO.iUseListQBE;
      PAN_PANNELLO.iUseListQBE = 0;
      PAN_PANNELLO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELLO.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELLO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
