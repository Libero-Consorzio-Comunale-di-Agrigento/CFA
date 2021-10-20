// **********************************************
// Elenco Bolle
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoBolle extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ELENCOBOLLE_NUMEROBOLLA = 0;
  private static int PFL_ELENCOBOLLE_DATABOLLA = 1;
  private static int PFL_ELENCOBOLLE_QUANTITA = 2;
  private static int PFL_ELENCOBOLLE_ESTREMORDINE = 3;

  private static int PPQRY_DETTAGLBOLL2 = 0;


  IDPanel PAN_ELENCOBOLLE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM41(IMDB);
    //
    //
    Init_PQRY_DETTAGLBOLL2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM41(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM41, 3);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM41, "TBL_PARAM41");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM41,IMDBDef2.FLD_PARAM41_ROWNAMANNBUO, "ROWNAMANNBUO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM41,IMDBDef2.FLD_PARAM41_ROWNAMANNBUO,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM41,IMDBDef2.FLD_PARAM41_ROWNAMNUMBUO, "ROWNAMNUMBUO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM41,IMDBDef2.FLD_PARAM41_ROWNAMNUMBUO,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM41,IMDBDef2.FLD_PARAM41_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM41,IMDBDef2.FLD_PARAM41_ROWNAMEPROGR,1,5,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM41, 0);
  }

  private static void Init_PQRY_DETTAGLBOLL2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_DETTAGLBOLL2, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_DETTAGLBOLL2, "PQRY_DETTAGLBOLL2");
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL2,IMDBDef10.PQSL_DETTAGLBOLL2_QUANTITA, "QUANTITA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL2,IMDBDef10.PQSL_DETTAGLBOLL2_QUANTITA,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL2,IMDBDef10.PQSL_DETTAGLBOLL2_NUMERO_BOLLA, "NUMERO_BOLLA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL2,IMDBDef10.PQSL_DETTAGLBOLL2_NUMERO_BOLLA,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL2,IMDBDef10.PQSL_DETTAGLBOLL2_DATA_BOLLA, "DATA_BOLLA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL2,IMDBDef10.PQSL_DETTAGLBOLL2_DATA_BOLLA,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL2,IMDBDef10.PQSL_DETTAGLBOLL2_PROGRESSIVO_BOLLA, "PROGRESSIVO_BOLLA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL2,IMDBDef10.PQSL_DETTAGLBOLL2_PROGRESSIVO_BOLLA,3,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_DETTAGLBOLL2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoBolle(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoBolle()
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
    FormIdx = MyGlb.FRM_ELENCOBOLLE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "39F3409A-72FD-4182-B2A7-BA53824BF1D3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 488;
    DesignHeight = 410;
    set_Caption(new IDVariant("Elenco Bolle"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 488;
    Frames[1].Height = 384;
    Frames[1].Caption = "Elenco Bolle";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 384;
    PAN_ELENCOBOLLE = new IDPanel(w, this, 1, "PAN_ELENCOBOLLE");
    Frames[1].Content = PAN_ELENCOBOLLE;
    PAN_ELENCOBOLLE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOBOLLE.VS = MainFrm.VisualStyleList;
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 488-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOBOLLE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "93F3902B-CBB8-4369-A9F0-246E42DE3FC7");
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 32, 48, 224, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOBOLLE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOBOLLE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOBOLLE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOBOLLE.InitStatus = 2;
    PAN_ELENCOBOLLE_Init();
    PAN_ELENCOBOLLE_InitFields();
    PAN_ELENCOBOLLE_InitQueries();
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
      PAN_ELENCOBOLLE.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoBolle);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoBolle.class.getName() : (Glb.ClassWithPackage(ElencoBolle.class) ? ElencoBolle.class.getName().substring(ElencoBolle.class.getPackage().getName().length() + 1) : ElencoBolle.class.getName()));
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
    IDVariant v_MESSAGGIO2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGGIO2 = (new IDVariant("Dett: ", IDVariant.STRING));
      v_MESSAGGIO1 = (new IDVariant("Ordine: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_ELENCOBOLLE.set_FieldText(PFL_ELENCOBOLLE_ESTREMORDINE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO1, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM41, IMDBDef2.FLD_PARAM41_ROWNAMNUMBUO, 0))), (new IDVariant(" - "))), MainFrm.Datetostring(IMDB.Value(IMDBDef14.PQRY_PARAMETRI269, IMDBDef14.PQSL_PARAMETRI269_PARADATAEMIS, 0))), (new IDVariant(" - "))), v_MESSAGGIO2), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM41, IMDBDef2.FLD_PARAM41_ROWNAMEPROGR, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef9.PQRY_CFA1, IMDBDef9.PQSL_CFA1_DESCRIZIONE, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoBolle", "LoadEvent", _e);
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
  private void PAN_ELENCOBOLLE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOBOLLE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOBOLLE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOBOLLE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOBOLLE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELENCOBOLLE);
    // Stub
  }

  private void PAN_ELENCOBOLLE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ELENCOBOLLE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOBOLLE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOBOLLE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOBOLLE_Init()
  {

    PAN_ELENCOBOLLE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOBOLLE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENCOBOLLE.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_ELENCOBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, "C4C8CB60-7D0C-4AC5-B73D-278AA966C327");
    PAN_ELENCOBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, "Numero Bolla");
    PAN_ELENCOBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, "");
    PAN_ELENCOBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, "8F66D2ED-769B-418F-8459-F10D828CF3DD");
    PAN_ELENCOBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, "Data Bolla");
    PAN_ELENCOBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, "");
    PAN_ELENCOBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, "630E52EE-9B66-4E6F-9934-CB6B5488EEBF");
    PAN_ELENCOBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, "Quantità");
    PAN_ELENCOBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, "");
    PAN_ELENCOBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, "4FAB2884-8859-47E8-8500-A66B729BB47C");
    PAN_ELENCOBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, "");
    PAN_ELENCOBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, MyGlb.VIS_ETICHEGRASSE);
    PAN_ELENCOBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ELENCOBOLLE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, MyGlb.PANEL_LIST, 32, 84, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, MyGlb.PANEL_LIST, "Numero Bolla");
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, MyGlb.PANEL_FORM, 4, 148, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_NUMEROBOLLA, MyGlb.PANEL_FORM, "Numero Bolla");
    PAN_ELENCOBOLLE.SetFieldPage(PFL_ELENCOBOLLE_NUMEROBOLLA, -1, -1);
    PAN_ELENCOBOLLE.SetFieldPanel(PFL_ELENCOBOLLE_NUMEROBOLLA, PPQRY_DETTAGLBOLL2, "B.NUMERO_BOLLA", "NUMERO_BOLLA", 5, 10, 0, -13997);
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, MyGlb.PANEL_LIST, 108, 84, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, MyGlb.PANEL_LIST, "Data Bolla");
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, MyGlb.PANEL_FORM, 4, 172, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, MyGlb.PANEL_FORM, 72);
    PAN_ELENCOBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_DATABOLLA, MyGlb.PANEL_FORM, "Data Bolla");
    PAN_ELENCOBOLLE.SetFieldPage(PFL_ELENCOBOLLE_DATABOLLA, -1, -1);
    PAN_ELENCOBOLLE.SetFieldPanel(PFL_ELENCOBOLLE_DATABOLLA, PPQRY_DETTAGLBOLL2, "B.DATA_BOLLA", "DATA_BOLLA", 6, 19, 0, -13997);
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, MyGlb.PANEL_LIST, 180, 84, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, MyGlb.PANEL_LIST, "Quantità");
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, MyGlb.PANEL_FORM, 4, 52, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, MyGlb.PANEL_FORM, 152);
    PAN_ELENCOBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_QUANTITA, MyGlb.PANEL_FORM, "Quantità");
    PAN_ELENCOBOLLE.SetFieldPage(PFL_ELENCOBOLLE_QUANTITA, -1, -1);
    PAN_ELENCOBOLLE.SetFieldUnbound(PFL_ELENCOBOLLE_QUANTITA, true);
    PAN_ELENCOBOLLE.SetFieldPanel(PFL_ELENCOBOLLE_QUANTITA, PPQRY_DETTAGLBOLL2, "SUM(NVL(A.QUANTITA, 0))", "QUANTITA", 3, 28, 6, -13997);
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, MyGlb.PANEL_LIST, 0, 4, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, MyGlb.PANEL_FORM, 0, 0, 320, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOBOLLE_ESTREMORDINE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOBOLLE.SetFieldPage(PFL_ELENCOBOLLE_ESTREMORDINE, -1, -1);
    PAN_ELENCOBOLLE.SetFieldPanel(PFL_ELENCOBOLLE_ESTREMORDINE, -1, "", "ESTREMORDINE", 0, 0, 0, -13997);
  }

  private void PAN_ELENCOBOLLE_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOBOLLE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCOBOLLE.SetIMDB(IMDB, "PQRY_DETTAGLBOLL2", true);
    PAN_ELENCOBOLLE.set_SetString(MyGlb.MASTER_ROWNAME, "DETTAGLI BOLLE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(NVL(A.QUANTITA, 0)) as QUANTITA, ");
    SQL.append("  B.NUMERO_BOLLA as NUMERO_BOLLA, ");
    SQL.append("  B.DATA_BOLLA as DATA_BOLLA, ");
    SQL.append("  A.PROGRESSIVO_BOLLA as PROGRESSIVO_BOLLA ");
    PAN_ELENCOBOLLE.SetQuery(PPQRY_DETTAGLBOLL2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DETTAGLI_BOLLE A, ");
    SQL.append("  BOLLE B ");
    PAN_ELENCOBOLLE.SetQuery(PPQRY_DETTAGLBOLL2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_BUONO = ~~TBL_PARAM41.ROWNAMANNBUO~~) ");
    SQL.append("and   (A.NUMERO_BUONO = ~~TBL_PARAM41.ROWNAMNUMBUO~~) ");
    SQL.append("and   (A.PROGRESSIVO_BUONO = ~~TBL_PARAM41.ROWNAMEPROGR~~) ");
    SQL.append("and   (A.PROGRESSIVO_BOLLA = B.PROGRESSIVO) ");
    PAN_ELENCOBOLLE.SetQuery(PPQRY_DETTAGLBOLL2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.PROGRESSIVO_BOLLA, ");
    SQL.append("  B.NUMERO_BOLLA, ");
    SQL.append("  B.DATA_BOLLA ");
    PAN_ELENCOBOLLE.SetQuery(PPQRY_DETTAGLBOLL2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOBOLLE.SetQuery(PPQRY_DETTAGLBOLL2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.NUMERO_BOLLA, ");
    SQL.append("  B.DATA_BOLLA ");
    PAN_ELENCOBOLLE.SetQuery(PPQRY_DETTAGLBOLL2, 5, SQL, -1, "");
    PAN_ELENCOBOLLE.SetQueryDB(PPQRY_DETTAGLBOLL2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOBOLLE.SetMasterTable(0, "DETTAGLI_BOLLE");
    PAN_ELENCOBOLLE.AddToSortList(PFL_ELENCOBOLLE_NUMEROBOLLA, true);
    PAN_ELENCOBOLLE.AddToSortList(PFL_ELENCOBOLLE_DATABOLLA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOBOLLE.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOBOLLE.iUseListQBE;
      PAN_ELENCOBOLLE.iUseListQBE = 0;
      PAN_ELENCOBOLLE.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOBOLLE.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOBOLLE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOBOLLE) PAN_ELENCOBOLLE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOBOLLE) PAN_ELENCOBOLLE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOBOLLE) PAN_ELENCOBOLLE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOBOLLE) PAN_ELENCOBOLLE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOBOLLE) PAN_ELENCOBOLLE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
