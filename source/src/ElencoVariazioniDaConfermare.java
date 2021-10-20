// **********************************************
// Elenco Variazioni Da Confermare
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoVariazioniDaConfermare extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIAZIONI_OPERA = 0;
  private static int PFL_VARIAZIONI_PROGCRONDESC = 1;
  private static int PFL_VARIAZIONI_CAPITOLO = 2;
  private static int PFL_VARIAZIONI_ARTICOLO = 3;
  private static int PFL_VARIAZIONI_ESERCIZIPLUR = 4;
  private static int PFL_VARIAZIONI_UNITAORGANIZ = 5;
  private static int PFL_VARIAZIONI_FINANZIAMENT = 6;
  private static int PFL_VARIAZIONI_FINANZDESCRI = 7;
  private static int PFL_VARIAZIONI_IMPORTO = 8;
  private static int PFL_VARIAZIONI_ETICHEELABOR = 9;
  private static int PFL_VARIAZIONI_ETICHEFINANZ = 10;
  private static int PFL_VARIAZIONI_PROGRESSIVAR = 11;
  private static int PFL_VARIAZIONI_ETICOPERPROG = 12;

  private static int PPQRY_VARPIANICRON = 0;

  private static int PPQRY_PROGETCRONOP = 1;
  private static int PPQRY_FINANZIAMENT = 2;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS74(IMDB);
    //
    //
    Init_PQRY_VARPIANICRON(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS74(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS74, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS74, "TBL_PARS74");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS74,IMDBDef3.FLD_PARS74_NOMEOGGECRON, "NOMEOGGECRON");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS74,IMDBDef3.FLD_PARS74_NOMEOGGECRON,3,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS74, 0);
  }

  private static void Init_PQRY_VARPIANICRON(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_VARPIANICRON, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_VARPIANICRON, "PQRY_VARPIANICRON");
    IMDB.set_FldCode(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECTESCROOPE, "RECTESCROOPE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECTESCROOPE,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECIMPCROCAP, "RECIMPCROCAP");
    IMDB.SetFldParams(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECIMPCROCAP,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECIMPCROART, "RECIMPCROART");
    IMDB.SetFldParams(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECIMPCROART,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_REVAPICRESPL, "REVAPICRESPL");
    IMDB.SetFldParams(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_REVAPICRESPL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_UNITAORGANIZ, "UNITAORGANIZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_UNITAORGANIZ,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECPIACROFIN, "RECPIACROFIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECPIACROFIN,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECVARPICRIM, "RECVARPICRIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_RECVARPICRIM,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_REVAPICRPRVA, "REVAPICRPRVA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VARPIANICRON,IMDBDef11.PQSL_VARPIANICRON_REVAPICRPRVA,3,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_VARPIANICRON, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoVariazioniDaConfermare(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoVariazioniDaConfermare()
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
    FormIdx = MyGlb.FRM_ELENVARDACON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F8DEB483-BF36-40BA-A5B3-6005F3E2CE59";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 992;
    DesignHeight = 466;
    set_Caption(new IDVariant("Conferma Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 992;
    Frames[1].Height = 440;
    Frames[1].Caption = "Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 440;
    PAN_VARIAZIONI = new IDPanel(w, this, 1, "PAN_VARIAZIONI");
    Frames[1].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 992-MyGlb.PAN_OFFS_X, 440-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A2248843-9C67-4D25-BCC3-ED8655FDACA7");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1060, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 2;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
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
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoVariazioniDaConfermare);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoVariazioniDaConfermare.class.getName() : (Glb.ClassWithPackage(ElencoVariazioniDaConfermare.class) ? ElencoVariazioniDaConfermare.class.getName().substring(ElencoVariazioniDaConfermare.class.getPackage().getName().length() + 1) : ElencoVariazioniDaConfermare.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIONI);
      // 
      // Variazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_PROGCRONDESC,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_PROGCRONDESC))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_FINANZDESCRI,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_FINANZDESCRI))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_UNITAORGANIZ,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_UNITAORGANIZ))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniDaConfermare", "VariazioniOnDynamicProperties", _e);
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
      PAN_VARIAZIONI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIONI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniDaConfermare", "Load", _e);
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniDaConfermare", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS74, IMDBDef3.FLD_PARS74_NOMEOGGECRON, 0, new IDVariant());
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      MainFrm.Cf4armDBObject.BeginTrans();
      C2 = PAN_VARIAZIONI.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_VARIAZIONI.GotoFirst();
      while (!PAN_VARIAZIONI.RSEOF())
      {
        if (PAN_VARIAZIONI.IsRowSelected(I.intValue()))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("update VAR_PIANI_CRONOPROGRAMMI set ");
            SQL.append("  CONFERMATO_RAG = 'SI' ");
            SQL.append("where (PROGRESSIVO_VAR = " + IDL.CSql(C2.Get("REVAPICRPRVA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e5)
          {
            MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_VARIAZIONI.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      MainFrm.Cf4armDBObject.CommitTrans();
      MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniDaConfermare", "EtichettaElabora", _e);
      return -1;
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
  private void PAN_VARIAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
    // Stub
  }

  private void PAN_VARIAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZIONI_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, "BF59CDC8-65FD-40A9-8A9A-9087B866BF1F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, "Opera/Progetto");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, "63243D6B-972E-47F6-8409-7D79F8040635");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, MyGlb.VIS_VILOUPCFHEBO);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "1812B2BE-73ED-49EB-8CE7-A97D058AC2D0");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "Capitolo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "FE8BE655-E9A6-46C7-B03C-CC5852138A7F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "Art.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, "78E6A55F-AB2B-43A2-B9D9-724625244EC0");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, "Anno Plur.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, "E2F467A0-7DAB-4F6D-8B0D-873AD3970C21");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, "Unità Organizzativa");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "2B18A920-EBF7-4201-BF91-C8C3EE884C81");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "Finanziamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, "26D839E6-1D97-47D7-A682-8F83A1FBAA7A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, "FINANZIAMENTI DESCRIZIONE");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "E3893613-6F21-43A6-B37E-1898836B5CB1");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, "38AB5E74-9564-435E-99B6-C4E2183FEF95");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, "Elabora");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, 0, "button1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, "BC465FCF-95AF-4562-84E6-507034DE4C97");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, "Finanziamento");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, "39AE816C-77AB-494F-9213-7D96183C1F6E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, "PROGRESSIVO VAR");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, "C4A1F548-3532-47D7-8423-22D0A8C693DF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, "Opera/Progetto");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_LIST, "Op. Prog.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_FORM, "Op. Prog.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OPERA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OPERA, PPQRY_VARPIANICRON, "C.OPERA", "RECTESCROOPE", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, MyGlb.PANEL_LIST, 40, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, MyGlb.PANEL_LIST, 260);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, MyGlb.PANEL_FORM, 4, 172, 696, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, MyGlb.PANEL_FORM, 260);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGCRONDESC, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGCRONDESC, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGCRONDESC, PPQRY_PROGETCRONOP, "A.DESCRIZIONE", "PROCROOPEDES", 5, 200, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 256, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO, PPQRY_VARPIANICRON, "B.CAPITOLO", "RECIMPCROCAP", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 388, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ARTICOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ARTICOLO, PPQRY_VARPIANICRON, "B.ARTICOLO", "RECIMPCROART", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, MyGlb.PANEL_LIST, 420, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, MyGlb.PANEL_LIST, "Anno Plur.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLUR, MyGlb.PANEL_FORM, "Anno Plur.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ESERCIZIPLUR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ESERCIZIPLUR, PPQRY_VARPIANICRON, "A.ESERCIZIO_PLUR", "REVAPICRESPL", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, MyGlb.PANEL_LIST, 460, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, MyGlb.PANEL_FORM, 4, 100, 628, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UNITAORGANIZ, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_UNITAORGANIZ, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UNITAORGANIZ, PPQRY_VARPIANICRON, "SO4_UTIL.UNITA_GET_DESCR_VALIDA(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "UNITAORGANIZ", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 676, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finan.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_FINANZIAMENT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_FINANZIAMENT, PPQRY_VARPIANICRON, "D.FINANZIAMENTO", "RECPIACROFIN", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, MyGlb.PANEL_LIST, 716, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, MyGlb.PANEL_LIST, "FINANZIAMENTI DESCRIZIONE");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, MyGlb.PANEL_FORM, 4, 220, 684, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESCRI, MyGlb.PANEL_FORM, "FINANZIAMENTI DESCRIZIONE");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_FINANZDESCRI, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 932, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 148, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO, PPQRY_VARPIANICRON, "A.IMPORTO", "RECVARPICRIM", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, MyGlb.PANEL_LIST, 716, 240, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, MyGlb.PANEL_FORM, 588, 252, 96, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ETICHEELABOR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, MyGlb.PANEL_LIST, 676, 0, 256, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, MyGlb.PANEL_FORM, 892, 240, 352, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ETICHEFINANZ, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ETICHEFINANZ, -1, "", "ETICHEFINANZ", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, MyGlb.PANEL_LIST, 1092, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, MyGlb.PANEL_LIST, "PROGRESSIVO VAR");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, MyGlb.PANEL_FORM, 4, 256, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, MyGlb.PANEL_FORM, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVAR, MyGlb.PANEL_FORM, "PROGRESSIVO VAR");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVAR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVAR, PPQRY_VARPIANICRON, "A.PROGRESSIVO_VAR", "REVAPICRPRVA", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, MyGlb.PANEL_LIST, 0, 0, 256, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, MyGlb.PANEL_FORM, 0, 248, 316, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICOPERPROG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ETICOPERPROG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ETICOPERPROG, -1, "", "ETICOPERPROG", 0, 0, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as PROCROOPEDES ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~RECTESCROOPE~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_PROGETCRONOP, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_PROGETCRONOP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_PROGETCRONOP, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~RECPIACROFIN~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARPIANICRON", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.OPERA as RECTESCROOPE, ");
    SQL.append("  B.CAPITOLO as RECIMPCROCAP, ");
    SQL.append("  B.ARTICOLO as RECIMPCROART, ");
    SQL.append("  A.ESERCIZIO_PLUR as REVAPICRESPL, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as UNITAORGANIZ, ");
    SQL.append("  D.FINANZIAMENTO as RECPIACROFIN, ");
    SQL.append("  A.IMPORTO as RECVARPICRIM, ");
    SQL.append("  A.PROGRESSIVO_VAR as REVAPICRPRVA ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARPIANICRON, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VAR_PIANI_CRONOPROGRAMMI A, ");
    SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI B, ");
    SQL.append("  TESTATE_CRONOPROGRAMMI C, ");
    SQL.append("  PIANI_CRONOPROGRAMMI D ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARPIANICRON, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where C.CRONOPROGRAMMA_ID = B.CRONOPROGRAMMA_ID ");
    SQL.append("and   D.PROGRESSIVO_IMPUTAZIONE = A.PROGRESSIVO_IMPUTAZIONE ");
    SQL.append("and   D.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID ");
    SQL.append("and   D.ESERCIZIO_PLUR = A.ESERCIZIO_PLUR ");
    SQL.append("and   D.FINANZIAMENTO = A.FINANZIAMENTO ");
    SQL.append("and   (A.CRONOPROGRAMMA_ID = ~~TBL_PARS74.NOMEOGGECRON~~) ");
    SQL.append("and   (B.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (B.PROGRESSIVO_IMPUTAZIONE = A.PROGRESSIVO_IMPUTAZIONE) ");
    SQL.append("and   ((A.CONFERMATO_RAG IS NULL)) ");
    SQL.append("and   (C.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (D.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (D.PROGRESSIVO_IMPUTAZIONE = B.PROGRESSIVO_IMPUTAZIONE) ");
    SQL.append("and   (A.ESERCIZIO_PLUR = D.ESERCIZIO_PLUR) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARPIANICRON, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARPIANICRON, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARPIANICRON, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  C.OPERA, ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  A.ESERCIZIO_PLUR ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARPIANICRON, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARPIANICRON, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "VAR_PIANI_CRONOPROGRAMMI");
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_OPERA, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_CAPITOLO, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ARTICOLO, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ESERCIZIPLUR, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIONI.iUseListQBE;
      PAN_VARIAZIONI.iUseListQBE = 0;
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
