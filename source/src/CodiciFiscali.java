// **********************************************
// Codici Fiscali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CodiciFiscali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CODICIFISCAL_CODICE = 0;
  private static int PFL_CODICIFISCAL_TIPO = 1;
  private static int PFL_CODICIFISCAL_NUMEROACC = 2;
  private static int PFL_CODICIFISCAL_ANNOACC = 3;
  private static int PFL_CODICIFISCAL_APRIACCERTAM = 4;
  private static int PFL_CODICIFISCAL_INFOACCERTAM = 5;
  private static int PFL_CODICIFISCAL_NUMEROIMP = 6;
  private static int PFL_CODICIFISCAL_ANNOIMP = 7;
  private static int PFL_CODICIFISCAL_APRIIMPEGNI = 8;
  private static int PFL_CODICIFISCAL_INFOIMPEGNI = 9;
  private static int PFL_CODICIFISCAL_ACCERTAMENTO = 10;
  private static int PFL_CODICIFISCAL_IMPEGNO = 11;
  private static int PFL_CODICIFISCAL_UTENTEINSERI = 12;
  private static int PFL_CODICIFISCAL_DATAINSERIME = 13;
  private static int PFL_CODICIFISCAL_UTENTULTIAGG = 14;
  private static int PFL_CODICIFISCAL_DATAULTIMAGG = 15;

  private static int PPQRY_T60 = 0;

  private static int PPQRY_APRI = 1;
  private static int PPQRY_INFO = 2;


  IDPanel PAN_CODICIFISCAL;
  CIDREObj BUK_CODIFISCBOOK;
  OBook BKW_CODIFISCBOOK;
  //
  // Template Pages constants
  private static int BUK_CODIFISCBOOK_MST_CODFISBOOPAG = 1;
  private static int BUK_CODIFISCBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CODIFISCBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CODIFISCBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CODIFISCBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_CODIFISCBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CODIFISCBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_CODIFISCBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_CODIFISCBOOK_SPAN_CODICE = 9;
  private static int BUK_CODIFISCBOOK_RPTBOX_NUMERACCHEAD = 10;
  private static int BUK_CODIFISCBOOK_SPAN_NUMEROACC = 11;
  private static int BUK_CODIFISCBOOK_RPTBOX_NUMERIMPHEAD = 12;
  private static int BUK_CODIFISCBOOK_SPAN_NUMEROIMP = 13;
  private static int BUK_CODIFISCBOOK_SEC_TITOLO = 14;
  private static int BUK_CODIFISCBOOK_RPTBOX_NEWBOX4 = 15;
  private static int BUK_CODIFISCBOOK_SPAN_VARIADIBILAN = 16;
  private static int BUK_CODIFISCBOOK_SEC_DETAIL = 17;
  private static int BUK_CODIFISCBOOK_RPTBOX_CODICE = 18;
  private static int BUK_CODIFISCBOOK_SPAN_T5COCOFICOFB = 19;
  private static int BUK_CODIFISCBOOK_RPTBOX_NUMEROACC = 20;
  private static int BUK_CODIFISCBOOK_SPAN_T5NUACCOFCFB = 21;
  private static int BUK_CODIFISCBOOK_RPTBOX_ANNOACC = 22;
  private static int BUK_CODIFISCBOOK_SPAN_T5ANACCOFCFB = 23;
  private static int BUK_CODIFISCBOOK_RPTBOX_NUMEROIMP = 24;
  private static int BUK_CODIFISCBOOK_SPAN_T5NUIMCOFCFB = 25;
  private static int BUK_CODIFISCBOOK_RPTBOX_ANNOIMP = 26;
  private static int BUK_CODIFISCBOOK_SPAN_T5ANIMCOFCFB = 27;
  private static int BUK_CODIFISCBOOK_RPTBOX_NEWBOX = 28;
  private static int BUK_CODIFISCBOOK_SPAN_T5ACDECOFCFB = 29;
  private static int BUK_CODIFISCBOOK_RPTBOX_NEWBOX1 = 30;
  private static int BUK_CODIFISCBOOK_SPAN_T5IMDECOFCFB = 31;
  private static int BUK_CODIFISCBOOK_RPTBOX_NEWBOX2 = 32;
  private static int BUK_CODIFISCBOOK_SPAN_NEWSPAN1 = 33;
  private static int BUK_CODIFISCBOOK_RPTBOX_NEWBOX3 = 34;
  private static int BUK_CODIFISCBOOK_SPAN_NEWSPAN = 35;
  private static int BUK_CODIFISCBOOK_SEC_PAGEFOOTER = 36;
  private static int BUK_CODIFISCBOOK_SEC_REPORTFOOTER = 37;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T60(IMDB);
    Init_PQRY_T59(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T60(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T60, 10);
    IMDB.set_TblCode(IMDBDef9.PQRY_T60, "PQRY_T60");
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T60,IMDBDef9.PQSL_T60_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T60, 0);
  }

  private static void Init_PQRY_T59(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T59, 8);
    IMDB.set_TblCode(IMDBDef9.PQRY_T59, "PQRY_T59");
    IMDB.set_FldCode(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_T59ACCDESCRI, "T59ACCDESCRI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_T59ACCDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T59,IMDBDef9.PQSL_T59_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T59, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CodiciFiscali(MyWebEntryPoint w, IMDBObj imdb)
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
  public CodiciFiscali()
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
    FormIdx = MyGlb.FRM_CODICIFISCAL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BC15E953-B9EA-4C01-8A99-0E8AAEE26CFA";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 632;
    DesignHeight = 390;
    set_Caption(new IDVariant("Codici Fiscali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 632;
    Frames[1].Height = 364;
    Frames[1].Caption = "Codici Fiscali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_CODICIFISCAL = new IDPanel(w, this, 1, "PAN_CODICIFISCAL");
    Frames[1].Content = PAN_CODICIFISCAL;
    PAN_CODICIFISCAL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CODICIFISCAL.VS = MainFrm.VisualStyleList;
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 632-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CODIFISCBOOK != null)
      PAN_CODICIFISCAL.SetBook(BUK_CODIFISCBOOK);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "72A3554F-2B25-4974-BC48-0686B643A23D");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 468, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CODICIFISCAL.InitStatus = 2;
    PAN_CODICIFISCAL_Init();
    PAN_CODICIFISCAL_InitFields();
    PAN_CODICIFISCAL_InitQueries();
    BKW_CODIFISCBOOK = new OBook(this);
    BUK_CODIFISCBOOK = new CIDREObj(BKW_CODIFISCBOOK);
    BKW_CODIFISCBOOK.iGuid = "33BCC74A-7604-4C46-B00A-EEB5B41FCC44";
    BKW_CODIFISCBOOK.Code = "BUK_CODIFISCBOOK";
    BKW_CODIFISCBOOK.BookObj = BUK_CODIFISCBOOK;
    BKW_CODIFISCBOOK.InitDefMasks();
    BUK_CODIFISCBOOK.InitBook(1, 1245185, "Codici Fiscali Book", IMDB, MainFrm.VisualStyleList);
    BUK_CODIFISCBOOK.InitHTML();
    BUK_CODIFISCBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CODIFISCBOOK.Book.SetMainFrm(MainFrm);
    BUK_CODIFISCBOOK.SetRTCGuid(0, "33BCC74A-7604-4C46-B00A-EEB5B41FCC44");
    BUK_CODIFISCBOOK.SetObjCode(0, "CODIFISCBOOK");
    if (PAN_CODICIFISCAL != null)
      PAN_CODICIFISCAL.SetBook(BUK_CODIFISCBOOK);
    BUK_CODIFISCBOOK_MST_CODFISBOOPAG_Init();
    BUK_CODIFISCBOOK_RPT_NEWREPORT_Init();
    BUK_CODIFISCBOOK_InitLinks();
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
      PAN_CODICIFISCAL.UpdatePanel(MainFrm);
      // BUK_CODIFISCBOOK.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_CODICIFISCAL.FrIndex)
    {
      if (IdxFieldActived ==PFL_CODICIFISCAL_APRIACCERTAM) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_CODICIFISCAL.FrIndex)
    {
      if (IdxFieldActived ==PFL_CODICIFISCAL_APRIIMPEGNI) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_CODIFISCBOOK")) return BUK_CODIFISCBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CodiciFiscali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CodiciFiscali.class.getName() : (Glb.ClassWithPackage(CodiciFiscali.class) ? CodiciFiscali.class.getName().substring(CodiciFiscali.class.getPackage().getName().length() + 1) : CodiciFiscali.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "EndModalEvent", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Fiscali NUMERO IMP Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CODICIFISCAL_NUMEROIMP_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codici Fiscali NUMERO IMP Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.ImpPresente(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0), IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "CodiciFiscaliNUMEROIMPValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Fiscali ANNO IMP Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CODICIFISCAL_ANNOIMP_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codici Fiscali ANNO IMP Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.ImpPresente(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0), IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "CodiciFiscaliANNOIMPValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Fiscali NUMERO ACC Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CODICIFISCAL_NUMEROACC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codici Fiscali NUMERO ACC Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.AccPresente(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0), IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "CodiciFiscaliNUMEROACCValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Fiscali ANNO ACC Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CODICIFISCAL_ANNOACC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codici Fiscali ANNO ACC Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.AccPresente(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0), IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "CodiciFiscaliANNOACCValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Scelta Impegno
  // **********************************************************************
  public int ApriSceltaImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "ApriSceltaImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0));
      if (IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Accertamento
  // **********************************************************************
  public int ApriSceltaAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "ApriSceltaAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "InfoAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Codici Fiscali On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CODICIFISCAL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CODICIFISCAL);
      // 
      // Codici Fiscali On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CODICIFISCAL.IsNewRow()))
      {
        PAN_CODICIFISCAL.SetFlags (Glb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CODICIFISCAL.SetFlags (Glb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "CodiciFiscaliOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Fiscali On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CODICIFISCAL_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_CODICIFISCAL, Cancel);
      // 
      // Codici Fiscali On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0))))
      {
      }
      else
      {
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0))))
      {
      }
      else
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "CodiciFiscaliOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Fiscali On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CODICIFISCAL_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codici Fiscali On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T59PD(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
      if (Command.equals((new IDVariant(128)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0))))
        {
          if (MainFrm.AccPresente(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_ACC, 0), IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_ACC, 0)).equals((new IDVariant(-1)), true))
          {
            Cancel.set((new IDVariant(-1)));
          }
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0))))
        {
          if (MainFrm.ImpPresente(IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_ANNO_IMP, 0), IMDB.Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_NUMERO_IMP, 0)).equals((new IDVariant(-1)), true))
          {
            Cancel.set((new IDVariant(-1)));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "CodiciFiscaliOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Fiscali On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_CODICIFISCAL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CODICIFISCAL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Codici Fiscali On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "CodiciFiscaliOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Fiscali On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CODICIFISCAL_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codici Fiscali On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T60, IMDBDef9.PQSL_T60_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciFiscali", "CodiciFiscaliOnUpdatingRowEvent", _e);
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
  private void PAN_CODICIFISCAL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CODICIFISCAL_APRIACCERTAM)
    {
      this.IdxPanelActived = this.PAN_CODICIFISCAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CODICIFISCAL_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_CODICIFISCAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CODICIFISCAL_APRIIMPEGNI)
    {
      this.IdxPanelActived = this.PAN_CODICIFISCAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CODICIFISCAL_INFOIMPEGNI)
    {
      this.IdxPanelActived = this.PAN_CODICIFISCAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CODICIFISCAL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CODICIFISCAL_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CODICIFISCAL_NUMEROACC)
      {
        PFL_CODICIFISCAL_NUMEROACC_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CODICIFISCAL_ANNOACC)
      {
        PFL_CODICIFISCAL_ANNOACC_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CODICIFISCAL_NUMEROIMP)
      {
        PFL_CODICIFISCAL_NUMEROIMP_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CODICIFISCAL_ANNOIMP)
      {
        PFL_CODICIFISCAL_ANNOIMP_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_CODICIFISCAL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CODICIFISCAL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CODIFISCBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CODIFISCBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CODIFISCBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CODIFISCBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CODIFISCBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CODIFISCBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CODIFISCBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CODIFISCBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CODIFISCBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CODIFISCBOOK_MST_CODFISBOOPAG)
    {
      BUK_CODIFISCBOOK.set_SpanValue(BUK_CODIFISCBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CODIFISCBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CODIFISCBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CODIFISCBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CODIFISCBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CODIFISCBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CODIFISCBOOK_OnPreview()
  {
    PreviewBook = BKW_CODIFISCBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CODICIFISCAL_Init()
  {

    PAN_CODICIFISCAL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CODICIFISCAL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CODICIFISCAL.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, "383E8076-B64E-41CB-90B0-12DDD76DE355");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, "Codice");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, "EE17CB27-2C57-4371-8EAC-5A0323A7E593");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, "Tipo");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, "7F2161E2-4691-495A-85CA-2A6DEAAA5ED6");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, "NUMERO ACC");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, "881BFCED-9391-4321-8ED1-5EE2D729264F");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, "ANNO ACC");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, "D04EF0C1-212C-4D1F-9558-2B22D90C3018");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, "Apri Accertamenti");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, "0DC4BD0C-2AB7-4083-8A67-2276F1962287");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, "Info Accertamenti");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, "0AED16A5-D909-47A4-9A85-E32F5336AB11");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, "NUMERO IMP");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, "05DC8EB6-017F-46B6-B093-398C41547899");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, "ANNO IMP");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, "4B5DB35B-BD98-48BB-B9F8-0C5BD659ECCB");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, "Apri Impegni");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, MyGlb.VIS_HYPELINKIMMA);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, "B8CF658A-81C2-42AE-9C08-4FA250631F95");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, "Info Impegni");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, MyGlb.VIS_HYPELINKIMMA);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, "8827119C-D061-4D6A-B8C3-DDF84A79514D");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, "Accertamento");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, "0B2253B4-D83C-40D9-9291-41EB7D3B4A52");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, "Impegno");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, "2C532315-59F8-44EB-AF7C-D72A4B752DA4");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, "0D143B06-E2FD-4F87-A0E9-95179D3B1736");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, "616F4BE2-FF88-444A-93DD-A809698A5FB8");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, "2D145DC0-4A55-4F01-85FA-AA71B964CFFC");
    PAN_CODICIFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CODICIFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, "");
    PAN_CODICIFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICIFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CODICIFISCAL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_CODICE, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_CODICE, PPQRY_T60, "A.CODICE", "CODICE", 1, 4, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, MyGlb.PANEL_LIST, 56, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, MyGlb.PANEL_FORM, 4, 124, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, MyGlb.PANEL_FORM, 88);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_TIPO, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_TIPO, PPQRY_T60, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_TIPO, (new IDVariant("A")), "Addizionale Regionale", "", "", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_TIPO, (new IDVariant("C")), "Addizionale Comunale", "", "", -1);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, MyGlb.PANEL_LIST, 188, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, MyGlb.PANEL_FORM, 88);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROACC, MyGlb.PANEL_FORM, "NUMERO ACC");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_NUMEROACC, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_NUMEROACC, PPQRY_T60, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, MyGlb.PANEL_LIST, 240, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, MyGlb.PANEL_FORM, 4, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, MyGlb.PANEL_FORM, 88);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_ANNOACC, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_ANNOACC, PPQRY_T60, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, MyGlb.PANEL_LIST, 280, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, MyGlb.PANEL_LIST, 96);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, MyGlb.PANEL_LIST, "A. Ac.");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, MyGlb.PANEL_FORM, 4, 412, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, MyGlb.PANEL_FORM, 96);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIACCERTAM, MyGlb.PANEL_FORM, "Apri Accertamenti");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_APRIACCERTAM, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_APRIACCERTAM, PPQRY_APRI, "DECODE(~~CODICE~~, to_number(NULL), NULL, 'A')", "APRIACCERTAM", 5, 99, 0, -13997);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, MyGlb.PANEL_LIST, 304, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, MyGlb.PANEL_LIST, 96);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, MyGlb.PANEL_LIST, "I. Ac.");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, MyGlb.PANEL_FORM, 4, 508, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, MyGlb.PANEL_FORM, 96);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOACCERTAM, MyGlb.PANEL_FORM, "Info Accertamenti");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_INFOACCERTAM, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_INFOACCERTAM, PPQRY_INFO, "DECODE(~~ANNO_ACC~~, to_number(NULL), NULL, DECODE(~~NUMERO_ACC~~, to_number(NULL), NULL, 'I'))", "INFOACCERTAM", 5, 99, 0, -13997);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, MyGlb.PANEL_LIST, 328, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, MyGlb.PANEL_FORM, 4, 100, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, MyGlb.PANEL_FORM, 88);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_NUMEROIMP, MyGlb.PANEL_FORM, "NUMERO IMP");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_NUMEROIMP, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_NUMEROIMP, PPQRY_T60, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, MyGlb.PANEL_LIST, 380, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, MyGlb.PANEL_FORM, 4, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, MyGlb.PANEL_FORM, 88);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ANNOIMP, MyGlb.PANEL_FORM, "ANNO IMP");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_ANNOIMP, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_ANNOIMP, PPQRY_T60, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, MyGlb.PANEL_LIST, 420, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, MyGlb.PANEL_LIST, 68);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, MyGlb.PANEL_LIST, "A. I.");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, MyGlb.PANEL_FORM, 4, 364, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, MyGlb.PANEL_FORM, 68);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, MyGlb.PANEL_FORM, 2);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_APRIIMPEGNI, MyGlb.PANEL_FORM, "Apri Impegni");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_APRIIMPEGNI, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_APRIIMPEGNI, PPQRY_APRI, "DECODE(~~CODICE~~, to_number(NULL), NULL, 'A')", "APRIIMPEGNI", 5, 99, 0, -13997);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_APRIIMPEGNI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, MyGlb.PANEL_LIST, 444, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, MyGlb.PANEL_LIST, 72);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, MyGlb.PANEL_LIST, "I. I.");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, MyGlb.PANEL_FORM, 4, 460, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, MyGlb.PANEL_FORM, 72);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, MyGlb.PANEL_FORM, 2);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_INFOIMPEGNI, MyGlb.PANEL_FORM, "Info Impegni");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_INFOIMPEGNI, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_INFOIMPEGNI, PPQRY_INFO, "DECODE(~~ANNO_IMP~~, to_number(NULL), NULL, DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I'))", "INFOIMPEGNI", 5, 99, 0, -13997);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CODICIFISCAL.SetValueListItem(PFL_CODICIFISCAL_INFOIMPEGNI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, MyGlb.PANEL_LIST, 188, 0, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, MyGlb.PANEL_LIST, 0);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, MyGlb.PANEL_FORM, 188, 0, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, MyGlb.PANEL_FORM, 0);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_ACCERTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_ACCERTAMENTO, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_ACCERTAMENTO, -1, "", "ACCERTAMENTO", 0, 0, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, MyGlb.PANEL_LIST, 328, 0, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, MyGlb.PANEL_FORM, 196, 8, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_IMPEGNO, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, MyGlb.PANEL_LIST, 468, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 364, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_UTENTEINSERI, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_UTENTEINSERI, PPQRY_T60, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, MyGlb.PANEL_LIST, 588, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, MyGlb.PANEL_FORM, 4, 388, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_DATAINSERIME, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_DATAINSERIME, PPQRY_T60, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, MyGlb.PANEL_LIST, 696, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 412, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_UTENTULTIAGG, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_UTENTULTIAGG, PPQRY_T60, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, MyGlb.PANEL_LIST, 808, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CODICIFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 436, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CODICIFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CODICIFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIFISCAL_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CODICIFISCAL.SetFieldPage(PFL_CODICIFISCAL_DATAULTIMAGG, -1, -1);
    PAN_CODICIFISCAL.SetFieldPanel(PFL_CODICIFISCAL_DATAULTIMAGG, PPQRY_T60, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CODICIFISCAL_InitQueries()
  {
    StringBuffer SQL;

    PAN_CODICIFISCAL.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~CODICE~~, to_number(NULL), NULL, 'A') as APRIIMPEGNI, ");
    SQL.append("  DECODE(~~CODICE~~, to_number(NULL), NULL, 'A') as APRIACCERTAM ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CODICIFISCAL.SetQuery(PPQRY_APRI, 0, SQL, -1, "");
    PAN_CODICIFISCAL.SetQueryDB(PPQRY_APRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CODICIFISCAL.SetMasterTable(PPQRY_APRI, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~ANNO_IMP~~, to_number(NULL), NULL, DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I')) as INFOIMPEGNI, ");
    SQL.append("  DECODE(~~ANNO_ACC~~, to_number(NULL), NULL, DECODE(~~NUMERO_ACC~~, to_number(NULL), NULL, 'I')) as INFOACCERTAM ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CODICIFISCAL.SetQuery(PPQRY_INFO, 0, SQL, -1, "");
    PAN_CODICIFISCAL.SetQueryDB(PPQRY_INFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CODICIFISCAL.SetMasterTable(PPQRY_INFO, "DUAL");
    PAN_CODICIFISCAL.SetIMDB(IMDB, "PQRY_T60", true);
    PAN_CODICIFISCAL.set_SetString(MyGlb.MASTER_ROWNAME, "T59");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CODICIFISCAL.SetQuery(PPQRY_T60, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T59 A ");
    PAN_CODICIFISCAL.SetQuery(PPQRY_T60, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICIFISCAL.SetQuery(PPQRY_T60, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICIFISCAL.SetQuery(PPQRY_T60, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICIFISCAL.SetQuery(PPQRY_T60, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CODICIFISCAL.SetQuery(PPQRY_T60, 5, SQL, -1, "");
    PAN_CODICIFISCAL.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CODICIFISCAL.SetMasterTable(0, "T59");
    PAN_CODICIFISCAL.AddToSortList(PFL_CODICIFISCAL_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CODICIFISCAL.Status() == 2)
    {
      int oldListQBE = PAN_CODICIFISCAL.iUseListQBE;
      PAN_CODICIFISCAL.iUseListQBE = 0;
      PAN_CODICIFISCAL.PanelCommand(Glb.PCM_SEARCH);
      PAN_CODICIFISCAL.PanelCommand(Glb.PCM_FIND);
      PAN_CODICIFISCAL.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CODIFISCBOOK_MST_CODFISBOOPAG_Init()
  {
    BUK_CODIFISCBOOK.InitMastro(BUK_CODIFISCBOOK_MST_CODFISBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_MST_CODFISBOOPAG, "921B1FAE-1538-4446-8AA8-2C71B794F29B");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_MST_CODFISBOOPAG, "CODFISBOOPAG");
    BUK_CODIFISCBOOK.InitMastroBox(BUK_CODIFISCBOOK_MST_CODFISBOOPAG, BUK_CODIFISCBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NUMEROPAGINA, "EB05D09D-691E-4C3C-B99E-B6E8D28F8510");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NUMEROPAGINA, BUK_CODIFISCBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_NUMEROPAGINA, "AB9EB01D-A088-4642-8CE8-9B631C8978CA");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CODIFISCBOOK.InitMastroBox(BUK_CODIFISCBOOK_MST_CODFISBOOPAG, BUK_CODIFISCBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_PAGEBODY, "41627DD7-7B11-48DC-B132-5AA9CA5AEB14");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CODIFISCBOOK.InitMastroBox(BUK_CODIFISCBOOK_MST_CODFISBOOPAG, BUK_CODIFISCBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_TITOLO, "EB9764D7-645B-46A8-8DD8-2D19A890D420");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CODIFISCBOOK_RPT_NEWREPORT_InitQuery() { BUK_CODIFISCBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CODIFISCBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
      SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
      SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
      SQL.append("  A.TIPO as TIPO, ");
      SQL.append("  B.DESCRIZIONE as T59ACCDESCRI, ");
      SQL.append("  C.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  T59 A, ");
      SQL.append("  ACC B, ");
      SQL.append("  IMP C ");
      SQL.append("where (A.ANNO_ACC = B.ANNO_ACC(+) AND A.NUMERO_ACC = B.NUMERO_ACC(+)) ");
      SQL.append("and   (A.ANNO_IMP = C.ANNO_IMP(+) AND A.NUMERO_IMP = C.NUMERO_IMP(+)) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CODIFISCBOOK.SetReportQuery(BUK_CODIFISCBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "736156A1-243D-489C-AD30-5C4A63D32549");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CODIFISCBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CODIFISCBOOK.InitReport(BUK_CODIFISCBOOK_RPT_NEWREPORT, 196609);
    BUK_CODIFISCBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPT_NEWREPORT, "41013D2B-3F92-40D0-A44F-D5DBC8FF939D");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CODIFISCBOOK.InitSection(BUK_CODIFISCBOOK_RPT_NEWREPORT, BUK_CODIFISCBOOK_SEC_PAGEHEADER, 900, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIFISCBOOK.SetSectionRendersInto(BUK_CODIFISCBOOK_SEC_PAGEHEADER, BUK_CODIFISCBOOK_RPTBOX_PAGEBODY);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SEC_PAGEHEADER, "E2F4A9F3-215B-421C-8EA0-F2A5CA9E2ABF");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_PAGEHEADER, BUK_CODIFISCBOOK_RPTBOX_CODICEHEADER, 300, 0, 1400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_CODICEHEADER, "C409635C-A50C-47B1-B3C4-5E94BCC4BD97");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_CODICEHEADER, BUK_CODIFISCBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_CODICE, "498A62E2-C738-4CAE-A19E-47FFBB9E3E59");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_CODICE, "CODICE");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_PAGEHEADER, BUK_CODIFISCBOOK_RPTBOX_NUMERACCHEAD, 2500, 0, 6000, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NUMERACCHEAD, "06022509-C2DB-43B2-B6A0-53D9B12B4F1B");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NUMERACCHEAD, "NUMERACCHEAD");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NUMERACCHEAD, BUK_CODIFISCBOOK_SPAN_NUMEROACC, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Accertamento di Entrata", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_NUMEROACC, "C82C2203-971A-47B2-B4B0-D8184F5E15C6");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_NUMEROACC, "NUMEROACC");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_PAGEHEADER, BUK_CODIFISCBOOK_RPTBOX_NUMERIMPHEAD, 11700, 0, 4700, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NUMERIMPHEAD, "1CB3B96C-D9AD-4F94-A5D2-344C0493FACE");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NUMERIMPHEAD, "NUMERIMPHEAD");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NUMERIMPHEAD, BUK_CODIFISCBOOK_SPAN_NUMEROIMP, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Impegno di Spesa", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_NUMEROIMP, "A6CB24CE-602A-455B-A7AF-11DF22C5693A");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_NUMEROIMP, "NUMEROIMP");
    BUK_CODIFISCBOOK.InitSection(BUK_CODIFISCBOOK_RPT_NEWREPORT, BUK_CODIFISCBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIFISCBOOK.SetSectionRendersInto(BUK_CODIFISCBOOK_SEC_TITOLO, BUK_CODIFISCBOOK_RPTBOX_TITOLO);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SEC_TITOLO, "93AE054E-052B-4338-B7B9-2441B36D37EC");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SEC_TITOLO, "TITOLO");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_TITOLO, BUK_CODIFISCBOOK_RPTBOX_NEWBOX4, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NEWBOX4, "078BFC77-1284-4346-99FB-C6F648EF70B9");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NEWBOX4, "NEWBOX4");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NEWBOX4, BUK_CODIFISCBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Codici Fiscali", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_VARIADIBILAN, "034BC59B-3C35-43AD-8418-2A2BEEC1C560");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CODIFISCBOOK.InitSection(BUK_CODIFISCBOOK_RPT_NEWREPORT, BUK_CODIFISCBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIFISCBOOK.SetSectionRendersInto(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_PAGEBODY);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SEC_DETAIL, "304013DA-0DFE-4AF8-BF39-06F588F92403");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SEC_DETAIL, "DETAIL");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_CODICE, "2A5E1953-1F8E-4124-8992-C323E0A50CD3");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_CODICE, BUK_CODIFISCBOOK_SPAN_T5COCOFICOFB, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_T5COCOFICOFB, "AFB8DA0B-FABE-4F09-AF2D-D50179C696A2");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_T5COCOFICOFB, "T5COCOFICOFB");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_NUMEROACC, 1800, 0, 1000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NUMEROACC, "87103829-A9B7-48AC-8A2F-E53405B36B6B");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NUMEROACC, "NUMEROACC");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NUMEROACC, BUK_CODIFISCBOOK_SPAN_T5NUACCOFCFB, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::NUMERO_ACC", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_T5NUACCOFCFB, "DB570070-5A0D-4E70-9651-3D830D239D54");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_T5NUACCOFCFB, "T5NUACCOFCFB");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_ANNOACC, 3300, 0, 750, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_ANNOACC, "9F6DA4A8-F3C4-46D4-A212-DFE86A45262E");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_ANNOACC, "ANNOACC");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_ANNOACC, BUK_CODIFISCBOOK_SPAN_T5ANACCOFCFB, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "Brief description of field content.", "::ANNO_ACC", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_T5ANACCOFCFB, "F85BEEE0-279C-441D-8719-B6E47076BEE9");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_T5ANACCOFCFB, "T5ANACCOFCFB");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_NUMEROIMP, 11000, 0, 1000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NUMEROIMP, "6859A0D3-10C9-495D-9CF7-6ABA9D493C9D");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NUMEROIMP, "NUMEROIMP");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NUMEROIMP, BUK_CODIFISCBOOK_SPAN_T5NUIMCOFCFB, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::NUMERO_IMP", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_T5NUIMCOFCFB, "EC13E93B-A401-4F40-9942-B78F2CADE4CF");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_T5NUIMCOFCFB, "T5NUIMCOFCFB");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_ANNOIMP, 12600, 0, 750, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_ANNOIMP, "B5C1FD03-FA84-42FA-A199-D2A8C8DF947F");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_ANNOIMP, "ANNOIMP");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_ANNOIMP, BUK_CODIFISCBOOK_SPAN_T5ANIMCOFCFB, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "Brief description of field content.", "::ANNO_IMP", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_T5ANIMCOFCFB, "E809D801-6D29-42C1-B3C8-9747AF1831D7");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_T5ANIMCOFCFB, "T5ANIMCOFCFB");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_NEWBOX, 4200, 0, 5800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NEWBOX, "5DA59CA4-FAF2-461D-A587-1227B59D78D9");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NEWBOX, BUK_CODIFISCBOOK_SPAN_T5ACDECOFCFB, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::T59ACCDESCRI", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_T5ACDECOFCFB, "8254D5FF-CC6C-4273-A9D3-AF37F48F436F");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_T5ACDECOFCFB, "T5ACDECOFCFB");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_NEWBOX1, 13500, 0, 4000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NEWBOX1, "A2064485-CF91-47B5-BCBF-D18AEE2570FD");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NEWBOX1, "NEWBOX1");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NEWBOX1, BUK_CODIFISCBOOK_SPAN_T5IMDECOFCFB, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::DESCRIZIONE", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_T5IMDECOFCFB, "46CD6968-646E-4AF0-8686-E70D9CC30FE7");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_T5IMDECOFCFB, "T5IMDECOFCFB");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_NEWBOX2, 3000, 0, 200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NEWBOX2, "53B375D4-31E9-4DD7-954D-5A97B7F979C3");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NEWBOX2, "NEWBOX2");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NEWBOX2, BUK_CODIFISCBOOK_SPAN_NEWSPAN1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "/", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_NEWSPAN1, "DF9DF70D-89C7-402B-9A6C-EB9E02B2174A");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_NEWSPAN1, "NEWSPAN1");
    BUK_CODIFISCBOOK.InitReportBox(BUK_CODIFISCBOOK_SEC_DETAIL, BUK_CODIFISCBOOK_RPTBOX_NEWBOX3, 12200, 0, 200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_RPTBOX_NEWBOX3, "E8A15C00-C110-48D5-8121-9B7528E31AAC");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_RPTBOX_NEWBOX3, "NEWBOX3");
    BUK_CODIFISCBOOK.InitBoxSpan(BUK_CODIFISCBOOK_RPTBOX_NEWBOX3, BUK_CODIFISCBOOK_SPAN_NEWSPAN, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "/", 1);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SPAN_NEWSPAN, "84CAEF54-3678-4C8B-B9A8-F991FE455B93");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SPAN_NEWSPAN, "NEWSPAN");
    BUK_CODIFISCBOOK.InitSection(BUK_CODIFISCBOOK_RPT_NEWREPORT, BUK_CODIFISCBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CODIFISCBOOK.SetSectionRendersInto(BUK_CODIFISCBOOK_SEC_PAGEFOOTER, BUK_CODIFISCBOOK_RPTBOX_PAGEBODY);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SEC_PAGEFOOTER, "E9048397-46CF-4EB6-804D-708D8CDC8E8D");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CODIFISCBOOK.InitSection(BUK_CODIFISCBOOK_RPT_NEWREPORT, BUK_CODIFISCBOOK_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CODIFISCBOOK.SetSectionRendersInto(BUK_CODIFISCBOOK_SEC_REPORTFOOTER, BUK_CODIFISCBOOK_RPTBOX_PAGEBODY);
    BUK_CODIFISCBOOK.SetRTCGuid(BUK_CODIFISCBOOK_SEC_REPORTFOOTER, "59F4EAD4-195F-4937-BD3B-7EF21C801759");
    BUK_CODIFISCBOOK.SetObjCode(BUK_CODIFISCBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CODIFISCBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CODIFISCBOOK_InitLinks()
  {
    BUK_CODIFISCBOOK.SetBoxNextBox(BUK_CODIFISCBOOK_RPTBOX_PAGEBODY, BUK_CODIFISCBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CODICIFISCAL) PAN_CODICIFISCAL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CODICIFISCAL) PAN_CODICIFISCAL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CODICIFISCAL) PAN_CODICIFISCAL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CODICIFISCAL) PAN_CODICIFISCAL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CODICIFISCAL) PAN_CODICIFISCAL_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CODICIFISCAL) PAN_CODICIFISCAL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CODIFISCBOOK) BUK_CODIFISCBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CODIFISCBOOK) BUK_CODIFISCBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CODIFISCBOOK) BUK_CODIFISCBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CODIFISCBOOK) BUK_CODIFISCBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CODIFISCBOOK) BUK_CODIFISCBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CODIFISCBOOK) BUK_CODIFISCBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CODIFISCBOOK) BUK_CODIFISCBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CODIFISCBOOK) BUK_CODIFISCBOOK_OnPreview();
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
