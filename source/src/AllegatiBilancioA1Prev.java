// **********************************************
// Allegati Bilancio A1 Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AllegatiBilancioA1Prev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_A1RISAMMQUAC_SPESA = 0;

  private static int PFL_A1RISAMMQUAC_PROGRESSIVO = 0;
  private static int PFL_A1RISAMMQUAC_TIPOSTAMPA = 1;
  private static int PFL_A1RISAMMQUAC_ESERCIZIO = 2;
  private static int PFL_A1RISAMMQUAC_RAGGRUPPAMEN = 3;
  private static int PFL_A1RISAMMQUAC_S = 4;
  private static int PFL_A1RISAMMQUAC_CAPITOLSPESA = 5;
  private static int PFL_A1RISAMMQUAC_ARTICOLSPESA = 6;
  private static int PFL_A1RISAMMQUAC_SCELTACAPITO = 7;
  private static int PFL_A1RISAMMQUAC_DESCCAPISPES = 8;
  private static int PFL_A1RISAMMQUAC_E = 9;
  private static int PFL_A1RISAMMQUAC_CAPITOENTRAT = 10;
  private static int PFL_A1RISAMMQUAC_ARTICOENTRAT = 11;
  private static int PFL_A1RISAMMQUAC_IMPORTO1 = 12;
  private static int PFL_A1RISAMMQUAC_IMPORTO2 = 13;
  private static int PFL_A1RISAMMQUAC_IMPORTO3 = 14;
  private static int PFL_A1RISAMMQUAC_IMPORTO4 = 15;
  private static int PFL_A1RISAMMQUAC_IMPORTOTOT = 16;
  private static int PFL_A1RISAMMQUAC_IMPORTO5 = 17;
  private static int PFL_A1RISAMMQUAC_IMPORTO6 = 18;
  private static int PFL_A1RISAMMQUAC_IMPORTO7 = 19;
  private static int PFL_A1RISAMMQUAC_ORDINAMENTO = 20;
  private static int PFL_A1RISAMMQUAC_ETICHETOTALE = 21;
  private static int PFL_A1RISAMMQUAC_TOTALEIMPOR1 = 22;
  private static int PFL_A1RISAMMQUAC_TOTALEIMPOR2 = 23;
  private static int PFL_A1RISAMMQUAC_TOTALEIMPOR3 = 24;
  private static int PFL_A1RISAMMQUAC_TOTALEIMPOR4 = 25;
  private static int PFL_A1RISAMMQUAC_TOTALIMPOTOT = 26;
  private static int PFL_A1RISAMMQUAC_TOTALEIMPOR5 = 27;

  private static int PPQRY_PARBILALRIA5 = 0;

  private static int PPQRY_DUAL = 1;

  private static int PPQRY_ATTRIBUTICFA = 2;


  IDPanel PAN_A1RISAMMQUAC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI267(IMDB);
    //
    //
    Init_PQRY_PARBILALRIA5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI267(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI267, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI267, "TBL_PARAMETRI267");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI267,IMDBDef3.FLD_PARAMETRI267_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI267, 0);
  }

  private static void Init_PQRY_PARBILALRIA5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARBILALRIA5, 19);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARBILALRIA5, "PQRY_PARBILALRIA5");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_TIPO_STAMPA,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_RAGGRUPPAMENTO, "RAGGRUPPAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_RAGGRUPPAMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_S, "S");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_CAPITOLO_SPESA, "CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_CAPITOLO_SPESA,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_ARTICOLO_SPESA, "ARTICOLO_SPESA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_ARTICOLO_SPESA,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_DESCR_CAPITOLO_SPESA, "DESCR_CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_DESCR_CAPITOLO_SPESA,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_E, "E");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_E,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_CAPITOLO_ENTRATA, "CAPITOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_CAPITOLO_ENTRATA,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_ARTICOLO_ENTRATA, "ARTICOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_ARTICOLO_ENTRATA,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_4, "IMPORTO_4");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_4,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_5, "IMPORTO_5");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_5,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_6, "IMPORTO_6");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_6,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_7, "IMPORTO_7");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_7,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_PABIALRIAMOR, "PABIALRIAMOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA5,IMDBDef11.PQSL_PARBILALRIA5_PABIALRIAMOR,3,28,6);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARBILALRIA5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AllegatiBilancioA1Prev(MyWebEntryPoint w, IMDBObj imdb)
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
  public AllegatiBilancioA1Prev()
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
    FormIdx = MyGlb.FRM_ALLEBILA1PRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "219EFF4A-B8ED-4987-ADA1-A525F15FBA18";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 932;
    DesignHeight = 374;
    set_Caption(new IDVariant("A1 Ris. Amministrazione - Quote Accantonate"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 932;
    Frames[1].Height = 348;
    Frames[1].Caption = "A1 Ris. Amministrazione - Quote Accantonate";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_A1RISAMMQUAC = new IDPanel(w, this, 1, "PAN_A1RISAMMQUAC");
    Frames[1].Content = PAN_A1RISAMMQUAC;
    PAN_A1RISAMMQUAC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_A1RISAMMQUAC.VS = MainFrm.VisualStyleList;
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 932-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FCB195D2-E1FA-47FC-AA9B-A6D973BEEFB2");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1420, 232, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_A1RISAMMQUAC.InitStatus = 2;
    PAN_A1RISAMMQUAC_Init();
    PAN_A1RISAMMQUAC_InitFields();
    PAN_A1RISAMMQUAC_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA28+BaseCmdLinIdx)
      {
        Stampa();
        break fine;
      }
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
      PAN_A1RISAMMQUAC.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_A1RISAMMQUAC.FrIndex)
    {
      if (IdxFieldActived ==PFL_A1RISAMMQUAC_SCELTACAPITO) {
      }
    }
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
    return (obj instanceof AllegatiBilancioA1Prev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AllegatiBilancioA1Prev.class.getName() : (Glb.ClassWithPackage(AllegatiBilancioA1Prev.class) ? AllegatiBilancioA1Prev.class.getName().substring(AllegatiBilancioA1Prev.class.getPackage().getName().length() + 1) : AllegatiBilancioA1Prev.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      IDVariant v_TOOLTISTAMPA = new IDVariant(0,IDVariant.STRING);
      v_TOOLTISTAMPA = (new IDVariant("A1 Ris. Amministrazione - Quote Accantonate"));
      SettaCaptionA1();
      PAN_A1RISAMMQUAC.SetFlags (Glb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      MainFrm.CmdObj.set_CmdToolTip(MyGlb.CMD_STAMPA28+BaseCmdLinIdx, new IDVariant(v_TOOLTISTAMPA).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "Load", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_CAPITOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_ARTICOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "EndModal", _e);
    }
  }

  // **********************************************************************
  // A1 Ris. Amministrazione - Quote Accantonate On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_A1RISAMMQUAC_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_A1RISAMMQUAC);
      // 
      // A1 Ris. Amministrazione - Quote Accantonate On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_A1RISAMMQUAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_RAGGRUPPAMEN,(new IDVariant(PAN_A1RISAMMQUAC.FieldText(PFL_A1RISAMMQUAC_RAGGRUPPAMEN))).stringValue()); 
      PAN_A1RISAMMQUAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_DESCCAPISPES,(new IDVariant(PAN_A1RISAMMQUAC.FieldText(PFL_A1RISAMMQUAC_DESCCAPISPES))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "A1Ris.Amministrazione-QuoteAccantonateOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // A1 Ris. Amministrazione - Quote Accantonate On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_A1RISAMMQUAC_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A1 Ris. Amministrazione - Quote Accantonate On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_PROGRESSIVO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_TIPO_STAMPA, 0, (new IDVariant("A1RISAMMPREV")));
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_S, 0, (new IDVariant("S")));
      }
      if ((Column.equals((new IDVariant(PFL_A1RISAMMQUAC_CAPITOLSPESA)), true) || Column.equals((new IDVariant(PFL_A1RISAMMQUAC_ARTICOLSPESA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_CAPITOLO_SPESA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_ARTICOLO_SPESA, 0))))
        {
          if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("S")), IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_CAPITOLO_SPESA, 0), IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_ARTICOLO_SPESA, 0)).equals((new IDVariant(-1)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Capitolo non presente in bilancio", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_CAPITOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_ARTICOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_DESCR_CAPITOLO_SPESA, 0, (new IDVariant()));
          }
          else
          {
            IDVariant v_VCAPDESCRIZI = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
            SQL.append("from ");
            SQL.append("  CAP A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = 'S') ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_CAPITOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_ARTICOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCAPDESCRIZI = QV.Get("CAPDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_DESCR_CAPITOLO_SPESA, 0, new IDVariant(v_VCAPDESCRIZI));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_A1RISAMMQUAC_IMPORTO1)), true) || Column.equals((new IDVariant(PFL_A1RISAMMQUAC_IMPORTO2)), true) || Column.equals((new IDVariant(PFL_A1RISAMMQUAC_IMPORTO3)), true) || Column.equals((new IDVariant(PFL_A1RISAMMQUAC_IMPORTO4)), true) || Column.equals((new IDVariant(PFL_A1RISAMMQUAC_IMPORTO5)), true)) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_1, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_2, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_3, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_3, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_4, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_4, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_5, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_5, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        CalcolaTotali();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "A1Ris.Amministrazione-QuoteAccantonateOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // A1 Ris. Amministrazione - Quote Accantonate After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_A1RISAMMQUAC_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A1 Ris. Amministrazione - Quote Accantonate After Find Body
      // Corpo Procedura
      // 
      CalcolaTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "A1Ris.Amministrazione-QuoteAccantonateAfterFind", _e);
    }
  }

  // **********************************************************************
  // A1 Ris. Amministrazione - Quote Accantonate After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_A1RISAMMQUAC_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A1 Ris. Amministrazione - Quote Accantonate After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_A1RISAMMQUAC.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "A1Ris.Amministrazione-QuoteAccantonateAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Setta Caption A1
  // **********************************************************************
  public int SettaCaptionA1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Caption A1 Body
      // Corpo Procedura
      // 
      IDVariant v_CAPTIOIMPOR1 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR1 = (new IDVariant("Risorse accantonate al 1/1/"));
      IDVariant v_CAPTIOIMPOR2 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR2 = (new IDVariant("Risorse Accantonate Applicate "));
      IDVariant v_TOOLTIIMPOR2 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR2 = (new IDVariant("Risorse Accantonate Applicate al Bilancio "));
      IDVariant v_TOOLT2IMPOR2 = new IDVariant(0,IDVariant.STRING);
      v_TOOLT2IMPOR2 = (new IDVariant("(con segno -1) (b)"));
      IDVariant v_CAPTIOIMPOR3 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR3 = (new IDVariant("Risorse Accantonate Stanziate "));
      IDVariant v_TOOLTIIMPOR3 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR3 = (new IDVariant("Risorse accantonate stanziate nella spesa del bilancio "));
      IDVariant v_CAPTIOIMPOR4 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR4 = (new IDVariant("Var. accant. previste in rendiconto "));
      IDVariant v_TOOLTIIMPOR4 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR4 = (new IDVariant("Variazione accantonamenti che si prevede di effettuare in sede di rendiconto "));
      IDVariant v_TOOLT2IMPOR4 = new IDVariant(0,IDVariant.STRING);
      v_TOOLT2IMPOR4 = (new IDVariant(" (con segno +/-) (d)"));
      IDVariant v_CAPTIIMPOTOT = new IDVariant(0,IDVariant.STRING);
      v_CAPTIIMPOTOT = (new IDVariant("Risorse Accantonate al 31/12/"));
      IDVariant v_TOOLTIMPOTOT = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIMPOTOT = (new IDVariant("Risorse accantonate nel risultato di amministrazione al 31/12/"));
      IDVariant v_TOOL2IMPOTOT = new IDVariant(0,IDVariant.STRING);
      v_TOOL2IMPOTOT = (new IDVariant("(e)=(a)+(b)+(c)+(d)"));
      IDVariant v_CAPTIOIMPOR5 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR5 = (new IDVariant("Ris. Acc. presunte al 31/12/"));
      IDVariant v_CAPTI2IMPOR5 = new IDVariant(0,IDVariant.STRING);
      v_CAPTI2IMPOR5 = (new IDVariant(" applic. al primo esercizio prev"));
      IDVariant v_TOOLTIIMPOR5 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR5 = (new IDVariant("Risorse accantonate presunte al 31/12/"));
      IDVariant v_TOOLT2IMPOR5 = new IDVariant(0,IDVariant.STRING);
      v_TOOLT2IMPOR5 = (new IDVariant(" applicate al primo esercizio del bilancio di previsione"));
      PAN_A1RISAMMQUAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO1, IDL.Add(v_CAPTIOIMPOR1, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A1RISAMMQUAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO1,IDL.Add(IDL.Add(IDL.Add(v_CAPTIOIMPOR1, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" "))), (new IDVariant("(a)"))).stringValue()); 
      PAN_A1RISAMMQUAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO2, IDL.Add(v_CAPTIOIMPOR2, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A1RISAMMQUAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO2,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR2, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" "))), v_TOOLT2IMPOR2).stringValue()); 
      PAN_A1RISAMMQUAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO3, IDL.Add(v_CAPTIOIMPOR3, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A1RISAMMQUAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO3,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR3, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" "))), (new IDVariant("(c)"))).stringValue()); 
      PAN_A1RISAMMQUAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO4, IDL.Add(v_CAPTIOIMPOR4, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A1RISAMMQUAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO4,IDL.Add(IDL.Add(v_TOOLTIIMPOR4, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLT2IMPOR4).stringValue()); 
      PAN_A1RISAMMQUAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTOTOT, IDL.Add(v_CAPTIIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A1RISAMMQUAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTOTOT,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" "))), v_TOOL2IMPOTOT).stringValue()); 
      PAN_A1RISAMMQUAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO5, IDL.Add(IDL.Add(v_CAPTIOIMPOR5, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_CAPTI2IMPOR5).stringValue());
      PAN_A1RISAMMQUAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMQUAC_IMPORTO5,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR5, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" "))), v_TOOLT2IMPOR5).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "SettaCaptionA1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Capitolo
  // **********************************************************************
  public int SceltaCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Capitolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "SceltaCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Totali
  // **********************************************************************
  public int CalcolaTotali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcola Totali Body
      // Corpo Procedura
      // 
      PAN_A1RISAMMQUAC.set_FieldText(PFL_A1RISAMMQUAC_TOTALIMPOTOT, IDL.Format(PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTOTOT), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMQUAC.set_FieldText(PFL_A1RISAMMQUAC_TOTALEIMPOR1, IDL.Format(PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTO1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMQUAC.set_FieldText(PFL_A1RISAMMQUAC_TOTALEIMPOR2, IDL.Format(PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTO2), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMQUAC.set_FieldText(PFL_A1RISAMMQUAC_TOTALEIMPOR3, IDL.Format(PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTO3), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMQUAC.set_FieldText(PFL_A1RISAMMQUAC_TOTALEIMPOR4, IDL.Format(PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTO4), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMQUAC.set_FieldText(PFL_A1RISAMMQUAC_TOTALIMPOTOT, IDL.Format(IDL.Add(IDL.Add(IDL.Add(PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTO1), PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTO2)), PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTO3)), PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTO4)), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMQUAC.set_FieldText(PFL_A1RISAMMQUAC_TOTALEIMPOR5, IDL.Format(PAN_A1RISAMMQUAC.GetFieldSum(PFL_A1RISAMMQUAC_IMPORTO5), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "CalcolaTotali", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_A1RISAMMQUAC.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARANOTESTAM, 0), (new IDVariant()));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
        v_PAR1 = (new IDVariant("SESSIONE"));
        IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
        v_PAR2 = (new IDVariant("ESERCIZIO"));
        MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Prev", "Stampa", _e);
      return -1;
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_A1RISAMMQUAC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_A1RISAMMQUAC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_A1RISAMMQUAC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_A1RISAMMQUAC, Cancel);
    // Stub
  }

  private void PAN_A1RISAMMQUAC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_A1RISAMMQUAC_SCELTACAPITO)
    {
      this.IdxPanelActived = this.PAN_A1RISAMMQUAC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_A1RISAMMQUAC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_A1RISAMMQUAC_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_A1RISAMMQUAC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_S, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_S, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_E, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_E, 0, (new IDVariant("E")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_1, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_1, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_2, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_2, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_3, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_3, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_4, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_4, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_5, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_5, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_6, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_6, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_7, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA5, IMDBDef11.PQSL_PARBILALRIA5_IMPORTO_7, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_A1RISAMMQUAC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_A1RISAMMQUAC_Init()
  {

    PAN_A1RISAMMQUAC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_A1RISAMMQUAC.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, "0986889D-0B9E-4296-B007-45BBE82B6ECE");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, "Spesa");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, MyGlb.VIS_GROUPSTYLE);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, MyGlb.PANEL_LIST, 220, -9999, 432, 21, 0, 0);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, MyGlb.PANEL_FORM, 0, 27, 588, 349, 0, 0);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, 0, 34);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, 1, 13);
    PAN_A1RISAMMQUAC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, 0, 4);
    PAN_A1RISAMMQUAC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, 1, 4);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_GROUP, GRP_A1RISAMMQUAC_SPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_A1RISAMMQUAC.SetSize(MyGlb.OBJ_FIELD, 28);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, "BBFBBDE8-8A5C-4DBA-A2D0-06E91082DE4D");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, "PROGRESSIVO");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, "24E8B809-18EB-4EE4-9315-880BABADDB54");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, "TIPO STAMPA");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, MyGlb.VIS_NONNULLAFIEL);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, 0, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, "6F65883F-479F-4D57-A46D-A081DA5E58AE");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, "ESERCIZIO");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, 0, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, "3790FA37-1088-4CCC-A45F-7BCC70C4490D");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, "Fondo Accantonamento");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, "53CDD1D6-FB38-4C89-B9F0-313DA999916D");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, "S");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, "74863DCE-BBD9-423A-818D-2642F54055DA");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, "Capitolo");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, MyGlb.VIS_NORFIEINTLUN);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, "13EF7CE6-5D74-40B3-B7A8-6999211D50CB");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, "Art.");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, "870E5758-0AC8-4AEA-915F-EEA112474F32");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, " ");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, MyGlb.VIS_HYPELINKIMMA);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, "F8CD1F6D-5324-4BC9-BBE4-19805A0F0B8C");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, "Descrizione");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, MyGlb.VIS_NORMALFIELDS);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, "02AA0E21-EDF2-43D6-91DB-7E9DB8CD6193");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, "E");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, "8FD3DA91-0AB5-4739-A954-AAB565E43F20");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, "CAPITOLO ENTRATA");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, "C47A377A-9E38-427C-89CD-9F87DBFE442E");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, "ARTICOLO ENTRATA");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, "260F433B-01B6-4CF9-BC97-B965B2106B0A");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, "IMPORTO 1");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, "8CCC9C40-1218-486B-9344-E6EDCBA610DB");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, "IMPORTO 2");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, "0059BEB3-69D7-4564-B9E2-F40377B9468D");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, "IMPORTO 3");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, "B9D8FEB1-722C-44B4-BB23-51C34BDE3CB4");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, "IMPORTO 4");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, "7FDBD714-821B-4BC6-9A69-8614CEF956B2");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, "IMPORTO TOT");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, "B5B21BE7-A709-4907-A184-089A1742F08A");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, "IMPORTO 5");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, "7A06C11A-266B-4F4A-B920-82EEFBBBE52F");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, "IMPORTO 6");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, "BC10F8B7-02F6-468C-90C0-5D99CFBC497B");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, "IMPORTO 7");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, "8BEE0553-6079-4D12-B752-677330B811C4");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, "Ordinamento");
    PAN_A1RISAMMQUAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, "4F7FE7D7-43A1-48B1-A3EB-98646340F870");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, "Totale");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, MyGlb.VIS_VUOTONORMALE);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, "A85C085C-FEB5-4701-BD5D-B5643908AE09");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, "44BC50D4-9F98-43D1-A8B3-9F9A16FD164C");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, "E9037D5C-6728-4EC9-8BBE-4B2E2716EB3D");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, "0F0931A4-E360-417C-8C88-4B6D771F2D82");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, "82FF0357-4F56-4EC0-A27D-989C7B361DE3");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMQUAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, "3980A6B7-2E2C-46B7-9D46-7E6F17F67CE0");
    PAN_A1RISAMMQUAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, "");
    PAN_A1RISAMMQUAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMQUAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_A1RISAMMQUAC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_PROGRESSIVO, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_PROGRESSIVO, PPQRY_PARBILALRIA5, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 52, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, MyGlb.PANEL_LIST, 88);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, MyGlb.PANEL_LIST, "TIPO STAMPA");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, MyGlb.PANEL_FORM, 188, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, MyGlb.PANEL_FORM, 104);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TIPOSTAMPA, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_TIPOSTAMPA, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_TIPOSTAMPA, PPQRY_PARBILALRIA5, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 20, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, MyGlb.PANEL_LIST, 0, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_ESERCIZIO, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_ESERCIZIO, PPQRY_PARBILALRIA5, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 0, 52, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 116);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, MyGlb.PANEL_LIST, "Fondo Accantonamento");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 228, 28, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 120);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, MyGlb.PANEL_FORM, "Fon. Accanton.");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_RAGGRUPPAMEN, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_RAGGRUPPAMEN, PPQRY_PARBILALRIA5, "A.RAGGRUPPAMENTO", "RAGGRUPPAMENTO", 5, 20, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, MyGlb.PANEL_LIST, 96, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, MyGlb.PANEL_LIST, 16);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, MyGlb.PANEL_LIST, "S");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, MyGlb.PANEL_FORM, 492, 28, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, MyGlb.PANEL_FORM, 32);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_S, MyGlb.PANEL_FORM, "S");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_S, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_S, PPQRY_PARBILALRIA5, "A.S", "S", 5, 1, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, MyGlb.PANEL_LIST, 220, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, MyGlb.PANEL_LIST, "Capitolo");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOLSPESA, MyGlb.PANEL_FORM, "Capitolo");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_CAPITOLSPESA, -1, GRP_A1RISAMMQUAC_SPESA);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_CAPITOLSPESA, PPQRY_PARBILALRIA5, "A.CAPITOLO_SPESA", "CAPITOLO_SPESA", 3, 16, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, MyGlb.PANEL_LIST, 332, 52, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, MyGlb.PANEL_LIST, "Art.");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, MyGlb.PANEL_FORM, 228, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, MyGlb.PANEL_FORM, 120);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOLSPESA, MyGlb.PANEL_FORM, "Art.");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_ARTICOLSPESA, -1, GRP_A1RISAMMQUAC_SPESA);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_ARTICOLSPESA, PPQRY_PARBILALRIA5, "A.ARTICOLO_SPESA", "ARTICOLO_SPESA", 1, 2, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, MyGlb.PANEL_LIST, 364, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, MyGlb.PANEL_LIST, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, MyGlb.PANEL_LIST, " ");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, MyGlb.PANEL_FORM, 4, 304, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_SCELTACAPITO, MyGlb.PANEL_FORM, " ");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_SCELTACAPITO, -1, GRP_A1RISAMMQUAC_SPESA);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_SCELTACAPITO, PPQRY_DUAL, "'A'", "SCELTACAPITO", 5, 1, 0, -13997);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_A1RISAMMQUAC.SetValueListItem(PFL_A1RISAMMQUAC_SCELTACAPITO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, MyGlb.PANEL_LIST, 388, 52, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, MyGlb.PANEL_LIST, 144);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, MyGlb.PANEL_LIST, "Descrizione");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, MyGlb.PANEL_FORM, 4, 328, 580, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, MyGlb.PANEL_FORM, 144);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, MyGlb.PANEL_FORM, 2);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_DESCCAPISPES, MyGlb.PANEL_FORM, "Descrizione");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_DESCCAPISPES, -1, GRP_A1RISAMMQUAC_SPESA);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_DESCCAPISPES, PPQRY_PARBILALRIA5, "A.DESCR_CAPITOLO_SPESA", "DESCR_CAPITOLO_SPESA", 5, 500, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, MyGlb.PANEL_LIST, 176, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, MyGlb.PANEL_LIST, 16);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, MyGlb.PANEL_LIST, "E");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_E, MyGlb.PANEL_FORM, "E");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_E, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_E, PPQRY_PARBILALRIA5, "A.E", "E", 5, 1, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, MyGlb.PANEL_LIST, 176, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, MyGlb.PANEL_LIST, "CAP. ENTR.");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, MyGlb.PANEL_FORM, 188, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_CAPITOENTRAT, MyGlb.PANEL_FORM, "CAPITOLO ENTRATA");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_CAPITOENTRAT, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_CAPITOENTRAT, PPQRY_PARBILALRIA5, "A.CAPITOLO_ENTRATA", "CAPITOLO_ENTRATA", 3, 16, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, MyGlb.PANEL_LIST, 176, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, MyGlb.PANEL_LIST, "ART. ENTR.");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, MyGlb.PANEL_FORM, 380, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ARTICOENTRAT, MyGlb.PANEL_FORM, "ARTICOLO ENTRATA");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_ARTICOENTRAT, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_ARTICOENTRAT, PPQRY_PARBILALRIA5, "A.ARTICOLO_ENTRATA", "ARTICOLO_ENTRATA", 1, 2, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, MyGlb.PANEL_LIST, 652, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO1, MyGlb.PANEL_FORM, "IMPORTO 1");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_IMPORTO1, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_IMPORTO1, PPQRY_PARBILALRIA5, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, MyGlb.PANEL_LIST, 780, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, MyGlb.PANEL_FORM, 4, 172, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO2, MyGlb.PANEL_FORM, "IMPORTO 2");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_IMPORTO2, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_IMPORTO2, PPQRY_PARBILALRIA5, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, MyGlb.PANEL_LIST, 908, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, MyGlb.PANEL_FORM, 4, 196, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO3, MyGlb.PANEL_FORM, "IMPORTO 3");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_IMPORTO3, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_IMPORTO3, PPQRY_PARBILALRIA5, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, MyGlb.PANEL_LIST, 1036, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, MyGlb.PANEL_LIST, "IMPORTO 4");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO4, MyGlb.PANEL_FORM, "IMPORTO 4");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_IMPORTO4, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_IMPORTO4, PPQRY_PARBILALRIA5, "A.IMPORTO_4", "IMPORTO_4", 3, 14, 2, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, MyGlb.PANEL_LIST, 1164, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, MyGlb.PANEL_LIST, 80);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, MyGlb.PANEL_LIST, "IMPORTO TOT");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, MyGlb.PANEL_FORM, 4, 280, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, MyGlb.PANEL_FORM, 80);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTOTOT, MyGlb.PANEL_FORM, "IMP. TOT");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_IMPORTOTOT, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_IMPORTOTOT, PPQRY_DUAL, "~~IMPORTO_1~~ + ~~IMPORTO_2~~ + ~~IMPORTO_3~~ + ~~IMPORTO_4~~", "IMPORTO5", 3, 28, 6, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, MyGlb.PANEL_LIST, 1292, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, MyGlb.PANEL_LIST, "IMPORTO 5");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, MyGlb.PANEL_FORM, 4, 244, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO5, MyGlb.PANEL_FORM, "IMPORTO 5");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_IMPORTO5, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_IMPORTO5, PPQRY_PARBILALRIA5, "A.IMPORTO_5", "IMPORTO_5", 3, 14, 2, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, MyGlb.PANEL_LIST, 496, 52, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, MyGlb.PANEL_LIST, "IMPORTO 6");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO6, MyGlb.PANEL_FORM, "IMPORTO 6");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_IMPORTO6, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_IMPORTO6, PPQRY_PARBILALRIA5, "A.IMPORTO_6", "IMPORTO_6", 3, 14, 2, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, MyGlb.PANEL_LIST, 496, 52, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, MyGlb.PANEL_LIST, "IMPORTO 7");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, MyGlb.PANEL_FORM, 396, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, MyGlb.PANEL_FORM, 88);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_IMPORTO7, MyGlb.PANEL_FORM, "IMPORTO 7");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_IMPORTO7, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_IMPORTO7, PPQRY_PARBILALRIA5, "A.IMPORTO_7", "IMPORTO_7", 3, 14, 2, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 52, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, MyGlb.PANEL_FORM, 4, 304, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_ORDINAMENTO, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldUnbound(PFL_A1RISAMMQUAC_ORDINAMENTO, true);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_ORDINAMENTO, PPQRY_PARBILALRIA5, "B.SEQUENZA", "PABIALRIAMOR", 3, 28, 6, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, MyGlb.PANEL_LIST, 572, 240, 76, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, MyGlb.PANEL_FORM, 568, 252, 76, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_ETICHETOTALE, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, MyGlb.PANEL_LIST, 652, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, MyGlb.PANEL_FORM, 656, 248, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR1, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_TOTALEIMPOR1, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_TOTALEIMPOR1, -1, "", "TOTALEIMPOR1", 0, 0, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, MyGlb.PANEL_LIST, 780, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, MyGlb.PANEL_FORM, 664, 256, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR2, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_TOTALEIMPOR2, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_TOTALEIMPOR2, -1, "", "TOTALEIMPOR2", 0, 0, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, MyGlb.PANEL_LIST, 908, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, MyGlb.PANEL_FORM, 672, 264, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR3, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_TOTALEIMPOR3, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_TOTALEIMPOR3, -1, "", "TOTALEIMPOR3", 0, 0, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1036, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, MyGlb.PANEL_FORM, 680, 272, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR4, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_TOTALEIMPOR4, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_TOTALEIMPOR4, -1, "", "TOTALEIMPOR4", 0, 0, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, MyGlb.PANEL_LIST, 1164, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, MyGlb.PANEL_FORM, 688, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALIMPOTOT, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_TOTALIMPOTOT, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_TOTALIMPOTOT, -1, "", "TOTALIMPOTOT", 0, 0, 0, -13997);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1292, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMQUAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, MyGlb.PANEL_FORM, 688, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMQUAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMQUAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMQUAC_TOTALEIMPOR5, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMQUAC.SetFieldPage(PFL_A1RISAMMQUAC_TOTALEIMPOR5, -1, -1);
    PAN_A1RISAMMQUAC.SetFieldPanel(PFL_A1RISAMMQUAC_TOTALEIMPOR5, -1, "", "TOTALEIMPOR5", 0, 0, 0, -13997);
  }

  private void PAN_A1RISAMMQUAC_InitQueries()
  {
    StringBuffer SQL;

    PAN_A1RISAMMQUAC.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~IMPORTO_1~~ + ~~IMPORTO_2~~ + ~~IMPORTO_3~~ + ~~IMPORTO_4~~ as IMPORTO5, ");
    SQL.append("  'A' as SCELTACAPITO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_A1RISAMMQUAC.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_A1RISAMMQUAC.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A1RISAMMQUAC.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.CODICE = ~~RAGGRUPPAMENTO~~) ");
    SQL.append("and   (A.TIPO = 'FACCAPREV1') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_A1RISAMMQUAC.SetQuery(PPQRY_ATTRIBUTICFA, 0, SQL, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.TIPO = 'FACCAPREV1') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_A1RISAMMQUAC.SetQuery(PPQRY_ATTRIBUTICFA, 1, SQL, PFL_A1RISAMMQUAC_RAGGRUPPAMEN, "");
    PAN_A1RISAMMQUAC.SetQueryDB(PPQRY_ATTRIBUTICFA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A1RISAMMQUAC.SetIMDB(IMDB, "PQRY_PARBILALRIA5", true);
    PAN_A1RISAMMQUAC.set_SetString(MyGlb.MASTER_ROWNAME, "PARAM BIL ALL RIS AMM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.RAGGRUPPAMENTO as RAGGRUPPAMENTO, ");
    SQL.append("  A.S as S, ");
    SQL.append("  A.CAPITOLO_SPESA as CAPITOLO_SPESA, ");
    SQL.append("  A.ARTICOLO_SPESA as ARTICOLO_SPESA, ");
    SQL.append("  A.DESCR_CAPITOLO_SPESA as DESCR_CAPITOLO_SPESA, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.CAPITOLO_ENTRATA as CAPITOLO_ENTRATA, ");
    SQL.append("  A.ARTICOLO_ENTRATA as ARTICOLO_ENTRATA, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1, ");
    SQL.append("  A.IMPORTO_2 as IMPORTO_2, ");
    SQL.append("  A.IMPORTO_3 as IMPORTO_3, ");
    SQL.append("  A.IMPORTO_4 as IMPORTO_4, ");
    SQL.append("  A.IMPORTO_5 as IMPORTO_5, ");
    SQL.append("  A.IMPORTO_6 as IMPORTO_6, ");
    SQL.append("  A.IMPORTO_7 as IMPORTO_7, ");
    SQL.append("  B.SEQUENZA as PABIALRIAMOR ");
    PAN_A1RISAMMQUAC.SetQuery(PPQRY_PARBILALRIA5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAM_BIL_ALL_RIS_AMM A, ");
    SQL.append("  ATTRIBUTI_CFA B ");
    PAN_A1RISAMMQUAC.SetQuery(PPQRY_PARBILALRIA5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CODICE = A.RAGGRUPPAMENTO) ");
    SQL.append("and   (B.TIPO = 'FACCAPREV1') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(B.ESERCIZIO_DA, 1900) AND NVL(B.ESERCIZIO_A, 2999))) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'A1RISAMMPREV') ");
    PAN_A1RISAMMQUAC.SetQuery(PPQRY_PARBILALRIA5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A1RISAMMQUAC.SetQuery(PPQRY_PARBILALRIA5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A1RISAMMQUAC.SetQuery(PPQRY_PARBILALRIA5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 19, 6, 7, 8 ");
    PAN_A1RISAMMQUAC.SetQuery(PPQRY_PARBILALRIA5, 5, SQL, -1, "");
    PAN_A1RISAMMQUAC.SetQueryDB(PPQRY_PARBILALRIA5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A1RISAMMQUAC.SetMasterTable(0, "PARAM_BIL_ALL_RIS_AMM");
    PAN_A1RISAMMQUAC.AddToSortList(PFL_A1RISAMMQUAC_ORDINAMENTO, true);
    PAN_A1RISAMMQUAC.AddToSortList(PFL_A1RISAMMQUAC_CAPITOLSPESA, true);
    PAN_A1RISAMMQUAC.AddToSortList(PFL_A1RISAMMQUAC_ARTICOLSPESA, true);
    PAN_A1RISAMMQUAC.AddToSortList(PFL_A1RISAMMQUAC_DESCCAPISPES, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_A1RISAMMQUAC.Status() == 2)
    {
      int oldListQBE = PAN_A1RISAMMQUAC.iUseListQBE;
      PAN_A1RISAMMQUAC.iUseListQBE = 0;
      PAN_A1RISAMMQUAC.PanelCommand(Glb.PCM_SEARCH);
      PAN_A1RISAMMQUAC.PanelCommand(Glb.PCM_FIND);
      PAN_A1RISAMMQUAC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_A1RISAMMQUAC) PAN_A1RISAMMQUAC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_A1RISAMMQUAC) PAN_A1RISAMMQUAC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_A1RISAMMQUAC) PAN_A1RISAMMQUAC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_A1RISAMMQUAC) PAN_A1RISAMMQUAC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_A1RISAMMQUAC) PAN_A1RISAMMQUAC_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_A1RISAMMQUAC) PAN_A1RISAMMQUAC_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_A1RISAMMQUAC) PAN_A1RISAMMQUAC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
