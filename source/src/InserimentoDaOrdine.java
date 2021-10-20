// **********************************************
// Inserimento Da Ordine
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InserimentoDaOrdine extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DETTAGORDINE_ORDINE = 0;

  private static int PFL_DETTAGORDINE_NUMEROBUONO = 0;
  private static int PFL_DETTAGORDINE_ANNOBUONO = 1;
  private static int PFL_DETTAGORDINE_INFOORDINE = 2;
  private static int PFL_DETTAGORDINE_DATAEMBUONO = 3;
  private static int PFL_DETTAGORDINE_PROGRESSIVO = 4;
  private static int PFL_DETTAGORDINE_DESCRIZIONE = 5;
  private static int PFL_DETTAGORDINE_IMPORTO = 6;
  private static int PFL_DETTAGORDINE_LIQUIDABILE = 7;
  private static int PFL_DETTAGORDINE_GRUPPO = 8;
  private static int PFL_DETTAGORDINE_SELEZIONATO = 9;
  private static int PFL_DETTAGORDINE_CENTRO = 10;
  private static int PFL_DETTAGORDINE_FATTORE = 11;
  private static int PFL_DETTAGORDINE_COMPETENZDAL = 12;
  private static int PFL_DETTAGORDINE_COMPETENZAAL = 13;

  private static int PPQRY_DETTAGLBUON1 = 0;


  IDPanel PAN_DETTAGORDINE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRI1(IMDB);
    //
    //
    Init_PQRY_DETTAGLBUON1(IMDB);
    Init_QRY_CFASELINTV77(IMDB);
    Init_QRY_CFASELINTV74(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_FILTRI1, 16);
    IMDB.set_TblCode(IMDBDef2.TBL_FILTRI1, "TBL_FILTRI1");
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMCODBEN, "ROWNAMCODBEN");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMCODBEN,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMEOLDAC, "ROWNAMEOLDAC");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMEOLDAC,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMCONCON, "ROWNAMCONCON");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMCONCON,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMEACTIV, "ROWNAMEACTIV");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMEACTIV,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMECONTA, "ROWNAMECONTA");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMECONTA,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMACTROW, "ROWNAMACTROW");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMACTROW,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMACROOL, "ROWNAMACROOL");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMACROOL,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMEERROR, "ROWNAMEERROR");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMEERROR,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMIMPFAT, "ROWNAMIMPFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMIMPFAT,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMFIUNOR, "ROWNAMFIUNOR");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMFIUNOR,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMNUOFAT, "ROWNAMNUOFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMNUOFAT,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMDATFAT, "ROWNAMDATFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMDATFAT,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMRESFAT, "ROWNAMRESFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI1,IMDBDef2.FLD_FILTRI1_ROWNAMRESFAT,3,14,2);
    IMDB.TblAddNew(IMDBDef2.TBL_FILTRI1, 0);
  }

  private static void Init_PQRY_DETTAGLBUON1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_DETTAGLBUON1, 14);
    IMDB.set_TblCode(IMDBDef10.PQRY_DETTAGLBUON1, "PQRY_DETTAGLBUON1");
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_ANNO_BUONO, "ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_NUMERO_BUONO, "NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_NUMERO_BUONO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETBUODAEMBU, "DETBUODAEMBU");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETBUODAEMBU,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETBUOINFORD, "DETBUOINFORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETBUOINFORD,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_PROGRESSIVO_BUONO, "PROGRESSIVO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_PROGRESSIVO_BUONO,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DESCRIZIONE,5,2000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETTBUONIMPO, "DETTBUONIMPO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETTBUONIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETTBUONLIQU, "DETTBUONLIQU");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETTBUONLIQU,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_GRUPPO, "GRUPPO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_GRUPPO,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETTBUONSELE, "DETTBUONSELE");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_DETTBUONSELE,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBUON1,IMDBDef10.PQSL_DETTAGLBUON1_COMPETENZA_AL,6,19,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_DETTAGLBUON1, 0);
  }

  private static void Init_QRY_CFASELINTV77(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_CFASELINTV77, 1);
    IMDB.set_TblCode(IMDBDef10.QRY_CFASELINTV77, "QRY_CFASELINTV77");
    IMDB.set_FldCode(IMDBDef10.QRY_CFASELINTV77,IMDBDef10.QSL_CFASELINTV77_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef10.QRY_CFASELINTV77,IMDBDef10.QSL_CFASELINTV77_COUNT,1,19,0);
  }

  private static void Init_QRY_CFASELINTV74(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_CFASELINTV74, 1);
    IMDB.set_TblCode(IMDBDef10.QRY_CFASELINTV74, "QRY_CFASELINTV74");
    IMDB.set_FldCode(IMDBDef10.QRY_CFASELINTV74,IMDBDef10.QSL_CFASELINTV74_SUNUVAFABII0, "SUNUVAFABII0");
    IMDB.SetFldParams(IMDBDef10.QRY_CFASELINTV74,IMDBDef10.QSL_CFASELINTV74_SUNUVAFABII0,3,28,6);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InserimentoDaOrdine(MyWebEntryPoint w, IMDBObj imdb)
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
  public InserimentoDaOrdine()
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
    FormIdx = MyGlb.FRM_INSERDAORDIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1F4AABAB-14C2-4026-9D46-1CC7F3D3759D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 812;
    DesignHeight = 454;
    set_Caption(new IDVariant("Inserimento Da Ordine"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 812;
    Frames[1].Height = 428;
    Frames[1].Caption = "Dettagli Ordine";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 428;
    PAN_DETTAGORDINE = new IDPanel(w, this, 1, "PAN_DETTAGORDINE");
    Frames[1].Content = PAN_DETTAGORDINE;
    PAN_DETTAGORDINE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGORDINE.VS = MainFrm.VisualStyleList;
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 812-MyGlb.PAN_OFFS_X, 428-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0E5D5BAF-07A5-4D32-B8DA-5BE8B635B2F1");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 12, 772, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGORDINE.InitStatus = 2;
    PAN_DETTAGORDINE_Init();
    PAN_DETTAGORDINE_InitFields();
    PAN_DETTAGORDINE_InitQueries();
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
      PAN_DETTAGORDINE.UpdatePanel(MainFrm);
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
    return (obj instanceof InserimentoDaOrdine);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InserimentoDaOrdine.class.getName() : (Glb.ClassWithPackage(InserimentoDaOrdine.class) ? InserimentoDaOrdine.class.getName().substring(InserimentoDaOrdine.class.getPackage().getName().length() + 1) : InserimentoDaOrdine.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Ordini ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_DETTAGORDINE.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DETTAGORDINE.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DETTAGORDINE.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      IMDB.set_Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMEOLDAC, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMCONCON, 0, (new IDVariant(0)));
      PAN_DETTAGORDINE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DETTAGORDINE.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
      // 
      // Se lanciamo il controllo fatture dal menu di Cfa filtriamo
      // per l'UO della fattura se presente
      // 
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMFIUNOR, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true) && IDL.NullValue(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMNUOFAT, 0),(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0)
      {
        IDVariant v_VFATPROGRUO = null;
        v_VFATPROGRUO = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as FATPROUNIORG ");
        SQL.append("from ");
        SQL.append("  FAT A ");
        SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ANNO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_NUMERO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VFATPROGRUO = QV.Get("FATPROUNIORG", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_VFATPROGRUO)))
        {
          IMDB.set_Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMFIUNOR, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMUNIORG, 0, new IDVariant(v_VFATPROGRUO));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaOrdine", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RIGASELEZION = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SOMMAIMPORTO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_MESSANONBLOC = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C3;
    IDCachedRowSet C26;

    try
    {
      TransCount = 0;
      v_RIGASELEZION = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Unload Event Body
      // Procedure Body
      // 
      IDVariant v_DIFFERDISPON = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_MEXRILIVA = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_FATSENREGIVA = null;
      v_FATSENREGIVA = (new IDVariant(MainFrm.FatturaSenzaRegistriIVA(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ANNO_PROG, 0), IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_NUMERO_PROG, 0))));
      IDVariant v_MESNONBLOIVA = null;
      v_MESNONBLOIVA = (new IDVariant());
      IDVariant v_MESNONBLODAT = null;
      v_MESNONBLODAT = (new IDVariant());
      v_MESSANONBLOC = (new IDVariant());
      IDVariant v_ANNOBUONPREC = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NUMEBUONPREC = new IDVariant(0,IDVariant.INTEGER);
      if (Confirm.booleanValue())
      {
        IDVariant v_SOMMA = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_SOMMAIMPUTAT = new IDVariant(0,IDVariant.DECIMAL);
        C3 = PAN_DETTAGORDINE.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_DETTAGORDINE.GotoFirst();
        while (!PAN_DETTAGORDINE.RSEOF())
        {
          if (PAN_DETTAGORDINE.IsRowSelected(v_RIGASELEZION.intValue()))
          {
            if (MainFrm.CONTRORILIVA.equals((new IDVariant("SI")), true))
            {
              if (v_ANNOBUONPREC.compareTo(C3.Get("ANNO_BUONO"), true)!=0 && v_NUMEBUONPREC.compareTo(C3.Get("NUMERO_BUONO"), true)!=0)
              {
                v_MEXRILIVA = (new IDVariant(0));
              }
              if (!(v_MEXRILIVA.booleanValue()) && v_FATSENREGIVA.booleanValue())
              {
                v_MEXRILIVA = (new IDVariant(MainFrm.ControlloCapOrdineRilIVA(C3.Get("ANNO_BUONO"), C3.Get("NUMERO_BUONO"), C3.Get("PROGRESSIVO_BUONO"))));
                if (v_MEXRILIVA.booleanValue())
                {
                  IDVariant v_AVVISOIVA1 = new IDVariant(0,IDVariant.STRING);
                  v_AVVISOIVA1 = (new IDVariant("Attenzione. L'ordine "));
                  IDVariant v_AVVISOIVA2 = new IDVariant(0,IDVariant.STRING);
                  v_AVVISOIVA2 = (new IDVariant(" è imputato a Capitoli rilevanti a fini IVA"));
                  v_MESNONBLOIVA = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_AVVISOIVA1, IDL.ToString(C3.Get("NUMERO_BUONO"))), (new IDVariant("/"))), IDL.ToString(C3.Get("ANNO_BUONO"))), v_AVVISOIVA2);
                }
              }
            }
            if (C3.Get("DETBUODAEMBU").compareTo(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMDATFAT, 0), true)>0)
            {
              IDVariant v_AVVISO1DATA = new IDVariant(0,IDVariant.STRING);
              v_AVVISO1DATA = (new IDVariant("Attenzione: Ordine "));
              IDVariant v_AVVISO2DATA = new IDVariant(0,IDVariant.STRING);
              v_AVVISO2DATA = (new IDVariant(" con data di emissione successiva a quella della fattura"));
              if (MainFrm.CONDATBUOFAT.equals((new IDVariant("B")), true))
              {
                PAN_DETTAGORDINE.SetRowSelected((new IDVariant(0)).booleanValue(), v_RIGASELEZION.intValue()); 
                MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_AVVISO1DATA, IDL.ToString(C3.Get("NUMERO_BUONO"))), (new IDVariant("/"))), IDL.ToString(C3.Get("ANNO_BUONO"))), v_AVVISO2DATA)); 
                Cancel.set((new IDVariant(-1)));
                UNLOADEVENT_DETTBUONDELE();
                return;
              }
              else
              {
                if (v_ANNOBUONPREC.compareTo(C3.Get("ANNO_BUONO"), true)!=0 && v_NUMEBUONPREC.compareTo(C3.Get("NUMERO_BUONO"), true)!=0)
                {
                  v_MESNONBLODAT = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESNONBLODAT, v_AVVISO1DATA), IDL.ToString(C3.Get("NUMERO_BUONO"))), (new IDVariant("/"))), IDL.ToString(C3.Get("ANNO_BUONO"))), v_AVVISO2DATA), (new IDVariant("<BR/>")));
                }
              }
            }
            if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMCODAPR, 0)))
            {
              IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMCODAPR, 0, ProponiContropartita(C3.Get("ANNO_BUONO"), C3.Get("NUMERO_BUONO"), C3.Get("PROGRESSIVO_BUONO")));
            }
            C3.Set("DETTBUONSELE", (new IDVariant(-1)));
            v_SOMMA = IDL.Add(v_SOMMA, C3.Get("DETTBUONLIQU"));
            v_SOMMAIMPORTO = IDL.Add(v_SOMMAIMPORTO, C3.Get("DETTBUONIMPO"));
            if (C3.Get("DETTBUONLIQU").compareTo(C3.Get("DETTBUONIMPO"), true)>0)
            {
              IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
              v_MESSAGGIO = (new IDVariant("In dettagli ci sono righe selezionate con liquidabile maggiore di importo!", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MESSAGGIO); 
              Cancel.set((new IDVariant(-1)));
              return;
            }
            IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
            UNLOADEVENT_CFASELINTV77(C3.Get("ANNO_BUONO"), C3.Get("NUMERO_BUONO"), C3.Get("PROGRESSIVO_BUONO"));
            if (!IMDB.Eof(IMDBDef10.QRY_CFASELINTV77, 0))
            {
              v_VCOUNT = IMDB.Value(IMDBDef10.QRY_CFASELINTV77, IMDBDef10.QSL_CFASELINTV77_COUNT, 0, IDVariant.INTEGER) ;
            }
            if (v_VCOUNT.equals((new IDVariant(0)), true))
            {
              UNLOADEVENT_DETBUOINSINT(C3.Get("ANNO_BUONO"), C3.Get("NUMERO_BUONO"), C3.Get("COMPETENZA_DAL"), C3.Get("COMPETENZA_AL"), C3.Get("FATTORE"), C3.Get("CENTRO"), C3.Get("PROGRESSIVO_BUONO"));
            }
            if (v_ANNOBUONPREC.compareTo(C3.Get("ANNO_BUONO"), true)!=0 && v_NUMEBUONPREC.compareTo(C3.Get("NUMERO_BUONO"), true)!=0)
            {
              v_ANNOBUONPREC = new IDVariant(C3.Get("ANNO_BUONO"));
              v_NUMEBUONPREC = new IDVariant(C3.Get("NUMERO_BUONO"));
            }
          }
          else
          {
            C3.Set("DETTBUONSELE", (new IDVariant(0)));
          }
          v_RIGASELEZION = IDL.Add(v_RIGASELEZION, (new IDVariant(1)));
          PAN_DETTAGORDINE.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        UNLOADEVENT_CFASELINTV74();
        if (!IMDB.Eof(IMDBDef10.QRY_CFASELINTV74, 0))
        {
          v_SOMMAIMPUTAT = IMDB.Value(IMDBDef10.QRY_CFASELINTV74, IMDBDef10.QSL_CFASELINTV74_SUNUVAFABII0, 0, IDVariant.DECIMAL) ;
        }
        v_SOMMA = IDL.Add(v_SOMMA, v_SOMMAIMPUTAT);
        v_DIFFERDISPON = IDL.Sub(v_SOMMA, (IDL.Add(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMIMPFAT, 0), MainFrm.ImportoGiàLiquidato(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ANNO_PROG, 0), IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_NUMERO_PROG, 0)))));
        if (v_DIFFERDISPON.compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Il totale Liquidabile è inferiore rispetto all'importo della fattura!", IDVariant.STRING));
          v_MESSANONBLOC = IDL.Add(v_SMS, (new IDVariant("<BR/>")));
        }
        else
        {
          if (v_DIFFERDISPON.compareTo(IDL.NullValue(MainFrm.TOLLERANZA_CONTROLLO,(new IDVariant(0))), true)>0)
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Il totale liquidabile supera di Euro ", IDVariant.STRING));
            IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO1 = (new IDVariant(" l'importo della fattura!", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MESSAGGIO, IDL.Format(IDL.NullValue(v_DIFFERDISPON,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)), v_MESSAGGIO1)); 
            Cancel.set((new IDVariant(-1)));
            UNLOADEVENT_DETTBUONDEL1();
            return;
          }
          else
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Il totale liquidabile supera di Euro ", IDVariant.STRING));
            IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO1 = (new IDVariant(" l'importo della fattura. Il Liquidabile viene aggiornato per quadrare con la fattura.", IDVariant.STRING));
            IDVariant v_DIFFERENZA = new IDVariant(0,IDVariant.DECIMAL);
            v_DIFFERENZA = new IDVariant(v_DIFFERDISPON);
            if (v_DIFFERENZA.compareTo((new IDVariant(0)), true)>0)
            {
              v_MESSANONBLOC = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSANONBLOC, v_MESSAGGIO), IDL.Format(IDL.NullValue(v_DIFFERENZA,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)), v_MESSAGGIO1), (new IDVariant("<BR/>")));
              PAN_DETTAGORDINE.ResetSortList();
              PAN_DETTAGORDINE.AddToSortList((new IDVariant(PFL_DETTAGORDINE_LIQUIDABILE)).intValue(), (new IDVariant(0)).booleanValue()); 
              PAN_DETTAGORDINE.EnableSorting();
              C26 = PAN_DETTAGORDINE.MasterRS();
              if (C26.size()>0) CurPos = C26.getRow(); else CurPos = 0;
              if (!C26.Bof()) PAN_DETTAGORDINE.GotoFirst();
              while (!PAN_DETTAGORDINE.RSEOF())
              {
                if (C26.Get("DETTBUONSELE").equals((new IDVariant(-1)), true))
                {
                  if (v_DIFFERENZA.compareTo(C26.Get("DETTBUONLIQU"), true)>0)
                  {
                    v_DIFFERENZA = IDL.Sub(v_DIFFERENZA, C26.Get("DETTBUONLIQU"));
                    C26.Set("DETTBUONLIQU", (new IDVariant(0, IDVariant.DECIMAL)));
                  }
                  else
                  {
                    C26.Set("DETTBUONLIQU", IDL.Sub(C26.Get("DETTBUONLIQU"), v_DIFFERENZA));
                    break;
                  }
                }
                PAN_DETTAGORDINE.GotoNext();
              }
              if (CurPos>0) C26.absolute(CurPos);
              PAN_DETTAGORDINE.ResetSortList();
              PAN_DETTAGORDINE.AddToSortList((new IDVariant(PFL_DETTAGORDINE_GRUPPO)).intValue(), (new IDVariant(-1)).booleanValue()); 
              PAN_DETTAGORDINE.AddToSortList((new IDVariant(PFL_DETTAGORDINE_PROGRESSIVO)).intValue(), (new IDVariant(-1)).booleanValue()); 
              PAN_DETTAGORDINE.EnableSorting();
            }
          }
        }
        if (!(IDL.IsNull(v_MESNONBLODAT)))
        {
          v_MESSANONBLOC = IDL.Add(IDL.Add(v_MESSANONBLOC, v_MESNONBLODAT), (new IDVariant("<BR/>")));
        }
        if (!(IDL.IsNull(v_MESNONBLOIVA)))
        {
          v_MESSANONBLOC = IDL.Add(IDL.Add(v_MESSANONBLOC, v_MESNONBLOIVA), (new IDVariant("<BR/>")));
        }
        if (!(IDL.IsNull(v_MESSANONBLOC)))
        {
          MainFrm.set_AlertMessage(v_MESSANONBLOC); 
        }
        InsertIntoFattureBuoni();
        if (IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMEERROR, 0).equals((new IDVariant(1)), true))
        {
          PAN_DETTAGORDINE.SetRowSelected((new IDVariant(0)).booleanValue(), v_RIGASELEZION.intValue()); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        IMDB.set_Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMLIQMOD, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMNUOFAT, 0).compareTo((new IDVariant("SI")), true)!=0)
        {
          ((ControlloFatture)MainFrm.GetForm(MyGlb.FRM_CONTROFATTUR,0,true,this)).RiempiIMDB();
        }
      }
      IMDB.set_Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMEERROR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMFIUNOR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMUNIORG, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaOrdine", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // DETTAGLI BUONI: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_DETTBUONDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_DETTAGLBUONI);
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void UNLOADEVENT_CFASELINTV77(IDVariant C3_ANNO_BUONO, IDVariant C3_NUMERO_BUONO, IDVariant C3_PROGRESSIVO_BUONO) throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_CFASELINTV77);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef2.TBL_DETTAGLBUONI, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_DETTAGLBUONI, 0))
    {
      if (IMDB.Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_ANNO_BUONO, 0).equals(C3_ANNO_BUONO, true))
      {
        if (IMDB.Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_NUMERO_BUONO, 0).equals(C3_NUMERO_BUONO, true))
        {
          if (IMDB.Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_PROGRESSIVO_BUONO, 0).equals(C3_PROGRESSIVO_BUONO, true))
          {
            IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
            IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, new IDVariant(1));
          }
        }
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_DETTAGLBUONI, 0);
      if (IMDB.Eof(IMDBDef2.TBL_DETTAGLBUONI, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_DETTAGLBUONI, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[1];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[1];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = new IDVariant(1);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef10.QRY_CFASELINTV77, 0);
              IMDB.set_Value(IMDBDef10.QRY_CFASELINTV77, 0, 0, new IDVariant(AggrBuff[0]));
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], new IDVariant(1));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_CFASELINTV77, 0);
  }

  // **********************************************************************
  // DETTAGLI BUONI: Insert into
  // Why are you inserting this record?
  // **********************************************************************
  private void UNLOADEVENT_DETBUOINSINT(IDVariant C3_ANNO_BUONO, IDVariant C3_NUMERO_BUONO, IDVariant C3_COMPETENZA_DAL, IDVariant C3_COMPETENZA_AL, IDVariant C3_FATTORE, IDVariant C3_CENTRO, IDVariant C3_PROGRESSIVO_BUONO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef2.TBL_DETTAGLBUONI, 0);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_ANNO_BUONO, 0, C3_ANNO_BUONO);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_NUMERO_BUONO, 0, C3_NUMERO_BUONO);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_COMPETENZA_DAL, 0, C3_COMPETENZA_DAL);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_COMPETENZA_AL, 0, C3_COMPETENZA_AL);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_FATTORE, 0, C3_FATTORE);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_CENTRO, 0, C3_CENTRO);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBUONI, IMDBDef2.FLD_DETTAGLBUONI_PROGRESSIVO_BUONO, 0, C3_PROGRESSIVO_BUONO);
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Which data are you selecting?
  // **********************************************************************
  private void UNLOADEVENT_CFASELINTV74() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_CFASELINTV74);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FATTBUONIMDB, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FATTBUONIMDB, 0))
    {
      if (IMDB.Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_ANNO_PROG, 0).equals(((IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ANNO_PROG, 0).equals((new IDVariant(-1))))?IMDB.Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_ANNO_PROG, 0):IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ANNO_PROG, 0)), true))
      {
        if (IMDB.Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_NUMERO_PROG, 0).equals(((IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_NUMERO_PROG, 0).equals((new IDVariant(-1))))?IMDB.Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_NUMERO_PROG, 0):IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_NUMERO_PROG, 0)), true))
        {
          IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
          IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, IDL.NullValue(IMDB.Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_IMPUTATO, 0),(new IDVariant(0))));
        }
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_FATTBUONIMDB, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FATTBUONIMDB, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FATTBUONIMDB, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[1];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[1];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef10.QRY_CFASELINTV74, 0);
              IMDB.set_Value(IMDBDef10.QRY_CFASELINTV74, 0, 0, AggrBuff[0]);
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_CFASELINTV74, 0);
  }

  // **********************************************************************
  // DETTAGLI BUONI: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_DETTBUONDEL1() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_DETTAGLBUONI);
  }

  // **********************************************************************
  // Dettagli Ordine Ordine After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTAGORDINE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Ordine Ordine After Find Event Body
      // Procedure Body
      // 
      SettaRigheDelGruppo();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaOrdine", "DettagliOrdineOrdineAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Ordine Ordine On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGORDINE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGORDINE);
      // 
      // Dettagli Ordine Ordine On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGORDINE.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGORDINE_DESCRIZIONE,(new IDVariant(PAN_DETTAGORDINE.FieldText(PFL_DETTAGORDINE_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaOrdine", "DettagliOrdineOrdineOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Ordine On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_DETTAGORDINE_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Ordine On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_DETTAGORDINE.Status()).equals((new IDVariant(1)), true))
      {
        PAN_DETTAGORDINE.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGORDINE.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaOrdine", "DettagliOrdineOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Insert Into Fatture Buoni
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InsertIntoFattureBuoni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_LIQUIDABILE = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;
    IDCachedRowSet C5;

    try
    {
      TransCount = 0;
      v_NUMERORIGA = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Insert Into Fatture Buoni Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.BeginTrans();
      try
      {
        C3 = PAN_DETTAGORDINE.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_DETTAGORDINE.GotoFirst();
        while (!PAN_DETTAGORDINE.RSEOF())
        {
          v_IMPORTO = new IDVariant(C3.Get("DETTBUONIMPO"));
          v_LIQUIDABILE = new IDVariant(C3.Get("DETTBUONLIQU"));
          if (C3.Get("DETTBUONSELE").equals((new IDVariant(-1)), true))
          {
            IDVariant v_INSERITO1 = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.ANNO_BUONO as DETIMPBUANBU, ");
            SQL.append("  A.NUMERO_BUONO as DETIMPBUNUBU, ");
            SQL.append("  A.PROGRESSIVO_BUONO as DETIMPBUPRBU, ");
            SQL.append("  NVL(A.IMPORTO, 0) + NVL(A.VARIAZIONI, 0) - NVL(A.FATTURATO, 0) as DETIMPBUOIMP, ");
            SQL.append("  A.PROGRESSIVO_IMP as DETIMPBUPRIM ");
            SQL.append("from ");
            SQL.append("  DETTAGLI_IMPEGNI_BUONI A ");
            SQL.append("where (A.ANNO_BUONO = " + IDL.CSql(C3.Get("ANNO_BUONO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_BUONO = " + IDL.CSql(C3.Get("NUMERO_BUONO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.PROGRESSIVO_BUONO = " + IDL.CSql(C3.Get("PROGRESSIVO_BUONO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((NVL(A.IMPORTO, 0) + NVL(A.VARIAZIONI, 0) - NVL(A.FATTURATO, 0)) > 0) ");
            C5 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            C5.setColUnbound(4,true);
            if (!C5.EOF()) C5.MoveNext();
            while (!C5.EOF())
            {
              IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
              if (v_LIQUIDABILE.compareTo((new IDVariant(0)), true)<=0)
              {
                v_IMPORTO = (new IDVariant(0, IDVariant.DECIMAL));
              }
              else
              {
                if (C5.Get("DETIMPBUOIMP").compareTo(v_LIQUIDABILE, true)>0)
                {
                  v_IMPORTO = new IDVariant(v_LIQUIDABILE);
                }
                else
                {
                  if (C5.Get("DETIMPBUOIMP").compareTo(v_LIQUIDABILE, true)<=0)
                  {
                    v_IMPORTO = new IDVariant(C5.Get("DETIMPBUOIMP"));
                  }
                }
              }
              v_NUMREC = (new IDVariant());
              if (IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMNUOFAT, 0).compareTo((new IDVariant("SI")), true)!=0)
              {
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  FATTURE_BUONI A ");
                SQL.append("where (A.ANNO_BUONO = " + IDL.CSql(C5.Get("DETIMPBUANBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.NUMERO_BUONO = " + IDL.CSql(C5.Get("DETIMPBUNUBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.PROGRESSIVO_BUONO = " + IDL.CSql(C5.Get("DETIMPBUPRBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ANNO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_NUMERO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.PROGRESSIVO_IMP = " + IDL.CSql(C5.Get("DETIMPBUPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (IDL.IsNull(v_NUMREC) || v_NUMREC.equals((new IDVariant(0)), true))
                {
                  SQL = new StringBuffer();
                  SQL.append("insert into FATTURE_BUONI ");
                  SQL.append("( ");
                  SQL.append("  PROGRESSIVO, ");
                  SQL.append("  ANNO_BUONO, ");
                  SQL.append("  NUMERO_BUONO, ");
                  SQL.append("  PROGRESSIVO_BUONO, ");
                  SQL.append("  ANNO_PROG, ");
                  SQL.append("  NUMERO_PROG, ");
                  SQL.append("  IMPUTATO, ");
                  SQL.append("  DATA_REGISTRAZIONE, ");
                  SQL.append("  PROGRESSIVO_IMP, ");
                  SQL.append("  UTENTE_INSERIMENTO ");
                  SQL.append(") ");
                  SQL.append("values ");
                  SQL.append("( ");
                  SQL.append("  to_number(NULL), ");
                  SQL.append("  " + IDL.CSql(C5.Get("DETIMPBUANBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(C5.Get("DETIMPBUNUBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(C5.Get("DETIMPBUPRBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ANNO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_NUMERO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(v_IMPORTO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  TRUNC( SYSDATE ), ");
                  SQL.append("  " + IDL.CSql(C5.Get("DETIMPBUPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
                  SQL.append(") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
                else
                {
                  SQL = new StringBuffer();
                  SQL.append("update FATTURE_BUONI set ");
                  SQL.append("  IMPUTATO = FATTURE_BUONI.IMPUTATO + " + IDL.CSql(v_IMPORTO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
                  SQL.append("where (ANNO_BUONO = " + IDL.CSql(C5.Get("DETIMPBUANBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (NUMERO_BUONO = " + IDL.CSql(C5.Get("DETIMPBUNUBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO_BUONO = " + IDL.CSql(C5.Get("DETIMPBUPRBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ANNO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_NUMERO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (PROGRESSIVO_IMP = " + IDL.CSql(C5.Get("DETIMPBUPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
              }
              else
              {
                INSINTFATBUO_FATBUOIMININ(C5.Get("DETIMPBUANBU"), C5.Get("DETIMPBUNUBU"), C5.Get("DETIMPBUPRBU"), v_IMPORTO, C5.Get("DETIMPBUPRIM"), C3.Get("DESCRIZIONE"), C3.Get("FATTORE"), C3.Get("CENTRO"), C3.Get("COMPETENZA_DAL"), C3.Get("COMPETENZA_AL"));
              }
              v_LIQUIDABILE = IDL.Sub(v_LIQUIDABILE, C5.Get("DETIMPBUOIMP"));
              if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMLIQMOD, 0)))
              {
                IMDB.set_Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMLIQMOD, 0, (new IDVariant(1)));
              }
              v_INSERITO1 = (new IDVariant(-1));
              C5.MoveNext();
            }
            C5.Close();
            if (!(v_INSERITO1.booleanValue()))
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Non esistono record su Dettagli Impegni Buoni per il Dettaglio ", IDVariant.STRING));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SMS, IDL.ToString(C3.Get("NUMERO_BUONO"))), (new IDVariant(" / "))), IDL.ToString(C3.Get("ANNO_BUONO"))), (new IDVariant(" / "))), IDL.ToString(C3.Get("PROGRESSIVO_BUONO")))); 
              PAN_DETTAGORDINE.SetRowSelected((new IDVariant(0)).booleanValue(), v_NUMERORIGA.intValue()); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              IMDB.set_Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ROWNAMEERROR, 0, (new IDVariant(1)));
              return 0;
            }
          }
          v_NUMERORIGA = IDL.Add(v_NUMERORIGA, (new IDVariant(1)));
          PAN_DETTAGORDINE.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      catch (Exception e18)
      {
        MainFrm.set_AlertMessage(new IDVariant(e18.getMessage())); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaOrdine", "InsertIntoFattureBuoni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Fatture Buoni IMDB: Insert into
  // Why are you inserting this record?
  // **********************************************************************
  private void INSINTFATBUO_FATBUOIMININ(IDVariant C5_DETIMPBUANBU, IDVariant C5_DETIMPBUNUBU, IDVariant C5_DETIMPBUPRBU, IDVariant v_IMPORTO, IDVariant C5_DETIMPBUPRIM, IDVariant C3_DESCRIZIONE, IDVariant C3_FATTORE, IDVariant C3_CENTRO, IDVariant C3_COMPETENZA_DAL, IDVariant C3_COMPETENZA_AL) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef2.TBL_FATTBUONIMDB, 0);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO, 0, (new IDVariant()));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_ANNO_BUONO, 0, C5_DETIMPBUANBU);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_NUMERO_BUONO, 0, C5_DETIMPBUNUBU);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO_BUONO, 0, C5_DETIMPBUPRBU);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_ANNO_PROG, 0, IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_ANNO_PROG, 0));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_NUMERO_PROG, 0, IMDB.Value(IMDBDef2.TBL_FILTRI1, IMDBDef2.FLD_FILTRI1_NUMERO_PROG, 0));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_IMPUTATO, 0, v_IMPORTO);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_DATA_REGISTRAZIONE, 0, IDL.Today());
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO_IMP, 0, C5_DETIMPBUPRIM);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDSTA, 0, (new IDVariant("N")));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDLIQ, 0, (new IDVariant()));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDDES, 0, C3_DESCRIZIONE);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDFAT, 0, C3_FATTORE);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDCEN, 0, C3_CENTRO);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMCODA, 0, C3_COMPETENZA_DAL);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMCOAL, 0, C3_COMPETENZA_AL);
  }

  // **********************************************************************
  // Setta Righe Del Gruppo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaRigheDelGruppo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RIGASELEZION = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_GRUPPO = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      v_RIGASELEZION = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Setta Righe Del Gruppo Body
      // Procedure Body
      // 
      v_GRUPPO = (new IDVariant());
      C2 = PAN_DETTAGORDINE.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_DETTAGORDINE.GotoFirst();
      while (!PAN_DETTAGORDINE.RSEOF())
      {
        if (IDL.IsNull(v_GRUPPO))
        {
          if (!(IDL.IsNull(C2.Get("GRUPPO"))))
          {
            v_GRUPPO = new IDVariant(C2.Get("GRUPPO"));
          }
        }
        if (C2.Get("GRUPPO").equals(v_GRUPPO, true) && !(IDL.IsNull(C2.Get("GRUPPO"))))
        {
          PAN_DETTAGORDINE.SetRowSelected((new IDVariant(-1)).booleanValue(), v_RIGASELEZION.intValue()); 
        }
        v_RIGASELEZION = IDL.Add(v_RIGASELEZION, (new IDVariant(1)));
        PAN_DETTAGORDINE.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaOrdine", "SettaRigheDelGruppo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_ANNO_BUONO, 0, IMDB.Value(IMDBDef10.PQRY_DETTAGLBUON1, IMDBDef10.PQSL_DETTAGLBUON1_ANNO_BUONO, 0));
      IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_NUMERO_BUONO, 0, IMDB.Value(IMDBDef10.PQRY_DETTAGLBUON1, IMDBDef10.PQSL_DETTAGLBUON1_NUMERO_BUONO, 0));
      MainFrm.Show(MyGlb.FRM_INFOORDINI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaOrdine", "Info", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Contropartita
  // Anno Buono:  - Input
  // Numero Buono:  - Input
  // Progressivo Buono:  - Input
  // **********************************************************************
  public IDVariant ProponiContropartita (IDVariant AnnoBuono, IDVariant NumeroBuono, IDVariant ProgressivoBuono)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TITOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODINTERVENT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODTERZI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTROPARTIT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Contropartita Body
      // Procedure Body
      // 
      v_CONTROPARTIT = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_IMP as DETIMPBUANIM, ");
      SQL.append("  A.NUMERO_IMP as DETIMPBUNUIM ");
      SQL.append("from ");
      SQL.append("  DETTAGLI_IMPEGNI_BUONI A ");
      SQL.append("where (A.ANNO_BUONO = " + IDL.CSql(AnnoBuono, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_BUONO = " + IDL.CSql(NumeroBuono, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGRESSIVO_BUONO = " + IDL.CSql(ProgressivoBuono, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ANNOIMP = QV.Get("DETIMPBUANIM", IDVariant.INTEGER) ;
        v_NUMEROIMP = QV.Get("DETIMPBUNUIM", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TITOLO as CAPTITOLO, ");
      SQL.append("  A.COD_INTERVENTO as CAPCODINTERV, ");
      SQL.append("  A.COD_TERZI as CAPCODTERZI ");
      SQL.append("from ");
      SQL.append("  CAP A, ");
      SQL.append("  IMP B ");
      SQL.append("where (B.ANNO_IMP = " + IDL.CSql(v_ANNOIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.NUMERO_IMP = " + IDL.CSql(v_NUMEROIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (A.CAPITOLO = B.CAPITOLO) ");
      SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TITOLO = QV.Get("CAPTITOLO", IDVariant.INTEGER) ;
        v_CODINTERVENT = QV.Get("CAPCODINTERV", IDVariant.INTEGER) ;
        v_CODTERZI = QV.Get("CAPCODTERZI", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (IDL.IsNull(v_CODINTERVENT))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CONTROPARTITA as CAPTERCONTRO ");
        SQL.append("from ");
        SQL.append("  CAPTER A ");
        SQL.append("where (A.CAPITOLO = " + IDL.CSql(v_CODTERZI, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'S') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTROPARTIT = QV.Get("CAPTERCONTRO", IDVariant.STRING) ;
        }
        QV.Close();
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CONTROPARTITA as INTERVCONTRO ");
        SQL.append("from ");
        SQL.append("  INTERVENTI A ");
        SQL.append("where (A.TITOLO = " + IDL.CSql(v_TITOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.INTERVENTO = " + IDL.CSql(v_CODINTERVENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTROPARTIT = QV.Get("INTERVCONTRO", IDVariant.STRING) ;
        }
        QV.Close();
      }
      return v_CONTROPARTIT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaOrdine", "ProponiContropartita", _e);
      return new IDVariant();
    }
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
  private void PAN_DETTAGORDINE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGORDINE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGORDINE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGORDINE, Cancel);
    // Stub
  }

  private void PAN_DETTAGORDINE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTAGORDINE_INFOORDINE)
    {
      this.IdxPanelActived = this.PAN_DETTAGORDINE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTAGORDINE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGORDINE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGORDINE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTAGORDINE_Init()
  {

    PAN_DETTAGORDINE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGORDINE.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, "612A5D96-2536-4356-89B6-03A024F9197C");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, "Ordine");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, MyGlb.PANEL_LIST, 0, -9999, 200, 16, 0, 0);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, MyGlb.PANEL_FORM, 0, 387, 216, 121, 0, 0);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, 0, 37);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, 1, 13);
    PAN_DETTAGORDINE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, 0, 4);
    PAN_DETTAGORDINE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, 1, 4);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGORDINE_ORDINE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGORDINE.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, "58AB7FCF-7131-4F6C-A0DB-4849B04FCE81");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, "Numero");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, "F1E3C446-1992-4D43-B6DE-9A206A8C535C");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, "Anno");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, "850B8620-E498-4A1E-8687-CE8A08692D0E");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, " ");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, "9F3EE369-6386-477D-91FF-2E8F9714D650");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, "Data");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, "DF46D1D0-1A3A-4435-B1B2-B1F40FBA9850");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, "Progressivo");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, "899CF714-6229-4D41-A141-0282F3C1D136");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, "Descrizione");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, "DEF9A6EB-DE34-44BE-BFA6-A2650792DDC3");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, "Importo");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, "D6AE02DC-AB5D-4DB5-A9BF-1FC3502086F7");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, "Liquidabile");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, "E01E0379-0596-4971-9D8C-2DA32C2D132B");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, "Gruppo");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, "Gruppo");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, "0CFBC181-52F2-453D-A81E-6C83BAD92157");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, "Selezionato");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, "340567CB-1AB4-4D17-B6F5-B007DCCC5B1C");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, "CENTRO");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, "D7AF4428-67BF-4138-85BF-05A1E969D59C");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, "FATTORE");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, "C50D92DD-7BBF-496B-A80C-35F2514A04E6");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, "COMPETENZA DAL");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGORDINE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, "3387C39C-77E9-47F7-8BF2-07FC0F5909EE");
    PAN_DETTAGORDINE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, "COMPETENZA AL");
    PAN_DETTAGORDINE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, "");
    PAN_DETTAGORDINE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGORDINE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DETTAGORDINE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, MyGlb.PANEL_LIST, 0, 48, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, MyGlb.PANEL_LIST, 96);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, MyGlb.PANEL_LIST, "Numero");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, MyGlb.PANEL_FORM, 4, 436, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, MyGlb.PANEL_FORM, 96);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_NUMEROBUONO, MyGlb.PANEL_FORM, "Numero");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_NUMEROBUONO, -1, GRP_DETTAGORDINE_ORDINE);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_NUMEROBUONO, PPQRY_DETTAGLBUON1, "B.NUMERO_BUONO", "NUMERO_BUONO", 1, 6, 0, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, MyGlb.PANEL_LIST, 52, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, MyGlb.PANEL_LIST, "Anno");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, MyGlb.PANEL_FORM, 4, 412, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_ANNOBUONO, MyGlb.PANEL_FORM, "Anno");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_ANNOBUONO, -1, GRP_DETTAGORDINE_ORDINE);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_ANNOBUONO, PPQRY_DETTAGLBUON1, "B.ANNO_BUONO", "ANNO_BUONO", 1, 4, 0, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, MyGlb.PANEL_LIST, 100, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, MyGlb.PANEL_LIST, 32);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, MyGlb.PANEL_LIST, " ");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, MyGlb.PANEL_FORM, 4, 484, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, MyGlb.PANEL_FORM, 32);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_INFOORDINE, MyGlb.PANEL_FORM, " ");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_INFOORDINE, -1, GRP_DETTAGORDINE_ORDINE);
    PAN_DETTAGORDINE.SetFieldUnbound(PFL_DETTAGORDINE_INFOORDINE, true);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_INFOORDINE, PPQRY_DETTAGLBUON1, "'I'", "DETBUOINFORD", 5, 1, 0, -13997);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_INFOORDINE, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, MyGlb.PANEL_LIST, 124, 48, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, MyGlb.PANEL_LIST, "Data");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, MyGlb.PANEL_FORM, 4, 460, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DATAEMBUONO, MyGlb.PANEL_FORM, "Data");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_DATAEMBUONO, -1, GRP_DETTAGORDINE_ORDINE);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_DATAEMBUONO, PPQRY_DETTAGLBUON1, "A.DATA_EM_BUONO", "DETBUODAEMBU", 6, 19, 0, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, MyGlb.PANEL_LIST, 200, 48, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, MyGlb.PANEL_LIST, 120);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, MyGlb.PANEL_LIST, "Progr.");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_PROGRESSIVO, MyGlb.PANEL_FORM, "Progr.");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_PROGRESSIVO, -1, -1);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_PROGRESSIVO, PPQRY_DETTAGLBUON1, "B.PROGRESSIVO_BUONO", "PROGRESSIVO_BUONO", 1, 3, 0, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, MyGlb.PANEL_LIST, 240, 48, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 316, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_DESCRIZIONE, -1, -1);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_DESCRIZIONE, PPQRY_DETTAGLBUON1, "B.DESCRIZIONE", "DESCRIZIONE", 5, 2000, 0, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, MyGlb.PANEL_LIST, 480, 48, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, MyGlb.PANEL_FORM, 4, 364, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_IMPORTO, -1, -1);
    PAN_DETTAGORDINE.SetFieldUnbound(PFL_DETTAGORDINE_IMPORTO, true);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_IMPORTO, PPQRY_DETTAGLBUON1, "MIN(NVL(B.IMPORTO, 0)) + SUM(NVL(F.VARIAZIONI, 0)) - SUM(NVL(F.FATTURATO, 0))", "DETTBUONIMPO", 3, 28, 6, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, MyGlb.PANEL_LIST, 592, 48, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, MyGlb.PANEL_LIST, "Liquidabile");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, MyGlb.PANEL_FORM, 4, 388, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_LIQUIDABILE, MyGlb.PANEL_FORM, "Liquid.");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_LIQUIDABILE, -1, -1);
    PAN_DETTAGORDINE.SetFieldUnbound(PFL_DETTAGORDINE_LIQUIDABILE, true);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_LIQUIDABILE, PPQRY_DETTAGLBUON1, "CASE WHEN " + IDL.CSql(MainFrm.LIQUCONTFATT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'F' AND MIN(~~TBL_FILTRI1.ROWNAMRESFAT~~) < MIN(NVL(B.IMPORTO, 0)) + SUM(NVL(F.VARIAZIONI, 0)) - SUM(NVL(F.FATTURATO, 0)) THEN MIN(~~TBL_FILTRI1.ROWNAMRESFAT~~) ELSE MIN(NVL(B.IMPORTO, 0)) + SUM(NVL(F.VARIAZIONI, 0)) - SUM(NVL(F.FATTURATO, 0)) END", "DETTBUONLIQU", 3, 28, 6, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, MyGlb.PANEL_LIST, 704, 48, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, MyGlb.PANEL_LIST, "Gruppo");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, MyGlb.PANEL_FORM, 4, 412, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, MyGlb.PANEL_FORM, 52);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_GRUPPO, MyGlb.PANEL_FORM, "Gruppo");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_GRUPPO, -1, -1);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_GRUPPO, PPQRY_DETTAGLBUON1, "B.GRUPPO", "GRUPPO", 5, 10, 0, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, MyGlb.PANEL_LIST, "Selezionato");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, MyGlb.PANEL_FORM, 4, 412, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_SELEZIONATO, MyGlb.PANEL_FORM, "Selez.");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_SELEZIONATO, -1, -1);
    PAN_DETTAGORDINE.SetFieldUnbound(PFL_DETTAGORDINE_SELEZIONATO, true);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_SELEZIONATO, PPQRY_DETTAGLBUON1, "0", "DETTBUONSELE", 1, 19, 0, -13997);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_SELEZIONATO, (new IDVariant(-1)), "true", "Condizione vera", "", -1);
    PAN_DETTAGORDINE.SetValueListItem(PFL_DETTAGORDINE_SELEZIONATO, (new IDVariant(0)), "false", "Condizione falsa", "", -1);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, MyGlb.PANEL_LIST, 580, 72, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, MyGlb.PANEL_FORM, 4, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_CENTRO, -1, -1);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_CENTRO, PPQRY_DETTAGLBUON1, "B.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, MyGlb.PANEL_LIST, 632, 72, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, MyGlb.PANEL_FORM, 4, 436, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_FATTORE, -1, -1);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_FATTORE, PPQRY_DETTAGLBUON1, "B.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, MyGlb.PANEL_LIST, 688, 72, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, MyGlb.PANEL_LIST, "COMPETENZA DAL");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, MyGlb.PANEL_FORM, 4, 460, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZDAL, MyGlb.PANEL_FORM, "COMPET. DAL");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_COMPETENZDAL, -1, -1);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_COMPETENZDAL, PPQRY_DETTAGLBUON1, "B.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, MyGlb.PANEL_LIST, 792, 72, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, MyGlb.PANEL_LIST, "COMPETENZA AL");
    PAN_DETTAGORDINE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, MyGlb.PANEL_FORM, 4, 484, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGORDINE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGORDINE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGORDINE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGORDINE_COMPETENZAAL, MyGlb.PANEL_FORM, "COMPET. AL");
    PAN_DETTAGORDINE.SetFieldPage(PFL_DETTAGORDINE_COMPETENZAAL, -1, -1);
    PAN_DETTAGORDINE.SetFieldPanel(PFL_DETTAGORDINE_COMPETENZAAL, PPQRY_DETTAGLBUON1, "B.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
  }

  private void PAN_DETTAGORDINE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGORDINE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGORDINE.SetIMDB(IMDB, "PQRY_DETTAGLBUON1", true);
    PAN_DETTAGORDINE.set_SetString(MyGlb.MASTER_ROWNAME, "DETTAGLI BUONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.ANNO_BUONO as ANNO_BUONO, ");
    SQL.append("  B.NUMERO_BUONO as NUMERO_BUONO, ");
    SQL.append("  A.DATA_EM_BUONO as DETBUODAEMBU, ");
    SQL.append("  'I' as DETBUOINFORD, ");
    SQL.append("  B.PROGRESSIVO_BUONO as PROGRESSIVO_BUONO, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  MIN(NVL(B.IMPORTO, 0)) + SUM(NVL(F.VARIAZIONI, 0)) - SUM(NVL(F.FATTURATO, 0)) as DETTBUONIMPO, ");
    SQL.append("  CASE WHEN " + IDL.CSql(MainFrm.LIQUCONTFATT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'F' AND MIN(~~TBL_FILTRI1.ROWNAMRESFAT~~) < MIN(NVL(B.IMPORTO, 0)) + SUM(NVL(F.VARIAZIONI, 0)) - SUM(NVL(F.FATTURATO, 0)) THEN MIN(~~TBL_FILTRI1.ROWNAMRESFAT~~) ELSE MIN(NVL(B.IMPORTO, 0)) + SUM(NVL(F.VARIAZIONI, 0)) - SUM(NVL(F.FATTURATO, 0)) END as DETTBUONLIQU, ");
    SQL.append("  B.GRUPPO as GRUPPO, ");
    SQL.append("  0 as DETTBUONSELE, ");
    SQL.append("  B.CENTRO as CENTRO, ");
    SQL.append("  B.FATTORE as FATTORE, ");
    SQL.append("  B.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  B.COMPETENZA_AL as COMPETENZA_AL ");
    PAN_DETTAGORDINE.SetQuery(PPQRY_DETTAGLBUON1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BUONI A, ");
    SQL.append("  DETTAGLI_BUONI B, ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI F ");
    PAN_DETTAGORDINE.SetQuery(PPQRY_DETTAGLBUON1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_BUONO = A.ANNO_BUONO) ");
    SQL.append("and   (B.NUMERO_BUONO = A.NUMERO_BUONO) ");
    SQL.append("and   (F.ANNO_BUONO = B.ANNO_BUONO) ");
    SQL.append("and   (F.NUMERO_BUONO = B.NUMERO_BUONO) ");
    SQL.append("and   (F.PROGRESSIVO_BUONO = B.PROGRESSIVO_BUONO) ");
    SQL.append("and   (A.CODICE = ~~TBL_FILTRI1.ROWNAMCODBEN~~) ");
    SQL.append("and   ((NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_FILTRI1.ROWNAMUNIORG~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1)) AND ~~TBL_FILTRI1.ROWNAMFIUNOR~~ = 'SI') OR NVL(~~TBL_FILTRI1.ROWNAMFIUNOR~~, 'NO') = 'NO') ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI C ");
    SQL.append("where (C.ANNO_BUONO = A.ANNO_BUONO) ");
    SQL.append("and   (C.NUMERO_BUONO = A.NUMERO_BUONO) ");
    SQL.append("and   (NOT ((C.ANNO_DEL IS NULL))) ");
    SQL.append("and   (NOT ((C.ANNO_PROPOSTA IS NULL))) ");
    SQL.append(")))) ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_BUONI D ");
    SQL.append("where (D.ANNO_BUONO = A.ANNO_BUONO) ");
    SQL.append("and   (D.NUMERO_BUONO = A.NUMERO_BUONO) ");
    SQL.append("and   (NVL(D.QUANTITA_ARRIVATA, 0) <> 0) ");
    SQL.append("and   (" + IDL.CSql(MainFrm.GESTIONBOLLE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI') ");
    SQL.append(")))) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI E ");
    SQL.append("where (E.ANNO_BUONO = A.ANNO_BUONO) ");
    SQL.append("and   (E.NUMERO_BUONO = A.NUMERO_BUONO) ");
    SQL.append("and   ((E.IMPORTO + NVL(E.VARIAZIONI, 0) - NVL(E.FATTURATO, 0)) > 0) ");
    SQL.append("))) ");
    PAN_DETTAGORDINE.SetQuery(PPQRY_DETTAGLBUON1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  B.ANNO_BUONO, ");
    SQL.append("  B.NUMERO_BUONO, ");
    SQL.append("  A.DATA_EM_BUONO, ");
    SQL.append("  B.PROGRESSIVO_BUONO, ");
    SQL.append("  B.DESCRIZIONE, ");
    SQL.append("  B.GRUPPO, ");
    SQL.append("  B.CENTRO, ");
    SQL.append("  B.FATTORE, ");
    SQL.append("  B.COMPETENZA_DAL, ");
    SQL.append("  B.COMPETENZA_AL ");
    PAN_DETTAGORDINE.SetQuery(PPQRY_DETTAGLBUON1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("having (CASE WHEN " + IDL.CSql(MainFrm.LIQUCONTFATT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'F' AND MIN(~~TBL_FILTRI1.ROWNAMRESFAT~~) < MIN(NVL(B.IMPORTO, 0)) + SUM(NVL(F.VARIAZIONI, 0)) - SUM(NVL(F.FATTURATO, 0)) THEN MIN(~~TBL_FILTRI1.ROWNAMRESFAT~~) ELSE MIN(NVL(B.IMPORTO, 0)) + SUM(NVL(F.VARIAZIONI, 0)) - SUM(NVL(F.FATTURATO, 0)) END > 0) ");
    PAN_DETTAGORDINE.SetQuery(PPQRY_DETTAGLBUON1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_BUONO, ");
    SQL.append("  B.NUMERO_BUONO, ");
    SQL.append("  B.GRUPPO, ");
    SQL.append("  B.PROGRESSIVO_BUONO ");
    PAN_DETTAGORDINE.SetQuery(PPQRY_DETTAGLBUON1, 5, SQL, -1, "");
    PAN_DETTAGORDINE.SetQueryDB(PPQRY_DETTAGLBUON1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGORDINE.SetMasterTable(0, "BUONI");
    PAN_DETTAGORDINE.AddToSortList(PFL_DETTAGORDINE_ANNOBUONO, true);
    PAN_DETTAGORDINE.AddToSortList(PFL_DETTAGORDINE_NUMEROBUONO, true);
    PAN_DETTAGORDINE.AddToSortList(PFL_DETTAGORDINE_GRUPPO, true);
    PAN_DETTAGORDINE.AddToSortList(PFL_DETTAGORDINE_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGORDINE.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGORDINE.iUseListQBE;
      PAN_DETTAGORDINE.iUseListQBE = 0;
      PAN_DETTAGORDINE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGORDINE.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGORDINE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTAGORDINE) PAN_DETTAGORDINE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGORDINE) PAN_DETTAGORDINE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGORDINE) PAN_DETTAGORDINE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGORDINE) PAN_DETTAGORDINE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTAGORDINE) PAN_DETTAGORDINE_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_DETTAGORDINE) PAN_DETTAGORDINE_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DETTAGORDINE) PAN_DETTAGORDINE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
