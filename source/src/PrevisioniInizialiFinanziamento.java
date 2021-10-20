// **********************************************
// Previsioni Iniziali Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniInizialiFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PREVINIZFINA_CAPITOLO = 0;
  private static int PFL_PREVINIZFINA_ARTICOLO = 1;
  private static int PFL_PREVINIZFINA_PREVISINIZIA = 2;
  private static int PFL_PREVINIZFINA_VARIAZIONI = 3;
  private static int PFL_PREVINIZFINA_PREVISATTUAL = 4;
  private static int PFL_PREVINIZFINA_OPERA1 = 5;
  private static int PFL_PREVINIZFINA_DESCRIZIONE = 6;
  private static int PFL_PREVINIZFINA_LABELCAPITOL = 7;
  private static int PFL_PREVINIZFINA_LABELOPERA = 8;
  private static int PFL_PREVINIZFINA_RIFBILANCPEG = 9;
  private static int PFL_PREVINIZFINA_OPERA = 10;

  private static int PPQRY_BILFIN3 = 0;


  IDPanel PAN_PREVINIZFINA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI38(IMDB);
    //
    //
    Init_PQRY_BILFIN3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI38(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI38, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI38, "TBL_PARAMETRI38");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI38,IMDBDef1.FLD_PARAMETRI38_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI38,IMDBDef1.FLD_PARAMETRI38_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI38,IMDBDef1.FLD_PARAMETRI38_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI38,IMDBDef1.FLD_PARAMETRI38_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI38,IMDBDef1.FLD_PARAMETRI38_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI38,IMDBDef1.FLD_PARAMETRI38_PARAMTIPO,5,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI38, 0);
  }

  private static void Init_PQRY_BILFIN3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_BILFIN3, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_BILFIN3, "PQRY_BILFIN3");
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_BILFIRIBIPEG, "BILFIRIBIPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_BILFIRIBIPEG,5,203,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_VARIAZIONI,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_BILFINPREATT, "BILFINPREATT");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_BILFINPREATT,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_BILFINOPERA, "BILFINOPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_BILFINOPERA,5,304,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILFIN3,IMDBDef8.PQSL_BILFIN3_DESCRIZIONE,5,200,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_BILFIN3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniInizialiFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniInizialiFinanziamento()
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
    FormIdx = MyGlb.FRM_PREVINIZFINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "067AEA18-DCC3-43B8-B9B3-459F514BF1E3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 370;
    set_Caption(new IDVariant("Previsioni Iniziali Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 344;
    Frames[1].Caption = "Previsioni Iniziali Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_PREVINIZFINA = new IDPanel(w, this, 1, "PAN_PREVINIZFINA");
    Frames[1].Content = PAN_PREVINIZFINA;
    PAN_PREVINIZFINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVINIZFINA.VS = MainFrm.VisualStyleList;
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FD039C12-C3F9-4F77-9F82-78E7FBA508DD");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 804, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVINIZFINA.InitStatus = 2;
    PAN_PREVINIZFINA_Init();
    PAN_PREVINIZFINA_InitFields();
    PAN_PREVINIZFINA_InitQueries();
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
      PAN_PREVINIZFINA.UpdatePanel(MainFrm);
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
    return (obj instanceof PrevisioniInizialiFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniInizialiFinanziamento.class.getName() : (Glb.ClassWithPackage(PrevisioniInizialiFinanziamento.class) ? PrevisioniInizialiFinanziamento.class.getName().substring(PrevisioniInizialiFinanziamento.class.getPackage().getName().length() + 1) : PrevisioniInizialiFinanziamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Previsioni Iniziali Finanziamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVINIZFINA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVINIZFINA);
      // 
      // Previsioni Iniziali Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PREVINIZFINA.set_ToolTip(Glb.OBJ_FIELD,PFL_PREVINIZFINA_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_BILFIN3, IMDBDef8.PQSL_BILFIN3_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniInizialiFinanziamento", "PrevisioniInizialiFinanziamentoOnDynamicPropertiesEvent", _e);
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
      Frames[PAN_PREVINIZFINA.FrIndex].set_Caption(IDL.Add(IDL.Add((new IDVariant(Frames[PAN_PREVINIZFINA.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), (new IDVariant(" "))))), IMDB.Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMTIPO, 0)).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMTIPO, 0), MainFrm.ESERCIZIO))))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniInizialiFinanziamento", "LoadEvent", _e);
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
  private void PAN_PREVINIZFINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVINIZFINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVINIZFINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVINIZFINA, Cancel);
    // Stub
  }

  private void PAN_PREVINIZFINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PREVINIZFINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PREVINIZFINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVINIZFINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVINIZFINA_Init()
  {

    PAN_PREVINIZFINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVINIZFINA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PREVINIZFINA.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, "76F4F904-4563-445F-9BCB-0FE721FF47A1");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, "CAPITOLO");
    PAN_PREVINIZFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, "");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, "425E42C0-66B4-4DA8-993F-429ABD995F85");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, "ARTICOLO");
    PAN_PREVINIZFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, "");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, "366CC144-D7E8-4807-BCE2-A91A6922A2EB");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, "Previsione Iniziale");
    PAN_PREVINIZFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, "");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, "3903647E-26CF-4835-BD09-0D9EA4883B59");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, "Variazioni");
    PAN_PREVINIZFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, "");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, "BA164A4C-B63E-4B80-A585-0DE73175A6CB");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, "Previsione Attuale");
    PAN_PREVINIZFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, "");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, "6B912155-16CF-448B-90CA-081409B36580");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, "OPERA");
    PAN_PREVINIZFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, "");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, "35DE2BA1-6531-4A41-B888-7F898D4D657B");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, "DESCRIZIONE");
    PAN_PREVINIZFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, "");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, "0B0B26C5-3951-4382-BD8A-1D170CD341F9");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, "Capitolo/Art.");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, "25BFEA87-9257-4F60-B9C9-DA9124F66598");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, "Opera");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, "70F942B3-1883-4727-8EF7-A816108C6992");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_PREVINIZFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, "To String (BIL FIN CAPITOLO) + \" \" + \" / \" + \" \" + To String (BIL FIN ARTICOLO)");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PREVINIZFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, "C508F483-092E-4076-86EB-8E885690FA34");
    PAN_PREVINIZFINA.set_Header(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, "Opera");
    PAN_PREVINIZFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, "To String (BIL FIN OPERA) + \" \" + \" - \" + \" \" + OPERE DESCRIZIONE");
    PAN_PREVINIZFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_PREVINIZFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PREVINIZFINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, MyGlb.PANEL_FORM, 4, 472, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_CAPITOLO, -1, -1);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_CAPITOLO, PPQRY_BILFIN3, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, MyGlb.PANEL_FORM, 4, 496, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_ARTICOLO, -1, -1);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_ARTICOLO, PPQRY_BILFIN3, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, MyGlb.PANEL_LIST, 132, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, MyGlb.PANEL_LIST, 64);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, MyGlb.PANEL_LIST, "Previsione Iniziale");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, MyGlb.PANEL_FORM, 4, 244, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, MyGlb.PANEL_FORM, 136);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISINIZIA, MyGlb.PANEL_FORM, "Previsione Iniziale");
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_PREVISINIZIA, -1, -1);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_PREVISINIZIA, PPQRY_BILFIN3, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, MyGlb.PANEL_LIST, 232, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, MyGlb.PANEL_LIST, 68);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, MyGlb.PANEL_FORM, 4, 268, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, MyGlb.PANEL_FORM, 136);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_VARIAZIONI, -1, -1);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_VARIAZIONI, PPQRY_BILFIN3, "A.VARIAZIONI", "VARIAZIONI", 3, 14, 2, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, MyGlb.PANEL_LIST, 332, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, MyGlb.PANEL_LIST, 96);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, MyGlb.PANEL_LIST, "Previsione Attuale");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, MyGlb.PANEL_FORM, 4, 376, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, MyGlb.PANEL_FORM, 96);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_PREVISATTUAL, MyGlb.PANEL_FORM, "Previs. Attuale");
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_PREVISATTUAL, -1, -1);
    PAN_PREVINIZFINA.SetFieldUnbound(PFL_PREVINIZFINA_PREVISATTUAL, true);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_PREVISATTUAL, PPQRY_BILFIN3, "A.STN_INI_CO + A.VARIAZIONI", "BILFINPREATT", 3, 28, 6, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, MyGlb.PANEL_LIST, 432, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, MyGlb.PANEL_LIST, 44);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, MyGlb.PANEL_LIST, "OPERA");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, MyGlb.PANEL_FORM, 4, 520, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, MyGlb.PANEL_FORM, 44);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, MyGlb.PANEL_FORM, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA1, MyGlb.PANEL_FORM, "OPERA");
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_OPERA1, -1, -1);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_OPERA1, PPQRY_BILFIN3, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, MyGlb.PANEL_LIST, 476, 36, 328, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 544, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCR.");
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_DESCRIZIONE, -1, -1);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_DESCRIZIONE, PPQRY_BILFIN3, "B.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_LABELCAPITOL, -1, -1);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, MyGlb.PANEL_LIST, 432, 0, 372, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, MyGlb.PANEL_LIST, 0);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, MyGlb.PANEL_LIST, 2);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, MyGlb.PANEL_FORM, 8, 8, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, MyGlb.PANEL_FORM, 0);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_LABELOPERA, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_LABELOPERA, -1, -1);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_LABELOPERA, -1, "", "LABELOPERA", 0, 0, 0, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 580, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_RIFBILANCPEG, -1, -1);
    PAN_PREVINIZFINA.SetFieldUnbound(PFL_PREVINIZFINA_RIFBILANCPEG, true);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_RIFBILANCPEG, PPQRY_BILFIN3, "TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO )", "BILFIRIBIPEG", 5, 203, 0, -13997);
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, MyGlb.PANEL_LIST, 40);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, MyGlb.PANEL_LIST, 2);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_PREVINIZFINA.SetRect(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, MyGlb.PANEL_FORM, 4, 580, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVINIZFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, MyGlb.PANEL_FORM, 40);
    PAN_PREVINIZFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, MyGlb.PANEL_FORM, 2);
    PAN_PREVINIZFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVINIZFINA_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_PREVINIZFINA.SetFieldPage(PFL_PREVINIZFINA_OPERA, -1, -1);
    PAN_PREVINIZFINA.SetFieldUnbound(PFL_PREVINIZFINA_OPERA, true);
    PAN_PREVINIZFINA.SetFieldPanel(PFL_PREVINIZFINA_OPERA, PPQRY_BILFIN3, "TO_CHAR ( A.OPERA ) || ' ' || ' - ' || ' ' || B.DESCRIZIONE", "BILFINOPERA", 5, 304, 0, -13997);
  }

  private void PAN_PREVINIZFINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVINIZFINA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PREVINIZFINA.SetIMDB(IMDB, "PQRY_BILFIN3", true);
    PAN_PREVINIZFINA.set_SetString(MyGlb.MASTER_ROWNAME, "BIL FIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO ) as BILFIRIBIPEG, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.VARIAZIONI as VARIAZIONI, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI as BILFINPREATT, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as BILFINOPERA, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE ");
    PAN_PREVINIZFINA.SetQuery(PPQRY_BILFIN3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  OPERE B ");
    PAN_PREVINIZFINA.SetQuery(PPQRY_BILFIN3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.OPERA = B.CODICE(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.FINANZIAMENTO = ~~TBL_PARAMETRI38.PARAMFINANZI~~ AND A.E_S = ~~TBL_PARAMETRI38.PARAMES~~) ");
    PAN_PREVINIZFINA.SetQuery(PPQRY_BILFIN3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREVINIZFINA.SetQuery(PPQRY_BILFIN3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREVINIZFINA.SetQuery(PPQRY_BILFIN3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_PREVINIZFINA.SetQuery(PPQRY_BILFIN3, 5, SQL, -1, "");
    PAN_PREVINIZFINA.SetQueryDB(PPQRY_BILFIN3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVINIZFINA.SetMasterTable(0, "BIL_FIN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVINIZFINA.Status() == 2)
    {
      int oldListQBE = PAN_PREVINIZFINA.iUseListQBE;
      PAN_PREVINIZFINA.iUseListQBE = 0;
      PAN_PREVINIZFINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVINIZFINA.PanelCommand(Glb.PCM_FIND);
      PAN_PREVINIZFINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVINIZFINA) PAN_PREVINIZFINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVINIZFINA) PAN_PREVINIZFINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVINIZFINA) PAN_PREVINIZFINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVINIZFINA) PAN_PREVINIZFINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREVINIZFINA) PAN_PREVINIZFINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
