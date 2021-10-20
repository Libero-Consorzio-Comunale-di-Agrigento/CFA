// **********************************************
// Nuovi Incassi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class NuoviIncassi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_NUOVIINCASSI_DEBITORE = 0;
  private static int PFL_NUOVIINCASSI_IMPORTO = 1;
  private static int PFL_NUOVIINCASSI_INCASSATO = 2;
  private static int PFL_NUOVIINCASSI_INCASSO = 3;
  private static int PFL_NUOVIINCASSI_DATAINCASSO = 4;
  private static int PFL_NUOVIINCASSI_DESCRIZIONE = 5;
  private static int PFL_NUOVIINCASSI_NUMERODOC = 6;
  private static int PFL_NUOVIINCASSI_DDATADOC = 7;
  private static int PFL_NUOVIINCASSI_QUIETANZA = 8;
  private static int PFL_NUOVIINCASSI_DOCUMENLABEL = 9;

  private static int PPQRY_PRE3 = 0;


  IDPanel PAN_NUOVIINCASSI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI230(IMDB);
    Init_TBL_PARAMETRIO10(IMDB);
    //
    //
    Init_PQRY_PRE3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI230(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI230, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI230, "TBL_PARAMETRI230");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI230,IMDBDef5.FLD_PARAMETRI230_PARAMANNOORD, "PARAMANNOORD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI230,IMDBDef5.FLD_PARAMETRI230_PARAMANNOORD,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI230,IMDBDef5.FLD_PARAMETRI230_PARAMNUMEORD, "PARAMNUMEORD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI230,IMDBDef5.FLD_PARAMETRI230_PARAMNUMEORD,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI230, 0);
  }

  private static void Init_TBL_PARAMETRIO10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRIO10, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRIO10, "TBL_PARAMETRIO10");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIO10,IMDBDef5.FLD_PARAMETRIO10_INCASSOOLD, "INCASSOOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIO10,IMDBDef5.FLD_PARAMETRIO10_INCASSOOLD,3,14,2);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRIO10, 0);
  }

  private static void Init_PQRY_PRE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PRE3, 33);
    IMDB.set_TblCode(IMDBDef15.PQRY_PRE3, "PQRY_PRE3");
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ANNO_PRE, "ANNO_PRE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ANNO_PRE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_PRE, "NUMERO_PRE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_PRE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DATA_REG,1,7,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_PREINCASSO, "PREINCASSO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_PREINCASSO,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_PREDESCRIZIO, "PREDESCRIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_PREDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_IMPORTO_INC, "IMPORTO_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_IMPORTO_INC,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_FAT_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_D_DATA_INC, "D_DATA_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_D_DATA_INC,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_PRBERASOESES, "PRBERASOESES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_PRBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_PREFATDDATDO, "PREFATDDATDO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_PREFATDDATDO,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_INC, "NUMERO_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_NUMERO_INC,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_D_DATA_ESTRATTO_CCP, "D_DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_D_DATA_ESTRATTO_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_D_DATA_CCP, "D_DATA_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_D_DATA_CCP,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DATAINCASSO, "DATAINCASSO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PRE3,IMDBDef15.PQSL_PRE3_DATAINCASSO,6,0,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PRE3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public NuoviIncassi(MyWebEntryPoint w, IMDBObj imdb)
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
  public NuoviIncassi()
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
    FormIdx = MyGlb.FRM_NUOVIINCASSI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "52E2832C-9AF2-465F-9E3C-7C025AFC842A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 968;
    DesignHeight = 334;
    set_Caption(new IDVariant("Nuovi Incassi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 968;
    Frames[1].Height = 308;
    Frames[1].Caption = "Nuovi Incassi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 308;
    PAN_NUOVIINCASSI = new IDPanel(w, this, 1, "PAN_NUOVIINCASSI");
    Frames[1].Content = PAN_NUOVIINCASSI;
    PAN_NUOVIINCASSI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NUOVIINCASSI.VS = MainFrm.VisualStyleList;
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 968-MyGlb.PAN_OFFS_X, 308-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "899E8198-530B-4958-BBCD-01581E19227F");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 928, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NUOVIINCASSI.InitStatus = 2;
    PAN_NUOVIINCASSI_Init();
    PAN_NUOVIINCASSI_InitFields();
    PAN_NUOVIINCASSI_InitQueries();
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
      PAN_NUOVIINCASSI.UpdatePanel(MainFrm);
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
    return (obj instanceof NuoviIncassi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? NuoviIncassi.class.getName() : (Glb.ClassWithPackage(NuoviIncassi.class) ? NuoviIncassi.class.getName().substring(NuoviIncassi.class.getPackage().getName().length() + 1) : NuoviIncassi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Nuovi Incassi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NUOVIINCASSI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_NUOVIINCASSI);
      // 
      // Nuovi Incassi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_NUOVIINCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_NUOVIINCASSI_DEBITORE,(new IDVariant(PAN_NUOVIINCASSI.FieldText(PFL_NUOVIINCASSI_DEBITORE))).stringValue()); 
      PAN_NUOVIINCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_NUOVIINCASSI_DESCRIZIONE,(new IDVariant(PAN_NUOVIINCASSI.FieldText(PFL_NUOVIINCASSI_DESCRIZIONE))).stringValue()); 
      PAN_NUOVIINCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_NUOVIINCASSI_NUMERODOC,(new IDVariant(PAN_NUOVIINCASSI.FieldText(PFL_NUOVIINCASSI_NUMERODOC))).stringValue()); 
      PAN_NUOVIINCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_NUOVIINCASSI_QUIETANZA,(new IDVariant(PAN_NUOVIINCASSI.FieldText(PFL_NUOVIINCASSI_QUIETANZA))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviIncassi", "NuoviIncassiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovi Incassi After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_NUOVIINCASSI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovi Incassi After Find Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO10, IMDBDef5.FLD_PARAMETRIO10_INCASSOOLD, 0, IMDB.Value(IMDBDef15.PQRY_PRE3, IMDBDef15.PQSL_PRE3_PREINCASSO, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviIncassi", "NuoviIncassiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovi Incassi On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_NUOVIINCASSI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovi Incassi On Change Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO10, IMDBDef5.FLD_PARAMETRIO10_INCASSOOLD, 0, IMDB.Value(IMDBDef15.PQRY_PRE3, IMDBDef15.PQSL_PRE3_PREINCASSO, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviIncassi", "NuoviIncassiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovi Incassi On Database Error Event
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
  private void PAN_NUOVIINCASSI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_NUOVIINCASSI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Nuovi Incassi On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviIncassi", "NuoviIncassiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovi Incassi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_NUOVIINCASSI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovi Incassi On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_NUOVIINCASSI_INCASSO)), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_PRE3, IMDBDef15.PQSL_PRE3_PREINCASSO, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRIO10, IMDBDef5.FLD_PARAMETRIO10_INCASSOOLD, 0), true)!=0)
        {
          if (IMDB.Value(IMDBDef15.PQRY_PRE3, IMDBDef15.PQSL_PRE3_PREINCASSO, 0).compareTo(IDL.Sub(IMDB.Value(IMDBDef15.PQRY_PRE3, IMDBDef15.PQSL_PRE3_IMPORTO, 0), IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PRE3, IMDBDef15.PQSL_PRE3_IMPORTO_INC, 0),(new IDVariant(0)))), true)>0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Importo superiore al residuo da Incassare!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef15.PQRY_PRE3, IMDBDef15.PQSL_PRE3_PREINCASSO, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRIO10, IMDBDef5.FLD_PARAMETRIO10_INCASSOOLD, 0));
          }
          else
          {
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO10, IMDBDef5.FLD_PARAMETRIO10_INCASSOOLD, 0, IMDB.Value(IMDBDef15.PQRY_PRE3, IMDBDef15.PQSL_PRE3_PREINCASSO, 0));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviIncassi", "NuoviIncassiOnUpdatingRowEvent", _e);
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
      PAN_NUOVIINCASSI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_NUOVIINCASSI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_NUOVIINCASSI.SetFieldValidation(PFL_NUOVIINCASSI_INCASSO, (new IDVariant(-1)).booleanValue()); 
      PAN_NUOVIINCASSI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviIncassi", "LoadEvent", _e);
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
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Unload Event Body
      // Procedure Body
      // 
      if (Confirm.booleanValue())
      {
        IDVariant v_POS = new IDVariant(0,IDVariant.INTEGER);
        v_POS = (new IDVariant(1));
        MainFrm.Cf4armDBObject.BeginTrans();
        C3 = PAN_NUOVIINCASSI.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_NUOVIINCASSI.GotoFirst();
        while (!PAN_NUOVIINCASSI.RSEOF())
        {
          if (PAN_NUOVIINCASSI.IsRowSelected(v_POS.intValue()))
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("insert into INCASSI ");
              SQL.append("( ");
              SQL.append("  PROGRESSIVO, ");
              SQL.append("  ANNO_ORD, ");
              SQL.append("  NUMERO_ORD, ");
              SQL.append("  ANNO_PRE, ");
              SQL.append("  NUMERO_PRE, ");
              SQL.append("  IMPORTO, ");
              SQL.append("  NUMERO_INC, ");
              SQL.append("  D_DATA_INC, ");
              SQL.append("  D_DATA_CCP, ");
              SQL.append("  D_DATA_ESTRATTO_CCP, ");
              SQL.append("  UTENTE_INSERIMENTO, ");
              SQL.append("  DATA_INSERIMENTO ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  to_number(NULL), ");
              SQL.append("  " + IDL.CSql(C3.Get("ANNO_ORD"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("NUMERO_ORD"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("ANNO_PRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("NUMERO_PRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("PREINCASSO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("NUMERO_INC"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("DATAINCASSO"), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("D_DATA_CCP"), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("D_DATA_ESTRATTO_CCP"), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ) ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e6)
            {
              MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return;
            }
          }
          v_POS = IDL.Add(v_POS, (new IDVariant(1)));
          PAN_NUOVIINCASSI.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        MainFrm.Cf4armDBObject.CommitTrans();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviIncassi", "UnloadEvent", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NUOVIINCASSI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NUOVIINCASSI, Cancel);
    // Stub
  }

  private void PAN_NUOVIINCASSI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NUOVIINCASSI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_NUOVIINCASSI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_NUOVIINCASSI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NUOVIINCASSI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_NUOVIINCASSI_Init()
  {

    PAN_NUOVIINCASSI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NUOVIINCASSI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NUOVIINCASSI.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, "DE21A21A-525F-460B-BDE5-6EB6F12DC712");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, "Debitore");
    PAN_NUOVIINCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, "");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, MyGlb.VIS_VISULOOUPCF4);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, "F9B91FB0-FAEC-4DFF-A0F2-2E1E88D3C11F");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, "Importo");
    PAN_NUOVIINCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, "");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, "D4CAEE2F-16B1-4E8F-AEBD-66C723173F43");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, "Incassato");
    PAN_NUOVIINCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, "");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, "035EF499-D895-4FE8-A3FD-BA6527AB48CB");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, "Incasso");
    PAN_NUOVIINCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, "");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, "DAEB06C7-61D1-4F3A-ABC6-45ADD0B78C4A");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, "Data Incasso");
    PAN_NUOVIINCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, "");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, "7E8BCEFA-E518-428C-B38A-CF20556E736F");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, "Descrizione");
    PAN_NUOVIINCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, "");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, "494DA035-0435-4F97-AA88-1C2EA5902A69");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, "NUMERO DOC");
    PAN_NUOVIINCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, "");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, "F107DD44-C2E1-42C8-AFAB-FC3D1B20D692");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, "D DATA DOC");
    PAN_NUOVIINCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, "");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, "766F4DA4-F74C-434D-AD65-F71D66E563D4");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, "Quietanza");
    PAN_NUOVIINCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, "");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, MyGlb.VIS_VISULOOUPCF4);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NUOVIINCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, "D66E4F33-0D38-4EA8-86F4-CA0EC15E27B6");
    PAN_NUOVIINCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, "Documento");
    PAN_NUOVIINCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_NUOVIINCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_NUOVIINCASSI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, MyGlb.PANEL_LIST, 100);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, MyGlb.PANEL_FORM, 4, 292, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, MyGlb.PANEL_FORM, 100);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_DEBITORE, -1, -1);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_DEBITORE, PPQRY_PRE3, "B.RAGIONE_SOCIALE_ESTESA", "PRBERASOESES", 5, 60, 0, -13997);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, MyGlb.PANEL_LIST, 140, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_IMPORTO, -1, -1);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_IMPORTO, PPQRY_PRE3, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, MyGlb.PANEL_LIST, 228, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, MyGlb.PANEL_LIST, 68);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, MyGlb.PANEL_LIST, "Incassato");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, MyGlb.PANEL_FORM, 148, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, MyGlb.PANEL_FORM, 64);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSATO, MyGlb.PANEL_FORM, "Incassato");
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_INCASSATO, -1, -1);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_INCASSATO, PPQRY_PRE3, "A.IMPORTO_INC", "IMPORTO_INC", 3, 14, 2, -13997);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, MyGlb.PANEL_LIST, 316, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, MyGlb.PANEL_LIST, 40);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, MyGlb.PANEL_LIST, "Incasso");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, MyGlb.PANEL_FORM, 4, 364, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, MyGlb.PANEL_FORM, 48);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_INCASSO, MyGlb.PANEL_FORM, "Inc.");
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_INCASSO, -1, -1);
    PAN_NUOVIINCASSI.SetFieldUnbound(PFL_NUOVIINCASSI_INCASSO, true);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_INCASSO, PPQRY_PRE3, "A.IMPORTO - NVL(A.IMPORTO_INC, 0)", "PREINCASSO", 3, 28, 6, -13997);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, MyGlb.PANEL_LIST, 408, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, MyGlb.PANEL_LIST, 84);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, MyGlb.PANEL_LIST, "Data Incasso");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, MyGlb.PANEL_FORM, 4, 388, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, MyGlb.PANEL_FORM, 84);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DATAINCASSO, MyGlb.PANEL_FORM, "Data Incasso");
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_DATAINCASSO, -1, -1);
    PAN_NUOVIINCASSI.SetFieldUnbound(PFL_NUOVIINCASSI_DATAINCASSO, true);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_DATAINCASSO, PPQRY_PRE3, "DECODE(A.ANNO_ORD, TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')), TRUNC( SYSDATE ), TO_DATE((31)||'/'||(12)||'/'||(A.ANNO_ORD),'dd/mm/yyyy'))", "DATAINCASSO", 6, 0, 0, -13997);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, MyGlb.PANEL_LIST, 496, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, MyGlb.PANEL_LIST, 104);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 424, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_DESCRIZIONE, -1, -1);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_DESCRIZIONE, PPQRY_PRE3, "A.DESCRIZIONE", "PREDESCRIZIO", 5, 140, 0, -13997);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, MyGlb.PANEL_LIST, 636, 36, 76, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, MyGlb.PANEL_FORM, 140, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, MyGlb.PANEL_FORM, 64);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_NUMERODOC, -1, -1);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_NUMERODOC, PPQRY_PRE3, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, MyGlb.PANEL_LIST, 712, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, MyGlb.PANEL_FORM, 4, 316, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_DDATADOC, -1, -1);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_DDATADOC, PPQRY_PRE3, "E.D_DATA_DOC", "PREFATDDATDO", 6, 10, 0, -13997);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, MyGlb.PANEL_LIST, 788, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, MyGlb.PANEL_FORM, 4, 340, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIINCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_QUIETANZA, -1, -1);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_QUIETANZA, PPQRY_PRE3, "D.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, MyGlb.PANEL_LIST, 636, 0, 152, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_NUOVIINCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, MyGlb.PANEL_FORM, 488, 0, 164, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIINCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_NUOVIINCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIINCASSI_DOCUMENLABEL, MyGlb.PANEL_FORM, 2);
    PAN_NUOVIINCASSI.SetFieldPage(PFL_NUOVIINCASSI_DOCUMENLABEL, -1, -1);
    PAN_NUOVIINCASSI.SetFieldPanel(PFL_NUOVIINCASSI_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
  }

  private void PAN_NUOVIINCASSI_InitQueries()
  {
    StringBuffer SQL;

    PAN_NUOVIINCASSI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NUOVIINCASSI.SetIMDB(IMDB, "PQRY_PRE3", true);
    PAN_NUOVIINCASSI.set_SetString(MyGlb.MASTER_ROWNAME, "PRE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_PRE as ANNO_PRE, ");
    SQL.append("  A.NUMERO_PRE as NUMERO_PRE, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.DATA_REG as DATA_REG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMPORTO - NVL(A.IMPORTO_INC, 0) as PREINCASSO, ");
    SQL.append("  A.DESCRIZIONE as PREDESCRIZIO, ");
    SQL.append("  A.DEBITORE as DEBITORE, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.CAUSALE as CAUSALE, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.IMPORTO_INC as IMPORTO_INC, ");
    SQL.append("  A.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  A.FAT_ANNO_PROG as FAT_ANNO_PROG, ");
    SQL.append("  A.FAT_NUMERO_PROG as FAT_NUMERO_PROG, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.D_DATA_INC as D_DATA_INC, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as PRBERASOESES, ");
    SQL.append("  E.D_DATA_DOC as PREFATDDATDO, ");
    SQL.append("  D.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.NUMERO_INC as NUMERO_INC, ");
    SQL.append("  A.D_DATA_ESTRATTO_CCP as D_DATA_ESTRATTO_CCP, ");
    SQL.append("  A.D_DATA_CCP as D_DATA_CCP, ");
    SQL.append("  DECODE(A.ANNO_ORD, TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')), TRUNC( SYSDATE ), TO_DATE((31)||'/'||(12)||'/'||(A.ANNO_ORD),'dd/mm/yyyy')) as DATAINCASSO ");
    PAN_NUOVIINCASSI.SetQuery(PPQRY_PRE3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  BEN B, ");
    SQL.append("  QTN C, ");
    SQL.append("  T02 D, ");
    SQL.append("  FAT E ");
    PAN_NUOVIINCASSI.SetQuery(PPQRY_PRE3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD = ~~TBL_PARAMETRI230.PARAMANNOORD~~) ");
    SQL.append("and   (A.NUMERO_ORD = ~~TBL_PARAMETRI230.PARAMNUMEORD~~) ");
    SQL.append("and   (B.CODICE(+) = A.DEBITORE) ");
    SQL.append("and   (C.CODICE(+) = A.DEBITORE) ");
    SQL.append("and   (C.NUM_QUIETANZA(+) = A.NUM_QUIETANZA) ");
    SQL.append("and   (D.CODICE(+) = C.TIPO_QUIETANZA) ");
    SQL.append("and   (E.ANNO_PROG(+) = A.FAT_ANNO_PROG) ");
    SQL.append("and   (E.NUMERO_PROG(+) = A.FAT_NUMERO_PROG) ");
    SQL.append("and   (A.IMPORTO > NVL(A.IMPORTO_INC, 0)) ");
    PAN_NUOVIINCASSI.SetQuery(PPQRY_PRE3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NUOVIINCASSI.SetQuery(PPQRY_PRE3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NUOVIINCASSI.SetQuery(PPQRY_PRE3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_PRE, ");
    SQL.append("  A.NUMERO_PRE ");
    PAN_NUOVIINCASSI.SetQuery(PPQRY_PRE3, 5, SQL, -1, "");
    PAN_NUOVIINCASSI.SetQueryDB(PPQRY_PRE3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NUOVIINCASSI.SetMasterTable(0, "PRE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NUOVIINCASSI.Status() == 2)
    {
      int oldListQBE = PAN_NUOVIINCASSI.iUseListQBE;
      PAN_NUOVIINCASSI.iUseListQBE = 0;
      PAN_NUOVIINCASSI.PanelCommand(Glb.PCM_SEARCH);
      PAN_NUOVIINCASSI.PanelCommand(Glb.PCM_FIND);
      PAN_NUOVIINCASSI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_NUOVIINCASSI) PAN_NUOVIINCASSI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUOVIINCASSI) PAN_NUOVIINCASSI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NUOVIINCASSI) PAN_NUOVIINCASSI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUOVIINCASSI) PAN_NUOVIINCASSI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NUOVIINCASSI) PAN_NUOVIINCASSI_OnChangeRow();
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
    if (SrcObj == PAN_NUOVIINCASSI) PAN_NUOVIINCASSI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_NUOVIINCASSI) PAN_NUOVIINCASSI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
