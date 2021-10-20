// **********************************************
// D Disponibilita Mono
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DDisponibilitaMono extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DISPONIBILIT_IMATALNEDESI = 0;
  private static int PFL_DISPONIBILIT_ORDINATO = 1;
  private static int PFL_DISPONIBILIT_ARRIVATO = 2;
  private static int PFL_DISPONIBILIT_LIQUIDABILE = 3;
  private static int PFL_DISPONIBILIT_LIQUIDATO = 4;
  private static int PFL_DISPONIBILIT_SPESCASSECON = 5;
  private static int PFL_DISPONIBILIT_DISPONIBILIT = 6;

  private static int PPQRY_GE4IMPEGNI = 0;


  IDPanel PAN_DISPONIBILIT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI71(IMDB);
    //
    //
    Init_PQRY_GE4IMPEGNI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI71(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI71, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI71, "TBL_PARAMETRI71");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMANNIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMNUMIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMANSUIM, "ROWNAMANSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMANSUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMNUSUIM, "ROWNAMNUSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMNUSUIM,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMIMSUIM, "ROWNAMIMSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI71,IMDBDef4.FLD_PARAMETRI71_ROWNAMIMSUIM,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI71, 0);
  }

  private static void Init_PQRY_GE4IMPEGNI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_GE4IMPEGNI, 7);
    IMDB.set_TblCode(IMDBDef13.PQRY_GE4IMPEGNI, "PQRY_GE4IMPEGNI");
    IMDB.set_FldCode(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_IMPORTO_ATTUALE, "IMPORTO_ATTUALE");
    IMDB.SetFldParams(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_IMPORTO_ATTUALE,3,15,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_ORDINATO, "TOT_ORDINATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_ORDINATO,3,15,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_ARRIVATO, "TOT_ARRIVATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_ARRIVATO,3,15,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_LIQUIDABILE, "TOT_LIQUIDABILE");
    IMDB.SetFldParams(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_LIQUIDABILE,3,15,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_LIQUIDATO, "TOT_LIQUIDATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_LIQUIDATO,3,15,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_SPESE_CASSA_ECON, "TOT_SPESE_CASSA_ECON");
    IMDB.SetFldParams(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_TOT_SPESE_CASSA_ECON,3,15,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_GE4IMPEGDISP, "GE4IMPEGDISP");
    IMDB.SetFldParams(IMDBDef13.PQRY_GE4IMPEGNI,IMDBDef13.PQSL_GE4IMPEGNI_GE4IMPEGDISP,3,28,6);
    IMDB.TblAddNew(IMDBDef13.PQRY_GE4IMPEGNI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DDisponibilitaMono(MyWebEntryPoint w, IMDBObj imdb)
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
  public DDisponibilitaMono()
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
    FormIdx = MyGlb.FRM_DDISPONIMONO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "80780B6E-DB76-4999-A874-26CB74049026";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 512;
    DesignHeight = 246;
    set_Caption(new IDVariant("D Disponibilita Mono"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 512;
    Frames[1].Height = 220;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Disponibilità";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 220;
    PAN_DISPONIBILIT = new IDPanel(w, this, 1, "PAN_DISPONIBILIT");
    Frames[1].Content = PAN_DISPONIBILIT;
    PAN_DISPONIBILIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISPONIBILIT.VS = MainFrm.VisualStyleList;
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 512-MyGlb.PAN_OFFS_X, 220-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "617643E0-D60B-46DC-984C-607AA996AC3A");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 468, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISPONIBILIT.InitStatus = 2;
    PAN_DISPONIBILIT_Init();
    PAN_DISPONIBILIT_InitFields();
    PAN_DISPONIBILIT_InitQueries();
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
      PAN_DISPONIBILIT.UpdatePanel(MainFrm);
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
    return (obj instanceof DDisponibilitaMono);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DDisponibilitaMono.class.getName() : (Glb.ClassWithPackage(DDisponibilitaMono.class) ? DDisponibilitaMono.class.getName().substring(DDisponibilitaMono.class.getPackage().getName().length() + 1) : DDisponibilitaMono.class.getName()));
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
    IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Disponibilità", IDVariant.STRING));
      v_CAPTION1 = (new IDVariant("Importo Attuale", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMIMSUIM, 0).equals((new IDVariant("I")), true))
      {
        PAN_DISPONIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DISPONIBILIT_IMATALNEDESI, new IDVariant(v_CAPTION1).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DDisponibilitaMono", "LoadEvent", _e);
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
  private void PAN_DISPONIBILIT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISPONIBILIT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISPONIBILIT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISPONIBILIT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISPONIBILIT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DISPONIBILIT);
    // Stub
  }

  private void PAN_DISPONIBILIT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISPONIBILIT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISPONIBILIT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISPONIBILIT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISPONIBILIT_Init()
  {

    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, "C9919C2F-992E-447A-80BC-579401EB76E5");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, "Importo Attuale (al netto dei sub-impegni)");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, "Importo Attuale");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, "E55FF657-D183-425B-A83C-AA9807F2EADE");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, "Ordinato");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, "3804E076-BD52-4958-AAC2-327A13DF3166");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, "Arrivato");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, "C04B56EE-3D3D-499C-BD8E-2AFE50D24F9E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, "Liquidabile");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, "8A6367B4-9AD0-4767-841A-C39BD6D3F6E0");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, "Liquidato");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, "760DB3FE-AA59-4CFA-B51F-67E4B4D2DD8B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, "Spese Cassa Economale");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "50F751BB-2A1E-4D8D-9E25-CD661639C588");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "Disponibilità");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISPONIBILIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, MyGlb.PANEL_LIST, 296, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, MyGlb.PANEL_LIST, 104);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, MyGlb.PANEL_LIST, "I. A. a. n. d. s. i.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, MyGlb.PANEL_FORM, 16, 12, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, MyGlb.PANEL_FORM, 248);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMATALNEDESI, MyGlb.PANEL_FORM, "Importo Attuale (al netto dei sub-impegni)");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMATALNEDESI, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMATALNEDESI, PPQRY_GE4IMPEGNI, "A.IMPORTO_ATTUALE", "IMPORTO_ATTUALE", 3, 15, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, MyGlb.PANEL_LIST, 336, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, MyGlb.PANEL_LIST, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, MyGlb.PANEL_LIST, "Ordinato");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, MyGlb.PANEL_FORM, 176, 36, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, MyGlb.PANEL_FORM, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINATO, MyGlb.PANEL_FORM, "Ordinato");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_ORDINATO, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_ORDINATO, PPQRY_GE4IMPEGNI, "A.TOT_ORDINATO", "TOT_ORDINATO", 3, 15, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, MyGlb.PANEL_LIST, 392, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, MyGlb.PANEL_LIST, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, MyGlb.PANEL_LIST, "Arrivato");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, MyGlb.PANEL_FORM, 180, 60, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, MyGlb.PANEL_FORM, 84);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ARRIVATO, MyGlb.PANEL_FORM, "Arrivato");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_ARRIVATO, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_ARRIVATO, PPQRY_GE4IMPEGNI, "A.TOT_ARRIVATO", "TOT_ARRIVATO", 3, 15, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, MyGlb.PANEL_LIST, 464, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, MyGlb.PANEL_LIST, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, MyGlb.PANEL_LIST, "Liq.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, MyGlb.PANEL_FORM, 168, 84, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, MyGlb.PANEL_FORM, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDABILE, MyGlb.PANEL_FORM, "Liquidabile");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQUIDABILE, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQUIDABILE, PPQRY_GE4IMPEGNI, "A.TOT_LIQUIDABILE", "TOT_LIQUIDABILE", 3, 15, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, MyGlb.PANEL_LIST, 504, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, MyGlb.PANEL_LIST, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, MyGlb.PANEL_LIST, "Liq.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, MyGlb.PANEL_FORM, 176, 108, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, MyGlb.PANEL_FORM, 88);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQUIDATO, MyGlb.PANEL_FORM, "Liquidato");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQUIDATO, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQUIDATO, PPQRY_GE4IMPEGNI, "A.TOT_LIQUIDATO", "TOT_LIQUIDATO", 3, 15, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_LIST, 544, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_LIST, 128);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_LIST, "Sp. Cassa Economale");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_FORM, 104, 132, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_FORM, 160);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_FORM, "Spese Cassa Economale");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_SPESCASSECON, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_SPESCASSECON, PPQRY_GE4IMPEGNI, "A.TOT_SPESE_CASSA_ECON", "TOT_SPESE_CASSA_ECON", 3, 15, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 164, 156, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_DISPONIBILIT, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_DISPONIBILIT, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_DISPONIBILIT, PPQRY_GE4IMPEGNI, "NVL(A.IMPORTO_ATTUALE, 0) - (NVL(A.TOT_ORDINATO, 0) + NVL(A.TOT_ARRIVATO, 0) + NVL(A.TOT_LIQUIDABILE, 0) + NVL(A.TOT_LIQUIDATO, 0) + NVL(A.TOT_SPESE_CASSA_ECON, 0))", "GE4IMPEGDISP", 3, 28, 6, -13997);
  }

  private void PAN_DISPONIBILIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISPONIBILIT.SetIMDB(IMDB, "PQRY_GE4IMPEGNI", true);
    PAN_DISPONIBILIT.set_SetString(MyGlb.MASTER_ROWNAME, "GE4 IMPEGNI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPORTO_ATTUALE as IMPORTO_ATTUALE, ");
    SQL.append("  A.TOT_ORDINATO as TOT_ORDINATO, ");
    SQL.append("  A.TOT_ARRIVATO as TOT_ARRIVATO, ");
    SQL.append("  A.TOT_LIQUIDABILE as TOT_LIQUIDABILE, ");
    SQL.append("  A.TOT_LIQUIDATO as TOT_LIQUIDATO, ");
    SQL.append("  A.TOT_SPESE_CASSA_ECON as TOT_SPESE_CASSA_ECON, ");
    SQL.append("  NVL(A.IMPORTO_ATTUALE, 0) - (NVL(A.TOT_ORDINATO, 0) + NVL(A.TOT_ARRIVATO, 0) + NVL(A.TOT_LIQUIDABILE, 0) + NVL(A.TOT_LIQUIDATO, 0) + NVL(A.TOT_SPESE_CASSA_ECON, 0)) as GE4IMPEGDISP ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_GE4IMPEGNI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  GE4_IMPEGNI A ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_GE4IMPEGNI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((~~TBL_PARAMETRI71.ROWNAMIMSUIM~~ = 'S' AND A.ANNO_IMPEGNO = ~~TBL_PARAMETRI71.ROWNAMANNIMP~~ AND A.NUMERO_IMPEGNO = ~~TBL_PARAMETRI71.ROWNAMNUMIMP~~ AND A.ANNO_SUBIMPEGNO = ~~TBL_PARAMETRI71.ROWNAMANSUIM~~ AND A.NUMERO_SUBIMPEGNO = ~~TBL_PARAMETRI71.ROWNAMNUSUIM~~) OR (~~TBL_PARAMETRI71.ROWNAMIMSUIM~~ = 'I' AND A.ANNO_IMPEGNO = ~~TBL_PARAMETRI71.ROWNAMANNIMP~~ AND A.NUMERO_IMPEGNO = ~~TBL_PARAMETRI71.ROWNAMNUMIMP~~ AND A.ANNO_SUBIMPEGNO = 0 AND A.NUMERO_SUBIMPEGNO = 0)) ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_GE4IMPEGNI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_GE4IMPEGNI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_GE4IMPEGNI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_GE4IMPEGNI, 5, SQL, -1, "");
    PAN_DISPONIBILIT.SetQueryDB(PPQRY_GE4IMPEGNI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPONIBILIT.SetMasterTable(0, "GE4_IMPEGNI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISPONIBILIT.Status() == 2)
    {
      int oldListQBE = PAN_DISPONIBILIT.iUseListQBE;
      PAN_DISPONIBILIT.iUseListQBE = 0;
      PAN_DISPONIBILIT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISPONIBILIT.PanelCommand(Glb.PCM_FIND);
      PAN_DISPONIBILIT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
