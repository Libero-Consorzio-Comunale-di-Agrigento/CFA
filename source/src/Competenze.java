// **********************************************
// Competenze
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Competenze extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_OGGETTI_OGGETTO1 = 0;
  private static int PFL_OGGETTI_INTESTCOMPET = 1;
  private static int PFL_OGGETTI_DESCRIZIONE = 2;
  private static int PFL_OGGETTI_UTENTERUOLO = 3;

  private static int PPQRY_OGGETTCOMPET = 0;


  IDPanel PAN_OGGETTI;
  private static int PFL_COMPETENZE_OGGETTO2 = 0;
  private static int PFL_COMPETENZE_UTENTE = 1;
  private static int PFL_COMPETENZE_COMPETENZA = 2;
  private static int PFL_COMPETENZE_COMPETENZAUO = 3;
  private static int PFL_COMPETENZE_VALOREOGGETT = 4;
  private static int PFL_COMPETENZE_NOMINAORDINA = 5;

  private static int PPQRY_COMPETENZCF5 = 0;

  private static int PPQRY_VISTAUOCOMPE = 1;
  private static int PPQRY_VALOOGGECOMP = 2;

  private static int PPQRY_DIRITTACCES1 = 3;


  IDPanel PAN_COMPETENZE;
  CIDREObj BUK_COMPETENBOOK;
  OBook BKW_COMPETENBOOK;
  //
  // Template Pages constants
  private static int BUK_COMPETENBOOK_MST_COMPBOOKPAGE = 1;
  private static int BUK_COMPETENBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_COMPETENBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_COMPETENBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_COMPETENBOOK_SPAN_TITOLO = 5;
  private static int BUK_COMPETENBOOK_RPTBOX_PAGEBODY = 6;

  //
  // Reports constants
  private static int BUK_COMPETENBOOK_RPT_NEWREPORT = 7;
  private static int BUK_COMPETENBOOK_SEC_REPORTHEADER = 8;
  private static int BUK_COMPETENBOOK_SEC_PAGEHEADER = 9;
  private static int BUK_COMPETENBOOK_RPTBOX_UTENTEHEADER = 10;
  private static int BUK_COMPETENBOOK_SPAN_UTENTE = 11;
  private static int BUK_COMPETENBOOK_RPTBOX_COMPETHEADER = 12;
  private static int BUK_COMPETENBOOK_SPAN_COMPETENZA = 13;
  private static int BUK_COMPETENBOOK_SEC_DETAIL = 14;
  private static int BUK_COMPETENBOOK_RPTBOX_COMPETENZA = 15;
  private static int BUK_COMPETENBOOK_SPAN_COCFCOCOCOBO = 16;
  private static int BUK_COMPETENBOOK_RPTBOX_UTENTE = 17;
  private static int BUK_COMPETENBOOK_SPAN_COCFUTCOCOBO = 18;
  private static int BUK_COMPETENBOOK_SEC_PAGEFOOTER = 19;
  private static int BUK_COMPETENBOOK_SEC_REPORTFOOTER = 20;


  // Definition of Global Variables
  private IDVariant ORDINUTENASC = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_OGGETTCOMPET(IMDB);
    Init_PQRY_COMPETENZCF5(IMDB);
    Init_PQRY_COMPETENZCF6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_OGGETTCOMPET(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_OGGETTCOMPET, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_OGGETTCOMPET, "PQRY_OGGETTCOMPET");
    IMDB.set_FldCode(IMDBDef9.PQRY_OGGETTCOMPET,IMDBDef9.PQSL_OGGETTCOMPET_OGGETTO, "OGGETTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_OGGETTCOMPET,IMDBDef9.PQSL_OGGETTCOMPET_OGGETTO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_OGGETTCOMPET,IMDBDef9.PQSL_OGGETTCOMPET_INTESTA_COMPETENZA, "INTESTA_COMPETENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_OGGETTCOMPET,IMDBDef9.PQSL_OGGETTCOMPET_INTESTA_COMPETENZA,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_OGGETTCOMPET,IMDBDef9.PQSL_OGGETTCOMPET_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_OGGETTCOMPET,IMDBDef9.PQSL_OGGETTCOMPET_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_OGGETTCOMPET,IMDBDef9.PQSL_OGGETTCOMPET_OGGCOMUTERUO, "OGGCOMUTERUO");
    IMDB.SetFldParams(IMDBDef9.PQRY_OGGETTCOMPET,IMDBDef9.PQSL_OGGETTCOMPET_OGGCOMUTERUO,5,10,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_OGGETTCOMPET, 0);
  }

  private static void Init_PQRY_COMPETENZCF5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_COMPETENZCF5, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_COMPETENZCF5, "PQRY_COMPETENZCF5");
    IMDB.set_FldCode(IMDBDef9.PQRY_COMPETENZCF5,IMDBDef9.PQSL_COMPETENZCF5_OGGETTO, "OGGETTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_COMPETENZCF5,IMDBDef9.PQSL_COMPETENZCF5_OGGETTO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_COMPETENZCF5,IMDBDef9.PQSL_COMPETENZCF5_COMPETENZA, "COMPETENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_COMPETENZCF5,IMDBDef9.PQSL_COMPETENZCF5_COMPETENZA,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_COMPETENZCF5,IMDBDef9.PQSL_COMPETENZCF5_UTENTE, "UTENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_COMPETENZCF5,IMDBDef9.PQSL_COMPETENZCF5_UTENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_COMPETENZCF5,IMDBDef9.PQSL_COMPETENZCF5_NOMINAORDINA, "NOMINAORDINA");
    IMDB.SetFldParams(IMDBDef9.PQRY_COMPETENZCF5,IMDBDef9.PQSL_COMPETENZCF5_NOMINAORDINA,5,99,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_COMPETENZCF5, 0);
  }

  private static void Init_PQRY_COMPETENZCF6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_COMPETENZCF6, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_COMPETENZCF6, "PQRY_COMPETENZCF6");
    IMDB.set_FldCode(IMDBDef9.PQRY_COMPETENZCF6,IMDBDef9.PQSL_COMPETENZCF6_OGGETTO, "OGGETTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_COMPETENZCF6,IMDBDef9.PQSL_COMPETENZCF6_OGGETTO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_COMPETENZCF6,IMDBDef9.PQSL_COMPETENZCF6_COMPECF4UTEN, "COMPECF4UTEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_COMPETENZCF6,IMDBDef9.PQSL_COMPETENZCF6_COMPECF4UTEN,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_COMPETENZCF6,IMDBDef9.PQSL_COMPETENZCF6_COMPECF4COMP, "COMPECF4COMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_COMPETENZCF6,IMDBDef9.PQSL_COMPETENZCF6_COMPECF4COMP,5,40,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_COMPETENZCF6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Competenze(MyWebEntryPoint w, IMDBObj imdb)
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
  public Competenze()
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
    FormIdx = MyGlb.FRM_COMPETENZE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EE355BA5-582C-4A4C-BF66-910579F2FD5C";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 888;
    DesignHeight = 610;
    set_Caption(new IDVariant("Competenze"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 888;
    Frames[1].Height = 584;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.452055;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 888;
    Frames[2].Height = 264;
    Frames[2].Caption = "Oggetti";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 264;
    PAN_OGGETTI = new IDPanel(w, this, 2, "PAN_OGGETTI");
    Frames[2].Content = PAN_OGGETTI;
    PAN_OGGETTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OGGETTI.VS = MainFrm.VisualStyleList;
    PAN_OGGETTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 888-MyGlb.PAN_OFFS_X, 264-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_OGGETTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "71186938-EEC5-4E27-90E8-A40A02A67060");
    PAN_OGGETTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 292, 196, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_OGGETTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OGGETTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OGGETTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OGGETTI.InitStatus = 2;
    PAN_OGGETTI_Init();
    PAN_OGGETTI_InitFields();
    PAN_OGGETTI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 888;
    Frames[3].Height = 320;
    Frames[3].Caption = "Competenze";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 320;
    PAN_COMPETENZE = new IDPanel(w, this, 3, "PAN_COMPETENZE");
    Frames[3].Content = PAN_COMPETENZE;
    PAN_COMPETENZE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_COMPETENZE.VS = MainFrm.VisualStyleList;
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 888-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_COMPETENBOOK != null)
      PAN_COMPETENZE.SetBook(BUK_COMPETENBOOK);
    PAN_COMPETENZE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F6B6A614-4D07-4F19-902C-E776F14BCF5C");
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1184, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_COMPETENZE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_COMPETENZE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_COMPETENZE.InitStatus = 2;
    PAN_COMPETENZE_Init();
    PAN_COMPETENZE_InitFields();
    PAN_COMPETENZE_InitQueries();
    BKW_COMPETENBOOK = new OBook(this);
    BUK_COMPETENBOOK = new CIDREObj(BKW_COMPETENBOOK);
    BKW_COMPETENBOOK.iGuid = "46265245-476C-4A76-9BF0-9B3C2923E9B7";
    BKW_COMPETENBOOK.Code = "BUK_COMPETENBOOK";
    BKW_COMPETENBOOK.BookObj = BUK_COMPETENBOOK;
    BKW_COMPETENBOOK.InitDefMasks();
    BUK_COMPETENBOOK.InitBook(1, 1245185, "Competenze Book", IMDB, MainFrm.VisualStyleList);
    BUK_COMPETENBOOK.InitHTML();
    BUK_COMPETENBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_COMPETENBOOK.Book.SetMainFrm(MainFrm);
    BUK_COMPETENBOOK.SetRTCGuid(0, "46265245-476C-4A76-9BF0-9B3C2923E9B7");
    BUK_COMPETENBOOK.SetObjCode(0, "COMPETENBOOK");
    if (PAN_COMPETENZE != null)
      PAN_COMPETENZE.SetBook(BUK_COMPETENBOOK);
    BUK_COMPETENBOOK_MST_COMPBOOKPAGE_Init();
    BUK_COMPETENBOOK_RPT_NEWREPORT_Init();
    BUK_COMPETENBOOK_InitLinks();
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
      PAN_OGGETTI.UpdatePanel(MainFrm);
      PAN_COMPETENZE.UpdatePanel(MainFrm);
      // BUK_COMPETENBOOK.UpdateBook();
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
    if (Code.equals("BUK_COMPETENBOOK")) return BUK_COMPETENBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Competenze);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Competenze.class.getName() : (Glb.ClassWithPackage(Competenze.class) ? Competenze.class.getName().substring(Competenze.class.getPackage().getName().length() + 1) : Competenze.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Oggetti On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_OGGETTI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Oggetti On Change Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef9.PQRY_OGGETTCOMPET, IMDBDef9.PQSL_OGGETTCOMPET_OGGETTO, 0).equals((new IDVariant(8)), true))
      {
        PAN_COMPETENZE.SetFlags (Glb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_COMPETENZE.SetFlags (Glb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_COMPETENZE.SetFlags (Glb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_COMPETENZE.SetFlags (Glb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_COMPETENZE.SetFlags (Glb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_COMPETENZE.SetFlags (Glb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef9.PQRY_OGGETTCOMPET, IMDBDef9.PQSL_OGGETTCOMPET_OGGETTO, 0).equals((new IDVariant(13)), true) || IMDB.Value(IMDBDef9.PQRY_OGGETTCOMPET, IMDBDef9.PQSL_OGGETTCOMPET_OGGETTO, 0).equals((new IDVariant(14)), true))
      {
        PAN_COMPETENZE.SetFlags (Glb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_COMPETENZE.SetFlags (Glb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_COMPETENZE.SetFlags (Glb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Competenze", "OggettiOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Competenze On Database Error Event
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
  private void PAN_COMPETENZE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_COMPETENZE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Competenze On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Competenze", "CompetenzeOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Competenze On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_COMPETENZE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Competenze On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_COMPETENZCF5, IMDBDef9.PQSL_COMPETENZCF5_OGGETTO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_COMPETENZCF5, IMDBDef9.PQSL_COMPETENZCF5_OGGETTO, 0, IMDB.Value(IMDBDef9.PQRY_OGGETTCOMPET, IMDBDef9.PQSL_OGGETTCOMPET_OGGETTO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Competenze", "CompetenzeOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Competenze On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_COMPETENZE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_COMPETENZE);
      // 
      // Competenze On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_COMPETENZE.set_ToolTip(Glb.OBJ_FIELD,PFL_COMPETENZE_COMPETENZA,(new IDVariant(PAN_COMPETENZE.FieldText(PFL_COMPETENZE_COMPETENZA))).stringValue()); 
      PAN_COMPETENZE.set_ToolTip(Glb.OBJ_FIELD,PFL_COMPETENZE_COMPETENZAUO,(new IDVariant(PAN_COMPETENZE.FieldText(PFL_COMPETENZE_COMPETENZAUO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Competenze", "CompetenzeOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Competenze On Sorting
  // Evento notificato dal pannello quando l'utente clicca
  // sul titolo di una colonna della lista per modificare
  // l'ordinamento dei dati.
  // Column - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_COMPETENZE_OnSorting(IDVariant Column, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Competenze On Sorting Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_COMPETENZE_UTENTE)), true))
      {
        ORDINUTENASC = (new IDVariant(!(ORDINUTENASC.booleanValue())));
        PAN_COMPETENZE.ResetSortList();
        PAN_COMPETENZE.AddToSortList(PFL_COMPETENZE_NOMINAORDINA, ORDINUTENASC.booleanValue()); 
        PAN_COMPETENZE.AddToSortList(PFL_COMPETENZE_COMPETENZA, (new IDVariant(-1)).booleanValue()); 
        PAN_COMPETENZE.EnableSorting();
        Cancel.set((new IDVariant(-1)));
      }
      if (Column.equals((new IDVariant(PFL_COMPETENZE_COMPETENZA)), true))
      {
        ORDINUTENASC = (new IDVariant(0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Competenze", "CompetenzeOnSorting", _e);
    }
  }

  // **********************************************************************
  // Competenze After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_COMPETENZE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Competenze After Find Body
      // Corpo Procedura
      // 
      PAN_COMPETENZE.set_Header(Glb.OBJ_FIELD,PFL_COMPETENZE_UTENTE, (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_OGGETTCOMPET, IMDBDef9.PQSL_OGGETTCOMPET_OGGCOMUTERUO, 0),(new IDVariant("U"))).equals((new IDVariant("U")))? new IDVariant("Utente") : IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_OGGETTCOMPET, IMDBDef9.PQSL_OGGETTCOMPET_OGGCOMUTERUO, 0),(new IDVariant("U"))).equals((new IDVariant("R")))? new IDVariant("Ruolo") :  new IDVariant()).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Competenze", "CompetenzeAfterFind", _e);
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
      ORDINUTENASC = (new IDVariant(-1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Competenze", "Load", _e);
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
  private void PAN_OGGETTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_OGGETTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OGGETTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OGGETTI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OGGETTI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_OGGETTI);
    // Stub
  }

  private void PAN_OGGETTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_OGGETTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_OGGETTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_OGGETTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_COMPETENZE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_COMPETENZE, Cancel);
    // Stub
  }

  private void PAN_COMPETENZE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_COMPETENZE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_COMPETENZE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_COMPETENZE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_COMPETENZE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_COMPETENBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_COMPETENBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_COMPETENBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_COMPETENBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_COMPETENBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_COMPETENBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_COMPETENBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_COMPETENBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_COMPETENBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_COMPETENBOOK_MST_COMPBOOKPAGE)
    {
      BUK_COMPETENBOOK.set_SpanValue(BUK_COMPETENBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_COMPETENBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_COMPETENBOOK.GetTotalPagesNumber()))))));
      BUK_COMPETENBOOK.set_SpanValue(BUK_COMPETENBOOK_SPAN_TITOLO, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Competenze")), (new IDVariant(" - "))), IMDB.Value(IMDBDef9.PQRY_OGGETTCOMPET, IMDBDef9.PQSL_OGGETTCOMPET_DESCRIZIONE, 0))));
    }
  }

  private void BUK_COMPETENBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_COMPETENBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_COMPETENBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_COMPETENBOOK_OnPreview()
  {
    PreviewBook = BKW_COMPETENBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_OGGETTI_Init()
  {

    PAN_OGGETTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OGGETTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OGGETTI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_OGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, "F31DE514-5CA7-4290-996E-53D90B477623");
    PAN_OGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, "OGGETTO");
    PAN_OGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, "");
    PAN_OGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_OGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_OGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, "66C8421B-E431-450A-9748-C00FAE578972");
    PAN_OGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, "Oggetto");
    PAN_OGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, "");
    PAN_OGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, MyGlb.VIS_NORMALFIELDS);
    PAN_OGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_OGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, "82C97CB1-EC22-4E71-8EC8-A1A01F9F054B");
    PAN_OGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, "DESCRIZIONE");
    PAN_OGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, "");
    PAN_OGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_OGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, 0, -1);
    PAN_OGGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, "D40457FC-A7DC-4CCE-929B-2C756FADD2A6");
    PAN_OGGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, "Utente Ruolo");
    PAN_OGGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, "");
    PAN_OGGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_OGGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_OGGETTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, MyGlb.PANEL_LIST, 56);
    PAN_OGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, MyGlb.PANEL_LIST, 1);
    PAN_OGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, MyGlb.PANEL_LIST, "OGGETTO");
    PAN_OGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, MyGlb.PANEL_FORM, 136);
    PAN_OGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, MyGlb.PANEL_FORM, 1);
    PAN_OGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OGGETTI_OGGETTO1, MyGlb.PANEL_FORM, "OGGETTO");
    PAN_OGGETTI.SetFieldPage(PFL_OGGETTI_OGGETTO1, -1, -1);
    PAN_OGGETTI.SetFieldPanel(PFL_OGGETTI_OGGETTO1, PPQRY_OGGETTCOMPET, "A.OGGETTO", "OGGETTO", 1, 4, 0, -13997);
    PAN_OGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, MyGlb.PANEL_LIST, 0, 36, 292, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, MyGlb.PANEL_LIST, 132);
    PAN_OGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_OGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, MyGlb.PANEL_LIST, "Oggetto");
    PAN_OGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, MyGlb.PANEL_FORM, 4, 4, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, MyGlb.PANEL_FORM, 132);
    PAN_OGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_OGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OGGETTI_INTESTCOMPET, MyGlb.PANEL_FORM, "Oggetto");
    PAN_OGGETTI.SetFieldPage(PFL_OGGETTI_INTESTCOMPET, -1, -1);
    PAN_OGGETTI.SetFieldPanel(PFL_OGGETTI_INTESTCOMPET, PPQRY_OGGETTCOMPET, "A.INTESTA_COMPETENZA", "INTESTA_COMPETENZA", 5, 30, 0, -13997);
    PAN_OGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 164, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_OGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_OGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_OGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_OGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_OGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OGGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCR.");
    PAN_OGGETTI.SetFieldPage(PFL_OGGETTI_DESCRIZIONE, -1, -1);
    PAN_OGGETTI.SetFieldPanel(PFL_OGGETTI_DESCRIZIONE, PPQRY_OGGETTCOMPET, "A.DESCRIZIONE", "DESCRIZIONE", 5, 30, 0, -13997);
    PAN_OGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, MyGlb.PANEL_LIST, 292, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, MyGlb.PANEL_LIST, 92);
    PAN_OGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, MyGlb.PANEL_LIST, 1);
    PAN_OGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, MyGlb.PANEL_LIST, "Utente Ruolo");
    PAN_OGGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, MyGlb.PANEL_FORM, 4, 28, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OGGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, MyGlb.PANEL_FORM, 92);
    PAN_OGGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, MyGlb.PANEL_FORM, 1);
    PAN_OGGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OGGETTI_UTENTERUOLO, MyGlb.PANEL_FORM, "Utente Ruolo");
    PAN_OGGETTI.SetFieldPage(PFL_OGGETTI_UTENTERUOLO, -1, -1);
    PAN_OGGETTI.SetFieldPanel(PFL_OGGETTI_UTENTERUOLO, PPQRY_OGGETTCOMPET, "A.UTENTE_RUOLO", "OGGCOMUTERUO", 5, 10, 0, -13997);
    PAN_OGGETTI.SetValueListItem(PFL_OGGETTI_UTENTERUOLO, (new IDVariant("U")), "Utente", "", "", -1);
    PAN_OGGETTI.SetValueListItem(PFL_OGGETTI_UTENTERUOLO, (new IDVariant("R")), "Ruolo", "", "", -1);
  }

  private void PAN_OGGETTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_OGGETTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_OGGETTI.SetIMDB(IMDB, "PQRY_OGGETTCOMPET", true);
    PAN_OGGETTI.set_SetString(MyGlb.MASTER_ROWNAME, "OGGETTI COMPETENZE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OGGETTO as OGGETTO, ");
    SQL.append("  A.INTESTA_COMPETENZA as INTESTA_COMPETENZA, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_RUOLO as OGGCOMUTERUO ");
    PAN_OGGETTI.SetQuery(PPQRY_OGGETTCOMPET, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  OGGETTI_COMPETENZE A ");
    PAN_OGGETTI.SetQuery(PPQRY_OGGETTCOMPET, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OGGETTI.SetQuery(PPQRY_OGGETTCOMPET, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OGGETTI.SetQuery(PPQRY_OGGETTCOMPET, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OGGETTI.SetQuery(PPQRY_OGGETTCOMPET, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.OGGETTO ");
    PAN_OGGETTI.SetQuery(PPQRY_OGGETTCOMPET, 5, SQL, -1, "");
    PAN_OGGETTI.SetQueryDB(PPQRY_OGGETTCOMPET, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OGGETTI.SetMasterTable(0, "OGGETTI_COMPETENZE");
    PAN_OGGETTI.AddToSortList(PFL_OGGETTI_OGGETTO1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_OGGETTI.Status() == 2)
    {
      int oldListQBE = PAN_OGGETTI.iUseListQBE;
      PAN_OGGETTI.iUseListQBE = 0;
      PAN_OGGETTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_OGGETTI.PanelCommand(Glb.PCM_FIND);
      PAN_OGGETTI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_COMPETENZE_Init()
  {

    PAN_COMPETENZE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_COMPETENZE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_COMPETENZE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_COMPETENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, "00B36DB2-6214-4222-896A-F9D63F54FD50");
    PAN_COMPETENZE.set_Header(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, "OGGETTO");
    PAN_COMPETENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, "Oggetto della Competenza");
    PAN_COMPETENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_COMPETENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_COMPETENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, "D94C895B-11EB-4C56-A2C9-12261FABA474");
    PAN_COMPETENZE.set_Header(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, "Utente");
    PAN_COMPETENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, "");
    PAN_COMPETENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_COMPETENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_COMPETENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, "9DB065E8-4296-4AA5-8CD0-E46F95227604");
    PAN_COMPETENZE.set_Header(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, "Competenza");
    PAN_COMPETENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, "Competenza dell'utente per l'oggetto");
    PAN_COMPETENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_COMPETENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_COMPETENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, "0A281238-099D-43C3-8832-4AC421E88F64");
    PAN_COMPETENZE.set_Header(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, "Competenza");
    PAN_COMPETENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, "");
    PAN_COMPETENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, MyGlb.VIS_NORMALFIELDS);
    PAN_COMPETENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_COMPETENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, "F626796A-B2DD-43B9-9EE4-E00AE9F9AACD");
    PAN_COMPETENZE.set_Header(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, "Competenza");
    PAN_COMPETENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, "");
    PAN_COMPETENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, MyGlb.VIS_NORMALFIELDS);
    PAN_COMPETENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_COMPETENZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, "6874F2D1-D7AE-4AA2-B7F4-90A46F5827C0");
    PAN_COMPETENZE.set_Header(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, "Nominativo Ordinamento");
    PAN_COMPETENZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, "");
    PAN_COMPETENZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, MyGlb.VIS_NORMFIELPADR);
    PAN_COMPETENZE.SetFlags(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_COMPETENZE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, MyGlb.PANEL_LIST, 56);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, MyGlb.PANEL_LIST, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, MyGlb.PANEL_LIST, "OGGETTO");
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, MyGlb.PANEL_FORM, 88);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, MyGlb.PANEL_FORM, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_OGGETTO2, MyGlb.PANEL_FORM, "OGGETTO");
    PAN_COMPETENZE.SetFieldPage(PFL_COMPETENZE_OGGETTO2, -1, -1);
    PAN_COMPETENZE.SetFieldPanel(PFL_COMPETENZE_OGGETTO2, PPQRY_COMPETENZCF5, "A.OGGETTO", "OGGETTO", 1, 4, 0, -13997);
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, MyGlb.PANEL_LIST, 0, 36, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, MyGlb.PANEL_LIST, 52);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, MyGlb.PANEL_FORM, 4, 172, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, MyGlb.PANEL_FORM, 52);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_UTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_COMPETENZE.SetFieldPage(PFL_COMPETENZE_UTENTE, -1, -1);
    PAN_COMPETENZE.SetFieldPanel(PFL_COMPETENZE_UTENTE, PPQRY_COMPETENZCF5, "A.UTENTE", "UTENTE", 5, 8, 0, -13997);
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, MyGlb.PANEL_LIST, 272, 36, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, MyGlb.PANEL_LIST, 76);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, MyGlb.PANEL_LIST, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, MyGlb.PANEL_LIST, "Competenza");
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, MyGlb.PANEL_FORM, 4, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, MyGlb.PANEL_FORM, 88);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, MyGlb.PANEL_FORM, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZA, MyGlb.PANEL_FORM, "Competenza");
    PAN_COMPETENZE.SetFieldPage(PFL_COMPETENZE_COMPETENZA, -1, -1);
    PAN_COMPETENZE.SetFieldPanel(PFL_COMPETENZE_COMPETENZA, PPQRY_COMPETENZCF5, "A.COMPETENZA", "COMPETENZA", 5, 40, 0, -13997);
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, MyGlb.PANEL_LIST, 520, 36, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, MyGlb.PANEL_LIST, 188);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, MyGlb.PANEL_LIST, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, MyGlb.PANEL_LIST, "Competenza");
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, MyGlb.PANEL_FORM, 4, 124, 624, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, MyGlb.PANEL_FORM, 188);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, MyGlb.PANEL_FORM, 2);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_COMPETENZAUO, MyGlb.PANEL_FORM, "Competenza");
    PAN_COMPETENZE.SetFieldPage(PFL_COMPETENZE_COMPETENZAUO, -1, -1);
    PAN_COMPETENZE.SetFieldPanel(PFL_COMPETENZE_COMPETENZAUO, PPQRY_VISTAUOCOMPE, "A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA", "DESCUO", 5, 293, 0, -13997);
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, MyGlb.PANEL_LIST, 852, 36, 332, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, MyGlb.PANEL_LIST, 256);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, MyGlb.PANEL_LIST, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, MyGlb.PANEL_LIST, "Competenza");
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, MyGlb.PANEL_FORM, 4, 196, 768, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, MyGlb.PANEL_FORM, 256);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, MyGlb.PANEL_FORM, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_VALOREOGGETT, MyGlb.PANEL_FORM, "Competenza");
    PAN_COMPETENZE.SetFieldPage(PFL_COMPETENZE_VALOREOGGETT, -1, -1);
    PAN_COMPETENZE.SetFieldPanel(PFL_COMPETENZE_VALOREOGGETT, PPQRY_VALOOGGECOMP, "A.DESCRIZIONE", "VALOGGCOMDES", 5, 100, 0, -13997);
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, MyGlb.PANEL_LIST, 72);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, MyGlb.PANEL_LIST, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, MyGlb.PANEL_LIST, "Nominativo Ordinamento");
    PAN_COMPETENZE.SetRect(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, MyGlb.PANEL_FORM, 4, 220, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMPETENZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, MyGlb.PANEL_FORM, 72);
    PAN_COMPETENZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, MyGlb.PANEL_FORM, 1);
    PAN_COMPETENZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMPETENZE_NOMINAORDINA, MyGlb.PANEL_FORM, "Nom. Ordin.");
    PAN_COMPETENZE.SetFieldPage(PFL_COMPETENZE_NOMINAORDINA, -1, -1);
    PAN_COMPETENZE.SetFieldUnbound(PFL_COMPETENZE_NOMINAORDINA, true);
    PAN_COMPETENZE.SetFieldPanel(PFL_COMPETENZE_NOMINAORDINA, PPQRY_COMPETENZCF5, "AD4_UTENTE.GET_NOMINATIVO(A.UTENTE,'N',0)", "NOMINAORDINA", 5, 99, 0, -13997);
  }

  private void PAN_COMPETENZE_InitQueries()
  {
    StringBuffer SQL;

    PAN_COMPETENZE.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VIUOCOPRUNOR, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as CODICE_UO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DESCUO ");
    SQL.append("from ");
    SQL.append("  VISTA_UO_COMPETENZA A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~COMPETENZA~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " OR A.OTTICA = '-1') ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("and   (~~PQRY_OGGETTCOMPET.OGGETTO~~ = 8) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_COMPETENZE.SetQuery(PPQRY_VISTAUOCOMPE, 0, SQL, -1, "");
    PAN_COMPETENZE.SetQueryDB(PPQRY_VISTAUOCOMPE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COMPETENZE.SetMasterTable(PPQRY_VISTAUOCOMPE, "VISTA_UO_COMPETENZA");
    PAN_COMPETENZE.SetQueryLKE(PPQRY_VISTAUOCOMPE, PFL_COMPETENZE_COMPETENZA, "VIUOCOPRUNOR");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VIUOCOPRUNOR, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as CODICE_UO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DESCUO ");
    SQL.append("from ");
    SQL.append("  VISTA_UO_COMPETENZA A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " OR A.OTTICA = '-1') ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("and   (~~PQRY_OGGETTCOMPET.OGGETTO~~ = 8) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_COMPETENZE.SetQuery(PPQRY_VISTAUOCOMPE, 1, SQL, -1, "");
    PAN_COMPETENZE.SetQueryHeaderColumn(PPQRY_VISTAUOCOMPE, "GROUPID", "Suddivisione");
    PAN_COMPETENZE.SetQueryHeaderColumn(PPQRY_VISTAUOCOMPE, "CODICE_UO", "CODICE UO");
    PAN_COMPETENZE.SetQueryHeaderColumn(PPQRY_VISTAUOCOMPE, "DESCUO", "Desc UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.VALORE as VALOGGCOMVAL, ");
    SQL.append("  A.DESCRIZIONE as VALOGGCOMDES, ");
    SQL.append("  A.SEQUENZA as SEQUENZA ");
    SQL.append("from ");
    SQL.append("  VALORI_OGGETTI_COMPETENZE A ");
    SQL.append("where (A.VALORE = ~~COMPETENZA~~) ");
    SQL.append("and   (A.OGGETTO = ~~PQRY_OGGETTCOMPET.OGGETTO~~) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_COMPETENZE.SetQuery(PPQRY_VALOOGGECOMP, 0, SQL, -1, "");
    PAN_COMPETENZE.SetQueryDB(PPQRY_VALOOGGECOMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COMPETENZE.SetMasterTable(PPQRY_VALOOGGECOMP, "VALORI_OGGETTI_COMPETENZE");
    PAN_COMPETENZE.SetQueryLKE(PPQRY_VALOOGGECOMP, PFL_COMPETENZE_COMPETENZA, "VALOGGCOMVAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.VALORE as VALOGGCOMVAL, ");
    SQL.append("  A.DESCRIZIONE as VALOGGCOMDES, ");
    SQL.append("  A.SEQUENZA as SEQUENZA ");
    SQL.append("from ");
    SQL.append("  VALORI_OGGETTI_COMPETENZE A ");
    SQL.append("where (A.OGGETTO = ~~PQRY_OGGETTCOMPET.OGGETTO~~) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_COMPETENZE.SetQuery(PPQRY_VALOOGGECOMP, 1, SQL, -1, "");
    PAN_COMPETENZE.SetQueryHeaderColumn(PPQRY_VALOOGGECOMP, "VALOGGCOMDES", "Descrizione");
    PAN_COMPETENZE.SetQueryVisibleColumn(PPQRY_VALOOGGECOMP, "VALOGGCOMDES");
    PAN_COMPETENZE.SetQueryHeaderColumn(PPQRY_VALOOGGECOMP, "SEQUENZA", "VALORI OGGETTI COMPETENZE SEQUENZA");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.UTENTE as DIRIACCEUTEN, ");
    SQL.append("  B.NOMINATIVO as DIRACCUTENOM ");
    SQL.append("from ");
    SQL.append("  AD4_DIRITTI_ACCESSO A, ");
    SQL.append("  AD4_UTENTI B ");
    SQL.append("where (A.UTENTE = ~~UTENTE~~) ");
    SQL.append("and   (B.UTENTE = A.UTENTE) ");
    SQL.append("and   (A.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (NVL(~~PQRY_OGGETTCOMPET.OGGCOMUTERUO~~, 'U') = 'U') ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  da.RUOLO, ");
    SQL.append("  da.RUOLO || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  AD4_DIRITTI_ACCESSO da, ");
    SQL.append("  AD4_RUOLI C ");
    SQL.append("where (da.RUOLO = ~~UTENTE~~) ");
    SQL.append("and   (da.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (C.RUOLO = da.RUOLO) ");
    SQL.append("and   (NVL(~~PQRY_OGGETTCOMPET.OGGCOMUTERUO~~, 'U') = 'R') ");
    SQL.append("order by 2 ");
    PAN_COMPETENZE.SetQuery(PPQRY_DIRITTACCES1, 0, SQL, PFL_COMPETENZE_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.UTENTE as DIRIACCEUTEN, ");
    SQL.append("  B.NOMINATIVO as DIRACCUTENOM ");
    SQL.append("from ");
    SQL.append("  AD4_DIRITTI_ACCESSO A, ");
    SQL.append("  AD4_UTENTI B ");
    SQL.append("where (B.UTENTE = A.UTENTE) ");
    SQL.append("and   (A.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (NVL(~~PQRY_OGGETTCOMPET.OGGCOMUTERUO~~, 'U') = 'U') ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  da.RUOLO, ");
    SQL.append("  da.RUOLO || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  AD4_DIRITTI_ACCESSO da, ");
    SQL.append("  AD4_RUOLI C ");
    SQL.append("where (da.ISTANZA = ~~TBL_DATISESSIONE.SESSIOISTANZ~~) ");
    SQL.append("and   (C.RUOLO = da.RUOLO) ");
    SQL.append("and   (NVL(~~PQRY_OGGETTCOMPET.OGGCOMUTERUO~~, 'U') = 'R') ");
    SQL.append("order by 2 ");
    PAN_COMPETENZE.SetQuery(PPQRY_DIRITTACCES1, 1, SQL, PFL_COMPETENZE_UTENTE, "");
    PAN_COMPETENZE.SetQueryDB(PPQRY_DIRITTACCES1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COMPETENZE.SetIMDB(IMDB, "PQRY_COMPETENZCF5", true);
    PAN_COMPETENZE.set_SetString(MyGlb.MASTER_ROWNAME, "COMPETENZE CF4");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OGGETTO as OGGETTO, ");
    SQL.append("  A.COMPETENZA as COMPETENZA, ");
    SQL.append("  A.UTENTE as UTENTE, ");
    SQL.append("  AD4_UTENTE.GET_NOMINATIVO(A.UTENTE,'N',0) as NOMINAORDINA ");
    PAN_COMPETENZE.SetQuery(PPQRY_COMPETENZCF5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  COMPETENZE_CF4 A ");
    PAN_COMPETENZE.SetQuery(PPQRY_COMPETENZCF5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.OGGETTO = ~~PQRY_OGGETTCOMPET.OGGETTO~~) ");
    PAN_COMPETENZE.SetQuery(PPQRY_COMPETENZCF5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_COMPETENZE.SetQuery(PPQRY_COMPETENZCF5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_COMPETENZE.SetQuery(PPQRY_COMPETENZCF5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 4, 2 ");
    PAN_COMPETENZE.SetQuery(PPQRY_COMPETENZCF5, 5, SQL, -1, "");
    PAN_COMPETENZE.SetQueryDB(PPQRY_COMPETENZCF5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COMPETENZE.SetMasterTable(0, "COMPETENZE_CF4");
    PAN_COMPETENZE.AddToSortList(PFL_COMPETENZE_NOMINAORDINA, true);
    PAN_COMPETENZE.AddToSortList(PFL_COMPETENZE_COMPETENZA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_COMPETENZE.Status() == 2)
    {
      int oldListQBE = PAN_COMPETENZE.iUseListQBE;
      PAN_COMPETENZE.iUseListQBE = 0;
      PAN_COMPETENZE.PanelCommand(Glb.PCM_SEARCH);
      PAN_COMPETENZE.PanelCommand(Glb.PCM_FIND);
      PAN_COMPETENZE.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_COMPETENBOOK_MST_COMPBOOKPAGE_Init()
  {
    BUK_COMPETENBOOK.InitMastro(BUK_COMPETENBOOK_MST_COMPBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_MST_COMPBOOKPAGE, "830ABD6F-7AE3-4F16-BCFD-6CF676D2DF9C");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_MST_COMPBOOKPAGE, "COMPBOOKPAGE");
    BUK_COMPETENBOOK.InitMastroBox(BUK_COMPETENBOOK_MST_COMPBOOKPAGE, BUK_COMPETENBOOK_RPTBOX_NUMEROPAGINA, 18200, 400, 1700, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_RPTBOX_NUMEROPAGINA, "EF83431B-B279-46DB-8E0F-C07CDED6461E");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_COMPETENBOOK.InitBoxSpan(BUK_COMPETENBOOK_RPTBOX_NUMEROPAGINA, BUK_COMPETENBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SPAN_NUMEROPAGINA, "323ED919-B891-4829-8AAF-1FAF9F9FF276");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_COMPETENBOOK.InitMastroBox(BUK_COMPETENBOOK_MST_COMPBOOKPAGE, BUK_COMPETENBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 1500, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_RPTBOX_PAGEHEADER, "7DC91EC2-F2EA-497F-B732-B415848381EC");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_COMPETENBOOK.InitBoxSpan(BUK_COMPETENBOOK_RPTBOX_PAGEHEADER, BUK_COMPETENBOOK_SPAN_TITOLO, MyGlb.VIS_TITOLOREPORT, 5, 43, 0, 271319169, "", "", 1);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SPAN_TITOLO, "0D1E1A2D-DD34-40A4-BF17-B6EA070B8CDA");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SPAN_TITOLO, "TITOLO");
    BUK_COMPETENBOOK.InitMastroBox(BUK_COMPETENBOOK_MST_COMPBOOKPAGE, BUK_COMPETENBOOK_RPTBOX_PAGEBODY, 1000, 2800, 19000, 25600, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_RPTBOX_PAGEBODY, "4F877696-342E-4AF6-840B-418B3583DE44");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_COMPETENBOOK_RPT_NEWREPORT_InitQuery() { BUK_COMPETENBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_COMPETENBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.OGGETTO as OGGETTO, ");
      SQL.append("  A.UTENTE as COMPECF4UTEN, ");
      SQL.append("  A.COMPETENZA as COMPECF4COMP ");
      SQL.append("from ");
      SQL.append("  COMPETENZE_CF4 A ");
      SQL.append("where (A.OGGETTO = ~~PQRY_OGGETTCOMPET.OGGETTO~~) ");
      SQL.append("order by ");
      SQL.append("  A.UTENTE ");
      BUK_COMPETENBOOK.SetReportQuery(BUK_COMPETENBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "5DCF07F3-C7A1-4C99-9531-69DC8D37958E");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_COMPETENBOOK_RPT_NEWREPORT_Init()
  {
    BUK_COMPETENBOOK.InitReport(BUK_COMPETENBOOK_RPT_NEWREPORT, 196609);
    BUK_COMPETENBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_RPT_NEWREPORT, "4330FD6F-AA7D-49F6-A9F9-02C3CA1E99C6");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_COMPETENBOOK.InitSection(BUK_COMPETENBOOK_RPT_NEWREPORT, BUK_COMPETENBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_COMPETENBOOK.SetSectionRendersInto(BUK_COMPETENBOOK_SEC_REPORTHEADER, BUK_COMPETENBOOK_RPTBOX_PAGEBODY);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SEC_REPORTHEADER, "6C405AA4-313D-4DEE-BED7-F5BD667AAAF7");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_COMPETENBOOK.InitSection(BUK_COMPETENBOOK_RPT_NEWREPORT, BUK_COMPETENBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_COMPETENBOOK.SetSectionRendersInto(BUK_COMPETENBOOK_SEC_PAGEHEADER, BUK_COMPETENBOOK_RPTBOX_PAGEBODY);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SEC_PAGEHEADER, "7A060853-5DCA-4868-80E0-02ED510591EA");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_COMPETENBOOK.InitReportBox(BUK_COMPETENBOOK_SEC_PAGEHEADER, BUK_COMPETENBOOK_RPTBOX_UTENTEHEADER, 0, 0, 2000, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_RPTBOX_UTENTEHEADER, "41045710-58E3-4351-A951-15D7484A8135");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_RPTBOX_UTENTEHEADER, "UTENTEHEADER");
    BUK_COMPETENBOOK.InitBoxSpan(BUK_COMPETENBOOK_RPTBOX_UTENTEHEADER, BUK_COMPETENBOOK_SPAN_UTENTE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Utente", 1);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SPAN_UTENTE, "7FA25F98-7467-40EF-8782-53C2B53F9A12");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SPAN_UTENTE, "UTENTE");
    BUK_COMPETENBOOK.InitReportBox(BUK_COMPETENBOOK_SEC_PAGEHEADER, BUK_COMPETENBOOK_RPTBOX_COMPETHEADER, 2200, 0, 16200, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_RPTBOX_COMPETHEADER, "892D8E32-9E22-4B9B-BF3F-58369F9FD63B");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_RPTBOX_COMPETHEADER, "COMPETHEADER");
    BUK_COMPETENBOOK.InitBoxSpan(BUK_COMPETENBOOK_RPTBOX_COMPETHEADER, BUK_COMPETENBOOK_SPAN_COMPETENZA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Competenza", 1);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SPAN_COMPETENZA, "3085627D-E1F7-4662-A6EA-D1123C7C5DB4");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SPAN_COMPETENZA, "COMPETENZA");
    BUK_COMPETENBOOK.InitSection(BUK_COMPETENBOOK_RPT_NEWREPORT, BUK_COMPETENBOOK_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_COMPETENBOOK.SetSectionRendersInto(BUK_COMPETENBOOK_SEC_DETAIL, BUK_COMPETENBOOK_RPTBOX_PAGEBODY);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SEC_DETAIL, "79021139-3B55-4DC4-8961-203EA64893C3");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SEC_DETAIL, "DETAIL");
    BUK_COMPETENBOOK.InitReportBox(BUK_COMPETENBOOK_SEC_DETAIL, BUK_COMPETENBOOK_RPTBOX_COMPETENZA, 2200, 0, 16200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_RPTBOX_COMPETENZA, "D14CA7E3-6003-4016-8B6C-195B32EC5B19");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_RPTBOX_COMPETENZA, "COMPETENZA");
    BUK_COMPETENBOOK.InitBoxSpan(BUK_COMPETENBOOK_RPTBOX_COMPETENZA, BUK_COMPETENBOOK_SPAN_COCFCOCOCOBO, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Competenza dell'utente per l'oggetto", "::COMPECF4COMP", 1);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SPAN_COCFCOCOCOBO, "ECB23A55-715C-472A-B66B-278EDDB43D4F");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SPAN_COCFCOCOCOBO, "COCFCOCOCOBO");
    BUK_COMPETENBOOK.InitReportBox(BUK_COMPETENBOOK_SEC_DETAIL, BUK_COMPETENBOOK_RPTBOX_UTENTE, 0, 0, 2000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_RPTBOX_UTENTE, "34CD97A1-F633-4654-B8DB-76391CA0FA64");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_RPTBOX_UTENTE, "UTENTE");
    BUK_COMPETENBOOK.InitBoxSpan(BUK_COMPETENBOOK_RPTBOX_UTENTE, BUK_COMPETENBOOK_SPAN_COCFUTCOCOBO, MyGlb.VIS_DEFAREPOSTYL, 5, 8, 0, 271384705, "Codice dell'utente per il quale si stabilisce la Competenza", "::COMPECF4UTEN", 1);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SPAN_COCFUTCOCOBO, "80CF79B3-4E4B-4308-8578-DA158DACD85C");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SPAN_COCFUTCOCOBO, "COCFUTCOCOBO");
    BUK_COMPETENBOOK.InitSection(BUK_COMPETENBOOK_RPT_NEWREPORT, BUK_COMPETENBOOK_SEC_PAGEFOOTER, 400, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_COMPETENBOOK.SetSectionRendersInto(BUK_COMPETENBOOK_SEC_PAGEFOOTER, BUK_COMPETENBOOK_RPTBOX_PAGEBODY);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SEC_PAGEFOOTER, "B5855D74-14CE-4315-88B1-CF4AECAEF12B");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_COMPETENBOOK.InitSection(BUK_COMPETENBOOK_RPT_NEWREPORT, BUK_COMPETENBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_COMPETENBOOK.SetSectionRendersInto(BUK_COMPETENBOOK_SEC_REPORTFOOTER, BUK_COMPETENBOOK_RPTBOX_PAGEBODY);
    BUK_COMPETENBOOK.SetRTCGuid(BUK_COMPETENBOOK_SEC_REPORTFOOTER, "8867CAF5-34C7-455E-8AFD-2B58DA20E2AB");
    BUK_COMPETENBOOK.SetObjCode(BUK_COMPETENBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_COMPETENBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_COMPETENBOOK_InitLinks()
  {
    BUK_COMPETENBOOK.SetBoxNextBox(BUK_COMPETENBOOK_RPTBOX_PAGEBODY, BUK_COMPETENBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_OGGETTI) PAN_OGGETTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_COMPETENZE) PAN_COMPETENZE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_OGGETTI) PAN_OGGETTI_ValidateRow(Cancel);
    if (SrcObj == PAN_COMPETENZE) PAN_COMPETENZE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_OGGETTI) PAN_OGGETTI_DynamicProperties();
    if (SrcObj == PAN_COMPETENZE) PAN_COMPETENZE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_OGGETTI) PAN_OGGETTI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_COMPETENZE) PAN_COMPETENZE_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_OGGETTI) PAN_OGGETTI_OnChangeRow();
  }

  public void OnSelectingRow(IDPanel SrcObj)
  {
  }

  public void OnSorting(IDPanel SrcObj, IDVariant FldIdx, IDVariant Cancel)
  {
    if (SrcObj == PAN_COMPETENZE) PAN_COMPETENZE_OnSorting(FldIdx, Cancel);
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
    if (SrcObj == PAN_COMPETENZE) PAN_COMPETENZE_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_OGGETTI) PAN_OGGETTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_COMPETENZE) PAN_COMPETENZE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_COMPETENBOOK) BUK_COMPETENBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_COMPETENBOOK) BUK_COMPETENBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_COMPETENBOOK) BUK_COMPETENBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_COMPETENBOOK) BUK_COMPETENBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_COMPETENBOOK) BUK_COMPETENBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_COMPETENBOOK) BUK_COMPETENBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_COMPETENBOOK) BUK_COMPETENBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_COMPETENBOOK) BUK_COMPETENBOOK_OnPreview();
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
