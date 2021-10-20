// **********************************************
// Pagamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Pagamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PAGAMENTI_NUMEROMAND = 0;
  private static int PFL_PAGAMENTI_ANNOMAND = 1;
  private static int PFL_PAGAMENTI_DATA = 2;
  private static int PFL_PAGAMENTI_IMPORTO = 3;
  private static int PFL_PAGAMENTI_CAPITOLO = 4;
  private static int PFL_PAGAMENTI_ARTICOLO = 5;
  private static int PFL_PAGAMENTI_NUMIMP = 6;
  private static int PFL_PAGAMENTI_ANNOIMP = 7;
  private static int PFL_PAGAMENTI_LABELMANDATO = 8;
  private static int PFL_PAGAMENTI_LABELCAPITOL = 9;
  private static int PFL_PAGAMENTI_LABELIMPEGNO = 10;
  private static int PFL_PAGAMENTI_MANDATO = 11;
  private static int PFL_PAGAMENTI_RIFBILANCPEG = 12;
  private static int PFL_PAGAMENTI_IMPEGNO = 13;

  private static int PPQRY_LIQ51 = 0;


  IDPanel PAN_PAGAMENTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI52(IMDB);
    //
    //
    Init_PQRY_LIQ51(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI52(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI52, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI52, "TBL_PARAMETRI52");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI52,IMDBDef1.FLD_PARAMETRI52_PARAMDATA, "PARAMDATA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI52,IMDBDef1.FLD_PARAMETRI52_PARAMDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI52,IMDBDef1.FLD_PARAMETRI52_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI52,IMDBDef1.FLD_PARAMETRI52_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI52,IMDBDef1.FLD_PARAMETRI52_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI52,IMDBDef1.FLD_PARAMETRI52_PARAMTIPO,5,15,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI52, 0);
  }

  private static void Init_PQRY_LIQ51(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_LIQ51, 11);
    IMDB.set_TblCode(IMDBDef8.PQRY_LIQ51, "PQRY_LIQ51");
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQMANDATO, "LIQMANDATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQMANDATO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_D_DATA_PAGAM, "D_DATA_PAGAM");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_D_DATA_PAGAM,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQIMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQRIFBILPEG, "LIQRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQIMPEGNO, "LIQIMPEGNO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQIMPEGNO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQCAPITOLO, "LIQCAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQCAPITOLO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQARTICOLO, "LIQARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQARTICOLO,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQNUMIMP, "LIQNUMIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQNUMIMP,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQANNOIMP, "LIQANNOIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ51,IMDBDef8.PQSL_LIQ51_LIQANNOIMP,1,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_LIQ51, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Pagamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public Pagamenti()
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
    FormIdx = MyGlb.FRM_PAGAMENTI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6C9449AF-B69E-484D-A855-0497D4422FF5";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 532;
    DesignHeight = 398;
    set_Caption(new IDVariant("Pagamenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 532;
    Frames[1].Height = 372;
    Frames[1].Caption = "Pagamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    PAN_PAGAMENTI = new IDPanel(w, this, 1, "PAN_PAGAMENTI");
    Frames[1].Content = PAN_PAGAMENTI;
    PAN_PAGAMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAGAMENTI.VS = MainFrm.VisualStyleList;
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2B2BC39E-283F-466E-9A9F-D604BA313CFB");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 484, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAGAMENTI.InitStatus = 2;
    PAN_PAGAMENTI_Init();
    PAN_PAGAMENTI_InitFields();
    PAN_PAGAMENTI_InitQueries();
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
      PAN_PAGAMENTI.UpdatePanel(MainFrm);
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
    return (obj instanceof Pagamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Pagamenti.class.getName() : (Glb.ClassWithPackage(Pagamenti.class) ? Pagamenti.class.getName().substring(Pagamenti.class.getPackage().getName().length() + 1) : Pagamenti.class.getName()));
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
      Frames[PAN_PAGAMENTI.FrIndex].set_Caption(IDL.Add((new IDVariant(Frames[PAN_PAGAMENTI.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMTIPO, 0), IDL.Add((new IDVariant(" ")), (new IDVariant("Finanziamento")))))).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMTIPO, 0), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("Finanziamento")), MainFrm.ESERCIZIO))))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Pagamenti", "LoadEvent", _e);
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
  private void PAN_PAGAMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAGAMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAGAMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAGAMENTI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAGAMENTI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PAGAMENTI);
    // Stub
  }

  private void PAN_PAGAMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PAGAMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PAGAMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAGAMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAGAMENTI_Init()
  {

    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "5C41C832-9F61-48AF-B006-4B0FFE844689");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "NUMERO MAND");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "790F19ED-F1EB-4241-B463-E0D7F0E803F4");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "ANNO MAND");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "FE93FFC3-E4F5-41CC-8692-129FED0CF49B");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "Data");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, "B92FDF16-1795-4BA7-8906-C81CF6980E16");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, "Importo");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, "6AE42A9E-13AF-46B2-A9C3-09ED34808F87");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, "Capitolo");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, "730B464C-5FD9-44E7-9A31-F75ED8C583D8");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, "Articolo");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, "BF61DB5B-C4CA-4F1E-9083-265BB2D38FAE");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, "Num Imp");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, "87AA7BE9-484B-482E-8B94-5936DE7EE608");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, "Anno Imp");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, "190C9126-C33A-4873-9B06-837CA8EAD28F");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, "Mandato");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, MyGlb.VIS_LABEVISUSTYL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, "C5079DEC-D6CE-498B-AE1A-E7D85061518D");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, "Capitolo");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, "4FEB6BCA-275A-43BA-8B57-2CEF2F1E547C");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, "Impegno");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, "A03D9D54-464F-4F11-9C60-7B6D21065C14");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, "Mandato");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, "0C4A0E90-BA4C-4E2A-AB8B-E9872567FDD1");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, "793DE7F8-3986-499C-9A76-ED55819C872F");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, "Impegno");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PAGAMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 388, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMEROMAND, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMEROMAND, PPQRY_LIQ51, "B.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 44, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, "ANN. MND.");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 4, 412, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ANNOMAND, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ANNOMAND, PPQRY_LIQ51, "B.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 80, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 4, 244, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATA, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATA, PPQRY_LIQ51, "B.D_DATA_PAGAM", "D_DATA_PAGAM", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_LIST, 156, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_IMPORTO, -1, -1);
    PAN_PAGAMENTI.SetFieldUnbound(PFL_PAGAMENTI_IMPORTO, true);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_IMPORTO, PPQRY_LIQ51, "SUM(B.IMPORTO)", "LIQIMPORTO", 3, 28, 6, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, MyGlb.PANEL_LIST, 256, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, MyGlb.PANEL_FORM, 4, 388, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, MyGlb.PANEL_FORM, 48);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CAPITOLO, MyGlb.PANEL_FORM, "Capit.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_CAPITOLO, -1, -1);
    PAN_PAGAMENTI.SetFieldUnbound(PFL_PAGAMENTI_CAPITOLO, true);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_CAPITOLO, PPQRY_LIQ51, "MAX(A.CAPITOLO)", "LIQCAPITOLO", 3, 28, 6, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, MyGlb.PANEL_LIST, 368, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, MyGlb.PANEL_FORM, 4, 388, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, MyGlb.PANEL_FORM, 44);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ARTICOLO, MyGlb.PANEL_FORM, "Artic.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ARTICOLO, -1, -1);
    PAN_PAGAMENTI.SetFieldUnbound(PFL_PAGAMENTI_ARTICOLO, true);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ARTICOLO, PPQRY_LIQ51, "MAX(A.ARTICOLO)", "LIQARTICOLO", 1, 19, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, MyGlb.PANEL_LIST, 396, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, MyGlb.PANEL_LIST, 52);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, MyGlb.PANEL_LIST, "Num Imp");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, MyGlb.PANEL_FORM, 4, 388, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, MyGlb.PANEL_FORM, 52);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMIMP, MyGlb.PANEL_FORM, "Nm. Im.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMIMP, -1, -1);
    PAN_PAGAMENTI.SetFieldUnbound(PFL_PAGAMENTI_NUMIMP, true);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMIMP, PPQRY_LIQ51, "MAX(A.NUMERO_IMP)", "LIQNUMIMP", 1, 19, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, MyGlb.PANEL_LIST, 444, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, MyGlb.PANEL_LIST, 56);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, MyGlb.PANEL_LIST, "Anno Imp");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, MyGlb.PANEL_FORM, 4, 388, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, MyGlb.PANEL_FORM, 56);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOIMP, MyGlb.PANEL_FORM, "Ann. Im.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ANNOIMP, -1, -1);
    PAN_PAGAMENTI.SetFieldUnbound(PFL_PAGAMENTI_ANNOIMP, true);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ANNOIMP, PPQRY_LIQ51, "MAX(A.ANNO_IMP)", "LIQANNOIMP", 1, 19, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, MyGlb.PANEL_LIST, 0, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, MyGlb.PANEL_LIST, 2);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, MyGlb.PANEL_FORM, 0, 4, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELMANDATO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_LABELMANDATO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_LABELMANDATO, -1, "", "LABELMANDATO", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, MyGlb.PANEL_LIST, 256, 0, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, MyGlb.PANEL_FORM, 8, 12, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELCAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_LABELCAPITOL, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, MyGlb.PANEL_LIST, 396, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, MyGlb.PANEL_FORM, 16, 20, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_LABELIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_LABELIMPEGNO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, MyGlb.PANEL_LIST, 52);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, MyGlb.PANEL_LIST, 2);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, MyGlb.PANEL_LIST, "Mandato");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, MyGlb.PANEL_FORM, 12, 444, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, MyGlb.PANEL_FORM, 52);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, MyGlb.PANEL_FORM, 2);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANDATO, MyGlb.PANEL_FORM, "Mand.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_MANDATO, -1, -1);
    PAN_PAGAMENTI.SetFieldUnbound(PFL_PAGAMENTI_MANDATO, true);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_MANDATO, PPQRY_LIQ51, "TO_CHAR ( B.NUMERO_MAND ) || ' / ' || TO_CHAR ( B.ANNO_MAND )", "LIQMANDATO", 5, 201, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 436, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_RIFBILANCPEG, -1, -1);
    PAN_PAGAMENTI.SetFieldUnbound(PFL_PAGAMENTI_RIFBILANCPEG, true);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_RIFBILANCPEG, PPQRY_LIQ51, "TO_CHAR ( MAX(A.CAPITOLO) ) || ' / ' || TO_CHAR ( MAX(A.ARTICOLO) )", "LIQRIFBILPEG", 5, 201, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, MyGlb.PANEL_FORM, 4, 436, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_IMPEGNO, -1, -1);
    PAN_PAGAMENTI.SetFieldUnbound(PFL_PAGAMENTI_IMPEGNO, true);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_IMPEGNO, PPQRY_LIQ51, "TO_CHAR ( MAX(A.NUMERO_IMP) ) || ' / ' || TO_CHAR ( MAX(A.ANNO_IMP) )", "LIQIMPEGNO", 5, 201, 0, -13997);
  }

  private void PAN_PAGAMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PAGAMENTI.SetIMDB(IMDB, "PQRY_LIQ51", true);
    PAN_PAGAMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.NUMERO_MAND ) || ' / ' || TO_CHAR ( B.ANNO_MAND ) as LIQMANDATO, ");
    SQL.append("  B.D_DATA_PAGAM as D_DATA_PAGAM, ");
    SQL.append("  SUM(B.IMPORTO) as LIQIMPORTO, ");
    SQL.append("  TO_CHAR ( MAX(A.CAPITOLO) ) || ' / ' || TO_CHAR ( MAX(A.ARTICOLO) ) as LIQRIFBILPEG, ");
    SQL.append("  TO_CHAR ( MAX(A.NUMERO_IMP) ) || ' / ' || TO_CHAR ( MAX(A.ANNO_IMP) ) as LIQIMPEGNO, ");
    SQL.append("  B.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  B.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  MAX(A.CAPITOLO) as LIQCAPITOLO, ");
    SQL.append("  MAX(A.ARTICOLO) as LIQARTICOLO, ");
    SQL.append("  MAX(A.NUMERO_IMP) as LIQNUMIMP, ");
    SQL.append("  MAX(A.ANNO_IMP) as LIQANNOIMP ");
    PAN_PAGAMENTI.SetQuery(PPQRY_LIQ51, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  PAGAMENTI B ");
    PAN_PAGAMENTI.SetQuery(PPQRY_LIQ51, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.NUMERO_MAND(+) = A.NUMERO_MAND) ");
    SQL.append("and   (B.ANNO_MAND(+) = A.ANNO_MAND) ");
    SQL.append("and   (B.ANNO_LIQ(+) = A.ANNO_LIQ) ");
    SQL.append("and   (B.NUMERO_LIQ(+) = A.NUMERO_LIQ) ");
    SQL.append("and   ((DECODE(~~TBL_PARAMETRI52.PARAMTIPO~~, 'a Residuo', A.ANNO_IMP, 1) < DECODE(~~TBL_PARAMETRI50.PARAMTIPO~~, 'a Residuo', ~~TBL_DATISESSIONE.SESSIOESERCI~~, 2)) AND (DECODE(~~TBL_PARAMETRI50.PARAMTIPO~~, 'di Competenza', A.ANNO_IMP, 1) = DECODE(~~TBL_PARAMETRI50.PARAMTIPO~~, 'di Competenza', ~~TBL_DATISESSIONE.SESSIOESERCI~~, 1))) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~TBL_PARAMETRI52.PARAMFINANZI~~) ");
    SQL.append("and   (B.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.D_DATA_PAGAM(+) <= ~~TBL_PARAMETRI52.PARAMDATA~~) ");
    PAN_PAGAMENTI.SetQuery(PPQRY_LIQ51, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  B.ANNO_MAND, ");
    SQL.append("  B.NUMERO_MAND, ");
    SQL.append("  B.D_DATA_PAGAM ");
    PAN_PAGAMENTI.SetQuery(PPQRY_LIQ51, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PAGAMENTI.SetQuery(PPQRY_LIQ51, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_MAND, ");
    SQL.append("  B.NUMERO_MAND ");
    PAN_PAGAMENTI.SetQuery(PPQRY_LIQ51, 5, SQL, -1, "");
    PAN_PAGAMENTI.SetQueryDB(PPQRY_LIQ51, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAGAMENTI.SetMasterTable(0, "LIQ");
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_ANNOMAND, true);
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_NUMEROMAND, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAGAMENTI.Status() == 2)
    {
      int oldListQBE = PAN_PAGAMENTI.iUseListQBE;
      PAN_PAGAMENTI.iUseListQBE = 0;
      PAN_PAGAMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAGAMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_PAGAMENTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
