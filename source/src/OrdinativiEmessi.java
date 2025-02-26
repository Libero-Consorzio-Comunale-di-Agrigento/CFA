// **********************************************
// Ordinativi Emessi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiEmessi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ORDINAEMESSI_NUMEROORD = 0;
  private static int PFL_ORDINAEMESSI_ANNOORD = 1;
  private static int PFL_ORDINAEMESSI_DATA = 2;
  private static int PFL_ORDINAEMESSI_IMPORTO = 3;
  private static int PFL_ORDINAEMESSI_INCASSATO = 4;
  private static int PFL_ORDINAEMESSI_CAPITOLO = 5;
  private static int PFL_ORDINAEMESSI_ARTICOLO = 6;
  private static int PFL_ORDINAEMESSI_NUMEROACC = 7;
  private static int PFL_ORDINAEMESSI_ANNOACC = 8;
  private static int PFL_ORDINAEMESSI_LABELORDINAT = 9;
  private static int PFL_ORDINAEMESSI_LABELCAPIART = 10;
  private static int PFL_ORDINAEMESSI_LABELACCERTA = 11;
  private static int PFL_ORDINAEMESSI_ORDINATIVO = 12;
  private static int PFL_ORDINAEMESSI_RIFBILANCPEG = 13;
  private static int PFL_ORDINAEMESSI_ACCERTAMENTO = 14;

  private static int PPQRY_ACC4 = 0;


  IDPanel PAN_ORDINAEMESSI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI54(IMDB);
    //
    //
    Init_PQRY_ACC4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI54(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI54, 6);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI54, "TBL_PARAMETRI54");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMDATA, "PARAMDATA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMTIPO,5,15,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMANNOACC, "PARAMANNOACC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMANNOACC,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMNUMEACC, "PARAMNUMEACC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMNUMEACC,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMESERCIN, "PARAMESERCIN");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI54,IMDBDef1.FLD_PARAMETRI54_PARAMESERCIN,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI54, 0);
  }

  private static void Init_PQRY_ACC4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ACC4, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_ACC4, "PQRY_ACC4");
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCORDINATIV, "ACCORDINATIV");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCORDINATIV,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCDATA, "ACCDATA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCDATA,6,0,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCIMPORTO, "ACCIMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCIMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCINCASSATO, "ACCINCASSATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCINCASSATO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_NUMEROACC, "NUMEROACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_NUMEROACC,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ANNOACC, "ANNOACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ANNOACC,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCRIFBILPEG, "ACCRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCRIFBILPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCACCERTAME, "ACCACCERTAME");
    IMDB.SetFldParams(IMDBDef8.PQRY_ACC4,IMDBDef8.PQSL_ACC4_ACCACCERTAME,5,201,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ACC4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiEmessi(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiEmessi()
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
    FormIdx = MyGlb.FRM_ORDINAEMESSI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CA252455-C925-408F-8A09-E8A90FCC81D7";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 628;
    DesignHeight = 378;
    set_Caption(new IDVariant("Ordinativi Emessi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 628;
    Frames[1].Height = 352;
    Frames[1].Caption = "Ordinativi Emessi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_ORDINAEMESSI = new IDPanel(w, this, 1, "PAN_ORDINAEMESSI");
    Frames[1].Content = PAN_ORDINAEMESSI;
    PAN_ORDINAEMESSI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINAEMESSI.VS = MainFrm.VisualStyleList;
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 628-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "84B6D519-703B-4D88-B795-C60F1EC2AC6E");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 580, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINAEMESSI.InitStatus = 2;
    PAN_ORDINAEMESSI_Init();
    PAN_ORDINAEMESSI_InitFields();
    PAN_ORDINAEMESSI_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      PAN_ORDINAEMESSI.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof OrdinativiEmessi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiEmessi.class.getName() : (Glb.ClassWithPackage(OrdinativiEmessi.class) ? OrdinativiEmessi.class.getName().substring(OrdinativiEmessi.class.getPackage().getName().length() + 1) : OrdinativiEmessi.class.getName()));
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMTIPO, 0))))
      {
        Frames[PAN_ORDINAEMESSI.FrIndex].set_Caption(IDL.Add((new IDVariant(Frames[PAN_ORDINAEMESSI.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMTIPO, 0), IDL.Add((new IDVariant(" ")), (new IDVariant("Finanziamento")))))).stringValue());
        set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMTIPO, 0), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("Finanziamento")), MainFrm.ESERCIZIO))))));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiEmessi", "LoadEvent", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiEmessi", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perch� stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMFINANZI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMTIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMANNOACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMNUMEACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMESERCIN, 0, new IDVariant());
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cio� quando viene portata in primo piano
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
  private void PAN_ORDINAEMESSI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINAEMESSI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINAEMESSI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINAEMESSI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINAEMESSI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ORDINAEMESSI);
    // Stub
  }

  private void PAN_ORDINAEMESSI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ORDINAEMESSI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINAEMESSI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINAEMESSI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINAEMESSI_Init()
  {

    PAN_ORDINAEMESSI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINAEMESSI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDINAEMESSI.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, "479CBAC7-266D-47B7-8AFA-1606606FDD77");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, "NUMERO ORD");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, "3C923976-24A7-49FB-A6DA-848B628AC55D");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, "ANNO ORD");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, "336276E8-FA3C-4065-B3BE-EA62D7202574");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, "Data");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, "09FDB290-8E3D-485F-89BD-346338100DDA");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, "Importo");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, "7042493B-3B2C-4DFD-9571-339294B07479");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, "Incassato");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, "D80A6F7B-D19B-4E80-9E33-BCDDA0373C13");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, "CAPITOLO");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, "B1667C54-6B1F-4B8A-95CE-9C01A100406B");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, "ARTICOLO");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, "7F0FDD00-AD7D-4F2A-AD31-C3F6FBA64668");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, "Numero Acc");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, "68547C1F-2200-49EF-8F55-E6B421EBCB74");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, "Anno Acc");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, "933C0EBE-630D-487D-B98D-DC220B6C1925");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, "Ordinativo");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, "17FBB3B0-C657-4765-B3A6-91E5296C68F4");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, "Capitolo/Art.");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, "4DF1B63E-FB2E-49C4-BEFA-499EBC6FC78E");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, "Accertamento");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, "A6742467-CE9D-41D1-93C9-4A8AA340E42B");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, "Ordinativo");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, "To String (NUMERO ORD) + \" / \" + To String (ANNO ORD)");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, "81D57587-E238-4125-A200-2A01436D459C");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, "262445C3-BEEA-4436-B76B-518FB3B8097A");
    PAN_ORDINAEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, "Accertamento");
    PAN_ORDINAEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, "");
    PAN_ORDINAEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINAEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ORDINAEMESSI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, MyGlb.PANEL_FORM, 4, 460, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_NUMEROORD, -1, -1);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_NUMEROORD, PPQRY_ACC4, "B.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, MyGlb.PANEL_LIST, 44, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, MyGlb.PANEL_LIST, 64);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, MyGlb.PANEL_FORM, 4, 484, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, MyGlb.PANEL_FORM, 64);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_ANNOORD, -1, -1);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_ANNOORD, PPQRY_ACC4, "B.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, MyGlb.PANEL_LIST, 84, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, MyGlb.PANEL_LIST, 32);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, MyGlb.PANEL_FORM, 4, 244, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, MyGlb.PANEL_FORM, 32);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_DATA, MyGlb.PANEL_FORM, "Dt.");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_DATA, -1, -1);
    PAN_ORDINAEMESSI.SetFieldUnbound(PFL_ORDINAEMESSI_DATA, true);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_DATA, PPQRY_ACC4, "MAX(B.D_DATA_ORD)", "ACCDATA", 6, 0, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, MyGlb.PANEL_LIST, 160, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_IMPORTO, -1, -1);
    PAN_ORDINAEMESSI.SetFieldUnbound(PFL_ORDINAEMESSI_IMPORTO, true);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_IMPORTO, PPQRY_ACC4, "MAX(B.IMPORTO)", "ACCIMPORTO", 3, 28, 6, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, MyGlb.PANEL_LIST, 260, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, MyGlb.PANEL_LIST, 56);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, MyGlb.PANEL_LIST, "Incassato");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, MyGlb.PANEL_FORM, 4, 292, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, MyGlb.PANEL_FORM, 56);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_INCASSATO, MyGlb.PANEL_FORM, "Incas.");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_INCASSATO, -1, -1);
    PAN_ORDINAEMESSI.SetFieldUnbound(PFL_ORDINAEMESSI_INCASSATO, true);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_INCASSATO, PPQRY_ACC4, "MAX(B.INCASSATO)", "ACCINCASSATO", 3, 28, 6, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, MyGlb.PANEL_LIST, 360, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, MyGlb.PANEL_FORM, 4, 532, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_CAPITOLO, -1, -1);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_CAPITOLO, PPQRY_ACC4, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, MyGlb.PANEL_LIST, 464, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, MyGlb.PANEL_FORM, 4, 556, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_ARTICOLO, -1, -1);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_ARTICOLO, PPQRY_ACC4, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, MyGlb.PANEL_LIST, 488, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, MyGlb.PANEL_LIST, 68);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, MyGlb.PANEL_LIST, "Num. Acc");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, MyGlb.PANEL_FORM, 4, 460, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, MyGlb.PANEL_FORM, 68);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_NUMEROACC, MyGlb.PANEL_FORM, "Num. Acc");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_NUMEROACC, -1, -1);
    PAN_ORDINAEMESSI.SetFieldUnbound(PFL_ORDINAEMESSI_NUMEROACC, true);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_NUMEROACC, PPQRY_ACC4, "MAX(B.NUMERO_ACC)", "NUMEROACC", 1, 19, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, MyGlb.PANEL_LIST, 536, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, MyGlb.PANEL_LIST, 56);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, MyGlb.PANEL_LIST, "Anno Acc");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, MyGlb.PANEL_FORM, 4, 460, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, MyGlb.PANEL_FORM, 56);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ANNOACC, MyGlb.PANEL_FORM, "Ann. Acc");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_ANNOACC, -1, -1);
    PAN_ORDINAEMESSI.SetFieldUnbound(PFL_ORDINAEMESSI_ANNOACC, true);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_ANNOACC, PPQRY_ACC4, "MAX(B.ANNO_ACC)", "ANNOACC", 1, 19, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, MyGlb.PANEL_LIST, 0, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, MyGlb.PANEL_LIST, 0);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, MyGlb.PANEL_LIST, 2);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, MyGlb.PANEL_FORM, 0, 4, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, MyGlb.PANEL_FORM, 0);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELORDINAT, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_LABELORDINAT, -1, -1);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_LABELORDINAT, -1, "", "LABELORDINAT", 0, 0, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, MyGlb.PANEL_LIST, 360, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, MyGlb.PANEL_LIST, 0);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, MyGlb.PANEL_LIST, 2);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, MyGlb.PANEL_FORM, 8, 12, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, MyGlb.PANEL_FORM, 0);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELCAPIART, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_LABELCAPIART, -1, -1);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_LABELCAPIART, -1, "", "LABELCAPIART", 0, 0, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, MyGlb.PANEL_LIST, 488, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, MyGlb.PANEL_FORM, 16, 20, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_LABELACCERTA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_LABELACCERTA, -1, -1);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, MyGlb.PANEL_LIST, 60);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, MyGlb.PANEL_LIST, 2);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, MyGlb.PANEL_LIST, "Ordinativo");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, MyGlb.PANEL_FORM, 4, 580, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, MyGlb.PANEL_FORM, 60);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, MyGlb.PANEL_FORM, 2);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ORDINATIVO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_ORDINATIVO, -1, -1);
    PAN_ORDINAEMESSI.SetFieldUnbound(PFL_ORDINAEMESSI_ORDINATIVO, true);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_ORDINATIVO, PPQRY_ACC4, "TO_CHAR ( B.NUMERO_ORD ) || ' / ' || TO_CHAR ( B.ANNO_ORD )", "ACCORDINATIV", 5, 201, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 580, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_RIFBILANCPEG, -1, -1);
    PAN_ORDINAEMESSI.SetFieldUnbound(PFL_ORDINAEMESSI_RIFBILANCPEG, true);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_RIFBILANCPEG, PPQRY_ACC4, "MAX(TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ))", "ACCRIFBILPEG", 5, 99, 0, -13997);
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_ORDINAEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 580, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_ORDINAEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ORDINAEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAEMESSI_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_ORDINAEMESSI.SetFieldPage(PFL_ORDINAEMESSI_ACCERTAMENTO, -1, -1);
    PAN_ORDINAEMESSI.SetFieldUnbound(PFL_ORDINAEMESSI_ACCERTAMENTO, true);
    PAN_ORDINAEMESSI.SetFieldPanel(PFL_ORDINAEMESSI_ACCERTAMENTO, PPQRY_ACC4, "TO_CHAR ( MAX(B.NUMERO_ACC) ) || ' / ' || TO_CHAR ( MAX(B.ANNO_ACC) )", "ACCACCERTAME", 5, 201, 0, -13997);
  }

  private void PAN_ORDINAEMESSI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINAEMESSI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDINAEMESSI.SetIMDB(IMDB, "PQRY_ACC4", true);
    PAN_ORDINAEMESSI.set_SetString(MyGlb.MASTER_ROWNAME, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.NUMERO_ORD ) || ' / ' || TO_CHAR ( B.ANNO_ORD ) as ACCORDINATIV, ");
    SQL.append("  MAX(B.D_DATA_ORD) as ACCDATA, ");
    SQL.append("  MAX(B.IMPORTO) as ACCIMPORTO, ");
    SQL.append("  MAX(B.INCASSATO) as ACCINCASSATO, ");
    SQL.append("  B.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  B.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  B.CAPITOLO as CAPITOLO, ");
    SQL.append("  B.ARTICOLO as ARTICOLO, ");
    SQL.append("  MAX(B.NUMERO_ACC) as NUMEROACC, ");
    SQL.append("  MAX(B.ANNO_ACC) as ANNOACC, ");
    SQL.append("  MAX(TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )) as ACCRIFBILPEG, ");
    SQL.append("  TO_CHAR ( MAX(B.NUMERO_ACC) ) || ' / ' || TO_CHAR ( MAX(B.ANNO_ACC) ) as ACCACCERTAME ");
    PAN_ORDINAEMESSI.SetQuery(PPQRY_ACC4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ACC A, ");
    SQL.append("  ORD B ");
    PAN_ORDINAEMESSI.SetQuery(PPQRY_ACC4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_ORD = NVL(~~TBL_PARAMETRI54.PARAMESERCIN~~, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (((DECODE(~~TBL_PARAMETRI54.PARAMTIPO~~, 'a Residuo', B.ANNO_ACC, 1) < DECODE(~~TBL_PARAMETRI54.PARAMTIPO~~, 'a Residuo', ~~TBL_DATISESSIONE.SESSIOESERCI~~, 2)) AND (DECODE(~~TBL_PARAMETRI54.PARAMTIPO~~, 'di Competenza', B.ANNO_ACC, 1) = DECODE(~~TBL_PARAMETRI54.PARAMTIPO~~, 'di Competenza', ~~TBL_DATISESSIONE.SESSIOESERCI~~, 1)) OR (~~TBL_PARAMETRI54.PARAMTIPO~~ IS NULL))) ");
    SQL.append("and   (B.D_DATA_ORD <= NVL(~~TBL_PARAMETRI54.PARAMDATA~~, B.D_DATA_ORD)) ");
    SQL.append("and   (NVL(A.FINANZIAMENTO, -1) = NVL(~~TBL_PARAMETRI54.PARAMFINANZI~~, NVL(A.FINANZIAMENTO, -1))) ");
    SQL.append("and   (A.ANNO_ACC = NVL(~~TBL_PARAMETRI54.PARAMANNOACC~~, A.ANNO_ACC)) ");
    SQL.append("and   (A.NUMERO_ACC = NVL(~~TBL_PARAMETRI54.PARAMNUMEACC~~, A.NUMERO_ACC)) ");
    SQL.append("and   (A.NUMERO_ACC = B.NUMERO_ACC) ");
    SQL.append("and   (A.ANNO_ACC = B.ANNO_ACC) ");
    PAN_ORDINAEMESSI.SetQuery(PPQRY_ACC4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.NUMERO_ORD, ");
    SQL.append("  B.ANNO_ORD ");
    PAN_ORDINAEMESSI.SetQuery(PPQRY_ACC4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINAEMESSI.SetQuery(PPQRY_ACC4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_ORD, ");
    SQL.append("  B.NUMERO_ORD ");
    PAN_ORDINAEMESSI.SetQuery(PPQRY_ACC4, 5, SQL, -1, "");
    PAN_ORDINAEMESSI.SetQueryDB(PPQRY_ACC4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINAEMESSI.SetMasterTable(0, "ACC");
    PAN_ORDINAEMESSI.AddToSortList(PFL_ORDINAEMESSI_ANNOORD, true);
    PAN_ORDINAEMESSI.AddToSortList(PFL_ORDINAEMESSI_NUMEROORD, true);
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_ORDINAEMESSI.Status() == 2)
    {
      int oldListQBE = PAN_ORDINAEMESSI.iUseListQBE;
      PAN_ORDINAEMESSI.iUseListQBE = 0;
      PAN_ORDINAEMESSI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINAEMESSI.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINAEMESSI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINAEMESSI) PAN_ORDINAEMESSI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINAEMESSI) PAN_ORDINAEMESSI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINAEMESSI) PAN_ORDINAEMESSI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINAEMESSI) PAN_ORDINAEMESSI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINAEMESSI) PAN_ORDINAEMESSI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
