// **********************************************
// Informazioni Delibera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniDelibera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_INFORMDELIBE_PROVVEDIMENT = 0;
  private static int PFL_INFORMDELIBE_DATA1 = 1;
  private static int PFL_INFORMDELIBE_DESCRIZIONE = 2;
  private static int PFL_INFORMDELIBE_APPROVAZIONN = 3;
  private static int PFL_INFORMDELIBE_DATA = 4;
  private static int PFL_INFORMDELIBE_ESECUTIVITA = 5;
  private static int PFL_INFORMDELIBE_URLDOCUMENTO = 6;

  private static int PPQRY_DEL4 = 0;

  private static int PPQRY_T10 = 1;

  private static int PPQRY_T12 = 2;


  IDPanel PAN_INFORMDELIBE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI415(IMDB);
    //
    //
    Init_PQRY_DEL4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI415(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI415, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI415, "TBL_PARAMETRI415");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI415,IMDBDef1.FLD_PARAMETRI415_ANNOPARAM, "ANNOPARAM");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI415,IMDBDef1.FLD_PARAMETRI415_ANNOPARAM,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI415,IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO, "PARAMNUMERO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI415,IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO,1,6,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI415,IMDBDef1.FLD_PARAMETRI415_SEDEPARAM, "SEDEPARAM");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI415,IMDBDef1.FLD_PARAMETRI415_SEDEPARAM,5,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI415, 0);
  }

  private static void Init_PQRY_DEL4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DEL4, 15);
    IMDB.set_TblCode(IMDBDef8.PQRY_DEL4, "PQRY_DEL4");
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_DATA_DEL, "DATA_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_DATA_DEL,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_TIPO_ESEC, "TIPO_ESEC");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_TIPO_ESEC,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_NUMERO_APP, "NUMERO_APP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_NUMERO_APP,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_DATA_APP, "DATA_APP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_DATA_APP,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_D_DATA_DEL, "D_DATA_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_D_DATA_DEL,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_D_DATA_APP, "D_DATA_APP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_D_DATA_APP,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_ANNO_PRO, "ANNO_PRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_ANNO_PRO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_NUMERO_PRO, "NUMERO_PRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_NUMERO_PRO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_UNITA_PRO, "UNITA_PRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_UNITA_PRO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_PROVVEDIMDEL, "PROVVEDIMDEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_PROVVEDIMDEL,5,459,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_URLDOCUMENTO, "URLDOCUMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DEL4,IMDBDef8.PQSL_DEL4_URLDOCUMENTO,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_DEL4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniDelibera(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniDelibera()
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
    FormIdx = MyGlb.FRM_INFORMDELIBE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4112FC2B-127E-4F2F-9DA9-0A7E0AA2A498";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 564;
    DesignHeight = 290;
    set_Caption(new IDVariant("Informazioni Delibera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 564;
    Frames[1].Height = 264;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Informazioni Delibera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 264;
    PAN_INFORMDELIBE = new IDPanel(w, this, 1, "PAN_INFORMDELIBE");
    Frames[1].Content = PAN_INFORMDELIBE;
    PAN_INFORMDELIBE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INFORMDELIBE.VS = MainFrm.VisualStyleList;
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 564-MyGlb.PAN_OFFS_X, 264-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INFORMDELIBE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4A5CD932-5878-4CB4-AB34-17E6547682A3");
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 716, 268, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_INFORMDELIBE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INFORMDELIBE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INFORMDELIBE.InitStatus = 1;
    PAN_INFORMDELIBE_Init();
    PAN_INFORMDELIBE_InitFields();
    PAN_INFORMDELIBE_InitQueries();
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
      PAN_INFORMDELIBE.UpdatePanel(MainFrm);
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
    return (obj instanceof InformazioniDelibera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniDelibera.class.getName() : (Glb.ClassWithPackage(InformazioniDelibera.class) ? InformazioniDelibera.class.getName().substring(InformazioniDelibera.class.getPackage().getName().length() + 1) : InformazioniDelibera.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniDelibera", "LoadEvent", _e);
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
  private void PAN_INFORMDELIBE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INFORMDELIBE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INFORMDELIBE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INFORMDELIBE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INFORMDELIBE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_INFORMDELIBE);
    // Stub
  }

  private void PAN_INFORMDELIBE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_INFORMDELIBE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INFORMDELIBE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INFORMDELIBE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_INFORMDELIBE_Init()
  {

    PAN_INFORMDELIBE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INFORMDELIBE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_INFORMDELIBE.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_INFORMDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, "A5ED13AC-2A9E-411C-B52E-25F7D2FA1693");
    PAN_INFORMDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, "Provvedimento");
    PAN_INFORMDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, "");
    PAN_INFORMDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_INFORMDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFORMDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, "A405C2FA-A561-4ECC-9FBD-AD41C7B918A1");
    PAN_INFORMDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, "Data ");
    PAN_INFORMDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, "");
    PAN_INFORMDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_INFORMDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_INFORMDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, "03E839EC-B9FE-48AC-A349-272AF3638631");
    PAN_INFORMDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, "Descrizione");
    PAN_INFORMDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, "");
    PAN_INFORMDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_INFORMDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM, -1);
    PAN_INFORMDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, "B1C932D0-9855-4307-8A5C-3C1C53652267");
    PAN_INFORMDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, "Approvazione N.");
    PAN_INFORMDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, "");
    PAN_INFORMDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, MyGlb.VIS_NORMALFIELDS);
    PAN_INFORMDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFORMDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, "6C324595-642A-413C-B9E2-5A043BF1FF85");
    PAN_INFORMDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, "Data");
    PAN_INFORMDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, "");
    PAN_INFORMDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_INFORMDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFORMDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, "06C1676F-764A-45AC-ABC9-5B9914DF991C");
    PAN_INFORMDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, "Esecutività");
    PAN_INFORMDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, "");
    PAN_INFORMDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, MyGlb.VIS_NORMALFIELDS);
    PAN_INFORMDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_INFORMDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, "D7A92904-65B5-4D71-806B-810C3B0B6567");
    PAN_INFORMDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, "Url Documento");
    PAN_INFORMDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, "");
    PAN_INFORMDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, MyGlb.VIS_HTMEDISTNOSF);
    PAN_INFORMDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_INFORMDELIBE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, MyGlb.PANEL_LIST, 80);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, MyGlb.PANEL_LIST, 2);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, MyGlb.PANEL_LIST, "Provvedimento");
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, MyGlb.PANEL_FORM, 12, 16, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, MyGlb.PANEL_FORM, 96);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, MyGlb.PANEL_FORM, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_PROVVEDIMENT, MyGlb.PANEL_FORM, "Provvedimento");
    PAN_INFORMDELIBE.SetFieldPage(PFL_INFORMDELIBE_PROVVEDIMENT, -1, -1);
    PAN_INFORMDELIBE.SetFieldUnbound(PFL_INFORMDELIBE_PROVVEDIMENT, true);
    PAN_INFORMDELIBE.SetFieldPanel(PFL_INFORMDELIBE_PROVVEDIMENT, PPQRY_DEL4, "A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL )", "PROVVEDIMDEL", 5, 459, 0, -13997);
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, MyGlb.PANEL_LIST, 68);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, MyGlb.PANEL_LIST, "Data ");
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, MyGlb.PANEL_FORM, 436, 16, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, MyGlb.PANEL_FORM, 40);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA1, MyGlb.PANEL_FORM, "Data ");
    PAN_INFORMDELIBE.SetFieldPage(PFL_INFORMDELIBE_DATA1, -1, -1);
    PAN_INFORMDELIBE.SetFieldPanel(PFL_INFORMDELIBE_DATA1, PPQRY_DEL4, "A.D_DATA_DEL", "D_DATA_DEL", 6, 19, 0, -13997);
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 300, 396, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, MyGlb.PANEL_LIST, 20);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, MyGlb.PANEL_FORM, 112, 56, 432, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, MyGlb.PANEL_FORM, 16);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, MyGlb.PANEL_FORM, 4);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_INFORMDELIBE.SetFieldPage(PFL_INFORMDELIBE_DESCRIZIONE, -1, -1);
    PAN_INFORMDELIBE.SetFieldPanel(PFL_INFORMDELIBE_DESCRIZIONE, PPQRY_DEL4, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, MyGlb.PANEL_LIST, 76);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, MyGlb.PANEL_LIST, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, MyGlb.PANEL_LIST, "Appr. N");
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, MyGlb.PANEL_FORM, 4, 144, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, MyGlb.PANEL_FORM, 104);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, MyGlb.PANEL_FORM, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_APPROVAZIONN, MyGlb.PANEL_FORM, "Approvazione N.");
    PAN_INFORMDELIBE.SetFieldPage(PFL_INFORMDELIBE_APPROVAZIONN, -1, -1);
    PAN_INFORMDELIBE.SetFieldPanel(PFL_INFORMDELIBE_APPROVAZIONN, PPQRY_DEL4, "A.NUMERO_APP", "NUMERO_APP", 5, 10, 0, -13997);
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, MyGlb.PANEL_LIST, 68);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, MyGlb.PANEL_FORM, 428, 144, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, MyGlb.PANEL_FORM, 40);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_INFORMDELIBE.SetFieldPage(PFL_INFORMDELIBE_DATA, -1, -1);
    PAN_INFORMDELIBE.SetFieldPanel(PFL_INFORMDELIBE_DATA, PPQRY_DEL4, "A.D_DATA_APP", "D_DATA_APP", 6, 19, 0, -13997);
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, MyGlb.PANEL_LIST, 60);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, MyGlb.PANEL_LIST, "Esec.");
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, MyGlb.PANEL_FORM, 20, 172, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, MyGlb.PANEL_FORM, 88);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, MyGlb.PANEL_FORM, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_ESECUTIVITA, MyGlb.PANEL_FORM, "Esecutività");
    PAN_INFORMDELIBE.SetFieldPage(PFL_INFORMDELIBE_ESECUTIVITA, -1, -1);
    PAN_INFORMDELIBE.SetFieldPanel(PFL_INFORMDELIBE_ESECUTIVITA, PPQRY_DEL4, "A.TIPO_ESEC", "TIPO_ESEC", 1, 2, 0, -13997);
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, MyGlb.PANEL_LIST, 92);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, MyGlb.PANEL_LIST, "Url Documento");
    PAN_INFORMDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, MyGlb.PANEL_FORM, 112, 204, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFORMDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, MyGlb.PANEL_FORM, 92);
    PAN_INFORMDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_INFORMDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFORMDELIBE_URLDOCUMENTO, MyGlb.PANEL_FORM, "Url Documento");
    PAN_INFORMDELIBE.SetFieldPage(PFL_INFORMDELIBE_URLDOCUMENTO, -1, -1);
    PAN_INFORMDELIBE.SetFieldUnbound(PFL_INFORMDELIBE_URLDOCUMENTO, true);
    PAN_INFORMDELIBE.SetFieldPanel(PFL_INFORMDELIBE_URLDOCUMENTO, PPQRY_DEL4, "GET_URL_DOCUMENTO_ATTI(A.ANNO_DEL,A.NUMERO_DEL,A.SEDE_DEL,'DEL',~~TBL_DATISESSIONE.SESSUSERNAME~~,'SI')", "URLDOCUMENTO", 5, 99, 0, -13997);
  }

  private void PAN_INFORMDELIBE_InitQueries()
  {
    StringBuffer SQL;

    PAN_INFORMDELIBE.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  DECODE(A.P_D_E, 'E', 'Esecutiva', 'Delibera') as PDET10 ");
    SQL.append("from ");
    SQL.append("  T10 A ");
    PAN_INFORMDELIBE.SetQuery(PPQRY_T10, 0, SQL, -1, "");
    PAN_INFORMDELIBE.SetQueryDB(PPQRY_T10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INFORMDELIBE.SetMasterTable(PPQRY_T10, "T10");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIOT10 ");
    SQL.append("from ");
    SQL.append("  T10 A ");
    SQL.append("where (A.CODICE = ~~TIPO_ESEC~~) ");
    PAN_INFORMDELIBE.SetQuery(PPQRY_T12, 0, SQL, PFL_INFORMDELIBE_ESECUTIVITA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIOT10 ");
    SQL.append("from ");
    SQL.append("  T10 A ");
    PAN_INFORMDELIBE.SetQuery(PPQRY_T12, 1, SQL, PFL_INFORMDELIBE_ESECUTIVITA, "");
    PAN_INFORMDELIBE.SetQueryDB(PPQRY_T12, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INFORMDELIBE.SetIMDB(IMDB, "PQRY_DEL4", true);
    PAN_INFORMDELIBE.set_SetString(MyGlb.MASTER_ROWNAME, "DEL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.DATA_DEL as DATA_DEL, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_ESEC as TIPO_ESEC, ");
    SQL.append("  A.NUMERO_APP as NUMERO_APP, ");
    SQL.append("  A.DATA_APP as DATA_APP, ");
    SQL.append("  A.D_DATA_DEL as D_DATA_DEL, ");
    SQL.append("  A.D_DATA_APP as D_DATA_APP, ");
    SQL.append("  A.ANNO_PRO as ANNO_PRO, ");
    SQL.append("  A.NUMERO_PRO as NUMERO_PRO, ");
    SQL.append("  A.UNITA_PRO as UNITA_PRO, ");
    SQL.append("  A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL ) as PROVVEDIMDEL, ");
    SQL.append("  GET_URL_DOCUMENTO_ATTI(A.ANNO_DEL,A.NUMERO_DEL,A.SEDE_DEL,'DEL',~~TBL_DATISESSIONE.SESSUSERNAME~~,'SI') as URLDOCUMENTO ");
    PAN_INFORMDELIBE.SetQuery(PPQRY_DEL4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DEL A ");
    PAN_INFORMDELIBE.SetQuery(PPQRY_DEL4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_DEL = ~~TBL_PARAMETRI415.ANNOPARAM~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~TBL_PARAMETRI415.PARAMNUMERO~~) ");
    SQL.append("and   (A.SEDE_DEL = ~~TBL_PARAMETRI415.SEDEPARAM~~) ");
    PAN_INFORMDELIBE.SetQuery(PPQRY_DEL4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFORMDELIBE.SetQuery(PPQRY_DEL4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFORMDELIBE.SetQuery(PPQRY_DEL4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFORMDELIBE.SetQuery(PPQRY_DEL4, 5, SQL, -1, "");
    PAN_INFORMDELIBE.SetQueryDB(PPQRY_DEL4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INFORMDELIBE.SetMasterTable(0, "DEL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INFORMDELIBE.Status() == 2)
    {
      int oldListQBE = PAN_INFORMDELIBE.iUseListQBE;
      PAN_INFORMDELIBE.iUseListQBE = 0;
      PAN_INFORMDELIBE.PanelCommand(Glb.PCM_SEARCH);
      PAN_INFORMDELIBE.PanelCommand(Glb.PCM_FIND);
      PAN_INFORMDELIBE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_INFORMDELIBE) PAN_INFORMDELIBE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFORMDELIBE) PAN_INFORMDELIBE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INFORMDELIBE) PAN_INFORMDELIBE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFORMDELIBE) PAN_INFORMDELIBE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_INFORMDELIBE) PAN_INFORMDELIBE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
