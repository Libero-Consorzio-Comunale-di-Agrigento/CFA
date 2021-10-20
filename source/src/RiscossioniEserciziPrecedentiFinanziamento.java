// **********************************************
// Riscossioni Esercizi Precedenti Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RiscossioniEserciziPrecedentiFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_RISESEPREFIN_NUMEROORD = 0;
  private static int PFL_RISESEPREFIN_ANNOORD = 1;
  private static int PFL_RISESEPREFIN_DATA = 2;
  private static int PFL_RISESEPREFIN_IMPORTO = 3;
  private static int PFL_RISESEPREFIN_CAPITOLO = 4;
  private static int PFL_RISESEPREFIN_ARTICOLO = 5;
  private static int PFL_RISESEPREFIN_NUMIMP = 6;
  private static int PFL_RISESEPREFIN_ANNOIMP = 7;
  private static int PFL_RISESEPREFIN_DDATAORD = 8;
  private static int PFL_RISESEPREFIN_LABELORDINAT = 9;
  private static int PFL_RISESEPREFIN_LABELCAPITOL = 10;
  private static int PFL_RISESEPREFIN_LABELACCERTA = 11;
  private static int PFL_RISESEPREFIN_ORDINATIVO = 12;
  private static int PFL_RISESEPREFIN_RIFBILANCPEG = 13;
  private static int PFL_RISESEPREFIN_ACCERTAMENTO = 14;

  private static int PPQRY_PRE7 = 0;


  IDPanel PAN_RISESEPREFIN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI58(IMDB);
    //
    //
    Init_PQRY_PRE7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI58(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI58, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI58, "TBL_PARAMETRI58");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI58,IMDBDef1.FLD_PARAMETRI58_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI58,IMDBDef1.FLD_PARAMETRI58_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI58, 0);
  }

  private static void Init_PQRY_PRE7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PRE7, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_PRE7, "PQRY_PRE7");
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRREORD, "PARGENRREORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRREORD,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_D_DATA_INC, "D_DATA_INC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_D_DATA_INC,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRREIMP, "PARGENRREIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRREIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PAGERRRIBPEG, "PAGERRRIBPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PAGERRRIBPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRREACC, "PARGENRREACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRREACC,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRRECAP, "PARGENRRECAP");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRRECAP,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRREART, "PARGENRREART");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRREART,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRRNUIM, "PARGENRRNUIM");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRRNUIM,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRRANIM, "PARGENRRANIM");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGENRRANIM,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGERRDDAOR, "PARGERRDDAOR");
    IMDB.SetFldParams(IMDBDef8.PQRY_PRE7,IMDBDef8.PQSL_PRE7_PARGERRDDAOR,6,0,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PRE7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RiscossioniEserciziPrecedentiFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public RiscossioniEserciziPrecedentiFinanziamento()
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
    FormIdx = MyGlb.FRM_RISESEPREFIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1074D13C-5601-4BE5-BC59-AFDBA01FCDEB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 580;
    DesignHeight = 386;
    set_Caption(new IDVariant("Riscossioni Esercizi Precedenti Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 580;
    Frames[1].Height = 360;
    Frames[1].Caption = "Riscossioni Esercizi Precedenti Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_RISESEPREFIN = new IDPanel(w, this, 1, "PAN_RISESEPREFIN");
    Frames[1].Content = PAN_RISESEPREFIN;
    PAN_RISESEPREFIN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RISESEPREFIN.VS = MainFrm.VisualStyleList;
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5AC63BF2-07F0-4410-85BF-76315A0D29F7");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 492, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RISESEPREFIN.InitStatus = 2;
    PAN_RISESEPREFIN_Init();
    PAN_RISESEPREFIN_InitFields();
    PAN_RISESEPREFIN_InitQueries();
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
      PAN_RISESEPREFIN.UpdatePanel(MainFrm);
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
    return (obj instanceof RiscossioniEserciziPrecedentiFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RiscossioniEserciziPrecedentiFinanziamento.class.getName() : (Glb.ClassWithPackage(RiscossioniEserciziPrecedentiFinanziamento.class) ? RiscossioniEserciziPrecedentiFinanziamento.class.getName().substring(RiscossioniEserciziPrecedentiFinanziamento.class.getPackage().getName().length() + 1) : RiscossioniEserciziPrecedentiFinanziamento.class.getName()));
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
      MainFrm.ErrObj.ProcError ("RiscossioniEserciziPrecedentiFinanziamento", "LoadEvent", _e);
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
  private void PAN_RISESEPREFIN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RISESEPREFIN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RISESEPREFIN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RISESEPREFIN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RISESEPREFIN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_RISESEPREFIN);
    // Stub
  }

  private void PAN_RISESEPREFIN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_RISESEPREFIN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_RISESEPREFIN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RISESEPREFIN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RISESEPREFIN_Init()
  {

    PAN_RISESEPREFIN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RISESEPREFIN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RISESEPREFIN.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, "00AD2ECC-2BEE-4954-A6A0-D4DDA5C37256");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, "NUMERO ORD");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, "9340D18D-4CFF-4490-9D8E-649D0C4412F1");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, "ANNO ORD");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, "E46B3B87-672E-447C-B78E-D3AAA7DA8980");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, "Data");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, "504D8EB0-DCFE-457B-A99C-EB30043930B8");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, "Importo");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, "05604DC7-A070-4171-BB6E-156E7FB55F03");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, "Capitolo");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, "673BE5C0-9CF1-48F6-AAED-D085787CD950");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, "Articolo");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, "8CEC1B04-B7E1-4C4C-B99F-AA1DABE48ED8");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, "Num Imp");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, "DCC43535-2F48-42D3-9489-1AE2DFF91942");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, "Anno Imp");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, "680A1DB8-AA0B-490E-89D3-03EB61BDF4A2");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, "D Data Ord");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, MyGlb.VIS_NORMFIELPADR);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, "53358D84-8D81-4D4A-9CAE-475A118BFE52");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, "Ordinativo");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, MyGlb.VIS_LABEVISUSTYL);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, "7069C34A-AFF2-42DF-AFA4-B5B07AF68B4A");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, "Capitolo/Art.");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, "ED53D286-8E03-4387-BF97-FF4EE4C15E98");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, "Accertamento");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, "C7238CCA-74A4-47DB-B8F5-4B17AB039450");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, "Ordinativo");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, "873D447F-A7F3-4F34-B0EA-C5678E778CF3");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_RISESEPREFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, "BE04566D-BD50-4600-86E0-D1606050A491");
    PAN_RISESEPREFIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, "Accertamento");
    PAN_RISESEPREFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, "");
    PAN_RISESEPREFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_RISESEPREFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RISESEPREFIN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, MyGlb.PANEL_FORM, 4, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_NUMEROORD, -1, -1);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_NUMEROORD, PPQRY_PRE7, "B.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, MyGlb.PANEL_LIST, 44, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, MyGlb.PANEL_LIST, 64);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, MyGlb.PANEL_FORM, 4, 268, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, MyGlb.PANEL_FORM, 64);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_ANNOORD, -1, -1);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_ANNOORD, PPQRY_PRE7, "B.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, MyGlb.PANEL_LIST, 84, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, MyGlb.PANEL_LIST, 68);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, MyGlb.PANEL_LIST, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, MyGlb.PANEL_FORM, 68);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, MyGlb.PANEL_FORM, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_DATA, -1, -1);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_DATA, PPQRY_PRE7, "B.D_DATA_INC", "D_DATA_INC", 6, 10, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, MyGlb.PANEL_LIST, 160, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, MyGlb.PANEL_FORM, 4, 124, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_IMPORTO, -1, -1);
    PAN_RISESEPREFIN.SetFieldUnbound(PFL_RISESEPREFIN_IMPORTO, true);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_IMPORTO, PPQRY_PRE7, "SUM(B.IMPORTO)", "PARGENRREIMP", 3, 28, 6, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, MyGlb.PANEL_LIST, 260, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, MyGlb.PANEL_FORM, 4, 244, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, MyGlb.PANEL_FORM, 48);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_CAPITOLO, MyGlb.PANEL_FORM, "Capit.");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_CAPITOLO, -1, -1);
    PAN_RISESEPREFIN.SetFieldUnbound(PFL_RISESEPREFIN_CAPITOLO, true);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_CAPITOLO, PPQRY_PRE7, "MAX(A.CAPITOLO)", "PARGENRRECAP", 3, 28, 6, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, MyGlb.PANEL_LIST, 372, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, MyGlb.PANEL_FORM, 4, 244, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, MyGlb.PANEL_FORM, 44);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ARTICOLO, MyGlb.PANEL_FORM, "Artic.");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_ARTICOLO, -1, -1);
    PAN_RISESEPREFIN.SetFieldUnbound(PFL_RISESEPREFIN_ARTICOLO, true);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_ARTICOLO, PPQRY_PRE7, "MAX(A.ARTICOLO)", "PARGENRREART", 1, 19, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, MyGlb.PANEL_LIST, 400, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, MyGlb.PANEL_LIST, 52);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, MyGlb.PANEL_LIST, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, MyGlb.PANEL_LIST, "Num Imp");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, MyGlb.PANEL_FORM, 4, 244, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, MyGlb.PANEL_FORM, 52);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, MyGlb.PANEL_FORM, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_NUMIMP, MyGlb.PANEL_FORM, "Nm. Im.");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_NUMIMP, -1, -1);
    PAN_RISESEPREFIN.SetFieldUnbound(PFL_RISESEPREFIN_NUMIMP, true);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_NUMIMP, PPQRY_PRE7, "MAX(A.NUMERO_ACC)", "PARGENRRNUIM", 1, 19, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, MyGlb.PANEL_LIST, 448, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, MyGlb.PANEL_LIST, 56);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, MyGlb.PANEL_LIST, "Anno Imp");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, MyGlb.PANEL_FORM, 4, 244, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, MyGlb.PANEL_FORM, 56);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ANNOIMP, MyGlb.PANEL_FORM, "Ann. Im.");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_ANNOIMP, -1, -1);
    PAN_RISESEPREFIN.SetFieldUnbound(PFL_RISESEPREFIN_ANNOIMP, true);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_ANNOIMP, PPQRY_PRE7, "MAX(A.ANNO_ACC)", "PARGENRRANIM", 1, 19, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, MyGlb.PANEL_LIST, 64);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, MyGlb.PANEL_LIST, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, MyGlb.PANEL_LIST, "D Data Ord");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, MyGlb.PANEL_FORM, 64);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, MyGlb.PANEL_FORM, 1);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_DDATAORD, MyGlb.PANEL_FORM, "D Dt. Ord");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_DDATAORD, -1, -1);
    PAN_RISESEPREFIN.SetFieldUnbound(PFL_RISESEPREFIN_DDATAORD, true);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_DDATAORD, PPQRY_PRE7, "MAX(C.D_DATA_ORD)", "PARGERRDDAOR", 6, 0, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, MyGlb.PANEL_LIST, 0, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, MyGlb.PANEL_LIST, 0);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, MyGlb.PANEL_LIST, 2);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, MyGlb.PANEL_FORM, 0, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, MyGlb.PANEL_FORM, 0);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELORDINAT, MyGlb.PANEL_FORM, 2);
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_LABELORDINAT, -1, -1);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_LABELORDINAT, -1, "", "LABELORDINAT", 0, 0, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 260, 0, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 8, 8, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_LABELCAPITOL, -1, -1);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, MyGlb.PANEL_LIST, 400, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, MyGlb.PANEL_FORM, 16, 16, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_LABELACCERTA, MyGlb.PANEL_FORM, 2);
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_LABELACCERTA, -1, -1);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, MyGlb.PANEL_LIST, 60);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, MyGlb.PANEL_LIST, 2);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, MyGlb.PANEL_LIST, "Ordinativo");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, MyGlb.PANEL_FORM, 4, 292, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, MyGlb.PANEL_FORM, 60);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, MyGlb.PANEL_FORM, 2);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ORDINATIVO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_ORDINATIVO, -1, -1);
    PAN_RISESEPREFIN.SetFieldUnbound(PFL_RISESEPREFIN_ORDINATIVO, true);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_ORDINATIVO, PPQRY_PRE7, "TO_CHAR ( B.NUMERO_ORD ) || ' / ' || TO_CHAR ( B.ANNO_ORD )", "PARGENRREORD", 5, 201, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 292, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_RIFBILANCPEG, -1, -1);
    PAN_RISESEPREFIN.SetFieldUnbound(PFL_RISESEPREFIN_RIFBILANCPEG, true);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_RIFBILANCPEG, PPQRY_PRE7, "TO_CHAR ( MAX(A.CAPITOLO) ) || ' / ' || TO_CHAR ( MAX(A.ARTICOLO) )", "PAGERRRIBPEG", 5, 201, 0, -13997);
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_RISESEPREFIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 292, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISESEPREFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_RISESEPREFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_RISESEPREFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISESEPREFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_RISESEPREFIN.SetFieldPage(PFL_RISESEPREFIN_ACCERTAMENTO, -1, -1);
    PAN_RISESEPREFIN.SetFieldUnbound(PFL_RISESEPREFIN_ACCERTAMENTO, true);
    PAN_RISESEPREFIN.SetFieldPanel(PFL_RISESEPREFIN_ACCERTAMENTO, PPQRY_PRE7, "TO_CHAR ( MAX(A.NUMERO_ACC) ) || ' / ' || TO_CHAR ( MAX(A.ANNO_ACC) )", "PARGENRREACC", 5, 201, 0, -13997);
  }

  private void PAN_RISESEPREFIN_InitQueries()
  {
    StringBuffer SQL;

    PAN_RISESEPREFIN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RISESEPREFIN.SetIMDB(IMDB, "PQRY_PRE7", true);
    PAN_RISESEPREFIN.set_SetString(MyGlb.MASTER_ROWNAME, "PARAMETRI GEN RRE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.NUMERO_ORD ) || ' / ' || TO_CHAR ( B.ANNO_ORD ) as PARGENRREORD, ");
    SQL.append("  B.D_DATA_INC as D_DATA_INC, ");
    SQL.append("  SUM(B.IMPORTO) as PARGENRREIMP, ");
    SQL.append("  TO_CHAR ( MAX(A.CAPITOLO) ) || ' / ' || TO_CHAR ( MAX(A.ARTICOLO) ) as PAGERRRIBPEG, ");
    SQL.append("  TO_CHAR ( MAX(A.NUMERO_ACC) ) || ' / ' || TO_CHAR ( MAX(A.ANNO_ACC) ) as PARGENRREACC, ");
    SQL.append("  B.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  B.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  MAX(A.CAPITOLO) as PARGENRRECAP, ");
    SQL.append("  MAX(A.ARTICOLO) as PARGENRREART, ");
    SQL.append("  MAX(A.NUMERO_ACC) as PARGENRRNUIM, ");
    SQL.append("  MAX(A.ANNO_ACC) as PARGENRRANIM, ");
    SQL.append("  MAX(C.D_DATA_ORD) as PARGERRDDAOR ");
    PAN_RISESEPREFIN.SetQuery(PPQRY_PRE7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  INCASSI B, ");
    SQL.append("  ORD C ");
    PAN_RISESEPREFIN.SetQuery(PPQRY_PRE7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_ORD < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ANNO_ORD = A.ANNO_ORD) ");
    SQL.append("and   (B.NUMERO_ORD = A.NUMERO_ORD) ");
    SQL.append("and   (B.ANNO_PRE = A.ANNO_PRE) ");
    SQL.append("and   (B.NUMERO_PRE = A.NUMERO_PRE) ");
    SQL.append("and   (A.ANNO_ORD = C.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = C.NUMERO_ORD) ");
    SQL.append("and   (A.ANNO_ORD < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_ACC < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  ACC D ");
    SQL.append("where (D.FINANZIAMENTO = ~~TBL_PARAMETRI58.PARAMFINANZI~~) ");
    SQL.append("and   (D.ANNO_ACC = C.ANNO_ACC) ");
    SQL.append("and   (D.NUMERO_ACC = C.NUMERO_ACC) ");
    SQL.append("))) ");
    PAN_RISESEPREFIN.SetQuery(PPQRY_PRE7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  B.NUMERO_ORD, ");
    SQL.append("  B.ANNO_ORD, ");
    SQL.append("  B.D_DATA_INC ");
    PAN_RISESEPREFIN.SetQuery(PPQRY_PRE7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RISESEPREFIN.SetQuery(PPQRY_PRE7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_ORD, ");
    SQL.append("  B.NUMERO_ORD ");
    PAN_RISESEPREFIN.SetQuery(PPQRY_PRE7, 5, SQL, -1, "");
    PAN_RISESEPREFIN.SetQueryDB(PPQRY_PRE7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RISESEPREFIN.SetMasterTable(0, "PRE");
    PAN_RISESEPREFIN.AddToSortList(PFL_RISESEPREFIN_ANNOORD, true);
    PAN_RISESEPREFIN.AddToSortList(PFL_RISESEPREFIN_NUMEROORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RISESEPREFIN.Status() == 2)
    {
      int oldListQBE = PAN_RISESEPREFIN.iUseListQBE;
      PAN_RISESEPREFIN.iUseListQBE = 0;
      PAN_RISESEPREFIN.PanelCommand(Glb.PCM_SEARCH);
      PAN_RISESEPREFIN.PanelCommand(Glb.PCM_FIND);
      PAN_RISESEPREFIN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RISESEPREFIN) PAN_RISESEPREFIN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RISESEPREFIN) PAN_RISESEPREFIN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RISESEPREFIN) PAN_RISESEPREFIN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RISESEPREFIN) PAN_RISESEPREFIN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RISESEPREFIN) PAN_RISESEPREFIN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
