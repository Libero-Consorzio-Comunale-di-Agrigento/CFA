// **********************************************
// Previsioni Iniziali Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniInizialiOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PREVINIZOPER_CAPITOLO = 0;
  private static int PFL_PREVINIZOPER_ARTICOLO = 1;
  private static int PFL_PREVINIZOPER_PREVISINIZIA = 2;
  private static int PFL_PREVINIZOPER_VARIAZIONI = 3;
  private static int PFL_PREVINIZOPER_PREVISATTUAL = 4;
  private static int PFL_PREVINIZOPER_FINANZIAMEN1 = 5;
  private static int PFL_PREVINIZOPER_DESCRIZIONE = 6;
  private static int PFL_PREVINIZOPER_LABELCAPITOL = 7;
  private static int PFL_PREVINIZOPER_LABELFINANZI = 8;
  private static int PFL_PREVINIZOPER_RIFBILANCPEG = 9;
  private static int PFL_PREVINIZOPER_FINANZIAMENT = 10;

  private static int PPQRY_BILFIN1 = 0;


  IDPanel PAN_PREVINIZOPER;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI22(IMDB);
    //
    //
    Init_PQRY_BILFIN1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI22(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI22, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI22, "TBL_PARAMETRI22");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI22,IMDBDef1.FLD_PARAMETRI22_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI22,IMDBDef1.FLD_PARAMETRI22_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI22,IMDBDef1.FLD_PARAMETRI22_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI22,IMDBDef1.FLD_PARAMETRI22_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI22,IMDBDef1.FLD_PARAMETRI22_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI22,IMDBDef1.FLD_PARAMETRI22_PARAMTIPO,5,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI22, 0);
  }

  private static void Init_PQRY_BILFIN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_BILFIN1, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_BILFIN1, "PQRY_BILFIN1");
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_BILFIRIBIPEG, "BILFIRIBIPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_BILFIRIBIPEG,5,203,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_VARIAZIONI,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_BILFINPREATT, "BILFINPREATT");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_BILFINPREATT,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_BILFINFINANZ, "BILFINFINANZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_BILFINFINANZ,5,304,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN1,IMDBDef8.PQSL_BILFIN1_DESCRIZIONE,5,200,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_BILFIN1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniInizialiOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniInizialiOpera()
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
    FormIdx = MyGlb.FRM_PREVINIZOPER;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8F623463-933B-492F-9745-2F5FE850023E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 330;
    set_Caption(new IDVariant("Previsioni Iniziali Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 304;
    Frames[1].Caption = "Previsioni Iniziali Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 304;
    PAN_PREVINIZOPER = new IDPanel(w, this, 1, "PAN_PREVINIZOPER");
    Frames[1].Content = PAN_PREVINIZOPER;
    PAN_PREVINIZOPER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVINIZOPER.VS = MainFrm.VisualStyleList;
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 304-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7560011F-3E09-4A65-84A2-8C0CD9F4A016");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 804, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVINIZOPER.InitStatus = 2;
    PAN_PREVINIZOPER_Init();
    PAN_PREVINIZOPER_InitFields();
    PAN_PREVINIZOPER_InitQueries();
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
      PAN_PREVINIZOPER.UpdatePanel(MainFrm);
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
    return (obj instanceof PrevisioniInizialiOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniInizialiOpera.class.getName() : (Glb.ClassWithPackage(PrevisioniInizialiOpera.class) ? PrevisioniInizialiOpera.class.getName().substring(PrevisioniInizialiOpera.class.getPackage().getName().length() + 1) : PrevisioniInizialiOpera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Previsioni Iniziali Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVINIZOPER_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVINIZOPER);
      // 
      // Previsioni Iniziali Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PREVINIZOPER.set_ToolTip(Glb.OBJ_FIELD,PFL_PREVINIZOPER_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_BILFIN1, IMDBDef8.PQSL_BILFIN1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniInizialiOpera", "PrevisioniInizialiOperaOnDynamicPropertiesEvent", _e);
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
      Frames[PAN_PREVINIZOPER.FrIndex].set_Caption(IDL.Add(IDL.Add((new IDVariant(Frames[PAN_PREVINIZOPER.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), (new IDVariant(" "))))), IMDB.Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMTIPO, 0)).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMTIPO, 0), MainFrm.ESERCIZIO))))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniInizialiOpera", "LoadEvent", _e);
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
  private void PAN_PREVINIZOPER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVINIZOPER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVINIZOPER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVINIZOPER, Cancel);
    // Stub
  }

  private void PAN_PREVINIZOPER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PREVINIZOPER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PREVINIZOPER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVINIZOPER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVINIZOPER_Init()
  {

    PAN_PREVINIZOPER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVINIZOPER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PREVINIZOPER.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, "891ABF76-97EB-44B0-AD21-7189D6F49190");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, "CAPITOLO");
    PAN_PREVINIZOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, "");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, "D7AEE5A9-6F43-4A4E-9EFD-6D03CE9F66DA");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, "ARTICOLO");
    PAN_PREVINIZOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, "");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, "6D3806DF-7CF3-431B-96C4-C6A86F52B01B");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, "Previsione Iniziale");
    PAN_PREVINIZOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, "");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, "A4461668-FFB8-435C-9656-DC7B4C063F79");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, "Variazioni");
    PAN_PREVINIZOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, "");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, "B8E9D388-FBE1-4203-82F1-D50BF9136FA7");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, "Previsione Attuale");
    PAN_PREVINIZOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, "");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, "2BBDBF2E-1734-4824-A0F6-EEDA1B9F23A0");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, "FINANZIAMENTO");
    PAN_PREVINIZOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, "");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, "8CD3C7EA-530A-4826-8DFC-F6F02D127F97");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, "DESCRIZIONE");
    PAN_PREVINIZOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, "");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, "17E77256-D9D4-464E-937E-98C4E80CC315");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, "Capitolo/Art.");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, "DB0D0881-8603-455F-91A8-A5E6E3AF22EA");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, "Finanziamento");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, MyGlb.VIS_LABEVISUSTYL);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, "7D806EB1-4FC7-452B-B3C5-554E043ADB37");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_PREVINIZOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, "To String (BIL FIN CAPITOLO) + \" \" + \" / \" + \" \" + To String (BIL FIN ARTICOLO)");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PREVINIZOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, "D4218556-B46E-4A7A-9572-C9EC290031A8");
    PAN_PREVINIZOPER.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, "Finanziamento");
    PAN_PREVINIZOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, "To String (BIL FIN FINANZIAMENTO) + \" \" + \" - \" + \" \" + FINANZIAMENTI DESCRIZIONE");
    PAN_PREVINIZOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_PREVINIZOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PREVINIZOPER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, MyGlb.PANEL_FORM, 4, 472, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_CAPITOLO, -1, -1);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_CAPITOLO, PPQRY_BILFIN1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, MyGlb.PANEL_LIST, 104, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, MyGlb.PANEL_FORM, 4, 496, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_ARTICOLO, -1, -1);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_ARTICOLO, PPQRY_BILFIN1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, MyGlb.PANEL_LIST, 128, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, MyGlb.PANEL_LIST, 64);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, MyGlb.PANEL_LIST, "Previsione Iniziale");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, MyGlb.PANEL_FORM, 4, 244, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, MyGlb.PANEL_FORM, 136);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISINIZIA, MyGlb.PANEL_FORM, "Previsione Iniziale");
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_PREVISINIZIA, -1, -1);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_PREVISINIZIA, PPQRY_BILFIN1, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, MyGlb.PANEL_LIST, 228, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, MyGlb.PANEL_LIST, 68);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, MyGlb.PANEL_FORM, 4, 268, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, MyGlb.PANEL_FORM, 136);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_VARIAZIONI, -1, -1);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_VARIAZIONI, PPQRY_BILFIN1, "A.VARIAZIONI", "VARIAZIONI", 3, 14, 2, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, MyGlb.PANEL_LIST, 328, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, MyGlb.PANEL_LIST, 96);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, MyGlb.PANEL_LIST, "Previsione Attuale");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, MyGlb.PANEL_FORM, 4, 376, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, MyGlb.PANEL_FORM, 96);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_PREVISATTUAL, MyGlb.PANEL_FORM, "Previs. Attuale");
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_PREVISATTUAL, -1, -1);
    PAN_PREVINIZOPER.SetFieldUnbound(PFL_PREVINIZOPER_PREVISATTUAL, true);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_PREVISATTUAL, PPQRY_BILFIN1, "A.STN_INI_CO + A.VARIAZIONI", "BILFINPREATT", 3, 28, 6, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, MyGlb.PANEL_LIST, 428, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, MyGlb.PANEL_LIST, 92);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, MyGlb.PANEL_LIST, "FINAN.");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 520, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, MyGlb.PANEL_FORM, 92);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMEN1, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_FINANZIAMEN1, -1, -1);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_FINANZIAMEN1, PPQRY_BILFIN1, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 472, 36, 332, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 544, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCR.");
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_DESCRIZIONE, -1, -1);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_DESCRIZIONE, PPQRY_BILFIN1, "B.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 228, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_LABELCAPITOL, -1, -1);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, MyGlb.PANEL_LIST, 428, 0, 376, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, MyGlb.PANEL_LIST, 0);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, MyGlb.PANEL_LIST, 2);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, MyGlb.PANEL_FORM, 8, 8, 228, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, MyGlb.PANEL_FORM, 0);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_LABELFINANZI, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_LABELFINANZI, -1, -1);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_LABELFINANZI, -1, "", "LABELFINANZI", 0, 0, 0, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 580, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_RIFBILANCPEG, -1, -1);
    PAN_PREVINIZOPER.SetFieldUnbound(PFL_PREVINIZOPER_RIFBILANCPEG, true);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_RIFBILANCPEG, PPQRY_BILFIN1, "TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO )", "BILFIRIBIPEG", 5, 203, 0, -13997);
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, MyGlb.PANEL_LIST, 2);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_PREVINIZOPER.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 580, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, MyGlb.PANEL_FORM, 80);
    PAN_PREVINIZOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZOPER_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_PREVINIZOPER.SetFieldPage(PFL_PREVINIZOPER_FINANZIAMENT, -1, -1);
    PAN_PREVINIZOPER.SetFieldUnbound(PFL_PREVINIZOPER_FINANZIAMENT, true);
    PAN_PREVINIZOPER.SetFieldPanel(PFL_PREVINIZOPER_FINANZIAMENT, PPQRY_BILFIN1, "TO_CHAR ( A.FINANZIAMENTO ) || ' ' || ' - ' || ' ' || B.DESCRIZIONE", "BILFINFINANZ", 5, 304, 0, -13997);
  }

  private void PAN_PREVINIZOPER_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVINIZOPER.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PREVINIZOPER.SetIMDB(IMDB, "PQRY_BILFIN1", true);
    PAN_PREVINIZOPER.set_SetString(MyGlb.MASTER_ROWNAME, "BIL FIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO ) as BILFIRIBIPEG, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.VARIAZIONI as VARIAZIONI, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI as BILFINPREATT, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as BILFINFINANZ, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE ");
    PAN_PREVINIZOPER.SetQuery(PPQRY_BILFIN1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    PAN_PREVINIZOPER.SetQuery(PPQRY_BILFIN1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FINANZIAMENTO = B.CODICE(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.OPERA = ~~TBL_PARAMETRI22.PARAMOPERA~~ AND A.E_S = ~~TBL_PARAMETRI22.PARAMES~~) ");
    PAN_PREVINIZOPER.SetQuery(PPQRY_BILFIN1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREVINIZOPER.SetQuery(PPQRY_BILFIN1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREVINIZOPER.SetQuery(PPQRY_BILFIN1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_PREVINIZOPER.SetQuery(PPQRY_BILFIN1, 5, SQL, -1, "");
    PAN_PREVINIZOPER.SetQueryDB(PPQRY_BILFIN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVINIZOPER.SetMasterTable(0, "BIL_FIN");
    PAN_PREVINIZOPER.AddToSortList(PFL_PREVINIZOPER_CAPITOLO, true);
    PAN_PREVINIZOPER.AddToSortList(PFL_PREVINIZOPER_ARTICOLO, true);
    PAN_PREVINIZOPER.AddToSortList(PFL_PREVINIZOPER_FINANZIAMEN1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVINIZOPER.Status() == 2)
    {
      int oldListQBE = PAN_PREVINIZOPER.iUseListQBE;
      PAN_PREVINIZOPER.iUseListQBE = 0;
      PAN_PREVINIZOPER.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVINIZOPER.PanelCommand(Glb.PCM_FIND);
      PAN_PREVINIZOPER.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVINIZOPER) PAN_PREVINIZOPER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVINIZOPER) PAN_PREVINIZOPER_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVINIZOPER) PAN_PREVINIZOPER_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVINIZOPER) PAN_PREVINIZOPER_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREVINIZOPER) PAN_PREVINIZOPER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
