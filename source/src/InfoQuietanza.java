// **********************************************
// Info Quietanza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoQuietanza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_INFOQUIETANZ_IBAN = 0;

  private static int PFL_INFOQUIETANZ_SOGGETTLABEL = 0;
  private static int PFL_INFOQUIETANZ_CODICE = 1;
  private static int PFL_INFOQUIETANZ_RAGIONSOCIAL = 2;
  private static int PFL_INFOQUIETANZ_CONTOCORRENT = 3;
  private static int PFL_INFOQUIETANZ_ABI = 4;
  private static int PFL_INFOQUIETANZ_CAB = 5;
  private static int PFL_INFOQUIETANZ_CIN = 6;
  private static int PFL_INFOQUIETANZ_CBPAESE = 7;
  private static int PFL_INFOQUIETANZ_CINEU = 8;
  private static int PFL_INFOQUIETANZ_NRQUIETANZA = 9;
  private static int PFL_INFOQUIETANZ_PREVALENTE = 10;
  private static int PFL_INFOQUIETANZ_TIPOQUIETANZ = 11;
  private static int PFL_INFOQUIETANZ_BIC = 12;
  private static int PFL_INFOQUIETANZ_CONTODEDICAT = 13;
  private static int PFL_INFOQUIETANZ_BANCA = 14;
  private static int PFL_INFOQUIETANZ_INTESTATARI = 15;
  private static int PFL_INFOQUIETANZ_INTESTATARI2 = 16;
  private static int PFL_INFOQUIETANZ_INTESTATARI3 = 17;
  private static int PFL_INFOQUIETANZ_TIPOQUIETAN1 = 18;
  private static int PFL_INFOQUIETANZ_SCADENZA = 19;
  private static int PFL_INFOQUIETANZ_IBANIDNAZION = 20;
  private static int PFL_INFOQUIETANZ_IBANCONTO = 21;
  private static int PFL_INFOQUIETANZ_IBANEXTRACEE = 22;
  private static int PFL_INFOQUIETANZ_QUIETANZANTE = 23;
  private static int PFL_INFOQUIETANZ_SPESE = 24;
  private static int PFL_INFOQUIETANZ_BENEFIEXPRES = 25;

  private static int PPQRY_QTN3 = 0;


  IDPanel PAN_INFOQUIETANZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI237(IMDB);
    Init_TBL_COSTANTI(IMDB);
    //
    //
    Init_PQRY_QTN3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI237(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI237, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI237, "TBL_PARAMETRI237");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI237,IMDBDef1.FLD_PARAMETRI237_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI237,IMDBDef1.FLD_PARAMETRI237_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI237,IMDBDef1.FLD_PARAMETRI237_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI237,IMDBDef1.FLD_PARAMETRI237_NUM_QUIETANZA,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI237, 0);
  }

  private static void Init_TBL_COSTANTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_COSTANTI, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_COSTANTI, "TBL_COSTANTI");
    IMDB.set_FldCode(IMDBDef1.TBL_COSTANTI,IMDBDef1.FLD_COSTANTI_ROWNAMNEWFIE, "ROWNAMNEWFIE");
    IMDB.SetFldParams(IMDBDef1.TBL_COSTANTI,IMDBDef1.FLD_COSTANTI_ROWNAMNEWFIE,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_COSTANTI,IMDBDef1.FLD_COSTANTI_ROWNAMNEWFI1, "ROWNAMNEWFI1");
    IMDB.SetFldParams(IMDBDef1.TBL_COSTANTI,IMDBDef1.FLD_COSTANTI_ROWNAMNEWFI1,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_COSTANTI,IMDBDef1.FLD_COSTANTI_ROWNAMNEWFI2, "ROWNAMNEWFI2");
    IMDB.SetFldParams(IMDBDef1.TBL_COSTANTI,IMDBDef1.FLD_COSTANTI_ROWNAMNEWFI2,5,49,0);
    IMDB.TblAddNew(IMDBDef1.TBL_COSTANTI, 0);
  }

  private static void Init_PQRY_QTN3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_QTN3, 25);
    IMDB.set_TblCode(IMDBDef8.PQRY_QTN3, "PQRY_QTN3");
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_CODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_CONTO_CORRENTE, "CONTO_CORRENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_CONTO_CORRENTE,5,12,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_DES_BANCA, "DES_BANCA");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_DES_BANCA,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_COD_BANCA, "COD_BANCA");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_COD_BANCA,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_COD_SPORTELLO, "COD_SPORTELLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_COD_SPORTELLO,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_INTESTATARIO_1, "INTESTATARIO_1");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_INTESTATARIO_1,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_INTESTATARIO_2, "INTESTATARIO_2");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_INTESTATARIO_2,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_INTESTATARIO_3, "INTESTATARIO_3");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_INTESTATARIO_3,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_TIPO_QUIETANZA, "TIPO_QUIETANZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_TIPO_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_SCADENZA,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_CIN_BANCARIO, "CIN_BANCARIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_CIN_BANCARIO,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_PAESE, "IBAN_PAESE");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_PAESE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_CIN_EUROPA, "IBAN_CIN_EUROPA");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_CIN_EUROPA,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECORDQUIETA, "RECORDQUIETA");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECORDQUIETA,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECOBENEEXPR, "RECOBENEEXPR");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECOBENEEXPR,5,162,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_ID_NAZIONALE, "IBAN_ID_NAZIONALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_ID_NAZIONALE,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_CONTO, "IBAN_CONTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_CONTO,5,18,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_EXTRA_UE, "IBAN_EXTRA_UE");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_IBAN_EXTRA_UE,5,34,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_BIC, "BIC");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_BIC,5,11,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECORDSPESE, "RECORDSPESE");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECORDSPESE,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECQTNCONDED, "RECQTNCONDED");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECQTNCONDED,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECORQTNPREV, "RECORQTNPREV");
    IMDB.SetFldParams(IMDBDef8.PQRY_QTN3,IMDBDef8.PQSL_QTN3_RECORQTNPREV,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_QTN3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoQuietanza(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoQuietanza()
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
    FormIdx = MyGlb.FRM_INFOQUIETANZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BAD9B0BB-9D33-418E-B9FB-B85F693288A8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 668;
    DesignHeight = 518;
    set_Caption(new IDVariant("Info Quietanza"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 668;
    Frames[1].Height = 492;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Info Quietanza";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 492;
    PAN_INFOQUIETANZ = new IDPanel(w, this, 1, "PAN_INFOQUIETANZ");
    Frames[1].Content = PAN_INFOQUIETANZ;
    PAN_INFOQUIETANZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INFOQUIETANZ.VS = MainFrm.VisualStyleList;
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 668-MyGlb.PAN_OFFS_X, 492-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0A579E5C-5BA3-483D-B509-7BD4998D17DF");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3312, 308, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE, -1);
    PAN_INFOQUIETANZ.InitStatus = 1;
    PAN_INFOQUIETANZ_Init();
    PAN_INFOQUIETANZ_InitFields();
    PAN_INFOQUIETANZ_InitQueries();
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
      PAN_INFOQUIETANZ.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoQuietanza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoQuietanza.class.getName() : (Glb.ClassWithPackage(InfoQuietanza.class) ? InfoQuietanza.class.getName().substring(InfoQuietanza.class.getPackage().getName().length() + 1) : InfoQuietanza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Info Quietanza After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_INFOQUIETANZ_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Quietanza After Find Event Body
      // Procedure Body
      // 
      PAN_INFOQUIETANZ.set_FieldText(PFL_INFOQUIETANZ_SOGGETTLABEL, IDL.Add(IDL.Add((new IDVariant(PAN_INFOQUIETANZ.FieldText(PFL_INFOQUIETANZ_CODICE))), (new IDVariant(" - "))), (new IDVariant(PAN_INFOQUIETANZ.FieldText(PFL_INFOQUIETANZ_RAGIONSOCIAL)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoQuietanza", "InfoQuietanzaAfterFindEvent", _e);
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
    IDVariant v_NEWVARIABLE0 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NEWVARIABLE1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NEWVARIABLE2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NEWVARIABLE0 = (new IDVariant("Esente", IDVariant.STRING));
      v_NEWVARIABLE1 = (new IDVariant("A Carico Ente", IDVariant.STRING));
      v_NEWVARIABLE2 = (new IDVariant("A Carico Istituto", IDVariant.STRING));
      v_NOMECAPTION = (new IDVariant("Informazioni Quietanza", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Quietanza", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      Frames[PAN_INFOQUIETANZ.FrIndex].set_Caption(new IDVariant(v_NOMECAPTION).stringValue());
      IMDB.set_Value(IMDBDef1.TBL_COSTANTI, IMDBDef1.FLD_COSTANTI_ROWNAMNEWFIE, 0, new IDVariant(v_NEWVARIABLE0));
      IMDB.set_Value(IMDBDef1.TBL_COSTANTI, IMDBDef1.FLD_COSTANTI_ROWNAMNEWFI1, 0, new IDVariant(v_NEWVARIABLE1));
      IMDB.set_Value(IMDBDef1.TBL_COSTANTI, IMDBDef1.FLD_COSTANTI_ROWNAMNEWFI2, 0, new IDVariant(v_NEWVARIABLE2));
      // 
      // gestione campo quietanzante
      // 
      {
        IDVariant v_NOMELICENZA = new IDVariant(0,IDVariant.STRING);
        v_NOMELICENZA = (new IDVariant("MIF", IDVariant.STRING));
        if (!(MainFrm.FunzioneLicenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), v_NOMELICENZA)))
        {
          PAN_INFOQUIETANZ.SetFlags (Glb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      set_Caption(new IDVariant(v_CAPTION));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoQuietanza", "LoadEvent", _e);
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
  private void PAN_INFOQUIETANZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INFOQUIETANZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INFOQUIETANZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INFOQUIETANZ, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INFOQUIETANZ_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_INFOQUIETANZ);
    // Stub
  }

  private void PAN_INFOQUIETANZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_INFOQUIETANZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INFOQUIETANZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INFOQUIETANZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_INFOQUIETANZ_Init()
  {

    PAN_INFOQUIETANZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INFOQUIETANZ.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, "47BEA221-55AE-4B91-929B-A62D6B2B5A2F");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, "IBAN");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, MyGlb.VIS_GROUPSTYLE);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, MyGlb.PANEL_LIST, 568, -9999, 1756, 16, 0, 0);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, MyGlb.PANEL_FORM, 16, 79, 624, 73, 0, 0);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, 0, 27);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, 1, 13);
    PAN_INFOQUIETANZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, 0, 4);
    PAN_INFOQUIETANZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, 1, 4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_GROUP, GRP_INFOQUIETANZ_IBAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INFOQUIETANZ.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, "3047A024-B292-484D-80AE-03B1F5304DDC");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, MyGlb.VIS_ETICGRASLEFT);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, "E2A78947-AADF-45DB-97E1-F630AC80D4EB");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, "CODICE");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, "94A3C7C4-6678-4B42-BAA3-465EDAD30878");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, "RAGIONE SOCIALE");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, MyGlb.VIS_NONNULLAFIEL);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, 0, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, "452E17BA-5EEC-4372-985E-2FCB92CD4DDE");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, "Conto Corrente");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, "5A462FDD-EBEA-4900-85CE-D40356C4C715");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, "ABI");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, "1FC8EFFC-3459-4C83-AC01-BA5D2E1091E7");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, "CAB");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, "E71FC123-2E2C-4A1B-ADC0-583599438E47");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, "CIN");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, "EB5D6069-3BC5-4E33-AD01-B76E7ED6566A");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, "C.B. Paese");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, "171F825D-CAD7-42CD-BF73-713DC22625FD");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, "CIN EU");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, "5414BA6B-B317-4B53-A7EF-2E6704801066");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, "Nr. Quietanza");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, "F35C214D-944D-4B0E-8DCE-E0C8AA34D03D");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, "Prevalente");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, "Descrivi il contenuto del campo");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, "BEC3C105-DEF4-4F0B-B979-09EBFDC6E974");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, "Tipo Quietanza");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, "AC049489-5218-41BA-9885-3735AA724C00");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, "BIC");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, "79B6174D-ADF7-457B-9B8E-A15C40DC8D27");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, "Conto Dedicato");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, MyGlb.VIS_CHECKSTYLE);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, "4BE0197E-3066-4CA8-A5C8-D733F047D4B8");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, "Banca");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, "D56CB591-8908-4515-9828-B390EED23087");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, "Intestatari");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, "2A27647F-3DF8-432F-92D9-429A82C8CE11");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, "INTESTATARIO 2");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, "2058E5EF-7B07-41D1-BC35-252DA3B052D9");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, "INTESTATARIO 3");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, "653E4FC0-7DF4-4D50-A09D-DEA2C6906AE1");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, "TIPO QUIETANZA");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, MyGlb.VIS_NORMALFIELDS);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, "B1005CA4-A059-4D1E-B10F-7D6D281B1263");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, "Scadenza");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, "7E412701-EE01-4669-8B3B-BFD6C70765EF");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, "Iban Id.Nazionale");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, "B8E3F3DD-BB51-482B-823D-EE8C2ED85C40");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, "Iban Conto");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, "68412680-1EC0-469F-9CB2-2776287A6FED");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, "Iban Extra Cee");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, "09C1480A-79C3-4C40-9642-28D0C56E6131");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, "Quietanzante");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, "667077B2-1FE6-45AD-B3DC-E00EBE3A34FE");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, "Spese");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, "");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, MyGlb.VIS_VISULOOUPCF4);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOQUIETANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, "90AE512C-00A2-48F7-AB06-C07AB80A30F7");
    PAN_INFOQUIETANZ.set_Header(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, "Beneficiario Expression");
    PAN_INFOQUIETANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, "To String (BEN CODICE) + \" - \" + BEN RAGIONE SOCIALE ESTESA");
    PAN_INFOQUIETANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, MyGlb.VIS_NORMFIELPADR);
    PAN_INFOQUIETANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_INFOQUIETANZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, MyGlb.PANEL_LIST, 464, 8, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, MyGlb.PANEL_FORM, 8, 8, 632, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SOGGETTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_SOGGETTLABEL, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_SOGGETTLABEL, -1, "", "SOGGETTLABEL", 0, 0, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, MyGlb.PANEL_LIST, 428, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, MyGlb.PANEL_FORM, 404, 176, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_CODICE, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_CODICE, PPQRY_QTN3, "A.CODICE", "CODICE", 2, 15, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, MyGlb.PANEL_LIST, 100);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, MyGlb.PANEL_LIST, "RAGIONE SOCIALE");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 372, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, MyGlb.PANEL_FORM, 100);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_RAGIONSOCIAL, MyGlb.PANEL_FORM, "RAG. SOCIALE");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_RAGIONSOCIAL, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_RAGIONSOCIAL, PPQRY_QTN3, "C.RAGIONE_SOCIALE_ESTESA", "REBERASOESES", 5, 60, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, MyGlb.PANEL_LIST, 568, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, MyGlb.PANEL_LIST, 104);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, MyGlb.PANEL_LIST, "Conto Corrente");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, MyGlb.PANEL_FORM, 20, 128, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, MyGlb.PANEL_FORM, 96);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTOCORRENT, MyGlb.PANEL_FORM, "Conto Corrente");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_CONTOCORRENT, -1, GRP_INFOQUIETANZ_IBAN);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_CONTOCORRENT, PPQRY_QTN3, "A.CONTO_CORRENTE", "CONTO_CORRENTE", 5, 12, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, MyGlb.PANEL_LIST, 880, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, MyGlb.PANEL_LIST, 68);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, MyGlb.PANEL_LIST, "ABI");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, MyGlb.PANEL_FORM, 424, 104, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, MyGlb.PANEL_FORM, 36);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_ABI, MyGlb.PANEL_FORM, "ABI");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_ABI, -1, GRP_INFOQUIETANZ_IBAN);
    PAN_INFOQUIETANZ.SetFieldUnbound(PFL_INFOQUIETANZ_ABI, true);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_ABI, PPQRY_QTN3, "LPAD(TO_CHAR ( A.COD_BANCA ), 5, SUBSTR('0', 1, 1))", "COD_BANCA", 5, 99, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, MyGlb.PANEL_LIST, 948, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, MyGlb.PANEL_LIST, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, MyGlb.PANEL_LIST, "CAB");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, MyGlb.PANEL_FORM, 544, 104, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, MyGlb.PANEL_FORM, 36);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CAB, MyGlb.PANEL_FORM, "CAB");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_CAB, -1, GRP_INFOQUIETANZ_IBAN);
    PAN_INFOQUIETANZ.SetFieldUnbound(PFL_INFOQUIETANZ_CAB, true);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_CAB, PPQRY_QTN3, "LPAD(TO_CHAR ( A.COD_SPORTELLO ), 5, SUBSTR('0', 1, 1))", "COD_SPORTELLO", 5, 99, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, MyGlb.PANEL_LIST, 2072, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, MyGlb.PANEL_LIST, 84);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, MyGlb.PANEL_LIST, "CIN");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, MyGlb.PANEL_FORM, 316, 104, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, MyGlb.PANEL_FORM, 36);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CIN, MyGlb.PANEL_FORM, "CIN");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_CIN, -1, GRP_INFOQUIETANZ_IBAN);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_CIN, PPQRY_QTN3, "A.CIN_BANCARIO", "CIN_BANCARIO", 5, 1, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, MyGlb.PANEL_LIST, 2156, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, MyGlb.PANEL_LIST, 68);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, MyGlb.PANEL_LIST, "C.B. Paese");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, MyGlb.PANEL_FORM, 32, 104, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, MyGlb.PANEL_FORM, 84);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CBPAESE, MyGlb.PANEL_FORM, "C.B. Paese");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_CBPAESE, -1, GRP_INFOQUIETANZ_IBAN);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_CBPAESE, PPQRY_QTN3, "A.IBAN_PAESE", "IBAN_PAESE", 5, 2, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, MyGlb.PANEL_LIST, 2224, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, MyGlb.PANEL_LIST, 100);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, MyGlb.PANEL_LIST, "CIN EU");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, MyGlb.PANEL_FORM, 180, 104, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, MyGlb.PANEL_FORM, 60);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CINEU, MyGlb.PANEL_FORM, "CIN EU");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_CINEU, -1, GRP_INFOQUIETANZ_IBAN);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_CINEU, PPQRY_QTN3, "A.IBAN_CIN_EUROPA", "IBAN_CIN_EUROPA", 5, 2, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, MyGlb.PANEL_LIST, 476, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, MyGlb.PANEL_LIST, "Nr. Quietanza");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, MyGlb.PANEL_FORM, 28, 32, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, MyGlb.PANEL_FORM, 88);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_NRQUIETANZA, MyGlb.PANEL_FORM, "Nr. Quietanza");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_NRQUIETANZA, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_NRQUIETANZA, PPQRY_QTN3, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, MyGlb.PANEL_LIST, 76);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, MyGlb.PANEL_LIST, "Prevalente");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, MyGlb.PANEL_FORM, 540, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, MyGlb.PANEL_FORM, 76);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_PREVALENTE, MyGlb.PANEL_FORM, "Prevalente");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_PREVALENTE, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_PREVALENTE, PPQRY_QTN3, "A.PREVALENTE", "RECORQTNPREV", 5, 2, 0, -13997);
    PAN_INFOQUIETANZ.SetValueListItem(PFL_INFOQUIETANZ_PREVALENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_INFOQUIETANZ.SetValueListItem(PFL_INFOQUIETANZ_PREVALENTE, (new IDVariant()), "Null", "", "", -1);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, MyGlb.PANEL_LIST, 1760, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, MyGlb.PANEL_LIST, 76);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, MyGlb.PANEL_LIST, "Tipo Quietanza");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, MyGlb.PANEL_FORM, 20, 56, 620, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, MyGlb.PANEL_FORM, 96);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETANZ, MyGlb.PANEL_FORM, "Tipo Quietanza");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_TIPOQUIETANZ, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_TIPOQUIETANZ, PPQRY_QTN3, "B.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, MyGlb.PANEL_LIST, 2712, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, MyGlb.PANEL_LIST, 28);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, MyGlb.PANEL_LIST, "BIC");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, MyGlb.PANEL_FORM, 76, 156, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, MyGlb.PANEL_FORM, 40);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BIC, MyGlb.PANEL_FORM, "BIC");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_BIC, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_BIC, PPQRY_QTN3, "A.BIC", "BIC", 5, 11, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, MyGlb.PANEL_LIST, 108);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, MyGlb.PANEL_LIST, "Conto Dedicato");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, MyGlb.PANEL_FORM, 508, 156, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, MyGlb.PANEL_FORM, 108);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_CONTODEDICAT, MyGlb.PANEL_FORM, "Conto Dedicato");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_CONTODEDICAT, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_CONTODEDICAT, PPQRY_QTN3, "A.CONTO_DEDICATO", "RECQTNCONDED", 5, 2, 0, -13997);
    PAN_INFOQUIETANZ.SetValueListItem(PFL_INFOQUIETANZ_CONTODEDICAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_INFOQUIETANZ.SetValueListItem(PFL_INFOQUIETANZ_CONTODEDICAT, (new IDVariant()), "Null", "", "", -1);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, MyGlb.PANEL_LIST, 672, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, MyGlb.PANEL_LIST, 64);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, MyGlb.PANEL_LIST, "Banca");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, MyGlb.PANEL_FORM, 64, 180, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, MyGlb.PANEL_FORM, 52);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BANCA, MyGlb.PANEL_FORM, "Banca");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_BANCA, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_BANCA, PPQRY_QTN3, "A.DES_BANCA", "DES_BANCA", 5, 40, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, MyGlb.PANEL_LIST, 1040, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, MyGlb.PANEL_LIST, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, MyGlb.PANEL_LIST, "Intestatari");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, MyGlb.PANEL_FORM, 24, 204, 616, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, MyGlb.PANEL_FORM, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI, MyGlb.PANEL_FORM, "Intestatari");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_INTESTATARI, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_INTESTATARI, PPQRY_QTN3, "A.INTESTATARIO_1", "INTESTATARIO_1", 5, 40, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, MyGlb.PANEL_LIST, 1248, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, MyGlb.PANEL_LIST, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, MyGlb.PANEL_LIST, "INTESTATARIO 2");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, MyGlb.PANEL_FORM, 120, 228, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, MyGlb.PANEL_FORM, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI2, MyGlb.PANEL_FORM, "INTEST. 2");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_INTESTATARI2, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_INTESTATARI2, PPQRY_QTN3, "A.INTESTATARIO_2", "INTESTATARIO_2", 5, 40, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, MyGlb.PANEL_LIST, 1456, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, MyGlb.PANEL_LIST, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, MyGlb.PANEL_LIST, "INTESTATARIO 3");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, MyGlb.PANEL_FORM, 120, 252, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, MyGlb.PANEL_FORM, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_INTESTATARI3, MyGlb.PANEL_FORM, "INTEST. 3");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_INTESTATARI3, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_INTESTATARI3, PPQRY_QTN3, "A.INTESTATARIO_3", "INTESTATARIO_3", 5, 40, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, MyGlb.PANEL_LIST, 1664, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, MyGlb.PANEL_LIST, 96);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, MyGlb.PANEL_LIST, "TIPO QUIETANZA");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, MyGlb.PANEL_FORM, 4, 460, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, MyGlb.PANEL_FORM, 96);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_TIPOQUIETAN1, MyGlb.PANEL_FORM, "TP. QUIETANZA");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_TIPOQUIETAN1, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_TIPOQUIETAN1, PPQRY_QTN3, "A.TIPO_QUIETANZA", "TIPO_QUIETANZA", 1, 2, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, MyGlb.PANEL_LIST, 1968, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, MyGlb.PANEL_FORM, 48, 300, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, MyGlb.PANEL_FORM, 68);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_SCADENZA, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_SCADENZA, PPQRY_QTN3, "A.SCADENZA", "SCADENZA", 6, 10, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, MyGlb.PANEL_LIST, 2324, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, MyGlb.PANEL_LIST, 108);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, MyGlb.PANEL_LIST, "Iban Id.Nazionale");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, MyGlb.PANEL_FORM, 8, 276, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, MyGlb.PANEL_FORM, 108);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANIDNAZION, MyGlb.PANEL_FORM, "Iban Id.Nazionale");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_IBANIDNAZION, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_IBANIDNAZION, PPQRY_QTN3, "A.IBAN_ID_NAZIONALE", "IBAN_ID_NAZIONALE", 5, 10, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, MyGlb.PANEL_LIST, 2432, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, MyGlb.PANEL_LIST, 72);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, MyGlb.PANEL_LIST, "Iban Conto");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, MyGlb.PANEL_FORM, 184, 276, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, MyGlb.PANEL_FORM, 72);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANCONTO, MyGlb.PANEL_FORM, "Iban Conto");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_IBANCONTO, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_IBANCONTO, PPQRY_QTN3, "A.IBAN_CONTO", "IBAN_CONTO", 5, 18, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, MyGlb.PANEL_LIST, 2532, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, MyGlb.PANEL_LIST, 84);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, MyGlb.PANEL_LIST, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, MyGlb.PANEL_LIST, "Iban Extra Cee");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, MyGlb.PANEL_FORM, 364, 276, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, MyGlb.PANEL_FORM, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_IBANEXTRACEE, MyGlb.PANEL_FORM, "Iban Extra Cee");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_IBANEXTRACEE, -1, -1);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_IBANEXTRACEE, PPQRY_QTN3, "A.IBAN_EXTRA_UE", "IBAN_EXTRA_UE", 5, 34, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, MyGlb.PANEL_LIST, 144);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, MyGlb.PANEL_LIST, 2);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, MyGlb.PANEL_LIST, "Quietanzante");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, MyGlb.PANEL_FORM, 28, 324, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, MyGlb.PANEL_FORM, 88);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_QUIETANZANTE, MyGlb.PANEL_FORM, "Quietanzante");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_QUIETANZANTE, -1, -1);
    PAN_INFOQUIETANZ.SetFieldUnbound(PFL_INFOQUIETANZ_QUIETANZANTE, true);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_QUIETANZANTE, PPQRY_QTN3, "CASE WHEN (D.CODICE IS NULL) THEN '' ELSE TO_CHAR ( D.CODICE ) || ' - ' || D.RAGIONE_SOCIALE_ESTESA END", "RECORDQUIETA", 5, 99, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, MyGlb.PANEL_LIST, 92);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, MyGlb.PANEL_LIST, 2);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, MyGlb.PANEL_FORM, 12, 348, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, MyGlb.PANEL_FORM, 104);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_SPESE, -1, -1);
    PAN_INFOQUIETANZ.SetFieldUnbound(PFL_INFOQUIETANZ_SPESE, true);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_SPESE, PPQRY_QTN3, "DECODE(A.SPESE, 1, ~~TBL_COSTANTI.ROWNAMNEWFIE~~, DECODE(A.SPESE, 2, ~~TBL_COSTANTI.ROWNAMNEWFI1~~, DECODE(A.SPESE, 3, ~~TBL_COSTANTI.ROWNAMNEWFI2~~, NULL)))", "RECORDSPESE", 5, 99, 0, -13997);
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, MyGlb.PANEL_LIST, 120);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, MyGlb.PANEL_LIST, 2);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, MyGlb.PANEL_LIST, "Beneficiario Expression");
    PAN_INFOQUIETANZ.SetRect(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, MyGlb.PANEL_FORM, 4, 372, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOQUIETANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, MyGlb.PANEL_FORM, 120);
    PAN_INFOQUIETANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, MyGlb.PANEL_FORM, 2);
    PAN_INFOQUIETANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOQUIETANZ_BENEFIEXPRES, MyGlb.PANEL_FORM, "Beneficiario Expression");
    PAN_INFOQUIETANZ.SetFieldPage(PFL_INFOQUIETANZ_BENEFIEXPRES, -1, -1);
    PAN_INFOQUIETANZ.SetFieldUnbound(PFL_INFOQUIETANZ_BENEFIEXPRES, true);
    PAN_INFOQUIETANZ.SetFieldPanel(PFL_INFOQUIETANZ_BENEFIEXPRES, PPQRY_QTN3, "TO_CHAR ( C.CODICE ) || ' - ' || C.RAGIONE_SOCIALE_ESTESA", "RECOBENEEXPR", 5, 162, 0, -13997);
  }

  private void PAN_INFOQUIETANZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_INFOQUIETANZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_INFOQUIETANZ.SetIMDB(IMDB, "PQRY_QTN3", true);
    PAN_INFOQUIETANZ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  A.CONTO_CORRENTE as CONTO_CORRENTE, ");
    SQL.append("  A.DES_BANCA as DES_BANCA, ");
    SQL.append("  LPAD(TO_CHAR ( A.COD_BANCA ), 5, SUBSTR('0', 1, 1)) as COD_BANCA, ");
    SQL.append("  LPAD(TO_CHAR ( A.COD_SPORTELLO ), 5, SUBSTR('0', 1, 1)) as COD_SPORTELLO, ");
    SQL.append("  A.INTESTATARIO_1 as INTESTATARIO_1, ");
    SQL.append("  A.INTESTATARIO_2 as INTESTATARIO_2, ");
    SQL.append("  A.INTESTATARIO_3 as INTESTATARIO_3, ");
    SQL.append("  A.TIPO_QUIETANZA as TIPO_QUIETANZA, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.CIN_BANCARIO as CIN_BANCARIO, ");
    SQL.append("  A.IBAN_PAESE as IBAN_PAESE, ");
    SQL.append("  A.IBAN_CIN_EUROPA as IBAN_CIN_EUROPA, ");
    SQL.append("  CASE WHEN (D.CODICE IS NULL) THEN '' ELSE TO_CHAR ( D.CODICE ) || ' - ' || D.RAGIONE_SOCIALE_ESTESA END as RECORDQUIETA, ");
    SQL.append("  TO_CHAR ( C.CODICE ) || ' - ' || C.RAGIONE_SOCIALE_ESTESA as RECOBENEEXPR, ");
    SQL.append("  A.IBAN_ID_NAZIONALE as IBAN_ID_NAZIONALE, ");
    SQL.append("  A.IBAN_CONTO as IBAN_CONTO, ");
    SQL.append("  A.IBAN_EXTRA_UE as IBAN_EXTRA_UE, ");
    SQL.append("  A.BIC as BIC, ");
    SQL.append("  DECODE(A.SPESE, 1, ~~TBL_COSTANTI.ROWNAMNEWFIE~~, DECODE(A.SPESE, 2, ~~TBL_COSTANTI.ROWNAMNEWFI1~~, DECODE(A.SPESE, 3, ~~TBL_COSTANTI.ROWNAMNEWFI2~~, NULL))) as RECORDSPESE, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
    SQL.append("  A.CONTO_DEDICATO as RECQTNCONDED, ");
    SQL.append("  A.PREVALENTE as RECORQTNPREV ");
    PAN_INFOQUIETANZ.SetQuery(PPQRY_QTN3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B, ");
    SQL.append("  BEN C, ");
    SQL.append("  BEN D ");
    PAN_INFOQUIETANZ.SetQuery(PPQRY_QTN3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.CODICE = A.CODICE) ");
    SQL.append("and   (A.TIPO_QUIETANZA = B.CODICE(+)) ");
    SQL.append("and   (A.CODICE = ~~TBL_PARAMETRI237.BENEFICIARIO~~) ");
    SQL.append("and   (D.CODICE(+) = A.QUIETANZANTE) ");
    SQL.append("and   (A.NUM_QUIETANZA = ~~TBL_PARAMETRI237.NUM_QUIETANZA~~) ");
    PAN_INFOQUIETANZ.SetQuery(PPQRY_QTN3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOQUIETANZ.SetQuery(PPQRY_QTN3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOQUIETANZ.SetQuery(PPQRY_QTN3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOQUIETANZ.SetQuery(PPQRY_QTN3, 5, SQL, -1, "");
    PAN_INFOQUIETANZ.SetQueryDB(PPQRY_QTN3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INFOQUIETANZ.SetMasterTable(0, "QTN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INFOQUIETANZ.Status() == 2)
    {
      int oldListQBE = PAN_INFOQUIETANZ.iUseListQBE;
      PAN_INFOQUIETANZ.iUseListQBE = 0;
      PAN_INFOQUIETANZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_INFOQUIETANZ.PanelCommand(Glb.PCM_FIND);
      PAN_INFOQUIETANZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_INFOQUIETANZ) PAN_INFOQUIETANZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFOQUIETANZ) PAN_INFOQUIETANZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INFOQUIETANZ) PAN_INFOQUIETANZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFOQUIETANZ) PAN_INFOQUIETANZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_INFOQUIETANZ) PAN_INFOQUIETANZ_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_INFOQUIETANZ) PAN_INFOQUIETANZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
