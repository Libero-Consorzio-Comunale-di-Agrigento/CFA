// **********************************************
// Stanziamenti Sull Obiettivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StanziamentiSullObiettivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_STANZIAMENTI_CAPITOLO = 0;
  private static int PFL_STANZIAMENTI_DESCRIZIONE = 1;
  private static int PFL_STANZIAMENTI_STANZINIZ = 2;
  private static int PFL_STANZIAMENTI_STANZDEF = 3;
  private static int PFL_STANZIAMENTI_IMPEGNATO = 4;
  private static int PFL_STANZIAMENTI_DISPONIBILIT = 5;

  private static int PPQRY_STANZIPROGE2 = 0;


  IDPanel PAN_STANZIAMENTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI351(IMDB);
    //
    //
    Init_PQRY_STANZIPROGE2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI351(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI351, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI351, "TBL_PARAMETRI351");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI351,IMDBDef1.FLD_PARAMETRI351_ROWNAMEOBIID, "ROWNAMEOBIID");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI351,IMDBDef1.FLD_PARAMETRI351_ROWNAMEOBIID,1,9,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI351,IMDBDef1.FLD_PARAMETRI351_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI351,IMDBDef1.FLD_PARAMETRI351_ROWNAMEES,5,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI351, 0);
  }

  private static void Init_PQRY_STANZIPROGE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_STANZIPROGE2, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_STANZIPROGE2, "PQRY_STANZIPROGE2");
    IMDB.set_FldCode(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STANPROGCAPI, "STANPROGCAPI");
    IMDB.SetFldParams(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STANPROGCAPI,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STAPROSTAINI, "STAPROSTAINI");
    IMDB.SetFldParams(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STAPROSTAINI,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STAPROSTADEF, "STAPROSTADEF");
    IMDB.SetFldParams(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STAPROSTADEF,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STANPROGIMPE, "STANPROGIMPE");
    IMDB.SetFldParams(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STANPROGIMPE,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STANPROGDISP, "STANPROGDISP");
    IMDB.SetFldParams(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_STANPROGDISP,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_DES_VOCE, "DES_VOCE");
    IMDB.SetFldParams(IMDBDef8.PQRY_STANZIPROGE2,IMDBDef8.PQSL_STANZIPROGE2_DES_VOCE,5,140,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_STANZIPROGE2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StanziamentiSullObiettivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public StanziamentiSullObiettivo()
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
    FormIdx = MyGlb.FRM_STANSULLOBIE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A3FA1BB3-615C-4192-8E9E-9A851C8816AB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 780;
    DesignHeight = 370;
    set_Caption(new IDVariant("Stanziamenti Sull Obiettivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 780;
    Frames[1].Height = 344;
    Frames[1].Caption = "Stanziamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_STANZIAMENTI = new IDPanel(w, this, 1, "PAN_STANZIAMENTI");
    Frames[1].Content = PAN_STANZIAMENTI;
    PAN_STANZIAMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STANZIAMENTI.VS = MainFrm.VisualStyleList;
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 780-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STANZIAMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4F1C432C-4DB2-4FC7-B028-649F1C35A520");
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 700, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_STANZIAMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STANZIAMENTI.InitStatus = 2;
    PAN_STANZIAMENTI_Init();
    PAN_STANZIAMENTI_InitFields();
    PAN_STANZIAMENTI_InitQueries();
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
      PAN_STANZIAMENTI.UpdatePanel(MainFrm);
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
    return (obj instanceof StanziamentiSullObiettivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StanziamentiSullObiettivo.class.getName() : (Glb.ClassWithPackage(StanziamentiSullObiettivo.class) ? StanziamentiSullObiettivo.class.getName().substring(StanziamentiSullObiettivo.class.getPackage().getName().length() + 1) : StanziamentiSullObiettivo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Stanziamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STANZIAMENTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STANZIAMENTI);
      // 
      // Stanziamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_STANZIAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_STANZIAMENTI_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_STANZIPROGE2, IMDBDef8.PQSL_STANZIPROGE2_DES_VOCE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiSullObiettivo", "StanziamentiOnDynamicPropertiesEvent", _e);
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
    IDVariant v_INTESTAZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_INTESTAZIONE = (new IDVariant("Stanziamenti Obiettivo del ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_STANZIAMENTI.set_FixedCols((new IDVariant(1)).intValue());
      set_Caption(IDL.Add(IDL.Add(v_INTESTAZIONE, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), MainFrm.ESERCIZIO));
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI351, IMDBDef1.FLD_PARAMETRI351_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
        v_CAPTION = (new IDVariant("Accertato", IDVariant.STRING));
        PAN_STANZIAMENTI.set_Header(Glb.OBJ_FIELD,PFL_STANZIAMENTI_IMPEGNATO, new IDVariant(v_CAPTION).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiSullObiettivo", "LoadEvent", _e);
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
  private void PAN_STANZIAMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STANZIAMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STANZIAMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STANZIAMENTI, Cancel);
    // Stub
  }

  private void PAN_STANZIAMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STANZIAMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_STANZIAMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STANZIAMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STANZIAMENTI_Init()
  {

    PAN_STANZIAMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STANZIAMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STANZIAMENTI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_STANZIAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, "CADAA10D-582B-462B-97D3-61F4E064D8FE");
    PAN_STANZIAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, "Capitolo");
    PAN_STANZIAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, "Capitolo");
    PAN_STANZIAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, "F342EFCE-A10A-4002-AC3E-335509707799");
    PAN_STANZIAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, "Descrizione");
    PAN_STANZIAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, "");
    PAN_STANZIAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, "8910C094-474C-4E87-BC05-0012739C56F8");
    PAN_STANZIAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, "Stanz. Iniz.");
    PAN_STANZIAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, "");
    PAN_STANZIAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, "12F2F0A8-2B97-476A-A9ED-0A0BE36776C0");
    PAN_STANZIAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, "Stanz. Def.");
    PAN_STANZIAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, "");
    PAN_STANZIAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, "4B1C6DA2-A78B-4498-9092-563EBA4383A7");
    PAN_STANZIAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, "Impegnato");
    PAN_STANZIAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, "");
    PAN_STANZIAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, "EB62CF53-4367-4EE8-A87F-D792CBCF7C24");
    PAN_STANZIAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, "Disponibilità");
    PAN_STANZIAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, "");
    PAN_STANZIAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_STANZIAMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, MyGlb.PANEL_LIST, 0, 40, 100, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, MyGlb.PANEL_LIST, 28);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, MyGlb.PANEL_FORM, 4, 136, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, MyGlb.PANEL_FORM, 28);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_CAPITOLO, MyGlb.PANEL_FORM, "Cp.");
    PAN_STANZIAMENTI.SetFieldPage(PFL_STANZIAMENTI_CAPITOLO, -1, -1);
    PAN_STANZIAMENTI.SetFieldUnbound(PFL_STANZIAMENTI_CAPITOLO, true);
    PAN_STANZIAMENTI.SetFieldPanel(PFL_STANZIAMENTI_CAPITOLO, PPQRY_STANZIPROGE2, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "STANPROGCAPI", 5, 201, 0, -13997);
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 100, 40, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 280, 420, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 60);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_STANZIAMENTI.SetFieldPage(PFL_STANZIAMENTI_DESCRIZIONE, -1, -1);
    PAN_STANZIAMENTI.SetFieldPanel(PFL_STANZIAMENTI_DESCRIZIONE, PPQRY_STANZIPROGE2, "A.DES_VOCE", "DES_VOCE", 5, 140, 0, -13997);
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, MyGlb.PANEL_LIST, 332, 40, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, MyGlb.PANEL_LIST, 28);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, MyGlb.PANEL_LIST, "Stanz. Iniz.");
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, MyGlb.PANEL_FORM, 4, 184, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, MyGlb.PANEL_FORM, 28);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZINIZ, MyGlb.PANEL_FORM, "S. I.");
    PAN_STANZIAMENTI.SetFieldPage(PFL_STANZIAMENTI_STANZINIZ, -1, -1);
    PAN_STANZIAMENTI.SetFieldUnbound(PFL_STANZIAMENTI_STANZINIZ, true);
    PAN_STANZIAMENTI.SetFieldPanel(PFL_STANZIAMENTI_STANZINIZ, PPQRY_STANZIPROGE2, "NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0)", "STAPROSTAINI", 2, 19, 0, -13997);
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, MyGlb.PANEL_LIST, 424, 40, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, MyGlb.PANEL_LIST, 52);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, MyGlb.PANEL_LIST, "Stanz. Def.");
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, MyGlb.PANEL_FORM, 4, 208, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, MyGlb.PANEL_FORM, 52);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_STANZDEF, MyGlb.PANEL_FORM, "St. Def");
    PAN_STANZIAMENTI.SetFieldPage(PFL_STANZIAMENTI_STANZDEF, -1, -1);
    PAN_STANZIAMENTI.SetFieldUnbound(PFL_STANZIAMENTI_STANZDEF, true);
    PAN_STANZIAMENTI.SetFieldPanel(PFL_STANZIAMENTI_STANZDEF, PPQRY_STANZIPROGE2, "NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0) + NVL(A.VAR_DEF, 0)", "STAPROSTADEF", 2, 19, 0, -13997);
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, MyGlb.PANEL_LIST, 516, 40, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, MyGlb.PANEL_LIST, "Impegnato");
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, MyGlb.PANEL_FORM, 4, 256, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, MyGlb.PANEL_FORM, 60);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_IMPEGNATO, MyGlb.PANEL_FORM, "Impeg.");
    PAN_STANZIAMENTI.SetFieldPage(PFL_STANZIAMENTI_IMPEGNATO, -1, -1);
    PAN_STANZIAMENTI.SetFieldUnbound(PFL_STANZIAMENTI_IMPEGNATO, true);
    PAN_STANZIAMENTI.SetFieldPanel(PFL_STANZIAMENTI_IMPEGNATO, PPQRY_STANZIPROGE2, "(NVL(A.IMP_ACC, 0))", "STANPROGIMPE", 2, 19, 0, -13997);
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, MyGlb.PANEL_LIST, 608, 40, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, MyGlb.PANEL_LIST, 36);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_STANZIAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 232, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, MyGlb.PANEL_FORM, 36);
    PAN_STANZIAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENTI_DISPONIBILIT, MyGlb.PANEL_FORM, "Disp.");
    PAN_STANZIAMENTI.SetFieldPage(PFL_STANZIAMENTI_DISPONIBILIT, -1, -1);
    PAN_STANZIAMENTI.SetFieldUnbound(PFL_STANZIAMENTI_DISPONIBILIT, true);
    PAN_STANZIAMENTI.SetFieldPanel(PFL_STANZIAMENTI_DISPONIBILIT, PPQRY_STANZIPROGE2, "NVL(A.DISP, 0)", "STANPROGDISP", 2, 19, 0, -13997);
  }

  private void PAN_STANZIAMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_STANZIAMENTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_STANZIAMENTI.SetIMDB(IMDB, "PQRY_STANZIPROGE2", true);
    PAN_STANZIAMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "STANZIAMENTI PROGETTO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as STANPROGCAPI, ");
    SQL.append("  NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0) as STAPROSTAINI, ");
    SQL.append("  NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0) + NVL(A.VAR_DEF, 0) as STAPROSTADEF, ");
    SQL.append("  (NVL(A.IMP_ACC, 0)) as STANPROGIMPE, ");
    SQL.append("  NVL(A.DISP, 0) as STANPROGDISP, ");
    SQL.append("  A.DES_VOCE as DES_VOCE ");
    PAN_STANZIAMENTI.SetQuery(PPQRY_STANZIPROGE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_DETTAGLIO_STN_OB A ");
    PAN_STANZIAMENTI.SetQuery(PPQRY_STANZIPROGE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SCHEDA_OBIETTIVO_ID = ~~TBL_PARAMETRI351.ROWNAMEOBIID~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ESERCIZIO_STN = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI351.ROWNAMEES~~) ");
    PAN_STANZIAMENTI.SetQuery(PPQRY_STANZIPROGE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENTI.SetQuery(PPQRY_STANZIPROGE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENTI.SetQuery(PPQRY_STANZIPROGE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENTI.SetQuery(PPQRY_STANZIPROGE2, 5, SQL, -1, "");
    PAN_STANZIAMENTI.SetQueryDB(PPQRY_STANZIPROGE2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZIAMENTI.SetMasterTable(0, "POL_DETTAGLIO_STN_OB");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STANZIAMENTI.Status() == 2)
    {
      int oldListQBE = PAN_STANZIAMENTI.iUseListQBE;
      PAN_STANZIAMENTI.iUseListQBE = 0;
      PAN_STANZIAMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_STANZIAMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_STANZIAMENTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STANZIAMENTI) PAN_STANZIAMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMENTI) PAN_STANZIAMENTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STANZIAMENTI) PAN_STANZIAMENTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMENTI) PAN_STANZIAMENTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STANZIAMENTI) PAN_STANZIAMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
