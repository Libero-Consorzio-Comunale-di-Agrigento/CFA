// **********************************************
// Scheda Informativa Liq
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchedaInformativaLiq extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCHEDAINFORM_IMPINIZIALE = 0;
  private static int PFL_SCHEDAINFORM_IMPVARIAZION = 1;
  private static int PFL_SCHEDAINFORM_DOCUMENTO = 2;
  private static int PFL_SCHEDAINFORM_UFFICIO = 3;

  private static int PPQRY_LIQ11 = 0;


  IDPanel PAN_SCHEDAINFORM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI426(IMDB);
    Init_TBL_PARAMEPOSIZ6(IMDB);
    //
    //
    Init_PQRY_LIQ11(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI426(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI426, 5);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI426, "TBL_PARAMETRI426");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARATIPOESPL, "PARATIPOESPL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARATIPOESPL,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARAMTITOLO,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARAAGGDAFUO, "PARAAGGDAFUO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI426,IMDBDef7.FLD_PARAMETRI426_PARAAGGDAFUO,5,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI426, 0);
  }

  private static void Init_TBL_PARAMEPOSIZ6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMEPOSIZ6, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMEPOSIZ6, "TBL_PARAMEPOSIZ6");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMEPOSIZ6,IMDBDef7.FLD_PARAMEPOSIZ6_POSTOP, "POSTOP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMEPOSIZ6,IMDBDef7.FLD_PARAMEPOSIZ6_POSTOP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMEPOSIZ6,IMDBDef7.FLD_PARAMEPOSIZ6_POSLEFT, "POSLEFT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMEPOSIZ6,IMDBDef7.FLD_PARAMEPOSIZ6_POSLEFT,1,5,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMEPOSIZ6, 0);
  }

  private static void Init_PQRY_LIQ11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_LIQ11, 4);
    IMDB.set_TblCode(IMDBDef17.PQRY_LIQ11, "PQRY_LIQ11");
    IMDB.set_FldCode(IMDBDef17.PQRY_LIQ11,IMDBDef17.PQSL_LIQ11_RECORLIQIMPO, "RECORLIQIMPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_LIQ11,IMDBDef17.PQSL_LIQ11_RECORLIQIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_LIQ11,IMDBDef17.PQSL_LIQ11_RECORLIQRITE, "RECORLIQRITE");
    IMDB.SetFldParams(IMDBDef17.PQRY_LIQ11,IMDBDef17.PQSL_LIQ11_RECORLIQRITE,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_LIQ11,IMDBDef17.PQSL_LIQ11_DOCUMENTO, "DOCUMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_LIQ11,IMDBDef17.PQSL_LIQ11_DOCUMENTO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LIQ11,IMDBDef17.PQSL_LIQ11_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_LIQ11,IMDBDef17.PQSL_LIQ11_UFFICIO,5,99,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_LIQ11, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchedaInformativaLiq(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchedaInformativaLiq()
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
    FormIdx = MyGlb.FRM_SCHEDINFOLIQ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "41C24059-F27B-4166-9889-AEB0A57B35EE";
    ResModeW = 1;
    ResModeH = 1;
    iBorderType = 2;
    iVisualFlags = -4091;
    DesignWidth = 532;
    DesignHeight = 170;
    set_Caption(new IDVariant("Scheda Informativa"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 532;
    Frames[1].Height = 144;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Scheda Informativa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 144;
    PAN_SCHEDAINFORM = new IDPanel(w, this, 1, "PAN_SCHEDAINFORM");
    Frames[1].Content = PAN_SCHEDAINFORM;
    PAN_SCHEDAINFORM.ShowRowSelector = false;
    PAN_SCHEDAINFORM.ShowToolbar = false;
    PAN_SCHEDAINFORM.ShowStatusbar = false;
    PAN_SCHEDAINFORM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCHEDAINFORM.VS = MainFrm.VisualStyleList;
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 144-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B1788C79-1F1B-4735-8253-8E6099D9D7EA");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 224, 100, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 0);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCHEDAINFORM.InitStatus = 2;
    PAN_SCHEDAINFORM_Init();
    PAN_SCHEDAINFORM_InitFields();
    PAN_SCHEDAINFORM_InitQueries();
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
      PAN_SCHEDAINFORM.UpdatePanel(MainFrm);
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
    return (obj instanceof SchedaInformativaLiq);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchedaInformativaLiq.class.getName() : (Glb.ClassWithPackage(SchedaInformativaLiq.class) ? SchedaInformativaLiq.class.getName().substring(SchedaInformativaLiq.class.getPackage().getName().length() + 1) : SchedaInformativaLiq.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scheda Informativa After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SCHEDAINFORM_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scheda Informativa After Find Body
      // Corpo Procedura
      // 
      SettaCaption();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaLiq", "SchedaInformativaAfterFind", _e);
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
      set_FormTopPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ6, IMDBDef7.FLD_PARAMEPOSIZ6_POSTOP, 0),IDL.Sub((new IDVariant(MainFrm.ScreenHeight())), (new IDVariant(FormHeightSize())))).intValue());
      set_FormLeftPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ6, IMDBDef7.FLD_PARAMEPOSIZ6_POSLEFT, 0),IDL.Sub((new IDVariant(MainFrm.ScreenWidth())), (IDL.Add((new IDVariant(FormWidthSize())), (new IDVariant(30)))))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaLiq", "Load", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaLiq", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI426, IMDBDef7.FLD_PARAMETRI426_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI426, IMDBDef7.FLD_PARAMETRI426_PARATIPOESPL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI426, IMDBDef7.FLD_PARAMETRI426_PARAMPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI426, IMDBDef7.FLD_PARAMETRI426_PARAMTITOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI426, IMDBDef7.FLD_PARAMETRI426_PARAAGGDAFUO, 0, new IDVariant());
  }

  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioè quando viene portata in primo piano
  // **********************************************************************
  public void Form_Activate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.Form_Activate(this);
      // 
      // Activate Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI426, IMDBDef7.FLD_PARAMETRI426_PARAAGGDAFUO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_SCHEDAINFORM.PanelCommand(Glb.PCM_REQUERY);
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI426, IMDBDef7.FLD_PARAMETRI426_PARAAGGDAFUO, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaLiq", "Activate", _e);
    }
  }

  // **********************************************************************
  // Setta Caption
  // **********************************************************************
  public int SettaCaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Caption Body
      // Corpo Procedura
      // 
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Scheda Informativa - Liquidazione "));
      set_Caption(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, IDL.ToString(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0))));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaLiq", "SettaCaption", _e);
      return -1;
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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
  private void PAN_SCHEDAINFORM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCHEDAINFORM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCHEDAINFORM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCHEDAINFORM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCHEDAINFORM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCHEDAINFORM);
    // Stub
  }

  private void PAN_SCHEDAINFORM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCHEDAINFORM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCHEDAINFORM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCHEDAINFORM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCHEDAINFORM_Init()
  {

    PAN_SCHEDAINFORM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCHEDAINFORM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCHEDAINFORM.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, "EBD82056-3740-47C6-8125-8FB4B2302956");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, "Importo");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, "E2F25A1C-EC9E-46D7-A692-A41B8D73ADC2");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, "Ritenute");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, "B0124655-A40C-4915-BD02-3D79724D55C7");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, "Documento");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, "C54E8277-A424-4AE3-96B9-C697392F2321");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, "Ufficio");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCHEDAINFORM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_LIST, 0, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_LIST, 80);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_LIST, "Importo");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_FORM, 8, 12, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_FORM, "Importo");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_IMPINIZIALE, -1, -1);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_IMPINIZIALE, PPQRY_LIQ11, "A.IMPORTO", "RECORLIQIMPO", 3, 14, 2, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_LIST, 56, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_LIST, 64);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_LIST, "Ritenute");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_FORM, 280, 12, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_FORM, "Ritenute");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_IMPVARIAZION, -1, -1);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_IMPVARIAZION, PPQRY_LIQ11, "A.RITENUTE", "RECORLIQRITE", 3, 14, 2, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, MyGlb.PANEL_LIST, 112, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, MyGlb.PANEL_LIST, 64);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, MyGlb.PANEL_LIST, "Docum.");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, MyGlb.PANEL_FORM, 8, 36, 504, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DOCUMENTO, MyGlb.PANEL_FORM, "Documento");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_DOCUMENTO, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_DOCUMENTO, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_DOCUMENTO, PPQRY_LIQ11, "DECODE(A.NUMERO_DOC, NULL, '', 'Doc. ' || A.NUMERO_DOC || '/' || TO_CHAR ( A.ANNO_DOC ) || DECODE(B.D_DATA_DOC, TO_DATE(to_number(NULL)), '', ' - ' || TO_CHAR ( B.D_DATA_DOC )))", "DOCUMENTO", 5, 99, 0, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, MyGlb.PANEL_LIST, 168, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, MyGlb.PANEL_LIST, 80);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, MyGlb.PANEL_FORM, 8, 60, 504, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_UFFICIO, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_UFFICIO, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_UFFICIO, PPQRY_LIQ11, "DECODE(A.UFFICIO, to_number(NULL), '', TO_CHAR ( A.UFFICIO ) || ' - ' || C.DESCRIZIONE)", "UFFICIO", 5, 99, 0, -13997);
  }

  private void PAN_SCHEDAINFORM_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCHEDAINFORM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCHEDAINFORM.SetIMDB(IMDB, "PQRY_LIQ11", true);
    PAN_SCHEDAINFORM.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPORTO as RECORLIQIMPO, ");
    SQL.append("  A.RITENUTE as RECORLIQRITE, ");
    SQL.append("  DECODE(A.NUMERO_DOC, NULL, '', 'Doc. ' || A.NUMERO_DOC || '/' || TO_CHAR ( A.ANNO_DOC ) || DECODE(B.D_DATA_DOC, TO_DATE(to_number(NULL)), '', ' - ' || TO_CHAR ( B.D_DATA_DOC ))) as DOCUMENTO, ");
    SQL.append("  DECODE(A.UFFICIO, to_number(NULL), '', TO_CHAR ( A.UFFICIO ) || ' - ' || C.DESCRIZIONE) as UFFICIO ");
    PAN_SCHEDAINFORM.SetQuery(PPQRY_LIQ11, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  FAT B, ");
    SQL.append("  T53 C ");
    PAN_SCHEDAINFORM.SetQuery(PPQRY_LIQ11, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.CODICE(+) = A.UFFICIO) ");
    SQL.append("and   (B.ANNO_PROG(+) = A.FAT_ANNO_PROG) ");
    SQL.append("and   (B.NUMERO_PROG(+) = A.FAT_NUMERO_PROG) ");
    SQL.append("and   (A.ANNO_LIQ = ~~TBL_VALONODOCORR.NODCORANNLIQ~~) ");
    SQL.append("and   (A.NUMERO_LIQ = ~~TBL_VALONODOCORR.NODCORNUMLIQ~~) ");
    PAN_SCHEDAINFORM.SetQuery(PPQRY_LIQ11, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDAINFORM.SetQuery(PPQRY_LIQ11, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDAINFORM.SetQuery(PPQRY_LIQ11, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDAINFORM.SetQuery(PPQRY_LIQ11, 5, SQL, -1, "");
    PAN_SCHEDAINFORM.SetQueryDB(PPQRY_LIQ11, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEDAINFORM.SetMasterTable(0, "LIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCHEDAINFORM.Status() == 2)
    {
      int oldListQBE = PAN_SCHEDAINFORM.iUseListQBE;
      PAN_SCHEDAINFORM.iUseListQBE = 0;
      PAN_SCHEDAINFORM.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCHEDAINFORM.PanelCommand(Glb.PCM_FIND);
      PAN_SCHEDAINFORM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
