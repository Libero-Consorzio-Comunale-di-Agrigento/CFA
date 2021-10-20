// **********************************************
// Ordinativi Di Competenza Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiDiCompetenzaOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ORDIDICOMOPE_RIFBILANCAPI = 0;
  private static int PFL_ORDIDICOMOPE_ORDINATIVO = 1;
  private static int PFL_ORDIDICOMOPE_ACCERTAMENTO = 2;
  private static int PFL_ORDIDICOMOPE_CAPITOLO = 3;
  private static int PFL_ORDIDICOMOPE_ARTICOLO = 4;
  private static int PFL_ORDIDICOMOPE_NUMEROORD = 5;
  private static int PFL_ORDIDICOMOPE_DDATAORD = 6;
  private static int PFL_ORDIDICOMOPE_NUMEROACC = 7;
  private static int PFL_ORDIDICOMOPE_ANNOACC = 8;
  private static int PFL_ORDIDICOMOPE_IMPORTO = 9;
  private static int PFL_ORDIDICOMOPE_ORDINATIVI = 10;
  private static int PFL_ORDIDICOMOPE_LABELACCERTA = 11;
  private static int PFL_ORDIDICOMOPE_LABELCAPITOL = 12;

  private static int PPQRY_ORD1 = 0;


  IDPanel PAN_ORDIDICOMOPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI32(IMDB);
    //
    //
    Init_PQRY_ORD1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI32(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI32, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI32, "TBL_PARAMETRI32");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI32,IMDBDef1.FLD_PARAMETRI32_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI32,IMDBDef1.FLD_PARAMETRI32_PARAMOPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI32, 0);
  }

  private static void Init_PQRY_ORD1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ORD1, 11);
    IMDB.set_TblCode(IMDBDef8.PQRY_ORD1, "PQRY_ORD1");
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ORDRIFBILCAP, "ORDRIFBILCAP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ORDRIFBILCAP,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ORDORDINATIV, "ORDORDINATIV");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ORDORDINATIV,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ORDACCERTAME, "ORDACCERTAME");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ORDACCERTAME,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_D_DATA_ORD, "D_DATA_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_D_DATA_ORD,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD1,IMDBDef8.PQSL_ORD1_ANNO_ORD,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ORD1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiDiCompetenzaOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiDiCompetenzaOpera()
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
    FormIdx = MyGlb.FRM_ORDIDICOMOPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C51C4224-50E4-41D4-9E75-A884857B4BD4";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 500;
    DesignHeight = 362;
    set_Caption(new IDVariant("Ordinativi Di Competenza Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 500;
    Frames[1].Height = 336;
    Frames[1].Caption = "Ordinativi Di Competenza Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_ORDIDICOMOPE = new IDPanel(w, this, 1, "PAN_ORDIDICOMOPE");
    Frames[1].Content = PAN_ORDIDICOMOPE;
    PAN_ORDIDICOMOPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDIDICOMOPE.VS = MainFrm.VisualStyleList;
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 500-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0E3AE52C-1F10-4BDA-9DB7-9F21A6E30344");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 440, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDIDICOMOPE.InitStatus = 2;
    PAN_ORDIDICOMOPE_Init();
    PAN_ORDIDICOMOPE_InitFields();
    PAN_ORDIDICOMOPE_InitQueries();
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
      PAN_ORDIDICOMOPE.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdinativiDiCompetenzaOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiDiCompetenzaOpera.class.getName() : (Glb.ClassWithPackage(OrdinativiDiCompetenzaOpera.class) ? OrdinativiDiCompetenzaOpera.class.getName().substring(OrdinativiDiCompetenzaOpera.class.getPackage().getName().length() + 1) : OrdinativiDiCompetenzaOpera.class.getName()));
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
      MainFrm.ErrObj.ProcError ("OrdinativiDiCompetenzaOpera", "LoadEvent", _e);
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
  private void PAN_ORDIDICOMOPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDIDICOMOPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDIDICOMOPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDIDICOMOPE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDIDICOMOPE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ORDIDICOMOPE);
    // Stub
  }

  private void PAN_ORDIDICOMOPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ORDIDICOMOPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDIDICOMOPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD1, IMDBDef8.PQSL_ORD1_D_DATA_ORD, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ORD1, IMDBDef8.PQSL_ORD1_D_DATA_ORD, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ORDIDICOMOPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDIDICOMOPE_Init()
  {

    PAN_ORDIDICOMOPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDIDICOMOPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDIDICOMOPE.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, "6FF1AFB7-A82D-402B-8AEA-5DB59E3AACA6");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, "Rif. Bilancio / Capitolo");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, "B806D2BB-BB13-472C-B699-6F10A1080B87");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, "Ordinativo");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, "526C52BF-8170-47FB-A411-C353DED2A98B");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, "Accertamento");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, "8EB33107-47BF-4922-939C-E322C739BB05");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, "CAPITOLO");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, "92EC89F1-0CA3-4A7A-AA4C-EC5FCF0B0890");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, "ARTICOLO");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, "B8AABEAF-9844-4B38-9255-F719763D10C5");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, "NUMERO ORD");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, "6236DCA9-7FED-4900-96B7-5D4FDF68DD9E");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, "D DATA ORD");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, "363472CE-CF00-4A5E-98BA-94E228278CA6");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, "NUMERO ACC");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, "EE81D0FA-DB2C-4EFE-BA0D-ABF056A85D79");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, "ANNO ACC");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, "04C95DE0-BC90-4181-9ED7-B0FDAD1DC482");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, "Importo");
    PAN_ORDIDICOMOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, "");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, "8BA19792-B7F0-4BBD-ABBA-EF92914932C3");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, "Ordinativi");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, "45B2A24F-C001-45BA-80E0-D5E852E16C2C");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, "Accertamento");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDIDICOMOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, "554871B2-9C1C-486E-B260-2935894DD135");
    PAN_ORDIDICOMOPE.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, "Capitolo/Art.");
    PAN_ORDIDICOMOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDIDICOMOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ORDIDICOMOPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, MyGlb.PANEL_LIST, 0, 36, 204, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, MyGlb.PANEL_LIST, 84);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, MyGlb.PANEL_LIST, "Rif. Bilancio / Capitolo");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, MyGlb.PANEL_FORM, 4, 196, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, MyGlb.PANEL_FORM, 84);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, MyGlb.PANEL_FORM, 2);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_RIFBILANCAPI, MyGlb.PANEL_FORM, "Rif. Bilancio / Capitolo");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_RIFBILANCAPI, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldUnbound(PFL_ORDIDICOMOPE_RIFBILANCAPI, true);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_RIFBILANCAPI, PPQRY_ORD1, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "ORDRIFBILCAP", 5, 201, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, MyGlb.PANEL_LIST, 60);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, MyGlb.PANEL_LIST, "Ordinativo");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, MyGlb.PANEL_FORM, 4, 244, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, MyGlb.PANEL_FORM, 60);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, MyGlb.PANEL_FORM, 2);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_ORDINATIVO, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldUnbound(PFL_ORDIDICOMOPE_ORDINATIVO, true);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_ORDINATIVO, PPQRY_ORD1, "TO_CHAR ( A.NUMERO_ORD ) || ' / ' || TO_CHAR ( A.D_DATA_ORD )", "ORDORDINATIV", 5, 201, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 292, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_ACCERTAMENTO, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldUnbound(PFL_ORDIDICOMOPE_ACCERTAMENTO, true);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_ACCERTAMENTO, PPQRY_ORD1, "TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ACC )", "ORDACCERTAME", 5, 201, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, MyGlb.PANEL_FORM, 4, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_CAPITOLO, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_CAPITOLO, PPQRY_ORD1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, MyGlb.PANEL_LIST, 100, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, MyGlb.PANEL_FORM, 4, 436, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_ARTICOLO, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_ARTICOLO, PPQRY_ORD1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, MyGlb.PANEL_LIST, 124, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, MyGlb.PANEL_FORM, 4, 340, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_NUMEROORD, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_NUMEROORD, PPQRY_ORD1, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, MyGlb.PANEL_LIST, 172, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, MyGlb.PANEL_LIST, 72);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, MyGlb.PANEL_LIST, "D DATA ORD");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, MyGlb.PANEL_FORM, 4, 364, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, MyGlb.PANEL_FORM, 72);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_DDATAORD, MyGlb.PANEL_FORM, "D DT. ORD");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_DDATAORD, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_DDATAORD, PPQRY_ORD1, "A.D_DATA_ORD", "D_DATA_ORD", 6, 19, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, MyGlb.PANEL_LIST, 244, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, MyGlb.PANEL_FORM, 4, 460, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_NUMEROACC, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_NUMEROACC, PPQRY_ORD1, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, MyGlb.PANEL_LIST, 292, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, MyGlb.PANEL_FORM, 4, 484, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_ANNOACC, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_ANNOACC, PPQRY_ORD1, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, MyGlb.PANEL_LIST, 336, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, MyGlb.PANEL_FORM, 420, 172, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDIDICOMOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_IMPORTO, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_IMPORTO, PPQRY_ORD1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, MyGlb.PANEL_LIST, 124, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, MyGlb.PANEL_LIST, 0);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, MyGlb.PANEL_LIST, 2);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, MyGlb.PANEL_FORM, 716, 0, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, MyGlb.PANEL_FORM, 0);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_ORDINATIVI, MyGlb.PANEL_FORM, 2);
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_ORDINATIVI, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_ORDINATIVI, -1, "", "ORDINATIVI", 0, 0, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, MyGlb.PANEL_LIST, 244, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, MyGlb.PANEL_FORM, 724, 8, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELACCERTA, MyGlb.PANEL_FORM, 2);
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_LABELACCERTA, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_ORDIDICOMOPE.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 732, 16, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIDICOMOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_ORDIDICOMOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIDICOMOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_ORDIDICOMOPE.SetFieldPage(PFL_ORDIDICOMOPE_LABELCAPITOL, -1, -1);
    PAN_ORDIDICOMOPE.SetFieldPanel(PFL_ORDIDICOMOPE_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
  }

  private void PAN_ORDIDICOMOPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDIDICOMOPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDIDICOMOPE.SetIMDB(IMDB, "PQRY_ORD1", true);
    PAN_ORDIDICOMOPE.set_SetString(MyGlb.MASTER_ROWNAME, "ORD");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as ORDRIFBILCAP, ");
    SQL.append("  TO_CHAR ( A.NUMERO_ORD ) || ' / ' || TO_CHAR ( A.D_DATA_ORD ) as ORDORDINATIV, ");
    SQL.append("  TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ACC ) as ORDACCERTAME, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.D_DATA_ORD as D_DATA_ORD, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD ");
    PAN_ORDIDICOMOPE.SetQuery(PPQRY_ORD1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ORD A, ");
    SQL.append("  ESEACC_OPE B ");
    PAN_ORDIDICOMOPE.SetQuery(PPQRY_ORD1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD = B.ESERCIZIO) ");
    SQL.append("and   (A.ANNO_ACC = B.ANNO_ACC) ");
    SQL.append("and   (A.NUMERO_ACC = B.NUMERO_ACC) ");
    SQL.append("and   (A.ANNO_ORD = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.ANNO_ACC = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND B.OPERA = ~~TBL_PARAMETRI32.PARAMOPERA~~) ");
    PAN_ORDIDICOMOPE.SetQuery(PPQRY_ORD1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDIDICOMOPE.SetQuery(PPQRY_ORD1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDIDICOMOPE.SetQuery(PPQRY_ORD1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.NUMERO_ORD ");
    PAN_ORDIDICOMOPE.SetQuery(PPQRY_ORD1, 5, SQL, -1, "");
    PAN_ORDIDICOMOPE.SetQueryDB(PPQRY_ORD1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDIDICOMOPE.SetMasterTable(0, "ORD");
    PAN_ORDIDICOMOPE.AddToSortList(PFL_ORDIDICOMOPE_CAPITOLO, true);
    PAN_ORDIDICOMOPE.AddToSortList(PFL_ORDIDICOMOPE_ARTICOLO, true);
    PAN_ORDIDICOMOPE.AddToSortList(PFL_ORDIDICOMOPE_NUMEROORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDIDICOMOPE.Status() == 2)
    {
      int oldListQBE = PAN_ORDIDICOMOPE.iUseListQBE;
      PAN_ORDIDICOMOPE.iUseListQBE = 0;
      PAN_ORDIDICOMOPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDIDICOMOPE.PanelCommand(Glb.PCM_FIND);
      PAN_ORDIDICOMOPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDIDICOMOPE) PAN_ORDIDICOMOPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDIDICOMOPE) PAN_ORDIDICOMOPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDIDICOMOPE) PAN_ORDIDICOMOPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDIDICOMOPE) PAN_ORDIDICOMOPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDIDICOMOPE) PAN_ORDIDICOMOPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
