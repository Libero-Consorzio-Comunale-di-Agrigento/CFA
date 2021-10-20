// **********************************************
// Allegati Bilancio A1 Cons
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AllegatiBilancioA1Cons extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_A1RISAMMRIAC_SPESA = 0;

  private static int PFL_A1RISAMMRIAC_PROGRESSIVO = 0;
  private static int PFL_A1RISAMMRIAC_TIPOSTAMPA = 1;
  private static int PFL_A1RISAMMRIAC_ESERCIZIO = 2;
  private static int PFL_A1RISAMMRIAC_RAGGRUPPAMEN = 3;
  private static int PFL_A1RISAMMRIAC_S = 4;
  private static int PFL_A1RISAMMRIAC_CAPITOLSPESA = 5;
  private static int PFL_A1RISAMMRIAC_ARTICOLSPESA = 6;
  private static int PFL_A1RISAMMRIAC_SCELTACAPITO = 7;
  private static int PFL_A1RISAMMRIAC_DESCCAPISPES = 8;
  private static int PFL_A1RISAMMRIAC_E = 9;
  private static int PFL_A1RISAMMRIAC_CAPITOENTRAT = 10;
  private static int PFL_A1RISAMMRIAC_ARTICOENTRAT = 11;
  private static int PFL_A1RISAMMRIAC_IMPORTO1 = 12;
  private static int PFL_A1RISAMMRIAC_IMPORTO2 = 13;
  private static int PFL_A1RISAMMRIAC_IMPORTO3 = 14;
  private static int PFL_A1RISAMMRIAC_IMPORTO4 = 15;
  private static int PFL_A1RISAMMRIAC_IMPORTO8 = 16;
  private static int PFL_A1RISAMMRIAC_IMPORTO5 = 17;
  private static int PFL_A1RISAMMRIAC_IMPORTO6 = 18;
  private static int PFL_A1RISAMMRIAC_IMPORTO7 = 19;
  private static int PFL_A1RISAMMRIAC_ORDINAMENTO = 20;
  private static int PFL_A1RISAMMRIAC_ETICHETOTALE = 21;
  private static int PFL_A1RISAMMRIAC_TOTALEIMPOR1 = 22;
  private static int PFL_A1RISAMMRIAC_TOTALEIMPOR2 = 23;
  private static int PFL_A1RISAMMRIAC_TOTALEIMPOR3 = 24;
  private static int PFL_A1RISAMMRIAC_TOTALEIMPOR4 = 25;
  private static int PFL_A1RISAMMRIAC_TOTALEIMPOR5 = 26;

  private static int PPQRY_PARBILALRIA2 = 0;

  private static int PPQRY_DUAL = 1;

  private static int PPQRY_ATTRIBUTICFA = 2;


  IDPanel PAN_A1RISAMMRIAC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI278(IMDB);
    //
    //
    Init_PQRY_PARBILALRIA2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI278(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI278, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI278, "TBL_PARAMETRI278");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI278,IMDBDef3.FLD_PARAMETRI278_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI278, 0);
  }

  private static void Init_PQRY_PARBILALRIA2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARBILALRIA2, 19);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARBILALRIA2, "PQRY_PARBILALRIA2");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_TIPO_STAMPA,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_RAGGRUPPAMENTO, "RAGGRUPPAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_RAGGRUPPAMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_S, "S");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_CAPITOLO_SPESA, "CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_CAPITOLO_SPESA,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_ARTICOLO_SPESA, "ARTICOLO_SPESA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_ARTICOLO_SPESA,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_DESCR_CAPITOLO_SPESA, "DESCR_CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_DESCR_CAPITOLO_SPESA,5,500,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_E, "E");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_E,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_CAPITOLO_ENTRATA, "CAPITOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_CAPITOLO_ENTRATA,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_ARTICOLO_ENTRATA, "ARTICOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_ARTICOLO_ENTRATA,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_4, "IMPORTO_4");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_4,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_5, "IMPORTO_5");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_5,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_6, "IMPORTO_6");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_6,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_7, "IMPORTO_7");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_7,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_PABIALRIAMOR, "PABIALRIAMOR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA2,IMDBDef12.PQSL_PARBILALRIA2_PABIALRIAMOR,3,28,6);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARBILALRIA2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AllegatiBilancioA1Cons(MyWebEntryPoint w, IMDBObj imdb)
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
  public AllegatiBilancioA1Cons()
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
    FormIdx = MyGlb.FRM_ALLEBILA1CON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "449F5B71-1009-44BA-BBC9-F9BF4C4A4960";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 374;
    set_Caption(new IDVariant("A1 Ris. Amministrazione - Risorse Accantonate"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 348;
    Frames[1].Caption = "A1 Ris. Amministrazione - Risorse Accantonate";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_A1RISAMMRIAC = new IDPanel(w, this, 1, "PAN_A1RISAMMRIAC");
    Frames[1].Content = PAN_A1RISAMMRIAC;
    PAN_A1RISAMMRIAC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_A1RISAMMRIAC.VS = MainFrm.VisualStyleList;
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4985E94B-F11E-40B8-B536-FC7211330EF4");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1292, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_A1RISAMMRIAC.InitStatus = 2;
    PAN_A1RISAMMRIAC_Init();
    PAN_A1RISAMMRIAC_InitFields();
    PAN_A1RISAMMRIAC_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA23+BaseCmdLinIdx)
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
      PAN_A1RISAMMRIAC.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_A1RISAMMRIAC.FrIndex)
    {
      if (IdxFieldActived ==PFL_A1RISAMMRIAC_SCELTACAPITO) {
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
    return (obj instanceof AllegatiBilancioA1Cons);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AllegatiBilancioA1Cons.class.getName() : (Glb.ClassWithPackage(AllegatiBilancioA1Cons.class) ? AllegatiBilancioA1Cons.class.getName().substring(AllegatiBilancioA1Cons.class.getPackage().getName().length() + 1) : AllegatiBilancioA1Cons.class.getName()));
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
      SettaCaptionA1();
      PAN_A1RISAMMRIAC.SetFlags (Glb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "Load", _e);
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
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_CAPITOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_ARTICOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "EndModal", _e);
    }
  }

  // **********************************************************************
  // A1 Ris. Amministrazione - Risorse Accantonate On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_A1RISAMMRIAC_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_A1RISAMMRIAC);
      // 
      // A1 Ris. Amministrazione - Risorse Accantonate On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_A1RISAMMRIAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_RAGGRUPPAMEN,(new IDVariant(PAN_A1RISAMMRIAC.FieldText(PFL_A1RISAMMRIAC_RAGGRUPPAMEN))).stringValue()); 
      PAN_A1RISAMMRIAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_DESCCAPISPES,(new IDVariant(PAN_A1RISAMMRIAC.FieldText(PFL_A1RISAMMRIAC_DESCCAPISPES))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "A1Ris.Amministrazione-RisorseAccantonateOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // A1 Ris. Amministrazione - Risorse Accantonate On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_A1RISAMMRIAC_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A1 Ris. Amministrazione - Risorse Accantonate On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_PROGRESSIVO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_TIPO_STAMPA, 0, (new IDVariant("A1RISAMMCONS")));
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_S, 0, (new IDVariant("S")));
      }
      if ((Column.equals((new IDVariant(PFL_A1RISAMMRIAC_CAPITOLSPESA)), true) || Column.equals((new IDVariant(PFL_A1RISAMMRIAC_ARTICOLSPESA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_CAPITOLO_SPESA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_ARTICOLO_SPESA, 0))))
        {
          if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("S")), IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_CAPITOLO_SPESA, 0), IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_ARTICOLO_SPESA, 0)).equals((new IDVariant(-1)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Capitolo non presente in bilancio", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_CAPITOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_ARTICOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_DESCR_CAPITOLO_SPESA, 0, (new IDVariant()));
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
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_CAPITOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_ARTICOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCAPDESCRIZI = QV.Get("CAPDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_DESCR_CAPITOLO_SPESA, 0, new IDVariant(v_VCAPDESCRIZI));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_A1RISAMMRIAC_IMPORTO1)), true) || Column.equals((new IDVariant(PFL_A1RISAMMRIAC_IMPORTO2)), true) || Column.equals((new IDVariant(PFL_A1RISAMMRIAC_IMPORTO3)), true) || Column.equals((new IDVariant(PFL_A1RISAMMRIAC_IMPORTO4)), true)) && FieldWasModified.booleanValue())
      {
        CalcolaTotali();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "A1Ris.Amministrazione-RisorseAccantonateOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // A1 Ris. Amministrazione - Risorse Accantonate After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_A1RISAMMRIAC_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A1 Ris. Amministrazione - Risorse Accantonate After Find Body
      // Corpo Procedura
      // 
      CalcolaTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "A1Ris.Amministrazione-RisorseAccantonateAfterFind", _e);
    }
  }

  // **********************************************************************
  // A1 Ris. Amministrazione - Risorse Accantonate After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_A1RISAMMRIAC_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A1 Ris. Amministrazione - Risorse Accantonate After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_A1RISAMMRIAC.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "A1Ris.Amministrazione-RisorseAccantonateAfterCommit", _e);
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
      IDVariant v_TOOLTIIMPOR4 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR4 = (new IDVariant("Variazione accantonamenti effettuata in sede di rendiconto (con segno +/-) (d)"));
      IDVariant v_CAPTIOIMPORT = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPORT = (new IDVariant("Risorse Accantonate al 31/12/"));
      IDVariant v_TOOLTIIMPOR5 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR5 = (new IDVariant("Risorse accantonate nel risultato di amministrazione al 31/12/"));
      IDVariant v_TOOLT2IMPOR5 = new IDVariant(0,IDVariant.STRING);
      v_TOOLT2IMPOR5 = (new IDVariant("(e)=(a)+(b)+(c)+(d)"));
      PAN_A1RISAMMRIAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_IMPORTO1, IDL.Add(v_CAPTIOIMPOR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_A1RISAMMRIAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_IMPORTO1,IDL.Add(IDL.Add(IDL.Add(v_CAPTIOIMPOR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" "))), (new IDVariant("(a)"))).stringValue()); 
      PAN_A1RISAMMRIAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_IMPORTO2, IDL.Add(v_CAPTIOIMPOR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_A1RISAMMRIAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_IMPORTO2,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" "))), v_TOOLT2IMPOR2).stringValue()); 
      PAN_A1RISAMMRIAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_IMPORTO3, IDL.Add(v_CAPTIOIMPOR3, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_A1RISAMMRIAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_IMPORTO3,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR3, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" "))), (new IDVariant("(c)"))).stringValue()); 
      PAN_A1RISAMMRIAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_IMPORTO4,v_TOOLTIIMPOR4.stringValue()); 
      PAN_A1RISAMMRIAC.set_Header(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_IMPORTO8, IDL.Add(v_CAPTIOIMPORT, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_A1RISAMMRIAC.set_ToolTip(Glb.OBJ_FIELD,PFL_A1RISAMMRIAC_IMPORTO8,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR5, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" "))), v_TOOLT2IMPOR5).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "SettaCaptionA1", _e);
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
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "SceltaCapitolo", _e);
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
      PAN_A1RISAMMRIAC.set_FieldText(PFL_A1RISAMMRIAC_TOTALEIMPOR5, IDL.Format(PAN_A1RISAMMRIAC.GetFieldSum(PFL_A1RISAMMRIAC_IMPORTO8), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMRIAC.set_FieldText(PFL_A1RISAMMRIAC_TOTALEIMPOR1, IDL.Format(PAN_A1RISAMMRIAC.GetFieldSum(PFL_A1RISAMMRIAC_IMPORTO1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMRIAC.set_FieldText(PFL_A1RISAMMRIAC_TOTALEIMPOR2, IDL.Format(PAN_A1RISAMMRIAC.GetFieldSum(PFL_A1RISAMMRIAC_IMPORTO2), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMRIAC.set_FieldText(PFL_A1RISAMMRIAC_TOTALEIMPOR3, IDL.Format(PAN_A1RISAMMRIAC.GetFieldSum(PFL_A1RISAMMRIAC_IMPORTO3), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMRIAC.set_FieldText(PFL_A1RISAMMRIAC_TOTALEIMPOR4, IDL.Format(PAN_A1RISAMMRIAC.GetFieldSum(PFL_A1RISAMMRIAC_IMPORTO4), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A1RISAMMRIAC.set_FieldText(PFL_A1RISAMMRIAC_TOTALEIMPOR5, IDL.Format(IDL.Add(IDL.Add(IDL.Add(PAN_A1RISAMMRIAC.GetFieldSum(PFL_A1RISAMMRIAC_IMPORTO1), PAN_A1RISAMMRIAC.GetFieldSum(PFL_A1RISAMMRIAC_IMPORTO2)), PAN_A1RISAMMRIAC.GetFieldSum(PFL_A1RISAMMRIAC_IMPORTO3)), PAN_A1RISAMMRIAC.GetFieldSum(PFL_A1RISAMMRIAC_IMPORTO4)), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "CalcolaTotali", _e);
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
      if (new IDVariant(PAN_A1RISAMMRIAC.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPECONS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI278, IMDBDef3.FLD_PARAMETRI278_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI278, IMDBDef3.FLD_PARAMETRI278_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI278, IMDBDef3.FLD_PARAMETRI278_PARANOTESTAM, 0));
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
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI278, IMDBDef3.FLD_PARAMETRI278_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI278, IMDBDef3.FLD_PARAMETRI278_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI278, IMDBDef3.FLD_PARAMETRI278_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI278, IMDBDef3.FLD_PARAMETRI278_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI278, IMDBDef3.FLD_PARAMETRI278_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA1Cons", "Stampa", _e);
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
  private void PAN_A1RISAMMRIAC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_A1RISAMMRIAC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_A1RISAMMRIAC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_A1RISAMMRIAC, Cancel);
    // Stub
  }

  private void PAN_A1RISAMMRIAC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_A1RISAMMRIAC_SCELTACAPITO)
    {
      this.IdxPanelActived = this.PAN_A1RISAMMRIAC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_A1RISAMMRIAC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_A1RISAMMRIAC_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_A1RISAMMRIAC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_S, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_S, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_E, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_E, 0, (new IDVariant("E")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_1, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_1, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_2, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_2, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_3, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_3, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_4, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_4, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_5, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_5, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_6, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_6, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_7, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA2, IMDBDef12.PQSL_PARBILALRIA2_IMPORTO_7, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_A1RISAMMRIAC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_A1RISAMMRIAC_Init()
  {

    PAN_A1RISAMMRIAC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_A1RISAMMRIAC.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, "CD6812CF-18FD-40BF-AF5C-967A1E0E781D");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, "Spesa");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, MyGlb.VIS_GROUPSTYLE);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, MyGlb.PANEL_LIST, 220, -9999, 432, 16, 0, 0);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, MyGlb.PANEL_FORM, 0, 27, 588, 349, 0, 0);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, 0, 34);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, 1, 13);
    PAN_A1RISAMMRIAC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, 0, 4);
    PAN_A1RISAMMRIAC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, 1, 4);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_GROUP, GRP_A1RISAMMRIAC_SPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_A1RISAMMRIAC.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, "6EC635B9-3B54-46D6-B3F0-9F30B8DB1DEA");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, "PROGRESSIVO");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, "FC94E0B0-59FB-4275-9913-F3053016593D");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, "TIPO STAMPA");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, MyGlb.VIS_NONNULLAFIEL);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, 0, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, "C46D931B-4D7A-4F52-8F6E-FEDBF671CABE");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, "ESERCIZIO");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, 0, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, "8FB35BAC-D183-49F9-AB3C-D84EF2067A88");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, "Fondo Accantonamento");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, "D638B831-2858-46A1-81A2-F1C69308206B");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, "S");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, "7833472E-11D9-4314-863C-B364A2C8CAC1");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, "Capitolo");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, MyGlb.VIS_NORFIEINTLUN);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, "7CFDCB1B-652C-4E9D-81EC-6F0C24A679E7");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, "Art.");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, "78F0C42B-D074-44FF-B5BE-6F31D32CC44A");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, " ");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, MyGlb.VIS_HYPELINKIMMA);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, "58B58012-88B6-4579-B1B9-E6A1E914A2DC");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, "Descrizione");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, MyGlb.VIS_NORMALFIELDS);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, "90B08722-71F8-4B7E-B1B0-F2EB9BFE0DD2");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, "E");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, "16D8FC42-C644-4A43-AC58-9AF88EA3D7C2");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, "CAPITOLO ENTRATA");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, "E71E8ED6-2FFA-4854-8126-A5B6160C5FFD");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, "ARTICOLO ENTRATA");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, "9065D7AD-5CA2-4E3C-9233-3DBC367BAD9C");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, "IMPORTO 1");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, "FADCF2E4-F89F-4767-8409-3C6C6CF36B35");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, "IMPORTO 2");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, "2C0ED8DC-2DE9-489B-851E-369B375B7900");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, "IMPORTO 3");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, "9CAE229B-FEE5-4C70-AAC7-F1B7B76BA61D");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, "Var. accant. in sede di rendiconto");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, "EEEA0FE0-442C-44E6-BA59-F4AFA0E6FE39");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, "Risorse Accantonate al 31/12/");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, MyGlb.VIS_NORFIECF4IMP);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, "C5A535E6-7764-4AEA-8704-482F8663F1B3");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, "IMPORTO 5");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, "2DE5C4F2-0B9B-4F2B-AA94-30ACFDA87D3B");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, "IMPORTO 6");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, "8B0D22B5-3F21-4DC0-A2BE-2E6164A025F9");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, "IMPORTO 7");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, "8F2ACB6D-1316-451E-8991-3B0C17761C62");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, "Ordinamento");
    PAN_A1RISAMMRIAC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, "9F3AF834-747C-4A76-BBEB-538736023E18");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, "Totale");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, MyGlb.VIS_VUOTONORMALE);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, "07D85534-9D5A-49D2-B5F0-ABE0FCD011DE");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, "62013C93-F841-4128-B966-A6BFE216449A");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, "458E05B5-4B70-4D0C-9018-A999263D4E80");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, "19E1F3C2-5DA1-4619-8432-A6A1F6E00E31");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A1RISAMMRIAC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, "B7FA6590-FE44-46DA-A9D5-D52040BA57E9");
    PAN_A1RISAMMRIAC.set_Header(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, "");
    PAN_A1RISAMMRIAC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, MyGlb.VIS_CAMPTOTADISA);
    PAN_A1RISAMMRIAC.SetFlags(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_A1RISAMMRIAC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_PROGRESSIVO, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_PROGRESSIVO, PPQRY_PARBILALRIA2, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, MyGlb.PANEL_LIST, 88);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, MyGlb.PANEL_LIST, "TIPO STAMPA");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, MyGlb.PANEL_FORM, 188, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, MyGlb.PANEL_FORM, 104);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TIPOSTAMPA, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_TIPOSTAMPA, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_TIPOSTAMPA, PPQRY_PARBILALRIA2, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 20, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_ESERCIZIO, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_ESERCIZIO, PPQRY_PARBILALRIA2, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 0, 36, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 116);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, MyGlb.PANEL_LIST, "Fondo Accantonamento");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 228, 28, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 120);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, MyGlb.PANEL_FORM, "Fon. Accanton.");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_RAGGRUPPAMEN, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_RAGGRUPPAMEN, PPQRY_PARBILALRIA2, "A.RAGGRUPPAMENTO", "RAGGRUPPAMENTO", 5, 20, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, MyGlb.PANEL_LIST, 96, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, MyGlb.PANEL_LIST, 16);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, MyGlb.PANEL_LIST, "S");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, MyGlb.PANEL_FORM, 492, 28, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, MyGlb.PANEL_FORM, 32);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_S, MyGlb.PANEL_FORM, "S");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_S, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_S, PPQRY_PARBILALRIA2, "A.S", "S", 5, 1, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, MyGlb.PANEL_LIST, 220, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, MyGlb.PANEL_LIST, "Capitolo");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOLSPESA, MyGlb.PANEL_FORM, "Capitolo");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_CAPITOLSPESA, -1, GRP_A1RISAMMRIAC_SPESA);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_CAPITOLSPESA, PPQRY_PARBILALRIA2, "A.CAPITOLO_SPESA", "CAPITOLO_SPESA", 3, 16, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, MyGlb.PANEL_LIST, 332, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, MyGlb.PANEL_LIST, "Art.");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, MyGlb.PANEL_FORM, 228, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, MyGlb.PANEL_FORM, 120);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOLSPESA, MyGlb.PANEL_FORM, "Art.");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_ARTICOLSPESA, -1, GRP_A1RISAMMRIAC_SPESA);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_ARTICOLSPESA, PPQRY_PARBILALRIA2, "A.ARTICOLO_SPESA", "ARTICOLO_SPESA", 1, 2, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, MyGlb.PANEL_LIST, 364, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, MyGlb.PANEL_LIST, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, MyGlb.PANEL_LIST, " ");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, MyGlb.PANEL_FORM, 4, 304, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_SCELTACAPITO, MyGlb.PANEL_FORM, " ");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_SCELTACAPITO, -1, GRP_A1RISAMMRIAC_SPESA);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_SCELTACAPITO, PPQRY_DUAL, "'A'", "SCELTACAPITO", 5, 1, 0, -13997);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_A1RISAMMRIAC.SetValueListItem(PFL_A1RISAMMRIAC_SCELTACAPITO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, MyGlb.PANEL_LIST, 388, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, MyGlb.PANEL_LIST, 144);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, MyGlb.PANEL_LIST, "Descrizione");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, MyGlb.PANEL_FORM, 4, 328, 580, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, MyGlb.PANEL_FORM, 144);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, MyGlb.PANEL_FORM, 2);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_DESCCAPISPES, MyGlb.PANEL_FORM, "Descrizione");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_DESCCAPISPES, -1, GRP_A1RISAMMRIAC_SPESA);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_DESCCAPISPES, PPQRY_PARBILALRIA2, "A.DESCR_CAPITOLO_SPESA", "DESCR_CAPITOLO_SPESA", 5, 500, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, MyGlb.PANEL_LIST, 176, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, MyGlb.PANEL_LIST, 16);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, MyGlb.PANEL_LIST, "E");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_E, MyGlb.PANEL_FORM, "E");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_E, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_E, PPQRY_PARBILALRIA2, "A.E", "E", 5, 1, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, MyGlb.PANEL_LIST, 176, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, MyGlb.PANEL_LIST, "CAP. ENTR.");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, MyGlb.PANEL_FORM, 188, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_CAPITOENTRAT, MyGlb.PANEL_FORM, "CAPITOLO ENTRATA");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_CAPITOENTRAT, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_CAPITOENTRAT, PPQRY_PARBILALRIA2, "A.CAPITOLO_ENTRATA", "CAPITOLO_ENTRATA", 3, 16, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, MyGlb.PANEL_LIST, 176, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, MyGlb.PANEL_LIST, "ART. ENTR.");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, MyGlb.PANEL_FORM, 380, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ARTICOENTRAT, MyGlb.PANEL_FORM, "ARTICOLO ENTRATA");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_ARTICOENTRAT, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_ARTICOENTRAT, PPQRY_PARBILALRIA2, "A.ARTICOLO_ENTRATA", "ARTICOLO_ENTRATA", 1, 2, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, MyGlb.PANEL_LIST, 652, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO1, MyGlb.PANEL_FORM, "IMPORTO 1");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_IMPORTO1, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_IMPORTO1, PPQRY_PARBILALRIA2, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, MyGlb.PANEL_LIST, 780, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, MyGlb.PANEL_FORM, 4, 172, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO2, MyGlb.PANEL_FORM, "IMPORTO 2");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_IMPORTO2, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_IMPORTO2, PPQRY_PARBILALRIA2, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, MyGlb.PANEL_LIST, 908, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, MyGlb.PANEL_FORM, 4, 196, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO3, MyGlb.PANEL_FORM, "IMPORTO 3");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_IMPORTO3, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_IMPORTO3, PPQRY_PARBILALRIA2, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, MyGlb.PANEL_LIST, 1036, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, MyGlb.PANEL_LIST, "Var. accant. in sede di rendiconto");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO4, MyGlb.PANEL_FORM, "Var acc. in sd. di rend.");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_IMPORTO4, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_IMPORTO4, PPQRY_PARBILALRIA2, "A.IMPORTO_4", "IMPORTO_4", 3, 14, 2, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, MyGlb.PANEL_LIST, 1164, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, MyGlb.PANEL_LIST, 80);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, MyGlb.PANEL_LIST, "Risorse Accantonate al 31/12/");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, MyGlb.PANEL_FORM, 4, 280, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, MyGlb.PANEL_FORM, 80);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO8, MyGlb.PANEL_FORM, "R. Ac. a. 3. 1.");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_IMPORTO8, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_IMPORTO8, PPQRY_DUAL, "~~IMPORTO_1~~ + ~~IMPORTO_2~~ + ~~IMPORTO_3~~ + ~~IMPORTO_4~~", "IMPORTO5", 3, 28, 6, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, MyGlb.PANEL_LIST, 432, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, MyGlb.PANEL_LIST, "IMPORTO 5");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, MyGlb.PANEL_FORM, 4, 244, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO5, MyGlb.PANEL_FORM, "IMPORTO 5");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_IMPORTO5, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_IMPORTO5, PPQRY_PARBILALRIA2, "A.IMPORTO_5", "IMPORTO_5", 3, 14, 2, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, MyGlb.PANEL_LIST, 496, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, MyGlb.PANEL_LIST, "IMPORTO 6");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, MyGlb.PANEL_FORM, 128);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO6, MyGlb.PANEL_FORM, "IMPORTO 6");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_IMPORTO6, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_IMPORTO6, PPQRY_PARBILALRIA2, "A.IMPORTO_6", "IMPORTO_6", 3, 14, 2, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, MyGlb.PANEL_LIST, 496, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, MyGlb.PANEL_LIST, 72);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, MyGlb.PANEL_LIST, "IMPORTO 7");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, MyGlb.PANEL_FORM, 396, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, MyGlb.PANEL_FORM, 88);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_IMPORTO7, MyGlb.PANEL_FORM, "IMPORTO 7");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_IMPORTO7, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_IMPORTO7, PPQRY_PARBILALRIA2, "A.IMPORTO_7", "IMPORTO_7", 3, 14, 2, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, MyGlb.PANEL_FORM, 4, 304, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_ORDINAMENTO, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldUnbound(PFL_A1RISAMMRIAC_ORDINAMENTO, true);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_ORDINAMENTO, PPQRY_PARBILALRIA2, "B.SEQUENZA", "PABIALRIAMOR", 3, 28, 6, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, MyGlb.PANEL_LIST, 572, 240, 76, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, MyGlb.PANEL_FORM, 568, 252, 76, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_ETICHETOTALE, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, MyGlb.PANEL_LIST, 652, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, MyGlb.PANEL_FORM, 656, 248, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR1, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_TOTALEIMPOR1, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_TOTALEIMPOR1, -1, "", "TOTALEIMPOR1", 0, 0, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, MyGlb.PANEL_LIST, 780, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, MyGlb.PANEL_FORM, 664, 256, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR2, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_TOTALEIMPOR2, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_TOTALEIMPOR2, -1, "", "TOTALEIMPOR2", 0, 0, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, MyGlb.PANEL_LIST, 908, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, MyGlb.PANEL_FORM, 672, 264, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR3, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_TOTALEIMPOR3, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_TOTALEIMPOR3, -1, "", "TOTALEIMPOR3", 0, 0, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1036, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, MyGlb.PANEL_FORM, 680, 272, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR4, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_TOTALEIMPOR4, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_TOTALEIMPOR4, -1, "", "TOTALEIMPOR4", 0, 0, 0, -13997);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1164, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, MyGlb.PANEL_LIST, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1);
    PAN_A1RISAMMRIAC.SetRect(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, MyGlb.PANEL_FORM, 688, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A1RISAMMRIAC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, MyGlb.PANEL_FORM, 0);
    PAN_A1RISAMMRIAC.SetNumRow(MyGlb.OBJ_FIELD, PFL_A1RISAMMRIAC_TOTALEIMPOR5, MyGlb.PANEL_FORM, 1);
    PAN_A1RISAMMRIAC.SetFieldPage(PFL_A1RISAMMRIAC_TOTALEIMPOR5, -1, -1);
    PAN_A1RISAMMRIAC.SetFieldPanel(PFL_A1RISAMMRIAC_TOTALEIMPOR5, -1, "", "TOTALEIMPOR5", 0, 0, 0, -13997);
  }

  private void PAN_A1RISAMMRIAC_InitQueries()
  {
    StringBuffer SQL;

    PAN_A1RISAMMRIAC.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~IMPORTO_1~~ + ~~IMPORTO_2~~ + ~~IMPORTO_3~~ + ~~IMPORTO_4~~ as IMPORTO5, ");
    SQL.append("  'A' as SCELTACAPITO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_A1RISAMMRIAC.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_A1RISAMMRIAC.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A1RISAMMRIAC.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.CODICE = ~~RAGGRUPPAMENTO~~) ");
    SQL.append("and   (A.TIPO = 'FACCA1') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_A1RISAMMRIAC.SetQuery(PPQRY_ATTRIBUTICFA, 0, SQL, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.TIPO = 'FACCA1') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_A1RISAMMRIAC.SetQuery(PPQRY_ATTRIBUTICFA, 1, SQL, PFL_A1RISAMMRIAC_RAGGRUPPAMEN, "");
    PAN_A1RISAMMRIAC.SetQueryDB(PPQRY_ATTRIBUTICFA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A1RISAMMRIAC.SetIMDB(IMDB, "PQRY_PARBILALRIA2", true);
    PAN_A1RISAMMRIAC.set_SetString(MyGlb.MASTER_ROWNAME, "PARAM BIL ALL RIS AMM");
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
    PAN_A1RISAMMRIAC.SetQuery(PPQRY_PARBILALRIA2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAM_BIL_ALL_RIS_AMM A, ");
    SQL.append("  ATTRIBUTI_CFA B ");
    PAN_A1RISAMMRIAC.SetQuery(PPQRY_PARBILALRIA2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CODICE = A.RAGGRUPPAMENTO) ");
    SQL.append("and   (B.TIPO = 'FACCA1') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(B.ESERCIZIO_DA, 1900) AND NVL(B.ESERCIZIO_A, 2999))) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'A1RISAMMCONS') ");
    PAN_A1RISAMMRIAC.SetQuery(PPQRY_PARBILALRIA2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A1RISAMMRIAC.SetQuery(PPQRY_PARBILALRIA2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A1RISAMMRIAC.SetQuery(PPQRY_PARBILALRIA2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 19, 6, 7, 8 ");
    PAN_A1RISAMMRIAC.SetQuery(PPQRY_PARBILALRIA2, 5, SQL, -1, "");
    PAN_A1RISAMMRIAC.SetQueryDB(PPQRY_PARBILALRIA2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A1RISAMMRIAC.SetMasterTable(0, "PARAM_BIL_ALL_RIS_AMM");
    PAN_A1RISAMMRIAC.AddToSortList(PFL_A1RISAMMRIAC_ORDINAMENTO, true);
    PAN_A1RISAMMRIAC.AddToSortList(PFL_A1RISAMMRIAC_CAPITOLSPESA, true);
    PAN_A1RISAMMRIAC.AddToSortList(PFL_A1RISAMMRIAC_ARTICOLSPESA, true);
    PAN_A1RISAMMRIAC.AddToSortList(PFL_A1RISAMMRIAC_DESCCAPISPES, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_A1RISAMMRIAC.Status() == 2)
    {
      int oldListQBE = PAN_A1RISAMMRIAC.iUseListQBE;
      PAN_A1RISAMMRIAC.iUseListQBE = 0;
      PAN_A1RISAMMRIAC.PanelCommand(Glb.PCM_SEARCH);
      PAN_A1RISAMMRIAC.PanelCommand(Glb.PCM_FIND);
      PAN_A1RISAMMRIAC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_A1RISAMMRIAC) PAN_A1RISAMMRIAC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_A1RISAMMRIAC) PAN_A1RISAMMRIAC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_A1RISAMMRIAC) PAN_A1RISAMMRIAC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_A1RISAMMRIAC) PAN_A1RISAMMRIAC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_A1RISAMMRIAC) PAN_A1RISAMMRIAC_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_A1RISAMMRIAC) PAN_A1RISAMMRIAC_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_A1RISAMMRIAC) PAN_A1RISAMMRIAC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
