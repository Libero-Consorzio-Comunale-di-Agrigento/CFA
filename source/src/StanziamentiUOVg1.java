// **********************************************
// Stanziamenti UO Vg 1
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StanziamentiUOVg1 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_STANZIAMENUO_PROGUNITORGA = 0;
  private static int PFL_STANZIAMENUO_CAPITOLO = 1;
  private static int PFL_STANZIAMENUO_ARTICOLO = 2;
  private static int PFL_STANZIAMENUO_STANZITOTALE = 3;
  private static int PFL_STANZIAMENUO_STANZISVILUP = 4;
  private static int PFL_STANZIAMENUO_STANZICONSOL = 5;
  private static int PFL_STANZIAMENUO_PREVISTOTAL1 = 6;
  private static int PFL_STANZIAMENUO_PREVISSVILUP = 7;
  private static int PFL_STANZIAMENUO_PREVISCONSOL = 8;
  private static int PFL_STANZIAMENUO_IMPACCULCHTO = 9;
  private static int PFL_STANZIAMENUO_IMPACCULCHSV = 10;
  private static int PFL_STANZIAMENUO_IMPACCULCHCO = 11;
  private static int PFL_STANZIAMENUO_IMPEGNABILE = 12;
  private static int PFL_STANZIAMENUO_ESERCIZIO = 13;
  private static int PFL_STANZIAMENUO_ES = 14;
  private static int PFL_STANZIAMENUO_ESTVOCPEGLAB = 15;
  private static int PFL_STANZIAMENUO_STINICOTOTAL = 16;
  private static int PFL_STANZIAMENUO_STINICOSVITO = 17;
  private static int PFL_STANZIAMENUO_STINICOCONTO = 18;
  private static int PFL_STANZIAMENUO_PREVISTOTALE = 19;
  private static int PFL_STANZIAMENUO_PREVSVILTOTA = 20;
  private static int PFL_STANZIAMENUO_PREVCONSTOTA = 21;
  private static int PFL_STANZIAMENUO_IMPULTCHITOT = 22;
  private static int PFL_STANZIAMENUO_IMPULTCHSVTO = 23;
  private static int PFL_STANZIAMENUO_IMPULTCHCOTO = 24;
  private static int PFL_STANZIAMENUO_IMPETOTALABE = 25;
  private static int PFL_STANZIAMENUO_STANENTRLABE = 26;
  private static int PFL_STANZIAMENUO_PREVENTRLABE = 27;
  private static int PFL_STANZIAMENUO_ACCULTCHENLA = 28;
  private static int PFL_STANZIAMENUO_STANTOTALABE = 29;
  private static int PFL_STANZIAMENUO_STANCONSLABE = 30;
  private static int PFL_STANZIAMENUO_SVILSPESLABE = 31;
  private static int PFL_STANZIAMENUO_PREVTOTALABE = 32;
  private static int PFL_STANZIAMENUO_PREVCONSLABE = 33;
  private static int PFL_STANZIAMENUO_PREVSVILLABE = 34;
  private static int PFL_STANZIAMENUO_IMACULCHCOLA = 35;
  private static int PFL_STANZIAMENUO_IMACULCHSVLA = 36;
  private static int PFL_STANZIAMENUO_IMACULCHTOLA = 37;
  private static int PFL_STANZIAMENUO_STANZIALABEL = 38;
  private static int PFL_STANZIAMENUO_PREVISILABEL = 39;
  private static int PFL_STANZIAMENUO_IMPULTCHILAB = 40;
  private static int PFL_STANZIAMENUO_STATOTENTLAB = 41;
  private static int PFL_STANZIAMENUO_PRETOTENTLAB = 42;
  private static int PFL_STANZIAMENUO_IMACULCHTOEL = 43;

  private static int PPQRY_BPRUO = 0;

  private static int PPQRY_CAPUO = 1;


  IDPanel PAN_STANZIAMENUO;

  // Definition of Global Variables
  private IDVariant FASE = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMESIMUL1(IMDB);
    //
    //
    Init_PQRY_BPRUO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMESIMUL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMESIMUL1, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMESIMUL1, "TBL_PARAMESIMUL1");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES,5,49,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEPREVI, "ROWNAMEPREVI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEPREVI,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMESTANZ, "ROWNAMESTANZ");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_ROWNAMESTANZ,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_RONAIMACULCT, "RONAIMACULCT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMESIMUL1,IMDBDef3.FLD_PARAMESIMUL1_RONAIMACULCT,3,14,2);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMESIMUL1, 0);
  }

  private static void Init_PQRY_BPRUO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BPRUO, 19);
    IMDB.set_TblCode(IMDBDef11.PQRY_BPRUO, "PQRY_BPRUO");
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO, "IMP_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_CONS, "IMP_ULT_CHIUSO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_SVIL, "IMP_ULT_CHIUSO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPRUO,IMDBDef11.PQSL_BPRUO_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BPRUO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StanziamentiUOVg1(MyWebEntryPoint w, IMDBObj imdb)
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
  public StanziamentiUOVg1()
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
    FormIdx = MyGlb.FRM_STANZIAUOVG1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A3062FA7-9CF6-4E72-BE4E-68C93944EA97";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 708;
    DesignHeight = 498;
    set_Caption(new IDVariant("Stanziamenti UO Vg 1"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 708;
    Frames[1].Height = 472;
    Frames[1].Caption = "Stanziamenti U O";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 472;
    PAN_STANZIAMENUO = new IDPanel(w, this, 1, "PAN_STANZIAMENUO");
    Frames[1].Content = PAN_STANZIAMENUO;
    PAN_STANZIAMENUO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STANZIAMENUO.VS = MainFrm.VisualStyleList;
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 708-MyGlb.PAN_OFFS_X, 472-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "130B5E20-F845-4599-BA59-014AA200683A");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 44, 1180, 252, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STANZIAMENUO.InitStatus = 1;
    PAN_STANZIAMENUO_Init();
    PAN_STANZIAMENUO_InitFields();
    PAN_STANZIAMENUO_InitQueries();
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
      PAN_STANZIAMENUO.UpdatePanel(MainFrm);
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
    return (obj instanceof StanziamentiUOVg1);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StanziamentiUOVg1.class.getName() : (Glb.ClassWithPackage(StanziamentiUOVg1.class) ? StanziamentiUOVg1.class.getName().substring(StanziamentiUOVg1.class.getPackage().getName().length() + 1) : StanziamentiUOVg1.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Stanziamenti U O After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_STANZIAMENUO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STATOTENTLAB, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PRETOTENTLAB, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMACULCHTOEL, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOTOTAL, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOCONTO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZICONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOSVITO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZISVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVISTOTALE, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVSVILTOTA, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISSVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVCONSTOTA, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISCONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHITOT, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHSVTO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHSV), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHCOTO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHCO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMPEGNABILE, 0))))
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPETOTALABE, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPEGNABILE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "StanziamentiUOAfterFindEvent", _e);
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
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMEFORM = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMEPANSTAUO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSG = (new IDVariant("Capitolo ", IDVariant.STRING));
      v_NOMEFORM = (new IDVariant("Stanziamenti U.O.", IDVariant.STRING));
      v_NOMEPANSTAUO = (new IDVariant("Stanziamenti U.O.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      Frames[PAN_STANZIAMENUO.FrIndex].set_Caption(new IDVariant(v_NOMEPANSTAUO).stringValue());
      set_Caption(new IDVariant(v_NOMEFORM));
      FASE = MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (FASE.equals((new IDVariant(0)), true) || FASE.equals((new IDVariant(1)), true))
      {
        PAN_STANZIAMENUO.set_Locked((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_STANZIAMENUO.set_Locked((new IDVariant(-1)).booleanValue());
      }
      PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_ESTVOCPEGLAB, IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMECAPIT, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEARTIC, 0))).stringValue());
      PAN_STANZIAMENUO.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMENUO.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMENUO.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMENUO.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMENUO.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMENUO.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
      if (IMDB.Value(IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMENUO.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMENUO.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMENUO.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMENUO.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMENUO.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMENUO.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMENUO.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // 
        // etichette contenenti i totali delle colonne relative al filtro spesa non visibili
        // 
        {
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // 
          // etichette contenenti i totali delle colonne relative al filtro entrata vengono rese  visibili
          // 
          {
            PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        // 
        // etichette con le intestazioni delle colonne relative al filtro spesa non visibili
        // 
        {
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        // 
        // etichette con le intestazioni delle colonne relative al filtro entrata non visibili
        // 
        {
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        // 
        // etcihette con le intestazioni delle colonne relative al filtro entrata nonv isibili
        // 
        {
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        // 
        // etichette con la somma delle rispettive colonne relative al filtro entrata non visibili
        // 
        {
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOIMPEGN.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMENUO.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        }
      }
      // 
      // campi opzionali
      // 
      {
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      }
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "LoadEvent", _e);
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
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTROLLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_MSG1 = (new IDVariant("Stanziamento Unità Organizzative inferiore allo Stanziamento", IDVariant.STRING));
      v_MSG2 = (new IDVariant("Previsione Unità Organizzative inferiore a Previsione", IDVariant.STRING));
      v_MSG3 = (new IDVariant("Imp Ult. Chiuso Unità Organizzative inferiore a Imp. Ult. Chiuso", IDVariant.STRING));
      v_CONTROLLO = (new IDVariant(0, IDVariant.INTEGER));
      // 
      // Unload Event Body
      // Procedure Body
      // 
      if (Confirm.equals((new IDVariant(-1)), true))
      {
        // 
        // controllo se importi sono inferiori rispetto alla riga di partenza
        // 
        {
          if ((IDL.ToFloat((new IDVariant(PAN_STANZIAMENUO.FieldText(PFL_STANZIAMENUO_STINICOTOTAL)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMESTANZ, 0),(new IDVariant(0))), true)<0))
          {
            v_CONTROLLO = (new IDVariant(-1));
            v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG1), (new IDVariant("<BR/>")));
          }
          if (IDL.ToFloat((new IDVariant(PAN_STANZIAMENUO.FieldText(PFL_STANZIAMENUO_PREVISTOTALE)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEPREVI, 0),(new IDVariant(0))), true)<0)
          {
            v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG2), (new IDVariant("<BR/>")));
            v_CONTROLLO = (new IDVariant(-1));
          }
          if (IDL.ToFloat((new IDVariant(PAN_STANZIAMENUO.FieldText(PFL_STANZIAMENUO_IMPULTCHITOT)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_RONAIMACULCT, 0),(new IDVariant(0))), true)<0)
          {
            v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG3), (new IDVariant("<BR/>")));
            v_CONTROLLO = (new IDVariant(-1));
          }
          if (v_CONTROLLO.booleanValue())
          {
            MainFrm.set_AlertMessage(v_MSG); 
          }
        }
        // 
        // salvo dati del pannello
        // 
        {
          if (new IDVariant(PAN_STANZIAMENUO.Status()).equals((new IDVariant(3)), true))
          {
            ValidaRow();
            PAN_STANZIAMENUO.PanelCommand(Glb.PCM_UPDATE);
          }
          if (!(new IDVariant(PAN_STANZIAMENUO.Status()).equals((new IDVariant(2)), true)))
          {
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
        Svuotaparametri();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STANZIAMENUO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STANZIAMENUO);
      // 
      // Stanziamenti U O On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PROGR_UNITA_ORGANIZZATIVA, 0))) && !(PAN_STANZIAMENUO.IsNewRow()))
      {
        PAN_STANZIAMENUO.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "StanziamentiUOOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_STANZIAMENUO_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_ESERCIZIO, 0, IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_E_S, 0, IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_CAPITOLO, 0, IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMECAPIT, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_ARTICOLO, 0, IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEARTIC, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "StanziamentiUOBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O On Database Error Event
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
  private void PAN_STANZIAMENUO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_STANZIAMENUO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Stanziamenti U O On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      if (ErrorMessage.compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(ErrorMessage); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "StanziamentiUOOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_STANZIAMENUO_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_STANZIAMENUO, Cancel);
      // 
      // Stanziamenti U O On Validate Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        // 
        // stinicototale
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOTOTAL, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // stinicosvil
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOSVITO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZISVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // stniconstotale
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOCONTO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZICONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // previsione totale
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVISTOTALE, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // previsione sviluppo
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVSVILTOTA, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISSVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // previsione consolidato c
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVCONSTOTA, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISCONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // impultchiuso
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHITOT, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // impultchiusosviluppo
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHSVTO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHSV), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // impultchiusoconsolidato
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHCOTO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHCO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // impegnabile totale c
        // 
        {
          PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPETOTALABE, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPEGNABILE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "StanziamentiUOOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O After Delete Event
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_STANZIAMENUO_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O After Delete Event Body
      // Procedure Body
      // 
      AggiornaEtichetteTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "StanziamentiUOAfterDeleteEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Stanziamenti Totale Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENUO_STANZITOTALE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Stanziamenti Totale Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STATOTENTLAB, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO, 0), IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO_SVIL, 0)));
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOTOTAL, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "BILUOStanziamentiTotaleValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Stanziamenti Sviluppo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENUO_STANZISVILUP_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Stanziamenti Sviluppo Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO_SVIL, 0), IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO, 0)));
      PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOSVITO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZISVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "BILUOStanziamentiSviluppoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Imp Acc Ult Chiuso Totale Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENUO_IMPACCULCHTO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Imp Acc Ult Chiuso Totale Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_SVIL, 0)));
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHITOT, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      else
      {
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMACULCHTOEL, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "BILUOImpAccUltChiusoTotaleValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Imp Acc Ult Chiuso Sviluppo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENUO_IMPACCULCHSV_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Imp Acc Ult Chiuso Sviluppo Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_SVIL, 0)));
      PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHSVTO, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHSV), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "BILUOImpAccUltChiusoSviluppoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Previsione Totale Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENUO_PREVISTOTAL1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Previsione Totale Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE_SVIL, 0)));
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVISTOTALE, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      else
      {
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PRETOTENTLAB, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "BILUOPrevisioneTotaleValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Previsione Sviluppo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENUO_PREVISSVILUP_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Previsione Sviluppo Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE_SVIL, 0)));
      PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVCONSTOTA, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISCONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "BILUOPrevisioneSviluppoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Impegnabile Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENUO_IMPEGNABILE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Impegnabile Validate Event Body
      // Procedure Body
      // 
      PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPETOTALABE, IDL.Format(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPEGNABILE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "BILUOImpegnabileValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Svuotaparametri
  // **********************************************************************
  public int Svuotaparametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Svuotaparametri Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEESERC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEPREVI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMESTANZ, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_RONAIMACULCT, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "Svuotaparametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Valida Row
  // **********************************************************************
  public int ValidaRow ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Valida Row Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_IMP_ULT_CHIUSO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "ValidaRow", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Etichette Totali
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AggiornaEtichetteTotali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Etichette Totali Body
      // Procedure Body
      // 
      // 
      // nota
      // devo fare il refreshquery per accertarmi i campi del
      // pannello siano aggiornati. Nel mio caso specifico se
      // modifico i campi di pannello e cliccolo sul comando
      // Annulla i campi non vengono aggiornati 
      // 
      // 
      {
        PAN_STANZIAMENUO.PanelCommand(Glb.PCM_REQUERY);
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STATOTENTLAB, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZITOTALE)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PRETOTENTLAB, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISTOTAL1)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMACULCHTOEL, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHTO)).stringValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOTOTAL, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZITOTALE)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOSVITO, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZISVILUP)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_STINICOCONTO, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_STANZICONSOL)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVISTOTALE, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISTOTAL1)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVSVILTOTA, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISTOTAL1)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_PREVCONSTOTA, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_PREVISCONSOL)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHITOT, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHTO)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHSVTO, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHSV)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPULTCHCOTO, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPACCULCHCO)).stringValue());
        PAN_STANZIAMENUO.set_FieldText(PFL_STANZIAMENUO_IMPETOTALABE, IDL.ToString(PAN_STANZIAMENUO.GetFieldSum(PFL_STANZIAMENUO_IMPEGNABILE)).stringValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg1", "AggiornaEtichetteTotali", _e);
      return -1;
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
  private void PAN_STANZIAMENUO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STANZIAMENUO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENUO_STANZITOTALE)
      {
        PFL_STANZIAMENUO_STANZITOTALE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENUO_STANZISVILUP)
      {
        PFL_STANZIAMENUO_STANZISVILUP_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENUO_PREVISTOTAL1)
      {
        PFL_STANZIAMENUO_PREVISTOTAL1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENUO_PREVISSVILUP)
      {
        PFL_STANZIAMENUO_PREVISSVILUP_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENUO_IMPACCULCHTO)
      {
        PFL_STANZIAMENUO_IMPACCULCHTO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENUO_IMPACCULCHSV)
      {
        PFL_STANZIAMENUO_IMPACCULCHSV_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENUO_IMPEGNABILE)
      {
        PFL_STANZIAMENUO_IMPEGNABILE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_STANZIAMENUO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STANZIAMENUO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STANZIAMENUO_Init()
  {

    PAN_STANZIAMENUO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STANZIAMENUO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STANZIAMENUO.SetSize(MyGlb.OBJ_FIELD, 44);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, "23AC27C6-43DD-483F-A112-AFCA5C1251D9");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, "Prog. Unità Organizzativa");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, "8247C662-FB97-4562-990F-3C3E6B193081");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, "CAPITOLO");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, "586E3BFF-C4BD-4959-B3DE-2EE250240716");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, "ARTICOLO");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, "24B0771E-CF04-434C-B97B-6E1241D82DB9");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, "Stanziamenti Totale");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, "85DE6209-35EA-4684-8E83-B55A2A721566");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, "Stanziamenti Sviluppo");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, "FB2C3A53-B871-4051-AEFC-FEBA86441FE8");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, "Stanziamenti Consolidato");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, "DD526895-A7CA-4ACE-8BA5-ECFDCE09CB88");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, "Previsione Totale");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, "CBB6014F-3584-44A1-9CF1-F869F3FC2307");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, "Previsione Sviluppo");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, "33C46C3C-C9F6-4366-B31D-F5DC58668A8A");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, "Previsione Consolidato");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, "0F4F62E8-A4FE-403B-AB96-3E2F203CA281");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, "Imp Acc Ult Chiuso Totale");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, "D7B29244-D5A0-4B57-8774-26D950C30334");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, "Imp Acc Ult Chiuso Sviluppo");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, "EC7FC960-70DD-488C-A54F-633683AC6581");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, "Imp Acc Ult Chiuso Consolidato");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, "CEC5406E-897E-4239-86A5-CBC75ABE6E10");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, "Impegnabile");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, "A8FB200E-C542-454B-A8FA-AAA42C50FDBF");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, "ESERCIZIO");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, "62BCBB6F-F51B-436D-A1B3-C6B033C3EBB1");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, "E S");
    PAN_STANZIAMENUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, "D5E0A539-1323-4C7B-ACED-856A00DF3DE9");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, MyGlb.VIS_ETICHEGRASSE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, "F254D060-948F-4C19-A230-FA0FB3D6F03C");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, "678803C5-C38D-46E1-9B33-962C5C1B3E17");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, "80B2D916-E348-4B36-A71E-4438FE979FC1");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, "67478EC6-12AC-4797-B38F-6ACBBFE92BAE");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, "9ECB5BD2-19C3-4519-908B-A21EC2AAAAB4");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, "6491CA0E-6460-4ACE-9FCC-11EF8AF099CC");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, "8F28EF03-37D0-45F2-80C9-E800A9688CCD");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, "1667A892-A05C-4069-AEF5-A84D12E4A81E");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, "D06B8FB7-CFDE-429F-AB06-8757FEC983B0");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, "D9F80EDE-1D04-40F7-8C72-8CCB9960CCAC");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, "EC3BF8B6-A2B8-40C1-BADB-443F4EBD3E4B");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, "Stanziamento");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, "CE9DD5E2-4177-4763-AF68-DA7D90CB7508");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, "Previsione");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, "6B2C7D0C-C312-4E4B-8DCA-E3EAE48B2442");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, "Acc. Ult. Chiuso");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, "77F0A11D-C5CE-4BCF-8101-10EED9F6C28E");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, "Totale");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, "14A9EA72-38F3-4244-9092-A4EAFFF843E0");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, "Consolidato");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, "FDB5312C-E686-4273-9A2A-02B9FF474B7A");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, "Sviluppo");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, "5D5E2774-DC0D-43CD-8EF6-1D824D2529D1");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, "Totale");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, "785F3DD0-BC3E-4DBF-B3D5-F63451B0B828");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, "Consolidato");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, "5C233408-7B2A-4CC6-B2DE-1B9B9DD7EB5D");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, "Sviluppo");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, "FF546D6D-E789-4B83-9C6D-A9AF47CA66BB");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, "Consolidato");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, "D4F95B17-E000-4994-BAC5-9F2808C186D2");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, "Sviluppo");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, "A7FC79F0-C4B9-49E3-933B-4A1446526B1A");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, "Totale");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, "DEAF4D60-0E71-408D-A9B9-969A8D16D879");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, "Stanziamento");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, "FEB06BBC-0CEB-4A25-AD0A-1632963A0AEE");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, "Previsione");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, "52898EC1-B3F8-4927-B11D-1C6FEC20D289");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, "Imp. Ult. Chiuso");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, "CDDBD316-11E5-4282-A4C8-62A4B72040B1");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, "B48823E7-D0BD-4B89-82E9-EACFFC5E7CF4");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, "6A520756-97B5-4F20-86BA-725287C6949B");
    PAN_STANZIAMENUO.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, "");
    PAN_STANZIAMENUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMENUO.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_STANZIAMENUO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, MyGlb.PANEL_LIST, 16, 96, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, MyGlb.PANEL_LIST, "Prog. Unità Organizzativa");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PROGUNITORGA, MyGlb.PANEL_FORM, "Prog. Unità Organizzativa");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PROGUNITORGA, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PROGUNITORGA, PPQRY_BPRUO, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, MyGlb.PANEL_LIST, 140, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, MyGlb.PANEL_LIST, "CAP.");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, MyGlb.PANEL_FORM, 436, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_CAPITOLO, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_CAPITOLO, PPQRY_BPRUO, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, MyGlb.PANEL_LIST, 180, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_ARTICOLO, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_ARTICOLO, PPQRY_BPRUO, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, MyGlb.PANEL_LIST, 196, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, MyGlb.PANEL_LIST, "Stanziamenti Totale");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, MyGlb.PANEL_FORM, 4, 100, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZITOTALE, MyGlb.PANEL_FORM, "Stanziamenti Totale");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STANZITOTALE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STANZITOTALE, PPQRY_BPRUO, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, MyGlb.PANEL_LIST, 296, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, MyGlb.PANEL_LIST, 88);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, MyGlb.PANEL_LIST, "Stanziamenti Sviluppo");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZISVILUP, MyGlb.PANEL_FORM, "Stanziamenti Sviluppo");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STANZISVILUP, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STANZISVILUP, PPQRY_BPRUO, "A.STN_INI_CO_SVIL", "STN_INI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, MyGlb.PANEL_LIST, 396, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, MyGlb.PANEL_LIST, "Stanziamenti Consolidato");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, MyGlb.PANEL_FORM, 236, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, MyGlb.PANEL_FORM, 112);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZICONSOL, MyGlb.PANEL_FORM, "Stanziam. Consol.");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STANZICONSOL, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STANZICONSOL, PPQRY_BPRUO, "A.STN_INI_CO_CONS", "STN_INI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, MyGlb.PANEL_LIST, 496, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, MyGlb.PANEL_LIST, 68);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, MyGlb.PANEL_LIST, "Previsione Totale");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, MyGlb.PANEL_FORM, 4, 76, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTAL1, MyGlb.PANEL_FORM, "Previsione Totale");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVISTOTAL1, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVISTOTAL1, PPQRY_BPRUO, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, MyGlb.PANEL_LIST, 596, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, MyGlb.PANEL_LIST, 92);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, MyGlb.PANEL_LIST, "Previsione Sviluppo");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, MyGlb.PANEL_FORM, 412, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, MyGlb.PANEL_FORM, 104);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISSVILUP, MyGlb.PANEL_FORM, "Previs. Sviluppo");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVISSVILUP, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVISSVILUP, PPQRY_BPRUO, "A.PREVISIONE_SVIL", "PREVISIONE_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, MyGlb.PANEL_LIST, 696, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, MyGlb.PANEL_LIST, 100);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, MyGlb.PANEL_LIST, "Previsione Consolidato");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, MyGlb.PANEL_FORM, 220, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, MyGlb.PANEL_FORM, 112);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISCONSOL, MyGlb.PANEL_FORM, "Previs. Consol.");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVISCONSOL, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVISCONSOL, PPQRY_BPRUO, "A.PREVISIONE_CONS", "PREVISIONE_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, MyGlb.PANEL_LIST, 796, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, MyGlb.PANEL_LIST, 92);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, MyGlb.PANEL_LIST, "Imp Acc Ult Chiuso Totale");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, MyGlb.PANEL_FORM, 412, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, MyGlb.PANEL_FORM, 104);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHTO, MyGlb.PANEL_FORM, "I. Ac. Ul. Ch. Tot.");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMPACCULCHTO, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMPACCULCHTO, PPQRY_BPRUO, "A.IMP_ULT_CHIUSO", "IMP_ULT_CHIUSO", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, MyGlb.PANEL_LIST, 896, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, MyGlb.PANEL_LIST, 116);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, MyGlb.PANEL_LIST, "Imp Acc Ult Chiuso Sviluppo");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, MyGlb.PANEL_FORM, 220, 52, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, MyGlb.PANEL_FORM, 128);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHSV, MyGlb.PANEL_FORM, "Imp Acc Ult Ch. Svil.");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMPACCULCHSV, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMPACCULCHSV, PPQRY_BPRUO, "A.IMP_ULT_CHIUSO_SVIL", "IMP_ULT_CHIUSO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, MyGlb.PANEL_LIST, 996, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, MyGlb.PANEL_LIST, 120);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, MyGlb.PANEL_LIST, "Imp Acc Ult Chiuso Consolidato");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPACCULCHCO, MyGlb.PANEL_FORM, "Imp Acc Ult Ch. Consol.");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMPACCULCHCO, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMPACCULCHCO, PPQRY_BPRUO, "A.IMP_ULT_CHIUSO_CONS", "IMP_ULT_CHIUSO_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, MyGlb.PANEL_LIST, 1096, 96, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, MyGlb.PANEL_LIST, 76);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, MyGlb.PANEL_LIST, "Impegnabile");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, MyGlb.PANEL_FORM, 220, 196, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, MyGlb.PANEL_FORM, 88);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPEGNABILE, MyGlb.PANEL_FORM, "Impegnabile");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMPEGNABILE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMPEGNABILE, PPQRY_BPRUO, "A.IMPEGNABILE", "IMPEGNABILE", 3, 14, 2, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, MyGlb.PANEL_LIST, 0, 120, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_ESERCIZIO, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_ESERCIZIO, PPQRY_BPRUO, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, MyGlb.PANEL_LIST, 0, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, MyGlb.PANEL_LIST, 24);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, MyGlb.PANEL_LIST, "E S");
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, MyGlb.PANEL_FORM, 4, 244, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, MyGlb.PANEL_FORM, 24);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ES, MyGlb.PANEL_FORM, "E S");
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_ES, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_ES, PPQRY_BPRUO, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, MyGlb.PANEL_LIST, 16, 8, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, MyGlb.PANEL_FORM, 16, 8, 156, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ESTVOCPEGLAB, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_ESTVOCPEGLAB, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_ESTVOCPEGLAB, -1, "", "ESTVOCPEGLAB", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, MyGlb.PANEL_LIST, 196, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, MyGlb.PANEL_FORM, 108, 332, 80, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOTOTAL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STINICOTOTAL, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STINICOTOTAL, -1, "", "STINICOTOTAL", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, MyGlb.PANEL_LIST, 296, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, MyGlb.PANEL_FORM, 400, 320, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOSVITO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STINICOSVITO, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STINICOSVITO, -1, "", "STINICOSVITO", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, MyGlb.PANEL_LIST, 396, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, MyGlb.PANEL_FORM, 216, 336, 40, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STINICOCONTO, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STINICOCONTO, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STINICOCONTO, -1, "", "STINICOCONTO", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, MyGlb.PANEL_LIST, 496, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, MyGlb.PANEL_FORM, 72, 368, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISTOTALE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVISTOTALE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVISTOTALE, -1, "", "PREVISTOTALE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, MyGlb.PANEL_LIST, 596, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, MyGlb.PANEL_FORM, 260, 320, 72, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILTOTA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVSVILTOTA, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVSVILTOTA, -1, "", "PREVSVILTOTA", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, MyGlb.PANEL_LIST, 696, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, MyGlb.PANEL_FORM, 252, 352, 76, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSTOTA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVCONSTOTA, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVCONSTOTA, -1, "", "PREVCONSTOTA", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, MyGlb.PANEL_LIST, 796, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, MyGlb.PANEL_FORM, 472, 320, 32, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHITOT, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMPULTCHITOT, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMPULTCHITOT, -1, "", "IMPULTCHITOT", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, MyGlb.PANEL_LIST, 896, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, MyGlb.PANEL_FORM, 524, 324, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHSVTO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMPULTCHSVTO, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMPULTCHSVTO, -1, "", "IMPULTCHSVTO", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, MyGlb.PANEL_LIST, 996, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, MyGlb.PANEL_FORM, 584, 324, 12, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHCOTO, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMPULTCHCOTO, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMPULTCHCOTO, -1, "", "IMPULTCHCOTO", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, MyGlb.PANEL_LIST, 1096, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, MyGlb.PANEL_FORM, 676, 320, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPETOTALABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMPETOTALABE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMPETOTALABE, -1, "", "IMPETOTALABE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, MyGlb.PANEL_LIST, 196, 44, 100, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, MyGlb.PANEL_LIST, 3);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, MyGlb.PANEL_FORM, 192, 160, 76, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANENTRLABE, MyGlb.PANEL_FORM, 3);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STANENTRLABE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STANENTRLABE, -1, "", "STANENTRLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, MyGlb.PANEL_LIST, 296, 44, 100, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, MyGlb.PANEL_LIST, 3);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, MyGlb.PANEL_FORM, 192, 132, 44, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVENTRLABE, MyGlb.PANEL_FORM, 3);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVENTRLABE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVENTRLABE, -1, "", "PREVENTRLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, MyGlb.PANEL_LIST, 396, 44, 100, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, MyGlb.PANEL_LIST, 3);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, MyGlb.PANEL_FORM, 300, 140, 36, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_ACCULTCHENLA, MyGlb.PANEL_FORM, 3);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_ACCULTCHENLA, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_ACCULTCHENLA, -1, "", "ACCULTCHENLA", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, MyGlb.PANEL_LIST, 196, 68, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, MyGlb.PANEL_FORM, 96, 132, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANTOTALABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STANTOTALABE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STANTOTALABE, -1, "", "STANTOTALABE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, MyGlb.PANEL_LIST, 396, 68, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, MyGlb.PANEL_FORM, 180, 128, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANCONSLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STANCONSLABE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STANCONSLABE, -1, "", "STANCONSLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, MyGlb.PANEL_LIST, 296, 68, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, MyGlb.PANEL_FORM, 252, 128, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_SVILSPESLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_SVILSPESLABE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_SVILSPESLABE, -1, "", "SVILSPESLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, MyGlb.PANEL_LIST, 496, 68, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, MyGlb.PANEL_FORM, 96, 128, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVTOTALABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVTOTALABE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVTOTALABE, -1, "", "PREVTOTALABE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, MyGlb.PANEL_LIST, 696, 68, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, MyGlb.PANEL_FORM, 168, 132, 44, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVCONSLABE, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVCONSLABE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVCONSLABE, -1, "", "PREVCONSLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, MyGlb.PANEL_LIST, 596, 68, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, MyGlb.PANEL_FORM, 248, 136, 44, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVSVILLABE, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVSVILLABE, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVSVILLABE, -1, "", "PREVSVILLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, MyGlb.PANEL_LIST, 996, 68, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, MyGlb.PANEL_FORM, 484, 128, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHCOLA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMACULCHCOLA, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMACULCHCOLA, -1, "", "IMACULCHCOLA", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, MyGlb.PANEL_LIST, 896, 68, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, MyGlb.PANEL_FORM, 576, 136, 44, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHSVLA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMACULCHSVLA, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMACULCHSVLA, -1, "", "IMACULCHSVLA", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, MyGlb.PANEL_LIST, 796, 68, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, MyGlb.PANEL_FORM, 644, 136, 24, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOLA, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMACULCHTOLA, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMACULCHTOLA, -1, "", "IMACULCHTOLA", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, MyGlb.PANEL_LIST, 196, 44, 300, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, MyGlb.PANEL_FORM, 96, 72, 192, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STANZIALABEL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STANZIALABEL, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STANZIALABEL, -1, "", "STANZIALABEL", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, MyGlb.PANEL_LIST, 496, 44, 300, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, MyGlb.PANEL_FORM, 292, 72, 188, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PREVISILABEL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PREVISILABEL, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PREVISILABEL, -1, "", "PREVISILABEL", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, MyGlb.PANEL_LIST, 796, 44, 300, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, MyGlb.PANEL_FORM, 480, 72, 192, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMPULTCHILAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMPULTCHILAB, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMPULTCHILAB, -1, "", "IMPULTCHILAB", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, MyGlb.PANEL_LIST, 196, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, MyGlb.PANEL_FORM, 96, 348, 64, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_STATOTENTLAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_STATOTENTLAB, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_STATOTENTLAB, -1, "", "STATOTENTLAB", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, MyGlb.PANEL_LIST, 296, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, MyGlb.PANEL_FORM, 164, 348, 20, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_PRETOTENTLAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_PRETOTENTLAB, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_PRETOTENTLAB, -1, "", "PRETOTENTLAB", 0, 0, 0, -13997);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, MyGlb.PANEL_LIST, 396, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENUO.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, MyGlb.PANEL_FORM, 196, 348, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENUO_IMACULCHTOEL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENUO.SetFieldPage(PFL_STANZIAMENUO_IMACULCHTOEL, -1, -1);
    PAN_STANZIAMENUO.SetFieldPanel(PFL_STANZIAMENUO_IMACULCHTOEL, -1, "", "IMACULCHTOEL", 0, 0, 0, -13997);
  }

  private void PAN_STANZIAMENUO_InitQueries()
  {
    StringBuffer SQL;

    PAN_STANZIAMENUO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMESIMUL1.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMESIMUL1.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMESIMUL1.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMESIMUL1.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE ))) ");
    SQL.append("order by 2 ");
    PAN_STANZIAMENUO.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_STANZIAMENUO_PROGUNITORGA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMESIMUL1.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMESIMUL1.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMESIMUL1.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMESIMUL1.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE ))) ");
    SQL.append("order by 2 ");
    PAN_STANZIAMENUO.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_STANZIAMENUO_PROGUNITORGA, "");
    PAN_STANZIAMENUO.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZIAMENUO.SetIMDB(IMDB, "PQRY_BPRUO", true);
    PAN_STANZIAMENUO.set_SetString(MyGlb.MASTER_ROWNAME, "BIL UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMP_ULT_CHIUSO as IMP_ULT_CHIUSO, ");
    SQL.append("  A.IMP_ULT_CHIUSO_CONS as IMP_ULT_CHIUSO_CONS, ");
    SQL.append("  A.IMP_ULT_CHIUSO_SVIL as IMP_ULT_CHIUSO_SVIL, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.PREVISIONE_CONS as PREVISIONE_CONS, ");
    SQL.append("  A.PREVISIONE_SVIL as PREVISIONE_SVIL, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.STN_INI_CO_CONS as STN_INI_CO_CONS, ");
    SQL.append("  A.STN_INI_CO_SVIL as STN_INI_CO_SVIL, ");
    SQL.append("  A.IMPEGNABILE as IMPEGNABILE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA ");
    PAN_STANZIAMENUO.SetQuery(PPQRY_BPRUO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BPR_UO A ");
    PAN_STANZIAMENUO.SetQuery(PPQRY_BPRUO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMESIMUL1.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMESIMUL1.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMESIMUL1.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMESIMUL1.ROWNAMEARTIC~~) ");
    PAN_STANZIAMENUO.SetQuery(PPQRY_BPRUO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENUO.SetQuery(PPQRY_BPRUO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENUO.SetQuery(PPQRY_BPRUO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENUO.SetQuery(PPQRY_BPRUO, 5, SQL, -1, "");
    PAN_STANZIAMENUO.SetQueryDB(PPQRY_BPRUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZIAMENUO.SetMasterTable(0, "BPR_UO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STANZIAMENUO.Status() == 2)
    {
      int oldListQBE = PAN_STANZIAMENUO.iUseListQBE;
      PAN_STANZIAMENUO.iUseListQBE = 0;
      PAN_STANZIAMENUO.PanelCommand(Glb.PCM_SEARCH);
      PAN_STANZIAMENUO.PanelCommand(Glb.PCM_FIND);
      PAN_STANZIAMENUO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STANZIAMENUO) PAN_STANZIAMENUO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMENUO) PAN_STANZIAMENUO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STANZIAMENUO) PAN_STANZIAMENUO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMENUO) PAN_STANZIAMENUO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STANZIAMENUO) PAN_STANZIAMENUO_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_STANZIAMENUO) PAN_STANZIAMENUO_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_STANZIAMENUO) PAN_STANZIAMENUO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_STANZIAMENUO) PAN_STANZIAMENUO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
