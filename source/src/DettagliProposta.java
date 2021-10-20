// **********************************************
// Dettagli Proposta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliProposta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DETTAGPROPOS_IMPORTI = 0;

  private static int PFL_DETTAGPROPOS_ES = 0;
  private static int PFL_DETTAGPROPOS_CAPITOLO = 1;
  private static int PFL_DETTAGPROPOS_ARTICOLO = 2;
  private static int PFL_DETTAGPROPOS_NUOVA = 3;
  private static int PFL_DETTAGPROPOS_DESCRIZIONE = 4;
  private static int PFL_DETTAGPROPOS_IMPORTO1 = 5;
  private static int PFL_DETTAGPROPOS_IMPORTO2 = 6;
  private static int PFL_DETTAGPROPOS_IMPORTO3 = 7;
  private static int PFL_DETTAGPROPOS_VOCEPEGSMALL = 8;
  private static int PFL_DETTAGPROPOS_CAPITOLOART = 9;

  private static int PPQRY_POLPROVARDE9 = 0;


  IDPanel PAN_DETTAGPROPOS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN8(IMDB);
    //
    //
    Init_PQRY_POLPROVARDE9(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IN8, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_IN8, "TBL_IN8");
    IMDB.set_FldCode(IMDBDef4.TBL_IN8,IMDBDef4.FLD_IN8_ROWNAMPRVAID, "ROWNAMPRVAID");
    IMDB.SetFldParams(IMDBDef4.TBL_IN8,IMDBDef4.FLD_IN8_ROWNAMPRVAID,1,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IN8, 0);
  }

  private static void Init_PQRY_POLPROVARDE9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROVARDE9, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROVARDE9, "PQRY_POLPROVARDE9");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_ISTITUZIONE_NC, "ISTITUZIONE_NC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_ISTITUZIONE_NC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_DESCRIZIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE9,IMDBDef12.PQSL_POLPROVARDE9_IMPORTO_3,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROVARDE9, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliProposta(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliProposta()
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
    FormIdx = MyGlb.FRM_DETTAGPROPOS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1A32D620-A64F-439F-80FA-C50B62CC6BEC";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 768;
    DesignHeight = 386;
    set_Caption(new IDVariant("Dettagli Proposta"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 768;
    Frames[1].Height = 360;
    Frames[1].Caption = "Dettagli Proposta";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_DETTAGPROPOS = new IDPanel(w, this, 1, "PAN_DETTAGPROPOS");
    Frames[1].Content = PAN_DETTAGPROPOS;
    PAN_DETTAGPROPOS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGPROPOS.VS = MainFrm.VisualStyleList;
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 768-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "774FDA77-8167-4208-9A12-583D1207533B");
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 716, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGPROPOS.InitStatus = 2;
    PAN_DETTAGPROPOS_Init();
    PAN_DETTAGPROPOS_InitFields();
    PAN_DETTAGPROPOS_InitQueries();
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
      PAN_DETTAGPROPOS.UpdatePanel(MainFrm);
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
    return (obj instanceof DettagliProposta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliProposta.class.getName() : (Glb.ClassWithPackage(DettagliProposta.class) ? DettagliProposta.class.getName().substring(DettagliProposta.class.getPackage().getName().length() + 1) : DettagliProposta.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Dettagli Proposta On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGPROPOS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGPROPOS);
      // 
      // Dettagli Proposta On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGPROPOS.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGPROPOS_DESCRIZIONE,(new IDVariant(PAN_DETTAGPROPOS.FieldText(PFL_DETTAGPROPOS_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliProposta", "DettagliPropostaOnDynamicPropertiesEvent", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))
      {
        PAN_DETTAGPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_DETTAGPROPOS.set_Header(Glb.OBJ_FIELD,PFL_DETTAGPROPOS_IMPORTO1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_DETTAGPROPOS.set_Header(Glb.OBJ_FIELD,PFL_DETTAGPROPOS_IMPORTO2, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_DETTAGPROPOS.set_Header(Glb.OBJ_FIELD,PFL_DETTAGPROPOS_IMPORTO3, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliProposta", "LoadEvent", _e);
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
  private void PAN_DETTAGPROPOS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGPROPOS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGPROPOS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGPROPOS, Cancel);
    // Stub
  }

  private void PAN_DETTAGPROPOS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGPROPOS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGPROPOS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGPROPOS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTAGPROPOS_Init()
  {

    PAN_DETTAGPROPOS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGPROPOS.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, "216A1CE3-0E67-4197-8205-7AF2ADC7C705");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, "Importi");
    PAN_DETTAGPROPOS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, "");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, MyGlb.PANEL_LIST, 392, -9999, 324, 16, 0, 0);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, MyGlb.PANEL_FORM, 0, 135, 156, 97, 0, 0);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, 0, 43);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, 1, 13);
    PAN_DETTAGPROPOS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, 0, 4);
    PAN_DETTAGPROPOS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, 1, 4);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGPROPOS_IMPORTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGPROPOS.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, "DD2145B8-4330-4397-8BA6-CDC47391B436");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, "E/S");
    PAN_DETTAGPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, "");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, "D60D0DE8-4F40-4571-B44A-0AB1B6340EA3");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, "CAPITOLO");
    PAN_DETTAGPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, "");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, "B55C1C01-16D9-4EB7-9C3A-6C56C10B1268");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, "ARTICOLO");
    PAN_DETTAGPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, "");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, "DF83A80E-F359-45D2-A382-787595C4FE74");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, "Nuova");
    PAN_DETTAGPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, "");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, "69B8883F-D799-42FB-8B2A-8FB0AE79A524");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, "Descrizione");
    PAN_DETTAGPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, "");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, "D8AA9950-772A-4062-B8C7-B222E844DADE");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, "IMPORTO 1");
    PAN_DETTAGPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, "");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, "78983683-76D5-48FA-AC9A-FC2801C7257E");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, "IMPORTO 2");
    PAN_DETTAGPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, "");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, "F02E8F71-2F43-4E43-8179-854307ED4AD7");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, "IMPORTO 3");
    PAN_DETTAGPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, "");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, "2DF6649F-0AAC-4700-BDF0-459C53A79759");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, "Voce P.e.g.");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, "53914058-FB37-4DD4-AB66-7FADBC398D72");
    PAN_DETTAGPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, "Capitolo/Art.");
    PAN_DETTAGPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGPROPOS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, MyGlb.PANEL_LIST, 24);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, MyGlb.PANEL_LIST, "E/S");
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, MyGlb.PANEL_FORM, 4, 4, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, MyGlb.PANEL_FORM, 24);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ES, MyGlb.PANEL_FORM, "E S");
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_ES, -1, -1);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_ES, PPQRY_POLPROVARDE9, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_DETTAGPROPOS.SetValueListItem(PFL_DETTAGPROPOS_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_DETTAGPROPOS.SetValueListItem(PFL_DETTAGPROPOS_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, MyGlb.PANEL_LIST, 48, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_CAPITOLO, -1, -1);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_CAPITOLO, PPQRY_POLPROVARDE9, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, MyGlb.PANEL_LIST, 148, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, MyGlb.PANEL_FORM, 4, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_ARTICOLO, -1, -1);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_ARTICOLO, PPQRY_POLPROVARDE9, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, MyGlb.PANEL_LIST, 172, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, MyGlb.PANEL_LIST, "Nuova");
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, MyGlb.PANEL_FORM, 4, 100, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_NUOVA, MyGlb.PANEL_FORM, "Nuova");
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_NUOVA, -1, -1);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_NUOVA, PPQRY_POLPROVARDE9, "A.ISTITUZIONE_NC", "ISTITUZIONE_NC", 5, 2, 0, -13997);
    PAN_DETTAGPROPOS.SetValueListItem(PFL_DETTAGPROPOS_NUOVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTAGPROPOS.SetValueListItem(PFL_DETTAGPROPOS_NUOVA, (new IDVariant()), "Null", "", "", -1);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, MyGlb.PANEL_LIST, 216, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 124, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_DESCRIZIONE, -1, -1);
    PAN_DETTAGPROPOS.SetFieldUnbound(PFL_DETTAGPROPOS_DESCRIZIONE, true);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_DESCRIZIONE, PPQRY_POLPROVARDE9, "SUBSTR(A.DESCRIZIONE, 1, 30)", "DESCRIZIONE", 5, 99, 0, -13997);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, MyGlb.PANEL_LIST, 392, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, MyGlb.PANEL_FORM, 4, 160, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO1, MyGlb.PANEL_FORM, "IMP. 1");
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_IMPORTO1, -1, GRP_DETTAGPROPOS_IMPORTI);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_IMPORTO1, PPQRY_POLPROVARDE9, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, MyGlb.PANEL_LIST, 500, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, MyGlb.PANEL_FORM, 4, 184, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO2, MyGlb.PANEL_FORM, "IMP. 2");
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_IMPORTO2, -1, GRP_DETTAGPROPOS_IMPORTI);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_IMPORTO2, PPQRY_POLPROVARDE9, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, MyGlb.PANEL_LIST, 608, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, MyGlb.PANEL_FORM, 4, 208, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_IMPORTO3, MyGlb.PANEL_FORM, "IMP. 3");
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_IMPORTO3, -1, GRP_DETTAGPROPOS_IMPORTI);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_IMPORTO3, PPQRY_POLPROVARDE9, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, MyGlb.PANEL_LIST, 48, 0, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, MyGlb.PANEL_FORM, 100, 0, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_VOCEPEGSMALL, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_VOCEPEGSMALL, -1, -1);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_VOCEPEGSMALL, -1, "", "VOCEPEGSMALL", 0, 0, 0, -13997);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, MyGlb.PANEL_LIST, 48, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, MyGlb.PANEL_FORM, 108, 8, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGPROPOS_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGPROPOS.SetFieldPage(PFL_DETTAGPROPOS_CAPITOLOART, -1, -1);
    PAN_DETTAGPROPOS.SetFieldPanel(PFL_DETTAGPROPOS_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGPROPOS_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGPROPOS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGPROPOS.SetIMDB(IMDB, "PQRY_POLPROVARDE9", true);
    PAN_DETTAGPROPOS.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ISTITUZIONE_NC as ISTITUZIONE_NC, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 30) as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1, ");
    SQL.append("  A.IMPORTO_2 as IMPORTO_2, ");
    SQL.append("  A.IMPORTO_3 as IMPORTO_3 ");
    PAN_DETTAGPROPOS.SetQuery(PPQRY_POLPROVARDE9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_DETTAGPROPOS.SetQuery(PPQRY_POLPROVARDE9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROPOSTA_VAR_ID = ~~TBL_IN8.ROWNAMPRVAID~~) ");
    PAN_DETTAGPROPOS.SetQuery(PPQRY_POLPROVARDE9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGPROPOS.SetQuery(PPQRY_POLPROVARDE9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGPROPOS.SetQuery(PPQRY_POLPROVARDE9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_DETTAGPROPOS.SetQuery(PPQRY_POLPROVARDE9, 5, SQL, -1, "");
    PAN_DETTAGPROPOS.SetQueryDB(PPQRY_POLPROVARDE9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGPROPOS.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    PAN_DETTAGPROPOS.AddToSortList(PFL_DETTAGPROPOS_ES, true);
    PAN_DETTAGPROPOS.AddToSortList(PFL_DETTAGPROPOS_CAPITOLO, true);
    PAN_DETTAGPROPOS.AddToSortList(PFL_DETTAGPROPOS_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGPROPOS.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGPROPOS.iUseListQBE;
      PAN_DETTAGPROPOS.iUseListQBE = 0;
      PAN_DETTAGPROPOS.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGPROPOS.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGPROPOS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTAGPROPOS) PAN_DETTAGPROPOS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGPROPOS) PAN_DETTAGPROPOS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGPROPOS) PAN_DETTAGPROPOS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGPROPOS) PAN_DETTAGPROPOS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTAGPROPOS) PAN_DETTAGPROPOS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
