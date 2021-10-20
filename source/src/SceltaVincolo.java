// **********************************************
// Scelta Vincolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaVincolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SCADUTI = 0;

  private static int PPQRY_MASTERQUERY1 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_VINCOLI_CODICE = 0;
  private static int PFL_VINCOLI_DESCRIZIONE = 1;
  private static int PFL_VINCOLI_SCADENZA = 2;

  private static int PPQRY_VINCOLI2 = 0;


  IDPanel PAN_VINCOLI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI162(IMDB);
    //
    //
    Init_PQRY_VINCOLI2(IMDB);
    Init_PQRY_MASTERQUERY1(IMDB);
    Init_PQRY_MASTERQUERY1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI162(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI162, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI162, "TBL_PARAMETRI162");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI162,IMDBDef1.FLD_PARAMETRI162_PARAMSCADUTI, "PARAMSCADUTI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI162,IMDBDef1.FLD_PARAMETRI162_PARAMSCADUTI,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI162,IMDBDef1.FLD_PARAMETRI162_PARANASCPARA, "PARANASCPARA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI162,IMDBDef1.FLD_PARAMETRI162_PARANASCPARA,5,50,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI162,IMDBDef1.FLD_PARAMETRI162_PARADATASCAD, "PARADATASCAD");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI162,IMDBDef1.FLD_PARAMETRI162_PARADATASCAD,6,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI162, 0);
  }

  private static void Init_PQRY_VINCOLI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VINCOLI2, 3);
    IMDB.set_TblCode(IMDBDef7.PQRY_VINCOLI2, "PQRY_VINCOLI2");
    IMDB.set_FldCode(IMDBDef7.PQRY_VINCOLI2,IMDBDef7.PQSL_VINCOLI2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VINCOLI2,IMDBDef7.PQSL_VINCOLI2_CODICE,1,7,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VINCOLI2,IMDBDef7.PQSL_VINCOLI2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VINCOLI2,IMDBDef7.PQSL_VINCOLI2_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VINCOLI2,IMDBDef7.PQSL_VINCOLI2_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VINCOLI2,IMDBDef7.PQSL_VINCOLI2_SCADENZA,6,19,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VINCOLI2, 0);
  }

  private static void Init_PQRY_MASTERQUERY1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_MASTERQUERY1, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_MASTERQUERY1, "PQRY_MASTERQUERY1");
    IMDB.set_FldCode(IMDBDef7.PQRY_MASTERQUERY1,IMDBDef7.PQSL_MASTERQUERY1_PARAMSCADUTI, "PARAMSCADUTI");
    IMDB.SetFldParams(IMDBDef7.PQRY_MASTERQUERY1,IMDBDef7.PQSL_MASTERQUERY1_PARAMSCADUTI,5,2,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_MASTERQUERY1, 0);
  }

  private static void Init_PQRY_MASTERQUERY1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_MASTERQUERY1_RS, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_MASTERQUERY1_RS, "PQRY_MASTERQUERY1_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_MASTERQUERY1_RS,IMDBDef7.PQSL_MASTERQUERY1_PARAMSCADUTI, "PARAMSCADUTI");
    IMDB.SetFldParams(IMDBDef7.PQRY_MASTERQUERY1_RS,IMDBDef7.PQSL_MASTERQUERY1_PARAMSCADUTI,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaVincolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaVincolo()
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
    FormIdx = MyGlb.FRM_SCELTAVINCOL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7277B75D-4E99-454D-9CF2-FFB620E22183";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 508;
    DesignHeight = 410;
    set_Caption(new IDVariant("Scelta Vincolo"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 508;
    Frames[1].Height = 384;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.145833;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 508;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 508-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7C952AA2-B341-408E-A2DC-9E737B738C39");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 56, 16, 44, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 508;
    Frames[3].Height = 328;
    Frames[3].Caption = "Vincoli";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 328;
    PAN_VINCOLI = new IDPanel(w, this, 3, "PAN_VINCOLI");
    Frames[3].Content = PAN_VINCOLI;
    PAN_VINCOLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VINCOLI.VS = MainFrm.VisualStyleList;
    PAN_VINCOLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 508-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0789A460-F68C-4609-AED0-C70764C1FDCF");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 456, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VINCOLI.InitStatus = 2;
    PAN_VINCOLI_Init();
    PAN_VINCOLI_InitFields();
    PAN_VINCOLI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI162, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELTAVINCOL_MASTERQUERY1();
      }
      PAN_VINCOLI.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaVincolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaVincolo.class.getName() : (Glb.ClassWithPackage(SceltaVincolo.class) ? SceltaVincolo.class.getName().substring(SceltaVincolo.class.getPackage().getName().length() + 1) : SceltaVincolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Vincoli On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VINCOLI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VINCOLI);
      // 
      // Vincoli On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VINCOLI.set_ToolTip(Glb.OBJ_FIELD,PFL_VINCOLI_DESCRIZIONE,(new IDVariant(PAN_VINCOLI.FieldText(PFL_VINCOLI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVincolo", "VincoliOnDynamicPropertiesEvent", _e);
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
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI162, IMDBDef1.FLD_PARAMETRI162_PARANASCPARA, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVincolo", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("SceltaVincolo", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI162, IMDBDef1.FLD_PARAMETRI162_PARAMSCADUTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI162, IMDBDef1.FLD_PARAMETRI162_PARANASCPARA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI162, IMDBDef1.FLD_PARAMETRI162_PARADATASCAD, 0, new IDVariant());
  }

  // **********************************************************************
  // Master Query
  // Primary record source for panel data
  // **********************************************************************
  private void SCELTAVINCOL_MASTERQUERY1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_MASTERQUERY1_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI162, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI162, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_MASTERQUERY1_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_MASTERQUERY1_RS, 0, IMDBDef1.TBL_PARAMETRI162, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_MASTERQUERY1_RS, 0, 0, IMDBDef1.TBL_PARAMETRI162, IMDBDef1.FLD_PARAMETRI162_PARAMSCADUTI, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI162, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI162, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI162, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef7.PQRY_MASTERQUERY1_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VINCOLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VINCOLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VINCOLI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VINCOLI, Cancel);
    // Stub
  }

  private void PAN_VINCOLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VINCOLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VINCOLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VINCOLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VINCOLI_Init()
  {

    PAN_VINCOLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VINCOLI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VINCOLI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, "0D04F866-6DCF-442A-953B-D84318BA2150");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, "Codice");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, "B9E5D904-03AB-4D7D-84F4-8B5C50912170");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, "Descrizione");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, "F1541113-9D39-48A6-801E-F355FB3C2E55");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, "Scadenza");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VINCOLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_FORM, 4, 4, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_CODICE, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_CODICE, PPQRY_VINCOLI2, "A.CODICE", "CODICE", 1, 7, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_LIST, 48, 36, 328, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_DESCRIZIONE, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_DESCRIZIONE, PPQRY_VINCOLI2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 50, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_LIST, 376, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_FORM, 64);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_SCADENZA, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_SCADENZA, PPQRY_VINCOLI2, "A.SCADENZA", "SCADENZA", 6, 19, 0, -13997);
  }

  private void PAN_VINCOLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VINCOLI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VINCOLI.SetIMDB(IMDB, "PQRY_VINCOLI2", true);
    PAN_VINCOLI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.SCADENZA as SCADENZA ");
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (((~~TBL_PARAMETRI162.PARAMSCADUTI~~ IS NULL) AND (A.SCADENZA >= NVL(~~TBL_PARAMETRI162.PARADATASCAD~~, TRUNC( SYSDATE )) OR (A.SCADENZA IS NULL))) OR ~~PQRY_MASTERQUERY1.PARAMSCADUTI~~ = 'SI') ");
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI2, 5, SQL, -1, "");
    PAN_VINCOLI.SetQueryDB(PPQRY_VINCOLI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VINCOLI.SetMasterTable(0, "VINCOLI");
    PAN_VINCOLI.AddToSortList(PFL_VINCOLI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VINCOLI.Status() == 2)
    {
      int oldListQBE = PAN_VINCOLI.iUseListQBE;
      PAN_VINCOLI.iUseListQBE = 0;
      PAN_VINCOLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VINCOLI.PanelCommand(Glb.PCM_FIND);
      PAN_VINCOLI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, "DED3EA5C-49F8-4B89-B09C-C23B8D6F5484");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, "Scaduti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_LIST, 56, 52, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_LIST, "Scad.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_FORM, 388, 4, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADUTI, MyGlb.PANEL_FORM, "Scaduti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCADUTI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCADUTI, PPQRY_MASTERQUERY1, "A.PARAMSCADUTI", "PARAMSCADUTI", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SCADUTI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SCADUTI, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_MASTERQUERY1", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_MASTERQUERY1, IMDBDef7.PQRY_MASTERQUERY1_RS, IMDBDef1.TBL_PARAMETRI162);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SCADUTI, IMDBDef1.FLD_PARAMETRI162_PARAMSCADUTI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI162");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
