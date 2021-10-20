// **********************************************
// Saldi Tipi Avanzo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SaldiTipiAvanzo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARASALDVINC_TIPOVISUSALD = 0;

  private static int PPQRY_PARAMETRI259 = 0;


  IDPanel PAN_PARASALDVINC;
  private static int PFL_SALDTIPIAVAN_TIPOAVANZO = 0;
  private static int PFL_SALDTIPIAVAN_ESERCIZIO = 1;
  private static int PFL_SALDTIPIAVAN_IMPORTINIZIA = 2;

  private static int PPQRY_SALDTIPIAVA1 = 0;

  private static int PPQRY_TIPIAVANZO = 1;


  IDPanel PAN_SALDTIPIAVAN;
  CIDREObj BUK_LIBSALTIPAVA;
  OBook BKW_LIBSALTIPAVA;
  //
  // Template Pages constants
  private static int BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA = 1;
  private static int BUK_LIBSALTIPAVA_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBSALTIPAVA_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIBSALTIPAVA_RPTBOX_PAGEHEADER = 4;
  private static int BUK_LIBSALTIPAVA_SPAN_TITOLO = 5;
  private static int BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY = 6;

  //
  // Reports constants
  private static int BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP = 7;
  private static int BUK_LIBSALTIPAVA_SEC_REPORTHEADER = 8;
  private static int BUK_LIBSALTIPAVA_SEC_PAGEHEADER = 9;
  private static int BUK_LIBSALTIPAVA_RPTBOX_CODICEHEADER = 10;
  private static int BUK_LIBSALTIPAVA_SPAN_CODICE = 11;
  private static int BUK_LIBSALTIPAVA_RPTBOX_DESCRIHEADER = 12;
  private static int BUK_LIBSALTIPAVA_SPAN_DESCRIZIONE = 13;
  private static int BUK_LIBSALTIPAVA_RPTBOX_ESERCIHEADER = 14;
  private static int BUK_LIBSALTIPAVA_SPAN_SALTIPAVAES1 = 15;
  private static int BUK_LIBSALTIPAVA_RPTBOX_SALINICASHEA = 16;
  private static int BUK_LIBSALTIPAVA_SPAN_C = 17;
  private static int BUK_LIBSALTIPAVA_SEC_DETAIL = 18;
  private static int BUK_LIBSALTIPAVA_RPTBOX_CODICE = 19;
  private static int BUK_LIBSALTIPAVA_SPAN_STSTTASTASTA = 20;
  private static int BUK_LIBSALTIPAVA_RPTBOX_DESCRIZIONE = 21;
  private static int BUK_LIBSALTIPAVA_SPAN_SATADSTASTAB = 22;
  private static int BUK_LIBSALTIPAVA_RPTBOX_ESERCIZIO = 23;
  private static int BUK_LIBSALTIPAVA_SPAN_SALTIPAVAESE = 24;
  private static int BUK_LIBSALTIPAVA_RPTBOX_SALDOINICASS = 25;
  private static int BUK_LIBSALTIPAVA_SPAN_STAIISTASTAB = 26;
  private static int BUK_LIBSALTIPAVA_SEC_PAGEFOOTER = 27;
  private static int BUK_LIBSALTIPAVA_SEC_REPORTFOOTER = 28;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI329(IMDB);
    //
    //
    Init_PQRY_PARAMETRI259(IMDB);
    Init_PQRY_PARAMETRI259_RS(IMDB);
    Init_PQRY_SALDTIPIAVA1(IMDB);
    Init_PQRY_SALDTIPIAVAN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI329(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI329, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI329, "TBL_PARAMETRI329");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI329,IMDBDef4.FLD_PARAMETRI329_PARTIPVISSAL, "PARTIPVISSAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI329,IMDBDef4.FLD_PARAMETRI329_PARTIPVISSAL,5,50,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI329, 0);
  }

  private static void Init_PQRY_PARAMETRI259(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI259, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI259, "PQRY_PARAMETRI259");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI259,IMDBDef12.PQSL_PARAMETRI259_PARTIPVISSAL, "PARTIPVISSAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI259,IMDBDef12.PQSL_PARAMETRI259_PARTIPVISSAL,5,50,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI259, 0);
  }

  private static void Init_PQRY_PARAMETRI259_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI259_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI259_RS, "PQRY_PARAMETRI259_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI259_RS,IMDBDef12.PQSL_PARAMETRI259_PARTIPVISSAL, "PARTIPVISSAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI259_RS,IMDBDef12.PQSL_PARAMETRI259_PARTIPVISSAL,5,50,0);
  }

  private static void Init_PQRY_SALDTIPIAVA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_SALDTIPIAVA1, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_SALDTIPIAVA1, "PQRY_SALDTIPIAVA1");
    IMDB.set_FldCode(IMDBDef12.PQRY_SALDTIPIAVA1,IMDBDef12.PQSL_SALDTIPIAVA1_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_SALDTIPIAVA1,IMDBDef12.PQSL_SALDTIPIAVA1_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_SALDTIPIAVA1,IMDBDef12.PQSL_SALDTIPIAVA1_IMPORTO_INIZIALE, "IMPORTO_INIZIALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_SALDTIPIAVA1,IMDBDef12.PQSL_SALDTIPIAVA1_IMPORTO_INIZIALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_SALDTIPIAVA1,IMDBDef12.PQSL_SALDTIPIAVA1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_SALDTIPIAVA1,IMDBDef12.PQSL_SALDTIPIAVA1_ESERCIZIO,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_SALDTIPIAVA1, 0);
  }

  private static void Init_PQRY_SALDTIPIAVAN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_SALDTIPIAVAN, 4);
    IMDB.set_TblCode(IMDBDef13.PQRY_SALDTIPIAVAN, "PQRY_SALDTIPIAVAN");
    IMDB.set_FldCode(IMDBDef13.PQRY_SALDTIPIAVAN,IMDBDef13.PQSL_SALDTIPIAVAN_SATISATITIAV, "SATISATITIAV");
    IMDB.SetFldParams(IMDBDef13.PQRY_SALDTIPIAVAN,IMDBDef13.PQSL_SALDTIPIAVAN_SATISATITIAV,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_SALDTIPIAVAN,IMDBDef13.PQSL_SALDTIPIAVAN_SALTIPAVADES, "SALTIPAVADES");
    IMDB.SetFldParams(IMDBDef13.PQRY_SALDTIPIAVAN,IMDBDef13.PQSL_SALDTIPIAVAN_SALTIPAVADES,5,100,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_SALDTIPIAVAN,IMDBDef13.PQSL_SALDTIPIAVAN_SALTIPAVAESE, "SALTIPAVAESE");
    IMDB.SetFldParams(IMDBDef13.PQRY_SALDTIPIAVAN,IMDBDef13.PQSL_SALDTIPIAVAN_SALTIPAVAESE,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_SALDTIPIAVAN,IMDBDef13.PQSL_SALDTIPIAVAN_SALTIPAVIMIN, "SALTIPAVIMIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_SALDTIPIAVAN,IMDBDef13.PQSL_SALDTIPIAVAN_SALTIPAVIMIN,3,14,2);
    IMDB.TblAddNew(IMDBDef13.PQRY_SALDTIPIAVAN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SaldiTipiAvanzo(MyWebEntryPoint w, IMDBObj imdb)
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
  public SaldiTipiAvanzo()
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
    FormIdx = MyGlb.FRM_SALDTIPIAVAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7A06D1B5-46F6-40A7-96F6-E3524C2BCCC1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 796;
    DesignHeight = 406;
    set_Caption(new IDVariant("Saldi Tipi Avanzo"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 796;
    Frames[1].Height = 380;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.147368;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 796;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Saldi Vincoli";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARASALDVINC = new IDPanel(w, this, 2, "PAN_PARASALDVINC");
    Frames[2].Content = PAN_PARASALDVINC;
    PAN_PARASALDVINC.ShowRowSelector = false;
    PAN_PARASALDVINC.ShowToolbar = false;
    PAN_PARASALDVINC.ShowStatusbar = false;
    PAN_PARASALDVINC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARASALDVINC.VS = MainFrm.VisualStyleList;
    PAN_PARASALDVINC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARASALDVINC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A949E165-C3FC-4F67-BFF3-479296600BF5");
    PAN_PARASALDVINC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 16, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARASALDVINC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARASALDVINC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARASALDVINC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARASALDVINC.InitStatus = 1;
    PAN_PARASALDVINC_Init();
    PAN_PARASALDVINC_InitFields();
    PAN_PARASALDVINC_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 796;
    Frames[3].Height = 324;
    Frames[3].Caption = "Saldi Tipi Avanzo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 324;
    PAN_SALDTIPIAVAN = new IDPanel(w, this, 3, "PAN_SALDTIPIAVAN");
    Frames[3].Content = PAN_SALDTIPIAVAN;
    PAN_SALDTIPIAVAN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SALDTIPIAVAN.VS = MainFrm.VisualStyleList;
    PAN_SALDTIPIAVAN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 324-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBSALTIPAVA != null)
      PAN_SALDTIPIAVAN.SetBook(BUK_LIBSALTIPAVA);
    PAN_SALDTIPIAVAN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F8CEFBBB-BED0-4E96-B6A0-A8D2ED2DEF4F");
    PAN_SALDTIPIAVAN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 744, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SALDTIPIAVAN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SALDTIPIAVAN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SALDTIPIAVAN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SALDTIPIAVAN.InitStatus = 2;
    PAN_SALDTIPIAVAN_Init();
    PAN_SALDTIPIAVAN_InitFields();
    PAN_SALDTIPIAVAN_InitQueries();
    BKW_LIBSALTIPAVA = new OBook(this);
    BUK_LIBSALTIPAVA = new CIDREObj(BKW_LIBSALTIPAVA);
    BKW_LIBSALTIPAVA.iGuid = "CE4FCC08-1C5B-4D14-8E93-8C8A8B9007C8";
    BKW_LIBSALTIPAVA.Code = "BUK_LIBSALTIPAVA";
    BKW_LIBSALTIPAVA.BookObj = BUK_LIBSALTIPAVA;
    BKW_LIBSALTIPAVA.InitDefMasks();
    BUK_LIBSALTIPAVA.InitBook(1, 3342593, "Libro Saldi Tipi Avanzo", IMDB, MainFrm.VisualStyleList);
    BUK_LIBSALTIPAVA.InitHTML();
    BUK_LIBSALTIPAVA.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBSALTIPAVA.Book.SetMainFrm(MainFrm);
    BUK_LIBSALTIPAVA.SetRTCGuid(0, "CE4FCC08-1C5B-4D14-8E93-8C8A8B9007C8");
    BUK_LIBSALTIPAVA.SetObjCode(0, "LIBSALTIPAVA");
    if (PAN_SALDTIPIAVAN != null)
      PAN_SALDTIPIAVAN.SetBook(BUK_LIBSALTIPAVA);
    BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA_Init();
    BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP_Init();
    BUK_LIBSALTIPAVA_InitLinks();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI329, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SALDTIPIAVAN_PARAMETRI259();
      }
      PAN_PARASALDVINC.UpdatePanel(MainFrm);
      PAN_SALDTIPIAVAN.UpdatePanel(MainFrm);
      // BUK_LIBSALTIPAVA.UpdateBook();
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
    if (Code.equals("BUK_LIBSALTIPAVA")) return BUK_LIBSALTIPAVA;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SaldiTipiAvanzo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SaldiTipiAvanzo.class.getName() : (Glb.ClassWithPackage(SaldiTipiAvanzo.class) ? SaldiTipiAvanzo.class.getName().substring(SaldiTipiAvanzo.class.getPackage().getName().length() + 1) : SaldiTipiAvanzo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Saldi Tipi Avanzo On Database Error Event
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
  private void PAN_SALDTIPIAVAN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_SALDTIPIAVAN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Saldi Tipi Avanzo On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiTipiAvanzo", "SaldiTipiAvanzoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Saldi Tipi Avanzo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SALDTIPIAVAN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SALDTIPIAVAN);
      // 
      // Saldi Tipi Avanzo On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SALDTIPIAVAN.set_ToolTip(Glb.OBJ_FIELD,PFL_SALDTIPIAVAN_TIPOAVANZO,(new IDVariant(PAN_SALDTIPIAVAN.FieldText(PFL_SALDTIPIAVAN_TIPOAVANZO))).stringValue()); 
      if (PAN_SALDTIPIAVAN.IsNewRow())
      {
        PAN_SALDTIPIAVAN.SetFlags (Glb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SALDTIPIAVAN.SetFlags (Glb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SALDTIPIAVAN.SetFlags (Glb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SALDTIPIAVAN.SetFlags (Glb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiTipiAvanzo", "SaldiTipiAvanzoOnDynamicPropertiesEvent", _e);
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
      PAN_PARASALDVINC.ClearValueList(PFL_PARASALDVINC_TIPOVISUSALD);
      PAN_PARASALDVINC.SetValueListItem(PFL_PARASALDVINC_TIPOVISUSALD, (new IDVariant("E")), IDL.Add((new IDVariant("Esercizio ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_PARASALDVINC.SetValueListItem(PFL_PARASALDVINC_TIPOVISUSALD, (new IDVariant("T")), ((new IDVariant("T")).equals((new IDVariant("E")))? new IDVariant("Esercizio più recente") : (new IDVariant("T")).equals((new IDVariant("T")))? new IDVariant("Tutti gli Esercizi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI329, IMDBDef4.FLD_PARAMETRI329_PARTIPVISSAL, 0, (new IDVariant("E")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SaldiTipiAvanzo", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("SaldiTipiAvanzo", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI329, IMDBDef4.FLD_PARAMETRI329_PARTIPVISSAL, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SALDTIPIAVAN_PARAMETRI259() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI259_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI329, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI329, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI259_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI259_RS, 0, IMDBDef4.TBL_PARAMETRI329, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI259_RS, 0, 0, IMDBDef4.TBL_PARAMETRI329, IMDBDef4.FLD_PARAMETRI329_PARTIPVISSAL, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI329, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI329, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI329, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI259_RS, 0);
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
  private void PAN_PARASALDVINC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARASALDVINC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARASALDVINC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARASALDVINC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARASALDVINC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARASALDVINC);
    // Stub
  }

  private void PAN_PARASALDVINC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARASALDVINC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARASALDVINC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARASALDVINC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SALDTIPIAVAN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SALDTIPIAVAN, Cancel);
    // Stub
  }

  private void PAN_SALDTIPIAVAN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SALDTIPIAVAN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SALDTIPIAVAN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_SALDTIPIAVA1, IMDBDef12.PQSL_SALDTIPIAVA1_IMPORTO_INIZIALE, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_SALDTIPIAVA1, IMDBDef12.PQSL_SALDTIPIAVA1_IMPORTO_INIZIALE, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_SALDTIPIAVAN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBSALTIPAVA_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBSALTIPAVA_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBSALTIPAVA_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_LIBSALTIPAVA_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_LIBSALTIPAVA_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_LIBSALTIPAVA_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_LIBSALTIPAVA_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_LIBSALTIPAVA_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBSALTIPAVA_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA)
    {
      BUK_LIBSALTIPAVA.set_SpanValue(BUK_LIBSALTIPAVA_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBSALTIPAVA.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBSALTIPAVA.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBSALTIPAVA_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBSALTIPAVA_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBSALTIPAVA_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBSALTIPAVA_OnPreview()
  {
    PreviewBook = BKW_LIBSALTIPAVA;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARASALDVINC_Init()
  {

    PAN_PARASALDVINC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARASALDVINC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARASALDVINC.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARASALDVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, "EC53D7D8-C7E8-4F15-90BF-58D7990C14FC");
    PAN_PARASALDVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, "Visualizza Saldi");
    PAN_PARASALDVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, "");
    PAN_PARASALDVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARASALDVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARASALDVINC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARASALDVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARASALDVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_LIST, 152);
    PAN_PARASALDVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_LIST, 1);
    PAN_PARASALDVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_LIST, "Visualizza Saldi");
    PAN_PARASALDVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_FORM, 12, 16, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARASALDVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_FORM, 104);
    PAN_PARASALDVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_FORM, 1);
    PAN_PARASALDVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARASALDVINC_TIPOVISUSALD, MyGlb.PANEL_FORM, "Visualizza Saldi");
    PAN_PARASALDVINC.SetFieldPage(PFL_PARASALDVINC_TIPOVISUSALD, -1, -1);
    PAN_PARASALDVINC.SetFieldPanel(PFL_PARASALDVINC_TIPOVISUSALD, PPQRY_PARAMETRI259, "A.PARTIPVISSAL", "PARTIPVISSAL", 5, 50, 0, -13997);
    PAN_PARASALDVINC.SetValueListItem(PFL_PARASALDVINC_TIPOVISUSALD, (new IDVariant("E")), "Esercizio più recente", "", "", -1);
    PAN_PARASALDVINC.SetValueListItem(PFL_PARASALDVINC_TIPOVISUSALD, (new IDVariant("T")), "Tutti gli Esercizi", "", "", -1);
  }

  private void PAN_PARASALDVINC_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARASALDVINC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARASALDVINC.SetIMDB(IMDB, "PQRY_PARAMETRI259", true);
    PAN_PARASALDVINC.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARASALDVINC.SetQueryIMDB(PPQRY_PARAMETRI259, IMDBDef12.PQRY_PARAMETRI259_RS, IMDBDef4.TBL_PARAMETRI329);
    JustLoaded = true;
    PAN_PARASALDVINC.SetFieldPrimaryIndex(PFL_PARASALDVINC_TIPOVISUSALD, IMDBDef4.FLD_PARAMETRI329_PARTIPVISSAL);
    PAN_PARASALDVINC.SetMasterTable(0, "PARAMETRI329");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARASALDVINC.Status() == 2)
    {
      int oldListQBE = PAN_PARASALDVINC.iUseListQBE;
      PAN_PARASALDVINC.iUseListQBE = 0;
      PAN_PARASALDVINC.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARASALDVINC.PanelCommand(Glb.PCM_FIND);
      PAN_PARASALDVINC.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SALDTIPIAVAN_Init()
  {

    PAN_SALDTIPIAVAN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SALDTIPIAVAN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SALDTIPIAVAN.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_SALDTIPIAVAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, "8DD63833-E189-481E-A7E2-041D6B5B8349");
    PAN_SALDTIPIAVAN.set_Header(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, "Tipo Avanzo");
    PAN_SALDTIPIAVAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, "");
    PAN_SALDTIPIAVAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_SALDTIPIAVAN.SetFlags(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_SALDTIPIAVAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, "DEB6181A-FA12-4E5A-8EFA-C4ABED681F59");
    PAN_SALDTIPIAVAN.set_Header(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, "Esercizio");
    PAN_SALDTIPIAVAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, "");
    PAN_SALDTIPIAVAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SALDTIPIAVAN.SetFlags(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_SALDTIPIAVAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, "CC6F9146-44FD-4731-865B-9EA325121C77");
    PAN_SALDTIPIAVAN.set_Header(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, "Importo Iniziale");
    PAN_SALDTIPIAVAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, "");
    PAN_SALDTIPIAVAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SALDTIPIAVAN.SetFlags(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SALDTIPIAVAN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SALDTIPIAVAN.SetRect(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, MyGlb.PANEL_LIST, 0, 36, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDTIPIAVAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, MyGlb.PANEL_LIST, 88);
    PAN_SALDTIPIAVAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_SALDTIPIAVAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_SALDTIPIAVAN.SetRect(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, MyGlb.PANEL_FORM, 124, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDTIPIAVAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, MyGlb.PANEL_FORM, 48);
    PAN_SALDTIPIAVAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_SALDTIPIAVAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_TIPOAVANZO, MyGlb.PANEL_FORM, "T. Avn.");
    PAN_SALDTIPIAVAN.SetFieldPage(PFL_SALDTIPIAVAN_TIPOAVANZO, -1, -1);
    PAN_SALDTIPIAVAN.SetFieldPanel(PFL_SALDTIPIAVAN_TIPOAVANZO, PPQRY_SALDTIPIAVA1, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_SALDTIPIAVAN.set_Alignment(PFL_SALDTIPIAVAN_TIPOAVANZO, 2);
    PAN_SALDTIPIAVAN.SetRect(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, MyGlb.PANEL_LIST, 540, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDTIPIAVAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_SALDTIPIAVAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SALDTIPIAVAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_SALDTIPIAVAN.SetRect(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, MyGlb.PANEL_FORM, 112, 60, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDTIPIAVAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_SALDTIPIAVAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SALDTIPIAVAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_SALDTIPIAVAN.SetFieldPage(PFL_SALDTIPIAVAN_ESERCIZIO, -1, -1);
    PAN_SALDTIPIAVAN.SetFieldPanel(PFL_SALDTIPIAVAN_ESERCIZIO, PPQRY_SALDTIPIAVA1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_SALDTIPIAVAN.SetRect(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, MyGlb.PANEL_LIST, 608, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDTIPIAVAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, MyGlb.PANEL_LIST, 96);
    PAN_SALDTIPIAVAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_SALDTIPIAVAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, MyGlb.PANEL_LIST, "Importo Iniziale");
    PAN_SALDTIPIAVAN.SetRect(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, MyGlb.PANEL_FORM, 48, 84, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SALDTIPIAVAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, MyGlb.PANEL_FORM, 124);
    PAN_SALDTIPIAVAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_SALDTIPIAVAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SALDTIPIAVAN_IMPORTINIZIA, MyGlb.PANEL_FORM, "Importo Iniziale");
    PAN_SALDTIPIAVAN.SetFieldPage(PFL_SALDTIPIAVAN_IMPORTINIZIA, -1, -1);
    PAN_SALDTIPIAVAN.SetFieldPanel(PFL_SALDTIPIAVAN_IMPORTINIZIA, PPQRY_SALDTIPIAVA1, "A.IMPORTO_INIZIALE", "IMPORTO_INIZIALE", 3, 14, 2, -13997);
  }

  private void PAN_SALDTIPIAVAN_InitQueries()
  {
    StringBuffer SQL;

    PAN_SALDTIPIAVAN.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPOAVANZO ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~TIPO_AVANZO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_SALDTIPIAVAN.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_SALDTIPIAVAN_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPOAVANZO ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_SALDTIPIAVAN.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_SALDTIPIAVAN_TIPOAVANZO, "");
    PAN_SALDTIPIAVAN.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SALDTIPIAVAN.SetIMDB(IMDB, "PQRY_SALDTIPIAVA1", true);
    PAN_SALDTIPIAVAN.set_SetString(MyGlb.MASTER_ROWNAME, "SALDI TIPI AVANZO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.IMPORTO_INIZIALE as IMPORTO_INIZIALE, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO ");
    PAN_SALDTIPIAVAN.SetQuery(PPQRY_SALDTIPIAVA1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  SALDI_TIPI_AVANZO A ");
    PAN_SALDTIPIAVAN.SetQuery(PPQRY_SALDTIPIAVA1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (~~PQRY_PARAMETRI259.PARTIPVISSAL~~ = 'T' OR (~~PQRY_PARAMETRI259.PARTIPVISSAL~~ = 'E' AND A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    PAN_SALDTIPIAVAN.SetQuery(PPQRY_SALDTIPIAVA1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SALDTIPIAVAN.SetQuery(PPQRY_SALDTIPIAVA1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SALDTIPIAVAN.SetQuery(PPQRY_SALDTIPIAVA1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPO_AVANZO, ");
    SQL.append("  A.ESERCIZIO desc ");
    PAN_SALDTIPIAVAN.SetQuery(PPQRY_SALDTIPIAVA1, 5, SQL, -1, "");
    PAN_SALDTIPIAVAN.SetQueryDB(PPQRY_SALDTIPIAVA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SALDTIPIAVAN.SetMasterTable(0, "SALDI_TIPI_AVANZO");
    PAN_SALDTIPIAVAN.AddToSortList(PFL_SALDTIPIAVAN_TIPOAVANZO, true);
    PAN_SALDTIPIAVAN.AddToSortList(PFL_SALDTIPIAVAN_ESERCIZIO, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SALDTIPIAVAN.Status() == 2)
    {
      int oldListQBE = PAN_SALDTIPIAVAN.iUseListQBE;
      PAN_SALDTIPIAVAN.iUseListQBE = 0;
      PAN_SALDTIPIAVAN.PanelCommand(Glb.PCM_SEARCH);
      PAN_SALDTIPIAVAN.PanelCommand(Glb.PCM_FIND);
      PAN_SALDTIPIAVAN.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA_Init()
  {
    BUK_LIBSALTIPAVA.InitMastro(BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA, "7429863F-51F4-46C6-8D57-BA2DBBECCF51");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA, "SALTIPAVBOPA");
    BUK_LIBSALTIPAVA.InitMastroBox(BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA, BUK_LIBSALTIPAVA_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_NUMEROPAGINA, "1DC1415F-729A-4279-A86D-5E9E96FA70A2");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_NUMEROPAGINA, BUK_LIBSALTIPAVA_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_NUMEROPAGINA, "0ACCCE98-7978-4B2A-A020-6F9BC928498B");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBSALTIPAVA.InitMastroBox(BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA, BUK_LIBSALTIPAVA_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_PAGEHEADER, "6B4CD9B8-508D-47F1-B585-756F4C2590A9");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_PAGEHEADER, BUK_LIBSALTIPAVA_SPAN_TITOLO, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Saldi Tipi Avanzo", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_TITOLO, "5837DFEB-4418-4E7B-B5F0-AFD6337A6096");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_TITOLO, "TITOLO");
    BUK_LIBSALTIPAVA.InitMastroBox(BUK_LIBSALTIPAVA_MST_SALTIPAVBOPA, BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY, 1000, 2400, 19000, 26000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY, "590132C7-2C4A-4F5E-85AE-80483A2A2FEE");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP_InitQuery() { BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP_InitQuery(true, true); }
  private void BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_AVANZO as SATISATITIAV, ");
      SQL.append("  B.DESCRIZIONE as SALTIPAVADES, ");
      SQL.append("  A.ESERCIZIO as SALTIPAVAESE, ");
      SQL.append("  A.IMPORTO_INIZIALE as SALTIPAVIMIN ");
      SQL.append("from ");
      SQL.append("  SALDI_TIPI_AVANZO A, ");
      SQL.append("  TIPI_AVANZO B ");
      SQL.append("where (B.CODICE = A.TIPO_AVANZO) ");
      SQL.append("and   (~~PQRY_PARAMETRI259.PARTIPVISSAL~~ = 'T' OR (~~PQRY_PARAMETRI259.PARTIPVISSAL~~ = 'E' AND A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
      SQL.append("order by ");
      SQL.append("  A.TIPO_AVANZO ");
      BUK_LIBSALTIPAVA.SetReportQuery(BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "84F12D61-2F2B-4903-8E5D-81B76818A90E");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP_Init()
  {
    BUK_LIBSALTIPAVA.InitReport(BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP, 196865);
    BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP_InitQuery(true, false);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP, "9969344D-3C31-4EDF-BD39-3A94C36EFAFE");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP, "SALTIPAVAREP");
    BUK_LIBSALTIPAVA.InitSection(BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP, BUK_LIBSALTIPAVA_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBSALTIPAVA.SetSectionRendersInto(BUK_LIBSALTIPAVA_SEC_REPORTHEADER, BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SEC_REPORTHEADER, "24341A1C-F9E4-4DD1-9790-0CC8BBE72882");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_LIBSALTIPAVA.InitSection(BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP, BUK_LIBSALTIPAVA_SEC_PAGEHEADER, 600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBSALTIPAVA.SetSectionRendersInto(BUK_LIBSALTIPAVA_SEC_PAGEHEADER, BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SEC_PAGEHEADER, "BDC0F2C8-6EB1-42B6-90E8-C38C5CB8195D");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_LIBSALTIPAVA.InitReportBox(BUK_LIBSALTIPAVA_SEC_PAGEHEADER, BUK_LIBSALTIPAVA_RPTBOX_CODICEHEADER, 100, 0, 2100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_CODICEHEADER, "DF948DBD-AED8-4C88-AC5C-A6F877F15717");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_CODICEHEADER, BUK_LIBSALTIPAVA_SPAN_CODICE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_CODICE, "4435FAE2-F746-4B24-BF97-47C1DF528789");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_CODICE, "CODICE");
    BUK_LIBSALTIPAVA.InitReportBox(BUK_LIBSALTIPAVA_SEC_PAGEHEADER, BUK_LIBSALTIPAVA_RPTBOX_DESCRIHEADER, 2300, 0, 11000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_DESCRIHEADER, "895C21B5-0FA8-43C7-B069-FBEDD6F735C0");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_DESCRIHEADER, BUK_LIBSALTIPAVA_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_DESCRIZIONE, "8E12783A-0A5D-4B91-AE6C-1747AEACEA88");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBSALTIPAVA.InitReportBox(BUK_LIBSALTIPAVA_SEC_PAGEHEADER, BUK_LIBSALTIPAVA_RPTBOX_ESERCIHEADER, 13400, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_ESERCIHEADER, "93C30409-FC9B-49B8-9CEA-033B622BA9B8");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_ESERCIHEADER, "ESERCIHEADER");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_ESERCIHEADER, BUK_LIBSALTIPAVA_SPAN_SALTIPAVAES1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Esercizio", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_SALTIPAVAES1, "425E1D9C-61D3-42D7-829F-0B7D60DFDE98");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_SALTIPAVAES1, "SALTIPAVAES1");
    BUK_LIBSALTIPAVA.InitReportBox(BUK_LIBSALTIPAVA_SEC_PAGEHEADER, BUK_LIBSALTIPAVA_RPTBOX_SALINICASHEA, 15100, 0, 3788, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_SALINICASHEA, "B9CCE41B-75AE-47CE-81FC-EADB197B6512");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_SALINICASHEA, "SALINICASHEA");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_SALINICASHEA, BUK_LIBSALTIPAVA_SPAN_C, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo Iniziale", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_C, "CB0638D9-1BF3-44F0-8A18-3CE8CD645976");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_C, "C");
    BUK_LIBSALTIPAVA.InitSection(BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP, BUK_LIBSALTIPAVA_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBSALTIPAVA.SetSectionRendersInto(BUK_LIBSALTIPAVA_SEC_DETAIL, BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SEC_DETAIL, "703FA2C7-23F3-40F4-872F-FA679B469AEA");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SEC_DETAIL, "DETAIL");
    BUK_LIBSALTIPAVA.InitReportBox(BUK_LIBSALTIPAVA_SEC_DETAIL, BUK_LIBSALTIPAVA_RPTBOX_CODICE, 100, 0, 2100, 500, 0, 1, 1, MyGlb.VIS_A8LEFT, 983041, 322, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_CODICE, "6B3AF735-3D80-49D0-9D21-D9D905B5270B");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_CODICE, "CODICE");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_CODICE, BUK_LIBSALTIPAVA_SPAN_STSTTASTASTA, MyGlb.VIS_A8LEFT, 3, 10, 6, 271384961, "", "::SATISATITIAV", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_STSTTASTASTA, "283FA084-97AA-4384-99A2-C303C1196EA3");
    BUK_LIBSALTIPAVA.set_SpanMask(BUK_LIBSALTIPAVA_SPAN_STSTTASTASTA, "###########");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_STSTTASTASTA, "STSTTASTASTA");
    BUK_LIBSALTIPAVA.InitReportBox(BUK_LIBSALTIPAVA_SEC_DETAIL, BUK_LIBSALTIPAVA_RPTBOX_DESCRIZIONE, 2300, 0, 11000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_DESCRIZIONE, "BA7CDD21-63E2-49EA-B8FD-455A73C79795");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_DESCRIZIONE, BUK_LIBSALTIPAVA_SPAN_SATADSTASTAB, MyGlb.VIS_DEFAREPOSTYL, 5, 100, 0, 271384961, "", "::SALTIPAVADES", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_SATADSTASTAB, "6019C3AB-D084-4FE4-9B62-718E095D8170");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_SATADSTASTAB, "SATADSTASTAB");
    BUK_LIBSALTIPAVA.InitReportBox(BUK_LIBSALTIPAVA_SEC_DETAIL, BUK_LIBSALTIPAVA_RPTBOX_ESERCIZIO, 13400, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_A8LEFT, 983041, 322, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_ESERCIZIO, "1DBC6FF5-7A39-4CCD-B4DA-99089D0E5A02");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_ESERCIZIO, "ESERCIZIO");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_ESERCIZIO, BUK_LIBSALTIPAVA_SPAN_SALTIPAVAESE, MyGlb.VIS_A8LEFT, 1, 4, 0, 271384961, "", "::SALTIPAVAESE", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_SALTIPAVAESE, "766CDAFD-AA81-4CA9-8919-64D4B3890624");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_SALTIPAVAESE, "SALTIPAVAESE");
    BUK_LIBSALTIPAVA.InitReportBox(BUK_LIBSALTIPAVA_SEC_DETAIL, BUK_LIBSALTIPAVA_RPTBOX_SALDOINICASS, 15100, 0, 3700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_RPTBOX_SALDOINICASS, "CD099222-CB71-43FB-BBAD-79B388DC0813");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_RPTBOX_SALDOINICASS, "SALDOINICASS");
    BUK_LIBSALTIPAVA.InitBoxSpan(BUK_LIBSALTIPAVA_RPTBOX_SALDOINICASS, BUK_LIBSALTIPAVA_SPAN_STAIISTASTAB, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::SALTIPAVIMIN", 1);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SPAN_STAIISTASTAB, "7C714B0C-DFE2-4BAA-B5FF-DDF43437938F");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SPAN_STAIISTASTAB, "STAIISTASTAB");
    BUK_LIBSALTIPAVA.InitSection(BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP, BUK_LIBSALTIPAVA_SEC_PAGEFOOTER, 100, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBSALTIPAVA.SetSectionRendersInto(BUK_LIBSALTIPAVA_SEC_PAGEFOOTER, BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SEC_PAGEFOOTER, "171B5AFD-721E-48D4-9330-71AA09BDB3A8");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_LIBSALTIPAVA.InitSection(BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP, BUK_LIBSALTIPAVA_SEC_REPORTFOOTER, 100, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBSALTIPAVA.SetSectionRendersInto(BUK_LIBSALTIPAVA_SEC_REPORTFOOTER, BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY);
    BUK_LIBSALTIPAVA.SetRTCGuid(BUK_LIBSALTIPAVA_SEC_REPORTFOOTER, "F6C5D332-B54C-40E0-80A0-4FC997A22995");
    BUK_LIBSALTIPAVA.SetObjCode(BUK_LIBSALTIPAVA_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_LIBSALTIPAVA_RPT_SALTIPAVAREP_InitQuery(false, true);
  }

  private void BUK_LIBSALTIPAVA_InitLinks()
  {
    BUK_LIBSALTIPAVA.SetBoxNextBox(BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY, BUK_LIBSALTIPAVA_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SALDTIPIAVAN) PAN_SALDTIPIAVAN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_ValidateRow(Cancel);
    if (SrcObj == PAN_SALDTIPIAVAN) PAN_SALDTIPIAVAN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_DynamicProperties();
    if (SrcObj == PAN_SALDTIPIAVAN) PAN_SALDTIPIAVAN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SALDTIPIAVAN) PAN_SALDTIPIAVAN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARASALDVINC) PAN_PARASALDVINC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SALDTIPIAVAN) PAN_SALDTIPIAVAN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBSALTIPAVA) BUK_LIBSALTIPAVA_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBSALTIPAVA) BUK_LIBSALTIPAVA_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBSALTIPAVA) BUK_LIBSALTIPAVA_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBSALTIPAVA) BUK_LIBSALTIPAVA_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBSALTIPAVA) BUK_LIBSALTIPAVA_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBSALTIPAVA) BUK_LIBSALTIPAVA_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBSALTIPAVA) BUK_LIBSALTIPAVA_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBSALTIPAVA) BUK_LIBSALTIPAVA_OnPreview();
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
