// **********************************************
// Scelta Obiettivi Variazioni Funz Bilancio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaObiettiviVariazioniFunzBilancio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTAOBIETT_PROGETTO = 0;
  private static int PFL_SCELTAOBIETT_DESPROGETTO = 1;
  private static int PFL_SCELTAOBIETT_OBIETTIVO = 2;
  private static int PFL_SCELTAOBIETT_DESOBIETTIVO = 3;
  private static int PFL_SCELTAOBIETT_DATAINIZIO = 4;
  private static int PFL_SCELTAOBIETT_PROGRAMMA = 5;
  private static int PFL_SCELTAOBIETT_PROGETTLABEL = 6;
  private static int PFL_SCELTAOBIETT_OBIETTILABEL = 7;
  private static int PFL_SCELTAOBIETT_SCHEDOBIETID = 8;
  private static int PFL_SCELTAOBIETT_ORDINAMENTO = 9;
  private static int PFL_SCELTAOBIETT_PRIMOESERCIZ = 10;
  private static int PFL_SCELTAOBIETT_FATTORE = 11;
  private static int PFL_SCELTAOBIETT_DESFATTORE = 12;
  private static int PFL_SCELTAOBIETT_CENTRO = 13;
  private static int PFL_SCELTAOBIETT_DESCENTRO = 14;
  private static int PFL_SCELTAOBIETT_LABEL = 15;
  private static int PFL_SCELTAOBIETT_LABEL1 = 16;

  private static int PPQRY_POLELENCOBFC = 0;


  IDPanel PAN_SCELTAOBIETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI352(IMDB);
    //
    //
    Init_PQRY_POLELENCOBFC(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI352(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI352, 5);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI352, "TBL_PARAMETRI352");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMUOIMPEG, "PARAMUOIMPEG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMUOIMPEG,1,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMPROGEID, "PARAMPROGEID");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI352,IMDBDef1.FLD_PARAMETRI352_PARAMPROGEID,5,9,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI352, 0);
  }

  private static void Init_PQRY_POLELENCOBFC(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_POLELENCOBFC, 13);
    IMDB.set_TblCode(IMDBDef7.PQRY_POLELENCOBFC, "PQRY_POLELENCOBFC");
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_POLELEOBFCOR, "POLELEOBFCOR");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_POLELEOBFCOR,6,0,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_PROGRAMMA,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_OBIETTIVO, "OBIETTIVO");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_OBIETTIVO,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DES_PROGETTO, "DES_PROGETTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DES_PROGETTO,5,100,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DES_OBIETTIVO, "DES_OBIETTIVO");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DES_OBIETTIVO,5,100,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DATA_INIZIO_OB, "DATA_INIZIO_OB");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DATA_INIZIO_OB,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_POELOBFCPRES, "POELOBFCPRES");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_POELOBFCPRES,1,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DES_FATTORE, "DES_FATTORE");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DES_FATTORE,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DES_CENTRO, "DES_CENTRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLELENCOBFC,IMDBDef7.PQSL_POLELENCOBFC_DES_CENTRO,5,60,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_POLELENCOBFC, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaObiettiviVariazioniFunzBilancio(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaObiettiviVariazioniFunzBilancio()
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
    FormIdx = MyGlb.FRM_SCEOBIVAFUBI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0110E4B3-78C9-4771-BA92-2C38A51DE076";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 788;
    DesignHeight = 402;
    set_Caption(new IDVariant("Scelta Obiettivi Variazioni Funz Bilancio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 788;
    Frames[1].Height = 376;
    Frames[1].Caption = "Scelta Obiettivi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 376;
    PAN_SCELTAOBIETT = new IDPanel(w, this, 1, "PAN_SCELTAOBIETT");
    Frames[1].Content = PAN_SCELTAOBIETT;
    PAN_SCELTAOBIETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTAOBIETT.VS = MainFrm.VisualStyleList;
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 788-MyGlb.PAN_OFFS_X, 376-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "347BDBBB-3FC8-47FD-ADBF-3F9FB57945BB");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1304, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTAOBIETT.InitStatus = 1;
    PAN_SCELTAOBIETT_Init();
    PAN_SCELTAOBIETT_InitFields();
    PAN_SCELTAOBIETT_InitQueries();
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
      PAN_SCELTAOBIETT.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaObiettiviVariazioniFunzBilancio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaObiettiviVariazioniFunzBilancio.class.getName() : (Glb.ClassWithPackage(SceltaObiettiviVariazioniFunzBilancio.class) ? SceltaObiettiviVariazioniFunzBilancio.class.getName().substring(SceltaObiettiviVariazioniFunzBilancio.class.getPackage().getName().length() + 1) : SceltaObiettiviVariazioniFunzBilancio.class.getName()));
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
      v_CAPTION = (new IDVariant("Scelta Obiettivi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaObiettiviVariazioniFunzBilancio", "LoadEvent", _e);
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
  private void PAN_SCELTAOBIETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTAOBIETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTAOBIETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTAOBIETT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTAOBIETT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCELTAOBIETT);
    // Stub
  }

  private void PAN_SCELTAOBIETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTAOBIETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTAOBIETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTAOBIETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTAOBIETT_Init()
  {

    PAN_SCELTAOBIETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTAOBIETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTAOBIETT.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, "0B5C5DD2-CF19-41B0-8F01-6B6B822AE952");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, "Progetto");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, "B7ADD846-7AD7-431D-8AB5-AF4FD4ED9FF5");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, "DES PROGETTO");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, "957EAD59-B5A4-4607-9065-0CD24A4A9919");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, "OBIETTIVO");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, "633974F2-8C97-4E32-996F-E152B20C0A67");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, "DES OBIETTIVO");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, "735E439F-469C-4D61-9837-37C8BEB4631D");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, "Data Inizio");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, "7E89701A-A849-40D2-B417-60EE9B44FD78");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, "PROGRAMMA");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, "C5414B74-6AFA-4E55-967C-3B612055616A");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, "Obiettivo Operativo");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, "173832CF-9465-41A1-A2E8-90D74F4FE4D8");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, "Obiettivo Gestionale");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, "FB77FC7F-8E93-44F8-8CD1-0647166C56B6");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, "B8C9CCA6-1077-4B71-8B64-DF2121690137");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, "Ordinamento");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, "AE75FA33-1476-4149-9AC9-5AB313727D35");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, "Primo Esercizio");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, "967869CE-87BB-4A3B-A6F2-C3A635254115");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, "FATTORE");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, "3E326FBA-73B8-47FB-B9C7-73620E728553");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, "DES FATTORE");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, "7D3B24D8-40EF-4A29-88CF-704BFBA7E81F");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, "CENTRO");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, "C4EE74BB-140A-4FD7-B6CE-F9F51D646A2B");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, "DES CENTRO");
    PAN_SCELTAOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, "");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, "6CA3AD70-519E-4814-B58D-EDC0943638AE");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, "Fattore");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTAOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, "967B3C39-93A8-4471-90F5-D224EA873644");
    PAN_SCELTAOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, "Centro");
    PAN_SCELTAOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTAOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_SCELTAOBIETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_LIST, "Progetto");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTO, MyGlb.PANEL_FORM, "Progetto");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_PROGETTO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_PROGETTO, PPQRY_POLELENCOBFC, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_LIST, 96, 36, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_LIST, "DES PROGETTO");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_FORM, 4, 76, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESPROGETTO, MyGlb.PANEL_FORM, "DES PROG.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_DESPROGETTO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_DESPROGETTO, PPQRY_POLELENCOBFC, "A.DES_PROGETTO", "DES_PROGETTO", 5, 100, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 348, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, "OBIET.");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 4, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, "OBIET.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_OBIETTIVO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_OBIETTIVO, PPQRY_POLELENCOBFC, "A.OBIETTIVO", "OBIETTIVO", 5, 10, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_LIST, 412, 36, 248, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_LIST, "DES OBIETTIVO");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_FORM, 4, 100, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESOBIETTIVO, MyGlb.PANEL_FORM, "DES OBIET.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_DESOBIETTIVO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_DESOBIETTIVO, PPQRY_POLELENCOBFC, "A.DES_OBIETTIVO", "DES_OBIETTIVO", 5, 100, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_LIST, 660, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_LIST, "Data Inizio");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_FORM, 4, 124, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DATAINIZIO, MyGlb.PANEL_FORM, "Data Inizio");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_DATAINIZIO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_DATAINIZIO, PPQRY_POLELENCOBFC, "A.DATA_INIZIO_OB", "DATA_INIZIO_OB", 6, 19, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, 412, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, "PROGR.");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, 4, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, 76);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, "PROGR.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_PROGRAMMA, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_PROGRAMMA, PPQRY_POLELENCOBFC, "A.PROGRAMMA", "PROGRAMMA", 5, 4, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_LIST, 0, 0, 348, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_FORM, 0, 0, 348, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PROGETTLABEL, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_PROGETTLABEL, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_PROGETTLABEL, -1, "", "PROGETTLABEL", 0, 0, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_LIST, 348, 0, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_LIST, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_FORM, 8, 8, 348, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_FORM, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_OBIETTILABEL, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_OBIETTILABEL, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_OBIETTILABEL, -1, "", "OBIETTILABEL", 0, 0, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_LIST, 740, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_LIST, 120);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_FORM, 4, 148, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_FORM, 120);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_SCHEDOBIETID, MyGlb.PANEL_FORM, "SCH. OBIETTIVO ID");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_SCHEDOBIETID, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_SCHEDOBIETID, PPQRY_POLELENCOBFC, "A.SCHEDA_OBIETTIVO_ID", "SCHEDA_OBIETTIVO_ID", 3, 10, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordin.");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_FORM, 4, 148, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_ORDINAMENTO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldUnbound(PFL_SCELTAOBIETT_ORDINAMENTO, true);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_ORDINAMENTO, PPQRY_POLELENCOBFC, "MAX(DECODE(" + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NULL, TO_DATE('1900-01-01','YYYY-MM-DD'), NVL(A.DATA_INIZIO_OB, TO_DATE('1900-01-01','YYYY-MM-DD'))))", "POLELEOBFCOR", 6, 0, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_LIST, 80);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_LIST, "Primo Esercizio");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_FORM, 4, 148, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_FORM, 80);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_PRIMOESERCIZ, MyGlb.PANEL_FORM, "Pr. Esercizio");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_PRIMOESERCIZ, -1, -1);
    PAN_SCELTAOBIETT.SetFieldUnbound(PFL_SCELTAOBIETT_PRIMOESERCIZ, true);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_PRIMOESERCIZ, PPQRY_POLELENCOBFC, "MAX(A_GET_MIN_ESERCIZIO_STN_POL(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI352.PARAMES~~,~~TBL_PARAMETRI352.PARAMCAPITOL~~,~~TBL_PARAMETRI352.PARAMARTICOL~~,~~TBL_PARAMETRI352.PARAMPROGEID~~,A.SCHEDA_OBIETTIVO_ID,NULL,NULL,~~TBL_PARAMETRI352.PARAMUOIMPEG~~,'O'))", "POELOBFCPRES", 1, 19, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, MyGlb.PANEL_LIST, 740, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, MyGlb.PANEL_LIST, "FATT.");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, MyGlb.PANEL_FORM, 4, 148, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_FATTORE, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_FATTORE, PPQRY_POLELENCOBFC, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, MyGlb.PANEL_LIST, 792, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, MyGlb.PANEL_LIST, "DES FATTORE");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, MyGlb.PANEL_FORM, 4, 172, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, MyGlb.PANEL_FORM, 76);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESFATTORE, MyGlb.PANEL_FORM, "DES FATT.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_DESFATTORE, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_DESFATTORE, PPQRY_POLELENCOBFC, "A.DES_FATTORE", "DES_FATTORE", 5, 60, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, MyGlb.PANEL_LIST, 1024, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, MyGlb.PANEL_FORM, 4, 196, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_CENTRO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_CENTRO, PPQRY_POLELENCOBFC, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, MyGlb.PANEL_LIST, 1076, 36, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, MyGlb.PANEL_LIST, 72);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, MyGlb.PANEL_LIST, "DES CENTRO");
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, MyGlb.PANEL_FORM, 4, 220, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, MyGlb.PANEL_FORM, 72);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_DESCENTRO, MyGlb.PANEL_FORM, "DES CENT.");
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_DESCENTRO, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_DESCENTRO, PPQRY_POLELENCOBFC, "A.DES_CENTRO", "DES_CENTRO", 5, 60, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, MyGlb.PANEL_LIST, 740, 0, 284, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, MyGlb.PANEL_FORM, 740, 0, 284, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_LABEL, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, MyGlb.PANEL_LIST, 1024, 0, 280, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, MyGlb.PANEL_LIST, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, MyGlb.PANEL_FORM, 748, 8, 284, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, MyGlb.PANEL_FORM, 0);
    PAN_SCELTAOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAOBIETT_LABEL1, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAOBIETT.SetFieldPage(PFL_SCELTAOBIETT_LABEL1, -1, -1);
    PAN_SCELTAOBIETT.SetFieldPanel(PFL_SCELTAOBIETT_LABEL1, -1, "", "LABEL1", 0, 0, 0, -13997);
  }

  private void PAN_SCELTAOBIETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTAOBIETT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTAOBIETT.SetIMDB(IMDB, "PQRY_POLELENCOBFC", true);
    PAN_SCELTAOBIETT.set_SetString(MyGlb.MASTER_ROWNAME, "POL ELENCO OB FC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  MAX(DECODE(" + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NULL, TO_DATE('1900-01-01','YYYY-MM-DD'), NVL(A.DATA_INIZIO_OB, TO_DATE('1900-01-01','YYYY-MM-DD')))) as POLELEOBFCOR, ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.OBIETTIVO as OBIETTIVO, ");
    SQL.append("  A.DES_PROGETTO as DES_PROGETTO, ");
    SQL.append("  A.DES_OBIETTIVO as DES_OBIETTIVO, ");
    SQL.append("  A.DATA_INIZIO_OB as DATA_INIZIO_OB, ");
    SQL.append("  MAX(A_GET_MIN_ESERCIZIO_STN_POL(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI352.PARAMES~~,~~TBL_PARAMETRI352.PARAMCAPITOL~~,~~TBL_PARAMETRI352.PARAMARTICOL~~,~~TBL_PARAMETRI352.PARAMPROGEID~~,A.SCHEDA_OBIETTIVO_ID,NULL,NULL,~~TBL_PARAMETRI352.PARAMUOIMPEG~~,'O')) as POELOBFCPRES, ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.DES_FATTORE as DES_FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.DES_CENTRO as DES_CENTRO ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBFC, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_ELENCO_OB_FC A, ");
    SQL.append("  POL_SCHEDE_OBIETTIVO B ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBFC, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = ~~TBL_PARAMETRI352.PARAMUOIMPEG~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI352.PARAMES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI352.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI352.PARAMARTICOL~~) ");
    SQL.append("and   (NVL(A.PROGETTO_ID, '-1') = NVL(~~TBL_PARAMETRI352.PARAMPROGEID~~, NVL(A.PROGETTO_ID, '-1'))) ");
    SQL.append("and   (A.ESERCIZIO_STN = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.SCHEDA_OBIETTIVO_ID = A.SCHEDA_OBIETTIVO_ID) ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBFC, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.PROGETTO_ID, ");
    SQL.append("  A.PROGRAMMA, ");
    SQL.append("  A.OBIETTIVO, ");
    SQL.append("  A.DES_PROGETTO, ");
    SQL.append("  A.DES_OBIETTIVO, ");
    SQL.append("  A.DATA_INIZIO_OB, ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID, ");
    SQL.append("  A.FATTORE, ");
    SQL.append("  A.DES_FATTORE, ");
    SQL.append("  A.CENTRO, ");
    SQL.append("  A.DES_CENTRO ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBFC, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBFC, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 2, 3, 1, 4 ");
    PAN_SCELTAOBIETT.SetQuery(PPQRY_POLELENCOBFC, 5, SQL, -1, "");
    PAN_SCELTAOBIETT.SetQueryDB(PPQRY_POLELENCOBFC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTAOBIETT.SetMasterTable(0, "POL_ELENCO_OB_FC");
    PAN_SCELTAOBIETT.AddToSortList(PFL_SCELTAOBIETT_ORDINAMENTO, true);
    PAN_SCELTAOBIETT.AddToSortList(PFL_SCELTAOBIETT_PROGRAMMA, true);
    PAN_SCELTAOBIETT.AddToSortList(PFL_SCELTAOBIETT_PROGETTO, true);
    PAN_SCELTAOBIETT.AddToSortList(PFL_SCELTAOBIETT_OBIETTIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTAOBIETT.Status() == 2)
    {
      int oldListQBE = PAN_SCELTAOBIETT.iUseListQBE;
      PAN_SCELTAOBIETT.iUseListQBE = 0;
      PAN_SCELTAOBIETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTAOBIETT.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTAOBIETT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTAOBIETT) PAN_SCELTAOBIETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
