// **********************************************
// Scelta Voce Peg DL 77
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaVocePegDL77 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VOCEPEG_RISORSAINTER = 0;
  private static int PFL_VOCEPEG_CAPITOLO = 1;
  private static int PFL_VOCEPEG_ARTICOLO = 2;
  private static int PFL_VOCEPEG_DESCRIZIONE = 3;

  private static int PPQRY_CAP77 = 0;


  IDPanel PAN_VOCEPEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI423(IMDB);
    //
    //
    Init_PQRY_CAP77(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI423(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI423, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI423, "TBL_PARAMETRI423");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI423,IMDBDef1.FLD_PARAMETRI423_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI423,IMDBDef1.FLD_PARAMETRI423_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI423,IMDBDef1.FLD_PARAMETRI423_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI423,IMDBDef1.FLD_PARAMETRI423_ROWNAMEES,5,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI423, 0);
  }

  private static void Init_PQRY_CAP77(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_CAP77, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_CAP77, "PQRY_CAP77");
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_RECORDRISORS, "RECORDRISORS");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_RECORDRISORS,1,7,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_RECOCAP77DES, "RECOCAP77DES");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP77,IMDBDef7.PQSL_CAP77_RECOCAP77DES,5,140,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_CAP77, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaVocePegDL77(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaVocePegDL77()
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
    FormIdx = MyGlb.FRM_SCEVOCPEDL77;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "62AF2E83-D855-4C57-BBE1-C8BB695C3480";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 560;
    DesignHeight = 386;
    set_Caption(new IDVariant("Scelta Voce Peg DL 77"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 560;
    Frames[1].Height = 360;
    Frames[1].Caption = "Voce P E G";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_VOCEPEG = new IDPanel(w, this, 1, "PAN_VOCEPEG");
    Frames[1].Content = PAN_VOCEPEG;
    PAN_VOCEPEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VOCEPEG.VS = MainFrm.VisualStyleList;
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 560-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1A3DF252-3457-48D6-9E65-53DAF6BF6C8E");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 492, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VOCEPEG.InitStatus = 1;
    PAN_VOCEPEG_Init();
    PAN_VOCEPEG_InitFields();
    PAN_VOCEPEG_InitQueries();
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
      PAN_VOCEPEG.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaVocePegDL77);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaVocePegDL77.class.getName() : (Glb.ClassWithPackage(SceltaVocePegDL77.class) ? SceltaVocePegDL77.class.getName().substring(SceltaVocePegDL77.class.getPackage().getName().length() + 1) : SceltaVocePegDL77.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Voce P.e.g.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI423, IMDBDef1.FLD_PARAMETRI423_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_RISORSA = null;
        v_RISORSA = (new IDVariant("Risorsa"));
        PAN_VOCEPEG.set_Header(Glb.OBJ_FIELD,PFL_VOCEPEG_RISORSAINTER, new IDVariant(v_RISORSA).stringValue());
      }
      else
      {
        IDVariant v_INTERVENTO = null;
        v_INTERVENTO = (new IDVariant("Intervento"));
        PAN_VOCEPEG.set_Header(Glb.OBJ_FIELD,PFL_VOCEPEG_RISORSAINTER, new IDVariant(v_INTERVENTO).stringValue());
      }
      set_Caption(IDL.Add(IDL.Add((new IDVariant("Scelta Voce P.e.g. DL 77")), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef1.TBL_PARAMETRI423, IMDBDef1.FLD_PARAMETRI423_ROWNAMEESERC, 0))));
      CloseOnSelection = (new IDVariant(-1)).booleanValue();
      Frames[PAN_VOCEPEG.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVocePegDL77", "LoadEvent", _e);
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
  private void PAN_VOCEPEG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VOCEPEG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VOCEPEG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VOCEPEG, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VOCEPEG_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VOCEPEG);
    // Stub
  }

  private void PAN_VOCEPEG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VOCEPEG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VOCEPEG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VOCEPEG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VOCEPEG_Init()
  {

    PAN_VOCEPEG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VOCEPEG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VOCEPEG.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, "CDD7F0B8-15EF-454A-AD86-38E50F2BCEFD");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, "RisorsaIntervento");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, "8D2A4C26-5C1A-45B5-84C7-B0198B37FC8A");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, "Capitolo");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, "8B9F3D39-8829-4491-A5E8-17DF1A6C8812");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, "Articolo");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VOCEPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, "6DEBAE00-8E8D-4AA6-8B6D-114643502AFE");
    PAN_VOCEPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, "Descrizione");
    PAN_VOCEPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, "");
    PAN_VOCEPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCEPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_VOCEPEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, MyGlb.PANEL_LIST, 128);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, MyGlb.PANEL_LIST, "RisorsaIn.");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, MyGlb.PANEL_FORM, 128);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_RISORSAINTER, MyGlb.PANEL_FORM, "RisorsaIntervento");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_RISORSAINTER, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_RISORSAINTER, PPQRY_CAP77, "A.RISORSA_INTERVENTO", "RECORDRISORS", 1, 7, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, 80, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_CAPITOLO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_CAPITOLO, PPQRY_CAP77, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, 148, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, 4, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_ARTICOLO, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_ARTICOLO, PPQRY_CAP77, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 180, 36, 312, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VOCEPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCEPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_VOCEPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VOCEPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCEPEG_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VOCEPEG.SetFieldPage(PFL_VOCEPEG_DESCRIZIONE, -1, -1);
    PAN_VOCEPEG.SetFieldPanel(PFL_VOCEPEG_DESCRIZIONE, PPQRY_CAP77, "A.DESCRIZIONE", "RECOCAP77DES", 5, 140, 0, -13997);
  }

  private void PAN_VOCEPEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_VOCEPEG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VOCEPEG.SetIMDB(IMDB, "PQRY_CAP77", true);
    PAN_VOCEPEG.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.RISORSA_INTERVENTO as RECORDRISORS, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE as RECOCAP77DES ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP77, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP_77 A ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP77, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI423.ROWNAMEESERC~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI423.ROWNAMEES~~) ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CORRISPONDENZE_CAP_ARM B ");
    SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.RISORSA_INTERVENTO = A.RISORSA_INTERVENTO) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append(")))) ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP77, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCEPEG.SetQuery(PPQRY_CAP77, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCEPEG.SetQuery(PPQRY_CAP77, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.RISORSA_INTERVENTO, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_VOCEPEG.SetQuery(PPQRY_CAP77, 5, SQL, -1, "");
    PAN_VOCEPEG.SetQueryDB(PPQRY_CAP77, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VOCEPEG.SetMasterTable(0, "CAP_77");
    PAN_VOCEPEG.AddToSortList(PFL_VOCEPEG_RISORSAINTER, true);
    PAN_VOCEPEG.AddToSortList(PFL_VOCEPEG_CAPITOLO, true);
    PAN_VOCEPEG.AddToSortList(PFL_VOCEPEG_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VOCEPEG.Status() == 2)
    {
      int oldListQBE = PAN_VOCEPEG.iUseListQBE;
      PAN_VOCEPEG.iUseListQBE = 0;
      PAN_VOCEPEG.PanelCommand(Glb.PCM_SEARCH);
      PAN_VOCEPEG.PanelCommand(Glb.PCM_FIND);
      PAN_VOCEPEG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VOCEPEG) PAN_VOCEPEG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
