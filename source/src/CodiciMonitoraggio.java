// **********************************************
// Codici Monitoraggio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CodiciMonitoraggio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VOCIPS_ESERCIZIO = 0;
  private static int PFL_VOCIPS_CODICE = 1;
  private static int PFL_VOCIPS_DESCRIZIONE = 2;
  private static int PFL_VOCIPS_TIPOSTAMPA = 3;

  private static int PPQRY_VOCIPS8 = 0;


  IDPanel PAN_VOCIPS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI75(IMDB);
    //
    //
    Init_PQRY_VOCIPS8(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI75(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI75, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI75, "TBL_PARAMETRI75");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI75,IMDBDef1.FLD_PARAMETRI75_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI75,IMDBDef1.FLD_PARAMETRI75_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI75,IMDBDef1.FLD_PARAMETRI75_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI75,IMDBDef1.FLD_PARAMETRI75_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI75,IMDBDef1.FLD_PARAMETRI75_PARATIPOSTAM, "PARATIPOSTAM");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI75,IMDBDef1.FLD_PARAMETRI75_PARATIPOSTAM,5,3,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI75, 0);
  }

  private static void Init_PQRY_VOCIPS8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VOCIPS8, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_VOCIPS8, "PQRY_VOCIPS8");
    IMDB.set_FldCode(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSSEQUEN, "VOCIPSSEQUEN");
    IMDB.SetFldParams(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSSEQUEN,1,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSESERCI, "VOCIPSESERCI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSESERCI,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSTIPSTA, "VOCIPSTIPSTA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSTIPSTA,5,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSCODICE, "VOCIPSCODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSCODICE,5,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSDESCRI, "VOCIPSDESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VOCIPS8,IMDBDef7.PQSL_VOCIPS8_VOCIPSDESCRI,5,200,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VOCIPS8, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CodiciMonitoraggio(MyWebEntryPoint w, IMDBObj imdb)
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
  public CodiciMonitoraggio()
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
    FormIdx = MyGlb.FRM_CODICIMONITO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6DB78EA3-4BB3-4F04-93C8-A9319809980B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 580;
    DesignHeight = 354;
    set_Caption(new IDVariant("Codici Monitoraggio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 580;
    Frames[1].Height = 328;
    Frames[1].Caption = "Codici Monitoraggio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 328;
    PAN_VOCIPS = new IDPanel(w, this, 1, "PAN_VOCIPS");
    Frames[1].Content = PAN_VOCIPS;
    PAN_VOCIPS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VOCIPS.VS = MainFrm.VisualStyleList;
    PAN_VOCIPS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VOCIPS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CD72CC20-7065-4DBC-A2A9-848920C9BF2B");
    PAN_VOCIPS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 452, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VOCIPS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VOCIPS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VOCIPS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VOCIPS.InitStatus = 1;
    PAN_VOCIPS_Init();
    PAN_VOCIPS_InitFields();
    PAN_VOCIPS_InitQueries();
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
      PAN_VOCIPS.UpdatePanel(MainFrm);
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
    return (obj instanceof CodiciMonitoraggio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CodiciMonitoraggio.class.getName() : (Glb.ClassWithPackage(CodiciMonitoraggio.class) ? CodiciMonitoraggio.class.getName().substring(CodiciMonitoraggio.class.getPackage().getName().length() + 1) : CodiciMonitoraggio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      MainFrm.ErrObj.ProcError ("CodiciMonitoraggio", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI75, IMDBDef1.FLD_PARAMETRI75_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI75, IMDBDef1.FLD_PARAMETRI75_PARAMES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI75, IMDBDef1.FLD_PARAMETRI75_PARATIPOSTAM, 0, new IDVariant());
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
  private void PAN_VOCIPS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VOCIPS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VOCIPS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VOCIPS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VOCIPS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VOCIPS);
    // Stub
  }

  private void PAN_VOCIPS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VOCIPS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VOCIPS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VOCIPS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VOCIPS_Init()
  {

    PAN_VOCIPS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VOCIPS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VOCIPS.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_VOCIPS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, "5ABB92C2-F85F-4EF6-9CD4-8D6D02C4A789");
    PAN_VOCIPS.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, "ESERCIZIO");
    PAN_VOCIPS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, "");
    PAN_VOCIPS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VOCIPS.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VOCIPS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, "C0A9916C-2845-4487-A884-062154F09DDF");
    PAN_VOCIPS.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, "Codice");
    PAN_VOCIPS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, "");
    PAN_VOCIPS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCIPS.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VOCIPS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, "1BDEB729-C89F-4A0F-8290-719696BA7C7B");
    PAN_VOCIPS.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, "Descrizione");
    PAN_VOCIPS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, "");
    PAN_VOCIPS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCIPS.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VOCIPS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, "54A0FD6C-9D25-4EC4-91BD-4366F920A2C6");
    PAN_VOCIPS.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, "TIPO STAMPA");
    PAN_VOCIPS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, "");
    PAN_VOCIPS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VOCIPS.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_VOCIPS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VOCIPS.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_VOCIPS.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VOCIPS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_VOCIPS.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, MyGlb.PANEL_FORM, 104);
    PAN_VOCIPS.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VOCIPS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPS_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_VOCIPS.SetFieldPage(PFL_VOCIPS_ESERCIZIO, -1, -1);
    PAN_VOCIPS.SetFieldPanel(PFL_VOCIPS_ESERCIZIO, PPQRY_VOCIPS8, "A.ESERCIZIO", "VOCIPSESERCI", 1, 4, 0, -13997);
    PAN_VOCIPS.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_VOCIPS.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VOCIPS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VOCIPS.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, MyGlb.PANEL_FORM, 4, 52, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, MyGlb.PANEL_FORM, 104);
    PAN_VOCIPS.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VOCIPS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPS_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VOCIPS.SetFieldPage(PFL_VOCIPS_CODICE, -1, -1);
    PAN_VOCIPS.SetFieldPanel(PFL_VOCIPS_CODICE, PPQRY_VOCIPS8, "A.CODICE", "VOCIPSCODICE", 5, 5, 0, -13997);
    PAN_VOCIPS.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VOCIPS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, MyGlb.PANEL_LIST, 120);
    PAN_VOCIPS.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VOCIPS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VOCIPS.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, MyGlb.PANEL_FORM, 104);
    PAN_VOCIPS.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VOCIPS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPS_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VOCIPS.SetFieldPage(PFL_VOCIPS_DESCRIZIONE, -1, -1);
    PAN_VOCIPS.SetFieldPanel(PFL_VOCIPS_DESCRIZIONE, PPQRY_VOCIPS8, "A.DESCRIZIONE", "VOCIPSDESCRI", 5, 200, 0, -13997);
    PAN_VOCIPS.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, MyGlb.PANEL_LIST, 396, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, MyGlb.PANEL_LIST, 88);
    PAN_VOCIPS.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_VOCIPS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, MyGlb.PANEL_LIST, "TP. STM.");
    PAN_VOCIPS.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIPS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, MyGlb.PANEL_FORM, 104);
    PAN_VOCIPS.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_VOCIPS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIPS_TIPOSTAMPA, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_VOCIPS.SetFieldPage(PFL_VOCIPS_TIPOSTAMPA, -1, -1);
    PAN_VOCIPS.SetFieldPanel(PFL_VOCIPS_TIPOSTAMPA, PPQRY_VOCIPS8, "A.TIPO_STAMPA", "VOCIPSTIPSTA", 5, 3, 0, -13997);
  }

  private void PAN_VOCIPS_InitQueries()
  {
    StringBuffer SQL;

    PAN_VOCIPS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VOCIPS.SetIMDB(IMDB, "PQRY_VOCIPS8", true);
    PAN_VOCIPS.set_SetString(MyGlb.MASTER_ROWNAME, "VOCI PS");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SEQUENZA as VOCIPSSEQUEN, ");
    SQL.append("  A.ESERCIZIO as VOCIPSESERCI, ");
    SQL.append("  A.TIPO_STAMPA as VOCIPSTIPSTA, ");
    SQL.append("  A.CODICE as VOCIPSCODICE, ");
    SQL.append("  A.DESCRIZIONE as VOCIPSDESCRI ");
    PAN_VOCIPS.SetQuery(PPQRY_VOCIPS8, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VOCI_PS A ");
    PAN_VOCIPS.SetQuery(PPQRY_VOCIPS8, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI75.PARAMESERCIZ~~ OR A.ESERCIZIO = 0) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI75.PARAMES~~) ");
    SQL.append("and   (A.TIPO_STAMPA = ~~TBL_PARAMETRI75.PARATIPOSTAM~~) ");
    SQL.append("and   (A.DA_VISUALIZZARE = 'SI') ");
    PAN_VOCIPS.SetQuery(PPQRY_VOCIPS8, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCIPS.SetQuery(PPQRY_VOCIPS8, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCIPS.SetQuery(PPQRY_VOCIPS8, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_VOCIPS.SetQuery(PPQRY_VOCIPS8, 5, SQL, -1, "");
    PAN_VOCIPS.SetQueryDB(PPQRY_VOCIPS8, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VOCIPS.SetMasterTable(0, "VOCI_PS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VOCIPS.Status() == 2)
    {
      int oldListQBE = PAN_VOCIPS.iUseListQBE;
      PAN_VOCIPS.iUseListQBE = 0;
      PAN_VOCIPS.PanelCommand(Glb.PCM_SEARCH);
      PAN_VOCIPS.PanelCommand(Glb.PCM_FIND);
      PAN_VOCIPS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VOCIPS) PAN_VOCIPS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCIPS) PAN_VOCIPS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VOCIPS) PAN_VOCIPS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCIPS) PAN_VOCIPS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VOCIPS) PAN_VOCIPS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
